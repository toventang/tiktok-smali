package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private SparseArray f85459a;

    static {
        Covode.recordClassIndex(53473);
    }

    public final View a(int i2) {
        if (this.f85459a == null) {
            this.f85459a = new SparseArray();
        }
        View view = (View) this.f85459a.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f85459a.put(i2, findViewById);
        return findViewById;
    }

    public final String getBalanceTextValue() {
        TuxTextView tuxTextView = (TuxTextView) a(R.id.r8);
        l.b(tuxTextView, "");
        return tuxTextView.getText().toString();
    }

    public final String getButtonTextValue() {
        TuxTextView tuxTextView = (TuxTextView) a(R.id.a1b);
        l.b(tuxTextView, "");
        return tuxTextView.getText().toString();
    }

    public final String getNoteTextValue() {
        TuxTextView tuxTextView = (TuxTextView) a(R.id.cwi);
        l.b(tuxTextView, "");
        return tuxTextView.getText().toString();
    }

    public final void setBalanceTextColor(int i2) {
        ((TuxTextView) a(R.id.r8)).setTextColor(i2);
    }

    public final void setButtonTextColor(int i2) {
        ((TuxTextView) a(R.id.a1b)).setTextColor(i2);
    }

    public final void setNoteTextColor(int i2) {
        ((TuxTextView) a(R.id.cwi)).setTextColor(i2);
    }

    public final void setBalanceTextValue(String str) {
        l.d(str, "");
        TuxTextView tuxTextView = (TuxTextView) a(R.id.r8);
        l.b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    public final void setButtonTextValue(String str) {
        l.d(str, "");
        TuxTextView tuxTextView = (TuxTextView) a(R.id.a1b);
        l.b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    public final void setNoteTextValue(String str) {
        l.d(str, "");
        TuxTextView tuxTextView = (TuxTextView) a(R.id.cwi);
        l.b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(7820);
        l.b(LayoutInflater.from(getContext()).inflate(R.layout.p7, this), "");
        MethodCollector.o(7820);
    }

    public final void a(boolean z) {
        int i2;
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) a(R.id.lk);
        l.b(autoRTLImageView, "");
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        autoRTLImageView.setVisibility(i2);
    }

    public final void setNoteTextVisibility(boolean z) {
        int i2;
        TuxTextView tuxTextView = (TuxTextView) a(R.id.cwi);
        l.b(tuxTextView, "");
        int i3 = 0;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        tuxTextView.setVisibility(i2);
        TuxTextView tuxTextView2 = (TuxTextView) a(R.id.r8);
        l.b(tuxTextView2, "");
        ViewGroup.LayoutParams layoutParams = tuxTextView2.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams;
        if (z) {
            i3 = -1;
        }
        aVar.f2054k = i3;
    }

    public /* synthetic */ a(Context context, byte b2) {
        this(context);
    }
}
