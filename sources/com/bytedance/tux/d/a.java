package com.bytedance.tux.d;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static Context f44788a;

    /* renamed from: b  reason: collision with root package name */
    static Map<String, Typeface> f44789b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final a f44790c = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(27351);
    }

    public static Typeface a(String str) {
        l.c(str, "");
        Typeface typeface = f44789b.get(str);
        if (typeface != null) {
            return typeface;
        }
        Typeface b2 = b(str);
        f44789b.put(str, b2);
        return b2;
    }

    static Typeface b(String str) {
        AssetManager assets;
        Context context = f44788a;
        Typeface typeface = null;
        if (context == null || (assets = context.getAssets()) == null) {
            return null;
        }
        try {
            typeface = Typeface.createFromAsset(assets, str);
            return typeface;
        } catch (Exception e2) {
            e2.getMessage();
            return typeface;
        }
    }
}
