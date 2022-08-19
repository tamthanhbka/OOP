import javax.swing.JOptionPane;
public class PhuongTrinhBN {
    public static void main(String[] args){
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null,"Nhap vao he so a (ax + b): ","Nhap", JOptionPane.INFORMATION_MESSAGE);
        Double a = Double.parseDouble(strNum1);
        if(a==0)
        {JOptionPane.showMessageDialog(null,"Khong phai la phuong trinh bac nhat!","Ket Qua",JOptionPane.INFORMATION_MESSAGE);}
        else
        {strNum2 = JOptionPane.showInputDialog(null,"Nhap vao he so b (ax + b): ","Nhap", JOptionPane.INFORMATION_MESSAGE);
        Double b = Double.parseDouble(strNum2);
        //Double x = -b/a;
        JOptionPane.showMessageDialog(null,"Phuong trinh co nghiem duy nhat:\nx = " + (-b/a),"Ket Qua",JOptionPane.INFORMATION_MESSAGE);}
        PhuongTrinhBN.main(args);
    }
}