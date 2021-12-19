package com.bytedance.android.livesdk.chatroom.ui;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.banner.c;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.widget.PauseLiveWidget;
import com.bytedance.android.live.copyrightreview.helper.CopyrightViolationHelper;
import com.bytedance.android.live.core.performance.b;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.design.widget.shapecontrol.ShapeControllableView;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.n.ad;
import com.bytedance.android.live.share.ShareApi;
import com.bytedance.android.live.share.e;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.b.c;
import com.bytedance.android.livesdk.chatroom.c.an;
import com.bytedance.android.livesdk.chatroom.g.a.d;
import com.bytedance.android.livesdk.chatroom.viewmodule.EndWidget;
import com.bytedance.android.livesdk.chatroom.widget.LiveCenterEntranceWidget;
import com.bytedance.android.livesdk.chatroom.widget.NetSpeedMonitorWidget;
import com.bytedance.android.livesdk.gift.b.a;
import com.bytedance.android.livesdk.j.aa;
import com.bytedance.android.livesdk.j.at;
import com.bytedance.android.livesdk.j.au;
import com.bytedance.android.livesdk.j.av;
import com.bytedance.android.livesdk.j.ax;
import com.bytedance.android.livesdk.j.ba;
import com.bytedance.android.livesdk.j.bc;
import com.bytedance.android.livesdk.j.be;
import com.bytedance.android.livesdk.j.bl;
import com.bytedance.android.livesdk.j.bp;
import com.bytedance.android.livesdk.j.bq;
import com.bytedance.android.livesdk.j.bs;
import com.bytedance.android.livesdk.j.bx;
import com.bytedance.android.livesdk.j.cb;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.dc;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.di;
import com.bytedance.android.livesdk.j.dk;
import com.bytedance.android.livesdk.j.dx;
import com.bytedance.android.livesdk.j.dz;
import com.bytedance.android.livesdk.j.ea;
import com.bytedance.android.livesdk.j.ed;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.j.ei;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastLiveCenterSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.FrisbeeTaskIconShowSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHashTagAnchorShowEntrance;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePauseLiveSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveVideoGiftCoverPanelSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveWishlistPermissionSetting;
import com.bytedance.android.livesdk.livesetting.other.ToolBarButtonWithTextExperiment;
import com.bytedance.android.livesdk.livesetting.roomfunction.EnableAnchorLiveLongPressShareSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.PostponeRequestBatchShareListSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisableCommentAreaSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.RoomStats;
import com.bytedance.android.livesdk.model.message.bv;
import com.bytedance.android.livesdk.model.message.by;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.widget.GestureDetectLayout;
import com.bytedance.android.livesdkapi.depend.e.c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.android.message.IMessageService;
import com.bytedance.android.widget.Widget;
import com.bytedance.android.widget.WidgetContainer;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.FluencyOpt;
import com.bytedance.ies.sdk.widgets.IWidgetProvider;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetProvider;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public abstract class al extends com.bytedance.android.livesdk.ui.a implements com.bytedance.android.live.n.i, com.bytedance.android.live.n.x, c.a, com.bytedance.android.livesdk.chatroom.view.a, com.bytedance.android.livesdkapi.depend.a.a, com.bytedance.ies.a.a {

    /* renamed from: m  reason: collision with root package name */
    public static final a f15863m = new a((byte) 0);
    private com.bytedance.android.live.n.u A;
    private com.bytedance.android.livesdk.g.f B;
    private Runnable C;
    private com.bytedance.android.livesdk.chatroom.e.q D;
    private com.bytedance.android.livesdk.chatroom.e.k E;
    private com.bytedance.android.message.a F;
    private com.bytedance.android.livesdk.ac.a G;
    private final h.h H = h.i.a((h.f.a.a) j.f15878a);
    private com.bytedance.android.live.share.b I;
    private HashMap J;

    /* renamed from: a  reason: collision with root package name */
    public NetSpeedMonitorWidget f15864a;

    /* renamed from: b  reason: collision with root package name */
    public LiveCenterEntranceWidget f15865b;

    /* renamed from: c  reason: collision with root package name */
    public LiveWidget f15866c;

    /* renamed from: d  reason: collision with root package name */
    public LiveWidget f15867d;

    /* renamed from: e  reason: collision with root package name */
    public LiveWidget f15868e;

    /* renamed from: f  reason: collision with root package name */
    public final WidgetCreateTimeUtil f15869f = new WidgetCreateTimeUtil(null, 1, null);

    /* renamed from: g  reason: collision with root package name */
    public final com.bytedance.android.live.broadcast.g.a f15870g = new com.bytedance.android.live.broadcast.g.a();

    /* renamed from: h  reason: collision with root package name */
    final h.h f15871h = com.bytedance.android.livesdkapi.m.d.a(new h(this));

    /* renamed from: i  reason: collision with root package name */
    final h.h f15872i = com.bytedance.android.livesdkapi.m.d.a(new i(this));

    /* renamed from: j  reason: collision with root package name */
    protected Room f15873j;

    /* renamed from: k  reason: collision with root package name */
    protected DataChannel f15874k;

    /* renamed from: l  reason: collision with root package name */
    public DialogInterface f15875l;
    private final h.h n = com.bytedance.android.livesdkapi.m.d.a(new k(this));
    private LiveWidget o;
    private LiveRecyclableWidget p;
    private LiveWidget q;
    private LiveWidget r;
    private LiveWidget s;
    private com.bytedance.android.live.s.d t;
    private com.bytedance.android.livesdk.chatroom.interaction.b u;
    private com.bytedance.android.livesdk.chatroom.interaction.h v;
    private com.bytedance.android.livesdk.chatroom.interaction.f w;
    private com.bytedance.android.livesdk.chatroom.interaction.g x;
    private final f.a.b.a y = new f.a.b.a();
    private final h.h z = com.bytedance.android.livesdkapi.m.d.a(new f(this));

    /* access modifiers changed from: package-private */
    public final /* synthetic */ class y implements com.bytedance.android.livesdk.gift.model.r {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.a f15889a;

        static {
            Covode.recordClassIndex(8785);
        }

        y(h.f.a.a aVar) {
            this.f15889a = aVar;
        }

        @Override // com.bytedance.android.livesdk.gift.model.r
        public final /* synthetic */ void a() {
            h.f.b.l.b(this.f15889a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(8753);
    }

    private final com.bytedance.android.livesdk.rank.api.c c() {
        return (com.bytedance.android.livesdk.rank.api.c) this.H.getValue();
    }

    /* access modifiers changed from: protected */
    public boolean a(MotionEvent motionEvent) {
        return false;
    }

    public View b(int i2) {
        if (this.J == null) {
            this.J = new HashMap();
        }
        View view = (View) this.J.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.J.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.live.n.x
    public final void e() {
    }

    /* access modifiers changed from: protected */
    public final RecyclableWidgetManager f() {
        return (RecyclableWidgetManager) this.n.getValue();
    }

    /* access modifiers changed from: protected */
    public abstract com.bytedance.android.livesdkapi.depend.model.live.i h();

    public abstract Object[] k();

    /* access modifiers changed from: protected */
    public boolean n() {
        return false;
    }

    public void o() {
        HashMap hashMap = this.J;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(8754);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class e extends h.f.b.j implements h.f.a.a<z> {
        static {
            Covode.recordClassIndex(8758);
        }

        e(al alVar) {
            super(0, alVar, al.class, "loadFollowGuideWidget", "loadFollowGuideWidget()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.live.n.i
    public final /* bridge */ /* synthetic */ Fragment b() {
        return this;
    }

    public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2) {
        boolean z2 = false;
        if (!BroadcastLiveCenterSetting.INSTANCE.enable() && !com.bytedance.android.livesdkapi.depend.model.live.j.c(h()) && motionEvent != null && motionEvent2 != null) {
            float x2 = motionEvent2.getX() - motionEvent.getX();
            if (Math.abs(x2) > 200.0f && Math.abs(f2) > 100.0f) {
                z2 = true;
                com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.live.broadcast.api.model.b(x2 > 0.0f ? 1 : 2));
            }
        }
        return z2;
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f15877a = new d();

        static {
            Covode.recordClassIndex(8757);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return false;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<CopyrightViolationHelper> {
        final /* synthetic */ al this$0;

        static {
            Covode.recordClassIndex(8759);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(al alVar) {
            super(0);
            this.this$0 = alVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ CopyrightViolationHelper invoke() {
            return new CopyrightViolationHelper(this.this$0);
        }
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class x extends h.f.b.j implements h.f.a.a<z> {
        static {
            Covode.recordClassIndex(8784);
        }

        x(al alVar) {
            super(0, alVar, al.class, "changeTextMessageViewHeight", "changeTextMessageViewHeight()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ((al) this.receiver).m();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    public final Room g() {
        Room room = this.f15873j;
        if (room == null) {
            h.f.b.l.a("mRoom");
        }
        return room;
    }

    /* access modifiers changed from: protected */
    public final DataChannel i() {
        DataChannel dataChannel = this.f15874k;
        if (dataChannel == null) {
            h.f.b.l.a("mDataChannel");
        }
        return dataChannel;
    }

    static final class i extends h.f.b.m implements h.f.a.a<com.bytedance.android.livesdk.chatroom.interaction.e> {
        final /* synthetic */ al this$0;

        static {
            Covode.recordClassIndex(8766);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(al alVar) {
            super(0);
            this.this$0 = alVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.android.livesdk.chatroom.interaction.e invoke() {
            FrameLayout frameLayout = (FrameLayout) this.this$0.b(R.id.dk0);
            h.f.b.l.b(frameLayout, "");
            return new com.bytedance.android.livesdk.chatroom.interaction.e(frameLayout);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<com.bytedance.android.livesdk.rank.api.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f15878a = new j();

        static {
            Covode.recordClassIndex(8767);
        }

        j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.android.livesdk.rank.api.c invoke() {
            com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.rank.api.d.class);
            h.f.b.l.b(a2, "");
            return ((com.bytedance.android.livesdk.rank.api.d) a2).getRankOptOutPresenter();
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<RecyclableWidgetManager> {
        final /* synthetic */ al this$0;

        static {
            Covode.recordClassIndex(8768);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(al alVar) {
            super(0);
            this.this$0 = alVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RecyclableWidgetManager invoke() {
            al alVar = this.this$0;
            RecyclableWidgetManager of = RecyclableWidgetManager.of((Fragment) alVar, alVar.getView(), true, (IWidgetProvider) LiveWidgetProvider.Companion.getInstance(), (FluencyOpt) com.bytedance.android.live.u.h.f12831c, com.bytedance.android.live.u.h.e());
            of.mWidgetCreateTimeListener = this.this$0.f15869f;
            return of;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class t implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ al f15886a;

        static {
            Covode.recordClassIndex(8780);
        }

        t(al alVar) {
            this.f15886a = alVar;
        }

        public final void run() {
            this.f15886a.f15870g.a(this.f15886a.g().getId(), this.f15886a, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class r implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ al f15883a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f15884b;

        static {
            Covode.recordClassIndex(8777);
        }

        r(al alVar, View view) {
            this.f15883a = alVar;
            this.f15884b = view;
        }

        public final void run() {
            this.f15883a.i().a(ax.class, Integer.valueOf(this.f15884b.getHeight()));
            View view = this.f15884b;
            Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.android.livesdk.widget.GestureDetectLayout");
            ((GestureDetectLayout) view).setOnSizeChangedListener(new GestureDetectLayout.a(this) {
                /* class com.bytedance.android.livesdk.chatroom.ui.al.r.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ r f15885a;

                static {
                    Covode.recordClassIndex(8778);
                }

                {
                    this.f15885a = r1;
                }

                @Override // com.bytedance.android.livesdk.widget.GestureDetectLayout.a
                public final void a(int i2, int i3) {
                    if (i2 != i3) {
                        this.f15885a.f15883a.i().a(ax.class, Integer.valueOf(i2));
                        this.f15885a.f15883a.i().c(cb.class, Integer.valueOf(i2));
                    }
                }
            });
        }
    }

    @Override // com.bytedance.android.live.n.i
    public final void a() {
        com.bytedance.android.live.broadcast.api.e.c cVar;
        g gVar = new g(this);
        DataChannel dataChannel = this.f15874k;
        if (dataChannel == null) {
            h.f.b.l.a("mDataChannel");
        }
        dataChannel.c(at.class);
        com.bytedance.android.livesdk.ac.a aVar = this.G;
        if (!(aVar == null || (cVar = aVar.f13607a) == null)) {
            cVar.e_();
        }
        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class);
        h.f.b.l.b(a2, "");
        gVar.a(((com.bytedance.android.live.b.f) a2).getWebDialogTag());
    }

    @Override // com.bytedance.android.livesdkapi.depend.a.a
    public final boolean i_() {
        IHostApp iHostApp = (IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class);
        if (iHostApp == null || !iHostApp.isShowStickerView()) {
            com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.chatroom.c.r(8));
            return true;
        }
        iHostApp.hideStickerView();
        return true;
    }

    static final class h extends h.f.b.m implements h.f.a.a<com.bytedance.android.livesdk.widget.j> {
        final /* synthetic */ al this$0;

        static {
            Covode.recordClassIndex(8761);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(al alVar) {
            super(0);
            this.this$0 = alVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.android.livesdk.widget.j invoke() {
            Context context = this.this$0.getContext();
            al alVar = this.this$0;
            DataChannel i2 = alVar.i();
            RelativeLayout relativeLayout = (RelativeLayout) this.this$0.b(R.id.bqn);
            h.f.b.l.b(relativeLayout, "");
            return new com.bytedance.android.livesdk.widget.j(context, new com.bytedance.android.livesdk.chatroom.interaction.c(alVar, i2, relativeLayout, new h.f.a.a<z>(this.this$0) {
                /* class com.bytedance.android.livesdk.chatroom.ui.al.h.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(8762);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    ((al) this.receiver).j();
                    return z.f158842a;
                }
            }, null, new h.f.a.r<MotionEvent, MotionEvent, Float, Float, Boolean>(this.this$0) {
                /* class com.bytedance.android.livesdk.chatroom.ui.al.h.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(8763);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // h.f.a.r
                public final /* synthetic */ Boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, Float f2, Float f3) {
                    float floatValue = f2.floatValue();
                    f3.floatValue();
                    return Boolean.valueOf(((al) this.receiver).a(motionEvent, motionEvent2, floatValue));
                }
            }, new h.f.a.r<MotionEvent, MotionEvent, Float, Float, Boolean>(this.this$0) {
                /* class com.bytedance.android.livesdk.chatroom.ui.al.h.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(8764);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // h.f.a.r
                public final /* synthetic */ Boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, Float f2, Float f3) {
                    f2.floatValue();
                    f3.floatValue();
                    return false;
                }
            }, new h.f.a.b<MotionEvent, Boolean>(this.this$0) {
                /* class com.bytedance.android.livesdk.chatroom.ui.al.h.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(8765);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ Boolean invoke(MotionEvent motionEvent) {
                    return Boolean.valueOf(((al) this.receiver).n());
                }
            }));
        }
    }

    public static final class w implements c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.live.banner.c f15887a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ al f15888b;

        static {
            Covode.recordClassIndex(8783);
        }

        @Override // com.bytedance.android.live.banner.c.a
        public final void a() {
            if (this.f15887a.shouldShowBanner(this.f15888b.g().getId())) {
                al alVar = this.f15888b;
                com.bytedance.android.live.banner.c cVar = this.f15887a;
                h.f.b.l.b(cVar, "");
                alVar.a(cVar);
                return;
            }
            this.f15888b.f().unload(this.f15888b.f15866c).unload(this.f15888b.f15868e).unload(this.f15888b.f15867d);
            this.f15888b.f15866c = null;
            this.f15888b.f15868e = null;
            this.f15888b.f15867d = null;
        }

        w(com.bytedance.android.live.banner.c cVar, al alVar) {
            this.f15887a = cVar;
            this.f15888b = alVar;
        }
    }

    public final void j() {
        DialogInterface dialogInterface = this.f15875l;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        q qVar = new q(this);
        com.bytedance.android.live.broadcast.g.a aVar = this.f15870g;
        boolean z2 = true;
        if (!(!aVar.f7869a.isEmpty()) && !(!aVar.f7870b.isEmpty())) {
            z2 = false;
        }
        if (z2) {
            qVar.a();
            com.bytedance.android.live.broadcast.g.a aVar2 = this.f15870g;
            Room room = this.f15873j;
            if (room == null) {
                h.f.b.l.a("mRoom");
            }
            aVar2.a(room.getId(), this, null);
            return;
        }
        com.bytedance.android.live.broadcast.g.a aVar3 = this.f15870g;
        Room room2 = this.f15873j;
        if (room2 == null) {
            h.f.b.l.a("mRoom");
        }
        aVar3.a(room2.getId(), this, qVar);
    }

    /* access modifiers changed from: package-private */
    public static final class q implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ al f15880a;

        static {
            Covode.recordClassIndex(8775);
        }

        q(al alVar) {
            this.f15880a = alVar;
        }

        @Override // f.a.d.a
        public final void a() {
            Context context = this.f15880a.getContext();
            if (context != null) {
                c.a a2 = com.bytedance.android.live.share.e.a(this.f15880a.g(), this.f15880a.i(), com.bytedance.android.live.share.e.a(this.f15880a.g().getOwner()), "live_room_long_press", null);
                a2.H = false;
                a2.I = false;
                if (EnableAnchorLiveLongPressShareSetting.INSTANCE.getValue() == 2) {
                    com.facebook.common.d.e copyOf = com.facebook.common.d.e.copyOf(this.f15880a.f15870g.f7869a);
                    h.f.b.l.b(copyOf, "");
                    if (copyOf != null && !copyOf.isEmpty()) {
                        a2.J.addAll(copyOf);
                    }
                    com.facebook.common.d.e copyOf2 = com.facebook.common.d.e.copyOf(this.f15880a.f15870g.f7870b);
                    h.f.b.l.b(copyOf2, "");
                    if (copyOf2 != null && !copyOf2.isEmpty()) {
                        a2.K.addAll(copyOf2);
                    }
                }
                a2.N = ((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).getReportScene();
                com.bytedance.android.livesdkapi.depend.e.c a3 = a2.a();
                al alVar = this.f15880a;
                h.f.b.l.b(context, "");
                Room g2 = this.f15880a.g();
                h.f.b.l.b(a3, "");
                alVar.f15875l = ((com.bytedance.android.live.f.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.f.a.class)).onLongPress(context, true, g2, a3, null, new a(a3, this));
            }
        }

        public static final class a implements com.bytedance.android.livesdkapi.depend.e.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.bytedance.android.livesdkapi.depend.e.c f15881a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ q f15882b;

            static {
                Covode.recordClassIndex(8776);
            }

            @Override // com.bytedance.android.livesdkapi.depend.e.b
            public final void a(Throwable th) {
            }

            a(com.bytedance.android.livesdkapi.depend.e.c cVar, q qVar) {
                this.f15881a = cVar;
                this.f15882b = qVar;
            }

            @Override // com.bytedance.android.livesdkapi.depend.e.b
            public final void a(String str, String str2, Bundle bundle) {
                String[] stringArray;
                h.f.b.l.d(str, "");
                h.f.b.l.d(str2, "");
                ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.emc);
                com.bytedance.android.live.share.e.a(this.f15882b.f15880a.g(), this.f15882b.f15880a.i(), this.f15882b.f15880a, str2, this.f15882b.f15880a.g().getLabels(), bundle);
                Room g2 = this.f15882b.f15880a.g();
                DataChannel i2 = this.f15882b.f15880a.i();
                com.bytedance.android.livesdkapi.depend.e.c cVar = this.f15881a;
                h.f.b.l.b(cVar, "");
                String str3 = cVar.B;
                h.f.b.l.b(str3, "");
                com.bytedance.android.live.share.e.a(g2, i2, str, str2, bundle, str3, null);
                com.bytedance.android.live.share.e.a(this.f15882b.f15880a.g(), this.f15882b.f15880a.i(), str);
                long id = this.f15882b.f15880a.g().getId();
                if (bundle != null && (stringArray = bundle.getStringArray(((IHostShare) com.bytedance.android.live.t.a.a(IHostShare.class)).getBundleKey(0))) != null && stringArray.length != 0) {
                    ((ShareApi) com.bytedance.android.live.network.e.a().a(ShareApi.class)).submitShare(id, h.a.i.a(stringArray, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62)).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(e.b.f12606a, e.c.f12607a);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void l() {
        if (!(this.C == null || getView() == null)) {
            View view = getView();
            if (view != null) {
                view.post(this.C);
            }
            this.C = null;
        }
        IMessageManager iMessageManager = ((IMessageService) com.bytedance.android.live.t.a.a(IMessageService.class)).get();
        if (iMessageManager != null) {
            iMessageManager.startMessage();
        }
        ((GestureDetectLayout) b(R.id.d1y)).a(new b(this));
        IMessageService iMessageService = (IMessageService) com.bytedance.android.live.t.a.a(IMessageService.class);
        DataChannel dataChannel = this.f15874k;
        if (dataChannel == null) {
            h.f.b.l.a("mDataChannel");
        }
        com.bytedance.android.live.n.u uVar = this.A;
        if (uVar == null) {
            h.f.b.l.a("mLiveStatusListener");
        }
        LiveTextView liveTextView = (LiveTextView) b(R.id.cdd);
        h.f.b.l.b(liveTextView, "");
        this.F = iMessageService.configInteractionMessageHelper(this, dataChannel, uVar, liveTextView, null, new c(this), d.f15877a, new e(this));
        DataChannel dataChannel2 = this.f15874k;
        if (dataChannel2 == null) {
            h.f.b.l.a("mDataChannel");
        }
        this.G = new com.bytedance.android.livesdk.ac.a(this, dataChannel2);
        DataChannel dataChannel3 = this.f15874k;
        if (dataChannel3 == null) {
            h.f.b.l.a("mDataChannel");
        }
        com.bytedance.android.livesdk.chatroom.e.q qVar = new com.bytedance.android.livesdk.chatroom.e.q(dataChannel3);
        qVar.a(this);
        this.D = qVar;
        com.bytedance.android.livesdk.chatroom.b.c.INSTANCE.start(this);
        com.bytedance.android.live.core.performance.b.c(b.a.ShowBInteractionFirstWidget);
        DataChannel dataChannel4 = this.f15874k;
        if (dataChannel4 == null) {
            h.f.b.l.a("mDataChannel");
        }
        com.bytedance.android.livesdk.chatroom.e.k kVar = new com.bytedance.android.livesdk.chatroom.e.k(dataChannel4);
        kVar.a(this);
        this.E = kVar;
        com.bytedance.android.live.s.d dVar = this.t;
        if (dVar != null) {
            dVar.a();
        }
    }

    public final void m() {
        int i2;
        DataChannel dataChannel = this.f15874k;
        if (dataChannel == null) {
            h.f.b.l.a("mDataChannel");
        }
        an anVar = (an) dataChannel.b(ad.class);
        if (anVar != null) {
            i2 = anVar.f15100a;
        } else {
            i2 = 0;
        }
        DataChannel dataChannel2 = this.f15874k;
        if (dataChannel2 == null) {
            h.f.b.l.a("mDataChannel");
        }
        an anVar2 = (an) dataChannel2.b(ad.class);
        if ((anVar2 == null || anVar2.a()) && i2 > 0 && isViewValid()) {
            DataChannel dataChannel3 = this.f15874k;
            if (dataChannel3 == null) {
                h.f.b.l.a("mDataChannel");
            }
            Object b2 = dataChannel3.b(ba.class);
            if (b2 == null) {
                h.f.b.l.b();
            }
            if (!((Boolean) b2).booleanValue()) {
                DataChannel dataChannel4 = this.f15874k;
                if (dataChannel4 == null) {
                    h.f.b.l.a("mDataChannel");
                }
                DataChannel c2 = dataChannel4.c(dx.class, -1).c(dz.class, Integer.valueOf(i2)).c(ed.class, new com.bytedance.android.livesdk.chatroom.c.al(com.bytedance.common.utility.n.b(getContext()) - i2)).c(com.bytedance.android.live.gift.o.class, Integer.valueOf((com.bytedance.common.utility.n.b(getContext()) - i2) + com.bytedance.android.live.core.f.y.a(4.0f)));
                be beVar = new be();
                beVar.f18256a = com.bytedance.common.utility.n.b(getContext()) - i2;
                c2.c(com.bytedance.android.livesdk.j.al.class, beVar);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onDestroy() {
        String str;
        RoomAuthStatus roomAuthStatus;
        Integer valueOf;
        com.bytedance.android.livesdk.chatroom.g.a.d a2 = d.a.a();
        if (a2 == null) {
            h.f.b.l.b();
        }
        a2.b();
        com.bytedance.android.livesdk.chatroom.b.c.INSTANCE.stop();
        com.bytedance.android.livesdk.p pVar = (com.bytedance.android.livesdk.p) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.p.class);
        Room room = this.f15873j;
        if (room == null) {
            h.f.b.l.a("mRoom");
        }
        pVar.releaseLikeHelper(room.getId());
        DataChannel dataChannel = this.f15874k;
        if (dataChannel == null) {
            h.f.b.l.a("mDataChannel");
        }
        dataChannel.b(this);
        com.bytedance.android.livesdk.rank.api.c c2 = c();
        if (c2 != null) {
            c2.b();
        }
        com.bytedance.android.livesdk.ab.b a3 = b.a.a("livesdk_anchor_end_rankings_status");
        DataChannel dataChannel2 = this.f15874k;
        if (dataChannel2 == null) {
            h.f.b.l.a("mDataChannel");
        }
        com.bytedance.android.livesdk.ab.b a4 = a3.a(dataChannel2);
        DataChannel dataChannel3 = this.f15874k;
        if (dataChannel3 == null) {
            h.f.b.l.a("mDataChannel");
        }
        Room room2 = (Room) dataChannel3.b(df.class);
        if (room2 == null || (roomAuthStatus = room2.getRoomAuthStatus()) == null || (valueOf = Integer.valueOf(roomAuthStatus.getRankingsSwitchStatus())) == null || valueOf.intValue() != 2) {
            str = "open";
        } else {
            str = "close";
        }
        a4.a("ranking_status", str).b();
        super.onDestroy();
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        IMessageManager iMessageManager;
        com.bytedance.android.livesdk.chatroom.interaction.h hVar = this.v;
        if (hVar == null) {
            h.f.b.l.a("mStickerEventHelper");
        }
        hVar.a();
        com.bytedance.android.livesdk.chatroom.e.k kVar = this.E;
        if (kVar != null) {
            kVar.a();
        }
        com.bytedance.android.livesdk.chatroom.e.q qVar = this.D;
        if (qVar != null) {
            qVar.b();
        }
        com.bytedance.android.message.a aVar = this.F;
        if (aVar != null) {
            aVar.b();
        }
        com.bytedance.android.livesdk.ac.a aVar2 = this.G;
        if (!(aVar2 == null || (iMessageManager = ((IMessageService) com.bytedance.android.live.t.a.a(IMessageService.class)).get()) == null)) {
            iMessageManager.removeMessageListener(aVar2);
        }
        com.bytedance.android.livesdk.chatroom.b.c.INSTANCE.stop();
        this.y.a();
        f().unload(this.p);
        com.bytedance.android.live.share.b bVar = this.I;
        if (bVar != null) {
            bVar.a();
        }
        this.I = null;
        IMessageManager iMessageManager2 = ((IMessageService) com.bytedance.android.live.t.a.a(IMessageService.class)).get();
        if (iMessageManager2 != null) {
            iMessageManager2.stopMessage(false);
        }
        this.f15869f.send();
        super.onDestroyView();
        GestureDetectLayout gestureDetectLayout = (GestureDetectLayout) b(R.id.d1y);
        if (gestureDetectLayout != null) {
            gestureDetectLayout.a();
        }
        this.C = null;
        com.bytedance.android.live.f.a aVar3 = (com.bytedance.android.live.f.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.f.a.class);
        DataChannel dataChannel = this.f15874k;
        if (dataChannel == null) {
            h.f.b.l.a("mDataChannel");
        }
        Room room = this.f15873j;
        if (room == null) {
            h.f.b.l.a("mRoom");
        }
        aVar3.leave(dataChannel, room);
        com.bytedance.android.live.banner.c cVar = (com.bytedance.android.live.banner.c) com.bytedance.android.live.t.a.a(com.bytedance.android.live.banner.c.class);
        DataChannel dataChannel2 = this.f15874k;
        if (dataChannel2 == null) {
            h.f.b.l.a("mDataChannel");
        }
        Room room2 = this.f15873j;
        if (room2 == null) {
            h.f.b.l.a("mRoom");
        }
        cVar.leave(dataChannel2, room2);
        DialogInterface dialogInterface = this.f15875l;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        o();
    }

    static final class g extends h.f.b.m implements h.f.a.b<String, z> {
        final /* synthetic */ al this$0;

        static {
            Covode.recordClassIndex(8760);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(al alVar) {
            super(1);
            this.this$0 = alVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            a(str);
            return z.f158842a;
        }

        public final void a(String str) {
            Fragment fragment;
            androidx.fragment.app.i supportFragmentManager;
            androidx.fragment.app.e activity = this.this$0.getActivity();
            androidx.fragment.app.d dVar = null;
            if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                fragment = null;
            } else {
                fragment = supportFragmentManager.a(str);
            }
            if (fragment instanceof androidx.fragment.app.d) {
                dVar = fragment;
            }
            androidx.fragment.app.d dVar2 = dVar;
            if (dVar2 != null) {
                dVar2.dismissAllowingStateLoss();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p extends h.f.b.m implements h.f.a.b<bp, z> {
        final /* synthetic */ al this$0;

        static {
            Covode.recordClassIndex(8774);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(al alVar) {
            super(1);
            this.this$0 = alVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(bp bpVar) {
            a(bpVar);
            return z.f158842a;
        }

        private void a(bp bpVar) {
            float f2;
            h.f.b.l.d(bpVar, "");
            View b2 = this.this$0.b(R.id.bql);
            float[] fArr = new float[1];
            int i2 = am.f15890a[bpVar.ordinal()];
            if (i2 == 1) {
                f2 = 0.0f;
            } else if (i2 == 2) {
                f2 = 1.0f;
            } else if (i2 != 3) {
                throw new h.n();
            } else {
                return;
            }
            fArr[0] = f2;
            ObjectAnimator.ofFloat(b2, "alpha", fArr).setDuration(300L).start();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l extends h.f.b.m implements h.f.a.b<com.bytedance.android.livesdk.chatroom.model.b, z> {
        final /* synthetic */ al this$0;

        static {
            Covode.recordClassIndex(8769);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(al alVar) {
            super(1);
            this.this$0 = alVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.android.livesdk.chatroom.model.b bVar) {
            h.f.b.l.d(bVar, "");
            com.bytedance.android.live.u.g.a(new Runnable(this) {
                /* class com.bytedance.android.livesdk.chatroom.ui.al.l.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ l f15879a;

                static {
                    Covode.recordClassIndex(8770);
                }

                {
                    this.f15879a = r1;
                }

                public final void run() {
                    this.f15879a.this$0.l();
                }
            });
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.live.n.i
    public final void a(Runnable runnable) {
        if (this.B != null) {
            this.C = null;
            runnable.run();
            return;
        }
        this.C = runnable;
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class c extends h.f.b.j implements h.f.a.b<bv, z> {
        static {
            Covode.recordClassIndex(8756);
        }

        c(al alVar) {
            super(1, alVar, al.class, "handleCopyrightViolation", "handleCopyrightViolation(Lcom/bytedance/android/livesdk/model/message/RemindMessage;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(bv bvVar) {
            bv bvVar2 = bvVar;
            h.f.b.l.d(bvVar2, "");
            ((al) this.receiver).a(bvVar2);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.b.c.a
    public final void a(com.bytedance.android.livesdkapi.h.a aVar) {
        if (aVar == null || !(aVar instanceof by)) {
            com.bytedance.android.livesdk.chatroom.b.c.INSTANCE.onMessageFinish();
            return;
        }
        DataChannel dataChannel = this.f15874k;
        if (dataChannel == null) {
            h.f.b.l.a("mDataChannel");
        }
        dataChannel.c(dk.class, aVar);
    }

    /* access modifiers changed from: package-private */
    public static final class m extends h.f.b.m implements h.f.a.b<an, z> {
        final /* synthetic */ al this$0;

        static {
            Covode.recordClassIndex(8771);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(al alVar) {
            super(1);
            this.this$0 = alVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(an anVar) {
            androidx.fragment.app.e activity;
            an anVar2 = anVar;
            h.f.b.l.d(anVar2, "");
            if (this.this$0.isViewValid()) {
                this.this$0.m();
                if (anVar2.a() && (activity = this.this$0.getActivity()) != null && activity.getRequestedOrientation() == 1) {
                    ((com.bytedance.android.livesdk.chatroom.interaction.e) this.this$0.f15872i.getValue()).a();
                }
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class s extends h.f.b.j implements h.f.a.b<Float, z> {
        static {
            Covode.recordClassIndex(8779);
        }

        s(al alVar) {
            super(1, alVar, al.class, "setTranslationY", "setTranslationY(F)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Float f2) {
            float floatValue = f2.floatValue();
            al alVar = (al) this.receiver;
            RelativeLayout relativeLayout = (RelativeLayout) alVar.b(R.id.bqn);
            h.f.b.l.b(relativeLayout, "");
            relativeLayout.setTranslationY(floatValue);
            WidgetContainer widgetContainer = (WidgetContainer) alVar.b(R.id.d0p);
            if (widgetContainer != null) {
                widgetContainer.setTranslationY(floatValue);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class u extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ al this$0;

        static {
            Covode.recordClassIndex(8781);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(al alVar) {
            super(1);
            this.this$0 = alVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                FrameLayout frameLayout = (FrameLayout) this.this$0.b(R.id.ao9);
                h.f.b.l.b(frameLayout, "");
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                if (!(layoutParams instanceof RelativeLayout.LayoutParams)) {
                    layoutParams = null;
                }
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                if (layoutParams2 != null) {
                    layoutParams2.topMargin = 0;
                }
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class v extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ al this$0;

        static {
            Covode.recordClassIndex(8782);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(al alVar) {
            super(1);
            this.this$0 = alVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            View findViewById;
            float f2;
            boolean booleanValue = bool.booleanValue();
            View view = this.this$0.getView();
            ViewGroup.LayoutParams layoutParams = null;
            if (!(view == null || (findViewById = view.findViewById(R.id.fms)) == null)) {
                ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
                if (layoutParams2 != null) {
                    if (booleanValue) {
                        f2 = 118.0f;
                    } else {
                        f2 = 6.0f;
                    }
                    int a2 = com.bytedance.android.live.core.f.y.a(f2);
                    Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    ((RelativeLayout.LayoutParams) layoutParams2).setMarginEnd(a2);
                    layoutParams = layoutParams2;
                }
                findViewById.setLayoutParams(layoutParams);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        com.bytedance.android.live.p.q qVar;
        super.onCreate(null);
        com.bytedance.android.livesdk.ab.d.b("portrait");
        com.bytedance.android.live.liveinteract.api.a.c.a().a((Integer) 0);
        com.bytedance.android.livesdk.utils.a.a.a(getContext());
        com.bytedance.android.live.p.h hVar = (com.bytedance.android.live.p.h) com.bytedance.android.live.t.a.a(com.bytedance.android.live.p.h.class);
        Context context = getContext();
        if (ToolBarButtonWithTextExperiment.hasText()) {
            qVar = com.bytedance.android.live.p.q.ICON_WITH_TEXT;
        } else {
            qVar = com.bytedance.android.live.p.q.ICON;
        }
        hVar.preloadToolbarView(context, 7, qVar);
    }

    /* access modifiers changed from: package-private */
    public static final class o extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ al this$0;

        static {
            Covode.recordClassIndex(8773);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(al alVar) {
            super(1);
            this.this$0 = alVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            View view;
            View view2;
            boolean booleanValue = bool.booleanValue();
            al alVar = this.this$0;
            if (booleanValue) {
                ConstraintLayout constraintLayout = (ConstraintLayout) alVar.b(R.id.eoo);
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(4);
                }
                NetSpeedMonitorWidget netSpeedMonitorWidget = alVar.f15864a;
                if (netSpeedMonitorWidget == null || (view2 = netSpeedMonitorWidget.getView()) == null) {
                    view2 = alVar.b(R.id.cu6);
                }
                com.bytedance.android.livesdk.utils.p.c(view2);
            } else {
                ConstraintLayout constraintLayout2 = (ConstraintLayout) alVar.b(R.id.eoo);
                if (constraintLayout2 != null) {
                    constraintLayout2.setVisibility(0);
                }
                NetSpeedMonitorWidget netSpeedMonitorWidget2 = alVar.f15864a;
                if (netSpeedMonitorWidget2 == null || (view = netSpeedMonitorWidget2.getView()) == null) {
                    view = alVar.b(R.id.cu6);
                }
                com.bytedance.android.livesdk.utils.p.b(view);
            }
            return z.f158842a;
        }
    }

    public final void a(com.bytedance.android.live.banner.c cVar) {
        if (this.f15866c == null) {
            this.f15866c = f().load(R.id.vz, ((com.bytedance.android.live.banner.c) com.bytedance.android.live.t.a.a(com.bytedance.android.live.banner.c.class)).getBottomRightBannerWidget(), com.bytedance.android.live.u.g.a());
        }
        if (this.f15868e == null) {
            this.f15868e = f().load(R.id.cm3, ((com.bytedance.android.live.banner.c) com.bytedance.android.live.t.a.a(com.bytedance.android.live.banner.c.class)).getActivityTopRightBannerWidget());
        }
        if (this.f15867d == null) {
            this.f15867d = f().load(R.id.ep3, ((com.bytedance.android.live.banner.c) com.bytedance.android.live.t.a.a(com.bytedance.android.live.banner.c.class)).getTopRightBannerWidget());
        }
        Room room = this.f15873j;
        if (room == null) {
            h.f.b.l.a("mRoom");
        }
        cVar.fetchBanner(this, room.getId(), true);
    }

    /* access modifiers changed from: package-private */
    public static final class n extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ al this$0;

        static {
            Covode.recordClassIndex(8772);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(al alVar) {
            super(1);
            this.this$0 = alVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            int i2;
            NetSpeedMonitorWidget netSpeedMonitorWidget;
            View findViewById;
            boolean booleanValue = bool.booleanValue();
            al alVar = this.this$0;
            if (booleanValue) {
                i2 = 4;
                NetSpeedMonitorWidget netSpeedMonitorWidget2 = alVar.f15864a;
                if (netSpeedMonitorWidget2 != null) {
                    netSpeedMonitorWidget2.hide();
                }
                LiveCenterEntranceWidget liveCenterEntranceWidget = alVar.f15865b;
                if (liveCenterEntranceWidget != null) {
                    liveCenterEntranceWidget.hide();
                }
                LiveWidget liveWidget = alVar.f15866c;
                if (liveWidget != null) {
                    liveWidget.hide();
                }
            } else {
                i2 = 0;
                if (!BroadcastLiveCenterSetting.INSTANCE.enable() && (netSpeedMonitorWidget = alVar.f15864a) != null) {
                    netSpeedMonitorWidget.show();
                }
                LiveCenterEntranceWidget liveCenterEntranceWidget2 = alVar.f15865b;
                if (liveCenterEntranceWidget2 != null) {
                    liveCenterEntranceWidget2.show();
                }
                LiveWidget liveWidget2 = alVar.f15866c;
                if (liveWidget2 != null) {
                    liveWidget2.show();
                }
            }
            View view = alVar.getView();
            if (!(view == null || (findViewById = view.findViewById(R.id.fms)) == null)) {
                findViewById.setVisibility(i2);
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) alVar.b(R.id.rc);
            h.f.b.l.b(constraintLayout, "");
            constraintLayout.setVisibility(i2);
            RelativeLayout relativeLayout = (RelativeLayout) alVar.b(R.id.epk);
            h.f.b.l.b(relativeLayout, "");
            relativeLayout.setVisibility(i2);
            ConstraintLayout constraintLayout2 = (ConstraintLayout) alVar.b(R.id.eoo);
            h.f.b.l.b(constraintLayout2, "");
            constraintLayout2.setVisibility(i2);
            FrameLayout frameLayout = (FrameLayout) alVar.b(R.id.d9p);
            h.f.b.l.b(frameLayout, "");
            frameLayout.setVisibility(i2);
            FrameLayout frameLayout2 = (FrameLayout) alVar.b(R.id.dcl);
            h.f.b.l.b(frameLayout2, "");
            frameLayout2.setVisibility(i2);
            FrameLayout frameLayout3 = (FrameLayout) alVar.b(R.id.ai6);
            h.f.b.l.b(frameLayout3, "");
            frameLayout3.setVisibility(i2);
            FrameLayout frameLayout4 = (FrameLayout) alVar.b(R.id.d56);
            h.f.b.l.b(frameLayout4, "");
            frameLayout4.setVisibility(i2);
            FrameLayout frameLayout5 = (FrameLayout) alVar.b(R.id.b01);
            h.f.b.l.b(frameLayout5, "");
            frameLayout5.setVisibility(i2);
            return z.f158842a;
        }
    }

    public final void a(bv bvVar) {
        if (bvVar.f19368f == 7 || (bvVar.f19368f == 6 && com.bytedance.android.livesdkapi.depend.model.live.j.b(h()))) {
            CopyrightViolationHelper copyrightViolationHelper = (CopyrightViolationHelper) this.z.getValue();
            Context context = getContext();
            Room room = this.f15873j;
            if (room == null) {
                h.f.b.l.a("mRoom");
            }
            copyrightViolationHelper.a(context, bvVar, room, this.y);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.view.a
    public final void a(com.bytedance.android.livesdk.model.message.n nVar) {
        h.f.b.l.d(nVar, "");
        if (isViewValid()) {
            int i2 = nVar.f19656a;
            if (i2 == 2) {
                com.bytedance.android.live.n.u uVar = this.A;
                if (uVar == null) {
                    h.f.b.l.a("mLiveStatusListener");
                }
                uVar.a(2);
                Room room = this.f15873j;
                if (room == null) {
                    h.f.b.l.a("mRoom");
                }
                if (room.getMosaicStatus() == 0) {
                    LiveTextView liveTextView = (LiveTextView) b(R.id.cdd);
                    h.f.b.l.b(liveTextView, "");
                    liveTextView.setVisibility(8);
                    JSONObject jSONObject = new JSONObject();
                    com.bytedance.android.live.core.d.a.a(jSONObject, "error_code", 0L);
                    com.bytedance.android.live.core.d.a.a(jSONObject, "error_msg", "action_resume");
                    com.bytedance.android.live.core.d.c.a("ttlive_control_message_status", 0, jSONObject);
                }
            } else if (i2 == 3) {
                com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.chatroom.c.r(10010, (byte) 0));
            } else if (i2 == 4) {
                com.bytedance.android.livesdk.an.a a2 = com.bytedance.android.livesdk.an.a.a();
                com.bytedance.android.livesdk.chatroom.c.r rVar = new com.bytedance.android.livesdk.chatroom.c.r(7);
                rVar.f15145d = nVar;
                a2.a(rVar);
                if (!com.bytedance.common.utility.m.a(nVar.f19657f)) {
                    ao.a(com.bytedance.android.live.core.f.y.e(), nVar.f19657f, 0);
                }
                JSONObject jSONObject2 = new JSONObject();
                com.bytedance.android.live.core.d.a.a(jSONObject2, "error_code", 0L);
                com.bytedance.android.live.core.d.a.a(jSONObject2, "error_msg", nVar.f19657f);
                com.bytedance.android.live.core.d.c.a("ttlive_anchor_close_room", 0, jSONObject2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        boolean z2;
        super.onActivityCreated(bundle);
        View view = getView();
        if (view != null) {
            h.f.b.l.b(view, "");
            DataChannel dataChannel = this.f15874k;
            if (dataChannel == null) {
                h.f.b.l.a("mDataChannel");
            }
            dataChannel.a((Object) this, ei.class, (h.f.a.b) new l(this)).b((androidx.lifecycle.m) this, ad.class, (h.f.a.b) new m(this)).a((androidx.lifecycle.m) this, au.class, (h.f.a.b) new n(this)).a((androidx.lifecycle.m) this, av.class, (h.f.a.b) new o(this)).a((androidx.lifecycle.m) this, bq.class, (h.f.a.b) new p(this));
            com.bytedance.android.livesdk.ab.i.b();
            com.bytedance.android.livesdk.ab.i.b("ttlive_room", "prepare load widget");
            this.B = com.bytedance.android.livesdk.g.f.a(this, view, bundle);
            DataChannel dataChannel2 = this.f15874k;
            if (dataChannel2 == null) {
                h.f.b.l.a("mDataChannel");
            }
            dataChannel2.a(bs.class, com.bytedance.android.livesdk.ab.e.c());
            Room room = this.f15873j;
            if (room == null) {
                h.f.b.l.a("mRoom");
            }
            RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
            if (roomAuthStatus == null || roomAuthStatus.isAnchorGiftEnable()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IGiftService.class);
                h.f.b.l.b(a2, "");
                LiveWidget giftWidget = ((IGiftService) a2).getGiftWidget();
                this.o = giftWidget;
                if (!(giftWidget instanceof com.bytedance.android.livesdk.gift.model.s)) {
                    giftWidget = null;
                }
                com.bytedance.android.livesdk.gift.model.s sVar = (com.bytedance.android.livesdk.gift.model.s) giftWidget;
                if (sVar != null) {
                    sVar.a(new y(new x(this)));
                }
                if (LiveVideoGiftCoverPanelSetting.INSTANCE.getValue()) {
                    f().load(R.id.ffh, this.o, com.bytedance.android.live.u.g.b());
                } else {
                    f().load(R.id.ffi, this.o, com.bytedance.android.live.u.g.b());
                }
            }
            Room room2 = this.f15873j;
            if (room2 == null) {
                h.f.b.l.a("mRoom");
            }
            RoomAuthStatus roomAuthStatus2 = room2.getRoomAuthStatus();
            if (roomAuthStatus2 == null || roomAuthStatus2.isMessageEnable()) {
                DataChannel dataChannel3 = this.f15874k;
                if (dataChannel3 == null) {
                    h.f.b.l.a("mDataChannel");
                }
                dataChannel3.a(aa.class, (Object) true);
            }
            if (!TestDisableCommentAreaSetting.INSTANCE.getValue()) {
                this.p = f().load(R.id.clu, ((com.bytedance.android.live.publicscreen.a.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.publicscreen.a.e.class)).getPublicScreenWidgetClass(true));
                ShapeControllableView shapeControllableView = (ShapeControllableView) b(R.id.dd7);
                h.f.b.l.b(shapeControllableView, "");
                shapeControllableView.setVisibility(0);
                DataChannel dataChannel4 = this.f15874k;
                if (dataChannel4 == null) {
                    h.f.b.l.a("mDataChannel");
                }
                if (h.f.b.l.a(dataChannel4.b(ea.class), (Object) true)) {
                    ShapeControllableView shapeControllableView2 = (ShapeControllableView) b(R.id.dd7);
                    shapeControllableView2.setGradientColors(new int[]{Color.argb(0, 0, 0, 0), Color.argb(128, 0, 0, 0)});
                    shapeControllableView2.setGradientPositions(new float[]{0.0f, 1.0f});
                    shapeControllableView2.setGradientOrientation(1);
                }
            }
            com.bytedance.android.live.banner.c cVar = (com.bytedance.android.live.banner.c) com.bytedance.android.live.t.a.a(com.bytedance.android.live.banner.c.class);
            Room room3 = this.f15873j;
            if (room3 == null) {
                h.f.b.l.a("mRoom");
            }
            if (cVar.shouldShowBanner(room3.getId())) {
                h.f.b.l.b(cVar, "");
                a(cVar);
            }
            Room room4 = this.f15873j;
            if (room4 == null) {
                h.f.b.l.a("mRoom");
            }
            cVar.addOnBannerVisibilityChangeListener(room4.getId(), new w(cVar, this));
            f().load(R.id.bce, ((com.bytedance.android.live.f.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.f.a.class)).getLiveRoomNotifyWidget());
            f().load(R.id.a_i, ((com.bytedance.android.live.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.f.class)).getCommentWidget());
            com.bytedance.android.livesdk.ab.i.b();
            com.bytedance.android.livesdk.ab.i.b("ttlive_comment", "CommentWidget is load.");
            DataChannel dataChannel5 = this.f15874k;
            if (dataChannel5 == null) {
                h.f.b.l.a("mDataChannel");
            }
            dataChannel5.c(com.bytedance.android.live.n.q.class, true);
            FrameLayout frameLayout = (FrameLayout) b(R.id.d56);
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            if (com.bytedance.android.livesdkapi.depend.model.live.j.g(h())) {
                this.s = f().load(R.id.dpy, ((com.bytedance.android.live.c.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.c.b.class)).getDonationStickerAnchorWidget());
            }
            com.bytedance.android.livesdkapi.depend.model.live.i h2 = h();
            h.f.b.l.d(h2, "");
            if (h2 != com.bytedance.android.livesdkapi.depend.model.live.i.THIRD_PARTY && LivePauseLiveSetting.INSTANCE.pauseLiveEnabled()) {
                RecyclableWidgetManager f2 = f();
                View b2 = b(R.id.d2b);
                h.f.b.l.b(b2, "");
                f2.load(R.id.d2e, new PauseLiveWidget(b2));
            }
            a(view, bundle);
            f().load(R.id.awq, new EndWidget());
            DataChannel dataChannel6 = this.f15874k;
            if (dataChannel6 == null) {
                h.f.b.l.a("mDataChannel");
            }
            dataChannel6.c(com.bytedance.android.live.gift.d.class, false);
            com.bytedance.android.livesdk.p pVar = (com.bytedance.android.livesdk.p) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.p.class);
            Room room5 = this.f15873j;
            if (room5 == null) {
                h.f.b.l.a("mRoom");
            }
            com.bytedance.android.livesdk.like.b likeHelper = pVar.getLikeHelper(room5.getId());
            if (likeHelper != null) {
                h.f.b.l.b(likeHelper, "");
                if (likeHelper.n()) {
                    if (likeHelper.l()) {
                        f().load(R.id.dy7, ((com.bytedance.android.livesdk.p) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.p.class)).getSelfLikeWidgetClass(likeHelper));
                        f().load(R.id.c_x, ((com.bytedance.android.livesdk.p) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.p.class)).getLikeUserInfoAnimWidgetClass(likeHelper));
                    }
                    if (likeHelper.m()) {
                        f().load(R.id.d0p, ((com.bytedance.android.livesdk.p) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.p.class)).getOthersLikeWidgetClass(likeHelper));
                    }
                }
            }
            f().load(R.id.cju, ((com.bytedance.android.livesdk.lynx.lynxcard.b) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.lynx.lynxcard.b.class)).getLynxCardPreviewWidget());
            f().load(R.id.cjv, ((com.bytedance.android.livesdk.lynx.lynxcard.b) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.lynx.lynxcard.b.class)).getLynxCardWidget());
            IGiftService iGiftService = (IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class);
            if (iGiftService.enableRedEnvelope()) {
                RecyclableWidgetManager f3 = f();
                h.f.b.l.b(iGiftService, "");
                f3.load(R.id.cdn, iGiftService.getRedEnvelopeWidget());
            }
            Runnable runnable = this.C;
            if (runnable != null) {
                view.post(runnable);
                this.C = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ al f15876a;

        static {
            Covode.recordClassIndex(8755);
        }

        b(al alVar) {
            this.f15876a = alVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f15876a.a(motionEvent)) {
                return false;
            }
            ((com.bytedance.android.livesdk.widget.j) this.f15876a.f15871h.getValue()).onTouchEvent(motionEvent);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void a(View view, Bundle bundle) {
        Class<? extends LiveRecyclableWidget> cls;
        boolean z2;
        com.bytedance.android.live.p.f anchorToolbarBehavior;
        IBroadcastService iBroadcastService;
        WidgetContainer widgetContainer;
        Room room = this.f15873j;
        if (room == null) {
            h.f.b.l.a("mRoom");
        }
        if (!room.isOfficial()) {
            f().load(R.id.fdb, ((com.bytedance.android.live.r.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.r.a.class)).getUserInfoWidget());
            f().load(R.id.n9, ((com.bytedance.android.livesdk.rank.api.d) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.rank.api.d.class)).getRankWidgetClass(5), com.bytedance.android.live.u.g.a());
        }
        DataChannel dataChannel = this.f15874k;
        if (dataChannel == null) {
            h.f.b.l.a("mDataChannel");
        }
        if (com.bytedance.android.live.core.f.s.b(dataChannel)) {
            DataChannel dataChannel2 = this.f15874k;
            if (dataChannel2 == null) {
                h.f.b.l.a("mDataChannel");
            }
            dataChannel2.a(com.bytedance.android.livesdk.rank.api.k.class, (h.f.a.b) new u(this));
        }
        RecyclableWidgetManager f2 = f();
        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.share.c.class);
        h.f.b.l.b(a2, "");
        f2.load(((com.bytedance.android.live.share.c) a2).getShareWidget());
        RecyclableWidgetManager f3 = f();
        com.bytedance.android.live.base.a a3 = com.bytedance.android.live.t.a.a(ISlotService.class);
        h.f.b.l.b(a3, "");
        f3.load(((ISlotService) a3).getBarrageWidget());
        RecyclableWidgetManager f4 = f();
        com.bytedance.android.live.base.a a4 = com.bytedance.android.live.t.a.a(ISlotService.class);
        h.f.b.l.b(a4, "");
        f4.load(R.id.e65, ((ISlotService) a4).getFrameSlotWidget());
        f().load(R.id.bag, ((IBroadcastService) com.bytedance.android.live.t.a.a(IBroadcastService.class)).getWidgetClass(1));
        com.bytedance.android.live.p.h hVar = (com.bytedance.android.live.p.h) com.bytedance.android.live.t.a.a(com.bytedance.android.live.p.h.class);
        if (com.bytedance.android.livesdkapi.depend.model.live.j.b(h())) {
            cls = hVar.broadcastToolbarWidget();
        } else {
            cls = hVar.toolbarWidget();
        }
        DataChannel dataChannel3 = this.f15874k;
        if (dataChannel3 == null) {
            h.f.b.l.a("mDataChannel");
        }
        Boolean bool = (Boolean) dataChannel3.b(ea.class);
        boolean z3 = false;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = false;
        }
        if (z2 && (widgetContainer = (WidgetContainer) b(R.id.ene)) != null) {
            ViewGroup.LayoutParams layoutParams = widgetContainer.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = com.bytedance.android.live.core.f.y.a(12.0f);
            widgetContainer.setLayoutParams(marginLayoutParams);
        }
        f().load(R.id.ene, (Class) cls, false, k());
        if (com.bytedance.android.livesdkapi.depend.model.live.j.g(h())) {
            f().load(R.id.ccf, ((com.bytedance.android.live.c.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.c.b.class)).getDecorationWidget());
        }
        if (!com.bytedance.android.live.u.g.a()) {
            Room room2 = this.f15873j;
            if (room2 == null) {
                h.f.b.l.a("mRoom");
            }
            if (room2.isOfficial()) {
                RecyclableWidgetManager f5 = f();
                com.bytedance.android.live.base.a a5 = com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.p.class);
                h.f.b.l.b(a5, "");
                f5.load(R.id.ri, ((com.bytedance.android.livesdk.p) a5).getBarrageWidget());
            }
        }
        Room room3 = this.f15873j;
        if (room3 == null) {
            h.f.b.l.a("mRoom");
        }
        if (!room3.isStar() && (iBroadcastService = (IBroadcastService) com.bytedance.android.live.t.a.a(IBroadcastService.class)) != null) {
            com.bytedance.common.utility.n.a(b(R.id.ki), 0);
            f().load(R.id.ki, iBroadcastService.getWidgetClass(2));
        }
        if (com.bytedance.android.live.u.g.a()) {
            RecyclableWidgetManager f6 = f();
            com.bytedance.android.live.base.a a6 = com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.rank.api.d.class);
            h.f.b.l.b(a6, "");
            f6.load(R.id.bh8, (Widget) ((com.bytedance.android.livesdk.rank.api.d) a6).getHourlyRankWidget(), true);
        } else {
            f().load(R.id.bh8, (Class) ((com.bytedance.android.livesdk.rank.api.d) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.rank.api.d.class)).getRankWidgetClass(4), false);
        }
        this.r = f().load(((com.bytedance.android.live.j.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.j.a.class)).getMicRoomAnchorTimeControlWidget());
        if (LiveHashTagAnchorShowEntrance.INSTANCE.getValue()) {
            this.q = f().load(R.id.bem, ((com.bytedance.android.live.h.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.h.b.class)).getAnchorHashTagWidget());
        }
        Room room4 = this.f15873j;
        if (room4 == null) {
            h.f.b.l.a("mRoom");
        }
        RoomAuthStatus roomAuthStatus = room4.getRoomAuthStatus();
        if (roomAuthStatus != null) {
            z3 = roomAuthStatus.isEnableGift();
        }
        if (com.bytedance.android.livesdk.gift.b.a.a(true, true, z3) == a.EnumC0371a.SHOW && LiveWishlistPermissionSetting.INSTANCE.getValue().f17947a == 1) {
            RecyclableWidgetManager f7 = f();
            com.bytedance.android.live.base.a a7 = com.bytedance.android.live.t.a.a(IGiftService.class);
            h.f.b.l.b(a7, "");
            f7.load(R.id.fms, ((IGiftService) a7).getWishListWidget());
            DataChannel dataChannel4 = this.f15874k;
            if (dataChannel4 == null) {
                h.f.b.l.a("mDataChannel");
            }
            dataChannel4.b(bl.class, (h.f.a.b) new v(this));
        }
        Context context = getContext();
        if (context != null) {
            h.f.b.l.b(context, "");
            com.bytedance.android.live.p.l lVar = com.bytedance.android.live.p.l.SLOT;
            DataChannel dataChannel5 = this.f15874k;
            if (dataChannel5 == null) {
                h.f.b.l.a("mDataChannel");
            }
            lVar.load(dataChannel5, new com.bytedance.android.livesdk.chatroom.viewmodule.a.f(context, this));
            com.bytedance.android.live.p.l lVar2 = com.bytedance.android.live.p.l.EFFECT;
            DataChannel dataChannel6 = this.f15874k;
            if (dataChannel6 == null) {
                h.f.b.l.a("mDataChannel");
            }
            lVar2.load(dataChannel6, new com.bytedance.android.livesdk.chatroom.viewmodule.a.e(context));
            com.bytedance.android.live.p.l lVar3 = com.bytedance.android.live.p.l.MORE;
            DataChannel dataChannel7 = this.f15874k;
            if (dataChannel7 == null) {
                h.f.b.l.a("mDataChannel");
            }
            lVar3.load(dataChannel7, new com.bytedance.android.livesdk.chatroom.viewmodule.a.m());
            com.bytedance.android.live.p.l lVar4 = com.bytedance.android.live.p.l.CLOSE_ROOM;
            DataChannel dataChannel8 = this.f15874k;
            if (dataChannel8 == null) {
                h.f.b.l.a("mDataChannel");
            }
            lVar4.load(dataChannel8, new com.bytedance.android.livesdk.chatroom.viewmodule.a.i());
            com.bytedance.android.live.p.l lVar5 = com.bytedance.android.live.p.l.COMMENT;
            DataChannel dataChannel9 = this.f15874k;
            if (dataChannel9 == null) {
                h.f.b.l.a("mDataChannel");
            }
            lVar5.load(dataChannel9, new com.bytedance.android.livesdk.chatroom.viewmodule.a.j(context));
            com.bytedance.android.live.p.l lVar6 = com.bytedance.android.live.p.l.SETTING;
            DataChannel dataChannel10 = this.f15874k;
            if (dataChannel10 == null) {
                h.f.b.l.a("mDataChannel");
            }
            lVar6.load(dataChannel10, new com.bytedance.android.livesdk.chatroom.viewmodule.a.l(context));
            com.bytedance.android.live.p.l lVar7 = com.bytedance.android.live.p.l.INTRO;
            DataChannel dataChannel11 = this.f15874k;
            if (dataChannel11 == null) {
                h.f.b.l.a("mDataChannel");
            }
            lVar7.load(dataChannel11, new com.bytedance.android.livesdk.chatroom.viewmodule.a.k(context));
            com.bytedance.android.live.p.f toolbarBehavior = ((com.bytedance.android.live.m.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.m.a.class)).getToolbarBehavior(context);
            if (toolbarBehavior != null) {
                com.bytedance.android.live.p.l lVar8 = com.bytedance.android.live.p.l.QUESTION;
                DataChannel dataChannel12 = this.f15874k;
                if (dataChannel12 == null) {
                    h.f.b.l.a("mDataChannel");
                }
                lVar8.load(dataChannel12, toolbarBehavior);
            }
            com.bytedance.android.live.p.l lVar9 = com.bytedance.android.live.p.l.SHARE;
            DataChannel dataChannel13 = this.f15874k;
            if (dataChannel13 == null) {
                h.f.b.l.a("mDataChannel");
            }
            com.bytedance.android.live.p.f shareBehavior = ((com.bytedance.android.live.share.c) com.bytedance.android.live.t.a.a(com.bytedance.android.live.share.c.class)).getShareBehavior(getActivity(), context, h(), this);
            h.f.b.l.b(shareBehavior, "");
            lVar9.load(dataChannel13, shareBehavior);
            if (LivePauseLiveSetting.INSTANCE.pauseLiveEnabled()) {
                com.bytedance.android.live.p.l lVar10 = com.bytedance.android.live.p.l.PAUSE_LIVE;
                DataChannel dataChannel14 = this.f15874k;
                if (dataChannel14 == null) {
                    h.f.b.l.a("mDataChannel");
                }
                lVar10.load(dataChannel14, new com.bytedance.android.livesdk.chatroom.viewmodule.a.o());
            }
            if (FrisbeeTaskIconShowSetting.INSTANCE.enable()) {
                com.bytedance.android.live.p.l lVar11 = com.bytedance.android.live.p.l.TASK;
                DataChannel dataChannel15 = this.f15874k;
                if (dataChannel15 == null) {
                    h.f.b.l.a("mDataChannel");
                }
                lVar11.load(dataChannel15, new com.bytedance.android.livesdk.chatroom.viewmodule.a.a(context));
            }
            DataChannel dataChannel16 = this.f15874k;
            if (dataChannel16 == null) {
                h.f.b.l.a("mDataChannel");
            }
            if (com.bytedance.android.live.broadcast.utils.o.a(dataChannel16) && (anchorToolbarBehavior = ((com.bytedance.android.live.h.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.h.b.class)).getAnchorToolbarBehavior()) != null) {
                com.bytedance.android.live.p.l lVar12 = com.bytedance.android.live.p.l.TOPICS;
                DataChannel dataChannel17 = this.f15874k;
                if (dataChannel17 == null) {
                    h.f.b.l.a("mDataChannel");
                }
                lVar12.load(dataChannel17, anchorToolbarBehavior);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i2;
        DrawerLayout a2;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        view.setFitsSystemWindows(true);
        view.post(new r(this, view));
        Room room = this.f15873j;
        if (room == null) {
            h.f.b.l.a("mRoom");
        }
        if (room.getMosaicStatus() == 1) {
            LiveTextView liveTextView = (LiveTextView) b(R.id.cdd);
            h.f.b.l.b(liveTextView, "");
            liveTextView.setVisibility(0);
        }
        Room room2 = this.f15873j;
        if (room2 == null) {
            h.f.b.l.a("mRoom");
        }
        if (room2.isOfficial()) {
            androidx.fragment.app.e activity = getActivity();
            if (!(activity instanceof com.bytedance.android.livesdkapi.b)) {
                activity = null;
            }
            com.bytedance.android.livesdkapi.b bVar = (com.bytedance.android.livesdkapi.b) activity;
            if (!(bVar == null || (a2 = bVar.a()) == null)) {
                a2.setDrawerLockMode(1);
            }
        }
        if (this.I == null) {
            com.bytedance.android.live.share.b provideShareCountManager = ((com.bytedance.android.live.share.c) com.bytedance.android.live.t.a.a(com.bytedance.android.live.share.c.class)).provideShareCountManager();
            DataChannel dataChannel = this.f15874k;
            if (dataChannel == null) {
                h.f.b.l.a("mDataChannel");
            }
            IMessageManager iMessageManager = ((IMessageService) com.bytedance.android.live.t.a.a(IMessageService.class)).get();
            Room room3 = this.f15873j;
            if (room3 == null) {
                h.f.b.l.a("mRoom");
            }
            RoomStats stats = room3.getStats();
            if (stats != null) {
                i2 = stats.getShareCount();
            } else {
                i2 = 0;
            }
            provideShareCountManager.a(dataChannel, iMessageManager, i2);
            this.I = provideShareCountManager;
        }
        Room room4 = this.f15873j;
        if (room4 == null) {
            h.f.b.l.a("mRoom");
        }
        if (room4.getRoomAuthStatus().chatSubOnly) {
            ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.enl);
        }
        com.bytedance.android.live.s.e eVar = (com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class);
        DataChannel dataChannel2 = this.f15874k;
        if (dataChannel2 == null) {
            h.f.b.l.a("mDataChannel");
        }
        this.t = eVar.configUserHelper(this, dataChannel2, this.y);
        com.bytedance.android.live.q.a aVar = (com.bytedance.android.live.q.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.q.a.class);
        DataChannel dataChannel3 = this.f15874k;
        if (dataChannel3 == null) {
            h.f.b.l.a("mDataChannel");
        }
        aVar.configProfileHelper(this, dataChannel3, true, this);
        DataChannel dataChannel4 = this.f15874k;
        if (dataChannel4 == null) {
            h.f.b.l.a("mDataChannel");
        }
        this.w = new com.bytedance.android.livesdk.chatroom.interaction.f(this, dataChannel4);
        IWalletService iWalletService = (IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class);
        DataChannel dataChannel5 = this.f15874k;
        if (dataChannel5 == null) {
            h.f.b.l.a("mDataChannel");
        }
        iWalletService.configPackagePurchaseHelper(this, dataChannel5, this);
        DataChannel dataChannel6 = this.f15874k;
        if (dataChannel6 == null) {
            h.f.b.l.a("mDataChannel");
        }
        this.x = new com.bytedance.android.livesdk.chatroom.interaction.g(this, dataChannel6);
        com.bytedance.android.live.b.f fVar = (com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class);
        DataChannel dataChannel7 = this.f15874k;
        if (dataChannel7 == null) {
            h.f.b.l.a("mDataChannel");
        }
        fVar.configWebDialogHelper(this, dataChannel7, true, this);
        DataChannel dataChannel8 = this.f15874k;
        if (dataChannel8 == null) {
            h.f.b.l.a("mDataChannel");
        }
        this.v = new com.bytedance.android.livesdk.chatroom.interaction.h(this, dataChannel8);
        com.bytedance.android.livesdk.p pVar = (com.bytedance.android.livesdk.p) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.p.class);
        DataChannel dataChannel9 = this.f15874k;
        if (dataChannel9 == null) {
            h.f.b.l.a("mDataChannel");
        }
        pVar.configInteractionHelper(this, dataChannel9, (GestureDetectLayout) b(R.id.d1y));
        DataChannel dataChannel10 = this.f15874k;
        if (dataChannel10 == null) {
            h.f.b.l.a("mDataChannel");
        }
        View b2 = b(R.id.bqp);
        h.f.b.l.b(b2, "");
        this.u = new com.bytedance.android.livesdk.chatroom.interaction.b(this, dataChannel10, b2, null, new s(this));
        if (com.bytedance.android.livesdk.utils.p.a((Activity) getActivity())) {
            DataChannel dataChannel11 = this.f15874k;
            if (dataChannel11 == null) {
                h.f.b.l.a("mDataChannel");
            }
            dataChannel11.a(dc.class, "live_page");
            com.bytedance.android.livesdk.rank.api.c c2 = c();
            if (c2 != null) {
                androidx.fragment.app.i childFragmentManager = getChildFragmentManager();
                h.f.b.l.b(childFragmentManager, "");
                c2.a(childFragmentManager);
            }
            com.bytedance.android.livesdk.rank.api.c c3 = c();
            if (c3 != null) {
                c3.a();
            }
        }
        View b3 = b(R.id.va);
        h.f.b.l.b(b3, "");
        b3.setVisibility(0);
        DataChannel dataChannel12 = this.f15874k;
        if (dataChannel12 == null) {
            h.f.b.l.a("mDataChannel");
        }
        if (com.bytedance.android.live.core.f.s.b(dataChannel12)) {
            FrameLayout frameLayout = (FrameLayout) b(R.id.bqo);
            h.f.b.l.b(frameLayout, "");
            frameLayout.setVisibility(0);
        }
        com.bytedance.android.live.f.a aVar2 = (com.bytedance.android.live.f.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.f.a.class);
        DataChannel dataChannel13 = this.f15874k;
        if (dataChannel13 == null) {
            h.f.b.l.a("mDataChannel");
        }
        Room room5 = this.f15873j;
        if (room5 == null) {
            h.f.b.l.a("mRoom");
        }
        aVar2.enter(dataChannel13, room5);
        com.bytedance.android.live.banner.c cVar = (com.bytedance.android.live.banner.c) com.bytedance.android.live.t.a.a(com.bytedance.android.live.banner.c.class);
        DataChannel dataChannel14 = this.f15874k;
        if (dataChannel14 == null) {
            h.f.b.l.a("mDataChannel");
        }
        Room room6 = this.f15873j;
        if (room6 == null) {
            h.f.b.l.a("mRoom");
        }
        cVar.enter(dataChannel14, room6);
        int value = PostponeRequestBatchShareListSetting.INSTANCE.getValue();
        if (value <= 0) {
            com.bytedance.android.live.broadcast.g.a aVar3 = this.f15870g;
            Room room7 = this.f15873j;
            if (room7 == null) {
                h.f.b.l.a("mRoom");
            }
            aVar3.a(room7.getId(), this, null);
            return;
        }
        view.postDelayed(new t(this), TimeUnit.SECONDS.toMillis((long) value));
    }

    @Override // com.bytedance.android.live.n.i
    public final void a(DataChannel dataChannel, com.bytedance.android.live.n.u uVar) {
        h.f.b.l.d(dataChannel, "");
        h.f.b.l.d(uVar, "");
        Object b2 = dataChannel.b(df.class);
        if (b2 == null) {
            h.f.b.l.b();
        }
        this.f15873j = (Room) b2;
        DataChannel a2 = dataChannel.a(bc.class, (Object) false).a(aa.class, (Object) false);
        Room room = this.f15873j;
        if (room == null) {
            h.f.b.l.a("mRoom");
        }
        this.f15874k = a2.a(di.class, Long.valueOf(room.getId())).a(cp.class, (Object) true).a(ea.class, Boolean.valueOf(ToolBarButtonWithTextExperiment.hasText())).a(bx.class, h()).b(ee.class, (Object) true);
        this.A = uVar;
        com.bytedance.android.livesdk.ai.a.f13743b = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
        com.bytedance.android.live.broadcast.api.e.c cVar;
        com.bytedance.android.livesdk.ac.a aVar = this.G;
        if (aVar != null && (cVar = aVar.f13607a) != null) {
            cVar.a(i2, i3, intent);
        }
    }
}
