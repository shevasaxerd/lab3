import javax.swing.*;

public class Main_app {
    public static void main(String[] args)
    {
        if (args.length==0) { System.out.println("Невозможно табулировать многочлен, для которого не задано ни одного коэффициента!");
            System.exit(-1);
        }
        // Зарезервировать места в массиве коэффициентов столько, сколько аргументов командной строки
        Double[] coeff = new Double[args.length];
        int i = 0;
        try {
            // Перебрать все аргументы, пытаясь преобразовать их в Double
            for (String arg: args) {
                coeff[i++] = Double.parseDouble(arg);
            }
        } catch (NumberFormatException ex) {
            // Если преобразование невозможно - сообщить об ошибке и завершиться
            System.out.println("Ошибка преобразования строки '" + args[i] + "' в число типа Double");
            System.exit(-2);
        }

        MainFrame frame=new MainFrame(coeff);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
