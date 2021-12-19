package com.bytedance.jedi.a.m;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.l.b;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f39320a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f39321b;

    /* renamed from: c  reason: collision with root package name */
    private static final List<Object> f39322c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private static final b f39323d = new a();

    public static final class a implements b {
        static {
            Covode.recordClassIndex(24123);
        }

        a() {
        }
    }

    private c() {
    }

    static {
        Covode.recordClassIndex(24122);
    }

    public static void a(com.bytedance.jedi.a.l.a<?> aVar, b<?> bVar) {
        l.c(aVar, "");
        l.c(bVar, "");
        if (f39321b && bVar.b() != null) {
            Iterator<T> it = f39322c.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
