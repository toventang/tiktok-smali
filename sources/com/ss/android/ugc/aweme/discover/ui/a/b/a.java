package com.ss.android.ugc.aweme.discover.ui.a.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.z;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f82213a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(51163);
    }

    public static final class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.a f82223a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f82224b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f82225c;

        static {
            Covode.recordClassIndex(51166);
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.a.b.a$c$a  reason: collision with other inner class name */
        static final class RunnableC1927a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f82226a;

            static {
                Covode.recordClassIndex(51167);
            }

            RunnableC1927a(c cVar) {
                this.f82226a = cVar;
            }

            public final void run() {
                this.f82226a.f82225c.element.start();
                this.f82226a.f82223a.element = true;
            }
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f82223a.element) {
                this.f82224b.postDelayed(new RunnableC1927a(this), 1000);
            }
        }

        public c(z.a aVar, View view, z.e eVar) {
            this.f82223a = aVar;
            this.f82224b = view;
            this.f82225c = eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a.b.a$a  reason: collision with other inner class name */
    public static final class C1926a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.e f82214a;

        static {
            Covode.recordClassIndex(51164);
        }

        public C1926a(z.e eVar) {
            this.f82214a = eVar;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f82214a.element.start();
        }
    }

    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.e f82219a;

        static {
            Covode.recordClassIndex(51165);
        }

        public b(z.e eVar) {
            this.f82219a = eVar;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f82219a.element.start();
        }
    }
}
