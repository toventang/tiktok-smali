package com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.c;

import android.content.Context;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.b;
import com.bytedance.android.live.core.f.y;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;

public final class a extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private SparseArray f87866a;

    static {
        Covode.recordClassIndex(55265);
    }

    private View a() {
        if (this.f87866a == null) {
            this.f87866a = new SparseArray();
        }
        View view = (View) this.f87866a.get(R.id.ezn);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.ezn);
        this.f87866a.put(R.id.ezn, findViewById);
        return findViewById;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context) {
        super(context, null);
        l.d(context, "");
        MethodCollector.i(3145);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, (int) R.style.x8);
        LayoutInflater.from(context).cloneInContext(contextThemeWrapper).inflate(R.layout.y_, this);
        setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) n.b(context, 14.0f));
        layoutParams.gravity = 16;
        layoutParams.rightMargin = (int) n.b(context, 4.0f);
        setLayoutParams(layoutParams);
        setBackground(b.a(contextThemeWrapper, (int) R.drawable.a6g));
        MethodCollector.o(3145);
    }

    public final void setFlashSaleInfo(String str) {
        l.d(str, "");
        if (p.a(y.a((int) R.string.cxb), str, false)) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = -2;
            setLayoutParams(layoutParams);
            TuxTextView tuxTextView = (TuxTextView) a();
            l.b(tuxTextView, "");
            tuxTextView.setText(str);
            com.bytedance.android.livesdk.utils.p.d(a(), (int) i.a.a.a.a.b.a(4.0f));
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        layoutParams2.width = (int) i.a.a.a.a.b.a(54.0f);
        setLayoutParams(layoutParams2);
        com.bytedance.android.livesdk.utils.p.d(a(), 0);
        TuxTextView tuxTextView2 = (TuxTextView) a();
        l.b(tuxTextView2, "");
        tuxTextView2.setText(str);
    }

    public /* synthetic */ a(Context context, byte b2) {
        this(context);
    }
}
