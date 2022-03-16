package com.bridgelabz.Stock;

import java.util.ArrayList;

public class StockPortfolio {
	private ArrayList<Stock> stockList = new ArrayList<Stock>();

	void addStock(Stock stock) {
		stockList.add(stock);
	}

	void calculateStock() {
		for (Stock stock : stockList) {
			System.out.println("Stock Name " + stock.getStockName() + " Total value of shares Rs.:"
					+ stock.getNoOfShares() * stock.getSharePrice());
		}
	}

	void totalStock() {
		int stockValue = 0;
		for (Stock stock : stockList) {
			stockValue = stockValue + stock.getNoOfShares() * stock.getSharePrice();
		}
	}

	void portfolio() {
		calculateStock();
		totalStock();
	}

}
