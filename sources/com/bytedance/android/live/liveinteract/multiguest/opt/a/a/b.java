package com.bytedance.android.live.liveinteract.multiguest.opt.a.a;

import android.text.TextUtils;
import android.view.SurfaceView;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.e;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.ae;
import com.bytedance.android.live.liveinteract.api.at;
import com.bytedance.android.live.liveinteract.api.au;
import com.bytedance.android.live.liveinteract.cohost.a.c.a;
import com.bytedance.android.live.liveinteract.multiguest.a.c.c;
import com.bytedance.android.live.liveinteract.multiguest.a.c.d;
import com.bytedance.android.live.liveinteract.multiguest.a.f.f;
import com.bytedance.android.live.liveinteract.multiguest.d.a;
import com.bytedance.android.live.liveinteract.multilive.anchor.c.e;
import com.bytedance.android.live.liveinteract.platform.a.a.a;
import com.bytedance.android.live.liveinteract.platform.c.b;
import com.bytedance.android.live.liveinteract.platform.common.g.p;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.b.a.g;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.viewmodule.bq;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkInteractAudienceOptEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractAudienceTimeOutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.RtcAbLabelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveLinkmicModeSwitchOpenSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveSeiTalkSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisableMixStreamTypeSetting;
import com.bytedance.android.livesdk.model.message.aj;
import com.bytedance.android.livesdk.util.rxutils.autodispose.ac;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.avframework.livestreamv2.core.LiveCore;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import f.a.ab;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class b extends com.bytedance.android.livesdk.chatroom.e.r<f.a> implements a.AbstractC0214a, e.a, com.bytedance.android.live.liveinteract.platform.c.b, OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public boolean f11306a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11307b;

    /* renamed from: c  reason: collision with root package name */
    public a f11308c;
    @com.bytedance.android.live.liveinteract.api.c.d(a = "LINK_USER_INFO_CENTER")

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.a.c.d f11309d;
    @com.bytedance.android.live.liveinteract.api.c.d(a = "LINKER_MANAGER")

    /* renamed from: e  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.platform.a.c f11310e;
    @com.bytedance.android.live.liveinteract.api.c.d(a = "RTC_CONTROLLER")

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.platform.c.c f11311f;
    @com.bytedance.android.live.liveinteract.api.c.d(a = "LIVE_VIDEO_CLIENT_FACTORY")

    /* renamed from: g  reason: collision with root package name */
    public com.bytedance.android.livesdk.chatroom.interact.b f11312g;
    @com.bytedance.android.live.liveinteract.api.c.d(a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: h  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.opt.a.a f11313h;

    /* renamed from: i  reason: collision with root package name */
    public volatile boolean f11314i;

    /* renamed from: j  reason: collision with root package name */
    public HashMap<String, Boolean> f11315j = new HashMap<>();

    /* renamed from: k  reason: collision with root package name */
    public f.a.b.b f11316k;

    /* renamed from: l  reason: collision with root package name */
    public final Map<Long, f.a.b.b> f11317l = new HashMap();

    /* renamed from: m  reason: collision with root package name */
    public final Config.Vendor f11318m = Config.Vendor.BYTE;
    public final Room n;
    public final DataChannel o;
    private com.bytedance.android.live.liveinteract.platform.common.g.j p;
    private boolean q;
    private final h.h r = h.i.a((h.f.a.a) o.f11331a);
    private final h.h s = h.i.a((h.f.a.a) new q(this));
    private final h.h t = h.i.a((h.f.a.a) new p(this));
    private IMessageManager u;
    private final d.a v = new r(this);

    static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final i f11319a = new i();

        static {
            Covode.recordClassIndex(6091);
        }

        i() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(6082);
    }

    private final com.bytedance.android.livesdk.b.a.d m() {
        return (com.bytedance.android.livesdk.b.a.d) this.r.getValue();
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void a(int i2, long j2, Object... objArr) {
        h.f.b.l.d(objArr, "");
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void b(long j2, int i2) {
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void d(String str) {
        h.f.b.l.d(str, "");
    }

    public final com.bytedance.android.live.liveinteract.multilive.d.b h() {
        return (com.bytedance.android.live.liveinteract.multilive.d.b) this.s.getValue();
    }

    public final void a(f.a aVar) {
        super.a((bq) aVar);
        com.bytedance.android.livesdk.b.a.d.a().f14181b = true;
        com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = this.f11309d;
        if (dVar == null) {
            h.f.b.l.a("mInfoCenter");
        }
        dVar.a(this.v);
        com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar2 = this.f11309d;
        if (dVar2 == null) {
            h.f.b.l.a("mInfoCenter");
        }
        dVar2.a();
        com.bytedance.android.live.liveinteract.platform.c.c cVar = this.f11311f;
        if (cVar == null) {
            h.f.b.l.a("mRtcController");
        }
        cVar.a(this);
        IMessageManager iMessageManager = (IMessageManager) this.o.b(cg.class);
        if (iMessageManager != null) {
            this.u = iMessageManager;
            com.bytedance.android.live.liveinteract.multiguest.a.c.c.f11062c = iMessageManager;
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.MEMBER.getIntType(), com.bytedance.android.live.liveinteract.multiguest.a.c.c.f11065f);
            com.bytedance.android.live.liveinteract.multiguest.a.c.c.f11063d = true;
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.LINK_MESSAGE.getIntType(), this);
        }
        this.o.a(this, com.bytedance.android.live.liveinteract.api.v.class, new a(this)).a(this, com.bytedance.android.live.liveinteract.multilive.c.b.class, new C0221b(this)).a(this, at.class, new c(this)).a(this, com.bytedance.android.live.liveinteract.multilive.anchor.b.c.class, new d(this)).a(this, com.bytedance.android.live.liveinteract.multilive.a.a.a.class, new e(this)).a(this, com.bytedance.android.live.liveinteract.multilive.c.c.class, new f(this)).a(this, com.bytedance.android.live.liveinteract.platform.common.c.e.class, new g(this)).a(this, com.bytedance.android.live.liveinteract.api.w.class, new h(this));
    }

    public final void a(long j2, String str, String str2, int i2, boolean z) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        if (this.y != null) {
            if (i2 == 2) {
                a(j2, str, str2, i2);
                return;
            }
            if (z) {
                if (this.f11315j.containsKey(str2)) {
                    a aVar = this.f11308c;
                    if (aVar != null) {
                        aVar.a(new Throwable("Current user is permitting"));
                        return;
                    }
                    return;
                }
                this.f11315j.put(str2, true);
                this.f11316k = com.bytedance.android.livesdk.utils.b.b.a(1, TimeUnit.SECONDS).b(5).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new u(this, str2));
            }
            this.f11314i = true;
            g.a.f14199a.a(j2, str2);
            com.bytedance.android.livesdk.b.a.d a2 = com.bytedance.android.livesdk.b.a.d.a();
            h.f.b.l.b(a2, "");
            a2.a(true);
            DataChannel dataChannel = this.w;
            if (dataChannel != null) {
                dataChannel.c(com.bytedance.android.live.liveinteract.platform.common.c.i.class);
            }
            com.bytedance.android.livesdk.b.a.d m2 = m();
            if (m2 != null) {
                m2.a(j2);
            }
            j();
            a(j2, str, str2, i2);
        }
    }

    public final void a(com.bytedance.android.live.liveinteract.platform.a.c.a aVar, long j2, String str, String str2) {
        com.bytedance.android.livesdk.chatroom.model.b.a.c cVar;
        if (com.bytedance.android.live.liveinteract.cohost.a.c.a.b()) {
            com.bytedance.android.live.liveinteract.cohost.a.c.a.a(a.b.DISCONNECT);
        }
        this.f11314i = false;
        DataChannel dataChannel = this.w;
        if (dataChannel != null) {
            dataChannel.c(com.bytedance.android.live.liveinteract.api.u.class, "");
        }
        if (aVar.f11883a instanceof com.bytedance.android.live.network.response.d) {
            Object obj = aVar.f11883a;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.bytedance.android.live.network.response.Response<com.bytedance.android.livesdk.chatroom.model.interact.audience.PermitResult>");
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            if (!(dVar == null || (cVar = (com.bytedance.android.livesdk.chatroom.model.b.a.c) dVar.data) == null)) {
                g.a.f14199a.a(j2, cVar.f15701e);
                g.a.f14199a.a(cVar.f15702f, cVar.f15701e);
                String b2 = e.a.f9628b.b(cVar);
                h.f.b.l.b(b2, "");
                h.f.b.l.d(b2, "");
                h.f.b.l.d(str2, "");
                JSONObject jSONObject = new JSONObject();
                com.bytedance.android.live.core.d.a.a(jSONObject, "response", b2);
                com.bytedance.android.live.core.d.a.a(jSONObject, "guest_user_id", j2);
                com.bytedance.android.live.core.d.a.a(jSONObject, "guest_linkmic_id", str2);
                com.bytedance.android.live.core.d.a.a(jSONObject, "cost", System.currentTimeMillis() - com.bytedance.android.live.liveinteract.platform.common.g.i.f11973c);
                com.bytedance.android.live.liveinteract.platform.common.g.i.a(jSONObject, Long.valueOf(j2), str2);
                com.bytedance.android.live.liveinteract.platform.common.g.i.a(com.bytedance.android.live.liveinteract.platform.common.g.i.f11979j, true, "permit_succeed", jSONObject);
            }
        }
        f.a aVar2 = (f.a) this.y;
        if (aVar2 != null) {
            aVar2.a(str2);
        }
        b(j2, str, str2);
        a aVar3 = this.f11308c;
        if (aVar3 != null) {
            aVar3.a(j2);
        }
        TextUtils.isEmpty("");
        HashMap hashMap = new HashMap();
        hashMap.put("guest_connection_type", "video");
        if (!TextUtils.isEmpty("")) {
            com.bytedance.android.live.liveinteract.platform.common.g.h.a("guest_connection_agree", hashMap, "live_take_detail");
        } else {
            com.bytedance.android.live.liveinteract.platform.common.g.h.a("guest_connection_agree", hashMap);
        }
    }

    public final void a(long j2, String str, String str2) {
        ab<com.bytedance.android.live.liveinteract.platform.a.c.a> i2;
        ac acVar;
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        if (this.y != null && !this.f11306a) {
            com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = this.f11309d;
            if (dVar == null) {
                h.f.b.l.a("mInfoCenter");
            }
            String a2 = dVar.a(j2);
            h.f.b.l.d(str2, "");
            h.f.b.l.d(a2, "");
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.core.d.a.a(jSONObject, "guest_user_id", j2);
            com.bytedance.android.live.core.d.a.a(jSONObject, "request_source", str2);
            com.bytedance.android.live.core.d.a.a(jSONObject, "guest_linkmic_id", a2);
            com.bytedance.android.live.liveinteract.platform.common.g.i.a(jSONObject, Long.valueOf(j2), a2);
            com.bytedance.android.live.liveinteract.platform.common.g.i.a(com.bytedance.android.live.liveinteract.platform.common.g.i.f11979j, true, "kick_out_request", jSONObject);
            com.bytedance.android.live.liveinteract.platform.common.g.i.f11975e = System.currentTimeMillis();
            com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkIn_kickOut", "roomId:" + this.n.getId() + "; userId:" + j2 + "; secUserId:" + str);
            com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar2 = this.f11309d;
            if (dVar2 == null) {
                h.f.b.l.a("mInfoCenter");
            }
            String a3 = dVar2.a(j2);
            com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar3 = this.f11309d;
            if (dVar3 == null) {
                h.f.b.l.a("mInfoCenter");
            }
            com.bytedance.android.livesdk.chatroom.model.b.e a4 = dVar3.a(a3, j2);
            long j3 = -1;
            if (!(a4 == null || a4.f15722c == null)) {
                User user = a4.f15722c;
                h.f.b.l.b(user, "");
                FollowInfo followInfo = user.getFollowInfo();
                h.f.b.l.b(followInfo, "");
                j3 = followInfo.getFollowStatus();
            }
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11313h;
            if (aVar == null) {
                h.f.b.l.a("mLinkDataHolder");
            }
            com.bytedance.android.live.liveinteract.api.b.n nVar = aVar.q;
            String remove = com.bytedance.android.live.liveinteract.platform.common.g.f.f11959b.remove(Long.valueOf(j2));
            if (remove != null && com.bytedance.android.live.liveinteract.platform.common.g.f.f11959b.size() == 0) {
                com.bytedance.android.live.liveinteract.platform.common.g.f.a("anchor_kick_out_guest", j2, j3, nVar, remove);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("toUserId", Long.valueOf(j2));
            hashMap.put("secUserId", str);
            com.bytedance.android.live.liveinteract.multiguest.b.a n2 = n();
            if (n2 != null && (i2 = n2.i(hashMap)) != null && (acVar = (ac) i2.a(u())) != null) {
                acVar.a(new m(this, j2, str2), new n(this, j2, str2));
            }
        }
    }

    public final void a(PrivacyCert privacyCert, String str) {
        h.f.b.l.d(str, "");
        com.bytedance.android.livesdk.b.a.d a2 = com.bytedance.android.livesdk.b.a.d.a();
        h.f.b.l.b(a2, "");
        a2.a(false);
        com.bytedance.android.livesdk.b.a.d.a().y = false;
        f.a aVar = (f.a) this.y;
        if (aVar != null) {
            aVar.b();
        }
        com.bytedance.android.live.liveinteract.platform.c.c cVar = this.f11311f;
        if (cVar == null) {
            h.f.b.l.a("mRtcController");
        }
        cVar.a(privacyCert, str);
    }

    public final void a(LinkApi.c cVar, PrivacyCert privacyCert) {
        h.f.b.l.d(cVar, "");
        if (this.y != null) {
            DataChannel dataChannel = this.w;
            if (dataChannel != null) {
                dataChannel.a(com.bytedance.android.live.liveinteract.platform.common.c.c.class, cVar);
            }
            if (cVar == LinkApi.c.USER_CLICK) {
                com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.ck;
                h.f.b.l.b(bVar, "");
                com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar, (Object) false);
            }
            String str = cVar.value;
            h.f.b.l.b(str, "");
            a(privacyCert, str);
            a(cVar);
            com.bytedance.android.livesdk.b.a.d.a().f14181b = false;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void a(long j2, long j3) {
        f.a aVar = (f.a) this.y;
        if (aVar != null) {
            aVar.a(j2, j3);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void a(String str) {
        h.f.b.l.d(str, "");
        com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = this.f11309d;
        if (dVar == null) {
            h.f.b.l.a("mInfoCenter");
        }
        com.bytedance.android.live.liveinteract.platform.common.g.i.a(true, dVar.b(str), str);
        com.bytedance.android.live.liveinteract.platform.common.g.a.b("OnUserJoined", "position:LinkIn_Anchor; interactId:".concat(String.valueOf(str)));
        com.bytedance.android.live.liveinteract.platform.c.c cVar = this.f11311f;
        if (cVar == null) {
            h.f.b.l.a("mRtcController");
        }
        cVar.a(h().a(str));
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void a(String str, SurfaceView surfaceView) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(surfaceView, "");
        com.bytedance.android.live.liveinteract.platform.common.g.i.a(str, true);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void a(String str, long j2) {
        h.f.b.l.d(str, "");
        if (this.y != null) {
            com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = this.f11309d;
            if (dVar == null) {
                h.f.b.l.a("mInfoCenter");
            }
            com.bytedance.android.livesdk.chatroom.model.b.e a2 = com.bytedance.android.live.liveinteract.multiguest.a.c.d.a(dVar, str, 0, 2);
            long j3 = -1;
            if (!(a2 == null || a2.f15722c == null)) {
                User user = a2.f15722c;
                h.f.b.l.b(user, "");
                FollowInfo followInfo = user.getFollowInfo();
                h.f.b.l.b(followInfo, "");
                j3 = followInfo.getFollowStatus();
                if (j2 == 1 && LinkInteractAudienceOptEnableSetting.INSTANCE.getValue()) {
                    User user2 = a2.f15722c;
                    h.f.b.l.b(user2, "");
                    long id = user2.getId();
                    User user3 = a2.f15722c;
                    h.f.b.l.b(user3, "");
                    String secUid = user3.getSecUid();
                    if (secUid == null) {
                        secUid = "";
                    }
                    a(id, secUid, "kickout_with_rtc_user_leaved");
                }
                if (LinkInteractAudienceOptEnableSetting.INSTANCE.getValue()) {
                    User user4 = a2.f15722c;
                    h.f.b.l.b(user4, "");
                    a(user4.getId());
                }
            }
            f.a aVar = (f.a) this.y;
            if (aVar != null) {
                aVar.f(str);
            }
            long a3 = g.a.f14199a.a(str);
            com.bytedance.android.live.liveinteract.platform.common.g.i.b(true, a3, str);
            com.bytedance.android.live.liveinteract.platform.common.g.a.b("OnUserLeaved", "position:LinkIn_Anchor; interactId:".concat(String.valueOf(str)));
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = this.f11313h;
            if (aVar2 == null) {
                h.f.b.l.a("mLinkDataHolder");
            }
            com.bytedance.android.live.liveinteract.api.b.n nVar = aVar2.q;
            String remove = com.bytedance.android.live.liveinteract.platform.common.g.f.f11959b.remove(Long.valueOf(a3));
            if (remove != null && com.bytedance.android.live.liveinteract.platform.common.g.f.f11959b.size() == 0) {
                com.bytedance.android.live.liveinteract.platform.common.g.f.a("guest_over", a3, j3, nVar, remove);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void a(int i2, String str) {
        h.f.b.l.d(str, "");
        if (this.y != null) {
            com.bytedance.android.livesdk.b.a.d.a().y = false;
            com.bytedance.android.live.liveinteract.platform.common.g.i.a(true, i2, str);
            com.bytedance.android.live.liveinteract.platform.common.g.a.b("OnStartFailed", "position:LinkIn_Anchor; code:" + i2 + "; desc:" + str);
            com.bytedance.android.live.liveinteract.platform.common.g.p.a(com.bytedance.android.live.liveinteract.platform.common.g.p.f12000c, (long) i2, str);
            f.a aVar = (f.a) this.y;
            if (aVar != null) {
                aVar.a();
            }
            this.o.c(com.bytedance.android.live.liveinteract.api.l.class, new com.bytedance.android.livesdk.chatroom.c.q(8));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void a(com.bytedance.android.live.liveinteract.multilive.c.m mVar, String str) {
        h.f.b.l.d(mVar, "");
        h.f.b.l.d(str, "");
        com.bytedance.android.live.liveinteract.platform.common.g.i.a(true, mVar.f11766d, str);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void a(String str, String str2) {
        com.bytedance.android.live.liveinteract.multilive.c.n nVar;
        ArrayList<com.bytedance.android.live.liveinteract.multilive.c.o> arrayList;
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        b.a.a(str, str2);
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11313h;
        if (aVar == null) {
            h.f.b.l.a("mLinkDataHolder");
        }
        if (aVar.f11298h) {
            this.t.getValue();
            com.bytedance.android.live.liveinteract.multilive.c.m a2 = com.bytedance.android.live.liveinteract.multilive.d.a.a(str2);
            if (a2 != null) {
                Long l2 = a2.f11765c;
                long j2 = 0;
                if (l2 != null) {
                    long longValue = l2.longValue();
                    if (longValue > 0) {
                        j2 = com.bytedance.android.livesdk.utils.a.a.a() - longValue;
                    }
                }
                com.bytedance.android.live.liveinteract.platform.common.g.i.a(true, a2.f11766d, str2, j2);
                if (!(!h.f.b.l.a((Object) a2.f11763a, (Object) "onGuestVideoMute") || (nVar = a2.f11764b) == null || (arrayList = nVar.f11768b) == null)) {
                    for (T t2 : arrayList) {
                        if (!h.f.b.l.a((Object) t2.f11769a, (Object) k())) {
                            a(t2.f11769a, t2.f11771c);
                        }
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void a(long j2, int i2) {
        if (i2 == 200) {
            com.bytedance.android.live.liveinteract.platform.common.g.i.f(true);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("error_code", String.valueOf(i2));
        hashMap.put("msg_id", String.valueOf(j2));
        com.bytedance.android.live.liveinteract.platform.common.g.i.a(true, (HashMap<String, Object>) hashMap);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void a(String str, boolean z) {
        h.f.b.l.d(str, "");
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11313h;
        if (aVar == null) {
            h.f.b.l.a("mLinkDataHolder");
        }
        aVar.a().put(str, Boolean.valueOf(z));
        this.o.c(com.bytedance.android.live.liveinteract.multilive.c.l.class, new com.bytedance.android.live.liveinteract.multilive.c.r(str, z));
        com.bytedance.android.live.liveinteract.platform.c.c cVar = this.f11311f;
        if (cVar == null) {
            h.f.b.l.a("mRtcController");
        }
        cVar.d();
    }

    static final class o extends h.f.b.m implements h.f.a.a<com.bytedance.android.livesdk.b.a.d> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f11331a = new o();

        static {
            Covode.recordClassIndex(6097);
        }

        o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.android.livesdk.b.a.d invoke() {
            return com.bytedance.android.livesdk.b.a.d.a();
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<com.bytedance.android.live.liveinteract.multilive.d.a> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(6098);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.android.live.liveinteract.multilive.d.a invoke() {
            return new com.bytedance.android.live.liveinteract.multilive.d.a(this.this$0.o);
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<com.bytedance.android.live.liveinteract.multilive.d.b> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(6099);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.android.live.liveinteract.multilive.d.b invoke() {
            return new com.bytedance.android.live.liveinteract.multilive.d.b((f.a) this.this$0.y);
        }
    }

    private final void p() {
        com.bytedance.android.live.liveinteract.platform.common.g.j jVar = this.p;
        if (jVar != null) {
            jVar.b();
        }
        this.p = null;
    }

    public final com.bytedance.android.live.liveinteract.platform.c.c c() {
        com.bytedance.android.live.liveinteract.platform.c.c cVar = this.f11311f;
        if (cVar == null) {
            h.f.b.l.a("mRtcController");
        }
        return cVar;
    }

    public final com.bytedance.android.live.liveinteract.multiguest.opt.a.a d() {
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11313h;
        if (aVar == null) {
            h.f.b.l.a("mLinkDataHolder");
        }
        return aVar;
    }

    private com.bytedance.android.live.liveinteract.multiguest.b.a n() {
        com.bytedance.android.live.liveinteract.platform.a.c cVar = this.f11310e;
        if (cVar == null) {
            h.f.b.l.a("mLinkerManager");
        }
        com.bytedance.android.live.liveinteract.platform.a.b b2 = cVar.b(a.EnumC0247a.MULTIGUEST);
        if (!(b2 instanceof com.bytedance.android.live.liveinteract.multiguest.b.a)) {
            b2 = null;
        }
        return (com.bytedance.android.live.liveinteract.multiguest.b.a) b2;
    }

    private boolean o() {
        com.bytedance.android.livesdkapi.depend.model.live.s streamUrlExtraSafely = this.n.getStreamUrlExtraSafely();
        h.f.b.l.b(streamUrlExtraSafely, "");
        if (streamUrlExtraSafely.f23190l > 0) {
            return true;
        }
        return false;
    }

    public final z i() {
        f.a aVar = (f.a) this.y;
        if (aVar == null) {
            return null;
        }
        com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = this.f11309d;
        if (dVar == null) {
            h.f.b.l.a("mInfoCenter");
        }
        aVar.a(h.a.n.g((Collection) dVar.f11074b));
        return z.f158842a;
    }

    public final String l() {
        StreamUrl streamUrl = this.n.getStreamUrl();
        h.f.b.l.b(streamUrl, "");
        String a2 = streamUrl.a();
        h.f.b.l.b(a2, "");
        return a2;
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void f() {
        if (this.y != null) {
            com.bytedance.android.live.liveinteract.platform.common.g.i.e(true);
            com.bytedance.android.live.core.c.a.a(4, com.bytedance.android.live.liveinteract.api.o.f10017a, "onEngineEndSuccess");
            com.bytedance.android.livesdk.b.a.d.a().y = false;
            this.o.c(com.bytedance.android.live.liveinteract.api.g.class, new com.bytedance.android.live.liveinteract.api.b.e(false, null));
            com.bytedance.android.live.liveinteract.platform.common.g.a.b("onEndSuccess", "position:LinkIn_Anchor");
            p();
        }
    }

    public final String k() {
        String str;
        com.bytedance.android.live.liveinteract.platform.a.c cVar = this.f11310e;
        if (cVar == null) {
            h.f.b.l.a("mLinkerManager");
        }
        com.bytedance.android.live.liveinteract.platform.a.b b2 = cVar.b(a.EnumC0247a.MULTIGUEST);
        if (b2 == null || (str = b2.f11863f) == null) {
            return "";
        }
        return str;
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void g() {
        this.o.c(com.bytedance.android.live.liveinteract.api.l.class, new com.bytedance.android.livesdk.chatroom.c.q(7));
        com.bytedance.android.live.liveinteract.platform.c.c cVar = this.f11311f;
        if (cVar == null) {
            h.f.b.l.a("mRtcController");
        }
        LiveCore.InteractConfig interactConfig = cVar.f11886a;
        Config.MixStreamType mixStreamType = null;
        if (!(interactConfig == null || interactConfig.getMixStreamType() == null || !TestDisableMixStreamTypeSetting.INSTANCE.getValue())) {
            com.bytedance.android.live.liveinteract.platform.c.c cVar2 = this.f11311f;
            if (cVar2 == null) {
                h.f.b.l.a("mRtcController");
            }
            LiveCore.InteractConfig interactConfig2 = cVar2.f11886a;
            if (interactConfig2 != null) {
                mixStreamType = interactConfig2.getMixStreamType();
            }
            this.o.b(ae.class, String.valueOf(mixStreamType));
        }
        com.bytedance.android.live.liveinteract.platform.common.g.i.d(true);
    }

    public final void j() {
        boolean z;
        Config.VideoQuality videoQuality;
        StringBuilder sb = new StringBuilder("getRtcExtInfo is empty = ");
        if (a(this).length() == 0) {
            z = true;
        } else {
            z = false;
        }
        com.bytedance.android.live.liveinteract.platform.common.g.a.a("turnOnEngine", sb.append(z).toString());
        if (this.y != null) {
            com.bytedance.android.livesdk.b.a.d.a().y = true;
            if (o()) {
                videoQuality = Config.VideoQuality.ANCHOR_HIGH;
            } else {
                videoQuality = Config.VideoQuality.ANCHOR_NORMAL;
            }
            com.bytedance.android.live.liveinteract.platform.common.e.a a2 = a(videoQuality);
            com.bytedance.android.live.liveinteract.platform.c.c cVar = this.f11311f;
            if (cVar == null) {
                h.f.b.l.a("mRtcController");
            }
            com.bytedance.android.livesdk.chatroom.interact.b bVar = this.f11312g;
            if (bVar == null) {
                h.f.b.l.a("mLiveVideoClientFactory");
            }
            cVar.a(bVar, new w(this, a2, videoQuality));
            com.bytedance.android.livesdk.b.a.d.a().f14189j = System.currentTimeMillis();
            com.bytedance.android.live.liveinteract.platform.common.g.i.a(true);
        }
    }

    public static final class r extends d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11332a;

        static {
            Covode.recordClassIndex(6100);
        }

        @Override // com.bytedance.android.live.liveinteract.multiguest.a.c.d.a
        public final void a() {
            f.a aVar;
            if (this.f11332a.d().f11298h) {
                this.f11332a.o.b(au.class, new com.bytedance.android.live.liveinteract.api.b.m(this.f11332a.d().q, this.f11332a.a().g()));
            }
            f.a aVar2 = (f.a) this.f11332a.y;
            if (aVar2 != null) {
                aVar2.b(h.a.n.g((Collection) this.f11332a.a().f11074b));
            }
            int h2 = this.f11332a.a().h();
            boolean value = TTliveLinkmicModeSwitchOpenSetting.INSTANCE.getValue();
            boolean z = com.bytedance.android.livesdk.b.a.d.a().y;
            com.bytedance.android.live.core.c.a.a(4, "LinkUserInfoCenterTAG", "linkedGuestCount = " + h2 + "  isSwitchOpened = " + value + "  rtcJoinedChannel = " + z);
            if (!this.f11332a.f11314i && h2 <= 0 && value && z) {
                if (this.f11332a.d().f11298h) {
                    this.f11332a.c().d();
                    com.bytedance.android.livesdk.b.a.d a2 = com.bytedance.android.livesdk.b.a.d.a();
                    h.f.b.l.b(a2, "");
                    a2.a(false);
                    b bVar = this.f11332a;
                    com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar3 = bVar.f11313h;
                    if (aVar3 == null) {
                        h.f.b.l.a("mLinkDataHolder");
                    }
                    if (!aVar3.f11294d && (aVar = (f.a) bVar.y) != null) {
                        aVar.c();
                    }
                    this.f11332a.d().f11295e = 0;
                    return;
                }
                this.f11332a.a(PrivacyCert.Builder.Companion.with("bpea-570").usage("").tag("turn off engine").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build(), "no linked guest");
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        r(b bVar) {
            this.f11332a = bVar;
        }

        @Override // com.bytedance.android.live.liveinteract.multiguest.a.c.d.a
        public final void a(String str) {
            h.f.b.l.d(str, "");
            this.f11332a.c().d();
        }

        @Override // com.bytedance.android.live.liveinteract.multiguest.a.c.d.a
        public final void a(long j2, String str) {
            f.a.b.b remove;
            h.f.b.l.d(str, "");
            Map<Long, f.a.b.b> map = this.f11332a.f11317l;
            if (!(map == null || (remove = map.remove(Long.valueOf(j2))) == null)) {
                remove.dispose();
            }
            com.bytedance.android.livesdk.b.a.g gVar = g.a.f14199a;
            if (!TextUtils.isEmpty(str) && !gVar.f14197b.isEmpty()) {
                Iterator<Map.Entry<Integer, String>> it = gVar.f14197b.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getValue().equals(str)) {
                        it.remove();
                        return;
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void e() {
        Config.VideoQuality videoQuality;
        this.o.c(com.bytedance.android.live.liveinteract.api.g.class, new com.bytedance.android.live.liveinteract.api.b.e(true, this.f11318m.name()));
        String l2 = l();
        long id = this.n.getId();
        String name = this.f11318m.name();
        Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = name.toLowerCase();
        h.f.b.l.b(lowerCase, "");
        if (o()) {
            videoQuality = Config.VideoQuality.ANCHOR_HIGH;
        } else {
            videoQuality = Config.VideoQuality.ANCHOR_NORMAL;
        }
        h.f.b.l.b(videoQuality, "");
        com.bytedance.android.live.liveinteract.platform.common.g.j jVar = new com.bytedance.android.live.liveinteract.platform.common.g.j(lowerCase, l2, id, videoQuality.getWidth(), videoQuality.getHeight(), videoQuality.getBitrate(), videoQuality.getFps());
        this.p = jVar;
        jVar.a();
        com.bytedance.android.live.liveinteract.platform.common.g.i.c(true);
        com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.ck;
        h.f.b.l.b(bVar, "");
        com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar, (Object) true);
        com.bytedance.android.live.liveinteract.platform.c.c cVar = this.f11311f;
        if (cVar == null) {
            h.f.b.l.a("mRtcController");
        }
        cVar.a(PrivacyCert.Builder.Companion.with("bpea-508").usage("").tag("link mic start to push stream").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00df, code lost:
        if (1 != r0.intValue()) goto L_0x001d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
    @Override // com.bytedance.ies.a.b, com.bytedance.android.livesdk.chatroom.e.r
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
        // Method dump skipped, instructions count: 266
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b.b():void");
    }

    public final com.bytedance.android.live.liveinteract.multiguest.a.c.d a() {
        com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = this.f11309d;
        if (dVar == null) {
            h.f.b.l.a("mInfoCenter");
        }
        return dVar;
    }

    static final class j<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11320a;

        static {
            Covode.recordClassIndex(6092);
        }

        j(b bVar) {
            this.f11320a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f11320a.a((Throwable) obj);
        }
    }

    static /* synthetic */ String a(b bVar) {
        return bVar.a((Integer) 0);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void b(String str) {
        h.f.b.l.d(str, "");
        com.bytedance.android.live.liveinteract.platform.common.g.i.c(str, true);
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.b<z, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(6086);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            h.f.b.l.d(zVar, "");
            this.this$0.c().d();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.b<String, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(6087);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            String str2 = str;
            h.f.b.l.d(str2, "");
            b bVar = this.this$0;
            com.bytedance.android.livesdk.at.f b2 = com.bytedance.android.livesdk.userservice.u.a().b();
            h.f.b.l.b(b2, "");
            bVar.a(b2.c(), str2, "kickout_with_popup_confirm");
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.f.b.m implements h.f.a.b<com.bytedance.android.livesdk.chatroom.c.a, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(6090);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.android.livesdk.chatroom.c.a aVar) {
            com.bytedance.android.livesdk.chatroom.c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            b bVar = this.this$0;
            long id = aVar2.f15058a.getId();
            String secUid = aVar2.f15058a.getSecUid();
            h.f.b.l.b(secUid, "");
            bVar.a(id, secUid, aVar2.f15059b);
            return z.f158842a;
        }
    }

    private final com.bytedance.android.live.liveinteract.platform.common.e.a a(Config.VideoQuality videoQuality) {
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11313h;
        if (aVar == null) {
            h.f.b.l.a("mLinkDataHolder");
        }
        if (aVar.f11298h) {
            return new com.bytedance.android.live.liveinteract.multilive.anchor.c.e(this);
        }
        return new com.bytedance.android.live.liveinteract.multiguest.d.a(videoQuality, this);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void c(String str) {
        com.bytedance.android.live.core.c.a.a(5, com.bytedance.android.live.liveinteract.api.o.f10017a, "onWarn: ".concat(String.valueOf(str)));
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void e(String str) {
        h.f.b.l.d(str, "");
        com.bytedance.android.live.liveinteract.platform.common.g.i.a(true, str);
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11313h;
        if (aVar == null) {
            h.f.b.l.a("mLinkDataHolder");
        }
        aVar.d();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.d.a.AbstractC0214a
    public final int f(String str) {
        h.f.b.l.d(str, "");
        com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = this.f11309d;
        if (dVar == null) {
            h.f.b.l.a("mInfoCenter");
        }
        return dVar.a(str);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.d.a.AbstractC0214a, com.bytedance.android.live.liveinteract.multilive.anchor.c.e.a
    public final long g(String str) {
        h.f.b.l.d(str, "");
        com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = this.f11309d;
        if (dVar == null) {
            h.f.b.l.a("mInfoCenter");
        }
        return dVar.b(str);
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.c.e.a
    public final int j(String str) {
        h.f.b.l.d(str, "");
        f.a aVar = (f.a) this.y;
        if (aVar != null) {
            return aVar.g(str);
        }
        return -1;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.c.e.a
    public final int k(String str) {
        h.f.b.l.d(str, "");
        f.a aVar = (f.a) this.y;
        if (aVar != null) {
            return aVar.h(str);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.f.b.m implements h.f.a.b<Integer, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(6085);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            this.this$0.c().e(this.this$0.a(Integer.valueOf(num.intValue())));
            this.this$0.c().d();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends h.f.b.m implements h.f.a.b<String, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(6089);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            h.f.b.l.d(str, "");
            if (this.this$0.d().f11302l > 0 && this.this$0.d().f11294d) {
                this.this$0.d().f11295e = 1;
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class s<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11333a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11334b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f11335c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f11336d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f11337e;

        static {
            Covode.recordClassIndex(6101);
        }

        s(b bVar, int i2, long j2, String str, String str2) {
            this.f11333a = bVar;
            this.f11334b = i2;
            this.f11335c = j2;
            this.f11336d = str;
            this.f11337e = str2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.liveinteract.platform.a.c.a aVar = (com.bytedance.android.live.liveinteract.platform.a.c.a) obj;
            int i2 = this.f11334b;
            if (i2 == 2) {
                b bVar = this.f11333a;
                long j2 = this.f11335c;
                a aVar2 = bVar.f11308c;
                if (aVar2 != null) {
                    aVar2.d(j2);
                }
            } else if (i2 == 1) {
                b bVar2 = this.f11333a;
                h.f.b.l.b(aVar, "");
                bVar2.a(aVar, this.f11335c, this.f11336d, this.f11337e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class u<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11342a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f11343b;

        static {
            Covode.recordClassIndex(6103);
        }

        u(b bVar, String str) {
            this.f11342a = bVar;
            this.f11343b = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (5 - ((Number) obj).longValue() == 1) {
                this.f11342a.f11315j.remove(this.f11343b);
                f.a.b.b bVar = this.f11342a.f11316k;
                if (bVar != null) {
                    bVar.dispose();
                }
            }
        }
    }

    private void a(long j2) {
        f.a.b.b remove;
        Map<Long, f.a.b.b> map = this.f11317l;
        if (map != null && j2 > 1000 && (remove = map.remove(Long.valueOf(j2))) != null) {
            remove.dispose();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.c.e.a
    public final boolean i(String str) {
        h.f.b.l.d(str, "");
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11313h;
        if (aVar == null) {
            h.f.b.l.a("mLinkDataHolder");
        }
        Boolean bool = aVar.b().get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class f extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(6088);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            b bVar = this.this$0;
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = bVar.f11313h;
            if (aVar == null) {
                h.f.b.l.a("mLinkDataHolder");
            }
            aVar.a().put(bVar.k(), Boolean.valueOf(!booleanValue));
            com.bytedance.android.live.liveinteract.platform.c.c cVar = bVar.f11311f;
            if (cVar == null) {
                h.f.b.l.a("mRtcController");
            }
            bVar.h();
            String k2 = bVar.k();
            h.f.b.l.d(k2, "");
            com.bytedance.android.live.liveinteract.multilive.c.m mVar = new com.bytedance.android.live.liveinteract.multilive.c.m();
            mVar.a("onAnchorVideoMute");
            com.bytedance.android.live.liveinteract.multilive.c.n nVar = new com.bytedance.android.live.liveinteract.multilive.c.n();
            nVar.f11768b.add(new com.bytedance.android.live.liveinteract.multilive.c.o(k2, 0, !booleanValue, 2));
            mVar.f11764b = nVar;
            cVar.a(mVar);
            com.bytedance.android.live.liveinteract.platform.c.c cVar2 = bVar.f11311f;
            if (cVar2 == null) {
                h.f.b.l.a("mRtcController");
            }
            cVar2.d();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11321a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LinkApi.c f11322b;

        static {
            Covode.recordClassIndex(6093);
        }

        k(b bVar, LinkApi.c cVar) {
            this.f11321a = bVar;
            this.f11322b = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str = this.f11322b.value;
            h.f.b.l.b(str, "");
            h.f.b.l.d(str, "");
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.core.d.a.a(jSONObject, "request_source", str);
            com.bytedance.android.live.core.d.a.a(jSONObject, "cost", System.currentTimeMillis() - com.bytedance.android.live.liveinteract.platform.common.g.i.f11976f);
            com.bytedance.android.live.liveinteract.platform.common.g.i.a(com.bytedance.android.live.liveinteract.platform.common.g.i.f11979j, true, "finish_succeed", jSONObject);
            com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkIn_finish_Success");
            this.f11321a.f11307b = false;
            a aVar = this.f11321a.f11308c;
            if (aVar != null) {
                aVar.a();
            }
            com.bytedance.android.live.liveinteract.api.a.c.a().a((Integer) 0);
            this.f11321a.o.c(com.bytedance.android.live.liveinteract.api.l.class, new com.bytedance.android.livesdk.chatroom.c.q(8));
            com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.live.liveinteract.api.b.d(1));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11325a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f11326b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f11327c;

        static {
            Covode.recordClassIndex(6095);
        }

        m(b bVar, long j2, String str) {
            this.f11325a = bVar;
            this.f11326b = j2;
            this.f11327c = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkIn_kickOut_Success");
            long j2 = this.f11326b;
            String str = this.f11327c;
            String a2 = this.f11325a.a().a(this.f11326b);
            h.f.b.l.d(str, "");
            h.f.b.l.d(a2, "");
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.core.d.a.a(jSONObject, "guest_user_id", j2);
            com.bytedance.android.live.core.d.a.a(jSONObject, "request_source", str);
            com.bytedance.android.live.core.d.a.a(jSONObject, "guest_linkmic_id", a2);
            com.bytedance.android.live.core.d.a.a(jSONObject, "cost", System.currentTimeMillis() - com.bytedance.android.live.liveinteract.platform.common.g.i.f11975e);
            com.bytedance.android.live.liveinteract.platform.common.g.i.a(jSONObject, Long.valueOf(j2), a2);
            com.bytedance.android.live.liveinteract.platform.common.g.i.a(com.bytedance.android.live.liveinteract.platform.common.g.i.f11979j, true, "kick_out_succeed", jSONObject);
            this.f11325a.f11306a = false;
            a aVar = this.f11325a.f11308c;
            if (aVar != null) {
                aVar.b(this.f11326b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11328a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f11329b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f11330c;

        static {
            Covode.recordClassIndex(6096);
        }

        n(b bVar, long j2, String str) {
            this.f11328a = bVar;
            this.f11329b = j2;
            this.f11330c = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            this.f11328a.a(th);
            long j2 = this.f11329b;
            String str = this.f11330c;
            String a2 = this.f11328a.a().a(this.f11329b);
            h.f.b.l.d(str, "");
            h.f.b.l.d(a2, "");
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.core.d.a.a(jSONObject, "guest_user_id", j2);
            com.bytedance.android.live.core.d.a.a(jSONObject, "request_source", str);
            com.bytedance.android.live.core.d.a.a(jSONObject, "guest_linkmic_id", a2);
            com.bytedance.android.live.liveinteract.platform.common.g.i.a(jSONObject, Long.valueOf(j2), a2);
            com.bytedance.android.live.liveinteract.platform.common.g.i.a(jSONObject, th);
            com.bytedance.android.live.core.d.a.a(jSONObject, "cost", System.currentTimeMillis() - com.bytedance.android.live.liveinteract.platform.common.g.i.f11975e);
            com.bytedance.android.live.liveinteract.platform.common.g.i.a(true, "kick_out_failed", jSONObject, 1);
            com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkIn_kickOut_Failed", "throwable:".concat(String.valueOf(th)));
            this.f11328a.f11306a = false;
            a aVar = this.f11328a.f11308c;
            if (aVar != null) {
                aVar.b(th);
            }
        }
    }

    public static final class w implements com.bytedance.android.live.liveinteract.platform.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11349a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.live.liveinteract.platform.common.e.a f11350b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Config.VideoQuality f11351c;

        static {
            Covode.recordClassIndex(6105);
        }

        @Override // com.bytedance.android.live.liveinteract.platform.c.a
        public final LiveCore.InteractConfig a(LiveCore.InteractConfig interactConfig) {
            h.f.b.l.d(interactConfig, "");
            interactConfig.setStreamMixer(this.f11350b);
            interactConfig.setMixStreamRtmpUrl(this.f11349a.l());
            interactConfig.setBackgroundColor("#303342");
            interactConfig.setVideoQuality(this.f11351c);
            interactConfig.setRtcExtInfo(b.a(this.f11349a));
            interactConfig.setInteractMode(Config.InteractMode.VIDEO_TALK_CAMERA);
            interactConfig.setMixStreamType(Config.MixStreamType.SERVER_MIX);
            interactConfig.setCharacter(Config.Character.ANCHOR);
            interactConfig.setSeiVersion(1);
            interactConfig.setType(Config.Type.VIDEO);
            if (LiveSeiTalkSetting.INSTANCE.enable()) {
                interactConfig.setVolumeCallbackInterval(LiveSeiTalkSetting.INSTANCE.getInterval());
            }
            interactConfig.setRtcABTestConfig(RtcAbLabelSetting.INSTANCE.getValue());
            this.f11350b.a(interactConfig);
            return interactConfig;
        }

        w(b bVar, com.bytedance.android.live.liveinteract.platform.common.e.a aVar, Config.VideoQuality videoQuality) {
            this.f11349a = bVar;
            this.f11350b = aVar;
            this.f11351c = videoQuality;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.c.e.a
    public final boolean h(String str) {
        h.f.b.l.d(str, "");
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11313h;
        if (aVar == null) {
            h.f.b.l.a("mLinkDataHolder");
        }
        Boolean bool = aVar.a().get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = this.f11309d;
        if (dVar == null) {
            h.f.b.l.a("mInfoCenter");
        }
        if (dVar.a(str) != 2) {
            return false;
        }
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = this.f11313h;
        if (aVar2 == null) {
            h.f.b.l.a("mLinkDataHolder");
        }
        aVar2.a().put(str, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b$b  reason: collision with other inner class name */
    public static final class C0221b extends h.f.b.m implements h.f.a.b<com.bytedance.android.live.liveinteract.api.b.n, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(6084);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0221b(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.android.live.liveinteract.api.b.n nVar) {
            String str;
            h.f.b.l.d(nVar, "");
            if (this.this$0.c().f11889d || nVar != com.bytedance.android.live.liveinteract.api.b.n.NORMAL) {
                if (this.this$0.d().f11298h) {
                    this.this$0.o.b(au.class, new com.bytedance.android.live.liveinteract.api.b.m(this.this$0.d().q, this.this$0.a().g()));
                }
                if (!this.this$0.c().f11889d) {
                    this.this$0.j();
                } else {
                    this.this$0.c().e(b.a(this.this$0));
                    this.this$0.c().d();
                }
                com.bytedance.android.live.liveinteract.platform.c.c c2 = this.this$0.c();
                com.bytedance.android.live.liveinteract.multilive.d.b h2 = this.this$0.h();
                com.bytedance.android.live.liveinteract.multilive.c.m mVar = new com.bytedance.android.live.liveinteract.multilive.c.m();
                mVar.a();
                mVar.a("onLayoutChange");
                com.bytedance.android.live.liveinteract.multilive.c.n nVar2 = new com.bytedance.android.live.liveinteract.multilive.c.n();
                com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = h2.f11778a;
                if (aVar == null) {
                    h.f.b.l.a("mDataHolder");
                }
                int i2 = com.bytedance.android.live.liveinteract.multilive.d.c.f11781a[aVar.q.ordinal()];
                if (i2 == 1) {
                    str = "float_fix";
                } else if (i2 == 2) {
                    str = "float";
                } else if (i2 == 3) {
                    str = "grid_fix";
                } else if (i2 == 4) {
                    str = "grid";
                } else if (i2 == 5) {
                    str = "normal";
                } else {
                    throw new h.n();
                }
                h.f.b.l.d(str, "");
                nVar2.f11767a = str;
                nVar2.f11768b.addAll(h2.a());
                mVar.f11764b = nVar2;
                c2.a(mVar);
                com.bytedance.android.live.liveinteract.platform.common.g.a.a("wtf: roomid:" + this.this$0.n.getIdStr() + " streamid:" + this.this$0.n.getStreamId());
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11323a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LinkApi.c f11324b;

        static {
            Covode.recordClassIndex(6094);
        }

        l(b bVar, LinkApi.c cVar) {
            this.f11323a = bVar;
            this.f11324b = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            h.f.b.l.d(th, "");
            String str = this.f11324b.value;
            h.f.b.l.b(str, "");
            h.f.b.l.d(str, "");
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.core.d.a.a(jSONObject, "request_source", str);
            com.bytedance.android.live.core.d.a.a(jSONObject, "cost", System.currentTimeMillis() - com.bytedance.android.live.liveinteract.platform.common.g.i.f11976f);
            com.bytedance.android.live.liveinteract.platform.common.g.i.a(jSONObject, th);
            com.bytedance.android.live.liveinteract.platform.common.g.i.a(true, "finish_failed", jSONObject, 1);
            this.f11323a.a(th);
            boolean z = this.f11323a.c().f11891f;
            com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkIn_finish_Failed", "mUnrecoverableErrorHappened:" + z + "; throwable:" + th);
            this.f11323a.f11307b = false;
            if (!z) {
                a aVar = this.f11323a.f11308c;
                if (aVar != null) {
                    aVar.c();
                    return;
                }
                return;
            }
            a aVar2 = this.f11323a.f11308c;
            if (aVar2 != null) {
                aVar2.a();
            }
            com.bytedance.android.live.liveinteract.api.a.c.a().a((Integer) 0);
            this.f11323a.o.c(com.bytedance.android.live.liveinteract.api.l.class, new com.bytedance.android.livesdk.chatroom.c.q(8));
            com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.live.liveinteract.api.b.d(1));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class t<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11338a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11339b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f11340c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f11341d;

        static {
            Covode.recordClassIndex(6102);
        }

        t(b bVar, int i2, long j2, String str) {
            this.f11338a = bVar;
            this.f11339b = i2;
            this.f11340c = j2;
            this.f11341d = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            int errorCode;
            Throwable th = (Throwable) obj;
            int i2 = this.f11339b;
            if (i2 != 2 && i2 == 1) {
                b bVar = this.f11338a;
                h.f.b.l.b(th, "");
                long j2 = this.f11340c;
                String str = this.f11341d;
                bVar.a(th);
                bVar.f11314i = false;
                bVar.f11315j.remove(str);
                com.bytedance.android.live.liveinteract.platform.common.g.p.a(p.a.FAILED_PERMIT.mIssueCategory, p.a.FAILED_PERMIT.mIssueContent, com.bytedance.android.live.liveinteract.platform.common.g.p.a(th), th.toString());
                h.f.b.l.d(str, "");
                JSONObject jSONObject = new JSONObject();
                com.bytedance.android.live.core.d.a.a(jSONObject, "error_code", 105L);
                com.bytedance.android.live.liveinteract.platform.common.g.i.a(jSONObject, th);
                com.bytedance.android.live.core.d.a.a(jSONObject, "guest_user_id", j2);
                com.bytedance.android.live.core.d.a.a(jSONObject, "guest_linkmic_id", str);
                com.bytedance.android.live.core.d.a.a(jSONObject, "cost", System.currentTimeMillis() - com.bytedance.android.live.liveinteract.platform.common.g.i.f11973c);
                com.bytedance.android.live.liveinteract.platform.common.g.i.a(jSONObject, Long.valueOf(j2), str);
                com.bytedance.android.live.liveinteract.platform.common.g.i.a(true, "permit_failed", jSONObject, 1);
                com.bytedance.android.live.liveinteract.platform.common.g.v.e(com.bytedance.android.live.liveinteract.platform.common.g.e.a(jSONObject));
                if ((th instanceof com.bytedance.android.live.a.a.b.a) && ((errorCode = ((com.bytedance.android.live.a.a.a) th).getErrorCode()) == 4004026 || errorCode == 4004029)) {
                    com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = bVar.f11309d;
                    if (dVar == null) {
                        h.f.b.l.a("mInfoCenter");
                    }
                    dVar.a(false, d.b.PERMIT_FAILED);
                }
                a aVar = bVar.f11308c;
                if (aVar != null) {
                    aVar.a(th);
                }
                f.a aVar2 = (f.a) bVar.y;
                if (aVar2 != null) {
                    aVar2.d(str);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class v<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11344a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11345b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f11346c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f11347d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f11348e;

        static {
            Covode.recordClassIndex(6104);
        }

        v(b bVar, int i2, long j2, String str, String str2) {
            this.f11344a = bVar;
            this.f11345b = i2;
            this.f11346c = j2;
            this.f11347d = str;
            this.f11348e = str2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkIn_Permit_TimeOut", "timeOut:" + this.f11345b + "; uid:" + this.f11346c + "; secUserId:" + this.f11347d);
            long j2 = this.f11346c;
            int i2 = this.f11345b;
            String str = this.f11348e;
            h.f.b.l.d(str, "");
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.core.d.a.a(jSONObject, "error_code", 103L);
            com.bytedance.android.live.core.d.a.a(jSONObject, "error_msg", 0L);
            com.bytedance.android.live.core.d.a.a(jSONObject, "error_detail", "timeout:".concat(String.valueOf(i2)));
            com.bytedance.android.live.core.d.a.a(jSONObject, "guest_user_id", j2);
            com.bytedance.android.live.core.d.a.a(jSONObject, "guest_linkmic_id", str);
            com.bytedance.android.live.core.d.a.a(jSONObject, "time_out", String.valueOf(i2));
            com.bytedance.android.live.liveinteract.platform.common.g.i.a(jSONObject, Long.valueOf(j2), str);
            com.bytedance.android.live.liveinteract.platform.common.g.i.a(com.bytedance.android.live.liveinteract.platform.common.g.i.f11979j, true, "rtc_time_out", jSONObject);
            com.bytedance.android.live.liveinteract.platform.common.g.v.e(com.bytedance.android.live.liveinteract.platform.common.g.e.a(jSONObject));
            com.bytedance.android.live.liveinteract.platform.common.g.p.a(com.bytedance.android.live.liveinteract.platform.common.g.p.f12000c, (long) this.f11345b);
            this.f11344a.a(this.f11346c, this.f11347d, "kickout_with_timeout");
            this.f11344a.f11317l.remove(Long.valueOf(this.f11346c));
            com.bytedance.android.live.liveinteract.multiguest.a.c.c.a(this.f11346c, false);
            f.a aVar = (f.a) this.f11344a.y;
            if (aVar != null) {
                aVar.e(this.f11348e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a extends h.f.b.m implements h.f.a.b<com.bytedance.android.livesdk.event.a, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(6083);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.android.livesdk.event.a aVar) {
            boolean z;
            Long l2;
            com.bytedance.android.livesdk.chatroom.model.b.e a2;
            com.bytedance.android.livesdk.chatroom.model.b.e a3;
            boolean z2;
            com.bytedance.android.livesdk.event.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            f.a aVar3 = (f.a) this.this$0.y;
            if (aVar3 == null || aVar3.isViewValid()) {
                User user = aVar2.f17176a;
                String str = aVar2.f17177b;
                com.bytedance.android.live.liveinteract.multiguest.a.c.d a4 = this.this$0.a();
                int i2 = aVar2.f17178c;
                if (user != null) {
                    long id = user.getId();
                    if (id != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        Room room = (Room) DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.j.ac.class);
                        if (room != null) {
                            l2 = Long.valueOf(room.getId());
                        } else {
                            l2 = null;
                        }
                        if (l2 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        } else if (str == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        } else if (!com.bytedance.android.live.liveinteract.multiguest.a.c.c.f11063d) {
                            try {
                                throw new IllegalStateException("Check failed.".toString());
                            } catch (IllegalArgumentException | IllegalStateException unused) {
                            }
                        } else if (b.a.a().a() != 2) {
                            ao.a(y.e(), (int) R.string.e9h);
                        } else if (com.bytedance.android.live.liveinteract.multiguest.a.c.c.f11064e.contains(Long.valueOf(id))) {
                            ao.a(y.e(), (int) R.string.e_h);
                        } else {
                            if (!(a4 == null || (a3 = a4.a("", id)) == null)) {
                                if (a3.f15724e == 1 && a3.f15726g == 2) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    ao.a(y.e(), y.a((int) R.string.e9s, user.displayId), 0);
                                }
                            }
                            if (com.bytedance.android.livesdk.b.a.d.a().u >= com.bytedance.android.livesdk.b.a.d.a().x) {
                                ao.a(y.e(), (int) R.string.e_g);
                            } else if (a4 != null && (a2 = a4.a("", id)) != null && a2.f15724e == 2) {
                                ao.a(y.e(), y.a((int) R.string.e9o, user.displayId), 0);
                            } else if (com.bytedance.android.livesdk.b.a.d.a().t.contains(Long.valueOf(id))) {
                                ao.a(y.e(), y.a((int) R.string.e9r, user.displayId), 0);
                            } else {
                                long longValue = l2.longValue();
                                long id2 = user.getId();
                                h.f.b.l.d(str, "");
                                com.bytedance.android.live.liveinteract.multiguest.a.c.c.f11064e.add(Long.valueOf(id2));
                                com.bytedance.android.live.liveinteract.multiguest.a.c.c.f11061b.put(Long.valueOf(id2), str);
                                JSONObject jSONObject = new JSONObject();
                                com.bytedance.android.live.core.d.a.a(jSONObject, "guest_user_id", id2);
                                com.bytedance.android.live.liveinteract.platform.common.g.i.a(com.bytedance.android.live.liveinteract.platform.common.g.i.f11979j, true, "invite_request", jSONObject);
                                com.bytedance.android.live.liveinteract.platform.common.g.i.f11977g = System.currentTimeMillis();
                                com.bytedance.android.live.liveinteract.multiguest.a.c.c.f11060a.a(((LinkApi) com.bytedance.android.live.network.e.a().a(LinkApi.class)).linkInRoomAnchorInviteGuest(longValue, id2, user.getSecUid(), LiveInteractAudienceTimeOutSetting.INSTANCE.getValue(), i2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c.a(id2), new c.b(id2, user)));
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            return z.f158842a;
        }
    }

    private final void a(LinkApi.c cVar) {
        String str;
        if (!this.f11307b) {
            this.f11307b = true;
            String str2 = cVar.value;
            h.f.b.l.b(str2, "");
            h.f.b.l.d(str2, "");
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.core.d.a.a(jSONObject, "request_source", str2);
            com.bytedance.android.live.liveinteract.platform.common.g.i.a(com.bytedance.android.live.liveinteract.platform.common.g.i.f11979j, true, "finish_request", jSONObject);
            com.bytedance.android.live.liveinteract.platform.common.g.i.f11976f = System.currentTimeMillis();
            com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkIn_finish", "roomId:" + this.n.getId());
            LinkApi linkApi = (LinkApi) com.bytedance.android.live.network.e.a().a(LinkApi.class);
            long id = this.n.getId();
            com.bytedance.android.livesdk.b.a.d m2 = m();
            if (m2 != null) {
                str = m2.v;
            } else {
                str = null;
            }
            ((ac) linkApi.finishV1(id, str).a(u())).a(new k(this, cVar), new l(this, cVar));
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        h.f.b.l.d(iMessage, "");
        if (iMessage instanceof aj) {
            aj ajVar = (aj) iMessage;
            if (this.y != null && ajVar.c() == aj.a.AUDIENCE_LINKMIC && ajVar.f19139a == 5 && ajVar.f19143i != null) {
                if (ajVar.f19143i.f19579i != 1 && ajVar.f19143i.f19576f == null) {
                    return;
                }
                if (!com.bytedance.android.livesdk.b.a.d.a().f14181b) {
                    com.bytedance.android.live.core.c.a.a(4, com.bytedance.android.live.liveinteract.api.o.f10017a, "handleReplyMessage, receive Reply Message, but multi guest is closed");
                    return;
                }
                if (com.bytedance.android.live.liveinteract.cohost.a.c.a.b()) {
                    com.bytedance.android.live.liveinteract.cohost.a.c.a.a(a.b.DISCONNECT);
                }
                DataChannel dataChannel = this.w;
                if (dataChannel != null) {
                    dataChannel.c(com.bytedance.android.live.liveinteract.api.u.class, "");
                }
                int i2 = ajVar.f19143i.f19579i;
                if (i2 == 1) {
                    com.bytedance.android.livesdk.b.a.d a2 = com.bytedance.android.livesdk.b.a.d.a();
                    h.f.b.l.b(a2, "");
                    a2.a(true);
                    DataChannel dataChannel2 = this.w;
                    if (dataChannel2 != null) {
                        dataChannel2.c(com.bytedance.android.live.liveinteract.platform.common.c.i.class);
                    }
                    com.bytedance.android.livesdk.model.message.d.k.a aVar = ajVar.f19143i;
                    h.f.b.l.b(aVar, "");
                    j();
                    long j2 = aVar.f19575e;
                    User user = aVar.f19576f;
                    h.f.b.l.b(user, "");
                    String secUid = user.getSecUid();
                    String str = aVar.f19577g.f19597h;
                    g.a.f14199a.a(j2, str);
                    if (aVar.f19582l != null) {
                        g.a.f14199a.a((int) aVar.f19582l.f19564b, str);
                    }
                    if (secUid == null) {
                        secUid = "";
                    }
                    h.f.b.l.b(str, "");
                    b(j2, secUid, str);
                    f.a aVar2 = (f.a) this.y;
                    if (aVar2 != null) {
                        aVar2.b(ajVar.f19143i.f19577g.f19597h);
                    }
                    long j3 = ajVar.f19143i.f19575e;
                    com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar3 = this.f11313h;
                    if (aVar3 == null) {
                        h.f.b.l.a("mLinkDataHolder");
                    }
                    com.bytedance.android.live.liveinteract.api.b.n nVar = aVar3.q;
                    b.a.a("livesdk_anchor_guest_connection_success").a().a("enter_from", com.bytedance.android.live.liveinteract.multiguest.a.c.c.a(j3)).a("live_type", "video_live").a("guest_invite_type", "anchor_invite_guest").a("layout_setting", com.bytedance.android.live.liveinteract.multilive.b.a.a(nVar).getFirst()).a("window_setting", com.bytedance.android.live.liveinteract.multilive.b.a.a(nVar).getSecond()).a("permission_type", com.bytedance.android.live.liveinteract.multilive.a.d()).b();
                    long j4 = ajVar.f19143i.f19575e;
                    String str2 = ajVar.f19143i.f19577g.f19597h;
                    h.f.b.l.b(str2, "");
                    com.bytedance.android.live.liveinteract.platform.common.g.i.a(ajVar, j4, str2, 1);
                    return;
                }
                f.a aVar4 = (f.a) this.y;
                if (aVar4 != null) {
                    aVar4.c(ajVar.f19143i.f19576f.displayId);
                }
                com.bytedance.android.live.liveinteract.multiguest.a.c.c.a(ajVar.f19143i.f19575e, false);
                a aVar5 = this.f11308c;
                if (aVar5 != null) {
                    aVar5.c(ajVar.f19143i.f19575e);
                }
                com.bytedance.android.live.liveinteract.platform.common.g.i.a(ajVar, ajVar.f19143i.f19575e, "", (long) i2);
            }
        }
    }

    public final String a(Integer num) {
        String str;
        List<com.bytedance.android.livesdk.chatroom.model.b.e> list;
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11313h;
        if (aVar == null) {
            h.f.b.l.a("mLinkDataHolder");
        }
        int i2 = com.bytedance.android.live.liveinteract.multiguest.opt.a.b.f11407a[aVar.q.ordinal()];
        if (i2 == 1) {
            str = aVar.c().get(1L);
        } else if (i2 == 2) {
            str = aVar.c().get(2L);
        } else if (i2 == 3) {
            Object a2 = com.bytedance.android.live.liveinteract.api.c.e.f10014a.a("LINK_USER_INFO_CENTER");
            if (!(a2 instanceof com.bytedance.android.live.liveinteract.multiguest.a.c.d)) {
                a2 = null;
            }
            com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = (com.bytedance.android.live.liveinteract.multiguest.a.c.d) a2;
            if (!(num == null && (dVar == null || (list = dVar.f11074b) == null || (num = Integer.valueOf(list.size())) == null))) {
                int intValue = num.intValue();
                if (intValue == 2) {
                    str = aVar.c().get(3L);
                } else if (intValue == 3) {
                    str = aVar.c().get(4L);
                } else if (intValue == 4) {
                    str = aVar.c().get(5L);
                }
            }
            str = aVar.c().get(1L);
        } else if (i2 != 4) {
            str = aVar.c().get(0L);
        } else {
            str = aVar.c().get(5L);
        }
        aVar.r = str;
        String str2 = aVar.r;
        if (str2 != null && com.bytedance.android.livesdk.utils.p.a((CharSequence) str2)) {
            return str2;
        }
        com.bytedance.android.livesdk.b.a.d a3 = com.bytedance.android.livesdk.b.a.d.a();
        h.f.b.l.b(a3, "");
        String str3 = a3.f14187h;
        h.f.b.l.b(str3, "");
        return str3;
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void b(String str, String str2) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        b.a.b(str, str2);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void b(int i2, String str) {
        h.f.b.l.d(str, "");
        com.bytedance.android.live.liveinteract.platform.common.g.a.b("OnEndFailed", "position:LinkIn_Anchor; code:" + i2 + "; desc:" + str);
    }

    public b(Room room, DataChannel dataChannel) {
        h.f.b.l.d(room, "");
        h.f.b.l.d(dataChannel, "");
        this.n = room;
        this.o = dataChannel;
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(new com.bytedance.android.live.liveinteract.multiguest.a.c.d(dataChannel), null);
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(this);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void c(int i2, String str) {
        h.f.b.l.d(str, "");
        if (this.y != null) {
            com.bytedance.android.live.liveinteract.platform.common.g.a.b("OnError", "position:LinkIn_Guest; code:" + i2 + "; message:" + str);
            com.bytedance.android.live.liveinteract.platform.common.g.i.a(false, i2, str);
            com.bytedance.android.live.liveinteract.platform.common.g.p.a(com.bytedance.android.live.liveinteract.platform.common.g.p.f12000c, (long) i2, str);
            com.bytedance.android.live.core.c.a.a(6, com.bytedance.android.live.liveinteract.api.o.f10017a, "onError: ".concat(String.valueOf(str)));
            ao.a(y.e(), (int) R.string.grz);
            LinkApi.c cVar = LinkApi.c.RTC_ERROR;
            this.q = true;
            if (cVar != null) {
                a(cVar, PrivacyCert.Builder.Companion.with("bpea-525").usage("").tag("stop link mic when error occurs").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void b(String str, boolean z) {
        h.f.b.l.d(str, "");
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11313h;
        if (aVar == null) {
            h.f.b.l.a("mLinkDataHolder");
        }
        aVar.b().put(str, Boolean.valueOf(z));
        this.o.c(com.bytedance.android.live.liveinteract.multilive.c.k.class, new com.bytedance.android.live.liveinteract.multilive.c.d(str, z));
        com.bytedance.android.live.liveinteract.platform.c.c cVar = this.f11311f;
        if (cVar == null) {
            h.f.b.l.a("mRtcController");
        }
        cVar.d();
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void b(String str, SurfaceView surfaceView) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(surfaceView, "");
        if (this.y != null) {
            com.bytedance.android.live.liveinteract.platform.common.g.a.b("OnFirstRemoteVideoFrame", "position:LinkIn_Anchor; interactId:".concat(String.valueOf(str)));
            com.bytedance.android.live.liveinteract.platform.common.g.i.b(str, true);
            f.a aVar = (f.a) this.y;
            if (aVar != null) {
                aVar.a(str, surfaceView);
            }
            com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = this.f11309d;
            if (dVar == null) {
                h.f.b.l.a("mInfoCenter");
            }
            long b2 = dVar.b(str);
            if (b2 > 0) {
                if (LinkInteractAudienceOptEnableSetting.INSTANCE.getValue()) {
                    com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar2 = this.f11309d;
                    if (dVar2 == null) {
                        h.f.b.l.a("mInfoCenter");
                    }
                    com.bytedance.android.livesdk.chatroom.model.b.e a2 = com.bytedance.android.live.liveinteract.multiguest.a.c.d.a(dVar2, str, 0, 2);
                    if (!(a2 == null || a2.f15722c == null)) {
                        User user = a2.f15722c;
                        h.f.b.l.b(user, "");
                        a(user.getId());
                    }
                }
                String a3 = com.bytedance.android.live.liveinteract.multiguest.a.c.c.a(b2);
                h.f.b.l.d(a3, "");
                if (com.bytedance.android.live.liveinteract.platform.common.g.f.f11959b.isEmpty()) {
                    com.bytedance.android.live.liveinteract.platform.common.g.f.f11958a = System.currentTimeMillis();
                }
                com.bytedance.android.live.liveinteract.platform.common.g.f.f11959b.put(Long.valueOf(b2), a3);
                com.bytedance.android.live.liveinteract.multiguest.a.c.c.a(b2, false);
                com.bytedance.android.livesdk.ab.c.g gVar = new com.bytedance.android.livesdk.ab.c.g();
                User owner = this.n.getOwner();
                h.f.b.l.b(owner, "");
                gVar.f13515a = owner.getId();
                h.f.b.l.b(gVar, "");
                gVar.f13516b = b2;
                HashMap hashMap = new HashMap();
                hashMap.put("room_id", String.valueOf(this.n.getId()));
                User owner2 = this.n.getOwner();
                h.f.b.l.b(owner2, "");
                hashMap.put("anchor_id", String.valueOf(owner2.getId()));
                hashMap.put("channel_id", String.valueOf(this.n.getId()));
                hashMap.put("connection_type", "audience");
                b.a.a().H = System.currentTimeMillis();
                String str2 = b.a.a().x;
                if (!TextUtils.isEmpty(str2)) {
                    if (str2 == null) {
                        h.f.b.l.b();
                    }
                    hashMap.put("request_id", str2);
                }
                b.a.a("connection_success").a((Map<String, String>) hashMap).a(gVar).b();
                com.bytedance.android.live.liveinteract.platform.c.c cVar = this.f11311f;
                if (cVar == null) {
                    h.f.b.l.a("mRtcController");
                }
                h();
                h.f.b.l.d(str, "");
                com.bytedance.android.live.liveinteract.multilive.c.m mVar = new com.bytedance.android.live.liveinteract.multilive.c.m();
                mVar.a();
                mVar.a("onGuestVideoFrameSuc");
                com.bytedance.android.live.liveinteract.multilive.c.n nVar = new com.bytedance.android.live.liveinteract.multilive.c.n();
                nVar.f11768b.add(new com.bytedance.android.live.liveinteract.multilive.c.o(str, 0, false, 6));
                mVar.f11764b = nVar;
                cVar.a(mVar);
            }
        }
    }

    private final void b(long j2, String str, String str2) {
        if (LinkInteractAudienceOptEnableSetting.INSTANCE.getValue() && this.f11317l.get(Long.valueOf(j2)) == null) {
            int value = LiveInteractAudienceTimeOutSetting.INSTANCE.getValue();
            f.a.b.b a2 = ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) f.a.t.b((long) value, TimeUnit.SECONDS).a(u())).a(new v(this, value, j2, str, str2));
            Map<Long, f.a.b.b> map = this.f11317l;
            Long valueOf = Long.valueOf(j2);
            h.f.b.l.b(a2, "");
            map.put(valueOf, a2);
        }
    }

    private final void a(long j2, String str, String str2, int i2) {
        ab<com.bytedance.android.live.liveinteract.platform.a.c.a> g2;
        ac acVar;
        HashMap hashMap = new HashMap();
        hashMap.put("userId", Long.valueOf(j2));
        hashMap.put("roomId", Long.valueOf(this.n.getId()));
        hashMap.put("secUserId", str);
        hashMap.put("interactId", str2);
        hashMap.put("linkmicPermitStatus", Integer.valueOf(i2));
        com.bytedance.android.live.liveinteract.multiguest.b.a n2 = n();
        if (n2 != null && (g2 = n2.g(hashMap)) != null && (acVar = (ac) g2.a(u())) != null) {
            acVar.a(new s(this, i2, j2, str, str2), new t(this, i2, j2, str2));
        }
    }
}
