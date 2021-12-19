package com.bytedance.android.livesdk.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.WeakHashMap;

public final class ae {

    /* renamed from: a  reason: collision with root package name */
    public static final int f22225a = 2131234390;

    /* renamed from: b  reason: collision with root package name */
    public static final int f22226b = 2131234880;

    /* renamed from: c  reason: collision with root package name */
    private static WeakHashMap<Integer, Bitmap> f22227c = new WeakHashMap<>();

    static {
        Covode.recordClassIndex(13122);
    }

    public static Bitmap a(Context context, int i2, int i3, int i4) {
        MethodCollector.i(13078);
        Bitmap bitmap = f22227c.get(Integer.valueOf(i2));
        if (bitmap == null || bitmap.isRecycled()) {
            Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i2);
            if (decodeResource == null) {
                MethodCollector.o(13078);
                return null;
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeResource, i3, i4, false);
            if (createScaledBitmap == null) {
                MethodCollector.o(13078);
                return null;
            }
            f22227c.put(Integer.valueOf(i2), createScaledBitmap);
            MethodCollector.o(13078);
            return createScaledBitmap;
        }
        MethodCollector.o(13078);
        return bitmap;
    }
}
