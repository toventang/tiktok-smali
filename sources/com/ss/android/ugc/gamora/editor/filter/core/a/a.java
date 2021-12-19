package com.ss.android.ugc.gamora.editor.filter.core.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.f.a.a.f;
import com.bytedance.f.a.a.j;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.a.o;
import com.ss.android.ugc.aweme.filter.repository.a.q;
import h.f.b.l;
import h.z;
import java.util.Objects;

public final class a {

    /* renamed from: l  reason: collision with root package name */
    public static final C3889a f145868l = new C3889a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final b f145869a;

    /* renamed from: b  reason: collision with root package name */
    public b f145870b;

    /* renamed from: c  reason: collision with root package name */
    public FilterBean f145871c;

    /* renamed from: d  reason: collision with root package name */
    public FilterBean f145872d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f145873e;

    /* renamed from: f  reason: collision with root package name */
    final Animator.AnimatorListener f145874f = new c(this);

    /* renamed from: g  reason: collision with root package name */
    final ValueAnimator.AnimatorUpdateListener f145875g = new d(this);

    /* renamed from: h  reason: collision with root package name */
    final j f145876h;

    /* renamed from: i  reason: collision with root package name */
    public final com.ss.android.ugc.gamora.editor.filter.indicator.a f145877i;

    /* renamed from: j  reason: collision with root package name */
    public final o f145878j;

    /* renamed from: k  reason: collision with root package name */
    public final LiveData<com.ss.android.ugc.aweme.filter.c.a> f145879k;

    public interface b {
        static {
            Covode.recordClassIndex(95856);
        }

        void a(FilterBean filterBean);

        void a(FilterBean filterBean, FilterBean filterBean2, float f2);
    }

    static {
        Covode.recordClassIndex(95854);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.core.a.a$a  reason: collision with other inner class name */
    public static final class C3889a {
        static {
            Covode.recordClassIndex(95855);
        }

        private C3889a() {
        }

        public /* synthetic */ C3889a(byte b2) {
            this();
        }
    }

    public static final class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f145880a;

        static {
            Covode.recordClassIndex(95857);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(a aVar) {
            this.f145880a = aVar;
        }

        public final void onAnimationStart(Animator animator) {
            l.d(animator, "");
            this.f145880a.f145869a.f145885b = true;
        }

        public final void onAnimationEnd(Animator animator) {
            l.d(animator, "");
            if (this.f145880a.f145872d != null) {
                a aVar = this.f145880a;
                aVar.f145871c = aVar.f145872d;
                this.f145880a.f145869a.f145884a = 0.0f;
                if (this.f145880a.f145870b != null) {
                    b bVar = this.f145880a.f145870b;
                    if (bVar == null) {
                        l.b();
                    }
                    bVar.a(this.f145880a.f145871c);
                }
                this.f145880a.f145877i.a(false, this.f145880a.f145871c);
            }
            this.f145880a.f145869a.f145885b = false;
        }
    }

    public final int a(q qVar) {
        l.d(qVar, "");
        return com.ss.android.ugc.aweme.filter.repository.a.a.c.a(qVar, this.f145871c);
    }

    static final class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f145881a;

        static {
            Covode.recordClassIndex(95858);
        }

        d(a aVar) {
            this.f145881a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.d(valueAnimator, "");
            a aVar = this.f145881a;
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            aVar.a(((Float) animatedValue).floatValue());
        }
    }

    public static final class e implements u<com.ss.android.ugc.aweme.filter.c.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f145882a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f145883b;

        static {
            Covode.recordClassIndex(95859);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.filter.c.a aVar) {
            FilterBean filterBean;
            com.ss.android.ugc.aweme.filter.c.a aVar2 = aVar;
            if (aVar2 != null && (filterBean = aVar2.f95494b) != com.ss.android.ugc.aweme.filter.repository.a.a.a.a()) {
                this.f145882a.a(filterBean);
                this.f145883b.invoke(filterBean);
                this.f145882a.f145879k.removeObserver(this);
            }
        }

        e(a aVar, h.f.a.b bVar) {
            this.f145882a = aVar;
            this.f145883b = bVar;
        }
    }

    public final void a(FilterBean filterBean) {
        this.f145871c = filterBean;
        this.f145877i.a(true, filterBean);
    }

    public final void a(float f2) {
        char c2;
        int i2;
        FilterBean a2;
        if (f2 == 0.0f) {
            c2 = 0;
        } else if (f2 < 0.0f) {
            c2 = 65535;
        } else {
            c2 = 1;
        }
        q f3 = this.f145878j.f();
        int a3 = com.ss.android.ugc.aweme.filter.repository.a.a.c.a(f3, this.f145871c);
        if (c2 == 0) {
            i2 = a3;
        } else if (c2 == 65535) {
            i2 = a3;
            a3--;
        } else {
            i2 = a3 + 1;
        }
        FilterBean filterBean = null;
        if (a3 < 0) {
            a2 = null;
        } else {
            a2 = com.ss.android.ugc.aweme.filter.repository.a.a.c.a(f3, a3);
        }
        if (i2 < com.ss.android.ugc.aweme.filter.repository.a.a.c.a(f3).size()) {
            filterBean = com.ss.android.ugc.aweme.filter.repository.a.a.c.a(f3, i2);
        }
        b bVar = this.f145870b;
        if (bVar != null) {
            bVar.a(a2, filterBean, f2);
        }
    }

    public a(m mVar, j jVar, com.ss.android.ugc.gamora.editor.filter.indicator.a aVar, o oVar, LiveData<com.ss.android.ugc.aweme.filter.c.a> liveData, h.f.a.b<? super FilterBean, z> bVar) {
        l.d(mVar, "");
        l.d(jVar, "");
        l.d(aVar, "");
        l.d(oVar, "");
        l.d(liveData, "");
        l.d(bVar, "");
        this.f145876h = jVar;
        this.f145877i = aVar;
        this.f145878j = oVar;
        this.f145879k = liveData;
        b bVar2 = new b(this, jVar.a());
        this.f145869a = bVar2;
        jVar.a(new f(0, bVar2));
        liveData.observe(mVar, new e(this, bVar));
    }
}
