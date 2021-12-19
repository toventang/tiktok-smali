package com.ss.android.ugc.aweme.im.sdk.iescore.b;

import com.bytedance.common.wschannel.app.e;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.notice.api.ab.c;
import h.c.b.a.k;
import h.c.d;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.r;
import h.z;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bz;
import org.json.JSONObject;

public final class f implements e, com.bytedance.ies.im.core.api.d.e {

    /* renamed from: a  reason: collision with root package name */
    public static final f f102816a;

    /* renamed from: b  reason: collision with root package name */
    private static final h f102817b = i.a((h.f.a.a) b.f102819a);

    /* renamed from: c  reason: collision with root package name */
    private static com.bytedance.ies.im.core.api.j.b f102818c;

    public static CopyOnWriteArraySet<com.bytedance.ies.im.core.api.j.a> b() {
        return (CopyOnWriteArraySet) f102817b.getValue();
    }

    private f() {
    }

    static final class b extends m implements h.f.a.a<CopyOnWriteArraySet<com.bytedance.ies.im.core.api.j.a>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f102819a = new b();

        static {
            Covode.recordClassIndex(65922);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ CopyOnWriteArraySet<com.bytedance.ies.im.core.api.j.a> invoke() {
            return new CopyOnWriteArraySet(new LinkedHashSet());
        }
    }

    private static String c() {
        String lastWsConnectUrl = com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b().getLastWsConnectUrl();
        if (lastWsConnectUrl == null) {
            return "";
        }
        return lastWsConnectUrl;
    }

    static {
        Covode.recordClassIndex(65920);
        f fVar = new f();
        f102816a = fVar;
        if (c.b()) {
            com.ss.android.ugc.aweme.im.service.m.a.e("WsDependImpl", "init ignored by reversing ws");
        } else {
            com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b().registerWsListener(fVar);
        }
    }

    @Override // com.bytedance.ies.im.core.api.d.e
    public final boolean a() {
        com.bytedance.ies.im.core.api.j.b bVar = f102818c;
        if (bVar == null || bVar.f33996a != com.bytedance.common.wschannel.b.c.CONNECTED) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.im.core.api.d.e
    public final void a(com.bytedance.ies.im.core.api.j.a aVar) {
        l.d(aVar, "");
        b().add(aVar);
    }

    @Override // com.bytedance.common.wschannel.app.e
    public final void a(WsChannelMsg wsChannelMsg) {
        if (wsChannelMsg != null) {
            Iterator<T> it = b().iterator();
            while (it.hasNext()) {
                it.next().a(wsChannelMsg, null);
            }
        }
    }

    static final class a extends k implements h.f.a.m<am, d<? super z>, Object> {
        final /* synthetic */ String $lastUrl;
        final /* synthetic */ com.ss.android.websocket.a.a.e $msgHolder;
        int label;

        static {
            Covode.recordClassIndex(65921);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, com.ss.android.websocket.a.a.e eVar, d dVar) {
            super(2, dVar);
            this.$lastUrl = str;
            this.$msgHolder = eVar;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new a(this.$lastUrl, this.$msgHolder, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.common.net.k(new com.ss.android.websocket.a.a.d(this.$lastUrl, this.$msgHolder)));
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.bytedance.ies.im.core.api.d.e
    public final void b(WsChannelMsg wsChannelMsg) {
        l.d(wsChannelMsg, "");
        if (c.b()) {
            com.ss.android.ugc.aweme.im.service.m.a.e("WsDependImpl", "sendMsg ignored by reversing ws");
            return;
        }
        String c2 = c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LocalTestApi localTestApi = (LocalTestApi) ServiceManager.get().getService(LocalTestApi.class);
        l.b(localTestApi, "");
        if (localTestApi.isPPEEnable()) {
            String pPELane = localTestApi.getPPELane();
            l.b(pPELane, "");
            linkedHashMap.put("X-Tt-Env", pPELane);
            linkedHashMap.put("X-USE-PPE", "1");
        }
        if (localTestApi.enableBoe()) {
            String boeLane = localTestApi.getBoeLane();
            l.b(boeLane, "");
            linkedHashMap.put("X-Tt-Env", boeLane);
        }
        List<WsChannelMsg.MsgHeader> list = wsChannelMsg.f27299h;
        if (list != null) {
            for (T t : list) {
                l.b(t, "");
                String str = t.f27305a;
                l.b(str, "");
                String str2 = t.f27306b;
                l.b(str2, "");
                linkedHashMap.put(str, str2);
            }
        }
        bz unused = kotlinx.coroutines.i.a(an.a(com.ss.android.ugc.aweme.af.a.f66269a), null, null, new a(c2, new com.ss.android.websocket.a.a.e(c2, wsChannelMsg.f27297f, wsChannelMsg.f27295d, wsChannelMsg.f27298g, wsChannelMsg.a(), wsChannelMsg.f27301j, wsChannelMsg.f27300i, linkedHashMap), null), 3);
    }

    @Override // com.bytedance.common.wschannel.app.e
    public final void a(com.bytedance.common.wschannel.b.b bVar, JSONObject jSONObject) {
        if (bVar != null) {
            com.bytedance.common.wschannel.b.c cVar = bVar.f27017b;
            l.b(cVar, "");
            f102818c = new com.bytedance.ies.im.core.api.j.b(cVar, c());
            for (T t : b()) {
                com.bytedance.ies.im.core.api.j.b bVar2 = f102818c;
                if (bVar2 == null) {
                    l.b();
                }
                t.a(bVar2);
            }
        }
    }
}
