package com.bytedance.ies.dmt.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.common.b;
import com.bytedance.ies.dmt.ui.common.d;
import com.bytedance.ies.dmt.ui.widget.d;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public class DmtStatusView extends FrameLayout implements d, h {

    /* renamed from: a  reason: collision with root package name */
    List<View> f33594a;

    /* renamed from: b  reason: collision with root package name */
    private int f33595b;

    /* renamed from: c  reason: collision with root package name */
    private int f33596c;

    /* renamed from: d  reason: collision with root package name */
    private Boolean f33597d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f33598e;

    static {
        Covode.recordClassIndex(20019);
    }

    public Boolean getForceDarkTheme() {
        return this.f33597d;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Context f33599a;

        /* renamed from: b  reason: collision with root package name */
        View f33600b;

        /* renamed from: c  reason: collision with root package name */
        View f33601c;

        /* renamed from: d  reason: collision with root package name */
        View f33602d;

        /* renamed from: e  reason: collision with root package name */
        public View f33603e;

        /* renamed from: f  reason: collision with root package name */
        View f33604f;

        /* renamed from: g  reason: collision with root package name */
        public int f33605g = -1;

        static {
            Covode.recordClassIndex(20020);
        }

        public final a a(d dVar) {
            e eVar = new e(this.f33599a);
            eVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            eVar.setStatus(dVar);
            this.f33601c = eVar;
            return this;
        }

        public final a a() {
            DmtLoadingLayout dmtLoadingLayout = new DmtLoadingLayout(this.f33599a);
            dmtLoadingLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            a(dmtLoadingLayout);
            return this;
        }

        public final a b() {
            return a(new d.a(this.f33599a).c(R.string.cwz).f33648a);
        }

        public static a a(Context context) {
            return new a(context).a();
        }

        public final a b(View view) {
            this.f33601c = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this;
        }

        public final a c(View view) {
            this.f33602d = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this;
        }

        public final a d(View view) {
            this.f33603e = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this;
        }

        public final a e(View view) {
            this.f33604f = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this;
        }

        public a(Context context) {
            if (context != null) {
                this.f33599a = context;
                return;
            }
            throw new IllegalArgumentException("DmtStatusView.Builder:Context can not be null");
        }

        public final a a(int i2) {
            return b(new d.a(this.f33599a).c(i2).f33648a);
        }

        public final a b(d dVar) {
            e eVar = new e(this.f33599a);
            eVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            eVar.setStatus(dVar);
            this.f33602d = eVar;
            return this;
        }

        public final a a(View.OnClickListener onClickListener) {
            a(R.string.cyt);
            this.f33602d.setOnClickListener(onClickListener);
            return this;
        }

        public final a a(View view) {
            this.f33600b = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this;
        }

        public final a a(int i2, int i3) {
            return a(new d.a(this.f33599a).b(i2).c(i3).f33648a);
        }

        public final a a(int i2, View.OnClickListener onClickListener) {
            return b(new d.a(this.f33599a).b(i2).c(R.string.h2y).a(a.BORDER, R.string.h35, onClickListener).f33648a);
        }

        public final a a(int i2, int i3, int i4, View.OnClickListener onClickListener) {
            return b(new d.a(this.f33599a).a(2131232886).b(i2).c(i3).a(a.BORDER, i4, onClickListener).f33648a);
        }
    }

    public final void f() {
        setVisibility(0);
        setStatus(0);
    }

    public boolean j() {
        if (this.f33595b == 0) {
            return true;
        }
        return false;
    }

    public boolean k() {
        if (this.f33595b == 1) {
            return true;
        }
        return false;
    }

    public boolean e() {
        if (this.f33595b == -1) {
            return true;
        }
        return false;
    }

    public final void g() {
        setVisibility(0);
        setStatus(1);
    }

    public final void h() {
        setVisibility(0);
        setStatus(2);
    }

    public final void i() {
        setVisibility(0);
        setStatus(3);
    }

    public boolean l() {
        if (this.f33595b == 2) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if (this.f33595b == 3) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (this.f33595b == 4) {
            return true;
        }
        return false;
    }

    public void d() {
        int i2 = this.f33595b;
        if (i2 != -1) {
            View b2 = b(i2);
            if (b2 != null) {
                b2.setVisibility(4);
            }
            setVisibility(4);
            this.f33595b = -1;
        }
    }

    public a c() {
        a aVar = new a(getContext());
        aVar.f33600b = this.f33594a.get(0);
        aVar.f33601c = this.f33594a.get(1);
        aVar.f33602d = this.f33594a.get(2);
        aVar.f33603e = this.f33594a.get(3);
        aVar.f33604f = this.f33594a.get(4);
        return aVar;
    }

    @Override // com.bytedance.ies.dmt.ui.common.d
    public void a(int i2) {
        c(i2);
    }

    public DmtStatusView(Context context) {
        this(context, null);
    }

    public final void a(boolean z) {
        this.f33598e = z;
        d();
    }

    public final View b(int i2) {
        if (i2 < 0 || i2 >= this.f33594a.size()) {
            return null;
        }
        return this.f33594a.get(i2);
    }

    public void setForceDarkTheme(Boolean bool) {
        this.f33597d = bool;
        if (bool.booleanValue()) {
            for (View view : this.f33594a) {
                if (view instanceof e) {
                    ((e) view).a(this.f33597d);
                }
            }
        }
    }

    public void setStatus(int i2) {
        View b2;
        int i3 = this.f33595b;
        if (i3 != i2) {
            if (i3 >= 0 && (b2 = b(i3)) != null) {
                b2.setVisibility(4);
            }
            if (i2 >= 0) {
                setVisibility(0);
                View b3 = b(i2);
                if (b3 != null) {
                    b3.setVisibility(0);
                }
            } else {
                setVisibility(4);
            }
            this.f33595b = i2;
        }
    }

    private void c(int i2) {
        if (i2 >= 0 && this.f33596c != i2) {
            this.f33596c = i2;
            View view = this.f33594a.get(0);
            if (view instanceof DmtLoadingLayout) {
                ((DmtLoadingLayout) view).a(this.f33596c);
            }
            View view2 = this.f33594a.get(1);
            if (view2 instanceof com.bytedance.ies.dmt.ui.common.d) {
                ((com.bytedance.ies.dmt.ui.common.d) view2).a(this.f33596c);
            }
            View view3 = this.f33594a.get(2);
            if (view3 instanceof e) {
                ((e) view3).a(this.f33596c);
            }
            View view4 = this.f33594a.get(3);
            if (view4 instanceof e) {
                ((e) view4).a(this.f33596c);
            }
            View view5 = this.f33594a.get(4);
            if (view5 instanceof e) {
                ((e) view5).a(this.f33596c);
            }
        }
    }

    public void setBuilder(a aVar) {
        if (aVar == null) {
            aVar = a.a(getContext());
        }
        this.f33594a.clear();
        this.f33594a.add(aVar.f33600b);
        this.f33594a.add(aVar.f33601c);
        this.f33594a.add(aVar.f33602d);
        this.f33594a.add(aVar.f33603e);
        this.f33594a.add(aVar.f33604f);
        if (aVar.f33605g < 0) {
            aVar.f33605g = b.a.f33348a.f33347a;
        }
        c(aVar.f33605g);
        removeAllViews();
        for (int i2 = 0; i2 < this.f33594a.size(); i2++) {
            View view = this.f33594a.get(i2);
            if (view != null) {
                view.setVisibility(4);
                addView(view);
            }
        }
    }

    @Override // com.bytedance.ies.dmt.ui.widget.h
    public void setUseScreenHeight(int i2) {
        View view = this.f33594a.get(0);
        if (view instanceof h) {
            ((h) view).setUseScreenHeight(i2);
        }
        View view2 = this.f33594a.get(1);
        if (view2 instanceof h) {
            ((h) view2).setUseScreenHeight(i2);
        }
        View view3 = this.f33594a.get(2);
        if (view3 instanceof h) {
            ((h) view3).setUseScreenHeight(i2);
        }
        View view4 = this.f33594a.get(3);
        if (view4 instanceof h) {
            ((h) view4).setUseScreenHeight(i2);
        }
        View view5 = this.f33594a.get(4);
        if (view5 instanceof h) {
            ((h) view5).setUseScreenHeight(i2);
        }
    }

    public DmtStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DmtStatusView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        MethodCollector.i(9343);
        this.f33594a = new ArrayList(5);
        this.f33595b = -1;
        this.f33596c = -1;
        this.f33597d = false;
        this.f33598e = false;
        MethodCollector.o(9343);
    }
}
