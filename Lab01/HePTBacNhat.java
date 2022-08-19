import javax.swing.JOptionPane;

public class HePTBacNhat {
    public static void main(String[] args) {
        String str1, str2, str3, str4, str5, str6;
        Double a1, b1, c1, a2, b2, c2, D, D1, D2, x, y;
        str1 = JOptionPane.showInputDialog(null, "Nhap vao he so a1 (a1x + b1y = c1): ", "Nhap",
                JOptionPane.INFORMATION_MESSAGE);
        a1 = Double.parseDouble(str1);
        str2 = JOptionPane.showInputDialog(null, "Nhap vao he so b1 (a1x + b1y = c1): ", "Nhap",
                JOptionPane.INFORMATION_MESSAGE);
        b1 = Double.parseDouble(str2);
        str3 = JOptionPane.showInputDialog(null, "Nhap vao he so c1 (a1x + b1y = c1): ", "Nhap",
                JOptionPane.INFORMATION_MESSAGE);
        c1 = Double.parseDouble(str3);
        str4 = JOptionPane.showInputDialog(null, "Nhap vao he so a2 (a2x + b2y = c2): ", "Nhap",
                JOptionPane.INFORMATION_MESSAGE);
        a2 = Double.parseDouble(str4);
        str5 = JOptionPane.showInputDialog(null, "Nhap vao he so b2 (a2x + b2y = c2): ", "Nhap",
                JOptionPane.INFORMATION_MESSAGE);
        b2 = Double.parseDouble(str5);
        str6 = JOptionPane.showInputDialog(null, "Nhap vao he so c2 (a2x + b2y = c2): ", "Nhap",
                JOptionPane.INFORMATION_MESSAGE);
        c2 = Double.parseDouble(str6);
        if ((a1 * a1 + b1 * b1) == 0 && c1 != 0) {
            JOptionPane.showMessageDialog(null, "He phuong trinh vo nghiem!", "Ket Qua",
                    JOptionPane.INFORMATION_MESSAGE);
            HePTBacNhat.main(args);
        }
        if ((a2 * a2 + b2 * b2) == 0 && c2 != 0) {
            JOptionPane.showMessageDialog(null, "He phuong trinh vo nghiem!", "Ket Qua",
                    JOptionPane.INFORMATION_MESSAGE);
            HePTBacNhat.main(args);
        }
        D = a1 * b2 - a2 * b1;
        D1 = c1 * b2 - c2 * b1;
        D2 = a1 * c2 - a2 * c1;
        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                JOptionPane.showMessageDialog(null, "He phuong trinh co vo so nghiem!", "Ket Qua",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "He phuong trinh vo nghiem!", "Ket Qua",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            x = D1 / D;
            y = D2 / D;
            JOptionPane.showMessageDialog(null,
                    "He phuong trinh co nghiem duy nhat: \n" + "x = " + x + "\n" + "y = " + y, "Ket Qua",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        HePTBacNhat.main(args);
    }
}
