
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.io.FileInputStream;



public class Main extends Application {
@Override
public void start(Stage primaryStage) 
{
	try 
	{
			BorderPane root = new BorderPane();
			Text l = new Text("Cake Square");
            Label item=new Label ("Items");
            Label Qty=new Label("Qty");
            Label Amount=new Label("Amount");
            Label prize=new Label("Prize/unit");
            Label l1 = new Label("vanilla Cupcake");
            Label l2=new Label("Walnut Cupcake");
            Label l3=new Label("Cheese Cupcake");
            Label l4=new Label("Red Velvet(1/2 kg)");
            Label l5=new Label("Humming Bird Cake");
            Label l6=new Label("Eggless Chocolate Cake");
            Label l7=new Label("Black Forest Cake(1/2 kg)");
            Label l8=new Label("Layered Rainbow Cake(1/2 kg)");
            Label l9=new Label("Spider Cheese Cake");
            Label l10=new Label("HoneyComb Ice-Cream Cake");
            Label l11=new Label("Cinnamon Tea Cake");
            Label l12=new Label("Marble Cake");
            Label p1=new Label("₹35");
            Label p2=new Label("₹40");
            Label p3=new Label("₹45");
            Label p4=new Label("₹600");
            Label p5=new Label("₹550");
            Label p6=new Label("₹650");
            Label p7=new Label("₹450");
            Label p8=new Label("₹850");
            Label p9=new Label("₹650");
            Label p10=new Label("₹600");
            Label p11=new Label("₹350");
            Label p12=new Label("₹300");
            CheckBox c1=new CheckBox();
            CheckBox c2=new CheckBox();
            CheckBox c3=new CheckBox();
            CheckBox c4=new CheckBox();
            CheckBox c5=new CheckBox();  
            CheckBox c6=new CheckBox();
            CheckBox c7=new CheckBox();
            CheckBox c8=new CheckBox();
            CheckBox c9=new CheckBox();
            CheckBox c10=new CheckBox();
            CheckBox c11=new CheckBox();
            CheckBox c12=new CheckBox();
            TextField r1=new TextField("0");
            TextField r2=new TextField("0");
            TextField r3=new TextField("0");
            TextField r4=new TextField("0");
            TextField r5=new TextField("0");
            TextField r6=new TextField("0");
            TextField r7=new TextField("0");
            TextField r8=new TextField("0");
            TextField r9=new TextField("0");
            TextField r10=new TextField("0");
            TextField r11=new TextField("0");
            TextField r12=new TextField("0");
            TextField t1=new TextField("0");
            t1.setPrefWidth(60);
            t1.setPrefHeight(30);
            TextField t2=new TextField("0");
            t2.setPrefWidth(60);
            t2.setPrefHeight(30);
            TextField t3=new TextField("0");
            t3.setPrefWidth(60);
            t3.setPrefHeight(30);
            TextField t4=new TextField("0");
            t4.setPrefWidth(60);
            t4.setPrefHeight(30);
            TextField t5=new TextField("0");
            t5.setPrefWidth(60);
            t5.setPrefHeight(30);
            TextField t6=new TextField("0");
            t6.setPrefWidth(60);
            t6.setPrefHeight(30);
            TextField t7=new TextField("0");
            t7.setPrefWidth(60);
            t7.setPrefHeight(30);
            TextField t8=new TextField("0");
            t8.setPrefWidth(60);
            t8.setPrefHeight(30);
            TextField t9=new TextField("0");
            t9.setPrefWidth(60);
            t9.setPrefHeight(30);
            TextField t10=new TextField("0");
            t10.setPrefWidth(60);
            t10.setPrefHeight(30);
            TextField t11=new TextField("0");
            t11.setPrefWidth(60);
            t11.setPrefHeight(30);
            TextField t12=new TextField("0");
            t12.setPrefWidth(60);
            t12.setPrefHeight(30);
            GridPane g1=new GridPane();
            Button a1=new Button("+");
            Button s1=new Button("-");
            Button a2=new Button("+");
            Button s2=new Button("-");
            Button a3=new Button("+");
            Button s3=new Button("-");
            Button a4=new Button("+");
            Button s4=new Button("-");
            Button a5=new Button("+");
            Button s5=new Button("-");
            Button a6=new Button("+");
            Button s6=new Button("-");
            Button a7=new Button("+");
            Button s7=new Button("-");
            Button a8=new Button("+");
            Button s8=new Button("-");
            Button a9=new Button("+");
            Button s9=new Button("-");
            Button a10=new Button("+");
            Button s10=new Button("-");
            Button a11=new Button("+");
            Button s11=new Button("-");
            Button a12=new Button("+");
            Button s12=new Button("-");
            GridPane g=new GridPane();
            g.addRow(0,item,Qty,prize,Amount);
            ColumnConstraints cl1=new ColumnConstraints();
            ColumnConstraints cl2=new ColumnConstraints();
            ColumnConstraints cl3=new ColumnConstraints();
            ColumnConstraints cl4=new ColumnConstraints();
            cl1.setPrefWidth(100);
            cl2.setPrefWidth(150);
            cl3.setPrefWidth(100);
            cl4.setPrefWidth(50);
            g.getColumnConstraints().addAll(cl1,cl2,cl3,cl4);
            g1.addRow(1,c1,l1,a1,t1,s1,p1,r1);
            g1.addRow(2,c2,l2,a2,t2,s2,p2,r2);
            g1.addRow(3,c3,l3,a3,t3,s3,p3,r3);
            g1.addRow(4,c4,l4,a4,t4,s4,p4,r4);
            g1.addRow(5,c5,l5,a5,t5,s5,p5,r5);
            g1.addRow(6,c6,l6,a6,t6,s6,p6,r6);
            g1.addRow(7,c7,l7,a7,t7,s7,p7,r7);
            g1.addRow(8,c8,l8,a8,t8,s8,p8,r8);
            g1.addRow(9,c9,l9,a9,t9,s9,p9,r9);
            g1.addRow(10,c10,l10,a10,t10,s10,p10,r10);
            g1.addRow(11,c11,l11,a11,t11,s11,p11,r11);
            g1.addRow(12,c12,l12,a12,t12,s12,p12,r12);
            g1.setVgap(5);
            g1.setHgap(15);
            GridPane.setHalignment(item, HPos.CENTER);
            GridPane.setHalignment(Qty, HPos.CENTER);
            GridPane.setHalignment(prize, HPos.CENTER);
            GridPane.setHalignment(Amount, HPos.CENTER);
            VBox v=new VBox();
            v.getChildren().addAll(g,g1);
            root.setRight(v);
            l.setFont(Font.font("Times New Roman",FontWeight.BOLD,30));
            l1.setFont(Font.font("Times New Roman"));
            l2.setFont(Font.font("Times New Roman"));
            l3.setFont(Font.font("Times New Roman"));
            l4.setFont(Font.font("Times New Roman"));
            l5.setFont(Font.font("Times New Roman"));
            l6.setFont(Font.font("Times New Roman"));
            l7.setFont(Font.font("Times New Roman"));
            l8.setFont(Font.font("Times New Roman"));
            l9.setFont(Font.font("Times New Roman"));
            l10.setFont(Font.font("Times New Roman"));
            l11.setFont(Font.font("Times New Roman"));
            l12.setFont(Font.font("Times New Roman"));
            Button down=new Button("Calculate");
            TextField dw=new TextField("0");
            dw.setMaxWidth(50);
            dw.setMaxHeight(10);
            down.setOnAction(new EventHandler<ActionEvent>()
    {
            public void handle(ActionEvent args)
            {
            	int total=0;
            	if(c1.isSelected())
            	{
            		total+=Integer.parseInt(r1.getText());
            	}
            	if(c2.isSelected())
            	{
            		total+=Integer.parseInt(r2.getText());
            	}
            	if(c3.isSelected())
            	{
            		total+=Integer.parseInt(r3.getText());
            	}
            	if(c4.isSelected())
            	{
            		total+=Integer.parseInt(r4.getText());
            	}
            	if(c5.isSelected())
            	{
            		total+=Integer.parseInt(r5.getText());
            	}
            	if(c6.isSelected())
            	{
            		total+=Integer.parseInt(r6.getText());
            	}
            	if(c7.isSelected())
            	{
            		total+=Integer.parseInt(r7.getText());
            	}
            	if(c8.isSelected())
            	{
            		total+=Integer.parseInt(r8.getText());
            	}
            	if(c9.isSelected())
            	{
            		total+=Integer.parseInt(r9.getText());
            	}
            	if(c10.isSelected())
            	{
            		total+=Integer.parseInt(r10.getText());
            	}
            	if(c11.isSelected())
            	{
            		total+=Integer.parseInt(r11.getText());
            	}
            	if(c12.isSelected())
            	{
            		total+=Integer.parseInt(r12.getText());
            	}
            	dw.setText(String.valueOf(total));
            	Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Total Prize");
                    alert.setHeaderText("BILL"); 
                    alert.setContentText("The total prize is: ₹" + total);
                    alert.showAndWait();
            }
   
    });
            a1.setOnAction(e->incrementcount(t1,r1,p1));
            a2.setOnAction(e->incrementcount(t2,r2,p2));
            a3.setOnAction(e->incrementcount(t3,r3,p3));
            a4.setOnAction(e->incrementcount(t4,r4,p4));
            a5.setOnAction(e->incrementcount(t5,r5,p5));
            a6.setOnAction(e->incrementcount(t6,r6,p6));
            a7.setOnAction(e->incrementcount(t7,r7,p7));
            a8.setOnAction(e->incrementcount(t8,r8,p8));
            a9.setOnAction(e->incrementcount(t9,r9,p9));
            a10.setOnAction(e->incrementcount(t10,r10,p10));
            a11.setOnAction(e->incrementcount(t11,r11,p11));
            a12.setOnAction(e->incrementcount(t12,r12,p12));
            s1.setOnAction(e->decrementcount(t1,r1,p1));
            s2.setOnAction(e->decrementcount(t2,r2,p2));
            s3.setOnAction(e->decrementcount(t3,r3,p3));
            s4.setOnAction(e->decrementcount(t4,r4,p4));
            s5.setOnAction(e->decrementcount(t5,r5,p5));
            s6.setOnAction(e->decrementcount(t6,r6,p6));
            s7.setOnAction(e->decrementcount(t7,r7,p7));
            s8.setOnAction(e->decrementcount(t8,r8,p8));
            s9.setOnAction(e->decrementcount(t9,r9,p9));
            s10.setOnAction(e->decrementcount(t10,r10,p10));
            s11.setOnAction(e->decrementcount(t11,r11,p11));
            s12.setOnAction(e->decrementcount(t12,r12,p12));
            VBox vd=new VBox();
            vd.getChildren().addAll(down,dw);
            vd.setAlignment(Pos.CENTER);
            root.setBottom(vd);
            root.setTop(l);
            Image im=new Image(new FileInputStream("C:\\Users\\Admin\\Desktop\\cake_shop1.jpg"));
            ImageView iv=new ImageView(im);
            iv.setX(50);
            iv.setY(25);
            iv.setFitWidth(500);
            iv.setFitHeight(500);
            root.setLeft(iv);
            iv.setImage(im);
            BorderPane.setAlignment(l,Pos.TOP_CENTER);
            Scene scene = new Scene(root,900,600);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Cake Order Menu");
            primaryStage.show();

		} 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	private void incrementcount(TextField t,TextField r,Label p)
	{
		int count=Integer.parseInt(t.getText());
		count++;
		int label=Integer.parseInt(p.getText().substring(1));
		int result=Integer.parseInt(r.getText());
		result=label*count;
		t.setText(String.valueOf(count));
		r.setText(String.valueOf(result));
	}
	private void decrementcount(TextField t,TextField r,Label p)
	{
		int count=Integer.parseInt(t.getText());
		count--;
		int label=Integer.parseInt(p.getText().substring(1));
		int result=Integer.parseInt(r.getText());
		result=label*count;
		t.setText(String.valueOf(count));
		r.setText(String.valueOf(result));
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}


