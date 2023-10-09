package com.akbank.solidprinciples.DIP;

public class LoggerManager {

  private TextLogger textLogger;
  private DbLogger dbLogger;

  // Bir sınıfın bağımlı olduğu başka bir sınıfa bağlanmanın 3 farklı yöntemi var.
  // Bu işleme Dependency Injection diyoruz
  // Contructor Injection
  // Setter Injection
  // Method Injection
  public LoggerManager() {
    super();
    // DIP aykırı bir geliştirme yaptık
    // this.textLogger = new TextLogger();
    // this.dbLogger = new DbLogger();
  }

  public LoggerManager(DbLogger dbLogger) { // 2. contructor injection
    this.dbLogger = dbLogger;
  }

  // setter Injection yöntemi
  public void setTextLogger(TextLogger textLogger) {
    this.textLogger = textLogger;
  }

  public void LogText(TextLogger logger) { // Method injection
    this.textLogger = logger;
    this.textLogger.log();
  }

  public void LogDb() { // Method injection
    this.dbLogger.log();
  }
}
