// 1) Design an applet to create  BioData using following components.
// Button, Choice, List, TextField, TextArea, Label, RadioButton

// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

// class AJP_External extends JFrame implements ActionListener {
//     JFrame fr;
//     JLabel nameLabel, ageLabel, genderLabel, lb4, lb5, lb6, lb7;
//     JButton bt;
//     JRadioButton rb1, rb2;
//     JList ls;
//     JTextField nameText, ageText, tf3;
//     JTextArea ta;
//     JComboBox cb;

//     int count=0;

//      AJP_External() {
//         setTitle(" AJP_External Form");

//         nameLabel = new JLabel("Name :");
//         nameLabel.setBounds(10,10,100,20);
//         nameText = new JTextField();
//         nameText.setBounds(110,10, 100, 20 );

//         ageLabel = new JLabel("Age :");
//         ageLabel.setBounds(10,40,100,20);
//         ageText = new JTextField();
//         ageText.setBounds(110,40, 100, 20 );

//         genderLabel = new JLabel("Gender :");
//         genderLabel.setBounds(10,70,100,20);
//         String[] gender = {"Male","Female","Other"};
//         cb = new JComboBox(gender);
//         cb.setBounds(110,70,100,20);

//         lb4 = new JLabel("Skills :");
//         lb4.setBounds(10,100,100,20);
//         String[] skills = {"Python", "Java", "C++", "Rust"};
//         ls = new JList(skills);
//         ls.setBounds(110,100,100,80);

//         lb5 = new JLabel("Address :");
//         lb5.setBounds(10,190,100,20);
//         ta = new JTextArea();
//         ta.setBounds(110,190,100,50);

//         lb6 = new JLabel("Marital Status :");
//         lb6.setBounds(10,250,100,20);
//         rb1 = new JRadioButton("Bachlore");
//         rb1.setBounds(110,250,100,20);
//         rb2 = new JRadioButton("Married");
//         rb2.setBounds(210,250,100,20);

//         bt = new JButton("submit");
//         bt.setBounds(60,290,80,20);
//         bt.addActionListener(this);

//         lb7 = new JLabel();
//         lb7.setBounds(10,330,300,20);

//         add(nameLabel);
//         add(nameText);
//         add(ageLabel);
//         add(ageText);
//         add(genderLabel);
//         add(cb);
//         add(lb4);
//         add(ls);
//         add(lb5);
//         add(ta);
//         add(lb6);
//         add(rb1);
//         add(rb2);
//         add(bt);
//         add(lb7);

//         setSize(500,500);
//         setLayout(null);
//         setVisible(true);
//         setDefaultCloseOperation(3);
//     }

//     @Override
//     public void actionPerformed(ActionEvent ae) {
//         if(count==0) {
//             lb7.setText("Bio Data Form Submitted");
//             bt.setText("clear");
//             count=count+1;
//         }
//         else if (count==1) {
//             lb7.setText("");
//             bt.setText("submit");
//             count=count-1;
//         }
//     }
//     public static void main(String[] args) {
//         new  AJP_External();
//     }
// }

 
 

// 2) Develop a program to create six buttons and apply GridLayout.
 
// import java.awt.*;
// import java.awt.event.*;

// class AJP_External extends Frame {
//     public AJP_External() {
//         setTitle("AJP_External");

//         Button bt1 = new Button("1");
//         Button bt2 = new Button("2");
//         Button bt3 = new Button("3");
//         Button bt4 = new Button("4");
//         Button bt5 = new Button("5");
//         Button bt6 = new Button("6");

//         add(bt1);
//         add(bt2);
//         add(bt3);
//         add(bt4);
//         add(bt5);
//         add(bt6);

//         GridLayout gl = new GridLayout(3,2,10,5);
//         setLayout(gl);
//         setSize(300,300);
//         setVisible(true);
//     }
//     public static void main(String[] args) {
//         new AJP_External();
//     }
// }

 
 

// 3) WAP which will create checkable menu item ‘Picture’ under Insert Menu and ‘Paste’ menu item under the menu Home.

 
// import java.awt.*;
// import java.awt.event.*;

// class AJP_External extends Frame {
//     AJP_External() {
//         setTitle("AJP_External");

//         MenuBar menuBar = new MenuBar();

//         Menu insertMenu = new Menu("Insert");
//         Menu homeMenu = new Menu("Home");

//         CheckboxMenuItem picture = new CheckboxMenuItem("Picture");
//         CheckboxMenuItem paste = new CheckboxMenuItem("Paste");

//         insertMenu.add(picture);
//         homeMenu.add(paste);

//         menuBar.add(insertMenu);
//         menuBar.add(homeMenu);

//         setMenuBar(menuBar);
//         setSize(300,200);
//         setLayout(null);
//         setVisible(true);
//     }
//     public static void main(String[] args) {
//         new AJP_External();
//     }
// }

 
 

 

// 4) Create a frame having title as “changing colors” with a provision to select a particular among Red, Green, and Blue. Make use of JComboBox.

 
// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ItemEvent;
// import java.awt.event.ItemListener;

// class AJP_External extends JFrame implements ItemListener {
//     JComboBox cb;

//     public AJP_External() {
//         setTitle("Changing Colors");

//         String[] color = {"Red", "Green", "Blue"};

//         cb = new JComboBox(color);
//         cb.setBounds(10,10,100,20);

//         cb.addItemListener(this);

//         add(cb);

//         setSize(300,200);
//         setLayout(null);
//         setVisible(true);
//     }

//     @Override
//     public void itemStateChanged(ItemEvent ie) {

//         String selectedColor = (String) cb.getSelectedItem();

//         if (selectedColor.equals("Red")) {
//             getContentPane().setBackground(Color.red);
//         }
//         else if (selectedColor.equals("Green")) {
//             getContentPane().setBackground(Color.green);
//         }
//         else if (selectedColor.equals("Blue")) {
//             getContentPane().setBackground(Color.blue);
//         }
//     }

//     public static void main(String[] args) {
//         new AJP_External();
//     }
// }

 
 

 

 

// 5) WAP to create three radio buttons once user click on button background color will change such as red, green and blue.

 
// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ItemEvent;
// import java.awt.event.ItemListener;

// class AJP_External extends JFrame implements ItemListener {
//     JRadioButton rb1, rb2, rb3;


//     public AJP_External() {
//         setTitle("AJP_External");

//         rb1 = new JRadioButton("Red");
//         rb1.setBounds(10,10,100,20);
//         rb1.addItemListener(this);

//         rb2 = new JRadioButton("Green");
//         rb2.setBounds(10,40,100,20);
//         rb2.addItemListener(this);

//         rb3 = new JRadioButton("Blue");
//         rb3.setBounds(10,70,100,20);
//         rb3.addItemListener(this);

//         ButtonGroup bg = new ButtonGroup();
//         bg.add(rb1);
//         bg.add(rb2);
//         bg.add(rb3);

//         add(rb1);
//         add(rb2);
//         add(rb3);

//         setSize(250,200);
//         setLayout(null);
//         setVisible(true);
//         setDefaultCloseOperation(3);
//     }

//     @Override
//     public void itemStateChanged(ItemEvent ie){
//         if(ie.getSource() == rb1) {
//             getContentPane().setBackground(Color.RED);
//         }
//         else if(ie.getSource() == rb2) {
//             getContentPane().setBackground(Color.GREEN);
//         }
//         else if(ie.getSource() == rb3) {
//             getContentPane().setBackground(Color.BLUE);
//         }
//     }
//     public static void main(String[] args) {
//         new AJP_External();
//     }
// }

// 6) Develop a program which will implement various methods of MouseMotionListener.
// import java.awt.*;
// import java.awt.event.MouseEvent;
// import java.awt.event.MouseMotionListener;

// class AJP_External implements MouseMotionListener {
//     Frame fr;

//     AJP_External() {
//         fr = new Frame("");

//         fr.addMouseMotionListener(this);

//         fr.setSize(300, 200);
//         fr.setLayout(null);
//         fr.setVisible(true);
//     }

//     @Override
//     public void mouseMoved(MouseEvent me) {
//         Graphics gr = fr.getGraphics();
//         gr.setColor(Color.RED);
//         gr.fillOval(me.getX(), me.getY(), 10,10);
//     }

//     @Override
//     public void mouseDragged(MouseEvent me) {
//         Graphics gr = fr.getGraphics();
//         gr.setColor(Color.BLUE);
//         gr.fillOval(me.getX(), me.getY(), 10, 10);
//     }

//     public static void main(String[] args) {
//         new AJP_External();
//     }
// }

 
 


// 7) Develop a program which will implement various methods of KeyListener.

 
// import java.awt.*;
// import java.awt.event.*;

// class AJP_External extends Frame implements KeyListener {
//     Label lb;
//     TextArea ta;

//     public AJP_External() {
//         super("KeyListener");

//         lb = new Label();
//         lb.setBounds(15,30,100,20);

//         ta = new TextArea();
//         ta.setBounds(15, 50, 200, 200);

//         ta.addKeyListener(this);

//         add(lb);
//         add(ta);

//         setSize(250,300);
//         setLayout(null);
//         setVisible(true);
//     }

//     public void keyPressed(KeyEvent ke) {
//         lb.setText("Key Pressed");
//         System.out.println("Key Pressed");
//     }

//     public void keyTyped(KeyEvent ke) {
//         lb.setText("Key Typed");
//         System.out.println("Key Typed");
//     }

//     public void keyReleased(KeyEvent ke) {
//         lb.setText("Key Released");
//         System.out.println("Key Released");
//     }

//     public static void main(String[] args) {
//         new AJP_External();
//     }
// }

 
 

// Key Pressed
// Key Typed
// Key Released
// Key Pressed
// Key Typed
// Key Released

// 8) Develop a program to create an applet to accept a no in text field and display the square of the no when a button with caption Square is pressed.

 
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// class AJP_External extends Frame implements ActionListener {
//     Label nameLabel,ageLabel;
//     Button bt;
//     TextField tf;

//     int count = 0;

//     public AJP_External() {
//         setTitle("AJP_External");

//         nameLabel = new Label("Enter No.: ");
//         nameLabel.setBounds(10,30,60,20);

//         tf = new TextField();
//         tf.setBounds(70,30,100,20);

//         bt = new Button("square");
//         bt.setBounds(10,60,100,20);
//         bt.addActionListener(this);

//         ageLabel = new Label();
//         ageLabel.setBounds(10,90,100,20);

//         add(nameLabel);
//         add(tf);
//         add(bt);
//         add(ageLabel);

//         setSize(300,200);
//         setLayout(null);
//         setVisible(true);
//     }

//     @Override
//     public void actionPerformed(ActionEvent ae) {

//         int num = Integer.parseInt(tf.getText());

//         if(count == 0) {
//             ageLabel.setText(num+"^2 = "+(num*num));
//             bt.setLabel("clear");
//             count++; // or count = 1;
//         }
//         else if (count == 1) {
//             ageLabel.setText("");
//             bt.setLabel("square");
//             tf.setText("");
//             count--; // or count = 0;
//         }

//     }

//     public static void main(String[] args) {
//         new AJP_External();
//     }
// }

 
 

// 9) WAP which will make use of Mouse Adapter class.


 
// import java.awt.*;
// import java.awt.event.MouseEvent;
// import java.awt.event.MouseAdapter;

// class AJP_External extends MouseAdapter {
//     Frame f;
//     public AJP_External() {
//         f = new Frame("MouseAdapter");

//         f.addMouseListener(this);

//         f.setSize(300,200);
//         f.setLayout(null);
//         f.setVisible(true);
//     }

//     @Override
//     public void mousePressed(MouseEvent me) {
//         System.out.println("Mouse Pressed");
//     }

//     @Override
//     public void mouseReleased(MouseEvent me) {
//         System.out.println("Mouse Released");
//     }

//     @Override
//     public void mouseClicked(MouseEvent me) {
//         System.out.println("Mouse Clicked");
//     }

//     public static void main(String[] args) {
//         new AJP_External();
//     }
// }

 
 
// Mouse Pressed
// Mouse Released
// Mouse Clicked
// Mouse Pressed
// Mouse Released
// Mouse Clicked

// 10) WAP to send user name to the server and server will send “Hello <user name>” to client using TCP.


 
// Server:
// import java.io.*;
// import java.net.*;

// public class AJP_External {
//     public static void main(String[] args) {
//         final int PORT = 12345;

//         try (ServerSocket serverSocket = new ServerSocket(PORT)) {
//             System.out.println("Server is running. Waiting for client...");

//             while (true) {
//                 Socket clientSocket = serverSocket.accept();

//                 // Create a new thread to handle each client
//                 new Thread(() -> handleClient(clientSocket)).start();
//             }
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }

//     private static void handleClient(Socket clientSocket) {
//         try (
//             BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//             PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true)
//         ) {
//             String username = reader.readLine();
//             String greeting = "Hello " + username;

//             writer.println(greeting);

//             System.out.println("Greeting sent to client: " + greeting);
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }
// Client:
// import java.io.*;
// import java.net.*;

// public class AJP_External_Client {
//     public static void main(String[] args) {
//         final String SERVER_IP = "localhost";
//         final int SERVER_PORT = 12345;

//         try (
//             Socket socket = new Socket(SERVER_IP, SERVER_PORT);
//             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
//             BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in))
//         ) {
//             System.out.print("Enter your username: ");
//             String username = userInputReader.readLine();

//             // Send username to the server
//             writer.println(username);

//             // Receive and print the greeting from the server
//             String greeting = reader.readLine();
//             System.out.println("Server says: " + greeting);
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }

 

 

 


// 11) WAP to send a no through client to the server and server will send the message to the client that the no. is prime or not.


 
// Server:
// import java.io.*;
// import java.net.*;
// public class Server 
// {
//     public static boolean isPrime(int number)
//     {
//         boolean isPrimeNum = false;
//         int i = (int) Math.ceil(Math.sqrt(number));
//         while(i>1)
//         {
//             if((number != i) && (number % i ==0))
//             {
//                 isPrimeNum = false;
//                 break;
//             }
//             else if(!isPrimeNum)
//             {
//                 isPrimeNum = true;
//             }
//             --i;
//         }
//         return isPrimeNum;
//     }
//     public static void main(String [] args) throws Exception
//     {
//         System.out.println("Hello User");
//         Socket s;
//         int port = 9000;
//         ServerSocket ss = new ServerSocket(port);
//         System.out.println("Waiting for client");
//         s = ss.accept();
//         BufferedReader br = new BufferedReader(new 
//         InputStreamReader(s.getInputStream()));
//         PrintWriter pw = new PrintWriter(new 
//         OutputStreamWriter(s.getOutputStream()));
//         int num = Integer.parseInt(br.readLine());
//         System.out.println("Number sent by client: " + num);
//         pw.println(isPrime(num));
//         pw.flush();
//     }
// }	
// Client:
// import java.io.*;
// import java.net.*;
// public class Client
// {
//     public static void main(String [] args) throws Exception
//     {
//         System.out.println("Hello user");
//         int port = 9000;
//         Socket s;
//         BufferedReader br = new BufferedReader(new 
//         InputStreamReader(System.in));
        
//         s = new Socket(InetAddress.getLocalHost(),port);
//         PrintWriter pw = new PrintWriter(new 
//         OutputStreamWriter(s.getOutputStream()));
//         BufferedReader brl = new BufferedReader(new 
//         InputStreamReader(s.getInputStream()));
//         System.out.print("Enter any number: ");
//         String str = br.readLine();
//         pw.println(str);
//         pw.flush();
//         String msg = brl.readLine();
//         if(msg.equals("true"))
//         {      
//             System.out.println("It is a prime number");
//         }
//         else
//         {
//             System.out.println("It is not a prime number");
//         }
//     }
// }

 
 

 



// 12) WAP to create student table in database having three columns rollno,name and marks , Insert some values into table and display records of those students whose marks > 70.

 


 


// 13) WAP for given output

 

 
// import javax.swing.*;
// import javax.swing.tree.DefaultMutableTreeNode;
// import java.awt.*;

// class AJP_External extends JFrame {

//     public AJP_External() {
//         setTitle("AJP_External");

//         DefaultMutableTreeNode tpoly = new DefaultMutableTreeNode("TPOLY");
//         DefaultMutableTreeNode co = new DefaultMutableTreeNode("CO");
//         tpoly.add(co);

//         DefaultMutableTreeNode fyco = new DefaultMutableTreeNode("FYCO");
//         DefaultMutableTreeNode syco = new DefaultMutableTreeNode("SYCO");
//         DefaultMutableTreeNode tyco = new DefaultMutableTreeNode("TYCO");

//         co.add(fyco);
//         co.add(syco);
//         co.add(tyco);

//         DefaultMutableTreeNode ce = new DefaultMutableTreeNode("CE");
//         DefaultMutableTreeNode me = new DefaultMutableTreeNode("ME");
//         DefaultMutableTreeNode if_ = new DefaultMutableTreeNode("IF");

//         tpoly.add(ce);
//         tpoly.add(me);
//         tpoly.add(if_);

//         JTree jTree = new JTree(tpoly);
//         jTree.setBounds(10,10,160,160);

//         add(jTree);

//         setSize(250,250);
//         setLayout(null);
//         setVisible(true);
//         setDefaultCloseOperation(3);
//     }

//     public static void main(String[] args) {
//         new AJP_External();
//     }
// }

 
 

// 14)  WAP to create JTable on JApplet window.

 
// import javax.swing.*;
// import java.awt.*;

// public class AJP_External extends JApplet {
//     public void init() {
//         // Create sample data for the table
//         Object[][] data = {
//                 {"John Doe", 25, "Male"},
//                 {"Jane Doe", 30, "Female"},
//                 {"Bob Smith", 22, "Male"},
//                 {"Alice Johnson", 28, "Female"}
//         };

//         // Column names
//         String[] columnNames = {"Name", "Age", "Gender"};

//         // Create a JTable with the sample data
//         JTable jTable = new JTable(data, columnNames);

//         // Create a JScrollPane to add scroll functionality if needed
//         JScrollPane jScrollPane = new JScrollPane(jTable);

//         // Add the JScrollPane to the applet content pane
//         add(jScrollPane);
//     }
// }
// /*<applet code=" AJP_External.class" width=400 height=300></applet>*/