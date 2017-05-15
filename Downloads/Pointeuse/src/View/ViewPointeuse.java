package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Created by Damien on 15/05/2017.
 */
public class ViewPointeuse extends JFrame {

    public ViewPointeuse() throws HeadlessException {
        super("Pointeuse");


        WindowListener wL = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        addWindowListener(wL);

        setLayout(new BorderLayout());
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dF = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(date.format(dF));
        getContentPane().add(new JLabel(date.format(dF)), BorderLayout.CENTER);
        JPanel bottom = new JPanel();

        GridLayout bottomLayout = new GridLayout(1,2);
        bottom.setLayout(bottomLayout);
        DefaultComboBoxModel<Integer> list = new DefaultComboBoxModel<Integer>();
        JComboBox<Integer> test = new JComboBox<Integer>(list);

        list.addElement(10);
        list.addElement(9);
        list.addElement(8);
        list.addElement(7);
        list.addElement(6);

        bottom.add(test);

        bottom.add(new JButton("Check in/out"));
        getContentPane().add(bottom, BorderLayout.SOUTH);



        setSize(200, 200);
        setVisible(true);
    }

}
