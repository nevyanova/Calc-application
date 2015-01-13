
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class WeightCalculatorTest {

    static final Color BACKGROUND = Color.WHITE;

    public static void main(String[] Args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                createGraphicUserInterface();
            }
        });
//        final String MILLER = "Miller";
//        final String HAMWI = "Hamwi";
//        final String ROBINSON = "Robinson";
//        final String DAVINE = "Davine";
//
//
//
//        int countMen = 0;
//        int ageMinMen = Integer.MAX_VALUE;
//        int ageMaxMen = Integer.MIN_VALUE;
//        double minHeightMen = 12345;
//        double maxHeightMen = 1;
//        int sumAgeMen = 0;
//        int avgAgeMen = 1;
//        double avgHeightMen = 1;
//        double sumHeightMen = 0;
//
//        int countWomen = 0;
//        int ageMinWomen = Integer.MAX_VALUE;
//        int ageMaxWomen = Integer.MIN_VALUE;
//        double minHeightWomen = 12345;
//        double maxHeightWomen = 1;
//        int sumAgeWomen = 0;
//        int avgAgeWomen = 1;
//        double avgHeightWomen = 1;
//        double sumHeightWomen = 0;
//
//        WeightCalculator[] arrCalculators = new WeightCalculator[6];
//        for (int i = 0; i < arrCalculators.length; i++) {
//
//            arrCalculators[i] = new WeightCalculator();
//
//            String ages = JOptionPane.showInputDialog(null, " How old are you: ");
//            int age = Integer.parseInt(ages);
//            arrCalculators[i].setAge(age);
//
//            Icon blueIcon = new ImageIcon("");
//            Object stringArray[] = {"MALE", "FEMALE"};
//
//            int m = JOptionPane.showOptionDialog(null, " Are you male or female? ", " Please enter your gender ",
//                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, blueIcon, stringArray,
//                    stringArray[1]);
//            arrCalculators[i].setGender(m);
//            System.out.print(m);
//
//            String hight = JOptionPane.showInputDialog(null, " What`s your hight in meters: ");
//            double high = Double.parseDouble(hight);
//            arrCalculators[i].setHight(high);
//            //print the result
//            JOptionPane.showMessageDialog(null, arrCalculators[i].toString() + JOptionPane.INFORMATION_MESSAGE);
//
//        }
//        for (int i = 0; i < arrCalculators.length; i++) {
//
//            if (arrCalculators[i].getGender() == 0) {
//
//                ageMinMen = Math.min(arrCalculators[i].getAge(), ageMinMen);
//                ageMaxMen = Math.max(arrCalculators[i].getAge(), ageMaxMen);
//
//                sumAgeMen = sumAgeMen + arrCalculators[i].getAge();
//                sumHeightMen = sumHeightMen + arrCalculators[i].getHight();
//
//                minHeightMen = Math.min(arrCalculators[i].getHight(), minHeightMen);
//                maxHeightMen = Math.max(arrCalculators[i].getHight(), maxHeightMen);
//                countMen++;
//
//            } else if (arrCalculators[i].getGender() == 1) {
//                ageMinWomen = Math.min(arrCalculators[i].getAge(), ageMinWomen);
//                ageMaxWomen = Math.max(arrCalculators[i].getAge(), ageMaxWomen);
//
//                sumAgeWomen = sumAgeWomen + arrCalculators[i].getAge();
//                sumHeightWomen = sumHeightWomen + arrCalculators[i].getHight();
//
//                minHeightWomen = Math.min(arrCalculators[i].getHight(), minHeightWomen);
//                maxHeightWomen = Math.max(arrCalculators[i].getHight(), maxHeightWomen);
//                countWomen++;
//
//            }
//        }
//
//        avgAgeWomen = sumAgeWomen / countWomen;
//        avgHeightWomen = sumHeightWomen / countWomen;
//
//        JOptionPane.showMessageDialog(null, " Min age for womman is: " + ageMinWomen);
//        JOptionPane.showMessageDialog(null, " Max age for womman is: " + ageMaxWomen);
//        JOptionPane.showMessageDialog(null, " Average of age for woman is : " + avgAgeWomen);
//        JOptionPane.showMessageDialog(null, " Average of height for woman is : " + avgHeightWomen);
//        JOptionPane.showMessageDialog(null, " Min height for woman is : " + minHeightWomen);
//        JOptionPane.showMessageDialog(null, " Max height for womman is : " + maxHeightWomen);
//
//        avgAgeMen = sumAgeMen / countMen;
//        avgHeightMen = sumHeightMen / countMen;
//
//        JOptionPane.showMessageDialog(null, " Min age for men is: " + ageMinMen);
//        JOptionPane.showMessageDialog(null, " Max age for men is: " + ageMaxMen);
//        JOptionPane.showMessageDialog(null, " Average of age  for men is : " + avgAgeMen);
//        JOptionPane.showMessageDialog(null, " Average of height for men is : " + avgHeightMen);
//        JOptionPane.showMessageDialog(null, " Min height for men is : " + minHeightMen);
//        JOptionPane.showMessageDialog(null, " Max height for men is : " + maxHeightMen);
    }

    public static void createGraphicUserInterface() {
        final WeightCalculator objCalculator = new WeightCalculator();
        JFrame frameCalculator = new JFrame();
        frameCalculator.setTitle("Perfect Weight Calculator");
        frameCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameCalculator.setSize(550, 450);
        frameCalculator.setResizable(false);
        frameCalculator.setVisible(true);
        frameCalculator.setLayout(new BorderLayout());

        JPanel panelCalculator = new JPanel();
        panelCalculator.setBackground(Color.WHITE);
        panelCalculator.setBorder(BorderFactory.createTitledBorder("Personal data"));




        JRadioButton male = new JRadioButton("male");
        JRadioButton female = new JRadioButton("female");
        ButtonGroup bG = new ButtonGroup();
        bG.add(male);
        bG.add(female);
        female.setSelected(true);
        female.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("1");
                    objCalculator.setGender(1);
                } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    objCalculator.setGender(0);
                    System.out.println("0");
                }
            }
        });
        JPanel jInput = new JPanel();
        GridLayout input = new GridLayout(2, 3);
        jInput.setBorder(null);


        JPanel panelResult = new JPanel();
        panelResult.setBorder(BorderFactory.createTitledBorder("Results"));
        panelResult.setBackground(BACKGROUND);


        final JTextArea areaResult = new JTextArea();
        areaResult.setEditable(false);
        areaResult.setBackground(BACKGROUND);
        Font font = new Font("Verdana", Font.ITALIC, 12);
        areaResult.setFont(font);
        panelResult.add(areaResult);

        JCheckBox checkboxRobinson = new JCheckBox("Robinson");
        checkboxRobinson.setSelected(true);
        boolean isSelected = checkboxRobinson.isSelected();
        if (isSelected) {
            checkboxRobinson.setSelected(true);
        } else {
            checkboxRobinson.setSelected(false);
        }

        JCheckBox checkboxMiller = new JCheckBox("Miller");
        checkboxMiller.setSelected(true);
        checkboxMiller.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    objCalculator.setShowMiller(true);
                } else {
                    objCalculator.setShowMiller(false);

                }
            }
        });


        JCheckBox checkboxHamwi = new JCheckBox("Hamwi");
        checkboxHamwi.setSelected(true);
        checkboxHamwi.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    objCalculator.setShowHamwi(true);
                } else {
                    objCalculator.setShowHamwi(false);

                }
            }
        });

        JCheckBox checkboxDavine = new JCheckBox("Davine");
        checkboxDavine.setSelected(true);
        checkboxDavine.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    objCalculator.setShowDavine(true);
                } else {
                    objCalculator.setShowDavine(false);

                }
            }
        });

        JCheckBox checkboxWriteToFile = new JCheckBox("Save to file");
        checkboxWriteToFile.setSelected(true);
        checkboxWriteToFile.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    objCalculator.setWriteToFile(true);
                } else {
                    objCalculator.setWriteToFile(false);

                }
            }
        });
        JPanel panelFormulas = new JPanel();
        panelFormulas.setBackground(BACKGROUND);
        checkboxDavine.setBackground(BACKGROUND);
        checkboxMiller.setBackground(BACKGROUND);
        checkboxHamwi.setBackground(BACKGROUND);
        checkboxRobinson.setBackground(BACKGROUND);
        checkboxWriteToFile.setBackground(BACKGROUND);
        female.setBackground(BACKGROUND);
        male.setBackground(BACKGROUND);
        panelFormulas.setBorder(BorderFactory.createTitledBorder("Options"));
        GridLayout formulas = new GridLayout(7, 2);
        GridLayout layoutCalculator = new GridLayout(7, 2, 5, 5);
        System.out.println("test");
        panelFormulas.setLayout(formulas);
        panelCalculator.setLayout(layoutCalculator);
        //  panelCalculator.setSize(250,250);
        final JTextField fieldAge = new JTextField();
        fieldAge.setSize(125, 50);
        final JTextField fieldHeight = new JTextField();
        fieldHeight.setSize(125, 50);
        JLabel lblAge = new JLabel("Age : ");
        JLabel lblHeight = new JLabel("Height [meters]: ");
        JButton calculate = new JButton("Calculate");
        calculate.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String strAge = fieldAge.getText();
                String strHeight = fieldHeight.getText();

                int age = Integer.parseInt(strAge);
                double height = Double.parseDouble(strHeight);
                objCalculator.setAge(age);
                objCalculator.setHight(height);
                areaResult.setText(objCalculator.toString());
            }
        });
        panelCalculator.add(lblAge);
        panelCalculator.add(fieldAge);
        panelCalculator.add(lblHeight);
        panelCalculator.add(fieldHeight);
        panelCalculator.add(new JLabel());
        panelCalculator.add(calculate);
        panelCalculator.add(new JLabel());
        panelCalculator.add(new JLabel());
        panelCalculator.add(new JLabel());
        panelCalculator.add(new JLabel());
       
       


        panelFormulas.add(female);
        panelFormulas.add(male);
        panelFormulas.add(checkboxDavine);
        panelFormulas.add(checkboxHamwi);
        panelFormulas.add(checkboxMiller);
        panelFormulas.add(checkboxRobinson);
        panelFormulas.add(checkboxWriteToFile);
        panelFormulas.add(new JLabel());
        panelFormulas.add(new JLabel());
        panelFormulas.add(new JLabel());
        panelFormulas.add(new JLabel());
        panelFormulas.add(new JLabel());
//        panelFormulas.setSize(250,250);
        frameCalculator.add(panelFormulas, BorderLayout.WEST);
        JPanel centerContent = new JPanel();
        centerContent.setBackground(BACKGROUND);
        centerContent.setLayout(new GridLayout(2,1));
        centerContent.add(panelCalculator);
        centerContent.add(panelResult);

        frameCalculator.add(centerContent, BorderLayout.CENTER);


//        panelCalculator.setLayout(layout);

//        layout.setVerticalGroup(
//                layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(panelFormulas).addComponent(jInput).addComponent(checkboxWriteToFile).addComponent(result)));



    }
}
