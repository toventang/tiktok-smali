package com.ss.android.ugc.aweme.discover.helper;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.k.aj;
import androidx.k.c;
import androidx.k.d;
import androidx.k.m;
import androidx.k.o;
import androidx.k.q;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.h.i;
import com.ss.android.ugc.aweme.base.utils.n;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class u extends b {

    /* renamed from: d  reason: collision with root package name */
    public boolean f81178d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f81179e = true;

    /* renamed from: f  reason: collision with root package name */
    public boolean f81180f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f81181g;

    /* renamed from: h  reason: collision with root package name */
    public final List<a> f81182h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public View f81183i;

    /* renamed from: j  reason: collision with root package name */
    private final int f81184j = n.a(16.0d);

    /* renamed from: k  reason: collision with root package name */
    private final ViewGroup f81185k;

    /* renamed from: l  reason: collision with root package name */
    private final View f81186l;

    /* renamed from: m  reason: collision with root package name */
    private final View f81187m;
    private final ImageView n;
    private final View o;
    private final View p;

    public interface a {
        static {
            Covode.recordClassIndex(50456);
        }

        void a(boolean z);

        void b(boolean z);
    }

    static {
        Covode.recordClassIndex(50455);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.helper.b
    public final void a(Animator animator) {
        l.d(animator, "");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.helper.b
    public final void a(ValueAnimator valueAnimator) {
        l.d(valueAnimator, "");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.helper.b
    public final void b(Animator animator) {
        l.d(animator, "");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.helper.b
    public final void b(ValueAnimator valueAnimator) {
        l.d(valueAnimator, "");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.helper.b
    public final void c(Animator animator) {
        l.d(animator, "");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.helper.b
    public final void d(Animator animator) {
        l.d(animator, "");
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.b
    public final void a() {
        i.b(this.p, 0, null, 0, null, false, 26);
        b(false);
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.b
    public final void b() {
        boolean z;
        int i2;
        int i3 = 0;
        if (this.f81183i != null) {
            z = true;
        } else {
            z = false;
        }
        if ((!this.f81178d || this.f81179e) && ((!this.f81180f || this.f81181g) && !z)) {
            i2 = this.f81184j;
        } else {
            i2 = 0;
        }
        if (com.ss.android.ugc.aweme.discover.f.a.f80972a.b()) {
            i3 = this.f81184j;
        }
        i.b(this.p, Integer.valueOf(i2), null, Integer.valueOf(i3), null, false, 26);
        b(true);
    }

    public static final class b implements m.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f81188a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f81189b;

        static {
            Covode.recordClassIndex(50457);
        }

        @Override // androidx.k.m.c
        public final void b(m mVar) {
            l.d(mVar, "");
        }

        @Override // androidx.k.m.c
        public final void c(m mVar) {
            l.d(mVar, "");
        }

        @Override // androidx.k.m.c
        public final void a(m mVar) {
            l.d(mVar, "");
            u uVar = this.f81188a;
            boolean z = this.f81189b;
            List<a> list = uVar.f81182h;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                list.get(i2).b(z);
            }
        }

        @Override // androidx.k.m.c
        public final void d(m mVar) {
            l.d(mVar, "");
            u uVar = this.f81188a;
            boolean z = this.f81189b;
            List<a> list = uVar.f81182h;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                list.get(i2).a(z);
            }
        }

        b(u uVar, boolean z) {
            this.f81188a = uVar;
            this.f81189b = z;
        }
    }

    private final void b(boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        this.f81095c = !z ? 1 : 0;
        q qVar = new q();
        m b2 = new d().b(this.n).b(this.f81186l).b(this.o).b(this.f81187m);
        View view = this.f81183i;
        if (view != null) {
            b2.b(view);
        }
        b2.a(100);
        Objects.requireNonNull(b2, "null cannot be cast to non-null type androidx.transition.Fade");
        ((aj) b2).c(2);
        l.b(b2, "");
        m e2 = b2.clone();
        e2.b(100L);
        Objects.requireNonNull(e2, "null cannot be cast to non-null type androidx.transition.Fade");
        ((aj) e2).c(1);
        l.b(e2, "");
        qVar.a(e2).a(b2);
        m b3 = new c().b(R.id.do7);
        b3.a(200);
        new com.ss.android.ugc.aweme.shortvideo.aj(0.32f, 0.94f, 0.6f);
        l.b(b3, "");
        qVar.a(b3);
        qVar.a(new b(this, z));
        ViewGroup viewGroup = this.f81185k;
        Objects.requireNonNull(viewGroup, "null cannot be cast to non-null type android.view.ViewGroup");
        o.a(viewGroup, qVar);
        View view2 = this.o;
        int i6 = 8;
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        view2.setVisibility(i2);
        if (!this.f81178d || this.f81179e) {
            View view3 = this.f81187m;
            if (z) {
                i4 = 8;
            } else {
                i4 = 0;
            }
            view3.setVisibility(i4);
            if (this.f81179e) {
                ImageView imageView = this.n;
                if (!z) {
                    i5 = 8;
                } else {
                    i5 = 0;
                }
                imageView.setVisibility(i5);
            }
        }
        if (this.f81180f) {
            View view4 = this.f81186l;
            if (!z) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            view4.setVisibility(i3);
        }
        View view5 = this.f81183i;
        if (view5 != null) {
            if (z) {
                i6 = 0;
            }
            view5.setVisibility(i6);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(Context context, ViewGroup viewGroup, View view, View view2, ImageView imageView, View view3, View view4) {
        super(context);
        l.d(viewGroup, "");
        l.d(view, "");
        l.d(view2, "");
        l.d(imageView, "");
        l.d(view3, "");
        l.d(view4, "");
        this.f81185k = viewGroup;
        this.f81186l = view;
        this.f81187m = view2;
        this.n = imageView;
        this.o = view3;
        this.p = view4;
    }
}
