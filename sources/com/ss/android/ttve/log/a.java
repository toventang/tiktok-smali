package com.ss.android.ttve.log;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.am;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static am f61101a;

    static {
        Covode.recordClassIndex(37625);
    }

    public static void a(int i2, String str) {
        am amVar = f61101a;
        if (amVar != null) {
            amVar.a(i2, "[VESDK]".concat(String.valueOf(str)));
        }
    }
}
