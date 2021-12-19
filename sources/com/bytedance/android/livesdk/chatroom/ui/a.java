package com.bytedance.android.livesdk.chatroom.ui;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.lifecycle.m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.copyrightreview.helper.CopyrightViolationHelper;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.performance.b;
import com.bytedance.android.live.design.widget.shapecontrol.ShapeControllableView;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.n.ad;
import com.bytedance.android.live.p.l;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.live.slot.ac;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ai.c;
import com.bytedance.android.livesdk.av;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdk.chatroom.b.c;
import com.bytedance.android.livesdk.chatroom.c.an;
import com.bytedance.android.livesdk.chatroom.c.r;
import com.bytedance.android.livesdk.chatroom.e.k;
import com.bytedance.android.livesdk.chatroom.e.q;
import com.bytedance.android.livesdk.chatroom.g.a.d;
import com.bytedance.android.livesdk.chatroom.interaction.e;
import com.bytedance.android.livesdk.chatroom.interaction.f;
import com.bytedance.android.livesdk.chatroom.interaction.g;
import com.bytedance.android.livesdk.chatroom.interaction.h;
import com.bytedance.android.livesdk.chatroom.viewmodule.EndWidget;
import com.bytedance.android.livesdk.function.UserPermissionCheckWidget;
import com.bytedance.android.livesdk.gift.b.a;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.s;
import com.bytedance.android.livesdk.j.aa;
import com.bytedance.android.livesdk.j.ao;
import com.bytedance.android.livesdk.j.at;
import com.bytedance.android.livesdk.j.bc;
import com.bytedance.android.livesdk.j.bk;
import com.bytedance.android.livesdk.j.br;
import com.bytedance.android.livesdk.j.bs;
import com.bytedance.android.livesdk.j.bw;
import com.bytedance.android.livesdk.j.bx;
import com.bytedance.android.livesdk.j.ch;
import com.bytedance.android.livesdk.j.cn;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.cy;
import com.bytedance.android.livesdk.j.de;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.di;
import com.bytedance.android.livesdk.j.dk;
import com.bytedance.android.livesdk.j.dn;
import com.bytedance.android.livesdk.j.dx;
import com.bytedance.android.livesdk.j.ea;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.j.ei;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePauseLiveSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveFastGiftIconHideSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveVideoGiftCoverPanelSetting;
import com.bytedance.android.livesdk.livesetting.other.ToolBarButtonWithTextExperiment;
import com.bytedance.android.livesdk.livesetting.watchlive.EnablePreloadFirstScreenFrameSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractStartFetchingMessageStyleSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveHostCardLongPressEnableSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.MtPipWatchLiveEnableSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisableCommentAreaSetting;
import com.bytedance.android.livesdk.model.RoomAuthOffReasons;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.az;
import com.bytedance.android.livesdk.model.message.ab;
import com.bytedance.android.livesdk.model.message.bv;
import com.bytedance.android.livesdk.model.message.by;
import com.bytedance.android.livesdk.model.message.n;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.n.b;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.utils.am;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdk.widget.GestureDetectLayout;
import com.bytedance.android.livesdk.widget.b.c;
import com.bytedance.android.livesdk.widget.j;
import com.bytedance.android.livesdkapi.depend.e.c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.message.IMessageService;
import com.bytedance.android.widget.Widget;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.FluencyOpt;
import com.bytedance.ies.sdk.widgets.IWidgetProvider;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetProvider;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import f.a.b.b;
import f.a.t;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public abstract class a extends com.bytedance.android.livesdk.ui.a implements c.a, com.bytedance.android.livesdk.chatroom.view.a, com.bytedance.android.livesdkapi.depend.a.a, WeakHandler.IHandler, com.bytedance.ies.a.a {
    protected List<com.bytedance.android.livesdk.callback.a> A = new ArrayList();
    public b B;
    com.bytedance.android.livesdk.widget.b.a C = new com.bytedance.android.livesdk.widget.b.a() {
        /* class com.bytedance.android.livesdk.chatroom.ui.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(8732);
        }

        @Override // com.bytedance.android.livesdk.widget.b.b
        public final void a() {
            a.this.k();
        }

        @Override // com.bytedance.android.livesdk.widget.b.b
        public final void b() {
            a.this.m();
        }

        @Override // com.bytedance.android.livesdk.widget.b.b
        public final void c() {
            a.this.l();
        }

        @Override // com.bytedance.android.livesdk.widget.b.b
        public final void d() {
            a.this.j();
        }

        @Override // com.bytedance.android.livesdk.widget.b.b
        public final void e() {
            a.this.n();
        }
    };
    public com.bytedance.android.livesdk.widget.b.c D = new com.bytedance.android.livesdk.widget.b.c(this.C);
    public boolean E = false;
    ShapeControllableView F;
    public final Runnable G = new b(this);
    private GestureDetectLayout H;
    private WidgetCreateTimeUtil I = new WidgetCreateTimeUtil();
    private boolean J;
    private TextView K;
    private f L;
    private g M;
    private com.bytedance.android.livesdk.chatroom.interaction.b N;
    private h O;
    private e P;
    private com.bytedance.android.message.a Q;
    private q R;
    private LiveRecyclableWidget S;
    private LiveRecyclableWidget T;
    private k U;
    private Runnable V;
    private CopyrightViolationHelper W;
    private com.bytedance.android.live.share.b X;
    private DialogInterface Y;
    private LiveRecyclableWidget Z;

    /* renamed from: a  reason: collision with root package name */
    protected WeakHandler f15824a = new WeakHandler(this);
    private LiveRecyclableWidget aa;
    private LiveRecyclableWidget ab;
    private LiveRecyclableWidget ac;
    private LiveRecyclableWidget ad;
    private LiveRecyclableWidget ae;
    private boolean af = false;
    private LiveRecyclableWidget ag;
    private LiveRecyclableWidget ah;
    private com.bytedance.android.livesdk.rank.api.c ai;
    private final Runnable aj = new c(this);
    private final com.bytedance.android.livesdk.gift.e.b ak = new com.bytedance.android.livesdk.gift.e.b() {
        /* class com.bytedance.android.livesdk.chatroom.ui.a.AnonymousClass6 */

        static {
            Covode.recordClassIndex(8737);
        }

        @Override // com.bytedance.android.livesdk.gift.e.b
        public final void a(List<u> list) {
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void a() {
            ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).loadBehavior(a.this.getContext(), a.this.f15831h, l.FAST_GIFT.ordinal());
        }

        @Override // com.bytedance.android.livesdk.gift.e.b
        public final void b(List<GiftPage> list) {
            a.this.B = t.a(new aj(this, list)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).g();
        }
    };

    /* renamed from: b  reason: collision with root package name */
    protected View f15825b = null;

    /* renamed from: c  reason: collision with root package name */
    protected String f15826c;

    /* renamed from: d  reason: collision with root package name */
    protected final f.a.b.a f15827d = new f.a.b.a();

    /* renamed from: e  reason: collision with root package name */
    protected j f15828e;

    /* renamed from: f  reason: collision with root package name */
    protected ScaleGestureDetector f15829f;

    /* renamed from: g  reason: collision with root package name */
    protected i f15830g;

    /* renamed from: h  reason: collision with root package name */
    protected DataChannel f15831h;

    /* renamed from: i  reason: collision with root package name */
    protected Room f15832i;

    /* renamed from: j  reason: collision with root package name */
    protected View f15833j;

    /* renamed from: k  reason: collision with root package name */
    protected com.bytedance.android.livesdk.g.f f15834k;

    /* renamed from: l  reason: collision with root package name */
    protected com.bytedance.android.live.n.u f15835l;

    /* renamed from: m  reason: collision with root package name */
    protected RecyclableWidgetManager f15836m;
    protected LiveWidget n;
    protected LiveRecyclableWidget o;
    protected EndWidget p;
    protected LiveWidget q;
    protected LiveWidget r;
    protected LiveWidget s;
    boolean t;
    public long u;
    protected EnterRoomConfig v;
    protected View w;
    protected LiveWidget x;
    public dn y;
    public com.bytedance.android.livesdk.chatroom.detail.j z;

    static {
        Covode.recordClassIndex(8731);
    }

    /* access modifiers changed from: protected */
    public void a(View view, Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2);

    /* access modifiers changed from: protected */
    public abstract com.bytedance.android.livesdk.chatroom.b d();

    /* access modifiers changed from: protected */
    public boolean f() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void g() {
    }

    /* access modifiers changed from: protected */
    public abstract boolean h();

    public final void a(DataChannel dataChannel, i iVar, com.bytedance.android.live.n.u uVar) {
        this.f15831h = dataChannel;
        this.f15832i = (Room) dataChannel.b(df.class);
        this.f15830g = iVar;
        boolean z2 = true;
        DataChannel a2 = this.f15831h.a(bc.class, Boolean.valueOf(!h())).a(aa.class, (Object) false).a(di.class, Long.valueOf(this.f15832i.getId())).a(cp.class, Boolean.valueOf(h()));
        if (!h() || !ToolBarButtonWithTextExperiment.hasText()) {
            z2 = false;
        }
        a2.a(ea.class, Boolean.valueOf(z2)).a(bx.class, iVar).b(ee.class, (Object) false);
        Room room = this.f15832i;
        if (!(room == null || room.getRoomAuthStatus() == null)) {
            com.bytedance.android.livesdk.ab.i.b();
            com.bytedance.android.livesdk.ab.i.b("interaction_widget_room_auth", this.f15832i.toString());
        }
        e();
        if (this.f15826c == null) {
            this.f15826c = "";
        }
        this.f15835l = uVar;
        com.bytedance.android.livesdk.ai.a.f13743b = false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean a(MotionEvent motionEvent) {
        ScaleGestureDetector scaleGestureDetector;
        if (this.f15828e.onTouchEvent(motionEvent) || (scaleGestureDetector = this.f15829f) == null) {
            return false;
        }
        scaleGestureDetector.onTouchEvent(motionEvent);
        return false;
    }

    public final boolean a(Runnable runnable) {
        for (com.bytedance.android.livesdk.callback.a aVar : this.A) {
            if (aVar.a(runnable)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.chatroom.b.c.a
    public final void a(com.bytedance.android.livesdkapi.h.a aVar) {
        if (aVar == null) {
            c.INSTANCE.onMessageFinish();
        } else if (aVar instanceof ab) {
            ab abVar = (ab) aVar;
            Room room = this.f15832i;
            if ((room == null || !room.isOfficial()) && abVar.f19118a == 2 && h()) {
                this.u = abVar.f19121h;
                this.f15824a.post(this.aj);
                c.INSTANCE.onMessageFinish();
            }
        } else if (aVar instanceof by) {
            this.f15831h.c(dk.class, aVar);
        } else {
            c.INSTANCE.onMessageFinish();
        }
    }

    /* access modifiers changed from: protected */
    public void a(boolean z2) {
        View findViewById;
        if (z2) {
            a(R.id.eoo, 4);
            a(R.id.eo6, 4);
            a(R.id.dcl, 4);
        } else {
            a(R.id.eoo, 0);
            a(R.id.eo6, 0);
            a(R.id.dcl, 0);
        }
        boolean z3 = !z2;
        LiveWidget liveWidget = this.r;
        if (liveWidget != null) {
            findViewById = liveWidget.getView();
        } else {
            findViewById = getView().findViewById(R.id.sg);
        }
        p.a(findViewById, z3);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void w() {
        b(false);
    }

    private void e() {
        EnterRoomConfig enterRoomConfig = this.v;
        if (enterRoomConfig != null) {
            this.f15826c = enterRoomConfig.f23299c.X;
        }
    }

    /* access modifiers changed from: protected */
    public final View b() {
        LiveWidget liveWidget = this.s;
        if (liveWidget != null) {
            return liveWidget.getView();
        }
        return this.w;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void s() {
        com.bytedance.android.livesdk.n.a.a(this.f15832i, com.bytedance.android.livesdk.ab.e.a(), com.bytedance.android.livesdk.ab.e.d(), b.a.LONG_PRESS);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void t() {
        DataChannel dataChannel = this.f15831h;
        if (dataChannel != null) {
            dataChannel.b(de.class, (Object) false);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void u() {
        DataChannel dataChannel = this.f15831h;
        if (dataChannel != null) {
            dataChannel.b(de.class, (Object) true);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z y() {
        com.bytedance.android.live.core.c.a.a(4, "WidgetLoadState", "continueAfterWidgetLoaded");
        c();
        return z.f158842a;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void A() {
        ((com.bytedance.android.live.q.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.q.a.class)).configProfileHelper(this, this.f15831h, h(), this);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void p() {
        ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).syncGiftList(this.ak, this.f15832i.getId(), 2, false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void q() {
        this.f15831h.c(((com.bytedance.android.live.c.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.c.b.class)).getRoomStickersEvent(), this.f15832i.getStickerList().get(0));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void r() {
        this.f15831h.c(((com.bytedance.android.live.c.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.c.b.class)).getDonationDecorationsEvent(), this.f15832i.getDecorationList());
    }

    public final void i() {
        this.f15831h.c(at.class);
        if (getActivity() != null) {
            Fragment a2 = getActivity().getSupportFragmentManager().a(((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).getWebDialogTag());
            if (a2 instanceof d) {
                ((d) a2).dismissAllowingStateLoss();
            }
        }
        this.f15831h.c(br.class);
    }

    @Override // com.bytedance.android.livesdkapi.depend.a.a
    public final boolean i_() {
        IHostApp iHostApp = (IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class);
        if (iHostApp == null || !iHostApp.isShowStickerView()) {
            com.bytedance.android.livesdk.an.a.a().a(new r(8));
            return true;
        }
        iHostApp.hideStickerView();
        return true;
    }

    /* access modifiers changed from: protected */
    public void k() {
        ShapeControllableView shapeControllableView;
        this.f15836m.detachWidget();
        if (EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() == 1 && (shapeControllableView = this.F) != null && (shapeControllableView.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            ((RelativeLayout.LayoutParams) this.F.getLayoutParams()).addRule(6, 0);
        }
        this.S = null;
        this.x = null;
    }

    public final void n() {
        if (EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() != 1 || InteractStartFetchingMessageStyleSetting.INSTANCE.getValue() == 2) {
            EndWidget endWidget = new EndWidget();
            this.p = endWidget;
            this.f15836m.load(R.id.awq, endWidget);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z o() {
        if (!LiveFastGiftIconHideSetting.INSTANCE.getValue()) {
            l.DUMMY_FAST_GIFT.unload(this.f15831h);
            com.bytedance.android.live.u.g.c(new ab(this));
        }
        l.DUMMY_GIFT.unload(this.f15831h);
        ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).loadBehavior(getContext(), this.f15831h, l.GIFT.ordinal());
        return z.f158842a;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void v() {
        if (isViewValid() && com.bytedance.android.livesdk.userservice.u.a().b().e() && !this.f15832i.getOwner().isFollowing()) {
            b(true);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z x() {
        androidx.fragment.app.i iVar = (androidx.fragment.app.i) this.f15831h.b(ao.class);
        if (iVar != null) {
            ((com.bytedance.android.live.adminsetting.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.adminsetting.b.class)).getAdminSettingDialog().show(iVar, "AbsInteractionFragment");
            l.SHARE.hideRedDot(this.f15831h);
        }
        return z.f158842a;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z z() {
        b.a.a("close_gift_toast_show").d("live_room").e("live_room").b("live").c("show").a(this.f15831h).b();
        return z.f158842a;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void C() {
        Room room;
        if (com.bytedance.android.livesdk.utils.a.a(this.f15831h) && (room = this.f15832i) != null && room.author() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("anchor_id", String.valueOf(this.f15832i.author().getId()));
            hashMap.put("room_id", String.valueOf(this.f15832i.getId()));
            hashMap.put("duration", String.valueOf(this.z.c()));
            com.bytedance.android.livesdk.utils.a.a("live_ad", "live_watch_onemin", null, hashMap);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f15835l = null;
        this.f15824a.removeCallbacksAndMessages(null);
        com.bytedance.android.livesdk.chatroom.g.a.d a2 = d.a.a();
        if (a2 == null) {
            h.f.b.l.b();
        }
        a2.b();
        c.INSTANCE.stop();
        if (this.f15832i != null) {
            ((com.bytedance.android.livesdk.p) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.p.class)).releaseLikeHelper(this.f15832i.getId());
        }
        this.f15831h.b(this);
        com.bytedance.android.livesdk.rank.api.c cVar = this.ai;
        if (cVar != null) {
            cVar.b();
        }
        ac.f12747b.a();
        super.onDestroy();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z B() {
        if (LiveHostCardLongPressEnableSetting.INSTANCE.getValue() && h() && getActivity() != null) {
            DialogInterface dialogInterface = this.Y;
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            Room room = this.f15832i;
            c.a a2 = com.bytedance.android.live.share.e.a(room, this.f15831h, com.bytedance.android.live.share.e.a(room.getOwner()), "live_room_long_press", null);
            a2.H = true;
            a2.I = ((com.bytedance.android.livesdk.watch.d) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.watch.d.class)).shouldDislikeActionShow(com.bytedance.android.livesdk.ab.e.a(), com.bytedance.android.livesdk.ab.e.d());
            a2.N = ((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).getReportScene();
            a2.L = (String) this.f15831h.b(bk.class);
            a2.O = com.bytedance.android.livesdk.utils.a.a(this.f15831h);
            a2.Q = new p(this);
            final com.bytedance.android.livesdkapi.depend.e.c a3 = a2.a();
            this.Y = ((com.bytedance.android.live.f.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.f.a.class)).onLongPress(getActivity(), false, this.f15832i, a3, new IHostLongPressCallback() {
                /* class com.bytedance.android.livesdk.chatroom.ui.a.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(8735);
                }

                /* access modifiers changed from: package-private */
                public final /* synthetic */ void a() {
                    com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.n.f(a.this.f15832i.getId()));
                }

                @Override // com.bytedance.android.livesdk.callback.IHostLongPressCallback
                public final void onDislikePressed() {
                    if (!com.bytedance.android.livesdk.utils.a.a(a.this.f15831h)) {
                        com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.n.f(a.this.f15832i.getId()));
                        com.bytedance.android.livesdk.utils.ao.a(y.e(), (int) R.string.e8h);
                    } else if (a.this.f15832i != null && a.this.getContext() != null && a.this.v != null && a.this.v.f23299c.p != null) {
                        ((com.bytedance.android.livesdkapi.c.a) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdkapi.c.a.class)).a(a.this.getContext(), a.this.v.f23299c.p, a.this.f15832i.getId(), new ai(this));
                    }
                }

                @Override // com.bytedance.android.livesdk.callback.IHostLongPressCallback
                public final void onReportPressed() {
                    if (com.bytedance.android.livesdk.utils.a.a(a.this.f15831h)) {
                        if (a.this.f15832i != null && a.this.getContext() != null && a.this.v != null && a.this.v.f23299c.p != null) {
                            ((com.bytedance.android.livesdkapi.c.a) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdkapi.c.a.class)).a(a.this.getContext(), a.this.v.f23299c.p, a.this.f15832i.getId());
                        }
                    } else if (a.this.f15832i != null && a.this.getContext() != null) {
                        com.bytedance.android.livesdk.userservice.u.a().b().a();
                        com.bytedance.android.livesdkapi.model.d dVar = new com.bytedance.android.livesdkapi.model.d(a.this.f15832i.getId(), a.this.f15832i.getOwner().getId(), a.this.f15832i.getOwner().getId(), a.this.f15832i.getOwner().getSecUid(), "long_press", com.bytedance.android.livesdk.ab.e.a(), com.bytedance.android.livesdk.ab.e.d(), com.bytedance.android.livesdk.ab.e.e(), "report_anchor", a.this.f15832i.getRequestId());
                        dVar.s = ((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).getReportScene();
                        ((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).report(a.this.getContext(), dVar);
                    }
                }
            }, new com.bytedance.android.livesdkapi.depend.e.b() {
                /* class com.bytedance.android.livesdk.chatroom.ui.a.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(8736);
                }

                @Override // com.bytedance.android.livesdkapi.depend.e.b
                public final void a(Throwable th) {
                }

                @Override // com.bytedance.android.livesdkapi.depend.e.b
                public final void a(String str, String str2, Bundle bundle) {
                    com.bytedance.android.livesdk.utils.ao.a(y.e(), (int) R.string.emc);
                    Room room = a.this.f15832i;
                    DataChannel dataChannel = a.this.f15831h;
                    a aVar = a.this;
                    com.bytedance.android.live.share.e.a(room, dataChannel, aVar, str2, aVar.f15832i.getLabels(), bundle);
                    HashMap hashMap = new HashMap();
                    if (((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).isRoomInBattle()) {
                        hashMap.put("connection_type", "manual_pk");
                        hashMap.put("pk_id", String.valueOf(((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).getBattleId()));
                    }
                    com.bytedance.android.live.share.e.a(a.this.f15832i, a.this.f15831h, str, str2, bundle, a3.B, hashMap);
                    com.bytedance.android.live.share.e.a(a.this.f15832i, a.this.f15831h, str);
                }
            });
        }
        return z.f158842a;
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.O.a();
        q qVar = this.R;
        if (qVar != null) {
            qVar.b();
        }
        com.bytedance.android.message.a aVar = this.Q;
        if (aVar != null) {
            aVar.b();
        }
        this.X.a();
        this.X = null;
        IMessageManager iMessageManager = ((IMessageService) com.bytedance.android.live.t.a.a(IMessageService.class)).get();
        if (iMessageManager != null) {
            iMessageManager.stopMessage(false);
        }
        b(false);
        com.bytedance.android.livesdk.chatroom.b.c.INSTANCE.stop();
        this.f15827d.a();
        this.f15836m.unload(this.o);
        LiveWidgetProvider.getInstance().clearWidgetCache(((com.bytedance.android.live.publicscreen.a.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.publicscreen.a.e.class)).getPublicScreenWidgetClass(h()));
        k kVar = this.U;
        if (kVar != null) {
            kVar.a();
        }
        f.a.b.b bVar = this.B;
        if (bVar != null) {
            bVar.dispose();
        }
        this.I.send();
        DataChannelGlobal.f34575d.b(this);
        super.onDestroyView();
        this.H.a();
        this.V = null;
        ((com.bytedance.android.live.f.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.f.a.class)).leave(this.f15831h, this.f15832i);
        ((com.bytedance.android.live.banner.c) com.bytedance.android.live.t.a.a(com.bytedance.android.live.banner.c.class)).leave(this.f15831h, this.f15832i);
        DialogInterface dialogInterface = this.Y;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void c() {
        Room room;
        if (!(this.V == null || getView() == null)) {
            getView().post(this.V);
            this.V = null;
        }
        IMessageManager iMessageManager = ((IMessageService) com.bytedance.android.live.t.a.a(IMessageService.class)).get();
        if (iMessageManager != null) {
            iMessageManager.startMessage();
        }
        this.f15828e = new j(getContext(), new com.bytedance.android.livesdk.chatroom.interaction.c(this, this.f15831h, this.f15833j, new ae(this), new af(this), new ag(this), null, null)) {
            /* class com.bytedance.android.livesdk.chatroom.ui.a.AnonymousClass2 */

            /* renamed from: b  reason: collision with root package name */
            private float f15839b;

            /* renamed from: c  reason: collision with root package name */
            private float f15840c;

            static {
                Covode.recordClassIndex(8733);
            }

            @Override // com.bytedance.android.livesdk.widget.j
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                if (motionEvent != null) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (motionEvent.getAction() == 0) {
                        this.f15840c = x;
                        this.f15839b = y;
                    }
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        if (this.v != null && (room = this.f15832i) != null && !room.isStar() && ((this.f15832i.isThirdParty || this.f15832i.isScreenshot) && this.f15832i.mRoomAuthStatus != null && this.f15832i.mRoomAuthStatus.isEnableLandscape())) {
            this.f15829f = new ScaleGestureDetector(getContext(), new dc(h()));
        }
        this.H.a(new ah(this));
        this.Q = ((IMessageService) com.bytedance.android.live.t.a.a(IMessageService.class)).configInteractionMessageHelper(this, this.f15831h, this.f15835l, this.K, null, new d(this), new e(this), new f(this));
        q qVar = new q(this.f15831h);
        this.R = qVar;
        qVar.a(this);
        com.bytedance.android.livesdk.chatroom.b.c.INSTANCE.start(this);
        com.bytedance.android.live.core.performance.b.c(b.a.ShowBInteractionFirstWidget);
        Room room2 = this.f15832i;
        if (room2 != null && room2.getStatus() == 3) {
            n a2 = com.bytedance.android.livesdk.chatroom.b.b.a(this.f15832i.getId());
            if (iMessageManager != null) {
                iMessageManager.insertMessage(a2, true);
            }
        }
        ((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).configUserHelper(this, this.f15831h, this.f15827d).a();
        k kVar = new k(this.f15831h);
        this.U = kVar;
        kVar.a(this);
    }

    /* access modifiers changed from: protected */
    public void m() {
        Room room = this.f15832i;
        if (room != null) {
            if (!room.isOfficial()) {
                com.bytedance.android.live.j.a aVar = (com.bytedance.android.live.j.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.j.a.class);
                if (aVar == null || !aVar.isMicRoomForRoom(this.f15832i)) {
                    this.ad = this.f15836m.load(((com.bytedance.android.live.j.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.j.a.class)).getMicRoomAudienceEnterWidget());
                } else {
                    this.ac = this.f15836m.load(((com.bytedance.android.live.j.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.j.a.class)).getMicRoomAudienceExitWidget());
                }
            }
            com.bytedance.android.livesdk.ab.i.b();
            com.bytedance.android.livesdk.ab.i.b("ttlive_comment", "CommentWidget is load.");
            this.f15831h.c(com.bytedance.android.live.n.q.class, true);
            LiveWidget giftWidget = ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).getGiftWidget();
            this.n = giftWidget;
            if ((giftWidget instanceof s) && d() != null) {
                d();
                ((s) this.n).a();
                ((s) this.n).a(this.f15836m);
                ((s) this.n).a(d().f14945f);
            }
            LiveWidget liveWidget = this.n;
            if (liveWidget instanceof s) {
                ((s) liveWidget).a(new z(this));
            }
            if (LiveVideoGiftCoverPanelSetting.INSTANCE.getValue()) {
                this.f15836m.load(R.id.ffh, (Widget) this.n, false);
            } else {
                this.f15836m.load(R.id.ffi, (Widget) this.n, false);
            }
            com.bytedance.android.live.banner.c cVar = (com.bytedance.android.live.banner.c) com.bytedance.android.live.t.a.a(com.bytedance.android.live.banner.c.class);
            if (cVar.shouldShowBanner(this.f15832i.getId())) {
                b(cVar);
            }
            cVar.addOnBannerVisibilityChangeListener(this.f15832i.getId(), new aa(this, cVar));
            this.ag = this.f15836m.load(R.id.bce, ((com.bytedance.android.live.f.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.f.a.class)).getLiveRoomNotifyWidget());
            if (h()) {
                this.q = this.f15836m.load(R.id.dpy, ((com.bytedance.android.live.c.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.c.b.class)).getDonationStickerAnchorWidget());
                this.ah = this.f15836m.load(R.id.w0, ((ISlotService) com.bytedance.android.live.t.a.a(ISlotService.class)).getFrameL3SlotWidget());
            }
            this.f15836m.load(R.id.efi, ((com.bytedance.android.livesdk.survey.a) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.survey.a.class)).getSurveyCardWidget());
            this.f15836m.load(((com.bytedance.android.livesdk.survey.a) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.survey.a.class)).getSurveyControlWidget());
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onResume() {
        DataChannel dataChannel;
        Room room;
        super.onResume();
        EnterRoomConfig enterRoomConfig = this.v;
        if (enterRoomConfig != null && !this.J && enterRoomConfig.f23299c.af.f23351a > 0) {
            this.J = true;
            long currentTimeMillis = System.currentTimeMillis() - this.v.f23299c.af.f23351a;
            HashMap hashMap = new HashMap();
            hashMap.put("duration", String.valueOf(currentTimeMillis));
            hashMap.put("room_type", LivePerformanceManager.getInstance().getRoomType(i.valueOf(this.v.f23297a.f23346j)));
            hashMap.put("is_anchor", "0");
            b.a.a("livesdk_interaction_load_duration").a((Map<String, String>) hashMap).a(this.f15831h).b();
        }
        androidx.fragment.app.e activity = getActivity();
        if (Build.VERSION.SDK_INT >= 26 && activity != null && activity.getRequestedOrientation() == 1) {
            com.bytedance.android.livesdk.ai.a.f13742a = am.a(activity);
        }
        com.bytedance.android.livesdk.ai.a.b(getContext());
        com.bytedance.android.livesdk.ai.c a2 = c.b.a();
        com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.cs;
        h.f.b.l.b(bVar, "");
        if (!bVar.a().booleanValue() && a2.f13747a) {
            com.bytedance.android.livesdk.ap.b<Boolean> bVar2 = com.bytedance.android.livesdk.ap.a.cr;
            h.f.b.l.b(bVar2, "");
            if (!bVar2.a().booleanValue() && MtPipWatchLiveEnableSetting.INSTANCE.getValue() && !com.bytedance.android.livesdk.ai.a.f13743b && com.bytedance.android.livesdk.ai.a.b() && (dataChannel = this.f15831h) != null && ((Boolean) dataChannel.b(av.class)).booleanValue() && (room = this.f15832i) != null && room.getOwner() != null && this.f15832i.getOwner().getSecret() != 1) {
                this.f15824a.post(new q(this));
            }
        }
        if (com.bytedance.android.livesdk.ai.a.a()) {
            this.f15824a.post(new r(this));
            if (!com.bytedance.common.utility.collection.b.a((Collection) this.f15832i.getStickerList())) {
                this.f15824a.post(new s(this));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void j() {
        boolean z2;
        boolean z3;
        ((com.bytedance.android.livesdk.p) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.p.class)).configInteractionHelper(this, this.f15831h, this.H);
        this.f15836m.load(R.id.fdb, ((com.bytedance.android.live.r.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.r.a.class)).getGeneralUserInfoWidget());
        boolean booleanValue = ((Boolean) this.f15831h.b(bc.class)).booleanValue();
        boolean equals = Boolean.TRUE.equals(this.f15831h.b(ea.class));
        if (!booleanValue || d() == null) {
            this.ae = this.f15836m.load(R.id.a_i, ((com.bytedance.android.live.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.f.class)).getCommentWidget());
        } else {
            this.ae = this.f15836m.load(d().f14944e, ((com.bytedance.android.live.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.f.class)).getCommentWidget());
        }
        if (getContext() != null) {
            if (com.bytedance.android.live.m.c.b(this.f15831h)) {
                l.QUESTION.load(this.f15831h, ((com.bytedance.android.live.m.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.m.a.class)).getToolbarBehavior(getContext()));
                if (EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() == 1) {
                    l.QUESTION.setEnableClick(this.f15831h, false);
                }
            }
            if (h()) {
                l.SHARE.load(this.f15831h, ((com.bytedance.android.live.share.c) com.bytedance.android.live.t.a.a(com.bytedance.android.live.share.c.class)).getShareBehavior(getActivity(), getContext(), this.f15830g, this));
            }
            Room room = this.f15832i;
            if (room == null || room.getRoomAuthStatus() == null || !this.f15832i.getRoomAuthStatus().isEnableGift()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter() == null || ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().b() <= 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            a.EnumC0371a a2 = com.bytedance.android.livesdk.gift.b.a.a(false, z3, z2);
            if (a2 == a.EnumC0371a.GREY) {
                ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).loadBehavior(getContext(), this.f15831h, l.DUMMY_GIFT.ordinal());
                if (!LiveFastGiftIconHideSetting.INSTANCE.getValue()) {
                    ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).loadBehavior(getContext(), this.f15831h, l.DUMMY_FAST_GIFT.ordinal());
                }
            } else if (a2 == a.EnumC0371a.SHOW) {
                ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).loadBehavior(getContext(), this.f15831h, l.GIFT.ordinal());
                if (!LiveFastGiftIconHideSetting.INSTANCE.getValue()) {
                    ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).loadBehavior(getContext(), this.f15831h, l.FAST_GIFT.ordinal());
                }
            }
            this.f15831h.a((m) this, com.bytedance.android.livesdk.j.m.class, (h.f.a.b) new w(this));
            this.f15831h.a((m) this, com.bytedance.android.live.h.class, (h.f.a.b) new x(this));
        }
        if (equals && getView() != null) {
            View findViewById = getView().findViewById(R.id.ene);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
            marginLayoutParams.bottomMargin = y.a(12.0f);
            findViewById.setLayoutParams(marginLayoutParams);
        }
        this.f15836m.load(R.id.ene, (Class) ((com.bytedance.android.live.p.h) com.bytedance.android.live.t.a.a(com.bytedance.android.live.p.h.class)).audienceToolbarWidget(), false, new Object[]{com.bytedance.android.livesdk.chatroom.interaction.a.a(this.f15831h, getContext())});
        this.F = (ShapeControllableView) getView().findViewById(R.id.dd7);
        if (getView() != null && h()) {
            this.F.setVisibility(0);
            if (this.F.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                this.F.getLayoutParams().height = y.a(272.0f);
            }
            if (equals) {
                this.F.setGradientColors(new int[]{Color.argb(0, 0, 0, 0), Color.argb(128, 0, 0, 0)});
                this.F.setGradientPositions(new float[]{0.0f, 1.0f});
                this.F.setGradientOrientation(1);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void l() {
        boolean z2;
        Boolean bool;
        boolean z3;
        com.bytedance.android.livesdk.like.b likeHelper;
        az azVar;
        RoomAuthStatus roomAuthStatus;
        RoomAuthOffReasons roomAuthOffReasons;
        RoomAuthStatus roomAuthStatus2;
        Room room = (Room) this.f15831h.b(df.class);
        this.f15832i = room;
        if (room != null) {
            ((com.bytedance.android.live.f.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.f.a.class)).enter(this.f15831h, this.f15832i);
            ((com.bytedance.android.live.banner.c) com.bytedance.android.live.t.a.a(com.bytedance.android.live.banner.c.class)).enter(this.f15831h, this.f15832i);
            this.f15836m.load(new UserPermissionCheckWidget());
            l.AUDIENCE_SLOT.load(this.f15831h, new com.bytedance.android.livesdk.chatroom.viewmodule.a.b(getContext(), this));
            Room room2 = this.f15832i;
            DataChannel dataChannel = this.f15831h;
            if (room2 == null || (roomAuthStatus2 = room2.getRoomAuthStatus()) == null || !roomAuthStatus2.isEnableGift()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (dataChannel != null) {
                bool = (Boolean) dataChannel.b(ee.class);
            } else {
                bool = null;
            }
            boolean a2 = p.a(bool);
            com.bytedance.android.live.wallet.d walletCenter = ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter();
            h.f.b.l.b(walletCenter, "");
            if (walletCenter.b() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            a.EnumC0371a a3 = com.bytedance.android.livesdk.gift.b.a.a(false, z3, z2);
            String str = "anchor";
            if (a3 == a.EnumC0371a.GREY) {
                IGiftService iGiftService = (IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class);
                if (room2 == null || (roomAuthStatus = room2.getRoomAuthStatus()) == null || (roomAuthOffReasons = roomAuthStatus.getRoomAuthOffReasons()) == null || (azVar = roomAuthOffReasons.getUnAvailableClickReason()) == null) {
                    azVar = az.UNKNOWN;
                }
                if (!a2) {
                    str = "user";
                }
                iGiftService.monitorGiftIconShow(false, azVar, str, "icon");
            } else if (a3 == a.EnumC0371a.SHOW) {
                IGiftService iGiftService2 = (IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class);
                az azVar2 = az.UNKNOWN;
                if (!a2) {
                    str = "user";
                }
                iGiftService2.monitorGiftIconShow(true, azVar2, str, "icon");
            }
            this.f15831h.a(di.class, Long.valueOf(this.f15832i.getId()));
            ac.f12747b.a();
            ac.f12746a = this.f15832i.getId();
            Room room3 = this.f15832i;
            if (room3 != null && room3.getMosaicStatus() == 1) {
                com.bytedance.android.livesdk.utils.ao.a(y.e(), (int) R.string.gsl);
            }
            if (com.bytedance.android.live.m.c.b(this.f15831h) && EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() == 1) {
                l.QUESTION.setEnableClick(this.f15831h, true);
            }
            if (this.f15832i.getRoomAuthStatus() == null || this.f15832i.getRoomAuthStatus().isMessageEnable()) {
                this.f15831h.a(aa.class, (Object) true);
            }
            if (Boolean.TRUE.equals(this.f15831h.b(ea.class)) && getView() != null) {
                View findViewById = getView().findViewById(R.id.vp);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
                marginLayoutParams.bottomMargin = y.a(12.0f);
                marginLayoutParams.leftMargin = y.a(8.0f);
                marginLayoutParams.rightMargin = y.a(-4.0f);
                findViewById.setLayoutParams(marginLayoutParams);
            }
            this.Z = this.f15836m.load(R.id.vp, ((ISlotService) com.bytedance.android.live.t.a.a(ISlotService.class)).getBottomLeftSlotWidget());
            boolean booleanValue = ((Boolean) this.f15831h.b(bc.class)).booleanValue();
            if (!TestDisableCommentAreaSetting.INSTANCE.getValue()) {
                Class<? extends LiveRecyclableWidget> publicScreenWidgetClass = ((com.bytedance.android.live.publicscreen.a.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.publicscreen.a.e.class)).getPublicScreenWidgetClass(h());
                if (!booleanValue || d() == null) {
                    this.o = this.f15836m.load(R.id.clu, publicScreenWidgetClass);
                } else {
                    this.o = this.f15836m.load(d().f14943d, publicScreenWidgetClass);
                }
            }
            if (this.f15832i != null && (likeHelper = ((com.bytedance.android.livesdk.p) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.p.class)).getLikeHelper(this.f15832i.getId())) != null && likeHelper.n()) {
                if (likeHelper.l()) {
                    this.aa = this.f15836m.load(R.id.dy7, ((com.bytedance.android.livesdk.p) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.p.class)).getSelfLikeWidgetClass(likeHelper));
                    this.ab = this.f15836m.load(R.id.c_x, ((com.bytedance.android.livesdk.p) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.p.class)).getLikeUserInfoAnimWidgetClass(likeHelper));
                }
                if (likeHelper.m()) {
                    this.s = this.f15836m.load(R.id.d0p, ((com.bytedance.android.livesdk.p) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.p.class)).getOthersLikeWidgetClass(likeHelper));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z a(Boolean bool) {
        RecyclableWidgetManager recyclableWidgetManager = this.f15836m;
        if (recyclableWidgetManager != null) {
            recyclableWidgetManager.onVisibility(bool.booleanValue());
        }
        return z.f158842a;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z b(Boolean bool) {
        a(bool.booleanValue());
        return z.f158842a;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z a(float f2) {
        this.f15833j.setTranslationY(f2);
        if (b() != null) {
            b().setTranslationY(f2);
        }
        return z.f158842a;
    }

    public final void b(Runnable runnable) {
        if (this.f15834k != null) {
            this.V = null;
            runnable.run();
            return;
        }
        this.V = runnable;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (isViewValid()) {
            if (message.obj instanceof com.bytedance.android.live.a.a.b.a) {
                this.f15831h.c(cy.class, message.obj);
            } else if (message.obj instanceof Exception) {
                com.bytedance.android.live.core.c.a.a(3, "AbsInteractionFragment", "unknown exception " + ((Exception) message.obj).toString());
            }
        }
    }

    private void b(com.bytedance.android.live.banner.c cVar) {
        if (this.x == null) {
            this.x = this.f15836m.load(R.id.cm3, cVar.getActivityTopRightBannerWidget());
        }
        if (h() && this.S == null) {
            this.S = this.f15836m.load(R.id.vz, cVar.getBottomRightBannerWidget(), com.bytedance.android.live.u.g.a());
        }
        if (h() && this.T == null) {
            this.T = this.f15836m.load(R.id.ep3, ((com.bytedance.android.live.banner.c) com.bytedance.android.live.t.a.a(com.bytedance.android.live.banner.c.class)).getTopRightBannerWidget(), com.bytedance.android.live.u.g.a());
        }
        cVar.fetchBanner(this, this.f15832i.getId(), false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z a(an anVar) {
        if (isViewValid() && getView() != null) {
            if (h()) {
                g();
            }
            if (anVar.a() && getActivity() != null && getActivity().getRequestedOrientation() == 1) {
                if (this.P == null) {
                    this.P = new e(getView().findViewById(R.id.dk0));
                }
                this.P.a();
            }
        }
        return z.f158842a;
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(null);
        if (h()) {
            str = "portrait";
        } else {
            str = "landscape";
        }
        com.bytedance.android.livesdk.ab.d.b(str);
        com.bytedance.android.live.liveinteract.api.a.c.a().a((Integer) 0);
        if (this.f15830g == null) {
            this.f15830g = i.VIDEO;
        }
        e();
        DataChannel dataChannel = this.f15831h;
        if (dataChannel != null) {
            dataChannel.b(com.bytedance.android.livesdkapi.e.b.class, this.f15826c);
        }
        com.bytedance.android.livesdk.utils.a.a.a(getContext());
        if (getActivity() != null && !getActivity().isFinishing()) {
            com.bytedance.android.livesdk.rank.api.c rankOptOutPresenter = ((com.bytedance.android.livesdk.rank.api.d) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.rank.api.d.class)).getRankOptOutPresenter();
            this.ai = rankOptOutPresenter;
            if (rankOptOutPresenter != null) {
                rankOptOutPresenter.a((androidx.fragment.app.i) this.f15831h.b(ao.class));
                this.ai.a();
            }
        }
    }

    private void b(boolean z2) {
        if (!z2) {
            dn dnVar = this.y;
            if (dnVar != null && dnVar.isShowing()) {
                this.y.dismiss();
                com.bytedance.android.livesdk.chatroom.g.a.d a2 = d.a.a();
                if (a2 == null) {
                    h.f.b.l.b();
                }
                a2.a();
            }
            this.y = null;
        } else if (isViewValid()) {
            dn dnVar2 = this.y;
            if ((dnVar2 == null || !dnVar2.isShowing()) && !getActivity().isFinishing() && !((Boolean) this.f15831h.b(cn.class)).booleanValue()) {
                if (this.y == null) {
                    dn dnVar3 = new dn(getActivity(), h(), this.f15832i, this.f15826c);
                    this.y = dnVar3;
                    dnVar3.setOnShowListener(new m(this));
                    this.y.setOnDismissListener(new o(this));
                }
                this.y.f16136e = this.f15831h;
                com.bytedance.android.livesdk.chatroom.g.a.d a3 = d.a.a();
                if (a3 == null) {
                    h.f.b.l.b();
                }
                a3.a(new com.bytedance.android.livesdk.chatroom.g.a.a() {
                    /* class com.bytedance.android.livesdk.chatroom.ui.a.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(8734);
                    }

                    @Override // com.bytedance.android.livesdk.chatroom.g.a.b
                    public final void a() {
                        if (a.this.y != null) {
                            a.this.y.show();
                            if (a.this.u > 0) {
                                a.this.f15824a.removeCallbacks(a.this.G);
                                a.this.f15824a.postDelayed(a.this.G, a.this.u);
                                a.this.u = 0;
                            }
                            b.a.a("follow_popup_show").a(a.this.f15831h).b();
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z a(com.bytedance.android.livesdk.event.b bVar) {
        float f2;
        User user = (User) this.f15831h.b(dn.class);
        View view = l.QUESTION.getView(this.f15831h);
        if (view != null && isViewValid()) {
            if ((user == null || user.getUserAttr() == null || !user.getUserAttr().f19030b) && bVar.f17179a && this.f15832i.questionVersion == 2) {
                f2 = 0.5f;
            } else {
                f2 = 1.0f;
            }
            view.setAlpha(f2);
        }
        return z.f158842a;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z a(bv bvVar) {
        if (this.W == null) {
            this.W = new CopyrightViolationHelper(this);
        }
        this.W.a(getContext(), bvVar, this.f15832i, this.f15827d);
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View view = getView();
        if (view != null) {
            this.f15825b = view;
            this.f15831h.a((Object) this, ei.class, (h.f.a.b) new g(this)).b((m) this, ad.class, (h.f.a.b) new h(this)).a((m) this, com.bytedance.android.livesdk.j.av.class, (h.f.a.b) new i(this));
            DataChannelGlobal.f34575d.a(this, ch.class, new j(this));
            this.f15834k = com.bytedance.android.livesdk.g.f.a(this, view, bundle);
            this.f15831h.c(com.bytedance.android.live.gift.d.class, false);
            com.bytedance.android.livesdk.ab.i.b();
            com.bytedance.android.livesdk.ab.i.b("ttlive_room", "prepare load widget, first anyway");
            this.f15831h.a(bs.class, com.bytedance.android.livesdk.ab.e.c());
            RecyclableWidgetManager of = RecyclableWidgetManager.of((Fragment) this, this.f15825b, false, (IWidgetProvider) LiveWidgetProvider.getInstance(), (FluencyOpt) com.bytedance.android.live.u.h.f12831c, com.bytedance.android.live.u.h.e());
            this.f15836m = of;
            of.mWidgetCreateTimeListener = this.I;
            this.f15831h.b(com.bytedance.android.livesdk.j.j.class, Long.valueOf(System.currentTimeMillis()));
            if (EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() != 1 || ((TextUtils.isEmpty(this.v.f23299c.f23322a) && (this.f15832i == null || this.v.f23299c.M != "draw")) || !h() || this.af)) {
                com.bytedance.android.livesdk.widget.b.a aVar = this.C;
                aVar.d();
                aVar.c();
                aVar.b();
                aVar.e();
                a(this.f15825b, bundle);
            } else {
                com.bytedance.android.live.core.c.a.a(4, "WidgetLoadState", "widget state loadWidgetP0Runnable call");
                this.D.f22576a.a(c.a.e.f22582a);
                this.E = true;
            }
            if (com.bytedance.android.livesdk.utils.a.a(this.f15831h)) {
                ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) t.b(this).e(60000, TimeUnit.MILLISECONDS).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(com.bytedance.android.livesdk.util.rxutils.autodispose.e.a((Fragment) this))).a(k.f16210a, com.bytedance.android.livesdk.util.rxutils.i.f22196a);
            }
            this.f15831h.b((m) this, bw.class, (h.f.a.b) new l(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(com.bytedance.android.live.banner.c cVar) {
        if (cVar.shouldShowBanner(this.f15832i.getId())) {
            b(cVar);
            return;
        }
        this.f15836m.unload(this.x);
        this.f15836m.unload(this.S);
        this.f15836m.unload(this.T);
        this.x = null;
        this.S = null;
        this.T = null;
    }

    @Override // com.bytedance.android.livesdk.chatroom.view.a
    public final void a(n nVar) {
        if (isViewValid()) {
            int i2 = nVar.f19656a;
            if (3 == i2) {
                com.bytedance.android.livesdk.an.a.a().a(new r(10010, (byte) 0));
            } else if (4 == i2) {
                r rVar = new r(7);
                rVar.f15145d = nVar;
                com.bytedance.android.livesdk.an.a.a().a(rVar);
                if (!com.bytedance.common.utility.m.a(nVar.f19657f)) {
                    com.bytedance.android.livesdk.utils.ao.a(y.e(), nVar.f19657f, 0);
                }
                JSONObject jSONObject = new JSONObject();
                com.bytedance.android.live.core.d.a.a(jSONObject, "error_code", 0L);
                com.bytedance.android.live.core.d.a.a(jSONObject, "error_msg", nVar.f19657f);
                com.bytedance.android.live.core.d.c.a("ttlive_anchor_close_room", 0, jSONObject);
            } else if (1 == i2) {
                if (!this.f15832i.isThirdParty) {
                    this.t = true;
                    com.bytedance.android.live.n.u uVar = this.f15835l;
                    if (uVar != null) {
                        uVar.a(3);
                    }
                    if (this.K.getVisibility() == 8) {
                        if (!LivePauseLiveSetting.INSTANCE.pauseLiveEnabled()) {
                            if (!((Boolean) this.f15831h.b(com.bytedance.android.live.liveinteract.api.p.class)).booleanValue()) {
                                com.bytedance.android.livesdk.an.a.a().a(new r(30));
                            }
                            com.bytedance.android.livesdk.utils.ao.a(y.e(), (int) R.string.gsl);
                        } else if (!((Boolean) this.f15831h.b(com.bytedance.android.live.liveinteract.api.p.class)).booleanValue()) {
                            com.bytedance.android.livesdk.an.a.a().a(new r(30));
                        } else {
                            com.bytedance.android.livesdk.utils.ao.a(y.e(), (int) R.string.gsk);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        com.bytedance.android.live.core.d.a.a(jSONObject2, "error_code", 0L);
                        com.bytedance.android.live.core.d.a.a(jSONObject2, "error_msg", "action_pause");
                        com.bytedance.android.live.core.d.c.a("ttlive_control_message_status", 0, jSONObject2);
                    }
                }
            } else if (2 == i2) {
                this.t = false;
                com.bytedance.android.live.n.u uVar2 = this.f15835l;
                if (uVar2 != null) {
                    uVar2.a(2);
                }
                if (this.f15832i.getMosaicStatus() == 0) {
                    com.bytedance.android.livesdk.an.a.a().a(new r(31));
                    JSONObject jSONObject3 = new JSONObject();
                    com.bytedance.android.live.core.d.a.a(jSONObject3, "error_code", 0L);
                    com.bytedance.android.live.core.d.a.a(jSONObject3, "error_msg", "action_resume");
                    com.bytedance.android.live.core.d.c.a("ttlive_control_message_status", 0, jSONObject3);
                    if (!LivePauseLiveSetting.INSTANCE.pauseLiveEnabled()) {
                        com.bytedance.android.livesdk.utils.ao.a(getActivity(), (int) R.string.gub);
                    }
                    com.bytedance.android.livesdk.an.a.a().a(new r(31));
                }
            }
        }
    }

    public final void a(EnterRoomConfig enterRoomConfig, boolean z2) {
        this.v = enterRoomConfig;
        this.af = z2;
    }

    private void a(int i2, int i3) {
        if (getView().findViewById(i2) != null) {
            getView().findViewById(i2).setVisibility(i3);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.setFitsSystemWindows(true);
        this.H = (GestureDetectLayout) view.findViewById(R.id.d1y);
        this.f15833j = view.findViewById(R.id.bqn);
        this.w = view.findViewById(R.id.d0p);
        this.K = (TextView) view.findViewById(R.id.cdd);
        com.bytedance.android.live.u.g.a(new n(this));
        this.L = new f(this, this.f15831h);
        ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).configPackagePurchaseHelper(this, this.f15831h, this);
        this.M = new g(this, this.f15831h);
        ((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).configWebDialogHelper(this, this.f15831h, h(), this);
        this.N = new com.bytedance.android.livesdk.chatroom.interaction.b(this, this.f15831h, view.findViewById(R.id.bqp), d(), new y(this));
        this.O = new h(this, this.f15831h);
        this.f15831h.a((m) this, com.bytedance.android.live.gift.l.class, (h.f.a.b) new ac(this)).a((m) this, dx.class, (h.f.a.b) new ad(this));
        if (this.X == null) {
            this.X = ((com.bytedance.android.live.share.c) com.bytedance.android.live.t.a.a(com.bytedance.android.live.share.c.class)).provideShareCountManager();
            int i2 = 0;
            Room room = this.f15832i;
            if (!(room == null || room.getStats() == null)) {
                i2 = this.f15832i.getStats().getShareCount();
            }
            this.X.a(this.f15831h, ((IMessageService) com.bytedance.android.live.t.a.a(IMessageService.class)).get(), i2);
        }
    }
}
