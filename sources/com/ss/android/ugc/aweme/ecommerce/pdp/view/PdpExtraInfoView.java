package com.ss.android.ugc.aweme.ecommerce.pdp.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.pdp.c.a;
import com.ss.android.ugc.aweme.ecommerce.review.view.RatingNumber;
import com.ss.android.ugc.aweme.i18n.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class PdpExtraInfoView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private SparseArray f86829a;

    static {
        Covode.recordClassIndex(54406);
    }

    public PdpExtraInfoView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public PdpExtraInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private View a(int i2) {
        if (this.f86829a == null) {
            this.f86829a = new SparseArray();
        }
        View view = (View) this.f86829a.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f86829a.put(i2, findViewById);
        return findViewById;
    }

    private final void a() {
        int i2;
        TuxTextView tuxTextView = (TuxTextView) a(R.id.drz);
        l.b(tuxTextView, "");
        if (tuxTextView.getVisibility() != 0) {
            TuxIconView tuxIconView = (TuxIconView) a(R.id.e99);
            l.b(tuxIconView, "");
            if (tuxIconView.getVisibility() != 0) {
                i2 = 8;
                setVisibility(i2);
            }
        }
        i2 = 0;
        setVisibility(i2);
    }

    public final void setRate(float f2) {
        if (f2 == 0.0f) {
            TuxIconView tuxIconView = (TuxIconView) a(R.id.e99);
            l.b(tuxIconView, "");
            tuxIconView.setVisibility(8);
            View a2 = a(R.id.anf);
            l.b(a2, "");
            a2.setVisibility(8);
            RatingNumber ratingNumber = (RatingNumber) a(R.id.dhd);
            l.b(ratingNumber, "");
            ratingNumber.setVisibility(8);
        } else {
            TuxIconView tuxIconView2 = (TuxIconView) a(R.id.e99);
            l.b(tuxIconView2, "");
            tuxIconView2.setVisibility(0);
            TuxTextView tuxTextView = (TuxTextView) a(R.id.drz);
            l.b(tuxTextView, "");
            if (tuxTextView.getVisibility() == 0) {
                View a3 = a(R.id.anf);
                l.b(a3, "");
                a3.setVisibility(0);
            }
            RatingNumber ratingNumber2 = (RatingNumber) a(R.id.dhd);
            l.b(ratingNumber2, "");
            ratingNumber2.setVisibility(0);
            ((RatingNumber) a(R.id.dhd)).getScore().setText(String.valueOf(f2));
        }
        a();
    }

    public final void setSales(long j2) {
        String str;
        Resources resources;
        if (j2 > 0) {
            setVisibility(0);
            TuxTextView tuxTextView = (TuxTextView) a(R.id.drz);
            l.b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            TuxTextView tuxTextView2 = (TuxTextView) a(R.id.drz);
            l.b(tuxTextView2, "");
            TuxTextView tuxTextView3 = (TuxTextView) a(R.id.drz);
            l.b(tuxTextView3, "");
            Context context = tuxTextView3.getContext();
            if (context == null || (resources = context.getResources()) == null) {
                str = null;
            } else {
                str = resources.getString(R.string.bgl, b.a(j2));
            }
            tuxTextView2.setText(str);
        } else {
            TuxTextView tuxTextView4 = (TuxTextView) a(R.id.drz);
            l.b(tuxTextView4, "");
            tuxTextView4.setVisibility(8);
        }
        a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private PdpExtraInfoView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(9081);
        a.a(context, R.layout.q2, this, true);
        MethodCollector.o(9081);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ PdpExtraInfoView(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }
}
