package com.akbank.solidprinciples.OCP;

public class CreditPaymentService implements Payment {

  @Override
  public void Pay(double amount) {
    System.out.println("Kredi kartı ile ödeme");
  }

}
