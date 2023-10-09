package com.akbank.solidprinciples.ISP;

// public class PasswordHasher implements CryptoProvider yanlış kullanım
public class PasswordHasher implements Encrpt {

  // HASH algoritmalarında şifreleme uygulanır fakat şifre geriye çözülemez.

  @Override
  public String encrypt(String plainText) {
    return "sfddsfdsf09.435435.dsadsa";
  }

  // @Override
  // public String decrypt(String cipherText) {
  // // TODO Auto-generated method stub
  // throw new UnsupportedOperationException("Hashlenmiş parola çözülemez");
  // }

}
