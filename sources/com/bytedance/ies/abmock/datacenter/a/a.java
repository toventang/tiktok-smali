package com.bytedance.ies.abmock.datacenter.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public interface a {
    static {
        Covode.recordClassIndex(18594);
    }

    boolean enable();

    Object get(String str);

    void init(Context context);
}
