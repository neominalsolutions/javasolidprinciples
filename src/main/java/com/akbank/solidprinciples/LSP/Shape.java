package com.akbank.solidprinciples.LSP;

// Liskov prensibi bir sınıftan kalıtım alınan sınıfların super sınıf özellikleri göstermesini bekler.
public abstract class Shape {

  public double Width; // genişlik
  public double Height; // yükseklik

  public abstract double GetArea(); // alanı getir

  public abstract double GetPerimeter(); // çevre getir.

  public double getHeight() {
    return Height;
  }

  public void setHeight(double height) {
    Height = height;
  }

  public double getWidth() {
    return Width;
  }

  public void setWidth(double width) {
    Width = width;
  }

}
