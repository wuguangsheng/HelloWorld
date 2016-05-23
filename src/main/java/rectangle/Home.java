package rectangle;

import data.UtilDate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The program is the class for action listener
 *
 * @author wuguangsheng
 * @version V1.0 on 16/5/18
 */
public class Home extends JPanel implements ActionListener{
    private Box baseBox,boxV1,boxV2,buttonBox;
    private TextField name,phone,job;
    private TextArea document;
    private JButton buttonOK;
    private Object cell[][];
    private Object tableTile[] = {"姓名","手机号码","职业"};
    private JTable table;
    private int tablRow = 0;
    private int cellRowMax = 3;
    private UtilDate utilDate;

    public Home(){
        name =new TextField(16);
        phone = new TextField(16);
        job = new TextField(16);
        document = new TextArea(8,25);
        buttonOK = new JButton("确认");
        cell = new Object[cellRowMax][3];
        table = new JTable(cell,tableTile);
        utilDate = new UtilDate();

        boxV1 = Box.createVerticalBox();
        boxV1.add(new Label("输入姓名"));
        boxV1.add(Box.createVerticalStrut(9));
        boxV1.add(new Label("输入手机"));
        boxV1.add(Box.createVerticalStrut(9));
        boxV1.add(new Label("输入职业"));

        boxV2 = Box.createVerticalBox();
        boxV2.add(name);
        boxV2.add(Box.createVerticalStrut(9));
        boxV2.add(phone);
        boxV2.add(Box.createVerticalStrut(9));
        boxV2.add(job);

        baseBox = Box.createHorizontalBox();
        baseBox.add(boxV1);
        baseBox.add(Box.createHorizontalStrut(10));
        baseBox.add(boxV2);

        buttonBox = Box.createVerticalBox();
        buttonBox.add(baseBox);
        buttonBox.add(Box.createVerticalStrut(9));
        buttonBox.add(buttonOK);
        buttonBox.add(Box.createVerticalStrut(9));
        buttonBox.add(document);

        add(buttonBox);
        add(new JScrollPane(table));

        buttonOK.addActionListener(this);
        setBounds(200,200,500,300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonOK){
            try {
                cell[tablRow][0] = name.getText();
                cell[tablRow][1] = phone.getText();
                cell[tablRow][2] = job.getText();
                if (tablRow++ >= cellRowMax){
                    tablRow = 0;
                    cell = null;
                }
                table.repaint();

                name.setText(null);
                phone.setText(null);
                job.setText(null);
                boxV2.repaint();

                document.setText("订单编码:"+utilDate.getOrderNum()+"\n"+"下单时间:"+utilDate.getDateFormatter()+"\n"+"订单批号:"+utilDate.getDate()+"\n");
                document.repaint();
            }
            catch (Exception e1){
                e1.printStackTrace();
                tablRow = 0;
                table.clearSelection();
            }
        }
    }
}
