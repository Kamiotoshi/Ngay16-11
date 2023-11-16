public class Product {
    // Các thuộc tính
    String Productnumber;
    String Productname;
    double Price;
    int quantity;
    String unit;

    // Constructor
    public Product(String Productnumber, String Productname, double Price, int quantity, String unit) {
        this.Productnumber = Productnumber;
        this.Productname = Productname;
        this.Price = Price;
        this.quantity = quantity;
        this.unit = unit;
    }

    // Phương thức tăng số lượng sản phẩm
    public void Increasequantity(int quantityUp) {
        this.quantity += quantityUp;
    }

    // Phương thức giảm số lượng sản phẩm
    public void Lowerquantity(int quantityDown) {
        if (quantityDown > this.quantity) {
            System.out.println("Số lượng giảm lớn hơn số lượng hiện có.");
        } else {
            this.quantity -= quantityDown;
        }
    }

    // Phương thức thay đổi giá tiền sản phẩm
    public void Pricechanger(double NewPrice) {
        this.Price = NewPrice;
    }

    // Phương thức kiểm tra hàng còn/hết hàng
    public void Checkquantity() {
        if (quantity > 0) {
            System.out.println("Còn hàng. Số lượng hiện tại: " + quantity);
        } else {
            System.out.println("Hết hàng.");
        }
    }

    // Phương thức in thông tin sản phẩm
    public void Show() {
        System.out.println("Mã sản phẩm: " + Productnumber);
        System.out.println("Tên sản phẩm: " + Productname);
        System.out.println("Giá tiền: " + Price + " " + unit);
        System.out.println("Số lượng: " + quantity);
        System.out.println("Đơn vị: " + unit);
        System.out.println("------------------------------");
    }


}
