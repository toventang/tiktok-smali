package com.bytedance.geckox;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.Map;

public class a {

    /* renamed from: h  reason: collision with root package name */
    private static volatile a f29702h;

    /* renamed from: a  reason: collision with root package name */
    public boolean f29703a;

    /* renamed from: b  reason: collision with root package name */
    public int f29704b = 7;

    /* renamed from: c  reason: collision with root package name */
    public int f29705c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, ArrayList<String>> f29706d;

    /* renamed from: e  reason: collision with root package name */
    public int f29707e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f29708f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f29709g;

    static {
        Covode.recordClassIndex(17253);
    }

    private a() {
    }

    public static a a() {
        MethodCollector.i(9544);
        if (f29702h == null) {
            synchronized (a.class) {
                try {
                    if (f29702h == null) {
                        f29702h = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9544);
                    throw th;
                }
            }
        }
        a aVar = f29702h;
        MethodCollector.o(9544);
        return aVar;
    }
}
