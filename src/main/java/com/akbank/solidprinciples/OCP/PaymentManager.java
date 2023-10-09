package com.akbank.solidprinciples.OCP;

// yanlış kullanım örneği
public class PaymentManager {

  // OCP: kod blogunda bir değişim olmadan kod geliştirme açık olmalıdır.
  // her gelen paymentType isteğine göre kod blogunda bir modifikasyon yapıcaz.
  public void Pay(String paymentType) {

    if (paymentType.equals("Credit")) {
      System.out.println("Kredi kart ile ödeme");
    } else {
      System.out.println("Nakit Ödeme");
    }

  }

}
