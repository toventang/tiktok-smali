package com.ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.util.a;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.views.o;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d extends o {

    /* renamed from: a  reason: collision with root package name */
    public TextView f82858a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f82859b;

    /* renamed from: c  reason: collision with root package name */
    public ViewGroup f82860c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f82861d;

    /* renamed from: e  reason: collision with root package name */
    private String f82862e = "";

    /* renamed from: f  reason: collision with root package name */
    private String f82863f = "";

    /* renamed from: g  reason: collision with root package name */
    private String f82864g = "";

    /* renamed from: h  reason: collision with root package name */
    private String f82865h = "";

    static {
        Covode.recordClassIndex(51632);
    }

    public final d a(String str) {
        l.d(str, "");
        this.f82862e = str;
        return this;
    }

    public final d b(String str) {
        l.d(str, "");
        this.f82863f = str;
        return this;
    }

    public final d c(String str) {
        l.d(str, "");
        this.f82864g = str;
        return this;
    }

    public final d d(String str) {
        l.d(str, "");
        this.f82865h = str;
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context, R.style.fl, true, false, false);
        l.d(context, "");
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Window window;
        if (Build.VERSION.SDK_INT >= 21 && (window = getWindow()) != null) {
            window.addFlags(Integer.MIN_VALUE);
        }
        super.onCreate(bundle);
        setContentView(R.layout.auu);
        TextView textView = (TextView) findViewById(R.id.a1p);
        this.f82858a = textView;
        if (textView != null) {
            textView.setText(this.f82864g);
        }
        TextView textView2 = (TextView) findViewById(R.id.dn8);
        this.f82859b = textView2;
        if (textView2 != null) {
            textView2.setText(this.f82865h);
        }
        TextView textView3 = (TextView) findViewById(R.id.title);
        this.f82861d = textView3;
        if (textView3 != null) {
            textView3.setText(this.f82862e);
        }
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.edi);
        l.b(tuxTextView, "");
        tuxTextView.setText(this.f82863f);
        Typeface a2 = a.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33796b);
        if (a2 != null) {
            TextView textView4 = this.f82861d;
            if (textView4 != null) {
                textView4.setTypeface(a2);
            }
            TextView textView5 = this.f82859b;
            if (textView5 != null) {
                textView5.setTypeface(a2);
            }
        }
        this.f82860c = (FrameLayout) findViewById(R.id.dqn);
    }
}
