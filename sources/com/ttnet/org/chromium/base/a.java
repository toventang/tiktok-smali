package com.ttnet.org.chromium.base;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public class a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f155217a = true;

    private a() {
    }

    static {
        Covode.recordClassIndex(103286);
    }

    public static int a(Context context, String str, int i2, int i3) {
        try {
            return context.checkPermission(str, i2, i3);
        } catch (RuntimeException unused) {
            return -1;
        }
    }
}
