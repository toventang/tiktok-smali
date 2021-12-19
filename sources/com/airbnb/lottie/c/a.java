package com.airbnb.lottie.c;

import android.graphics.Bitmap;
import com.airbnb.lottie.g;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<Integer, ArrayList<Bitmap>> f5309a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static final a f5310b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(2234);
    }

    public static void a(g gVar) {
        l.c(gVar, "");
        int hashCode = gVar.hashCode();
        ConcurrentHashMap<Integer, ArrayList<Bitmap>> concurrentHashMap = f5309a;
        if (concurrentHashMap.get(Integer.valueOf(hashCode)) != null) {
            concurrentHashMap.remove(Integer.valueOf(hashCode));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005b, code lost:
        if (r2.getHeight() != r6) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap a(com.airbnb.lottie.g r10, android.graphics.Bitmap.Config r11, android.util.DisplayMetrics r12) {
        /*
        // Method dump skipped, instructions count: 191
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.c.a.a(com.airbnb.lottie.g, android.graphics.Bitmap$Config, android.util.DisplayMetrics):android.graphics.Bitmap");
    }
}
