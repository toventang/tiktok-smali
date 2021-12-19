package com.bytedance.tux.extension.player.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import androidx.appcompat.view.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.e.a;
import com.bytedance.tux.extension.player.g;
import com.bytedance.tux.extension.player.view.TextureVideoView;
import com.bytedance.tux.extension.player.view.TuxPlayerView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.z;
import h.w;

public final class c implements KeyEvent.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f44931a = new int[2];

    /* renamed from: b  reason: collision with root package name */
    public static int f44932b;

    /* renamed from: c  reason: collision with root package name */
    public static int f44933c;

    /* renamed from: d  reason: collision with root package name */
    public static i f44934d;

    /* renamed from: e  reason: collision with root package name */
    public static Window.Callback f44935e;

    /* renamed from: f  reason: collision with root package name */
    public static TuxPlayerView f44936f;

    /* renamed from: g  reason: collision with root package name */
    public static a f44937g;

    /* renamed from: h  reason: collision with root package name */
    public static ViewGroup f44938h;

    /* renamed from: i  reason: collision with root package name */
    public static ViewGroup.LayoutParams f44939i;

    /* renamed from: j  reason: collision with root package name */
    public static ViewGroup f44940j;

    /* renamed from: k  reason: collision with root package name */
    public static ImageView f44941k;

    /* renamed from: l  reason: collision with root package name */
    static float f44942l;

    /* renamed from: m  reason: collision with root package name */
    static float f44943m;
    static float n;
    static float o;
    public static com.bytedance.tux.extension.player.c p = com.bytedance.tux.extension.player.c.PREVIEW;
    public static final c q = new c();

    public interface a {
        static {
            Covode.recordClassIndex(27425);
        }

        void a(com.bytedance.tux.extension.player.c cVar);
    }

    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        l.c(keyEvent, "");
        return i2 == 4;
    }

    public final boolean onKeyLongPress(int i2, KeyEvent keyEvent) {
        return false;
    }

    public final boolean onKeyMultiple(int i2, int i3, KeyEvent keyEvent) {
        return false;
    }

    public static final class e extends AnimatorListenerAdapter {
        static {
            Covode.recordClassIndex(27430);
        }

        e() {
        }

        public final void onAnimationEnd(Animator animator) {
            l.c(animator, "");
            c.a((View) c.f44941k);
            c.b();
        }
    }

    private c() {
    }

    /* renamed from: com.bytedance.tux.extension.player.a.c$c  reason: collision with other inner class name */
    public static final class C1101c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TuxPlayerView f44945a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f44946b;

        static {
            Covode.recordClassIndex(27427);
        }

        /* renamed from: com.bytedance.tux.extension.player.a.c$c$a */
        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ImageView f44947a;

            static {
                Covode.recordClassIndex(27428);
            }

            a(ImageView imageView) {
                this.f44947a = imageView;
            }

            public final void run() {
                c.a((View) this.f44947a);
            }
        }

        public final void onAnimationEnd(Animator animator) {
            l.c(animator, "");
            c.p = com.bytedance.tux.extension.player.c.PORTRAIT;
            c.a(this.f44945a);
            ViewGroup.LayoutParams layoutParams = this.f44945a.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            this.f44945a.setLayoutParams(layoutParams);
            ViewGroup viewGroup = this.f44946b;
            c.a(viewGroup, this.f44945a, Integer.valueOf(viewGroup.getChildCount() - 1));
            a aVar = c.f44937g;
            if (aVar != null) {
                aVar.a(c.p);
            }
            ImageView imageView = c.f44941k;
            if (imageView != null) {
                imageView.post(new a(imageView));
            }
        }

        public C1101c(TuxPlayerView tuxPlayerView, ViewGroup viewGroup) {
            this.f44945a = tuxPlayerView;
            this.f44946b = viewGroup;
        }
    }

    static {
        Covode.recordClassIndex(27424);
    }

    public static void b() {
        f44940j = null;
        f44941k = null;
        f44936f = null;
        f44938h = null;
        f44939i = null;
        f44937g = null;
        f44934d = null;
        f44935e = null;
    }

    public static boolean a() {
        if (p == com.bytedance.tux.extension.player.c.PORTRAIT || p == com.bytedance.tux.extension.player.c.HORIZONTAL) {
            return true;
        }
        return false;
    }

    public static void c() {
        Context context;
        Window window;
        Context context2;
        Window window$player_release;
        Window window$player_release2;
        View c2;
        TuxPlayerView tuxPlayerView = f44936f;
        if (tuxPlayerView != null) {
            context = tuxPlayerView.getContext();
        } else {
            context = null;
        }
        TuxPlayerView tuxPlayerView2 = f44936f;
        if (tuxPlayerView2 != null) {
            window = tuxPlayerView2.getWindow$player_release();
        } else {
            window = null;
        }
        a(window);
        if (p == com.bytedance.tux.extension.player.c.PORTRAIT) {
            p = com.bytedance.tux.extension.player.c.PREVIEW;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            a(f44941k);
            a(f44940j, f44941k, null);
            a(f44936f);
            TuxPlayerView tuxPlayerView3 = f44936f;
            if (tuxPlayerView3 != null) {
                tuxPlayerView3.setLayoutParams(f44939i);
            }
            a(f44938h, f44936f, null);
            TuxPlayerView tuxPlayerView4 = f44936f;
            if (!(tuxPlayerView4 == null || (window$player_release2 = tuxPlayerView4.getWindow$player_release()) == null)) {
                TuxPlayerView tuxPlayerView5 = f44936f;
                if (!(tuxPlayerView5 == null || (c2 = tuxPlayerView5.c(R.id.e_f)) == null)) {
                    c2.setVisibility(8);
                }
                if (context != null) {
                    a.C1099a.a((androidx.fragment.app.e) context, window$player_release2).a(false, false).b(true).a().e(-1).c(true).f44923a.d();
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            }
            a aVar = f44937g;
            if (aVar != null) {
                aVar.a(p);
            }
            ofFloat.addUpdateListener(d.f44948a);
            ofFloat.addListener(new e());
            l.a((Object) ofFloat, "");
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(new AccelerateInterpolator());
            ofFloat.start();
        } else if (p == com.bytedance.tux.extension.player.c.HORIZONTAL) {
            p = com.bytedance.tux.extension.player.c.PREVIEW;
            if (!(context instanceof Activity)) {
                context2 = null;
            } else {
                context2 = context;
            }
            a((Activity) context2, 1);
            a(f44936f);
            TuxPlayerView tuxPlayerView6 = f44936f;
            if (tuxPlayerView6 != null) {
                tuxPlayerView6.setLayoutParams(f44939i);
            }
            a(f44938h, f44936f, null);
            TuxPlayerView tuxPlayerView7 = f44936f;
            if (!(tuxPlayerView7 == null || (window$player_release = tuxPlayerView7.getWindow$player_release()) == null)) {
                if (context != null) {
                    a.C1099a.a((androidx.fragment.app.e) context, window$player_release).a(false, false).b(true).a().e(-1).c(true).f44923a.d();
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            }
            a aVar2 = f44937g;
            if (aVar2 != null) {
                aVar2.a(p);
            }
            b();
        }
    }

    private static void a(Window window) {
        Window.Callback callback = f44935e;
        if (callback != null && window != null) {
            window.setCallback(callback);
        }
    }

    public static void a(ImageView imageView) {
        TextureVideoView textureVideoView;
        Bitmap videoFrame;
        TuxPlayerView tuxPlayerView = f44936f;
        if (tuxPlayerView != null && (textureVideoView = (TextureVideoView) tuxPlayerView.c(R.id.fhs)) != null && (videoFrame = textureVideoView.getVideoFrame()) != null && imageView != null) {
            imageView.setImageBitmap(videoFrame);
        }
    }

    public static final class f extends i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.e f44949a;

        static {
            Covode.recordClassIndex(27431);
        }

        @Override // androidx.appcompat.view.i
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            l.c(keyEvent, "");
            if (c.a() && keyEvent.getKeyCode() == 4) {
                KeyEvent.Callback callback = c.q;
                if (keyEvent.dispatch(callback, new KeyEvent.DispatcherState(), callback)) {
                    return true;
                }
            }
            return super.dispatchKeyEvent(keyEvent);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(z.e eVar, Window.Callback callback) {
            super(callback);
            this.f44949a = eVar;
        }
    }

    public static void a(View view) {
        MethodCollector.i(7985);
        if (view == null || view.getParent() == null) {
            MethodCollector.o(7985);
            return;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup == null) {
            MethodCollector.o(7985);
            return;
        }
        try {
            viewGroup.removeView(view);
            MethodCollector.o(7985);
        } catch (Exception unused) {
            MethodCollector.o(7985);
        }
    }

    public static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f44944a;

        static {
            Covode.recordClassIndex(27426);
        }

        public b(Rect rect) {
            this.f44944a = rect;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams;
            l.a((Object) valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                c.f44942l = (float) this.f44944a.width();
                c.f44943m = (float) this.f44944a.height();
                g a2 = e.a(c.f44933c, c.f44932b, (int) c.f44942l, (int) c.f44943m);
                c.n = (float) a2.f44966a;
                c.o = (float) a2.f44967b;
                ImageView imageView = c.f44941k;
                if (imageView == null || (layoutParams = imageView.getLayoutParams()) == null) {
                    throw new w("null cannot be cast to non-null type");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = (int) (((float) c.f44931a[1]) - ((((float) c.f44931a[1]) - ((c.f44943m - c.o) / 2.0f)) * floatValue));
                marginLayoutParams.leftMargin = (int) (((float) c.f44931a[0]) - ((((float) c.f44931a[0]) - ((c.f44942l - c.n) / 2.0f)) * floatValue));
                marginLayoutParams.width = (int) (((float) c.f44933c) + ((c.n - ((float) c.f44933c)) * floatValue));
                marginLayoutParams.height = (int) (((float) c.f44932b) + (floatValue * (c.o - ((float) c.f44932b))));
                ImageView imageView2 = c.f44941k;
                if (imageView2 != null) {
                    imageView2.setLayoutParams(marginLayoutParams);
                    return;
                }
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static final d f44948a = new d();

        static {
            Covode.recordClassIndex(27429);
        }

        d() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.a((Object) valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                ImageView imageView = c.f44941k;
                if (imageView == null) {
                    l.a();
                }
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = (int) (((c.f44943m - c.o) / 2.0f) + ((((float) c.f44931a[1]) - ((c.f44943m - c.o) / 2.0f)) * floatValue));
                    marginLayoutParams.leftMargin = (int) (((c.f44942l - c.n) / 2.0f) + ((((float) c.f44931a[0]) - ((c.f44942l - c.n) / 2.0f)) * floatValue));
                    float f2 = 1.0f - floatValue;
                    marginLayoutParams.width = (int) (((float) c.f44933c) + ((c.n - ((float) c.f44933c)) * f2));
                    marginLayoutParams.height = (int) (((float) c.f44932b) + (f2 * (c.o - ((float) c.f44932b))));
                    ImageView imageView2 = c.f44941k;
                    if (imageView2 != null) {
                        imageView2.setLayoutParams(marginLayoutParams);
                        return;
                    }
                    return;
                }
                throw new w("null cannot be cast to non-null type");
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    public static void a(Activity activity, int i2) {
        if (activity != null) {
            try {
                activity.setRequestedOrientation(i2);
            } catch (Throwable unused) {
            }
        }
    }

    public final boolean onKeyUp(int i2, KeyEvent keyEvent) {
        l.c(keyEvent, "");
        if (!a() || i2 != 4 || keyEvent.isCanceled()) {
            return false;
        }
        c();
        return true;
    }

    public static void a(ViewGroup viewGroup, View view, Integer num) {
        int i2;
        MethodCollector.i(7986);
        if (viewGroup != null) {
            if (num != null) {
                try {
                    i2 = num.intValue();
                } catch (Exception unused) {
                    MethodCollector.o(7986);
                    return;
                }
            } else {
                i2 = viewGroup.getChildCount();
            }
            viewGroup.addView(view, i2);
            MethodCollector.o(7986);
            return;
        }
        MethodCollector.o(7986);
    }
}
