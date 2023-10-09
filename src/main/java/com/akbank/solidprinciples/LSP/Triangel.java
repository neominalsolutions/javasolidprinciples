package com.akbank.solidprinciples.LSP;

public class Triangel extends ShapeBase {

  public int cornerOne;
  public int cornerTwo;
  public int cornerThree;

  @Override
  public double GetArea() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'GetArea'");
  }

  @Override
  public double GetPerimeter() {
    return this.cornerOne + this.cornerTwo + this.cornerThree;
  }

}
