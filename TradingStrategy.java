package com.acme.mytrader.strategy;


import com.acme.mytrader.common.CommonConstants;
import com.acme.mytrader.execution.ExecutionService;
import com.acme.mytrader.model.StockDetail;
import com.acme.mytrader.price.PriceListener;
import com.acme.mytrader.price.PriceListenerImpl;
import com.acme.mytrader.price.PriceSource;
import com.acme.mytrader.dao.StockPriceDao;

import java.util.Map;

/**
 * <pre>
 *     User Story: As a trader I want to able to monitor stock prices such
 *     that when they breach a trigger level order can be executed automatically
 * </pre>
 * <p>
 * class : TradingStrategy - The class will be the entry point for monitoring stock and operation.
 */
public class TradingStrategy {

    ExecutionService executionService;
    PriceSource priceSource;

    public TradingStrategy(ExecutionService executionService, PriceSource priceSource) {
        this.executionService = executionService;
        this.priceSource = priceSource;
    }

    /**
     * This method will execute and monitor stock price.
     *
     * @param
     * @return void
     * @throws Exception
     */
    public void priceExecuter() throws Exception {
        StockPriceDao stockPriceDao = new StockPriceDao();

        //Storage of stock details
        Map<String, StockDetail> stockDetail = stockPriceDao.getStockPriceDetails();

        //connect to the  Price source
        PriceListener priceListener = new PriceListenerImpl();
        priceSource.addPriceListener(priceListener);

        //Monitor price movement for specified stock
        //retrieve details for monitor
        StockDetail stockDetailRetrivedForMonitoring = stockDetail.get(CommonConstants.IBM);

        //Execute single buy or sell
        if (stockDetailRetrivedForMonitoring.getStockName().equals(CommonConstants.IBM)
                && stockDetailRetrivedForMonitoring.getSingleStockPrice() > 100) {
            /*
             *  Stock limit is above so auto triggered happen for sold
             */
            executionService.sell(CommonConstants.user, 105, 5);

            //System.out.println("Stock limit is above so auto triggered happen for sold");
        } else {
            /*
             *  Stock limit is below so auto triggered happened for buy
             */
            executionService.buy(CommonConstants.user, 99, 5);
        }
    }
}
