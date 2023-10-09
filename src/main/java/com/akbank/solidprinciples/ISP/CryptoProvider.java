package com.akbank.solidprinciples.ISP;

// Bir interface birden fazla özelliği barındırmamalıdır. Interfaceler atomik özelliklere sahip olmalıdır.
// SRP nin interface versiyonu.
public interface CryptoProvider {
  String encrypt(String plainText); // şifreleme

  String decrypt(String cipherText); // şifre çözme
}
