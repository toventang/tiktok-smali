package com.bytedance.ies.dmt.ui.widget.util;

import android.content.Context;
import android.graphics.Typeface;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    static volatile a f33779a;

    /* renamed from: b  reason: collision with root package name */
    static volatile Map<String, Integer> f33780b;

    /* renamed from: f  reason: collision with root package name */
    private static volatile SparseArray<String> f33781f;

    /* renamed from: c  reason: collision with root package name */
    SparseArray<Typeface> f33782c = new SparseArray<>();

    /* renamed from: d  reason: collision with root package name */
    Map<String, String> f33783d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    Context f33784e;

    private a() {
    }

    public static a a() {
        MethodCollector.i(10729);
        if (f33779a == null) {
            synchronized (a.class) {
                try {
                    if (f33779a == null) {
                        f33779a = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10729);
                    throw th;
                }
            }
        }
        a aVar = f33779a;
        MethodCollector.o(10729);
        return aVar;
    }

    static {
        Covode.recordClassIndex(20061);
        SparseArray<String> sparseArray = new SparseArray<>();
        f33781f = sparseArray;
        sparseArray.put(1, d.f33795a);
        f33781f.put(2, d.f33796b);
        f33781f.put(3, d.f33797c);
        f33781f.put(4, d.f33798d);
        f33781f.put(5, d.f33799e);
        f33781f.put(6, d.f33800f);
        f33781f.put(7, d.f33801g);
        f33781f.put(8, d.f33802h);
        HashMap hashMap = new HashMap();
        f33780b = hashMap;
        hashMap.put(d.f33795a, 1);
        f33780b.put(d.f33796b, 2);
        f33780b.put(d.f33797c, 3);
        f33780b.put(d.f33798d, 4);
        f33780b.put(d.f33799e, 5);
        f33780b.put(d.f33800f, 6);
        f33780b.put(d.f33801g, 7);
        f33780b.put(d.f33802h, 8);
    }

    public final Typeface a(int i2) {
        Typeface typeface = this.f33782c.get(i2, null);
        if (typeface != null) {
            return typeface;
        }
        Typeface b2 = b(i2);
        this.f33782c.put(i2, b2);
        return b2;
    }

    private Typeface b(int i2) {
        String str = this.f33783d.get(f33781f.get(i2));
        Context context = this.f33784e;
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), str);
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
        return null;
    }

    public final Typeface a(String str) {
        if (this.f33783d.containsKey(str)) {
            return a(f33780b.get(str).intValue());
        }
        return null;
    }
}
