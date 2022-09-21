public class Quat {
    String thuongHieu,loai;
    float gia;
    int congSuat,capDo;
    boolean quayNgang,on;
    public Quat(String thuongHieu,String loai,float gia,int congSuat){
        this.thuongHieu=thuongHieu;
        this.loai = loai;
        this.gia = gia;
        this.congSuat = congSuat;
        this.capDo = 0;
        this.quayNgang = false;
        this.on = false;
    }
    void chuyenSo(int so){
            if (so>0){
                if (this.on==true) {
                    this.capDo = so;
                    System.out.println("Cap do: " + this.capDo + " (" + this.thuongHieu + this.loai + ")");
                }
                else if (this.on==false) {
                    this.capDo = so;
                    System.out.println("QUAT  TAT ROI");
                }
            }
            else if (so==0) {
                this.on = false;
                this.capDo = so;
                System.out.println("TAT");
            }
            else if (so<0) {
                System.out.println(" khong hop le");
            }
    }
    void chuyenTrangThaiQuay(){
        this.quayNgang = !this.quayNgang;
    }
    void bat(){
        this.on = true;
        chuyenSo(1);
    }
    void tat(){
        if (this.capDo>=1){
            chuyenSo(0);
        }
        else {
            this.on = false;
            System.out.println("QUAT TAT ROI");
        }
    }
    void hienThi(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "Quat [capDo=" + capDo + ", congSuat=" + congSuat + ", gia=" + gia + ", loai=" + loai + ", on=" + on + ", quayNgang=" + quayNgang + ", thuongHieu=" + thuongHieu + "]";
    }
    public static void main(String[]args){
        Quat q1 = new Quat("ABC"," - hoi nuoc",122,230);
        Quat q2 = new Quat("XYZ"," - thuong",30,70);
        q1.hienThi();
        q2.hienThi();
        q1.bat();
        q1.chuyenSo(3);
        q1.tat();
        q1.chuyenSo(2);
        q1.bat();
        q1.chuyenSo(2);
        q1.tat();
        q1.tat();
        q1.bat();
        q1.bat();
        q1.chuyenSo(-2);
    }
}