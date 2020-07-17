package com.acme.mytrader.dao;

import com.acme.mytrader.model.StockDetail;

import java.util.HashMap;
import java.util.Map;

public class StockPriceDao {
    Map<String, StockDetail> stockDetail = new HashMap<String, StockDetail>();

    /**
     * This method will return avialable list of stock details.
     *
     * @param
     * @return Map<String, StockDetail>
     * @exception Exception
     */
    public Map<String, StockDetail> getStockPriceDetails(){
        //Storage of stock details
        stockDetail.put("IBM",new StockDetail("IBM",100,5));
        stockDetail.put("TCS",new StockDetail("TCS",99,10));
        return stockDetail;
    }
}
