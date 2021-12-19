package com.ss.android.ugc.aweme.kids.setting.items.clearcache;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class DiskManagerItemView extends CommonItemView {

    /* renamed from: h  reason: collision with root package name */
    public static final a f106855h = new a((byte) 0);

    /* renamed from: i  reason: collision with root package name */
    private View f106856i;

    /* renamed from: j  reason: collision with root package name */
    private View f106857j;

    /* renamed from: k  reason: collision with root package name */
    private int f106858k;

    static {
        Covode.recordClassIndex(68335);
    }

    public DiskManagerItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(68336);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void h() {
        TextView textView = this.f33354b;
        if (textView != null) {
            textView.setVisibility(4);
        }
    }

    public final boolean e() {
        View view = this.f106856i;
        if (view == null) {
            l.a("loadingView");
        }
        if (view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void f() {
        View view = this.f106856i;
        if (view == null) {
            l.a("loadingView");
        }
        view.setVisibility(0);
        View view2 = this.f106857j;
        if (view2 == null) {
            l.a("loadingTextView");
        }
        view2.setVisibility(0);
    }

    public final void g() {
        View view = this.f106856i;
        if (view == null) {
            l.a("loadingView");
        }
        view.setVisibility(4);
        View view2 = this.f106857j;
        if (view2 == null) {
            l.a("loadingTextView");
        }
        view2.setVisibility(4);
    }

    public final void i() {
        TextView textView = this.f33354b;
        if (textView != null) {
            textView.setAlpha(0.0f);
            textView.setVisibility(0);
            textView.animate().alpha(1.0f).setDuration(150).setListener(null);
        }
    }

    @Override // com.bytedance.ies.dmt.ui.common.views.CommonItemView
    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes;
        com.a.a(LayoutInflater.from(context), R.layout.ac5, this, true);
        b(context, attributeSet);
        a();
        if (!(context == null || (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.abh})) == null)) {
            this.f106858k = (int) obtainStyledAttributes.getDimension(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
        View findViewById = findViewById(R.id.c37);
        l.b(findViewById, "");
        this.f106856i = findViewById;
        View findViewById2 = findViewById(R.id.fa0);
        l.b(findViewById2, "");
        this.f106857j = findViewById2;
        View view = this.f106856i;
        if (view == null) {
            l.a("loadingView");
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams).setMargins(this.f106858k, 0, 0, 0);
        TextView textView = this.f33354b;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private /* synthetic */ DiskManagerItemView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private DiskManagerItemView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
    }
}
