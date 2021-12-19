package com.airbnb.lottie.d;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.airbnb.lottie.b;
import com.airbnb.lottie.e.h;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final h<String> f5319a = new h<>();

    /* renamed from: b  reason: collision with root package name */
    public final Map<h<String>, Typeface> f5320b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Typeface> f5321c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final AssetManager f5322d;

    /* renamed from: e  reason: collision with root package name */
    public b f5323e;

    /* renamed from: f  reason: collision with root package name */
    public String f5324f = ".ttf";

    static {
        Covode.recordClassIndex(2237);
    }

    public a(Drawable.Callback callback, b bVar) {
        this.f5323e = bVar;
        if (!(callback instanceof View)) {
            this.f5322d = null;
        } else {
            this.f5322d = ((View) callback).getContext().getAssets();
        }
    }
}
