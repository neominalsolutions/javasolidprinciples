package com.akbank.solidprinciples.DIP;

public class TextLogger implements Logger {

  @Override
  public void log() {
    System.out.println("Text Logger");
  }

}
