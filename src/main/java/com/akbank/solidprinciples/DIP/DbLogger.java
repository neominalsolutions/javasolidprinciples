package com.akbank.solidprinciples.DIP;

public class DbLogger implements Logger {

  @Override
  public void log() {
    System.out.println("Db Logger");
  }

}
