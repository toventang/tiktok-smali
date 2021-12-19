package com.ss.android.ugc.aweme.ecommerce.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.h.v;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.c;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import java.util.List;
import java.util.Objects;

public final class AddressInfoCard extends ConstraintLayout {

    /* renamed from: h  reason: collision with root package name */
    public static final a f87587h = new a((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    public boolean f87588g;

    /* renamed from: i  reason: collision with root package name */
    private boolean f87589i;

    /* renamed from: j  reason: collision with root package name */
    private int f87590j;

    /* renamed from: k  reason: collision with root package name */
    private String f87591k;

    /* renamed from: l  reason: collision with root package name */
    private String f87592l;

    /* renamed from: m  reason: collision with root package name */
    private String f87593m;
    private String n;
    private String o;
    private String p;
    private boolean q;
    private String r;
    private String s;
    private SparseArray t;

    static {
        Covode.recordClassIndex(55059);
    }

    public AddressInfoCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final View b(int i2) {
        if (this.t == null) {
            this.t = new SparseArray();
        }
        View view = (View) this.t.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.t.put(i2, findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(55060);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final String getAddressDetailText() {
        return this.o;
    }

    public final String getEmailText() {
        return this.f87593m;
    }

    public final boolean getHasPrefix() {
        return this.f87589i;
    }

    public final String getHintText() {
        return this.s;
    }

    public final String getNameText() {
        return this.f87591k;
    }

    public final String getPhoneText() {
        return this.f87592l;
    }

    public final boolean getReachable() {
        return this.q;
    }

    public final String getRegionText() {
        return this.n;
    }

    public final int getSuffixType() {
        return this.f87590j;
    }

    public final String getUiMode() {
        return this.r;
    }

    public final String getZipcodeText() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AddressInfoCard f87594a;

        static {
            Covode.recordClassIndex(55061);
        }

        b(AddressInfoCard addressInfoCard) {
            this.f87594a = addressInfoCard;
        }

        public final void run() {
            Rect rect = new Rect();
            ((TuxTextView) this.f87594a.b(R.id.ars)).getHitRect(rect);
            rect.top -= (int) n.b(this.f87594a.getContext(), 6.0f);
            rect.bottom += (int) n.b(this.f87594a.getContext(), 6.0f);
            rect.left -= (int) n.b(this.f87594a.getContext(), 16.0f);
            rect.right += (int) n.b(this.f87594a.getContext(), 16.0f);
            FrameLayout frameLayout = (FrameLayout) this.f87594a.b(R.id.ab9);
            l.b(frameLayout, "");
            frameLayout.setTouchDelegate(new TouchDelegate(rect, this.f87594a.b(R.id.ars)));
        }
    }

    public final void setDefault(boolean z) {
        int i2;
        this.f87588g = z;
        TuxTextView tuxTextView = (TuxTextView) b(R.id.aj7);
        l.b(tuxTextView, "");
        if (this.f87588g) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        tuxTextView.setVisibility(i2);
    }

    public final void setPaddingVertical(int i2) {
        float f2 = (float) i2;
        setPadding(0, (int) n.b(getContext(), f2), 0, (int) n.b(getContext(), f2));
    }

    public final void setAddressDetailText(String str) {
        this.o = str;
        TuxTextView tuxTextView = (TuxTextView) b(R.id.hu);
        l.b(tuxTextView, "");
        tuxTextView.setText(this.o);
        TuxTextView tuxTextView2 = (TuxTextView) b(R.id.hu);
        l.b(tuxTextView2, "");
        String str2 = this.o;
        int i2 = 0;
        if (str2 == null || str2.length() == 0) {
            i2 = 8;
        }
        tuxTextView2.setVisibility(i2);
    }

    public final void setEmailText(String str) {
        this.f87593m = str;
        TuxTextView tuxTextView = (TuxTextView) b(R.id.aua);
        l.b(tuxTextView, "");
        tuxTextView.setText(this.f87593m);
        TuxTextView tuxTextView2 = (TuxTextView) b(R.id.aua);
        l.b(tuxTextView2, "");
        String str2 = this.f87593m;
        int i2 = 0;
        if (str2 == null || str2.length() == 0) {
            i2 = 8;
        }
        tuxTextView2.setVisibility(i2);
    }

    public final void setHintText(String str) {
        boolean z;
        this.s = str;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TuxTextView tuxTextView = (TuxTextView) b(R.id.bgb);
            l.b(tuxTextView, "");
            tuxTextView.setVisibility(8);
        } else {
            TuxTextView tuxTextView2 = (TuxTextView) b(R.id.bgb);
            l.b(tuxTextView2, "");
            tuxTextView2.setVisibility(0);
        }
        TuxTextView tuxTextView3 = (TuxTextView) b(R.id.bgb);
        l.b(tuxTextView3, "");
        tuxTextView3.setText(this.s);
    }

    public final void setNameText(String str) {
        this.f87591k = str;
        TuxTextView tuxTextView = (TuxTextView) b(R.id.cs_);
        l.b(tuxTextView, "");
        tuxTextView.setText(this.f87591k);
        TuxTextView tuxTextView2 = (TuxTextView) b(R.id.cs_);
        l.b(tuxTextView2, "");
        String str2 = this.f87591k;
        int i2 = 0;
        if (str2 == null || str2.length() == 0) {
            i2 = 8;
        }
        tuxTextView2.setVisibility(i2);
    }

    public final void setRegionText(String str) {
        this.n = str;
        TuxTextView tuxTextView = (TuxTextView) b(R.id.dk9);
        l.b(tuxTextView, "");
        tuxTextView.setText(this.n);
        TuxTextView tuxTextView2 = (TuxTextView) b(R.id.dk9);
        l.b(tuxTextView2, "");
        String str2 = this.n;
        int i2 = 0;
        if (str2 == null || str2.length() == 0) {
            i2 = 8;
        }
        tuxTextView2.setVisibility(i2);
    }

    public final void setZipcodeText(String str) {
        this.p = str;
        TuxTextView tuxTextView = (TuxTextView) b(R.id.fnw);
        l.b(tuxTextView, "");
        tuxTextView.setText(this.p);
        TuxTextView tuxTextView2 = (TuxTextView) b(R.id.fnw);
        l.b(tuxTextView2, "");
        String str2 = this.p;
        int i2 = 0;
        if (str2 == null || str2.length() == 0) {
            i2 = 8;
        }
        tuxTextView2.setVisibility(i2);
    }

    public final void setPhoneText(String str) {
        com.bytedance.ies.dmt.ui.d.a aVar;
        this.f87592l = str;
        TuxTextView tuxTextView = (TuxTextView) b(R.id.d45);
        l.b(tuxTextView, "");
        String str2 = this.f87592l;
        int i2 = 0;
        if (str2 != null) {
            List<String> b2 = p.b(str2, new String[]{")"});
            StringBuilder sb = new StringBuilder();
            String str3 = (String) h.a.n.b((List) b2, 0);
            if (str3 == null) {
                str3 = "";
            }
            String sb2 = sb.append(str3).append(")").toString();
            String str4 = (String) h.a.n.b((List) b2, 1);
            if (str4 == null) {
                str4 = "";
            }
            aVar = new a.C0730a().a(sb2).b(str4).f33382a;
        } else {
            aVar = null;
        }
        tuxTextView.setText(aVar);
        TuxTextView tuxTextView2 = (TuxTextView) b(R.id.d45);
        l.b(tuxTextView2, "");
        String str5 = this.f87592l;
        if (str5 == null || str5.length() == 0) {
            i2 = 8;
        }
        tuxTextView2.setVisibility(i2);
    }

    public final void setReachable(boolean z) {
        this.q = z;
        int c2 = androidx.core.content.b.c(getContext(), R.color.bx);
        int c3 = androidx.core.content.b.c(getContext(), R.color.c4);
        if (!this.q) {
            c2 = androidx.core.content.b.c(getContext(), R.color.bz);
            c3 = androidx.core.content.b.c(getContext(), R.color.bz);
        }
        ((TuxTextView) b(R.id.cs_)).setTextColor(c2);
        ((TuxTextView) b(R.id.d45)).setTextColor(c3);
        ((TuxTextView) b(R.id.dk9)).setTextColor(c3);
        ((TuxTextView) b(R.id.hu)).setTextColor(c3);
        ((TuxTextView) b(R.id.fnw)).setTextColor(c3);
    }

    public final void setSuffixType(int i2) {
        int i3;
        int i4;
        this.f87590j = i2;
        RadioButton radioButton = (RadioButton) b(R.id.dgn);
        l.b(radioButton, "");
        int i5 = 0;
        if (this.f87590j == 3) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        radioButton.setVisibility(i3);
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) b(R.id.b8z);
        l.b(autoRTLImageView, "");
        if (this.f87590j == 2) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        autoRTLImageView.setVisibility(i4);
        TuxTextView tuxTextView = (TuxTextView) b(R.id.ars);
        l.b(tuxTextView, "");
        if (this.f87590j != 1) {
            i5 = 8;
        }
        tuxTextView.setVisibility(i5);
        if (this.f87590j == 1) {
            post(new b(this));
            return;
        }
        FrameLayout frameLayout = (FrameLayout) b(R.id.ab9);
        l.b(frameLayout, "");
        frameLayout.setTouchDelegate(null);
    }

    public final void setHasPrefix(boolean z) {
        int i2;
        this.f87589i = z;
        TuxIconView tuxIconView = (TuxIconView) b(R.id.d86);
        l.b(tuxIconView, "");
        if (this.f87589i) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        tuxIconView.setVisibility(i2);
        if (this.f87589i) {
            TuxTextView tuxTextView = (TuxTextView) b(R.id.cs_);
            l.b(tuxTextView, "");
            TuxTextView tuxTextView2 = (TuxTextView) b(R.id.cs_);
            l.b(tuxTextView2, "");
            ViewGroup.LayoutParams layoutParams = tuxTextView2.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams;
            int i3 = Build.VERSION.SDK_INT;
            aVar.setMarginStart((int) n.b(getContext(), 12.0f));
            tuxTextView.setLayoutParams(aVar);
            return;
        }
        TuxTextView tuxTextView3 = (TuxTextView) b(R.id.cs_);
        l.b(tuxTextView3, "");
        TuxTextView tuxTextView4 = (TuxTextView) b(R.id.cs_);
        l.b(tuxTextView4, "");
        ViewGroup.LayoutParams layoutParams2 = tuxTextView4.getLayoutParams();
        Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.a aVar2 = (ConstraintLayout.a) layoutParams2;
        int i4 = Build.VERSION.SDK_INT;
        aVar2.setMarginStart((int) n.b(getContext(), 16.0f));
        tuxTextView3.setLayoutParams(aVar2);
    }

    public final void setUiMode(String str) {
        l.d(str, "");
        this.r = str;
        if (str.hashCode() == -902286926 && str.equals("simple")) {
            TuxTextView tuxTextView = (TuxTextView) b(R.id.cs_);
            l.b(tuxTextView, "");
            tuxTextView.setMaxLines(1);
            TuxTextView tuxTextView2 = (TuxTextView) b(R.id.d45);
            l.b(tuxTextView2, "");
            tuxTextView2.setMaxLines(1);
            TuxTextView tuxTextView3 = (TuxTextView) b(R.id.hu);
            l.b(tuxTextView3, "");
            tuxTextView3.setMaxLines(2);
            TuxTextView tuxTextView4 = (TuxTextView) b(R.id.dk9);
            l.b(tuxTextView4, "");
            tuxTextView4.setMaxLines(1);
            TuxTextView tuxTextView5 = (TuxTextView) b(R.id.fnw);
            l.b(tuxTextView5, "");
            tuxTextView5.setMaxLines(1);
            return;
        }
        TuxTextView tuxTextView6 = (TuxTextView) b(R.id.cs_);
        l.b(tuxTextView6, "");
        tuxTextView6.setMaxLines(Integer.MAX_VALUE);
        TuxTextView tuxTextView7 = (TuxTextView) b(R.id.d45);
        l.b(tuxTextView7, "");
        tuxTextView7.setMaxLines(1);
        TuxTextView tuxTextView8 = (TuxTextView) b(R.id.hu);
        l.b(tuxTextView8, "");
        tuxTextView8.setMaxLines(Integer.MAX_VALUE);
        TuxTextView tuxTextView9 = (TuxTextView) b(R.id.dk9);
        l.b(tuxTextView9, "");
        tuxTextView9.setMaxLines(Integer.MAX_VALUE);
        TuxTextView tuxTextView10 = (TuxTextView) b(R.id.fnw);
        l.b(tuxTextView10, "");
        tuxTextView10.setMaxLines(1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddressInfoCard(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AddressInfoCard(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.f87589i = true;
        this.f87590j = 2;
        this.f87591k = "";
        this.f87592l = "";
        this.f87593m = "";
        this.n = "";
        this.o = "";
        this.p = "";
        this.q = true;
        this.r = "simple";
        this.s = "";
        com.a.a(LayoutInflater.from(context), R.layout.ny, this, true);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            layoutParams.width = -1;
        } else {
            layoutParams = new ConstraintLayout.a(-1, -2);
        }
        setLayoutParams(layoutParams);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.p6, R.attr.pf});
        l.b(obtainStyledAttributes, "");
        setHasPrefix(obtainStyledAttributes.getBoolean(0, true));
        setSuffixType(obtainStyledAttributes.getInt(1, 2));
        obtainStyledAttributes.recycle();
        setPaddingVertical(16);
        v.a(this, c.c(context));
        ((TuxTextView) b(R.id.ars)).setOnTouchListener(new com.bytedance.ies.dmt.ui.widget.b());
    }
}
