package javaprogram;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MessageBox1 extends JFrame{
    private JTextArea Chatarea = new JTextArea();
    private JTextField chatbox = new JTextField();
    public MessageBox1(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(700 , 700);
        frame.setTitle("ChatBot");
        frame.add(Chatarea);
        frame.add(chatbox);
        //For TTextArea
        
        Chatarea.setSize(600, 550);
        Chatarea.setLocation(2, 2);
        
        //FOR TEXTFIELD
        chatbox.setSize(600, 40);
        chatbox.setLocation(2, 600);
        
        chatbox.addActionListener (new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String gtext = chatbox.getText().toLowerCase();
                Chatarea.append("YOU ->"+ gtext +"\n");
                chatbox.setText(" ");
                
                if(gtext.contains("hi")){
                    bot("Hello");
                }else if(gtext.contains("name")){ 
                    bot("BRAC university");
                }
                
                else if(gtext.contains("vice chancellor")){ 
                    bot("Professor Vincent Chang, PhD");
                }else if(gtext.contains("vice chancellor email")){ 
                    bot("vc@bracu.ac.bd");
                }else if(gtext.contains("cse department dean")){ 
                    bot("Mahbubul Alam Majumdar, PhD");
                }else if(gtext.contains("cse department dean email")){ 
                    bot("majumdar@bracu.ac.bd");
                }else if(gtext.contains("Vice Chancellor Email")){ 
                    bot("vc@bracu.ac.bd");
                }
                
                else if(gtext.contains("cse cost")){ 
                    bot("12,00,000");
                }else if(gtext.contains("cs cost")){ 
                    bot("10,00,000");
                }else if(gtext.contains("me cost")){ 
                    bot("11,00,000");
                }else if(gtext.contains("mscse cost")){ 
                    bot("2,60,000");
                }else if(gtext.contains("msc in cse cost")){ 
                    bot("2,60.000");
                }
                
                else if(gtext.contains("cse credit")){ 
                    bot("136 credit");
                }else if(gtext.contains("cs credit")){ 
                    bot("124 credit");
                }else if(gtext.contains("me credit")){ 
                    bot("127 credit");
                }else if(gtext.contains("mscse total credit")){ 
                    bot("36 credit");
                }else if(gtext.contains("msc in cse credit")){ 
                    bot("36 credit");
                }
                
                else if(gtext.contains("cse total years")){ 
                    bot("4 years");
                }else if(gtext.contains("cs total years")){ 
                    bot("4 years");
                }else if(gtext.contains("me total years")){ 
                    bot("4 years");
                }else if(gtext.contains("mscse total years")){ 
                    bot("1 year");
                }
                
                else if(gtext.contains("year semester")){ 
                    bot("3 semester");
                }else if(gtext.contains("year total semester")){ 
                    bot("3 semester");
                }
                
                else if(gtext.contains("cse total subject")){ 
                    bot("34 subject");
                }else if(gtext.contains("cs total subject")){ 
                    bot("30 subject");
                }else if(gtext.contains("me total subject")){ 
                    bot("31 subject");
                }else if(gtext.contains("mscse total subject")){ 
                    bot("6 subject");
                }
                
                else if(gtext.contains("cse subject credit")){ 
                    bot("102 credit");
                }else if(gtext.contains("cs subject credit")){ 
                    bot("90 credit");
                }else if(gtext.contains("me subject credit")){ 
                    bot("93 credit");
                }else if(gtext.contains("mscse subject credit")){ 
                    bot("18 credit");
                }
                
                else if(gtext.contains("select subject")){ 
                    bot("maximum 2 & minimum 3 subject per semester");
                }
                else if(gtext.contains("cse total lab")){ 
                    bot("28 credit");
                }else if(gtext.contains("cs total lab")){ 
                    bot("28 credit");
                }else if(gtext.contains("cse total lab")){ 
                    bot("25 credit");
                }
                else if(gtext.contains("cse lab")){ 
                    bot("28 credit");
                }else if(gtext.contains("cs lab")){ 
                    bot("28 credit");
                }else if(gtext.contains("cse lab")){ 
                    bot("25 credit");
                }
                
                else if(gtext.contains("cse thesis credit")){ 
                    bot("6 credit");
                }else if(gtext.contains("cs thesis credit")){ 
                    bot("6 credit");
                }else if(gtext.contains("cse thesis credit")){ 
                    bot("6 credit");
                }else if(gtext.contains("ms in cse thesis credit")){ 
                    bot("18 credit");
                }
                else if(gtext.contains("cse total thesis credit")){ 
                    bot("6 credit");
                }else if(gtext.contains("cs total thesis credit")){ 
                    bot("6 credit");
                }else if(gtext.contains("cse total thesis credit")){ 
                    bot("6 credit");
                }else if(gtext.contains("mscse total thesis credit")){ 
                    bot("18 credit");
                }
                else if(gtext.contains("cse thesis total credit")){ 
                    bot("16 credit");
                }else if(gtext.contains("cs thesis total credit")){ 
                    bot("61 credit");
                }else if(gtext.contains("cse thesis credit")){ 
                    bot("6 credit");
                }else if(gtext.contains("mscse thesis total credit")){ 
                    bot("18 credit");
                }
                else if(gtext.contains("cse total thesis credit")){ 
                    bot("6 credit");
                }else if(gtext.contains("cs total thesis credit")){ 
                    bot("6 credit");
                }else if(gtext.contains("cse total thesis credit")){ 
                    bot("6 credit");
                }else if(gtext.contains("mscse total thesis credit")){ 
                    bot("18 credit");
                }
                else if(gtext.contains("cse thesis credit")){ 
                    bot("6 credit");
                }else if(gtext.contains("cs thesis credit")){ 
                    bot("6 credit");
                }else if(gtext.contains("cse thesis credit")){ 
                    bot("6 credit");
                }else if(gtext.contains("mscse thesis credit")){ 
                    bot("18 credit");
                }
                
                else if(gtext.contains("select lab")){ 
                    bot("maximum 3 credit per semester");
                }else if(gtext.contains("thesis teacher")){ 
                    bot("Md. Ashraful Alam, Md. Golam Rabiul Alam, Dr. Amitabha Chakrabarty (ACH), Mr. Moin Mostakim");
                }
                
                else if(gtext.contains("ai project")){ 
                    bot("Md. Golam Rabiul Alam");
                }else if(gtext.contains("artificial intelligence project")){ 
                    bot("Md. Golam Rabiul Alam");
                }else if(gtext.contains("networking project")){ 
                    bot("Dr. Amitabha Chakrabarty (ACH)");
                }else if(gtext.contains("multimedia project")){ 
                    bot("Md. Ashraful Alam");
                }else if(gtext.contains("data base project ")){ 
                    bot("Dr. Amitabha Chakrabarty (ACH)");
                }else if(gtext.contains("linux project")){ 
                    bot("Mr. Moin Mostakim");
                }
                
                else if(gtext.contains("university email")){ 
                    bot("info@bracu.ac.bd");
                }else if(gtext.contains("information")){ 
                    bot("info@bracu.ac.bd");
                }else if(gtext.contains("General information")){ 
                    bot("info@bracu.ac.bd");
                }else if(gtext.contains("records")){ 
                    bot("academic.records@bracu.ac.bd");
                }else if(gtext.contains("examination")){ 
                    bot("academic.records@bracu.ac.bd");
                }else if(gtext.contains("advising")){ 
                    bot("program.regi@bracu.ac.bd");
                }else if(gtext.contains("registration")){ 
                    bot("program.regi@bracu.ac.bd");
                }else if(gtext.contains("scheduling")){ 
                    bot("program.regi@bracu.ac.bd");
                }else if(gtext.contains("medical centre")){ 
                    bot("doctor@bracu.ac.bd");
                }else if(gtext.contains("library")){ 
                    bot("librarian@bracu.ac.bd");
                }else if(gtext.contains("Communications")){ 
                    bot("communications@bracu.ac.bd");
                }else if(gtext.contains("Registrar")){ 
                    bot("registrar@bracu.ac.bd");
                }else if(gtext.contains("admition office email")){ 
                    bot("admissions@bracu.ac.bd");
                }else if(gtext.contains("university website link")){ 
                    bot("https://www.bracu.ac.bd/");
                }else if(gtext.contains("addmition apply link")){ 
                    bot("https://www.bracu.ac.bd/admissions");
                }else if(gtext.contains("doctorate degree ")){ 
                    bot("12 Teacher");
                }else if(gtext.contains("phd degree")){ 
                    bot("12 Teacher");
                }else if(gtext.contains("lecture")){ 
                    bot("8 lecture");
                }else if(gtext.contains("profacher")){ 
                    bot("16 profacher");
                }
                
                
                else if(gtext.contains("mscse cost")){
                    bot("2,60,000");
                }else if(gtext.contains("mscse total cost")){
                    bot("2,60,000");
                }else if(gtext.contains("msc in cse cost")){
                    bot("2,60,000");
                }else if(gtext.contains("msc in cse total cost")){
                    bot("2,60,000");
                }else if(gtext.contains("cost mscse")){ 
                    bot("2,60,000");
                }else if(gtext.contains("cost for mscse")){ 
                    bot("2,60,000");
                }else if(gtext.contains("cost mscse")){ 
                    bot("2,60,000");
                }
                else if(gtext.contains("cse total cost")){ 
                    bot("12,50,000");
                }else if(gtext.contains("cse cost")){ 
                    bot("12,50,000");
                }else if(gtext.contains("cost in cse")){ 
                    bot("12,50,000");
                }else if(gtext.contains("cost cse")){ 
                    bot("12,50,000");
                }else if(gtext.contains("cost for cse")){ 
                    bot("12,50,000");
                }
                else if(gtext.contains("eee cost")){
                    bot("12,00,000");
                }else if(gtext.contains("eee cost")){ 
                    bot("12,50,000");
                }else if(gtext.contains("cost in eee")){ 
                    bot("12,50,000");
                }else if(gtext.contains("cost eee")){ 
                    bot("12,50,000");
                }else if(gtext.contains("cost for eee")){ 
                    bot("12,50,000");
                }
                else if(gtext.contains("department")){
                    bot("11 department");
                }else if(gtext.contains("credit")){
                    bot("150 credit");
                }else if(gtext.contains("semester")){
                    bot("Year 3 semester");
                }else if(gtext.contains("no")){ 
                    bot("thank you");
                }else{
                    int rand = (int) (Math.random() * 2+1);
                    if(rand==1){
                        bot("I Dont Undestand You");
                    }else if(rand==2){
                        bot("Please come again");
                    }
                }
                
                
            }
            
        });
        
    }
    private void bot (String string){
        Chatarea.append("BOT ->" +string+ "\n");
    }
    
    public static void main(String[] args) {
        new MessageBox1();
    }
}
