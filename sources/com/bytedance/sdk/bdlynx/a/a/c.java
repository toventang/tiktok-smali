package com.bytedance.sdk.bdlynx.a.a;

import android.content.Context;
import com.bytedance.bdp.bdpbase.manager.BdpManager;
import com.bytedance.bdp.serviceapi.defaults.network.BdpNetworkService;
import com.bytedance.bdp.serviceapi.defaults.network.BdpResponseListener;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final String f43630a = com.bytedance.d.a.a.a.a.a.f28511a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f43631b = com.bytedance.d.a.a.a.a.a.f28512b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f43632c = new c();

    /* renamed from: d  reason: collision with root package name */
    private static final String f43633d = com.bytedance.d.a.a.a.a.a.f28513c;

    /* renamed from: e  reason: collision with root package name */
    private static final String f43634e = com.bytedance.d.a.a.a.a.a.f28514d;

    /* renamed from: f  reason: collision with root package name */
    private static final String f43635f = com.bytedance.d.a.a.a.a.a.f28515e;

    /* renamed from: g  reason: collision with root package name */
    private static final h f43636g = i.a((h.f.a.a) b.f43638a);

    public static final class a implements BdpResponseListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f43637a;

        static {
            Covode.recordClassIndex(26706);
        }

        public a(h.f.a.b bVar) {
            this.f43637a = bVar;
        }
    }

    /* renamed from: com.bytedance.sdk.bdlynx.a.a.c$c  reason: collision with other inner class name */
    static final class C1056c implements BdpResponseListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f43639a;

        static {
            Covode.recordClassIndex(26708);
        }

        C1056c(h.f.a.b bVar) {
            this.f43639a = bVar;
        }
    }

    public static BdpNetworkService a() {
        return (BdpNetworkService) f43636g.getValue();
    }

    private c() {
    }

    static final class b extends m implements h.f.a.a<BdpNetworkService> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f43638a = new b();

        static {
            Covode.recordClassIndex(26707);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BdpNetworkService invoke() {
            return BdpManager.getInst().getService(BdpNetworkService.class);
        }
    }

    static {
        Covode.recordClassIndex(26705);
    }

    public static void a(Context context, com.bytedance.d.a.a.a.a.b bVar, Map<String, String> map, byte[] bArr, h.f.a.b<? super com.bytedance.d.a.a.a.a.c, z> bVar2) {
        l.c(context, "");
        l.c(bVar, "");
        l.c(bVar2, "");
        if (map != null) {
            bVar.f28518b.putAll(map);
        }
        bVar.f28523g = bArr;
        a().request(context, bVar.a(), new C1056c(bVar2));
    }
}
