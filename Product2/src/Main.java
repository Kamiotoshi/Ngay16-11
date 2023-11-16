// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Tạo 3 sản phẩm
        Product product1 = new Product("SP001", "Iphone", 1200.0, 10, "USD");
        Product product2 = new Product("SP002", "Samsung", 500.0, 20, "USD");
        Product product3 = new Product("SP003", "Laptop", 20.0, 50, "VND");

        // In thông tin sản phẩm
        product1.Show();
        product2.Show();
        product3.Show();

        // Thực hiện một số thay đổi và in lại thông tin
        product1.Increasequantity(5);
        product2.Lowerquantity(15);
        product3.Pricechanger(25.0);

        // In lại thông tin sau khi thay đổi
        product1.Show();
        product2.Show();
        product3.Show();

        // Kiểm tra tình trạng hàng
        product1.Checkquantity();
        product2.Checkquantity();
        product3.Checkquantity();
    }
}