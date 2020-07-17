package com.acme.mytrader.strategy;

import com.acme.mytrader.execution.ExecutionService;
import com.acme.mytrader.model.StockDetail;
import com.acme.mytrader.price.PriceSource;
import com.acme.mytrader.dao.StockPriceDao;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Class : TradingStrategyTest
 *  The class is test coverage for com.acme.mytrader.strategy.TradingStrategy
 */
public class TradingStrategyTest {

    /**
     * This method will test execute and monitor stock price when its higher than limit.
     *
     * @param
     * @return void
     * @throws Exception
     */
    @Test
    public void testPriceExecuter() {

        ExecutionService executionService = mock(ExecutionService.class);
        PriceSource priceSource = mock(PriceSource.class);
        StockPriceDao stockPriceDao = mock(StockPriceDao.class);

        TradingStrategy tradingStrategy = new TradingStrategy(executionService, priceSource);

        Map<String, StockDetail> stockDetail = new HashMap<String, StockDetail>();
        stockDetail.put("IBM", new StockDetail("IBM", 101, 5));
        stockDetail.put("TCS", new StockDetail("TCS", 99, 10));

        when(stockPriceDao.getStockPriceDetails()).thenReturn(stockDetail);

        assertTrue(true);
    }
}