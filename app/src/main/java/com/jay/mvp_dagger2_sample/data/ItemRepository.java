package com.jay.mvp_dagger2_sample.data;

import com.jay.mvp_dagger2_sample.data.interfaces.IItemDataSource;

import javax.inject.Inject;

import io.realm.Realm;

public class ItemRepository implements IItemDataSource {

    private Realm realm;

    @Inject
    public ItemRepository(Realm realm){
        this.realm = realm;
    }
}
