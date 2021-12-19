package com.bytedance.android.live.liveinteract.multiguest.opt.a.a;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.SurfaceView;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.e;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.au;
import com.bytedance.android.live.liveinteract.multiguest.a.c.d;
import com.bytedance.android.live.liveinteract.multiguest.a.f.g;
import com.bytedance.android.live.liveinteract.multiguest.g.a.a;
import com.bytedance.android.live.liveinteract.multilive.api.MultiLiveApi;
import com.bytedance.android.live.liveinteract.platform.common.g.u;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ah.f;
import com.bytedance.android.livesdk.b.a.g;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.api.LinkReviewApi;
import com.bytedance.android.livesdk.chatroom.viewmodule.bq;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkInteractAudienceOptEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveFixCheckPluginErrorSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveGuestLinkPreInitEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveLinkListOptiEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostReceiveInviteMessageTimeOutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiLiveServerAutoJoinChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.RtcAbLabelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveLinkmicMsgOptimizationAtLeastAvailableTimeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveLinkmicMsgOptimizationSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveSeiTalkSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisableMixStreamTypeSetting;
import com.bytedance.android.livesdk.model.message.d.a.a;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdk.utils.an;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ttnet.TTNetInit;
import com.ss.avframework.livestreamv2.core.Client;
import com.ss.avframework.livestreamv2.core.LiveCore;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.ss.bytertc.engine.livertc.LiveRTCEngine;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class c extends com.bytedance.android.livesdk.chatroom.e.r<g.b> implements com.bytedance.android.live.liveinteract.multiguest.a.e.b, com.bytedance.android.live.liveinteract.platform.c.b, com.bytedance.android.live.liveinteract.platform.common.b.a, OnMessageListener {
    public static final a v = new a((byte) 0);
    private boolean A;
    private boolean B;
    private com.bytedance.android.live.liveinteract.multiguest.g.a.i C;
    private int D;
    private final h.h E;
    private final h.h F;
    private Handler G;
    private final d.a H;
    @com.bytedance.android.live.liveinteract.api.c.d(a = "RTC_CONTROLLER")

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.platform.c.c f11353a;
    @com.bytedance.android.live.liveinteract.api.c.d(a = "LINK_USER_INFO_CENTER")

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.a.c.d f11354b;
    @com.bytedance.android.live.liveinteract.api.c.d(a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.opt.a.a f11355c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11356d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11357e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f11358f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11359g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f11360h;

    /* renamed from: i  reason: collision with root package name */
    public b f11361i = b.NONE;

    /* renamed from: j  reason: collision with root package name */
    public boolean f11362j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f11363k;

    /* renamed from: l  reason: collision with root package name */
    public g.a f11364l;

    /* renamed from: m  reason: collision with root package name */
    public final com.bytedance.android.live.liveinteract.api.a.c f11365m;
    com.bytedance.android.livesdk.chatroom.interact.a n;
    public String o;
    public com.bytedance.android.live.liveinteract.multiguest.a.e.d p;
    public com.bytedance.android.live.liveinteract.api.b.n q;
    public boolean r;
    public com.bytedance.android.live.network.response.b<Void, com.bytedance.android.livesdk.chatroom.model.b.a> s;
    public final Room t;
    public final DataChannel u;
    private boolean z;

    public enum b {
        NONE,
        SUCCEED,
        FAILED;

        static {
            Covode.recordClassIndex(6121);
        }
    }

    static {
        Covode.recordClassIndex(6106);
    }

    private final com.bytedance.android.live.liveinteract.multilive.d.b w() {
        return (com.bytedance.android.live.liveinteract.multilive.d.b) this.F.getValue();
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b, com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void a(int i2, long j2, Object... objArr) {
        h.f.b.l.d(objArr, "");
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b, com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void a(long j2, long j3) {
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void a(String str, Boolean bool) {
        h.f.b.l.d(str, "");
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b, com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void b(long j2, int i2) {
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void b(String str, Boolean bool) {
        h.f.b.l.d(str, "");
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b, com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void b(String str, String str2) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void d(String str) {
        h.f.b.l.d(str, "");
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void g() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(6107);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a(g.b bVar) {
        super.a((bq) bVar);
        com.bytedance.android.livesdk.b.a.d.a().f14181b = true;
        com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = this.f11354b;
        if (dVar == null) {
            h.f.b.l.a("mInfoCenter");
        }
        dVar.a(this.H);
        com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar2 = this.f11354b;
        if (dVar2 == null) {
            h.f.b.l.a("mInfoCenter");
        }
        dVar2.a();
        com.bytedance.android.live.liveinteract.platform.c.c cVar = this.f11353a;
        if (cVar == null) {
            h.f.b.l.a("mRtcController");
        }
        cVar.a(this);
        IMessageManager iMessageManager = this.x;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.LINK_MIC.getIntType(), this);
        }
        IMessageManager iMessageManager2 = this.x;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.LINK_MESSAGE.getIntType(), this);
        }
        this.u.a(this, com.bytedance.android.live.liveinteract.platform.common.c.f.class, new C0222c(this));
        this.u.a(this, com.bytedance.android.live.liveinteract.platform.common.c.e.class, new l(this)).a(this, com.bytedance.android.live.liveinteract.api.ad.class, new m(this)).a(this, com.bytedance.android.live.liveinteract.api.ab.class, new n(this)).a(this, com.bytedance.android.live.liveinteract.api.ac.class, new o(this)).a(this, com.bytedance.android.live.liveinteract.api.aa.class, new p(this)).a(this, com.bytedance.android.live.liveinteract.api.x.class, new q(this)).a(com.bytedance.android.live.liveinteract.api.ah.class, (h.f.a.b) new r(this)).a(this, com.bytedance.android.live.liveinteract.multilive.c.i.class, new s(this)).a(this, com.bytedance.android.live.liveinteract.multilive.c.j.class, new d(this)).a(this, com.bytedance.android.live.liveinteract.multilive.c.e.class, new e(this)).a(this, com.bytedance.android.live.liveinteract.multilive.c.h.class, new f(this)).a(this, com.bytedance.android.live.liveinteract.multilive.a.a.j.class, new g(this)).a(com.bytedance.android.live.liveinteract.multilive.a.a.e.class, (h.f.a.b) new h(this)).a(com.bytedance.android.live.liveinteract.multilive.a.a.g.class, (h.f.a.b) new i(this)).a(com.bytedance.android.live.liveinteract.multilive.a.a.f.class, (h.f.a.b) new j(this)).a(com.bytedance.android.live.n.s.class, (h.f.a.b) new k(this));
        User owner = this.t.getOwner();
        long id = this.t.getId();
        h.f.b.l.b(owner, "");
        ((LinkApi) com.bytedance.android.live.network.e.a().a(LinkApi.class)).isShowGuestLinkHint(id, owner.getId(), owner.getSecUid()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(al.f11383a);
        User owner2 = this.t.getOwner();
        h.f.b.l.b(owner2, "");
        FollowInfo followInfo = owner2.getFollowInfo();
        h.f.b.l.b(followInfo, "");
        com.bytedance.android.live.liveinteract.platform.common.g.h.a("connection_button", followInfo.getFollowStatus());
        User owner3 = this.t.getOwner();
        h.f.b.l.b(owner3, "");
        FollowInfo followInfo2 = owner3.getFollowInfo();
        h.f.b.l.b(followInfo2, "");
        com.bytedance.android.live.liveinteract.platform.common.g.h.a("connection_request", followInfo2.getFollowStatus());
    }

    public final void a(com.bytedance.android.live.network.response.b<Void, com.bytedance.android.livesdk.chatroom.model.b.a> bVar) {
        g.b bVar2 = (g.b) this.y;
        if (bVar2 != null) {
            com.bytedance.android.livesdk.chatroom.model.b.a aVar = (com.bytedance.android.livesdk.chatroom.model.b.a) bVar.extra;
            String str = null;
            List<com.bytedance.android.livesdk.chatroom.model.b.d> list = aVar != null ? aVar.f15692a : null;
            com.bytedance.android.livesdk.chatroom.model.b.a aVar2 = (com.bytedance.android.livesdk.chatroom.model.b.a) bVar.extra;
            if (aVar2 != null) {
                str = aVar2.f15693b;
            }
            bVar2.a(list, str);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, PrivacyCert privacyCert, boolean z2) {
        if (this.y != null) {
            com.bytedance.android.livesdk.b.a.d a2 = com.bytedance.android.livesdk.b.a.d.a();
            h.f.b.l.b(a2, "");
            a2.a(false);
            if (this.f11359g) {
                d(str, z2);
            } else {
                d(false);
            }
            h.f.b.l.d(str, "");
            com.bytedance.android.livesdk.b.a.d.a().y = false;
            com.bytedance.android.live.liveinteract.platform.c.c cVar = this.f11353a;
            if (cVar == null) {
                h.f.b.l.a("mRtcController");
            }
            cVar.a(privacyCert, str);
            com.bytedance.android.live.liveinteract.platform.common.g.a.b("LinkIn_turnOffEngine");
            com.bytedance.android.live.liveinteract.multilive.b.a.c("connection_end");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.bytedance.android.livesdk.chatroom.interact.a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.bytedance.android.live.liveinteract.multiguest.a.e.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r12) {
        /*
        // Method dump skipped, instructions count: 423
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c.a(boolean):void");
    }

    public final void a(PrivacyCert privacyCert) {
        com.bytedance.android.live.liveinteract.platform.c.c cVar = this.f11353a;
        if (cVar == null) {
            h.f.b.l.a("mRtcController");
        }
        if (!cVar.b()) {
            com.bytedance.android.live.liveinteract.platform.c.c cVar2 = this.f11353a;
            if (cVar2 == null) {
                h.f.b.l.a("mRtcController");
            }
            cVar2.a(privacyCert);
            if (this.B) {
                l();
            } else {
                k();
            }
            com.bytedance.android.live.liveinteract.platform.common.g.i.d(false);
            com.bytedance.android.live.liveinteract.platform.c.c cVar3 = this.f11353a;
            if (cVar3 == null) {
                h.f.b.l.a("mRtcController");
            }
            cVar3.d();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b, com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void a(String str) {
        h.f.b.l.d(str, "");
        com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = this.f11354b;
        if (dVar == null) {
            h.f.b.l.a("mInfoCenter");
        }
        com.bytedance.android.live.liveinteract.platform.common.g.i.a(false, dVar.b(str), str);
        com.bytedance.android.live.liveinteract.platform.common.g.a.b("OnUserJoined", "position:LinkIn_Guest; interactId:".concat(String.valueOf(str)));
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11355c;
        if (aVar == null) {
            h.f.b.l.a("mDataHolder");
        }
        if (aVar.f11298h) {
            com.bytedance.android.live.liveinteract.platform.c.c cVar = this.f11353a;
            if (cVar == null) {
                h.f.b.l.a("mRtcController");
            }
            cVar.a(w().a(str));
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = this.f11355c;
            if (aVar2 == null) {
                h.f.b.l.a("mDataHolder");
            }
            aVar2.o++;
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar3 = this.f11355c;
            if (aVar3 == null) {
                h.f.b.l.a("mDataHolder");
            }
            if (aVar3.o == 1) {
                com.bytedance.android.live.liveinteract.multilive.b.a aVar4 = com.bytedance.android.live.liveinteract.multilive.b.a.f11750b;
                com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar5 = this.f11355c;
                if (aVar5 == null) {
                    h.f.b.l.a("mDataHolder");
                }
                com.bytedance.android.live.liveinteract.multilive.b.a.a(aVar4, "connection_start", Integer.valueOf(aVar5.f11302l + 1), 2);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b, com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void a(String str, SurfaceView surfaceView) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(surfaceView, "");
        com.bytedance.android.live.liveinteract.platform.common.g.i.a(str, false);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b, com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void a(String str, long j2) {
        h.f.b.l.d(str, "");
        if (this.y != null) {
            com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = this.f11354b;
            if (dVar == null) {
                h.f.b.l.a("mInfoCenter");
            }
            com.bytedance.android.live.liveinteract.platform.common.g.i.b(false, dVar.b(str), str);
            com.bytedance.android.live.liveinteract.platform.common.g.a.b("OnUserLeaved", "position:LinkIn_Guest; interactId:".concat(String.valueOf(str)));
            g.b bVar = (g.b) this.y;
            if (bVar != null) {
                bVar.a(str);
            }
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11355c;
            if (aVar == null) {
                h.f.b.l.a("mDataHolder");
            }
            if (aVar.f11298h) {
                com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = this.f11355c;
                if (aVar2 == null) {
                    h.f.b.l.a("mDataHolder");
                }
                aVar2.o--;
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void a(com.bytedance.android.live.liveinteract.multilive.c.m mVar, String str) {
        h.f.b.l.d(mVar, "");
        h.f.b.l.d(str, "");
        com.bytedance.android.live.liveinteract.platform.common.g.i.a(false, mVar.f11766d, str);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b, com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void a(String str, String str2) {
        com.bytedance.android.live.liveinteract.multilive.c.n nVar;
        ArrayList<com.bytedance.android.live.liveinteract.multilive.c.o> arrayList;
        com.bytedance.android.live.liveinteract.multilive.c.n nVar2;
        ArrayList<com.bytedance.android.live.liveinteract.multilive.c.o> arrayList2;
        com.bytedance.android.live.liveinteract.multilive.c.n nVar3;
        ArrayList<com.bytedance.android.live.liveinteract.multilive.c.o> arrayList3;
        com.bytedance.android.live.liveinteract.multilive.c.n nVar4;
        ArrayList<com.bytedance.android.live.liveinteract.multilive.c.o> arrayList4;
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11355c;
        if (aVar == null) {
            h.f.b.l.a("mDataHolder");
        }
        if (aVar.f11298h) {
            this.E.getValue();
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
                com.bytedance.android.live.liveinteract.platform.common.g.i.a(false, a2.f11766d, str2, j2);
                g.b bVar = (g.b) this.y;
                if (bVar != null) {
                    bVar.a(a2);
                }
                String str3 = a2.f11763a;
                switch (str3.hashCode()) {
                    case -1564391306:
                        if (!(!str3.equals("onGuestVideoFrameSuc") || (nVar = a2.f11764b) == null || (arrayList = nVar.f11768b) == null)) {
                            for (T t2 : arrayList) {
                                com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = this.f11355c;
                                if (aVar2 == null) {
                                    h.f.b.l.a("mDataHolder");
                                }
                                if (!aVar2.f11294d && h.f.b.l.a((Object) t2.f11769a, (Object) z())) {
                                    c(false);
                                }
                            }
                            return;
                        }
                        return;
                    case -755092020:
                        if (!(!str3.equals("onSyncVideoMuteStatus") || (nVar2 = a2.f11764b) == null || (arrayList2 = nVar2.f11768b) == null)) {
                            for (T t3 : arrayList2) {
                                if (!h.f.b.l.a((Object) t3.f11769a, (Object) z())) {
                                    a(t3.f11769a, t3.f11771c);
                                }
                            }
                            return;
                        }
                        return;
                    case 1072565792:
                        if (!(!str3.equals("onAnchorVideoMute") || (nVar3 = a2.f11764b) == null || (arrayList3 = nVar3.f11768b) == null)) {
                            for (T t4 : arrayList3) {
                                String str4 = t4.f11769a;
                                boolean z2 = t4.f11771c;
                                com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar3 = this.f11355c;
                                if (aVar3 == null) {
                                    h.f.b.l.a("mDataHolder");
                                }
                                aVar3.a().put(str4, Boolean.valueOf(z2));
                                this.u.c(com.bytedance.android.live.liveinteract.multilive.c.c.class, Boolean.valueOf(!z2));
                            }
                            return;
                        }
                        return;
                    case 1961349627:
                        if (!(!str3.equals("onGuestVideoMute") || (nVar4 = a2.f11764b) == null || (arrayList4 = nVar4.f11768b) == null)) {
                            for (T t5 : arrayList4) {
                                if (!h.f.b.l.a((Object) t5.f11769a, (Object) z())) {
                                    a(t5.f11769a, t5.f11771c);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void a(String str, boolean z2) {
        h.f.b.l.d(str, "");
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11355c;
        if (aVar == null) {
            h.f.b.l.a("mDataHolder");
        }
        aVar.a().put(str, Boolean.valueOf(z2));
        this.u.c(com.bytedance.android.live.liveinteract.multilive.c.l.class, new com.bytedance.android.live.liveinteract.multilive.c.r(str, z2));
    }

    static final class aj extends h.f.b.m implements h.f.a.a<com.bytedance.android.live.liveinteract.multilive.d.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final aj f11381a = new aj();

        static {
            Covode.recordClassIndex(6118);
        }

        aj() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.android.live.liveinteract.multilive.d.b invoke() {
            return new com.bytedance.android.live.liveinteract.multilive.d.b();
        }
    }

    static final class ai extends h.f.b.m implements h.f.a.a<com.bytedance.android.live.liveinteract.multilive.d.a> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(6117);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ai(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.android.live.liveinteract.multilive.d.a invoke() {
            return new com.bytedance.android.live.liveinteract.multilive.d.a(this.this$0.u);
        }
    }

    private static String z() {
        com.bytedance.android.livesdk.b.a.d a2 = com.bytedance.android.livesdk.b.a.d.a();
        h.f.b.l.b(a2, "");
        return a2.f14185f;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.e.b
    public final void a() {
        com.bytedance.android.livesdk.chatroom.interact.a aVar = this.n;
        if (aVar != null) {
            aVar.a();
        }
        com.bytedance.android.live.liveinteract.platform.common.g.a.b("LinkIn_startVideoCapture");
    }

    public final com.bytedance.android.live.liveinteract.platform.c.c h() {
        com.bytedance.android.live.liveinteract.platform.c.c cVar = this.f11353a;
        if (cVar == null) {
            h.f.b.l.a("mRtcController");
        }
        return cVar;
    }

    public final com.bytedance.android.live.liveinteract.multiguest.a.c.d i() {
        com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = this.f11354b;
        if (dVar == null) {
            h.f.b.l.a("mInfoCenter");
        }
        return dVar;
    }

    public final com.bytedance.android.live.liveinteract.multiguest.opt.a.a j() {
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11355c;
        if (aVar == null) {
            h.f.b.l.a("mDataHolder");
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public static final class v implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f11391a;

        static {
            Covode.recordClassIndex(6141);
        }

        v(Activity activity) {
            this.f11391a = activity;
        }

        public final void run() {
            String str = Build.MODEL;
            h.f.b.l.b(str, "");
            if (h.f.b.l.a((Object) "SO-04J", (Object) str)) {
                this.f11391a.recreate();
            }
        }
    }

    private static long y() {
        com.bytedance.android.livesdk.at.f b2 = com.bytedance.android.livesdk.userservice.u.a().b();
        h.f.b.l.b(b2, "");
        return b2.c();
    }

    public final h.z n() {
        g.b bVar = (g.b) this.y;
        if (bVar == null) {
            return null;
        }
        com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = this.f11354b;
        if (dVar == null) {
            h.f.b.l.a("mInfoCenter");
        }
        bVar.a(dVar.f11074b);
        return h.z.f158842a;
    }

    public final void o() {
        com.bytedance.android.live.liveinteract.multiguest.g.a.i iVar = this.C;
        if (iVar != null && iVar.n()) {
            com.bytedance.android.live.liveinteract.multiguest.g.a.i iVar2 = this.C;
            if (iVar2 != null) {
                iVar2.dismiss();
            }
            this.C = null;
        }
    }

    public final boolean q() {
        Boolean valueOf;
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11355c;
        if (aVar == null) {
            h.f.b.l.a("mDataHolder");
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(aVar.f11298h);
        }
        return valueOf.booleanValue();
    }

    private final void x() {
        g.b bVar;
        this.u.c(com.bytedance.android.live.liveinteract.api.l.class, new com.bytedance.android.livesdk.chatroom.c.q(4));
        com.bytedance.android.live.liveinteract.api.a.c.a().a((Integer) 0);
        if (this.y != null && (bVar = (g.b) this.y) != null) {
            bVar.d();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.e.b
    public final void d() {
        JSONObject jSONObject = new JSONObject();
        com.bytedance.android.livesdk.b.a.d a2 = com.bytedance.android.livesdk.b.a.d.a();
        h.f.b.l.b(a2, "");
        com.bytedance.android.live.core.d.a.a(jSONObject, "rtc_ext_info", a2.f14187h);
        com.bytedance.android.live.liveinteract.platform.common.g.i iVar = com.bytedance.android.live.liveinteract.platform.common.g.i.f11979j;
        com.bytedance.android.live.liveinteract.platform.common.g.i.a((com.bytedance.android.live.liveinteract.platform.common.g.i) false, (boolean) "rtc_dispose", (String) jSONObject, (JSONObject) 0);
        com.bytedance.android.live.liveinteract.platform.c.c cVar = this.f11353a;
        if (cVar == null) {
            h.f.b.l.a("mRtcController");
        }
        Client client = cVar.f11892g;
        if (client != null) {
            client.dispose();
        }
    }

    public final void m() {
        ((com.bytedance.android.livesdk.util.rxutils.autodispose.ac) ((LinkReviewApi) com.bytedance.android.live.network.e.a().a(LinkReviewApi.class)).bannedInfo(13).a(u())).a(new ab(this), new ac(this));
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b, com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void f() {
        com.bytedance.android.livesdk.b.a.d a2 = com.bytedance.android.livesdk.b.a.d.a();
        h.f.b.l.b(a2, "");
        if (a2.f14182c) {
            a("rtc_end", PrivacyCert.Builder.Companion.with("bpea-780").usage("").tag("stop link mic").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build(), false);
        }
        com.bytedance.android.livesdk.b.a.d.a().y = false;
        this.p.f11129a.d();
        this.A = false;
        this.f11362j = false;
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11355c;
        if (aVar == null) {
            h.f.b.l.a("mDataHolder");
        }
        aVar.f11303m = false;
        this.z = false;
        this.D = -1;
        com.bytedance.android.live.liveinteract.platform.common.g.a.b("onEndSuccess", "position:LinkIn_Guest");
        com.bytedance.android.live.liveinteract.platform.common.g.i.e(false);
        this.u.c(com.bytedance.android.live.liveinteract.api.g.class, new com.bytedance.android.live.liveinteract.api.b.e(false, null));
        this.o = null;
        com.bytedance.android.live.liveinteract.platform.common.g.u.a();
    }

    public final void k() {
        this.B = false;
        com.bytedance.android.live.liveinteract.platform.c.c cVar = this.f11353a;
        if (cVar == null) {
            h.f.b.l.a("mRtcController");
        }
        if (cVar.f11889d) {
            f(false);
            com.bytedance.android.live.liveinteract.platform.c.c cVar2 = this.f11353a;
            if (cVar2 == null) {
                h.f.b.l.a("mRtcController");
            }
            cVar2.b(false);
            if (this.f11354b == null) {
                h.f.b.l.a("mInfoCenter");
            }
            com.bytedance.android.live.liveinteract.multiguest.a.c.d.a(d.c.FOREGROUND);
            com.bytedance.android.livesdk.chatroom.interact.a aVar = this.n;
            if (aVar != null) {
                aVar.b_(PrivacyCert.Builder.Companion.with("bpea-402").usage("").tag("Switch to the foreground during link mic").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = this.f11355c;
            if (aVar2 == null) {
                h.f.b.l.a("mDataHolder");
            }
            if (aVar2.f11294d) {
                e(true);
            }
        }
    }

    public final void l() {
        this.B = true;
        com.bytedance.android.live.liveinteract.platform.c.c cVar = this.f11353a;
        if (cVar == null) {
            h.f.b.l.a("mRtcController");
        }
        if (cVar.f11889d) {
            f(true);
            com.bytedance.android.live.liveinteract.platform.c.c cVar2 = this.f11353a;
            if (cVar2 == null) {
                h.f.b.l.a("mRtcController");
            }
            cVar2.g();
            if (this.f11354b == null) {
                h.f.b.l.a("mInfoCenter");
            }
            com.bytedance.android.live.liveinteract.multiguest.a.c.d.a(d.c.BACKGROUND);
            com.bytedance.android.livesdk.chatroom.interact.a aVar = this.n;
            if (aVar != null) {
                aVar.a_(PrivacyCert.Builder.Companion.with("bpea-396").usage("").tag("guest switch to background during link mic").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
        }
        if (com.bytedance.android.livesdk.b.a.d.a().u > 0) {
            com.bytedance.android.live.liveinteract.platform.common.g.z.d(null);
        }
    }

    public final void p() {
        if (!this.f11358f) {
            if (com.bytedance.android.livesdk.b.a.d.a().z) {
                com.bytedance.android.livesdk.ab.i.b();
                com.bytedance.android.livesdk.ab.i.b("multi-guest", "join channel, but guest is leaving or already left");
                return;
            }
            this.f11358f = true;
            this.f11359g = true;
            com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkIn_JoinChannel", "position:Guest; roomId:" + this.t.getId());
            com.bytedance.android.live.liveinteract.platform.common.g.i.b();
            long id = this.t.getId();
            com.bytedance.android.livesdk.b.a.d a2 = com.bytedance.android.livesdk.b.a.d.a();
            h.f.b.l.b(a2, "");
            ((com.bytedance.android.livesdk.util.rxutils.autodispose.ac) ((LinkApi) com.bytedance.android.live.network.e.a().a(LinkApi.class)).joinChannelV1(id, a2.v).a(u())).a(new ae(this), new af(this));
        }
    }

    public final com.bytedance.android.livesdk.util.rxutils.autodispose.ac<com.bytedance.android.live.network.response.d<com.bytedance.android.live.liveinteract.multilive.c.g>> s() {
        long j2;
        long j3;
        boolean z2;
        if (this.y == null) {
            return null;
        }
        try {
            Room room = (Room) DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.j.ac.class);
            if (room != null) {
                j3 = room.getId();
                j2 = room.getOwnerUserId();
            } else {
                j2 = 0;
                j3 = 0;
            }
            if (j3 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (j2 != 0) {
                return (com.bytedance.android.livesdk.util.rxutils.autodispose.ac) ((MultiLiveApi) com.bytedance.android.live.network.e.a().a(MultiLiveApi.class)).getListByType(j3, j2, j3, 3).a(new aa(this)).a(u());
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public static final class ak extends d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f11382a;

        static {
            Covode.recordClassIndex(6119);
        }

        @Override // com.bytedance.android.live.liveinteract.multiguest.a.c.d.a
        public final void a() {
            boolean z;
            boolean z2;
            if (this.f11382a.j().f11298h) {
                this.f11382a.u.b(au.class, new com.bytedance.android.live.liveinteract.api.b.m(this.f11382a.j().q, this.f11382a.i().g()));
                com.bytedance.android.livesdk.util.rxutils.autodispose.ac<com.bytedance.android.live.network.response.d<com.bytedance.android.live.liveinteract.multilive.c.g>> s = this.f11382a.s();
                if (s != null) {
                    s.a(new com.bytedance.android.livesdk.at.g());
                }
            }
            g.b bVar = (g.b) this.f11382a.y;
            if (bVar != null) {
                bVar.b(this.f11382a.i().f11074b);
            }
            if (LinkInteractAudienceOptEnableSetting.INSTANCE.getValue()) {
                com.bytedance.android.livesdk.at.f b2 = com.bytedance.android.livesdk.userservice.u.a().b();
                h.f.b.l.b(b2, "");
                long c2 = b2.c();
                if (this.f11382a.a(c2) == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.f11382a.a(c2) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z && this.f11382a.h().f11889d) {
                    if (!z2 || !LiveLinkListOptiEnableSetting.INSTANCE.getValue()) {
                        this.f11382a.a("leave_with_linked_changed", PrivacyCert.Builder.Companion.with("bpea-471").usage("").tag("stop link mic").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build(), false);
                    }
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ak(c cVar) {
            this.f11382a = cVar;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.e.b
    public final void c() {
        com.bytedance.android.livesdk.chatroom.interact.a aVar;
        if (!this.z) {
            this.z = true;
            com.bytedance.android.live.liveinteract.platform.common.g.a.b("LinkIn_turnOnEngine");
            com.bytedance.android.livesdk.b.a.d.a().f14189j = System.currentTimeMillis();
            com.bytedance.android.live.liveinteract.platform.common.g.i.a(false);
            com.bytedance.android.livesdk.b.a.d.a().y = true;
            if (LiveGuestLinkPreInitEnableSetting.INSTANCE.getValue() && (aVar = this.n) != null && (aVar instanceof com.bytedance.android.live.broadcast.api.e.a)) {
                ((com.bytedance.android.live.broadcast.api.e.a) aVar).b(PrivacyCert.Builder.Companion.with("bpea-1048").usage("").tag("Multi guest pre init strategy start audio ").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
            com.bytedance.android.live.liveinteract.platform.c.c cVar = this.f11353a;
            if (cVar == null) {
                h.f.b.l.a("mRtcController");
            }
            Client client = cVar.f11892g;
            if (client != null) {
                client.joinChannel();
            }
            com.bytedance.android.live.liveinteract.platform.c.c cVar2 = this.f11353a;
            if (cVar2 == null) {
                h.f.b.l.a("mRtcController");
            }
            if (cVar2.f11886a != null) {
                com.bytedance.android.live.liveinteract.platform.c.c cVar3 = this.f11353a;
                if (cVar3 == null) {
                    h.f.b.l.a("mRtcController");
                }
                LiveCore.InteractConfig interactConfig = cVar3.f11886a;
                Config.MixStreamType mixStreamType = null;
                if (!(interactConfig == null || interactConfig.getMixStreamType() == null || !TestDisableMixStreamTypeSetting.INSTANCE.getValue())) {
                    com.bytedance.android.live.liveinteract.platform.c.c cVar4 = this.f11353a;
                    if (cVar4 == null) {
                        h.f.b.l.a("mRtcController");
                    }
                    LiveCore.InteractConfig interactConfig2 = cVar4.f11886a;
                    if (interactConfig2 != null) {
                        mixStreamType = interactConfig2.getMixStreamType();
                    }
                    this.u.b(com.bytedance.android.live.liveinteract.api.ae.class, String.valueOf(mixStreamType));
                }
            }
            g.b bVar = (g.b) this.y;
            if (bVar != null) {
                com.bytedance.android.livesdk.b.a.d a2 = com.bytedance.android.livesdk.b.a.d.a();
                h.f.b.l.b(a2, "");
                bVar.a(a2.f14185f, (SurfaceView) this.n);
            }
        }
    }

    public final String r() {
        String str;
        List<com.bytedance.android.livesdk.chatroom.model.b.e> list;
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11355c;
        if (aVar == null) {
            h.f.b.l.a("mDataHolder");
        }
        int i2 = com.bytedance.android.live.liveinteract.multiguest.opt.a.b.f11408b[aVar.q.ordinal()];
        if (i2 == 1) {
            str = aVar.c().get(101L);
        } else if (i2 == 2) {
            str = aVar.c().get(102L);
        } else if (i2 == 3) {
            Object a2 = com.bytedance.android.live.liveinteract.api.c.e.f10014a.a("LINK_USER_INFO_CENTER");
            if (!(a2 instanceof com.bytedance.android.live.liveinteract.multiguest.a.c.d)) {
                a2 = null;
            }
            com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = (com.bytedance.android.live.liveinteract.multiguest.a.c.d) a2;
            if (!(dVar == null || (list = dVar.f11074b) == null)) {
                int size = list.size();
                if (size == 2) {
                    str = aVar.c().get(103L);
                } else if (size == 3) {
                    str = aVar.c().get(104L);
                } else if (size == 4) {
                    str = aVar.c().get(105L);
                }
            }
            str = aVar.c().get(101L);
        } else if (i2 != 4) {
            str = aVar.c().get(0L);
        } else {
            str = aVar.c().get(105L);
        }
        if (str == null || !com.bytedance.android.livesdk.utils.p.a((CharSequence) str)) {
            return this.o;
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        if (r9.f11363k == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f5, code lost:
        if (1 != r0.intValue()) goto L_0x003c;
     */
    @Override // com.bytedance.ies.a.b, com.bytedance.android.livesdk.chatroom.e.r
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
        // Method dump skipped, instructions count: 265
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c.b():void");
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b, com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void e() {
        a.EnumC0216a aVar;
        a.EnumC0216a aVar2;
        String str;
        String str2;
        String str3;
        if (this.y != null) {
            com.bytedance.android.live.liveinteract.platform.common.g.a.b("OnStartSuccess", "position:LinkIn_Guest");
            com.bytedance.android.live.liveinteract.platform.common.g.i.c(false);
            b.a.a().H = System.currentTimeMillis();
            this.z = false;
            com.bytedance.android.live.liveinteract.api.a.c.a().a((Integer) 2);
            g.b bVar = (g.b) this.y;
            a.EnumC0216a aVar3 = null;
            if (bVar != null) {
                aVar = bVar.h();
            } else {
                aVar = null;
            }
            if (aVar != a.EnumC0216a.SEND_REQUEST || !this.f11362j) {
                g.b bVar2 = (g.b) this.y;
                if (bVar2 != null) {
                    aVar2 = bVar2.h();
                } else {
                    aVar2 = null;
                }
                if (aVar2 == a.EnumC0216a.GO_LIVE && this.f11361i == b.SUCCEED && this.f11362j) {
                    b(PrivacyCert.Builder.Companion.with("bpea-512").usage("").tag("link mic start to push stream").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                }
            } else {
                b(PrivacyCert.Builder.Companion.with("bpea-511").usage("").tag("link mic start to push stream").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
            com.bytedance.android.live.liveinteract.api.a.c a2 = com.bytedance.android.live.liveinteract.api.a.c.a();
            HashMap hashMap = new HashMap();
            hashMap.put("room_id", String.valueOf(this.t.getId()));
            hashMap.put("channel_id", String.valueOf(this.t.getId()));
            hashMap.put("connection_type", "audience");
            if (a2.f9956h) {
                str = String.valueOf(an.a(a2.f9958j));
            } else {
                str = "1440";
            }
            hashMap.put("time", str);
            hashMap.put("anchor_id", String.valueOf(this.t.getOwnerUserId()));
            if (com.bytedance.android.live.liveinteract.api.a.c.a().f9959k == 1) {
                str2 = "video";
            } else {
                str2 = "voice";
            }
            hashMap.put("guest_connection_type", str2);
            hashMap.put("weight_decay_type", String.valueOf(com.bytedance.android.live.liveinteract.api.a.c.a().f9960l));
            hashMap.put("live_type", "video_live");
            hashMap.put("permission_type", com.bytedance.android.live.liveinteract.multilive.a.d());
            if (this.y != null) {
                g.b bVar3 = (g.b) this.y;
                if (bVar3 != null) {
                    aVar3 = bVar3.h();
                }
                if (aVar3 == a.EnumC0216a.SEND_REQUEST) {
                    str3 = "guest_apply_anchor";
                } else {
                    str3 = "anchor_invite_guest";
                }
                hashMap.put("guest_invite_type", str3);
                h.f.b.l.d(str3, "");
                com.bytedance.android.live.liveinteract.platform.common.g.g.f11961a = System.currentTimeMillis();
                com.bytedance.android.live.liveinteract.platform.common.g.g.f11962b = str3;
            }
            User owner = this.t.getOwner();
            h.f.b.l.b(owner, "");
            FollowInfo followInfo = owner.getFollowInfo();
            h.f.b.l.b(followInfo, "");
            hashMap.put("anchor_relationship", String.valueOf(followInfo.getFollowStatus()));
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar4 = this.f11355c;
            if (aVar4 == null) {
                h.f.b.l.a("mDataHolder");
            }
            hashMap.put("layout_setting", com.bytedance.android.live.liveinteract.multilive.b.a.a(aVar4.q).getFirst());
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar5 = this.f11355c;
            if (aVar5 == null) {
                h.f.b.l.a("mDataHolder");
            }
            hashMap.put("window_setting", com.bytedance.android.live.liveinteract.multilive.b.a.a(aVar5.q).getSecond());
            b.a.a("guest_connection_success").a((Map<String, String>) hashMap).d("live_detail").b("live_function").a(this.u).b();
            com.bytedance.android.livesdk.ab.c.g gVar = new com.bytedance.android.livesdk.ab.c.g();
            User owner2 = this.t.getOwner();
            h.f.b.l.b(owner2, "");
            gVar.f13515a = owner2.getId();
            h.f.b.l.b(gVar, "");
            gVar.f13516b = y();
            String str4 = b.a.a().x;
            if (!TextUtils.isEmpty(str4)) {
                if (str4 == null) {
                    h.f.b.l.b();
                }
                hashMap.put("request_id", str4);
            }
            b.a.a("connection_success").a((Map<String, String>) hashMap).a(gVar).b();
            DataChannel dataChannel = this.u;
            com.bytedance.android.livesdk.b.a.d a3 = com.bytedance.android.livesdk.b.a.d.a();
            h.f.b.l.b(a3, "");
            Config.Vendor fromValue = Config.Vendor.fromValue(a3.f14186g);
            h.f.b.l.b(fromValue, "");
            dataChannel.c(com.bytedance.android.live.liveinteract.api.g.class, new com.bytedance.android.live.liveinteract.api.b.e(true, fromValue.name()));
            u.c cVar = u.c.AUDIENCE;
            h.f.b.l.d(cVar, "");
            if (!com.bytedance.android.live.liveinteract.platform.common.g.u.f12012a) {
                com.bytedance.android.live.liveinteract.platform.common.g.u.f12012a = true;
                com.bytedance.android.live.liveinteract.platform.common.g.u.f12013b = cVar;
                com.bytedance.android.live.liveinteract.platform.common.g.u.f12014c = u.b.AUDIENCE_LINKMIC;
                f.a.b.b bVar4 = com.bytedance.android.live.liveinteract.platform.common.g.u.f12018g;
                if (bVar4 != null) {
                    bVar4.dispose();
                }
                com.bytedance.android.live.liveinteract.platform.common.g.u.f12018g = f.a.t.a(1, TimeUnit.MINUTES).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new u.g(cVar), u.h.f12027a);
            }
            if (this.f11361i == b.FAILED) {
                a("reply", PrivacyCert.Builder.Companion.with("bpea-475").usage("").tag("stop link mic").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build(), false);
            }
        }
    }

    public static final class w implements com.bytedance.android.livesdk.ah.b.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f11392a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f11393b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f11394c;

        static {
            Covode.recordClassIndex(6142);
        }

        @Override // com.bytedance.android.livesdk.ah.b.d
        public final void b(String... strArr) {
            h.f.b.l.d(strArr, "");
        }

        public static final class a implements IHostPlugin.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ w f11395a;

            static {
                Covode.recordClassIndex(6143);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            a(w wVar) {
                this.f11395a = wVar;
            }

            @Override // com.bytedance.android.livesdkapi.host.IHostPlugin.a
            public final void a(String str) {
                Context context;
                com.bytedance.android.livesdk.h.a aVar;
                h.f.b.l.d(str, "");
                c cVar = this.f11395a.f11392a;
                int i2 = this.f11395a.f11394c;
                if (cVar.y != null) {
                    g.b bVar = (g.b) cVar.y;
                    if (bVar != null) {
                        context = bVar.getContext();
                    } else {
                        context = null;
                    }
                    if (LiveFixCheckPluginErrorSetting.INSTANCE.getValue()) {
                        aVar = com.bytedance.android.livesdk.h.a.Camera;
                    } else {
                        aVar = com.bytedance.android.livesdk.h.a.LiveResource;
                    }
                    if (aVar.isInstalled()) {
                        ((IBroadcastService) com.bytedance.android.live.t.a.a(IBroadcastService.class)).init();
                        cVar.a((c) i2, false);
                        return;
                    }
                    aVar.checkInstall(context, "interact", new x(cVar, i2));
                }
            }
        }

        @Override // com.bytedance.android.livesdk.ah.b.d
        public final void a(String... strArr) {
            h.f.b.l.d(strArr, "");
            com.bytedance.android.livesdk.h.a.LiveResource.checkInstall(this.f11393b, "interact", new a(this));
        }

        w(c cVar, Context context, int i2) {
            this.f11392a = cVar;
            this.f11393b = context;
            this.f11394c = i2;
        }
    }

    public static final class ad implements com.bytedance.android.live.liveinteract.platform.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f11369a;

        static {
            Covode.recordClassIndex(6111);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ad(c cVar) {
            this.f11369a = cVar;
        }

        static final class a implements LiveCore.InteractConfig.UrlDispatcher {

            /* renamed from: a  reason: collision with root package name */
            public static final a f11370a = new a();

            static {
                Covode.recordClassIndex(6112);
            }

            a() {
            }

            @Override // com.ss.avframework.livestreamv2.core.LiveCore.InteractConfig.UrlDispatcher
            public final String urlDispatch(String str) {
                try {
                    com.bytedance.frameworks.baselib.network.http.cronet.b.k ttUrlDispatch = TTNetInit.ttUrlDispatch(str);
                    h.f.b.l.b(ttUrlDispatch, "");
                    if (TextUtils.isEmpty(ttUrlDispatch.f29086b)) {
                        return str;
                    }
                    return ttUrlDispatch.f29086b;
                } catch (Throwable unused) {
                    return str;
                }
            }
        }

        @Override // com.bytedance.android.live.liveinteract.platform.c.a
        public final LiveCore.InteractConfig a(LiveCore.InteractConfig interactConfig) {
            Config.VideoQuality videoQuality;
            h.f.b.l.d(interactConfig, "");
            Config logReportInterval = interactConfig.setContext(com.bytedance.android.live.core.f.y.e()).setRtcExtInfo(this.f11369a.r()).setLogReportInterval(5);
            com.bytedance.android.livesdkapi.depend.model.live.s streamUrlExtraSafely = this.f11369a.t.getStreamUrlExtraSafely();
            h.f.b.l.b(streamUrlExtraSafely, "");
            if (streamUrlExtraSafely.f23191m > 0) {
                videoQuality = Config.VideoQuality.GUEST_HIGH;
            } else {
                videoQuality = Config.VideoQuality.GUEST_NORMAL;
            }
            Config videoQuality2 = logReportInterval.setVideoQuality(videoQuality);
            com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class);
            h.f.b.l.b(a2, "");
            videoQuality2.setProjectKey(((com.bytedance.android.live.i.a.d) a2).getProjectKey()).setInteractMode(Config.InteractMode.NORMAL).setCharacter(Config.Character.GUEST).setMixStreamType(Config.MixStreamType.SERVER_MIX).enableAudioOnBackground(true);
            if (LiveSeiTalkSetting.INSTANCE.enable()) {
                interactConfig.setVolumeCallbackInterval(LiveSeiTalkSetting.INSTANCE.getInterval());
            }
            interactConfig.setType(Config.Type.VIDEO);
            interactConfig.setRtcABTestConfig(RtcAbLabelSetting.INSTANCE.getValue());
            interactConfig.setUrlDispatcher(a.f11370a);
            return interactConfig;
        }
    }

    public static final class x implements IHostPlugin.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f11396a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11397b;

        static {
            Covode.recordClassIndex(6144);
        }

        static final class b<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            public static final b f11399a = new b();

            static {
                Covode.recordClassIndex(6146);
            }

            b() {
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                Throwable th = (Throwable) obj;
                h.f.b.l.d(th, "");
                com.bytedance.android.live.core.c.a.b(th.getMessage());
            }
        }

        @Override // com.bytedance.android.livesdkapi.host.IHostPlugin.a
        public final void a(String str) {
            h.f.b.l.d(str, "");
            ((IBroadcastService) com.bytedance.android.live.t.a.a(IBroadcastService.class)).loadShortVideoRes().a(new a(this), b.f11399a);
        }

        static final class a<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ x f11398a;

            static {
                Covode.recordClassIndex(6145);
            }

            a(x xVar) {
                this.f11398a = xVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                int intValue = ((Number) obj).intValue();
                if (intValue == 1) {
                    ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.gy8);
                } else if (intValue != 2) {
                    ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.gy7);
                } else {
                    ((IBroadcastService) com.bytedance.android.live.t.a.a(IBroadcastService.class)).init();
                    this.f11398a.f11396a.a((c) this.f11398a.f11397b, false);
                }
            }
        }

        x(c cVar, int i2) {
            this.f11396a = cVar;
            this.f11397b = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.b<Boolean, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(6123);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Boolean bool) {
            this.this$0.c(bool.booleanValue());
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends h.f.b.m implements h.f.a.b<h.z, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(6126);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(h.z zVar) {
            h.f.b.l.d(zVar, "");
            this.this$0.c("leave_normally", false);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.f.b.m implements h.f.a.b<h.z, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(6127);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(h.z zVar) {
            h.f.b.l.d(zVar, "");
            this.this$0.o();
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends h.f.b.m implements h.f.a.b<h.z, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(6128);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(h.z zVar) {
            h.f.b.l.d(zVar, "");
            this.this$0.a(2, true);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j extends h.f.b.m implements h.f.a.b<h.z, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(6129);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(h.z zVar) {
            h.f.b.l.d(zVar, "");
            this.this$0.o();
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.f.b.m implements h.f.a.b<h.z, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(6130);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(h.z zVar) {
            h.f.b.l.d(zVar, "");
            this.this$0.o();
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class r extends h.f.b.m implements h.f.a.b<Boolean, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(6137);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Boolean bool) {
            bool.booleanValue();
            this.this$0.f("leave_source_cancel_with_other");
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class s extends h.f.b.m implements h.f.a.b<Boolean, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(6138);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Boolean bool) {
            this.this$0.b(bool.booleanValue());
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b, com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void b(String str) {
        h.f.b.l.d(str, "");
        com.bytedance.android.live.liveinteract.platform.common.g.i.c(str, false);
    }

    /* access modifiers changed from: package-private */
    public static final class ac<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f11368a;

        static {
            Covode.recordClassIndex(6110);
        }

        ac(c cVar) {
            this.f11368a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Context context;
            Throwable th = (Throwable) obj;
            g.b bVar = (g.b) this.f11368a.y;
            if (bVar != null) {
                context = bVar.getContext();
            } else {
                context = null;
            }
            com.bytedance.android.livesdk.utils.f.a(context, th);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o extends h.f.b.m implements h.f.a.b<com.bytedance.android.livesdk.chatroom.model.c.b, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(6134);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.android.livesdk.chatroom.model.c.b bVar) {
            com.bytedance.android.livesdk.chatroom.model.c.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            g.b bVar3 = (g.b) this.this$0.y;
            if (bVar3 != null) {
                bVar3.a(bVar2);
            }
            return h.z.f158842a;
        }
    }

    private final void f(boolean z2) {
        if (z2) {
            b(false);
            return;
        }
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11355c;
        if (aVar == null) {
            h.f.b.l.a("mDataHolder");
        }
        b(aVar.f11293c);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b, com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void c(String str) {
        com.bytedance.android.live.core.c.a.a(5, com.bytedance.android.live.liveinteract.api.o.f10017a, "onWarn: ".concat(String.valueOf(str)));
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void e(String str) {
        h.f.b.l.d(str, "");
        com.bytedance.android.live.liveinteract.platform.common.g.i.a(false, str);
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11355c;
        if (aVar == null) {
            h.f.b.l.a("mDataHolder");
        }
        aVar.d();
    }

    /* access modifiers changed from: package-private */
    public static final class ab<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f11367a;

        static {
            Covode.recordClassIndex(6109);
        }

        ab(c cVar) {
            this.f11367a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.livesdk.chatroom.model.g gVar;
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            Context context = null;
            if (dVar != null) {
                gVar = (com.bytedance.android.livesdk.chatroom.model.g) dVar.data;
            } else {
                gVar = null;
            }
            g.b bVar = (g.b) this.f11367a.y;
            if (bVar != null) {
                context = bVar.getContext();
            }
            com.bytedance.android.live.liveinteract.multiguest.a.c.a.a(gVar, context, (androidx.lifecycle.m) this.f11367a.y);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ag<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f11373a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f11374b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ HashMap f11375c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f11376d;

        static {
            Covode.recordClassIndex(6115);
        }

        ag(c cVar, String str, HashMap hashMap, boolean z) {
            this.f11373a = cVar;
            this.f11374b = str;
            this.f11375c = hashMap;
            this.f11376d = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkIn_leave_Success", "position:leaveChannel");
            com.bytedance.android.live.liveinteract.platform.common.g.i.b(this.f11374b, this.f11375c);
            this.f11373a.f11360h = false;
            this.f11373a.f11359g = false;
            this.f11373a.f11363k = false;
            com.bytedance.android.livesdk.b.a.d.a().z = true;
            this.f11373a.d(this.f11376d);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ah<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f11377a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f11378b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ HashMap f11379c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f11380d;

        static {
            Covode.recordClassIndex(6116);
        }

        ah(c cVar, String str, HashMap hashMap, boolean z) {
            this.f11377a = cVar;
            this.f11378b = str;
            this.f11379c = hashMap;
            this.f11380d = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            h.f.b.l.d(th, "");
            this.f11377a.f11360h = false;
            this.f11377a.a(th);
            com.bytedance.android.live.liveinteract.platform.common.g.i.a(this.f11378b, th, this.f11379c);
            com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkIn_leave_Failed", "position:leaveChannel; throwable:".concat(String.valueOf(th)));
            com.bytedance.android.livesdk.b.a.d.a().z = false;
            this.f11377a.d(this.f11380d);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class al<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final al f11383a = new al();

        static {
            Covode.recordClassIndex(6120);
        }

        al() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            int i2 = -1;
            for (com.bytedance.android.livesdk.chatroom.model.b.a.b bVar : ((com.bytedance.android.livesdk.chatroom.model.b.a.a) ((com.bytedance.android.live.network.response.d) obj).data).f15694a) {
                if (bVar.f15695a == 25) {
                    i2 = bVar.f15696b;
                }
            }
            if (i2 == 0 || i2 == 1) {
                com.bytedance.android.livesdk.b.a.d.a().o = true;
            } else if (i2 == 2) {
                com.bytedance.android.livesdk.b.a.d.a().o = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.b<h.z, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(6124);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(h.z zVar) {
            h.f.b.l.d(zVar, "");
            com.bytedance.android.livesdk.chatroom.interact.a aVar = this.this$0.n;
            if (aVar != null && (aVar instanceof com.bytedance.android.live.broadcast.api.e.a)) {
                ((com.bytedance.android.live.broadcast.api.e.a) aVar).a(PrivacyCert.Builder.Companion.with("bpea-778").usage("").tag(" multi live guest reverse camera").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m extends h.f.b.m implements h.f.a.b<String, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(6132);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(String str) {
            h.f.b.l.d(str, "");
            if (this.this$0.q != null) {
                com.bytedance.android.live.liveinteract.multiguest.opt.a.a j2 = this.this$0.j();
                com.bytedance.android.live.liveinteract.api.b.n nVar = this.this$0.q;
                if (nVar == null) {
                    h.f.b.l.b();
                }
                j2.a(nVar);
            }
            this.this$0.p.f11129a.b();
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n extends h.f.b.m implements h.f.a.b<Boolean, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(6133);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                com.bytedance.android.livesdk.b.a.d.a().z = false;
                this.this$0.f11361i = b.SUCCEED;
                if (this.this$0.y != null) {
                    if (!MultiLiveServerAutoJoinChannel.INSTANCE.getValue()) {
                        this.this$0.p();
                    } else {
                        this.this$0.f11359g = true;
                    }
                }
            } else {
                this.this$0.p.f11129a.c();
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class z<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f11403a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f11404b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f11405c;

        static {
            Covode.recordClassIndex(6148);
        }

        z(c cVar, boolean z, int i2) {
            this.f11403a = cVar;
            this.f11404b = z;
            this.f11405c = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            h.f.b.l.d(th, "");
            this.f11403a.a(th);
            com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkIn_Guest_Permission_Failed", "throwable:".concat(String.valueOf(th)));
            this.f11403a.f11356d = false;
            if (this.f11404b) {
                this.f11403a.o();
            }
            g.b bVar = (g.b) this.f11403a.y;
            if (bVar != null) {
                bVar.a(new g.b.a(th, this.f11405c));
            }
        }
    }

    public final int a(long j2) {
        com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = this.f11354b;
        if (dVar == null) {
            h.f.b.l.a("mInfoCenter");
        }
        for (com.bytedance.android.livesdk.chatroom.model.b.e eVar : dVar.f11074b) {
            if (eVar.f15722c != null) {
                User user = eVar.f15722c;
                h.f.b.l.b(user, "");
                if (user.getId() == j2) {
                    return eVar.f15724e;
                }
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public static final class ae<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f11371a;

        static {
            Covode.recordClassIndex(6113);
        }

        ae(c cVar) {
            this.f11371a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            g.b bVar;
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkIn_JoinChannel_Success", "position:Guest");
            if (!(dVar == null || dVar.data == null || (bVar = (g.b) this.f11371a.y) == null)) {
                bVar.a((com.bytedance.android.livesdk.chatroom.model.c.b) dVar.data);
            }
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.core.d.a.a(jSONObject, "cost", System.currentTimeMillis() - com.bytedance.android.live.liveinteract.platform.common.g.i.f11974d);
            com.bytedance.android.live.liveinteract.platform.common.g.i iVar = com.bytedance.android.live.liveinteract.platform.common.g.i.f11979j;
            com.bytedance.android.live.liveinteract.platform.common.g.i.a((com.bytedance.android.live.liveinteract.platform.common.g.i) false, (boolean) "join_channel_succeed", (String) jSONObject, (JSONObject) 0);
            this.f11371a.f11358f = false;
            ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().d();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class af<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f11372a;

        static {
            Covode.recordClassIndex(6114);
        }

        af(c cVar) {
            this.f11372a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            h.f.b.l.d(th, "");
            com.bytedance.android.live.liveinteract.platform.common.g.p.a(com.bytedance.android.live.liveinteract.platform.common.g.p.f12000c, th);
            this.f11372a.a(th);
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.core.d.a.a(jSONObject, "error_code", 102L);
            com.bytedance.android.live.liveinteract.platform.common.g.i.a(jSONObject, th);
            com.bytedance.android.live.core.d.a.a(jSONObject, "cost", System.currentTimeMillis() - com.bytedance.android.live.liveinteract.platform.common.g.i.f11974d);
            com.bytedance.android.live.liveinteract.platform.common.g.i.a(false, "join_channel_failed", jSONObject, 1);
            com.bytedance.android.live.liveinteract.platform.common.g.v.e(com.bytedance.android.live.liveinteract.platform.common.g.e.a(jSONObject));
            com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkIn_JoinChannel_Failed", "position:Guest; throwable:".concat(String.valueOf(th)));
            this.f11372a.f11358f = false;
            if (!(th instanceof com.bytedance.android.live.a.a.b.a) || ((com.bytedance.android.live.a.a.a) th).getErrorCode() != 40001) {
                g.b bVar = (g.b) this.f11372a.y;
                if (bVar != null) {
                    bVar.b(th);
                    return;
                }
                return;
            }
            g.b bVar2 = (g.b) this.f11372a.y;
            if (bVar2 != null) {
                bVar2.c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends h.f.b.m implements h.f.a.b<h.z, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(6125);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(h.z zVar) {
            h.f.b.l.d(zVar, "");
            if (this.this$0.j().f11298h) {
                this.this$0.u.b(au.class, new com.bytedance.android.live.liveinteract.api.b.m(this.this$0.j().q, this.this$0.i().g()));
            }
            this.this$0.h().e(this.this$0.r());
            this.this$0.h().d();
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p extends h.f.b.m implements h.f.a.b<String, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(6135);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(String str) {
            h.f.b.l.d(str, "");
            this.this$0.f11361i = b.FAILED;
            if (this.this$0.h().f11889d) {
                this.this$0.a("reply", PrivacyCert.Builder.Companion.with("bpea-472").usage("").tag("stop link mic").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build(), false);
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q extends h.f.b.m implements h.f.a.b<String, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(6136);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(String str) {
            String str2 = str;
            h.f.b.l.d(str2, "");
            com.bytedance.android.livesdk.b.a.d.a().z = false;
            this.this$0.f11363k = true;
            if (!TextUtils.isEmpty(str2)) {
                this.this$0.o = str2;
                this.this$0.p.f11129a.e();
            } else {
                com.bytedance.android.live.liveinteract.multiguest.a.e.d dVar = this.this$0.p;
                com.bytedance.android.livesdk.ab.i.b();
                com.bytedance.android.livesdk.ab.i.a("PreInitHelper", "downgradeStrategy");
                dVar.f11129a = new com.bytedance.android.live.liveinteract.multiguest.a.e.c(dVar.f11130b);
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class t<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f11385a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f11386b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ HashMap f11387c;

        static {
            Covode.recordClassIndex(6139);
        }

        t(c cVar, String str, HashMap hashMap) {
            this.f11385a = cVar;
            this.f11386b = str;
            this.f11387c = hashMap;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            g.a aVar;
            com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkIn_leave_Success", "position:cancel");
            com.bytedance.android.live.liveinteract.platform.common.g.i.b(this.f11386b, this.f11387c);
            this.f11385a.f11357e = false;
            this.f11385a.f11365m.a((Integer) 0);
            Room room = this.f11385a.t;
            DataChannel dataChannel = this.f11385a.w;
            h.f.b.l.b(dataChannel, "");
            com.bytedance.android.live.liveinteract.multilive.a.a(room, dataChannel);
            com.bytedance.android.livesdk.b.a.d.a().z = true;
            if (this.f11385a.f11364l != null && (aVar = this.f11385a.f11364l) != null) {
                aVar.c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class u<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f11388a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f11389b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ HashMap f11390c;

        static {
            Covode.recordClassIndex(6140);
        }

        u(c cVar, String str, HashMap hashMap) {
            this.f11388a = cVar;
            this.f11389b = str;
            this.f11390c = hashMap;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            g.a aVar;
            Throwable th = (Throwable) obj;
            h.f.b.l.d(th, "");
            this.f11388a.a(th);
            com.bytedance.android.live.liveinteract.platform.common.g.i.a(this.f11389b, th, this.f11390c);
            com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkIn_leave_Failed", "position:cancel; throwable:".concat(String.valueOf(th)));
            this.f11388a.f11357e = false;
            this.f11388a.f11365m.a((Integer) 0);
            com.bytedance.android.livesdk.b.a.d.a().z = false;
            if (this.f11388a.f11364l != null && (aVar = this.f11388a.f11364l) != null) {
                aVar.c(th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class y<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f11400a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f11401b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f11402c;

        static {
            Covode.recordClassIndex(6147);
        }

        y(c cVar, boolean z, int i2) {
            this.f11400a = cVar;
            this.f11401b = z;
            this.f11402c = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.network.response.b<Void, com.bytedance.android.livesdk.chatroom.model.b.a> bVar = (com.bytedance.android.live.network.response.b) obj;
            h.f.b.l.d(bVar, "");
            com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkIn_Guest_Permission_Success", "response:" + e.a.f9628b.b(bVar));
            this.f11400a.f11356d = false;
            if (bVar.extra == null) {
                if (this.f11401b) {
                    this.f11400a.o();
                }
                g.b bVar2 = (g.b) this.f11400a.y;
                if (bVar2 != null) {
                    bVar2.a(new g.b.a(new Exception(), this.f11402c));
                    return;
                }
                return;
            }
            int i2 = this.f11402c;
            if (i2 == 2) {
                this.f11400a.s = bVar;
                this.f11400a.r = true;
                DataChannel dataChannel = this.f11400a.w;
                if (dataChannel != null) {
                    dataChannel.c(com.bytedance.android.live.liveinteract.multilive.a.a.c.class);
                }
            } else if (i2 == 0) {
                this.f11400a.a(bVar);
                DataChannel dataChannel2 = this.f11400a.w;
                h.f.b.l.b(dataChannel2, "");
                com.bytedance.android.live.liveinteract.multilive.a.d(dataChannel2);
            }
        }
    }

    private final void e(boolean z2) {
        com.bytedance.android.livesdk.chatroom.interact.a aVar = this.n;
        if (aVar != null && (aVar instanceof com.bytedance.android.live.broadcast.api.e.a)) {
            if (z2) {
                ((com.bytedance.android.live.broadcast.api.e.a) aVar).a_(true, PrivacyCert.Builder.Companion.with("bpea-795").usage("").tag("multi live guest mute local video isVideoEnable: true").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
                return;
            }
            ((com.bytedance.android.live.broadcast.api.e.a) aVar).a_(false, PrivacyCert.Builder.Companion.with("bpea-794").usage("").tag("multi live guest mute local video isVideoEnable: false").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
        }
    }

    public final void a(int i2) {
        Context context;
        if (this.y != null) {
            g.b bVar = (g.b) this.y;
            if (bVar != null) {
                context = bVar.getContext();
            } else {
                context = null;
            }
            Activity a2 = com.bytedance.android.live.core.f.a.a(context);
            if (a2 != null) {
                h.f.b.l.b(a2, "");
                f.b a3 = com.bytedance.android.livesdk.ah.f.a(a2);
                a3.f13731d = new v(a2);
                a3.a(new w(this, context, i2), "android.permission.RECORD_AUDIO", "android.permission.CAMERA");
            }
        }
    }

    public final void b(PrivacyCert privacyCert) {
        com.bytedance.android.live.liveinteract.platform.c.c cVar = this.f11353a;
        if (cVar == null) {
            h.f.b.l.a("mRtcController");
        }
        if (cVar.f11889d && this.f11362j) {
            com.bytedance.android.live.liveinteract.platform.c.c cVar2 = this.f11353a;
            if (cVar2 == null) {
                h.f.b.l.a("mRtcController");
            }
            if (!cVar2.b()) {
                com.bytedance.android.live.liveinteract.platform.c.c cVar3 = this.f11353a;
                if (cVar3 == null) {
                    h.f.b.l.a("mRtcController");
                }
                cVar3.a(privacyCert);
                if (this.B) {
                    l();
                } else {
                    k();
                }
                com.bytedance.android.live.liveinteract.platform.common.g.i.d(false);
                com.bytedance.android.live.liveinteract.platform.c.c cVar4 = this.f11353a;
                if (cVar4 == null) {
                    h.f.b.l.a("mRtcController");
                }
                cVar4.d();
                return;
            }
            com.bytedance.android.livesdk.ab.b a2 = b.a.a("rtc_start_client_is_null");
            com.bytedance.android.live.liveinteract.platform.c.c cVar5 = this.f11353a;
            if (cVar5 == null) {
                h.f.b.l.a("mRtcController");
            }
            a2.a("engine_status", Boolean.valueOf(cVar5.f11889d)).a("count_down_status", Boolean.valueOf(this.f11362j)).a("client_controller_status", this.D).b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$c  reason: collision with other inner class name */
    public static final class C0222c extends h.f.b.m implements h.f.a.b<String, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(6122);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0222c(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(String str) {
            a.EnumC0216a aVar;
            String str2 = str;
            h.f.b.l.d(str2, "");
            com.bytedance.android.livesdk.b.a.d a2 = com.bytedance.android.livesdk.b.a.d.a();
            h.f.b.l.b(a2, "");
            if (TextUtils.equals(str2, a2.f14185f) && this.this$0.y != null) {
                g.b bVar = (g.b) this.this$0.y;
                a.EnumC0216a aVar2 = null;
                if (bVar != null) {
                    aVar = bVar.h();
                } else {
                    aVar = null;
                }
                if (aVar == a.EnumC0216a.SEND_REQUEST) {
                    this.this$0.a(PrivacyCert.Builder.Companion.with("bpea-1133").usage("").policies(PrivacyPolicyStore.getAudioPrivacyPolicy(), PrivacyPolicyStore.getVideoPrivacyPolicy()).tag("rtc_stream_push").build());
                } else {
                    g.b bVar2 = (g.b) this.this$0.y;
                    if (bVar2 != null) {
                        aVar2 = bVar2.h();
                    }
                    if (aVar2 == a.EnumC0216a.GO_LIVE) {
                        this.this$0.a(PrivacyCert.Builder.Companion.with("bpea-1137").usage("").policies(PrivacyPolicyStore.getAudioPrivacyPolicy(), PrivacyPolicyStore.getVideoPrivacyPolicy()).tag("rtc_stream_push").build());
                    }
                }
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l extends h.f.b.m implements h.f.a.b<String, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(6131);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(String str) {
            a.EnumC0216a aVar;
            String str2 = str;
            h.f.b.l.d(str2, "");
            com.bytedance.android.livesdk.b.a.d a2 = com.bytedance.android.livesdk.b.a.d.a();
            h.f.b.l.b(a2, "");
            if (TextUtils.equals(str2, a2.f14185f) && this.this$0.y != null) {
                this.this$0.f11362j = true;
                this.this$0.j().f11303m = true;
                g.b bVar = (g.b) this.this$0.y;
                a.EnumC0216a aVar2 = null;
                if (bVar != null) {
                    aVar = bVar.h();
                } else {
                    aVar = null;
                }
                if (aVar != a.EnumC0216a.SEND_REQUEST) {
                    g.b bVar2 = (g.b) this.this$0.y;
                    if (bVar2 != null) {
                        aVar2 = bVar2.h();
                    }
                    if (aVar2 == a.EnumC0216a.GO_LIVE && this.this$0.f11361i == b.SUCCEED && this.this$0.h().f11889d) {
                        this.this$0.b(PrivacyCert.Builder.Companion.with("bpea-510").usage("").tag("link mic start to push stream").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                    }
                } else if (this.this$0.h().f11889d) {
                    this.this$0.b(PrivacyCert.Builder.Companion.with("bpea-509").usage("").tag("link mic start to push stream").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                }
            }
            return h.z.f158842a;
        }
    }

    public final void d(boolean z2) {
        if (this.y != null) {
            g.a aVar = this.f11364l;
            if (aVar != null) {
                aVar.a();
            }
            com.bytedance.android.live.liveinteract.api.a.c a2 = com.bytedance.android.live.liveinteract.api.a.c.a();
            h.f.b.l.b(a2, "");
            a2.b();
            x();
            Room room = this.t;
            DataChannel dataChannel = this.w;
            h.f.b.l.b(dataChannel, "");
            com.bytedance.android.live.liveinteract.multilive.a.a(room, dataChannel);
            if (z2) {
                com.bytedance.android.livesdk.b.a.d.a().f14183d = true;
            }
        }
    }

    public final void f(String str) {
        h.f.b.l.d(str, "");
        if (!this.f11357e && this.y != null) {
            this.f11357e = true;
            com.bytedance.android.livesdk.b.a.d.a().z = true;
            com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkIn_leave", "position:cancel; roomId:" + this.t.getId());
            HashMap<String, Object> b2 = com.bytedance.android.live.liveinteract.platform.common.g.i.b(false);
            com.bytedance.android.live.liveinteract.platform.common.g.i.a(str, b2);
            long id = this.t.getId();
            com.bytedance.android.livesdk.b.a.d a2 = com.bytedance.android.livesdk.b.a.d.a();
            h.f.b.l.b(a2, "");
            ((com.bytedance.android.livesdk.util.rxutils.autodispose.ac) ((LinkApi) com.bytedance.android.live.network.e.a().a(LinkApi.class)).leave(id, a2.v).a(u())).a(new t(this, str, b2), new u(this, str, b2));
            this.p.a();
        }
    }

    private final void a(com.bytedance.android.livesdk.model.message.aj ajVar) {
        g.b bVar;
        int i2;
        Context context;
        g.b bVar2;
        if (ajVar.f19142h != null) {
            g.b bVar3 = (g.b) this.y;
            if (!(bVar3 == null || !bVar3.e() || (bVar2 = (g.b) this.y) == null)) {
                bVar2.f();
            }
            com.bytedance.android.live.liveinteract.multiguest.g.a.i iVar = this.C;
            if (iVar != null) {
                if (!iVar.n()) {
                    com.bytedance.android.live.liveinteract.multiguest.g.a.i iVar2 = this.C;
                    if (iVar2 != null) {
                        iVar2.dismiss();
                    }
                    this.C = null;
                } else {
                    return;
                }
            }
            com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = this.f11354b;
            if (dVar == null) {
                h.f.b.l.a("mInfoCenter");
            }
            if (dVar.g() < com.bytedance.android.livesdk.b.a.d.a().x && (bVar = (g.b) this.y) != null && bVar.getContext() != null) {
                g.b bVar4 = (g.b) this.y;
                if (bVar4 != null && (context = bVar4.getContext()) != null && !LiveAppBundleUtils.isPluginAvailable(com.bytedance.android.livesdk.utils.b.LINK_MIC)) {
                    LiveAppBundleUtils.ensurePluginAvailable(context, com.bytedance.android.livesdk.utils.b.LINK_MIC);
                } else if (this.u.b(com.bytedance.android.livesdk.j.ao.class) != null) {
                    h.f.b.l.d(ajVar, "");
                    JSONObject jSONObject = new JSONObject();
                    com.bytedance.android.live.liveinteract.platform.common.g.i.a(jSONObject, ajVar);
                    long j2 = ajVar.f19142h.f19523a;
                    com.bytedance.android.live.liveinteract.platform.common.g.i.a(jSONObject, Long.valueOf(j2), g.a.f14199a.a(j2));
                    com.bytedance.android.live.liveinteract.platform.common.g.i iVar3 = com.bytedance.android.live.liveinteract.platform.common.g.i.f11979j;
                    com.bytedance.android.live.liveinteract.platform.common.g.i.a((com.bytedance.android.live.liveinteract.platform.common.g.i) false, (boolean) "invite_message", (String) jSONObject, (JSONObject) 0);
                    com.bytedance.android.livesdk.b.a.d a2 = com.bytedance.android.livesdk.b.a.d.a();
                    h.f.b.l.b(a2, "");
                    a2.f14185f = ajVar.f19142h.f19529g;
                    g.a.f14199a.a(y(), ajVar.f19142h.f19529g);
                    a2.b(ajVar.v);
                    a2.a(ajVar.f19142h.f19525c);
                    com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11355c;
                    if (aVar == null) {
                        h.f.b.l.a("mDataHolder");
                    }
                    aVar.c().clear();
                    com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = this.f11355c;
                    if (aVar2 == null) {
                        h.f.b.l.a("mDataHolder");
                    }
                    aVar2.c().putAll(ajVar.f19142h.f19532j);
                    if (ajVar.f19142h.f19533k == 1) {
                        com.bytedance.android.livesdk.model.message.d.c.e eVar = ajVar.f19142h.f19534l;
                        int i3 = -1;
                        if (eVar != null) {
                            i2 = eVar.f19543a;
                        } else {
                            i2 = -1;
                        }
                        com.bytedance.android.livesdk.model.message.d.c.e eVar2 = ajVar.f19142h.f19534l;
                        if (eVar2 != null) {
                            i3 = eVar2.f19544b;
                        }
                        this.q = com.bytedance.android.live.liveinteract.multilive.anchor.e.c.a(i2, i3);
                    }
                    this.o = ajVar.f19142h.f19525c;
                    this.C = new com.bytedance.android.live.liveinteract.multiguest.g.a.i((byte) 0);
                    androidx.fragment.app.i iVar4 = (androidx.fragment.app.i) this.u.b(com.bytedance.android.livesdk.j.ao.class);
                    if (iVar4 != null) {
                        com.bytedance.android.live.liveinteract.multiguest.g.a.i iVar5 = this.C;
                        if (iVar5 != null) {
                            String cls = getClass().toString();
                            h.f.b.l.b(cls, "");
                            iVar5.show(iVar4, cls);
                        }
                        a(2, false);
                    }
                    this.p.f11129a.g();
                    com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar2 = this.f11354b;
                    if (dVar2 == null) {
                        h.f.b.l.a("mInfoCenter");
                    }
                    int g2 = dVar2.g();
                    com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar3 = this.f11355c;
                    if (aVar3 == null) {
                        h.f.b.l.a("mDataHolder");
                    }
                    com.bytedance.android.live.liveinteract.api.b.n nVar = aVar3.q;
                    b.a.a("livesdk_guest_receive_anchor_apply").a().a("guest_connection_type", "anchor_invite_guest").a("live_type", "video_live").a("connected_guest_cnt", g2).a("layout_setting", com.bytedance.android.live.liveinteract.multilive.b.a.a(nVar).getFirst()).a("window_setting", com.bytedance.android.live.liveinteract.multilive.b.a.a(nVar).getSecond()).b();
                    com.bytedance.android.livesdk.ab.i.b();
                    com.bytedance.android.livesdk.ab.i.b("list_opti_enable", "Guest doHandleInviteMessage and list opti enable:" + LiveLinkListOptiEnableSetting.INSTANCE.getValue());
                }
            }
        }
    }

    public final void c(boolean z2) {
        com.bytedance.android.live.liveinteract.platform.c.c cVar = this.f11353a;
        if (cVar == null) {
            h.f.b.l.a("mRtcController");
        }
        w();
        String z3 = z();
        if (z3 == null) {
            z3 = "";
        }
        h.f.b.l.d(z3, "");
        com.bytedance.android.live.liveinteract.multilive.c.m mVar = new com.bytedance.android.live.liveinteract.multilive.c.m();
        mVar.a();
        mVar.a("onGuestVideoMute");
        com.bytedance.android.live.liveinteract.multilive.c.n nVar = new com.bytedance.android.live.liveinteract.multilive.c.n();
        nVar.f11768b.add(new com.bytedance.android.live.liveinteract.multilive.c.o(z3, 0, !z2, 2));
        mVar.f11764b = nVar;
        cVar.a(mVar);
        e(z2);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        com.bytedance.android.livesdk.model.message.d.h.b bVar;
        boolean z2;
        int i2;
        h.f.b.l.d(iMessage, "");
        if (this.y != null && (iMessage instanceof com.bytedance.android.livesdk.model.message.aj)) {
            com.bytedance.android.livesdk.model.message.aj ajVar = (com.bytedance.android.livesdk.model.message.aj) iMessage;
            int i3 = ajVar.f19139a;
            if (i3 == 3) {
                T t2 = this.f11365m.n;
                if (t2 != null && t2.intValue() == 0) {
                    a(ajVar);
                }
            } else if (i3 == 5) {
                T t3 = this.f11365m.n;
                if (t3 != null && t3.intValue() == 1) {
                    this.f11365m.a((Integer) 0);
                    if (this.f11364l != null) {
                        com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = this.f11354b;
                        if (dVar == null) {
                            h.f.b.l.a("mInfoCenter");
                        }
                        com.bytedance.android.live.liveinteract.multiguest.a.c.d.a(dVar, null, 2);
                    }
                    ao.a(com.bytedance.android.live.core.f.y.e(), com.bytedance.android.live.core.f.y.a((int) R.string.elc), 0);
                    long y2 = y();
                    com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar2 = this.f11354b;
                    if (dVar2 == null) {
                        h.f.b.l.a("mInfoCenter");
                    }
                    int g2 = dVar2.g();
                    HashMap hashMap = new HashMap();
                    hashMap.put("user_id", String.valueOf(y2));
                    Room room = (Room) DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.j.ac.class);
                    if (room != null) {
                        hashMap.put("enter_from_merge", com.bytedance.android.livesdk.ab.e.a());
                        hashMap.put("enter_method", com.bytedance.android.livesdk.ab.e.d());
                        hashMap.put("action_type", com.bytedance.android.livesdk.ab.e.e());
                        hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                        String idStr = room.getIdStr();
                        if (idStr == null) {
                            idStr = "";
                        }
                        hashMap.put("room_id", idStr);
                        hashMap.put("connected_guest_cnt", String.valueOf(g2));
                        User owner = room.getOwner();
                        h.f.b.l.b(owner, "");
                        FollowInfo followInfo = owner.getFollowInfo();
                        h.f.b.l.b(followInfo, "");
                        hashMap.put("anchor_relationship", String.valueOf(followInfo.getFollowStatus()));
                        com.bytedance.android.live.liveinteract.platform.common.g.b.a("livesdk_guest_refused_connection_show", hashMap);
                    }
                }
            } else if (i3 == 18) {
                com.bytedance.android.livesdk.b.a.g gVar = g.a.f14199a;
                com.bytedance.android.livesdk.model.message.d.h.a aVar = ajVar.q;
                if (aVar != null && (bVar = aVar.f19561a) != null) {
                    if (bVar.f19563a == 0) {
                        gVar.b(bVar.f19565c);
                        gVar.f14198c.put(Long.valueOf(bVar.f19564b), Long.valueOf(bVar.f19565c));
                    } else if (bVar.f19563a == 1 && !gVar.f14198c.isEmpty()) {
                        gVar.f14198c.remove(Long.valueOf(bVar.f19564b));
                    }
                }
            } else if (i3 == 8) {
                boolean z3 = this.B;
                h.f.b.l.d(ajVar, "");
                JSONObject jSONObject = new JSONObject();
                com.bytedance.android.live.core.d.a.a(jSONObject, "is_background", String.valueOf(z3 ? 1 : 0));
                com.bytedance.android.live.liveinteract.platform.common.g.i.a(jSONObject, ajVar);
                com.bytedance.android.live.core.d.a.a(jSONObject, "message_expired_time", ajVar.u);
                com.bytedance.android.live.core.d.a.a(jSONObject, "message_available_time", ajVar.f());
                com.bytedance.android.live.core.d.a.a(jSONObject, "delay_time", ajVar.d());
                com.bytedance.android.live.core.d.a.a(jSONObject, "guest_linkmic_id", ajVar.f19143i.f19577g.f19597h);
                com.bytedance.android.live.liveinteract.platform.common.g.i.a(jSONObject, Long.valueOf(ajVar.f19143i.f19575e), ajVar.f19143i.f19577g.f19597h);
                com.bytedance.android.live.liveinteract.platform.common.g.i iVar = com.bytedance.android.live.liveinteract.platform.common.g.i.f11979j;
                com.bytedance.android.live.liveinteract.platform.common.g.i.a((com.bytedance.android.live.liveinteract.platform.common.g.i) false, (boolean) "permit_message", (String) jSONObject, (JSONObject) 0);
                this.f11363k = false;
                if (this.B) {
                    f("leave_source_cancel_with_background");
                } else if (com.bytedance.android.livesdk.b.a.d.a().z) {
                    com.bytedance.android.livesdk.ab.i.b();
                    com.bytedance.android.livesdk.ab.i.b("multi-guest", "receive permit message, but guest is leaving or already left");
                } else {
                    if (TTliveLinkmicMsgOptimizationSwitchSetting.INSTANCE.getValue() == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2 || !ajVar.e()) {
                        long d2 = ajVar.d();
                        long value = (long) (MtCoHostReceiveInviteMessageTimeOutSetting.INSTANCE.getValue() * 1000);
                        if (d2 >= value) {
                            f("leave_source_cancel_with_msg_expire");
                            com.bytedance.android.live.liveinteract.platform.common.g.i.a(ajVar, 0, value);
                            return;
                        }
                    } else {
                        long f2 = ajVar.f();
                        long value2 = (long) (TTliveLinkmicMsgOptimizationAtLeastAvailableTimeSetting.INSTANCE.getValue() * 1000);
                        if (f2 < value2) {
                            com.bytedance.android.live.liveinteract.platform.common.g.i.a(ajVar, value2, 0);
                            f("leave_source_cancel_with_msg_expire");
                            return;
                        }
                    }
                    com.bytedance.android.livesdk.b.a.d a2 = com.bytedance.android.livesdk.b.a.d.a();
                    com.bytedance.android.livesdk.model.message.d.k.a aVar2 = ajVar.f19143i;
                    h.f.b.l.b(a2, "");
                    a2.b(ajVar.v);
                    a2.a(aVar2.f19574d.f19594e);
                    a2.f14184e = aVar2.f19577g.f19597h;
                    this.o = aVar2.f19574d.f19594e;
                    g.a.f14199a.a(this.t.getOwnerUserId(), aVar2.f19577g.f19597h);
                    HashMap<Long, Long> hashMap2 = aVar2.f19583m;
                    if (hashMap2 != null && !hashMap2.isEmpty()) {
                        g.a.f14199a.f14198c = aVar2.f19583m;
                    }
                    a2.a(this.t.getOwnerUserId());
                    if (aVar2.n == 1) {
                        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar3 = this.f11355c;
                        if (aVar3 == null) {
                            h.f.b.l.a("mDataHolder");
                        }
                        com.bytedance.android.livesdk.model.message.d.c.e eVar = aVar2.o;
                        int i4 = -1;
                        if (eVar != null) {
                            i2 = eVar.f19543a;
                        } else {
                            i2 = -1;
                        }
                        com.bytedance.android.livesdk.model.message.d.c.e eVar2 = aVar2.o;
                        if (eVar2 != null) {
                            i4 = eVar2.f19544b;
                        }
                        aVar3.a(com.bytedance.android.live.liveinteract.multilive.anchor.e.c.a(i2, i4));
                    }
                    this.p.f11129a.a();
                    if (this.y != null) {
                        com.bytedance.android.livesdk.b.a.d a3 = com.bytedance.android.livesdk.b.a.d.a();
                        h.f.b.l.b(a3, "");
                        a3.a(true);
                        p();
                    }
                    com.bytedance.android.livesdk.ab.i.b();
                    com.bytedance.android.livesdk.ab.i.b("list_opti_enable", "Guest handlePermitMessage and list opti enable:" + LiveLinkListOptiEnableSetting.INSTANCE.getValue());
                }
            } else if (i3 != 9) {
                if (i3 == 13) {
                    com.bytedance.android.live.liveinteract.api.a.c a4 = com.bytedance.android.live.liveinteract.api.a.c.a();
                    h.f.b.l.b(a4, "");
                    a4.b();
                    g.b bVar2 = (g.b) this.y;
                    if (bVar2 != null) {
                        bVar2.b();
                    }
                    com.bytedance.android.livesdk.b.a.d a5 = com.bytedance.android.livesdk.b.a.d.a();
                    h.f.b.l.b(a5, "");
                    a5.b(ajVar.v);
                    a("leave_with_kicked_out", PrivacyCert.Builder.Companion.with("bpea-473").usage("").tag("stop link mic").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build(), false);
                    com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar4 = this.f11355c;
                    if (aVar4 == null) {
                        h.f.b.l.a("mDataHolder");
                    }
                    com.bytedance.android.live.liveinteract.platform.common.g.g.a("anchor_kick_out_guest", aVar4.q);
                } else if (i3 == 14 && ajVar.f19144j.f19504a != y() && this.f11364l != null) {
                    com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar3 = this.f11354b;
                    if (dVar3 == null) {
                        h.f.b.l.a("mInfoCenter");
                    }
                    com.bytedance.android.live.liveinteract.multiguest.a.c.d.a(dVar3, null, 2);
                }
            } else if (ajVar.f19144j != null && ajVar.f19144j.f19506c == a.EnumC0402a.INVITE_CANCEL.code) {
                o();
                g.b bVar3 = (g.b) this.y;
                if (bVar3 != null) {
                    bVar3.i();
                }
                h.f.b.l.d(ajVar, "");
                JSONObject jSONObject2 = new JSONObject();
                com.bytedance.android.live.liveinteract.platform.common.g.i.a(jSONObject2, ajVar);
                com.bytedance.android.live.liveinteract.platform.common.g.i iVar2 = com.bytedance.android.live.liveinteract.platform.common.g.i.f11979j;
                com.bytedance.android.live.liveinteract.platform.common.g.i.a((com.bytedance.android.live.liveinteract.platform.common.g.i) false, (boolean) "cancel_message", (String) jSONObject2, (JSONObject) 0);
            }
        }
    }

    public final void b(boolean z2) {
        LiveRTCEngine rtcEngine;
        LiveRTCEngine rtcEngine2;
        com.bytedance.android.live.liveinteract.platform.c.c cVar = this.f11353a;
        if (cVar == null) {
            h.f.b.l.a("mRtcController");
        }
        Client client = cVar.f11892g;
        if (client != null) {
            client.switchAudio(z2);
        }
        com.bytedance.android.live.liveinteract.platform.c.c cVar2 = this.f11353a;
        if (cVar2 == null) {
            h.f.b.l.a("mRtcController");
        }
        if (z2) {
            Client client2 = cVar2.f11892g;
            if (!(client2 == null || (rtcEngine2 = client2.getRtcEngine()) == null)) {
                rtcEngine2.startAudioCapture();
            }
        } else {
            Client client3 = cVar2.f11892g;
            if (!(client3 == null || (rtcEngine = client3.getRtcEngine()) == null)) {
                rtcEngine.stopAudioCapture();
            }
        }
        com.bytedance.android.livesdk.chatroom.interact.a aVar = this.n;
        if (aVar != null && (aVar instanceof com.bytedance.android.live.broadcast.api.e.a)) {
            if (!z2) {
                aVar.a(true, PrivacyCert.Builder.Companion.with("bpea-798").usage("").tag("multi live mute audio: true").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            } else {
                aVar.a(false, PrivacyCert.Builder.Companion.with("bpea-799").usage("").tag("multi live mute audio: false").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class aa<T1, T2> implements f.a.d.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f11366a;

        static {
            Covode.recordClassIndex(6108);
        }

        aa(c cVar) {
            this.f11366a = cVar;
        }

        @Override // f.a.d.b
        public final /* synthetic */ void a(Object obj, Object obj2) {
            com.bytedance.android.live.liveinteract.multilive.c.g gVar;
            ArrayList<com.bytedance.android.livesdk.chatroom.model.b.c> arrayList;
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            if (dVar != null && (gVar = (com.bytedance.android.live.liveinteract.multilive.c.g) dVar.data) != null && (arrayList = gVar.f11760a) != null) {
                this.f11366a.j().n = arrayList;
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b, com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void b(int i2, String str) {
        h.f.b.l.d(str, "");
        com.bytedance.android.live.liveinteract.platform.common.g.a.b("OnEndFailed", "position:LinkIn_Guest; code:" + i2 + "; desc:" + str);
        this.A = false;
        this.z = false;
    }

    public final void c(String str, boolean z2) {
        h.f.b.l.d(str, "");
        if (this.y != null) {
            a(str, PrivacyCert.Builder.Companion.with("bpea-476").usage("").tag("stop link mic").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build(), z2);
        }
    }

    public c(Room room, DataChannel dataChannel) {
        h.f.b.l.d(room, "");
        h.f.b.l.d(dataChannel, "");
        this.t = room;
        this.u = dataChannel;
        com.bytedance.android.live.liveinteract.api.a.c a2 = com.bytedance.android.live.liveinteract.api.a.c.a();
        h.f.b.l.b(a2, "");
        this.f11365m = a2;
        this.p = new com.bytedance.android.live.liveinteract.multiguest.a.e.d(this);
        this.E = h.i.a((h.f.a.a) new ai(this));
        this.F = h.i.a((h.f.a.a) aj.f11381a);
        this.G = new Handler(Looper.getMainLooper());
        this.H = new ak(this);
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(new com.bytedance.android.live.liveinteract.multiguest.a.c.d(dataChannel), null);
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(this);
    }

    private final void d(String str, boolean z2) {
        if (!this.f11360h) {
            com.bytedance.android.livesdk.b.a.d.a().z = true;
            this.f11360h = true;
            com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkIn_leave", "position:leaveChannel; roomId:" + this.t.getId());
            HashMap<String, Object> b2 = com.bytedance.android.live.liveinteract.platform.common.g.i.b(false);
            com.bytedance.android.live.liveinteract.platform.common.g.i.a(str, b2);
            long id = this.t.getId();
            com.bytedance.android.livesdk.b.a.d a2 = com.bytedance.android.livesdk.b.a.d.a();
            h.f.b.l.b(a2, "");
            ((LinkApi) com.bytedance.android.live.network.e.a().a(LinkApi.class)).leave(id, a2.v).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new ag(this, str, b2, z2), new ah(this, str, b2, z2));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b, com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void c(int i2, String str) {
        h.f.b.l.d(str, "");
        ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.grz);
        this.z = false;
        com.bytedance.android.live.liveinteract.platform.common.g.a.b("OnError", "position:LinkIn_Guest; code:" + i2 + "; message:" + str);
        com.bytedance.android.live.liveinteract.platform.common.g.i.a(false, i2, str);
        com.bytedance.android.live.liveinteract.platform.common.g.p.a(com.bytedance.android.live.liveinteract.platform.common.g.p.f12000c, (long) i2, str);
        com.bytedance.android.live.core.c.a.a(6, com.bytedance.android.live.liveinteract.api.o.f10017a, "onError: ".concat(String.valueOf(str)));
        a("rtc_error", PrivacyCert.Builder.Companion.with("bpea-474").usage("").tag("stop link mic").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build(), false);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b, com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void a(int i2, String str) {
        h.f.b.l.d(str, "");
        if (this.y != null) {
            com.bytedance.android.livesdk.b.a.d.a().y = false;
            this.z = false;
            ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.gry);
            com.bytedance.android.live.liveinteract.platform.common.g.a.b("OnStartFailed", "position:LinkIn_Guest; code:" + i2 + "; desc:" + str);
            com.bytedance.android.live.liveinteract.platform.common.g.i.a(false, i2, str);
            com.bytedance.android.live.liveinteract.platform.common.g.p.a(com.bytedance.android.live.liveinteract.platform.common.g.p.f12000c, (long) i2, str);
            g.b bVar = (g.b) this.y;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b, com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void b(String str, SurfaceView surfaceView) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(surfaceView, "");
        if (this.y != null) {
            com.bytedance.android.live.liveinteract.platform.common.g.a.b("OnFirstRemoteVideoFrame", "position:LinkIn_Guest; interactId:".concat(String.valueOf(str)));
            com.bytedance.android.live.liveinteract.platform.common.g.i.b(str, false);
            g.b bVar = (g.b) this.y;
            if (bVar != null) {
                bVar.b(str, surfaceView);
            }
            this.u.c(com.bytedance.android.live.liveinteract.api.l.class, new com.bytedance.android.livesdk.chatroom.c.q(3));
        }
    }

    public final void a(int i2, boolean z2) {
        com.bytedance.android.live.network.response.b<Void, com.bytedance.android.livesdk.chatroom.model.b.a> bVar;
        if (!this.f11356d) {
            if (i2 != 1) {
                this.f11356d = true;
                com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkIn_Guest_Permission", "roomId:" + this.t.getId() + "; userId:" + this.t.getOwnerUserId());
                ((com.bytedance.android.livesdk.util.rxutils.autodispose.ac) ((LinkApi) com.bytedance.android.live.network.e.a().a(LinkApi.class)).checkPermissionV1(this.t.getId(), this.t.getOwnerUserId(), 1).a(u())).a(new y(this, z2, i2), new z(this, z2, i2));
            } else if (this.r && (bVar = this.s) != null) {
                a(bVar);
                this.r = false;
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b
    public final void b(String str, boolean z2) {
        h.f.b.l.d(str, "");
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11355c;
        if (aVar == null) {
            h.f.b.l.a("mDataHolder");
        }
        aVar.b().put(str, Boolean.valueOf(z2));
        this.u.c(com.bytedance.android.live.liveinteract.multilive.c.k.class, new com.bytedance.android.live.liveinteract.multilive.c.d(str, z2));
    }

    @Override // com.bytedance.android.live.liveinteract.platform.c.b, com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void a(long j2, int i2) {
        if (i2 == 200) {
            com.bytedance.android.live.liveinteract.platform.common.g.i.f(false);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("error_code", String.valueOf(i2));
        hashMap.put("msg_id", String.valueOf(j2));
        com.bytedance.android.live.liveinteract.platform.common.g.i.a(false, (HashMap<String, Object>) hashMap);
    }
}
