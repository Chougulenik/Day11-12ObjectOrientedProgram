package com.bridgelabz.Stock;

import java.util.Scanner;

public class Stock {
	private String stockName;
	private int noOfShares;
	private int sharePrice;
	private static int noOfStock;
	
	public static int getNoOfStock() {
		return noOfStock;
	}

	public static void setNoOfStock(int noOfStocks) {
		noOfStock = noOfStocks;
	}
	
	void input() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Stock Name");
		stockName = input.nextLine();
		System.out.println("Enter the no of shares");
		noOfShares = input.nextInt();
		System.out.println("Enter the Shares price");
		sharePrice = input.nextInt();
	}

	public String getStockName() {
		return stockName;
	}

	public int getNoOfShares() {
		return noOfShares;
	}

	public int getSharePrice() {
		return sharePrice;
	}

	public static void main(String[] args) {
		
		StockPortfolio stockPortfolio = new StockPortfolio();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of stock ");
		setNoOfStock(input.nextInt());
		for(int i=0; i<getNoOfStock(); i++) {
			Stock stock = new Stock();
			stock.input();
			stockPortfolio.addStock(stock);
		}
		stockPortfolio.portfolio();

	}

}
