package com.bytedance.android.live.liveinteract.linkroom.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class ad {

    /* renamed from: a  reason: collision with root package name */
    static boolean f10626a;

    /* renamed from: b  reason: collision with root package name */
    static Runnable f10627b;

    /* renamed from: c  reason: collision with root package name */
    public static final ad f10628c = new ad();

    /* renamed from: d  reason: collision with root package name */
    private static a f10629d = a.NOTCOHOST;

    public enum a {
        NOTCOHOST(0),
        COHOST(1);
        
        private final int value;

        public final int getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(5659);
        }

        private a(int i2) {
            this.value = i2;
        }
    }

    public enum b {
        MULTIGUEST(0),
        PK(1);
        
        private final int value;

        public final int getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(5660);
        }

        private b(int i2) {
            this.value = i2;
        }
    }

    private ad() {
    }

    static {
        Covode.recordClassIndex(5658);
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f10632a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f10633b;

        static {
            Covode.recordClassIndex(5661);
        }

        c(Runnable runnable, View view) {
            this.f10632a = runnable;
            this.f10633b = view;
        }

        public final void run() {
            this.f10632a.run();
            if (this.f10633b.getVisibility() == 0) {
                ObjectAnimator.ofFloat(this.f10633b, "alpha", 0.0f, 1.0f).setDuration(200L).start();
            }
        }
    }

    public static void a(a aVar) {
        l.d(aVar, "");
        f10629d = aVar;
    }

    public static final class d implements ae {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f10634a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f10635b;

        static {
            Covode.recordClassIndex(5662);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            this.f10634a.setAlpha(1.0f);
            this.f10635b.run();
            ad.f10626a = false;
            Runnable runnable = ad.f10627b;
            if (runnable != null) {
                runnable.run();
            }
            ad.f10627b = null;
        }

        d(View view, Runnable runnable) {
            this.f10634a = view;
            this.f10635b = runnable;
        }
    }

    public static void b(View view, Runnable runnable, b bVar) {
        l.d(runnable, "");
        l.d(bVar, "");
        if (view == null || view.getVisibility() == 0 || bVar.getValue() == f10629d.getValue()) {
            runnable.run();
            return;
        }
        c cVar = new c(runnable, view);
        if (f10626a) {
            f10627b = cVar;
        } else {
            cVar.run();
        }
    }

    public static void a(View view, Runnable runnable, b bVar) {
        l.d(runnable, "");
        l.d(bVar, "");
        if (view != null && view.getVisibility() == 0 && bVar.getValue() == f10629d.getValue()) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f).setDuration(200L);
            l.b(duration, "");
            duration.addListener(new d(view, runnable));
            f10626a = true;
            duration.start();
            return;
        }
        runnable.run();
    }
}
