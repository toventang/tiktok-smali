package com.appsflyer.internal.model.event;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public abstract class Purchase extends BackgroundEvent {
    static {
        Covode.recordClassIndex(2747);
    }

    Purchase() {
        this(null, null, null);
    }

    Purchase(String str, Boolean bool, Context context) {
        super(str, Boolean.FALSE, null, bool, context);
    }
}
