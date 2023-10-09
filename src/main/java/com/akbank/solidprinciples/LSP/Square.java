package com.akbank.solidprinciples.LSP;

public class Square extends Shape {

  @Override
  public double GetArea() {
    if (this.getWidth() != this.getHeight()) {
      // karenin sadece bir kenarı var bu durumda Square değişimiz sınıf shape
      // dediğimiz üst sınıfa ait değerleri kullanırken karmaşıklığa neden oluyor.
      // hatada olabilir.
      throw new Error("Kare olamaz");
    } else {
      return this.getWidth() * this.getWidth();
    }

  }

  @Override
  public double GetPerimeter() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'GetPerimeter'");
  }

}
