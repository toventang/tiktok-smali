package com.ss.android.ugc.aweme.ecommerce.pdp.view;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends ConstraintLayout {

    /* renamed from: g  reason: collision with root package name */
    private SparseArray f86842g;

    static {
        Covode.recordClassIndex(54409);
    }

    private View b(int i2) {
        if (this.f86842g == null) {
            this.f86842g = new SparseArray();
        }
        View view = (View) this.f86842g.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f86842g.put(i2, findViewById);
        return findViewById;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private b(Context context) {
        super(context, null, 0);
        l.d(context, "");
        a.a(LayoutInflater.from(context), R.layout.q0, this, true);
    }

    public final void setDesc(String str) {
        if (str != null) {
            TuxTextView tuxTextView = (TuxTextView) b(R.id.ak7);
            l.b(tuxTextView, "");
            tuxTextView.setText(str);
        }
    }

    public final void setIcon(Image image) {
        if (image != null) {
            v a2 = r.a(image.toImageUrlModel());
            a2.f39916l = R.color.v;
            a2.F = (ImageView) b(R.id.bi7);
            a2.c();
        }
    }

    public final void setTitle(String str) {
        if (str != null) {
            TuxTextView tuxTextView = (TuxTextView) b(R.id.title);
            l.b(tuxTextView, "");
            tuxTextView.setText(str);
        }
    }

    public /* synthetic */ b(Context context, byte b2) {
        this(context);
    }
}
