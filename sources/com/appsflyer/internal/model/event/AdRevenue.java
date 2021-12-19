package com.appsflyer.internal.model.event;

import com.appsflyer.AFEvent;
import com.bytedance.covode.number.Covode;

public class AdRevenue extends AFEvent {
    static {
        Covode.recordClassIndex(2739);
    }

    public AdRevenue() {
        super(null, Boolean.FALSE, null);
    }

    @Override // com.appsflyer.AFEvent
    public AFEvent urlString(String str) {
        return super.urlString(addChannel(str));
    }
}
