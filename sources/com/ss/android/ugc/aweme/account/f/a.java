package com.ss.android.ugc.aweme.account.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static List<WeakReference<AbstractC1394a>> f63029a = new LinkedList();

    /* renamed from: b  reason: collision with root package name */
    private static com.ss.android.ugc.aweme.account.login.model.a f63030b;

    /* renamed from: c  reason: collision with root package name */
    private static List<b> f63031c = new CopyOnWriteArrayList();

    /* renamed from: com.ss.android.ugc.aweme.account.f.a$a  reason: collision with other inner class name */
    public interface AbstractC1394a {
        static {
            Covode.recordClassIndex(38826);
        }

        void a(com.ss.android.ugc.aweme.account.login.model.a aVar);
    }

    public interface b {
        static {
            Covode.recordClassIndex(38827);
        }

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(38825);
    }

    public static void a(b bVar) {
        f63031c.add(bVar);
    }

    public static void b(b bVar) {
        f63031c.remove(bVar);
    }

    public static void a(int i2) {
        for (b bVar : f63031c) {
            bVar.a(i2);
        }
    }

    public static void a(com.ss.android.ugc.aweme.account.login.model.a aVar) {
        MethodCollector.i(9396);
        synchronized (a.class) {
            try {
                f63030b = aVar;
                Iterator<WeakReference<AbstractC1394a>> it = f63029a.iterator();
                while (it.hasNext()) {
                    WeakReference<AbstractC1394a> next = it.next();
                    if (next.get() == null) {
                        it.remove();
                    } else {
                        next.get().a(aVar);
                    }
                }
            } finally {
                MethodCollector.o(9396);
            }
        }
    }
}
