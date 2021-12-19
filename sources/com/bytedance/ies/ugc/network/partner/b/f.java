package com.bytedance.ies.ugc.network.partner.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.b;
import com.bytedance.retrofit2.s;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f35268a;

    /* renamed from: b  reason: collision with root package name */
    public final h f35269b;

    /* renamed from: c  reason: collision with root package name */
    public final b f35270c;

    /* renamed from: d  reason: collision with root package name */
    public final c f35271d;

    /* renamed from: e  reason: collision with root package name */
    public int f35272e;

    /* renamed from: f  reason: collision with root package name */
    public int f35273f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f35274g;

    /* renamed from: h  reason: collision with root package name */
    public int f35275h;

    /* renamed from: i  reason: collision with root package name */
    public Object f35276i;

    /* renamed from: j  reason: collision with root package name */
    public String f35277j;

    /* renamed from: k  reason: collision with root package name */
    public s f35278k;

    /* renamed from: l  reason: collision with root package name */
    private final h f35279l;

    /* renamed from: m  reason: collision with root package name */
    private final Request f35280m;

    static {
        Covode.recordClassIndex(21132);
    }

    public final Map<Class<?>, Object> a() {
        return (Map) this.f35279l.getValue();
    }

    static final class a extends m implements h.f.a.a<HashMap<Class<?>, Object>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f35281a = new a();

        static {
            Covode.recordClassIndex(21133);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashMap<Class<?>, Object> invoke() {
            return new HashMap();
        }
    }

    public final Request b() {
        Request.a a2 = this.f35280m.newBuilder().a(this.f35271d.f35259a, this.f35271d.f35260b).a(this.f35269b.a());
        a2.f42460c = this.f35270c.a();
        a2.f42464g = this.f35272e;
        a2.f42464g = this.f35273f;
        a2.f42465h = this.f35274g;
        a2.f42466i = this.f35275h;
        a2.f42468k = this.f35276i;
        a2.f42469l = this.f35277j;
        for (Map.Entry<Class<?>, Object> entry : a().entrySet()) {
            Class<?> key = entry.getKey();
            if (!(key instanceof Class)) {
                key = null;
            }
            a2.a(key, entry.getValue());
        }
        Request a3 = a2.a();
        l.b(a3, "");
        a3.setMetrics(this.f35278k);
        return a3;
    }

    public f(Request request) {
        b bVar;
        l.d(request, "");
        this.f35280m = request;
        this.f35268a = request.isAddCommonParam();
        h a2 = h.a(request.getUrl());
        l.b(a2, "");
        this.f35269b = a2;
        if (request.getHeaders() == null) {
            bVar = new b();
        } else {
            List<b> headers = request.getHeaders();
            l.b(headers, "");
            bVar = new b(headers);
        }
        this.f35270c = bVar;
        this.f35271d = new c(request);
        this.f35272e = request.getPriorityLevel();
        this.f35273f = request.getRequestPriorityLevel();
        this.f35274g = request.isResponseStreaming();
        this.f35275h = request.getMaxLength();
        this.f35276i = request.getExtraInfo();
        String serviceType = request.getServiceType();
        l.b(serviceType, "");
        this.f35277j = serviceType;
        this.f35279l = i.a((h.f.a.a) a.f35281a);
        s metrics = request.getMetrics();
        l.b(metrics, "");
        this.f35278k = metrics;
    }
}
