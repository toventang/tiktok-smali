package com.bytedance.lottie.b;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.b;
import com.bytedance.lottie.c.h;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final h<String> f40455a = new h<>();

    /* renamed from: b  reason: collision with root package name */
    public final Map<h<String>, Typeface> f40456b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public b f40457c;

    /* renamed from: d  reason: collision with root package name */
    public String f40458d = ".ttf";

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, Typeface> f40459e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private final AssetManager f40460f;

    static {
        Covode.recordClassIndex(24869);
    }

    public final Typeface a(String str) {
        Typeface typeface = this.f40459e.get(str);
        if (typeface != null) {
            return typeface;
        }
        b bVar = this.f40457c;
        Typeface typeface2 = null;
        try {
            typeface2 = Typeface.createFromAsset(this.f40460f, "fonts/" + str + this.f40458d);
        } catch (RuntimeException e2) {
            e2.printStackTrace();
        }
        this.f40459e.put(str, typeface2);
        return typeface2;
    }

    public a(Drawable.Callback callback, b bVar) {
        this.f40457c = bVar;
        if (!(callback instanceof View)) {
            this.f40460f = null;
        } else {
            this.f40460f = ((View) callback).getContext().getAssets();
        }
    }
}
