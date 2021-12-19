package com.bytedance.ies.bullet.service.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final d f32498b = new d();

    /* renamed from: c  reason: collision with root package name */
    public static final h.f.a.a<String> f32499c = b.f32502a;

    /* renamed from: d  reason: collision with root package name */
    public static final a f32500d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, SoftReference<b>> f32501a = new LinkedHashMap();

    public static final class a {
        static {
            Covode.recordClassIndex(19270);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f32502a = new b();

        static {
            Covode.recordClassIndex(19271);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String uuid = UUID.randomUUID().toString();
            l.a((Object) uuid, "");
            return uuid;
        }
    }

    static {
        Covode.recordClassIndex(19269);
    }
}
