package com.ss.android.ugc.aweme.utils;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class db {

    /* renamed from: a  reason: collision with root package name */
    public LruCache<String, Bitmap> f142808a;

    /* renamed from: b  reason: collision with root package name */
    public List<String> f142809b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f142810c;

    /* renamed from: d  reason: collision with root package name */
    public final int f142811d;

    static {
        Covode.recordClassIndex(93422);
    }

    private /* synthetic */ db() {
        this(1000);
    }

    public db(int i2) {
        this.f142811d = i2;
        this.f142808a = new LruCache<>(i2);
        this.f142809b = new ArrayList();
        this.f142810c = true;
    }

    public final Bitmap a(String str) {
        l.d(str, "");
        if (this.f142810c) {
            return this.f142808a.get(str);
        }
        return null;
    }

    public static String a(String str, int i2) {
        l.d(str, "");
        return str + '#' + i2;
    }
}
