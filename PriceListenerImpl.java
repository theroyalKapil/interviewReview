package com.acme.mytrader.price;

import com.acme.mytrader.common.CommonConstants;
import com.acme.mytrader.model.StockDetail;

import java.util.HashMap;
import java.util.Map;


/**
 * Class : PriceListenerImpl
 * <p>
 * This class is responsible for updating single stock price for given stock
 */
public class PriceListenerImpl implements PriceListener {

    Map<String, StockDetail> stockDetail = new HashMap<String, StockDetail>();

    /**
     * This method will update stock price based on price given.
     *
     * @param security
     * @param price
     * @return void
     * @throws Exception
     */
    public void priceUpdate(String security, double price) {

        stockDetail.put(CommonConstants.IBM, new StockDetail(CommonConstants.IBM, 100, 5));
        stockDetail.put(CommonConstants.TCS, new StockDetail(CommonConstants.TCS, 99, 10));

        StockDetail stockDetailforUpdate = stockDetail.get(CommonConstants.IBM);
        stockDetailforUpdate.setSingleStockPrice(price);
    }
}
