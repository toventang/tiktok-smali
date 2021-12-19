package com.ss.android.ugc.aweme.ecommerce.pdp.view;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends ConstraintLayout {

    /* renamed from: g  reason: collision with root package name */
    private SparseArray f86843g;

    static {
        Covode.recordClassIndex(54410);
    }

    private View b(int i2) {
        if (this.f86843g == null) {
            this.f86843g = new SparseArray();
        }
        View view = (View) this.f86843g.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f86843g.put(i2, findViewById);
        return findViewById;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(Context context) {
        super(context, null, 0);
        l.d(context, "");
        a.a(LayoutInflater.from(context), R.layout.q7, this, true);
    }

    public final void setDesc(String str) {
        if (str != null) {
            TuxTextView tuxTextView = (TuxTextView) b(R.id.ak7);
            l.b(tuxTextView, "");
            tuxTextView.setText(str);
        }
    }

    public final void setTitle(String str) {
        if (str != null) {
            TuxTextView tuxTextView = (TuxTextView) b(R.id.title);
            l.b(tuxTextView, "");
            tuxTextView.setText(str);
        }
    }

    public /* synthetic */ c(Context context, byte b2) {
        this(context);
    }
}
