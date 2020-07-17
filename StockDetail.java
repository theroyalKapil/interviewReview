package com.acme.mytrader.model;

public class StockDetail {

    private  String stockName;
    private  double singleStockPrice;
    private  int volume;

    public StockDetail() {
    }

    public StockDetail(String stockName, double singleStockPrice, int volume) {
        this.stockName = stockName;
        this.singleStockPrice = singleStockPrice;
        this.volume = volume;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public double getSingleStockPrice() {
        return singleStockPrice;
    }

    public void setSingleStockPrice(double singleStockPrice) {
        this.singleStockPrice = singleStockPrice;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
