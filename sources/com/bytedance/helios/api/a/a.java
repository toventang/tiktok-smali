package com.bytedance.helios.api.a;

import com.bytedance.covode.number.Covode;
import h.a.i;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f30639a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f30640b = {"onActivityCreate", "onActivityStart", "onActivityResume", "onActivityPause", "onActivityStop", "onActivityDestroy", "appBackground", "appForeground", "onWindowViewAdd", "onWindowViewRemove"};

    private a() {
    }

    static {
        Covode.recordClassIndex(17798);
    }

    public static int a(String str) {
        l.c(str, "");
        return i.b(f30640b, str);
    }

    public static String a(int i2) {
        String[] strArr = f30640b;
        if (i2 < strArr.length) {
            return strArr[i2];
        }
        return "unknownStage";
    }
}
