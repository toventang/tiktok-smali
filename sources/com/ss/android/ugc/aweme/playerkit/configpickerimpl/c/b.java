package com.ss.android.ugc.aweme.playerkit.configpickerimpl.c;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.google.gson.l;
import java.lang.reflect.Type;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final f f115515a = new f();

    static {
        Covode.recordClassIndex(74150);
    }

    public static <T> T a(l lVar, Type type) {
        try {
            return (T) f115515a.a(lVar, type);
        } catch (Exception unused) {
            a.a("JSON parse error! check your config: " + lVar.toString());
            return null;
        }
    }
}
