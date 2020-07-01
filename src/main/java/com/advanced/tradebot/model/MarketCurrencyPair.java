package com.advanced.tradebot.model;

import com.advanced.tradebot.model.enumeration.Market;

import javax.persistence.*;

@Entity
@Table(name = "market_currency_pairs")
public class MarketCurrencyPair {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    @Enumerated(EnumType.STRING)
    private Market market;
    @Column
    private String currencyPair;

    public Long getId() {
        return id;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public String getCurrencyPair() {
        return currencyPair;
    }

    public void setCurrencyPair(String currencyPair) {
        this.currencyPair = currencyPair;
    }
}
