package com.bytedance.tux.sheet.a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import h.a.i;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class a extends com.bytedance.tux.sheet.a {
    public static final c o = new c((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    public List<List<C1109a<?>>> f45239g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public String f45240h;

    /* renamed from: i  reason: collision with root package name */
    public Integer f45241i;

    /* renamed from: j  reason: collision with root package name */
    public int f45242j = -1;

    /* renamed from: k  reason: collision with root package name */
    public String f45243k;

    /* renamed from: l  reason: collision with root package name */
    public Integer f45244l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f45245m;
    public View n;
    private HashMap p;

    public static final class e extends C1109a<e> {

        /* renamed from: f  reason: collision with root package name */
        public String f45257f;

        /* renamed from: g  reason: collision with root package name */
        public Integer f45258g;

        static {
            Covode.recordClassIndex(27574);
        }
    }

    static {
        Covode.recordClassIndex(27568);
    }

    @Override // com.bytedance.tux.sheet.a
    public final void a() {
        HashMap hashMap = this.p;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.tux.sheet.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class c {
        static {
            Covode.recordClassIndex(27572);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final a f45252a = new a();

        /* renamed from: b  reason: collision with root package name */
        private boolean f45253b;

        static {
            Covode.recordClassIndex(27571);
        }

        public final b a() {
            this.f45252a.f45242j = 2;
            return this;
        }

        public final a b() {
            this.f45252a.f45245m = !this.f45253b;
            return this.f45252a;
        }

        public final b a(int i2) {
            this.f45252a.f45244l = Integer.valueOf(i2);
            return this;
        }

        public final b b(String str) {
            l.c(str, "");
            this.f45252a.f45243k = str;
            return this;
        }

        public final b a(DialogInterface.OnCancelListener onCancelListener) {
            l.c(onCancelListener, "");
            this.f45252a.f45233a = onCancelListener;
            return this;
        }

        public final b b(List<e> list) {
            l.c(list, "");
            this.f45252a.f45239g.add(list);
            return this;
        }

        public final b a(String str) {
            l.c(str, "");
            this.f45252a.f45240h = str;
            return this;
        }

        public final b a(List<d> list) {
            l.c(list, "");
            this.f45252a.f45239g.add(list);
            this.f45253b = true;
            return this;
        }

        public final b a(d... dVarArr) {
            l.c(dVarArr, "");
            this.f45252a.f45239g.add(i.j(dVarArr));
            this.f45253b = true;
            return this;
        }

        public final b a(e... eVarArr) {
            l.c(eVarArr, "");
            this.f45252a.f45239g.add(i.j(eVarArr));
            return this;
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.tux.sheet.a, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            view.post(new h(this));
        }
    }

    static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f45273a;

        static {
            Covode.recordClassIndex(27577);
        }

        h(a aVar) {
            this.f45273a = aVar;
        }

        public final void run() {
            View view = this.f45273a.getView();
            if (view != null) {
                l.a((Object) view, "");
                View view2 = this.f45273a.getView();
                do {
                    ViewParent viewParent = null;
                    if (view2 != null) {
                        viewParent = view2.getParent();
                    }
                    if (viewParent instanceof CoordinatorLayout) {
                        if (view2 != null) {
                            BottomSheetBehavior a2 = BottomSheetBehavior.a(view2);
                            Resources resources = this.f45273a.getResources();
                            l.a((Object) resources, "");
                            double d2 = (double) resources.getDisplayMetrics().heightPixels;
                            Double.isNaN(d2);
                            int measuredHeight = view.getMeasuredHeight();
                            l.a((Object) a2, "");
                            a2.b(h.j.h.c(measuredHeight, (int) (d2 * 0.73d)));
                            return;
                        }
                        return;
                    } else if (viewParent instanceof View) {
                        view2 = (View) viewParent;
                    } else {
                        return;
                    }
                } while (view2 != null);
            }
        }
    }

    /* renamed from: com.bytedance.tux.sheet.a.a$a  reason: collision with other inner class name */
    public static class C1109a<T extends C1109a<T>> {

        /* renamed from: a  reason: collision with root package name */
        public String f45246a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f45247b;

        /* renamed from: c  reason: collision with root package name */
        public int f45248c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f45249d = true;

        /* renamed from: e  reason: collision with root package name */
        public View.OnClickListener f45250e;

        static {
            Covode.recordClassIndex(27569);
        }

        public final T b(int i2) {
            this.f45248c = i2;
            return this;
        }

        public final T a(int i2) {
            this.f45247b = Integer.valueOf(i2);
            return this;
        }

        /* renamed from: com.bytedance.tux.sheet.a.a$a$a  reason: collision with other inner class name */
        static final class View$OnClickListenerC1110a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h.f.a.b f45251a;

            static {
                Covode.recordClassIndex(27570);
            }

            View$OnClickListenerC1110a(h.f.a.b bVar) {
                this.f45251a = bVar;
            }

            public final void onClick(View view) {
                h.f.a.b bVar = this.f45251a;
                l.a((Object) view, "");
                bVar.invoke(view);
            }
        }

        public final T a(View.OnClickListener onClickListener) {
            l.c(onClickListener, "");
            this.f45250e = onClickListener;
            return this;
        }

        public final T a(h.f.a.b<? super View, z> bVar) {
            l.c(bVar, "");
            this.f45250e = new View$OnClickListenerC1110a(bVar);
            return this;
        }

        public final T a(String str) {
            l.c(str, "");
            this.f45246a = str;
            return this;
        }
    }

    public static final class d extends C1109a<d> {

        /* renamed from: f  reason: collision with root package name */
        public Integer f45254f;

        /* renamed from: g  reason: collision with root package name */
        public h.f.a.b<? super TuxIconView, z> f45255g;

        /* renamed from: h  reason: collision with root package name */
        public View f45256h;

        static {
            Covode.recordClassIndex(27573);
        }

        public final d c(int i2) {
            this.f45254f = Integer.valueOf(i2);
            return this;
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1109a f45259a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f45260b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f45261c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f45262d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LinearLayout f45263e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f45264f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f45265g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f45266h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f45267i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f45268j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f45269k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f45270l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f45271m;
        final /* synthetic */ int n;
        final /* synthetic */ float o;
        final /* synthetic */ int p;

        static {
            Covode.recordClassIndex(27575);
        }

        f(C1109a aVar, int i2, a aVar2, Context context, LinearLayout linearLayout, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, float f2, int i12) {
            this.f45259a = aVar;
            this.f45260b = i2;
            this.f45261c = aVar2;
            this.f45262d = context;
            this.f45263e = linearLayout;
            this.f45264f = i3;
            this.f45265g = i4;
            this.f45266h = i5;
            this.f45267i = i6;
            this.f45268j = i7;
            this.f45269k = i8;
            this.f45270l = i9;
            this.f45271m = i10;
            this.n = i11;
            this.o = f2;
            this.p = i12;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener = this.f45259a.f45250e;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            this.f45261c.dismissAllowingStateLoss();
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f45272a;

        static {
            Covode.recordClassIndex(27576);
        }

        g(a aVar) {
            this.f45272a = aVar;
        }

        public final void onClick(View view) {
            a aVar = this.f45272a;
            aVar.onCancel(aVar.getDialog());
            this.f45272a.dismissAllowingStateLoss();
        }
    }

    private static String a(Context context, String str, Integer num) {
        if (str != null) {
            return str;
        }
        if (num == null) {
            return "";
        }
        String string = context.getResources().getString(num.intValue());
        l.a((Object) string, "");
        return string;
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x02e5  */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r52, android.view.ViewGroup r53, android.os.Bundle r54) {
        /*
        // Method dump skipped, instructions count: 1050
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.sheet.a.a.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    private static void a(ViewGroup viewGroup, float f2, int i2, float f3) {
        MethodCollector.i(7207);
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, (int) f2);
        if (f3 > 0.0f) {
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            marginLayoutParams.leftMargin = h.g.a.a(TypedValue.applyDimension(1, f3, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            marginLayoutParams.rightMargin = h.g.a.a(TypedValue.applyDimension(1, f3, system2.getDisplayMetrics()));
        }
        frameLayout.setBackgroundColor(i2);
        viewGroup.addView(frameLayout, marginLayoutParams);
        MethodCollector.o(7207);
    }
}
