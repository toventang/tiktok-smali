package com.ss.android.ugc.aweme.feed.adapter;

import android.app.Activity;
import android.app.ActivityOptions;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.callback.b;
import com.bytedance.android.livesdk.livesetting.feed.LiveForYouPageTagSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreviewCardEnableSrSetting;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.d.g;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.view.TextureRenderView;
import com.bytedance.android.widget.DataCenter;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.bytedance.ies.ugc.aweme.rich.ui.RichTagView;
import com.bytedance.ies.ugc.aweme.rich.ui.a;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.adaptation.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView;
import com.ss.android.ugc.aweme.commercialize.live.service.CommercializeLiveServiceImpl;
import com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService;
import com.ss.android.ugc.aweme.feed.i.ac;
import com.ss.android.ugc.aweme.feed.i.ad;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.FeedFirstTag;
import com.ss.android.ugc.aweme.feed.model.live.FeedRoomTagList;
import com.ss.android.ugc.aweme.feed.model.live.FeedSubTag;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.MaskLayer;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.feed.model.live.Text;
import com.ss.android.ugc.aweme.feed.model.live.WarningTag;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.aweme.feed.widget.WarningInfoView;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.ab;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.dg;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.z;
import h.z;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

public final class l extends c implements Handler.Callback, androidx.lifecycle.u<com.bytedance.android.widget.b>, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {
    final TextView A;
    final LinearLayout B;
    public final ViewGroup C;
    public final FrameLayout D;
    public com.bytedance.android.livesdkapi.depend.d.b E;
    public com.bytedance.android.livesdkapi.depend.d.c F;
    public boolean G;
    public final boolean H;
    public com.ss.android.ugc.aweme.feed.f I;
    public LinkedList<Long> J;
    public boolean K;
    public boolean L;
    public boolean M;
    final com.bytedance.android.livesdkapi.depend.d.k N;
    public f.a.b.b O;
    final Handler P;
    public com.ss.android.ugc.aweme.commercialize.live.feedLive.a Q;
    public final com.ss.android.ugc.aweme.live.e.c R;
    final be S;
    private final View T;
    private final ConstraintLayout U;
    private final View V;
    private final TextView W;
    private final LinearLayout X;
    private final RemoteImageView Y;
    private final TextView Z;
    private boolean aA;
    private final h.h aB;
    private int aC;
    private DataCenter aD;
    private com.bytedance.retrofit2.b<com.ss.android.ugc.aweme.commercialize.live.a.c> aE;
    private a aF;
    private final TextView aG;
    private String aH;
    private final TextView aa;
    private final View ab;
    private final LottieAnimationView ac;
    private final LottieAnimationView ad;
    private final FrameLayout ae;
    private final LongPressLayout af;
    private final TextView ag;
    private final SmartAvatarBorderView ah;
    private final View ai;
    private final ImageView aj;
    private final TextView ak;
    private final View al;
    private final FrameLayout am;
    private final WarningInfoView an;
    private final LiveTextView ao;
    private final LiveTextView ap;
    private final LiveTextView aq;
    private final LiveTextView ar;
    private final FrameLayout as;
    private final String at;
    private int au;
    private final com.ss.android.ugc.aweme.live.b.b av;
    private boolean aw;
    private long ax;
    private boolean ay;
    private boolean az;

    /* renamed from: l  reason: collision with root package name */
    public boolean f91810l = true;

    /* renamed from: m  reason: collision with root package name */
    public long f91811m;
    public long n;
    public boolean o = true;
    public boolean p;
    public final RemoteImageView q;
    public final TuxTextView r;
    public final TuxTextView s;
    public final RichTagView t;
    final FrameLayout u;
    public final View v;
    public final View w;
    public final TextView x;
    public final View y;
    final TextView z;

    static {
        Covode.recordClassIndex(57792);
    }

    private final ImageSpan ac() {
        return (ImageSpan) this.aB.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(340, new org.greenrobot.eventbus.g(l.class, "onEvent", com.bytedance.android.livesdkapi.g.j.class, ThreadMode.POSTING, 0, false));
        hashMap.put(341, new org.greenrobot.eventbus.g(l.class, "onFollowLiveStatusChange", com.bytedance.android.live.base.a.a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.c
    public final String K() {
        return this.at;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.c, com.ss.android.ugc.aweme.adaptation.c.AbstractC1481c
    public final void d() {
        al();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.c
    public final void a(com.ss.android.ugc.aweme.im.service.model.l lVar) {
        super.a(lVar);
        Aweme aweme = this.f91730b;
        if (aweme != null && lVar != null && TextUtils.equals(lVar.f103924a, aweme.getAid())) {
            ad();
            this.aH = lVar.f103925b;
            TextView textView = this.aG;
            if (textView != null) {
                textView.setOnClickListener(new n(this, lVar));
            }
            com.ss.android.ugc.aweme.feed.share.a.f93870c.a(lVar, this.S);
            this.P.sendEmptyMessageDelayed(3, lVar.f103926c);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.c
    public final void a(com.ss.android.ugc.aweme.im.service.model.n nVar) {
        super.a(nVar);
        if (nVar != null) {
            if (TextUtils.isEmpty(this.aH) || TextUtils.equals(this.aH, nVar.f103934b)) {
                ad();
                com.ss.android.ugc.aweme.feed.share.a.a(nVar, this.S);
                this.P.sendEmptyMessageDelayed(4, nVar.f103935c);
            }
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f91817a = new d();

        static {
            Covode.recordClassIndex(57796);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            LivePerformanceManager.getInstance().initStartValue();
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.af, com.ss.android.ugc.aweme.feed.adapter.c
    public final void H() {
        View view = this.al;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.c
    public final String L() {
        if (TextUtils.equals(this.at, "homepage_hot")) {
            return "homepage_hot";
        }
        return "homepage_follow";
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.c
    public final boolean M() {
        return TextUtils.equals(L(), "homepage_hot");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.c
    public final boolean N() {
        return TextUtils.equals(L(), "homepage_follow");
    }

    public final void ab() {
        com.bytedance.android.livesdkapi.depend.d.c cVar = this.F;
        if (cVar != null) {
            cVar.a();
            this.F = null;
        }
    }

    public static final class c implements ak {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f91816a;

        static {
            Covode.recordClassIndex(57795);
        }

        @Override // com.ss.android.ugc.aweme.feed.adapter.ak
        public final void a() {
            if (!this.f91816a.f91735g) {
                this.f91816a.R.pauseWithStreamData();
            }
            com.bytedance.android.livesdkapi.depend.d.b bVar = this.f91816a.E;
            if (bVar != null) {
                bVar.b();
            }
            this.f91816a.ab();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(l lVar) {
            this.f91816a = lVar;
        }
    }

    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f91822a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f91823b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ UrlModel f91824c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ l f91825d;

        static {
            Covode.recordClassIndex(57799);
        }

        g(int i2, int i3, UrlModel urlModel, l lVar) {
            this.f91822a = i2;
            this.f91823b = i3;
            this.f91824c = urlModel;
            this.f91825d = lVar;
        }

        public final void run() {
            com.ss.android.ugc.aweme.base.e.a(this.f91825d.q, this.f91824c, this.f91822a, this.f91823b, com.ss.android.ugc.aweme.feed.service.a.a((((float) this.f91822a) * 1.0f) / ((float) this.f91823b)));
        }
    }

    private final void ad() {
        this.P.removeMessages(1);
        this.P.removeMessages(2);
        this.P.removeMessages(3);
        this.P.removeMessages(4);
    }

    private final boolean af() {
        LiveRoomStruct liveRoomStruct;
        if (this.L || (liveRoomStruct = this.f91731c) == null || liveRoomStruct.maskLayer == null) {
            return false;
        }
        return true;
    }

    public final void Y() {
        this.P.removeMessages(100);
        at.a(new ac(this.at, true), new ad(this.f91729a.hashCode(), 1));
    }

    public final void aa() {
        this.ay = true;
        h(true);
        if (this.G) {
            this.ax = 0;
            this.P.removeMessages(100);
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.feed.i.n());
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.c
    public final void l() {
        super.l();
        if (this.f91810l) {
            this.ac.b();
            this.ad.b();
        } else if (!this.H) {
            Z();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.c
    public final void m() {
        super.m();
        this.ac.e();
        this.ad.e();
        this.av.a();
        this.P.removeMessages(100);
    }

    static final class o implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f91836a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FeedSubTag f91837b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ l f91838c;

        static {
            Covode.recordClassIndex(57809);
        }

        o(String str, FeedSubTag feedSubTag, l lVar) {
            this.f91836a = str;
            this.f91837b = feedSubTag;
            this.f91838c = lVar;
        }

        public final void run() {
            l lVar = this.f91838c;
            String str = this.f91836a;
            int style = this.f91837b.getStyle();
            if (lVar.B.getMeasuredWidth() + y.a(144.0f) > y.c()) {
                lVar.A.setText(str);
                lVar.A.setVisibility(0);
                l.a(lVar.A, style);
                lVar.z.setVisibility(4);
            }
        }
    }

    private final void al() {
        int dimensionPixelSize;
        if (c.b.f66221a.q) {
            dimensionPixelSize = 0;
        } else {
            dimensionPixelSize = this.f91729a.getResources().getDimensionPixelSize(R.dimen.tb);
        }
        ViewGroup.LayoutParams layoutParams = this.U.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = dimensionPixelSize;
        this.U.setLayoutParams(marginLayoutParams);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.af, com.ss.android.ugc.aweme.feed.adapter.c
    public final void F() {
        super.F();
        a aVar = this.aF;
        if (aVar != null) {
            aVar.f91813b = false;
        }
        this.G = true;
        this.u.setVisibility(0);
        this.R.setMute(false);
        this.f91811m = System.currentTimeMillis();
        ae();
        ai();
        this.aw = false;
        this.aA = false;
        this.az = false;
    }

    public final void Z() {
        this.P.removeMessages(100);
        if (this.ax <= 0 || System.currentTimeMillis() - this.ax < 5000) {
            this.P.sendEmptyMessageDelayed(100, 5000);
            this.ax = System.currentTimeMillis();
            return;
        }
        this.P.sendEmptyMessageDelayed(100, 0);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.c
    public final void c() {
        super.c();
        this.f91810l = true;
        EventBus.a().b(this);
        com.ss.android.ugc.aweme.live.e.c cVar = this.R;
        if (cVar != null) {
            cVar.stopWithStreamData();
        }
        f.a.b.b bVar = this.O;
        if (bVar != null && !bVar.isDisposed()) {
            bVar.dispose();
        }
        this.O = null;
        this.aF = null;
        LivePerformanceManager.getInstance().resetInitValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.c
    public final void j() {
        super.j();
        this.R.destroy();
        com.bytedance.android.livesdkapi.depend.d.b bVar = this.E;
        if (bVar != null) {
            bVar.c();
        }
        ag();
        ab();
        EventBus.a().b(this);
        f.a.b.b bVar2 = this.O;
        if (bVar2 != null && !bVar2.isDisposed()) {
            bVar2.dispose();
        }
        this.O = null;
        this.aF = null;
    }

    static final class m extends h.f.b.m implements h.f.a.a<ImageSpan> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(57807);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageSpan invoke() {
            int i2;
            boolean a2 = com.bytedance.android.live.uikit.c.a.a(this.this$0.f91729a);
            Drawable c2 = y.c(2131231733);
            BitmapDrawable bitmapDrawable = null;
            if (c2 == null) {
                return null;
            }
            if (a2) {
                androidx.core.graphics.drawable.a.b(c2, 1);
                androidx.core.graphics.drawable.a.a(c2, true);
            }
            c2.setBounds(0, 0, y.a(12.0f), y.a(13.0f));
            if (c2 instanceof BitmapDrawable) {
                bitmapDrawable = c2;
            }
            BitmapDrawable bitmapDrawable2 = bitmapDrawable;
            if (bitmapDrawable2 != null) {
                if (a2) {
                    i2 = 3;
                } else {
                    i2 = 5;
                }
                bitmapDrawable2.setGravity(i2);
            }
            return new ImageSpan(c2, 1);
        }
    }

    private final void aj() {
        LiveRoomStruct liveRoomStruct = this.f91731c;
        if (liveRoomStruct != null && !this.az && af()) {
            com.bytedance.android.livesdk.ab.m.a(liveRoomStruct.id, liveRoomStruct.getAnchorId());
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from_merge", L());
            hashMap.put("enter_method", "live_cell");
            hashMap.put("action_type", "show");
            b.a.a("livesdk_mask_layer_show").a((Map<String, String>) hashMap).a().b();
            this.az = true;
        }
    }

    private final void ak() {
        WarningTag warningTag;
        String str;
        LiveRoomStruct liveRoomStruct = this.f91731c;
        if (liveRoomStruct != null && !this.aA && (warningTag = liveRoomStruct.warningTag) != null) {
            com.bytedance.android.livesdk.ab.m.a(liveRoomStruct.id, liveRoomStruct.getAnchorId());
            HashMap hashMap = new HashMap();
            Text text = warningTag.getText();
            if (text == null || (str = text.getKey()) == null) {
                str = "";
            }
            hashMap.put("warning_reason", str);
            hashMap.put("user_type", "user");
            hashMap.put("enter_from_merge", L());
            hashMap.put("enter_method", "live_cell");
            b.a.a("livesdk_bottom_message_show").a((Map<String, String>) hashMap).a("action_type", "show").a("message_type", 3).b();
            this.aA = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.af, com.ss.android.ugc.aweme.feed.adapter.c
    public final void G() {
        Integer num;
        String str;
        User user;
        if (!this.M) {
            ViewGroup viewGroup = this.C;
            Long l2 = null;
            if (viewGroup != null) {
                num = Integer.valueOf(viewGroup.getVisibility());
            } else {
                num = null;
            }
            if (num.intValue() == 0 && this.f91731c != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("enter_from_merge", L());
                hashMap.put("enter_method", "live_cell");
                LiveRoomStruct liveRoomStruct = this.f91731c;
                if (liveRoomStruct == null || (user = liveRoomStruct.owner) == null || (str = user.getUid()) == null) {
                    str = "";
                }
                hashMap.put("anchor_id", str);
                LiveRoomStruct liveRoomStruct2 = this.f91731c;
                if (liveRoomStruct2 != null) {
                    l2 = Long.valueOf(liveRoomStruct2.id);
                }
                hashMap.put("room_id", String.valueOf(l2));
                hashMap.put("action_type", "draw");
                hashMap.put("click_icon", "draw");
                b.a.a("livesdk_mask_layer_click").a((Map<String, String>) hashMap).b();
            }
        }
        this.M = false;
        this.L = false;
        this.aA = false;
        this.az = false;
    }

    private final void ae() {
        WarningTag warningTag;
        MaskLayer maskLayer;
        Text text;
        WarningTag warningTag2;
        Text text2;
        if (this.f91731c != null && this.f91810l) {
            LiveRoomStruct liveRoomStruct = this.f91731c;
            Text text3 = null;
            if (liveRoomStruct != null) {
                warningTag = liveRoomStruct.warningTag;
            } else {
                warningTag = null;
            }
            if (warningTag != null) {
                LiveRoomStruct liveRoomStruct2 = this.f91731c;
                if (liveRoomStruct2 != null) {
                    warningTag2 = liveRoomStruct2.warningTag;
                } else {
                    warningTag2 = null;
                }
                this.an.setVisibility(0);
                WarningInfoView warningInfoView = this.an;
                if (warningTag2 != null) {
                    text2 = warningTag2.getText();
                } else {
                    text2 = null;
                }
                com.ss.android.ugc.aweme.feed.x.ac.a(warningInfoView, text2);
                ak();
            }
            if (af()) {
                this.C.setVisibility(0);
                LiveRoomStruct liveRoomStruct3 = this.f91731c;
                if (liveRoomStruct3 != null) {
                    maskLayer = liveRoomStruct3.maskLayer;
                } else {
                    maskLayer = null;
                }
                LiveTextView liveTextView = this.ao;
                if (maskLayer != null) {
                    text = maskLayer.getTitle();
                } else {
                    text = null;
                }
                com.ss.android.ugc.aweme.feed.x.ac.a(liveTextView, text);
                LiveTextView liveTextView2 = this.ap;
                if (maskLayer != null) {
                    text3 = maskLayer.getSubTitle();
                }
                com.ss.android.ugc.aweme.feed.x.ac.a(liveTextView2, text3);
                this.aq.setText(y.a((int) R.string.e3f));
                this.ar.setText(y.a((int) R.string.efa));
                this.R.pauseWithStreamData();
                aj();
            }
            this.aq.setOnClickListener(new u(this));
            this.ar.setOnClickListener(new v(this));
        }
    }

    private final void ag() {
        AwemeRawAd awemeRawAd;
        String str;
        RoomFeedCellStruct roomFeedCellStruct;
        LiveRoomStruct newLiveRoomData;
        RoomFeedCellStruct roomFeedCellStruct2;
        LiveRoomStruct newLiveRoomData2;
        Aweme b2 = b();
        if (b2 != null && b2.isAd() && this.f91811m > 0 && this.f91730b != null && this.f91731c != null) {
            Aweme b3 = b();
            String str2 = null;
            if (b3 != null) {
                awemeRawAd = b3.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            a.C0791a b4 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "break", awemeRawAd).b("duration", Long.valueOf(System.currentTimeMillis() - this.f91811m));
            Aweme b5 = b();
            if (b5 == null || (roomFeedCellStruct2 = b5.getRoomFeedCellStruct()) == null || (newLiveRoomData2 = roomFeedCellStruct2.getNewLiveRoomData()) == null) {
                str = null;
            } else {
                str = String.valueOf(newLiveRoomData2.getAnchorId());
            }
            a.C0791a a2 = b4.a("anchor_id", str);
            Aweme b6 = b();
            if (!(b6 == null || (roomFeedCellStruct = b6.getRoomFeedCellStruct()) == null || (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) == null)) {
                str2 = String.valueOf(newLiveRoomData.id);
            }
            a2.a("room_id", str2).b();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.c
    public final void g() {
        this.aw = false;
        this.G = false;
        ah();
        ag();
        ab();
        this.av.a();
        if (this.H) {
            com.ss.android.ugc.aweme.feed.f fVar = this.I;
            if (fVar != null) {
                fVar.f93102a.cancel();
            }
            this.I = null;
        } else {
            this.P.removeMessages(100);
        }
        boolean z2 = this.ay;
        if (!z2) {
            h(z2);
        }
        this.aC = -1;
        if (com.ss.android.ugc.aweme.commercialize.live.service.a.a(b())) {
            com.bytedance.retrofit2.b<com.ss.android.ugc.aweme.commercialize.live.a.c> bVar = this.aE;
            if (bVar != null) {
                bVar.cancel();
            }
            this.aE = null;
            this.Q.c();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.c
    public final void o() {
        AwemeRawAd awemeRawAd;
        String str;
        RoomFeedCellStruct roomFeedCellStruct;
        LiveRoomStruct newLiveRoomData;
        RoomFeedCellStruct roomFeedCellStruct2;
        LiveRoomStruct newLiveRoomData2;
        super.o();
        LiveRoomStruct liveRoomStruct = this.f91731c;
        if (liveRoomStruct != null) {
            if (this.f91810l) {
                this.R.setPlayerLogCache(this.N);
                this.R.setLivePlayerEntranceParam(new com.bytedance.android.livesdkapi.depend.model.c.a(L(), "live_cell", ""));
                this.R.playWithStreamData(true, liveRoomStruct, this.u);
                TextureRenderView textureView = this.R.getTextureView();
                if (textureView != null) {
                    textureView.setScaleType(2);
                }
                if (af()) {
                    this.R.pauseWithStreamData();
                }
                Aweme b2 = b();
                if (b2 != null && b2.isAd()) {
                    Aweme b3 = b();
                    String str2 = null;
                    if (b3 != null) {
                        awemeRawAd = b3.getAwemeRawAd();
                    } else {
                        awemeRawAd = null;
                    }
                    a.C0791a a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "play", awemeRawAd);
                    Aweme b4 = b();
                    if (b4 == null || (roomFeedCellStruct2 = b4.getRoomFeedCellStruct()) == null || (newLiveRoomData2 = roomFeedCellStruct2.getNewLiveRoomData()) == null) {
                        str = null;
                    } else {
                        str = String.valueOf(newLiveRoomData2.getAnchorId());
                    }
                    a.C0791a a3 = a2.a("anchor_id", str);
                    Aweme b5 = b();
                    if (!(b5 == null || (roomFeedCellStruct = b5.getRoomFeedCellStruct()) == null || (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) == null)) {
                        str2 = String.valueOf(newLiveRoomData.id);
                    }
                    a3.a("room_id", str2).b();
                }
            } else {
                return;
            }
        }
        this.av.b();
    }

    private final void ah() {
        boolean z2;
        Integer num;
        String str;
        Integer num2;
        String str2;
        String str3 = "1";
        if (this.f91811m > 0 && this.f91730b != null && this.f91731c != null && this.f91734f) {
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("scene_id", "1003").a("duration", System.currentTimeMillis() - this.f91811m).a("enter_from_merge", L()).a("action_type", "click");
            LiveRoomStruct liveRoomStruct = this.f91731c;
            if (liveRoomStruct == null) {
                h.f.b.l.b();
            }
            User user = liveRoomStruct.owner;
            h.f.b.l.b(user, "");
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("anchor_id", user.getUid());
            LiveRoomStruct liveRoomStruct2 = this.f91731c;
            if (liveRoomStruct2 == null) {
                h.f.b.l.b();
            }
            com.ss.android.ugc.aweme.app.f.d a4 = a3.a("room_id", liveRoomStruct2.id);
            Aweme aweme = this.f91730b;
            if (aweme == null) {
                h.f.b.l.b();
            }
            com.ss.android.ugc.aweme.app.f.d a5 = a4.a("request_id", aweme.getRequestId()).a("enter_method", "live_cell");
            Aweme b2 = b();
            if (b2 != null) {
                num2 = Integer.valueOf(b2.getAwemePosition());
            } else {
                num2 = null;
            }
            com.ss.android.ugc.aweme.app.f.d a6 = a5.a("order", num2);
            if (this.p) {
                str2 = str3;
            } else {
                str2 = "0";
            }
            com.ss.android.ugc.aweme.common.r.a("livesdk_live_window_duration", a6.a("has_first_frame", str2).f66730a);
        }
        if (this.n <= 0 || this.f91811m <= 0 || this.f91730b == null || this.f91731c == null || !this.f91734f) {
            z2 = false;
        } else {
            long j2 = this.n;
            long j3 = this.f91811m;
            if (j2 < j3) {
                j2 = j3;
            }
            com.ss.android.ugc.aweme.app.f.d a7 = new com.ss.android.ugc.aweme.app.f.d().a("scene_id", "1003").a("duration", System.currentTimeMillis() - j2).a("enter_from_merge", L()).a("action_type", "click");
            LiveRoomStruct liveRoomStruct3 = this.f91731c;
            if (liveRoomStruct3 == null) {
                h.f.b.l.b();
            }
            User user2 = liveRoomStruct3.owner;
            h.f.b.l.b(user2, "");
            com.ss.android.ugc.aweme.app.f.d a8 = a7.a("anchor_id", user2.getUid());
            LiveRoomStruct liveRoomStruct4 = this.f91731c;
            if (liveRoomStruct4 == null) {
                h.f.b.l.b();
            }
            com.ss.android.ugc.aweme.app.f.d a9 = a8.a("room_id", liveRoomStruct4.id);
            Aweme aweme2 = this.f91730b;
            if (aweme2 == null) {
                h.f.b.l.b();
            }
            com.ss.android.ugc.aweme.app.f.d a10 = a9.a("request_id", aweme2.getRequestId()).a("enter_method", "live_cell");
            Aweme b3 = b();
            if (b3 != null) {
                num = Integer.valueOf(b3.getAwemePosition());
            } else {
                num = null;
            }
            com.ss.android.ugc.aweme.app.f.d a11 = a10.a("order", num);
            LiveRoomStruct liveRoomStruct5 = this.f91731c;
            if (liveRoomStruct5 == null) {
                h.f.b.l.b();
            }
            com.ss.android.ugc.aweme.app.f.d a12 = a11.a("follow_status", String.valueOf(n.a(liveRoomStruct5)));
            if (this.p) {
                str = str3;
            } else {
                str = "0";
            }
            com.ss.android.ugc.aweme.app.f.d a13 = a12.a("has_first_frame", str);
            LiveRoomStruct liveRoomStruct6 = this.f91731c;
            if (liveRoomStruct6 == null) {
                h.f.b.l.b();
            }
            if (!liveRoomStruct6.hasCommerceGoods) {
                str3 = "0";
            }
            com.ss.android.ugc.aweme.app.f.d a14 = a13.a("is_ecom", str3).a("room_position", this.aC);
            z2 = false;
            com.ss.android.ugc.aweme.common.r.a("livesdk_live_window_duration_v2", a14.a("is_from_draw_req", 0).f66730a);
        }
        this.f91734f = z2;
    }

    static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f91830a;

        static {
            Covode.recordClassIndex(57804);
        }

        j(l lVar) {
            this.f91830a = lVar;
        }

        public final void run() {
            String str;
            Long l2;
            String str2;
            int i2;
            User user;
            Integer num;
            if (this.f91830a.o) {
                this.f91830a.o = false;
                this.f91830a.n = System.currentTimeMillis();
                this.f91830a.p = true;
                l lVar = this.f91830a;
                LiveRoomStruct liveRoomStruct = lVar.f91731c;
                if (liveRoomStruct != null) {
                    com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("scene_id", "1007").a("enter_from_merge", lVar.L()).a("action_type", "click");
                    User user2 = liveRoomStruct.owner;
                    h.f.b.l.b(user2, "");
                    com.ss.android.ugc.aweme.app.f.d a3 = a2.a("anchor_id", user2.getUid()).a("room_id", liveRoomStruct.id);
                    Aweme aweme = lVar.f91730b;
                    if (aweme == null) {
                        h.f.b.l.b();
                    }
                    com.ss.android.ugc.aweme.app.f.d a4 = a3.a("request_id", aweme.getRequestId());
                    Aweme aweme2 = lVar.f91730b;
                    if (aweme2 != null) {
                        num = Integer.valueOf(aweme2.getAwemePosition());
                    } else {
                        num = null;
                    }
                    com.ss.android.ugc.aweme.common.r.a("livesdk_live_window_show", a4.a("order", num).a("enter_method", "live_cell").f66730a);
                }
                l lVar2 = this.f91830a;
                lVar2.N.a("start", String.valueOf(lVar2.f91811m));
                if (lVar2.f91811m > 0 && lVar2.n > 0 && lVar2.f91730b != null && lVar2.f91731c != null) {
                    long j2 = lVar2.n - lVar2.f91811m;
                    if (j2 < 0) {
                        j2 = 0;
                    }
                    JSONObject staticLog = lVar2.R.getStaticLog();
                    com.ss.android.ugc.aweme.app.f.d a5 = new com.ss.android.ugc.aweme.app.f.d().a("scene_id", "1007").a("enter_from_merge", lVar2.L()).a("action_type", "click");
                    LiveRoomStruct liveRoomStruct2 = lVar2.f91731c;
                    if (liveRoomStruct2 == null || (user = liveRoomStruct2.owner) == null) {
                        str = null;
                    } else {
                        str = user.getUid();
                    }
                    com.ss.android.ugc.aweme.app.f.d a6 = a5.a("anchor_id", str);
                    LiveRoomStruct liveRoomStruct3 = lVar2.f91731c;
                    if (liveRoomStruct3 != null) {
                        l2 = Long.valueOf(liveRoomStruct3.id);
                    } else {
                        l2 = null;
                    }
                    com.ss.android.ugc.aweme.app.f.d a7 = a6.a("room_id", l2);
                    Aweme aweme3 = lVar2.f91730b;
                    if (aweme3 == null) {
                        h.f.b.l.b();
                    }
                    com.ss.android.ugc.aweme.app.f.d a8 = a7.a("request_id", aweme3.getRequestId()).a("enter_method", "live_cell").a("notice_type", com.ss.android.ugc.aweme.follow.e.a.f96227a).a("show_cnt", String.valueOf(com.ss.android.ugc.aweme.follow.e.a.f96228b)).a("yellow_dot_logid", com.ss.android.ugc.aweme.follow.e.a.f96229c).a("duration", j2);
                    if (lVar2.p) {
                        str2 = "1";
                    } else {
                        str2 = "0";
                    }
                    int i3 = -1;
                    com.ss.android.ugc.aweme.app.f.d a9 = a8.a("has_first_frame", str2).a(lVar2.N.b()).a("first_frame_duration", lVar2.N.d()).a("vquality", staticLog.optString("settings_res:", "-1")).a("bitrate", staticLog.optInt("download_Speed:", -1)).a("definition", staticLog.optString("width:", "-1"));
                    String optString = staticLog.optString("HardDecode:", "-1");
                    h.f.b.l.b(optString, "");
                    if (TextUtils.equals(optString, "true")) {
                        i2 = 1;
                    } else if (TextUtils.equals(optString, "false")) {
                        i2 = 0;
                    } else {
                        i2 = -1;
                    }
                    com.ss.android.ugc.aweme.app.f.d a10 = a9.a("is_hw", i2);
                    String optString2 = staticLog.optString("Codec_Type:", "-1");
                    h.f.b.l.b(optString2, "");
                    if (TextUtils.equals(optString2, "bytevc1")) {
                        i3 = 1;
                    } else if (TextUtils.equals(optString2, "h264")) {
                        i3 = 0;
                    }
                    com.ss.android.ugc.aweme.common.r.a("livesdk_enter_window_from_draw_duration", a10.a("is_bytevc1", i3).a("video_package_duration", lVar2.N.f()).f66730a);
                    lVar2.N.c();
                }
                l lVar3 = this.f91830a;
                if (lVar3.G) {
                    lVar3.u.setVisibility(0);
                    lVar3.R.setMute(false);
                } else {
                    lVar3.u.setVisibility(8);
                    lVar3.R.setMute(true);
                }
                this.f91830a.R.changeSRSupportScene(LivePreviewCardEnableSrSetting.INSTANCE.isEnable());
                com.bytedance.android.livesdkapi.depend.d.b bVar = this.f91830a.E;
                if (bVar != null) {
                    bVar.a();
                }
                com.bytedance.android.livesdkapi.depend.d.c cVar = this.f91830a.F;
                if (cVar != null) {
                    cVar.a(com.bytedance.ies.abmock.b.a().a(true, "follow_live_interaction_style", 0));
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void ai() {
        /*
        // Method dump skipped, instructions count: 516
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.l.ai():void");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.c
    public final void n() {
        boolean z2;
        String str;
        UrlModel urlModel;
        String str2;
        List<com.bytedance.android.live.base.model.user.User> list;
        com.bytedance.android.live.base.model.user.User user;
        String str3;
        String nickname;
        UrlModel urlModel2;
        UrlModel urlModel3;
        ViewGroup.LayoutParams layoutParams;
        String str4;
        FeedRoomTagList feedRoomTagList;
        List<FeedSubTag> subTags;
        FeedRoomTagList feedRoomTagList2;
        List<FeedFirstTag> firstTags;
        String str5;
        String str6;
        List<com.bytedance.android.live.base.model.user.User> list2;
        com.bytedance.android.livesdkapi.depend.d.b bVar;
        AwemeRawAd awemeRawAd;
        String str7;
        AwemeRawAd awemeRawAd2;
        AwemeTextLabelModel label;
        String labelName;
        LiveRoomStruct liveRoomStruct = this.f91731c;
        if (liveRoomStruct != null) {
            if (liveRoomStruct.liveEventInfo != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.K = z2;
            com.ss.android.ugc.aweme.live.b.b bVar2 = this.av;
            boolean z3 = this.f91810l;
            String str8 = "";
            h.f.b.l.d(liveRoomStruct, str8);
            bVar2.f108344g = liveRoomStruct;
            bVar2.f108345h = z3;
            if (!bVar2.c()) {
                ViewGroup viewGroup = bVar2.f108338a;
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
                bVar2.a();
            } else {
                ViewGroup viewGroup2 = bVar2.f108338a;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
                if (bVar2.f108339b != null) {
                    User user2 = liveRoomStruct.owner;
                    if (user2 != null) {
                        urlModel = user2.getAvatarLarger();
                    } else {
                        urlModel = null;
                    }
                    com.bytedance.lighten.a.v a2 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(urlModel)).a("AudioLivePreviewManager");
                    a2.E = bVar2.f108339b;
                    a2.c();
                }
                if (bVar2.f108341d != null && !TextUtils.isEmpty(bVar2.f108342e)) {
                    com.bytedance.lighten.a.v a3 = com.bytedance.lighten.a.r.a((Object) bVar2.f108342e).a("AudioLivePreviewManager");
                    a3.f39907c = true;
                    a3.u = Bitmap.Config.ARGB_8888;
                    a3.E = bVar2.f108341d;
                    a3.c();
                }
                List<String> list3 = bVar2.f108343f;
                User user3 = liveRoomStruct.owner;
                if (user3 != null) {
                    str = user3.getUid();
                } else {
                    str = null;
                }
                String a4 = com.ss.android.ugc.aweme.live.b.b.a(list3, str);
                if (!(a4 == null || a4.length() <= 0 || bVar2.f108340c == null)) {
                    com.bytedance.lighten.a.v a5 = com.bytedance.lighten.a.r.a(a4).a("AudioLivePreviewManager");
                    a5.E = bVar2.f108340c;
                    a5.c();
                }
                bVar2.b();
            }
            TuxTextView tuxTextView = this.s;
            TuxTextView tuxTextView2 = this.r;
            RichTagView richTagView = this.t;
            this.U.setVisibility(0);
            z.e eVar = new z.e();
            eVar.element = null;
            if (this.K) {
                if (!liveRoomStruct.liveEventInfo.getSubscribed() || !this.f91810l) {
                    this.z.setVisibility(8);
                } else {
                    this.z.setVisibility(0);
                }
                this.aj.setVisibility(0);
                tuxTextView.setVisibility(0);
                String title = liveRoomStruct.liveEventInfo.getTitle();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (com.bytedance.android.live.uikit.c.a.a(this.f91729a)) {
                    if (androidx.core.f.f.f2385d.a(title, title.length())) {
                        spannableStringBuilder.append((CharSequence) title).append((char) 8202).append((CharSequence) " ").append((char) 8204);
                        spannableStringBuilder.setSpan(ac(), title.length() + 1, title.length() + 2, 17);
                    } else {
                        spannableStringBuilder.append((char) 8202).append((CharSequence) " ").append((char) 8204).append((CharSequence) title);
                        spannableStringBuilder.setSpan(ac(), 1, 2, 17);
                    }
                } else if (androidx.core.f.f.f2384c.a(title, title.length())) {
                    spannableStringBuilder.append((char) 8202).append((CharSequence) " ").append((char) 8204).append((CharSequence) title);
                    spannableStringBuilder.setSpan(ac(), 1, 2, 17);
                } else {
                    spannableStringBuilder.append((CharSequence) title).append((char) 8202).append((CharSequence) " ").append((char) 8204);
                    spannableStringBuilder.setSpan(ac(), title.length() + 1, title.length() + 2, 17);
                }
                tuxTextView2.setText(spannableStringBuilder);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm aa", Locale.US);
                tuxTextView.setText(simpleDateFormat.format(new Date(liveRoomStruct.liveEventInfo.getStartTime() * 1000)) + " - " + simpleDateFormat.format(new Date((liveRoomStruct.liveEventInfo.getStartTime() + liveRoomStruct.liveEventInfo.getDuration()) * 1000)) + " (UTC+8)");
            } else {
                if (TextUtils.isEmpty(liveRoomStruct.title)) {
                    tuxTextView.setVisibility(8);
                } else {
                    tuxTextView.setText(liveRoomStruct.title);
                    tuxTextView.setVisibility(0);
                }
                if (liveRoomStruct.owner != null) {
                    User user4 = liveRoomStruct.owner;
                    h.f.b.l.b(user4, str8);
                    if (!TextUtils.isEmpty(user4.getUniqueId())) {
                        StringBuilder sb = new StringBuilder("@");
                        User user5 = liveRoomStruct.owner;
                        h.f.b.l.b(user5, str8);
                        str2 = sb.append(user5.getUniqueId()).toString();
                        eVar.element = (T) ((SlimRoom.a) dg.a(liveRoomStruct.linkMic, SlimRoom.a.class));
                        T t2 = eVar.element;
                        if (!(t2 == null || (list = t2.f23031a) == null || (user = list.get(0)) == null || (str3 = user.displayId) == null)) {
                            str2 = "@".concat(String.valueOf(str3));
                        }
                        tuxTextView2.setText(str2);
                        this.aj.setVisibility(8);
                        this.z.setVisibility(8);
                    }
                }
                User user6 = liveRoomStruct.owner;
                if (user6 != null) {
                    if (!TextUtils.isEmpty(user6.getRemarkName())) {
                        nickname = user6.getRemarkName();
                    } else {
                        nickname = user6.getNickname();
                    }
                    if (!TextUtils.isEmpty(nickname)) {
                        str2 = "@" + nickname;
                        eVar.element = (T) ((SlimRoom.a) dg.a(liveRoomStruct.linkMic, SlimRoom.a.class));
                        T t22 = eVar.element;
                        str2 = "@".concat(String.valueOf(str3));
                        tuxTextView2.setText(str2);
                        this.aj.setVisibility(8);
                        this.z.setVisibility(8);
                    }
                }
                str2 = str8;
                try {
                    eVar.element = (T) ((SlimRoom.a) dg.a(liveRoomStruct.linkMic, SlimRoom.a.class));
                } catch (Exception unused) {
                }
                T t222 = eVar.element;
                str2 = "@".concat(String.valueOf(str3));
                tuxTextView2.setText(str2);
                this.aj.setVisibility(8);
                this.z.setVisibility(8);
            }
            Aweme aweme = this.f91730b;
            if (aweme == null || aweme.getAwemeRawAd() == null || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || !awemeRawAd.isRightStyle()) {
                richTagView.setVisibility(8);
            } else {
                a.C0795a a6 = a.C0795a.C0796a.a();
                Aweme aweme2 = this.f91730b;
                if (!(aweme2 == null || (awemeRawAd2 = aweme2.getAwemeRawAd()) == null || (label = awemeRawAd2.getLabel()) == null || (labelName = label.getLabelName()) == null)) {
                    str8 = labelName;
                }
                com.bytedance.ies.ugc.aweme.rich.ui.a aVar = a6.a(str8).b(92).a(richTagView.getResources().getColor(R.color.a9)).f35183a;
                if (aVar != null) {
                    richTagView.a(aVar);
                }
                Aweme aweme3 = this.f91730b;
                if (aweme3 != null) {
                    str7 = aweme3.getDesc();
                } else {
                    str7 = null;
                }
                if (TextUtils.isEmpty(str7)) {
                    ViewGroup.LayoutParams layoutParams2 = richTagView.getLayoutParams();
                    Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.topMargin = (int) com.bytedance.common.utility.n.b(this.f91729a, 4.5f);
                    richTagView.setLayoutParams(marginLayoutParams);
                }
                richTagView.setVisibility(0);
            }
            tuxTextView2.setOnClickListener(new f(liveRoomStruct, eVar, this));
            User user7 = liveRoomStruct.owner;
            if (user7 != null) {
                user7.roomId = liveRoomStruct.id;
            }
            int i2 = this.au;
            if ((i2 == 5 || i2 == 3) && this.f91810l) {
                com.ss.android.ugc.aweme.live.c d2 = LiveOuterService.s().d();
                if (d2 != null) {
                    bVar = d2.a(this.f91729a, this.ae);
                } else {
                    bVar = null;
                }
                this.E = bVar;
            }
            ViewGroup viewGroup3 = this.C;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(8);
            }
            WarningInfoView warningInfoView = this.an;
            if (warningInfoView != null) {
                warningInfoView.setVisibility(8);
            }
            if (this.f91810l) {
                if (this.H) {
                    this.ab.setVisibility(8);
                }
                this.u.setVisibility(0);
                this.W.setVisibility(0);
                this.ac.setVisibility(0);
                this.ad.setVisibility(0);
                this.v.setVisibility(0);
                this.w.setVisibility(8);
                if (this.K) {
                    this.Z.setText(ab.a(this.f91729a, "pm_live_mt_events_mixed_card"));
                    this.aa.setText(ab.a(this.f91729a, "pm_live_mt_events_mixed_card"));
                    this.W.setText(ab.a(this.f91729a, "pm_mt_live_events_live_consumer_live_events"));
                } else {
                    this.Z.setText(ab.a(this.f91729a, "pm_following_livecard_watch_guide2"));
                    this.aa.setText(ab.a(this.f91729a, "pm_following_livecard_watch_guide2"));
                    this.W.setText(ab.a(this.f91729a, "pm_following_livecard_live_icon_backup"));
                }
                LiveRoomStruct liveRoomStruct2 = this.f91731c;
                if (liveRoomStruct2 != null) {
                    str4 = liveRoomStruct2.linkMic;
                } else {
                    str4 = null;
                }
                if (!TextUtils.isEmpty(str4)) {
                    try {
                        LiveRoomStruct liveRoomStruct3 = this.f91731c;
                        if (liveRoomStruct3 != null) {
                            str6 = liveRoomStruct3.linkMic;
                        } else {
                            str6 = null;
                        }
                        SlimRoom.a aVar2 = (SlimRoom.a) dg.a(str6, SlimRoom.a.class);
                        if (!(aVar2 == null || (list2 = aVar2.f23031a) == null || list2.size() <= 0)) {
                            this.w.setVisibility(0);
                            this.v.setVisibility(8);
                            this.W.setText(this.f91729a.getString(R.string.e9f));
                        }
                    } catch (Exception unused2) {
                    }
                }
                LiveRoomStruct liveRoomStruct4 = this.f91731c;
                if (!(liveRoomStruct4 == null || (str5 = liveRoomStruct4.videoFeedTag) == null)) {
                    this.W.setText(str5);
                }
                if (M() && LiveForYouPageTagSetting.INSTANCE.getValue() > 0) {
                    this.Y.setVisibility(8);
                    LiveRoomStruct liveRoomStruct5 = this.f91731c;
                    if (!(liveRoomStruct5 == null || (feedRoomTagList2 = liveRoomStruct5.feedRoomTagList) == null || (firstTags = feedRoomTagList2.getFirstTags()) == null)) {
                        if (!firstTags.isEmpty()) {
                            FeedFirstTag feedFirstTag = firstTags.get(0);
                            String content = feedFirstTag.getContent();
                            if (!TextUtils.isEmpty(content)) {
                                this.W.setText(content);
                                this.W.setVisibility(0);
                                UrlModel icon = feedFirstTag.getIcon();
                                if (icon != null) {
                                    com.ss.android.ugc.aweme.base.e.a(this.Y, icon);
                                    this.Y.setVisibility(0);
                                }
                                this.B.setVisibility(0);
                            }
                        }
                    }
                    this.z.setVisibility(8);
                    this.A.setVisibility(8);
                    LiveRoomStruct liveRoomStruct6 = this.f91731c;
                    if (!(liveRoomStruct6 == null || (feedRoomTagList = liveRoomStruct6.feedRoomTagList) == null || (subTags = feedRoomTagList.getSubTags()) == null || subTags.isEmpty())) {
                        FeedSubTag feedSubTag = subTags.get(0);
                        String content2 = feedSubTag.getContent();
                        if (!TextUtils.isEmpty(content2)) {
                            this.z.setText(content2);
                            this.z.setVisibility(0);
                            a(this.z, feedSubTag.getStyle());
                            this.P.post(new o(content2, feedSubTag, this));
                        }
                    }
                }
                this.af.setOnClickListener(new p(this, liveRoomStruct));
                urlModel3 = null;
                this.ah.setOnClickListener(null);
                this.ag.setOnClickListener(null);
                this.ai.setOnClickListener(null);
                this.af.setListener(a(this.f91729a));
                ae();
                urlModel2 = liveRoomStruct.roomCover;
                if (urlModel2 == null) {
                    User user8 = liveRoomStruct.owner;
                    if (user8 != null) {
                        urlModel3 = user8.getAvatarLarger();
                    }
                }
                urlModel3 = urlModel2;
            } else {
                urlModel3 = null;
                if (this.H) {
                    this.ab.setVisibility(0);
                    if (this.K) {
                        this.ak.setText(ab.a(this.f91729a, "pm_live_mt_events_live_consumer_event_end"));
                    } else {
                        this.ak.setText(ab.a(this.f91729a, "pm_following_livecard_live_end"));
                    }
                    this.v.setVisibility(8);
                    this.w.setVisibility(8);
                } else {
                    if (this.K) {
                        this.Z.setText(ab.a(this.f91729a, "pm_live_mt_events_live_consumer_event_end"));
                        this.aa.setText(ab.a(this.f91729a, "pm_live_mt_events_live_consumer_event_end"));
                    } else {
                        this.Z.setText(ab.a(this.f91729a, "pm_following_livecard_live_end"));
                        this.aa.setText(ab.a(this.f91729a, "pm_following_livecard_live_end"));
                    }
                    Z();
                }
                this.ac.setVisibility(8);
                this.W.setVisibility(8);
                this.B.setVisibility(8);
                this.A.setVisibility(8);
                this.ad.setVisibility(4);
                this.af.setOnClickListener(new q(this, liveRoomStruct));
                this.ah.setOnClickListener(new r(this));
                this.ag.setOnClickListener(new s(this));
                this.ai.setOnClickListener(new t(this));
                urlModel2 = liveRoomStruct.roomCover;
                if (urlModel2 == null) {
                    User user9 = liveRoomStruct.owner;
                    if (user9 != null) {
                        urlModel3 = user9.getAvatarLarger();
                    }
                }
                urlModel3 = urlModel2;
            }
            int b2 = com.ss.android.ugc.aweme.base.utils.i.b(this.f91729a);
            int a7 = com.ss.android.ugc.aweme.base.utils.i.a(this.f91729a);
            RemoteImageView remoteImageView = this.q;
            if (!(remoteImageView == null || (layoutParams = remoteImageView.getLayoutParams()) == null)) {
                layoutParams.width = b2;
                layoutParams.height = a7;
            }
            if (urlModel3 != null) {
                this.q.post(new g(b2, a7, urlModel3, this));
            } else {
                this.q.setVisibility(8);
            }
            al();
            f(false);
        }
        this.af.setTimeInterval(500);
    }

    static final class i extends h.f.b.m implements h.f.a.b<View, h.z> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(57802);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(l lVar) {
            super(1);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(View view) {
            a(view);
            return h.z.f158842a;
        }

        public final void a(final View view) {
            h.f.b.l.d(view, "");
            this.this$0.D.post(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.feed.adapter.l.i.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ i f91828a;

                static {
                    Covode.recordClassIndex(57803);
                }

                {
                    this.f91828a = r1;
                }

                public final void run() {
                    this.f91828a.this$0.y.animate().translationY(((float) (com.ss.android.ugc.aweme.base.utils.o.c(this.f91828a.this$0.D).top - com.ss.android.ugc.aweme.base.utils.o.c(view).bottom)) - com.bytedance.common.utility.n.b(this.f91828a.this$0.f91729a, 32.0f)).setDuration(360).setStartDelay(0).start();
                    int childCount = ((ViewGroup) this.f91828a.this$0.y).getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = ((ViewGroup) this.f91828a.this$0.y).getChildAt(i2);
                        h.f.b.l.b(childAt, "");
                        if (!(childAt.getId() == this.f91828a.this$0.v.getId() || childAt.getId() == this.f91828a.this$0.w.getId())) {
                            childAt.animate().alpha(0.0f).setDuration(200).setStartDelay(0).start();
                        }
                    }
                }
            });
        }
    }

    public static final class k implements com.ss.android.ugc.aweme.live.e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f91831a;

        static {
            Covode.recordClassIndex(57805);
        }

        @Override // com.ss.android.ugc.aweme.live.e.b
        public final void firstFrame() {
        }

        @Override // com.ss.android.ugc.aweme.live.e.b
        public final void playPrepared(String str) {
            h.f.b.l.d(str, "");
        }

        @Override // com.ss.android.ugc.aweme.live.e.b
        public final void playerMediaError(String str) {
            h.f.b.l.d(str, "");
        }

        @Override // com.ss.android.ugc.aweme.live.e.b
        public final void playing() {
        }

        @Override // com.ss.android.ugc.aweme.live.e.b
        public final void seiUpdate(String str) {
            h.f.b.l.d(str, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(l lVar) {
            this.f91831a = lVar;
        }

        @Override // com.ss.android.ugc.aweme.live.e.b
        public final void playComplete(String str) {
            AwemeRawAd awemeRawAd;
            String str2;
            RoomFeedCellStruct roomFeedCellStruct;
            LiveRoomStruct newLiveRoomData;
            RoomFeedCellStruct roomFeedCellStruct2;
            LiveRoomStruct newLiveRoomData2;
            h.f.b.l.d(str, "");
            Aweme aweme = this.f91831a.f91730b;
            if (aweme != null && aweme.isAd()) {
                Aweme aweme2 = this.f91831a.f91730b;
                String str3 = null;
                if (aweme2 != null) {
                    awemeRawAd = aweme2.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                a.C0791a b2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "over", awemeRawAd).b("duration", Long.valueOf(System.currentTimeMillis() - this.f91831a.f91811m));
                Aweme aweme3 = this.f91831a.f91730b;
                if (aweme3 == null || (roomFeedCellStruct2 = aweme3.getRoomFeedCellStruct()) == null || (newLiveRoomData2 = roomFeedCellStruct2.getNewLiveRoomData()) == null) {
                    str2 = null;
                } else {
                    str2 = String.valueOf(newLiveRoomData2.getAnchorId());
                }
                a.C0791a a2 = b2.a("anchor_id", str2);
                Aweme aweme4 = this.f91831a.f91730b;
                if (!(aweme4 == null || (roomFeedCellStruct = aweme4.getRoomFeedCellStruct()) == null || (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) == null)) {
                    str3 = String.valueOf(newLiveRoomData.id);
                }
                a2.a("room_id", str3).b();
            }
        }

        @Override // com.ss.android.ugc.aweme.live.e.b
        public final void onPlayerMessage(g.b bVar, Object obj) {
            h.f.b.l.d(bVar, "");
            int i2 = m.f91848a[bVar.ordinal()];
            if (i2 == 1 || i2 == 2) {
                this.f91831a.f(true);
            }
        }

        @Override // com.ss.android.ugc.aweme.live.e.b
        public final void onVideoSizeChange(TextureView textureView, int i2, int i3) {
            l lVar = this.f91831a;
            ViewGroup.LayoutParams layoutParams = lVar.u.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (i2 > i3) {
                marginLayoutParams.width = com.ss.android.ugc.aweme.base.utils.i.b(lVar.f91729a);
                marginLayoutParams.height = (int) (((float) marginLayoutParams.width) * (((float) i3) / ((float) i2)));
                marginLayoutParams.topMargin = (int) com.bytedance.common.utility.n.b(lVar.f91729a, 96.0f);
            } else {
                marginLayoutParams.width = com.ss.android.ugc.aweme.base.utils.i.b(lVar.f91729a);
                marginLayoutParams.height = com.ss.android.ugc.aweme.base.utils.i.a(lVar.f91729a) - com.bytedance.common.utility.n.e(lVar.f91729a);
                marginLayoutParams.topMargin = 0;
            }
            lVar.u.setLayoutParams(marginLayoutParams);
        }
    }

    public static final class a implements f.a.d.f<f.b> {

        /* renamed from: a  reason: collision with root package name */
        public boolean f91812a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f91813b;

        static {
            Covode.recordClassIndex(57793);
        }

        public final void a(boolean z) {
            if (z) {
                this.f91812a = true;
            } else if (this.f91812a) {
                this.f91812a = false;
                this.f91813b = true;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(f.b bVar) {
            f.b bVar2 = bVar;
            if (bVar2 != null) {
                a(bVar2.f34642b);
            }
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Aweme f91818a;

        static {
            Covode.recordClassIndex(57797);
        }

        e(Aweme aweme) {
            this.f91818a = aweme;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Aweme aweme = this.f91818a;
            if (aweme != null) {
                h.f.b.l.b(view, "");
                com.ss.android.ugc.aweme.feed.assem.report.a.a(aweme, view);
            }
        }
    }

    static final class r implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f91843a;

        static {
            Covode.recordClassIndex(57812);
        }

        r(l lVar) {
            this.f91843a = lVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f91843a.Y();
        }
    }

    static final class s implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f91844a;

        static {
            Covode.recordClassIndex(57813);
        }

        s(l lVar) {
            this.f91844a = lVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f91844a.Y();
        }
    }

    static final class t implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f91845a;

        static {
            Covode.recordClassIndex(57814);
        }

        t(l lVar) {
            this.f91845a = lVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f91845a.aa();
        }
    }

    static final class n implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f91834a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.im.service.model.l f91835b;

        static {
            Covode.recordClassIndex(57808);
        }

        n(l lVar, com.ss.android.ugc.aweme.im.service.model.l lVar2) {
            this.f91834a = lVar;
            this.f91835b = lVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.feed.share.a.a(this.f91834a.S);
            this.f91835b.f103929f.a();
        }
    }

    static final class p implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f91839a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LiveRoomStruct f91840b;

        static {
            Covode.recordClassIndex(57810);
        }

        p(l lVar, LiveRoomStruct liveRoomStruct) {
            this.f91839a = lVar;
            this.f91840b = liveRoomStruct;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f91839a.f91736h) {
                this.f91839a.f91736h = false;
            } else {
                this.f91839a.a(this.f91840b);
            }
        }
    }

    public static int b(LiveRoomStruct liveRoomStruct) {
        User user = liveRoomStruct.owner;
        if (user == null) {
            return -1;
        }
        int followStatus = user.getFollowStatus();
        if (followStatus == 0 || followStatus == 1 || followStatus == 2) {
            return followStatus;
        }
        if (user.getFollowerStatus() == 0) {
            return 0;
        }
        return 3;
    }

    public final void f(boolean z2) {
        LiveRoomStruct liveRoomStruct = this.f91731c;
        if (liveRoomStruct != null) {
            ILiveOuterService s2 = LiveOuterService.s();
            h.f.b.l.b(s2, "");
            s2.d().a(liveRoomStruct.id, new h(this, z2));
        }
    }

    @org.greenrobot.eventbus.r
    public final void onEvent(com.bytedance.android.livesdkapi.g.j jVar) {
        h.f.b.l.d(jVar, "");
        LiveRoomStruct liveRoomStruct = this.f91731c;
        if (liveRoomStruct != null && liveRoomStruct.id == jVar.f23203a) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.feed.i.e(b(), this.at));
        }
    }

    private static void b(Activity activity) {
        try {
            Method declaredMethod = Activity.class.getDeclaredMethod("convertFromTranslucent", new Class[0]);
            h.f.b.l.b(declaredMethod, "");
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(activity, new Object[0]);
        } catch (Throwable th) {
            com.bytedance.android.live.core.c.a.a("FeedLiveViewHolderNew", th);
        }
    }

    @org.greenrobot.eventbus.r
    public final void onFollowLiveStatusChange(com.bytedance.android.live.base.a.a aVar) {
        h.f.b.l.d(aVar, "");
        LiveRoomStruct liveRoomStruct = this.f91731c;
        if (liveRoomStruct != null && liveRoomStruct.id == aVar.f7362a && aVar.f7364c) {
            this.f91810l = false;
            n();
            this.R.pauseWithStreamData();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$l  reason: collision with other inner class name */
    public static final class C2215l extends com.bytedance.android.livesdk.callback.b {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f91832b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f91833c;

        static {
            Covode.recordClassIndex(57806);
        }

        @Override // com.bytedance.android.livesdk.callback.b
        public final void a(Map<String, Object> map) {
            Object obj;
            String str;
            String str2;
            HashMap<String, String> hashMap = null;
            if (map != null) {
                obj = map.get("audience_live_play_enter_room_config");
            } else {
                obj = null;
            }
            if (!(obj instanceof EnterRoomConfig)) {
                obj = null;
            }
            EnterRoomConfig enterRoomConfig = (EnterRoomConfig) obj;
            if (enterRoomConfig != null) {
                EnterRoomConfig.RoomsData roomsData = enterRoomConfig.f23299c;
                if (roomsData != null) {
                    hashMap = roomsData.f23333l;
                }
                EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.f23299c;
                if (roomsData2 != null && roomsData2.o) {
                    String str3 = this.f91832b;
                    String str4 = "";
                    if (hashMap == null || (str = hashMap.get("value")) == null) {
                        str = str4;
                    }
                    h.f.b.l.b(str, str4);
                    if (!(hashMap == null || (str2 = hashMap.get("log_extra")) == null)) {
                        str4 = str2;
                    }
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("live_ad", str3, str, str4, "0").a("room_id", map.get("audience_live_play_room_id")).b();
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2215l(String str, long j2, long j3) {
            super(j3);
            this.f91832b = str;
            this.f91833c = j2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class u implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f91846a;

        static {
            Covode.recordClassIndex(57815);
        }

        u(l lVar) {
            this.f91846a = lVar;
        }

        public final void onClick(View view) {
            String str;
            Long l2;
            User user;
            ClickAgent.onClick(view);
            this.f91846a.L = true;
            this.f91846a.C.setVisibility(8);
            this.f91846a.o();
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from_merge", this.f91846a.L());
            hashMap.put("enter_method", "live_cell");
            LiveRoomStruct liveRoomStruct = this.f91846a.f91731c;
            if (liveRoomStruct == null || (user = liveRoomStruct.owner) == null || (str = user.getUid()) == null) {
                str = "";
            }
            hashMap.put("anchor_id", str);
            LiveRoomStruct liveRoomStruct2 = this.f91846a.f91731c;
            if (liveRoomStruct2 != null) {
                l2 = Long.valueOf(liveRoomStruct2.id);
            } else {
                l2 = null;
            }
            hashMap.put("room_id", String.valueOf(l2));
            hashMap.put("action_type", "click");
            hashMap.put("click_icon", "watch");
            b.a.a("livesdk_mask_layer_click").a((Map<String, String>) hashMap).b();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class v implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f91847a;

        static {
            Covode.recordClassIndex(57816);
        }

        v(l lVar) {
            this.f91847a = lVar;
        }

        public final void onClick(View view) {
            String str;
            Long l2;
            User user;
            ClickAgent.onClick(view);
            ao.a(y.e(), (int) R.string.efb);
            this.f91847a.M = true;
            this.f91847a.G = true;
            this.f91847a.aa();
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from_merge", this.f91847a.L());
            hashMap.put("enter_method", "live_cell");
            LiveRoomStruct liveRoomStruct = this.f91847a.f91731c;
            if (liveRoomStruct == null || (user = liveRoomStruct.owner) == null || (str = user.getUid()) == null) {
                str = "";
            }
            hashMap.put("anchor_id", str);
            LiveRoomStruct liveRoomStruct2 = this.f91847a.f91731c;
            if (liveRoomStruct2 != null) {
                l2 = Long.valueOf(liveRoomStruct2.id);
            } else {
                l2 = null;
            }
            hashMap.put("room_id", String.valueOf(l2));
            hashMap.put("action_type", "click");
            hashMap.put("click_icon", "skip");
            b.a.a("livesdk_mask_layer_click").a((Map<String, String>) hashMap).b();
        }
    }

    private final void g(boolean z2) {
        if (z2) {
            this.V.animate().alpha(0.0f).setDuration(200).start();
            this.U.animate().alpha(0.0f).setDuration(200).start();
            if (this.f91729a instanceof Activity) {
                a((Activity) this.f91729a);
                return;
            }
            return;
        }
        this.V.setAlpha(1.0f);
        this.U.setAlpha(1.0f);
        if (this.f91729a instanceof Activity) {
            b((Activity) this.f91729a);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.c
    public final void a(int i2) {
        super.a(i2);
        this.aC = i2;
        this.ay = false;
        this.G = true;
        this.ax = 0;
        this.f91811m = System.currentTimeMillis();
        ConstraintLayout constraintLayout = this.U;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        f(true);
        this.u.setVisibility(0);
        this.R.setMute(false);
        this.aw = false;
        LiveRoomStruct liveRoomStruct = this.f91731c;
        if (liveRoomStruct != null && com.ss.android.ugc.aweme.commercialize.live.service.a.a(b()) && this.f91810l) {
            this.Q.b();
            ICommercializeLiveService a2 = CommercializeLiveServiceImpl.a();
            String valueOf = String.valueOf(liveRoomStruct.id);
            User user = liveRoomStruct.owner;
            h.f.b.l.b(user, "");
            String uid = user.getUid();
            h.f.b.l.b(uid, "");
            User user2 = liveRoomStruct.owner;
            h.f.b.l.b(user2, "");
            String secUid = user2.getSecUid();
            h.f.b.l.b(secUid, "");
            com.bytedance.retrofit2.b<com.ss.android.ugc.aweme.commercialize.live.a.c> a3 = a2.a(valueOf, uid, secUid);
            this.aE = a3;
            if (a3 != null) {
                a3.enqueue(new b(liveRoomStruct, this));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.c
    public final void b(int i2) {
        ah();
        this.aw = true;
        this.av.a();
        if (this.H) {
            com.ss.android.ugc.aweme.feed.f fVar = this.I;
            if (fVar != null) {
                fVar.f93102a.cancel();
                return;
            }
            return;
        }
        this.P.removeMessages(100);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.c
    public final void c(int i2) {
        if (this.f91737i) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.feed.ab(true));
            g(false);
        }
        super.c(i2);
        if (this.f91810l) {
            return;
        }
        if (this.H) {
            com.ss.android.ugc.aweme.feed.f fVar = this.I;
            if (fVar != null) {
                fVar.a();
                return;
            }
            return;
        }
        Z();
    }

    public final boolean handleMessage(Message message) {
        long j2;
        h.f.b.l.d(message, "");
        if (message.what == 100) {
            aa();
            return true;
        } else if (message.what == 1) {
            Object obj = message.obj;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.ShareCompleteEvent");
            com.ss.android.ugc.aweme.im.service.model.j jVar = (com.ss.android.ugc.aweme.im.service.model.j) obj;
            com.ss.android.ugc.aweme.feed.share.a.a(jVar, this.S);
            if (TextUtils.isEmpty(jVar.f103921i)) {
                j2 = 5000;
            } else {
                j2 = InteractFirstFrameTimeOutDurationSetting.DEFAULT;
            }
            this.P.sendEmptyMessageDelayed(2, j2);
            return true;
        } else if (message.what == 2) {
            com.ss.android.ugc.aweme.feed.share.a.c(this.S);
            return true;
        } else if (message.what == 3) {
            com.ss.android.ugc.aweme.feed.share.a.a(this.S);
            return true;
        } else if (message.what != 4) {
            return false;
        } else {
            com.ss.android.ugc.aweme.feed.share.a.b(this.S);
            return true;
        }
    }

    public static final class h implements com.bytedance.android.livesdkapi.service.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f91826a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f91827b;

        static {
            Covode.recordClassIndex(57800);
        }

        @Override // com.bytedance.android.livesdkapi.service.a
        public final void a(boolean z) {
            Long l2;
            com.ss.android.ugc.aweme.live.j m2;
            if (z != this.f91826a.f91810l) {
                this.f91826a.f91810l = z;
                ILiveOuterService s = LiveOuterService.s();
                if (!(s == null || (m2 = s.m()) == null)) {
                    m2.a("ttlive_feed_avatar_live_show", 0, ag.a(h.v.a("alive", String.valueOf(z))));
                }
                this.f91826a.n();
            }
            if (!z) {
                this.f91826a.R.stopWithStreamData();
                l lVar = this.f91826a;
                lVar.q.setVisibility(0);
                lVar.u.setVisibility(8);
                if (!this.f91826a.H) {
                    this.f91826a.Z();
                } else if (this.f91827b) {
                    LinkedList<Long> linkedList = this.f91826a.J;
                    LiveRoomStruct liveRoomStruct = this.f91826a.f91731c;
                    Long l3 = null;
                    if (liveRoomStruct != null) {
                        l2 = Long.valueOf(liveRoomStruct.id);
                    } else {
                        l2 = null;
                    }
                    if (h.a.n.a((Iterable) linkedList, (Object) l2)) {
                        this.f91826a.x.setText(ab.a(this.f91826a.f91729a, "pm_livecard_end_subtitle_2"));
                        return;
                    }
                    String a2 = ab.a(this.f91826a.f91729a, "pm_livecard_end_subtitle_1");
                    l lVar2 = this.f91826a;
                    TextView textView = this.f91826a.x;
                    h.f.b.l.b(a2, "");
                    lVar2.I = new com.ss.android.ugc.aweme.feed.f(textView, a2, new h.f.a.a<h.z>(this.f91826a) {
                        /* class com.ss.android.ugc.aweme.feed.adapter.l.h.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(57801);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // h.f.a.a
                        public final /* synthetic */ h.z invoke() {
                            ((l) this.receiver).aa();
                            return h.z.f158842a;
                        }
                    });
                    com.ss.android.ugc.aweme.feed.f fVar = this.f91826a.I;
                    if (fVar != null) {
                        fVar.a(fVar.f93103b / 1000);
                        fVar.f93102a.start();
                    }
                    if (this.f91826a.J.size() == 20) {
                        this.f91826a.J.poll();
                    }
                    LinkedList<Long> linkedList2 = this.f91826a.J;
                    LiveRoomStruct liveRoomStruct2 = this.f91826a.f91731c;
                    if (liveRoomStruct2 != null) {
                        l3 = Long.valueOf(liveRoomStruct2.id);
                    }
                    linkedList2.offer(l3);
                }
            }
        }

        h(l lVar, boolean z) {
            this.f91826a = lVar;
            this.f91827b = z;
        }
    }

    static final class q implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f91841a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LiveRoomStruct f91842b;

        static {
            Covode.recordClassIndex(57811);
        }

        q(l lVar, LiveRoomStruct liveRoomStruct) {
            this.f91841a = lVar;
            this.f91842b = liveRoomStruct;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from_merge", this.f91841a.L()).a("action_type", "click");
            LiveRoomStruct liveRoomStruct = this.f91841a.f91731c;
            if (liveRoomStruct == null) {
                h.f.b.l.b();
            }
            User user = liveRoomStruct.owner;
            h.f.b.l.b(user, "");
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("anchor_id", user.getUid());
            LiveRoomStruct liveRoomStruct2 = this.f91841a.f91731c;
            if (liveRoomStruct2 == null) {
                h.f.b.l.b();
            }
            com.ss.android.ugc.aweme.app.f.d a4 = a3.a("room_id", liveRoomStruct2.id);
            Aweme aweme = this.f91841a.f91730b;
            if (aweme == null) {
                h.f.b.l.b();
            }
            com.ss.android.ugc.aweme.app.f.d a5 = a4.a("request_id", aweme.getRequestId()).a("enter_method", "live_cell");
            User user2 = this.f91842b.owner;
            h.f.b.l.b(user2, "");
            com.ss.android.ugc.aweme.common.r.a("livesdk_finish_card_click", a5.a("follow_status", user2.getFollowStatus()).f66730a);
            this.f91841a.a(this.f91842b);
        }
    }

    private static void a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                Method declaredMethod = Activity.class.getDeclaredMethod("getActivityOptions", new Class[0]);
                h.f.b.l.b(declaredMethod, "");
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(activity, new Object[0]);
                Class<?>[] declaredClasses = Activity.class.getDeclaredClasses();
                Class<?> cls = null;
                for (Class<?> cls2 : declaredClasses) {
                    h.f.b.l.b(cls2, "");
                    String simpleName = cls2.getSimpleName();
                    h.f.b.l.b(simpleName, "");
                    if (h.m.p.a((CharSequence) simpleName, (CharSequence) "TranslucentConversionListener", false)) {
                        cls = cls2;
                    }
                }
                int i2 = Build.VERSION.SDK_INT;
                Method declaredMethod2 = Activity.class.getDeclaredMethod("convertToTranslucent", cls, ActivityOptions.class);
                h.f.b.l.b(declaredMethod2, "");
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(activity, null, invoke);
            } catch (Throwable th) {
                com.bytedance.android.live.core.c.a.a("FeedLiveViewHolderNew", th);
            }
        } else {
            try {
                Class<?>[] declaredClasses2 = Activity.class.getDeclaredClasses();
                Class<?> cls3 = null;
                for (Class<?> cls4 : declaredClasses2) {
                    h.f.b.l.b(cls4, "");
                    String simpleName2 = cls4.getSimpleName();
                    h.f.b.l.b(simpleName2, "");
                    if (h.m.p.a((CharSequence) simpleName2, (CharSequence) "TranslucentConversionListener", false)) {
                        cls3 = cls4;
                    }
                }
                Method declaredMethod3 = Activity.class.getDeclaredMethod("convertToTranslucent", cls3);
                h.f.b.l.b(declaredMethod3, "");
                declaredMethod3.setAccessible(true);
                declaredMethod3.invoke(activity, new Object[]{null});
            } catch (Throwable th2) {
                com.bytedance.android.live.core.c.a.a("FeedLiveViewHolderNew", th2);
            }
        }
    }

    private final void h(boolean z2) {
        String str;
        Long l2;
        String str2;
        String str3;
        User user;
        User user2;
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from_merge", L()).a("action_type", "click");
        LiveRoomStruct liveRoomStruct = this.f91731c;
        Integer num = null;
        if (liveRoomStruct == null || (user2 = liveRoomStruct.owner) == null) {
            str = null;
        } else {
            str = user2.getUid();
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("anchor_id", str);
        LiveRoomStruct liveRoomStruct2 = this.f91731c;
        if (liveRoomStruct2 != null) {
            l2 = Long.valueOf(liveRoomStruct2.id);
        } else {
            l2 = null;
        }
        com.ss.android.ugc.aweme.app.f.d a4 = a3.a("room_id", l2);
        Aweme aweme = this.f91730b;
        if (aweme != null) {
            str2 = aweme.getRequestId();
        } else {
            str2 = null;
        }
        com.ss.android.ugc.aweme.app.f.d a5 = a4.a("request_id", str2).a("enter_method", "live_cell");
        LiveRoomStruct liveRoomStruct3 = this.f91731c;
        if (!(liveRoomStruct3 == null || (user = liveRoomStruct3.owner) == null)) {
            num = Integer.valueOf(user.getFollowStatus());
        }
        com.ss.android.ugc.aweme.app.f.d a6 = a5.a("follow_status", num);
        if (z2) {
            str3 = "auto";
        } else {
            str3 = "swipe";
        }
        com.ss.android.ugc.aweme.common.r.a("livesdk_finish_card_swipe", a6.a("request_type", str3).f66730a);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah, com.ss.android.ugc.aweme.feed.adapter.c
    public final void b(Aweme aweme) {
        String str;
        Long l2;
        String str2;
        String str3;
        User user;
        User user2;
        com.ss.android.ugc.aweme.feed.f fVar;
        if (this.f91737i) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.feed.ab(true));
            g(false);
        }
        super.b(aweme);
        if (!this.G) {
            this.u.setVisibility(8);
        }
        this.o = true;
        this.f91811m = System.currentTimeMillis();
        this.n = 0;
        this.p = false;
        o();
        if (this.aw) {
            ai();
            this.aw = false;
        }
        if (!this.f91810l) {
            if (this.H && (fVar = this.I) != null) {
                fVar.a();
            }
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from_merge", L()).a("action_type", "click");
            LiveRoomStruct liveRoomStruct = this.f91731c;
            Integer num = null;
            if (liveRoomStruct == null || (user2 = liveRoomStruct.owner) == null) {
                str = null;
            } else {
                str = user2.getUid();
            }
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("anchor_id", str);
            LiveRoomStruct liveRoomStruct2 = this.f91731c;
            if (liveRoomStruct2 != null) {
                l2 = Long.valueOf(liveRoomStruct2.id);
            } else {
                l2 = null;
            }
            com.ss.android.ugc.aweme.app.f.d a4 = a3.a("room_id", l2);
            Aweme aweme2 = this.f91730b;
            if (aweme2 != null) {
                str2 = aweme2.getRequestId();
            } else {
                str2 = null;
            }
            com.ss.android.ugc.aweme.app.f.d a5 = a4.a("request_id", str2).a("enter_method", "live_cell");
            LiveRoomStruct liveRoomStruct3 = this.f91731c;
            if (!(liveRoomStruct3 == null || (user = liveRoomStruct3.owner) == null)) {
                num = Integer.valueOf(user.getFollowStatus());
            }
            com.ss.android.ugc.aweme.app.f.d a6 = a5.a("follow_status", num);
            a aVar = this.aF;
            if (aVar == null || !aVar.f91813b) {
                str3 = "0";
            } else {
                str3 = "1";
            }
            com.ss.android.ugc.aweme.common.r.a("livesdk_finish_card_show", a6.a("back_from_background", str3).f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.c
    public final void c(boolean z2) {
        if (z2) {
            this.V.animate().alpha(0.0f).setDuration(200).start();
            this.U.animate().alpha(0.0f).setDuration(200).start();
            return;
        }
        this.V.animate().alpha(1.0f).setDuration(200).start();
        this.U.animate().alpha(1.0f).setDuration(200).start();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(com.bytedance.android.widget.b bVar) {
        String str;
        com.bytedance.android.widget.b bVar2 = bVar;
        if (bVar2 != null && (str = bVar2.f24314a) != null) {
            int hashCode = str.hashCode();
            if (hashCode != 97530138) {
                if (hashCode == 97857237 && str.equals("ad_live_card_show") && (this.y instanceof ViewGroup)) {
                    i iVar = new i(this);
                    if (com.ss.android.ugc.aweme.base.utils.o.a(this.v)) {
                        iVar.a(this.v);
                    } else if (com.ss.android.ugc.aweme.base.utils.o.a(this.w)) {
                        iVar.a(this.w);
                    }
                }
            } else if (str.equals("ad_live_card_hide")) {
                View view = this.y;
                if (view instanceof ViewGroup) {
                    view.animate().translationY(0.0f).setDuration(360).setStartDelay(250).start();
                    int childCount = ((ViewGroup) this.y).getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        ((ViewGroup) this.y).getChildAt(i2).animate().alpha(1.0f).setDuration(200).setStartDelay(450).start();
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.feed.model.Aweme r8) {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.l.a(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveRoomStruct f91819a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f91820b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ l f91821c;

        static {
            Covode.recordClassIndex(57798);
        }

        f(LiveRoomStruct liveRoomStruct, z.e eVar, l lVar) {
            this.f91819a = liveRoomStruct;
            this.f91820b = eVar;
            this.f91821c = lVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:44:0x016d  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0177  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x021a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r11) {
            /*
            // Method dump skipped, instructions count: 549
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.l.f.onClick(android.view.View):void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x024d, code lost:
        if (r1 != null) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x025b, code lost:
        if (r1 != null) goto L_0x022c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r12) {
        /*
        // Method dump skipped, instructions count: 858
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.l.a(com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct):void");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.c
    public final void a(com.ss.android.ugc.aweme.im.service.model.j jVar) {
        super.a(jVar);
        Aweme aweme = this.f91730b;
        if (aweme != null && jVar != null && TextUtils.equals(jVar.f103919g, aweme.getAid())) {
            if (TextUtils.isEmpty(this.aH) || TextUtils.isEmpty(jVar.f103921i) || TextUtils.equals(this.aH, jVar.f103921i)) {
                ad();
                Message obtainMessage = this.P.obtainMessage(1);
                h.f.b.l.b(obtainMessage, "");
                obtainMessage.obj = jVar;
                if (TextUtils.isEmpty(jVar.f103921i)) {
                    this.P.sendMessage(obtainMessage);
                } else {
                    this.P.sendMessageDelayed(obtainMessage, 500);
                }
            }
        }
    }

    public static final class b implements com.bytedance.retrofit2.d<com.ss.android.ugc.aweme.commercialize.live.a.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveRoomStruct f91814a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f91815b;

        static {
            Covode.recordClassIndex(57794);
        }

        b(LiveRoomStruct liveRoomStruct, l lVar) {
            this.f91814a = liveRoomStruct;
            this.f91815b = lVar;
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<com.ss.android.ugc.aweme.commercialize.live.a.c> bVar, Throwable th) {
            AwemeRawAd awemeRawAd;
            if (this.f91815b.G) {
                Aweme aweme = this.f91815b.f91730b;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "othershow_fail", awemeRawAd).b("refer", "card").a("fail_reason", "app_tech_problem").b();
            }
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<com.ss.android.ugc.aweme.commercialize.live.a.c> bVar, com.bytedance.retrofit2.u<com.ss.android.ugc.aweme.commercialize.live.a.c> uVar) {
            com.ss.android.ugc.aweme.commercialize.live.a.b bVar2;
            AwemeRawAd awemeRawAd = null;
            if (this.f91815b.f91730b == null || !com.ss.android.ugc.aweme.commercialize.live.service.a.a(this.f91815b.f91730b)) {
                Aweme aweme = this.f91815b.f91730b;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "othershow_fail", awemeRawAd).b("refer", "card").a("fail_reason", "app_tech_problem").b();
            } else if (uVar == null || uVar.f42630b == null || !uVar.f42629a.a() || uVar.f42630b.f74539a == null || (bVar2 = uVar.f42630b.f74539a) == null || bVar2.f74538a == null || uVar.f42630b.a() == null) {
                Aweme aweme2 = this.f91815b.f91730b;
                if (aweme2 != null) {
                    awemeRawAd = aweme2.getAwemeRawAd();
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "othershow_fail", awemeRawAd).b("refer", "card").a("fail_reason", "no_live_product").b();
            } else {
                com.ss.android.ugc.aweme.commercialize.live.a.d a2 = uVar.f42630b.a();
                if (a2 == null) {
                    h.f.b.l.b();
                }
                if (a2.f74542a != 1) {
                    Aweme aweme3 = this.f91815b.f91730b;
                    if (aweme3 != null) {
                        awemeRawAd = aweme3.getAwemeRawAd();
                    }
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "othershow_fail", awemeRawAd).b("refer", "card").a("fail_reason", "sold_out").b();
                    return;
                }
                com.ss.android.ugc.aweme.commercialize.live.a.b bVar3 = uVar.f42630b.f74539a;
                if (bVar3 == null) {
                    h.f.b.l.b();
                }
                CardStruct cardStruct = bVar3.f74538a;
                if (cardStruct == null) {
                    h.f.b.l.b();
                }
                Boolean onlyTrackEventNotShow = cardStruct.getOnlyTrackEventNotShow();
                h.f.b.l.b(onlyTrackEventNotShow, "");
                if (onlyTrackEventNotShow.booleanValue()) {
                    Aweme aweme4 = this.f91815b.f91730b;
                    if (aweme4 != null) {
                        awemeRawAd = aweme4.getAwemeRawAd();
                    }
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "othershow_fail", awemeRawAd).b("refer", "card").a("fail_reason", "only_track").b();
                    return;
                }
                this.f91815b.Q.a(cardStruct);
                Aweme aweme5 = this.f91815b.f91730b;
                if (aweme5 == null) {
                    h.f.b.l.b();
                }
                AwemeRawAd awemeRawAd2 = aweme5.getAwemeRawAd();
                if (awemeRawAd2 == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(awemeRawAd2, "");
                com.ss.android.ugc.aweme.commercialize.live.a.a a3 = com.ss.android.ugc.aweme.commercialize.live.service.a.a(awemeRawAd2, "12");
                a3.f74532b = String.valueOf(this.f91814a.id);
                User user = this.f91814a.owner;
                h.f.b.l.b(user, "");
                a3.f74533c = user.getUid();
                User user2 = this.f91814a.owner;
                h.f.b.l.b(user2, "");
                a3.f74534d = String.valueOf(user2.getFollowStatus());
                com.ss.android.ugc.aweme.commercialize.live.feedLive.a aVar = this.f91815b.Q;
                String b2 = dg.a().b(a3);
                h.f.b.l.b(b2, "");
                String b3 = dg.a().b(uVar.f42630b.f74540b);
                h.f.b.l.b(b3, "");
                aVar.a(b2, b3);
                this.f91815b.Q.a();
                if (cardStruct.getShowSeconds() > 0) {
                    this.f91815b.Q.a(((long) cardStruct.getShowSeconds()) * 1000);
                } else {
                    this.f91815b.Q.a(0);
                }
            }
        }
    }

    private static void a(long j2, String str) {
        h.f.b.l.d(str, "");
        ILiveOuterService s2 = LiveOuterService.s();
        h.f.b.l.b(s2, "");
        s2.d().a(b.a.AUDIENCE_LIVE_PLAY_DURATION, new C2215l(str, j2, j2));
    }

    static void a(TextView textView, int i2) {
        if (i2 == 2) {
            textView.setTextColor(y.b((int) R.color.a0h));
            textView.setBackgroundResource(R.drawable.pv);
        } else if (i2 == 3) {
            textView.setTextColor(y.b((int) R.color.a0m));
            textView.setBackgroundResource(R.drawable.pw);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(View view, String str, Fragment fragment) {
        super(view);
        boolean z2;
        Boolean bool;
        h.f.b.l.d(view, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(fragment, "");
        View findViewById = view.findViewById(R.id.fjk);
        h.f.b.l.b(findViewById, "");
        this.T = findViewById;
        View findViewById2 = view.findViewById(R.id.dnr);
        h.f.b.l.b(findViewById2, "");
        this.q = (RemoteImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.f2a);
        h.f.b.l.b(findViewById3, "");
        this.r = (TuxTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.f2i);
        h.f.b.l.b(findViewById4, "");
        this.s = (TuxTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.ff);
        h.f.b.l.b(findViewById5, "");
        this.t = (RichTagView) findViewById5;
        View findViewById6 = view.findViewById(R.id.b5r);
        h.f.b.l.b(findViewById6, "");
        this.u = (FrameLayout) findViewById6;
        View findViewById7 = view.findViewById(R.id.b4j);
        h.f.b.l.b(findViewById7, "");
        this.U = (ConstraintLayout) findViewById7;
        View findViewById8 = view.findViewById(R.id.bct);
        h.f.b.l.b(findViewById8, "");
        this.V = findViewById8;
        View findViewById9 = view.findViewById(R.id.f29);
        h.f.b.l.b(findViewById9, "");
        this.W = (TextView) findViewById9;
        View findViewById10 = view.findViewById(R.id.cap);
        h.f.b.l.b(findViewById10, "");
        this.X = (LinearLayout) findViewById10;
        View findViewById11 = view.findViewById(R.id.bmd);
        h.f.b.l.b(findViewById11, "");
        this.Y = (RemoteImageView) findViewById11;
        View findViewById12 = view.findViewById(R.id.f2g);
        h.f.b.l.b(findViewById12, "");
        this.Z = (TextView) findViewById12;
        View findViewById13 = view.findViewById(R.id.f2h);
        h.f.b.l.b(findViewById13, "");
        this.aa = (TextView) findViewById13;
        View findViewById14 = view.findViewById(R.id.wb);
        h.f.b.l.b(findViewById14, "");
        this.v = findViewById14;
        View findViewById15 = view.findViewById(R.id.wc);
        h.f.b.l.b(findViewById15, "");
        this.w = findViewById15;
        View findViewById16 = view.findViewById(R.id.aef);
        h.f.b.l.b(findViewById16, "");
        this.x = (TextView) findViewById16;
        View findViewById17 = view.findViewById(R.id.awo);
        h.f.b.l.b(findViewById17, "");
        this.ab = findViewById17;
        View findViewById18 = view.findViewById(R.id.c4g);
        h.f.b.l.b(findViewById18, "");
        this.ac = (LottieAnimationView) findViewById18;
        View findViewById19 = view.findViewById(R.id.c4h);
        h.f.b.l.b(findViewById19, "");
        this.ad = (LottieAnimationView) findViewById19;
        View findViewById20 = view.findViewById(R.id.b4f);
        h.f.b.l.b(findViewById20, "");
        this.ae = (FrameLayout) findViewById20;
        View findViewById21 = view.findViewById(R.id.cja);
        h.f.b.l.b(findViewById21, "");
        this.af = (LongPressLayout) findViewById21;
        View findViewById22 = view.findViewById(R.id.ceu);
        h.f.b.l.b(findViewById22, "");
        this.y = findViewById22;
        View findViewById23 = view.findViewById(R.id.f2b);
        h.f.b.l.b(findViewById23, "");
        this.ag = (TextView) findViewById23;
        View findViewById24 = view.findViewById(R.id.ccz);
        h.f.b.l.b(findViewById24, "");
        this.ah = (SmartAvatarBorderView) findViewById24;
        View findViewById25 = view.findViewById(R.id.cfq);
        h.f.b.l.b(findViewById25, "");
        this.ai = findViewById25;
        View findViewById26 = view.findViewById(R.id.ayd);
        h.f.b.l.b(findViewById26, "");
        this.aj = (ImageView) findViewById26;
        View findViewById27 = view.findViewById(R.id.f27);
        h.f.b.l.b(findViewById27, "");
        this.z = (TextView) findViewById27;
        View findViewById28 = view.findViewById(R.id.f28);
        h.f.b.l.b(findViewById28, "");
        this.A = (TextView) findViewById28;
        View findViewById29 = view.findViewById(R.id.cao);
        h.f.b.l.b(findViewById29, "");
        this.B = (LinearLayout) findViewById29;
        View findViewById30 = view.findViewById(R.id.ccy);
        h.f.b.l.b(findViewById30, "");
        this.ak = (TextView) findViewById30;
        this.al = view.findViewById(R.id.ffm);
        View findViewById31 = view.findViewById(R.id.b5o);
        h.f.b.l.b(findViewById31, "");
        this.am = (FrameLayout) findViewById31;
        View findViewById32 = view.findViewById(R.id.ckw);
        h.f.b.l.b(findViewById32, "");
        this.C = (ViewGroup) findViewById32;
        View findViewById33 = view.findViewById(R.id.flv);
        h.f.b.l.b(findViewById33, "");
        this.an = (WarningInfoView) findViewById33;
        View findViewById34 = view.findViewById(R.id.cku);
        h.f.b.l.b(findViewById34, "");
        this.ao = (LiveTextView) findViewById34;
        View findViewById35 = view.findViewById(R.id.cks);
        h.f.b.l.b(findViewById35, "");
        this.ap = (LiveTextView) findViewById35;
        View findViewById36 = view.findViewById(R.id.ckv);
        h.f.b.l.b(findViewById36, "");
        this.aq = (LiveTextView) findViewById36;
        View findViewById37 = view.findViewById(R.id.ckr);
        h.f.b.l.b(findViewById37, "");
        this.ar = (LiveTextView) findViewById37;
        View findViewById38 = view.findViewById(R.id.dlk);
        h.f.b.l.b(findViewById38, "");
        this.as = (FrameLayout) findViewById38;
        View findViewById39 = view.findViewById(R.id.cbv);
        h.f.b.l.b(findViewById39, "");
        FrameLayout frameLayout = (FrameLayout) findViewById39;
        this.D = frameLayout;
        this.at = str;
        this.av = new com.ss.android.ugc.aweme.live.b.b(view);
        ILiveOuterService s2 = LiveOuterService.s();
        h.f.b.l.b(s2, "");
        com.ss.android.ugc.aweme.live.c d2 = s2.d();
        if (d2 == null || (bool = (Boolean) d2.a("live_new_close_card_type", (Object) false)) == null) {
            z2 = false;
        } else {
            z2 = bool.booleanValue();
        }
        this.H = z2;
        this.J = new LinkedList<>();
        this.aB = com.bytedance.android.livesdkapi.m.d.a(new m(this));
        this.aC = -1;
        this.N = new k();
        DataCenter dataCenter = (DataCenter) ae.a(fragment, (ad.b) null).a(DataCenter.class);
        dataCenter.f24297a = fragment;
        h.f.b.l.b(dataCenter, "");
        this.aD = dataCenter;
        this.P = new Handler(Looper.getMainLooper(), this);
        this.Q = CommercializeLiveServiceImpl.a().a(frameLayout);
        com.ss.android.ugc.aweme.live.e.c a2 = LiveOuterService.s().a(new j(this), new k(this));
        h.f.b.l.b(a2, "");
        this.R = a2;
        TextView textView = (TextView) view.findViewById(R.id.fbl);
        this.aG = textView;
        this.S = new be((TuxTextView) view.findViewById(R.id.e0q), view.findViewById(R.id.cdr), (TuxIconView) view.findViewById(R.id.e0z), (TuxIconView) view.findViewById(R.id.awu), textView);
        findViewById8.getLayoutParams().height = (com.bytedance.common.utility.n.b(this.f91729a) * 3) / 4;
        this.au = com.bytedance.ies.abmock.b.a().a(true, "follow_live_interaction_style", 0);
        findViewById22.setVisibility(0);
        this.aD.a("ad_live_card_hide", (androidx.lifecycle.u<com.bytedance.android.widget.b>) this);
        this.aD.a("ad_live_card_show", (androidx.lifecycle.u<com.bytedance.android.widget.b>) this);
    }
}
