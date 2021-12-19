package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.a;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxRadio;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.p;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.q;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final p f85071a;

    /* renamed from: b  reason: collision with root package name */
    private SparseArray f85072b;

    static {
        Covode.recordClassIndex(53174);
    }

    private View a(int i2) {
        if (this.f85072b == null) {
            this.f85072b = new SparseArray();
        }
        View view = (View) this.f85072b.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f85072b.put(i2, findViewById);
        return findViewById;
    }

    public final q getReason() {
        String str = this.f85071a.f84996b;
        if (str == null) {
            str = "";
        }
        return new q(str);
    }

    public final boolean a() {
        TuxRadio tuxRadio = (TuxRadio) a(R.id.dxk);
        l.b(tuxRadio, "");
        return tuxRadio.isChecked();
    }

    public final void setChecked(boolean z) {
        TuxRadio tuxRadio = (TuxRadio) a(R.id.dxk);
        l.b(tuxRadio, "");
        tuxRadio.setChecked(z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(Context context, p pVar) {
        super(context, null, 0);
        l.d(context, "");
        l.d(pVar, "");
        MethodCollector.i(7190);
        this.f85071a = pVar;
        a.a(LayoutInflater.from(context), R.layout.p5, this, true);
        TuxTextView tuxTextView = (TuxTextView) a(R.id.dxn);
        l.b(tuxTextView, "");
        tuxTextView.setText(pVar.f84997c);
        MethodCollector.o(7190);
    }

    public /* synthetic */ c(Context context, p pVar, byte b2) {
        this(context, pVar);
    }
}
