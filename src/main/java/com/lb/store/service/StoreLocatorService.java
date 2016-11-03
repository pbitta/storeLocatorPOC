package com.lb.store.service;

import com.lb.cache.StoreLocatorAPI;
import com.lb.data.storeLocator.Store;

import java.util.Set;

public class StoreLocatorService {

    private StoreLocatorAPI storeLocatorAPI = new StoreLocatorAPI();

    public Store getStore(int storeId) {

        return storeLocatorAPI.getStore(storeId);
    }

    public Set<Store> getAllStores() {

        return storeLocatorAPI.getAllStores();
    }


}
