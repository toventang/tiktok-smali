package com.bytedance.tux.table.header;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.h.i;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.table.a;
import com.bytedance.tux.table.b;
import com.bytedance.tux.table.header.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.n;
import java.util.HashMap;

public final class TuxTableHeader extends ConstraintLayout {

    /* renamed from: g  reason: collision with root package name */
    private a f45461g;

    /* renamed from: h  reason: collision with root package name */
    private b f45462h;

    /* renamed from: i  reason: collision with root package name */
    private View.OnClickListener f45463i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f45464j;

    /* renamed from: k  reason: collision with root package name */
    private a.AbstractC1118a f45465k;

    /* renamed from: l  reason: collision with root package name */
    private HashMap f45466l;

    static {
        Covode.recordClassIndex(27682);
    }

    public TuxTableHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private View b(int i2) {
        if (this.f45466l == null) {
            this.f45466l = new HashMap();
        }
        View view = (View) this.f45466l.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f45466l.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final a.AbstractC1118a getAccessory() {
        return this.f45465k;
    }

    public final b getHeaderInset() {
        return this.f45462h;
    }

    public final com.bytedance.tux.table.a getHeaderSize() {
        return this.f45461g;
    }

    public final View.OnClickListener getInfoIconClickListener() {
        return this.f45463i;
    }

    public final boolean getShowSeparator() {
        return this.f45464j;
    }

    private final boolean c() {
        CharSequence subtitle;
        if (this.f45461g == com.bytedance.tux.table.a.SMALL || (subtitle = getSubtitle()) == null || subtitle.length() == 0) {
            return false;
        }
        return true;
    }

    public final CharSequence getSubtitle() {
        TuxTextView tuxTextView = (TuxTextView) b(R.id.eej);
        l.a((Object) tuxTextView, "");
        return tuxTextView.getText();
    }

    public final CharSequence getTitle() {
        TuxTextView tuxTextView = (TuxTextView) b(R.id.title_tv);
        l.a((Object) tuxTextView, "");
        return tuxTextView.getText();
    }

    private final void b() {
        int i2;
        View a2;
        View a3;
        int a4;
        int i3 = 0;
        if (this.f45461g == com.bytedance.tux.table.a.SMALL) {
            LinearLayout linearLayout = (LinearLayout) b(R.id.emj);
            l.a((Object) linearLayout, "");
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            Integer valueOf = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics())));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            i.b(linearLayout, null, valueOf, null, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 4.0f, system2.getDisplayMetrics()))), false, 21);
            View b2 = b(R.id.dyy);
            l.a((Object) b2, "");
            if (this.f45464j) {
                Resources system3 = Resources.getSystem();
                l.a((Object) system3, "");
                i3 = h.g.a.a(TypedValue.applyDimension(1, 9.0f, system3.getDisplayMetrics()));
            }
            i.b(b2, null, Integer.valueOf(i3), null, null, false, 29);
            TuxTextView tuxTextView = (TuxTextView) b(R.id.eej);
            l.a((Object) tuxTextView, "");
            tuxTextView.setVisibility(8);
            a.AbstractC1118a aVar = this.f45465k;
            if (aVar != null && (a3 = aVar.a()) != null) {
                if (this.f45464j) {
                    Resources system4 = Resources.getSystem();
                    l.a((Object) system4, "");
                    a4 = h.g.a.a(TypedValue.applyDimension(1, 29.0f, system4.getDisplayMetrics()));
                } else {
                    Resources system5 = Resources.getSystem();
                    l.a((Object) system5, "");
                    a4 = h.g.a.a(TypedValue.applyDimension(1, 20.0f, system5.getDisplayMetrics()));
                }
                i.b(a3, null, Integer.valueOf(a4), null, null, false, 29);
                return;
            }
            return;
        }
        View b3 = b(R.id.dyy);
        l.a((Object) b3, "");
        if (this.f45464j) {
            Resources system6 = Resources.getSystem();
            l.a((Object) system6, "");
            i2 = h.g.a.a(TypedValue.applyDimension(1, 8.0f, system6.getDisplayMetrics()));
        } else {
            i2 = 0;
        }
        i.b(b3, null, Integer.valueOf(i2), null, null, false, 29);
        Resources system7 = Resources.getSystem();
        l.a((Object) system7, "");
        int a5 = h.g.a.a(TypedValue.applyDimension(1, 17.0f, system7.getDisplayMetrics()));
        if (c()) {
            LinearLayout linearLayout2 = (LinearLayout) b(R.id.emj);
            l.a((Object) linearLayout2, "");
            i.b(linearLayout2, null, Integer.valueOf(a5), null, null, false, 29);
            TuxTextView tuxTextView2 = (TuxTextView) b(R.id.eej);
            l.a((Object) tuxTextView2, "");
            Resources system8 = Resources.getSystem();
            l.a((Object) system8, "");
            Integer valueOf2 = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 6.0f, system8.getDisplayMetrics())));
            Resources system9 = Resources.getSystem();
            l.a((Object) system9, "");
            i.b(tuxTextView2, null, valueOf2, null, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 8.0f, system9.getDisplayMetrics()))), false, 21);
            TuxTextView tuxTextView3 = (TuxTextView) b(R.id.eej);
            l.a((Object) tuxTextView3, "");
            tuxTextView3.setVisibility(0);
        } else {
            LinearLayout linearLayout3 = (LinearLayout) b(R.id.emj);
            l.a((Object) linearLayout3, "");
            Integer valueOf3 = Integer.valueOf(a5);
            Resources system10 = Resources.getSystem();
            l.a((Object) system10, "");
            i.b(linearLayout3, null, valueOf3, null, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 8.0f, system10.getDisplayMetrics()))), false, 21);
            TuxTextView tuxTextView4 = (TuxTextView) b(R.id.eej);
            l.a((Object) tuxTextView4, "");
            tuxTextView4.setVisibility(8);
        }
        a.AbstractC1118a aVar2 = this.f45465k;
        if (aVar2 != null && (a2 = aVar2.a()) != null) {
            if (this.f45464j) {
                Resources system11 = Resources.getSystem();
                l.a((Object) system11, "");
                a5 = h.g.a.a(TypedValue.applyDimension(1, 25.0f, system11.getDisplayMetrics()));
            }
            i.b(a2, null, Integer.valueOf(a5), null, null, false, 29);
        }
    }

    public final void setHeaderInset(b bVar) {
        l.c(bVar, "");
        this.f45462h = bVar;
        int px = bVar.toPx();
        i.a((View) this, Integer.valueOf(px), (Integer) null, Integer.valueOf(px), (Integer) null, false, 26);
    }

    public final void setShowSeparator(boolean z) {
        int i2;
        this.f45464j = z;
        View b2 = b(R.id.dyy);
        l.a((Object) b2, "");
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        b2.setVisibility(i2);
        b();
    }

    public final void setTitle(CharSequence charSequence) {
        TuxTextView tuxTextView = (TuxTextView) b(R.id.title_tv);
        l.a((Object) tuxTextView, "");
        tuxTextView.setText(charSequence);
    }

    private final int a(TypedArray typedArray) {
        int i2;
        int i3 = b.f45467a[this.f45461g.ordinal()];
        if (i3 == 1) {
            i2 = 15;
        } else if (i3 == 2) {
            i2 = 14;
        } else if (i3 == 3) {
            i2 = 13;
        } else {
            throw new n();
        }
        return typedArray.getInt(i2, 0);
    }

    private final int b(TypedArray typedArray) {
        int i2;
        int i3 = b.f45468b[this.f45461g.ordinal()];
        if (i3 == 1) {
            i2 = 12;
        } else if (i3 == 2) {
            i2 = 11;
        } else if (i3 == 3) {
            i2 = 10;
        } else {
            throw new n();
        }
        return typedArray.getColor(i2, 0);
    }

    public final void setInfoIconClickListener(View.OnClickListener onClickListener) {
        int i2;
        TuxIconView tuxIconView = (TuxIconView) b(R.id.bob);
        l.a((Object) tuxIconView, "");
        if (onClickListener != null) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        tuxIconView.setVisibility(i2);
        ((TuxIconView) b(R.id.bob)).setOnClickListener(onClickListener);
    }

    public final void setAccessory(a.AbstractC1118a aVar) {
        a.AbstractC1118a aVar2 = this.f45465k;
        if (aVar2 != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) b(R.id.bf9);
            l.a((Object) constraintLayout, "");
            View a2 = aVar2.a();
            LinearLayout linearLayout = (LinearLayout) b(R.id.emj);
            l.a((Object) linearLayout, "");
            com.bytedance.tux.table.a.b.b(constraintLayout, a2, linearLayout);
        }
        if (aVar != null) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) b(R.id.bf9);
            l.a((Object) constraintLayout2, "");
            View a3 = aVar.a();
            LinearLayout linearLayout2 = (LinearLayout) b(R.id.emj);
            l.a((Object) linearLayout2, "");
            com.bytedance.tux.table.a.b.a(constraintLayout2, a3, linearLayout2);
        } else {
            aVar = null;
        }
        this.f45465k = aVar;
        b();
    }

    public final void setHeaderSize(com.bytedance.tux.table.a aVar) {
        l.c(aVar, "");
        this.f45461g = aVar;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, new int[]{R.attr.fq, R.attr.fr, R.attr.fs, R.attr.ft, R.attr.fu, R.attr.fv, R.attr.fw, R.attr.fx, R.attr.fy, R.attr.fz, R.attr.g0, R.attr.g1, R.attr.g2, R.attr.g3, R.attr.g4, R.attr.g5}, R.attr.ca, 0);
        l.a((Object) obtainStyledAttributes, "");
        int a2 = a(obtainStyledAttributes);
        int b2 = b(obtainStyledAttributes);
        TuxTextView tuxTextView = (TuxTextView) b(R.id.title_tv);
        l.a((Object) tuxTextView, "");
        a(a2, b2, tuxTextView);
        obtainStyledAttributes.recycle();
        b();
    }

    public final void setSubtitle(CharSequence charSequence) {
        int i2;
        TuxTextView tuxTextView = (TuxTextView) b(R.id.eej);
        l.a((Object) tuxTextView, "");
        CharSequence text = tuxTextView.getText();
        TuxTextView tuxTextView2 = (TuxTextView) b(R.id.eej);
        l.a((Object) tuxTextView2, "");
        tuxTextView2.setText(charSequence);
        if (this.f45461g != com.bytedance.tux.table.a.SMALL) {
            TuxTextView tuxTextView3 = (TuxTextView) b(R.id.eej);
            l.a((Object) tuxTextView3, "");
            if (charSequence == null || charSequence.length() == 0) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            tuxTextView3.setVisibility(i2);
            if (text == null || text.length() == 0) {
                if (charSequence == null || charSequence.length() == 0) {
                    if (text == null) {
                        return;
                    }
                }
                b();
            }
            if (text.length() != 0) {
                if (!(charSequence == null || charSequence.length() == 0)) {
                    return;
                }
                b();
            }
        }
    }

    private static void a(int i2, int i3, TuxTextView tuxTextView) {
        tuxTextView.setTuxFont(i2);
        tuxTextView.setTextColor(i3);
    }

    private /* synthetic */ TuxTableHeader(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxTableHeader(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, R.attr.ca);
        l.c(context, "");
        this.f45461g = com.bytedance.tux.table.a.SMALL;
        this.f45462h = b.PADDING_16;
        com.a.a(LayoutInflater.from(context), R.layout.f160003l, this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.fq, R.attr.fr, R.attr.fs, R.attr.ft, R.attr.fu, R.attr.fv, R.attr.fw, R.attr.fx, R.attr.fy, R.attr.fz, R.attr.g0, R.attr.g1, R.attr.g2, R.attr.g3, R.attr.g4, R.attr.g5}, R.attr.ca, 0);
        l.a((Object) obtainStyledAttributes, "");
        int a2 = a(obtainStyledAttributes);
        int b2 = b(obtainStyledAttributes);
        TuxTextView tuxTextView = (TuxTextView) b(R.id.title_tv);
        l.a((Object) tuxTextView, "");
        a(a2, b2, tuxTextView);
        int i2 = obtainStyledAttributes.getInt(9, 0);
        int color = obtainStyledAttributes.getColor(8, 0);
        TuxTextView tuxTextView2 = (TuxTextView) b(R.id.eej);
        l.a((Object) tuxTextView2, "");
        a(i2, color, tuxTextView2);
        View b3 = b(R.id.dyy);
        b3.findViewById(R.id.dyy).setBackgroundColor(obtainStyledAttributes.getColor(7, 0));
        TuxIconView tuxIconView = (TuxIconView) b(R.id.bob);
        tuxIconView.setIconRes(obtainStyledAttributes.getResourceId(4, 0));
        tuxIconView.setTintColor(obtainStyledAttributes.getColor(3, 0));
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        tuxIconView.setIconWidth(h.g.a.a(TypedValue.applyDimension(1, 12.0f, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        tuxIconView.setIconHeight(h.g.a.a(TypedValue.applyDimension(1, 12.0f, system2.getDisplayMetrics())));
        obtainStyledAttributes.recycle();
        b();
    }
}
