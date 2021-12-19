package com.bytedance.android.live.liveinteract.multiguest.g.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Message;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.multiguest.a.b.b;
import com.bytedance.android.live.liveinteract.platform.common.view.WaveEffectView;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.c.q;
import com.bytedance.android.livesdk.chatroom.c.r;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.livesetting.linkmic.GuestCountDownTimeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.GuestPushStreamTimeAndroidSetting;
import com.bytedance.android.livesdk.utils.aa;
import com.bytedance.android.livesdk.utils.z;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;

public class a extends FrameLayout implements b.AbstractC0207b, com.bytedance.android.live.liveinteract.multilive.api.a, WeakHandler.IHandler {

    /* renamed from: l  reason: collision with root package name */
    public static final b f11234l = new b((byte) 0);
    private int A;
    private long B;
    private final boolean C;
    private boolean D;
    private int E;
    private boolean F;
    private f.a.b.a G;
    private boolean H;
    private int I;
    private boolean J;
    private boolean K;
    private final String L;
    private AbstractC0218a M;
    private HashMap N;

    /* renamed from: a  reason: collision with root package name */
    public HSImageView f11235a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f11236b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f11237c;

    /* renamed from: d  reason: collision with root package name */
    public WaveEffectView f11238d;

    /* renamed from: e  reason: collision with root package name */
    public LiveLoadingView f11239e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f11240f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f11241g;

    /* renamed from: h  reason: collision with root package name */
    public int f11242h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f11243i;

    /* renamed from: j  reason: collision with root package name */
    final b.a f11244j;

    /* renamed from: k  reason: collision with root package name */
    final DataChannel f11245k;

    /* renamed from: m  reason: collision with root package name */
    private TextView f11246m;
    private HSImageView n;
    private View o;
    private View p;
    private View q;
    private TextView r;
    private View s;
    private ProgressBar t;
    private View u;
    private SurfaceView v;
    private final WeakHandler w = new WeakHandler(this);
    private Animator x;
    private final int y;
    private final double z;

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.b.a$a  reason: collision with other inner class name */
    public interface AbstractC0218a {
        static {
            Covode.recordClassIndex(6041);
        }

        void a(a aVar);
    }

    static {
        Covode.recordClassIndex(6040);
    }

    public View b(int i2) {
        if (this.N == null) {
            this.N = new HashMap();
        }
        View view = (View) this.N.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.N.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public int getWindowLayoutId() {
        return R.layout.bf0;
    }

    public static final class b {
        static {
            Covode.recordClassIndex(6042);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.api.a
    public final boolean d() {
        return this.F;
    }

    public final boolean getAdjustParent() {
        return this.F;
    }

    public final boolean getHasInit() {
        return this.J;
    }

    public final String getInteractId() {
        return this.L;
    }

    /* access modifiers changed from: protected */
    public final boolean getMCurrentUserIsLinkedGuest() {
        return this.D;
    }

    public final DataChannel getMDataChannel() {
        return this.f11245k;
    }

    public final b.a getMPresenter() {
        return this.f11244j;
    }

    public final boolean getMultiLiveEnable() {
        return this.K;
    }

    public final int getPosInMultiLive() {
        return this.I;
    }

    public final b.a getPresenter() {
        return this.f11244j;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.b.AbstractC0207b
    public void a(User user) {
        ImageModel avatarThumb = user != null ? user.getAvatarThumb() : null;
        ImageView imageView = this.f11236b;
        if (imageView == null) {
            l.a("mPrepareAvatar");
        }
        ImageView imageView2 = this.f11236b;
        if (imageView2 == null) {
            l.a("mPrepareAvatar");
        }
        int width = imageView2.getWidth();
        ImageView imageView3 = this.f11236b;
        if (imageView3 == null) {
            l.a("mPrepareAvatar");
        }
        com.bytedance.android.livesdk.chatroom.g.g.a(imageView, avatarThumb, width, imageView3.getHeight(), 2131234424);
        z zVar = new z(5, 0.0f);
        if (avatarThumb == null || avatarThumb.getUrls() == null || avatarThumb.getUrls().size() == 0) {
            com.facebook.imagepipeline.o.c a2 = com.facebook.imagepipeline.o.c.a(com.facebook.common.k.g.a(2131234424));
            a2.f48454k = zVar;
            com.facebook.drawee.a.a.e b2 = com.facebook.drawee.a.a.c.b();
            b2.f47315c = (REQUEST) a2.a();
            HSImageView hSImageView = this.f11235a;
            if (hSImageView == null) {
                l.a("mAvatarBackground");
            }
            b2.f47325m = hSImageView.getController();
            com.facebook.drawee.c.a c2 = b2.e();
            HSImageView hSImageView2 = this.f11235a;
            if (hSImageView2 == null) {
                l.a("mAvatarBackground");
            }
            hSImageView2.setController(c2);
        } else {
            HSImageView hSImageView3 = this.f11235a;
            if (hSImageView3 == null) {
                l.a("mAvatarBackground");
            }
            k.a(hSImageView3, avatarThumb, zVar);
        }
        TextView textView = this.f11240f;
        if (textView == null) {
            l.a("mOnlineName");
        }
        textView.setText(com.bytedance.android.livesdk.ac.g.a(user));
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.b.AbstractC0207b
    public void a(boolean z2) {
        if (!z2 || this.D) {
            View view = this.p;
            if (view == null) {
                l.a("mOnlineCameraSwitch");
            }
            view.setVisibility(8);
            View view2 = this.q;
            if (view2 == null) {
                l.a("mOnlineClose");
            }
            view2.setVisibility(8);
            return;
        }
        View view3 = this.p;
        if (view3 == null) {
            l.a("mOnlineCameraSwitch");
        }
        view3.setVisibility(this.f11244j.e() ? 4 : 0);
        View view4 = this.q;
        if (view4 == null) {
            l.a("mOnlineClose");
        }
        view4.setVisibility(0);
    }

    public final void c() {
        if (this.H) {
            a(3);
        }
    }

    public final HSImageView getMAvatarBackground() {
        HSImageView hSImageView = this.f11235a;
        if (hSImageView == null) {
            l.a("mAvatarBackground");
        }
        return hSImageView;
    }

    public final LiveLoadingView getMLoadingView() {
        LiveLoadingView liveLoadingView = this.f11239e;
        if (liveLoadingView == null) {
            l.a("mLoadingView");
        }
        return liveLoadingView;
    }

    public final TextView getMOnlineName() {
        TextView textView = this.f11240f;
        if (textView == null) {
            l.a("mOnlineName");
        }
        return textView;
    }

    public final ImageView getMPrepareAvatar() {
        ImageView imageView = this.f11236b;
        if (imageView == null) {
            l.a("mPrepareAvatar");
        }
        return imageView;
    }

    public final TextView getMPrepareHint() {
        TextView textView = this.f11237c;
        if (textView == null) {
            l.a("mPrepareHint");
        }
        return textView;
    }

    public final WaveEffectView getMWaveEffectView() {
        WaveEffectView waveEffectView = this.f11238d;
        if (waveEffectView == null) {
            l.a("mWaveEffectView");
        }
        return waveEffectView;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        Animator animator;
        if (this.F) {
            super.onDetachedFromWindow();
            return;
        }
        this.H = false;
        Animator animator2 = this.x;
        if (!(animator2 == null || !animator2.isRunning() || (animator = this.x) == null)) {
            animator.cancel();
        }
        this.w.removeCallbacksAndMessages(null);
        this.J = false;
        this.f11244j.g();
        this.G.a();
        this.M = null;
        super.onDetachedFromWindow();
    }

    public final void b() {
        SurfaceView surfaceView = this.v;
        if (surfaceView != null && (surfaceView instanceof com.bytedance.android.live.broadcast.api.e.a)) {
            Objects.requireNonNull(surfaceView, "null cannot be cast to non-null type com.bytedance.android.live.broadcast.api.widget.IInteractVideoView");
            ((com.bytedance.android.live.broadcast.api.e.a) surfaceView).a(PrivacyCert.Builder.Companion.with("bpea-378").usage("").tag("guest link reverse camera").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        int i2;
        MethodCollector.i(7889);
        super.onAttachedToWindow();
        if (!this.F || !this.J) {
            FrameLayout.inflate(getContext(), getWindowLayoutId(), this);
            setOnClickListener(new h(this));
            a();
            this.H = true;
            this.f11244j.a(this);
            if (this.f11243i) {
                i2 = 0;
            } else {
                i2 = 2;
            }
            a(i2);
            if (com.bytedance.android.live.uikit.c.a.a(getContext())) {
                int i3 = Build.VERSION.SDK_INT;
                TextView textView = this.f11240f;
                if (textView == null) {
                    l.a("mOnlineName");
                }
                textView.setLayoutDirection(1);
                TextView textView2 = this.f11240f;
                if (textView2 == null) {
                    l.a("mOnlineName");
                }
                textView2.setTextDirection(4);
            }
            this.G.a(com.bytedance.android.livesdk.an.a.a().a(r.class).d(new i(this)));
            MethodCollector.o(7889);
            return;
        }
        MethodCollector.o(7889);
    }

    public void a() {
        View findViewById = findViewById(R.id.d8d);
        l.b(findViewById, "");
        this.f11235a = (HSImageView) findViewById;
        View findViewById2 = findViewById(R.id.d8c);
        l.b(findViewById2, "");
        this.f11236b = (ImageView) findViewById2;
        View findViewById3 = findViewById(R.id.d8f);
        l.b(findViewById3, "");
        this.f11246m = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.d8g);
        l.b(findViewById4, "");
        this.n = (HSImageView) findViewById4;
        View findViewById5 = findViewById(R.id.d8i);
        l.b(findViewById5, "");
        this.f11237c = (TextView) findViewById5;
        View findViewById6 = findViewById(R.id.d8e);
        l.b(findViewById6, "");
        this.o = findViewById6;
        View findViewById7 = findViewById(R.id.d8h);
        l.b(findViewById7, "");
        this.f11238d = (WaveEffectView) findViewById7;
        View findViewById8 = findViewById(R.id.ci9);
        l.b(findViewById8, "");
        this.f11239e = (LiveLoadingView) findViewById8;
        View findViewById9 = findViewById(R.id.cz9);
        l.b(findViewById9, "");
        this.p = findViewById9;
        if (findViewById9 == null) {
            l.a("mOnlineCameraSwitch");
        }
        findViewById9.setOnClickListener(new f(this));
        View findViewById10 = findViewById(R.id.cyx);
        l.b(findViewById10, "");
        this.q = findViewById10;
        if (findViewById10 == null) {
            l.a("mOnlineClose");
        }
        findViewById10.setOnClickListener(new g(this));
        View findViewById11 = findViewById(R.id.cz2);
        l.b(findViewById11, "");
        this.f11240f = (TextView) findViewById11;
        View findViewById12 = findViewById(R.id.cz_);
        l.b(findViewById12, "");
        this.r = (TextView) findViewById12;
        View findViewById13 = findViewById(R.id.cza);
        l.b(findViewById13, "");
        this.s = findViewById13;
        View findViewById14 = findViewById(R.id.cz7);
        l.b(findViewById14, "");
        this.t = (ProgressBar) findViewById14;
        View findViewById15 = findViewById(R.id.cyz);
        l.b(findViewById15, "");
        this.f11241g = (TextView) findViewById15;
        View findViewById16 = findViewById(R.id.cyy);
        l.b(findViewById16, "");
        this.u = findViewById16;
        this.J = true;
    }

    public final void setAdjustParent(boolean z2) {
        this.F = z2;
    }

    public final void setCurrentUserIsLinkedGuest(boolean z2) {
        this.D = z2;
    }

    public final void setHasInit(boolean z2) {
        this.J = z2;
    }

    /* access modifiers changed from: protected */
    public final void setMCurrentUserIsLinkedGuest(boolean z2) {
        this.D = z2;
    }

    public final void setMultiLiveEnable(boolean z2) {
        this.K = z2;
    }

    public final void setPosInMultiLive(int i2) {
        this.I = i2;
    }

    public static final class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f11247a;

        static {
            Covode.recordClassIndex(6043);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(a aVar) {
            this.f11247a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            l.d(animator, "");
            if (this.f11247a.getMPresenter().d()) {
                this.f11247a.a(3);
            }
        }

        public final void onAnimationRepeat(Animator animator) {
            l.d(animator, "");
            a aVar = this.f11247a;
            aVar.f11242h--;
            a.a(this.f11247a).setText(String.valueOf(this.f11247a.f11242h));
        }

        public final void onAnimationStart(Animator animator) {
            l.d(animator, "");
            a.a(this.f11247a).setText(String.valueOf(this.f11247a.f11242h));
            a.a(this.f11247a).setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f11250a;

        static {
            Covode.recordClassIndex(6046);
        }

        f(a aVar) {
            this.f11250a = aVar;
        }

        public final void onClick(View view) {
            this.f11250a.b();
        }
    }

    public final void setMAvatarBackground(HSImageView hSImageView) {
        l.d(hSImageView, "");
        this.f11235a = hSImageView;
    }

    public final void setMLoadingView(LiveLoadingView liveLoadingView) {
        l.d(liveLoadingView, "");
        this.f11239e = liveLoadingView;
    }

    public final void setMOnlineName(TextView textView) {
        l.d(textView, "");
        this.f11240f = textView;
    }

    public final void setMPrepareAvatar(ImageView imageView) {
        l.d(imageView, "");
        this.f11236b = imageView;
    }

    public final void setMPrepareHint(TextView textView) {
        l.d(textView, "");
        this.f11237c = textView;
    }

    public final void setMWaveEffectView(WaveEffectView waveEffectView) {
        l.d(waveEffectView, "");
        this.f11238d = waveEffectView;
    }

    public static final /* synthetic */ TextView a(a aVar) {
        TextView textView = aVar.f11241g;
        if (textView == null) {
            l.a("mOnlineCountDown");
        }
        return textView;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.b.AbstractC0207b
    public void setVisibility(boolean z2) {
        int i2;
        if (z2) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        setVisibility(i2);
    }

    static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f11253a;

        static {
            Covode.recordClassIndex(6049);
        }

        i(a aVar) {
            this.f11253a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            r rVar = (r) obj;
            l.b(rVar, "");
            if (rVar.f15142a == 2) {
                this.f11253a.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f11251a;

        static {
            Covode.recordClassIndex(6047);
        }

        g(a aVar) {
            this.f11251a = aVar;
        }

        public final void onClick(View view) {
            a aVar = this.f11251a;
            b.a aVar2 = new b.a(aVar.getContext());
            String str = LinkApi.d.WINDOW.value;
            l.b(str, "");
            com.bytedance.android.live.liveinteract.platform.common.g.i.a(str);
            aVar2.a(R.string.e08).b(R.string.ei2).a(R.string.e07, (DialogInterface.OnClickListener) new d(aVar), false).b(R.string.gle, (DialogInterface.OnClickListener) e.f11249a, false).a().show();
            com.bytedance.android.live.liveinteract.platform.common.g.i.h();
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f11252a;

        static {
            Covode.recordClassIndex(6048);
        }

        h(a aVar) {
            this.f11252a = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00ac  */
        /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r13) {
            /*
            // Method dump skipped, instructions count: 208
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguest.g.b.a.h.onClick(android.view.View):void");
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        long j2;
        l.d(message, "");
        int i2 = message.what;
        if (i2 == 0) {
            int i3 = this.A - 1;
            this.A = i3;
            if (i3 <= 0) {
                DataChannel dataChannel = this.f11245k;
                if (dataChannel != null) {
                    dataChannel.b(com.bytedance.android.live.liveinteract.platform.common.c.e.class, this.L);
                }
                if (this.v == null) {
                    a(1);
                } else {
                    a(2);
                }
            } else {
                TextView textView = this.f11246m;
                if (textView == null) {
                    l.a("mPrepareCountDown");
                }
                textView.setText(String.valueOf(this.A));
                this.w.sendEmptyMessageDelayed(0, 1000);
            }
        } else if (i2 != 1) {
            if (i2 == 2) {
                TextView textView2 = this.f11241g;
                if (textView2 == null) {
                    l.a("mOnlineCountDown");
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, "scaleX", 1.0f, 2.0f, 1.0f);
                l.b(ofFloat, "");
                ofFloat.setRepeatCount(5);
                ofFloat.setDuration(1000L);
                ofFloat.addListener(new c(this));
                TextView textView3 = this.f11241g;
                if (textView3 == null) {
                    l.a("mOnlineCountDown");
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView3, "scaleY", 1.0f, 2.0f, 1.0f);
                l.b(ofFloat2, "");
                ofFloat2.setRepeatCount(5);
                ofFloat2.setDuration(1000L);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, ofFloat2);
                animatorSet.start();
            } else if (i2 == 3 && this.C) {
                long j3 = this.B;
                if (j3 <= 0) {
                    DataChannel dataChannel2 = this.f11245k;
                    if (dataChannel2 != null) {
                        dataChannel2.b(com.bytedance.android.live.liveinteract.platform.common.c.f.class, this.L);
                        return;
                    }
                    return;
                }
                if (j3 < 1000) {
                    j2 = j3;
                } else {
                    j2 = 1000;
                }
                this.B = j3 - 1000;
                this.w.sendEmptyMessageDelayed(3, j2);
            }
        } else if (this.f11244j.d()) {
            DataChannel dataChannel3 = this.f11245k;
            if (dataChannel3 != null) {
                dataChannel3.c(com.bytedance.android.live.liveinteract.api.l.class, new q(5));
            }
        } else {
            AbstractC0218a aVar = this.M;
            if (aVar != null) {
                aVar.a(this);
            }
        }
    }

    public void a(int i2) {
        this.E = i2;
        if (i2 == 0) {
            View view = this.o;
            if (view == null) {
                l.a("mPrepareContainer");
            }
            view.setVisibility(0);
            View view2 = this.u;
            if (view2 == null) {
                l.a("mOnlineContainer");
            }
            view2.setVisibility(8);
            TextView textView = this.f11246m;
            if (textView == null) {
                l.a("mPrepareCountDown");
            }
            textView.setVisibility(0);
            HSImageView hSImageView = this.n;
            if (hSImageView == null) {
                l.a("mCountDownBackGround");
            }
            hSImageView.setVisibility(0);
            TextView textView2 = this.f11237c;
            if (textView2 == null) {
                l.a("mPrepareHint");
            }
            textView2.setText(R.string.dz6);
            TextView textView3 = this.f11246m;
            if (textView3 == null) {
                l.a("mPrepareCountDown");
            }
            textView3.setText(String.valueOf(this.A));
            WaveEffectView waveEffectView = this.f11238d;
            if (waveEffectView == null) {
                l.a("mWaveEffectView");
            }
            waveEffectView.setVisibility(8);
            LiveLoadingView liveLoadingView = this.f11239e;
            if (liveLoadingView == null) {
                l.a("mLoadingView");
            }
            liveLoadingView.setVisibility(8);
            this.w.sendEmptyMessageDelayed(0, 1000);
            if (this.C) {
                this.w.sendEmptyMessage(3);
            }
        } else if (i2 == 1) {
            View view3 = this.o;
            if (view3 == null) {
                l.a("mPrepareContainer");
            }
            view3.setVisibility(0);
            View view4 = this.u;
            if (view4 == null) {
                l.a("mOnlineContainer");
            }
            view4.setVisibility(8);
            TextView textView4 = this.f11246m;
            if (textView4 == null) {
                l.a("mPrepareCountDown");
            }
            textView4.setVisibility(8);
            HSImageView hSImageView2 = this.n;
            if (hSImageView2 == null) {
                l.a("mCountDownBackGround");
            }
            hSImageView2.setVisibility(8);
            TextView textView5 = this.f11237c;
            if (textView5 == null) {
                l.a("mPrepareHint");
            }
            textView5.setText(R.string.dz6);
            WaveEffectView waveEffectView2 = this.f11238d;
            if (waveEffectView2 == null) {
                l.a("mWaveEffectView");
            }
            waveEffectView2.setVisibility(0);
            WaveEffectView waveEffectView3 = this.f11238d;
            if (waveEffectView3 == null) {
                l.a("mWaveEffectView");
            }
            waveEffectView3.a();
            LiveLoadingView liveLoadingView2 = this.f11239e;
            if (liveLoadingView2 == null) {
                l.a("mLoadingView");
            }
            liveLoadingView2.setVisibility(0);
            this.w.sendEmptyMessageDelayed(0, 1000);
        } else if (i2 == 2) {
            View view5 = this.o;
            if (view5 == null) {
                l.a("mPrepareContainer");
            }
            view5.setVisibility(8);
            View view6 = this.u;
            if (view6 == null) {
                l.a("mOnlineContainer");
            }
            view6.setVisibility(0);
        } else if (i2 == 3) {
            View view7 = this.o;
            if (view7 == null) {
                l.a("mPrepareContainer");
            }
            view7.setVisibility(0);
            View view8 = this.u;
            if (view8 == null) {
                l.a("mOnlineContainer");
            }
            view8.setVisibility(8);
            TextView textView6 = this.f11246m;
            if (textView6 == null) {
                l.a("mPrepareCountDown");
            }
            textView6.setVisibility(8);
            HSImageView hSImageView3 = this.n;
            if (hSImageView3 == null) {
                l.a("mCountDownBackGround");
            }
            hSImageView3.setVisibility(8);
            TextView textView7 = this.f11237c;
            if (textView7 == null) {
                l.a("mPrepareHint");
            }
            textView7.setText(R.string.e0a);
            if (this.K) {
                this.w.sendEmptyMessage(1);
            } else {
                this.w.sendEmptyMessageDelayed(1, 1500);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.b.AbstractC0207b
    public final void a(long j2) {
        String valueOf = String.valueOf(j2);
        TextView textView = this.r;
        if (textView == null) {
            l.a("mOnlineTicket");
        }
        if (!l.a((Object) valueOf, (Object) textView.getText().toString())) {
            TextView textView2 = this.r;
            if (textView2 == null) {
                l.a("mOnlineTicket");
            }
            String a2 = aa.a(j2);
            l.b(a2, "");
            Locale locale = Locale.ROOT;
            l.b(locale, "");
            Objects.requireNonNull(a2, "null cannot be cast to non-null type java.lang.String");
            String upperCase = a2.toUpperCase(locale);
            l.b(upperCase, "");
            textView2.setText(upperCase);
        }
    }

    public final void a(SurfaceView surfaceView) {
        ViewParent viewParent;
        MethodCollector.i(8085);
        if (surfaceView == null) {
            MethodCollector.o(8085);
            return;
        }
        removeView(this.v);
        this.v = surfaceView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        SurfaceView surfaceView2 = this.v;
        if (surfaceView2 != null) {
            surfaceView2.setLayoutParams(layoutParams);
        }
        SurfaceView surfaceView3 = this.v;
        if (surfaceView3 != null) {
            viewParent = surfaceView3.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof ViewGroup) {
            if (viewParent == this) {
                MethodCollector.o(8085);
                return;
            }
            ((ViewGroup) viewParent).removeView(this.v);
        }
        addView(this.v, 0);
        if (this.E == 1) {
            a(2);
        }
        MethodCollector.o(8085);
    }

    static final class e implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final e f11249a = new e();

        static {
            Covode.recordClassIndex(6045);
        }

        e() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            com.bytedance.android.live.liveinteract.platform.common.g.i.b(0);
            dialogInterface.dismiss();
        }
    }

    static final class d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f11248a;

        static {
            Covode.recordClassIndex(6044);
        }

        d(a aVar) {
            this.f11248a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            com.bytedance.android.live.liveinteract.platform.common.g.i.b(1);
            this.f11248a.a(3);
            dialogInterface.dismiss();
            com.bytedance.android.live.liveinteract.platform.common.g.g.a("guest_over", null);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.b.AbstractC0207b
    public final void a(int i2, boolean z2) {
        if (!this.D && this.f11243i) {
            Animator animator = this.x;
            if (animator == null || !animator.isRunning()) {
                ProgressBar progressBar = this.t;
                if (progressBar == null) {
                    l.a("mOnlineProgress");
                }
                ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar, "progress", 100, 0);
                this.x = ofInt;
                if (ofInt == null) {
                    l.b();
                }
                ofInt.setDuration(((long) i2) * 1000);
                Animator animator2 = this.x;
                if (animator2 == null) {
                    l.b();
                }
                animator2.setInterpolator(new LinearInterpolator());
                ProgressBar progressBar2 = this.t;
                if (progressBar2 == null) {
                    l.a("mOnlineProgress");
                }
                progressBar2.setVisibility(0);
                Animator animator3 = this.x;
                if (animator3 == null) {
                    l.b();
                }
                animator3.start();
                if (z2) {
                    this.w.sendEmptyMessageDelayed(2, ((long) (i2 - 5)) * 1000);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, String str, b.a aVar, AbstractC0218a aVar2, DataChannel dataChannel) {
        super(context);
        long j2;
        boolean z2;
        l.d(context, "");
        l.d(str, "");
        l.d(aVar, "");
        MethodCollector.i(8094);
        this.L = str;
        this.f11244j = aVar;
        this.M = aVar2;
        this.f11245k = dataChannel;
        int value = GuestCountDownTimeSetting.INSTANCE.getValue();
        this.y = value;
        double value2 = GuestPushStreamTimeAndroidSetting.INSTANCE.getValue();
        this.z = value2;
        value = value <= 0 ? 5 : value;
        this.A = value;
        this.f11242h = 5;
        if (value2 > 0.01d) {
            j2 = (long) (value2 * 1000.0d);
        } else {
            j2 = 0;
        }
        this.B = j2;
        if (j2 <= 0 || j2 >= ((long) (value * 1000))) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.C = z2;
        this.G = new f.a.b.a();
        this.I = -1;
        MethodCollector.o(8094);
    }
}
