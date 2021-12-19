package com.bytedance.android.live.broadcast.preview;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.c.b;
import com.bytedance.android.live.broadcast.api.c.c;
import com.bytedance.android.live.broadcast.bgbroadcast.BgBroadcastServiceImpl;
import com.bytedance.android.live.broadcast.model.i;
import com.bytedance.android.live.broadcast.preview.n;
import com.bytedance.android.live.broadcast.preview.q;
import com.bytedance.android.live.broadcast.preview.r;
import com.bytedance.android.live.broadcast.preview.t;
import com.bytedance.android.live.broadcast.preview.v;
import com.bytedance.android.live.broadcast.preview.widget.ObsBroadcastGuideWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewApplyWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewBeautyWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewChangeOrientationWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewCloseWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewCommonNotifyWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewCoverWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewDefinitionSelectionWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewFollowerWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewHelpWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewLiveModeWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewLiveStudioPageWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewLiveStudioTipsWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewLoadEndWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewReplayWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewReverseCameraWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewSeeMoreDetailWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewSelectGameCategoryWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewSettingWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewShareWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewStartLiveWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewStickerWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewSubscriptionWidget;
import com.bytedance.android.live.broadcast.preview.widget.PreviewTitleWidget;
import com.bytedance.android.live.broadcast.utils.d;
import com.bytedance.android.live.broadcast.utils.i;
import com.bytedance.android.live.core.performance.b;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.effect.api.a.l;
import com.bytedance.android.live.effect.api.f;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.live.n.o;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.c.h;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.j.dg;
import com.bytedance.android.livesdk.l.a;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveGameCategoryEntranceSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHashTagAnchorShowEntrance;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveObsBroadcastGuideStrategySetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveResumeLiveSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.RemoveOnlineFollowersSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveNewEffectPanelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.other.ToolBarButtonWithTextExperiment;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableALogSetting;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.performance.g;
import com.bytedance.android.livesdk.ui.TraversalConstraintLayout;
import com.bytedance.android.livesdkapi.depend.c.a;
import com.bytedance.android.livesdkapi.depend.model.a.e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.android.widget.Widget;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.util.FontSpan;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

public final class d extends com.bytedance.android.livesdk.ui.a implements a.AbstractC0502a, com.bytedance.android.livesdkapi.depend.model.a.f, com.bytedance.ies.sdk.datachannel.e {
    public static final a t = new a((byte) 0);
    private final h.h A = com.bytedance.android.livesdkapi.m.d.a(new aj(this));
    private final h.h B = com.bytedance.android.livesdkapi.m.d.a(new ak(this));
    private final h.h C = com.bytedance.android.livesdkapi.m.d.a(new al(this));
    private final h.h D = com.bytedance.android.livesdkapi.m.d.a(ai.f8181a);
    private final h.h E = com.bytedance.android.livesdkapi.m.d.a(new an(this));
    private final h.h F = com.bytedance.android.livesdkapi.m.d.a(ac.f8176a);
    private final h.h G = com.bytedance.android.livesdkapi.m.d.a(ae.f8178a);
    private final h.h H = com.bytedance.android.livesdkapi.m.d.a(x.f8242a);
    private final h.h I = com.bytedance.android.livesdkapi.m.d.a(ag.f8180a);
    private final h.h J = com.bytedance.android.livesdkapi.m.d.a(new am(this));
    private final h.h K = com.bytedance.android.livesdkapi.m.d.a(ao.f8182a);
    private final h.h L = com.bytedance.android.livesdkapi.m.d.a(t.f8239a);
    private final h.h M = com.bytedance.android.livesdkapi.m.d.a(ab.f8175a);
    private final h.h N = com.bytedance.android.livesdkapi.m.d.a(o.f8235a);
    private final h.h O = com.bytedance.android.livesdkapi.m.d.a(r.f8237a);
    private final h.h P = com.bytedance.android.livesdkapi.m.d.a(s.f8238a);
    private final h.h Q = com.bytedance.android.livesdkapi.m.d.a(p.f8236a);
    private final h.h R = com.bytedance.android.livesdkapi.m.d.a(new q(this));
    private final h.h S = com.bytedance.android.livesdkapi.m.d.a(new C0125d(this));
    private boolean T;
    private long U;
    private final WidgetCreateTimeUtil V = new WidgetCreateTimeUtil(new ap(this));
    private Runnable W;
    private v X;
    private final com.bytedance.android.live.effect.api.f Y = com.bytedance.android.live.effect.d.a();
    private final h.h Z = com.bytedance.android.livesdkapi.m.d.a(new bo(this));

    /* renamed from: a  reason: collision with root package name */
    public DataChannel f8160a;
    private final com.bytedance.android.live.effect.api.a.d aa = new m(this);
    private final e.a ab = new n(this);
    private HashMap ac;

    /* renamed from: b  reason: collision with root package name */
    final h.h f8161b = com.bytedance.android.livesdkapi.m.d.a(new y(this));

    /* renamed from: c  reason: collision with root package name */
    public PreviewSubscriptionWidget f8162c;

    /* renamed from: d  reason: collision with root package name */
    final h.h f8163d = com.bytedance.android.livesdkapi.m.d.a(v.f8241a);

    /* renamed from: e  reason: collision with root package name */
    public LiveWidget f8164e;

    /* renamed from: f  reason: collision with root package name */
    public ObsBroadcastGuideWidget f8165f;

    /* renamed from: g  reason: collision with root package name */
    final h.h f8166g = com.bytedance.android.livesdkapi.m.d.a(af.f8179a);

    /* renamed from: h  reason: collision with root package name */
    com.bytedance.android.livesdkapi.depend.model.live.i f8167h;

    /* renamed from: i  reason: collision with root package name */
    public User f8168i;

    /* renamed from: j  reason: collision with root package name */
    public com.bytedance.android.livesdkapi.depend.model.a.e f8169j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f8170k;

    /* renamed from: l  reason: collision with root package name */
    public long f8171l;

    /* renamed from: m  reason: collision with root package name */
    public float f8172m;
    public float n;
    public boolean o;
    boolean p;
    public boolean q;
    final h.h r = com.bytedance.android.livesdkapi.m.d.a(z.f8243a);
    final u s = new u(this);
    private final com.bytedance.android.livesdkapi.l.a u = ((com.bytedance.android.livesdkapi.l.a) DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.j.e.class));
    private WidgetManager v;
    private final h.h w = com.bytedance.android.livesdkapi.m.d.a(new w(this));
    private final h.h x = com.bytedance.android.livesdkapi.m.d.a(new aa(this));
    private final h.h y = com.bytedance.android.livesdkapi.m.d.a(ad.f8177a);
    private final h.h z = com.bytedance.android.livesdkapi.m.d.a(new ah(this));

    static {
        Covode.recordClassIndex(4081);
    }

    private final Handler H() {
        return (Handler) this.Q.getValue();
    }

    private final Context I() {
        return (Context) this.S.getValue();
    }

    public final PreviewBeautyWidget a() {
        return (PreviewBeautyWidget) this.w.getValue();
    }

    public final PreviewCoverWidget b() {
        return (PreviewCoverWidget) this.x.getValue();
    }

    public final PreviewHelpWidget c() {
        return (PreviewHelpWidget) this.y.getValue();
    }

    public final View d(int i2) {
        if (this.ac == null) {
            this.ac = new HashMap();
        }
        View view = (View) this.ac.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.ac.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final PreviewReverseCameraWidget d() {
        return (PreviewReverseCameraWidget) this.z.getValue();
    }

    public final PreviewSettingWidget e() {
        return (PreviewSettingWidget) this.A.getValue();
    }

    public final PreviewShareWidget f() {
        return (PreviewShareWidget) this.B.getValue();
    }

    public final PreviewStartLiveWidget g() {
        return (PreviewStartLiveWidget) this.C.getValue();
    }

    public final PreviewSeeMoreDetailWidget i() {
        return (PreviewSeeMoreDetailWidget) this.D.getValue();
    }

    public final PreviewTitleWidget j() {
        return (PreviewTitleWidget) this.E.getValue();
    }

    public final PreviewFollowerWidget k() {
        return (PreviewFollowerWidget) this.F.getValue();
    }

    public final PreviewLiveModeWidget l() {
        return (PreviewLiveModeWidget) this.G.getValue();
    }

    public final PreviewChangeOrientationWidget m() {
        return (PreviewChangeOrientationWidget) this.H.getValue();
    }

    public final PreviewReplayWidget n() {
        return (PreviewReplayWidget) this.I.getValue();
    }

    public final PreviewStickerWidget o() {
        return (PreviewStickerWidget) this.J.getValue();
    }

    public final LiveWidget p() {
        return (LiveWidget) this.K.getValue();
    }

    public final LiveWidget q() {
        return (LiveWidget) this.L.getValue();
    }

    public final PreviewDefinitionSelectionWidget r() {
        return (PreviewDefinitionSelectionWidget) this.M.getValue();
    }

    public final PreviewSelectGameCategoryWidget s() {
        return (PreviewSelectGameCategoryWidget) this.N.getValue();
    }

    public final PreviewLiveStudioPageWidget t() {
        return (PreviewLiveStudioPageWidget) this.O.getValue();
    }

    public final PreviewLiveStudioTipsWidget u() {
        return (PreviewLiveStudioTipsWidget) this.P.getValue();
    }

    public final n v() {
        return (n) this.R.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(4082);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.a.f
    public final /* bridge */ /* synthetic */ Fragment F() {
        return this;
    }

    public final void a(PrivacyCert privacyCert) {
        com.bytedance.android.live.u.h.a(new az(this, privacyCert));
        com.bytedance.android.live.u.h.a(ba.f8200a);
    }

    public final void a(boolean z2) {
        if (!z2) {
            d().hide();
            e().hide();
            f().hide();
            a().hide();
            o().hide();
            LiveWidget p2 = p();
            if (p2 != null) {
                p2.hide();
            }
            k().hide();
            v vVar = this.X;
            if (vVar == null) {
                h.f.b.l.a("mPreviewSlotHelper");
            }
            v.a aVar = vVar.f8298f;
            if (aVar != null) {
                aVar.a(false);
            }
            v vVar2 = this.X;
            if (vVar2 == null) {
                h.f.b.l.a("mPreviewSlotHelper");
            }
            v.a aVar2 = vVar2.f8299g;
            if (aVar2 != null) {
                aVar2.a(false);
            }
            com.bytedance.android.livesdk.utils.p.a(d(R.id.agp));
            b().hide();
            g().hide();
            LiveWidget liveWidget = this.f8164e;
            if (liveWidget != null) {
                liveWidget.hide();
            }
            n().b();
            PreviewSubscriptionWidget previewSubscriptionWidget = this.f8162c;
            if (previewSubscriptionWidget != null) {
                previewSubscriptionWidget.hide();
            }
        } else if (this.T || getView() == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("error_msg", this.T ? "isFinished" : "view is null");
            com.bytedance.android.live.core.d.c.a("ttlive_live_preview_show_widgets_fail", 1, hashMap);
        } else {
            L();
            com.bytedance.android.livesdk.utils.p.b(d(R.id.agp));
            b().show();
            g().show();
            n().a();
            DataChannel dataChannel = this.f8160a;
            if (dataChannel == null) {
                h.f.b.l.a("mDataChannel");
            }
            if (dataChannel.b(com.bytedance.android.live.broadcast.ab.class) == null) {
                LiveWidget p3 = p();
                if (p3 != null) {
                    p3.show();
                }
                v vVar3 = this.X;
                if (vVar3 == null) {
                    h.f.b.l.a("mPreviewSlotHelper");
                }
                v.a aVar3 = vVar3.f8298f;
                if (aVar3 != null) {
                    aVar3.a(true);
                }
                v vVar4 = this.X;
                if (vVar4 == null) {
                    h.f.b.l.a("mPreviewSlotHelper");
                }
                v.a aVar4 = vVar4.f8299g;
                if (aVar4 != null) {
                    aVar4.a(true);
                }
                LiveWidget liveWidget2 = this.f8164e;
                if (liveWidget2 != null) {
                    liveWidget2.show();
                }
            }
        }
    }

    static final class aa extends h.f.b.m implements h.f.a.a<PreviewCoverWidget> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(4083);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aa(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PreviewCoverWidget invoke() {
            return new PreviewCoverWidget(this.this$0);
        }
    }

    static final class ab extends h.f.b.m implements h.f.a.a<PreviewDefinitionSelectionWidget> {

        /* renamed from: a  reason: collision with root package name */
        public static final ab f8175a = new ab();

        static {
            Covode.recordClassIndex(4084);
        }

        ab() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PreviewDefinitionSelectionWidget invoke() {
            return new PreviewDefinitionSelectionWidget();
        }
    }

    static final class ac extends h.f.b.m implements h.f.a.a<PreviewFollowerWidget> {

        /* renamed from: a  reason: collision with root package name */
        public static final ac f8176a = new ac();

        static {
            Covode.recordClassIndex(4085);
        }

        ac() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PreviewFollowerWidget invoke() {
            return new PreviewFollowerWidget();
        }
    }

    static final class ad extends h.f.b.m implements h.f.a.a<PreviewHelpWidget> {

        /* renamed from: a  reason: collision with root package name */
        public static final ad f8177a = new ad();

        static {
            Covode.recordClassIndex(4086);
        }

        ad() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PreviewHelpWidget invoke() {
            return new PreviewHelpWidget();
        }
    }

    static final class ae extends h.f.b.m implements h.f.a.a<PreviewLiveModeWidget> {

        /* renamed from: a  reason: collision with root package name */
        public static final ae f8178a = new ae();

        static {
            Covode.recordClassIndex(4087);
        }

        ae() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PreviewLiveModeWidget invoke() {
            return new PreviewLiveModeWidget();
        }
    }

    static final class af extends h.f.b.m implements h.f.a.a<PreviewLoadEndWidget> {

        /* renamed from: a  reason: collision with root package name */
        public static final af f8179a = new af();

        static {
            Covode.recordClassIndex(4088);
        }

        af() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PreviewLoadEndWidget invoke() {
            return new PreviewLoadEndWidget();
        }
    }

    static final class ag extends h.f.b.m implements h.f.a.a<PreviewReplayWidget> {

        /* renamed from: a  reason: collision with root package name */
        public static final ag f8180a = new ag();

        static {
            Covode.recordClassIndex(4089);
        }

        ag() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PreviewReplayWidget invoke() {
            return new PreviewReplayWidget();
        }
    }

    static final class ai extends h.f.b.m implements h.f.a.a<PreviewSeeMoreDetailWidget> {

        /* renamed from: a  reason: collision with root package name */
        public static final ai f8181a = new ai();

        static {
            Covode.recordClassIndex(4091);
        }

        ai() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PreviewSeeMoreDetailWidget invoke() {
            return new PreviewSeeMoreDetailWidget();
        }
    }

    static final class at implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final at f8187a = new at();

        static {
            Covode.recordClassIndex(4105);
        }

        at() {
        }

        public final void run() {
            com.bytedance.android.live.effect.d.e().c();
        }
    }

    static final class bo extends h.f.b.m implements h.f.a.a<com.bytedance.android.livesdkapi.depend.c.a> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(4127);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        bo(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.android.livesdkapi.depend.c.a invoke() {
            return new com.bytedance.android.livesdkapi.depend.c.a(this.this$0);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<PreviewSelectGameCategoryWidget> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f8235a = new o();

        static {
            Covode.recordClassIndex(4142);
        }

        o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PreviewSelectGameCategoryWidget invoke() {
            return new PreviewSelectGameCategoryWidget();
        }
    }

    static final class r extends h.f.b.m implements h.f.a.a<PreviewLiveStudioPageWidget> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f8237a = new r();

        static {
            Covode.recordClassIndex(4145);
        }

        r() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PreviewLiveStudioPageWidget invoke() {
            return new PreviewLiveStudioPageWidget();
        }
    }

    static final class s extends h.f.b.m implements h.f.a.a<PreviewLiveStudioTipsWidget> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f8238a = new s();

        static {
            Covode.recordClassIndex(4146);
        }

        s() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PreviewLiveStudioTipsWidget invoke() {
            return new PreviewLiveStudioTipsWidget();
        }
    }

    static final class v extends h.f.b.m implements h.f.a.a<PreviewApplyWidget> {

        /* renamed from: a  reason: collision with root package name */
        public static final v f8241a = new v();

        static {
            Covode.recordClassIndex(4149);
        }

        v() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PreviewApplyWidget invoke() {
            return new PreviewApplyWidget();
        }
    }

    static final class x extends h.f.b.m implements h.f.a.a<PreviewChangeOrientationWidget> {

        /* renamed from: a  reason: collision with root package name */
        public static final x f8242a = new x();

        static {
            Covode.recordClassIndex(4152);
        }

        x() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PreviewChangeOrientationWidget invoke() {
            return new PreviewChangeOrientationWidget();
        }
    }

    static final class z extends h.f.b.m implements h.f.a.a<PreviewCommonNotifyWidget> {

        /* renamed from: a  reason: collision with root package name */
        public static final z f8243a = new z();

        static {
            Covode.recordClassIndex(4154);
        }

        z() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PreviewCommonNotifyWidget invoke() {
            return new PreviewCommonNotifyWidget();
        }
    }

    static final class ah extends h.f.b.m implements h.f.a.a<PreviewReverseCameraWidget> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(4090);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ah(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PreviewReverseCameraWidget invoke() {
            return new PreviewReverseCameraWidget(new j(this.this$0));
        }
    }

    static final class ak extends h.f.b.m implements h.f.a.a<PreviewShareWidget> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(4093);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ak(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PreviewShareWidget invoke() {
            return new PreviewShareWidget(this.this$0.f8168i);
        }
    }

    static final class ar implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final ar f8185a = new ar();

        static {
            Covode.recordClassIndex(4103);
        }

        ar() {
        }

        public final void run() {
            LivePerformanceManager.getInstance().monitorPerformance("create_live_preview");
        }
    }

    static final class as implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final as f8186a = new as();

        static {
            Covode.recordClassIndex(4104);
        }

        as() {
        }

        public final void run() {
            LivePerformanceManager.getInstance().initStartValue(1000);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class az extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ PrivacyCert $cert;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(4111);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        az(d dVar, PrivacyCert privacyCert) {
            super(0);
            this.this$0 = dVar;
            this.$cert = privacyCert;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            com.bytedance.android.livesdkapi.depend.model.a.e eVar = this.this$0.f8169j;
            if (eVar != null) {
                eVar.b(this.$cert);
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ba extends h.f.b.m implements h.f.a.a<h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final ba f8200a = new ba();

        static {
            Covode.recordClassIndex(4113);
        }

        ba() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            com.bytedance.android.live.effect.d.e().c();
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ PrivacyCert $cert;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(4128);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar, PrivacyCert privacyCert) {
            super(0);
            this.this$0 = dVar;
            this.$cert = privacyCert;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            com.bytedance.android.livesdkapi.depend.model.a.e eVar = this.this$0.f8169j;
            if (eVar != null) {
                eVar.a(this.$cert);
            }
            return h.z.f158842a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d$d  reason: collision with other inner class name */
    static final class C0125d extends h.f.b.m implements h.f.a.a<Context> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(4129);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0125d(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Context invoke() {
            return com.bytedance.android.live.design.a.a.a(this.this$0.getContext());
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f8236a = new p();

        static {
            Covode.recordClassIndex(4143);
        }

        p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<n> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(4144);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ n invoke() {
            return new n(this.this$0, new g(this.this$0));
        }
    }

    static final class y extends h.f.b.m implements h.f.a.a<PreviewCloseWidget> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(4153);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PreviewCloseWidget invoke() {
            return new PreviewCloseWidget(new i(this.this$0));
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.a.f
    public final String A() {
        String faceReshapeFilePath = com.bytedance.android.live.broadcast.p.INST.getFaceReshapeFilePath();
        h.f.b.l.b(faceReshapeFilePath, "");
        return faceReshapeFilePath;
    }

    @Override // com.bytedance.ies.sdk.datachannel.e
    public final DataChannel h() {
        DataChannel dataChannel = this.f8160a;
        if (dataChannel == null) {
            h.f.b.l.a("mDataChannel");
        }
        return dataChannel;
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.a.f
    public final String z() {
        String beautyFilePath = com.bytedance.android.live.broadcast.p.INST.getBeautyFilePath();
        h.f.b.l.b(beautyFilePath, "");
        return beautyFilePath;
    }

    static final class aj extends h.f.b.m implements h.f.a.a<PreviewSettingWidget> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(4092);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aj(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PreviewSettingWidget invoke() {
            androidx.fragment.app.i childFragmentManager = this.this$0.getChildFragmentManager();
            h.f.b.l.b(childFragmentManager, "");
            return new PreviewSettingWidget(childFragmentManager);
        }
    }

    static final class al extends h.f.b.m implements h.f.a.a<PreviewStartLiveWidget> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(4094);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        al(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PreviewStartLiveWidget invoke() {
            return new PreviewStartLiveWidget(this.this$0.f8168i, new h.f.a.b<Boolean, h.z>(this.this$0) {
                /* class com.bytedance.android.live.broadcast.preview.d.al.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(4095);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(Boolean bool) {
                    boolean booleanValue = bool.booleanValue();
                    d dVar = (d) this.receiver;
                    dVar.p = booleanValue;
                    if (booleanValue) {
                        com.bytedance.android.live.effect.d.a().b(dVar.s);
                        com.bytedance.android.live.effect.d.a().b(dVar.a().f8331b);
                        com.bytedance.android.live.u.f.c();
                        com.bytedance.android.live.core.f.j.a().removeCallbacksAndMessages(null);
                    }
                    return h.z.f158842a;
                }
            }, new k(this.this$0));
        }
    }

    static final class an extends h.f.b.m implements h.f.a.a<PreviewTitleWidget> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(4098);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        an(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PreviewTitleWidget invoke() {
            Long l2;
            User user = this.this$0.f8168i;
            if (user != null) {
                l2 = Long.valueOf(user.getId());
            } else {
                l2 = null;
            }
            return new PreviewTitleWidget(l2);
        }
    }

    static final class ao extends h.f.b.m implements h.f.a.a<LiveWidget> {

        /* renamed from: a  reason: collision with root package name */
        public static final ao f8182a = new ao();

        static {
            Covode.recordClassIndex(4099);
        }

        ao() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LiveWidget invoke() {
            com.bytedance.android.live.c.b bVar = (com.bytedance.android.live.c.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.c.b.class);
            if (bVar != null) {
                return bVar.getSelectDonationStickerWidget();
            }
            return null;
        }
    }

    static final class aw implements v.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f8190a;

        static {
            Covode.recordClassIndex(4108);
        }

        aw(d dVar) {
            this.f8190a = dVar;
        }

        @Override // com.bytedance.android.live.broadcast.preview.v.b
        public final void a() {
            d dVar = this.f8190a;
            dVar.a(dVar.w());
            d dVar2 = this.f8190a;
            dVar2.w();
            dVar2.y();
        }
    }

    static final class t extends h.f.b.m implements h.f.a.a<LiveWidget> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f8239a = new t();

        static {
            Covode.recordClassIndex(4147);
        }

        t() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LiveWidget invoke() {
            com.bytedance.android.live.c.b bVar = (com.bytedance.android.live.c.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.c.b.class);
            if (bVar != null) {
                return bVar.getSelectDonationStickerWidget();
            }
            return null;
        }
    }

    static final class w extends h.f.b.m implements h.f.a.a<PreviewBeautyWidget> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(4150);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PreviewBeautyWidget invoke() {
            AnonymousClass1 r3 = new h.f.a.b<Boolean, h.z>(this.this$0) {
                /* class com.bytedance.android.live.broadcast.preview.d.w.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(4151);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(Boolean bool) {
                    ((d) this.receiver).a(bool.booleanValue());
                    return h.z.f158842a;
                }
            };
            androidx.fragment.app.i childFragmentManager = this.this$0.getChildFragmentManager();
            h.f.b.l.b(childFragmentManager, "");
            return new PreviewBeautyWidget(r3, childFragmentManager, new h(this.this$0));
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.a.f
    public final int C() {
        com.bytedance.android.livesdk.ap.b<Integer> bVar = com.bytedance.android.livesdk.ap.a.f14015i;
        h.f.b.l.b(bVar, "");
        Integer b2 = bVar.b();
        h.f.b.l.b(b2, "");
        return b2.intValue();
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.a.f
    public final void E() {
        v().a();
        c.a.a("ttlive_page_hide").b("preview").a();
        com.bytedance.android.livesdk.performance.g.h();
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (!this.T) {
            v().a();
            this.V.send();
        }
        super.onDestroyView();
        HashMap hashMap = this.ac;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (!this.T) {
            c.a.a("ttlive_page_pause").b("preview").a();
            com.bytedance.android.livesdk.performance.g.h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        c.a.a("ttlive_page_start").b("preview").a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (!this.T) {
            c.a.a("ttlive_page_stop").b("preview").a();
        }
    }

    public final com.bytedance.android.livesdkapi.depend.model.live.i w() {
        DataChannel dataChannel = this.f8160a;
        if (dataChannel == null) {
            h.f.b.l.a("mDataChannel");
        }
        Object b2 = dataChannel.b(com.bytedance.android.live.broadcast.x.class);
        if (b2 == null) {
            h.f.b.l.b();
        }
        return (com.bytedance.android.livesdkapi.depend.model.live.i) b2;
    }

    public final void x() {
        ViewTreeObserver viewTreeObserver;
        View view = getView();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new b(this));
        }
    }

    static final class am extends h.f.b.m implements h.f.a.a<PreviewStickerWidget> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(4096);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        am(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PreviewStickerWidget invoke() {
            FrameLayout frameLayout = (FrameLayout) this.this$0.d(R.id.eac);
            h.f.b.l.b(frameLayout, "");
            return new PreviewStickerWidget(frameLayout, new h.f.a.b<Boolean, h.z>(this.this$0) {
                /* class com.bytedance.android.live.broadcast.preview.d.am.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(4097);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(Boolean bool) {
                    ((d) this.receiver).a(bool.booleanValue());
                    return h.z.f158842a;
                }
            }, new l(this.this$0));
        }
    }

    static final class aq implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f8183a;

        static {
            Covode.recordClassIndex(4101);
        }

        aq(d dVar) {
            this.f8183a = dVar;
        }

        public final void run() {
            com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class);
            h.f.b.l.b(a2, "");
            ((com.bytedance.android.live.i.a.d) a2).getGpuInfoFetcher().a(this.f8183a.getActivity(), this.f8183a.getView(), AnonymousClass1.f8184a);
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.live.broadcast.model.o f8227a;

        static {
            Covode.recordClassIndex(4130);
        }

        e(com.bytedance.android.live.broadcast.model.o oVar) {
            this.f8227a = oVar;
        }

        public final void run() {
            String str;
            com.bytedance.android.live.broadcast.model.o oVar = this.f8227a;
            String str2 = "";
            h.f.b.l.d(oVar, str2);
            com.bytedance.android.livesdk.ab.a b2 = c.a.b("ttlive_fetch_room_info_all").b("preview");
            ImageModel imageModel = oVar.f7939a;
            if (!(imageModel == null || (str = imageModel.mUri) == null)) {
                str2 = str;
            }
            com.bytedance.android.livesdk.ab.a a2 = b2.a("cover", str2).a("title", oVar.f7942d).a("cover_status", Long.valueOf(oVar.f7940b));
            a2.f13426c = true;
            a2.a();
        }
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f8228a;

        static {
            Covode.recordClassIndex(4131);
        }

        f(d dVar) {
            this.f8228a = dVar;
        }

        public final void run() {
            String str;
            this.f8228a.o = false;
            if (this.f8228a.f8172m > this.f8228a.n) {
                str = "zoom_in";
            } else if (this.f8228a.f8172m < this.f8228a.n) {
                str = "zoom_out";
            } else {
                str = "no_change";
            }
            b.a.a("livesdk_zoom_in").d("live_take_page").a("hand_gesture", str).b();
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ WidgetManager $this_apply;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(4137);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(WidgetManager widgetManager, d dVar) {
            super(0);
            this.$this_apply = widgetManager;
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            this.$this_apply.load(R.id.cda, this.this$0.l());
            WidgetManager widgetManager = this.$this_apply;
            PreviewLoadEndWidget previewLoadEndWidget = (PreviewLoadEndWidget) this.this$0.f8166g.getValue();
            AnonymousClass1 r1 = new h.f.a.a<h.z>(this) {
                /* class com.bytedance.android.live.broadcast.preview.d.l.AnonymousClass1 */
                final /* synthetic */ l this$0;

                static {
                    Covode.recordClassIndex(4138);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ h.z invoke() {
                    this.this$0.this$0.x();
                    return h.z.f158842a;
                }
            };
            h.f.b.l.d(r1, "");
            previewLoadEndWidget.f8380a = r1;
            widgetManager.load(R.id.awq, previewLoadEndWidget);
            return h.z.f158842a;
        }
    }

    private final boolean J() {
        if (com.bytedance.android.livesdk.userservice.u.a().b() != null) {
            return false;
        }
        com.bytedance.android.livesdk.utils.ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.gno);
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
        this.T = true;
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.a.f
    public final /* synthetic */ List B() {
        ArrayList arrayList = new ArrayList();
        for (T t2 : this.Y.a()) {
            arrayList.add(new Pair(t2.getName(), t2.getFilterPath()));
        }
        return arrayList;
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!this.T) {
            com.bytedance.android.live.core.performance.b.c(b.a.CreateStartLivePreview);
            c.a.a("ttlive_page_resume").b("preview").a();
            com.bytedance.android.livesdk.performance.g.g();
            com.bytedance.android.live.u.h.a(as.f8186a);
            com.bytedance.android.live.u.h.a(at.f8187a);
        }
    }

    static final class av implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f8189a;

        static {
            Covode.recordClassIndex(4107);
        }

        av(d dVar) {
            this.f8189a = dVar;
        }

        public final void run() {
            n v = this.f8189a.v();
            androidx.fragment.app.e eVar = v.f8257a;
            if (eVar != null && !eVar.isFinishing() && LiveNewEffectPanelSetting.INSTANCE.useOldPanel()) {
                if (com.bytedance.android.live.broadcast.p.INST.isLoadedRes()) {
                    v.b();
                    return;
                }
                IHostPlugin iHostPlugin = (IHostPlugin) com.bytedance.android.live.t.a.a(IHostPlugin.class);
                if (iHostPlugin != null && !iHostPlugin.isFull()) {
                    iHostPlugin.preload(com.bytedance.android.livesdk.h.a.LiveResource.getPackageName());
                }
                if (v.f8260d == null && v.f8258b != null && v.f8261e.isViewValid()) {
                    a.C0382a aVar = new a.C0382a(v.f8258b);
                    aVar.f18264a = new n.b(v);
                    v.f8260d = aVar.a();
                    com.bytedance.android.livesdk.l.a aVar2 = v.f8260d;
                    if (aVar2 != null) {
                        com.bytedance.android.livesdk.utils.p.a(aVar2);
                    }
                }
                com.bytedance.android.live.broadcast.p.INST.isLoadedRes.observe(v.f8261e, new n.c(v));
            }
        }
    }

    static final class ay implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f8192a;

        static {
            Covode.recordClassIndex(4110);
        }

        ay(d dVar) {
            this.f8192a = dVar;
        }

        public final void run() {
            String string;
            JSONObject a2;
            String string2;
            com.bytedance.android.livesdkapi.depend.model.live.i iVar;
            d dVar = this.f8192a;
            try {
                Bundle arguments = dVar.getArguments();
                if (arguments != null && (string = arguments.getString("sourceParams")) != null && (a2 = d.a(string)) != null && (string2 = a2.getString("child_tab")) != null) {
                    PreviewLiveModeWidget l2 = dVar.l();
                    int hashCode = string2.hashCode();
                    if (hashCode != -416447130) {
                        if (hashCode != 109824) {
                            if (hashCode == 1787034050) {
                                if (string2.equals("livestudio")) {
                                    iVar = com.bytedance.android.livesdkapi.depend.model.live.i.LIVE_STUDIO;
                                    l2.a(iVar, true);
                                }
                            }
                        } else if (string2.equals("obs")) {
                            iVar = com.bytedance.android.livesdkapi.depend.model.live.i.THIRD_PARTY;
                            l2.a(iVar, true);
                        }
                    } else if (string2.equals("screenshot")) {
                        iVar = com.bytedance.android.livesdkapi.depend.model.live.i.SCREEN_RECORD;
                        l2.a(iVar, true);
                    }
                    iVar = com.bytedance.android.livesdkapi.depend.model.live.i.VIDEO;
                    l2.a(iVar, true);
                }
            } catch (Exception e2) {
                com.bytedance.android.live.core.c.a.a(6, "LiveBroadcastPreviewFragment", "checkDefaultTab(). exception=".concat(String.valueOf(e2)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f8193a;

        static {
            Covode.recordClassIndex(4112);
        }

        b(d dVar) {
            this.f8193a = dVar;
        }

        public final void onGlobalLayout() {
            ConstraintLayout constraintLayout = (ConstraintLayout) this.f8193a.d(R.id.dtf);
            h.f.b.l.b(constraintLayout, "");
            int height = constraintLayout.getHeight();
            ScrollView scrollView = (ScrollView) this.f8193a.d(R.id.dte);
            h.f.b.l.b(scrollView, "");
            if (height <= scrollView.getHeight()) {
                com.bytedance.android.livesdk.utils.p.a(this.f8193a.d(R.id.bxz));
                return;
            }
            ImageView imageView = (ImageView) this.f8193a.d(R.id.bxz);
            h.f.b.l.b(imageView, "");
            if (imageView.getVisibility() != 0) {
                b.a.a("livesdk_more_icon_show").a(d.a(this.f8193a)).d("live_take_page").b();
            }
            com.bytedance.android.livesdk.utils.p.b(this.f8193a.d(R.id.bxz));
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ WidgetManager $this_apply;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(4133);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(WidgetManager widgetManager, d dVar) {
            super(0);
            this.$this_apply = widgetManager;
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            this.$this_apply.load(R.id.agr, this.this$0.b(), com.bytedance.android.live.u.g.a());
            this.$this_apply.load(R.id.fgk, this.this$0.p());
            this.$this_apply.load(R.id.cyh, this.this$0.q());
            if (LiveGameCategoryEntranceSetting.INSTANCE.shouldShow()) {
                this.$this_apply.load(R.id.dxe, this.this$0.s());
            }
            return h.z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ WidgetManager $this_apply;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(4135);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(WidgetManager widgetManager, d dVar) {
            super(0);
            this.$this_apply = widgetManager;
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            this.$this_apply.load(R.id.ajo, this.this$0.r());
            this.$this_apply.load(R.id.sc, this.this$0.a());
            this.$this_apply.load(R.id.dkz, this.this$0.n());
            this.$this_apply.load(R.id.ebv, this.this$0.o());
            this.$this_apply.load(R.id.en0, this.this$0.j());
            return h.z.f158842a;
        }
    }

    private final void K() {
        ImageModel imageModel;
        com.bytedance.android.livesdk.utils.z zVar = new com.bytedance.android.livesdk.utils.z(5, ((float) com.bytedance.common.utility.n.a(getContext())) / ((float) com.bytedance.common.utility.n.b(getContext())));
        User user = this.f8168i;
        ImageModel imageModel2 = null;
        if (user != null) {
            imageModel = user.getAvatarLarge();
        } else {
            imageModel = null;
        }
        if (imageModel != null) {
            HSImageView hSImageView = (HSImageView) d(R.id.dgo);
            User user2 = this.f8168i;
            if (user2 != null) {
                imageModel2 = user2.getAvatarLarge();
            }
            com.bytedance.android.live.core.f.k.a(hSImageView, imageModel2, zVar);
            return;
        }
        com.facebook.drawee.view.c cVar = (com.facebook.drawee.view.c) d(R.id.dgo);
        h.f.b.l.b(cVar, "");
        com.facebook.drawee.a.a.e b2 = com.facebook.drawee.a.a.c.b();
        com.facebook.imagepipeline.o.c a2 = com.facebook.imagepipeline.o.c.a(com.facebook.common.k.g.a((int) R.drawable.bx4));
        a2.f48454k = zVar;
        b2.f47315c = (REQUEST) a2.a();
        com.facebook.drawee.view.c cVar2 = (com.facebook.drawee.view.c) d(R.id.dgo);
        h.f.b.l.b(cVar2, "");
        b2.f47325m = cVar2.getController();
        cVar.setController(b2.e());
    }

    private final void L() {
        d().show();
        e().show();
        a().show();
        o().show();
        k().show();
        DataChannel dataChannel = this.f8160a;
        if (dataChannel == null) {
            h.f.b.l.a("mDataChannel");
        }
        if (dataChannel.b(com.bytedance.android.live.broadcast.ab.class) == null) {
            LiveWidget p2 = p();
            if (p2 != null) {
                p2.show();
            }
            v vVar = this.X;
            if (vVar == null) {
                h.f.b.l.a("mPreviewSlotHelper");
            }
            v.a aVar = vVar.f8298f;
            if (aVar != null) {
                aVar.a(true);
            }
            v vVar2 = this.X;
            if (vVar2 == null) {
                h.f.b.l.a("mPreviewSlotHelper");
            }
            v.a aVar2 = vVar2.f8299g;
            if (aVar2 != null) {
                aVar2.a(true);
            }
            LiveWidget liveWidget = this.f8164e;
            if (liveWidget != null) {
                liveWidget.show();
            }
        }
        f().show();
        b(w());
    }

    /* access modifiers changed from: package-private */
    public final void G() {
        boolean z2;
        DataChannel dataChannel = this.f8160a;
        if (dataChannel == null) {
            h.f.b.l.a("mDataChannel");
        }
        Object b2 = dataChannel.b(com.bytedance.android.live.broadcast.x.class);
        if (b2 == null) {
            h.f.b.l.b();
        }
        DataChannel dataChannel2 = this.f8160a;
        if (dataChannel2 == null) {
            h.f.b.l.a("mDataChannel");
        }
        com.bytedance.android.live.broadcast.model.o oVar = (com.bytedance.android.live.broadcast.model.o) dataChannel2.b(dg.class);
        if (oVar != null) {
            if (oVar.a() || b2 == com.bytedance.android.livesdkapi.depend.model.live.i.SCREEN_RECORD) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i2 = -1;
            if (z2) {
                ConstraintLayout constraintLayout = (ConstraintLayout) d(R.id.b3m);
                LiveWidget liveWidget = this.f8164e;
                if (liveWidget != null) {
                    i2 = liveWidget.getViewId();
                }
                com.bytedance.android.livesdk.utils.p.a(constraintLayout, i2, com.bytedance.android.live.core.f.y.d(R.dimen.xc));
                return;
            }
            ConstraintLayout constraintLayout2 = (ConstraintLayout) d(R.id.b3m);
            LiveWidget liveWidget2 = this.f8164e;
            if (liveWidget2 != null) {
                i2 = liveWidget2.getViewId();
            }
            com.bytedance.android.livesdk.utils.p.a(constraintLayout2, i2, 0);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        DataChannel dataChannel = this.f8160a;
        if (dataChannel == null) {
            h.f.b.l.a("mDataChannel");
        }
        dataChannel.b(this);
        this.Y.b(this.s);
        com.bytedance.android.live.effect.d.e().b(this.aa);
        if (!this.p) {
            com.bytedance.android.live.effect.d.e().b();
            this.Y.b();
            com.bytedance.android.livesdk.performance.g.i();
            com.bytedance.android.live.u.f.c();
            com.bytedance.android.live.core.f.j.a().removeCallbacksAndMessages(null);
            com.bytedance.android.b.a();
            ((com.bytedance.android.live.p.h) com.bytedance.android.live.t.a.a(com.bytedance.android.live.p.h.class)).releaseToolbarView();
        }
        H().removeCallbacksAndMessages(null);
        com.bytedance.android.live.broadcast.g.b.f7876a = null;
        c.a.a("ttlive_page_destroy").b("preview").a();
    }

    public final void y() {
        Integer num;
        PreviewSubscriptionWidget previewSubscriptionWidget;
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.a((ConstraintLayout) d(R.id.dtf));
        bVar.a(e().getViewId(), 3);
        int viewId = e().getViewId();
        v vVar = this.X;
        if (vVar == null) {
            h.f.b.l.a("mPreviewSlotHelper");
        }
        v.a aVar = vVar.f8299g;
        if ((aVar == null || (num = aVar.a()) == null) && ((previewSubscriptionWidget = this.f8162c) == null || (num = Integer.valueOf(previewSubscriptionWidget.getViewId())) == null)) {
            num = Integer.valueOf(f().getViewId());
        }
        h.f.b.l.b(num, "");
        bVar.a(viewId, 3, num.intValue(), 4, com.bytedance.android.live.core.f.y.a(16.0f));
        bVar.b((ConstraintLayout) d(R.id.dtf));
    }

    static final class i extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ WidgetManager $this_apply;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(4134);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(WidgetManager widgetManager, d dVar) {
            super(0);
            this.$this_apply = widgetManager;
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            this.$this_apply.load(R.id.ce0, this.this$0.t());
            this.$this_apply.load(R.id.dwt, this.this$0.i());
            this.$this_apply.load(R.id.a82, (PreviewCloseWidget) this.this$0.f8161b.getValue());
            this.$this_apply.load(R.id.e01, this.this$0.e());
            this.$this_apply.load(R.id.dmj, this.this$0.d());
            this.$this_apply.load(R.id.bg0, this.this$0.c());
            this.$this_apply.load(R.id.e2d, this.this$0.f());
            if (User.sSubPermission) {
                d dVar = this.this$0;
                androidx.fragment.app.i childFragmentManager = this.this$0.getChildFragmentManager();
                h.f.b.l.b(childFragmentManager, "");
                dVar.f8162c = new PreviewSubscriptionWidget(childFragmentManager);
                this.$this_apply.load(R.id.edx, this.this$0.f8162c);
            }
            return h.z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ WidgetManager $this_apply;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(4136);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(WidgetManager widgetManager, d dVar) {
            super(0);
            this.$this_apply = widgetManager;
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            this.$this_apply.load(R.id.e9u, this.this$0.g());
            if (RemoveOnlineFollowersSetting.INSTANCE.show()) {
                this.$this_apply.load(R.id.b8d, this.this$0.k());
            }
            this.$this_apply.load(R.id.lg, (PreviewApplyWidget) this.this$0.f8163d.getValue());
            this.$this_apply.load(R.id.a4h, this.this$0.m());
            this.$this_apply.load(R.id.bem, this.this$0.f8164e);
            this.$this_apply.load(R.id.cy8, (PreviewCommonNotifyWidget) this.this$0.r.getValue());
            if (LiveObsBroadcastGuideStrategySetting.INSTANCE.getValue() != 0) {
                this.this$0.f8165f = new ObsBroadcastGuideWidget();
                this.$this_apply.load(R.id.cyf, this.this$0.f8165f);
            }
            this.$this_apply.load(R.id.ce1, this.this$0.u());
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.a.f
    public final void D() {
        String str;
        int i2 = 1;
        DataChannelGlobal.f34575d.a(com.bytedance.android.livesdk.j.bb.class, true);
        if (LiveResumeLiveSetting.INSTANCE.resumeLiveEnabled()) {
            o.a aVar = new o.a((com.bytedance.android.livesdkapi.depend.c.a) this.Z.getValue(), w());
            aVar.f12093h = 40;
            ((RoomRetrofitApi) com.bytedance.android.live.network.e.a().a(RoomRetrofitApi.class)).continuePreviousRoom().a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new com.bytedance.android.livesdk.chatroom.b.u(aVar), new com.bytedance.android.livesdk.chatroom.b.v(aVar));
        }
        if (this.f8160a != null) {
            if (com.bytedance.android.livesdkapi.depend.model.live.j.b(w())) {
                a(PrivacyCert.Builder.Companion.with("bpea-598").usage("").tag("[Live Preview] open camera when live mode is video").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
            } else {
                b(PrivacyCert.Builder.Companion.with("bpea-603").usage("").tag("[Live Preview] close camera when live mode is not video").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
            }
        }
        c.a.a("ttlive_page_show").b("preview").a();
        DataChannel dataChannel = this.f8160a;
        if (dataChannel == null) {
            h.f.b.l.a("mDataChannel");
        }
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey("hashtag_id") || !arguments.containsKey("hashtag_title")) {
            com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.cz;
            h.f.b.l.b(bVar, "");
            Boolean a2 = bVar.a();
            h.f.b.l.b(a2, "");
            if (!a2.booleanValue()) {
                i2 = 0;
            }
        } else {
            i2 = 2;
        }
        com.bytedance.android.livesdk.ab.b a3 = com.bytedance.android.livesdk.ab.c.a(b.a.a("livesdk_pm_live_takepage_show").b("live_take").c("show").d("live_take_page"), dataChannel);
        String str2 = null;
        if (arguments != null) {
            str = arguments.getString("request_from");
        } else {
            str = null;
        }
        if (arguments != null) {
            str2 = arguments.getString("enter_from");
        }
        a3.a("enter_from", t.a(str, str2)).a("has_ever_set_hashtag", i2).b();
        com.bytedance.android.livesdk.performance.g.g();
    }

    public static final class u implements f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f8240a;

        static {
            Covode.recordClassIndex(4148);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        u(d dVar) {
            this.f8240a = dVar;
        }

        @Override // com.bytedance.android.live.effect.api.f.a
        public final void a(FilterModel filterModel, float f2) {
            h.f.b.l.d(filterModel, "");
            com.bytedance.android.livesdkapi.depend.model.a.e eVar = this.f8240a.f8169j;
            if (eVar != null) {
                filterModel.getFilterId();
                eVar.d(f2);
            }
        }

        @Override // com.bytedance.android.live.effect.api.f.a
        public final void a(int i2, boolean z, boolean z2) {
            com.bytedance.android.livesdkapi.depend.model.a.e eVar = this.f8240a.f8169j;
            if (eVar != null) {
                eVar.a(i2);
            }
        }
    }

    static JSONObject a(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.a.f
    public final float c(int i2) {
        return this.Y.a(i2);
    }

    static final class bf extends h.f.b.m implements h.f.a.b<com.bytedance.android.livesdkapi.depend.model.live.i, h.z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(4118);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        bf(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.android.livesdkapi.depend.model.live.i iVar) {
            com.bytedance.android.livesdkapi.depend.model.live.i iVar2 = iVar;
            h.f.b.l.d(iVar2, "");
            this.this$0.a(iVar2, false);
            return h.z.f158842a;
        }
    }

    static final class bg extends h.f.b.m implements h.f.a.b<com.bytedance.android.livesdkapi.depend.model.live.i, h.z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(4119);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        bg(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.android.livesdkapi.depend.model.live.i iVar) {
            com.bytedance.android.livesdkapi.depend.model.live.i iVar2 = iVar;
            h.f.b.l.d(iVar2, "");
            this.this$0.a(iVar2, true);
            return h.z.f158842a;
        }
    }

    public static final /* synthetic */ DataChannel a(d dVar) {
        DataChannel dataChannel = dVar.f8160a;
        if (dataChannel == null) {
            h.f.b.l.a("mDataChannel");
        }
        return dataChannel;
    }

    static final class ap extends h.f.b.m implements h.f.a.b<Widget, h.z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(4100);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ap(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Widget widget) {
            Widget widget2 = widget;
            d dVar = this.this$0;
            if (widget2 instanceof PreviewLiveModeWidget) {
                widget2.contentView.post(new ay(dVar));
            }
            return h.z.f158842a;
        }
    }

    static final class bc<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final bc f8202a = new bc();

        static {
            Covode.recordClassIndex(4115);
        }

        bc() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            h.f.b.l.b(th, "");
            h.f.b.l.d(th, "");
            com.bytedance.android.livesdk.ab.a b2 = b.a.b("ttlive_fetch_room_info_all", th).b("preview");
            b2.f13428e = true;
            b2.a();
        }
    }

    static final class bd<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f8203a;

        static {
            Covode.recordClassIndex(4116);
        }

        bd(d dVar) {
            this.f8203a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            if (dVar != null) {
                DataChannel a2 = d.a(this.f8203a);
                Map<String, i.a> map = ((com.bytedance.android.live.broadcast.model.i) dVar.data).f7914a;
                h.f.b.l.b(map, "");
                a2.b(com.bytedance.android.live.broadcast.z.class, map);
            }
        }
    }

    public final void b(PrivacyCert privacyCert) {
        com.bytedance.android.live.u.h.a(new c(this, privacyCert));
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater cloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(I());
        h.f.b.l.b(cloneInContext, "");
        return cloneInContext;
    }

    static final class bi extends h.f.b.m implements h.f.a.b<Boolean, h.z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(4121);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        bi(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Boolean bool) {
            if (!bool.booleanValue() || (!com.bytedance.android.livesdkapi.depend.model.live.j.b(this.this$0.w()) && !com.bytedance.android.livesdkapi.depend.model.live.j.e(this.this$0.w()))) {
                this.this$0.k().hide();
            } else {
                this.this$0.k().show();
            }
            return h.z.f158842a;
        }
    }

    static final class n implements e.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f8232a;

        static {
            Covode.recordClassIndex(4140);
        }

        n(d dVar) {
            this.f8232a = dVar;
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.a.e.a
        public final void a(final int i2) {
            androidx.fragment.app.e activity;
            if (this.f8232a.f8170k && System.currentTimeMillis() - this.f8232a.f8171l > 100) {
                this.f8232a.f8171l = System.currentTimeMillis();
                if (com.bytedance.android.livesdkapi.depend.model.live.j.b(this.f8232a.w()) && (activity = this.f8232a.getActivity()) != null) {
                    activity.runOnUiThread(new Runnable(this) {
                        /* class com.bytedance.android.live.broadcast.preview.d.n.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ n f8233a;

                        static {
                            Covode.recordClassIndex(4141);
                        }

                        {
                            this.f8233a = r1;
                        }

                        public final void run() {
                            int i2;
                            LinearLayout linearLayout = (LinearLayout) this.f8233a.f8232a.d(R.id.cfi);
                            if (linearLayout != null) {
                                if (i2 == 0) {
                                    i2 = 0;
                                } else {
                                    i2 = 8;
                                }
                                linearLayout.setVisibility(i2);
                            }
                        }
                    });
                }
            }
        }
    }

    static final class be extends h.f.b.m implements h.f.a.b<Boolean, h.z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(4117);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        be(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Boolean bool) {
            if (!bool.booleanValue()) {
                this.this$0.b(PrivacyCert.Builder.Companion.with("bpea-600").usage("").tag("[Live Preview] close camera when recerving event").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
            } else if (com.bytedance.android.livesdkapi.depend.model.live.j.b(this.this$0.w())) {
                this.this$0.a(PrivacyCert.Builder.Companion.with("bpea-599").usage("").tag("[Live Preview] open camera when recerving event").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
            }
            return h.z.f158842a;
        }
    }

    static final class bj extends h.f.b.m implements h.f.a.b<com.bytedance.android.live.broadcast.model.o, h.z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(4122);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        bj(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.android.live.broadcast.model.o oVar) {
            com.bytedance.android.live.broadcast.model.o oVar2 = oVar;
            h.f.b.l.d(oVar2, "");
            if (!LiveGameCategoryEntranceSetting.INSTANCE.shouldShow() || !oVar2.s || (!com.bytedance.android.livesdkapi.depend.model.live.j.f(this.this$0.w()) && !com.bytedance.android.livesdkapi.depend.model.live.j.e(this.this$0.w()))) {
                this.this$0.s().hide();
            } else {
                this.this$0.s().show();
            }
            return h.z.f158842a;
        }
    }

    private final void b(com.bytedance.android.livesdkapi.depend.model.live.i iVar) {
        int viewId;
        if (iVar != null) {
            androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
            bVar.a((ConstraintLayout) d(R.id.dtf));
            bVar.a(f().getViewId(), 3);
            int viewId2 = f().getViewId();
            if (e.f8244a[iVar.ordinal()] != 1) {
                viewId = o().getViewId();
            } else {
                viewId = m().getViewId();
            }
            bVar.a(viewId2, 3, viewId, 4, com.bytedance.android.live.core.f.y.a(16.0f));
            bVar.b((ConstraintLayout) d(R.id.dtf));
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.a.f
    public final void a(float f2) {
        if (!this.o) {
            this.n = f2;
            this.o = true;
        }
        this.f8172m = f2;
        Handler H2 = H();
        Runnable runnable = this.W;
        if (runnable == null) {
            h.f.b.l.a("mZoomScaleReportRunnable");
        }
        H2.removeCallbacks(runnable);
        Handler H3 = H();
        Runnable runnable2 = this.W;
        if (runnable2 == null) {
            h.f.b.l.a("mZoomScaleReportRunnable");
        }
        H3.postDelayed(runnable2, 3000);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        if (!this.T) {
            androidx.fragment.app.e activity = getActivity();
            if (!(activity == null || (window = activity.getWindow()) == null)) {
                window.setSoftInputMode(48);
            }
            com.bytedance.android.live.u.h.a(new aq(this));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("device_score", Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
            com.bytedance.android.live.core.d.c.a("ttlive_enter_preview_page_duration", System.currentTimeMillis() - this.U, jSONObject);
            b.a.a("livesdk_broadcast_duration").a("preview_create_launch", System.currentTimeMillis() - this.U).b();
        }
    }

    static final class ax implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f8191a;

        static {
            Covode.recordClassIndex(4109);
        }

        ax(d dVar) {
            this.f8191a = dVar;
        }

        public final void onClick(View view) {
            boolean z;
            d dVar = this.f8191a;
            if (!dVar.q) {
                ((ScrollView) this.f8191a.d(R.id.dte)).fullScroll(130);
                ((ImageView) this.f8191a.d(R.id.bxz)).setImageDrawable(com.bytedance.android.live.core.f.y.c(2131234501));
                ScrollView scrollView = (ScrollView) this.f8191a.d(R.id.dte);
                h.f.b.l.b(scrollView, "");
                ViewGroup.LayoutParams layoutParams = scrollView.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams;
                aVar.bottomMargin = com.bytedance.android.live.core.f.y.a(64.0f);
                ScrollView scrollView2 = (ScrollView) this.f8191a.d(R.id.dte);
                h.f.b.l.b(scrollView2, "");
                scrollView2.setLayoutParams(aVar);
                t.a(d.a(this.f8191a), "unfold");
                z = true;
            } else {
                ((ScrollView) this.f8191a.d(R.id.dte)).fullScroll(33);
                ((ImageView) this.f8191a.d(R.id.bxz)).setImageDrawable(com.bytedance.android.live.core.f.y.c(2131234476));
                ScrollView scrollView3 = (ScrollView) this.f8191a.d(R.id.dte);
                h.f.b.l.b(scrollView3, "");
                ViewGroup.LayoutParams layoutParams2 = scrollView3.getLayoutParams();
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.a aVar2 = (ConstraintLayout.a) layoutParams2;
                aVar2.bottomMargin = com.bytedance.android.live.core.f.y.a(120.0f);
                ScrollView scrollView4 = (ScrollView) this.f8191a.d(R.id.dte);
                h.f.b.l.b(scrollView4, "");
                scrollView4.setLayoutParams(aVar2);
                t.a(d.a(this.f8191a), "fold");
                z = false;
            }
            dVar.q = z;
        }
    }

    static final class bh extends h.f.b.m implements h.f.a.b<com.bytedance.android.live.broadcast.model.m, h.z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(4120);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        bh(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.android.live.broadcast.model.m mVar) {
            com.bytedance.android.live.broadcast.model.m mVar2 = mVar;
            h.f.b.l.d(mVar2, "");
            d dVar = this.this$0;
            if (dVar.f8167h != com.bytedance.android.livesdkapi.depend.model.live.i.LIVE_STUDIO) {
                DataChannel dataChannel = dVar.f8160a;
                if (dataChannel == null) {
                    h.f.b.l.a("mDataChannel");
                }
                b.a.a("livesdk_live_banned_toast_show").a(dataChannel).c("show").b();
                Context context = dVar.getContext();
                if (context != null) {
                    h.f.b.l.b(context, "");
                    DataChannel dataChannel2 = dVar.f8160a;
                    if (dataChannel2 == null) {
                        h.f.b.l.a("mDataChannel");
                    }
                    h.f.b.l.d(context, "");
                    h.f.b.l.d(dataChannel2, "");
                    h.f.b.l.d(mVar2, "");
                    SpannableString spannableString = new SpannableString(mVar2.f7931a + q.a());
                    q.b bVar = new q.b(spannableString);
                    spannableString.setSpan(new AbsoluteSizeSpan(com.bytedance.android.live.core.f.y.a(12.0f)), 0, spannableString.length(), 17);
                    bVar.a(new q.a(context, mVar2, dataChannel2));
                    bVar.a(new AbsoluteSizeSpan(com.bytedance.android.live.core.f.y.a(12.0f)));
                    bVar.a(new FontSpan(com.bytedance.ies.dmt.ui.widget.util.d.f33801g));
                    dataChannel2.c(com.bytedance.android.live.broadcast.f.class, new com.bytedance.android.live.broadcast.model.k(0, com.bytedance.android.live.broadcast.model.l.NORMAL_BLOCK, spannableString));
                }
                dVar.n().hide();
                LiveWidget p = dVar.p();
                if (p != null) {
                    p.hide();
                }
                LiveWidget q = dVar.q();
                if (q != null) {
                    q.hide();
                }
                ObsBroadcastGuideWidget obsBroadcastGuideWidget = dVar.f8165f;
                if (obsBroadcastGuideWidget != null) {
                    obsBroadcastGuideWidget.hide();
                }
                LiveWidget liveWidget = dVar.f8164e;
                if (liveWidget != null) {
                    liveWidget.hide();
                }
                dVar.s().hide();
            }
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.a.f
    public final void a(int i2) {
        com.bytedance.android.livesdk.ap.b<Integer> bVar = com.bytedance.android.livesdk.ap.a.f14015i;
        h.f.b.l.b(bVar, "");
        bVar.b(Integer.valueOf(i2));
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.a.f
    public final void b(int i2) {
        String str;
        Dialog dialog;
        if (isAdded()) {
            Fragment a2 = getChildFragmentManager().a("LiveBeautyFilterDialogFragment");
            if (!(a2 instanceof androidx.fragment.app.d)) {
                a2 = null;
            }
            androidx.fragment.app.d dVar = (androidx.fragment.app.d) a2;
            if (!(dVar == null || (dialog = dVar.getDialog()) == null || !dialog.isShowing())) {
                return;
            }
        }
        com.bytedance.android.livesdk.ap.b<Integer> bVar = com.bytedance.android.livesdk.ap.a.O;
        h.f.b.l.b(bVar, "");
        Integer a3 = bVar.a();
        if (a3 == null || a3.intValue() != i2) {
            List<FilterModel> a4 = this.Y.a();
            DataChannel dataChannel = this.f8160a;
            if (dataChannel == null) {
                h.f.b.l.a("mDataChannel");
            }
            h.f.b.l.d(a4, "");
            com.bytedance.android.live.effect.api.d g2 = com.bytedance.android.live.effect.d.g();
            if (i2 < a4.size()) {
                str = a4.get(i2).getFilterId();
            } else {
                str = "";
            }
            h.f.b.l.b(str, "");
            g2.a(dataChannel, false, str, false, i2 + 1);
            com.bytedance.android.livesdk.ap.b<Integer> bVar2 = com.bytedance.android.livesdk.ap.a.O;
            h.f.b.l.b(bVar2, "");
            com.bytedance.android.livesdk.ap.c.a(bVar2, Integer.valueOf(i2));
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.c.a.AbstractC0502a
    public final void handleMsg(Message message) {
        if (message != null && message.what == 40) {
            Room room = null;
            if (message.obj instanceof Room) {
                Object obj = message.obj;
                if (obj instanceof Room) {
                    room = obj;
                }
                Room room2 = room;
                DataChannelGlobal.f34575d.a(com.bytedance.android.livesdk.j.ac.class, room2);
                b.a b2 = new b.a(getContext()).a(R.string.dsu).b(R.string.dsr).a(R.string.dss, (DialogInterface.OnClickListener) new bk(this, room2), false).b(R.string.dst, (DialogInterface.OnClickListener) new bl(this), false);
                b2.f18296m = false;
                b2.a().show();
                DataChannel dataChannel = this.f8160a;
                if (dataChannel == null) {
                    h.f.b.l.a("mDataChannel");
                }
                t.b("show", dataChannel);
            } else if (message.obj instanceof com.bytedance.android.live.a.a.b.a) {
                Object obj2 = message.obj;
                if (obj2 instanceof com.bytedance.android.live.a.a.b.a) {
                    room = obj2;
                }
                com.bytedance.android.live.a.a.a aVar = room;
                if (aVar != null && aVar.getErrorCode() == 30005 && getContext() != null) {
                    DataChannel dataChannel2 = this.f8160a;
                    if (dataChannel2 == null) {
                        h.f.b.l.a("mDataChannel");
                    }
                    t.a("show", dataChannel2);
                    b.a b3 = new b.a(getContext()).a(R.string.e7h).b(R.string.e7i).a(R.string.e1b, (DialogInterface.OnClickListener) new bm(this), false).b(R.string.ei5, (DialogInterface.OnClickListener) new bn(this), false);
                    b3.f18296m = false;
                    b3.a().show();
                }
            }
        }
    }

    static final class bb<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f8201a;

        static {
            Covode.recordClassIndex(4114);
        }

        bb(d dVar) {
            this.f8201a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            androidx.fragment.app.e a2;
            Hashtag hashtag;
            String str;
            Long l2;
            d dVar = this.f8201a;
            com.bytedance.android.live.broadcast.model.o oVar = (com.bytedance.android.live.broadcast.model.o) ((com.bytedance.android.live.network.response.d) obj).data;
            if (oVar != null) {
                com.bytedance.android.live.u.g.b(new e(oVar));
                DataChannel dataChannel = dVar.f8160a;
                if (dataChannel == null) {
                    h.f.b.l.a("mDataChannel");
                }
                String str2 = oVar.p.f7913b;
                h.f.b.l.b(str2, "");
                boolean z2 = true;
                if (str2.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                long j2 = 0;
                if (!z || oVar.p.f7912a <= 0) {
                    z2 = false;
                }
                dataChannel.b(com.bytedance.android.live.broadcast.w.class, Boolean.valueOf(z2));
                DataChannel dataChannel2 = dVar.f8160a;
                if (dataChannel2 == null) {
                    h.f.b.l.a("mDataChannel");
                }
                dataChannel2.b(dg.class, oVar);
                com.bytedance.android.live.broadcast.model.d dVar2 = oVar.f7949k;
                if (dVar2 != null && dVar2.f7900b) {
                    DataChannel dataChannel3 = dVar.f8160a;
                    if (dataChannel3 == null) {
                        h.f.b.l.a("mDataChannel");
                    }
                    dataChannel3.b(com.bytedance.android.live.broadcast.ab.class, new com.bytedance.android.live.broadcast.model.m(dVar2.f7899a, 0));
                }
                dVar.G();
                Hashtag hashtag2 = oVar.o;
                if (LiveHashTagAnchorShowEntrance.INSTANCE.getValue()) {
                    DataChannel dataChannel4 = dVar.f8160a;
                    if (dataChannel4 == null) {
                        h.f.b.l.a("mDataChannel");
                    }
                    Hashtag hashtag3 = (Hashtag) dataChannel4.b(com.bytedance.android.livesdk.j.aq.class);
                    if (!com.bytedance.android.livesdk.model.af.a(hashtag2) && com.bytedance.android.livesdk.model.af.a(hashtag3)) {
                        com.bytedance.android.livesdk.utils.ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.ec5);
                    }
                    DataChannel dataChannel5 = dVar.f8160a;
                    if (dataChannel5 == null) {
                        h.f.b.l.a("mDataChannel");
                    }
                    if (hashtag2 == null) {
                        hashtag = new Hashtag(0L, "", null, 4, null);
                    } else {
                        hashtag = hashtag2;
                    }
                    dataChannel5.b(com.bytedance.android.livesdk.j.aq.class, hashtag);
                    com.bytedance.android.livesdk.ap.b<Long> bVar = com.bytedance.android.livesdk.ap.a.cx;
                    h.f.b.l.b(bVar, "");
                    if (!(hashtag2 == null || (l2 = hashtag2.id) == null)) {
                        j2 = l2.longValue();
                    }
                    com.bytedance.android.livesdk.ap.c.a(bVar, Long.valueOf(j2));
                    com.bytedance.android.livesdk.ap.b<String> bVar2 = com.bytedance.android.livesdk.ap.a.cy;
                    h.f.b.l.b(bVar2, "");
                    if (hashtag2 == null || (str = hashtag2.title) == null) {
                        str = "none";
                    }
                    com.bytedance.android.livesdk.ap.c.a(bVar2, str);
                }
                Context context = dVar.getContext();
                if (context != null && (a2 = com.bytedance.android.livesdk.utils.p.a(context)) != null) {
                    int i2 = oVar.t;
                    DataChannel dataChannel6 = dVar.f8160a;
                    if (dataChannel6 == null) {
                        h.f.b.l.a("mDataChannel");
                    }
                    p.a(a2, i2, dataChannel6, new f(dVar));
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.a.f
    public final void a(com.bytedance.android.livesdkapi.depend.model.a.e eVar) {
        this.f8169j = eVar;
        if (eVar != null) {
            eVar.a(this.ab);
        }
    }

    public final void a(com.bytedance.android.livesdkapi.depend.model.live.i iVar) {
        Integer a2;
        int viewId;
        int viewId2;
        int a3;
        Boolean bool;
        Integer a4;
        int viewId3;
        v vVar = this.X;
        if (vVar == null) {
            h.f.b.l.a("mPreviewSlotHelper");
        }
        v.a aVar = vVar.f8298f;
        if (!(aVar == null || (a4 = aVar.a()) == null)) {
            if (com.bytedance.android.livesdkapi.depend.model.live.j.c(iVar)) {
                viewId3 = e().getViewId();
            } else {
                viewId3 = d().getViewId();
            }
            androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
            bVar.a((ConstraintLayout) d(R.id.dtf));
            h.f.b.l.b(a4, "");
            bVar.a(a4.intValue(), 3);
            bVar.a(a4.intValue(), 3, e().getViewId(), 4, com.bytedance.android.live.core.f.y.a(8.0f));
            bVar.a(a4.intValue(), 6, viewId3, 6);
            bVar.a(a4.intValue(), 7, viewId3, 7);
            bVar.b((ConstraintLayout) d(R.id.dtf));
        }
        v vVar2 = this.X;
        if (vVar2 == null) {
            h.f.b.l.a("mPreviewSlotHelper");
        }
        v.a aVar2 = vVar2.f8299g;
        if (aVar2 != null && (a2 = aVar2.a()) != null) {
            if (!com.bytedance.android.livesdkapi.depend.model.live.j.c(iVar)) {
                viewId = d().getViewId();
            } else if (c().isShowing()) {
                viewId = c().getViewId();
            } else {
                viewId = e().getViewId();
            }
            androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
            bVar2.a((ConstraintLayout) d(R.id.dtf));
            h.f.b.l.b(a2, "");
            bVar2.a(a2.intValue(), 3);
            int intValue = a2.intValue();
            PreviewSubscriptionWidget previewSubscriptionWidget = this.f8162c;
            if (previewSubscriptionWidget != null) {
                viewId2 = previewSubscriptionWidget.getViewId();
            } else if (com.bytedance.android.livesdkapi.depend.model.live.j.e(iVar)) {
                viewId2 = c().getViewId();
            } else {
                viewId2 = f().getViewId();
            }
            bVar2.a(intValue, 3, viewId2, 4, 0);
            bVar2.a(a2.intValue(), 6, viewId, 6);
            bVar2.a(a2.intValue(), 7, viewId, 7);
            bVar2.b((ConstraintLayout) d(R.id.dtf));
            v vVar3 = this.X;
            if (vVar3 == null) {
                h.f.b.l.a("mPreviewSlotHelper");
            }
            v.a aVar3 = vVar3.f8299g;
            if (aVar3 != null) {
                if (com.bytedance.android.livesdkapi.depend.model.live.j.e(iVar)) {
                    PreviewSubscriptionWidget previewSubscriptionWidget2 = this.f8162c;
                    if (previewSubscriptionWidget2 != null) {
                        bool = Boolean.valueOf(previewSubscriptionWidget2.isShowing());
                    } else {
                        bool = null;
                    }
                    if (com.bytedance.android.livesdk.utils.p.b(bool)) {
                        a3 = 0;
                        aVar3.a(a3);
                    }
                }
                a3 = com.bytedance.android.live.core.f.y.a(16.0f);
                aVar3.a(a3);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        long j2;
        String str2;
        int i2;
        Hashtag hashtag;
        String str3;
        com.bytedance.android.live.p.q qVar;
        Long l2;
        com.bytedance.android.livesdk.performance.b value;
        LiveEnableALogSetting.INSTANCE.update();
        com.bytedance.android.livesdk.ab.m.f13604j = true;
        String str4 = null;
        androidx.lifecycle.ad a2 = androidx.lifecycle.ae.a(this, (ad.b) null);
        h.f.b.l.b(a2, "");
        DataChannel a3 = DataChannel.a.a(a2, this);
        this.f8160a = a3;
        if (a3 == null) {
            h.f.b.l.a("mDataChannel");
        }
        a3.a(com.bytedance.android.livesdk.j.ao.class, getChildFragmentManager());
        super.onCreate(bundle);
        com.bytedance.android.livesdk.utils.al.f22240a = true;
        com.bytedance.android.live.u.h.a();
        com.bytedance.android.livesdk.performance.g.f20233d = true;
        h.h<com.bytedance.android.livesdk.performance.b> hVar = com.bytedance.android.livesdk.performance.g.f20231b.get("preview_enter");
        if (!(hVar == null || (value = hVar.getValue()) == null)) {
            value.a();
            value.f20200c = true;
            com.bytedance.android.livesdk.performance.g.a().postDelayed(new g.c(value), com.bytedance.android.livesdk.performance.g.f20230a);
        }
        com.bytedance.android.livesdk.model.k.PREVIEW.config();
        DataChannel dataChannel = this.f8160a;
        if (dataChannel == null) {
            h.f.b.l.a("mDataChannel");
        }
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("enter_from_type")) == null) {
            str = "";
        }
        dataChannel.a(com.bytedance.android.live.broadcast.y.class, str);
        Bundle arguments2 = getArguments();
        long j3 = 0;
        if (arguments2 != null) {
            j2 = arguments2.getLong("hashtag_id", 0);
        } else {
            j2 = 0;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str2 = arguments3.getString("hashtag_title");
        } else {
            str2 = null;
        }
        DataChannel dataChannel2 = this.f8160a;
        if (dataChannel2 == null) {
            h.f.b.l.a("mDataChannel");
        }
        if (j2 == 0 || str2 == null) {
            i2 = 0;
            com.bytedance.android.livesdk.ap.b<Long> bVar = com.bytedance.android.livesdk.ap.a.cx;
            h.f.b.l.b(bVar, "");
            com.bytedance.android.livesdk.ap.b<String> bVar2 = com.bytedance.android.livesdk.ap.a.cy;
            h.f.b.l.b(bVar2, "");
            hashtag = new Hashtag(bVar.a(), bVar2.a(), null, 4, null);
        } else {
            i2 = 0;
            hashtag = new Hashtag(Long.valueOf(j2), str2, null, 4, null);
        }
        dataChannel2.b(com.bytedance.android.livesdk.j.aq.class, hashtag);
        this.U = System.currentTimeMillis();
        com.bytedance.android.live.core.performance.b.b(b.a.CreateStartLivePreview);
        Context context = getContext();
        com.bytedance.android.livesdk.at.f b2 = com.bytedance.android.livesdk.userservice.u.a().b();
        h.f.b.l.b(b2, "");
        com.bytedance.android.live.base.model.user.b a4 = b2.a();
        Objects.requireNonNull(a4, "null cannot be cast to non-null type com.bytedance.android.live.base.model.user.User");
        String a5 = i.a.a(context, ((User) a4).getIdStr());
        h.f.b.l.d(a5, "");
        t.a aVar = new t.a(a5);
        h.f.b.l.d(aVar, "");
        com.bytedance.android.live.u.h.a(aVar, i2);
        com.bytedance.android.live.u.h.a(ar.f8185a);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.f34575d;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            str3 = arguments4.getString("request_from");
        } else {
            str3 = null;
        }
        dataChannelGlobal.a(com.bytedance.android.live.broadcast.ag.class, str3);
        DataChannel dataChannel3 = this.f8160a;
        if (dataChannel3 == null) {
            h.f.b.l.a("mDataChannel");
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            str4 = arguments5.getString("enter_from");
        }
        dataChannel3.a(com.bytedance.android.live.broadcast.i.class, str4);
        DataChannel dataChannel4 = this.f8160a;
        if (dataChannel4 == null) {
            h.f.b.l.a("mDataChannel");
        }
        Hashtag hashtag2 = (Hashtag) dataChannel4.b(com.bytedance.android.livesdk.j.aq.class);
        if (!(hashtag2 == null || (l2 = hashtag2.id) == null)) {
            j3 = l2.longValue();
        }
        d.a.a().a().getPreviewRoomCreateInfo(j3).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new bb(this), bc.f8202a);
        com.bytedance.android.livesdkapi.l.a aVar2 = this.u;
        if (aVar2 != null && (aVar2.f23252a || aVar2.f23253b || aVar2.f23254c)) {
            StringBuffer stringBuffer = new StringBuffer("");
            com.bytedance.android.livesdkapi.l.a aVar3 = this.u;
            if (aVar3 != null) {
                a(aVar3.f23252a, stringBuffer, "live");
                a(aVar3.f23253b, stringBuffer, "live_by_record");
                a(aVar3.f23254c, stringBuffer, "computer");
            }
            d.a.a().a().getLivePermissionApply(stringBuffer.toString()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new bd(this));
        }
        com.bytedance.android.livesdkapi.l.a aVar4 = this.u;
        if (aVar4 != null) {
            com.bytedance.android.livesdk.at.f b3 = com.bytedance.android.livesdk.userservice.u.a().b();
            h.f.b.l.b(b3, "");
            String valueOf = String.valueOf(b3.c());
            i.a.a(getContext(), com.bytedance.android.livesdkapi.depend.model.live.i.VIDEO.name(), valueOf, aVar4.f23252a);
            i.a.a(getContext(), com.bytedance.android.livesdkapi.depend.model.live.i.SCREEN_RECORD.name(), valueOf, aVar4.f23253b);
            i.a.a(getContext(), com.bytedance.android.livesdkapi.depend.model.live.i.THIRD_PARTY.name(), valueOf, aVar4.f23254c);
        }
        Context context2 = getContext();
        if (context2 != null) {
            h.f.b.l.b(context2, "");
            DataChannel dataChannel5 = this.f8160a;
            if (dataChannel5 == null) {
                h.f.b.l.a("mDataChannel");
            }
            h.f.b.l.d(context2, "");
            h.f.b.l.d(dataChannel5, "");
            dataChannel5.a(com.bytedance.android.live.broadcast.x.class, (h.f.a.b) new r.a(context2, dataChannel5)).b(com.bytedance.android.live.broadcast.z.class, (h.f.a.b) new r.b(context2, dataChannel5));
        }
        if (com.bytedance.android.live.u.h.f12829a) {
            com.bytedance.android.b.a((int) R.layout.b9f);
            com.bytedance.android.b.a((int) R.layout.b91);
            com.bytedance.android.b.a((int) R.layout.bf5);
            com.bytedance.android.b.a((int) R.layout.b5l);
            com.bytedance.android.b.a((int) R.layout.bh3);
            ((com.bytedance.android.live.p.h) com.bytedance.android.live.t.a.a(com.bytedance.android.live.p.h.class)).preloadBroadcastToolbarWidget();
        }
        com.bytedance.android.live.p.h hVar2 = (com.bytedance.android.live.p.h) com.bytedance.android.live.t.a.a(com.bytedance.android.live.p.h.class);
        Context context3 = getContext();
        if (ToolBarButtonWithTextExperiment.hasText()) {
            qVar = com.bytedance.android.live.p.q.ICON_WITH_TEXT;
        } else {
            qVar = com.bytedance.android.live.p.q.ICON;
        }
        hVar2.preloadToolbarView(context3, 7, qVar);
    }

    static final class bl implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f8206a;

        static {
            Covode.recordClassIndex(4124);
        }

        bl(d dVar) {
            this.f8206a = dVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            t.b("cancel", d.a(this.f8206a));
            com.bytedance.android.livesdk.chatroom.b.f.a((Handler) null);
        }
    }

    static final class bm implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f8207a;

        static {
            Covode.recordClassIndex(4125);
        }

        bm(d dVar) {
            this.f8207a = dVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            t.a("end_live", d.a(this.f8207a));
            com.bytedance.android.livesdk.chatroom.b.f.a((Handler) null);
        }
    }

    static final class bn implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f8208a;

        static {
            Covode.recordClassIndex(4126);
        }

        bn(d dVar) {
            this.f8208a = dVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            t.a("back", d.a(this.f8208a));
            androidx.fragment.app.e a2 = com.bytedance.android.livesdk.utils.p.a(this.f8208a.getContext());
            if (a2 != null) {
                a2.finish();
            }
        }
    }

    static final class g implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f8229a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f8230b;

        static {
            Covode.recordClassIndex(4132);
        }

        g(View view, d dVar) {
            this.f8229a = view;
            this.f8230b = dVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f8229a.requestFocus();
            d.a(this.f8230b).c(com.bytedance.android.live.broadcast.ac.class);
            return false;
        }
    }

    static final class bk implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f8204a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Room f8205b;

        static {
            Covode.recordClassIndex(4123);
        }

        bk(d dVar, Room room) {
            this.f8204a = dVar;
            this.f8205b = room;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            boolean z;
            int i3;
            String str;
            RoomAuthStatus roomAuthStatus;
            t.b("back_to_live", d.a(this.f8204a));
            if (Room.isValid(this.f8205b)) {
                DataChannelGlobal.f34575d.a(com.bytedance.android.livesdk.j.ac.class, this.f8205b);
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.f34575d;
                Room room = this.f8205b;
                if (room == null || (roomAuthStatus = room.getRoomAuthStatus()) == null) {
                    z = true;
                } else {
                    z = roomAuthStatus.isChatL2Enabled();
                }
                dataChannelGlobal.a(com.bytedance.android.livesdk.j.bb.class, Boolean.valueOf(z));
                Context context = this.f8204a.getContext();
                IHostApp iHostApp = (IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class);
                if (this.f8204a.w().isStreamingBackground) {
                    i3 = 6;
                } else {
                    i3 = 5;
                }
                Intent intent = new Intent(context, iHostApp.getHostActivity(i3));
                com.bytedance.android.live.broadcast.model.o oVar = (com.bytedance.android.live.broadcast.model.o) d.a(this.f8204a).b(dg.class);
                if (oVar != null) {
                    str = oVar.f7947i;
                } else {
                    str = null;
                }
                intent.putExtra("live.intent.extra.LIVE_PC_TIPS", str);
                Context context2 = this.f8204a.getContext();
                if (context2 != null) {
                    com.ss.android.ugc.tiktok.security.a.a.a(intent, context2);
                    context2.startActivity(intent);
                }
                ((com.bytedance.android.livesdkapi.host.b) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdkapi.host.b.class)).a().a();
                androidx.fragment.app.e a2 = com.bytedance.android.livesdk.utils.p.a(this.f8204a.getContext());
                if (a2 != null) {
                    a2.finish();
                }
                androidx.fragment.app.e a3 = com.bytedance.android.livesdk.utils.p.a(this.f8204a.getContext());
                if (a3 != null) {
                    a3.overridePendingTransition(0, 0);
                }
                ((IBroadcastService) com.bytedance.android.live.t.a.a(IBroadcastService.class)).startLiveManager().onStartLive();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Long l2;
        int i2;
        com.bytedance.android.live.base.model.user.b a2;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.f8160a;
        if (dataChannel == null) {
            h.f.b.l.a("mDataChannel");
        }
        dataChannel.a(com.bytedance.android.livesdk.chatroom.c.am.class, (h.f.a.b) new be(this));
        dataChannel.a((Object) this, com.bytedance.android.live.broadcast.x.class, (h.f.a.b) new bf(this));
        dataChannel.a((Object) this, com.bytedance.android.livesdk.j.ae.class, (h.f.a.b) new bg(this));
        dataChannel.b(com.bytedance.android.live.broadcast.ab.class, (h.f.a.b) new bh(this));
        dataChannel.a(com.bytedance.android.live.broadcast.j.class, (h.f.a.b) new bi(this));
        dataChannel.a(dg.class, (h.f.a.b) new bj(this));
        if (!J()) {
            com.bytedance.android.live.u.f.a();
            com.bytedance.android.live.u.f.b();
            ((TraversalConstraintLayout) d(R.id.b9h)).setTraversalCallBack(au.f8188a);
            h.a aVar = new h.a();
            aVar.f13532a = "live_take_page";
            com.bytedance.android.livesdk.at.f b2 = com.bytedance.android.livesdk.userservice.u.a().b();
            if (b2 == null || (a2 = b2.a()) == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(a2.getId());
            }
            aVar.f13534c = l2;
            com.bytedance.android.livesdk.ab.c.h a3 = aVar.a();
            DataChannelGlobal.f34575d.a(com.bytedance.android.livesdk.ab.c.j.class, a3);
            DataChannel dataChannel2 = this.f8160a;
            if (dataChannel2 == null) {
                h.f.b.l.a("mDataChannel");
            }
            dataChannel2.a(com.bytedance.android.livesdk.ab.c.i.class, a3);
            com.bytedance.android.live.broadcast.c.a.a();
            com.bytedance.android.livesdkapi.depend.model.a.e eVar = this.f8169j;
            if (eVar != null) {
                eVar.b();
            }
            com.bytedance.android.live.u.h.a(new av(this));
            DataChannel dataChannel3 = this.f8160a;
            if (dataChannel3 == null) {
                h.f.b.l.a("mDataChannel");
            }
            this.X = new v(dataChannel3, this, view, new aw(this));
            DataChannel dataChannel4 = this.f8160a;
            if (dataChannel4 == null) {
                h.f.b.l.a("mDataChannel");
            }
            this.f8164e = ((com.bytedance.android.live.h.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.h.b.class)).getPreviewHashTagWidget((com.bytedance.android.livesdkapi.depend.model.live.i) dataChannel4.b(com.bytedance.android.live.broadcast.x.class));
            WidgetManager widgetManager = new WidgetManager(com.bytedance.android.live.u.h.e());
            this.v = widgetManager;
            widgetManager.config(null, this, getView(), I(), com.bytedance.android.live.u.h.f12831c);
            WidgetManager widgetManager2 = this.v;
            if (widgetManager2 == null) {
                h.f.b.l.a("mWidgetManager");
            }
            widgetManager2.mWidgetCreateTimeListener = this.V;
            WidgetManager widgetManager3 = this.v;
            if (widgetManager3 == null) {
                h.f.b.l.a("mWidgetManager");
            }
            com.bytedance.android.live.u.h.a(new h(widgetManager3, this));
            com.bytedance.android.live.u.h.a(new i(widgetManager3, this));
            com.bytedance.android.live.u.h.a(new j(widgetManager3, this));
            com.bytedance.android.live.u.h.a(new k(widgetManager3, this));
            com.bytedance.android.live.u.h.a(new l(widgetManager3, this));
            com.bytedance.android.live.effect.api.a.e e2 = com.bytedance.android.live.effect.d.e();
            l.a aVar2 = new l.a();
            aVar2.f9652b = h.a.n.b(com.bytedance.android.live.effect.api.a.f9636a, com.bytedance.android.live.effect.api.a.f9639d, "beauty");
            com.bytedance.android.live.effect.api.a.b composerHandler = com.bytedance.android.live.effect.d.f9746a.getComposerHandler(this.f8169j);
            h.f.b.l.b(composerHandler, "");
            aVar2.f9654d = composerHandler;
            e2.a(aVar2.a());
            e2.a(this.aa);
            this.Y.a(this.s);
            com.bytedance.android.live.effect.api.a.k c2 = com.bytedance.android.live.effect.d.c();
            DataChannel dataChannel5 = this.f8160a;
            if (dataChannel5 == null) {
                h.f.b.l.a("mDataChannel");
            }
            c2.a(dataChannel5, this, true);
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.setOnTouchListener(new g(view, this));
            ConstraintLayout constraintLayout = (ConstraintLayout) d(R.id.b3m);
            LiveWidget p2 = p();
            if (p2 != null) {
                i2 = p2.getViewId();
            } else {
                i2 = -1;
            }
            com.bytedance.android.livesdk.utils.p.a(constraintLayout, i2, com.bytedance.android.live.core.f.y.d(R.dimen.xa));
            this.W = new f(this);
            t.f8290a = SystemClock.uptimeMillis();
            x();
            ((ImageView) d(R.id.bxz)).setOnClickListener(new ax(this));
        }
    }

    public final void a(com.bytedance.android.livesdkapi.depend.model.live.i iVar, boolean z2) {
        if (isViewValid() && this.f8167h != iVar) {
            this.f8167h = iVar;
            View view = getView();
            if (view != null) {
                view.setClickable(com.bytedance.android.livesdkapi.depend.model.live.j.c(iVar));
            }
            if (iVar != null) {
                c.a.a("ttlive_change_mode").b("preview").a("select_live_mode", iVar.name()).a();
            }
            b().hide();
            j().hide();
            LiveWidget liveWidget = this.f8164e;
            if (liveWidget != null) {
                liveWidget.hide();
            }
            LiveWidget p2 = p();
            if (p2 != null) {
                p2.hide();
            }
            LiveWidget q2 = q();
            if (q2 != null) {
                q2.hide();
            }
            d().hide();
            a().hide();
            o().hide();
            f().hide();
            e().hide();
            k().hide();
            m().hide();
            c().hide();
            n().b();
            ObsBroadcastGuideWidget obsBroadcastGuideWidget = this.f8165f;
            if (obsBroadcastGuideWidget != null) {
                obsBroadcastGuideWidget.hide();
            }
            g().hide();
            s().hide();
            t().hide();
            i().hide();
            u().hide();
            v vVar = this.X;
            if (vVar == null) {
                h.f.b.l.a("mPreviewSlotHelper");
            }
            v.a aVar = vVar.f8298f;
            if (aVar != null) {
                aVar.a(false);
            }
            v vVar2 = this.X;
            if (vVar2 == null) {
                h.f.b.l.a("mPreviewSlotHelper");
            }
            v.a aVar2 = vVar2.f8299g;
            if (aVar2 != null) {
                aVar2.a(false);
            }
            r().hide();
            com.bytedance.android.livesdk.utils.p.a(d(R.id.dgq));
            com.bytedance.android.livesdk.utils.p.a(d(R.id.dgo));
            com.bytedance.android.livesdk.utils.p.a(d(R.id.cfi));
            com.bytedance.android.livesdk.utils.p.a(d(R.id.dt5));
            G();
            if (com.bytedance.android.livesdkapi.depend.model.live.j.b(iVar)) {
                g().show();
                b().show();
                j().show();
                d().show();
                a().show();
                o().show();
                f().show();
                e().show();
                k().show();
                n().a();
                DataChannel dataChannel = this.f8160a;
                if (dataChannel == null) {
                    h.f.b.l.a("mDataChannel");
                }
                if (dataChannel.b(com.bytedance.android.live.broadcast.ab.class) == null) {
                    LiveWidget p3 = p();
                    if (p3 != null) {
                        p3.show();
                    }
                    LiveWidget liveWidget2 = this.f8164e;
                    if (liveWidget2 != null) {
                        liveWidget2.show();
                    }
                    v vVar3 = this.X;
                    if (vVar3 == null) {
                        h.f.b.l.a("mPreviewSlotHelper");
                    }
                    v.a aVar3 = vVar3.f8298f;
                    if (aVar3 != null) {
                        aVar3.a(true);
                    }
                    v vVar4 = this.X;
                    if (vVar4 == null) {
                        h.f.b.l.a("mPreviewSlotHelper");
                    }
                    v.a aVar4 = vVar4.f8299g;
                    if (aVar4 != null) {
                        aVar4.a(true);
                    }
                }
                b(com.bytedance.android.livesdkapi.depend.model.live.i.VIDEO);
                a(PrivacyCert.Builder.Companion.with("bpea-597").usage("").tag("[Live Preview] open camera when live mode is video").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
            } else if (com.bytedance.android.livesdkapi.depend.model.live.j.f(iVar)) {
                g().show();
                b().show();
                j().show();
                f().show();
                e().show();
                m().show();
                c().show();
                n().a();
                com.bytedance.android.livesdkapi.l.b bVar = (com.bytedance.android.livesdkapi.l.b) DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.j.af.class);
                if (bVar != null && bVar.f23259e) {
                    u().show();
                }
                DataChannel dataChannel2 = this.f8160a;
                if (dataChannel2 == null) {
                    h.f.b.l.a("mDataChannel");
                }
                if (dataChannel2.b(com.bytedance.android.live.broadcast.ab.class) == null) {
                    LiveWidget liveWidget3 = this.f8164e;
                    if (liveWidget3 != null) {
                        liveWidget3.show();
                    }
                    v vVar5 = this.X;
                    if (vVar5 == null) {
                        h.f.b.l.a("mPreviewSlotHelper");
                    }
                    v.a aVar5 = vVar5.f8299g;
                    if (aVar5 != null) {
                        aVar5.a(true);
                    }
                    DataChannel dataChannel3 = this.f8160a;
                    if (dataChannel3 == null) {
                        h.f.b.l.a("mDataChannel");
                    }
                    if (com.bytedance.android.livesdk.t.a.a(dataChannel3)) {
                        s().show();
                    }
                }
                r().show();
                com.bytedance.android.livesdk.utils.p.b(d(R.id.dgq));
                com.bytedance.android.livesdk.utils.p.b(d(R.id.dgo));
                com.bytedance.android.livesdk.utils.p.b(d(R.id.dt5));
                G();
                b(com.bytedance.android.livesdkapi.depend.model.live.i.SCREEN_RECORD);
                K();
                b(PrivacyCert.Builder.Companion.with("bpea-601").usage("").tag("[Live Preview] close camera when live mode is obs").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
            } else if (com.bytedance.android.livesdkapi.depend.model.live.j.e(iVar)) {
                g().show();
                b().show();
                j().show();
                e().show();
                k().show();
                com.bytedance.android.livesdkapi.l.b bVar2 = (com.bytedance.android.livesdkapi.l.b) DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.j.af.class);
                if (bVar2 != null && bVar2.f23259e) {
                    u().show();
                }
                n().a();
                ObsBroadcastGuideWidget obsBroadcastGuideWidget2 = this.f8165f;
                if (obsBroadcastGuideWidget2 != null) {
                    obsBroadcastGuideWidget2.show();
                }
                DataChannel dataChannel4 = this.f8160a;
                if (dataChannel4 == null) {
                    h.f.b.l.a("mDataChannel");
                }
                if (dataChannel4.b(com.bytedance.android.live.broadcast.ab.class) == null) {
                    LiveWidget liveWidget4 = this.f8164e;
                    if (liveWidget4 != null) {
                        liveWidget4.show();
                    }
                    LiveWidget q3 = q();
                    if (q3 != null) {
                        q3.show();
                    }
                    v vVar6 = this.X;
                    if (vVar6 == null) {
                        h.f.b.l.a("mPreviewSlotHelper");
                    }
                    v.a aVar6 = vVar6.f8298f;
                    if (aVar6 != null) {
                        aVar6.a(true);
                    }
                    v vVar7 = this.X;
                    if (vVar7 == null) {
                        h.f.b.l.a("mPreviewSlotHelper");
                    }
                    v.a aVar7 = vVar7.f8299g;
                    if (aVar7 != null) {
                        aVar7.a(true);
                    }
                    DataChannel dataChannel5 = this.f8160a;
                    if (dataChannel5 == null) {
                        h.f.b.l.a("mDataChannel");
                    }
                    if (com.bytedance.android.livesdk.t.a.a(dataChannel5)) {
                        s().show();
                    }
                }
                com.bytedance.android.livesdk.utils.p.b(d(R.id.dgq));
                com.bytedance.android.livesdk.utils.p.b(d(R.id.dgo));
                K();
                b(PrivacyCert.Builder.Companion.with("bpea-602").usage("").tag("[Live Preview] close camera when live mode is game").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
            } else {
                h.f.b.l.d(iVar, "");
                if (iVar == com.bytedance.android.livesdkapi.depend.model.live.i.LIVE_STUDIO) {
                    i().a(z2);
                    t().a(z2);
                    com.bytedance.android.livesdk.utils.p.b(d(R.id.dgq));
                    com.bytedance.android.livesdk.utils.p.b(d(R.id.dgo));
                    K();
                    b(PrivacyCert.Builder.Companion.with("bpea-1013").usage("").tag("[Live Preview] close camera when live mode is live studio").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
                }
            }
            x();
            a(iVar);
            y();
            ((com.bytedance.android.live.h.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.h.b.class)).updatePreviewHashTagWidgetLiveMode(this.f8164e, iVar);
        }
    }

    private static void a(boolean z2, StringBuffer stringBuffer, String str) {
        if (z2) {
            if (h.m.p.a(stringBuffer)) {
                stringBuffer.append(str);
            } else {
                stringBuffer.append(",".concat(String.valueOf(str)));
            }
        }
    }

    static final class m implements com.bytedance.android.live.effect.api.a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f8231a;

        static {
            Covode.recordClassIndex(4139);
        }

        m(d dVar) {
            this.f8231a = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
            if ((!r0.isEmpty()) != false) goto L_0x0027;
         */
        @Override // com.bytedance.android.live.effect.api.a.d
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(boolean r5, java.lang.String r6, com.bytedance.android.livesdkapi.depend.model.a r7) {
            /*
                r4 = this;
                com.bytedance.android.live.effect.api.a.e r0 = com.bytedance.android.live.effect.d.e()
                java.util.Map r3 = r0.a()
                com.bytedance.android.live.broadcast.preview.d r2 = r4.f8231a
                java.lang.String r0 = com.bytedance.android.live.effect.api.a.f9637b
                boolean r0 = r3.containsKey(r0)
                r1 = 1
                if (r0 == 0) goto L_0x002a
                java.lang.String r0 = com.bytedance.android.live.effect.api.a.f9637b
                java.lang.Object r0 = r3.get(r0)
                if (r0 != 0) goto L_0x001e
                h.f.b.l.b()
            L_0x001e:
                java.util.Map r0 = (java.util.Map) r0
                boolean r0 = r0.isEmpty()
                r0 = r0 ^ r1
                if (r0 == 0) goto L_0x002a
            L_0x0027:
                r2.f8170k = r1
                return
            L_0x002a:
                com.bytedance.android.live.broadcast.preview.d r1 = r4.f8231a
                r0 = 2131366133(0x7f0a10f5, float:1.835215E38)
                android.view.View r0 = r1.d(r0)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                if (r0 == 0) goto L_0x003a
                com.bytedance.android.livesdk.utils.p.a(r0)
            L_0x003a:
                r1 = 0
                goto L_0x0027
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.preview.d.m.a(boolean, java.lang.String, com.bytedance.android.livesdkapi.depend.model.a):void");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (!this.T) {
            if (i2 != 20001) {
                com.bytedance.android.live.broadcast.widget.e eVar = b().f8347a;
                if (eVar != null && eVar.f8777d != null) {
                    eVar.f8777d.a(i2, i3, intent);
                    return;
                }
                return;
            }
            PreviewStartLiveWidget g2 = g();
            if (Build.VERSION.SDK_INT >= 21) {
                if (i3 == -1) {
                    Object a2 = PreviewStartLiveWidget.a(g2.context, "media_projection");
                    if ((a2 instanceof MediaProjectionManager) && a2 != null) {
                        b.a.a("livesdk_allow_screen_share").a("is_allowed_screen_share", "allowed").b();
                        g2.f8409c = intent;
                        BgBroadcastServiceImpl.setProjectionIntent(intent);
                        g2.a(false);
                        return;
                    }
                }
                b.a.a("livesdk_allow_screen_share").a("is_allowed_screen_share", "not_allowed").b();
                g2.e();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        if (J()) {
            return null;
        }
        com.bytedance.android.livesdk.at.f b2 = com.bytedance.android.livesdk.userservice.u.a().b();
        h.f.b.l.b(b2, "");
        com.bytedance.android.live.base.model.user.b a2 = b2.a();
        Objects.requireNonNull(a2, "null cannot be cast to non-null type com.bytedance.android.live.base.model.user.User");
        User user = (User) a2;
        com.bytedance.android.livesdk.ap.b<Long> bVar = com.bytedance.android.livesdk.ap.a.L;
        h.f.b.l.b(bVar, "");
        Long a3 = bVar.a();
        long id = user.getId();
        if (a3 == null || a3.longValue() != id) {
            com.bytedance.android.livesdk.ap.b<Long> bVar2 = com.bytedance.android.livesdk.ap.a.L;
            h.f.b.l.b(bVar2, "");
            com.bytedance.android.livesdk.ap.c.a(bVar2, Long.valueOf(user.getId()));
        }
        this.f8168i = user;
        return com.bytedance.android.b.a(R.layout.b9g, viewGroup);
    }

    static final /* synthetic */ class au extends h.f.b.j implements h.f.a.r<Long, Long, Long, Long, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final au f8188a = new au();

        static {
            Covode.recordClassIndex(4106);
        }

        au() {
            super(4, t.class, "logPreviewTraversalTime", "logPreviewTraversalTime(JJJJ)V", 1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.r
        public final /* synthetic */ h.z a(Long l2, Long l3, Long l4, Long l5) {
            l2.longValue();
            l3.longValue();
            l4.longValue();
            com.bytedance.android.live.core.d.c.a("ttlive_preview_page_traversal_time", 0, h.a.ag.a(h.v.a("time_cost", String.valueOf(l5.longValue()))));
            return h.z.f158842a;
        }
    }
}
