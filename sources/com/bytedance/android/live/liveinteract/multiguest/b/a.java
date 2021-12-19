package com.bytedance.android.live.liveinteract.multiguest.b;

import android.text.TextUtils;
import com.bytedance.android.live.e;
import com.bytedance.android.live.liveinteract.api.aq;
import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.live.liveinteract.multilive.b.a;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.b.a.g;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractAudienceTimeOutSetting;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import f.a.ab;
import f.a.d.g;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

public final class a extends com.bytedance.android.live.liveinteract.platform.a.b {

    /* renamed from: a  reason: collision with root package name */
    public final String f11160a = "MultiGuestLinker";
    @com.bytedance.android.live.liveinteract.api.c.d(a = "RTC_CONTROLLER")

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.platform.c.c f11161b;
    @com.bytedance.android.live.liveinteract.api.c.d(a = "LINK_LOGGER")

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.platform.b.a f11162c;
    @com.bytedance.android.live.liveinteract.api.c.d(a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.opt.a.a f11163d;
    private final h o = i.a((h.f.a.a) d.f11170a);

    static {
        Covode.recordClassIndex(5997);
    }

    public final com.bytedance.android.livesdk.b.a.d c() {
        return (com.bytedance.android.livesdk.b.a.d) this.o.getValue();
    }

    static final class d extends m implements h.f.a.a<com.bytedance.android.livesdk.b.a.d> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f11170a = new d();

        static {
            Covode.recordClassIndex(6001);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.android.livesdk.b.a.d invoke() {
            return com.bytedance.android.livesdk.b.a.d.a();
        }
    }

    public final com.bytedance.android.live.liveinteract.platform.b.a a() {
        com.bytedance.android.live.liveinteract.platform.b.a aVar = this.f11162c;
        if (aVar == null) {
            l.a("mLinkLogger");
        }
        return aVar;
    }

    public final com.bytedance.android.live.liveinteract.multiguest.opt.a.a b() {
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11163d;
        if (aVar == null) {
            l.a("mLinkDataHolder");
        }
        return aVar;
    }

    static final class b<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final b f11168a = new b();

        static {
            Covode.recordClassIndex(5999);
        }

        b() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            l.d(obj, "");
            com.bytedance.android.live.liveinteract.platform.a.c.a aVar = new com.bytedance.android.live.liveinteract.platform.a.c.a();
            aVar.f11883a = obj;
            return aVar;
        }
    }

    static final class c<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final c f11169a = new c();

        static {
            Covode.recordClassIndex(6000);
        }

        c() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            l.d(obj, "");
            com.bytedance.android.live.liveinteract.platform.a.c.a aVar = new com.bytedance.android.live.liveinteract.platform.a.c.a();
            aVar.f11883a = obj;
            return aVar;
        }
    }

    static final class e<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final e f11171a = new e();

        static {
            Covode.recordClassIndex(6002);
        }

        e() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            l.d(obj, "");
            com.bytedance.android.live.liveinteract.platform.a.c.a aVar = new com.bytedance.android.live.liveinteract.platform.a.c.a();
            aVar.f11883a = obj;
            return aVar;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.a.b
    public final ab<com.bytedance.android.live.liveinteract.platform.a.c.a> h(Map<String, Object> map) {
        l.d(map, "");
        LinkApi linkApi = (LinkApi) com.bytedance.android.live.network.e.a().a(LinkApi.class);
        long j2 = this.f11862e;
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11163d;
        if (aVar == null) {
            l.a("mLinkDataHolder");
        }
        return linkApi.leave(j2, aVar.u).c(c.f11169a);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.a.b
    public final ab<com.bytedance.android.live.liveinteract.platform.a.c.a> i(Map<String, Object> map) {
        l.d(map, "");
        LinkApi linkApi = (LinkApi) com.bytedance.android.live.network.e.a().a(LinkApi.class);
        long j2 = this.f11862e;
        Object obj = map.get("toUserId");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((Long) obj).longValue();
        Object obj2 = map.get("secUserId");
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj2;
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11163d;
        if (aVar == null) {
            l.a("mLinkDataHolder");
        }
        return linkApi.kickOut(j2, longValue, str, aVar.u).c(b.f11168a);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.a.b
    public final ab<com.bytedance.android.live.liveinteract.platform.a.c.a> g(Map<String, Object> map) {
        l.d(map, "");
        com.bytedance.android.live.liveinteract.platform.b.a aVar = this.f11162c;
        if (aVar == null) {
            l.a("mLinkLogger");
        }
        aVar.b().k(map);
        int value = LiveInteractAudienceTimeOutSetting.INSTANCE.getValue();
        Object obj = map.get("userId");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((Long) obj).longValue();
        Object obj2 = map.get("interactId");
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj2;
        l.d(str, "");
        JSONObject jSONObject = new JSONObject();
        com.bytedance.android.live.core.d.a.a(jSONObject, "guest_user_id", longValue);
        com.bytedance.android.live.core.d.a.a(jSONObject, "guest_linkmic_id", str);
        com.bytedance.android.live.liveinteract.platform.common.g.i.a(jSONObject, Long.valueOf(longValue), str);
        com.bytedance.android.live.liveinteract.platform.common.g.i.a(com.bytedance.android.live.liveinteract.platform.common.g.i.f11979j, true, "permit_request", jSONObject);
        com.bytedance.android.live.liveinteract.platform.common.g.i.f11973c = System.currentTimeMillis();
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = this.f11163d;
        if (aVar2 == null) {
            l.a("mLinkDataHolder");
        }
        n nVar = aVar2.q;
        b.a.a("livesdk_anchor_guest_connection_success").a().a("live_type", "video_live").a("guest_invite_type", "guest_apply_anchor").a("enter_from", "guest_apply_anchor").a("layout_setting", com.bytedance.android.live.liveinteract.multilive.b.a.a(nVar).getFirst()).a("window_setting", com.bytedance.android.live.liveinteract.multilive.b.a.a(nVar).getSecond()).a("permission_type", com.bytedance.android.live.liveinteract.multilive.a.d()).b();
        Object obj3 = map.get("roomId");
        Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Long");
        long longValue2 = ((Long) obj3).longValue();
        Object obj4 = map.get("userId");
        Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.Long");
        long longValue3 = ((Long) obj4).longValue();
        Object obj5 = map.get("secUserId");
        Objects.requireNonNull(obj5, "null cannot be cast to non-null type kotlin.String");
        String str2 = c().v;
        Object obj6 = map.get("linkmicPermitStatus");
        Objects.requireNonNull(obj6, "null cannot be cast to non-null type kotlin.Int");
        return ((LinkApi) com.bytedance.android.live.network.e.a().a(LinkApi.class)).permit(longValue2, longValue3, (String) obj5, value, str2, ((Integer) obj6).intValue()).c(e.f11171a);
    }

    public a(long j2, DataChannel dataChannel) {
        super(j2, dataChannel);
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = new com.bytedance.android.live.liveinteract.multiguest.opt.a.a();
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(aVar, null);
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(new com.bytedance.android.live.liveinteract.platform.c.c(), null);
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(this);
        com.bytedance.android.live.liveinteract.multilive.b.a.f11749a = aVar;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.b.a$a  reason: collision with other inner class name */
    public static final class C0213a<T1, T2> implements f.a.d.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f11164a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HashMap f11165b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f11166c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ LinkApi.e f11167d;

        static {
            Covode.recordClassIndex(5998);
        }

        public C0213a(a aVar, HashMap hashMap, long j2, LinkApi.e eVar) {
            this.f11164a = aVar;
            this.f11165b = hashMap;
            this.f11166c = j2;
            this.f11167d = eVar;
        }

        @Override // f.a.d.b
        public final /* synthetic */ void a(Object obj, Object obj2) {
            HashMap<Long, String> c2;
            HashMap<Long, String> c3;
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            Throwable th = (Throwable) obj2;
            com.bytedance.android.livesdk.chatroom.model.c.a aVar = null;
            if (!(dVar == null || dVar.data == null)) {
                Object obj3 = dVar.data;
                l.b(obj3, "");
                com.bytedance.android.livesdk.chatroom.model.b.b bVar = (com.bytedance.android.livesdk.chatroom.model.b.b) obj3;
                if (!TextUtils.isEmpty(bVar.f15704b)) {
                    this.f11164a.c().f14184e = bVar.f15704b;
                    this.f11164a.c().f14185f = bVar.f15704b;
                    this.f11164a.c().a(bVar.f15706d);
                    com.bytedance.android.live.liveinteract.multiguest.opt.a.a b2 = this.f11164a.b();
                    if (!(b2 == null || (c3 = b2.c()) == null)) {
                        c3.clear();
                    }
                    com.bytedance.android.live.liveinteract.multiguest.opt.a.a b3 = this.f11164a.b();
                    if (!(b3 == null || (c2 = b3.c()) == null)) {
                        c2.putAll(bVar.f15707e);
                    }
                    this.f11164a.f11863f = bVar.f15704b;
                    HashMap hashMap = this.f11165b;
                    String b4 = e.a.f9628b.b(bVar);
                    l.b(b4, "");
                    hashMap.put("response", b4);
                    g.a.f14199a.a(this.f11166c, bVar.f15704b);
                    a aVar2 = this.f11164a;
                    aq aqVar = aq.USER_LINKED;
                    l.d(aqVar, "");
                    if (aVar2.f11868k != aqVar) {
                        aVar2.f11868k = aqVar;
                    }
                    com.bytedance.android.live.liveinteract.api.a.c.a().a((Integer) 2);
                    u.a().b().i().a_(new com.bytedance.android.livesdk.at.g());
                    boolean z = true;
                    if (bVar.f15708f != 1) {
                        z = false;
                    }
                    com.bytedance.android.live.liveinteract.multiguest.opt.a.a b5 = this.f11164a.b();
                    if (b5 != null) {
                        b5.a(z);
                    }
                    com.bytedance.android.live.liveinteract.multiguest.opt.a.a b6 = this.f11164a.b();
                    if (b6 != null) {
                        com.bytedance.android.livesdk.chatroom.model.c.a aVar3 = bVar.f15709g;
                        if (aVar3 != null) {
                            aVar = com.bytedance.android.livesdk.chatroom.model.c.a.a(aVar3.f15740a, aVar3.f15741b, aVar3.f15742c, aVar3.f15743d);
                        }
                        b6.f11299i = aVar;
                    }
                    this.f11164a.a().b().j(this.f11165b);
                    if (z) {
                        com.bytedance.android.livesdk.b.a.d.a().x = 3;
                    } else {
                        com.bytedance.android.livesdk.b.a.d.a().x = 2;
                    }
                    com.bytedance.android.live.liveinteract.multilive.b.a.a(a.EnumC0242a.DEFAULT_MODE);
                } else {
                    this.f11164a.a().b().c(new Exception(), this.f11165b);
                    com.bytedance.android.live.liveinteract.platform.common.g.i.a(this.f11167d, new Exception());
                }
            }
            if (th != null) {
                this.f11164a.a().b().c(th, this.f11165b);
            }
        }
    }
}
