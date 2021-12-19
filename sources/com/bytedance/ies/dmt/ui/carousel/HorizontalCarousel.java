package com.bytedance.ies.dmt.ui.carousel;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.a.af;
import h.f.b.l;
import h.j.h;
import java.util.Iterator;

public final class HorizontalCarousel extends RecyclerView {
    static {
        Covode.recordClassIndex(19903);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HorizontalCarousel f33339a;

        static {
            Covode.recordClassIndex(19904);
        }

        a(HorizontalCarousel horizontalCarousel) {
            this.f33339a = horizontalCarousel;
        }

        public final void run() {
            this.f33339a.r();
        }
    }

    public static final class b extends RecyclerView.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HorizontalCarousel f33340a;

        static {
            Covode.recordClassIndex(19905);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a() {
            this.f33340a.q();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(HorizontalCarousel horizontalCarousel) {
            this.f33340a = horizontalCarousel;
        }
    }

    public final void q() {
        post(new d(this));
    }

    public final void r() {
        post(new e(this));
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HorizontalCarousel f33342a;

        static {
            Covode.recordClassIndex(19907);
        }

        d(HorizontalCarousel horizontalCarousel) {
            this.f33342a = horizontalCarousel;
        }

        public final void run() {
            View childAt = this.f33342a.getChildAt(0);
            if (childAt != null) {
                int width = (this.f33342a.getWidth() / 2) - (childAt.getWidth() / 2);
                this.f33342a.setPadding(width, 0, width, 0);
                this.f33342a.b(1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HorizontalCarousel f33343a;

        static {
            Covode.recordClassIndex(19908);
        }

        e(HorizontalCarousel horizontalCarousel) {
            this.f33343a = horizontalCarousel;
        }

        public final void run() {
            Iterator it = h.a(0, this.f33343a.getChildCount()).iterator();
            while (it.hasNext()) {
                View childAt = this.f33343a.getChildAt(((af) it).a());
                l.b(childAt, "");
                int left = (childAt.getLeft() + childAt.getRight()) / 2;
                HorizontalCarousel horizontalCarousel = this.f33343a;
                double d2 = (double) left;
                double left2 = (double) ((horizontalCarousel.getLeft() + horizontalCarousel.getRight()) / 2);
                Double.isNaN(d2);
                Double.isNaN(left2);
                float pow = (((float) (Math.pow(2.718281828459045d, (-Math.pow(d2 - left2, 2.0d)) / (Math.pow(150.0d, 2.0d) * 2.0d)) * 1.0d)) * 0.45f) + 0.55f;
                childAt.setScaleX(pow);
                childAt.setScaleY(pow);
            }
        }
    }

    public static final class c extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HorizontalCarousel f33341a;

        static {
            Covode.recordClassIndex(19906);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(HorizontalCarousel horizontalCarousel) {
            this.f33341a = horizontalCarousel;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            l.d(recyclerView, "");
            super.a(recyclerView, i2, i3);
            this.f33341a.r();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void setAdapter(RecyclerView.a<?> aVar) {
        super.setAdapter(aVar);
        if (aVar != null) {
            getContext();
            setLayoutManager(new LinearLayoutManager(0, false));
            q();
            new Handler().postDelayed(new a(this), 300);
            aVar.registerAdapterDataObserver(new b(this));
        }
        a(new c(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HorizontalCarousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
    }
}
