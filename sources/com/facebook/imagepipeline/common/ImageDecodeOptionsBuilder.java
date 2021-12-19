package com.facebook.imagepipeline.common;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.a.b.b;
import com.facebook.imagepipeline.g.c;
import com.facebook.imagepipeline.r.a;

public class ImageDecodeOptionsBuilder {

    /* renamed from: a  reason: collision with root package name */
    public int f47720a = 100;

    /* renamed from: b  reason: collision with root package name */
    public boolean f47721b;

    /* renamed from: c  reason: collision with root package name */
    public int f47722c = b.f47658b;

    /* renamed from: d  reason: collision with root package name */
    public boolean f47723d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f47724e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f47725f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f47726g;

    /* renamed from: h  reason: collision with root package name */
    public Bitmap.Config f47727h = Bitmap.Config.ARGB_8888;

    /* renamed from: i  reason: collision with root package name */
    public c f47728i;

    /* renamed from: j  reason: collision with root package name */
    public a f47729j;

    /* renamed from: k  reason: collision with root package name */
    public Object f47730k;

    static {
        Covode.recordClassIndex(28922);
    }

    public final b a() {
        return new b(this);
    }

    public ImageDecodeOptionsBuilder a(int i2) {
        this.f47722c = i2;
        return this;
    }

    public ImageDecodeOptionsBuilder setBitmapConfig(Bitmap.Config config) {
        this.f47727h = config;
        return this;
    }
}
