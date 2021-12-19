package com.bytedance.android.live.liveinteract.linkroom.widget;

import android.content.DialogInterface;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.liveinteract.api.BaseLinkControlWidget;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.af;
import com.bytedance.android.live.liveinteract.api.ai;
import com.bytedance.android.live.liveinteract.api.ak;
import com.bytedance.android.live.liveinteract.api.am;
import com.bytedance.android.live.liveinteract.api.ap;
import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.live.liveinteract.api.k;
import com.bytedance.android.live.liveinteract.api.r;
import com.bytedance.android.live.liveinteract.api.s;
import com.bytedance.android.live.liveinteract.api.t;
import com.bytedance.android.live.liveinteract.cohost.a.a.a;
import com.bytedance.android.live.liveinteract.cohost.a.a.d;
import com.bytedance.android.live.liveinteract.cohost.a.c.a;
import com.bytedance.android.live.liveinteract.cohost.a.d.w;
import com.bytedance.android.live.liveinteract.cohost.widget.LinkCrossRoomWidget;
import com.bytedance.android.live.liveinteract.linkroom.a.a.a;
import com.bytedance.android.live.liveinteract.linkroom.a.c.b;
import com.bytedance.android.live.liveinteract.linkroom.c.a;
import com.bytedance.android.live.liveinteract.linkroom.widget.ad;
import com.bytedance.android.live.liveinteract.match.b.b.c;
import com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsGuestWidget;
import com.bytedance.android.live.liveinteract.platform.a.a.a;
import com.bytedance.android.live.liveinteract.platform.a.b.g;
import com.bytedance.android.live.liveinteract.platform.common.g.h;
import com.bytedance.android.live.liveinteract.platform.common.g.o;
import com.bytedance.android.live.n.v;
import com.bytedance.android.livesdk.b.a.d;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.c.p;
import com.bytedance.android.livesdk.chatroom.viewmodule.br;
import com.bytedance.android.livesdk.j.ao;
import com.bytedance.android.livesdk.j.bf;
import com.bytedance.android.livesdk.j.bx;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.j.ck;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkEntranceExperiment;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAnchorAutoOpenGuestLinkmicSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCoHostInviteePanelDismissSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveMtInteractInviterCancelEnableSetting;
import com.bytedance.android.livesdk.model.message.aj;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.util.rxutils.autodispose.ac;
import com.bytedance.android.livesdk.util.rxutils.autodispose.e;
import com.bytedance.android.livesdk.util.rxutils.f;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import f.a.ab;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.Map;

public class LinkControlWidget extends BaseLinkControlWidget implements b.a, a.b, com.bytedance.android.livesdk.callback.a, au {

    /* renamed from: a  reason: collision with root package name */
    MultiGuestAsAnchorWidget f10604a;

    /* renamed from: b  reason: collision with root package name */
    LinkCrossRoomWidget f10605b;

    /* renamed from: c  reason: collision with root package name */
    LiveWidget f10606c;

    /* renamed from: d  reason: collision with root package name */
    b f10607d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10608e;

    /* renamed from: f  reason: collision with root package name */
    BaseLinkControlWidget.a f10609f;

    /* renamed from: g  reason: collision with root package name */
    int f10610g;

    /* renamed from: h  reason: collision with root package name */
    d.AbstractC0159d f10611h;

    /* renamed from: i  reason: collision with root package name */
    public a f10612i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f10613j;

    /* renamed from: k  reason: collision with root package name */
    boolean f10614k;

    /* renamed from: l  reason: collision with root package name */
    k f10615l;

    /* renamed from: m  reason: collision with root package name */
    c f10616m;
    c n;
    private MultiGuestAsGuestWidget o;
    private Room p;
    private i q;
    private boolean r;
    private long s;
    private String t;
    private f u;
    @com.bytedance.android.live.liveinteract.api.c.d(a = "LINKER_MANAGER")
    private com.bytedance.android.live.liveinteract.platform.a.c v;
    @com.bytedance.android.live.liveinteract.api.c.d(a = "LINK_MESSAGE_CENTER")
    private g w;

    static {
        Covode.recordClassIndex(5650);
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.a.c.b.a
    public final int a(int i2) {
        return i2 != 2 ? R.string.dy0 : R.string.e6_;
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.bq
    public final void a(Throwable th) {
        br.a(this, th);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bey;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.live.liveinteract.api.BaseLinkControlWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.a.c.b.a
    public final void a(com.bytedance.android.livesdk.model.message.d.c.d dVar) {
        Room room;
        if (isViewValid() && b.a.a().f9940e != 0) {
            o();
            if (b.a.a().p == com.bytedance.android.live.liveinteract.api.m.RANDOM_LINK_MIC_INVITE && com.bytedance.android.live.liveinteract.cohost.a.c.a.b()) {
                if (this.dataChannel != null) {
                    this.dataChannel.c(s.class, "");
                }
                b.a.a().n = true;
                if (b.a.a().w && !TextUtils.isEmpty(b.a.a().v)) {
                    a(PrivacyCert.Builder.with("bpea-505").usage("").tag("link mic start to push stream").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                }
                com.bytedance.android.live.liveinteract.api.a.b a2 = b.a.a();
                if (a2.f9940e == 0 || (room = this.p) == null) {
                    com.bytedance.android.live.liveinteract.cohost.c.b.a();
                    return;
                }
                room.getId();
                if (a2.w && !TextUtils.isEmpty(a2.v)) {
                    com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkCross_Reply", "start Interact when reply click agree");
                    a2.f9938c = true;
                    if (this.dataChannel != null) {
                        this.dataChannel.c(t.class, new p(4));
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("reply_status", 1);
                if (this.v.b(a.EnumC0247a.COHOST) != null) {
                    ab<com.bytedance.android.live.liveinteract.platform.a.c.a> b2 = this.v.b(a.EnumC0247a.COHOST).b(hashMap);
                    if (b2 == null) {
                        com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkCross_Reply", "single is null");
                        return;
                    }
                    if (this.u == null) {
                        this.u = new f();
                    }
                    ((ac) b2.a(e.a(com.bytedance.android.livesdk.util.rxutils.autodispose.a.a(this, i.a.ON_DESTROY), this.u))).a(n.f10648a, new o(this));
                }
            } else if (b.a.a().p != com.bytedance.android.live.liveinteract.api.m.RANDOM_LINK_MIC_INVITE) {
                l.d(this, "");
                l.d(dVar, "");
                com.bytedance.android.live.liveinteract.cohost.ui.b.c cVar = new com.bytedance.android.live.liveinteract.cohost.ui.b.c(this);
                w.a aVar = w.a.INVITEE_FRAGMENT;
                a.c cVar2 = new a.c((byte) 0);
                cVar2.f10021a = dVar;
                this.f10611h = cVar.b(aVar, cVar2);
                androidx.fragment.app.i iVar = (androidx.fragment.app.i) this.dataChannel.b(ao.class);
                if (iVar != null) {
                    this.f10611h.show(iVar, "LinkDialog");
                }
                if (b.a.a().w && !TextUtils.isEmpty(b.a.a().v)) {
                    a(PrivacyCert.Builder.with("bpea-507").usage("").tag("link mic start to push stream").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                    LinkCrossRoomWidget linkCrossRoomWidget = this.f10605b;
                    if (linkCrossRoomWidget != null) {
                        linkCrossRoomWidget.f10468g.a((Boolean) true);
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.a.c.b.a
    public final void a(aj ajVar) {
        if (isViewValid() && ajVar.f19141g == 4 && !this.f10608e) {
            d(2);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.c
    public final void a(String str) {
        LinkCrossRoomWidget linkCrossRoomWidget;
        MultiGuestAsGuestWidget multiGuestAsGuestWidget;
        com.bytedance.android.live.core.c.a.a(4, "LinkControlWidget", "linkmic_sei_update, sei = ".concat(String.valueOf(str)));
        com.bytedance.android.live.liveinteract.platform.common.g.a.a("linkmic_sei_update", str);
        if (!this.f10608e) {
            boolean a2 = com.bytedance.android.live.liveinteract.api.aj.a(this.f10610g, 2);
            com.bytedance.android.live.core.c.a.a(4, "LinkControlWidget", "onSei, containMultiGuest = ".concat(String.valueOf(a2)));
            if (!a2 || (multiGuestAsGuestWidget = this.o) == null) {
                boolean a3 = com.bytedance.android.live.liveinteract.api.aj.a(this.f10610g, 4);
                com.bytedance.android.live.core.c.a.a(4, "LinkControlWidget", "onSei, containCoHost = ".concat(String.valueOf(a3)));
                if (!a3 || (linkCrossRoomWidget = this.f10605b) == null) {
                    this.t = str;
                } else if (!linkCrossRoomWidget.f10466e && linkCrossRoomWidget.f10470i != null) {
                    linkCrossRoomWidget.f10470i.b(str);
                }
            } else {
                com.bytedance.android.live.liveinteract.multiguest.g.c.a aVar = multiGuestAsGuestWidget.f11459c;
                if (aVar != null) {
                    aVar.a(str);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(PrivacyCert privacyCert) {
        LinkCrossRoomWidget linkCrossRoomWidget = this.f10605b;
        if (linkCrossRoomWidget != null) {
            linkCrossRoomWidget.a(privacyCert);
        } else {
            c(4);
        }
    }

    @Override // com.bytedance.android.livesdk.callback.a
    public final boolean a(Runnable runnable) {
        MultiGuestAsGuestWidget multiGuestAsGuestWidget;
        if (!this.f10608e && (multiGuestAsGuestWidget = this.o) != null) {
            com.bytedance.android.live.liveinteract.api.a.c a2 = com.bytedance.android.live.liveinteract.api.a.c.a();
            l.b(a2, "");
            T t2 = a2.n;
            if (t2 != null && 2 == t2.intValue()) {
                new b.a(multiGuestAsGuestWidget.getContext()).b(R.string.grq).a(R.string.gwr, (DialogInterface.OnClickListener) new MultiGuestAsGuestWidget.c(multiGuestAsGuestWidget, runnable), false).b(R.string.gle, (DialogInterface.OnClickListener) MultiGuestAsGuestWidget.d.f11471a, false).a().show();
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.a.c.b.a
    public final void a(boolean z) {
        com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkCrossRoomPermissionResult", "result : ".concat(String.valueOf(z)));
        this.f10612i.c(z);
        if (this.f10613j) {
            this.f10612i.a(8, 17);
        }
        this.v.f11874a = z;
        b.a.a().O = z;
        x();
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.a.c.b.a
    public final void b() {
        o();
        c(4);
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.a.c.b.a
    public final void c() {
        d(4);
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.a.c.b.a
    public final void j() {
        com.bytedance.android.live.liveinteract.multilive.a.d(this.dataChannel);
    }

    /* access modifiers changed from: package-private */
    public final void o() {
        try {
            d.AbstractC0159d dVar = this.f10611h;
            if (dVar != null) {
                dVar.dismiss();
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z q() {
        o();
        return z.f158842a;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z u() {
        w();
        return z.f158842a;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z v() {
        w();
        return z.f158842a;
    }

    private static void z() {
        LivePerformanceManager.getInstance().onModuleStop("link_mic");
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.a.c.b.a
    public final void d() {
        if (isViewValid()) {
            o();
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.bq
    public final String g() {
        return getClass().getName();
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.a.c.b.a
    public final void i() {
        com.bytedance.android.live.liveinteract.multilive.a.c(this.dataChannel);
        MultiGuestAsGuestWidget multiGuestAsGuestWidget = this.o;
        if (multiGuestAsGuestWidget != null) {
            multiGuestAsGuestWidget.c(true);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.a.c.b.a
    public final void k() {
        com.bytedance.android.live.liveinteract.multilive.a.b(this.dataChannel);
        MultiGuestAsGuestWidget multiGuestAsGuestWidget = this.o;
        if (multiGuestAsGuestWidget != null) {
            multiGuestAsGuestWidget.c(false);
        }
    }

    private static boolean y() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        com.bytedance.android.livesdk.utils.ao.a(y.e(), (int) R.string.grs);
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.a.c.b.a
    public final void e() {
        LinkCrossRoomWidget linkCrossRoomWidget = this.f10605b;
        if (linkCrossRoomWidget != null && this.f10608e && linkCrossRoomWidget.f10468g != null) {
            linkCrossRoomWidget.f10468g.b(204);
        }
    }

    /* access modifiers changed from: package-private */
    public final void p() {
        androidx.fragment.app.i iVar;
        if (LiveMtInteractInviterCancelEnableSetting.INSTANCE.getValue() && (iVar = (androidx.fragment.app.i) this.dataChannel.b(ao.class)) != null) {
            new com.bytedance.android.live.liveinteract.cohost.ui.b.a().show(iVar, "InteractCancelDialog");
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z s() {
        d.AbstractC0159d dVar = this.f10611h;
        if (dVar != null && dVar.d() == w.a.INVITE_USER_LIST_FRAGMENT && LiveCoHostInviteePanelDismissSetting.INSTANCE.getValue() == 2) {
            return z.f158842a;
        }
        o();
        return z.f158842a;
    }

    private void x() {
        if (this.dataChannel != null && LiveAppBundleUtils.isPluginAvailable(com.bytedance.android.livesdk.utils.b.LINK_MIC)) {
            boolean z = this.v.f11874a;
            boolean z2 = this.v.f11875b;
            int i2 = 0;
            if (z) {
                if (z2) {
                    i2 = 3;
                } else {
                    i2 = 1;
                }
            } else if (z2) {
                i2 = 2;
            }
            this.dataChannel.a(ai.class, Integer.valueOf(i2));
            com.bytedance.android.live.core.c.a.a(4, "updateLinkMicEnableStatus", "newestStatus = ".concat(String.valueOf(i2)));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z r() {
        if (b.a.a().q) {
            this.f10607d.d();
            this.f10607d.a(LinkApi.a.RTC_ERROR_CANCEL);
        } else {
            this.f10607d.a(6);
            o();
        }
        return z.f158842a;
    }

    private void w() {
        o();
        boolean a2 = com.bytedance.android.live.liveinteract.api.aj.a(this.f10610g, 2);
        com.bytedance.android.live.core.c.a.a(4, "LinkControlWidget", "onMultiGuestClicked, containMultiGuest = " + a2 + "  mIsAnchor = " + this.f10608e);
        if (!a2) {
            this.r = true;
            this.f10607d.a(LinkApi.e.USER_CLICK);
            com.bytedance.android.live.liveinteract.platform.common.g.b.c("manual");
        } else if (this.f10608e) {
            o.a("connection_button");
            this.f10604a.d();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.a.c.b.a
    public final void f() {
        if (isViewValid() && !this.f10608e) {
            if (!LiveAppBundleUtils.isPluginAvailable(com.bytedance.android.livesdk.utils.b.LINK_MIC)) {
                LiveAppBundleUtils.ensurePluginAvailable(this.context, com.bytedance.android.livesdk.utils.b.LINK_MIC);
                com.bytedance.android.livesdk.utils.ao.a(y.e(), (int) R.string.eht);
            } else if (this.f10613j) {
                com.bytedance.android.livesdk.utils.ao.a(y.e(), (int) R.string.e60);
            } else if (!com.bytedance.android.live.liveinteract.api.aj.a(this.f10610g, 2)) {
                com.bytedance.android.livesdk.utils.ao.a(y.e(), (int) R.string.egy);
            } else {
                n();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.c.a.b
    public final void n() {
        int i2 = Build.VERSION.SDK_INT;
        Room room = this.p;
        if (room != null && room.getMosaicStatus() == 1) {
            com.bytedance.android.livesdk.utils.ao.a(y.e(), (int) R.string.gsq);
        } else if (this.f10610g != 2 || this.f10608e) {
            d.AbstractC0159d dVar = this.f10611h;
            if ((dVar == null || !dVar.isVisible()) && this.f10612i.c()) {
                com.bytedance.android.live.liveinteract.linkroom.a.b.a.a(2);
                this.f10612i.f();
                w();
                if (this.f10608e) {
                    com.bytedance.android.live.liveinteract.platform.common.g.b.b("golive_window");
                } else {
                    com.bytedance.android.live.liveinteract.platform.common.g.b.a("connection_button", this.p.getOwner().getFollowInfo().getFollowStatus());
                }
            }
        } else {
            this.o.a(true);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        com.bytedance.android.live.p.l.INTERACTION.unload(this.dataChannel);
        this.f10609f = null;
        this.t = null;
        g gVar = this.w;
        IMessageManager iMessageManager = (IMessageManager) gVar.f11871a.b(cg.class);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(gVar);
        }
        this.f10607d.b();
        o();
        this.dataChannel.b(this);
        DataChannelGlobal.f34575d.b(this);
        com.bytedance.android.livesdk.b.a.d.a().f14180a = null;
        if (!this.f10608e) {
            com.bytedance.android.live.liveinteract.multilive.b.a.b("live_over", null);
        }
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a().clear();
        super.onDestroy();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z t() {
        boolean z = b.a.a().f9937b;
        boolean z2 = b.a.a().q;
        com.bytedance.android.live.core.c.a.a(4, "LinkControlWidget", "receive MultiGuestAnchorInProgressChanged, isStaring = " + z + "  isStarter = " + z2);
        if (z) {
            if (z2) {
                this.f10607d.d();
                this.f10607d.a(LinkApi.a.INTERRUPT_BY_MULTI_GUEST);
            } else {
                this.f10607d.a(11);
            }
        }
        o();
        return z.f158842a;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10620a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f10621b;

        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0069 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007d */
        static {
            /*
            // Method dump skipped, instructions count: 136
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget.AnonymousClass3.<clinit>():void");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.a.c.b.a
    public final void h() {
        if (isViewValid() && this.f10608e) {
            if (!LiveAppBundleUtils.isPluginAvailable(com.bytedance.android.livesdk.utils.b.LINK_MIC)) {
                LiveAppBundleUtils.ensurePluginAvailable(this.context, com.bytedance.android.livesdk.utils.b.LINK_MIC);
                com.bytedance.android.livesdk.utils.ao.a(y.e(), (int) R.string.eht);
            } else if (this.f10613j) {
                com.bytedance.android.livesdk.utils.ao.a(y.e(), (int) R.string.e60);
            } else {
                int i2 = Build.VERSION.SDK_INT;
                Room room = this.p;
                if (room != null && room.getMosaicStatus() == 1) {
                    com.bytedance.android.livesdk.utils.ao.a(y.e(), (int) R.string.gsq);
                } else if (!com.bytedance.android.live.liveinteract.api.aj.a(this.f10610g, 4)) {
                    d.AbstractC0159d dVar = this.f10611h;
                    if ((dVar == null || !dVar.isVisible()) && this.f10612i.d()) {
                        com.bytedance.android.live.liveinteract.linkroom.a.b.a.a(1);
                        this.f10612i.f();
                        b.a.a().V = "banner";
                        c(false);
                        h.a("room", "banner", false);
                        h.a(this.dataChannel);
                    }
                } else if (b.a.a().a(k.CONNECTION_START)) {
                    com.bytedance.android.live.core.c.a.a(6, "LinkControlWidget", "H5 open co-host, but now is co-hosting!");
                } else if (b.a.a().b() == k.INVITING) {
                    com.bytedance.android.live.core.c.a.a(6, "LinkControlWidget", "H5 open co-host, but is inviting other host!");
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.c.a.b
    public final void m() {
        int i2 = Build.VERSION.SDK_INT;
        Room room = this.p;
        if (room != null && room.getMosaicStatus() == 1) {
            com.bytedance.android.livesdk.utils.ao.a(y.e(), (int) R.string.gsq);
        } else if (com.bytedance.android.live.liveinteract.cohost.a.c.a.e() || com.bytedance.android.live.liveinteract.cohost.a.c.a.d()) {
            com.bytedance.android.live.liveinteract.cohost.a.c.a.a(a.c.PREVIEW_DIALOG);
        } else if (com.bytedance.android.live.liveinteract.cohost.a.c.a.f()) {
            com.bytedance.android.live.liveinteract.cohost.a.c.a.a(a.c.CANCEL_DIALOG);
        } else if (!com.bytedance.android.live.liveinteract.api.aj.a(this.f10610g, 4)) {
            d.AbstractC0159d dVar = this.f10611h;
            if ((dVar == null || !dVar.isVisible()) && this.f10612i.d()) {
                com.bytedance.android.live.liveinteract.linkroom.a.b.a.a(1);
                b.a.a().V = "connection_icon";
                c(false);
                h.a("room", "connection_icon", false);
                h.a(this.dataChannel);
            }
        } else if (b.a.a().a(k.CONNECTION_START)) {
            LinkCrossRoomWidget linkCrossRoomWidget = this.f10605b;
            if (linkCrossRoomWidget != null) {
                linkCrossRoomWidget.f();
            }
        } else if (b.a.a().b() == k.INVITING) {
            p();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.a.c.b.a
    public final void a() {
        com.bytedance.android.livesdk.b.a.d.a().a((Object) false);
        if (com.bytedance.android.live.liveinteract.api.aj.a(this.f10610g, 2)) {
            d(2);
        }
        if (!this.f10608e) {
            this.f10612i.a(8, 16);
            com.bytedance.android.live.liveinteract.multilive.b.a.b("others", n.NORMAL);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.c.a.b
    public final void l() {
        if (this.f10608e) {
            Object a2 = com.bytedance.android.live.liveinteract.api.c.e.f10014a.a("MULTI_GUEST_DATA_HOLDER");
            if (a2 instanceof com.bytedance.android.live.liveinteract.multiguest.opt.a.a) {
                h.a(this.f10610g, this.p, ((com.bytedance.android.live.liveinteract.multiguest.opt.a.a) a2).q, true, false);
            } else {
                h.a(this.f10610g, this.p, (n) null, true, false);
            }
        } else {
            h.b("connection_button");
            h.f11965b = "connection_button";
        }
        int i2 = Build.VERSION.SDK_INT;
        Room room = this.p;
        if (room != null && room.getMosaicStatus() == 1) {
            com.bytedance.android.livesdk.utils.ao.a(y.e(), (int) R.string.gsq);
        } else if (com.bytedance.android.live.liveinteract.cohost.a.c.a.e() || com.bytedance.android.live.liveinteract.cohost.a.c.a.d()) {
            com.bytedance.android.live.liveinteract.cohost.a.c.a.a(a.c.PREVIEW_DIALOG);
        } else if (com.bytedance.android.live.liveinteract.cohost.a.c.a.f()) {
            com.bytedance.android.live.liveinteract.cohost.a.c.a.a(a.c.CANCEL_DIALOG);
        } else {
            int i3 = this.f10610g;
            if (i3 == 2 && !this.f10608e) {
                this.o.a(true);
            } else if (!com.bytedance.android.live.liveinteract.api.aj.a(i3, 4)) {
                d.AbstractC0159d dVar = this.f10611h;
                if (dVar != null && dVar.isVisible()) {
                    return;
                }
                if (this.f10612i.d() && !this.f10612i.c()) {
                    com.bytedance.android.live.liveinteract.linkroom.a.b.a.a(1);
                    this.f10612i.f();
                    b.a.a().V = "connection_icon";
                    c(this.f10612i.c());
                    h.a("room", "connection_icon", false);
                    h.a(this.dataChannel);
                } else if (this.f10612i.d() || !this.f10612i.c()) {
                    l.d(this, "");
                    this.f10611h = new com.bytedance.android.live.liveinteract.cohost.ui.b.c(this).b(w.a.BUTTON_FRAGMENT, a.c.C0189a.a());
                    androidx.fragment.app.i iVar = (androidx.fragment.app.i) this.dataChannel.b(ao.class);
                    if (iVar != null) {
                        this.f10611h.show(iVar, "LinkDialog");
                    }
                } else {
                    com.bytedance.android.live.liveinteract.linkroom.a.b.a.a(2);
                    this.f10612i.f();
                    w();
                    if (this.f10608e) {
                        com.bytedance.android.live.liveinteract.platform.common.g.b.b("golive_window");
                    } else {
                        com.bytedance.android.live.liveinteract.platform.common.g.b.a("connection_button", this.p.getOwner().getFollowInfo().getFollowStatus());
                    }
                }
            } else if (b.a.a().a(k.CONNECTION_START)) {
                LinkCrossRoomWidget linkCrossRoomWidget = this.f10605b;
                if (linkCrossRoomWidget != null) {
                    linkCrossRoomWidget.f();
                }
            } else if (b.a.a().b() == k.INVITING) {
                p();
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        this.f10613j = ((com.bytedance.android.live.j.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.j.a.class)).isMicRoomForCurrentRoom();
        this.p = (Room) this.dataChannel.b(df.class);
        this.f10608e = ((Boolean) this.dataChannel.b(ee.class)).booleanValue();
        this.q = (com.bytedance.android.livesdkapi.depend.model.live.i) this.dataChannel.b(bx.class);
        ad.a(ad.a.NOTCOHOST);
        if (!LinkEntranceExperiment.INSTANCE.getValue() || !(this.f10612i instanceof com.bytedance.android.live.liveinteract.linkroom.c.b)) {
            com.bytedance.android.live.p.l.INTERACTION.load(this.dataChannel, this.f10612i, false);
        } else {
            if (this.f10608e) {
                com.bytedance.android.live.p.l.COHOST.load(this.dataChannel, ((com.bytedance.android.live.liveinteract.linkroom.c.b) this.f10612i).f10540b, false);
            }
            com.bytedance.android.live.p.l.MULTIGUEST.load(this.dataChannel, ((com.bytedance.android.live.liveinteract.linkroom.c.b) this.f10612i).f10541c, false);
        }
        this.f10612i.a(8, 17);
        g gVar = new g(this.dataChannel);
        this.w = gVar;
        IMessageManager iMessageManager = (IMessageManager) gVar.f11871a.b(cg.class);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.LINK_MIC_SIGNAL.getIntType(), gVar);
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.LINK_MIC.getIntType(), gVar);
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.LINK_MESSAGE.getIntType(), gVar);
        }
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(new com.bytedance.android.live.liveinteract.platform.a.c(), null);
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(this.w, null);
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(this);
        com.bytedance.android.live.liveinteract.linkroom.a.c.b bVar = new com.bytedance.android.live.liveinteract.linkroom.a.c.b(this.p, this.f10608e, this.q);
        this.f10607d = bVar;
        bVar.a((b.a) this);
        this.dataChannel.a((m) this, com.bytedance.android.live.liveinteract.platform.common.c.a.class, (h.f.a.b) new a(this)).a((Object) this, t.class, (h.f.a.b) new b(this)).a((m) this, ck.class, (h.f.a.b) new m(this)).a((m) this, bf.class, (h.f.a.b) new w(this)).a((m) this, com.bytedance.android.live.liveinteract.api.n.class, (h.f.a.b) new x(this)).a((m) this, com.bytedance.android.live.liveinteract.platform.common.c.i.class, (h.f.a.b) new y(this)).a((m) this, com.bytedance.android.live.liveinteract.platform.common.c.b.class, (h.f.a.b) new z(this)).a((m) this, am.class, (h.f.a.b) new aa(this)).a(com.bytedance.android.live.liveinteract.cohost.a.b.a.class, (h.f.a.b) new ab(this)).a(com.bytedance.android.live.liveinteract.cohost.a.b.d.class, (h.f.a.b) new ac(this)).a(com.bytedance.android.live.liveinteract.cohost.a.b.b.class, (h.f.a.b) new c(this)).a(com.bytedance.android.live.liveinteract.cohost.a.b.c.class, (h.f.a.b) new d(this)).a(com.bytedance.android.live.liveinteract.platform.common.c.g.class, (h.f.a.b) new e(this)).a(com.bytedance.android.live.liveinteract.multilive.anchor.b.a.class, (h.f.a.b) new f(this)).a(com.bytedance.android.live.n.c.class, (h.f.a.b) new g(this)).a(af.class, (h.f.a.b) new h(this));
        DataChannelGlobal.f34575d.a(this, com.bytedance.android.live.liveinteract.platform.common.c.k.class, new i(this));
        LiveAppBundleUtils.ensurePluginAvailable(this.context, com.bytedance.android.livesdk.utils.b.LINK_MIC, new com.bytedance.r.a.a.b() {
            /* class com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget.AnonymousClass1 */

            static {
                Covode.recordClassIndex(5651);
            }

            @Override // com.bytedance.r.a.a.b
            public final void b() {
                com.bytedance.android.live.core.c.a.a(6, "LinkControlWidget", "Link mic bundle load failed");
            }

            @Override // com.bytedance.r.a.a.b
            public final void a() {
                if (!LinkControlWidget.this.f10613j && LinkControlWidget.this.f10608e) {
                    LinkControlWidget.this.f10612i.e();
                    com.bytedance.android.live.core.c.a.a(6, "LinkControlWidget", "Link mic bundle load failed");
                }
            }
        });
        LiveAppBundleUtils.ensurePluginAvailable(this.context, com.bytedance.android.livesdk.utils.b.QUIC);
        LiveAppBundleUtils.ensurePluginAvailable(this.context, com.bytedance.android.livesdk.utils.b.RTS);
        if (this.dataChannel != null) {
            this.dataChannel.a((m) this, v.class, (h.f.a.b) new t(this));
        }
        if (this.dataChannel != null) {
            this.dataChannel.a((m) this, ak.class, (h.f.a.b) new u(this));
        }
        this.dataChannel.a(ap.class, (h.f.a.b) new j(this)).a(com.bytedance.android.live.liveinteract.match.b.c.l.class, (h.f.a.b) new k(this)).a(com.bytedance.android.live.liveinteract.match.b.c.i.class, (h.f.a.b) new l(this));
        com.bytedance.android.livesdk.b.a.d.a().f14180a = new d.a() {
            /* class com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            boolean f10618a;

            static {
                Covode.recordClassIndex(5652);
            }

            @Override // com.bytedance.android.livesdk.b.a.d.a
            public final void a(boolean z) {
                if (this.f10618a != z) {
                    this.f10618a = z;
                    com.bytedance.android.live.core.c.a.a(3, "LinkControlWidget", "multi-guest state: ".concat(String.valueOf(z)));
                    if (z) {
                        LinkControlWidget.this.dataChannel.c(com.bytedance.android.live.liveinteract.api.b.i.class, new com.bytedance.android.live.liveinteract.api.b.h(com.bytedance.android.live.liveinteract.api.b.h.f9986c));
                        com.bytedance.android.live.liveinteract.linkroom.b.a.a(com.bytedance.android.live.liveinteract.api.b.h.f9986c);
                        return;
                    }
                    LinkControlWidget.this.dataChannel.c(com.bytedance.android.live.liveinteract.api.b.i.class, new com.bytedance.android.live.liveinteract.api.b.h(com.bytedance.android.live.liveinteract.api.b.h.f9985b));
                    com.bytedance.android.live.liveinteract.linkroom.b.a.a(com.bytedance.android.live.liveinteract.api.b.h.f9985b);
                }
            }
        };
        if (!this.f10608e) {
            com.bytedance.android.live.liveinteract.multilive.b.a.a("live_play", n.NORMAL);
        }
    }

    public LinkControlWidget(BaseLinkControlWidget.a aVar) {
        com.bytedance.android.live.liveinteract.linkroom.c.a eVar;
        if (LinkEntranceExperiment.INSTANCE.getValue()) {
            eVar = new com.bytedance.android.live.liveinteract.linkroom.c.b(this, this);
        } else {
            eVar = new com.bytedance.android.live.liveinteract.linkroom.c.e(this, this);
        }
        this.f10612i = eVar;
        this.f10613j = false;
        this.f10614k = false;
        this.f10615l = null;
        this.f10616m = null;
        this.n = null;
        this.f10609f = aVar;
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.a.c.b.a
    public final void b(int i2) {
        if (i2 != 2 && i2 != 5) {
            return;
        }
        if (LiveCoHostInviteePanelDismissSetting.INSTANCE.getValue() == 1) {
            c(false);
        } else if (LiveCoHostInviteePanelDismissSetting.INSTANCE.getValue() == 2 && !this.f10611h.isVisible()) {
            c(false);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z a(Boolean bool) {
        o();
        if (this.f10605b != null) {
            b.a.a().f9946k = bool.booleanValue();
            LinkCrossRoomWidget linkCrossRoomWidget = this.f10605b;
            if (linkCrossRoomWidget.f10468g == null) {
                return null;
            }
            linkCrossRoomWidget.f10468g.b(209);
            return null;
        } else if (this.dataChannel == null) {
            return null;
        } else {
            this.dataChannel.c(t.class, new p(1));
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(boolean z) {
        if (b.a.a().f9936a || com.bytedance.android.live.liveinteract.cohost.a.c.a.e()) {
            com.bytedance.android.livesdk.utils.ao.a(y.e(), (int) R.string.dy0);
            return;
        }
        boolean d2 = this.f10612i.d();
        d.AbstractC0159d dVar = this.f10611h;
        if ((dVar == null || !dVar.isVisible()) && y() && d2 && !com.bytedance.android.live.liveinteract.linkroom.a.c.b.c()) {
            this.f10611h = com.bytedance.android.live.liveinteract.platform.common.h.a.a(this, z);
            androidx.fragment.app.i iVar = (androidx.fragment.app.i) this.dataChannel.b(ao.class);
            if (iVar != null) {
                this.f10611h.show(iVar, "LinkDialog");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z a(Integer num) {
        com.bytedance.android.live.liveinteract.linkroom.a.c.b bVar = this.f10607d;
        if (bVar != null) {
            bVar.d();
        }
        a(num.intValue(), PrivacyCert.Builder.with("bpea-504").usage("").tag("link mic start to push stream").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        return z.f158842a;
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.a.c.b.a
    public final void b(boolean z) {
        String str;
        com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkInRoomPermissionResult", "result : ".concat(String.valueOf(z)));
        this.f10612i.b(z);
        if (this.f10613j) {
            this.f10612i.a(8, 17);
        }
        this.v.f11875b = z;
        x();
        Room room = this.p;
        boolean booleanValue = com.bytedance.android.livesdk.ap.a.ck.a().booleanValue();
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
        hashMap.put("room_id", room.getIdStr());
        String str2 = "1";
        if (z) {
            str = str2;
        } else {
            str = "0";
        }
        hashMap.put("guest_avaliable", str);
        if (!booleanValue) {
            str2 = "0";
        }
        hashMap.put("guest_connection_switch_status", str2);
        h.a("livesdk_guest_connection_switch_status", hashMap);
        if (z && !this.f10613j && this.f10607d != null) {
            if (com.bytedance.android.livesdk.ap.a.ck.a().booleanValue() && LiveAnchorAutoOpenGuestLinkmicSwitchSetting.INSTANCE.getValue()) {
                com.bytedance.android.live.liveinteract.platform.common.g.b.c("auto");
                this.f10607d.a(LinkApi.e.AUTO_START);
            } else if (com.bytedance.android.livesdk.ap.a.ck.a().booleanValue()) {
                com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) com.bytedance.android.livesdk.ap.a.ck, (Object) false);
            }
        }
    }

    private void c(int i2) {
        String str;
        if (isViewValid()) {
            com.bytedance.android.live.liveinteract.platform.common.g.a.a("SwitchMode", "CurrentMode:" + this.f10610g + "; TargetMode:" + i2 + ", LinkEntranceExperiment = " + LinkEntranceExperiment.INSTANCE.getValue());
            if (!com.bytedance.android.live.liveinteract.api.aj.a(this.f10610g, i2)) {
                this.f10610g |= i2;
                b.a.a().a(this.f10610g);
                if (i2 == 2) {
                    a("normal", this.f10608e);
                    if (this.f10608e) {
                        if (!LinkEntranceExperiment.INSTANCE.getValue() || !(this.f10612i instanceof com.bytedance.android.live.liveinteract.linkroom.c.b)) {
                            this.f10612i.a(0, 16);
                        } else {
                            LinkCrossRoomWidget linkCrossRoomWidget = this.f10605b;
                            if (!(linkCrossRoomWidget == null || linkCrossRoomWidget.f10473l == null)) {
                                ad.a(this.f10605b.f10473l.f10831a, new p(this), ad.b.PK);
                            }
                            ad.b(((com.bytedance.android.live.liveinteract.linkroom.c.b) this.f10612i).f10541c.f10584c, new q(this), ad.b.MULTIGUEST);
                            ad.a(ad.a.NOTCOHOST);
                        }
                        MultiGuestAsAnchorWidget multiGuestAsAnchorWidget = (MultiGuestAsAnchorWidget) this.f10609f.a(0);
                        this.f10604a = multiGuestAsAnchorWidget;
                        if (this.r) {
                            multiGuestAsAnchorWidget.d();
                        }
                        this.r = false;
                    } else {
                        this.o = (MultiGuestAsGuestWidget) this.f10609f.a(1);
                        this.f10612i.a(0, 16);
                        com.bytedance.android.live.liveinteract.platform.common.g.a.a("SwitchMode", "TargetMode:" + i2 + ", action:loadMultiGuestWidget");
                    }
                    this.dataChannel.b(com.bytedance.android.live.liveinteract.platform.common.c.h.class, (Object) 2);
                } else if (i2 == 4) {
                    a("pk", this.f10608e);
                    if (!(this.v.a() instanceof com.bytedance.android.live.liveinteract.cohost.b.a)) {
                        this.f10607d.a();
                    }
                    this.s = SystemClock.elapsedRealtime();
                    if (b.a.a().r > 0) {
                        b.a.a().I = this.s;
                    }
                    this.f10605b = (LinkCrossRoomWidget) this.f10609f.a(2);
                    com.bytedance.android.live.liveinteract.platform.common.g.a.a("SwitchMode", "TargetMode:" + i2 + ", action:loadCoHostWidget");
                    if (this.f10608e) {
                        this.f10612i.a(0, 1);
                    } else {
                        this.f10612i.a(8, 16);
                    }
                    this.dataChannel.b(com.bytedance.android.live.liveinteract.platform.common.c.h.class, (Object) 4);
                    if (!this.f10608e && (str = this.t) != null) {
                        a(str);
                        this.t = null;
                    }
                }
            }
        }
    }

    private void d(int i2) {
        com.bytedance.android.live.core.c.a.a(4, "LinkControlWidget", "unLoadWidget, mode = ".concat(String.valueOf(i2)));
        com.bytedance.android.live.liveinteract.platform.common.g.a.a("unLoadWidget", "mode:".concat(String.valueOf(i2)));
        if (com.bytedance.android.live.liveinteract.api.aj.a(this.f10610g, i2)) {
            this.f10610g = com.bytedance.android.live.liveinteract.api.aj.b(this.f10610g, i2);
            b.a.a().a(this.f10610g);
            com.bytedance.android.live.core.c.a.a(4, "LinkControlWidget", "unLoadWidget, after remove mode, mCurrentMode = ".concat(String.valueOf(i2)));
            if (i2 == 2) {
                com.bytedance.android.live.liveinteract.platform.common.g.z.a("other");
                com.bytedance.android.live.liveinteract.platform.common.g.z.b("connection_over");
                this.f10609f.a(this.f10604a);
                this.f10609f.a(this.o);
                this.f10604a = null;
                this.o = null;
                this.v.a(a.EnumC0247a.MULTIGUEST);
            } else if (i2 == 4) {
                this.f10609f.a(this.f10605b);
                this.f10607d.d();
                this.f10605b = null;
                this.v.a(a.EnumC0247a.COHOST);
            }
            if (this.f10610g == 0) {
                if (!this.f10608e) {
                    this.f10612i.a(8, 16);
                    this.t = null;
                    com.bytedance.android.live.liveinteract.platform.common.g.z.a("other");
                    if (com.bytedance.android.live.liveinteract.multilive.b.a.a()) {
                        com.bytedance.android.live.liveinteract.multilive.b.a.b("others", null);
                        com.bytedance.android.live.liveinteract.multilive.b.a.a("others", n.NORMAL);
                    }
                } else if (!this.f10613j) {
                    if (!LinkEntranceExperiment.INSTANCE.getValue() || !(this.f10612i instanceof com.bytedance.android.live.liveinteract.linkroom.c.b)) {
                        this.f10612i.a(0, 17);
                    } else {
                        LinkCrossRoomWidget linkCrossRoomWidget = this.f10605b;
                        if (!(linkCrossRoomWidget == null || linkCrossRoomWidget.f10473l == null)) {
                            ad.a(this.f10605b.f10473l.f10831a, new r(this), ad.b.PK);
                        }
                        ad.b(((com.bytedance.android.live.liveinteract.linkroom.c.b) this.f10612i).f10541c.f10584c, new s(this), ad.b.MULTIGUEST);
                        ad.a(ad.a.NOTCOHOST);
                    }
                }
                this.dataChannel.b(com.bytedance.android.live.liveinteract.platform.common.c.h.class, (Object) 0);
                z();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.a.c.b.a
    public final void a(LinkApi.e eVar) {
        if (!this.f10613j) {
            com.bytedance.android.livesdk.b.a.d.a().a((Object) true);
            if (!this.p.isLiveTypeAudio()) {
                com.bytedance.android.live.liveinteract.platform.a.b a2 = this.v.a();
                if (!(a2 instanceof com.bytedance.android.live.liveinteract.multiguest.b.a)) {
                    com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(new com.bytedance.android.live.liveinteract.multiguest.c.a(), null);
                    com.bytedance.android.live.liveinteract.platform.a.a.b bVar = new com.bytedance.android.live.liveinteract.platform.a.a.b();
                    bVar.f11858b = this.f10608e;
                    this.v.a(this.p.getOwnerUserId(), a.EnumC0247a.MULTIGUEST, this.dataChannel, bVar);
                    a2 = this.v.b(a.EnumC0247a.MULTIGUEST);
                }
                if (!this.f10608e && (a2 instanceof com.bytedance.android.live.liveinteract.multiguest.b.a)) {
                    ((com.bytedance.android.live.liveinteract.multiguest.b.a) a2).f11163d.a(this.f10607d.f10502g);
                    if (this.f10607d.f10502g) {
                        com.bytedance.android.livesdk.b.a.d.a().x = 3;
                    }
                }
                com.bytedance.android.live.liveinteract.platform.common.g.a.a("onMultiGuestTurnedOn", "source:" + eVar.value);
                c(2);
                com.bytedance.android.live.liveinteract.platform.common.g.z.f12040a = SystemClock.uptimeMillis();
                Map<String, String> a3 = com.bytedance.android.live.liveinteract.platform.common.g.z.a();
                String str = com.bytedance.android.live.liveinteract.platform.common.g.z.f12041b;
                if (str == null) {
                    str = "others";
                }
                a3.put("trigger", str);
                a3.put("permission_type", com.bytedance.android.live.liveinteract.multilive.a.d());
                com.bytedance.android.live.liveinteract.multilive.b.a.a(a3, com.bytedance.android.live.liveinteract.multilive.b.a.b());
                com.bytedance.android.live.liveinteract.platform.common.g.z.f12041b = null;
                com.bytedance.android.live.liveinteract.platform.common.g.z.a("livesdk_guest_connection_mode_view_start", a3);
            }
            if (eVar == LinkApi.e.USER_CLICK) {
                com.bytedance.android.livesdk.utils.ao.a(y.e(), (int) R.string.dvv);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.a.c.b.a
    public final void a(LinkApi.e eVar, Throwable th) {
        if (eVar == LinkApi.e.USER_CLICK) {
            com.bytedance.android.livesdk.utils.f.a(this.context, th, (int) R.string.grx);
        }
    }

    private static void a(String str, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("mode", str);
        String str2 = "0";
        hashMap.put("stream_mix_on_client", str2);
        if (z) {
            str2 = "1";
        }
        hashMap.put("is_anchor", str2);
        LivePerformanceManager.getInstance().onModuleStart("link_mic", hashMap);
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.a.c.b.a
    public final void a(int i2, PrivacyCert privacyCert) {
        if (isViewValid() && !b.a.a().f9938c) {
            b.a.a().f9938c = true;
            if (i2 == 1 && b.a.a().f9941f != 0) {
                if (com.bytedance.android.live.liveinteract.cohost.a.c.a.c()) {
                    if (this.dataChannel != null) {
                        this.dataChannel.c(s.class, "");
                    }
                    b.a.a().n = true;
                }
                o();
                a(privacyCert);
            } else if (!com.bytedance.android.live.liveinteract.cohost.a.c.a.c()) {
                com.bytedance.android.livesdk.utils.ao.a(y.e(), a(i2));
                if (this.v.a() instanceof com.bytedance.android.live.liveinteract.cohost.b.a) {
                    ((com.bytedance.android.live.liveinteract.cohost.b.a) this.v.a()).c();
                }
            } else {
                b.a.a().f9947l = true;
                if ((this.v.a() instanceof com.bytedance.android.live.liveinteract.cohost.b.a) && ((com.bytedance.android.live.liveinteract.cohost.b.a) this.v.a()).c()) {
                    this.dataChannel.c(r.class, "");
                }
            }
        }
    }
}
