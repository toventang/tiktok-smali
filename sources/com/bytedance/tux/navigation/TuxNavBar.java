package com.bytedance.tux.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.h.x;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.a.g;
import com.bytedance.tux.widget.FlexLayout;
import com.zhiliaoapp.musically.R;
import h.a.i;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.l.h;
import h.l.k;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class TuxNavBar extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public int f45175a;

    /* renamed from: b  reason: collision with root package name */
    public int f45176b;

    /* renamed from: c  reason: collision with root package name */
    private a f45177c;

    /* renamed from: d  reason: collision with root package name */
    private int f45178d;

    /* renamed from: e  reason: collision with root package name */
    private int f45179e;

    /* renamed from: f  reason: collision with root package name */
    private int f45180f;

    /* renamed from: g  reason: collision with root package name */
    private int f45181g;

    /* renamed from: h  reason: collision with root package name */
    private final int f45182h;

    /* renamed from: i  reason: collision with root package name */
    private final int f45183i;

    /* renamed from: j  reason: collision with root package name */
    private HashMap f45184j;

    static {
        Covode.recordClassIndex(27536);
    }

    public TuxNavBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    public final View a(int i2) {
        if (this.f45184j == null) {
            this.f45184j = new HashMap();
        }
        View view = (View) this.f45184j.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f45184j.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final void a(g gVar) {
        l.c(gVar, "");
        this.f45177c.f45187c = gVar;
        b(gVar);
    }

    public final void a(boolean z) {
        View a2 = a(R.id.cst);
        l.a((Object) a2, "");
        a2.setVisibility(z ? 0 : 8);
    }

    public final void a(Object obj, h.f.a.b<? super com.bytedance.tux.navigation.a.c, z> bVar) {
        com.bytedance.tux.navigation.a.c cVar;
        l.c(obj, "");
        l.c(bVar, "");
        LinearLayout linearLayout = (LinearLayout) a(R.id.nav_start);
        l.a((Object) linearLayout, "");
        h<View> a2 = x.a(linearLayout);
        LinearLayout linearLayout2 = (LinearLayout) a(R.id.nav_end);
        l.a((Object) linearLayout2, "");
        Iterator a3 = k.a((h) a2, (h) x.a(linearLayout2)).a();
        int i2 = 0;
        while (a3.hasNext()) {
            Object next = a3.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            View view = (View) next;
            if (a(view, obj)) {
                if (i2 < this.f45177c.f45185a.size()) {
                    cVar = this.f45177c.f45185a.get(i2);
                } else {
                    cVar = this.f45177c.f45186b.get(i2 - this.f45177c.f45185a.size());
                }
                bVar.invoke(cVar);
                if ((cVar instanceof com.bytedance.tux.navigation.a.b) && (view instanceof TuxIconView)) {
                    a((com.bytedance.tux.navigation.a.b) cVar, (TuxIconView) view);
                } else if ((cVar instanceof com.bytedance.tux.navigation.a.e) && (view instanceof TuxTextView)) {
                    a((com.bytedance.tux.navigation.a.e) cVar, (TuxTextView) view);
                }
            }
            i2 = i3;
        }
    }

    private final void b() {
        MethodCollector.i(8169);
        ((LinearLayout) a(R.id.nav_end)).removeAllViews();
        Iterator<T> it = this.f45177c.f45186b.iterator();
        while (it.hasNext()) {
            d(it.next());
        }
        MethodCollector.o(8169);
    }

    private final void a() {
        MethodCollector.i(8088);
        ((LinearLayout) a(R.id.nav_start)).removeAllViews();
        Iterator<T> it = this.f45177c.f45185a.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
        MethodCollector.o(8088);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<com.bytedance.tux.navigation.a.c> f45185a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final List<com.bytedance.tux.navigation.a.c> f45186b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public g f45187c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f45188d;

        static {
            Covode.recordClassIndex(27537);
        }

        public final a a(g gVar) {
            l.c(gVar, "");
            this.f45187c = gVar;
            return this;
        }

        public final a a(com.bytedance.tux.navigation.a.c... cVarArr) {
            l.c(cVarArr, "");
            this.f45185a.addAll(i.j(cVarArr));
            return this;
        }

        public final a b(com.bytedance.tux.navigation.a.c... cVarArr) {
            l.c(cVarArr, "");
            this.f45186b.addAll(i.j(cVarArr));
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f45189a;

        static {
            Covode.recordClassIndex(27538);
        }

        b(g gVar) {
            this.f45189a = gVar;
        }

        public final void onClick(View view) {
            com.bytedance.tux.navigation.a.d dVar = this.f45189a.f45199f;
            if (dVar != null) {
                dVar.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.tux.navigation.a.b f45190a;

        static {
            Covode.recordClassIndex(27540);
        }

        d(com.bytedance.tux.navigation.a.b bVar) {
            this.f45190a = bVar;
        }

        public final void onClick(View view) {
            com.bytedance.tux.navigation.a.d dVar = this.f45190a.f45199f;
            if (dVar != null) {
                dVar.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.tux.navigation.a.e f45191a;

        static {
            Covode.recordClassIndex(27542);
        }

        f(com.bytedance.tux.navigation.a.e eVar) {
            this.f45191a = eVar;
        }

        public final void onClick(View view) {
            com.bytedance.tux.navigation.a.d dVar = this.f45191a.f45199f;
            if (dVar != null) {
                dVar.a();
            }
        }
    }

    public final void a(com.bytedance.tux.navigation.a.c cVar) {
        l.c(cVar, "");
        this.f45177c.f45185a.add(cVar);
        a();
    }

    public final void b(com.bytedance.tux.navigation.a.c cVar) {
        l.c(cVar, "");
        this.f45177c.f45186b.add(cVar);
        b();
    }

    public final void setNavBackground(int i2) {
        FlexLayout flexLayout = (FlexLayout) a(R.id.csq);
        if (flexLayout != null) {
            flexLayout.setBackgroundColor(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {
        final /* synthetic */ g $centerAction;
        final /* synthetic */ TuxNavBar this$0;

        static {
            Covode.recordClassIndex(27539);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(TuxNavBar tuxNavBar, g gVar) {
            super(1);
            this.this$0 = tuxNavBar;
            this.$centerAction = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.c(aVar2, "");
            aVar2.f44749a = this.$centerAction.f45209c;
            aVar2.f44752d = Integer.valueOf(this.this$0.f45176b);
            return z.f158842a;
        }
    }

    public final void setNavActions(a aVar) {
        l.c(aVar, "");
        this.f45177c = aVar;
        a();
        b();
        b(aVar.f45187c);
        a(aVar.f45188d);
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {
        final /* synthetic */ int $defaultIconSize;
        final /* synthetic */ com.bytedance.tux.navigation.a.b $iconAction;
        final /* synthetic */ TuxNavBar this$0;

        static {
            Covode.recordClassIndex(27541);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(TuxNavBar tuxNavBar, com.bytedance.tux.navigation.a.b bVar, int i2) {
            super(1);
            this.this$0 = tuxNavBar;
            this.$iconAction = bVar;
            this.$defaultIconSize = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            int i2;
            com.bytedance.tux.c.a aVar2 = aVar;
            l.c(aVar2, "");
            aVar2.f44749a = this.$iconAction.f45193a;
            if (this.$iconAction.f45194b) {
                i2 = this.this$0.f45176b;
            } else {
                i2 = this.this$0.f45175a;
            }
            aVar2.f44752d = Integer.valueOf(i2);
            aVar2.f44750b = this.$defaultIconSize;
            aVar2.f44751c = this.$defaultIconSize;
            return z.f158842a;
        }
    }

    private static View a(com.bytedance.tux.navigation.a.a aVar) {
        View view = aVar.f45192a;
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        int a2 = h.g.a.a(TypedValue.applyDimension(1, 40.0f, system.getDisplayMetrics()));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a2, a2);
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
        return view;
    }

    private final void c(com.bytedance.tux.navigation.a.c cVar) {
        View a2;
        MethodCollector.i(8015);
        if (cVar instanceof com.bytedance.tux.navigation.a.e) {
            a2 = a((com.bytedance.tux.navigation.a.e) cVar);
        } else if (cVar instanceof com.bytedance.tux.navigation.a.b) {
            a2 = a((com.bytedance.tux.navigation.a.b) cVar);
        } else {
            if (cVar instanceof com.bytedance.tux.navigation.a.a) {
                a2 = a((com.bytedance.tux.navigation.a.a) cVar);
            }
            MethodCollector.o(8015);
        }
        if (a2 != null) {
            ((LinearLayout) a(R.id.nav_start)).addView(a2);
            MethodCollector.o(8015);
            return;
        }
        MethodCollector.o(8015);
    }

    private final void d(com.bytedance.tux.navigation.a.c cVar) {
        View a2;
        MethodCollector.i(8019);
        if (cVar instanceof com.bytedance.tux.navigation.a.e) {
            a2 = a((com.bytedance.tux.navigation.a.e) cVar);
        } else if (cVar instanceof com.bytedance.tux.navigation.a.b) {
            a2 = a((com.bytedance.tux.navigation.a.b) cVar);
        } else {
            if (cVar instanceof com.bytedance.tux.navigation.a.a) {
                a2 = a((com.bytedance.tux.navigation.a.a) cVar);
            }
            MethodCollector.o(8019);
        }
        if (a2 != null) {
            ((LinearLayout) a(R.id.nav_end)).addView(a2);
            MethodCollector.o(8019);
            return;
        }
        MethodCollector.o(8019);
    }

    private final View a(com.bytedance.tux.navigation.a.b bVar) {
        if (bVar.f45193a == -1 && bVar.f45195c == null && bVar.f45196d == null) {
            return null;
        }
        Context context = getContext();
        l.a((Object) context, "");
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        int a2 = h.g.a.a(TypedValue.applyDimension(1, 40.0f, system.getDisplayMetrics()));
        tuxIconView.setLayoutParams(new LinearLayout.LayoutParams(a2, a2));
        a(bVar, tuxIconView);
        return tuxIconView;
    }

    private final TuxTextView a(com.bytedance.tux.navigation.a.e eVar) {
        Context context = getContext();
        l.a((Object) context, "");
        TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
        tuxTextView.setGravity(17);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        Integer valueOf = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        com.bytedance.tux.h.i.a((View) tuxTextView, valueOf, (Integer) null, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics()))), (Integer) null, false, 26);
        Resources system3 = Resources.getSystem();
        l.a((Object) system3, "");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, h.g.a.a(TypedValue.applyDimension(1, 40.0f, system3.getDisplayMetrics())));
        layoutParams.gravity = 16;
        tuxTextView.setLayoutParams(layoutParams);
        a(eVar, tuxTextView);
        return tuxTextView;
    }

    private final void b(g gVar) {
        boolean z;
        if (gVar != null) {
            TuxTextView tuxTextView = (TuxTextView) a(R.id.csn);
            l.a((Object) tuxTextView, "");
            b(tuxTextView, gVar.f45200g);
            if (gVar.f45207a.length() > 0) {
                TuxTextView tuxTextView2 = (TuxTextView) a(R.id.csn);
                l.a((Object) tuxTextView2, "");
                tuxTextView2.setText(gVar.f45207a);
            }
            CharSequence charSequence = gVar.f45208b;
            if (charSequence.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                TuxTextView tuxTextView3 = (TuxTextView) a(R.id.csv);
                l.a((Object) tuxTextView3, "");
                tuxTextView3.setVisibility(0);
                TuxTextView tuxTextView4 = (TuxTextView) a(R.id.csv);
                l.a((Object) tuxTextView4, "");
                tuxTextView4.setText(charSequence);
                ((TuxTextView) a(R.id.csn)).setTuxFont(this.f45183i);
            } else {
                TuxTextView tuxTextView5 = (TuxTextView) a(R.id.csv);
                l.a((Object) tuxTextView5, "");
                tuxTextView5.setVisibility(8);
                ((TuxTextView) a(R.id.csn)).setTuxFont(this.f45182h);
            }
            if (gVar.f45209c != -1) {
                com.bytedance.tux.c.a a2 = com.bytedance.tux.c.c.a(new c(this, gVar));
                Context context = getContext();
                l.a((Object) context, "");
                com.bytedance.tux.c.b a3 = a2.a(context);
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                int a4 = h.g.a.a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics()));
                Resources system2 = Resources.getSystem();
                l.a((Object) system2, "");
                a3.setBounds(0, 0, a4, h.g.a.a(TypedValue.applyDimension(1, 20.0f, system2.getDisplayMetrics())));
                if (com.bytedance.tux.h.i.a(this)) {
                    ((TuxTextView) a(R.id.csn)).setCompoundDrawables(a3, null, null, null);
                } else {
                    ((TuxTextView) a(R.id.csn)).setCompoundDrawables(null, null, a3, null);
                }
                ((TuxTextView) a(R.id.csn)).setOnClickListener(new b(gVar));
                return;
            }
            ((TuxTextView) a(R.id.csn)).setCompoundDrawables(null, null, null, null);
        }
    }

    private static void b(View view, Object obj) {
        view.setTag(R.id.eue, obj);
    }

    public static boolean a(View view, Object obj) {
        Object tag = view.getTag(R.id.eue);
        if (tag == null || !tag.equals(obj)) {
            return false;
        }
        return true;
    }

    private final void a(com.bytedance.tux.navigation.a.b bVar, TuxIconView tuxIconView) {
        int i2;
        h.f.a.b<? super TuxIconView, z> bVar2;
        b(tuxIconView, bVar.f45200g);
        if (bVar.f45197e) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        tuxIconView.setVisibility(i2);
        if (bVar.f45194b) {
            com.bytedance.tux.h.i.b(tuxIconView);
            tuxIconView.setOnClickListener(new d(bVar));
        } else {
            tuxIconView.setOnTouchListener(null);
            tuxIconView.setOnClickListener(null);
        }
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        int a2 = h.g.a.a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
        com.bytedance.tux.c.a aVar = bVar.f45195c;
        if (aVar != null) {
            if (aVar.f44750b < 0) {
                aVar.f44750b = a2;
            }
            if (aVar.f44751c < 0) {
                aVar.f44751c = a2;
            }
            tuxIconView.setTuxIcon(aVar);
        } else if (bVar.f45193a != -1) {
            tuxIconView.setTuxIcon(com.bytedance.tux.c.c.a(new e(this, bVar, a2)));
        } else if (bVar.f45196d != null && (bVar2 = bVar.f45196d) != null) {
            bVar2.invoke(tuxIconView);
        }
    }

    private final void a(com.bytedance.tux.navigation.a.e eVar, TuxTextView tuxTextView) {
        int i2;
        b(tuxTextView, eVar.f45200g);
        if (eVar.f45204d) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        tuxTextView.setVisibility(i2);
        if (b.f45211a[eVar.f45202b.ordinal()] != 1) {
            tuxTextView.setTuxFont(this.f45179e);
            tuxTextView.setTextColor(this.f45181g);
        } else {
            tuxTextView.setTuxFont(this.f45178d);
            tuxTextView.setTextColor(this.f45180f);
        }
        if (eVar.f45203c) {
            com.bytedance.tux.h.i.b(tuxTextView);
            tuxTextView.setOnClickListener(new f(eVar));
        } else {
            tuxTextView.setTextColor(this.f45175a);
            tuxTextView.setOnTouchListener(null);
            tuxTextView.setOnClickListener(null);
        }
        tuxTextView.setText(eVar.f45201a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxNavBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        l.c(context, "");
        MethodCollector.i(8272);
        this.f45177c = new a();
        this.f45175a = -16777216;
        this.f45180f = -16777216;
        this.f45181g = -16777216;
        this.f45176b = -16777216;
        View.inflate(context, R.layout.f160001j, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.e3, R.attr.e4, R.attr.e5, R.attr.e6, R.attr.e7, R.attr.e8, R.attr.e9, R.attr.e_, R.attr.ea, R.attr.eb, R.attr.ec, R.attr.ed, R.attr.ee}, i2, 0);
        l.a((Object) obtainStyledAttributes, "");
        int color = obtainStyledAttributes.getColor(3, -16777216);
        int color2 = obtainStyledAttributes.getColor(2, 0);
        this.f45179e = obtainStyledAttributes.getInt(0, 0);
        this.f45178d = obtainStyledAttributes.getInt(1, 0);
        this.f45180f = obtainStyledAttributes.getColor(8, -16777216);
        this.f45181g = obtainStyledAttributes.getColor(7, -16777216);
        this.f45175a = obtainStyledAttributes.getColor(6, -16777216);
        int i3 = obtainStyledAttributes.getInt(10, 0);
        this.f45182h = i3;
        this.f45183i = obtainStyledAttributes.getInt(11, 0);
        int i4 = obtainStyledAttributes.getInt(5, 0);
        int color3 = obtainStyledAttributes.getColor(9, -16777216);
        this.f45176b = color3;
        int color4 = obtainStyledAttributes.getColor(4, -16777216);
        float dimension = obtainStyledAttributes.getDimension(12, 0.0f);
        obtainStyledAttributes.recycle();
        TuxTextView tuxTextView = (TuxTextView) a(R.id.csn);
        tuxTextView.setTuxFont(i3);
        tuxTextView.setTextColor(color3);
        tuxTextView.setMinTextSizePx((int) dimension);
        TuxTextView tuxTextView2 = (TuxTextView) a(R.id.csv);
        tuxTextView2.setTuxFont(i4);
        tuxTextView2.setTextColor(color4);
        a(R.id.cst).setBackgroundColor(color);
        setNavBackground(color2);
        MethodCollector.o(8272);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TuxNavBar(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R.attr.bz : i2);
    }
}
