
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.sql.*;
import java.time.LocalDateTime;
public class Main extends Application
{
   private Connection connection;
   @Override
   public void start(Stage primaryStage)
   {
       try {
           connectToDatabase();
           BorderPane root = new BorderPane();
           Text title = new Text("Cake Square");
           title.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
           root.setTop(title);
           BorderPane.setAlignment(title, Pos.TOP_CENTER);
           Label itemLabel = new Label("Items");
           Label qtyLabel = new Label("Qty");
           Label prizeLabel = new Label("Prize/unit");
           Label amountLabel = new Label("Amount");
           Label[] itemLabels = {
               new Label("Vanilla Cupcake"), new Label("Walnut Cupcake"), new Label("Cheese Cupcake"),
               new Label("Red Velvet (1/2 kg)"), new Label("Humming Bird Cake"), new Label("Eggless Chocolate Cake"),
               new Label("Black Forest Cake (1/2 kg)"), new Label("Layered Rainbow Cake (1/2 kg)"),
               new Label("Spider Cheese Cake"), new Label("HoneyComb Ice-Cream Cake"),
               new Label("Cinnamon Tea Cake"), new Label("Marble Cake")
           };
           Label[] priceLabels = {
               new Label("₹35"), new Label("₹40"), new Label("₹45"), new Label("₹600"),
               new Label("₹550"), new Label("₹650"), new Label("₹450"), new Label("₹850"),
               new Label("₹650"), new Label("₹600"), new Label("₹350"), new Label("₹300")
           };
           CheckBox[] checkBoxes = new CheckBox[12];
           for (int i = 0; i < checkBoxes.length; i++)
           {
               checkBoxes[i] = new CheckBox();
               checkBoxes[i].setPrefWidth(20);
           }
           TextField[] qtyFields = new TextField[12];
           TextField[] amountFields = new TextField[12];
           for (int i = 0; i < qtyFields.length; i++)
           {
               qtyFields[i] = new TextField("0");
               qtyFields[i].setPrefWidth(60);
               qtyFields[i].setPrefHeight(30);
               amountFields[i] = new TextField("0");
               amountFields[i].setPrefWidth(60);
               amountFields[i].setPrefHeight(30);
           }
           GridPane grid = new GridPane();
           grid.addRow(0, itemLabel, qtyLabel, prizeLabel, amountLabel);
           ColumnConstraints cl1 = new ColumnConstraints();
           ColumnConstraints cl2 = new ColumnConstraints();
           ColumnConstraints cl3 = new ColumnConstraints();
           ColumnConstraints cl4 = new ColumnConstraints();
           cl1.setPrefWidth(250); 
           cl2.setPrefWidth(100); 
           cl3.setPrefWidth(100);
           cl4.setPrefWidth(100); 
           grid.getColumnConstraints().addAll(cl1, cl2, cl3, cl4);
           grid.setHgap(10);
           grid.setVgap(5);
           GridPane itemGrid = new GridPane();
           itemGrid.setHgap(10);
           itemGrid.setVgap(5);
           for (int i = 0; i < itemLabels.length; i++)
           {
               int index = i;
               Button incrementBtn = new Button("+");
               Button decrementBtn = new Button("-");
               incrementBtn.setPrefSize(30, 30);
               decrementBtn.setPrefSize(30, 30);
               incrementBtn.setOnAction(e -> incrementCount(qtyFields[index], amountFields[index], priceLabels[index]));
               decrementBtn.setOnAction(e -> decrementCount(qtyFields[index], amountFields[index], priceLabels[index]));
               itemGrid.addRow(i + 1, checkBoxes[i], itemLabels[i], incrementBtn, qtyFields[i], decrementBtn, priceLabels[i], amountFields[i]);
           }
           ScrollPane scrollPane = new ScrollPane(itemGrid);
           scrollPane.setFitToWidth(true);
           scrollPane.setPrefWidth(800);
           VBox rightPane = new VBox();
           rightPane.getChildren().addAll(grid, scrollPane);
           root.setRight(rightPane);
           Button calculateButton = new Button("Calculate");
           TextField totalAmountField = new TextField("0");
           totalAmountField.setPrefWidth(100);
           calculateButton.setOnAction(e -> {
               int total = 0;
               StringBuilder items = new StringBuilder();
               StringBuilder quantities = new StringBuilder();
               for (int i = 0; i < checkBoxes.length; i++)
               {
                   if (checkBoxes[i].isSelected())
                   {
                       int qty = Integer.parseInt(qtyFields[i].getText());
                       total += qty * Integer.parseInt(priceLabels[i].getText().substring(1));
                       items.append(itemLabels[i].getText()).append(",");
                       quantities.append(qtyFields[i].getText()).append(",");
                   }
               }
               totalAmountField.setText(String.valueOf(total));
               Alert alert = new Alert(Alert.AlertType.INFORMATION);
               alert.setTitle("Total Price");
               alert.setHeaderText("BILL");
               alert.setContentText("The total price is: ₹" + total);
               alert.showAndWait();
               if (items.length() > 0) items.setLength(items.length() - 1);
               if (quantities.length() > 0) quantities.setLength(quantities.length() - 1);
               insertOrderDetails(items.toString(), quantities.toString(), total);
           });
           VBox bottomPane = new VBox();
           bottomPane.getChildren().addAll(calculateButton, totalAmountField);
           bottomPane.setAlignment(Pos.CENTER);
           root.setBottom(bottomPane);
           Image image = new Image("cake_shop.jpg");
           ImageView imageView = new ImageView(image);
           imageView.setFitWidth(650);
           imageView.setFitHeight(700);
           root.setLeft(imageView);
           Scene scene = new Scene(root, 1200, 600);
           primaryStage.setScene(scene);
           primaryStage.setTitle("Cake Order Menu");
           primaryStage.show();
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
   }
   private void connectToDatabase()
   {
       try
       {
           String url = "jdbc:oracle:thin:@DESKTOP-OI6OPH8:1521:xe";
           String user = "system";
           String password = "veni";
           connection = DriverManager.getConnection(url, user, password);
           System.out.println("Connected to the database.");
       }
       catch (SQLException e)
       {
           e.printStackTrace();
       }
   }
   private void insertOrderDetails(String items, String quantity, int total)
   {
       try
       {
           String insertSQL = "INSERT INTO CAKE_ORDERS (ORDER_DATE, ITEMS, QUANTITY, TOTAL_PRICE) VALUES (?, ?, ?, ?)";
           PreparedStatement pstmt = connection.prepareStatement(insertSQL);
           pstmt.setTimestamp(1, Timestamp.valueOf(LocalDateTime.now()));
           pstmt.setString(2, items);
           pstmt.setString(3, quantity);
           pstmt.setInt(4, total);
           pstmt.executeUpdate();
           System.out.println("Order details inserted.");
       }
       catch (SQLException e)
       {
           e.printStackTrace();
       }
   }
   private void incrementCount(TextField qtyField, TextField amountField, Label priceLabel)
   {
       int count = Integer.parseInt(qtyField.getText());
       count++;
       int price = Integer.parseInt(priceLabel.getText().substring(1));
       int total = price * count;
       qtyField.setText(String.valueOf(count));
       amountField.setText(String.valueOf(total));
   }
   private void decrementCount(TextField qtyField, TextField amountField, Label priceLabel)
   {
       int count = Integer.parseInt(qtyField.getText());
       if (count > 0) {
           count--;
           int price = Integer.parseInt(priceLabel.getText().substring(1));
           int total = price * count;
           qtyField.setText(String.valueOf(count));
           amountField.setText(String.valueOf(total));
       }
   }
   public static void main(String[] args) {
       launch(args);
   }
}

