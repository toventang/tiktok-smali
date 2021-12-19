package com.bytedance.ies.bullet.service.base.d.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.ab;
import h.a.n;
import h.h;
import h.i;
import h.m;
import java.util.ArrayList;
import java.util.List;

public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final h f32594b = i.a(m.SYNCHRONIZED, b.f32598a);

    /* renamed from: c  reason: collision with root package name */
    public static final a f32595c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final List<ab> f32596a = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final List<ab> f32597d = new ArrayList();

    public static final class a {
        static {
            Covode.recordClassIndex(19348);
        }

        public static c a() {
            return (c) c.f32594b.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<c> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f32598a = new b();

        static {
            Covode.recordClassIndex(19349);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return new c();
        }
    }

    public final List<ab> a() {
        return n.h((Iterable) this.f32596a);
    }

    static {
        Covode.recordClassIndex(19347);
    }
}
