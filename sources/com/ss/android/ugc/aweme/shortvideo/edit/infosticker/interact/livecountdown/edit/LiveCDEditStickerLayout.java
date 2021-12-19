package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.df.n;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bl;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.LiveCDEditText;
import com.ss.android.ugc.tools.view.widget.AVTextView;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.f.b.l;
import h.m.p;
import h.z;
import java.lang.reflect.Field;
import java.util.Objects;

public final class LiveCDEditStickerLayout extends FrameLayout implements View.OnClickListener, e, com.ss.android.ugc.tools.view.a.a {
    public static final a A = new a((byte) 0);
    public static int w;
    static int x = 1;
    static int y = 2;
    static int z = 200;
    private RelativeLayout B;
    private m<? super LiveCDEditStickerView, ? super Boolean, z> C;
    private h.f.a.b<? super LiveCDEditStickerView, z> D;
    private boolean E;
    private int F;
    private com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.a G;
    private int H;

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f127406a;

    /* renamed from: b  reason: collision with root package name */
    public AVTextView f127407b;

    /* renamed from: c  reason: collision with root package name */
    public AVTextView f127408c;

    /* renamed from: d  reason: collision with root package name */
    public AVTextView f127409d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f127410e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f127411f;

    /* renamed from: g  reason: collision with root package name */
    public final h.f.a.a<z> f127412g;

    /* renamed from: h  reason: collision with root package name */
    a f127413h;

    /* renamed from: i  reason: collision with root package name */
    public a f127414i;

    /* renamed from: j  reason: collision with root package name */
    volatile int f127415j;

    /* renamed from: k  reason: collision with root package name */
    int f127416k;

    /* renamed from: l  reason: collision with root package name */
    boolean f127417l;

    /* renamed from: m  reason: collision with root package name */
    boolean f127418m;
    PointF n;
    LiveCDEditStickerView o;
    public int p;
    public boolean q;
    public Animator r;
    public final com.ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd.a s;
    public VideoPublishEditModel t;
    public com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.d u;
    public boolean v;

    public final /* synthetic */ class k implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.a f127431a;

        static {
            Covode.recordClassIndex(83556);
        }

        public k(h.f.a.a aVar) {
            this.f127431a = aVar;
        }

        public final /* synthetic */ void onGlobalLayout() {
            l.b(this.f127431a.invoke(), "");
        }
    }

    public LiveCDEditStickerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(83543);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerView, h.z>, h.f.a.b<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerView, h.z> */
    public final h.f.a.b<LiveCDEditStickerView, z> getBeforeChangeListener() {
        return this.D;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.e
    public final int getHintState() {
        return this.H;
    }

    public final int getHintTextState() {
        return this.H;
    }

    public final com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.a getLiveCDStickerController() {
        return this.G;
    }

    public final LiveCDEditStickerView getMChild() {
        return this.o;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.m<? super com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerView, ? super java.lang.Boolean, h.z>, h.f.a.m<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerView, java.lang.Boolean, h.z> */
    public final m<LiveCDEditStickerView, Boolean, z> getOnCompleteListener() {
        return this.C;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.e
    public final boolean a(MotionEvent motionEvent) {
        AVTextView aVTextView;
        l.d(motionEvent, "");
        LiveCDEditStickerView liveCDEditStickerView = this.o;
        if ((liveCDEditStickerView == null || !liveCDEditStickerView.f127438e) && (aVTextView = this.f127409d) != null && g.a(aVTextView, (int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            AVTextView aVTextView2 = this.f127409d;
            if (aVTextView2 == null) {
                return true;
            }
            aVTextView2.performClick();
            return true;
        }
        AVTextView aVTextView3 = this.f127408c;
        if (aVTextView3 == null || !g.a(aVTextView3, (int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            RelativeLayout relativeLayout = this.B;
            if (relativeLayout == null) {
                l.a("container");
            }
            if (!g.a(relativeLayout, (int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                return false;
            }
            AVTextView aVTextView4 = this.f127408c;
            if (aVTextView4 == null) {
                return true;
            }
            aVTextView4.performClick();
            return true;
        }
        AVTextView aVTextView5 = this.f127408c;
        if (aVTextView5 == null) {
            return true;
        }
        aVTextView5.performClick();
        return true;
    }

    public static final class e implements c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LiveCDEditStickerLayout f127423b;

        static {
            Covode.recordClassIndex(83547);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.c
        public final void a() {
            this.f127423b.a(1);
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f127424a;

            static {
                Covode.recordClassIndex(83548);
            }

            a(e eVar) {
                this.f127424a = eVar;
            }

            public final void run() {
                LiveCDEditStickerLayout liveCDEditStickerLayout = this.f127424a.f127423b;
                LiveCDEditStickerView mChild = this.f127424a.f127423b.getMChild();
                if (mChild == null) {
                    l.b();
                }
                liveCDEditStickerLayout.a(mChild);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.c
        public final void b() {
            LiveCDEditStickerView mChild = this.f127423b.getMChild();
            if (mChild != null) {
                mChild.post(new a(this));
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(LiveCDEditStickerLayout liveCDEditStickerLayout) {
            this.f127423b = liveCDEditStickerLayout;
        }
    }

    private final void c() {
        Context context = getContext();
        if (context instanceof com.ss.android.ugc.tools.view.a.c) {
            ((com.ss.android.ugc.tools.view.a.c) context).b(this);
        }
    }

    static {
        Covode.recordClassIndex(83542);
    }

    private final void d() {
        this.f127410e = true;
        LiveCDEditStickerView liveCDEditStickerView = this.o;
        if (liveCDEditStickerView != null) {
            this.r = a(liveCDEditStickerView, new b(this));
            a();
        }
    }

    private final void e() {
        LiveCDEditStickerView liveCDEditStickerView = this.o;
        if (liveCDEditStickerView != null) {
            liveCDEditStickerView.setScaleX(1.0f);
            liveCDEditStickerView.setScaleY(1.0f);
            liveCDEditStickerView.setRotation(0.0f);
            liveCDEditStickerView.setTranslationX(0.0f);
            liveCDEditStickerView.setTranslationY(0.0f);
            this.E = false;
            this.f127416k = 0;
            this.f127414i = new a((byte) 0);
        }
    }

    public final void a() {
        InputMethodManager inputMethodManager = (InputMethodManager) a(getContext(), "input_method");
        Context context = getContext();
        l.b(context, "");
        Activity a2 = com.ss.android.ugc.aweme.scene.a.a(context);
        if (a2 != null && inputMethodManager != null) {
            Window window = a2.getWindow();
            l.b(window, "");
            View decorView = window.getDecorView();
            l.b(decorView, "");
            inputMethodManager.hideSoftInputFromWindow(decorView.getWindowToken(), 0);
        }
    }

    public final boolean b() {
        String str;
        String titleText;
        long currentTimeMillis;
        int i2;
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.a liveCDStickerController;
        LiveCDEditStickerView mChild;
        LiveCDEditStickerView liveCDEditStickerView;
        LiveCDEditStickerView liveCDEditStickerView2 = this.o;
        String str2 = null;
        if (liveCDEditStickerView2 != null) {
            str = liveCDEditStickerView2.getTitleText();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str) || (liveCDEditStickerView = this.o) == null || liveCDEditStickerView.e()) {
            LiveCDEditStickerView liveCDEditStickerView3 = this.o;
            if (liveCDEditStickerView3 == null || (titleText = liveCDEditStickerView3.getTitleText()) == null || p.a((CharSequence) titleText)) {
                a(4);
                return false;
            }
            LiveCDEditStickerView liveCDEditStickerView4 = this.o;
            if (liveCDEditStickerView4 != null && !liveCDEditStickerView4.e()) {
                a(3);
                return false;
            } else if (this.f127411f) {
                return false;
            } else {
                this.s.b();
                this.p = w;
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.d dVar = this.u;
                if (dVar != null) {
                    LiveCDEditStickerLayout liveCDEditStickerLayout = dVar.f127370b;
                    if (liveCDEditStickerLayout == null || (mChild = liveCDEditStickerLayout.getMChild()) == null) {
                        currentTimeMillis = System.currentTimeMillis();
                    } else {
                        currentTimeMillis = mChild.getSelectTimeMiles();
                    }
                    long currentTimeMillis2 = (currentTimeMillis - System.currentTimeMillis()) / 1000;
                    if (currentTimeMillis2 < 0) {
                        currentTimeMillis2 = -1;
                    }
                    com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("enter_from", "video_edit_page").a("enter_method", "click_main_panel").a("shoot_way", dVar.f127369a.mShootWay).a("creation_id", dVar.f127369a.creationId).a("content_source", bl.b(dVar.f127369a)).a("content_type", bl.a(dVar.f127369a)).a("edit_type", "title");
                    LiveCDEditStickerLayout liveCDEditStickerLayout2 = dVar.f127370b;
                    if (!(liveCDEditStickerLayout2 == null || (liveCDStickerController = liveCDEditStickerLayout2.getLiveCDStickerController()) == null)) {
                        str2 = liveCDStickerController.f127466a;
                    }
                    com.ss.android.ugc.tools.f.b a3 = a2.a("prop_id", str2);
                    LiveCDEditStickerLayout liveCDEditStickerLayout3 = dVar.f127370b;
                    if (liveCDEditStickerLayout3 == null || !liveCDEditStickerLayout3.v) {
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                    r.a("livesdk_cd_sticker_edit_complete", a3.a("is_first_edit", i2).a("countdown_time", currentTimeMillis2).f149193a);
                }
                a(false);
                return true;
            }
        } else {
            a(2);
            return false;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ LiveCDEditStickerLayout this$0;

        static {
            Covode.recordClassIndex(83555);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(LiveCDEditStickerLayout liveCDEditStickerLayout) {
            super(0);
            this.this$0 = liveCDEditStickerLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            LiveCDEditStickerView liveCDEditStickerView;
            float f2;
            LiveCDEditStickerLayout liveCDEditStickerLayout = this.this$0;
            if (liveCDEditStickerLayout.o != null && ((liveCDEditStickerView = liveCDEditStickerLayout.o) == null || liveCDEditStickerView.getState() != 2)) {
                Rect rect = new Rect();
                FrameLayout frameLayout = liveCDEditStickerLayout.f127406a;
                if (frameLayout == null) {
                    l.a("root");
                }
                frameLayout.getWindowVisibleDisplayFrame(rect);
                if (liveCDEditStickerLayout.getHeight() - rect.height() > LiveCDEditStickerLayout.z) {
                    liveCDEditStickerLayout.f127415j = liveCDEditStickerLayout.getHeight() - rect.height();
                    LiveCDEditStickerView liveCDEditStickerView2 = liveCDEditStickerLayout.o;
                    if (liveCDEditStickerView2 != null) {
                        liveCDEditStickerLayout.f127413h.f127456d = (float) ((liveCDEditStickerLayout.getWidth() - liveCDEditStickerView2.getWidth()) / 2);
                        liveCDEditStickerLayout.f127413h.f127457e = (float) (((liveCDEditStickerLayout.getHeight() - liveCDEditStickerLayout.f127415j) - liveCDEditStickerView2.getHeight()) / 2);
                    }
                    int i2 = liveCDEditStickerLayout.p;
                    if (i2 == LiveCDEditStickerLayout.y) {
                        liveCDEditStickerLayout.p = LiveCDEditStickerLayout.w;
                        liveCDEditStickerLayout.f127418m = false;
                        if (!liveCDEditStickerLayout.f127417l) {
                            LiveCDEditStickerView liveCDEditStickerView3 = liveCDEditStickerLayout.o;
                            if (liveCDEditStickerView3 != null) {
                                liveCDEditStickerView3.setVisibility(0);
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(liveCDEditStickerView3, "scaleX", liveCDEditStickerLayout.f127414i.f127453a, liveCDEditStickerLayout.f127413h.f127453a);
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(liveCDEditStickerView3, "scaleY", liveCDEditStickerLayout.f127414i.f127454b, liveCDEditStickerLayout.f127413h.f127454b);
                                float[] fArr = new float[2];
                                fArr[0] = liveCDEditStickerLayout.f127414i.f127455c;
                                if (liveCDEditStickerLayout.f127414i.f127455c > 180.0f) {
                                    f2 = 360.0f;
                                } else {
                                    f2 = liveCDEditStickerLayout.f127413h.f127455c;
                                }
                                fArr[1] = f2;
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(liveCDEditStickerView3, "rotation", fArr);
                                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(liveCDEditStickerView3, "x", liveCDEditStickerLayout.f127414i.f127456d, liveCDEditStickerLayout.f127413h.f127456d);
                                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(liveCDEditStickerView3, "y", liveCDEditStickerLayout.f127414i.f127457e, liveCDEditStickerLayout.f127413h.f127457e);
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.setDuration(300L);
                                animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5);
                                animatorSet.addListener(new d(liveCDEditStickerLayout));
                                animatorSet.start();
                            }
                            liveCDEditStickerLayout.f127417l = true;
                        }
                    } else if (i2 == LiveCDEditStickerLayout.x) {
                        liveCDEditStickerLayout.p = LiveCDEditStickerLayout.w;
                        liveCDEditStickerLayout.f127418m = false;
                        if (!liveCDEditStickerLayout.f127417l) {
                            LiveCDEditStickerView liveCDEditStickerView4 = liveCDEditStickerLayout.o;
                            if (liveCDEditStickerView4 != null) {
                                liveCDEditStickerLayout.f127414i.f127456d = (float) ((liveCDEditStickerLayout.getWidth() - liveCDEditStickerView4.getWidth()) / 2);
                                liveCDEditStickerLayout.f127414i.f127457e = ((liveCDEditStickerLayout.n.x - ((float) liveCDEditStickerView4.getHeight())) / 2.0f) + liveCDEditStickerLayout.n.y;
                                liveCDEditStickerView4.setX(liveCDEditStickerLayout.f127413h.f127456d);
                                liveCDEditStickerView4.setY(liveCDEditStickerLayout.f127413h.f127457e);
                                liveCDEditStickerView4.setVisibility(0);
                                liveCDEditStickerLayout.requestLayout();
                                LiveCDEditStickerView liveCDEditStickerView5 = liveCDEditStickerLayout.o;
                                if (liveCDEditStickerView5 != null) {
                                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(liveCDEditStickerView5, "scaleX", 0.0f, 1.0f);
                                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(liveCDEditStickerView5, "scaleY", 0.0f, 1.0f);
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    animatorSet2.setDuration(300L);
                                    animatorSet2.play(ofFloat6).with(ofFloat7);
                                    animatorSet2.addListener(new c(liveCDEditStickerView5, liveCDEditStickerLayout));
                                    animatorSet2.start();
                                }
                            }
                            liveCDEditStickerLayout.f127417l = true;
                        }
                    }
                    liveCDEditStickerLayout.f127416k = rect.height();
                }
            }
            return z.f158842a;
        }
    }

    public final void setBeforeChangeListener(h.f.a.b<? super LiveCDEditStickerView, z> bVar) {
        this.D = bVar;
    }

    public final void setFirstEdit(boolean z2) {
        this.v = z2;
    }

    public final void setHintTextState(int i2) {
        this.H = i2;
    }

    public final void setLiveCDStickerController(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.a aVar) {
        this.G = aVar;
    }

    public final void setMChild(LiveCDEditStickerView liveCDEditStickerView) {
        this.o = liveCDEditStickerView;
    }

    public final void setMaxLine(int i2) {
        this.F = i2;
    }

    public final void setOnCompleteListener(m<? super LiveCDEditStickerView, ? super Boolean, z> mVar) {
        this.C = mVar;
    }

    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveCDEditStickerLayout f127419a;

        static {
            Covode.recordClassIndex(83544);
        }

        b(LiveCDEditStickerLayout liveCDEditStickerLayout) {
            this.f127419a = liveCDEditStickerLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f127419a.r = null;
            this.f127419a.getMChild();
            this.f127419a.b(false);
            this.f127419a.setVisibility(4);
            this.f127419a.f127410e = false;
        }
    }

    public static final class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveCDEditStickerLayout f127422a;

        static {
            Covode.recordClassIndex(83546);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(LiveCDEditStickerLayout liveCDEditStickerLayout) {
            this.f127422a = liveCDEditStickerLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            LiveCDEditStickerView mChild = this.f127422a.getMChild();
            if (mChild != null) {
                mChild.c();
            }
            LiveCDEditStickerView mChild2 = this.f127422a.getMChild();
            if (mChild2 != null) {
                mChild2.b();
            }
            LiveCDEditStickerLayout liveCDEditStickerLayout = this.f127422a;
            LiveCDEditStickerView mChild3 = liveCDEditStickerLayout.getMChild();
            if (mChild3 == null) {
                l.b();
            }
            liveCDEditStickerLayout.a(mChild3);
            LiveCDEditStickerLayout.a(this.f127422a).setVisibility(0);
            this.f127422a.a(0);
            this.f127422a.f127411f = false;
        }
    }

    public static final class f implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveCDEditStickerLayout f127425a;

        static {
            Covode.recordClassIndex(83549);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(LiveCDEditStickerLayout liveCDEditStickerLayout) {
            this.f127425a = liveCDEditStickerLayout;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.d
        public final void a(String str) {
            float f2;
            LiveCDEditStickerView mChild;
            this.f127425a.a(-1);
            AVTextView aVTextView = this.f127425a.f127408c;
            if (aVTextView != null) {
                if (TextUtils.isEmpty(str) || (mChild = this.f127425a.getMChild()) == null || !mChild.e()) {
                    f2 = 0.5f;
                } else {
                    f2 = 1.0f;
                }
                aVTextView.setAlpha(f2);
            }
        }
    }

    public static final class g extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveCDEditStickerLayout f127426a;

        static {
            Covode.recordClassIndex(83550);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(LiveCDEditStickerLayout liveCDEditStickerLayout) {
            this.f127426a = liveCDEditStickerLayout;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            AVTextView aVTextView = this.f127426a.f127408c;
            if (aVTextView != null) {
                aVTextView.performClick();
            }
        }
    }

    public static final class h extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveCDEditStickerLayout f127427a;

        static {
            Covode.recordClassIndex(83551);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(LiveCDEditStickerLayout liveCDEditStickerLayout) {
            this.f127427a = liveCDEditStickerLayout;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            LiveCDEditStickerView mChild;
            if (this.f127427a.b() && (mChild = this.f127427a.getMChild()) != null) {
                mChild.f();
            }
        }
    }

    public static final class i extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveCDEditStickerLayout f127428a;

        static {
            Covode.recordClassIndex(83552);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(LiveCDEditStickerLayout liveCDEditStickerLayout) {
            this.f127428a = liveCDEditStickerLayout;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            String str;
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.a liveCDStickerController;
            LiveCDEditStickerView mChild = this.f127428a.getMChild();
            if (mChild != null) {
                mChild.g();
            }
            a.C0731a aVar = new a.C0731a(this.f127428a.getContext());
            Context context = this.f127428a.getContext();
            l.b(context, "");
            aVar.f33401a = context.getResources().getString(R.string.av9);
            Context context2 = this.f127428a.getContext();
            l.b(context2, "");
            aVar.f33402b = context2.getResources().getString(R.string.av6);
            Context context3 = this.f127428a.getContext();
            l.b(context3, "");
            a.C0731a a2 = aVar.a(context3.getResources().getString(R.string.av8), (DialogInterface.OnClickListener) new a(this), false);
            Context context4 = this.f127428a.getContext();
            l.b(context4, "");
            a2.b(context4.getResources().getString(R.string.av7), (DialogInterface.OnClickListener) new b(this), false).a().c();
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.d dVar = this.f127428a.u;
            if (dVar != null) {
                com.ss.android.ugc.tools.f.b a3 = new com.ss.android.ugc.tools.f.b().a("enter_from", "video_edit_page").a("enter_method", "click_main_panel").a("shoot_way", dVar.f127369a.mShootWay).a("creation_id", dVar.f127369a.creationId).a("content_source", bl.b(dVar.f127369a)).a("content_type", bl.a(dVar.f127369a));
                LiveCDEditStickerLayout liveCDEditStickerLayout = dVar.f127370b;
                if (liveCDEditStickerLayout == null || (liveCDStickerController = liveCDEditStickerLayout.getLiveCDStickerController()) == null) {
                    str = null;
                } else {
                    str = liveCDStickerController.f127466a;
                }
                r.a("livesdk_cd_sticker_cancel", a3.a("prop_id", str).f149193a);
            }
        }

        static final class a implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ i f127429a;

            static {
                Covode.recordClassIndex(83553);
            }

            a(i iVar) {
                this.f127429a = iVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.d dVar = this.f127429a.f127428a.u;
                if (dVar != null) {
                    dVar.a(true);
                }
            }
        }

        static final class b implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ i f127430a;

            static {
                Covode.recordClassIndex(83554);
            }

            b(i iVar) {
                this.f127430a = iVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
                this.f127430a.f127428a.p = LiveCDEditStickerLayout.w;
                LiveCDEditStickerView mChild = this.f127430a.f127428a.getMChild();
                if (mChild != null) {
                    mChild.f();
                }
                this.f127430a.f127428a.a(true);
                this.f127430a.f127428a.s.b();
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.d dVar = this.f127430a.f127428a.u;
                if (dVar != null) {
                    dVar.a(false);
                }
            }
        }
    }

    public static final /* synthetic */ AVTextView a(LiveCDEditStickerLayout liveCDEditStickerLayout) {
        AVTextView aVTextView = liveCDEditStickerLayout.f127407b;
        if (aVTextView == null) {
            l.a("liveCDHint");
        }
        return aVTextView;
    }

    public static final class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveCDEditStickerView f127420a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LiveCDEditStickerLayout f127421b;

        static {
            Covode.recordClassIndex(83545);
        }

        public final void onAnimationEnd(Animator animator) {
            LiveCDEditStickerView mChild = this.f127421b.getMChild();
            if (mChild != null) {
                mChild.c();
            }
            LiveCDEditStickerView mChild2 = this.f127421b.getMChild();
            if (mChild2 != null) {
                mChild2.b();
            }
            this.f127421b.a(this.f127420a);
            LiveCDEditStickerLayout.a(this.f127421b).setVisibility(0);
            this.f127421b.a(0);
            this.f127421b.f127411f = false;
        }

        c(LiveCDEditStickerView liveCDEditStickerView, LiveCDEditStickerLayout liveCDEditStickerLayout) {
            this.f127420a = liveCDEditStickerView;
            this.f127421b = liveCDEditStickerLayout;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(boolean z2) {
        MethodCollector.i(4728);
        LiveCDEditStickerView liveCDEditStickerView = this.o;
        if (liveCDEditStickerView != null) {
            RelativeLayout relativeLayout = this.B;
            if (relativeLayout == null) {
                l.a("container");
            }
            relativeLayout.removeView(liveCDEditStickerView);
            AVTextView aVTextView = this.f127407b;
            if (aVTextView == null) {
                l.a("liveCDHint");
            }
            aVTextView.setVisibility(8);
            liveCDEditStickerView.setEditEnable(false);
            e();
            m<? super LiveCDEditStickerView, ? super Boolean, z> mVar = this.C;
            if (mVar != null) {
                mVar.invoke(this.o, Boolean.valueOf(z2));
            }
            this.o = null;
            MethodCollector.o(4728);
            return;
        }
        MethodCollector.o(4728);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.e
    public final void a(int i2) {
        this.H = i2;
        if (i2 == -1) {
            AVTextView aVTextView = this.f127407b;
            if (aVTextView == null) {
                l.a("liveCDHint");
            }
            aVTextView.setText("");
        } else if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    AVTextView aVTextView2 = this.f127407b;
                    if (aVTextView2 == null) {
                        l.a("liveCDHint");
                    }
                    aVTextView2.setText(R.string.avb);
                } else if (i2 == 3) {
                    AVTextView aVTextView3 = this.f127407b;
                    if (aVTextView3 == null) {
                        l.a("liveCDHint");
                    }
                    aVTextView3.setText(R.string.av_);
                } else if (i2 == 4) {
                    AVTextView aVTextView4 = this.f127407b;
                    if (aVTextView4 == null) {
                        l.a("liveCDHint");
                    }
                    aVTextView4.setText(R.string.ava);
                }
            } else if (this.s.a()) {
                AVTextView aVTextView5 = this.f127407b;
                if (aVTextView5 == null) {
                    l.a("liveCDHint");
                }
                aVTextView5.setText("");
            } else {
                AVTextView aVTextView6 = this.f127407b;
                if (aVTextView6 == null) {
                    l.a("liveCDHint");
                }
                aVTextView6.setText(R.string.aw5);
            }
        } else if (this.s.a()) {
            AVTextView aVTextView7 = this.f127407b;
            if (aVTextView7 == null) {
                l.a("liveCDHint");
            }
            aVTextView7.setText("");
        } else {
            AVTextView aVTextView8 = this.f127407b;
            if (aVTextView8 == null) {
                l.a("liveCDHint");
            }
            aVTextView8.setText(R.string.byj);
        }
    }

    public final void a(View view) {
        AVTextView aVTextView = this.f127407b;
        if (aVTextView == null) {
            l.a("liveCDHint");
        }
        ViewGroup.LayoutParams layoutParams = aVTextView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        float height = (float) (iArr[1] + view.getHeight());
        RelativeLayout relativeLayout = this.B;
        if (relativeLayout == null) {
            l.a("container");
        }
        marginLayoutParams.topMargin = (int) (height + com.ss.android.ttve.utils.b.b(relativeLayout.getContext(), 8.0f));
        marginLayoutParams.width = n.b(getContext());
        AVTextView aVTextView2 = this.f127407b;
        if (aVTextView2 == null) {
            l.a("liveCDHint");
        }
        aVTextView2.setLayoutParams(marginLayoutParams);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.e
    public final void a(boolean z2) {
        LiveCDEditStickerView liveCDEditStickerView;
        this.f127417l = false;
        LiveCDEditStickerView liveCDEditStickerView2 = this.o;
        if (liveCDEditStickerView2 != null) {
            liveCDEditStickerView2.setTouchEnable(true);
        }
        LiveCDEditStickerView liveCDEditStickerView3 = this.o;
        if (liveCDEditStickerView3 != null) {
            liveCDEditStickerView3.setState(0);
        }
        AVTextView aVTextView = this.f127407b;
        if (aVTextView == null) {
            l.a("liveCDHint");
        }
        aVTextView.setVisibility(8);
        this.v = false;
        if (!this.f127418m) {
            LiveCDEditStickerView liveCDEditStickerView4 = this.o;
            if (liveCDEditStickerView4 != null && liveCDEditStickerView4.f127438e) {
                if (z2 && (liveCDEditStickerView = this.o) != null) {
                    LiveCDEditText liveCDEditText = liveCDEditStickerView.f127435b;
                    if (liveCDEditText == null) {
                        l.a("edLiveTitle");
                    }
                    liveCDEditText.setText(liveCDEditStickerView.f127437d.f127459a);
                    liveCDEditStickerView.f127440g = liveCDEditStickerView.f127437d.f127460b;
                    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.b a2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.c.a(liveCDEditStickerView.f127440g, System.currentTimeMillis());
                    liveCDEditStickerView.a(a2.f127363a, a2.f127364b, a2.f127365c, a2.f127366d, false);
                    d dVar = liveCDEditStickerView.f127442i;
                    if (dVar != null) {
                        LiveCDEditText liveCDEditText2 = liveCDEditStickerView.f127435b;
                        if (liveCDEditText2 == null) {
                            l.a("edLiveTitle");
                        }
                        dVar.a(String.valueOf(liveCDEditText2.getText()));
                    }
                }
                d();
            } else if (z2) {
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.d dVar2 = this.u;
                if (dVar2 != null) {
                    dVar2.b(true);
                }
                b(z2);
                a();
                setVisibility(4);
            } else {
                d();
            }
            this.f127418m = true;
        }
        Context context = getContext();
        if (context instanceof com.ss.android.ugc.tools.view.a.c) {
            ((com.ss.android.ugc.tools.view.a.c) context).c(this);
        }
    }

    public final void a(float f2, float f3) {
        this.n.x = f2;
        this.n.y = f3;
    }

    @Override // com.ss.android.ugc.tools.view.a.a
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        LiveCDEditStickerView liveCDEditStickerView;
        if (i2 != 4 || (liveCDEditStickerView = this.o) == null || liveCDEditStickerView.getVisibility() != 0) {
            return super.onKeyDown(i2, keyEvent);
        }
        LiveCDEditStickerView liveCDEditStickerView2 = this.o;
        if (liveCDEditStickerView2 != null) {
            liveCDEditStickerView2.g();
        }
        LiveCDEditStickerView liveCDEditStickerView3 = this.o;
        if (liveCDEditStickerView3 == null || !liveCDEditStickerView3.f127438e) {
            AVTextView aVTextView = this.f127409d;
            if (aVTextView != null) {
                aVTextView.performClick();
            }
        } else {
            AVTextView aVTextView2 = this.f127408c;
            if (aVTextView2 != null) {
                aVTextView2.performClick();
            }
        }
        return true;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(4564);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(4564);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private final Animator a(View view, Animator.AnimatorListener animatorListener) {
        float f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", this.f127413h.f127453a, this.f127414i.f127453a);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", this.f127413h.f127454b, this.f127414i.f127454b);
        float[] fArr = new float[2];
        if (this.f127414i.f127455c > 180.0f) {
            f2 = 360.0f;
        } else {
            f2 = this.f127413h.f127455c;
        }
        fArr[0] = f2;
        fArr[1] = this.f127414i.f127455c;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "rotation", fArr);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "x", this.f127413h.f127456d, this.f127414i.f127456d);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, "y", this.f127413h.f127457e, this.f127414i.f127457e);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.addListener(animatorListener);
        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5);
        animatorSet.start();
        return animatorSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0082, code lost:
        if (h.z.f158842a == null) goto L_0x0084;
     */
    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerView r11, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.a r12) {
        /*
        // Method dump skipped, instructions count: 384
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout.a(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerView, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.a):void");
    }

    private /* synthetic */ LiveCDEditStickerLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private LiveCDEditStickerLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(4764);
        this.f127412g = new j(this);
        this.f127413h = new a((byte) 0);
        this.f127414i = new a((byte) 0);
        this.E = true;
        this.n = new PointF(0.0f, 0.0f);
        this.p = w;
        this.F = 2;
        this.s = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd.a();
        this.v = true;
        setBackgroundColor(androidx.core.content.b.c(getContext(), R.color.bk));
        View a2 = com.a.a(LayoutInflater.from(getContext()), R.layout.ag9, this, false);
        if (a2 != null) {
            RelativeLayout relativeLayout = (RelativeLayout) a2;
            this.B = relativeLayout;
            if (relativeLayout == null) {
                l.a("container");
            }
            addView(relativeLayout);
            RelativeLayout relativeLayout2 = this.B;
            if (relativeLayout2 == null) {
                l.a("container");
            }
            View findViewById = relativeLayout2.findViewById(R.id.cc4);
            l.b(findViewById, "");
            this.f127407b = (AVTextView) findViewById;
            RelativeLayout relativeLayout3 = this.B;
            if (relativeLayout3 == null) {
                l.a("container");
            }
            this.f127408c = (AVTextView) relativeLayout3.findViewById(R.id.f1h);
            RelativeLayout relativeLayout4 = this.B;
            if (relativeLayout4 == null) {
                l.a("container");
            }
            this.f127409d = (AVTextView) relativeLayout4.findViewById(R.id.f1g);
            setOnClickListener(this);
            RelativeLayout relativeLayout5 = this.B;
            if (relativeLayout5 == null) {
                l.a("container");
            }
            relativeLayout5.setOnClickListener(new g(this));
            AVTextView aVTextView = this.f127408c;
            if (aVTextView != null) {
                aVTextView.setOnClickListener(new h(this));
            }
            AVTextView aVTextView2 = this.f127409d;
            if (aVTextView2 != null) {
                aVTextView2.setOnClickListener(new i(this));
            }
            setVisibility(4);
            c();
            MethodCollector.o(4764);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout");
        MethodCollector.o(4764);
        throw nullPointerException;
    }
}
