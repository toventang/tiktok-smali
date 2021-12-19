package com.bytedance.tux.table.cell;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.h.i;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.table.cell.a;
import com.bytedance.tux.table.cell.c;
import com.bytedance.tux.widget.ExpandableLayout;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.n;
import h.w;
import h.z;
import java.util.HashMap;

public final class TuxTextCell extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public final a f45409a;

    /* renamed from: b  reason: collision with root package name */
    public b<? super Boolean, z> f45410b;

    /* renamed from: c  reason: collision with root package name */
    private c.b f45411c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f45412d;

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.tux.table.b f45413e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f45414f;

    /* renamed from: g  reason: collision with root package name */
    private b f45415g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f45416h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f45417i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f45418j;

    /* renamed from: k  reason: collision with root package name */
    private HashMap f45419k;

    static {
        Covode.recordClassIndex(27650);
    }

    public TuxTextCell(Context context) {
        this(context, null, 0, 6);
    }

    public TuxTextCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    private View a(int i2) {
        if (this.f45419k == null) {
            this.f45419k = new HashMap();
        }
        View view = (View) this.f45419k.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f45419k.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
    }

    public final c.b getAccessory() {
        return this.f45411c;
    }

    public final boolean getCellEnabled() {
        return this.f45414f;
    }

    public final com.bytedance.tux.table.b getInset() {
        return this.f45413e;
    }

    public final b getVariant() {
        return this.f45415g;
    }

    public final boolean getWithSeparator() {
        return this.f45412d;
    }

    private final boolean getSubtitleIsShow() {
        TuxTextView tuxTextView = (TuxTextView) a(R.id.eej);
        l.a((Object) tuxTextView, "");
        if (tuxTextView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final CharSequence getSubtitle() {
        TuxTextView tuxTextView = (TuxTextView) a(R.id.eej);
        l.a((Object) tuxTextView, "");
        return tuxTextView.getText();
    }

    public final CharSequence getTitle() {
        TuxTextView tuxTextView = (TuxTextView) a(R.id.title_tv);
        l.a((Object) tuxTextView, "");
        return tuxTextView.getText();
    }

    private final void b() {
        ConstraintLayout constraintLayout = (ConstraintLayout) a(R.id.a3k);
        if (!this.f45414f) {
            constraintLayout.setBackgroundResource(0);
            return;
        }
        c.b bVar = this.f45411c;
        if (bVar == null || !bVar.c()) {
            constraintLayout.setBackgroundResource(0);
            return;
        }
        Context context = constraintLayout.getContext();
        l.a((Object) context, "");
        constraintLayout.setBackground(i.b(context));
    }

    private final void a() {
        int i2;
        int i3;
        if (this.f45416h) {
            TuxTextView tuxTextView = (TuxTextView) a(R.id.title_tv);
            int i4 = 0;
            if (this.f45418j) {
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                i2 = h.g.a.a(TypedValue.applyDimension(1, 12.0f, system.getDisplayMetrics()));
            } else {
                i2 = 0;
            }
            if (!getSubtitleIsShow()) {
                Resources system2 = Resources.getSystem();
                l.a((Object) system2, "");
                i4 = h.g.a.a(TypedValue.applyDimension(1, 17.0f, system2.getDisplayMetrics()));
            }
            i.b(tuxTextView, Integer.valueOf(i2), null, null, Integer.valueOf(i4), false, 22);
            TuxTextView tuxTextView2 = (TuxTextView) a(R.id.eej);
            a aVar = null;
            if (getSubtitleIsShow() && tuxTextView2 != null) {
                c.b bVar = this.f45411c;
                if (bVar != null) {
                    aVar = bVar.a();
                }
                if (l.a(aVar, a.h.f45433b) || l.a(aVar, a.C1116a.f45427b)) {
                    Resources system3 = Resources.getSystem();
                    l.a((Object) system3, "");
                    i3 = h.g.a.a(TypedValue.applyDimension(1, 9.0f, system3.getDisplayMetrics()));
                } else {
                    Resources system4 = Resources.getSystem();
                    l.a((Object) system4, "");
                    i3 = h.g.a.a(TypedValue.applyDimension(1, 6.0f, system4.getDisplayMetrics()));
                }
                i.b(tuxTextView2, null, Integer.valueOf(i3), null, null, false, 29);
            }
            c.b bVar2 = this.f45411c;
            if (bVar2 != null) {
                bVar2.f();
            }
        }
    }

    public final void setCellEnabled(boolean z) {
        this.f45414f = z;
        setViewEnable(z);
    }

    public final void setLoading(boolean z) {
        c.b bVar = this.f45411c;
        if (bVar != null) {
            bVar.a(z);
        }
    }

    public final void setOnClickListener(b<? super Boolean, z> bVar) {
        if (!isClickable()) {
            setClickable(true);
        }
        this.f45410b = bVar;
    }

    private final int a(b bVar) {
        int i2 = d.f45460a[bVar.ordinal()];
        if (i2 == 1) {
            return this.f45409a.f45421a;
        }
        if (i2 == 2) {
            return this.f45409a.f45422b;
        }
        throw new n();
    }

    private final void setWithIcon(boolean z) {
        int i2;
        this.f45418j = z;
        TuxIconView tuxIconView = (TuxIconView) a(R.id.icon_iv);
        l.a((Object) tuxIconView, "");
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        tuxIconView.setVisibility(i2);
        a();
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f45416h) {
            ConstraintLayout constraintLayout = (ConstraintLayout) a(R.id.a3k);
            l.a((Object) constraintLayout, "");
            constraintLayout.setEnabled(z);
            setViewEnable(z);
        }
    }

    public final void setIcon(b<? super ImageView, z> bVar) {
        l.c(bVar, "");
        View a2 = a(R.id.icon_iv);
        l.a((Object) a2, "");
        bVar.invoke(a2);
        setWithIcon(true);
    }

    public final void setTitle(CharSequence charSequence) {
        TuxTextView tuxTextView = (TuxTextView) a(R.id.title_tv);
        l.a((Object) tuxTextView, "");
        tuxTextView.setText(charSequence);
    }

    public final void setVariant(b bVar) {
        l.c(bVar, "");
        this.f45415g = bVar;
        ((TuxTextView) a(R.id.title_tv)).setTextColor(a(bVar));
    }

    public final void setWithSeparator(boolean z) {
        int i2;
        this.f45412d = z;
        View a2 = a(R.id.dyy);
        l.a((Object) a2, "");
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        a2.setVisibility(i2);
    }

    private final void setViewEnable(boolean z) {
        int i2;
        int i3;
        TuxTextView tuxTextView = (TuxTextView) a(R.id.title_tv);
        if (z) {
            i2 = a(this.f45415g);
        } else {
            i2 = this.f45409a.f45425e;
        }
        tuxTextView.setTextColor(i2);
        TuxTextView tuxTextView2 = (TuxTextView) a(R.id.eej);
        a aVar = this.f45409a;
        if (z) {
            i3 = aVar.f45423c;
        } else {
            i3 = aVar.f45425e;
        }
        tuxTextView2.setTextColor(i3);
        a(z);
        c.b bVar = this.f45411c;
        if (bVar != null) {
            bVar.b(z);
        }
        b();
    }

    public final void setInset(com.bytedance.tux.table.b bVar) {
        l.c(bVar, "");
        this.f45413e = bVar;
        int px = bVar.toPx();
        ConstraintLayout constraintLayout = (ConstraintLayout) a(R.id.a3k);
        l.a((Object) constraintLayout, "");
        i.a((View) constraintLayout, Integer.valueOf(px), (Integer) null, Integer.valueOf(px), (Integer) null, false, 26);
    }

    private final void a(boolean z) {
        int i2;
        if (!this.f45417i) {
            TuxIconView tuxIconView = (TuxIconView) a(R.id.icon_iv);
            if (z) {
                i2 = this.f45409a.f45424d;
            } else {
                i2 = this.f45409a.f45425e;
            }
            tuxIconView.setTintColor(i2);
        }
    }

    public final void setIcon(com.bytedance.tux.c.a aVar) {
        boolean z = false;
        if (aVar != null) {
            ((TuxIconView) a(R.id.icon_iv)).setIconRes(aVar.f44749a);
            this.f45417i = false;
            Integer num = aVar.f44752d;
            if (num != null) {
                ((TuxIconView) a(R.id.icon_iv)).setTintColor(num.intValue());
                this.f45417i = true;
            }
            Integer num2 = aVar.f44753e;
            if (num2 != null) {
                ((TuxIconView) a(R.id.icon_iv)).setTintColorRes(num2.intValue());
                this.f45417i = true;
            }
            a(this.f45414f);
            z = true;
        }
        setWithIcon(z);
    }

    public final void setSubtitle(CharSequence charSequence) {
        TuxTextView tuxTextView = (TuxTextView) a(R.id.eej);
        l.a((Object) tuxTextView, "");
        int visibility = tuxTextView.getVisibility();
        if (charSequence == null || charSequence.length() == 0) {
            TuxTextView tuxTextView2 = (TuxTextView) a(R.id.eej);
            l.a((Object) tuxTextView2, "");
            tuxTextView2.setVisibility(8);
        } else {
            TuxTextView tuxTextView3 = (TuxTextView) a(R.id.eej);
            l.a((Object) tuxTextView3, "");
            tuxTextView3.setText(charSequence);
            TuxTextView tuxTextView4 = (TuxTextView) a(R.id.eej);
            l.a((Object) tuxTextView4, "");
            tuxTextView4.setVisibility(0);
        }
        TuxTextView tuxTextView5 = (TuxTextView) a(R.id.eej);
        l.a((Object) tuxTextView5, "");
        if (visibility != tuxTextView5.getVisibility()) {
            a();
        }
    }

    public final void setAccessory(c.b bVar) {
        View view;
        c.b bVar2 = this.f45411c;
        if (bVar2 != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) a(R.id.a3k);
            l.a((Object) constraintLayout, "");
            View b2 = bVar2.b();
            TuxTextView tuxTextView = (TuxTextView) a(R.id.title_tv);
            l.a((Object) tuxTextView, "");
            com.bytedance.tux.table.a.b.b(constraintLayout, b2, tuxTextView);
            ((ExpandableLayout) a(R.id.ayw)).removeAllViews();
            bVar2.e();
        }
        if (bVar != null) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) a(R.id.a3k);
            l.a((Object) constraintLayout2, "");
            View b3 = bVar.b();
            TuxTextView tuxTextView2 = (TuxTextView) a(R.id.title_tv);
            l.a((Object) tuxTextView2, "");
            com.bytedance.tux.table.a.b.a(constraintLayout2, b3, tuxTextView2);
            ConstraintLayout constraintLayout3 = (ConstraintLayout) a(R.id.a3k);
            l.a((Object) constraintLayout3, "");
            l.c(constraintLayout3, "");
            bVar.b(constraintLayout3.isEnabled());
            if (l.a(bVar.a(), a.e.f45430b) && (view = ((c.g) bVar).f45451e) != null) {
                ExpandableLayout expandableLayout = (ExpandableLayout) a(R.id.ayw);
                l.a((Object) expandableLayout, "");
                expandableLayout.setVisibility(0);
                expandableLayout.addView(view);
            }
        }
        this.f45411c = bVar;
        b();
        a();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        TuxTextView tuxTextView;
        MethodCollector.i(9060);
        c.b bVar = this.f45411c;
        TuxTextView tuxTextView2 = null;
        if (bVar != null) {
            a a2 = bVar.a();
            if (l.a(a2, a.f.f45431b)) {
                tuxTextView = bVar.b();
            } else if (l.a(a2, a.d.f45429b)) {
                View b2 = bVar.b();
                if (b2 != null) {
                    TuxTextView labelTv$tux_release = ((com.bytedance.tux.table.a.a) b2).getLabelTv$tux_release();
                    l.a((Object) labelTv$tux_release, "");
                    int visibility = labelTv$tux_release.getVisibility();
                    tuxTextView = labelTv$tux_release;
                    if (visibility != 0) {
                        tuxTextView = null;
                    }
                } else {
                    w wVar = new w("null cannot be cast to non-null type");
                    MethodCollector.o(9060);
                    throw wVar;
                }
            } else {
                tuxTextView = null;
            }
            boolean z = tuxTextView instanceof TuxTextView;
            TuxTextView tuxTextView3 = tuxTextView;
            if (!z) {
                tuxTextView3 = null;
            }
            TuxTextView tuxTextView4 = tuxTextView3;
            if (tuxTextView4 != null) {
                tuxTextView4.setMaxWidth(Integer.MAX_VALUE);
                tuxTextView2 = tuxTextView4;
            }
        }
        super.onMeasure(i2, i3);
        if (tuxTextView2 == null) {
            MethodCollector.o(9060);
            return;
        }
        c.b bVar2 = this.f45411c;
        if (bVar2 == null) {
            MethodCollector.o(9060);
            return;
        }
        TuxTextView tuxTextView5 = (TuxTextView) a(R.id.title_tv);
        l.a((Object) tuxTextView5, "");
        if (tuxTextView5.getLineCount() > 1) {
            tuxTextView2.setMaxWidth(com.bytedance.tux.table.a.b.f45405a);
            super.onMeasure(i2, i3);
            TuxTextView tuxTextView6 = (TuxTextView) a(R.id.title_tv);
            l.a((Object) tuxTextView6, "");
            if (tuxTextView6.getLineCount() == 1) {
                bVar2.d();
                if (this.f45418j) {
                    Resources system = Resources.getSystem();
                    l.a((Object) system, "");
                    h.g.a.a(TypedValue.applyDimension(1, 12.0f, system.getDisplayMetrics()));
                }
                int size = (View.MeasureSpec.getSize(i2) - getPaddingLeft()) - getPaddingRight();
                TuxTextView tuxTextView7 = (TuxTextView) a(R.id.title_tv);
                l.a((Object) tuxTextView7, "");
                tuxTextView7.getMeasuredWidth();
                TuxIconView tuxIconView = (TuxIconView) a(R.id.icon_iv);
                l.a((Object) tuxIconView, "");
                tuxIconView.getMeasuredWidth();
                tuxTextView2.setMaxWidth(size);
            }
        }
        MethodCollector.o(9060);
    }

    private static void a(int i2, int i3, TuxTextView tuxTextView) {
        tuxTextView.setTuxFont(i2);
        tuxTextView.setTextColor(i3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxTextCell(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        boolean z;
        a aVar;
        l.c(context, "");
        MethodCollector.i(9246);
        this.f45413e = com.bytedance.tux.table.b.PADDING_16;
        this.f45414f = true;
        this.f45415g = b.NORMAL;
        com.a.a(LayoutInflater.from(context), R.layout.f160004m, this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842766, 16843014, R.attr.g7, R.attr.g8, R.attr.g9, R.attr.g_, R.attr.ga, R.attr.gb, R.attr.gc, R.attr.gd, R.attr.ge, R.attr.gf, R.attr.gg, R.attr.gh, R.attr.gi, R.attr.gj, R.attr.gk, R.attr.aom, R.attr.aon, R.attr.aoo, R.attr.aop, R.attr.aor, R.attr.ap8, R.attr.apt, R.attr.aqq, R.attr.ar7, R.attr.arq}, i2, 0);
        l.a((Object) obtainStyledAttributes, "");
        a aVar2 = new a(obtainStyledAttributes.getColor(14, 0), obtainStyledAttributes.getColor(15, 0), obtainStyledAttributes.getColor(11, 0), obtainStyledAttributes.getColor(5, 0), obtainStyledAttributes.getColor(13, 0));
        this.f45409a = aVar2;
        int i3 = obtainStyledAttributes.getInt(16, 0);
        int i4 = aVar2.f45421a;
        TuxTextView tuxTextView = (TuxTextView) a(R.id.title_tv);
        setTitle(obtainStyledAttributes.getString(26));
        l.a((Object) tuxTextView, "");
        a(i3, i4, tuxTextView);
        int i5 = obtainStyledAttributes.getInt(12, 0);
        int i6 = aVar2.f45423c;
        TuxTextView tuxTextView2 = (TuxTextView) a(R.id.eej);
        setSubtitle(obtainStyledAttributes.getString(25));
        l.a((Object) tuxTextView2, "");
        a(i5, i6, tuxTextView2);
        final int resourceId = obtainStyledAttributes.getResourceId(22, 0);
        setIcon(com.bytedance.tux.c.c.a(new b<com.bytedance.tux.c.a, z>(this) {
            /* class com.bytedance.tux.table.cell.TuxTextCell.AnonymousClass1 */
            final /* synthetic */ TuxTextCell this$0;

            static {
                Covode.recordClassIndex(27651);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
                com.bytedance.tux.c.a aVar2 = aVar;
                l.c(aVar2, "");
                aVar2.f44749a = resourceId;
                aVar2.f44752d = Integer.valueOf(this.this$0.f45409a.f45424d);
                return z.f158842a;
            }
        }));
        if (resourceId != 0) {
            z = true;
        } else {
            z = false;
        }
        setWithIcon(z);
        View a2 = a(R.id.dyy);
        a2.findViewById(R.id.dyy).setBackgroundColor(obtainStyledAttributes.getColor(10, 0));
        setWithSeparator(obtainStyledAttributes.getBoolean(24, false));
        setInset(com.bytedance.tux.table.b.PADDING_16);
        if (obtainStyledAttributes.hasValue(20)) {
            switch (obtainStyledAttributes.getInt(20, -1)) {
                case 0:
                    aVar = a.f.f45431b;
                    break;
                case 1:
                    aVar = a.d.f45429b;
                    break;
                case 2:
                    aVar = a.h.f45433b;
                    break;
                case 3:
                    aVar = a.g.f45432b;
                    break;
                case 4:
                    aVar = a.b.f45428b;
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    aVar = a.e.f45430b;
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    aVar = a.C1116a.f45427b;
                    break;
                default:
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("unsupported text cell accessory");
                    MethodCollector.o(9246);
                    throw illegalArgumentException;
            }
            Context context2 = getContext();
            l.a((Object) context2, "");
            setAccessory(aVar.a(context2, attributeSet));
        }
        obtainStyledAttributes.recycle();
        this.f45416h = true;
        setViewEnable(true);
        a();
        ((ConstraintLayout) a(R.id.a3k)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.bytedance.tux.table.cell.TuxTextCell.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ TuxTextCell f45420a;

            static {
                Covode.recordClassIndex(27652);
            }

            {
                this.f45420a = r1;
            }

            public final void onClick(View view) {
                c.b accessory = this.f45420a.getAccessory();
                if (accessory == null) {
                    b<? super Boolean, z> bVar = this.f45420a.f45410b;
                    if (bVar != null) {
                        bVar.invoke(Boolean.valueOf(this.f45420a.getCellEnabled()));
                    }
                } else if (!this.f45420a.getCellEnabled()) {
                    h.f.a.a<z> aVar = accessory.f45439a;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                } else if (accessory.c()) {
                    accessory.b().performClick();
                }
            }
        });
        MethodCollector.o(9246);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TuxTextCell(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R.attr.cc : i2);
    }

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f45421a;

        /* renamed from: b  reason: collision with root package name */
        public final int f45422b;

        /* renamed from: c  reason: collision with root package name */
        public final int f45423c;

        /* renamed from: d  reason: collision with root package name */
        public final int f45424d;

        /* renamed from: e  reason: collision with root package name */
        public final int f45425e;

        static {
            Covode.recordClassIndex(27653);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f45421a == aVar.f45421a && this.f45422b == aVar.f45422b && this.f45423c == aVar.f45423c && this.f45424d == aVar.f45424d && this.f45425e == aVar.f45425e;
        }

        public final int hashCode() {
            return (((((((this.f45421a * 31) + this.f45422b) * 31) + this.f45423c) * 31) + this.f45424d) * 31) + this.f45425e;
        }

        public final String toString() {
            return "TextColor(title=" + this.f45421a + ", destructiveTitle=" + this.f45422b + ", subtitle=" + this.f45423c + ", icon=" + this.f45424d + ", disable=" + this.f45425e + ")";
        }

        public a(int i2, int i3, int i4, int i5, int i6) {
            this.f45421a = i2;
            this.f45422b = i3;
            this.f45423c = i4;
            this.f45424d = i5;
            this.f45425e = i6;
        }
    }
}
