package com.appsflyer.internal.model.event;

import android.content.Context;
import com.appsflyer.AFEvent;
import com.bytedance.covode.number.Covode;

public class Validate extends Purchase {
    static {
        Covode.recordClassIndex(2751);
    }

    public Validate(Context context) {
        super("af_purchase", Boolean.TRUE, context);
    }

    @Override // com.appsflyer.AFEvent
    public AFEvent urlString(String str) {
        return super.urlString(addChannel(str));
    }
}
