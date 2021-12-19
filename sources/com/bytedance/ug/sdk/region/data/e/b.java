package com.bytedance.ug.sdk.region.data.e;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ug.sdk.region.data.a.a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f45786a = a.a("");

    /* renamed from: b  reason: collision with root package name */
    public static a f45787b = null;

    static {
        Covode.recordClassIndex(27894);
    }

    public static a a(Context context) {
        String b2 = b(context);
        if (TextUtils.isEmpty(b2)) {
            return null;
        }
        return a.a(b2);
    }

    private static String b(Context context) {
        String b2 = com.bytedance.ug.sdk.region.data.h.b.b(context);
        if (!TextUtils.isEmpty(b2)) {
            return b2;
        }
        String a2 = com.bytedance.ug.sdk.region.data.h.b.a(context);
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        return com.bytedance.ug.sdk.region.data.h.b.a();
    }
}
