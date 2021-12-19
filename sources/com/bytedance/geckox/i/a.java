package com.bytedance.geckox.i;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f29907a;

    /* renamed from: b  reason: collision with root package name */
    public static final List<b> f29908b = new CopyOnWriteArrayList();

    static {
        Covode.recordClassIndex(17341);
    }

    public static void a() {
        if (f29907a) {
            List<b> list = f29908b;
            if (list.size() != 0) {
                Iterator<b> it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    public static void b() {
        if (f29907a) {
            List<b> list = f29908b;
            if (list.size() != 0) {
                Iterator<b> it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    public static void c() {
        if (f29907a) {
            List<b> list = f29908b;
            if (list.size() != 0) {
                Iterator<b> it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    public static void a(Object... objArr) {
        if (f29907a) {
            List<b> list = f29908b;
            if (list.size() != 0) {
                for (b bVar : list) {
                    bVar.a(objArr);
                }
            }
        }
    }
}
