package com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.n;
import h.f.b.l;
import java.io.File;

public final class d {

    /* renamed from: i  reason: collision with root package name */
    public static final a f99563i = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public RemoteImageView f99564a;

    /* renamed from: b  reason: collision with root package name */
    public int f99565b;

    /* renamed from: c  reason: collision with root package name */
    public int f99566c;

    /* renamed from: d  reason: collision with root package name */
    ObjectAnimator f99567d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f99568e;

    /* renamed from: f  reason: collision with root package name */
    public final ViewGroup f99569f;

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f99570g;

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f99571h;

    /* renamed from: j  reason: collision with root package name */
    private final String f99572j;

    /* renamed from: k  reason: collision with root package name */
    private final String f99573k;

    /* renamed from: l  reason: collision with root package name */
    private final String f99574l;

    /* renamed from: m  reason: collision with root package name */
    private AnimatorSet f99575m;
    private boolean n;

    static {
        Covode.recordClassIndex(63494);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(63496);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final boolean c() {
        if (this.f99565b == 1) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f99565b == 2) {
            return true;
        }
        return false;
    }

    public static final class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f99578a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f99579b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f99580c;

        static {
            Covode.recordClassIndex(63498);
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f99581a;

            static {
                Covode.recordClassIndex(63499);
            }

            a(c cVar) {
                this.f99581a = cVar;
            }

            public final void run() {
                this.f99581a.f99578a.a();
                this.f99581a.f99578a.a(true);
                this.f99581a.f99578a.f99565b = 0;
            }
        }

        public final void onAnimationEnd(Animator animator) {
            RemoteImageView remoteImageView;
            d dVar;
            RemoteImageView remoteImageView2;
            l.d(animator, "");
            super.onAnimationEnd(animator);
            if (this.f99579b && (remoteImageView2 = (dVar = this.f99578a).f99564a) != null) {
                dVar.a();
                dVar.f99567d = ObjectAnimator.ofPropertyValuesHolder(remoteImageView2, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.9f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.9f, 1.0f));
                ObjectAnimator objectAnimator = dVar.f99567d;
                if (objectAnimator != null) {
                    objectAnimator.setInterpolator(new com.ss.android.ugc.aweme.bd.a());
                }
                ObjectAnimator objectAnimator2 = dVar.f99567d;
                if (objectAnimator2 != null) {
                    objectAnimator2.setDuration(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                }
                ObjectAnimator objectAnimator3 = dVar.f99567d;
                if (objectAnimator3 != null) {
                    objectAnimator3.setRepeatCount(2);
                }
                ObjectAnimator objectAnimator4 = dVar.f99567d;
                if (objectAnimator4 != null) {
                    objectAnimator4.setRepeatMode(1);
                }
                ObjectAnimator objectAnimator5 = dVar.f99567d;
                if (objectAnimator5 != null) {
                    objectAnimator5.start();
                }
            }
            if (this.f99580c && (remoteImageView = this.f99578a.f99564a) != null) {
                remoteImageView.postDelayed(new a(this), 5000);
            }
        }

        c(d dVar, boolean z, boolean z2) {
            this.f99578a = dVar;
            this.f99579b = z;
            this.f99580c = z2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f99577a;

        static {
            Covode.recordClassIndex(63497);
        }

        b(d dVar) {
            this.f99577a = dVar;
        }

        public final void run() {
            this.f99577a.f99570g.setScaleX(1.0f);
            this.f99577a.f99570g.setScaleY(1.0f);
            this.f99577a.f99571h.setScaleX(1.0f);
            this.f99577a.f99571h.setScaleY(1.0f);
            RemoteImageView remoteImageView = this.f99577a.f99564a;
            if (remoteImageView != null) {
                remoteImageView.setVisibility(4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        AnimatorSet animatorSet = this.f99575m;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.f99575m;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.f99575m = null;
    }

    public final void a() {
        ObjectAnimator objectAnimator = this.f99567d;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
        }
        ObjectAnimator objectAnimator2 = this.f99567d;
        if (objectAnimator2 != null) {
            objectAnimator2.end();
        }
        ObjectAnimator objectAnimator3 = this.f99567d;
        if (objectAnimator3 != null) {
            objectAnimator3.cancel();
        }
        this.f99567d = null;
    }

    public static void a(View view) {
        if (view != null) {
            view.setPivotX(((float) view.getMeasuredWidth()) / 2.0f);
            view.setPivotY(((float) view.getMeasuredHeight()) / 2.0f);
        }
    }

    public final void c(boolean z) {
        int i2 = 0;
        if (!z) {
            this.f99565b = 0;
            return;
        }
        int i3 = this.f99566c;
        if (i3 == 1) {
            i2 = 1;
        } else if (i3 == 3) {
            i2 = 2;
        }
        this.f99565b = i2;
    }

    private static ObjectAnimator b(View view) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("scaleX", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f));
        l.b(ofPropertyValuesHolder, "");
        ofPropertyValuesHolder.setInterpolator(new com.ss.android.ugc.aweme.bd.a());
        ofPropertyValuesHolder.setDuration(400L);
        return ofPropertyValuesHolder;
    }

    private static ObjectAnimator c(View view) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.0f));
        l.b(ofPropertyValuesHolder, "");
        ofPropertyValuesHolder.setInterpolator(new com.ss.android.ugc.aweme.bd.a());
        ofPropertyValuesHolder.setDuration(400L);
        return ofPropertyValuesHolder;
    }

    public final void b(boolean z) {
        int i2 = this.f99565b;
        if (i2 != 1 && i2 != 2) {
            this.n = false;
            this.f99566c = 3;
            RemoteImageView remoteImageView = this.f99564a;
            if (remoteImageView != null) {
                remoteImageView.setImageURI(Uri.fromFile(new File(this.f99574l)));
            }
            RemoteImageView remoteImageView2 = this.f99564a;
            if (remoteImageView2 != null) {
                remoteImageView2.setVisibility(0);
            }
            a(false, z);
        }
    }

    public final void a(boolean z) {
        if (this.f99565b != 0) {
            this.n = true;
            b();
            a();
            if (z) {
                a(this.f99570g, this.f99571h, this.f99564a);
                AnimatorSet d2 = d(this.f99570g, this.f99571h, this.f99564a);
                if (d2 != null) {
                    d2.start();
                    return;
                }
                return;
            }
            this.f99570g.post(new b(this));
        }
    }

    private final void a(boolean z, boolean z2) {
        b(this.f99564a, this.f99570g, this.f99571h);
        RemoteImageView remoteImageView = this.f99564a;
        if (remoteImageView != null) {
            remoteImageView.setVisibility(0);
        }
        AnimatorSet c2 = c(this.f99564a, this.f99570g, this.f99571h);
        this.f99575m = c2;
        if (c2 != null) {
            c2.addListener(new c(this, z2, false));
        }
        AnimatorSet animatorSet = this.f99575m;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    private static void b(View view, View view2, View view3) {
        if (view != null) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
        if (view2 != null) {
            view2.setScaleX(1.0f);
            view2.setScaleY(1.0f);
        }
        if (view3 != null) {
            view3.setScaleX(1.0f);
            view3.setScaleY(1.0f);
        }
    }

    private static void a(View view, View view2, View view3) {
        if (view != null) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
        if (view2 != null) {
            view2.setScaleX(0.0f);
            view2.setScaleY(0.0f);
        }
        if (view3 != null) {
            view3.setScaleX(1.0f);
            view3.setScaleY(1.0f);
        }
    }

    private static AnimatorSet c(View view, View view2, View view3) {
        if (view == null || view2 == null || view3 == null) {
            return null;
        }
        ObjectAnimator b2 = b(view);
        ObjectAnimator c2 = c(view2);
        ObjectAnimator c3 = c(view3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(b2).with(c2).with(c3);
        return animatorSet;
    }

    private static AnimatorSet d(View view, View view2, View view3) {
        if (view == null || view2 == null || view3 == null) {
            return null;
        }
        ObjectAnimator b2 = b(view);
        ObjectAnimator b3 = b(view2);
        ObjectAnimator c2 = c(view3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(b2).with(b3).with(c2);
        return animatorSet;
    }

    public d(Context context, ViewGroup viewGroup, ImageView imageView, ImageView imageView2) {
        l.d(context, "");
        l.d(viewGroup, "");
        l.d(imageView, "");
        l.d(imageView2, "");
        MethodCollector.i(5457);
        this.f99568e = context;
        this.f99569f = viewGroup;
        this.f99570g = imageView;
        this.f99571h = imageView2;
        StringBuilder sb = new StringBuilder();
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        l.b(applicationContext, "");
        if (com.ss.android.ugc.aweme.lancet.d.f107195c == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
            com.ss.android.ugc.aweme.lancet.d.f107195c = applicationContext.getFilesDir();
        }
        String sb2 = sb.append(com.ss.android.ugc.aweme.lancet.d.f107195c.toString()).append(File.separator).append("superentrance").toString();
        this.f99572j = sb2;
        this.f99573k = sb2 + File.separator + "plusicon.png";
        this.f99574l = sb2 + File.separator + "special_plus_icon.png";
        RemoteImageView remoteImageView = new RemoteImageView(viewGroup.getContext());
        this.f99564a = remoteImageView;
        remoteImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        RemoteImageView remoteImageView2 = this.f99564a;
        if (remoteImageView2 != null) {
            remoteImageView2.setVisibility(8);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(n.a(45.0d), n.a(45.0d));
        layoutParams.gravity = 17;
        RemoteImageView remoteImageView3 = this.f99564a;
        if (remoteImageView3 != null) {
            remoteImageView3.setLayoutParams(layoutParams);
        }
        RemoteImageView remoteImageView4 = this.f99564a;
        if (remoteImageView4 != null) {
            viewGroup.addView(remoteImageView4);
        }
        imageView.post(new Runnable(this) {
            /* class com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a.d.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f99576a;

            static {
                Covode.recordClassIndex(63495);
            }

            {
                this.f99576a = r1;
            }

            public final void run() {
                d.a(this.f99576a.f99570g);
                d.a(this.f99576a.f99571h);
            }
        });
        MethodCollector.o(5457);
    }
}
