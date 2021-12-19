package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.b;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public g f85472a;

    /* renamed from: b  reason: collision with root package name */
    private SparseArray f85473b;

    static {
        Covode.recordClassIndex(53479);
    }

    public final View a(int i2) {
        if (this.f85473b == null) {
            this.f85473b = new SparseArray();
        }
        View view = (View) this.f85473b.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f85473b.put(i2, findViewById);
        return findViewById;
    }

    public final g getOption() {
        return this.f85472a;
    }

    public final boolean a() {
        ConstraintLayout constraintLayout = (ConstraintLayout) a(R.id.czv);
        l.b(constraintLayout, "");
        return constraintLayout.isSelected();
    }

    public final void setOption(g gVar) {
        this.f85472a = gVar;
    }

    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f85474a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f85475b;

        static {
            Covode.recordClassIndex(53480);
        }

        public a(String str, c cVar) {
            this.f85474a = str;
            this.f85475b = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f85475b.getContext(), this.f85474a).open();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(4535);
        l.b(LayoutInflater.from(getContext()).inflate(R.layout.pf, this), "");
        MethodCollector.o(4535);
    }

    public final void setChecked(boolean z) {
        int i2;
        int i3;
        ConstraintLayout constraintLayout = (ConstraintLayout) a(R.id.czv);
        l.b(constraintLayout, "");
        if (constraintLayout.isSelected() != z) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) a(R.id.czv);
            l.b(constraintLayout2, "");
            constraintLayout2.setSelected(z);
            AutoRTLImageView autoRTLImageView = (AutoRTLImageView) a(R.id.dy0);
            l.b(autoRTLImageView, "");
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            autoRTLImageView.setVisibility(i2);
            TuxTextView tuxTextView = (TuxTextView) a(R.id.czu);
            Context context = getContext();
            if (!z) {
                i3 = R.color.bx;
            } else {
                i3 = R.color.bh;
            }
            tuxTextView.setTextColor(b.c(context, i3));
        }
    }

    public /* synthetic */ c(Context context, byte b2) {
        this(context);
    }
}
