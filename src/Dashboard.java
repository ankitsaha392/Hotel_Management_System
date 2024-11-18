
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Dashboard extends JFrame implements ActionListener{
    public static void main(String[] args) {
        new Dashboard().setVisible(true);
    }
    
    public Dashboard() {
        super("HOTEL MANAGEMENT SYSTEM");
	
        setForeground(Color.CYAN);
        setLayout(null); 
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
        JLabel NewLabel = new JLabel(i3);
        NewLabel.setBounds(0, 0, 1950, 1000); 
        add(NewLabel);
        
        JLabel HotelManagementSystem = new JLabel("THE TAJ GROUP WELCOMES YOU");
        HotelManagementSystem.setForeground(Color.WHITE);
        HotelManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 46));
        HotelManagementSystem.setBounds(600, 60, 1000, 85);
        NewLabel.add(HotelManagementSystem);
		
		
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
		
        JMenu HotelSystem = new JMenu("HOTEL MANAGEMENT");
        HotelSystem.setForeground(Color.BLUE);
        menuBar.add(HotelSystem);
		
        JMenuItem HotelDetails = new JMenuItem("RECEPTION");
        HotelSystem.add(HotelDetails);
		
        JMenu HotelSystemHello = new JMenu("ADMIN");
        HotelSystemHello.setForeground(Color.RED);
        menuBar.add(HotelSystemHello);
        
        JMenuItem HotelDetailshello1 = new JMenuItem("ADD EMPLOYEE");
        HotelSystemHello.add(HotelDetailshello1);
        
        
        
        JMenuItem HotelDetailshello2 = new JMenuItem();
        HotelSystemHello.add(HotelDetailshello2);
        

        
        HotelDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Reception();
            }
        });
		
        setSize(1950,1090);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }

	@Override
	public void actionPerformed(ActionEvent e) {	
        String command = e.getActionCommand();
        try {
            if (command.equals("ADD EMPLOYEE")) {
                new AddEmployee().setVisible(true);
            } else if (command.equals("ADD ROOMS")) {
                new AddRoom().setVisible(true);
            } else if (command.equals("RECEPTION")) {
                new Reception().setVisible(true);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

