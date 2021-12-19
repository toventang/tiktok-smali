package com.bytedance.ies.bullet.kit.lynx.a;

import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.h;
import h.i;

public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final h f32306b = i.a((h.f.a.a) b.f32310a);

    /* renamed from: c  reason: collision with root package name */
    public static final a f32307c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f32308a;

    /* renamed from: d  reason: collision with root package name */
    private b<Object, Object> f32309d;

    public static final class a {
        static {
            Covode.recordClassIndex(18942);
        }

        public static c a() {
            return (c) c.f32306b.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private c() {
    }

    static final class b extends m implements h.f.a.a<c> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f32310a = new b();

        static {
            Covode.recordClassIndex(18943);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return new c((byte) 0);
        }
    }

    static {
        Covode.recordClassIndex(18941);
    }

    public /* synthetic */ c(byte b2) {
        this();
    }

    public final void a(int i2) {
        this.f32309d = new b<>(i2);
        this.f32308a = true;
    }
}
