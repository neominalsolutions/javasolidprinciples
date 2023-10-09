package com.akbank.solidprinciples.OCP;

public class VirtualWalletPaymentService implements Payment {

  @Override
  public void Pay(double amount) {
    System.out.println("Sanal cüzdan ödemesi");
  }

}
