package com.ss.android.ugc.aweme.aq.b;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static LruCache<String, Drawable> f66975a = new LruCache<>(20);

    /* renamed from: b  reason: collision with root package name */
    private static LruCache<String, Bitmap> f66976b = new LruCache<>(20);

    static {
        Covode.recordClassIndex(41279);
    }
}
