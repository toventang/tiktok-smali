package com.ss.android.ugc.aweme.live.d;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.livesdkapi.c.a;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.utils.dg;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.Map;

public final class a implements com.bytedance.android.livesdkapi.c.a {
    static {
        Covode.recordClassIndex(69417);
    }

    @Override // com.bytedance.android.live.base.a
    public final void onInit() {
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ a.AbstractC0501a $callback;

        static {
            Covode.recordClassIndex(69419);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a.AbstractC0501a aVar) {
            super(0);
            this.$callback = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$callback.a();
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.d.a$a  reason: collision with other inner class name */
    static final class C2779a extends m implements h.f.a.b<Map<String, ? extends String>, z> {
        final /* synthetic */ a.C0791a $adLog;

        static {
            Covode.recordClassIndex(69418);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2779a(a.C0791a aVar) {
            super(1);
            this.$adLog = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Map<String, ? extends String> map) {
            a(map);
            return z.f158842a;
        }

        public final void a(Map<String, String> map) {
            if (!(map == null || map.isEmpty())) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (!l.a((Object) entry.getKey(), (Object) "traffic_from_position")) {
                        this.$adLog.b(entry.getKey(), entry.getValue());
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.c.a
    public final void a(Uri uri, EnterRoomConfig enterRoomConfig) {
        l.d(uri, "");
        l.d(enterRoomConfig, "");
        try {
            String queryParameter = uri.getQueryParameter("adLiveJson");
            if (queryParameter != null) {
                l.b(queryParameter, "");
                com.ss.android.ugc.aweme.commercialize.live.a.a aVar = (com.ss.android.ugc.aweme.commercialize.live.a.a) dg.a(queryParameter, com.ss.android.ugc.aweme.commercialize.live.a.a.class);
                if (!aVar.f74536f.isEmpty()) {
                    enterRoomConfig.f23299c.o = aVar.f74531a;
                    enterRoomConfig.f23299c.f23333l = aVar.f74536f;
                    enterRoomConfig.f23299c.f23334m = aVar.f74537g;
                    enterRoomConfig.f23299c.n = aVar.f74535e;
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.android.livesdkapi.c.a
    public final void a(Context context, String str, long j2) {
        l.d(context, "");
        l.d(str, "");
        IFeedAdService c2 = FeedAdServiceImpl.c();
        if (c2 != null) {
            c2.a(context, str, j2);
        }
    }

    @Override // com.bytedance.android.livesdkapi.c.a
    public final void a(Context context, String str, long j2, a.AbstractC0501a aVar) {
        l.d(context, "");
        l.d(str, "");
        l.d(aVar, "");
        IFeedAdService c2 = FeedAdServiceImpl.c();
        if (c2 != null) {
            c2.a(context, str, j2, new b(aVar));
        }
    }

    @Override // com.bytedance.android.livesdkapi.c.a
    public final void a(String str, String str2, Map<String, String> map, Map<String, String> map2) {
        HashMap<String, String> hashMap;
        String str3;
        l.d(str, "");
        l.d(str2, "");
        com.bytedance.android.livesdk.ab.c.a aVar = (com.bytedance.android.livesdk.ab.c.a) DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.ab.c.b.class);
        if (aVar != null && (str3 = (hashMap = aVar.P).get("value")) != null) {
            l.b(str3, "");
            HashMap<String, String> hashMap2 = aVar.Q;
            a.C0791a a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a(str, str2, str3, hashMap.get("log_extra"), hashMap.get("group_id"));
            C2779a aVar2 = new C2779a(a2);
            aVar2.a(map);
            a2.a(map2);
            aVar2.a(hashMap);
            a2.a(hashMap2);
            try {
                String str4 = hashMap2.get("traffic_from_position");
                if (str4 != null) {
                    l.b(str4, "");
                    a2.a("traffic_from_position", Integer.valueOf(Integer.parseInt(str4)));
                }
            } catch (NumberFormatException unused) {
            }
            a2.b();
        }
    }
}
