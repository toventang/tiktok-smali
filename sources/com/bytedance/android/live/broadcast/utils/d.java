package com.bytedance.android.live.broadcast.utils;

import com.bytedance.android.live.broadcast.api.BroadcastRoomApi;
import com.bytedance.android.live.broadcast.api.BroadcastUserApi;
import com.bytedance.android.live.broadcast.api.StatusApi;
import com.bytedance.android.live.broadcast.api.StickerReportApi;
import com.bytedance.android.live.network.e;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.h;
import h.i;
import h.m;
import java.util.concurrent.ConcurrentHashMap;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final h f8632a = i.a(m.SYNCHRONIZED, b.f8635a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f8633b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final h f8634c;

    private final ConcurrentHashMap<Class<?>, Object> e() {
        return (ConcurrentHashMap) this.f8634c.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(4412);
        }

        public static d a() {
            return (d) d.f8632a.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<d> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f8635a = new b();

        static {
            Covode.recordClassIndex(4413);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            return new d((byte) 0);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<ConcurrentHashMap<Class<?>, Object>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f8636a = new c();

        static {
            Covode.recordClassIndex(4414);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ConcurrentHashMap<Class<?>, Object> invoke() {
            return new ConcurrentHashMap();
        }
    }

    private d() {
        this.f8634c = i.a((h.f.a.a) c.f8636a);
    }

    public final BroadcastRoomApi a() {
        return (BroadcastRoomApi) a(BroadcastRoomApi.class);
    }

    public final BroadcastUserApi b() {
        return (BroadcastUserApi) a(BroadcastUserApi.class);
    }

    public final StatusApi c() {
        return (StatusApi) a(StatusApi.class);
    }

    public final StickerReportApi d() {
        return (StickerReportApi) a(StickerReportApi.class);
    }

    static {
        Covode.recordClassIndex(4411);
    }

    public /* synthetic */ d(byte b2) {
        this();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Class<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T a(Class<T> cls) {
        if (!e().contains(cls)) {
            ConcurrentHashMap<Class<?>, Object> e2 = e();
            Object a2 = e.a().a(cls);
            if (a2 == null) {
                l.b();
            }
            e2.putIfAbsent(cls, a2);
        }
        return (T) e().get(cls);
    }
}
