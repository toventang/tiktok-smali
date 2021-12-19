package com.bytedance.apm.j;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.CopyOnWriteArraySet;

public class a {

    /* renamed from: b  reason: collision with root package name */
    private static volatile a f25050b;

    /* renamed from: a  reason: collision with root package name */
    public CopyOnWriteArraySet<com.bytedance.apm.g.a> f25051a = new CopyOnWriteArraySet<>();

    static {
        Covode.recordClassIndex(14630);
    }

    private a() {
    }

    public static a a() {
        if (f25050b == null) {
            synchronized (a.class) {
                if (f25050b == null) {
                    f25050b = new a();
                }
            }
        }
        return f25050b;
    }
}
