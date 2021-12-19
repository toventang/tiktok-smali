package com.bytedance.android.live.liveinteract.cohost.b;

import android.text.TextUtils;
import com.bytedance.android.live.e;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.t;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostInviteTimeOutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LinkServerAutoJoinChannel;
import com.bytedance.android.livesdk.utils.an;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import f.a.ab;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

public final class a extends com.bytedance.android.live.liveinteract.platform.a.b {

    /* renamed from: c  reason: collision with root package name */
    public static final C0165a f10182c = new C0165a((byte) 0);
    @com.bytedance.android.live.liveinteract.api.c.d(a = "LINK_LOGGER")

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.platform.b.a f10183a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10184b;

    /* renamed from: d  reason: collision with root package name */
    private final h.h f10185d;
    private final h.h o;

    public static final class l<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final l f10198a = new l();

        static {
            Covode.recordClassIndex(5363);
        }

        l() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class p<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final p f10204a = new p();

        static {
            Covode.recordClassIndex(5367);
        }

        p() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(5351);
    }

    public final com.bytedance.android.live.liveinteract.api.a.b a() {
        return (com.bytedance.android.live.liveinteract.api.a.b) this.f10185d.getValue();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.b.a$a  reason: collision with other inner class name */
    public static final class C0165a {
        static {
            Covode.recordClassIndex(5352);
        }

        private C0165a() {
        }

        public /* synthetic */ C0165a(byte b2) {
            this();
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<com.bytedance.android.live.liveinteract.api.a.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f10197a = new k();

        static {
            Covode.recordClassIndex(5362);
        }

        k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.android.live.liveinteract.api.a.b invoke() {
            return b.a.a();
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(5361);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return this.this$0.getClass().getName();
        }
    }

    public final com.bytedance.android.live.liveinteract.platform.b.a b() {
        com.bytedance.android.live.liveinteract.platform.b.a aVar = this.f10183a;
        if (aVar == null) {
            h.f.b.l.a("mLinkLogger");
        }
        return aVar;
    }

    public final boolean c() {
        if (a().w) {
            DataChannel dataChannel = this.n;
            if (dataChannel == null) {
                return true;
            }
            dataChannel.c(com.bytedance.android.live.liveinteract.cohost.a.b.f.class);
            return true;
        }
        a().e("stopRtcIfJoinChannelAdvance");
        return false;
    }

    static final class b<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final b f10186a = new b();

        static {
            Covode.recordClassIndex(5353);
        }

        b() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            h.f.b.l.d(obj, "");
            com.bytedance.android.live.liveinteract.platform.a.c.a aVar = new com.bytedance.android.live.liveinteract.platform.a.c.a();
            aVar.f11883a = obj;
            return aVar;
        }
    }

    static final class d<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final d f10188a = new d();

        static {
            Covode.recordClassIndex(5355);
        }

        d() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            h.f.b.l.d(obj, "");
            com.bytedance.android.live.liveinteract.platform.a.c.a aVar = new com.bytedance.android.live.liveinteract.platform.a.c.a();
            aVar.f11883a = obj;
            return aVar;
        }
    }

    static final class f<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final f f10191a = new f();

        static {
            Covode.recordClassIndex(5357);
        }

        f() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            h.f.b.l.d(obj, "");
            com.bytedance.android.live.liveinteract.platform.a.c.a aVar = new com.bytedance.android.live.liveinteract.platform.a.c.a();
            aVar.f11883a = obj;
            return aVar;
        }
    }

    static final class h<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final h f10194a = new h();

        static {
            Covode.recordClassIndex(5359);
        }

        h() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            h.f.b.l.d(obj, "");
            com.bytedance.android.live.liveinteract.platform.a.c.a aVar = new com.bytedance.android.live.liveinteract.platform.a.c.a();
            aVar.f11883a = obj;
            return aVar;
        }
    }

    public static final class m<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10199a;

        static {
            Covode.recordClassIndex(5364);
        }

        public m(a aVar) {
            this.f10199a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            a aVar = this.f10199a;
            h.f.b.l.b(th, "");
            aVar.a(th);
        }
    }

    static final class n<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final n f10200a = new n();

        static {
            Covode.recordClassIndex(5365);
        }

        n() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            h.f.b.l.d(obj, "");
            com.bytedance.android.live.liveinteract.platform.a.c.a aVar = new com.bytedance.android.live.liveinteract.platform.a.c.a();
            aVar.f11883a = obj;
            return aVar;
        }
    }

    static final class q<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10205a;

        static {
            Covode.recordClassIndex(5368);
        }

        q(a aVar) {
            this.f10205a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            a aVar = this.f10205a;
            h.f.b.l.b(th, "");
            aVar.a(th);
        }
    }

    public final void a(Throwable th) {
        com.bytedance.android.live.core.c.a.a(6, (String) this.o.getValue(), th.getStackTrace());
    }

    @Override // com.bytedance.android.live.liveinteract.platform.a.b
    public final ab<com.bytedance.android.live.liveinteract.platform.a.c.a> c(Map<String, Object> map) {
        h.f.b.l.d(map, "");
        map.put("channel_id", Long.valueOf(a().f9940e));
        com.bytedance.android.live.liveinteract.platform.b.a aVar = this.f10183a;
        if (aVar == null) {
            h.f.b.l.a("mLinkLogger");
        }
        aVar.b().c(map);
        return ((CoHostApi) com.bytedance.android.live.network.e.a().a(CoHostApi.class)).joinChannelV3(a().f9940e, a().ab).c(h.f10194a).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new i(this, map));
    }

    @Override // com.bytedance.android.live.liveinteract.platform.a.b
    public final void f(Map<String, Object> map) {
        h.f.b.l.d(map, "");
        long j2 = a().f9940e;
        Object obj = map.get("content");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
        h.f.b.l.b(((CoHostApi) com.bytedance.android.live.network.e.a().a(CoHostApi.class)).sendSignalV3(j2, (String) obj, null).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(p.f10204a, new q(this)), "");
    }

    @Override // com.bytedance.android.live.liveinteract.platform.a.b
    public final ab<com.bytedance.android.live.liveinteract.platform.a.c.a> a(Map<String, Object> map) {
        String str = "";
        h.f.b.l.d(map, str);
        int value = MtCoHostInviteTimeOutSetting.INSTANCE.getValue();
        map.put("to_room_id", Long.valueOf(a().f9944i));
        map.put("to_user_id", Long.valueOf(a().f9941f));
        String str2 = a().f9942g;
        if (str2 == null) {
            str2 = str;
        }
        map.put("sec_to_user_id", str2);
        map.put("room_id", Long.valueOf(a().f9943h));
        map.put("invite_type", a().p);
        map.put("match_type", 0);
        map.put("invite_time_out", Integer.valueOf(value));
        com.bytedance.android.live.liveinteract.platform.b.a aVar = this.f10183a;
        if (aVar == null) {
            h.f.b.l.a("mLinkLogger");
        }
        aVar.b().e(map);
        this.f11862e = a().f9943h;
        CoHostApi coHostApi = (CoHostApi) com.bytedance.android.live.network.e.a().a(CoHostApi.class);
        long j2 = a().f9944i;
        long j3 = a().f9941f;
        String str3 = a().f9942g;
        if (str3 != null) {
            str = str3;
        }
        return coHostApi.invite(12, j2, j3, str, a().f9943h, a().p.getType(), 0, value).c(f.f10191a).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new g(this, map));
    }

    @Override // com.bytedance.android.live.liveinteract.platform.a.b
    public final ab<com.bytedance.android.live.liveinteract.platform.a.c.a> b(Map<String, Object> map) {
        String str = "";
        h.f.b.l.d(map, str);
        if (map.get("reply_status") == null) {
            return null;
        }
        Object obj = map.get("reply_status");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        if (map.get("channel_id") == null) {
            map.put("channel_id", Long.valueOf(a().f9940e));
        }
        if (map.get("guest_user_id") == null) {
            map.put("guest_user_id", Long.valueOf(a().f9941f));
        }
        if (map.get("transparent_extra") == null) {
            String str2 = a().ab;
            if (str2 != null) {
                str = str2;
            }
            map.put("transparent_extra", str);
        }
        if (map.get("guest_user_id") instanceof Long) {
            Object obj2 = map.get("guest_user_id");
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Long");
            if (((Long) obj2).longValue() > 0 && (map.get("channel_id") instanceof Long)) {
                Object obj3 = map.get("channel_id");
                Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Long");
                if (((Long) obj3).longValue() > 0) {
                    com.bytedance.android.live.liveinteract.platform.b.a aVar = this.f10183a;
                    if (aVar == null) {
                        h.f.b.l.a("mLinkLogger");
                    }
                    aVar.b().a(map);
                    Object obj4 = map.get("channel_id");
                    Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.Long");
                    long longValue = ((Long) obj4).longValue();
                    long j2 = this.f11862e;
                    Object obj5 = map.get("guest_user_id");
                    Objects.requireNonNull(obj5, "null cannot be cast to non-null type kotlin.Long");
                    long longValue2 = ((Long) obj5).longValue();
                    Object obj6 = map.get("transparent_extra");
                    Objects.requireNonNull(obj6, "null cannot be cast to non-null type kotlin.String");
                    return ((CoHostApi) com.bytedance.android.live.network.e.a().a(CoHostApi.class)).reply(longValue, j2, intValue, longValue2, (String) obj6).c(n.f10200a).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new o(this, map, intValue));
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.platform.a.b
    public final ab<com.bytedance.android.live.liveinteract.platform.a.c.a> d(Map<String, Object> map) {
        ab<com.bytedance.android.live.network.response.d<Void>> finishV3;
        h.f.b.l.d(map, "");
        Object obj = map.get("needSuggest");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) obj).booleanValue();
        com.bytedance.android.live.liveinteract.platform.b.a aVar = this.f10183a;
        if (aVar == null) {
            h.f.b.l.a("mLinkLogger");
        }
        aVar.b().g(map);
        if (booleanValue) {
            finishV3 = ((CoHostApi) com.bytedance.android.live.network.e.a().a(CoHostApi.class)).finishV3(a().f9940e, a().ab, a().f9941f);
        } else {
            finishV3 = ((CoHostApi) com.bytedance.android.live.network.e.a().a(CoHostApi.class)).finishV3(a().f9940e, a().ab);
        }
        ab<R> a2 = finishV3.c(d.f10188a).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new e(this, map));
        h.f.b.l.b(a2, "");
        return a2;
    }

    @Override // com.bytedance.android.live.liveinteract.platform.a.b
    public final ab<com.bytedance.android.live.liveinteract.platform.a.c.a> e(Map<String, Object> map) {
        h.f.b.l.d(map, "");
        this.f10184b = false;
        Object obj = map.get("cancel_reason");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.bytedance.android.livesdk.chatroom.api.LinkApi.CancelReason");
        LinkApi.a aVar = (LinkApi.a) obj;
        if (a().f9944i <= 0 || this.f11866i <= 0 || a().f9941f <= 0 || TextUtils.isEmpty(a().f9942g)) {
            return null;
        }
        com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkCross_Cancel", this.f11864g);
        h.f.b.l.d(aVar, "");
        JSONObject jSONObject = new JSONObject();
        com.bytedance.android.live.core.d.a.a(jSONObject, "cancel_type", aVar.value);
        com.bytedance.android.live.liveinteract.cohost.c.b bVar = com.bytedance.android.live.liveinteract.cohost.c.b.f10210e;
        com.bytedance.android.live.liveinteract.cohost.c.b.a((com.bytedance.android.live.liveinteract.cohost.c.b) "cancel_request", (String) jSONObject, (JSONObject) 0);
        return ((CoHostApi) com.bytedance.android.live.network.e.a().a(CoHostApi.class)).cancel(a().f9940e, a().am, a().f9944i, a().f9941f, a().f9942g, aVar.value, a().ab).c(b.f10186a).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new c(this));
    }

    static final class c<T1, T2> implements f.a.d.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10187a;

        static {
            Covode.recordClassIndex(5354);
        }

        c(a aVar) {
            this.f10187a = aVar;
        }

        @Override // f.a.d.b
        public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            if (obj != null) {
                this.f10187a.f10184b = true;
            }
            if (obj2 != null) {
                this.f10187a.f10184b = true;
            }
        }
    }

    static final class e<T1, T2> implements f.a.d.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10189a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f10190b;

        static {
            Covode.recordClassIndex(5356);
        }

        e(a aVar, Map map) {
            this.f10189a = aVar;
            this.f10190b = map;
        }

        @Override // f.a.d.b
        public final /* synthetic */ void a(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            if (obj != null) {
                this.f10189a.a().ah = false;
                this.f10190b.put("response", obj);
                this.f10189a.b().b().h(this.f10190b);
            }
            if (th != null) {
                this.f10189a.a().ah = false;
                this.f10189a.b().b().b(th, this.f10190b);
            }
        }
    }

    static final class i<T1, T2> implements f.a.d.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10195a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f10196b;

        static {
            Covode.recordClassIndex(5360);
        }

        i(a aVar, Map map) {
            this.f10195a = aVar;
            this.f10196b = map;
        }

        @Override // f.a.d.b
        public final /* synthetic */ void a(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            if (obj != null) {
                this.f10196b.put("response", obj);
                this.f10195a.b().b().d(this.f10196b);
            }
            if (th != null) {
                this.f10195a.b().b().a(th);
            }
        }
    }

    public a(long j2, DataChannel dataChannel) {
        super(j2, dataChannel);
        long j3;
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(b.a.a(), null);
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(this);
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            j3 = room.getId();
        } else {
            j3 = 0;
        }
        this.f11862e = j3;
        this.f10185d = h.i.a((h.f.a.a) k.f10197a);
        this.f10184b = true;
        this.o = h.i.a((h.f.a.a) new j(this));
    }

    static final class o<T1, T2> implements f.a.d.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10201a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f10202b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f10203c;

        static {
            Covode.recordClassIndex(5366);
        }

        o(a aVar, Map map, int i2) {
            this.f10201a = aVar;
            this.f10202b = map;
            this.f10203c = i2;
        }

        @Override // f.a.d.b
        public final /* synthetic */ void a(Object obj, Object obj2) {
            com.bytedance.android.livesdk.chatroom.model.b.f fVar;
            DataChannel dataChannel;
            com.bytedance.android.live.liveinteract.platform.a.c.a aVar = (com.bytedance.android.live.liveinteract.platform.a.c.a) obj;
            Throwable th = (Throwable) obj2;
            if (aVar != null) {
                this.f10202b.put("response", aVar);
                this.f10201a.b().b().b(this.f10202b);
                if (this.f10201a.a().a(com.bytedance.android.live.liveinteract.api.k.CONNECTION_FINISH)) {
                    return;
                }
                if (aVar.f11883a instanceof com.bytedance.android.live.network.response.d) {
                    Object obj3 = aVar.f11883a;
                    Objects.requireNonNull(obj3, "null cannot be cast to non-null type com.bytedance.android.live.network.response.Response<com.bytedance.android.livesdk.chatroom.model.interact.LinkReplyResult?>");
                    com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj3;
                    if (!(dVar == null || (fVar = (com.bytedance.android.livesdk.chatroom.model.b.f) dVar.data) == null)) {
                        int i2 = this.f10203c;
                        if (i2 == 1) {
                            a aVar2 = this.f10201a;
                            String b2 = e.a.f9628b.b(fVar);
                            h.f.b.l.b(b2, "");
                            com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkCross_Reply_Success", b2);
                            if (!aVar2.a().a(com.bytedance.android.live.liveinteract.api.k.CONNECTION_FINISH)) {
                                aVar2.a().d(fVar.f15731a);
                                aVar2.a().M = fVar.f15734d;
                                boolean value = LinkServerAutoJoinChannel.INSTANCE.getValue();
                                if (!aVar2.a().f9938c || value) {
                                    aVar2.a().f9938c = true;
                                    if (!TextUtils.isEmpty(fVar.f15735e)) {
                                        aVar2.a().a(fVar.f15735e);
                                    }
                                    DataChannel dataChannel2 = aVar2.n;
                                    if (dataChannel2 != null) {
                                        dataChannel2.c(t.class, new com.bytedance.android.livesdk.chatroom.c.p(4));
                                    }
                                    if (!value && (dataChannel = aVar2.n) != null) {
                                        dataChannel.c(com.bytedance.android.live.liveinteract.cohost.a.b.e.class);
                                    }
                                } else {
                                    DataChannel dataChannel3 = aVar2.n;
                                    if (dataChannel3 != null) {
                                        dataChannel3.c(com.bytedance.android.live.liveinteract.cohost.a.b.e.class);
                                    }
                                }
                            }
                        } else if (i2 == 2 || i2 == 5) {
                            this.f10201a.a().o = false;
                            this.f10201a.c();
                        }
                    }
                }
            }
            if (th != null) {
                this.f10201a.b().b().a(th, this.f10202b);
                this.f10201a.c();
            }
        }
    }

    static final class g<T1, T2> implements f.a.d.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10192a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f10193b;

        static {
            Covode.recordClassIndex(5358);
        }

        g(a aVar, Map map) {
            this.f10192a = aVar;
            this.f10193b = map;
        }

        @Override // f.a.d.b
        public final /* synthetic */ void a(Object obj, Object obj2) {
            com.bytedance.android.live.network.response.d dVar;
            com.bytedance.android.live.liveinteract.platform.a.c.a aVar = (com.bytedance.android.live.liveinteract.platform.a.c.a) obj;
            Throwable th = (Throwable) obj2;
            if (aVar != null) {
                com.bytedance.android.livesdk.chatroom.interact.model.f fVar = null;
                if (aVar.f11883a instanceof com.bytedance.android.live.network.response.d) {
                    Object obj3 = aVar.f11883a;
                    Objects.requireNonNull(obj3, "null cannot be cast to non-null type com.bytedance.android.live.network.response.Response<com.bytedance.android.livesdk.chatroom.interact.model.LinkInviteResult>");
                    dVar = (com.bytedance.android.live.network.response.d) obj3;
                    if (dVar != null) {
                        fVar = (com.bytedance.android.livesdk.chatroom.interact.model.f) dVar.data;
                    }
                } else {
                    dVar = null;
                }
                this.f10192a.b().b().f(this.f10193b);
                this.f10192a.a().ac = System.currentTimeMillis();
                if (fVar != null) {
                    this.f10192a.f11866i = fVar.f15602a;
                    this.f10192a.f11863f = fVar.f15607f;
                    this.f10192a.a().f9940e = fVar.f15602a;
                    this.f10192a.a().d(fVar.f15607f);
                    this.f10192a.a().w = fVar.f15605d;
                    this.f10192a.a().f9945j = fVar.f15606e;
                    this.f10192a.a().af = false;
                    boolean z = fVar.f15606e;
                    h.f.b.l.d(dVar, "");
                    JSONObject jSONObject = new JSONObject();
                    com.bytedance.android.live.liveinteract.cohost.c.b.a(jSONObject, dVar);
                    long currentTimeMillis = System.currentTimeMillis() - com.bytedance.android.live.liveinteract.cohost.c.b.f10206a;
                    com.bytedance.android.live.core.d.a.a(jSONObject, "cost", currentTimeMillis);
                    com.bytedance.android.live.core.d.a.a(jSONObject, "rtc_push_stream", String.valueOf(z));
                    long currentTimeMillis2 = System.currentTimeMillis() + an.f22242a;
                    com.bytedance.android.live.core.d.a.a(jSONObject, "invite_service_timestamp", currentTimeMillis2 - currentTimeMillis);
                    com.bytedance.android.live.core.d.a.a(jSONObject, "server_timestamp", currentTimeMillis2);
                    com.bytedance.android.live.liveinteract.cohost.c.b.a("invite_succeed", jSONObject, 0);
                    if (fVar.f15605d && !TextUtils.isEmpty(fVar.f15604c)) {
                        this.f10192a.a().a(fVar.f15604c);
                        DataChannel dataChannel = this.f10192a.n;
                        if (dataChannel != null) {
                            dataChannel.c(t.class, new com.bytedance.android.livesdk.chatroom.c.p(4));
                        }
                    }
                }
            }
            if (th != null) {
                this.f10192a.a(th);
                JSONObject jSONObject2 = new JSONObject();
                com.bytedance.android.live.liveinteract.cohost.c.b.a(jSONObject2, th);
                com.bytedance.android.live.core.d.a.a(jSONObject2, "cost", System.currentTimeMillis() - com.bytedance.android.live.liveinteract.cohost.c.b.f10206a);
                com.bytedance.android.live.liveinteract.cohost.c.b.a("invite_failed", jSONObject2, 1);
                DataChannel dataChannel2 = this.f10192a.n;
                if (dataChannel2 != null) {
                    dataChannel2.c(com.bytedance.android.live.liveinteract.cohost.a.b.h.class);
                }
                this.f10192a.a().e("Invite_Failed");
                this.f10192a.a().af = false;
            }
        }
    }
}
