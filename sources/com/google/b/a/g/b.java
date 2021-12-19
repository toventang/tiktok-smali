package com.google.b.a.g;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Field, a> f53613a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, a> f53614b = new a();

    /* renamed from: c  reason: collision with root package name */
    private final Object f53615c;

    static {
        Covode.recordClassIndex(33175);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Class<?> f53616a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<Object> f53617b = new ArrayList<>();

        static {
            Covode.recordClassIndex(33176);
        }

        /* access modifiers changed from: package-private */
        public final Object a() {
            return n.a((Collection<?>) this.f53617b, this.f53616a);
        }

        public a(Class<?> cls) {
            this.f53616a = cls;
        }
    }

    public final void a() {
        for (Map.Entry<String, a> entry : this.f53614b.entrySet()) {
            ((Map) this.f53615c).put(entry.getKey(), entry.getValue().a());
        }
        for (Map.Entry<Field, a> entry2 : this.f53613a.entrySet()) {
            i.a(entry2.getKey(), this.f53615c, entry2.getValue().a());
        }
    }

    public b(Object obj) {
        this.f53615c = obj;
    }
}
