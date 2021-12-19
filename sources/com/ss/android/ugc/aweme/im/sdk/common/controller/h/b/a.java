package com.ss.android.ugc.aweme.im.sdk.common.controller.h.b;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a implements ViewTreeObserver.OnDrawListener {

    /* renamed from: c  reason: collision with root package name */
    public static final C2562a f102316c = new C2562a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final View f102317a;

    /* renamed from: b  reason: collision with root package name */
    public final b f102318b;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f102319d = new Handler(Looper.getMainLooper());

    /* renamed from: e  reason: collision with root package name */
    private boolean f102320e;

    public interface b {
        static {
            Covode.recordClassIndex(65476);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(65474);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.h.b.a$a  reason: collision with other inner class name */
    public static final class C2562a {
        static {
            Covode.recordClassIndex(65475);
        }

        private C2562a() {
        }

        public /* synthetic */ C2562a(byte b2) {
            this();
        }

        public static a a(View view, b bVar) {
            l.d(view, "");
            l.d(bVar, "");
            return new a(view, bVar);
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f102321a;

        static {
            Covode.recordClassIndex(65477);
        }

        c(a aVar) {
            this.f102321a = aVar;
        }

        public final void run() {
            this.f102321a.f102318b.a();
        }
    }

    public final void onDraw() {
        if (!this.f102320e) {
            this.f102320e = true;
            this.f102319d.postAtFrontOfQueue(new c(this));
            this.f102319d.post(new d(this));
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f102322a;

        static {
            Covode.recordClassIndex(65478);
        }

        d(a aVar) {
            this.f102322a = aVar;
        }

        public final void run() {
            ViewTreeObserver viewTreeObserver = this.f102322a.f102317a.getViewTreeObserver();
            l.b(viewTreeObserver, "");
            if (viewTreeObserver.isAlive()) {
                this.f102322a.f102317a.getViewTreeObserver().removeOnDrawListener(this.f102322a);
            }
        }
    }

    public static final class e implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f102323a;

        static {
            Covode.recordClassIndex(65479);
        }

        public final void onViewDetachedFromWindow(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(a aVar) {
            this.f102323a = aVar;
        }

        public final void onViewAttachedToWindow(View view) {
            ViewTreeObserver viewTreeObserver = this.f102323a.f102317a.getViewTreeObserver();
            l.b(viewTreeObserver, "");
            if (viewTreeObserver.isAlive()) {
                this.f102323a.f102317a.getViewTreeObserver().addOnDrawListener(this.f102323a);
            }
            this.f102323a.f102317a.removeOnAttachStateChangeListener(this);
        }
    }

    public a(View view, b bVar) {
        l.d(view, "");
        l.d(bVar, "");
        this.f102317a = view;
        this.f102318b = bVar;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        l.b(viewTreeObserver, "");
        if (!viewTreeObserver.isAlive() || !view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new e(this));
        } else {
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }
}
