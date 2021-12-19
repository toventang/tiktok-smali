package com.ss.ttvideoengine.s;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static int f153286a = 1;

    static {
        Covode.recordClassIndex(101788);
    }

    public static String a(String str) {
        if (f153286a != 1 || TextUtils.isEmpty(str) || !str.startsWith("http://")) {
            return str;
        }
        j.a("TTVideoEngineUtils", "fetch api need replace https");
        return str.replaceFirst("http://", "https://");
    }
}
