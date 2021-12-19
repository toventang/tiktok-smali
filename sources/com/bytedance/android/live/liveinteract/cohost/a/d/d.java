package com.bytedance.android.live.liveinteract.cohost.a.d;

import android.text.TextUtils;
import android.view.SurfaceView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.e;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.al;
import com.bytedance.android.live.liveinteract.api.k;
import com.bytedance.android.live.liveinteract.api.m;
import com.bytedance.android.live.liveinteract.api.t;
import com.bytedance.android.live.liveinteract.cohost.a.c.a;
import com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi;
import com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget;
import com.bytedance.android.live.liveinteract.platform.a.a.a;
import com.bytedance.android.live.liveinteract.platform.a.b.b;
import com.bytedance.android.live.liveinteract.platform.a.b.g;
import com.bytedance.android.live.liveinteract.platform.c.c;
import com.bytedance.android.live.liveinteract.platform.common.g.h;
import com.bytedance.android.live.liveinteract.platform.common.g.j;
import com.bytedance.android.live.liveinteract.platform.common.g.u;
import com.bytedance.android.live.liveinteract.platform.common.g.v;
import com.bytedance.android.livesdk.chatroom.c.p;
import com.bytedance.android.livesdk.chatroom.c.q;
import com.bytedance.android.livesdk.chatroom.e.r;
import com.bytedance.android.livesdk.chatroom.viewmodule.bq;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveEnablePerPushInteractiveStreamSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveNetworkTypeModeRateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivePkConnectTimeoutIntervalSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveRandomLinkmicConnectTimeoutIntervalSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.RtcAbLabelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.ShowLinkCrossRoomResetStacktraceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceRatingHighSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostNeedWaitRtcJoinChannelSucceed;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostUserRtcReplyMsgSetting;
import com.bytedance.android.livesdk.model.message.aj;
import com.bytedance.android.livesdk.model.message.as;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.util.rxutils.autodispose.ac;
import com.bytedance.android.livesdk.util.rxutils.f;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ttnet.TTNetInit;
import com.ss.avframework.livestreamv2.core.Client;
import com.ss.avframework.livestreamv2.core.LiveCore;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.ss.bytertc.engine.livertc.LiveRTCEngine;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class d extends r<a> implements b, com.bytedance.android.live.liveinteract.platform.a.b.d, com.bytedance.android.live.liveinteract.platform.c.b {

    /* renamed from: a  reason: collision with root package name */
    public Room f10117a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10118b;

    /* renamed from: c  reason: collision with root package name */
    DataChannel f10119c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.api.a.b f10120d;

    /* renamed from: e  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.match.b.f.a f10121e;
    @com.bytedance.android.live.liveinteract.api.c.d(a = "RTC_CONTROLLER")

    /* renamed from: f  reason: collision with root package name */
    public c f10122f;

    /* renamed from: g  reason: collision with root package name */
    private f.a.b.b f10123g;

    /* renamed from: h  reason: collision with root package name */
    private j f10124h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f10125i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f10126j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f10127k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f10128l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f10129m;
    private boolean n;
    private boolean o;
    private int p = -1;
    @com.bytedance.android.live.liveinteract.api.c.d(a = "LINKER_MANAGER")
    private com.bytedance.android.live.liveinteract.platform.a.c q;
    @com.bytedance.android.live.liveinteract.api.c.d(a = "LIVE_VIDEO_CLIENT_FACTORY", b = true)
    private com.bytedance.android.livesdk.chatroom.interact.b r;
    @com.bytedance.android.live.liveinteract.api.c.d(a = "LINK_MESSAGE_CENTER")
    private g s;
    private com.bytedance.android.live.liveinteract.cohost.e.b t = new com.bytedance.android.live.liveinteract.cohost.e.b();
    private com.bytedance.android.live.liveinteract.cohost.e.c u = new com.bytedance.android.live.liveinteract.cohost.e.c();
    private final com.bytedance.android.live.liveinteract.platform.a.b.a v = new com.bytedance.android.live.liveinteract.platform.a.b.a() {
        /* class com.bytedance.android.live.liveinteract.cohost.a.d.d.AnonymousClass1 */

        static {
            Covode.recordClassIndex(5312);
        }

        @Override // com.bytedance.android.live.liveinteract.platform.a.b.a, com.bytedance.android.live.liveinteract.platform.a.b.c
        public final void a(aj ajVar) {
            if (ajVar.c() == aj.a.ANCHOR_LINKMIC) {
                super.a(ajVar);
                if (d.this.f10118b) {
                    l.d(ajVar, "");
                    JSONObject jSONObject = new JSONObject();
                    com.bytedance.android.live.liveinteract.cohost.c.b.a(jSONObject, ajVar);
                    com.bytedance.android.live.liveinteract.cohost.c.b.a("finish_message", jSONObject, 0);
                    k b2 = d.this.f10120d.b();
                    if (d.this.f10120d.f9940e == ajVar.f19140f && k.CONNECTION_FINISH.compareTo((Enum) b2) > 0) {
                        d.this.f10120d.b(ajVar.v);
                        d.this.b(203);
                        if (!d.this.f10120d.Q && com.bytedance.android.live.liveinteract.cohost.a.e.d.a()) {
                            d.this.f10120d.f9946k = true;
                            if (d.this.w != null) {
                                d.this.w.c(al.class, y.a((int) R.string.du8));
                            }
                            com.bytedance.android.live.liveinteract.cohost.a.c.a.a(a.d.SYSTEM_REMATCH);
                            h.a((Room) null, m.RANDOM_LINK_MIC_INVITE, "");
                            return;
                        }
                        return;
                    }
                    return;
                }
                d.this.b(PrivacyCert.Builder.with("bpea-522").usage("").tag("link mic stop").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
        }
    };

    public interface a extends bq {
        static {
            Covode.recordClassIndex(5314);
        }

        LinkBattleWidget a();

        void a(int i2);

        void a(String str, String str2);

        void a(boolean z);

        void b();

        void b(boolean z);

        void c();

        void d();

        void e();
    }

    static {
        Covode.recordClassIndex(5311);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void a(int i2, long j2, Object... objArr) {
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void a(com.bytedance.android.live.liveinteract.multilive.c.m mVar, String str) {
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void a(String str, boolean z) {
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void b(String str) {
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void b(String str, boolean z) {
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void c(String str) {
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void d(String str) {
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void e(String str) {
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void g() {
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void a(String str, String str2) {
        com.bytedance.android.live.liveinteract.cohost.d.b a2 = com.bytedance.android.live.liveinteract.cohost.e.b.a(str2);
        if (a2 != null && TextUtils.equals(a2.f10212a, "co_host_reply_msg")) {
            long j2 = a2.f10213b;
            l.d(str2, "");
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.core.d.a.a(jSONObject, "message", str2);
            com.bytedance.android.live.core.d.a.a(jSONObject, "channel_id", j2);
            com.bytedance.android.live.liveinteract.cohost.c.b bVar = com.bytedance.android.live.liveinteract.cohost.c.b.f10210e;
            com.bytedance.android.live.liveinteract.cohost.c.b.a((com.bytedance.android.live.liveinteract.cohost.c.b) "receive_reply_with_rtc_room_msg", (String) jSONObject, (JSONObject) 0);
        }
    }

    public final void a(Boolean bool) {
        c cVar = this.f10122f;
        boolean booleanValue = bool.booleanValue();
        Client client = cVar.f11892g;
        if (client != null) {
            client.muteLocalAudio(booleanValue);
        }
    }

    public final void a(boolean z) {
        if (this.f10122f.f11888c) {
            this.f10121e.f10693a = z;
            as asVar = new as();
            asVar.f19205g = z ? 100102 : 100101;
            asVar.f19202d = String.valueOf(u.a().b().c());
            asVar.f19203e = String.valueOf(this.f10120d.L);
            asVar.f19200b = "0";
            asVar.f19201c = "0";
            com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkCross_ForegroundStateChanged", this.f10118b, e.a.f9628b.b(asVar));
            HashMap hashMap = new HashMap();
            hashMap.put("content", e.a.f9628b.b(asVar));
            if (this.q.b(a.EnumC0247a.COHOST) != null) {
                this.q.b(a.EnumC0247a.COHOST).f(hashMap);
            }
        }
        if (!this.f10122f.b()) {
            if (z) {
                this.f10122f.b(this.f10120d.ae);
            } else {
                this.f10122f.g();
            }
            this.f10122f.d();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void a(String str) {
        ((a) this.y).a("OnUserJoined", "position:LinkCross; interactId:".concat(String.valueOf(str)));
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void a(String str, SurfaceView surfaceView) {
        f.a.b.b bVar = this.f10123g;
        if (bVar != null) {
            bVar.dispose();
        }
        JSONObject jSONObject = new JSONObject();
        com.bytedance.android.live.liveinteract.api.a.b a2 = b.a.a();
        long j2 = 1;
        if (a2.C > 0) {
            j2 = System.currentTimeMillis() - a2.C;
        }
        com.bytedance.android.live.core.d.a.a(jSONObject, "cost", j2);
        com.bytedance.android.live.core.d.a.a(jSONObject, "first_joined", String.valueOf(!a2.B ? 1 : 0));
        if (!a2.B) {
            a2.B = true;
        }
        com.bytedance.android.live.liveinteract.cohost.c.b bVar2 = com.bytedance.android.live.liveinteract.cohost.c.b.f10210e;
        com.bytedance.android.live.liveinteract.cohost.c.b.a((com.bytedance.android.live.liveinteract.cohost.c.b) "rtc_first_remote_video", (String) jSONObject, (JSONObject) 0);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void a(String str, long j2) {
        ((a) this.y).a("OnUserLeaved", "position:LinkCross; interactId:".concat(String.valueOf(str)));
        if (this.f10118b && !this.f10120d.Q && this.f10120d.a(k.CONNECTION_SUCCEED)) {
            ao.a(((a) this.y).getContext(), y.a((int) R.string.eey), 6000);
        }
        if (!this.f10120d.Q && com.bytedance.android.live.liveinteract.cohost.a.e.d.a()) {
            this.f10120d.f9946k = true;
            if (this.w != null) {
                this.w.c(al.class, y.a((int) R.string.du8));
            }
            com.bytedance.android.live.liveinteract.cohost.a.c.a.a(a.d.SYSTEM_REMATCH);
            h.a((Room) null, m.RANDOM_LINK_MIC_INVITE, "");
        }
        b(202);
    }

    private void i() {
        this.f10119c.c(com.bytedance.android.live.liveinteract.cohost.a.b.b.class);
    }

    private void l() {
        j jVar = this.f10124h;
        if (jVar != null) {
            jVar.b();
            this.f10124h = null;
        }
    }

    private boolean n() {
        if (this.f10117a.getStreamUrlExtraSafely().f23190l > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        this.f10128l = false;
        this.f10129m = true;
        m();
    }

    @Override // com.bytedance.android.live.liveinteract.platform.a.b.b
    public final void a() {
        b(PrivacyCert.Builder.with("bpea-521").usage("").tag("link mic stop").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
    }

    public final void c() {
        if (this.f10120d.f9941f != 0) {
            ((ac) u.a().b().b(this.f10120d.f9941f).a(u())).a(new p(this), new q(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z h() {
        if (!(this.y == null || this.q.b(a.EnumC0247a.COHOST) == null)) {
            ((ac) this.q.b(a.EnumC0247a.COHOST).c(new HashMap()).a(u())).a(t.f10150a, new u(this));
        }
        return z.f158842a;
    }

    private void j() {
        if (this.f10118b) {
            this.f10119c.c(com.bytedance.android.live.liveinteract.api.l.class, new q(8));
        }
        com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.live.liveinteract.api.b.d(2));
        if (!this.f10118b) {
            this.f10119c.c(t.class, new p(1));
        } else if (!b.a.a().f9946k && b.a.a().o) {
            this.f10119c.c(t.class, new p(1));
        }
        if (ShowLinkCrossRoomResetStacktraceSetting.INSTANCE.getValue() && !this.f10118b) {
            com.bytedance.android.live.core.c.a.a("ttlive_pk", "LinkCrossRoomDataHolder.unloadModule", new IllegalStateException());
        }
    }

    private void k() {
        final Config.VideoQuality videoQuality;
        if (this.y == null || this.f10120d.a(k.CONNECTION_FINISH) || this.f10125i || this.f10122f.f11888c || this.r == null) {
            return;
        }
        if (TextUtils.isEmpty(this.f10120d.v)) {
            com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkCross_TurnOnEngine", "rtcExtInfo is empty!");
            return;
        }
        this.f10125i = true;
        this.f10120d.Z = true;
        this.f10120d.aa = System.currentTimeMillis();
        if (n()) {
            videoQuality = Config.VideoQuality.ANCHOR_HIGH;
        } else {
            videoQuality = Config.VideoQuality.ANCHOR_NORMAL;
        }
        this.f10121e = new com.bytedance.android.live.liveinteract.match.b.f.a(videoQuality);
        this.f10122f.a(this.r, new com.bytedance.android.live.liveinteract.platform.c.a() {
            /* class com.bytedance.android.live.liveinteract.cohost.a.d.d.AnonymousClass2 */

            static {
                Covode.recordClassIndex(5313);
            }

            static final /* synthetic */ String a(String str) {
                try {
                    com.bytedance.frameworks.baselib.network.http.cronet.b.k ttUrlDispatch = TTNetInit.ttUrlDispatch(str);
                    if (TextUtils.isEmpty(ttUrlDispatch.f29086b)) {
                        return str;
                    }
                    return ttUrlDispatch.f29086b;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return str;
                }
            }

            @Override // com.bytedance.android.live.liveinteract.platform.c.a
            public final LiveCore.InteractConfig a(LiveCore.InteractConfig interactConfig) {
                interactConfig.setStreamMixer(d.this.f10121e).setBackgroundColor("#303342").setMixStreamRtmpUrl(d.this.f10117a.getStreamUrl().a());
                interactConfig.setContext(y.e()).setRtcExtInfo(d.this.f10120d.v).setVideoQuality(videoQuality).setCharacter(Config.Character.ANCHOR).setLogReportInterval(5).setProjectKey(((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getProjectKey()).setInteractMode(Config.InteractMode.PK).setMixStreamType(Config.MixStreamType.SERVER_MIX).setSeiVersion(2).setType(Config.Type.VIDEO).setAppChannel(((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).getChannel()).setAppId(String.valueOf(((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).appId())).setAppVersion(((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).getVersionCode());
                interactConfig.setRtcABTestConfig(RtcAbLabelSetting.INSTANCE.getValue());
                interactConfig.setUrlDispatcher(v.f10152a);
                d.this.f10121e.a(interactConfig);
                return interactConfig;
            }
        });
        com.bytedance.android.live.liveinteract.cohost.c.b.b();
        if (!b.a.a().q) {
            this.f10122f.a(false);
        }
    }

    private void m() {
        if (this.y != null) {
            com.bytedance.android.live.liveinteract.platform.common.g.a.a("disableCoHostProgress", true, "mHasRtcJoinedChannel = " + this.f10122f.f11888c + "  mIsFinishingService = " + this.f10128l);
            if (!this.f10122f.f11888c && !this.f10128l) {
                this.f10120d.f9936a = false;
                if (this.w != null) {
                    this.w.c(com.bytedance.android.live.liveinteract.platform.common.c.b.class, false);
                }
                j();
            }
        }
    }

    @Override // com.bytedance.ies.a.b, com.bytedance.android.livesdk.chatroom.e.r
    public final void b() {
        if (this.n && this.w != null) {
            this.w.c(t.class, new p(3));
        }
        l();
        k b2 = b.a.a().b();
        if (this.f10118b && k.CONNECTION_FINISH.compareTo((Enum) b2) > 0) {
            b(205);
        }
        this.f10120d.b(k.UNLOADED);
        f.a.b.b bVar = this.f10123g;
        if (bVar != null) {
            bVar.dispose();
        }
        if (this.w != null) {
            this.w.b(this);
        }
        this.s.b(this.v);
        this.s.b(this);
        this.f10122f.c();
        com.bytedance.android.live.liveinteract.platform.common.g.u.a();
        if (this.f10117a != null) {
            ((com.bytedance.android.live.f.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.f.a.class)).likeMicStateChange(this.f10117a.getId(), 1, this.f10118b);
        }
        super.b();
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void f() {
        this.f10120d.b(k.CONNECTION_FINISH_SUCCEED);
        JSONObject jSONObject = new JSONObject();
        com.bytedance.android.live.liveinteract.cohost.c.b bVar = com.bytedance.android.live.liveinteract.cohost.c.b.f10210e;
        com.bytedance.android.live.liveinteract.cohost.c.b.a((com.bytedance.android.live.liveinteract.cohost.c.b) "rtc_offline", (String) jSONObject, (JSONObject) 0);
        this.f10126j = false;
        this.f10127k = false;
        this.f10120d.Z = false;
        m();
        l();
        if (this.w != null) {
            this.w.c(com.bytedance.android.live.liveinteract.api.g.class, new com.bytedance.android.live.liveinteract.api.b.e(false, null));
        }
        if (this.y != null) {
            ((a) this.y).a("onEndSuccess", "position:LinkCross");
        }
        com.bytedance.android.live.liveinteract.platform.common.g.u.a();
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void e() {
        Config.VideoQuality videoQuality;
        boolean z;
        boolean z2;
        int i2;
        if (this.y != null) {
            ((a) this.y).a("OnStartSuccess", "position:LinkCross, replied = " + this.f10120d.f9938c);
        }
        this.f10126j = true;
        if (this.o && (i2 = this.p) > 0) {
            a(i2);
        }
        this.f10120d.W = System.currentTimeMillis() - this.f10120d.aa;
        long j2 = this.f10120d.W;
        JSONObject jSONObject = new JSONObject();
        com.bytedance.android.live.core.d.a.a(jSONObject, "cost", j2);
        com.bytedance.android.live.liveinteract.cohost.c.b bVar = com.bytedance.android.live.liveinteract.cohost.c.b.f10210e;
        com.bytedance.android.live.liveinteract.cohost.c.b.a((com.bytedance.android.live.liveinteract.cohost.c.b) "rtc_join_channel_succeed", (String) jSONObject, (JSONObject) 0);
        if (this.w != null) {
            this.w.c(com.bytedance.android.live.liveinteract.api.g.class, new com.bytedance.android.live.liveinteract.api.b.e(true, this.f10120d.d().name()));
        }
        String a2 = this.f10117a.getStreamUrl().a();
        long id = this.f10117a.getId();
        String lowerCase = this.f10120d.d().name().toLowerCase();
        if (n()) {
            videoQuality = Config.VideoQuality.ANCHOR_HIGH;
        } else {
            videoQuality = Config.VideoQuality.ANCHOR_NORMAL;
        }
        j jVar = new j(lowerCase, a2, id, videoQuality.getWidth(), videoQuality.getHeight(), videoQuality.getBitrate(), videoQuality.getFps());
        this.f10124h = jVar;
        jVar.a();
        if (this.f10120d.f9938c) {
            c(PrivacyCert.Builder.with("bpea-500").usage("").tag("link mic start push stream").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        } else if (!this.f10122f.b() && this.f10120d.q) {
            boolean value = LiveEnablePerPushInteractiveStreamSetting.INSTANCE.getValue();
            if (TTliveAnchorDeviceScoreSetting.INSTANCE.getValue() >= TTliveAnchorDeviceRatingHighSetting.INSTANCE.getValue()) {
                z = true;
            } else {
                z = false;
            }
            boolean z3 = b.a.a().f9945j;
            if (TTNetInit.getEffectiveConnectionType() >= LiveNetworkTypeModeRateSetting.INSTANCE.getValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (value && z && z3 && z2) {
                this.f10122f.a(PrivacyCert.Builder.with("bpea-506").usage("").tag("link mic start to push stream").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                com.bytedance.android.live.liveinteract.cohost.c.b.a(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z c(int i2) {
        e(i2);
        return null;
    }

    public final void b(PrivacyCert privacyCert) {
        if (this.y != null) {
            if (this.f10118b) {
                e(privacyCert);
            } else {
                j();
            }
        }
    }

    private void d(PrivacyCert privacyCert) {
        if (this.f10120d.f9940e == 0) {
            ((a) this.y).c();
            j();
        } else if (this.f10122f.f11888c) {
            c(privacyCert);
        } else {
            k();
            if (!CoHostNeedWaitRtcJoinChannelSucceed.INSTANCE.getValue()) {
                c(privacyCert);
            }
        }
    }

    private void e(PrivacyCert privacyCert) {
        if (this.f10120d.b(k.CONNECTION_FINISH)) {
            com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkCross_TurnOffEngine", "isControllerNotNull:" + this.f10122f.f11889d);
            this.f10122f.a(privacyCert, "");
            com.bytedance.android.live.liveinteract.cohost.c.b.c();
        }
    }

    public d(DataChannel dataChannel) {
        this.f10119c = dataChannel;
        this.f10117a = (Room) dataChannel.b(df.class);
        this.f10118b = ((Boolean) dataChannel.b(ee.class)).booleanValue();
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(b.a.a(), null);
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(new c(), null);
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(this);
    }

    private void c(PrivacyCert privacyCert) {
        if (!this.f10127k) {
            if (!b.a.a().q) {
                com.bytedance.android.live.liveinteract.cohost.c.b.a(false);
                this.f10122f.a(privacyCert);
                this.f10122f.a(true);
            } else if (!this.f10122f.f11890e) {
                com.bytedance.android.live.liveinteract.cohost.c.b.a(false);
                this.f10122f.a(privacyCert);
            }
            b.a.a().f9939d = true;
            this.f10127k = true;
            com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkCross_RTC_START", true);
            com.bytedance.android.live.liveinteract.cohost.c.b bVar = com.bytedance.android.live.liveinteract.cohost.c.b.f10210e;
            com.bytedance.android.live.liveinteract.cohost.c.b.a((com.bytedance.android.live.liveinteract.cohost.c.b) "rtc_mix_stream", (String) new JSONObject(), (JSONObject) 0);
            this.f10122f.d();
        }
    }

    private void d(int i2) {
        boolean z;
        com.bytedance.android.live.core.c.a.a(3, "LinkCrossRoomTAG", "finishServer, finishCode = ".concat(String.valueOf(i2)));
        if (!this.f10129m && !this.f10128l) {
            boolean z2 = true;
            this.f10128l = true;
            try {
                if (com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.a() != com.bytedance.android.live.liveinteract.match.b.b.c.NORMAL) {
                    z = true;
                } else {
                    z = false;
                }
                com.bytedance.android.live.core.c.a.a(3, "LinkCrossRoomTAG", "finish, isBattling = " + z + "  state = " + com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.a());
                if (!z || ((a) this.y).a() == null) {
                    e(i2);
                    return;
                }
                if (i2 != 202) {
                    z2 = false;
                }
                ((a) this.y).a().a(103, z2, new g(this, i2));
            } catch (Exception unused) {
                com.bytedance.android.live.core.c.a.a(6, "LinkCrossRoomTAG", "finishServer , npe");
                e(i2);
            }
        }
    }

    private void e(int i2) {
        if (this.y != null) {
            com.bytedance.android.live.liveinteract.platform.common.g.a.a("FINISH_CROSS", "finishCode = ".concat(String.valueOf(i2)));
            long j2 = this.f10120d.f9940e;
            HashMap hashMap = new HashMap();
            hashMap.put("needSuggest", false);
            if (i2 == 201 && b.a.a().ah) {
                hashMap.put("needSuggest", true);
                hashMap.put("guest_user_id", Long.valueOf(this.f10120d.f9941f));
            }
            hashMap.put("channel_id", Long.valueOf(j2));
            hashMap.put("finishCode", Integer.valueOf(i2));
            if (this.q.b(a.EnumC0247a.COHOST) == null) {
                d();
            } else {
                ((ac) this.q.b(a.EnumC0247a.COHOST).d(hashMap).a(u())).a(new h(this), new i(this));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        LiveRTCEngine rtcEngine;
        if (CoHostUserRtcReplyMsgSetting.INSTANCE.getValue() && this.f10122f != null) {
            String str = this.f10120d.M;
            long j2 = 0;
            if (this.f10120d.f9940e > 0 && !TextUtils.isEmpty(str)) {
                if (!this.f10126j) {
                    this.p = i2;
                    this.o = true;
                    return;
                }
                this.o = false;
                com.bytedance.android.live.liveinteract.api.a.b bVar = this.u.f10220a;
                if (bVar == null) {
                    l.a("mDataHolder");
                }
                long j3 = bVar.f9940e;
                if (j3 > 0) {
                    com.bytedance.android.live.liveinteract.cohost.d.b bVar2 = new com.bytedance.android.live.liveinteract.cohost.d.b("co_host_reply_msg", j3, e.a.f9629c.b(new com.bytedance.android.live.liveinteract.cohost.d.a(i2)));
                    String b2 = e.a.f9629c.b(bVar2);
                    l.d(str, "");
                    l.d(b2, "");
                    JSONObject jSONObject = new JSONObject();
                    com.bytedance.android.live.core.d.a.a(jSONObject, "target_linkmic_id", str);
                    com.bytedance.android.live.core.d.a.a(jSONObject, "message", b2);
                    com.bytedance.android.live.core.d.a.a(jSONObject, "reply_status", String.valueOf(i2));
                    com.bytedance.android.live.liveinteract.cohost.c.b bVar3 = com.bytedance.android.live.liveinteract.cohost.c.b.f10210e;
                    com.bytedance.android.live.liveinteract.cohost.c.b.a((com.bytedance.android.live.liveinteract.cohost.c.b) "send_reply_with_rtc_msg", (String) jSONObject, (JSONObject) 0);
                    c cVar = this.f10122f;
                    l.d(str, "");
                    l.d(b2, "");
                    Client client = cVar.f11892g;
                    if (!(client == null || (rtcEngine = client.getRtcEngine()) == null)) {
                        j2 = rtcEngine.sendUserMessage(str, b2);
                    }
                    l.d(str, "");
                    l.d(bVar2, "");
                    if (!com.bytedance.android.live.liveinteract.cohost.e.a.f10216b.containsKey(Long.valueOf(j2))) {
                        com.bytedance.android.live.liveinteract.cohost.e.a.f10216b.put(Long.valueOf(j2), str);
                    }
                    if (!com.bytedance.android.live.liveinteract.cohost.e.a.f10217c.containsKey(Long.valueOf(j2))) {
                        com.bytedance.android.live.liveinteract.cohost.e.a.f10217c.put(Long.valueOf(j2), Integer.valueOf(i2));
                    }
                    if (!com.bytedance.android.live.liveinteract.cohost.e.a.f10215a.containsKey(Long.valueOf(j2))) {
                        com.bytedance.android.live.liveinteract.cohost.e.a.f10215a.put(Long.valueOf(j2), bVar2);
                    }
                    l.d(b2, "");
                    JSONObject jSONObject2 = new JSONObject();
                    com.bytedance.android.live.core.d.a.a(jSONObject2, "message", b2);
                    com.bytedance.android.live.liveinteract.cohost.c.b bVar4 = com.bytedance.android.live.liveinteract.cohost.c.b.f10210e;
                    com.bytedance.android.live.liveinteract.cohost.c.b.a((com.bytedance.android.live.liveinteract.cohost.c.b) "send_reply_with_rtc_room_msg", (String) jSONObject2, (JSONObject) 0);
                    this.f10122f.d(b2);
                }
            }
        }
    }

    public final void b(int i2) {
        com.bytedance.android.live.core.c.a.a(3, "LinkCrossRoomTAG", "finish, finishCode = " + i2 + "   channelId = " + this.f10120d.f9940e);
        if (this.f10120d.f9940e > 0) {
            i();
            d(i2);
            b(PrivacyCert.Builder.with("bpea-523").usage("").tag("link mic stop").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b1, code lost:
        if (r1.f11889d != false) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.android.live.liveinteract.cohost.a.d.d.a r6) {
        /*
        // Method dump skipped, instructions count: 184
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.cohost.a.d.d.a(com.bytedance.android.live.liveinteract.cohost.a.d.d$a):void");
    }

    public final void a(PrivacyCert privacyCert) {
        int value;
        if (this.y != null && !this.f10120d.f9936a) {
            this.f10120d.f9936a = true;
            if (this.w != null) {
                this.w.c(com.bytedance.android.live.liveinteract.platform.common.c.b.class, true);
            }
            this.f10120d.b(k.CONNECTION_START);
            com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkCross_TurnOnEngine");
            this.f10119c.c(com.bytedance.android.live.liveinteract.api.l.class, new q(7));
            d(privacyCert);
            if (!this.f10120d.a(k.CONNECTION_SUCCEED)) {
                if (b.a.a().n) {
                    value = LiveRandomLinkmicConnectTimeoutIntervalSetting.INSTANCE.getValue();
                } else {
                    value = LivePkConnectTimeoutIntervalSetting.INSTANCE.getValue();
                }
                long j2 = (long) value;
                this.f10123g = ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) f.a.t.b(j2, TimeUnit.SECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(t())).a(new r(this, j2), new s(this));
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void a(long j2, int i2) {
        JSONObject jSONObject = new JSONObject();
        com.bytedance.android.live.core.d.a.a(jSONObject, "status", String.valueOf(i2));
        com.bytedance.android.live.liveinteract.cohost.c.b bVar = com.bytedance.android.live.liveinteract.cohost.c.b.f10210e;
        com.bytedance.android.live.liveinteract.cohost.c.b.a((com.bytedance.android.live.liveinteract.cohost.c.b) "send_reply_with_rtc_room_msg_result", (String) jSONObject, (JSONObject) 0);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void b(int i2, String str) {
        this.f10127k = false;
        this.f10120d.Z = false;
        m();
        if (this.y != null) {
            ((a) this.y).a("OnEndFailed", "position:LinkCross; code:" + i2 + "; desc:" + str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void a(long j2, long j3) {
        com.bytedance.android.live.core.c.a.a(4, "bitrate_callback", j2 + " " + j3);
        if (this.y != null) {
            ((a) this.y).e();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void c(int i2, String str) {
        long j2 = (long) i2;
        com.bytedance.android.live.liveinteract.platform.common.g.p.a(com.bytedance.android.live.liveinteract.platform.common.g.p.f11999b, j2, str);
        l.d(str, "");
        JSONObject jSONObject = new JSONObject();
        com.bytedance.android.live.core.d.a.a(jSONObject, "error_code", 104L);
        com.bytedance.android.live.core.d.a.a(jSONObject, "error_msg", j2);
        com.bytedance.android.live.core.d.a.a(jSONObject, "error_detail", str);
        com.bytedance.android.live.liveinteract.cohost.c.b.a("rtc_error", jSONObject, 1);
        v.a(com.bytedance.android.live.liveinteract.platform.common.g.e.a(jSONObject));
        if (this.f10120d.f9937b && !this.f10120d.f9938c) {
            com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkCross_onError_Before_Reply", true, "position:LinkCross; code:" + i2 + "; desc:" + str);
            this.f10119c.c(com.bytedance.android.live.liveinteract.cohost.a.b.c.class);
        } else if (this.y != null) {
            ((a) this.y).b();
            ((a) this.y).a("OnError", "position:LinkCross; code:" + i2 + ";message:" + str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void a(int i2, String str) {
        this.f10120d.Z = false;
        long j2 = (long) i2;
        com.bytedance.android.live.liveinteract.platform.common.g.p.a(com.bytedance.android.live.liveinteract.platform.common.g.p.f11999b, j2, str);
        l.d(str, "");
        JSONObject jSONObject = new JSONObject();
        com.bytedance.android.live.core.d.a.a(jSONObject, "error_code", 104L);
        com.bytedance.android.live.core.d.a.a(jSONObject, "error_msg", j2);
        com.bytedance.android.live.core.d.a.a(jSONObject, "error_detail", str);
        com.bytedance.android.live.liveinteract.cohost.c.b bVar = com.bytedance.android.live.liveinteract.cohost.c.b.f10210e;
        com.bytedance.android.live.liveinteract.cohost.c.b.a((com.bytedance.android.live.liveinteract.cohost.c.b) "rtc_join_channel_failed", (String) jSONObject, (JSONObject) 0);
        v.a(com.bytedance.android.live.liveinteract.platform.common.g.e.a(jSONObject));
        if (!this.f10120d.f9937b || this.f10120d.f9938c) {
            if (this.y != null) {
                ((a) this.y).b();
                ((a) this.y).a("OnStartFailed", "position:LinkCross; code:" + i2 + "; desc:" + str);
            }
            f.a.b.b bVar2 = this.f10123g;
            if (bVar2 != null) {
                bVar2.dispose();
            }
            this.f10120d.C = 0;
            return;
        }
        com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkCross_OnStartFailed_Before_Reply", true, "position:LinkCross; code:" + i2 + "; desc:" + str);
        this.f10119c.c(com.bytedance.android.live.liveinteract.cohost.a.b.c.class);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void b(long j2, int i2) {
        com.bytedance.android.live.liveinteract.cohost.d.b bVar = com.bytedance.android.live.liveinteract.cohost.e.a.f10215a.get(Long.valueOf(j2));
        if (bVar != null) {
            if (TextUtils.equals(bVar.f10212a, "co_host_reply_msg")) {
                int intValue = com.bytedance.android.live.liveinteract.cohost.e.a.f10217c.get(Long.valueOf(j2)).intValue();
                String str = com.bytedance.android.live.liveinteract.cohost.e.a.f10216b.get(Long.valueOf(j2));
                String b2 = e.a.f9629c.b(bVar);
                l.d(str, "");
                l.d(b2, "");
                JSONObject jSONObject = new JSONObject();
                com.bytedance.android.live.core.d.a.a(jSONObject, "target_linkmic_id", str);
                com.bytedance.android.live.core.d.a.a(jSONObject, "message", b2);
                com.bytedance.android.live.core.d.a.a(jSONObject, "reply_status", String.valueOf(intValue));
                com.bytedance.android.live.core.d.a.a(jSONObject, "status", String.valueOf(i2));
                com.bytedance.android.live.liveinteract.cohost.c.b bVar2 = com.bytedance.android.live.liveinteract.cohost.c.b.f10210e;
                com.bytedance.android.live.liveinteract.cohost.c.b.a((com.bytedance.android.live.liveinteract.cohost.c.b) "send_reply_with_rtc_msg_result", (String) jSONObject, (JSONObject) 0);
            }
            if (com.bytedance.android.live.liveinteract.cohost.e.a.f10216b.containsKey(Long.valueOf(j2))) {
                com.bytedance.android.live.liveinteract.cohost.e.a.f10216b.remove(Long.valueOf(j2));
            }
            if (com.bytedance.android.live.liveinteract.cohost.e.a.f10217c.containsKey(Long.valueOf(j2))) {
                com.bytedance.android.live.liveinteract.cohost.e.a.f10217c.remove(Long.valueOf(j2));
            }
            if (com.bytedance.android.live.liveinteract.cohost.e.a.f10215a.containsKey(Long.valueOf(j2))) {
                com.bytedance.android.live.liveinteract.cohost.e.a.f10215a.remove(Long.valueOf(j2));
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.a.b.d
    public final void c(long j2, int i2) {
        try {
            if (this.f10118b && j2 == this.f10120d.f9941f && this.f10121e != null) {
                if (i2 == 100102) {
                    ((a) this.y).a(true);
                    this.f10121e.f10694b = true;
                } else if (i2 == 100101) {
                    ((a) this.y).a(false);
                    this.f10121e.f10694b = false;
                }
                this.f10122f.d();
            }
        } catch (NumberFormatException e2) {
            com.bytedance.android.live.core.c.a.b(e2.toString());
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void b(String str, SurfaceView surfaceView) {
        long j2;
        boolean z;
        f.a.b.b bVar = this.f10123g;
        if (bVar != null) {
            bVar.dispose();
        }
        if (this.y != null) {
            com.bytedance.android.live.core.c.a.a(3, "LinkCrossRoomTAG", "receive remote first frame");
            com.bytedance.android.live.liveinteract.api.a.b a2 = b.a.a();
            if (a2.C > 0) {
                j2 = System.currentTimeMillis() - a2.C;
            } else {
                j2 = 1;
            }
            a2.C = 0;
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.core.d.a.a(jSONObject, "duration", j2);
            com.bytedance.android.live.core.d.a.a(jSONObject, "cost", j2);
            com.bytedance.android.live.core.d.a.a(jSONObject, "first_joined", String.valueOf(!a2.A ? 1 : 0));
            if (!a2.A) {
                a2.A = true;
            }
            com.bytedance.android.live.liveinteract.cohost.c.b bVar2 = com.bytedance.android.live.liveinteract.cohost.c.b.f10210e;
            com.bytedance.android.live.liveinteract.cohost.c.b.a((com.bytedance.android.live.liveinteract.cohost.c.b) "rtc_first_frame_render", (String) jSONObject, (JSONObject) 0);
            com.bytedance.android.live.core.d.c.a("ttlive_client_linkmic_anchor_frist_frame", j2, com.bytedance.android.live.liveinteract.platform.common.g.e.a(jSONObject));
            JSONObject a3 = com.bytedance.android.live.liveinteract.platform.common.g.e.a(jSONObject);
            l.d(a3, "");
            com.bytedance.android.live.core.d.c.b(v.f12028a, 0, a3);
            if (this.f10120d.b(k.CONNECTION_SUCCEED)) {
                p pVar = new p(2);
                pVar.f15137b = surfaceView;
                DataChannel dataChannel = this.f10119c;
                if (dataChannel != null) {
                    dataChannel.c(t.class, pVar);
                    this.f10119c.c(com.bytedance.android.live.liveinteract.api.q.class, "");
                    this.n = true;
                }
                ((a) this.y).a("OnFirstRemoteVideoFrame", "position:LinkCross; interactId:".concat(String.valueOf(str)));
                ((a) this.y).d();
                com.bytedance.android.live.liveinteract.match.c.a.a(com.bytedance.android.live.liveinteract.match.c.a.f10803g, "check_permission_request", new JSONObject(), false, 12);
                com.bytedance.android.live.liveinteract.match.c.a.f10797a = System.currentTimeMillis();
                ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) ((LinkBattleApi) com.bytedance.android.live.network.e.a().a(LinkBattleApi.class)).checkPermission().a(u())).a(new j(this), new k(this));
                f.a.b.b bVar3 = com.bytedance.android.live.liveinteract.platform.common.g.u.f12018g;
                if (bVar3 != null) {
                    bVar3.dispose();
                }
                u.d.a();
                try {
                    if (com.bytedance.android.live.liveinteract.platform.common.g.u.f12013b == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    } else if (com.bytedance.android.live.liveinteract.platform.common.g.u.f12014c == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    } else if (com.bytedance.android.live.liveinteract.platform.common.g.u.f12015d != null) {
                        if (com.bytedance.android.live.liveinteract.platform.common.g.u.f12016e.get("inviter_id") == null || !(!l.a((Object) com.bytedance.android.live.liveinteract.platform.common.g.u.f12016e.get("inviter_id"), (Object) ""))) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (!z) {
                            throw new IllegalStateException("Check failed.".toString());
                        } else if (com.bytedance.android.live.liveinteract.platform.common.g.u.f12017f.get("invitee_id") == null || !(!l.a((Object) com.bytedance.android.live.liveinteract.platform.common.g.u.f12017f.get("invitee_id"), (Object) ""))) {
                            throw new IllegalStateException("Check failed.".toString());
                        } else {
                            com.bytedance.android.live.liveinteract.platform.common.g.u.f12018g = f.a.t.a(1, TimeUnit.MINUTES).a(new f()).a(u.e.f12024a, u.f.f12025a);
                            if (this.f10117a != null) {
                                ((com.bytedance.android.live.f.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.f.a.class)).likeMicStateChange(this.f10117a.getId(), 0, this.f10118b);
                            }
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                } catch (IllegalStateException unused) {
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void b(String str, String str2) {
        com.bytedance.android.live.liveinteract.cohost.d.a aVar;
        com.bytedance.android.live.liveinteract.cohost.d.b a2 = com.bytedance.android.live.liveinteract.cohost.e.b.a(str2);
        if (a2 != null && a2.f10213b == this.f10120d.f9940e && TextUtils.equals(a2.f10212a, "co_host_reply_msg") && (aVar = (com.bytedance.android.live.liveinteract.cohost.d.a) com.bytedance.android.live.liveinteract.cohost.e.b.a(a2.f10214c, com.bytedance.android.live.liveinteract.cohost.d.a.class)) != null) {
            int i2 = aVar.f10211a;
            String b2 = e.a.f9629c.b(a2);
            l.d(str, "");
            l.d(b2, "");
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.core.d.a.a(jSONObject, "from_linkmic_id", str);
            com.bytedance.android.live.core.d.a.a(jSONObject, "message", b2);
            com.bytedance.android.live.core.d.a.a(jSONObject, "reply_status", String.valueOf(i2));
            com.bytedance.android.live.liveinteract.cohost.c.b bVar = com.bytedance.android.live.liveinteract.cohost.c.b.f10210e;
            com.bytedance.android.live.liveinteract.cohost.c.b.a((com.bytedance.android.live.liveinteract.cohost.c.b) "receive_reply_with_rtc_msg", (String) jSONObject, (JSONObject) 0);
            if (!this.f10120d.f9938c) {
                this.w.c(com.bytedance.android.live.liveinteract.cohost.a.b.d.class, Integer.valueOf(aVar.f10211a));
            }
        }
    }
}
