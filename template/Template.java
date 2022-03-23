package template;

public abstract class Template {
    public final void chiaThuong() {
        duaRaQuyThuong();
        PMDienME();
        PMChiaThuong();
        DLeadDuyet();
        chuyenKhoanDenNhanVien();
    }

    private void chuyenKhoanDenNhanVien() {
        System.out.println("Da chuyen khoan");
    }

    public abstract void DLeadDuyet();

    public abstract void PMChiaThuong();

    public abstract void PMDienME();

    private void duaRaQuyThuong() {
        System.out.println("BOM ra quy thuong");
    }
}
