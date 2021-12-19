package com.bytedance.android.a.a.h;

import android.text.TextUtils;
import com.bytedance.android.a.a.e;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static volatile String f6676a;

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicBoolean f6677b = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(3212);
    }

    public static void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            a.a("ua updated: ".concat(String.valueOf(str)));
            f6676a = str;
            e.d().f6648f.a("WEB_UA_KEY", f6676a);
        }
    }
}
