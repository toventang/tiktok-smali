package com.bytedance.android.live.broadcast;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.aa;
import com.bytedance.android.live.broadcast.api.c.c;
import com.bytedance.android.live.broadcast.d.a;
import com.bytedance.android.live.broadcast.f.a;
import com.bytedance.android.live.broadcast.stream.d;
import com.bytedance.android.live.broadcast.utils.d;
import com.bytedance.android.live.broadcast.utils.f;
import com.bytedance.android.live.broadcast.widget.VideoWidget2;
import com.bytedance.android.live.core.performance.b;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.f;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.i.a.b;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.c.h;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.chatroom.ui.Cdo;
import com.bytedance.android.livesdk.chatroom.ui.dw;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.j.bp;
import com.bytedance.android.livesdk.j.bq;
import com.bytedance.android.livesdk.j.cf;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.j.co;
import com.bytedance.android.livesdk.j.ct;
import com.bytedance.android.livesdk.j.cu;
import com.bytedance.android.livesdk.j.cv;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.dj;
import com.bytedance.android.livesdk.j.dp;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.live.api.LIveTaskApi;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastLiveCenterSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyParamSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnableFixLiveEndSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxEnterBackgroundTimeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePauseLiveSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePushStreamLogLevelSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamBitrateAdaptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamBitrateSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamEnableSdkParamsSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamEnableUrlListSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamHwRoiSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamProfileSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamSizeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamSwRoiSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveUseEffectAlgorithmAbSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveUseNewAudioCodecSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.PushStreamSupportDnsSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.StreamDefinitionLevelSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.StreamHardwareEncodeSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveNewEffectPanelSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftInterfaceOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.gift.LivePrefetchGiftImageSetting;
import com.bytedance.android.livesdk.model.message.bv;
import com.bytedance.android.livesdk.model.message.n;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.performance.g;
import com.bytedance.android.livesdk.tunnel.BroadcastTunnelVM;
import com.bytedance.android.livesdk.tunnel.b;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.android.livesdkapi.depend.model.a.c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.message.IMessageService;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidgetProvider;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.common.util.NetworkUtils;
import com.ss.avframework.engine.MediaEngineFactory;
import com.ss.avframework.livestreamv2.core.LiveCore;
import com.ss.avframework.utils.AVLog;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONObject;

public final class o extends com.bytedance.android.livesdk.ui.a implements aa.a, com.bytedance.android.live.broadcast.api.d.b, a.AbstractC0113a, com.bytedance.android.live.broadcast.h.a, com.bytedance.android.livesdkapi.depend.model.a.c, WeakHandler.IHandler, com.bytedance.ies.sdk.datachannel.e {
    static final int[][] y = {new int[]{200, 500, 800, 1}, new int[]{200, 800, 1200, 3}};
    public static final a z = new a((byte) 0);
    private final h.h A = com.bytedance.android.livesdkapi.m.d.a(new g(this));
    private final h.h B = com.bytedance.android.livesdkapi.m.d.a(new m(this));
    private final h.h C = com.bytedance.android.livesdkapi.m.d.a(new k(this));
    private final h.h D = com.bytedance.android.livesdkapi.m.d.a(new i(this));
    private final h.h E = com.bytedance.android.livesdkapi.m.d.a(new f(this));
    private aa F;
    private boolean G;
    private boolean H;
    private long I;
    private final List<f.a.b.b> J = new ArrayList();
    private final Map<String, Runnable> K = new HashMap();
    private com.bytedance.android.live.broadcast.b.f L;
    private final h.h M = h.i.a((h.f.a.a) d.f8019a);
    private final h.h N = com.bytedance.android.livesdkapi.m.d.a(new l(this));
    private final com.bytedance.android.livesdkapi.depend.a O = new e(this);
    private final j P = new j(this);
    private HashMap Q;

    /* renamed from: a  reason: collision with root package name */
    final h.h f7957a = com.bytedance.android.livesdkapi.m.d.a(new n(this));

    /* renamed from: b  reason: collision with root package name */
    public Room f7958b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.livesdkapi.depend.model.live.s f7959c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.android.livesdkapi.depend.model.a.b f7960d;

    /* renamed from: e  reason: collision with root package name */
    public com.bytedance.android.live.broadcast.f.a f7961e;

    /* renamed from: f  reason: collision with root package name */
    boolean f7962f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7963g;

    /* renamed from: h  reason: collision with root package name */
    boolean f7964h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f7965i = true;

    /* renamed from: j  reason: collision with root package name */
    public boolean f7966j;

    /* renamed from: k  reason: collision with root package name */
    long f7967k;

    /* renamed from: l  reason: collision with root package name */
    long f7968l;

    /* renamed from: m  reason: collision with root package name */
    public com.bytedance.android.live.broadcast.api.d.a f7969m;
    public VideoWidget2 n;
    com.bytedance.android.live.n.p o;
    public com.bytedance.android.livesdk.v p;
    public com.bytedance.android.live.broadcast.stream.c.b q;
    public String r;
    public CharSequence s;
    public CharSequence t;
    public CharSequence u;
    public f.a.b.b v;
    public com.bytedance.android.livesdk.chatroom.d.b w;
    public final com.bytedance.android.live.broadcast.stream.capture.f x = new h(this);

    private final com.bytedance.android.live.broadcast.h.b p() {
        return (com.bytedance.android.live.broadcast.h.b) this.C.getValue();
    }

    private final Cdo q() {
        return (Cdo) this.D.getValue();
    }

    private final l.AnonymousClass1 s() {
        return (l.AnonymousClass1) this.N.getValue();
    }

    private void u() {
        HashMap hashMap = this.Q;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final DataChannel a() {
        return (DataChannel) this.A.getValue();
    }

    public final WeakHandler b() {
        return (WeakHandler) this.B.getValue();
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public final void beforeLiveCoreStartStream() {
    }

    public final View c(int i2) {
        if (this.Q == null) {
            this.Q = new HashMap();
        }
        View view = (View) this.Q.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.Q.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final BroadcastTunnelVM c() {
        return (BroadcastTunnelVM) this.E.getValue();
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public final void connected() {
    }

    public final com.bytedance.android.live.effect.api.f d() {
        return (com.bytedance.android.live.effect.api.f) this.M.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(3935);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.a.c
    public final Fragment g() {
        return this;
    }

    public final void a(String str, long j2, boolean z2, Integer num) {
        if (getContext() != null) {
            LiveLoadingView liveLoadingView = (LiveLoadingView) c(R.id.cc1);
            if (liveLoadingView != null) {
                com.bytedance.android.livesdk.utils.p.a((View) liveLoadingView, false);
            }
            b.a aVar = new b.a(getContext());
            aVar.f18285b = str;
            b.a b2 = aVar.a(R.string.dwc, (DialogInterface.OnClickListener) new al(this, num), false).b(R.string.dwb, (DialogInterface.OnClickListener) new am(this, num), false);
            b2.q = new an(num);
            b2.a().show();
            b.a.a("livesdk_close_live_duration").a(a()).a("duration", (int) (System.currentTimeMillis() - j2)).a("request_succeed", z2 ? 1 : 0).b();
        }
    }

    @Override // com.bytedance.android.live.broadcast.f.a.AbstractC0113a
    public final void a(CharSequence charSequence) {
        h.f.b.l.d(charSequence, "");
        if (isViewValid()) {
            q().a(charSequence);
        }
    }

    @Override // com.bytedance.android.live.broadcast.f.a.AbstractC0113a
    public final void a(boolean z2, String str) {
        h.f.b.l.d(str, "");
        if (isViewValid()) {
            q().a(z2, str);
        }
    }

    @Override // com.bytedance.android.live.broadcast.f.a.AbstractC0113a
    public final void a(boolean z2) {
        if (isViewValid()) {
            if (z2) {
                Cdo q2 = q();
                q2.setCancelable(false);
                q2.show();
                q2.a(new ax(q2, this));
                q2.f16142a = new ay(q2);
                q2.f16143b = new az(q2);
                return;
            }
            com.bytedance.android.livesdk.utils.p.b(q());
        }
    }

    @Override // com.bytedance.android.live.broadcast.aa.a
    public final void a(String str) {
        com.bytedance.android.live.broadcast.api.d.a aVar;
        h.f.b.l.d(str, "");
        if (h.f.b.l.a((Object) TelephonyManager.EXTRA_STATE_IDLE, (Object) str)) {
            com.bytedance.android.live.broadcast.api.d.a aVar2 = this.f7969m;
            if (aVar2 != null) {
                aVar2.a(PrivacyCert.Builder.Companion.with("bpea-366").usage("").tag("Switch to the foreground after making a phone call during the live broadcast").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
        } else if (h.f.b.l.a((Object) TelephonyManager.EXTRA_STATE_OFFHOOK, (Object) str) && (aVar = this.f7969m) != null) {
            aVar.b(PrivacyCert.Builder.Companion.with("bpea-387").usage("").tag("Switch to the background when making a phone call during the live broadcast").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
    }

    public final void a(String str, Float f2, boolean z2, int i2) {
        h.f.b.l.d(str, "");
        b(str);
        ag agVar = new ag(this, f2, str, i2, z2);
        this.K.put(str, agVar);
        b().postDelayed(agVar, 30000);
    }

    static final class l extends h.f.b.m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(3975);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new com.bytedance.android.livesdk.gift.e.b(this) {
                /* class com.bytedance.android.live.broadcast.o.l.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ l f8023a;

                static {
                    Covode.recordClassIndex(3976);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f8023a = r1;
                }

                @Override // com.bytedance.android.livesdk.gift.e.b
                public final void a(List<? extends com.bytedance.android.livesdk.model.u> list) {
                    h.f.b.l.d(list, "");
                    com.bytedance.android.live.broadcast.c.a.p.a(this.f8023a.this$0.f());
                }

                @Override // com.bytedance.android.livesdk.gift.e.b
                public final void b(List<? extends GiftPage> list) {
                    this.f8023a.this$0.v = f.a.t.a(new a(list)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).g();
                    com.bytedance.android.live.broadcast.c.a.p.a(this.f8023a.this$0.f());
                }

                /* renamed from: com.bytedance.android.live.broadcast.o$l$1$a */
                static final class a<T> implements f.a.w {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ List f8024a;

                    static {
                        Covode.recordClassIndex(3977);
                    }

                    a(List list) {
                        this.f8024a = list;
                    }

                    @Override // f.a.w
                    public final void subscribe(f.a.v<Object> vVar) {
                        List<T> list;
                        if (LivePrefetchGiftImageSetting.INSTANCE.getValue() && (list = this.f8024a) != null && (!list.isEmpty())) {
                            for (T t : list) {
                                List<com.bytedance.android.livesdk.model.u> list2 = t.gifts;
                                if (list2 != null && (!list2.isEmpty())) {
                                    for (T t2 : list2) {
                                        h.f.b.l.b(t2, "");
                                        com.bytedance.android.live.core.f.k.a(t2.f19759b);
                                    }
                                }
                            }
                        }
                    }
                }
            };
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<WeakHandler> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(3978);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ WeakHandler invoke() {
            return new WeakHandler(this.this$0);
        }
    }

    static final class z implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f8034a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f8035b;

        static {
            Covode.recordClassIndex(3995);
        }

        z(o oVar, float f2) {
            this.f8034a = oVar;
            this.f8035b = f2;
        }

        public final void run() {
            this.f8034a.isViewValid();
        }
    }

    @Override // com.bytedance.ies.sdk.datachannel.e
    public final DataChannel h() {
        return a();
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class ai extends h.f.b.j implements h.f.a.a<h.z> {
        static {
            Covode.recordClassIndex(3944);
        }

        ai(o oVar) {
            super(0, oVar, o.class, "onFinishBroadcastCancelClick", "onFinishBroadcastCancelClick()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            ((o) this.receiver).k();
            return h.z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<BroadcastTunnelVM> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(3969);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BroadcastTunnelVM invoke() {
            return b.a.a(BroadcastTunnelVM.class, this.this$0.getActivity());
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<Cdo> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(3972);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Cdo invoke() {
            return Cdo.a(this.this$0.getActivity());
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<com.bytedance.android.live.broadcast.h.b> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(3974);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.android.live.broadcast.h.b invoke() {
            return new com.bytedance.android.live.broadcast.h.b(o.a(this.this$0));
        }
    }

    private final long r() {
        Room room = this.f7958b;
        if (room == null) {
            h.f.b.l.a("mRoom");
        }
        return room.getOwnerUserId();
    }

    public final long f() {
        Room room = this.f7958b;
        if (room == null) {
            h.f.b.l.a("mRoom");
        }
        return room.getId();
    }

    @Override // com.bytedance.android.live.broadcast.f.a.AbstractC0113a
    public final void n() {
        com.bytedance.android.livesdk.utils.ao.a(getContext(), (int) R.string.gue);
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public final void onCaptureFirstFrame() {
        com.bytedance.android.live.broadcast.api.c.a.a("capture_first_frame", String.valueOf(System.currentTimeMillis()));
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public final void onNetworkLow() {
        c.a.a("ttlive_low_network").a();
    }

    static final class ay implements Cdo.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Cdo f8006a;

        static {
            Covode.recordClassIndex(3960);
        }

        ay(Cdo doVar) {
            this.f8006a = doVar;
        }

        @Override // com.bytedance.android.livesdk.chatroom.ui.Cdo.a
        public final void a() {
            com.bytedance.android.livesdk.utils.ao.a(this.f8006a.getContext(), com.bytedance.android.live.core.f.y.a((int) R.string.gsq), 0);
        }
    }

    static final class az implements Cdo.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Cdo f8007a;

        static {
            Covode.recordClassIndex(3961);
        }

        az(Cdo doVar) {
            this.f8007a = doVar;
        }

        @Override // com.bytedance.android.livesdk.chatroom.ui.Cdo.b
        public final void a() {
            com.bytedance.android.livesdk.utils.ao.a(this.f8007a.getContext(), com.bytedance.android.live.core.f.y.a((int) R.string.gsq), 0);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.android.live.effect.api.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f8019a = new d();

        static {
            Covode.recordClassIndex(3967);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.android.live.effect.api.f invoke() {
            com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IEffectService.class);
            h.f.b.l.b(a2, "");
            return ((IEffectService) a2).getLiveFilterManager();
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<DataChannel> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(3970);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DataChannel invoke() {
            androidx.lifecycle.ad a2 = androidx.lifecycle.ae.a(this.this$0, (ad.b) null);
            h.f.b.l.b(a2, "");
            return DataChannel.a.a(a2, this.this$0);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<WidgetManager> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(3979);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ WidgetManager invoke() {
            o oVar = this.this$0;
            return WidgetManager.of(oVar, oVar.getView(), com.bytedance.android.live.u.h.f12831c, com.bytedance.android.live.u.h.e());
        }
    }

    public static long e() {
        com.bytedance.android.livesdk.at.f b2 = com.bytedance.android.livesdk.userservice.u.a().b();
        if (b2 != null) {
            return b2.c();
        }
        return 0;
    }

    @Override // com.bytedance.android.live.broadcast.f.a.AbstractC0113a
    public final void l() {
        if (isViewValid()) {
            Cdo q2 = q();
            new ba(this);
            q2.a();
        }
    }

    static final class ac implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f7973a;

        static {
            Covode.recordClassIndex(3938);
        }

        ac(o oVar) {
            this.f7973a = oVar;
        }

        public final void run() {
            VideoWidget2 videoWidget2;
            View view;
            ViewGroup.LayoutParams layoutParams;
            View view2;
            if (!this.f7973a.mStatusDestroyed && (videoWidget2 = this.f7973a.n) != null && (view = videoWidget2.getView()) != null) {
                VideoWidget2 videoWidget22 = this.f7973a.n;
                FrameLayout.LayoutParams layoutParams2 = null;
                if (videoWidget22 == null || (view2 = videoWidget22.getView()) == null) {
                    layoutParams = null;
                } else {
                    layoutParams = view2.getLayoutParams();
                }
                if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
                    layoutParams = null;
                }
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams;
                if (layoutParams3 != null) {
                    layoutParams3.width = -1;
                    layoutParams3.height = -1;
                    layoutParams3.topMargin = 0;
                    layoutParams2 = layoutParams3;
                }
                view.setLayoutParams(layoutParams2);
            }
        }
    }

    static final class ae implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f7976a;

        static {
            Covode.recordClassIndex(3940);
        }

        ae(o oVar) {
            this.f7976a = oVar;
        }

        public final void run() {
            MethodCollector.i(6477);
            if (this.f7976a.mStatusDestroyed) {
                MethodCollector.o(6477);
                return;
            }
            ((FrameLayout) this.f7976a.c(R.id.jn)).removeAllViews();
            MethodCollector.o(6477);
        }
    }

    static final class aw implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f8002a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.live.n.p f8003b;

        static {
            Covode.recordClassIndex(3958);
        }

        aw(o oVar, com.bytedance.android.live.n.p pVar) {
            this.f8002a = oVar;
            this.f8003b = pVar;
        }

        public final void run() {
            VideoWidget2 videoWidget2;
            VideoWidget2 videoWidget22 = this.f8002a.n;
            if (!(videoWidget22 == null || videoWidget22.f8742i == null)) {
                videoWidget22.f8742i.a();
            }
            if (this.f8003b.b().isAdded() && (videoWidget2 = this.f8002a.n) != null) {
                FrameLayout c2 = this.f8003b.c();
                androidx.fragment.app.i childFragmentManager = this.f8003b.b().getChildFragmentManager();
                videoWidget2.r = c2;
                videoWidget2.s = childFragmentManager;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class y implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f8032a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PrivacyCert f8033b;

        static {
            Covode.recordClassIndex(3994);
        }

        y(o oVar, PrivacyCert privacyCert) {
            this.f8032a = oVar;
            this.f8033b = privacyCert;
        }

        public final void run() {
            this.f8032a.b(1);
            this.f8032a.a(this.f8033b);
            com.bytedance.android.live.broadcast.d.b.b(10001, o.e(), this.f8032a.f(), this.f8032a.f7965i);
        }
    }

    static {
        Covode.recordClassIndex(3934);
    }

    public final void i() {
        com.bytedance.android.live.n.p pVar = this.o;
        if (pVar != null) {
            pVar.a();
            getChildFragmentManager().a().a(pVar.b()).e();
            this.o = null;
            VideoWidget2 videoWidget2 = this.n;
            if (videoWidget2 != null) {
                videoWidget2.b();
            }
            LiveWidgetProvider.Companion.getInstance().clear();
        }
    }

    public final void k() {
        b.a.a("anchor_close_live_cancel").a(a()).a("live_type", "video_live").b();
        com.bytedance.android.livesdk.ab.k.a(getContext());
        f();
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public final void onFirstRTMPConnect() {
        Message obtain = Message.obtain(com.bytedance.android.live.broadcast.api.c.a.f7523a, 1);
        obtain.obj = new Pair("live_type", "video");
        com.bytedance.android.live.broadcast.api.c.a.f7523a.sendMessage(obtain);
        com.bytedance.android.live.broadcast.api.c.a.a("rtmp_connected", String.valueOf(System.currentTimeMillis()));
        com.bytedance.android.live.broadcast.api.c.a.a();
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public final void onReconnect() {
        isViewValid();
        if (!this.H) {
            com.bytedance.android.livesdk.utils.ao.a(getContext(), (int) R.string.gth);
            b.a.a("livesdk_anchor_network_error").a("error_type", "1").b();
            c.a.a("ttlive_reconnect_stream").a();
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public final void onReconnected() {
        com.bytedance.android.livesdk.utils.ao.a(getContext(), (int) R.string.guc);
        b.a.a("livesdk_anchor_network_error").a("error_type", "2").b();
        c.a.a("ttlive_reconnect_stream_success").a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (!this.G) {
            a(com.bytedance.android.livesdk.gift.a.class);
            a(com.bytedance.android.livesdk.chatroom.c.r.class);
            c.a.a("ttlive_page_start").b("broadcast").a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        com.bytedance.android.live.broadcast.stream.c.b bVar;
        super.onStop();
        if (!this.G) {
            c.a.a("ttlive_page_stop").b("broadcast").a();
            if (!this.H && c().f21745a.getValue() != com.bytedance.android.livesdk.tunnel.a.STREAM_ON && (bVar = this.q) != null) {
                bVar.c();
            }
        }
    }

    static final class aa implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f7970a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.live.liveinteract.api.b.o f7971b;

        static {
            Covode.recordClassIndex(3936);
        }

        aa(o oVar, com.bytedance.android.live.liveinteract.api.b.o oVar2) {
            this.f7970a = oVar;
            this.f7971b = oVar2;
        }

        public final void run() {
            VideoWidget2 videoWidget2;
            View view;
            ViewGroup.LayoutParams layoutParams;
            int i2;
            int i3;
            View view2;
            if (!this.f7970a.mStatusDestroyed && (videoWidget2 = this.f7970a.n) != null && (view = videoWidget2.getView()) != null) {
                VideoWidget2 videoWidget22 = this.f7970a.n;
                FrameLayout.LayoutParams layoutParams2 = null;
                if (videoWidget22 == null || (view2 = videoWidget22.getView()) == null) {
                    layoutParams = null;
                } else {
                    layoutParams = view2.getLayoutParams();
                }
                if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
                    layoutParams = null;
                }
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams;
                if (layoutParams3 != null) {
                    FrameLayout frameLayout = this.f7971b.f10004b;
                    int i4 = -1;
                    if (frameLayout != null) {
                        i2 = frameLayout.getWidth();
                    } else {
                        i2 = -1;
                    }
                    layoutParams3.width = i2;
                    FrameLayout frameLayout2 = this.f7971b.f10004b;
                    if (frameLayout2 != null) {
                        i4 = frameLayout2.getHeight();
                    }
                    layoutParams3.height = i4;
                    FrameLayout frameLayout3 = this.f7971b.f10004b;
                    if (frameLayout3 != null) {
                        i3 = frameLayout3.getTop();
                    } else {
                        i3 = 0;
                    }
                    layoutParams3.topMargin = i3;
                    layoutParams3.gravity = 51;
                    layoutParams2 = layoutParams3;
                }
                view.setLayoutParams(layoutParams2);
            }
        }
    }

    static final class ab implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f7972a;

        static {
            Covode.recordClassIndex(3937);
        }

        ab(o oVar) {
            this.f7972a = oVar;
        }

        public final void run() {
            VideoWidget2 videoWidget2;
            View view;
            ViewGroup.LayoutParams layoutParams;
            View view2;
            if (!this.f7972a.mStatusDestroyed && (videoWidget2 = this.f7972a.n) != null && (view = videoWidget2.getView()) != null) {
                VideoWidget2 videoWidget22 = this.f7972a.n;
                FrameLayout.LayoutParams layoutParams2 = null;
                if (videoWidget22 == null || (view2 = videoWidget22.getView()) == null) {
                    layoutParams = null;
                } else {
                    layoutParams = view2.getLayoutParams();
                }
                if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
                    layoutParams = null;
                }
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams;
                if (layoutParams3 != null) {
                    com.bytedance.android.live.liveinteract.api.d linkCrossRoomWidget = ((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).linkCrossRoomWidget();
                    h.f.b.l.b(linkCrossRoomWidget, "");
                    layoutParams3.width = linkCrossRoomWidget.a();
                    com.bytedance.android.live.liveinteract.api.d linkCrossRoomWidget2 = ((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).linkCrossRoomWidget();
                    h.f.b.l.b(linkCrossRoomWidget2, "");
                    layoutParams3.height = linkCrossRoomWidget2.b();
                    layoutParams3.gravity = 3;
                    com.bytedance.android.live.liveinteract.api.d linkCrossRoomWidget3 = ((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).linkCrossRoomWidget();
                    h.f.b.l.b(linkCrossRoomWidget3, "");
                    layoutParams3.topMargin = linkCrossRoomWidget3.c();
                    layoutParams2 = layoutParams3;
                }
                view.setLayoutParams(layoutParams2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ao implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f7994a;

        static {
            Covode.recordClassIndex(3950);
        }

        ao(o oVar) {
            this.f7994a = oVar;
        }

        public final /* synthetic */ void run() {
            if (this.f7994a.isViewValid()) {
                this.f7994a.a().c(com.bytedance.android.live.broadcast.api.a.class);
                ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).exitRoom(true);
                this.f7994a.i();
                com.bytedance.android.live.core.c.a.a(3, "LiveBroadcastFragment", "room close new NewLiveBroadcastEndFragment");
                com.bytedance.android.livesdkapi.depend.model.a.b bVar = this.f7994a.f7960d;
                if (bVar == null) {
                    h.f.b.l.a("liveBroadcastCallback");
                }
                Bundle bundle = new Bundle();
                bundle.putString("live_end_banned_url", this.f7994a.r);
                bundle.putCharSequence("live_end_banned_title", this.f7994a.s);
                bundle.putCharSequence("live_end_banned_reason", this.f7994a.t);
                bundle.putCharSequence("live_end_banned_content", this.f7994a.u);
                bVar.a(bundle);
            }
        }
    }

    public static final class e implements com.bytedance.android.livesdkapi.depend.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f8020a;

        static {
            Covode.recordClassIndex(3968);
        }

        @Override // com.bytedance.android.livesdkapi.depend.a
        public final void a() {
            com.bytedance.android.live.core.c.a.a(4, "LiveBroadcastFragment", "onEnterBackground");
            com.bytedance.android.live.broadcast.api.d.a aVar = this.f8020a.f7969m;
            if (aVar != null) {
                aVar.b(PrivacyCert.Builder.Companion.with("bpea-385").usage("").tag("Switch to background during live broadcast").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
            o.a(this.f8020a.a(), true);
            com.bytedance.android.live.broadcast.stream.c.b bVar = this.f8020a.q;
            if (bVar != null) {
                bVar.c();
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.a
        public final void b() {
            com.bytedance.android.live.core.c.a.a(4, "LiveBroadcastFragment", "onEnterForeground");
            o.a(this.f8020a.a(), false);
            if (this.f8020a.c().f21745a.getValue() == com.bytedance.android.livesdk.tunnel.a.STREAM_ON && com.bytedance.android.livesdk.utils.p.b((Boolean) this.f8020a.a().b(co.class))) {
                com.bytedance.android.live.broadcast.api.d.a aVar = this.f8020a.f7969m;
                if (aVar != null) {
                    aVar.a(PrivacyCert.Builder.Companion.with("bpea-364").usage("").tag("Switch from background to foreground during live broadcast").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                }
                com.bytedance.android.live.broadcast.stream.c.b bVar = this.f8020a.q;
                if (bVar != null) {
                    bVar.b();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(o oVar) {
            this.f8020a = oVar;
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.a.c
    public final boolean j() {
        androidx.fragment.app.i supportFragmentManager;
        List<Fragment> f2;
        androidx.fragment.app.e activity = getActivity();
        if (!(activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null || (f2 = supportFragmentManager.f()) == null)) {
            for (T t2 : f2) {
                if (!(t2 instanceof com.bytedance.android.livesdkapi.depend.a.a)) {
                    t2 = null;
                }
                T t3 = t2;
                if (t3 != null && t3.i_()) {
                    return true;
                }
            }
        }
        androidx.fragment.app.i childFragmentManager = getChildFragmentManager();
        h.f.b.l.b(childFragmentManager, "");
        List<Fragment> f3 = childFragmentManager.f();
        h.f.b.l.b(f3, "");
        for (T t4 : f3) {
            if (!(t4 instanceof com.bytedance.android.livesdkapi.depend.a.a)) {
                t4 = null;
            }
            T t5 = t4;
            if (t5 != null && t5.i_()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.android.live.broadcast.f.a.AbstractC0113a
    public final void m() {
        com.bytedance.android.live.broadcast.b.f fVar;
        if (isViewValid()) {
            HashMap hashMap = new HashMap();
            hashMap.put("show_illegal_review_dialog", true);
            com.bytedance.android.live.core.d.c.a("ttlive_broadcast_action_all", 0, hashMap);
            if (this.L == null) {
                Context context = getContext();
                com.bytedance.android.live.broadcast.f.a aVar = this.f7961e;
                if (aVar == null) {
                    h.f.b.l.a("mLiveIllegalPresenter");
                }
                this.L = com.bytedance.android.live.broadcast.b.f.a(context, aVar);
                com.bytedance.android.live.broadcast.f.a aVar2 = this.f7961e;
                if (aVar2 == null) {
                    h.f.b.l.a("mLiveIllegalPresenter");
                }
                aVar2.f7859h = this.L;
            }
            if (getActivity() != null && (fVar = this.L) != null) {
                androidx.fragment.app.i childFragmentManager = getChildFragmentManager();
                h.f.b.l.b(childFragmentManager, "");
                fVar.show(childFragmentManager, "IllegalReviewDialog");
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.f.a.AbstractC0113a
    public final void o() {
        b(8);
        com.bytedance.android.live.broadcast.d.b.b(10004, e(), f(), this.f7965i);
        com.bytedance.android.live.core.c.a.a(3, "LiveBroadcastFragment", "room close forceEndLive");
        a(PrivacyCert.Builder.Companion.with("bpea-422").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
    }

    static final class ad implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f7974a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SurfaceView f7975b;

        static {
            Covode.recordClassIndex(3939);
        }

        ad(o oVar, SurfaceView surfaceView) {
            this.f7974a = oVar;
            this.f7975b = surfaceView;
        }

        public final void run() {
            MethodCollector.i(6652);
            if (this.f7974a.mStatusDestroyed) {
                MethodCollector.o(6652);
                return;
            }
            ((FrameLayout) this.f7974a.c(R.id.jn)).removeAllViews();
            SurfaceView surfaceView = this.f7975b;
            com.bytedance.android.live.liveinteract.api.d linkCrossRoomWidget = ((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).linkCrossRoomWidget();
            h.f.b.l.b(linkCrossRoomWidget, "");
            int a2 = linkCrossRoomWidget.a();
            com.bytedance.android.live.liveinteract.api.d linkCrossRoomWidget2 = ((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).linkCrossRoomWidget();
            h.f.b.l.b(linkCrossRoomWidget2, "");
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, linkCrossRoomWidget2.b());
            com.bytedance.android.live.liveinteract.api.d linkCrossRoomWidget3 = ((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).linkCrossRoomWidget();
            h.f.b.l.b(linkCrossRoomWidget3, "");
            layoutParams.leftMargin = linkCrossRoomWidget3.a();
            com.bytedance.android.live.liveinteract.api.d linkCrossRoomWidget4 = ((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).linkCrossRoomWidget();
            h.f.b.l.b(linkCrossRoomWidget4, "");
            layoutParams.topMargin = linkCrossRoomWidget4.c();
            surfaceView.setLayoutParams(layoutParams);
            ((FrameLayout) this.f7974a.c(R.id.jn)).addView(this.f7975b);
            MethodCollector.o(6652);
        }
    }

    private final void t() {
        String str;
        if (this.I > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.I;
            long j2 = this.f7967k;
            this.f7967k = 0;
            this.I = 0;
            if (j2 > 0) {
                com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_gift_effect_show_summary").a(a()).a("duration_room", String.valueOf(currentTimeMillis)).a("duration_gift_effect", String.valueOf(j2));
                double d2 = (double) j2;
                Double.isNaN(d2);
                double d3 = (double) currentTimeMillis;
                Double.isNaN(d3);
                com.bytedance.android.livesdk.ab.b a3 = a2.a("gift_effect_live_ratio", String.valueOf((d2 * 1.0d) / d3));
                Object b2 = a().b(ee.class);
                if (b2 == null) {
                    h.f.b.l.b();
                }
                if (((Boolean) b2).booleanValue()) {
                    str = "1";
                } else {
                    str = "0";
                }
                a3.a("is_anchor", str).a("room_type", "video").b();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        a().b(this);
        com.bytedance.android.live.core.f.j.a().removeCallbacksAndMessages(null);
        com.bytedance.android.live.effect.d.g().a(b());
        b().removeCallbacksAndMessages(null);
        LivePerformanceManager.getInstance().reportBatteryDrainage();
        b(1);
        DataChannelGlobal.f34575d.c(com.bytedance.android.livesdk.j.ac.class);
        DataChannelGlobal.f34575d.c(com.bytedance.android.live.broadcast.api.e.class);
        com.bytedance.android.livesdk.b.a.d.a().b();
        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class);
        h.f.b.l.b(a2, "");
        ((com.bytedance.android.live.i.a.d) a2).getLivePlayController().d();
        try {
            ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).clearAssets("effects");
        } catch (IllegalStateException e2) {
            com.bytedance.android.live.core.c.a.a(6, "ALogger", e2.toString());
        }
        c.a.a("ttlive_page_destroy").b("broadcast").a();
        LivePerformanceManager instance = LivePerformanceManager.getInstance();
        instance.onModuleStop("stream");
        instance.stopTimerMonitor();
        instance.release();
        instance.setVideoCaptureFps(-1.0f);
        instance.setPreviewFps(-1.0f);
        instance.setStreamFps(-1.0d);
        com.bytedance.android.live.broadcast.e.a.f7848b.clear();
        com.bytedance.android.live.broadcast.e.a.f7847a.clear();
        com.bytedance.android.live.broadcast.e.a.f7849c = false;
        LivePerformanceManager.getInstance().setExtraParams(null);
        com.bytedance.android.livesdk.performance.g.i();
        d().b(this.P);
        d().b();
        com.bytedance.android.b.a();
        ((com.bytedance.android.live.p.h) com.bytedance.android.live.t.a.a(com.bytedance.android.live.p.h.class)).releaseToolbarView();
        super.onDestroy();
        DataChannelGlobal.f34575d.c(dj.class);
        Iterator<T> it = this.J.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        f.a.b.b bVar = this.v;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (this.G) {
            u();
            return;
        }
        com.bytedance.android.live.u.f.c();
        i();
        com.bytedance.android.live.broadcast.stream.c.b bVar = this.q;
        if (bVar != null) {
            bVar.f8518a.removeCallbacksAndMessages(null);
        }
        com.bytedance.android.live.broadcast.api.d.a aVar = this.f7969m;
        if (aVar != null) {
            aVar.c(PrivacyCert.Builder.Companion.with("bpea-487").usage("").tag("release when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
        p().a();
        com.bytedance.android.live.broadcast.f.a aVar2 = this.f7961e;
        if (aVar2 == null) {
            h.f.b.l.a("mLiveIllegalPresenter");
        }
        aVar2.b();
        com.bytedance.android.livesdk.utils.p.b(q());
        ((IMessageService) com.bytedance.android.live.t.a.a(IMessageService.class)).release(f());
        f();
        b.a.a("LiveBroadcastFragment_OnDestroy");
        u();
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (!this.G) {
            if (c().f21745a.getValue() != com.bytedance.android.livesdk.tunnel.a.STREAM_ON) {
                com.bytedance.android.livesdkapi.depend.model.a.b bVar = this.f7960d;
                if (bVar == null) {
                    h.f.b.l.a("liveBroadcastCallback");
                }
                aa aaVar = this.F;
                if (aaVar == null) {
                    h.f.b.l.a("mPhoneStateReceiver");
                }
                bVar.a(aaVar);
                PrivacyCert build = PrivacyCert.Builder.Companion.with("bpea-386").usage("").tag("Switch to background during live broadcast").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build();
                if (LivePauseLiveSetting.INSTANCE.pauseLiveEnabled()) {
                    com.bytedance.android.livesdk.chatroom.d.b bVar2 = this.w;
                    if (bVar2 != null) {
                        bVar2.a(build);
                    }
                } else {
                    com.bytedance.android.live.broadcast.api.d.a aVar = this.f7969m;
                    if (aVar != null) {
                        aVar.b(build);
                    }
                }
            }
            c.a.a("ttlive_page_pause").b("broadcast").a();
            com.bytedance.android.livesdk.performance.g.h();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!this.G) {
            com.bytedance.android.livesdk.performance.g.g();
            c().f21745a.setValue(com.bytedance.android.livesdk.tunnel.a.STREAM_PAUSE);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PHONE_STATE");
            com.bytedance.android.livesdkapi.depend.model.a.b bVar = this.f7960d;
            if (bVar == null) {
                h.f.b.l.a("liveBroadcastCallback");
            }
            aa aaVar = this.F;
            if (aaVar == null) {
                h.f.b.l.a("mPhoneStateReceiver");
            }
            bVar.a(aaVar, intentFilter);
            if (this.H) {
                b().removeCallbacksAndMessages(null);
                return;
            }
            PrivacyCert build = PrivacyCert.Builder.Companion.with("bpea-365").usage("").tag("Switch from background to foreground during live broadcast").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build();
            if (!LivePauseLiveSetting.INSTANCE.pauseLiveEnabled()) {
                com.bytedance.android.live.broadcast.api.d.a aVar = this.f7969m;
                if (aVar != null) {
                    aVar.a(build);
                }
                com.bytedance.android.live.broadcast.stream.c.b bVar2 = this.q;
                if (bVar2 != null) {
                    bVar2.b();
                }
            } else if (com.bytedance.android.livesdk.utils.p.b((Boolean) a().b(co.class))) {
                com.bytedance.android.live.broadcast.api.d.a aVar2 = this.f7969m;
                if (aVar2 != null) {
                    aVar2.k(build);
                }
                com.bytedance.android.live.broadcast.stream.c.b bVar3 = this.q;
                if (bVar3 != null) {
                    bVar3.b();
                }
            }
            c.a.a("ttlive_page_resume").b("broadcast").a();
            com.bytedance.android.live.effect.d.e().c();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ag implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f7978a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Float f7979b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f7980c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f7981d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f7982e;

        static {
            Covode.recordClassIndex(3942);
        }

        ag(o oVar, Float f2, String str, int i2, boolean z) {
            this.f7978a = oVar;
            this.f7979b = f2;
            this.f7980c = str;
            this.f7981d = i2;
            this.f7982e = z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0057, code lost:
            if (r7 != null) goto L_0x005d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
            if (r2 != null) goto L_0x005d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
            r0 = (h.p) r2.getValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
            if (r0 == null) goto L_0x0073;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0065, code lost:
            r0 = (java.lang.Integer) r0.getFirst();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x006b, code lost:
            if (r0 == null) goto L_0x0073;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
            r5 = r0.intValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0071, code lost:
            if (r5 >= 0) goto L_0x00ba;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
            r0 = (java.util.concurrent.ConcurrentHashMap) com.bytedance.ies.sdk.datachannel.DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.j.dw.class);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x007d, code lost:
            if (r0 == null) goto L_0x018c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
            r0 = r0.entrySet();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0083, code lost:
            if (r0 == null) goto L_0x018c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0085, code lost:
            r5 = r0.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x008d, code lost:
            if (r5.hasNext() == false) goto L_0x0189;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x008f, code lost:
            r2 = r5.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a0, code lost:
            if (h.f.b.l.a(((java.util.Map.Entry) r2).getKey(), (java.lang.Object) r11.f7980c) == false) goto L_0x0089;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a2, code lost:
            r2 = (java.util.Map.Entry) r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a4, code lost:
            if (r2 == null) goto L_0x018c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a6, code lost:
            r0 = (h.p) r2.getValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ac, code lost:
            if (r0 == null) goto L_0x018c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ae, code lost:
            r0 = (java.lang.Integer) r0.getFirst();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b4, code lost:
            if (r0 == null) goto L_0x018c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b6, code lost:
            r5 = r0.intValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ba, code lost:
            r0 = (java.lang.Long) com.bytedance.ies.sdk.datachannel.DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.j.w.class);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c4, code lost:
            if (r0 == null) goto L_0x0183;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c6, code lost:
            r9 = r0.longValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ca, code lost:
            r6 = 0;
            r1 = (java.util.concurrent.ConcurrentHashMap) com.bytedance.ies.sdk.datachannel.DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.j.cu.class);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d6, code lost:
            if (r1 == null) goto L_0x00e9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d8, code lost:
            r0 = (com.bytedance.android.livesdk.ab.c.d) r1.get(r11.f7980c);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e0, code lost:
            if (r0 == null) goto L_0x00e9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e6, code lost:
            if (r0.f13501c >= r9) goto L_0x00e9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e8, code lost:
            r6 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e9, code lost:
            r1 = com.bytedance.android.livesdk.ab.b.a.a("livesdk_live_take_beauty_effective_use").a(r11.f7978a.a()).a("beauty_type", r11.f7980c).a("beauty_type_name", r11.f7980c).a("beauty_type_name_tier2", r7).a("beauty_value", java.lang.Float.valueOf(r11.f7979b.floatValue() * 100.0f)).a("is_default_value", java.lang.Boolean.valueOf(r11.f7982e)).a("is_live_take_default", r6).a("impr_position", r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x013e, code lost:
            if (com.bytedance.android.livesdk.utils.p.c() == false) goto L_0x0180;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0140, code lost:
            r0 = "live_take_page";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0142, code lost:
            r2 = r1.d(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0146, code lost:
            if (r4 == null) goto L_0x017e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0148, code lost:
            r0 = java.lang.Long.valueOf(r4.getId());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0150, code lost:
            r1 = r2.h(java.lang.String.valueOf(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x0158, code lost:
            if (r4 == null) goto L_0x0164;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x015a, code lost:
            r0 = r4.getOwner();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x015e, code lost:
            if (r0 == null) goto L_0x0164;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0160, code lost:
            r3 = r0.getIdStr();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x0164, code lost:
            r1.g(r3).b();
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal.f34575d.a(com.bytedance.android.livesdk.j.n.class, true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x017e, code lost:
            r0 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0180, code lost:
            r0 = "live_take_detail";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0183, code lost:
            r9 = java.lang.System.currentTimeMillis();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0189, code lost:
            r2 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x018c, code lost:
            r5 = r11.f7981d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 406
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.o.ag.run():void");
        }
    }

    static final class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f8026a;

        static {
            Covode.recordClassIndex(3981);
        }

        p(o oVar) {
            this.f8026a = oVar;
        }

        public final void run() {
            int[] iArr;
            boolean z;
            String str;
            int i2;
            String str2;
            int i3;
            int i4;
            int i5;
            int i6;
            com.bytedance.android.live.i.a.d dVar;
            com.bytedance.android.live.n.f dnsOptimizer;
            com.ss.optimizer.live.sdk.dns.a b2;
            LiveCore liveCore;
            if (this.f8026a.isAdded()) {
                m.a().b();
                o oVar = this.f8026a;
                int value = StreamDefinitionLevelSetting.INSTANCE.getValue();
                int length = o.y.length;
                if (value > 0 && length >= value) {
                    iArr = o.y[value - 1];
                } else {
                    iArr = new int[4];
                    com.bytedance.android.livesdkapi.depend.model.live.s sVar = oVar.f7959c;
                    if (sVar == null) {
                        h.f.b.l.a("mStreamUrlExtra");
                    }
                    iArr[0] = sVar.c();
                    com.bytedance.android.livesdkapi.depend.model.live.s sVar2 = oVar.f7959c;
                    if (sVar2 == null) {
                        h.f.b.l.a("mStreamUrlExtra");
                    }
                    iArr[1] = sVar2.d();
                    com.bytedance.android.livesdkapi.depend.model.live.s sVar3 = oVar.f7959c;
                    if (sVar3 == null) {
                        h.f.b.l.a("mStreamUrlExtra");
                    }
                    iArr[2] = sVar3.e();
                    com.bytedance.android.livesdkapi.depend.model.live.s sVar4 = oVar.f7959c;
                    if (sVar4 == null) {
                        h.f.b.l.a("mStreamUrlExtra");
                    }
                    iArr[3] = sVar4.f23186h;
                }
                int value2 = StreamHardwareEncodeSetting.INSTANCE.getValue();
                if (value2 <= 0) {
                    com.bytedance.android.livesdkapi.depend.model.live.s sVar5 = oVar.f7959c;
                    if (sVar5 == null) {
                        h.f.b.l.a("mStreamUrlExtra");
                    }
                    z = sVar5.f23187i;
                } else if (value2 == 2) {
                    z = true;
                } else {
                    z = false;
                }
                com.bytedance.android.livesdkapi.depend.model.live.s sVar6 = oVar.f7959c;
                if (sVar6 == null) {
                    h.f.b.l.a("mStreamUrlExtra");
                }
                int b3 = sVar6.b();
                com.bytedance.android.livesdkapi.depend.model.live.s sVar7 = oVar.f7959c;
                if (sVar7 == null) {
                    h.f.b.l.a("mStreamUrlExtra");
                }
                int a2 = sVar7.a();
                int[] value3 = LiveStreamSizeSetting.INSTANCE.getValue();
                if (value3.length == 2) {
                    b3 = value3[0];
                    a2 = value3[1];
                }
                int i7 = iArr[0];
                int i8 = iArr[1];
                int i9 = iArr[2];
                int i10 = iArr[3];
                Integer valueOf = Integer.valueOf(LiveStreamProfileSetting.INSTANCE.getValue());
                if (valueOf.intValue() > 0 && valueOf != null) {
                    i10 = valueOf.intValue();
                }
                int[] value4 = LiveStreamBitrateSetting.INSTANCE.getValue();
                if (value4.length == 3) {
                    i8 = value4[0];
                    i7 = value4[1];
                    i9 = value4[2];
                }
                int value5 = LiveStreamBitrateAdaptSetting.INSTANCE.getValue();
                if (value5 < 0) {
                    com.bytedance.android.livesdkapi.depend.model.live.s sVar8 = oVar.f7959c;
                    if (sVar8 == null) {
                        h.f.b.l.a("mStreamUrlExtra");
                    }
                    value5 = sVar8.f23188j;
                }
                com.bytedance.android.livesdkapi.depend.model.live.s sVar9 = oVar.f7959c;
                if (sVar9 == null) {
                    h.f.b.l.a("mStreamUrlExtra");
                }
                boolean z2 = sVar9.r;
                if (LiveStreamHwRoiSetting.INSTANCE.enable()) {
                    z2 = true;
                }
                com.bytedance.android.livesdkapi.depend.model.live.s sVar10 = oVar.f7959c;
                if (sVar10 == null) {
                    h.f.b.l.a("mStreamUrlExtra");
                }
                boolean z3 = sVar10.s;
                if (LiveStreamSwRoiSetting.INSTANCE.enable()) {
                    z3 = true;
                }
                h.p[] pVarArr = new h.p[2];
                String str3 = "1";
                if (z) {
                    str = str3;
                } else {
                    str = "0";
                }
                pVarArr[0] = h.v.a("hardware", str);
                com.bytedance.android.livesdkapi.depend.model.live.s sVar11 = oVar.f7959c;
                if (sVar11 == null) {
                    h.f.b.l.a("mStreamUrlExtra");
                }
                if (sVar11.o) {
                    str3 = "2";
                }
                pVarArr[1] = h.v.a("video_codec", str3);
                LivePerformanceManager.getInstance().onModuleStart("stream", h.a.ag.c(pVarArr));
                MediaEngineFactory.setLogLevel(LivePushStreamLogLevelSetting.INSTANCE.getValue());
                AVLog.setupLogIODevice(new c(com.bytedance.android.livesdk.ab.i.b(), com.bytedance.android.livesdk.ab.a.b.PushStream.info));
                com.bytedance.android.livesdk.ap.b<Integer> bVar = com.bytedance.android.livesdk.ap.a.f14015i;
                h.f.b.l.b(bVar, "");
                Integer b4 = bVar.b();
                if (b4 != null && b4.intValue() == 0) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                d.a aVar = new d.a(oVar.getContext());
                aVar.f8584c = 0;
                aVar.f8589h = b3;
                aVar.f8590i = a2;
                aVar.f8586e = i7;
                aVar.f8585d = i8;
                aVar.f8587f = i9;
                aVar.f8592k = i10;
                if (LiveStreamEnableSdkParamsSetting.INSTANCE.enable()) {
                    Room room = oVar.f7958b;
                    if (room == null) {
                        h.f.b.l.a("mRoom");
                    }
                    StreamUrl streamUrl = room.getStreamUrl();
                    h.f.b.l.b(streamUrl, "");
                    str2 = streamUrl.n;
                } else {
                    str2 = "";
                }
                aVar.D = str2;
                com.bytedance.android.livesdkapi.depend.model.live.s sVar12 = oVar.f7959c;
                if (sVar12 == null) {
                    h.f.b.l.a("mStreamUrlExtra");
                }
                aVar.f8588g = sVar12.f();
                aVar.f8591j = z;
                com.bytedance.android.live.base.a a3 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class);
                h.f.b.l.b(a3, "");
                aVar.v = ((com.bytedance.android.live.i.a.d) a3).getProjectKey();
                aVar.E = new com.bytedance.android.live.broadcast.d.e();
                aVar.t = new com.bytedance.android.live.broadcast.d.f();
                aVar.F = new com.bytedance.android.live.broadcast.d.d();
                aVar.u = value5;
                com.bytedance.android.livesdkapi.depend.model.live.s sVar13 = oVar.f7959c;
                if (sVar13 == null) {
                    h.f.b.l.a("mStreamUrlExtra");
                }
                if (sVar13.o) {
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                aVar.y = i3;
                com.bytedance.android.livesdkapi.depend.model.live.s sVar14 = oVar.f7959c;
                if (sVar14 == null) {
                    h.f.b.l.a("mStreamUrlExtra");
                }
                aVar.w = sVar14.p;
                com.bytedance.android.livesdkapi.depend.model.live.s sVar15 = oVar.f7959c;
                if (sVar15 == null) {
                    h.f.b.l.a("mStreamUrlExtra");
                }
                aVar.x = sVar15.q;
                aVar.z = z2;
                String rOIResPath = p.INST.getROIResPath();
                aVar.A = z3;
                aVar.B = rOIResPath;
                aVar.C = true;
                if (LiveUseNewAudioCodecSetting.INSTANCE.enable()) {
                    i4 = 2;
                } else {
                    i4 = 1;
                }
                aVar.o = i4;
                Room room2 = oVar.f7958b;
                if (room2 == null) {
                    h.f.b.l.a("mRoom");
                }
                aVar.N = room2.authenticationValue;
                aVar.f8594m = (long) LiveMaxEnterBackgroundTimeSetting.INSTANCE.getValue();
                aVar.q = i2;
                aVar.r = 5;
                aVar.H = p.INST.getModelFilePath();
                aVar.I = p.INST.getResourceFinder(oVar.getContext());
                aVar.O = true;
                com.bytedance.android.livesdkapi.depend.model.live.s sVar16 = oVar.f7959c;
                if (sVar16 == null) {
                    h.f.b.l.a("mStreamUrlExtra");
                }
                if (sVar16.t == 0) {
                    i5 = 720;
                } else {
                    i5 = sVar16.t;
                }
                com.bytedance.android.livesdkapi.depend.model.live.s sVar17 = oVar.f7959c;
                if (sVar17 == null) {
                    h.f.b.l.a("mStreamUrlExtra");
                }
                if (sVar17.u == 0) {
                    i6 = 1280;
                } else {
                    i6 = sVar17.u;
                }
                d.a a4 = aVar.a(i5, i6);
                a4.J = LiveUseEffectAlgorithmAbSetting.INSTANCE.enable();
                com.bytedance.android.live.broadcast.stream.d a5 = a4.a();
                com.bytedance.android.livesdkapi.depend.model.live.s sVar18 = oVar.f7959c;
                if (sVar18 == null) {
                    h.f.b.l.a("mStreamUrlExtra");
                }
                boolean z4 = sVar18.o;
                com.bytedance.android.live.broadcast.d.a.f7840i = i9;
                com.bytedance.android.live.broadcast.d.a.f7841j = i7;
                com.bytedance.android.live.broadcast.d.a.f7842k = i8;
                com.bytedance.android.live.broadcast.d.a.f7843l = z4;
                com.bytedance.android.live.broadcast.d.a.f7844m = z;
                com.bytedance.android.live.broadcast.d.a.n = b3;
                h.f.b.l.b(a5, "");
                com.bytedance.android.live.broadcast.stream.c cVar = new com.bytedance.android.live.broadcast.stream.c(a5);
                cVar.f8508d = oVar;
                DataChannelGlobal.f34575d.a(com.bytedance.android.live.broadcast.api.e.class, cVar);
                if (!(!PushStreamSupportDnsSetting.INSTANCE.isEnable() || (dVar = (com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)) == null || (dnsOptimizer = dVar.getDnsOptimizer()) == null || (b2 = dnsOptimizer.b()) == null || (liveCore = cVar.f8507c) == null)) {
                    liveCore.setDns(b2);
                }
                oVar.f7969m = cVar;
                o oVar2 = this.f8026a;
                com.bytedance.android.live.broadcast.stream.capture.f fVar = this.f8026a.x;
                com.bytedance.android.livesdkapi.depend.model.live.s sVar19 = this.f8026a.f7959c;
                if (sVar19 == null) {
                    h.f.b.l.a("mStreamUrlExtra");
                }
                oVar2.n = new VideoWidget2(fVar, sVar19, this.f8026a.f7969m);
                ((WidgetManager) this.f8026a.f7957a.getValue()).load(R.id.d98, this.f8026a.n, false);
                this.f8026a.w = new com.bytedance.android.livesdk.chatroom.d.b(this.f8026a.a(), this.f8026a.f7969m, this.f8026a.q);
                o oVar3 = this.f8026a;
                Room room3 = oVar3.f7958b;
                if (room3 == null) {
                    h.f.b.l.a("mRoom");
                }
                StreamUrl streamUrl2 = room3.getStreamUrl();
                h.f.b.l.b(streamUrl2, "");
                int i11 = streamUrl2.f23036c;
                com.bytedance.android.livesdkapi.depend.model.live.s sVar20 = oVar3.f7959c;
                if (sVar20 == null) {
                    h.f.b.l.a("mStreamUrlExtra");
                }
                String str4 = sVar20.f23179a;
                if (2 == i11 && !com.bytedance.common.utility.m.a(str4)) {
                    com.bytedance.android.live.core.c.a.a(3, "LiveBroadcastFragment", "start fetch ngb rtmp url");
                    com.bytedance.ies.e.a.a.a().a(oVar3.b(), new Callable(str4) {
                        /* class com.bytedance.android.livesdk.chatroom.b.f.AnonymousClass2 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ String f14964a;

                        static {
                            Covode.recordClassIndex(8304);
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return NetworkUtils.executeGet(0, this.f14964a, false, false, null, null, false);
                        }

                        {
                            this.f14964a = r2;
                        }
                    }, 13);
                    oVar3.f7962f = true;
                }
                View view = this.f8026a.getView();
                if (view != null) {
                    view.post(new Runnable(this) {
                        /* class com.bytedance.android.live.broadcast.o.p.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ p f8027a;

                        static {
                            Covode.recordClassIndex(3982);
                        }

                        {
                            this.f8027a = r1;
                        }

                        public final void run() {
                            Bundle bundle;
                            com.bytedance.android.live.n.p pVar;
                            o oVar = this.f8027a.f8026a;
                            com.bytedance.android.live.core.performance.b.b(b.a.ShowBInteractionFirstWidget);
                            oVar.o = new dw();
                            com.bytedance.android.live.n.p pVar2 = oVar.o;
                            if (pVar2 != null) {
                                Fragment b2 = pVar2.b();
                                Bundle arguments = oVar.getArguments();
                                c.a aVar = null;
                                if (arguments != null) {
                                    bundle = arguments.getBundle("extra");
                                } else {
                                    bundle = null;
                                }
                                b2.setArguments(bundle);
                                pVar2.a(oVar.f7969m);
                                DataChannel a2 = oVar.a();
                                Room room = oVar.f7958b;
                                if (room == null) {
                                    h.f.b.l.a("mRoom");
                                }
                                a2.b(df.class, room);
                                LivePerformanceManager.getInstance().setIsAnchor(true);
                                pVar2.a(oVar.a(), new ap(oVar));
                                pVar2.a(oVar.n);
                                VideoWidget2 videoWidget2 = oVar.n;
                                if (videoWidget2 != null) {
                                    if (!(pVar2 instanceof c.b)) {
                                        pVar = null;
                                    } else {
                                        pVar = pVar2;
                                    }
                                    videoWidget2.f8743j = (c.b) pVar;
                                }
                                VideoWidget2 videoWidget22 = oVar.n;
                                if (videoWidget22 != null) {
                                    if (pVar2 instanceof c.a) {
                                        aVar = pVar2;
                                    }
                                    videoWidget22.f8744k = aVar;
                                }
                                pVar2.a(new aw(oVar, pVar2));
                                if (oVar.isAdded()) {
                                    oVar.getChildFragmentManager().a().b(R.id.bqk, pVar2.b(), "AbsInteractionFragment").e();
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public final void onStreamStart() {
        long currentTimeMillis;
        this.f7965i = false;
        com.bytedance.android.live.n.p pVar = this.o;
        if (pVar != null) {
            pVar.d();
        }
        WeakHandler b2 = b();
        com.bytedance.android.livesdkapi.depend.model.live.s sVar = this.f7959c;
        if (sVar == null) {
            h.f.b.l.a("mStreamUrlExtra");
        }
        h.f.b.l.d(b2, "");
        h.f.b.l.d(sVar, "");
        if (!com.bytedance.android.live.broadcast.d.a.f7833b) {
            com.bytedance.android.live.core.performance.b.c(b.a.CreateLive);
            com.bytedance.android.live.broadcast.api.c.d.b(c.a.a("ttlive_start_push_video_stream_all").b("duration", Long.valueOf(System.currentTimeMillis() - com.bytedance.android.live.broadcast.d.a.f7832a))).a();
            b2.postDelayed(new a.RunnableC0112a("ttlive_push_video_stream_five_all"), 300000);
            b2.postDelayed(new a.RunnableC0112a("ttlive_push_video_stream_fifteen_all"), 900000);
            b2.postDelayed(new a.RunnableC0112a("ttlive_push_video_stream_twenty_five_all"), 1500000);
            com.bytedance.android.live.broadcast.d.a.f7833b = true;
            long currentTimeMillis2 = System.currentTimeMillis();
            if (!(com.bytedance.android.live.broadcast.d.a.f7834c == 0 || com.bytedance.android.live.broadcast.d.a.f7838g == 0 || com.bytedance.android.live.broadcast.d.a.f7835d == 0 || com.bytedance.android.live.broadcast.d.a.f7838g == 0)) {
                b.a.a("livesdk_broadcast_duration").a("first_show_camera_user", com.bytedance.android.live.broadcast.d.a.f7838g - com.bytedance.android.live.broadcast.d.a.f7834c).a("first_push_stream_user", currentTimeMillis2 - com.bytedance.android.live.broadcast.d.a.f7834c).a("first_show_camera_launch", com.bytedance.android.live.broadcast.d.a.f7838g - com.bytedance.android.live.broadcast.d.a.f7835d).a("first_push_stream_launch", currentTimeMillis2 - com.bytedance.android.live.broadcast.d.a.f7835d).a("video_broadcast_create_launch", com.bytedance.android.live.broadcast.d.a.f7837f - com.bytedance.android.live.broadcast.d.a.f7835d).a("max_bitrate", com.bytedance.android.live.broadcast.d.a.f7840i).a("min_bitrate", com.bytedance.android.live.broadcast.d.a.f7841j).a("default_bitrate", com.bytedance.android.live.broadcast.d.a.f7842k).a("is_bytevc1", com.bytedance.android.live.broadcast.d.a.f7843l ? 1 : 0).a("is_hw", com.bytedance.android.live.broadcast.d.a.f7844m ? 1 : 0).a("definition", com.bytedance.android.live.broadcast.d.a.n).b();
            }
            com.bytedance.android.live.broadcast.d.a.f7839h = System.currentTimeMillis();
        }
        if (LiveNewEffectPanelSetting.INSTANCE.useOldPanel()) {
            com.bytedance.android.livesdk.ap.b<Float> bVar = com.bytedance.android.livesdk.ap.a.Q;
            h.f.b.l.b(bVar, "");
            Float a2 = bVar.a();
            com.bytedance.android.livesdk.ap.b<Float> bVar2 = com.bytedance.android.livesdk.ap.a.R;
            h.f.b.l.b(bVar2, "");
            Float a3 = bVar2.a();
            com.bytedance.android.livesdk.ap.b<Float> bVar3 = com.bytedance.android.livesdk.ap.a.S;
            h.f.b.l.b(bVar3, "");
            Float a4 = bVar3.a();
            Long l2 = (Long) DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.j.w.class);
            if (l2 != null) {
                currentTimeMillis = l2.longValue();
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            if (!h.f.b.l.a(a2, 0.0f)) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) DataChannelGlobal.f34575d.b(cu.class);
                if (concurrentHashMap != null) {
                    com.bytedance.android.livesdkapi.depend.model.a b3 = new com.bytedance.android.live.broadcast.c.b().b();
                    h.f.b.l.b(b3, "");
                    h.f.b.l.b(a2, "");
                    concurrentHashMap.put("smooth", new com.bytedance.android.livesdk.ab.c.d(b3, a2.floatValue(), currentTimeMillis));
                }
                boolean a5 = h.f.b.l.a(a2, LiveBeautyParamSetting.INSTANCE.getValue().f18944b.f18949b);
                com.bytedance.android.live.effect.api.d g2 = com.bytedance.android.live.effect.d.g();
                h.f.b.l.b(a2, "");
                g2.a("smooth", a2.floatValue(), 1, a5);
                a("smooth", a2, a5, 1);
            }
            if (!h.f.b.l.a(a3, 0.0f)) {
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) DataChannelGlobal.f34575d.b(cu.class);
                if (concurrentHashMap2 != null) {
                    com.bytedance.android.livesdkapi.depend.model.a c2 = new com.bytedance.android.live.broadcast.c.b().c();
                    h.f.b.l.b(c2, "");
                    h.f.b.l.b(a3, "");
                    concurrentHashMap2.put("big_eye", new com.bytedance.android.livesdk.ab.c.d(c2, a3.floatValue(), currentTimeMillis));
                }
                boolean a6 = h.f.b.l.a(a3, LiveBeautyParamSetting.INSTANCE.getValue().f18945c.f18949b);
                com.bytedance.android.live.effect.api.d g3 = com.bytedance.android.live.effect.d.g();
                h.f.b.l.b(a3, "");
                g3.a("big_eye", a3.floatValue(), 2, h.f.b.l.a(a3, LiveBeautyParamSetting.INSTANCE.getValue().f18945c.f18949b));
                a("big_eye", a3, a6, 2);
            }
            if (!h.f.b.l.a(a4, 0.0f)) {
                ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap) DataChannelGlobal.f34575d.b(cu.class);
                if (concurrentHashMap3 != null) {
                    com.bytedance.android.livesdkapi.depend.model.a c3 = new com.bytedance.android.live.broadcast.c.b().c();
                    h.f.b.l.b(c3, "");
                    h.f.b.l.b(a4, "");
                    concurrentHashMap3.put("cheek", new com.bytedance.android.livesdk.ab.c.d(c3, a4.floatValue(), currentTimeMillis));
                }
                boolean a7 = h.f.b.l.a(a4, LiveBeautyParamSetting.INSTANCE.getValue().f18946d.f18949b);
                com.bytedance.android.live.effect.api.d g4 = com.bytedance.android.live.effect.d.g();
                h.f.b.l.b(a4, "");
                g4.a("cheek", a4.floatValue(), 3, h.f.b.l.a(a4, LiveBeautyParamSetting.INSTANCE.getValue().f18946d.f18949b));
                a("cheek", a4, a7, 3);
            }
        }
    }

    public static final class ap extends com.bytedance.android.live.n.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f7995a;

        static {
            Covode.recordClassIndex(3951);
        }

        ap(o oVar) {
            this.f7995a = oVar;
        }

        @Override // com.bytedance.android.live.n.u
        public final void a(bv bvVar) {
            h.f.b.l.d(bvVar, "");
            o.b(this.f7995a).a(bvVar);
        }
    }

    public static final class aq extends com.bytedance.android.live.core.f.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f7996a;

        static {
            Covode.recordClassIndex(3952);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        aq(o oVar) {
            this.f7996a = oVar;
        }

        @Override // com.bytedance.android.live.core.f.i
        public final void a(Animatable animatable) {
            h.f.b.l.d(animatable, "");
            FrameLayout frameLayout = (FrameLayout) this.f7996a.c(R.id.bqb);
            if (frameLayout != null) {
                frameLayout.setClickable(false);
            }
        }
    }

    public static final class as extends com.bytedance.android.live.core.f.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f7998a;

        static {
            Covode.recordClassIndex(3954);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        as(o oVar) {
            this.f7998a = oVar;
        }

        @Override // com.bytedance.android.live.core.f.i
        public final void a(Animatable animatable) {
            h.f.b.l.d(animatable, "");
            FrameLayout frameLayout = (FrameLayout) this.f7998a.c(R.id.bqb);
            if (frameLayout != null) {
                frameLayout.setClickable(false);
            }
        }
    }

    public static final class at extends com.bytedance.android.live.core.f.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f7999a;

        static {
            Covode.recordClassIndex(3955);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        at(o oVar) {
            this.f7999a = oVar;
        }

        @Override // com.bytedance.android.live.core.f.i
        public final void a(Animatable animatable) {
            h.f.b.l.d(animatable, "");
            FrameLayout frameLayout = (FrameLayout) this.f7999a.c(R.id.bqb);
            if (frameLayout != null) {
                frameLayout.setClickable(false);
            }
        }
    }

    final class b implements com.bytedance.android.live.p.f {
        static {
            Covode.recordClassIndex(3962);
        }

        @Override // com.bytedance.android.live.p.f
        public final void a() {
        }

        @Override // com.bytedance.android.live.p.f
        public final void a(View view, DataChannel dataChannel) {
        }

        @Override // com.bytedance.android.live.p.f
        public final void a(boolean z) {
        }

        @Override // com.bytedance.android.live.p.f
        public final void b() {
        }

        @Override // com.bytedance.android.live.p.f
        public final void b(View view, DataChannel dataChannel) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b() {
        }

        static final class a implements DialogInterface.OnDismissListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f8009a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.bytedance.android.live.effect.api.a.h f8010b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Float f8011c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Float f8012d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Float f8013e;

            static {
                Covode.recordClassIndex(3963);
            }

            a(b bVar, com.bytedance.android.live.effect.api.a.h hVar, Float f2, Float f3, Float f4) {
                this.f8009a = bVar;
                this.f8010b = hVar;
                this.f8011c = f2;
                this.f8012d = f3;
                this.f8013e = f4;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                Float e2 = this.f8010b.e("smooth/frag/smoothIntensity");
                Float e3 = this.f8010b.e("FaceDistortionEyeIntensity");
                Float e4 = this.f8010b.e("FaceDistortionCheekIntensity");
                if (!h.f.b.l.a(this.f8011c, e2)) {
                    o.this.a("smooth", e2, h.f.b.l.a(e2, LiveBeautyParamSetting.INSTANCE.getValue().f18944b.f18949b), 1);
                }
                if (!h.f.b.l.a(e3, this.f8012d)) {
                    o.this.a("big_eye", e3, h.f.b.l.a(e3, LiveBeautyParamSetting.INSTANCE.getValue().f18945c.f18949b), 2);
                }
                if (!h.f.b.l.a(this.f8013e, e4)) {
                    o.this.a("cheek", e4, h.f.b.l.a(e4, LiveBeautyParamSetting.INSTANCE.getValue().f18946d.f18949b), 3);
                }
            }
        }

        /* renamed from: com.bytedance.android.live.broadcast.o$b$b  reason: collision with other inner class name */
        static final class DialogInterface$OnDismissListenerC0115b implements DialogInterface.OnDismissListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f8014a;

            static {
                Covode.recordClassIndex(3964);
            }

            DialogInterface$OnDismissListenerC0115b(b bVar) {
                this.f8014a = bVar;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                String str;
                int i2;
                com.bytedance.android.live.effect.api.e eVar;
                com.bytedance.android.live.effect.api.e eVar2;
                com.bytedance.android.live.effect.d.g().a(o.this.b(), o.this.a(), false);
                com.bytedance.android.live.effect.api.d g2 = com.bytedance.android.live.effect.d.g();
                DataChannel a2 = o.this.a();
                VideoWidget2 videoWidget2 = o.this.n;
                if (videoWidget2 == null || (eVar2 = videoWidget2.f8740g) == null || (str = eVar2.e()) == null) {
                    str = "";
                }
                VideoWidget2 videoWidget22 = o.this.n;
                if (videoWidget22 == null || (eVar = videoWidget22.f8740g) == null) {
                    i2 = -1;
                } else {
                    i2 = eVar.f();
                }
                g2.b(a2, false, str, true, i2 + 1);
            }
        }

        public final void onClick(View view) {
            h.f.b.l.d(view, "");
            if (o.this.n != null) {
                b.a.a("live_take_beauty_click").a(o.this.a()).b("live_take").c("click").b();
                String valueOf = String.valueOf(o.this.f());
                String valueOf2 = String.valueOf(o.a(o.this).getOwnerUserId());
                if (LiveNewEffectPanelSetting.INSTANCE.useNewPanel()) {
                    com.bytedance.android.livesdk.v b2 = com.bytedance.android.live.effect.d.b();
                    androidx.fragment.app.i childFragmentManager = o.this.getChildFragmentManager();
                    h.f.b.l.b(childFragmentManager, "");
                    b2.show(childFragmentManager, "");
                    b2.r = new DialogInterface$OnDismissListenerC0115b(this);
                    return;
                }
                com.bytedance.android.live.effect.api.a.h d2 = com.bytedance.android.live.effect.d.d();
                Float e2 = d2.e("smooth/frag/smoothIntensity");
                Float e3 = d2.e("FaceDistortionEyeIntensity");
                Float e4 = d2.e("FaceDistortionCheekIntensity");
                o oVar = o.this;
                VideoWidget2 videoWidget2 = oVar.n;
                if (videoWidget2 == null) {
                    h.f.b.l.b();
                }
                com.bytedance.android.livesdk.v a2 = com.bytedance.android.live.effect.d.a(videoWidget2, new com.bytedance.android.live.effect.model.b(valueOf, valueOf2, "live_take_detail"));
                androidx.fragment.app.i childFragmentManager2 = o.this.getChildFragmentManager();
                h.f.b.l.b(childFragmentManager2, "");
                a2.show(childFragmentManager2, "LiveBeautyFilterDialogFragment");
                a2.r = new a(this, d2, e2, e3, e4);
                oVar.p = a2;
            }
        }
    }

    public static final class j implements f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f8022a;

        static {
            Covode.recordClassIndex(3973);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(o oVar) {
            this.f8022a = oVar;
        }

        @Override // com.bytedance.android.live.effect.api.f.a
        public final void a(FilterModel filterModel, float f2) {
            h.f.b.l.d(filterModel, "");
            VideoWidget2 videoWidget2 = this.f8022a.n;
            if (videoWidget2 != null && videoWidget2.f8740g != null) {
                videoWidget2.f8740g.a(filterModel, f2);
            }
        }

        @Override // com.bytedance.android.live.effect.api.f.a
        public final void a(int i2, boolean z, boolean z2) {
            boolean z3;
            String str;
            if (this.f8022a.n != null) {
                VideoWidget2 videoWidget2 = this.f8022a.n;
                if (videoWidget2 == null) {
                    h.f.b.l.b();
                }
                com.bytedance.android.live.effect.api.e eVar = videoWidget2.f8740g;
                if (eVar != null) {
                    h.f.b.l.b(eVar, "");
                    eVar.a(i2);
                    VideoWidget2 videoWidget22 = this.f8022a.n;
                    if (videoWidget22 == null) {
                        h.f.b.l.b();
                    }
                    if (i2 < eVar.f()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    videoWidget22.a(z3);
                    List<FilterModel> a2 = this.f8022a.d().a();
                    if (i2 < a2.size()) {
                        str = a2.get(i2).getFilterId();
                    } else {
                        str = "";
                    }
                    h.f.b.l.b(str, "");
                    if (str.length() > 0 && (!h.f.b.l.a((Object) str, (Object) "0"))) {
                        this.f8022a.a().c(com.bytedance.android.live.effect.api.g.class, str);
                        if (LiveNewEffectPanelSetting.INSTANCE.useOldPanel()) {
                            com.bytedance.android.live.effect.d.g().a(this.f8022a.a(), z, str, z2, i2 + 1);
                        }
                        c.a.b("ttlive_click_change_filter").b("broadcast").a("select_filter_id", str).a("select_filter_position", Integer.valueOf(i2)).a();
                    }
                    com.bytedance.android.live.effect.d.f().a(this.f8022a.f());
                }
            }
        }
    }

    private final void a(Runnable runnable) {
        b().post(runnable);
    }

    /* access modifiers changed from: package-private */
    public static final class ak<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f7986a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f7987b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f7988c;

        static {
            Covode.recordClassIndex(3946);
        }

        ak(o oVar, String str, long j2) {
            this.f7986a = oVar;
            this.f7987b = str;
            this.f7988c = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f7986a.a(this.f7987b, this.f7988c, false, (Integer) 0);
        }
    }

    static final class ax implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Cdo f8004a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o f8005b;

        static {
            Covode.recordClassIndex(3959);
        }

        ax(Cdo doVar, o oVar) {
            this.f8004a = doVar;
            this.f8005b = oVar;
        }

        public final void onClick(View view) {
            o.b(this.f8005b).a();
            this.f8004a.dismiss();
        }
    }

    public static final /* synthetic */ Room a(o oVar) {
        Room room = oVar.f7958b;
        if (room == null) {
            h.f.b.l.a("mRoom");
        }
        return room;
    }

    public static final /* synthetic */ com.bytedance.android.live.broadcast.f.a b(o oVar) {
        com.bytedance.android.live.broadcast.f.a aVar = oVar.f7961e;
        if (aVar == null) {
            h.f.b.l.a("mLiveIllegalPresenter");
        }
        return aVar;
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public final void onNetworkStatus(int i2) {
        com.bytedance.android.live.n.p pVar;
        if (isViewValid() && (pVar = this.o) != null) {
            pVar.a(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class af<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f7977a;

        static {
            Covode.recordClassIndex(3941);
        }

        af(o oVar) {
            this.f7977a = oVar;
        }

        @Override // f.a.d.f
        public final void accept(T t) {
            if (t instanceof com.bytedance.android.livesdk.gift.a) {
                this.f7977a.onEvent((com.bytedance.android.livesdk.gift.a) t);
            } else if (t instanceof com.bytedance.android.livesdk.chatroom.c.r) {
                this.f7977a.onEvent((com.bytedance.android.livesdk.chatroom.c.r) t);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class ah extends h.f.b.j implements h.f.a.b<PrivacyCert, h.z> {
        static {
            Covode.recordClassIndex(3943);
        }

        ah(o oVar) {
            super(1, oVar, o.class, "onFinishBroadcastConfirmClick", "onFinishBroadcastConfirmClick(Lcom/bytedance/bpea/basics/PrivacyCert;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(PrivacyCert privacyCert) {
            PrivacyCert privacyCert2 = privacyCert;
            h.f.b.l.d(privacyCert2, "");
            ((o) this.receiver).b(privacyCert2);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class an implements DialogInterface.OnCancelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Integer f7993a;

        static {
            Covode.recordClassIndex(3949);
        }

        an(Integer num) {
            this.f7993a = num;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            Integer num = this.f7993a;
            if (num != null && num.intValue() == 4) {
                ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).logBoostCardLiveEndClick(2);
            }
        }
    }

    static final class ba implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f8015a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f8016b = null;

        static {
            Covode.recordClassIndex(3965);
        }

        ba(o oVar) {
            this.f8015a = oVar;
        }

        public final void onClick(View view) {
            com.bytedance.android.livesdk.browser.c.d webViewManager = ((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).webViewManager();
            Context context = this.f8015a.getContext();
            d.a b2 = com.bytedance.android.livesdk.browser.c.e.b(this.f8016b);
            b2.f14292c = true;
            webViewManager.a(context, b2);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.o$o  reason: collision with other inner class name */
    static final class C0116o implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0116o f8025a = new C0116o();

        static {
            Covode.recordClassIndex(3980);
        }

        C0116o() {
        }

        @Override // com.bytedance.android.live.i.a.b.a
        public final void a(String str) {
            com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class);
            h.f.b.l.b(a2, "");
            ((com.bytedance.android.live.i.a.d) a2).getLivePlayerLog().a(str);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public final void onInfo(float f2) {
        if (com.bytedance.android.livesdk.utils.p.b()) {
            isViewValid();
        } else {
            a(new z(this, f2));
        }
    }

    static final class x<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdkapi.model.b f8028a;

        static final class b<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            public static final b f8030a = new b();

            static {
                Covode.recordClassIndex(3992);
            }

            b() {
            }

            @Override // f.a.d.f
            public final void accept(Object obj) {
            }
        }

        static {
            Covode.recordClassIndex(3990);
        }

        x(com.bytedance.android.livesdkapi.model.b bVar) {
            this.f8028a = bVar;
        }

        static final class a<T, R> implements f.a.d.g {

            /* renamed from: a  reason: collision with root package name */
            public static final a f8029a = new a();

            static {
                Covode.recordClassIndex(3991);
            }

            a() {
            }

            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
                h.f.b.l.d(dVar, "");
                Object obj2 = dVar.data;
                h.f.b.l.b(obj2, "");
                int i2 = ((com.bytedance.android.live.base.model.live.d) obj2).f7414a;
                if (i2 == 0 || i2 == 51) {
                    f.a.t b2 = f.a.t.b(dVar);
                    h.f.b.l.b(b2, "");
                    return b2;
                }
                f.a.t a2 = f.a.t.a(new Exception("retry"));
                h.f.b.l.b(a2, "");
                return a2;
            }
        }

        static final class c<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            public static final c f8031a = new c();

            static {
                Covode.recordClassIndex(3993);
            }

            c() {
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                Throwable th = (Throwable) obj;
                h.f.b.l.d(th, "");
                com.bytedance.android.live.core.d.c.a("ttlive_anchor_task_report", 1, h.a.ag.c(h.v.a("error_msg", th.getMessage())));
            }
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.livesdkapi.model.b bVar = this.f8028a;
            h.f.b.l.b(bVar, "");
            List<String> list = bVar.f23273d;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((LIveTaskApi) com.bytedance.android.live.network.e.a().a(LIveTaskApi.class)).report(it.next(), new HashMap()).a((f.a.d.g<? super com.bytedance.android.live.network.response.d<com.bytedance.android.live.base.model.live.d>, ? extends f.a.x<? extends R>>) a.f8029a, false).g(com.bytedance.android.livesdk.util.rxutils.i.a((long) ((Math.random() * 1001.0d) + 4000.0d))).a(b.f8030a, c.f8031a);
                }
            }
        }
    }

    static final class ar implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f7997a;

        static {
            Covode.recordClassIndex(3953);
        }

        ar(o oVar) {
            this.f7997a = oVar;
        }

        public final void onClick(View view) {
            FrameLayout frameLayout = (FrameLayout) this.f7997a.c(R.id.bqb);
            h.f.b.l.b(frameLayout, "");
            frameLayout.setVisibility(8);
            FrameLayout frameLayout2 = (FrameLayout) this.f7997a.c(R.id.bqb);
            h.f.b.l.b(frameLayout2, "");
            frameLayout2.setClickable(false);
        }
    }

    static final class au implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f8000a;

        static {
            Covode.recordClassIndex(3956);
        }

        au(o oVar) {
            this.f8000a = oVar;
        }

        public final void onClick(View view) {
            FrameLayout frameLayout = (FrameLayout) this.f8000a.c(R.id.bqb);
            h.f.b.l.b(frameLayout, "");
            frameLayout.setVisibility(8);
            FrameLayout frameLayout2 = (FrameLayout) this.f8000a.c(R.id.bqb);
            h.f.b.l.b(frameLayout2, "");
            frameLayout2.setClickable(false);
        }
    }

    static final class q extends h.f.b.m implements h.f.a.b<h.z, h.z> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(3983);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(o oVar) {
            super(1);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(h.z zVar) {
            h.f.b.l.d(zVar, "");
            this.this$0.a(PrivacyCert.Builder.Companion.with("bpea-1041").usage("").tag("paid event").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            return h.z.f158842a;
        }
    }

    static final class t extends h.f.b.m implements h.f.a.b<Boolean, h.z> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(3986);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(o oVar) {
            super(1);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            o oVar = this.this$0;
            if (booleanValue) {
                oVar.f7968l = System.currentTimeMillis();
            } else if (oVar.f7968l > 0) {
                oVar.f7967k += System.currentTimeMillis() - oVar.f7968l;
                oVar.f7968l = 0;
            }
            return h.z.f158842a;
        }
    }

    static final class w extends h.f.b.m implements h.f.a.b<com.bytedance.android.live.liveinteract.api.b.o, h.z> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(3989);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(o oVar) {
            super(1);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.android.live.liveinteract.api.b.o oVar) {
            VideoWidget2 videoWidget2;
            View view;
            com.bytedance.android.live.liveinteract.api.b.o oVar2 = oVar;
            h.f.b.l.d(oVar2, "");
            o oVar3 = this.this$0;
            if (!(!oVar2.f10006d || (videoWidget2 = oVar3.n) == null || (view = videoWidget2.getView()) == null)) {
                view.post(new aa(oVar3, oVar2));
            }
            return h.z.f158842a;
        }
    }

    private final <T> void a(Class<T> cls) {
        ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) com.bytedance.android.livesdk.an.a.a().a((Class) cls).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(com.bytedance.android.livesdk.util.rxutils.autodispose.e.a((Fragment) this))).a(new af(this));
    }

    @Override // com.bytedance.android.live.broadcast.f.a.AbstractC0113a
    public final void b(CharSequence charSequence) {
        h.f.b.l.d(charSequence, "");
        if (isViewValid()) {
            q().b(charSequence);
        }
    }

    public final void onEvent(com.bytedance.android.livesdk.gift.a aVar) {
        h.f.b.l.d(aVar, "");
        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IGiftService.class);
        h.f.b.l.b(a2, "");
        for (com.bytedance.android.livesdk.model.u uVar : ((IGiftService) a2).getStickerGifts()) {
            h.f.b.l.b(uVar, "");
            if (uVar.n == aVar.f17831a) {
                com.bytedance.android.live.broadcast.c.a.p.a(f());
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class aj<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f7983a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f7984b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f7985c;

        static {
            Covode.recordClassIndex(3945);
        }

        aj(o oVar, String str, long j2) {
            this.f7983a = oVar;
            this.f7984b = str;
            this.f7985c = j2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
            if (r2 == null) goto L_0x0032;
         */
        @Override // f.a.d.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r8) {
            /*
                r7 = this;
                com.bytedance.android.live.network.response.d r8 = (com.bytedance.android.live.network.response.d) r8
                java.lang.Object r0 = r8.data
                com.bytedance.android.live.broadcast.model.b r0 = (com.bytedance.android.live.broadcast.model.b) r0
                int r1 = r0.f7891b
                r0 = 4
                if (r1 != r0) goto L_0x0016
                java.lang.Class<com.bytedance.android.live.gift.IGiftService> r0 = com.bytedance.android.live.gift.IGiftService.class
                com.bytedance.android.live.base.a r0 = com.bytedance.android.live.t.a.a(r0)
                com.bytedance.android.live.gift.IGiftService r0 = (com.bytedance.android.live.gift.IGiftService) r0
                r0.logBoostCardLiveEndShow()
            L_0x0016:
                com.bytedance.android.live.broadcast.o r1 = r7.f7983a
                java.lang.Object r0 = r8.data
                com.bytedance.android.live.broadcast.model.b r0 = (com.bytedance.android.live.broadcast.model.b) r0
                if (r0 == 0) goto L_0x0032
                com.bytedance.android.live.broadcast.model.b$a r0 = r0.f7890a
                if (r0 == 0) goto L_0x0032
                java.lang.String r2 = r0.f7892a
                if (r2 == 0) goto L_0x0032
                int r0 = r2.length()
                if (r0 != 0) goto L_0x002e
                java.lang.String r2 = r7.f7984b
            L_0x002e:
                java.lang.String r2 = (java.lang.String) r2
                if (r2 != 0) goto L_0x0034
            L_0x0032:
                java.lang.String r2 = r7.f7984b
            L_0x0034:
                long r3 = r7.f7985c
                r5 = 1
                java.lang.Object r0 = r8.data
                com.bytedance.android.live.broadcast.model.b r0 = (com.bytedance.android.live.broadcast.model.b) r0
                int r0 = r0.f7891b
                java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
                r1.a(r2, r3, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.o.aj.accept(java.lang.Object):void");
        }
    }

    public final void b(int i2) {
        com.bytedance.android.live.core.c.a.a(3, "LiveBroadcastFragment", "stopLive: reason=".concat(String.valueOf(i2)));
        com.bytedance.android.live.broadcast.stream.c.b bVar = this.q;
        if (bVar != null) {
            bVar.a(i2);
        }
        b().removeCallbacksAndMessages(null);
        if (this.f7961e != null) {
            com.bytedance.android.live.broadcast.f.a aVar = this.f7961e;
            if (aVar == null) {
                h.f.b.l.a("mLiveIllegalPresenter");
            }
            aVar.c();
        }
        this.H = true;
        com.bytedance.android.live.core.performance.b.c(b.a.CreateLive);
        t();
        LivePerformanceManager.getInstance().onExitRoom();
    }

    static final class r extends h.f.b.m implements h.f.a.b<com.bytedance.android.livesdk.chatroom.c.q, h.z> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(3984);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(o oVar) {
            super(1);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.android.livesdk.chatroom.c.q qVar) {
            MethodCollector.i(7718);
            com.bytedance.android.livesdk.chatroom.c.q qVar2 = qVar;
            h.f.b.l.d(qVar2, "");
            o oVar = this.this$0;
            if (oVar.isViewValid()) {
                int i2 = qVar2.f15140a;
                if (i2 == 7) {
                    com.bytedance.android.live.core.c.a.a(3, "interact", "onEvent pause normal stream push");
                    oVar.f7964h = true;
                    com.bytedance.android.live.broadcast.stream.c.b bVar = oVar.q;
                    if (bVar != null) {
                        bVar.a();
                    }
                } else if (i2 == 8) {
                    com.bytedance.android.live.core.c.a.a(3, "interact", "onEvent resume normal stream push");
                    oVar.f7964h = false;
                } else if (i2 == 10) {
                    ((FrameLayout) oVar.c(R.id.jn)).removeAllViews();
                    Object obj = qVar2.f15141b;
                    if (obj != null) {
                        SurfaceView surfaceView = (SurfaceView) obj;
                        surfaceView.setLayoutParams(new WindowManager.LayoutParams(-1, -1));
                        ((FrameLayout) oVar.c(R.id.jn)).addView(surfaceView);
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.SurfaceView");
                        MethodCollector.o(7718);
                        throw nullPointerException;
                    }
                } else if (i2 == 11) {
                    ((FrameLayout) oVar.c(R.id.jn)).removeAllViews();
                }
            }
            h.z zVar = h.z.f158842a;
            MethodCollector.o(7718);
            return zVar;
        }
    }

    static final class s extends h.f.b.m implements h.f.a.b<com.bytedance.android.livesdk.chatroom.c.p, h.z> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(3985);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(o oVar) {
            super(1);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.android.livesdk.chatroom.c.p pVar) {
            View view;
            View view2;
            View view3;
            VideoWidget2 videoWidget2;
            View view4;
            VideoWidget2 videoWidget22;
            View view5;
            com.bytedance.android.livesdk.chatroom.c.p pVar2 = pVar;
            h.f.b.l.d(pVar2, "");
            o oVar = this.this$0;
            if (oVar.isViewValid() && (view = oVar.getView()) != null) {
                h.f.b.l.b(view, "");
                int i2 = pVar2.f15136a;
                SurfaceView surfaceView = null;
                if (i2 == 0) {
                    Room room = oVar.f7958b;
                    if (room == null) {
                        h.f.b.l.a("mRoom");
                    }
                    if (room.background != null) {
                        com.bytedance.common.utility.n.a(oVar.c(R.id.cbz), 0);
                        if (Build.VERSION.SDK_INT >= 23) {
                            HSImageView hSImageView = (HSImageView) oVar.c(R.id.cbz);
                            h.f.b.l.b(hSImageView, "");
                            hSImageView.setForeground(null);
                        }
                        HSImageView hSImageView2 = (HSImageView) oVar.c(R.id.cbz);
                        Room room2 = oVar.f7958b;
                        if (room2 == null) {
                            h.f.b.l.a("mRoom");
                        }
                        com.bytedance.android.live.core.f.k.a(hSImageView2, room2.background);
                    } else {
                        view.setBackgroundResource(2131234018);
                    }
                    VideoWidget2 videoWidget23 = oVar.n;
                    if (!(videoWidget23 == null || (view2 = videoWidget23.getView()) == null)) {
                        view2.post(new ab(oVar));
                    }
                } else if (i2 == 1) {
                    view.setBackgroundColor(Color.parseColor("#303342"));
                    com.bytedance.common.utility.n.a(oVar.c(R.id.cbz), 8);
                    VideoWidget2 videoWidget24 = oVar.n;
                    if (!(videoWidget24 == null || (view3 = videoWidget24.getView()) == null)) {
                        view3.post(new ac(oVar));
                    }
                } else if (i2 == 2) {
                    Object obj = pVar2.f15137b;
                    if (obj instanceof SurfaceView) {
                        surfaceView = obj;
                    }
                    SurfaceView surfaceView2 = surfaceView;
                    if (!(surfaceView2 == null || (videoWidget2 = oVar.n) == null || (view4 = videoWidget2.getView()) == null)) {
                        view4.post(new ad(oVar, surfaceView2));
                    }
                } else if (!(i2 != 3 || (videoWidget22 = oVar.n) == null || (view5 = videoWidget22.getView()) == null)) {
                    view5.post(new ae(oVar));
                }
            }
            return h.z.f158842a;
        }
    }

    private static void a(long j2) {
        long j3;
        long currentTimeMillis;
        String str = "";
        if (!TextUtils.isEmpty((CharSequence) DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.j.am.class))) {
            Long l2 = (Long) DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.j.w.class);
            if (l2 != null) {
                currentTimeMillis = l2.longValue();
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            String str2 = (String) DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.j.am.class);
            if (str2 != null) {
                str = str2;
            }
            f.a.a(str, com.bytedance.android.livesdk.ap.a.O.a().intValue() + 1, j2, currentTimeMillis);
            return;
        }
        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IEffectService.class);
        h.f.b.l.b(a2, str);
        com.bytedance.android.live.effect.api.f liveFilterManager = ((IEffectService) a2).getLiveFilterManager();
        Integer a3 = com.bytedance.android.livesdk.ap.a.O.a();
        if (a3.intValue() < liveFilterManager.a().size()) {
            List<FilterModel> a4 = liveFilterManager.a();
            h.f.b.l.b(a3, str);
            String filterId = a4.get(a3.intValue()).getFilterId();
            h.u uVar = (h.u) DataChannelGlobal.f34575d.b(cv.class);
            Long l3 = (Long) DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.j.w.class);
            if (l3 != null) {
                j3 = l3.longValue();
            } else {
                j3 = 0;
            }
            if (uVar != null && h.f.b.l.a(uVar.getFirst(), (Object) filterId)) {
                j3 = ((Number) uVar.getThird()).longValue();
            }
            h.f.b.l.b(filterId, str);
            f.a.a(filterId, a3.intValue() + 1, j3, j2);
        }
    }

    private final void c(PrivacyCert privacyCert) {
        if (this.mStatusActive && !this.H && !this.f7964h) {
            Room room = this.f7958b;
            if (room == null) {
                h.f.b.l.a("mRoom");
            }
            StreamUrl streamUrl = room.getStreamUrl();
            h.f.b.l.b(streamUrl, "");
            String str = streamUrl.q;
            if (str == null || str.length() == 0) {
                Room room2 = this.f7958b;
                if (room2 == null) {
                    h.f.b.l.a("mRoom");
                }
                StreamUrl streamUrl2 = room2.getStreamUrl();
                h.f.b.l.b(streamUrl2, "");
                Room room3 = this.f7958b;
                if (room3 == null) {
                    h.f.b.l.a("mRoom");
                }
                StreamUrl streamUrl3 = room3.getStreamUrl();
                h.f.b.l.b(streamUrl3, "");
                streamUrl2.q = streamUrl3.a();
            }
            com.bytedance.android.live.broadcast.api.d.a aVar = this.f7969m;
            if (aVar != null) {
                aVar.h(privacyCert);
            }
            com.bytedance.android.live.broadcast.stream.f.a("capture_audio");
            com.bytedance.android.livesdk.ab.a a2 = c.a.a("ttlive_stream_url");
            if (LiveStreamEnableUrlListSetting.INSTANCE.enable()) {
                com.bytedance.android.live.broadcast.api.d.a aVar2 = this.f7969m;
                if (aVar2 != null) {
                    Room room4 = this.f7958b;
                    if (room4 == null) {
                        h.f.b.l.a("mRoom");
                    }
                    StreamUrl streamUrl4 = room4.getStreamUrl();
                    h.f.b.l.b(streamUrl4, "");
                    aVar2.a(streamUrl4.f23038e);
                }
                Room room5 = this.f7958b;
                if (room5 == null) {
                    h.f.b.l.a("mRoom");
                }
                StreamUrl streamUrl5 = room5.getStreamUrl();
                h.f.b.l.b(streamUrl5, "");
                a2.a("url_list", streamUrl5.f23038e.toString());
            } else {
                com.bytedance.android.live.broadcast.api.d.a aVar3 = this.f7969m;
                if (aVar3 != null) {
                    Room room6 = this.f7958b;
                    if (room6 == null) {
                        h.f.b.l.a("mRoom");
                    }
                    StreamUrl streamUrl6 = room6.getStreamUrl();
                    h.f.b.l.b(streamUrl6, "");
                    aVar3.a(streamUrl6.q);
                }
                Room room7 = this.f7958b;
                if (room7 == null) {
                    h.f.b.l.a("mRoom");
                }
                StreamUrl streamUrl7 = room7.getStreamUrl();
                h.f.b.l.b(streamUrl7, "");
                a2.a("url", streamUrl7.q);
            }
            a2.a();
            a().b(com.bytedance.android.live.broadcast.api.g.class, (Object) true);
        }
    }

    public final void b(String str) {
        Runnable remove = this.K.remove(str);
        if (remove != null) {
            b().removeCallbacks(remove);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        h.f.b.l.d(message, "");
        int i2 = 0;
        if (message.what == 3) {
            Object obj = message.obj;
            if (!(obj instanceof com.bytedance.android.live.a.a.b.a)) {
                obj = null;
            }
            com.bytedance.android.live.a.a.a aVar = (com.bytedance.android.live.a.a.a) obj;
            if (aVar != null) {
                i2 = aVar.getErrorCode();
            }
            a(i2);
        } else if (message.obj instanceof Exception) {
            if (message.what == 13) {
                com.bytedance.android.live.core.c.a.a(6, "LiveBroadcastFragment", "fetch ngb rtmp url failed");
                this.f7962f = false;
                c(PrivacyCert.Builder.Companion.with("bpea-459").usage("").tag("start audio capture when live starts").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
        } else if (message.what == 13) {
            this.f7962f = false;
            Object obj2 = message.obj;
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Room room = this.f7958b;
            if (room == null) {
                h.f.b.l.a("mRoom");
            }
            StreamUrl streamUrl = room.getStreamUrl();
            StringBuilder append = new StringBuilder().append(str);
            com.bytedance.android.livesdkapi.depend.model.live.s sVar = this.f7959c;
            if (sVar == null) {
                h.f.b.l.a("mStreamUrlExtra");
            }
            streamUrl.p = append.append(sVar.f23180b).toString();
            com.bytedance.android.live.core.c.a.a(3, "LiveBroadcastFragment", "fetch ngb RTMP url, url = ".concat(String.valueOf(str)));
            c(PrivacyCert.Builder.Companion.with("bpea-460").usage("").tag("start audio capture when live starts").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        com.bytedance.android.livesdk.util.b.a(getActivity());
        super.onActivityCreated(bundle);
        androidx.fragment.app.e activity = getActivity();
        if (!(activity == null || (window = activity.getWindow()) == null)) {
            window.setSoftInputMode(50);
        }
        if (!this.G) {
            com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class);
            h.f.b.l.b(a2, "");
            ((com.bytedance.android.live.i.a.d) a2).getGpuInfoFetcher().a(getActivity(), getView(), C0116o.f8025a);
            com.bytedance.android.live.broadcast.api.c.a.a("live_page_load", String.valueOf(System.currentTimeMillis()));
            com.bytedance.android.live.broadcast.api.c.d.b(c.a.a("ttlive_broadcast_created_all").b("duration", Long.valueOf(System.currentTimeMillis() - com.bytedance.android.live.broadcast.d.a.f7832a))).a();
            com.bytedance.android.live.broadcast.d.a.f7832a = System.currentTimeMillis();
            com.bytedance.android.live.broadcast.d.a.f7837f = System.currentTimeMillis();
            View view = getView();
            if (view != null) {
                view.post(new p(this));
            }
        }
    }

    static final class u extends h.f.b.m implements h.f.a.b<bp, h.z> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(3987);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(o oVar) {
            super(1);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(bp bpVar) {
            h.f.b.l.d(bpVar, "");
            if (bpVar == bp.SHOWING && BroadcastLiveCenterSetting.INSTANCE.enable()) {
                o oVar = this.this$0;
                com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.cK;
                h.f.b.l.b(bVar, "");
                Boolean a2 = bVar.a();
                h.f.b.l.b(a2, "");
                if (a2.booleanValue() && oVar.f7966j) {
                    FrameLayout frameLayout = (FrameLayout) oVar.c(R.id.bqb);
                    h.f.b.l.b(frameLayout, "");
                    frameLayout.setVisibility(0);
                    com.bytedance.android.live.core.f.h hVar = new com.bytedance.android.live.core.f.h();
                    HSImageView hSImageView = (HSImageView) oVar.c(R.id.bdq);
                    h.f.b.l.b(hSImageView, "");
                    com.bytedance.android.live.core.f.h a3 = hVar.a(hSImageView).a("tiktok_live_broadcast_resource");
                    a3.f9068b = true;
                    a3.a(new aq(oVar));
                    if (com.bytedance.android.live.core.f.y.g()) {
                        hVar.b("ttlive_livecenter_guide_hand.webp");
                        hVar.a();
                    } else {
                        hVar.b("ttlive_livecenter_guide_hand_rtl.webp");
                        hVar.a();
                    }
                    ((LiveTextView) oVar.c(R.id.cc8)).a(R.style.tg);
                    LiveTextView liveTextView = (LiveTextView) oVar.c(R.id.cc8);
                    h.f.b.l.b(liveTextView, "");
                    liveTextView.setText(com.bytedance.android.live.core.f.y.a((int) R.string.e85));
                    ObjectAnimator duration = ObjectAnimator.ofFloat(oVar.c(R.id.cc8), "alpha", 0.0f, 1.0f).setDuration(180L);
                    h.f.b.l.b(duration, "");
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(oVar.c(R.id.cc8), "alpha", 1.0f, 0.0f).setDuration(180L);
                    h.f.b.l.b(duration2, "");
                    duration2.setStartDelay(696);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playSequentially(duration, duration2);
                    animatorSet.start();
                    FrameLayout frameLayout2 = (FrameLayout) oVar.c(R.id.bqb);
                    h.f.b.l.b(frameLayout2, "");
                    frameLayout2.setClickable(true);
                    ((FrameLayout) oVar.c(R.id.bqb)).setOnClickListener(new ar(oVar));
                    com.bytedance.android.livesdk.ap.b<Boolean> bVar2 = com.bytedance.android.livesdk.ap.a.cK;
                    h.f.b.l.b(bVar2, "");
                    com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar2, (Object) false);
                }
            }
            return h.z.f158842a;
        }
    }

    static final class v extends h.f.b.m implements h.f.a.b<com.bytedance.android.livesdk.model.message.az, h.z> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(3988);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(o oVar) {
            super(1);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.android.livesdk.model.message.az azVar) {
            com.bytedance.android.livesdk.model.message.az azVar2 = azVar;
            h.f.b.l.d(azVar2, "");
            if (azVar2.f19236h == 1) {
                this.this$0.f7966j = true;
                if (BroadcastLiveCenterSetting.INSTANCE.enable()) {
                    o oVar = this.this$0;
                    com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.cJ;
                    h.f.b.l.b(bVar, "");
                    Boolean a2 = bVar.a();
                    h.f.b.l.b(a2, "");
                    if (a2.booleanValue()) {
                        FrameLayout frameLayout = (FrameLayout) oVar.c(R.id.bqb);
                        h.f.b.l.b(frameLayout, "");
                        frameLayout.setVisibility(0);
                        com.bytedance.android.live.core.f.h hVar = new com.bytedance.android.live.core.f.h();
                        HSImageView hSImageView = (HSImageView) oVar.c(R.id.bdq);
                        h.f.b.l.b(hSImageView, "");
                        com.bytedance.android.live.core.f.h a3 = hVar.a(hSImageView).a("tiktok_live_broadcast_resource");
                        a3.f9068b = true;
                        a3.a(new as(oVar));
                        com.bytedance.android.live.core.f.h hVar2 = new com.bytedance.android.live.core.f.h();
                        HSImageView hSImageView2 = (HSImageView) oVar.c(R.id.tl);
                        h.f.b.l.b(hSImageView2, "");
                        com.bytedance.android.live.core.f.h a4 = hVar2.a(hSImageView2).a("tiktok_live_broadcast_resource");
                        a4.f9068b = true;
                        a4.f9069c = true;
                        a4.a(new at(oVar));
                        if (com.bytedance.android.live.core.f.y.g()) {
                            hVar.b("ttlive_livecenter_guide_hand_rtl.webp");
                            hVar2.b("ttlive_livecenter_guide_black_line_rtl.webp");
                            hVar.a();
                            hVar2.a();
                        } else {
                            hVar.b("ttlive_livecenter_guide_hand.webp");
                            hVar2.b("ttlive_livecenter_guide_black_line.webp");
                            hVar.a();
                            hVar2.a();
                        }
                        ((LiveTextView) oVar.c(R.id.cc8)).a(R.style.tg);
                        LiveTextView liveTextView = (LiveTextView) oVar.c(R.id.cc8);
                        h.f.b.l.b(liveTextView, "");
                        liveTextView.setText(com.bytedance.android.live.core.f.y.a((int) R.string.e86));
                        ObjectAnimator duration = ObjectAnimator.ofFloat(oVar.c(R.id.cc8), "alpha", 0.0f, 1.0f).setDuration(180L);
                        h.f.b.l.b(duration, "");
                        ObjectAnimator duration2 = ObjectAnimator.ofFloat(oVar.c(R.id.cc8), "alpha", 1.0f, 0.0f).setDuration(180L);
                        h.f.b.l.b(duration2, "");
                        duration2.setStartDelay(2808);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playSequentially(duration, duration2);
                        animatorSet.start();
                        FrameLayout frameLayout2 = (FrameLayout) oVar.c(R.id.bqb);
                        h.f.b.l.b(frameLayout2, "");
                        frameLayout2.setClickable(true);
                        ((FrameLayout) oVar.c(R.id.bqb)).setOnClickListener(new au(oVar));
                        com.bytedance.android.livesdk.ap.b<Boolean> bVar2 = com.bytedance.android.livesdk.ap.a.cJ;
                        h.f.b.l.b(bVar2, "");
                        com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar2, (Object) false);
                    }
                }
            }
            return h.z.f158842a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(long r8) {
        /*
        // Method dump skipped, instructions count: 264
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.o.b(long):void");
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        com.bytedance.android.livesdk.performance.b value;
        DataChannelGlobal.f34575d.a(this, this, dp.class, new q(this));
        com.bytedance.android.livesdk.ab.m.f13604j = true;
        com.bytedance.android.livesdk.ab.a a2 = c.a.a("ttlive_enter_broadcast_all");
        com.bytedance.android.livesdk.ap.b<Float> bVar = com.bytedance.android.livesdk.ap.a.Q;
        h.f.b.l.b(bVar, "");
        com.bytedance.android.livesdk.ab.a a3 = a2.a("beauty_skin", bVar.a());
        com.bytedance.android.livesdk.ap.b<Float> bVar2 = com.bytedance.android.livesdk.ap.a.R;
        h.f.b.l.b(bVar2, "");
        com.bytedance.android.livesdk.ab.a a4 = a3.a("big_eyes", bVar2.a());
        com.bytedance.android.livesdk.ap.b<Float> bVar3 = com.bytedance.android.livesdk.ap.a.S;
        h.f.b.l.b(bVar3, "");
        com.bytedance.android.livesdk.ab.a a5 = a4.a("face_lift", bVar3.a());
        com.bytedance.android.livesdk.ap.b<Integer> bVar4 = com.bytedance.android.livesdk.ap.a.f14015i;
        h.f.b.l.b(bVar4, "");
        Integer a6 = bVar4.a();
        if (a6 != null && a6.intValue() == 1) {
            str = "front";
        } else {
            str = "back";
        }
        com.bytedance.android.livesdk.ab.a a7 = a5.a("camera_type", str);
        com.bytedance.android.livesdk.ap.b<Integer> bVar5 = com.bytedance.android.livesdk.ap.a.O;
        h.f.b.l.b(bVar5, "");
        com.bytedance.android.live.broadcast.api.c.d.b(a7.a("filter_position", bVar5.a()).b("duration", Long.valueOf(System.currentTimeMillis() - com.bytedance.android.live.broadcast.d.a.f7832a))).a();
        com.bytedance.android.live.broadcast.d.a.f7832a = System.currentTimeMillis();
        com.bytedance.android.live.broadcast.d.a.f7833b = false;
        com.bytedance.android.live.broadcast.d.a.f7836e = System.currentTimeMillis();
        this.I = System.currentTimeMillis();
        if (bundle != null) {
            bundle.remove("android:support:fragments");
        }
        a().a(com.bytedance.android.livesdk.j.ao.class, getChildFragmentManager());
        super.onCreate(bundle);
        com.bytedance.android.livesdk.performance.g.f20233d = true;
        h.h<com.bytedance.android.livesdk.performance.b> hVar = com.bytedance.android.livesdk.performance.g.f20231b.get("broadcast_enter");
        if (!(hVar == null || (value = hVar.getValue()) == null)) {
            value.f20200c = true;
            value.a();
            com.bytedance.android.livesdk.performance.g.a().postDelayed(new g.b(value), com.bytedance.android.livesdk.performance.g.f20230a);
        }
        com.bytedance.android.b.a(getContext());
        ((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).preloadWidgetView();
        com.bytedance.android.livesdk.h.a.LiveResource.preload();
        com.bytedance.android.live.base.a a8 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class);
        h.f.b.l.b(a8, "");
        ((com.bytedance.android.live.i.a.d) a8).getLivePlayController().c();
        a().b(com.bytedance.android.live.liveinteract.api.l.class, (h.f.a.b) new r(this)).a((Object) this, com.bytedance.android.live.liveinteract.api.t.class, (h.f.a.b) new s(this)).b(com.bytedance.android.live.gift.v.class, (h.f.a.b) new t(this)).b((androidx.lifecycle.m) this, bq.class, (h.f.a.b) new u(this)).a((androidx.lifecycle.m) this, cf.class, (h.f.a.b) new v(this)).a((Object) this, com.bytedance.android.live.liveinteract.api.as.class, (h.f.a.b) new w(this));
        if (com.bytedance.common.utility.m.a("referral_task", (String) DataChannelGlobal.f34575d.b(ag.class))) {
            com.bytedance.android.live.base.a a9 = com.bytedance.android.live.t.a.a(IHostAction.class);
            h.f.b.l.b(a9, "");
            List<com.bytedance.android.livesdkapi.model.b> liveActivityTasksSetting = ((IHostAction) a9).getLiveActivityTasksSetting();
            if (liveActivityTasksSetting != null && liveActivityTasksSetting.size() > 0) {
                for (T t2 : liveActivityTasksSetting) {
                    h.f.b.l.b(t2, "");
                    Integer num = t2.f23271b;
                    if (num != null && num.intValue() == 4) {
                        Long l2 = t2.f23272c;
                        h.f.b.l.b(l2, "");
                        f.a.b.b d2 = f.a.t.a(l2.longValue(), TimeUnit.SECONDS, f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new x(t2));
                        List<f.a.b.b> list = this.J;
                        h.f.b.l.b(d2, "");
                        list.add(d2);
                    }
                }
            }
        }
        register(((IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class)).registerAppEnterForeBackgroundCallback(this.O));
        com.bytedance.android.live.broadcast.e.a.f7849c = true;
        LivePerformanceManager.getInstance().setExtraParams(com.bytedance.android.live.broadcast.e.a.f7847a);
        DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.j.w.class, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // com.bytedance.android.live.broadcast.h.a
    public final void a(int i2) {
        if (i2 == 30001 || i2 == 30003 || i2 == 50002) {
            a(false, PrivacyCert.Builder.Companion.with("bpea-423").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            com.bytedance.android.live.broadcast.d.b.a(i2, e(), f(), this.f7965i);
        }
    }

    public final void b(PrivacyCert privacyCert) {
        String str;
        b.a.a("anchor_close_live_confirm").a(a()).a("live_type", "video_live").b();
        long currentTimeMillis = System.currentTimeMillis();
        a(currentTimeMillis);
        b(currentTimeMillis);
        DataChannelGlobal.f34575d.a(com.bytedance.android.livesdk.j.am.class, "");
        HashSet hashSet = (HashSet) DataChannelGlobal.f34575d.b(ct.class);
        if (hashSet != null) {
            hashSet.clear();
        }
        DataChannelGlobal.f34575d.a(cv.class, new h.u("", Float.valueOf(0.0f), 0L));
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.j.dw.class);
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
        com.bytedance.android.livesdk.b.a.d a2 = com.bytedance.android.livesdk.b.a.d.a();
        h.f.b.l.b(a2, "");
        T t2 = a2.n;
        h.f.b.l.b(t2, "");
        if (t2.booleanValue()) {
            HSImageView hSImageView = (HSImageView) c(R.id.cbt);
            if (hSImageView != null) {
                hSImageView.postDelayed(new y(this, privacyCert), 1000);
            }
        } else {
            b(1);
            a(PrivacyCert.Builder.Companion.with("bpea-429").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            com.bytedance.android.live.broadcast.d.b.b(10001, e(), f(), this.f7965i);
        }
        com.bytedance.android.livesdk.ab.b b2 = b.a.a("pm_live_sticker_use").a(a()).d("anchor_live_ending").c("other").b("live_take");
        String str2 = "use";
        if (com.bytedance.android.livesdk.utils.p.a((Boolean) a().b(com.bytedance.android.livesdk.j.ap.class))) {
            str = str2;
        } else {
            str = "unused";
        }
        b2.a("use_status", str).a("room_id", f()).b();
        com.bytedance.android.livesdk.ab.b b3 = b.a.a("pm_live_filter_use").a(a()).d("anchor_live_ending").c("other").b("live_take");
        if (!com.bytedance.android.livesdk.utils.p.a((Boolean) a().b(com.bytedance.android.live.effect.api.b.class))) {
            str2 = "unused";
        }
        b3.a("use_status", str2).a("room_id", f()).b();
    }

    public final void onEvent(com.bytedance.android.livesdk.chatroom.c.r rVar) {
        String str;
        int intValue;
        h.f.b.l.d(rVar, "");
        int i2 = rVar.f15142a;
        if (i2 != 3) {
            if (i2 == 11) {
                PrivacyCert build = PrivacyCert.Builder.Companion.with("bpea-421").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build();
                com.bytedance.android.live.broadcast.d.b.b(10002, e(), f(), this.f7965i);
                b(1);
                com.bytedance.android.live.broadcast.api.d.a aVar = this.f7969m;
                if (aVar != null) {
                    aVar.a();
                }
                com.bytedance.android.live.broadcast.api.d.a aVar2 = this.f7969m;
                if (aVar2 != null) {
                    aVar2.i(build);
                }
                com.bytedance.android.live.broadcast.stream.f.a("release_audio");
                com.bytedance.android.live.broadcast.api.d.a aVar3 = this.f7969m;
                if (aVar3 != null) {
                    aVar3.e(build);
                }
                com.bytedance.android.live.broadcast.stream.f.a("release_video");
                com.bytedance.android.livesdk.utils.ao.a(getContext(), (int) R.string.gve);
                androidx.fragment.app.e activity = getActivity();
                if (activity != null) {
                    activity.finish();
                }
            } else if (i2 != 17) {
                if (i2 != 6) {
                    if (i2 == 7) {
                        com.bytedance.android.livesdk.ac.b.a aVar4 = rVar.f15145d;
                        if (aVar4 instanceof com.bytedance.android.livesdk.model.message.n) {
                            com.bytedance.android.livesdk.model.message.n nVar = (com.bytedance.android.livesdk.model.message.n) aVar4;
                            if (nVar.f19656a == 4) {
                                n.a aVar5 = nVar.f19658g;
                                if (aVar5 != null) {
                                    this.r = aVar5.f19659a;
                                    this.s = com.bytedance.android.livesdk.chatroom.f.c.a(aVar5.f19661c, "");
                                    this.t = com.bytedance.android.livesdk.chatroom.f.c.a(aVar5.f19662d, "");
                                    this.u = com.bytedance.android.livesdk.chatroom.f.c.a(aVar5.f19663e, "");
                                }
                                a(true, PrivacyCert.Builder.Companion.with("bpea-424").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                                com.bytedance.android.live.broadcast.d.b.b(10003, e(), f(), this.f7965i);
                                return;
                            }
                        }
                        a(false, PrivacyCert.Builder.Companion.with("bpea-425").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                        com.bytedance.android.live.broadcast.d.b.b(rVar.f15143b, e(), f(), this.f7965i);
                        return;
                    } else if (i2 != 8) {
                        return;
                    }
                }
                Context context = getContext();
                if (context != null) {
                    h.f.b.l.b(context, "");
                    if (!com.bytedance.android.live.broadcast.utils.e.a(context, a(), new ah(this), new ai(this))) {
                        Integer num = (Integer) a().b(com.bytedance.android.livesdk.rank.api.e.class);
                        if (num == null || (intValue = num.intValue()) <= 0) {
                            str = getResources().getString(R.string.dwa);
                        } else {
                            str = getResources().getQuantityString(R.plurals.fg, intValue, Integer.valueOf(intValue));
                        }
                        h.f.b.l.b(str, "");
                        LiveLoadingView liveLoadingView = (LiveLoadingView) c(R.id.cc1);
                        if (liveLoadingView != null) {
                            com.bytedance.android.livesdk.utils.p.a((View) liveLoadingView, true);
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        d.a.a().a().getAnchorPreFinish(f()).a(com.bytedance.android.livesdk.util.rxutils.i.a(this, com.bytedance.android.livesdk.util.rxutils.b.b.DESTROY)).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new aj(this, str, currentTimeMillis), new ak(this, str, currentTimeMillis));
                    }
                    b.a.a("anchor_close_live_popup").a(a()).a("live_type", "video_live").b();
                }
            } else {
                b(PrivacyCert.Builder.Companion.with("bpea-776").usage("").tag("close live immediately").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
        } else if (!this.f7962f) {
            com.bytedance.android.livesdk.utils.p.d(c(R.id.cbt));
            c(PrivacyCert.Builder.Companion.with("bpea-461").usage("").tag("start audio capture when live starts").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
    }

    public final void a(PrivacyCert privacyCert) {
        String str;
        Room room = this.f7958b;
        if (room == null) {
            h.f.b.l.a("mRoom");
        }
        f.a.a(room, a());
        this.H = true;
        com.bytedance.android.live.broadcast.api.d.a aVar = this.f7969m;
        if (aVar != null) {
            aVar.a();
        }
        com.bytedance.android.live.broadcast.api.d.a aVar2 = this.f7969m;
        if (aVar2 != null) {
            aVar2.i(privacyCert);
        }
        com.bytedance.android.live.broadcast.stream.f.a("release_audio");
        com.bytedance.android.live.broadcast.api.d.a aVar3 = this.f7969m;
        if (aVar3 != null) {
            aVar3.e(privacyCert);
        }
        com.bytedance.android.live.broadcast.stream.f.a("release_video");
        if (b.a.a().O) {
            com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.bS;
            h.f.b.l.b(bVar, "");
            Boolean a2 = bVar.a();
            com.bytedance.android.livesdk.ap.b<Boolean> bVar2 = com.bytedance.android.livesdk.ap.a.bT;
            h.f.b.l.b(bVar2, "");
            Boolean a3 = bVar2.a();
            com.bytedance.android.livesdk.ab.b a4 = b.a.a("connection_use_status").a(a());
            h.f.b.l.b(a2, "");
            String str2 = "open";
            if (a2.booleanValue()) {
                str = str2;
            } else {
                str = "close";
            }
            com.bytedance.android.livesdk.ab.b a5 = a4.a("connection_status", str);
            h.f.b.l.b(a3, "");
            if (!a3.booleanValue()) {
                str2 = "close";
            }
            a5.a("recommend_connection_status", str2).b();
        }
        if (isViewValid()) {
            com.bytedance.android.livesdk.v vVar = this.p;
            if (vVar != null) {
                vVar.dismiss();
            }
            a(new ao(this));
            if (com.bytedance.android.live.broadcast.d.a.f7839h != 0) {
                b.a.a("livesdk_broadcast_end").a("duration", System.currentTimeMillis() - com.bytedance.android.live.broadcast.d.a.f7839h).b();
            }
            com.bytedance.android.live.broadcast.d.a.f7834c = 0;
            com.bytedance.android.live.broadcast.d.a.f7835d = 0;
            com.bytedance.android.live.broadcast.d.a.f7836e = 0;
            com.bytedance.android.live.broadcast.d.a.f7837f = 0;
            com.bytedance.android.live.broadcast.d.a.f7838g = 0;
            com.bytedance.android.live.broadcast.d.a.f7839h = 0;
        }
    }

    public static final class c implements AVLog.ILogFilter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdk.ab.i f8017a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f8018b;

        static {
            Covode.recordClassIndex(3966);
        }

        c(com.bytedance.android.livesdk.ab.i iVar, String str) {
            this.f8017a = iVar;
            this.f8018b = str;
        }

        @Override // com.ss.avframework.utils.AVLog.ILogFilter
        public final void print(int i2, String str, String str2, Throwable th) {
            JSONObject jSONObject = new JSONObject();
            if (str == null) {
                str = "";
            }
            jSONObject.put("sdktag", str);
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("sdkmsg", str2);
            if (th != null) {
                jSONObject.put("throwable", th);
            }
            switch (i2) {
                case 2:
                case 3:
                    this.f8017a.b(this.f8018b, jSONObject);
                    return;
                case 4:
                    this.f8017a.a(this.f8018b, jSONObject);
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    com.bytedance.android.livesdk.ab.i iVar = this.f8017a;
                    String str3 = this.f8018b;
                    if (!TextUtils.isEmpty(str3)) {
                        com.bytedance.android.live.u.g.b(new com.bytedance.android.live.core.c.h(iVar, str3, jSONObject));
                        return;
                    }
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    com.bytedance.android.livesdk.ab.i iVar2 = this.f8017a;
                    String str4 = this.f8018b;
                    if (!TextUtils.isEmpty(str4)) {
                        com.bytedance.android.live.u.g.b(new com.bytedance.android.live.core.c.f(iVar2, str4, jSONObject));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }

        @Override // com.ss.avframework.utils.AVLog.ILogFilter
        public final void print(int i2, String str, String str2, String str3, Throwable th) {
            StringBuilder sb = new StringBuilder();
            if (str2 == null) {
                str2 = "";
            }
            StringBuilder append = sb.append(str2).append(' ');
            if (str3 == null) {
                str3 = "";
            }
            print(i2, str, append.append(str3).toString(), th);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class am implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f7991a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Integer f7992b;

        static {
            Covode.recordClassIndex(3948);
        }

        am(o oVar, Integer num) {
            this.f7991a = oVar;
            this.f7992b = num;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            h.f.b.l.d(dialogInterface, "");
            this.f7991a.k();
            dialogInterface.dismiss();
            Integer num = this.f7992b;
            if (num != null && num.intValue() == 4) {
                ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).logBoostCardLiveEndClick(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class al implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f7989a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Integer f7990b;

        static {
            Covode.recordClassIndex(3947);
        }

        al(o oVar, Integer num) {
            this.f7989a = oVar;
            this.f7990b = num;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            h.f.b.l.d(dialogInterface, "");
            this.f7989a.b(PrivacyCert.Builder.Companion.with("bpea-453").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            b.a.a().Q = true;
            b.a.a().R = true;
            dialogInterface.dismiss();
            Integer num = this.f7990b;
            if (num != null && num.intValue() == 4) {
                ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).logBoostCardLiveEndClick(1);
            }
        }
    }

    static final class av implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f8001a;

        static {
            Covode.recordClassIndex(3957);
        }

        av(o oVar) {
            this.f8001a = oVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f8001a.a(PrivacyCert.Builder.Companion.with("bpea-427").usage("").tag("stop video/audio capture when error occurs").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            b.a.a("livesdk_push_stream_failed_click").a("click_icon", "end_live").a("is_first_fail", this.f8001a.f7965i ? 1 : 0).b();
        }
    }

    public static void a(DataChannel dataChannel, boolean z2) {
        String str;
        String str2;
        Room room = (Room) DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.j.ac.class);
        long c2 = com.bytedance.android.livesdk.userservice.u.a().b().c();
        if (room != null && room.getOwnerUserId() == c2) {
            com.bytedance.android.livesdk.ab.b g2 = b.a.a("livesdk_switch_to_background").a(dataChannel).h(room.getIdStr()).g(String.valueOf(room.getOwnerUserId()));
            com.bytedance.android.livesdkapi.depend.model.live.i streamType = room.getStreamType();
            if (streamType != null) {
                str = com.bytedance.android.livesdkapi.depend.model.live.j.a(streamType);
            } else {
                str = null;
            }
            com.bytedance.android.livesdk.ab.b a2 = g2.a(str);
            if (z2) {
                str2 = "anchor_leave";
            } else {
                str2 = "anchor_back";
            }
            a2.f(str2).b();
        }
    }

    private final void a(boolean z2, PrivacyCert privacyCert) {
        String str;
        if (!this.H) {
            b(1);
        }
        if (z2 && !com.bytedance.common.utility.m.a(this.r)) {
            com.bytedance.android.livesdk.browser.c.d webViewManager = ((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).webViewManager();
            Context context = getContext();
            d.a b2 = com.bytedance.android.livesdk.browser.c.e.b(this.r);
            b2.f14292c = true;
            b2.f14291b = com.bytedance.android.live.core.f.y.a((int) R.string.gl9);
            webViewManager.a(context, b2);
        }
        StringBuilder sb = new StringBuilder("room close onLiveEnd endByBanned:");
        if (z2) {
            str = "true";
        } else {
            str = "false";
        }
        com.bytedance.android.live.core.c.a.a(3, "LiveBroadcastFragment", sb.append(str).toString());
        a(privacyCert);
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        VideoWidget2 videoWidget2;
        View view2;
        ViewGroup.LayoutParams layoutParams;
        View view3;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        if (!(!LiveEnableFixLiveEndSetting.INSTANCE.enable() || (videoWidget2 = this.n) == null || (view2 = videoWidget2.getView()) == null)) {
            VideoWidget2 videoWidget22 = this.n;
            if (videoWidget22 == null || (view3 = videoWidget22.getView()) == null) {
                layoutParams = null;
            } else {
                layoutParams = view3.getLayoutParams();
            }
            if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
                layoutParams = null;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null) {
                layoutParams2.leftMargin = 1;
                layoutParams2.rightMargin = 1;
            } else {
                layoutParams2 = null;
            }
            view2.setLayoutParams(layoutParams2);
        }
        d().a(this.P);
        Room room = (Room) DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.j.ac.class);
        if (!Room.isValid(room) || room == null || room.getStreamUrl() == null) {
            this.G = true;
            androidx.fragment.app.e activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        this.f7958b = room;
        com.bytedance.android.livesdk.model.k.VIDEO.config();
        com.bytedance.android.live.u.f.a();
        com.bytedance.android.live.u.f.b();
        Room room2 = this.f7958b;
        if (room2 == null) {
            h.f.b.l.a("mRoom");
        }
        f.a.a(room2);
        float c2 = ((float) com.bytedance.android.live.core.f.y.c()) / ((float) com.bytedance.android.live.core.f.y.b());
        HSImageView hSImageView = (HSImageView) c(R.id.cbt);
        Room room3 = this.f7958b;
        if (room3 == null) {
            h.f.b.l.a("mRoom");
        }
        User owner = room3.getOwner();
        h.f.b.l.b(owner, "");
        com.bytedance.android.live.core.f.k.a(hSImageView, owner.getAvatarThumb(), new com.bytedance.android.livesdk.utils.z(5, c2));
        DataChannel a2 = a();
        Room room4 = this.f7958b;
        if (room4 == null) {
            h.f.b.l.a("mRoom");
        }
        a2.b(df.class, room4);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.f34575d;
        h.p[] pVarArr = new h.p[2];
        Room room5 = this.f7958b;
        if (room5 == null) {
            h.f.b.l.a("mRoom");
        }
        pVarArr[0] = h.v.a("anchor_id", String.valueOf(room5.getOwnerUserId()));
        Room room6 = this.f7958b;
        if (room6 == null) {
            h.f.b.l.a("mRoom");
        }
        pVarArr[1] = h.v.a("room_id", String.valueOf(room6.getId()));
        dataChannelGlobal.a(dj.class, h.a.ag.a(pVarArr));
        h.a aVar = new h.a();
        Room room7 = this.f7958b;
        if (room7 == null) {
            h.f.b.l.a("mRoom");
        }
        aVar.f13533b = room7;
        aVar.f13532a = "live_take_detail";
        com.bytedance.android.livesdk.ab.c.h a3 = aVar.a();
        DataChannelGlobal.f34575d.a(com.bytedance.android.livesdk.ab.c.j.class, a3);
        a().a(com.bytedance.android.livesdk.ab.c.i.class, a3);
        b.a.a(f(), a(), "LiveBroadcastFragment_OnViewCreated");
        Room room8 = this.f7958b;
        if (room8 == null) {
            h.f.b.l.a("mRoom");
        }
        com.bytedance.android.livesdkapi.depend.model.live.s streamUrlExtraSafely = room8.getStreamUrlExtraSafely();
        h.f.b.l.b(streamUrlExtraSafely, "");
        this.f7959c = streamUrlExtraSafely;
        long f2 = f();
        getContext();
        com.bytedance.android.live.broadcast.f.a aVar2 = new com.bytedance.android.live.broadcast.f.a(f2);
        this.f7961e = aVar2;
        aVar2.a(this);
        p().f7877a = this;
        com.bytedance.android.live.broadcast.stream.c.b bVar = new com.bytedance.android.live.broadcast.stream.c.b(p());
        bVar.a();
        this.q = bVar;
        a().a(cg.class, ((IMessageService) com.bytedance.android.live.t.a.a(IMessageService.class)).messageManagerProvider(f(), true, getContext()));
        com.bytedance.android.live.broadcast.c.a.p.a(f());
        this.F = new aa(this);
        ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).resetRoomStatus();
        if (!LiveGiftInterfaceOptimizeSetting.INSTANCE.getValue()) {
            com.bytedance.android.live.base.a a4 = com.bytedance.android.live.t.a.a(IGiftService.class);
            h.f.b.l.b(a4, "");
            ((IGiftService) a4).getFirstRechargeManager().a(f(), r());
            ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).syncGiftList(s(), f(), 2, true);
        } else {
            Room room9 = this.f7958b;
            if (room9 == null) {
                h.f.b.l.a("mRoom");
            }
            if (room9.getRoomAuthStatus() != null) {
                Room room10 = this.f7958b;
                if (room10 == null) {
                    h.f.b.l.a("mRoom");
                }
                if (room10.getRoomAuthStatus().enableGift) {
                    com.bytedance.android.live.base.a a5 = com.bytedance.android.live.t.a.a(IGiftService.class);
                    h.f.b.l.b(a5, "");
                    ((IGiftService) a5).getFirstRechargeManager().a(f(), r());
                    IGiftService iGiftService = (IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class);
                    Room room11 = this.f7958b;
                    if (room11 == null) {
                        h.f.b.l.a("mRoom");
                    }
                    iGiftService.clearFastGift(room11.getId());
                    ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).syncGiftList(s(), f(), 2, true);
                }
            }
        }
        com.bytedance.android.live.p.l.BEAUTY.load(a(), new b());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        com.bytedance.android.live.n.p pVar = this.o;
        if (pVar != null) {
            pVar.b().onActivityResult(i2, i3, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.bytedance.android.b.a(R.layout.b9f, viewGroup);
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public final void onStreamEnd(int i2, int i3, String str) {
        int i4;
        String str2 = str;
        h.f.b.l.d(str2, "");
        if (com.bytedance.android.live.broadcast.api.d.c.a(i2)) {
            com.bytedance.android.livesdk.utils.ao.a(getContext(), (int) R.string.gti);
            b.a a2 = new b.a(getActivity()).a(R.string.ejh).b(R.string.ejg).a(R.string.ejf, (DialogInterface.OnClickListener) new av(this), false);
            a2.f18296m = false;
            a2.a().show();
            i4 = 6;
        } else {
            if (i2 > 0) {
                com.bytedance.android.livesdk.utils.ao.a(getContext(), (int) R.string.gtg);
                a(PrivacyCert.Builder.Companion.with("bpea-426").usage("").tag("stop video/audio capture when connection fail").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                i4 = 1;
            }
            h.p[] pVarArr = new h.p[2];
            pVarArr[0] = h.v.a("errCode", String.valueOf(i2));
            if (str2.length() <= 0 || str2 == null) {
                str2 = com.bytedance.android.live.broadcast.api.d.c.b(i2);
            }
            pVarArr[1] = h.v.a("errMsg", str2);
            com.bytedance.android.live.core.performance.b.a(b.a.CreateLive, h.a.ag.c(pVarArr));
        }
        if (i2 > 0) {
            com.bytedance.android.live.broadcast.d.b.a(i2, i3, str2, e(), f(), this.f7965i);
            com.bytedance.android.live.broadcast.stream.c.b bVar = this.q;
            if (bVar != null) {
                bVar.a(i4);
            }
        }
        h.p[] pVarArr2 = new h.p[2];
        pVarArr2[0] = h.v.a("errCode", String.valueOf(i2));
        str2 = com.bytedance.android.live.broadcast.api.d.c.b(i2);
        pVarArr2[1] = h.v.a("errMsg", str2);
        com.bytedance.android.live.core.performance.b.a(b.a.CreateLive, h.a.ag.c(pVarArr2));
    }

    static final class h implements com.bytedance.android.live.broadcast.stream.capture.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f8021a;

        static {
            Covode.recordClassIndex(3971);
        }

        h(o oVar) {
            this.f8021a = oVar;
        }

        @Override // com.bytedance.android.live.broadcast.stream.capture.f
        public final void a(EGLContext eGLContext, int i2, int i3, int i4, long j2) {
            if (!this.f8021a.f7963g) {
                com.bytedance.android.live.broadcast.d.a.b();
                this.f8021a.f7963g = true;
                com.bytedance.android.live.broadcast.d.a.b();
                com.bytedance.android.livesdk.utils.p.d(this.f8021a.c(R.id.cbt));
            }
            com.bytedance.android.live.broadcast.api.d.a aVar = this.f8021a.f7969m;
            if (aVar != null) {
                aVar.a(i2, i3, i4, j2);
            }
        }
    }
}
