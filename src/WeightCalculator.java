
import java.awt.Color;
import java.io.*;

public class WeightCalculator {
    private final String FEMALE_TAG= "female";
    private final String MALE_TAG = "male";
    final String PLACEHOLDER_RESULT = "%.2f\n";
    private boolean writeToFile = true;
    private int age;
    private int gender;
    private double hight;
    private boolean showRobinson = true;
    private boolean showMiller = true;
    private boolean showDavine = true;
    private boolean showHamwi = true;
    private final String ROBINSON_FORMULA_MESSAGE =
            "By Robinson formula for %s, your ideal weight is: ";
    private final String MILLER_FORMULA_MESSAGE =
            "By Miller formula for %s, your ideal weight is: ";
    private final String HAMWI_FORMULA_MESSAGE =
            "By Hamwi formula for %s, your ideal weight is: ";
    private final String DAVINE_FORMULA_MESSAGE =
            "By Davine formula for %s, your ideal weight is: ";
    
    public WeightCalculator(){
        
    }
    public WeightCalculator(int a, int g, double h, boolean m, boolean r, boolean d, boolean ha, boolean w) {
        setAge(a);
        setGender(g);
        setHight(h);
        setShowRobinson(r);
        setShowMiller(m);
        setShowDavine(d);
        setShowHamwi(ha);
        setWriteToFile(w);
    }

    public void setAge(int a) {
        if (a > 0) {
            age = a;
        }
    }

    public int getAge() {
        return age;
    }

    public void setGender(int g) {
        if (g == 1 || g == 0) {
            gender = g;
        }
    }

    public int getGender() {
        return gender;

    }

    public void setHight(double h) {
        if (h > 0) {
            hight = h;
        }
    }

    public double getHight() {
        return hight;
    }

    public void setShowRobinson(boolean r) {
        showRobinson = r;
    }

    public boolean getShowRobinson() {
        return showRobinson;
    }

    public void setShowMiller(boolean m) {
        showMiller = m;

    }

    public boolean getShowMiller() {
        return showMiller;
    }

    public void setShowDavine(boolean d) {
        showDavine = d;
    }

    public boolean getShowDavine() {
        return showDavine;
    }

    public void setShowHamwi(boolean ha) {
        showHamwi = ha;
    }

    public boolean getShowHamwi() {
        return showHamwi;

    }

    public void setWriteToFile(boolean w) {
        writeToFile = w;

    }

    public boolean getWriteToFile() {
        return writeToFile;
    }

    public double robinsonFormulaMan() {
        double weightman = 52 + (1.9 * ((hight - 1.50) / 2.54));
        return weightman;
    }

    public double robinsonFormulaWoman() {
        double weightwoman = 49 + (1.7 * ((hight - 1.50) / 2.54));
        return weightwoman;
    }

    public double millerFormulaMan() {
        double millerman = 56.2 + (1.41 * ((hight - 1.50) / 2.54));
        return millerman;
    }

    public double millerFormulaWoman() {
        double millerwoman = 53.1 + (1.36 * ((hight - 1.50) / 2.54));
        return millerwoman;
    }

    public double hamwiFormulaMan() {
        double hamwiman = 48.0 + (2.7 * ((hight - 1.50) / 2.54));
        return hamwiman;
    }

    public double hamwiFormulaWoman() {
        double hamwiwoman = 48.0 + (2.7 * ((hight - 1.50) / 2.54));
        return hamwiwoman;
    }

    public double devineFormulaMan() {
        double devineman = 50.0 + (2.3 * ((hight - 1.50) / 2.54));
        return devineman;
    }

    public double devineFormulaWoman() {
        double devinewoman = 45.5 + (2.3 * ((hight - 1.50) / 2.54));
        return devinewoman;
    }

    public String toString() {

        String result = "";
        if (gender == 0) {

            if (showRobinson) {
                result += String.format(ROBINSON_FORMULA_MESSAGE
                        + PLACEHOLDER_RESULT,MALE_TAG, robinsonFormulaMan());
            }

            if (showMiller) {
                result += String.format(MILLER_FORMULA_MESSAGE
                        + PLACEHOLDER_RESULT,MALE_TAG, millerFormulaMan());
            }
            if (showDavine) {
                result += String.format(DAVINE_FORMULA_MESSAGE
                        + PLACEHOLDER_RESULT,MALE_TAG, devineFormulaMan());
            }
            if (showHamwi) {
                result += String.format(HAMWI_FORMULA_MESSAGE
                        + PLACEHOLDER_RESULT, MALE_TAG,hamwiFormulaMan());

            }

        } else if (gender == 1) {

            if (showRobinson) {
                result += String.format(ROBINSON_FORMULA_MESSAGE
                        + PLACEHOLDER_RESULT,FEMALE_TAG, robinsonFormulaWoman());
            }
            if (showMiller) {
                result += String.format(MILLER_FORMULA_MESSAGE
                        + PLACEHOLDER_RESULT,FEMALE_TAG, millerFormulaWoman());
            }
            if (showDavine) {
                result += String.format(DAVINE_FORMULA_MESSAGE
                        + PLACEHOLDER_RESULT,FEMALE_TAG, devineFormulaWoman());
            }
            if (showHamwi) {
                result += String.format(HAMWI_FORMULA_MESSAGE
                        + PLACEHOLDER_RESULT,FEMALE_TAG, hamwiFormulaWoman());

            }
        }
        if (getWriteToFile()) {
            writeFile(result);
        }
        return result;
    }

    public void writeFile(String messageToWrite) {

        FileOutputStream four = null;

        try {
            String fileName = "result.txt";
            four = new FileOutputStream(fileName);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(four));
            writer.write(messageToWrite);

            writer.flush();
            writer.close();
            four.close();
        } catch (java.io.IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                four.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
        

    }
}
