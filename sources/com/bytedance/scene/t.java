package com.bytedance.scene;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final a f43033a = new a() {
        /* class com.bytedance.scene.t.AnonymousClass1 */

        static {
            Covode.recordClassIndex(26375);
        }

        @Override // com.bytedance.scene.t.a
        public final t a() {
            return new t(t.a());
        }
    };

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicInteger f43034f = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    final String f43035b;

    /* renamed from: c  reason: collision with root package name */
    final Map<String, t> f43036c;

    /* renamed from: d  reason: collision with root package name */
    final Map<Object, Object> f43037d;

    /* renamed from: e  reason: collision with root package name */
    private final t f43038e;

    public interface a {
        static {
            Covode.recordClassIndex(26376);
        }

        t a();
    }

    public interface b {
        static {
            Covode.recordClassIndex(26377);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(26374);
    }

    public static String a() {
        return "Scene #" + f43034f.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        t tVar = this.f43038e;
        if (tVar != null) {
            tVar.f43036c.remove(this.f43035b);
        }
        for (Object obj : this.f43037d.values()) {
            if (obj instanceof b) {
                ((b) obj).a();
            }
        }
        this.f43037d.clear();
        this.f43036c.clear();
    }

    /* synthetic */ t(String str) {
        this(null, str);
    }

    public final <T> T a(Object obj) {
        t tVar = this;
        do {
            T t = (T) tVar.f43037d.get(obj);
            if (t != null) {
                return t;
            }
            tVar = tVar.f43038e;
        } while (tVar != null);
        return null;
    }

    public final void a(Object obj, Object obj2) {
        this.f43037d.put(obj, obj2);
    }

    t(t tVar, String str) {
        this.f43036c = new HashMap();
        this.f43037d = new HashMap();
        this.f43038e = tVar;
        this.f43035b = str;
    }
}
