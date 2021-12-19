package com.bytedance.android.live.liveinteract.platform.common.view;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.m;
import java.util.HashMap;
import java.util.Map;

public final class b<V extends View> {

    /* renamed from: a  reason: collision with root package name */
    DataChannel f12069a;

    /* renamed from: b  reason: collision with root package name */
    public V f12070b;

    /* renamed from: c  reason: collision with root package name */
    Map<Class<? extends m>, AbstractC0253b> f12071c;

    /* renamed from: com.bytedance.android.live.liveinteract.platform.common.view.b$b  reason: collision with other inner class name */
    public interface AbstractC0253b<V extends View, T> {
        static {
            Covode.recordClassIndex(6576);
        }

        void a(V v, T t);
    }

    public interface c<V extends View> {
        static {
            Covode.recordClassIndex(6577);
        }

        void a(V v);
    }

    static {
        Covode.recordClassIndex(6573);
    }

    public static final class a<V extends View> {

        /* renamed from: a  reason: collision with root package name */
        public a<V> f12072a;

        /* renamed from: b  reason: collision with root package name */
        public c<V> f12073b;

        /* renamed from: c  reason: collision with root package name */
        public C0252a f12074c;

        /* renamed from: d  reason: collision with root package name */
        private a f12075d;

        /* renamed from: e  reason: collision with root package name */
        private DataChannel f12076e;

        /* renamed from: f  reason: collision with root package name */
        private V f12077f;

        static {
            Covode.recordClassIndex(6574);
        }

        private a<V> b() {
            a<V> aVar = new a<>(this.f12076e, this.f12077f, this.f12075d);
            aVar.f12072a = this;
            aVar.f12073b = this.f12073b;
            return aVar;
        }

        public final b<V> a() {
            b<V> bVar = new b<>(this.f12076e, this.f12077f, this.f12072a, (byte) 0);
            this.f12075d.a(bVar);
            return bVar;
        }

        public final <T> a<V> a(Class<? extends m> cls, AbstractC0253b<V, T> bVar) {
            this.f12074c = new C0252a(cls, bVar, false, (byte) 0);
            return b();
        }

        public final <T> a<V> b(Class<? extends m> cls, AbstractC0253b<V, T> bVar) {
            this.f12074c = new C0252a(cls, bVar, true, (byte) 0);
            return b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.android.live.liveinteract.platform.common.view.b$a$a  reason: collision with other inner class name */
        public static final class C0252a<V extends View, T> {

            /* renamed from: a  reason: collision with root package name */
            public Class<? extends m> f12078a;

            /* renamed from: b  reason: collision with root package name */
            public AbstractC0253b<V, T> f12079b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f12080c;

            /* renamed from: d  reason: collision with root package name */
            private boolean f12081d;

            static {
                Covode.recordClassIndex(6575);
            }

            private C0252a(Class<? extends m> cls, AbstractC0253b<V, T> bVar, boolean z) {
                this.f12078a = cls;
                this.f12079b = bVar;
                this.f12080c = z;
                this.f12081d = false;
            }

            /* synthetic */ C0252a(Class cls, AbstractC0253b bVar, boolean z, byte b2) {
                this(cls, bVar, z);
            }
        }

        a(DataChannel dataChannel, V v, a aVar) {
            this.f12076e = dataChannel;
            this.f12077f = v;
            this.f12075d = aVar;
        }
    }

    public final void a(Class<? extends m> cls, Object obj) {
        if (cls != null && obj != null && this.f12071c.keySet().contains(cls)) {
            this.f12071c.get(cls).a(this.f12070b, obj);
        }
    }

    private b(DataChannel dataChannel, V v, a<V> aVar) {
        this.f12071c = new HashMap();
        this.f12069a = dataChannel;
        this.f12070b = v;
        if (aVar.f12073b != null) {
            aVar.f12073b.a(this.f12070b);
        }
        do {
            a.C0252a aVar2 = aVar.f12074c;
            this.f12071c.put(aVar2.f12078a, aVar2.f12079b);
            if (aVar2.f12080c) {
                this.f12069a.a(this, aVar2.f12078a, new c(this, aVar2));
            } else {
                this.f12069a.a((Class) aVar2.f12078a, (h.f.a.b) new d(this, aVar2));
            }
            aVar = aVar.f12072a;
        } while (aVar != null);
    }

    /* synthetic */ b(DataChannel dataChannel, View view, a aVar, byte b2) {
        this(dataChannel, view, aVar);
    }
}
