package com.advanced.tradebot.model;

import javax.persistence.*;

@Entity
@Table(name = "market_currency_pair_history")
public class MarketCurrencyPairHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "market_currency_pair_id")
    private MarketCurrencyPair marketCurrencyPair;

    @Column
    private String tradeData;

    public Long getId() {
        return id;
    }

    public MarketCurrencyPair getMarketCurrencyPair() {
        return marketCurrencyPair;
    }

    public void setMarketCurrencyPair(MarketCurrencyPair marketCurrencyPair) {
        this.marketCurrencyPair = marketCurrencyPair;
    }

    public String getTradeData() {
        return tradeData;
    }

    public void setTradeData(String tradeData) {
        this.tradeData = tradeData;
    }
}
