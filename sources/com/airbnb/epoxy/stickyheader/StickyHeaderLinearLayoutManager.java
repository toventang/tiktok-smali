package com.airbnb.epoxy.stickyheader;

import android.graphics.PointF;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.z;
import java.util.List;

public final class StickyHeaderLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    public com.airbnb.epoxy.d f5088a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Integer> f5089b;

    /* renamed from: c  reason: collision with root package name */
    public View f5090c;

    /* renamed from: d  reason: collision with root package name */
    public int f5091d;

    /* renamed from: e  reason: collision with root package name */
    public int f5092e;

    /* renamed from: f  reason: collision with root package name */
    public int f5093f;

    /* renamed from: g  reason: collision with root package name */
    private float f5094g;

    /* renamed from: h  reason: collision with root package name */
    private float f5095h;

    /* renamed from: i  reason: collision with root package name */
    private final a f5096i;

    static {
        Covode.recordClassIndex(2150);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView.a<?> aVar, RecyclerView.a<?> aVar2) {
        super.a(aVar, aVar2);
        a(aVar2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final void a(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            parcelable = null;
        }
        SavedState savedState = (SavedState) parcelable;
        if (savedState != null) {
            this.f5092e = savedState.f5098b;
            this.f5093f = savedState.f5099c;
            super.a(savedState.f5097a);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final int a(int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
        h.f.b.l.c(oVar, "");
        int intValue = ((Number) a(new l(this, i2, oVar, sVar))).intValue();
        if (intValue != 0) {
            a(oVar, false);
        }
        return intValue;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void a(int i2, int i3) {
        f(i2, i3);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final View a(View view, int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
        h.f.b.l.c(view, "");
        h.f.b.l.c(oVar, "");
        h.f.b.l.c(sVar, "");
        return (View) a(new j(this, view, i2, oVar, sVar));
    }

    private final boolean a(View view, RecyclerView.j jVar) {
        if (!jVar.B_() && !jVar.A_()) {
            if (this.f3778j != 1) {
                return this.f3780l ? ((float) view.getLeft()) + view.getTranslationX() <= ((float) this.J) + this.f5094g : ((float) view.getRight()) - view.getTranslationX() >= this.f5094g;
            }
            if (this.f3780l) {
                return ((float) view.getTop()) + view.getTranslationY() <= ((float) this.K) + this.f5095h;
            }
            if (((float) view.getBottom()) - view.getTranslationY() >= this.f5095h) {
                return true;
            }
        }
        return false;
    }

    public final int a(int i2) {
        int size = this.f5089b.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) / 2;
            if (this.f5089b.get(i4).intValue() > i2) {
                size = i4 - 1;
            } else if (this.f5089b.get(i4).intValue() >= i2) {
                return i4;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    static final class c extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ RecyclerView.s $state;
        final /* synthetic */ StickyHeaderLinearLayoutManager this$0;

        static {
            Covode.recordClassIndex(2155);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, RecyclerView.s sVar) {
            super(0);
            this.this$0 = stickyHeaderLinearLayoutManager;
            this.$state = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(StickyHeaderLinearLayoutManager.super.f((StickyHeaderLinearLayoutManager) this.$state));
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ RecyclerView.s $state;
        final /* synthetic */ StickyHeaderLinearLayoutManager this$0;

        static {
            Covode.recordClassIndex(2156);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, RecyclerView.s sVar) {
            super(0);
            this.this$0 = stickyHeaderLinearLayoutManager;
            this.$state = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(StickyHeaderLinearLayoutManager.super.d((StickyHeaderLinearLayoutManager) this.$state));
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ RecyclerView.s $state;
        final /* synthetic */ StickyHeaderLinearLayoutManager this$0;

        static {
            Covode.recordClassIndex(2157);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, RecyclerView.s sVar) {
            super(0);
            this.this$0 = stickyHeaderLinearLayoutManager;
            this.$state = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(StickyHeaderLinearLayoutManager.super.b((StickyHeaderLinearLayoutManager) this.$state));
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<PointF> {
        final /* synthetic */ int $targetPosition;
        final /* synthetic */ StickyHeaderLinearLayoutManager this$0;

        static {
            Covode.recordClassIndex(2158);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, int i2) {
            super(0);
            this.this$0 = stickyHeaderLinearLayoutManager;
            this.$targetPosition = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PointF invoke() {
            return StickyHeaderLinearLayoutManager.super.d((StickyHeaderLinearLayoutManager) this.$targetPosition);
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ RecyclerView.s $state;
        final /* synthetic */ StickyHeaderLinearLayoutManager this$0;

        static {
            Covode.recordClassIndex(2159);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, RecyclerView.s sVar) {
            super(0);
            this.this$0 = stickyHeaderLinearLayoutManager;
            this.$state = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(StickyHeaderLinearLayoutManager.super.g((StickyHeaderLinearLayoutManager) this.$state));
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ RecyclerView.s $state;
        final /* synthetic */ StickyHeaderLinearLayoutManager this$0;

        static {
            Covode.recordClassIndex(2160);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, RecyclerView.s sVar) {
            super(0);
            this.this$0 = stickyHeaderLinearLayoutManager;
            this.$state = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(StickyHeaderLinearLayoutManager.super.e((StickyHeaderLinearLayoutManager) this.$state));
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ RecyclerView.s $state;
        final /* synthetic */ StickyHeaderLinearLayoutManager this$0;

        static {
            Covode.recordClassIndex(2161);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, RecyclerView.s sVar) {
            super(0);
            this.this$0 = stickyHeaderLinearLayoutManager;
            this.$state = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(StickyHeaderLinearLayoutManager.super.c((StickyHeaderLinearLayoutManager) this.$state));
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ int $focusDirection;
        final /* synthetic */ View $focused;
        final /* synthetic */ RecyclerView.o $recycler;
        final /* synthetic */ RecyclerView.s $state;
        final /* synthetic */ StickyHeaderLinearLayoutManager this$0;

        static {
            Covode.recordClassIndex(2162);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, View view, int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
            super(0);
            this.this$0 = stickyHeaderLinearLayoutManager;
            this.$focused = view;
            this.$focusDirection = i2;
            this.$recycler = oVar;
            this.$state = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return StickyHeaderLinearLayoutManager.super.a((StickyHeaderLinearLayoutManager) this.$focused, (View) this.$focusDirection, (int) this.$recycler, (RecyclerView.o) this.$state);
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ RecyclerView.o $recycler;
        final /* synthetic */ RecyclerView.s $state;
        final /* synthetic */ StickyHeaderLinearLayoutManager this$0;

        static {
            Covode.recordClassIndex(2163);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, RecyclerView.o oVar, RecyclerView.s sVar) {
            super(0);
            this.this$0 = stickyHeaderLinearLayoutManager;
            this.$recycler = oVar;
            this.$state = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            StickyHeaderLinearLayoutManager.super.c((StickyHeaderLinearLayoutManager) this.$recycler, (RecyclerView.o) this.$state);
            return z.f158842a;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final Parcelable e() {
        return new SavedState(super.e(), this.f5092e, this.f5093f);
    }

    static final class l extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ int $dx;
        final /* synthetic */ RecyclerView.o $recycler;
        final /* synthetic */ RecyclerView.s $state;
        final /* synthetic */ StickyHeaderLinearLayoutManager this$0;

        static {
            Covode.recordClassIndex(2164);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
            super(0);
            this.this$0 = stickyHeaderLinearLayoutManager;
            this.$dx = i2;
            this.$recycler = oVar;
            this.$state = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(StickyHeaderLinearLayoutManager.super.a((StickyHeaderLinearLayoutManager) this.$dx, (int) this.$recycler, (RecyclerView.o) this.$state));
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ int $dy;
        final /* synthetic */ RecyclerView.o $recycler;
        final /* synthetic */ RecyclerView.s $state;
        final /* synthetic */ StickyHeaderLinearLayoutManager this$0;

        static {
            Covode.recordClassIndex(2165);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
            super(0);
            this.this$0 = stickyHeaderLinearLayoutManager;
            this.$dy = i2;
            this.$recycler = oVar;
            this.$state = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(StickyHeaderLinearLayoutManager.super.b((StickyHeaderLinearLayoutManager) this.$dy, (int) this.$recycler, (RecyclerView.o) this.$state));
        }
    }

    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StickyHeaderLinearLayoutManager f5101a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f5102b;

        static {
            Covode.recordClassIndex(2154);
        }

        public final void onGlobalLayout() {
            int i2 = Build.VERSION.SDK_INT;
            this.f5102b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (this.f5101a.f5092e != -1) {
                StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager = this.f5101a;
                stickyHeaderLinearLayoutManager.a(stickyHeaderLinearLayoutManager.f5092e, this.f5101a.f5093f);
                this.f5101a.e(-1, Integer.MIN_VALUE);
            }
        }

        b(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, View view) {
            this.f5101a = stickyHeaderLinearLayoutManager;
            this.f5102b = view;
        }
    }

    /* access modifiers changed from: package-private */
    public final class a extends RecyclerView.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StickyHeaderLinearLayoutManager f5100a;

        static {
            Covode.recordClassIndex(2153);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a() {
            this.f5100a.f5089b.clear();
            com.airbnb.epoxy.d dVar = this.f5100a.f5088a;
            if (dVar != null) {
                int itemCount = dVar.getItemCount();
                for (int i2 = 0; i2 < itemCount; i2++) {
                    com.airbnb.epoxy.d dVar2 = this.f5100a.f5088a;
                    if (dVar2 != null && dVar2.b(i2)) {
                        this.f5100a.f5089b.add(Integer.valueOf(i2));
                    }
                }
            }
            if (!(this.f5100a.f5090c == null || this.f5100a.f5089b.contains(Integer.valueOf(this.f5100a.f5091d)))) {
                this.f5100a.d((RecyclerView.o) null);
            }
        }

        private final void a(int i2) {
            int intValue = this.f5100a.f5089b.remove(i2).intValue();
            int k2 = this.f5100a.k(intValue);
            if (k2 != -1) {
                this.f5100a.f5089b.add(k2, Integer.valueOf(intValue));
            } else {
                this.f5100a.f5089b.add(Integer.valueOf(intValue));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void b(int i2, int i3) {
            int size = this.f5100a.f5089b.size();
            if (size > 0) {
                int k2 = this.f5100a.k(i2);
                while (k2 != -1 && k2 < size) {
                    this.f5100a.f5089b.set(k2, Integer.valueOf(this.f5100a.f5089b.get(k2).intValue() + i3));
                    k2++;
                }
            }
            int i4 = i3 + i2;
            while (i2 < i4) {
                com.airbnb.epoxy.d dVar = this.f5100a.f5088a;
                if (dVar != null && dVar.b(i2)) {
                    int k3 = this.f5100a.k(i2);
                    if (k3 != -1) {
                        this.f5100a.f5089b.add(k3, Integer.valueOf(i2));
                    } else {
                        this.f5100a.f5089b.add(Integer.valueOf(i2));
                    }
                }
                i2++;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void c(int i2, int i3) {
            int size = this.f5100a.f5089b.size();
            if (size > 0) {
                int i4 = i2 + i3;
                int i5 = i4 - 1;
                if (i5 >= i2) {
                    while (true) {
                        int a2 = this.f5100a.a(i5);
                        if (a2 != -1) {
                            this.f5100a.f5089b.remove(a2);
                            size--;
                        }
                        if (i5 == i2) {
                            break;
                        }
                        i5--;
                    }
                }
                if (this.f5100a.f5090c != null && !this.f5100a.f5089b.contains(Integer.valueOf(this.f5100a.f5091d))) {
                    this.f5100a.d((RecyclerView.o) null);
                }
                int k2 = this.f5100a.k(i4);
                while (k2 != -1 && k2 < size) {
                    this.f5100a.f5089b.set(k2, Integer.valueOf(this.f5100a.f5089b.get(k2).intValue() - i3));
                    k2++;
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a(int i2, int i3, int i4) {
            int size = this.f5100a.f5089b.size();
            if (size <= 0) {
                return;
            }
            if (i2 < i3) {
                int k2 = this.f5100a.k(i2);
                while (k2 != -1 && k2 < size) {
                    int intValue = this.f5100a.f5089b.get(k2).intValue();
                    if (intValue >= i2 && intValue < i2 + i4) {
                        this.f5100a.f5089b.set(k2, Integer.valueOf(intValue - (i3 - i2)));
                        a(k2);
                    } else if (intValue >= i2 + i4 && intValue <= i3) {
                        this.f5100a.f5089b.set(k2, Integer.valueOf(intValue - i4));
                        a(k2);
                    } else {
                        return;
                    }
                    k2++;
                }
                return;
            }
            int k3 = this.f5100a.k(i3);
            while (k3 != -1 && k3 < size) {
                int intValue2 = this.f5100a.f5089b.get(k3).intValue();
                if (intValue2 >= i2 && intValue2 < i2 + i4) {
                    this.f5100a.f5089b.set(k3, Integer.valueOf(intValue2 + (i3 - i2)));
                    a(k3);
                } else if (i3 <= intValue2 && i2 >= intValue2) {
                    this.f5100a.f5089b.set(k3, Integer.valueOf(intValue2 + i4));
                    a(k3);
                } else {
                    return;
                }
                k3++;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void c(RecyclerView recyclerView) {
        h.f.b.l.c(recyclerView, "");
        super.c(recyclerView);
        a(recyclerView.getAdapter());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r.b, androidx.recyclerview.widget.LinearLayoutManager
    public final PointF d(int i2) {
        return (PointF) a(new f(this, i2));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final int c(RecyclerView.s sVar) {
        h.f.b.l.c(sVar, "");
        return ((Number) a(new i(this, sVar))).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final int d(RecyclerView.s sVar) {
        h.f.b.l.c(sVar, "");
        return ((Number) a(new d(this, sVar))).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final int e(RecyclerView.s sVar) {
        h.f.b.l.c(sVar, "");
        return ((Number) a(new h(this, sVar))).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final int f(RecyclerView.s sVar) {
        h.f.b.l.c(sVar, "");
        return ((Number) a(new c(this, sVar))).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final int g(RecyclerView.s sVar) {
        h.f.b.l.c(sVar, "");
        return ((Number) a(new g(this, sVar))).intValue();
    }

    private final int l(int i2) {
        int size = this.f5089b.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) / 2;
            if (this.f5089b.get(i4).intValue() > i2) {
                size = i4 - 1;
            } else {
                if (i4 < this.f5089b.size() - 1) {
                    i3 = i4 + 1;
                    if (this.f5089b.get(i3).intValue() <= i2) {
                    }
                }
                return i4;
            }
        }
        return -1;
    }

    private final void w(View view) {
        l(view);
        if (this.f3778j != 1) {
            view.layout(0, u(), view.getMeasuredWidth(), this.K - w());
        } else {
            view.layout(t(), 0, this.J - v(), view.getMeasuredHeight());
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final int b(RecyclerView.s sVar) {
        h.f.b.l.c(sVar, "");
        return ((Number) a(new e(this, sVar))).intValue();
    }

    public final void d(RecyclerView.o oVar) {
        View view = this.f5090c;
        if (view != null) {
            this.f5090c = null;
            this.f5091d = -1;
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            com.airbnb.epoxy.d dVar = this.f5088a;
            if (dVar != null) {
                dVar.b(view);
            }
            k(view);
            d(view);
            if (oVar != null) {
                oVar.a(view);
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final void e(int i2) {
        f(i2, Integer.MIN_VALUE);
    }

    public final int k(int i2) {
        int size = this.f5089b.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) / 2;
            if (i4 > 0) {
                int i5 = i4 - 1;
                if (this.f5089b.get(i5).intValue() >= i2) {
                    size = i5;
                }
            }
            if (this.f5089b.get(i4).intValue() >= i2) {
                return i4;
            }
            i3 = i4 + 1;
        }
        return -1;
    }

    private final <T> T a(h.f.a.a<? extends T> aVar) {
        View view = this.f5090c;
        if (view != null) {
            h(view);
        }
        T t = (T) aVar.invoke();
        View view2 = this.f5090c;
        if (view2 != null) {
            i(view2);
        }
        return t;
    }

    private final boolean x(View view) {
        if (this.f3778j != 1) {
            if (this.f3780l) {
                if (((float) view.getRight()) - view.getTranslationX() > ((float) this.J) + this.f5094g) {
                    return true;
                }
                return false;
            } else if (((float) view.getLeft()) + view.getTranslationX() < this.f5094g) {
                return true;
            } else {
                return false;
            }
        } else if (this.f3780l) {
            if (((float) view.getBottom()) - view.getTranslationY() > ((float) this.K) + this.f5095h) {
                return true;
            }
            return false;
        } else if (((float) view.getTop()) + view.getTranslationY() < this.f5095h) {
            return true;
        } else {
            return false;
        }
    }

    private final void a(RecyclerView.a<?> aVar) {
        com.airbnb.epoxy.d dVar = this.f5088a;
        if (dVar != null) {
            dVar.unregisterAdapterDataObserver(this.f5096i);
        }
        if (aVar instanceof com.airbnb.epoxy.d) {
            com.airbnb.epoxy.d dVar2 = (com.airbnb.epoxy.d) aVar;
            this.f5088a = dVar2;
            if (dVar2 != null) {
                dVar2.registerAdapterDataObserver(this.f5096i);
            }
            this.f5096i.a();
            return;
        }
        this.f5088a = null;
        this.f5089b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final void c(RecyclerView.o oVar, RecyclerView.s sVar) {
        h.f.b.l.c(oVar, "");
        h.f.b.l.c(sVar, "");
        a(new k(this, oVar, sVar));
        if (!sVar.f3882g) {
            a(oVar, true);
        }
    }

    private final float b(View view, View view2) {
        int i2;
        if (this.f3778j != 1) {
            return this.f5095h;
        }
        float f2 = this.f5095h;
        if (this.f3780l) {
            f2 += (float) (this.K - view.getHeight());
        }
        if (view2 == null) {
            return f2;
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
        int i3 = 0;
        if (marginLayoutParams2 != null) {
            i2 = marginLayoutParams2.bottomMargin;
        } else {
            i2 = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = layoutParams2;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = marginLayoutParams;
        if (marginLayoutParams3 != null) {
            i3 = marginLayoutParams3.topMargin;
        }
        if (this.f3780l) {
            return h.j.h.b((float) (view2.getBottom() + i2), f2);
        }
        return h.j.h.c((float) ((view2.getTop() - i3) - view.getHeight()), f2);
    }

    private final float c(View view, View view2) {
        int i2;
        if (this.f3778j != 0) {
            return this.f5094g;
        }
        float f2 = this.f5094g;
        if (this.f3780l) {
            f2 += (float) (this.J - view.getWidth());
        }
        if (view2 == null) {
            return f2;
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
        int i3 = 0;
        if (marginLayoutParams2 != null) {
            i2 = marginLayoutParams2.leftMargin;
        } else {
            i2 = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = layoutParams2;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = marginLayoutParams;
        if (marginLayoutParams3 != null) {
            i3 = marginLayoutParams3.rightMargin;
        }
        if (this.f3780l) {
            return h.j.h.b((float) (view2.getRight() + i3), f2);
        }
        return h.j.h.c((float) ((view2.getLeft() - i2) - view.getWidth()), f2);
    }

    private final void f(int i2, int i3) {
        e(-1, Integer.MIN_VALUE);
        int l2 = l(i2);
        if (l2 == -1 || a(i2) != -1) {
            super.a(i2, i3);
            return;
        }
        int i4 = i2 - 1;
        if (a(i4) != -1) {
            super.a(i4, i3);
        } else if (this.f5090c == null || l2 != a(this.f5091d)) {
            e(i2, i3);
            super.a(i2, i3);
        } else {
            if (i3 == Integer.MIN_VALUE) {
                i3 = 0;
            }
            View view = this.f5090c;
            if (view == null) {
                h.f.b.l.a();
            }
            super.a(i2, i3 + view.getHeight());
        }
    }

    public final void e(int i2, int i3) {
        this.f5092e = i2;
        this.f5093f = i3;
    }

    private final void a(RecyclerView.o oVar, int i2) {
        View b2 = oVar.b(i2);
        h.f.b.l.a((Object) b2, "");
        com.airbnb.epoxy.d dVar = this.f5088a;
        if (dVar != null) {
            dVar.a(b2);
        }
        c(b2);
        w(b2);
        j(b2);
        this.f5090c = b2;
        this.f5091d = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0089, code lost:
        if (e(r0) != r2) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(androidx.recyclerview.widget.RecyclerView.o r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 205
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager.a(androidx.recyclerview.widget.RecyclerView$o, boolean):void");
    }

    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final Parcelable f5097a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5098b;

        /* renamed from: c  reason: collision with root package name */
        public final int f5099c;

        public static class a implements Parcelable.Creator {
            static {
                Covode.recordClassIndex(2152);
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                h.f.b.l.c(parcel, "");
                return new SavedState(parcel.readParcelable(SavedState.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        static {
            Covode.recordClassIndex(2151);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SavedState)) {
                return false;
            }
            SavedState savedState = (SavedState) obj;
            return h.f.b.l.a(this.f5097a, savedState.f5097a) && this.f5098b == savedState.f5098b && this.f5099c == savedState.f5099c;
        }

        public final int hashCode() {
            Parcelable parcelable = this.f5097a;
            return ((((parcelable != null ? parcelable.hashCode() : 0) * 31) + this.f5098b) * 31) + this.f5099c;
        }

        public final String toString() {
            return "SavedState(superState=" + this.f5097a + ", scrollPosition=" + this.f5098b + ", scrollOffset=" + this.f5099c + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            h.f.b.l.c(parcel, "");
            parcel.writeParcelable(this.f5097a, i2);
            parcel.writeInt(this.f5098b);
            parcel.writeInt(this.f5099c);
        }

        public SavedState(Parcelable parcelable, int i2, int i3) {
            this.f5097a = parcelable;
            this.f5098b = i2;
            this.f5099c = i3;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final int b(int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
        h.f.b.l.c(oVar, "");
        int intValue = ((Number) a(new m(this, i2, oVar, sVar))).intValue();
        if (intValue != 0) {
            a(oVar, false);
        }
        return intValue;
    }

    private final void a(RecyclerView.o oVar, View view, int i2) {
        oVar.a(view, i2);
        this.f5091d = i2;
        w(view);
        if (this.f5092e != -1) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new b(this, view));
        }
    }
}
