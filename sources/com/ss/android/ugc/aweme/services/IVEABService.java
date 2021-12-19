package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.property.db;
import h.p;
import java.util.Map;

public interface IVEABService {
    static {
        Covode.recordClassIndex(79483);
    }

    void clearPanel();

    p<Object, Integer> getABValue(db.a aVar);

    Map<String, db.a> getVESDKABPropertyMap();

    void setABPanelValue(db.a aVar, String str);
}
