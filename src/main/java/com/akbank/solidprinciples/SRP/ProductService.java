package com.akbank.solidprinciples.SRP;

// bir sınıfın  değişebilmesi için tek bir sebep olmalıdır
public class ProductService { // Üst seviye bir sınıf, kulllanıcıdan gelen isteklerin alt sevislere
                              // dağıltılması için wrapper class nitelği görmüş oluyor.

  // Facade Design Pattern

  private ProductRepository productRepo = new ProductRepository(); // Alt seviye sınıflar
  private LogService logService = new LogService();

  public ProductService() {
    super();
    // bu kod blogunda productRepository ve LogService Product service sıkı sıkıya
    // bağımlı halde
    // instance yönetimi ProductService içinde kalmış durumda SRP uygun DIP ters bir
    // yaklaşım.
    this.productRepo = new ProductRepository();
    this.logService = new LogService();
  }

  void SaveProduct() {
    // DAL katmana erişmemiz lazım
    // Log işlemleri için kod yazmamız gerekir.
    // Validation işlmeleri gibi
    // veritabını sorgularını buraya yazmıyoruz.
    // bu sorguları repos üzerinden yönetiyoruz
    productRepo.Save();
    // log işlemlerine ait kodları burada çağırmıyoruz. servis üzerinden
    // hallediyoruz.
    logService.Log();
  }

}
