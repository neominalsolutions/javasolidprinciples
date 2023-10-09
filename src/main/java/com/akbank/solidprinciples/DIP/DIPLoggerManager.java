package com.akbank.solidprinciples.DIP;

import java.util.Set;

// üst seviye DIPLoggerManager sınıfı ile alt seviye TextLogger ve DbLogger sınıfları birbirine Logger Interface ile bağlı oluyor. Bu sayede Logger interface implemente olan herhangi bir sınıf DIpLoggerManager ile çalışma fırsatı buluyor. Biz bu prensibe DIP adını veriyoruz. Contructor Setter Method üzerinden bağımlıklarını üst seviye sınıfa geçmesine olayına ise Depedency Injection Design Pattern ismi veriyoruz.
public class DIPLoggerManager {

  private Logger logger;
  private Set<Logger> loggers;

  // Dependecy Injection ile birlikte Dependency Inversion prensibi uygularsak
  // sınıflar birbileri ile zayıf bağlı bir hale gelir.
  public DIPLoggerManager(Logger logger) {
    super();
    this.logger = logger;
  }

  public DIPLoggerManager(Set<Logger> loggers) {
    super();
    this.loggers = loggers;
  }

  public void singleLog() {
    this.logger.log();
  }

  public void multiLog() {
    this.loggers.forEach(item -> {
      item.log();
    });
  }

}
