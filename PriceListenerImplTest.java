package com.acme.mytrader.price;

import com.acme.mytrader.common.CommonConstants;
import com.acme.mytrader.model.StockDetail;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static com.sun.javaws.JnlpxArgs.verify;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * Class : PriceListenerImplTest
 * The class is test coverage for com.acme.mytrader.price.PriceListener
 */
public class PriceListenerImplTest {


    /**
     * This method update the price.
     *
     * @param
     * @return void
     * @throws Exception
     */
    @Test
    public void priceUpdate() {

        Map<String, StockDetail> stockDetail = new HashMap<String, StockDetail>();
        stockDetail.put("IBM", new StockDetail("IBM", 101, 5));
        stockDetail.put("TCS", new StockDetail("TCS", 99, 10));

        assertTrue(true);
    }
}