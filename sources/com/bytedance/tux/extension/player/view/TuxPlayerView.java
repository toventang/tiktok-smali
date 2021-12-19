package com.bytedance.tux.extension.player.view;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.view.i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.e.a;
import com.bytedance.tux.extension.player.a.c;
import com.bytedance.tux.extension.player.view.PlayerMaskView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.input.slider.TuxSlider;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.h;
import h.w;
import java.lang.reflect.Field;
import java.util.HashMap;

public class TuxPlayerView extends FrameLayout implements c.a, com.bytedance.tux.extension.player.f {

    /* renamed from: e  reason: collision with root package name */
    public static final a f44992e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f44993a;

    /* renamed from: b  reason: collision with root package name */
    public Runnable f44994b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f44995c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.tux.extension.player.a f44996d;

    /* renamed from: f  reason: collision with root package name */
    private a f44997f;

    /* renamed from: g  reason: collision with root package name */
    private com.bytedance.tux.extension.player.b f44998g;

    /* renamed from: h  reason: collision with root package name */
    private ViewGroup f44999h;

    /* renamed from: i  reason: collision with root package name */
    private Window f45000i;

    /* renamed from: j  reason: collision with root package name */
    private com.bytedance.tux.extension.player.g f45001j;

    /* renamed from: k  reason: collision with root package name */
    private int f45002k;

    /* renamed from: l  reason: collision with root package name */
    private Bitmap f45003l;

    /* renamed from: m  reason: collision with root package name */
    private final h f45004m;
    private HashMap n;

    static {
        Covode.recordClassIndex(27460);
    }

    public final View c(int i2) {
        if (this.n == null) {
            this.n = new HashMap();
        }
        View view = (View) this.n.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.n.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final Handler getMainHandler() {
        return (Handler) this.f45004m.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(27461);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final Bitmap getCoverImage$player_release() {
        return this.f45003l;
    }

    public final ViewGroup getFullScreenContainerView$player_release() {
        return this.f44999h;
    }

    public final a getParams() {
        return this.f44997f;
    }

    public final com.bytedance.tux.extension.player.a getPlayer$player_release() {
        return this.f44996d;
    }

    public final com.bytedance.tux.extension.player.b getPlayerLogListener$player_release() {
        return this.f44998g;
    }

    public final int getVideoLength$player_release() {
        return this.f45002k;
    }

    public final com.bytedance.tux.extension.player.g getVideoSize$player_release() {
        return this.f45001j;
    }

    public final Window getWindow$player_release() {
        return this.f45000i;
    }

    static final class e extends m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f45010a = new e();

        static {
            Covode.recordClassIndex(27465);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public final void e() {
        com.bytedance.tux.extension.player.a aVar = this.f44996d;
        if (aVar != null) {
            aVar.b();
            g();
        }
    }

    public final void f() {
        com.bytedance.tux.extension.player.a aVar = this.f44996d;
        if (aVar != null) {
            this.f44995c = true;
            aVar.b();
            g();
        }
    }

    public final ImageView getCoverView() {
        ImageView imageView = (ImageView) c(R.id.agf);
        l.a((Object) imageView, "");
        return imageView;
    }

    public final TextureView getVideoView() {
        TextureView textureView = (TextureView) c(R.id.fh_);
        l.a((Object) textureView, "");
        return textureView;
    }

    public static final class d implements PlayerMaskView.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TuxPlayerView f45009a;

        static {
            Covode.recordClassIndex(27464);
        }

        @Override // com.bytedance.tux.extension.player.view.PlayerMaskView.b
        public final void b() {
            if (com.bytedance.tux.extension.player.e.f44963a == com.bytedance.tux.extension.player.d.PLAYER_START) {
                this.f45009a.f();
                return;
            }
            com.bytedance.tux.extension.player.b playerLogListener$player_release = this.f45009a.getPlayerLogListener$player_release();
            if (playerLogListener$player_release != null) {
                playerLogListener$player_release.a();
            }
            this.f45009a.b(0);
        }

        @Override // com.bytedance.tux.extension.player.view.PlayerMaskView.b
        public final void a() {
            Group group = (Group) ((PlayerMaskView) this.f45009a.c(R.id.d68)).a(R.id.fh1);
            l.a((Object) group, "");
            group.setVisibility(8);
            TuxPlayerView tuxPlayerView = this.f45009a;
            com.bytedance.tux.extension.player.a aVar = tuxPlayerView.f44996d;
            if (aVar != null) {
                tuxPlayerView.f44995c = false;
                aVar.g();
                tuxPlayerView.c();
            }
        }

        @Override // com.bytedance.tux.extension.player.view.PlayerMaskView.b
        public final void d() {
            com.bytedance.tux.extension.player.a player$player_release = this.f45009a.getPlayer$player_release();
            if (player$player_release == null) {
                return;
            }
            if (player$player_release.f()) {
                player$player_release.e();
                ((TuxPlayerStateView) this.f45009a.c(R.id.e7v)).a();
                return;
            }
            player$player_release.d();
            ((TuxPlayerStateView) this.f45009a.c(R.id.e7v)).b();
        }

        @Override // com.bytedance.tux.extension.player.view.PlayerMaskView.b
        public final void e() {
            PlayerMaskView playerMaskView = (PlayerMaskView) this.f45009a.c(R.id.d68);
            TuxPlayerTimeView tuxPlayerTimeView = (TuxPlayerTimeView) playerMaskView.a(R.id.el_);
            l.a((Object) tuxPlayerTimeView, "");
            tuxPlayerTimeView.setVisibility(0);
            Group group = (Group) playerMaskView.a(R.id.d5q);
            l.a((Object) group, "");
            group.setVisibility(8);
            TuxPlayerStateView tuxPlayerStateView = (TuxPlayerStateView) playerMaskView.a(R.id.d5h);
            l.a((Object) tuxPlayerStateView, "");
            tuxPlayerStateView.setVisibility(8);
            this.f45009a.f44993a = true;
        }

        @Override // com.bytedance.tux.extension.player.view.PlayerMaskView.b
        public final void c() {
            boolean z;
            int i2;
            Context context;
            MethodCollector.i(9862);
            com.bytedance.tux.extension.player.g videoSize$player_release = this.f45009a.getVideoSize$player_release();
            if (videoSize$player_release != null) {
                if (videoSize$player_release.f44966a < videoSize$player_release.f44967b) {
                    z = true;
                } else {
                    z = false;
                }
                ViewGroup fullScreenContainerView$player_release = this.f45009a.getFullScreenContainerView$player_release();
                TuxPlayerView tuxPlayerView = this.f45009a;
                if (!(fullScreenContainerView$player_release == null || tuxPlayerView == null)) {
                    com.bytedance.tux.extension.player.a.c.f44940j = fullScreenContainerView$player_release;
                    com.bytedance.tux.extension.player.a.c.f44936f = tuxPlayerView;
                    ViewParent parent = tuxPlayerView.getParent();
                    if (!(parent instanceof ViewGroup)) {
                        parent = null;
                    }
                    com.bytedance.tux.extension.player.a.c.f44938h = (ViewGroup) parent;
                    ViewGroup.LayoutParams layoutParams = tuxPlayerView.getLayoutParams();
                    l.a((Object) layoutParams, "");
                    l.c(layoutParams, "");
                    Class<?> cls = layoutParams.getClass();
                    Object newInstance = Class.forName(cls.getName()).getConstructor(ViewGroup.LayoutParams.class).newInstance(layoutParams);
                    if (newInstance != null) {
                        ViewGroup.LayoutParams layoutParams2 = (ViewGroup.LayoutParams) newInstance;
                        Field[] declaredFields = cls.getDeclaredFields();
                        for (Field field : declaredFields) {
                            l.a((Object) field, "");
                            if (!TextUtils.equals(field.getName(), "widget")) {
                                field.setAccessible(true);
                                field.set(layoutParams2, field.get(layoutParams));
                            }
                        }
                        com.bytedance.tux.extension.player.a.c.f44939i = layoutParams2;
                        com.bytedance.tux.extension.player.a.c.f44937g = tuxPlayerView;
                        Context context2 = tuxPlayerView.getContext();
                        Window window$player_release = tuxPlayerView.getWindow$player_release();
                        if (window$player_release != null) {
                            z.e eVar = new z.e();
                            eVar.element = (T) window$player_release.getCallback();
                            if (com.bytedance.tux.extension.player.a.c.f44934d == null) {
                                com.bytedance.tux.extension.player.a.c.f44935e = eVar.element;
                                com.bytedance.tux.extension.player.a.c.f44934d = new c.f(eVar, eVar.element);
                            }
                            i iVar = com.bytedance.tux.extension.player.a.c.f44934d;
                            if (iVar != null) {
                                window$player_release.setCallback(iVar);
                            }
                        }
                        if (z) {
                            Window window$player_release2 = tuxPlayerView.getWindow$player_release();
                            if (window$player_release2 != null) {
                                View c2 = tuxPlayerView.c(R.id.e_f);
                                l.a((Object) c2, "");
                                ViewGroup.LayoutParams layoutParams3 = c2.getLayoutParams();
                                l.a((Object) context2, "");
                                l.c(context2, "");
                                layoutParams3.height = context2.getResources().getDimensionPixelSize(context2.getResources().getIdentifier("status_bar_height", "dimen", "android"));
                                View c3 = tuxPlayerView.c(R.id.e_f);
                                l.a((Object) c3, "");
                                c3.setVisibility(0);
                                a.C1099a.a((androidx.fragment.app.e) context2, window$player_release2).b(false).b(0).a(false, false).f44923a.d();
                            }
                            TextureVideoView textureVideoView = (TextureVideoView) tuxPlayerView.c(R.id.fhs);
                            l.a((Object) textureVideoView, "");
                            Rect a2 = com.bytedance.tux.extension.player.a.d.a(textureVideoView);
                            Rect a3 = com.bytedance.tux.extension.player.a.d.a(fullScreenContainerView$player_release);
                            com.bytedance.tux.extension.player.a.c.f44931a[0] = a2.left - a3.left;
                            com.bytedance.tux.extension.player.a.c.f44931a[1] = a2.top - a3.top;
                            TextureVideoView textureVideoView2 = (TextureVideoView) tuxPlayerView.c(R.id.fhs);
                            l.a((Object) textureVideoView2, "");
                            com.bytedance.tux.extension.player.a.c.f44933c = textureVideoView2.getWidth();
                            TextureVideoView textureVideoView3 = (TextureVideoView) tuxPlayerView.c(R.id.fhs);
                            l.a((Object) textureVideoView3, "");
                            com.bytedance.tux.extension.player.a.c.f44932b = textureVideoView3.getHeight();
                            ImageView imageView = new ImageView(context2);
                            com.bytedance.tux.extension.player.a.c.f44941k = imageView;
                            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                            com.bytedance.tux.extension.player.a.c.a(com.bytedance.tux.extension.player.a.c.f44941k);
                            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(com.bytedance.tux.extension.player.a.c.f44933c, com.bytedance.tux.extension.player.a.c.f44932b);
                            marginLayoutParams.topMargin = com.bytedance.tux.extension.player.a.c.f44931a[1];
                            marginLayoutParams.leftMargin = com.bytedance.tux.extension.player.a.c.f44931a[0];
                            ImageView imageView2 = com.bytedance.tux.extension.player.a.c.f44941k;
                            if (imageView2 != null) {
                                imageView2.setLayoutParams(marginLayoutParams);
                            }
                            com.bytedance.tux.extension.player.a.c.a(fullScreenContainerView$player_release, com.bytedance.tux.extension.player.a.c.f44941k, null);
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new c.b(a3));
                            ofFloat.addListener(new c.C1101c(tuxPlayerView, fullScreenContainerView$player_release));
                            l.a((Object) ofFloat, "");
                            ofFloat.setDuration(200L);
                            ofFloat.setInterpolator(new AccelerateInterpolator());
                            ofFloat.start();
                        } else {
                            if (!(context2 instanceof Activity)) {
                                context = null;
                            } else {
                                context = context2;
                            }
                            com.bytedance.tux.extension.player.a.c.a((Activity) context, 0);
                            com.bytedance.tux.extension.player.a.c.p = com.bytedance.tux.extension.player.c.HORIZONTAL;
                            com.bytedance.tux.extension.player.a.c.a(tuxPlayerView);
                            ViewGroup.LayoutParams layoutParams4 = tuxPlayerView.getLayoutParams();
                            if (layoutParams4 != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                                marginLayoutParams2.width = -1;
                                marginLayoutParams2.height = -1;
                                marginLayoutParams2.topMargin = 0;
                                com.bytedance.tux.extension.player.a.c.a(fullScreenContainerView$player_release, tuxPlayerView, null);
                                Window window$player_release3 = tuxPlayerView.getWindow$player_release();
                                if (window$player_release3 != null) {
                                    if (context2 != null) {
                                        a.C1099a.a((androidx.fragment.app.e) context2, window$player_release3).a(true, true).f44923a.d();
                                    } else {
                                        w wVar = new w("null cannot be cast to non-null type");
                                        MethodCollector.o(9862);
                                        throw wVar;
                                    }
                                }
                                i2 = 9862;
                                c.a aVar = com.bytedance.tux.extension.player.a.c.f44937g;
                                if (aVar != null) {
                                    aVar.a(com.bytedance.tux.extension.player.a.c.p);
                                }
                                this.f45009a.getPlayer$player_release();
                                MethodCollector.o(i2);
                                return;
                            }
                            w wVar2 = new w("null cannot be cast to non-null type");
                            MethodCollector.o(9862);
                            throw wVar2;
                        }
                    } else {
                        w wVar3 = new w("null cannot be cast to non-null type");
                        MethodCollector.o(9862);
                        throw wVar3;
                    }
                }
                i2 = 9862;
                this.f45009a.getPlayer$player_release();
                MethodCollector.o(i2);
                return;
            }
            MethodCollector.o(9862);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(TuxPlayerView tuxPlayerView) {
            this.f45009a = tuxPlayerView;
        }

        @Override // com.bytedance.tux.extension.player.view.PlayerMaskView.b
        public final void a(int i2) {
            TuxPlayerTimeView tuxPlayerTimeView = (TuxPlayerTimeView) this.f45009a.c(R.id.el_);
            l.a((Object) tuxPlayerTimeView, "");
            if (tuxPlayerTimeView.f44991g == null) {
                tuxPlayerTimeView.f44991g = new HashMap();
            }
            View view = (View) tuxPlayerTimeView.f44991g.get(Integer.valueOf((int) R.id.ahh));
            if (view == null) {
                view = tuxPlayerTimeView.findViewById(R.id.ahh);
                tuxPlayerTimeView.f44991g.put(Integer.valueOf((int) R.id.ahh), view);
            }
            TuxTextView tuxTextView = (TuxTextView) view;
            l.a((Object) tuxTextView, "");
            tuxTextView.setText(com.bytedance.tux.extension.player.a.b.a(i2, this.f45009a.getVideoLength$player_release()));
        }

        @Override // com.bytedance.tux.extension.player.view.PlayerMaskView.b
        public final void b(int i2) {
            PlayerMaskView playerMaskView = (PlayerMaskView) this.f45009a.c(R.id.d68);
            TuxPlayerTimeView tuxPlayerTimeView = (TuxPlayerTimeView) playerMaskView.a(R.id.el_);
            l.a((Object) tuxPlayerTimeView, "");
            tuxPlayerTimeView.setVisibility(8);
            if (playerMaskView.f44971c) {
                Group group = (Group) playerMaskView.a(R.id.d5q);
                l.a((Object) group, "");
                group.setVisibility(0);
                TuxPlayerStateView tuxPlayerStateView = (TuxPlayerStateView) playerMaskView.a(R.id.d5h);
                l.a((Object) tuxPlayerStateView, "");
                tuxPlayerStateView.setVisibility(8);
            } else if (com.bytedance.tux.extension.player.e.f44964b != com.bytedance.tux.extension.player.c.PREVIEW) {
                TuxPlayerStateView tuxPlayerStateView2 = (TuxPlayerStateView) playerMaskView.a(R.id.d5h);
                l.a((Object) tuxPlayerStateView2, "");
                tuxPlayerStateView2.setVisibility(0);
                Group group2 = (Group) playerMaskView.a(R.id.d5q);
                l.a((Object) group2, "");
                group2.setVisibility(8);
            }
            this.f45009a.b(i2);
            this.f45009a.f44993a = false;
        }
    }

    private final void h() {
        ((PlayerMaskView) c(R.id.d68)).c();
        getMainHandler().removeCallbacksAndMessages(null);
    }

    @Override // com.bytedance.tux.extension.player.f
    public final void a() {
        ImageView imageView = (ImageView) c(R.id.agf);
        l.a((Object) imageView, "");
        imageView.setVisibility(8);
    }

    public final void d() {
        com.bytedance.tux.extension.player.a aVar;
        if (!this.f44995c && com.bytedance.tux.extension.player.e.f44963a == com.bytedance.tux.extension.player.d.PLAYER_PAUSE && (aVar = this.f44996d) != null) {
            this.f44995c = false;
            aVar.a();
            c();
        }
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.tux.extension.player.g f45011a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TuxPlayerView f45012b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.tux.extension.player.g f45013c;

        static {
            Covode.recordClassIndex(27466);
        }

        f(com.bytedance.tux.extension.player.g gVar, TuxPlayerView tuxPlayerView, com.bytedance.tux.extension.player.g gVar2) {
            this.f45011a = gVar;
            this.f45012b = tuxPlayerView;
            this.f45013c = gVar2;
        }

        public final void run() {
            View c2 = this.f45012b.c(R.id.fhs);
            com.bytedance.tux.extension.player.g gVar = this.f45011a;
            com.bytedance.tux.extension.player.g gVar2 = this.f45013c;
            l.c(gVar, "");
            l.c(gVar2, "");
            if (c2 != null) {
                int i2 = gVar.f44966a;
                int i3 = gVar.f44967b;
                int i4 = gVar2.f44966a;
                int i5 = gVar2.f44967b;
                l.c(c2, "");
                com.bytedance.tux.extension.player.g a2 = com.bytedance.tux.extension.player.a.e.a(i2, i3, i4, i5);
                int i6 = a2.f44966a;
                int i7 = a2.f44967b;
                ViewGroup.LayoutParams layoutParams = c2.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (marginLayoutParams.width == i6 && marginLayoutParams.height == i7) {
                        int i8 = Build.VERSION.SDK_INT;
                        return;
                    }
                    marginLayoutParams.width = i6;
                    marginLayoutParams.height = i7;
                    c2.setLayoutParams(marginLayoutParams);
                    return;
                }
                throw new w("null cannot be cast to non-null type");
            }
        }
    }

    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TuxPlayerView f45014a;

        static {
            Covode.recordClassIndex(27467);
        }

        g(TuxPlayerView tuxPlayerView) {
            this.f45014a = tuxPlayerView;
        }

        public final void run() {
            PlayerMaskView playerMaskView = (PlayerMaskView) this.f45014a.c(R.id.d68);
            playerMaskView.f44971c = true;
            int i2 = 0;
            if (!playerMaskView.f44970b) {
                Group group = (Group) playerMaskView.a(R.id.d5q);
                l.a((Object) group, "");
                group.setVisibility(0);
            }
            TuxPlayerStateView tuxPlayerStateView = (TuxPlayerStateView) playerMaskView.a(R.id.d5h);
            l.a((Object) tuxPlayerStateView, "");
            tuxPlayerStateView.setVisibility(8);
            com.bytedance.tux.extension.player.a player$player_release = this.f45014a.getPlayer$player_release();
            if (player$player_release != null) {
                i2 = player$player_release.h();
            }
            ((PlayerMaskView) this.f45014a.c(R.id.d68)).setNetSpeed(i2);
            Runnable runnable = this.f45014a.f44994b;
            if (runnable != null) {
                this.f45014a.getMainHandler().postDelayed(runnable, 1000);
            }
        }
    }

    private final void g() {
        if (com.bytedance.tux.extension.player.e.f44963a != com.bytedance.tux.extension.player.d.PLAYER_IDLE) {
            com.bytedance.tux.extension.player.e.a(com.bytedance.tux.extension.player.d.PLAYER_PAUSE);
            ((PlayerMaskView) c(R.id.d68)).e();
        } else {
            View a2 = ((PlayerMaskView) c(R.id.d68)).a(R.id.bx);
            l.a((Object) a2, "");
            a2.setVisibility(8);
        }
        ((TuxPlayerStateView) c(R.id.d5r)).a();
        ((TuxPlayerStateView) c(R.id.d5h)).a();
        ((PlayerMaskView) c(R.id.d68)).a();
        h();
    }

    @Override // com.bytedance.tux.extension.player.f
    public final void b() {
        com.bytedance.tux.extension.player.e.a(com.bytedance.tux.extension.player.d.PLAYER_IDLE);
        com.bytedance.tux.extension.player.a aVar = this.f44996d;
        if (aVar != null) {
            aVar.a(0.0f);
        }
        f();
        TuxTextView tuxTextView = (TuxTextView) c(R.id.d5v);
        l.a((Object) tuxTextView, "");
        tuxTextView.setText(com.bytedance.tux.extension.player.a.b.a(0));
        TuxSlider tuxSlider = (TuxSlider) c(R.id.e62);
        l.a((Object) tuxSlider, "");
        tuxSlider.setProgress(0);
        ImageView imageView = (ImageView) c(R.id.agf);
        l.a((Object) imageView, "");
        imageView.setVisibility(0);
        ((PlayerMaskView) c(R.id.d68)).d();
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        com.bytedance.tux.extension.player.e.a(com.bytedance.tux.extension.player.d.PLAYER_START);
        ((TuxPlayerStateView) c(R.id.d5r)).b();
        ((TuxPlayerStateView) c(R.id.d5h)).b();
        ((PlayerMaskView) c(R.id.d68)).e();
        ((PlayerMaskView) c(R.id.d68)).a(3000L);
        ((PlayerMaskView) c(R.id.d68)).d();
    }

    private final void i() {
        int i2 = b.f45022a[com.bytedance.tux.extension.player.e.f44964b.ordinal()];
        if (i2 == 1) {
            ImageView imageView = (ImageView) c(R.id.ayk);
            l.a((Object) imageView, "");
            imageView.setVisibility(8);
            ImageView imageView2 = (ImageView) c(R.id.b_i);
            l.a((Object) imageView2, "");
            imageView2.setVisibility(0);
            TuxPlayerStateView tuxPlayerStateView = (TuxPlayerStateView) c(R.id.d5r);
            l.a((Object) tuxPlayerStateView, "");
            tuxPlayerStateView.setVisibility(0);
            TuxPlayerStateView tuxPlayerStateView2 = (TuxPlayerStateView) c(R.id.d5h);
            l.a((Object) tuxPlayerStateView2, "");
            tuxPlayerStateView2.getLayoutParams().width = (int) getResources().getDimension(R.dimen.a0f);
            TuxPlayerStateView tuxPlayerStateView3 = (TuxPlayerStateView) c(R.id.d5h);
            l.a((Object) tuxPlayerStateView3, "");
            tuxPlayerStateView3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.a0f);
            TuxSpinner tuxSpinner = (TuxSpinner) c(R.id.d5s);
            l.a((Object) tuxSpinner, "");
            tuxSpinner.getLayoutParams().width = (int) getResources().getDimension(R.dimen.a0i);
            TuxSpinner tuxSpinner2 = (TuxSpinner) c(R.id.d5s);
            l.a((Object) tuxSpinner2, "");
            tuxSpinner2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.a0i);
            TuxSpinner tuxSpinner3 = (TuxSpinner) c(R.id.d5s);
            l.a((Object) tuxSpinner3, "");
            ViewGroup.LayoutParams layoutParams = tuxSpinner3.getLayoutParams();
            if (layoutParams != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) getResources().getDimension(R.dimen.a0h);
                TuxTextView tuxTextView = (TuxTextView) c(R.id.d5v);
                l.a((Object) tuxTextView, "");
                ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
                if (layoutParams2 != null) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = (int) getResources().getDimension(R.dimen.a0e);
                    TuxTextView tuxTextView2 = (TuxTextView) c(R.id.fg0);
                    l.a((Object) tuxTextView2, "");
                    ViewGroup.LayoutParams layoutParams3 = tuxTextView2.getLayoutParams();
                    if (layoutParams3 != null) {
                        ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = (int) getResources().getDimension(R.dimen.a0e);
                        ((TuxSlider) c(R.id.e62)).setPadding((int) getResources().getDimension(R.dimen.a0k), 0, (int) getResources().getDimension(R.dimen.a0k), 0);
                        ((TuxTextView) c(R.id.ahh)).setTextSize(0, getResources().getDimension(R.dimen.a0j));
                        ((TuxTextView) c(R.id.epp)).setTextSize(0, getResources().getDimension(R.dimen.a0j));
                        ((TuxTextView) c(R.id.ak3)).setTextSize(0, getResources().getDimension(R.dimen.a0g));
                        return;
                    }
                    throw new w("null cannot be cast to non-null type");
                }
                throw new w("null cannot be cast to non-null type");
            }
            throw new w("null cannot be cast to non-null type");
        } else if (i2 == 2) {
            ImageView imageView3 = (ImageView) c(R.id.ayk);
            l.a((Object) imageView3, "");
            imageView3.setVisibility(0);
            ImageView imageView4 = (ImageView) c(R.id.b_i);
            l.a((Object) imageView4, "");
            imageView4.setVisibility(8);
            TuxPlayerStateView tuxPlayerStateView4 = (TuxPlayerStateView) c(R.id.d5r);
            l.a((Object) tuxPlayerStateView4, "");
            tuxPlayerStateView4.setVisibility(8);
            TuxPlayerStateView tuxPlayerStateView5 = (TuxPlayerStateView) c(R.id.d5h);
            l.a((Object) tuxPlayerStateView5, "");
            tuxPlayerStateView5.getLayoutParams().width = (int) getResources().getDimension(R.dimen.a03);
            TuxPlayerStateView tuxPlayerStateView6 = (TuxPlayerStateView) c(R.id.d5h);
            l.a((Object) tuxPlayerStateView6, "");
            tuxPlayerStateView6.getLayoutParams().height = (int) getResources().getDimension(R.dimen.a03);
            TuxTextView tuxTextView3 = (TuxTextView) c(R.id.d5v);
            l.a((Object) tuxTextView3, "");
            ViewGroup.LayoutParams layoutParams4 = tuxTextView3.getLayoutParams();
            if (layoutParams4 != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = (int) getResources().getDimension(R.dimen.a0c);
                TuxTextView tuxTextView4 = (TuxTextView) c(R.id.fg0);
                l.a((Object) tuxTextView4, "");
                ViewGroup.LayoutParams layoutParams5 = tuxTextView4.getLayoutParams();
                if (layoutParams5 != null) {
                    ((ViewGroup.MarginLayoutParams) layoutParams5).rightMargin = (int) getResources().getDimension(R.dimen.a0c);
                    TuxSpinner tuxSpinner4 = (TuxSpinner) c(R.id.d5s);
                    l.a((Object) tuxSpinner4, "");
                    tuxSpinner4.getLayoutParams().width = (int) getResources().getDimension(R.dimen.a02);
                    TuxSpinner tuxSpinner5 = (TuxSpinner) c(R.id.d5s);
                    l.a((Object) tuxSpinner5, "");
                    tuxSpinner5.getLayoutParams().height = (int) getResources().getDimension(R.dimen.a02);
                    TuxSpinner tuxSpinner6 = (TuxSpinner) c(R.id.d5s);
                    l.a((Object) tuxSpinner6, "");
                    ViewGroup.LayoutParams layoutParams6 = tuxSpinner6.getLayoutParams();
                    if (layoutParams6 != null) {
                        ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = (int) getResources().getDimension(R.dimen.a01);
                        ((TuxSlider) c(R.id.e62)).setPadding((int) getResources().getDimension(R.dimen.a0d), 0, (int) getResources().getDimension(R.dimen.a0d), 0);
                        ((TuxTextView) c(R.id.ahh)).setTextSize(0, getResources().getDimension(R.dimen.a05));
                        ((TuxTextView) c(R.id.epp)).setTextSize(0, getResources().getDimension(R.dimen.a05));
                        ((TuxTextView) c(R.id.ak3)).setTextSize(0, getResources().getDimension(R.dimen.a04));
                        ImageView imageView5 = (ImageView) c(R.id.ayk);
                        l.a((Object) imageView5, "");
                        ViewGroup.LayoutParams layoutParams7 = imageView5.getLayoutParams();
                        if (layoutParams7 != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams7;
                            marginLayoutParams.leftMargin = (int) getResources().getDimension(R.dimen.a0a);
                            marginLayoutParams.topMargin = (int) getResources().getDimension(R.dimen.a0b);
                            return;
                        }
                        throw new w("null cannot be cast to non-null type");
                    }
                    throw new w("null cannot be cast to non-null type");
                }
                throw new w("null cannot be cast to non-null type");
            }
            throw new w("null cannot be cast to non-null type");
        } else if (i2 == 3) {
            ImageView imageView6 = (ImageView) c(R.id.ayk);
            l.a((Object) imageView6, "");
            imageView6.setVisibility(0);
            ImageView imageView7 = (ImageView) c(R.id.b_i);
            l.a((Object) imageView7, "");
            imageView7.setVisibility(8);
            TuxPlayerStateView tuxPlayerStateView7 = (TuxPlayerStateView) c(R.id.d5r);
            l.a((Object) tuxPlayerStateView7, "");
            tuxPlayerStateView7.setVisibility(8);
            TuxPlayerStateView tuxPlayerStateView8 = (TuxPlayerStateView) c(R.id.d5h);
            l.a((Object) tuxPlayerStateView8, "");
            tuxPlayerStateView8.getLayoutParams().width = (int) getResources().getDimension(R.dimen.a03);
            TuxPlayerStateView tuxPlayerStateView9 = (TuxPlayerStateView) c(R.id.d5h);
            l.a((Object) tuxPlayerStateView9, "");
            tuxPlayerStateView9.getLayoutParams().height = (int) getResources().getDimension(R.dimen.a03);
            TuxTextView tuxTextView5 = (TuxTextView) c(R.id.d5v);
            l.a((Object) tuxTextView5, "");
            ViewGroup.LayoutParams layoutParams8 = tuxTextView5.getLayoutParams();
            if (layoutParams8 != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams8).leftMargin = (int) getResources().getDimension(R.dimen.a08);
                TuxTextView tuxTextView6 = (TuxTextView) c(R.id.fg0);
                l.a((Object) tuxTextView6, "");
                ViewGroup.LayoutParams layoutParams9 = tuxTextView6.getLayoutParams();
                if (layoutParams9 != null) {
                    ((ViewGroup.MarginLayoutParams) layoutParams9).rightMargin = (int) getResources().getDimension(R.dimen.a08);
                    TuxSpinner tuxSpinner7 = (TuxSpinner) c(R.id.d5s);
                    l.a((Object) tuxSpinner7, "");
                    tuxSpinner7.getLayoutParams().width = (int) getResources().getDimension(R.dimen.a02);
                    TuxSpinner tuxSpinner8 = (TuxSpinner) c(R.id.d5s);
                    l.a((Object) tuxSpinner8, "");
                    tuxSpinner8.getLayoutParams().height = (int) getResources().getDimension(R.dimen.a02);
                    TuxSpinner tuxSpinner9 = (TuxSpinner) c(R.id.d5s);
                    l.a((Object) tuxSpinner9, "");
                    ViewGroup.LayoutParams layoutParams10 = tuxSpinner9.getLayoutParams();
                    if (layoutParams10 != null) {
                        ((ViewGroup.MarginLayoutParams) layoutParams10).topMargin = (int) getResources().getDimension(R.dimen.a01);
                        ((TuxSlider) c(R.id.e62)).setPadding((int) getResources().getDimension(R.dimen.a09), 0, (int) getResources().getDimension(R.dimen.a09), 0);
                        ((TuxTextView) c(R.id.ahh)).setTextSize(0, getResources().getDimension(R.dimen.a05));
                        ((TuxTextView) c(R.id.epp)).setTextSize(0, getResources().getDimension(R.dimen.a05));
                        ((TuxTextView) c(R.id.ak3)).setTextSize(0, getResources().getDimension(R.dimen.a04));
                        ImageView imageView8 = (ImageView) c(R.id.ayk);
                        l.a((Object) imageView8, "");
                        ViewGroup.LayoutParams layoutParams11 = imageView8.getLayoutParams();
                        if (layoutParams11 != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams11;
                            marginLayoutParams2.leftMargin = (int) getResources().getDimension(R.dimen.a06);
                            marginLayoutParams2.topMargin = (int) getResources().getDimension(R.dimen.a07);
                            return;
                        }
                        throw new w("null cannot be cast to non-null type");
                    }
                    throw new w("null cannot be cast to non-null type");
                }
                throw new w("null cannot be cast to non-null type");
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    public final void setFullScreenContainerView$player_release(ViewGroup viewGroup) {
        this.f44999h = viewGroup;
    }

    public final void setPlayer$player_release(com.bytedance.tux.extension.player.a aVar) {
        this.f44996d = aVar;
    }

    public final void setPlayerLogListener$player_release(com.bytedance.tux.extension.player.b bVar) {
        this.f44998g = bVar;
    }

    public final void setVideoSize$player_release(com.bytedance.tux.extension.player.g gVar) {
        this.f45001j = gVar;
    }

    public final void setWindow$player_release(Window window) {
        this.f45000i = window;
    }

    public static final class b extends com.bytedance.tux.extension.player.a.a {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f45005c = 300;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TuxPlayerView f45006d;

        static {
            Covode.recordClassIndex(27462);
        }

        public b(TuxPlayerView tuxPlayerView) {
            this.f45006d = tuxPlayerView;
        }

        @Override // com.bytedance.tux.extension.player.a.a
        public final void a(View view) {
            if (view != null && this.f45006d.getVideoSize$player_release() != null) {
                com.bytedance.tux.extension.player.a.c.c();
            }
        }
    }

    public static final class c extends com.bytedance.tux.extension.player.a.a {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f45007c = 300;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TuxPlayerView f45008d;

        static {
            Covode.recordClassIndex(27463);
        }

        public c(TuxPlayerView tuxPlayerView) {
            this.f45008d = tuxPlayerView;
        }

        @Override // com.bytedance.tux.extension.player.a.a
        public final void a(View view) {
            if (view == null) {
                return;
            }
            if (com.bytedance.tux.extension.player.e.f44963a == com.bytedance.tux.extension.player.d.PLAYER_START) {
                this.f45008d.f();
                return;
            }
            com.bytedance.tux.extension.player.b playerLogListener$player_release = this.f45008d.getPlayerLogListener$player_release();
            if (playerLogListener$player_release != null) {
                playerLogListener$player_release.a();
            }
            this.f45008d.b(0);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TuxPlayerView(Context context) {
        this(context, null);
        l.c(context, "");
    }

    public final void setCoverImage$player_release(Bitmap bitmap) {
        this.f45003l = bitmap;
        ((TextureVideoView) c(R.id.fhs)).setCoverImage(bitmap);
    }

    @Override // com.bytedance.tux.extension.player.f
    public final void b(String str) {
        l.c(str, "");
        Group group = (Group) ((PlayerMaskView) c(R.id.d68)).a(R.id.fh1);
        l.a((Object) group, "");
        group.setVisibility(0);
    }

    @Override // com.bytedance.tux.extension.player.f
    public final void a(float f2) {
        TuxTextView tuxTextView = (TuxTextView) c(R.id.d5v);
        l.a((Object) tuxTextView, "");
        int i2 = (int) f2;
        tuxTextView.setText(com.bytedance.tux.extension.player.a.b.a(i2, this.f45002k));
        if (!this.f44993a) {
            TuxSlider tuxSlider = (TuxSlider) c(R.id.e62);
            l.a((Object) tuxSlider, "");
            tuxSlider.setProgress(i2);
        }
    }

    public final void b(int i2) {
        com.bytedance.tux.extension.player.a aVar = this.f44996d;
        if (aVar != null) {
            this.f44995c = false;
            float f2 = (float) i2;
            int i3 = (int) ((((float) this.f45002k) / 100.0f) * f2);
            if (com.bytedance.tux.extension.player.e.f44963a == com.bytedance.tux.extension.player.d.PLAYER_IDLE) {
                aVar.a(i3);
            } else if (com.bytedance.tux.extension.player.e.f44963a == com.bytedance.tux.extension.player.d.PLAYER_PAUSE) {
                if (i2 > 0) {
                    aVar.a(f2);
                }
                aVar.a();
            } else {
                aVar.a(f2);
            }
            c();
        }
    }

    public final void setVideoLength$player_release(int i2) {
        this.f45002k = i2;
        String a2 = com.bytedance.tux.extension.player.a.b.a(i2);
        TuxTextView tuxTextView = (TuxTextView) c(R.id.fg0);
        l.a((Object) tuxTextView, "");
        tuxTextView.setText(a2);
        TuxTextView tuxTextView2 = (TuxTextView) c(R.id.epp);
        l.a((Object) tuxTextView2, "");
        tuxTextView2.setText(a2);
    }

    @Override // com.bytedance.tux.extension.player.f
    public final void a(int i2) {
        TuxSlider tuxSlider = (TuxSlider) c(R.id.e62);
        l.a((Object) tuxSlider, "");
        tuxSlider.setSecondaryProgress(i2);
    }

    public final void setParams(a aVar) {
        int i2;
        com.bytedance.tux.extension.player.a aVar2;
        ViewGroup viewGroup;
        Window window;
        com.bytedance.tux.extension.player.g gVar;
        Bitmap bitmap;
        Integer num;
        this.f44997f = aVar;
        if (aVar == null || (num = aVar.f45019e) == null) {
            i2 = 0;
        } else {
            i2 = num.intValue();
        }
        setVideoLength$player_release(i2);
        a aVar3 = this.f44997f;
        com.bytedance.tux.extension.player.b bVar = null;
        if (aVar3 != null) {
            aVar2 = aVar3.f45015a;
        } else {
            aVar2 = null;
        }
        this.f44996d = aVar2;
        a aVar4 = this.f44997f;
        if (aVar4 != null) {
            viewGroup = aVar4.f45016b;
        } else {
            viewGroup = null;
        }
        this.f44999h = viewGroup;
        a aVar5 = this.f44997f;
        if (aVar5 != null) {
            window = aVar5.f45017c;
        } else {
            window = null;
        }
        this.f45000i = window;
        a aVar6 = this.f44997f;
        if (aVar6 != null) {
            gVar = aVar6.f45018d;
        } else {
            gVar = null;
        }
        this.f45001j = gVar;
        a aVar7 = this.f44997f;
        if (aVar7 != null) {
            bitmap = aVar7.f45020f;
        } else {
            bitmap = null;
        }
        setCoverImage$player_release(bitmap);
        a aVar8 = this.f44997f;
        if (aVar8 != null) {
            bVar = aVar8.f45021g;
        }
        this.f44998g = bVar;
    }

    @Override // com.bytedance.tux.extension.player.a.c.a
    public final void a(com.bytedance.tux.extension.player.c cVar) {
        l.c(cVar, "");
        com.bytedance.tux.extension.player.e.a(cVar);
        if (com.bytedance.tux.extension.player.e.f44964b != com.bytedance.tux.extension.player.c.PREVIEW) {
            if (this.f44996d != null && com.bytedance.tux.extension.player.e.f44963a == com.bytedance.tux.extension.player.d.PLAYER_START) {
                PlayerMaskView playerMaskView = (PlayerMaskView) c(R.id.d68);
                playerMaskView.f44972d = false;
                ConstraintLayout constraintLayout = (ConstraintLayout) playerMaskView.a(R.id.ad7);
                l.a((Object) constraintLayout, "");
                constraintLayout.setAlpha(0.0f);
            }
        } else if (this.f44996d != null) {
            if (com.bytedance.tux.extension.player.e.f44963a == com.bytedance.tux.extension.player.d.PLAYER_START) {
                ((PlayerMaskView) c(R.id.d68)).b();
            } else {
                ((PlayerMaskView) c(R.id.d68)).a();
            }
        }
        ((PlayerMaskView) c(R.id.d68)).d();
        i();
    }

    @Override // com.bytedance.tux.extension.player.f
    public final void a(String str) {
        l.c(str, "");
        Group group = (Group) ((PlayerMaskView) c(R.id.d68)).a(R.id.fg2);
        l.a((Object) group, "");
        group.setVisibility(0);
    }

    @Override // com.bytedance.tux.extension.player.f
    public final void a(boolean z) {
        if (z) {
            ((PlayerMaskView) c(R.id.d68)).b();
            getMainHandler().removeCallbacksAndMessages(null);
            g gVar = new g(this);
            this.f44994b = gVar;
            getMainHandler().postDelayed(gVar, 1000);
            return;
        }
        h();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TuxPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        l.c(context, "");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(8325);
        super.onMeasure(i2, i3);
        com.bytedance.tux.extension.player.g gVar = new com.bytedance.tux.extension.player.g(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i3));
        com.bytedance.tux.extension.player.g gVar2 = this.f45001j;
        if (gVar2 != null) {
            post(new f(gVar2, this, gVar));
            MethodCollector.o(8325);
            return;
        }
        MethodCollector.o(8325);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxPlayerView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, R.attr.c0);
        l.c(context, "");
        MethodCollector.i(8620);
        this.f44995c = true;
        this.f45004m = h.i.a((h.f.a.a) e.f45010a);
        com.a.a(LayoutInflater.from(getContext()), R.layout.bjp, this, true);
        i();
        ImageView imageView = (ImageView) c(R.id.ayk);
        l.a((Object) imageView, "");
        imageView.setOnClickListener(new b(this));
        TuxPlayerStateView tuxPlayerStateView = (TuxPlayerStateView) c(R.id.d5h);
        l.a((Object) tuxPlayerStateView, "");
        tuxPlayerStateView.setOnClickListener(new c(this));
        ((PlayerMaskView) c(R.id.d68)).setOnPlayerActionBarListener(new d(this));
        MethodCollector.o(8620);
    }
}
