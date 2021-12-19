package com.ss.android.ugc.aweme.search.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class UsernameWithVerifyAndRelation extends ConstraintLayout {

    /* renamed from: g  reason: collision with root package name */
    private SparseArray f121748g;

    static {
        Covode.recordClassIndex(79296);
    }

    public UsernameWithVerifyAndRelation(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final View b(int i2) {
        if (this.f121748g == null) {
            this.f121748g = new SparseArray();
        }
        View view = (View) this.f121748g.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f121748g.put(i2, findViewById);
        return findViewById;
    }

    private /* synthetic */ UsernameWithVerifyAndRelation(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    private UsernameWithVerifyAndRelation(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, -1);
        a.a(LayoutInflater.from(context), R.layout.axg, this, true);
    }

    public final void a(Context context, CharSequence charSequence, CharSequence charSequence2) {
        boolean z;
        l.d(charSequence2, "");
        if (context != null && charSequence != null) {
            TuxTextView tuxTextView = (TuxTextView) b(R.id.f_d);
            l.b(tuxTextView, "");
            tuxTextView.setText(charSequence);
            if (charSequence2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                TuxTextView tuxTextView2 = (TuxTextView) b(R.id.f5p);
                l.b(tuxTextView2, "");
                tuxTextView2.setVisibility(0);
                TuxTextView tuxTextView3 = (TuxTextView) b(R.id.f5p);
                l.b(tuxTextView3, "");
                tuxTextView3.setText(charSequence2);
                return;
            }
            TuxTextView tuxTextView4 = (TuxTextView) b(R.id.f5p);
            l.b(tuxTextView4, "");
            tuxTextView4.setText("");
            TuxTextView tuxTextView5 = (TuxTextView) b(R.id.f5p);
            l.b(tuxTextView5, "");
            tuxTextView5.setVisibility(8);
        }
    }
}
