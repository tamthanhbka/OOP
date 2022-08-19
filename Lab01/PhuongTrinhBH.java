import javax.swing.JOptionPane;

public class PhuongTrinhBH {
    public static void main(String[] args) {
        String strNum1, strNum2, strNum3;
        strNum1 = JOptionPane.showInputDialog(null, "Nhap vao he so a (ax^2 + bx + c = 0): ", "Nhap",
                JOptionPane.INFORMATION_MESSAGE);
        Double a = Double.parseDouble(strNum1);
        if (a == 0) {
            JOptionPane.showMessageDialog(null, "Khong phai la phuong trinh bac hai!", "Ket Qua",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            strNum2 = JOptionPane.showInputDialog(null, "Nhap vao he so b (ax^2 + bx + c = 0): ", "Nhap",
                    JOptionPane.INFORMATION_MESSAGE);
            Double b = Double.parseDouble(strNum2);
            strNum3 = JOptionPane.showInputDialog(null, "Nhap vao he so c (ax^2 + bx + c = 0): ", "Nhap",
                    JOptionPane.INFORMATION_MESSAGE);
            Double c = Double.parseDouble(strNum3);
            Double denta = (b * b) - (4 * a * c);
            if (denta < 0) {
                JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem!", "Ket Qua", JOptionPane.INFORMATION_MESSAGE);
            } else if (denta == 0) {
                JOptionPane.showMessageDialog(null, "Phuong trinh co nghiem kep:\nx = " + (-b / 2 * a), "Ket Qua",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(
                        null, "Phuong trinh co hai nghiem phan biet:\nx1 = " + ((-b + Math.sqrt(denta)) / 2 * a) + "\n"
                                + "x2 = " + ((-b - Math.sqrt(denta)) / 2 * a),
                        "Ket Qua", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        PhuongTrinhBH.main(args);
    }
}