package com.bytedance.android.livesdk.chatroom.ui.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import h.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentHashMap<String, b> f15847b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public static final a f15848c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<p<Integer, WeakReference<AbstractC0329b>>> f15849a = new ArrayList<>();

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.a.b$b  reason: collision with other inner class name */
    public interface AbstractC0329b {
        static {
            Covode.recordClassIndex(8741);
        }

        void l();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(8740);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static b a(String str) {
            MethodCollector.i(2929);
            l.d(str, "");
            if (!b.f15847b.containsKey(str)) {
                synchronized (b.class) {
                    try {
                        if (!b.f15847b.containsKey(str)) {
                            b.f15847b.put(str, new b());
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(2929);
                        throw th;
                    }
                }
            }
            b bVar = b.f15847b.get(str);
            if (bVar == null) {
                l.b();
            }
            b bVar2 = bVar;
            MethodCollector.o(2929);
            return bVar2;
        }
    }

    static {
        Covode.recordClassIndex(8739);
    }

    public final void a(AbstractC0329b bVar, int i2) {
        AbstractC0329b bVar2;
        if (bVar != null) {
            this.f15849a.add(new p<>(Integer.valueOf(i2), new WeakReference(bVar)));
        }
        int size = this.f15849a.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (this.f15849a.get(i3).getFirst().intValue() < i2 && (bVar2 = this.f15849a.get(i3).getSecond().get()) != null) {
                bVar2.l();
            }
        }
    }
}
