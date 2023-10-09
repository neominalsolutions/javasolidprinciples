package com.akbank.solidprinciples;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.akbank.solidprinciples.DIP.DIPLoggerManager;
import com.akbank.solidprinciples.DIP.DbLogger;
import com.akbank.solidprinciples.DIP.LoggerManager;
import com.akbank.solidprinciples.DIP.TextLogger;
import com.akbank.solidprinciples.ISP.CryptoProvider;
import com.akbank.solidprinciples.ISP.PasswordHasher;
import com.akbank.solidprinciples.LSP.Square;
import com.akbank.solidprinciples.LSP.Triangel;
import com.akbank.solidprinciples.OCP.CreditPaymentService;
import com.akbank.solidprinciples.OCP.Payment;

// bu anatasyon ile spring framework ait özellikleri kullanabiliriz.
@SpringBootApplication
public class SolidprinciplesApplication {

	public static void main(String[] args) {

		System.out.println("proje");

		// Scanner Next();
		// OCP princisiple örneği
		Payment payment = new CreditPaymentService();
		payment.Pay(10);

		Square s = new Square();
		s.setWidth(15);
		s.setHeight(20);
		// s.GetArea();

		// Kalıtım verilen sınıfların imzasını atarken inherit sınıfların içinde hataya
		// müsait yada dummy kullanılmayan boş kod blogları bırakmamalıyız. (LSP)
		Triangel t = new Triangel();
		t.cornerOne = 15;
		t.cornerTwo = 25;
		t.cornerThree = 35;

		t.GetPerimeter();

		// ISP
		PasswordHasher cp = new PasswordHasher();
		String pass = cp.encrypt("ali");
		// String plainText = cp.decrypt(pass);

		// DIP (Dependecy Inversion)
		TextLogger tl = new TextLogger();
		LoggerManager lm = new LoggerManager();
		lm.LogText(tl); // method injection.
		// lm.LogDb(); // hata fırlatır null referance exception

		// DIP Best Practice Sample
		DIPLoggerManager dpm = new DIPLoggerManager(tl);
		dpm.singleLog(); // Text ile

		DIPLoggerManager dpm2 = new DIPLoggerManager(new DbLogger());
		dpm2.singleLog(); // Db ile logla

		// SpringApplication.run(SolidprinciplesApplication.class, args);
		// Terminal Ctrl+J
		// Cntrl + B solution kısmını kapat aç
		// Shift + Alt + F; kod düzeni
		// Alt + Shift + O kullanılmayan importları kaldırı
		// Ctrl+ K+ C comment satırı
		// Ctrl + K + U comment satırında çıkarma
	}

}
