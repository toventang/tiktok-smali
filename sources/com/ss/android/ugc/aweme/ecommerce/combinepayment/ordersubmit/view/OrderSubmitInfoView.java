package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.d;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.jedi.ext.adapter.b;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.utils.bp;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class OrderSubmitInfoView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private SparseArray f85018a;

    static {
        Covode.recordClassIndex(53146);
    }

    public OrderSubmitInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final View a(int i2) {
        if (this.f85018a == null) {
            this.f85018a = new SparseArray();
        }
        View view = (View) this.f85018a.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f85018a.put(i2, findViewById);
        return findViewById;
    }

    public final String getTitleText() {
        TuxTextView tuxTextView = (TuxTextView) a(R.id.title);
        l.b(tuxTextView, "");
        return tuxTextView.getText().toString();
    }

    public final void setDescColor(int i2) {
        ((TuxTextView) a(R.id.ak7)).setTextColor(i2);
    }

    public final void setDescFont(int i2) {
        ((TuxTextView) a(R.id.ak7)).setTuxFont(i2);
    }

    public final void setTitleColor(int i2) {
        ((TuxTextView) a(R.id.title)).setTextColor(i2);
    }

    public final void setTitleFont(int i2) {
        ((TuxTextView) a(R.id.title)).setTuxFont(i2);
    }

    public final void setDescText(String str) {
        l.d(str, "");
        TuxTextView tuxTextView = (TuxTextView) a(R.id.ak7);
        l.b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    public final void setTitleText(String str) {
        l.d(str, "");
        TuxTextView tuxTextView = (TuxTextView) a(R.id.title);
        l.b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    public static final class a extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f85019a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OrderSubmitInfoView f85020b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f85021c;

        static {
            Covode.recordClassIndex(53147);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                Context context = this.f85020b.getContext();
                l.b(context, "");
                Object a2 = b.a(context);
                if (!(a2 instanceof d)) {
                    a2 = null;
                }
                e eVar = (e) a2;
                if (eVar != null) {
                    b bVar = new b(this.f85020b.getTitleText(), this.f85021c);
                    i supportFragmentManager = eVar.getSupportFragmentManager();
                    l.b(supportFragmentManager, "");
                    bVar.show(supportFragmentManager, "");
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(OrderSubmitInfoView orderSubmitInfoView, String str) {
            super(700);
            this.f85020b = orderSubmitInfoView;
            this.f85021c = str;
        }
    }

    public final void setDescImage(String str) {
        SmartImageView smartImageView = (SmartImageView) a(R.id.akh);
        l.b(smartImageView, "");
        smartImageView.setVisibility(0);
        if (str == null) {
            str = " ";
        }
        v a2 = r.a(str);
        a2.E = (SmartImageView) a(R.id.akh);
        a2.c();
    }

    public final void setDescImageAlpha(float f2) {
        SmartImageView smartImageView = (SmartImageView) a(R.id.akh);
        l.b(smartImageView, "");
        if (smartImageView.getAlpha() != f2) {
            SmartImageView smartImageView2 = (SmartImageView) a(R.id.akh);
            l.b(smartImageView2, "");
            smartImageView2.setAlpha(f2);
        }
    }

    public final void setSubDescExtraText(String str) {
        TuxTextView tuxTextView = (TuxTextView) a(R.id.edd);
        l.b(tuxTextView, "");
        int i2 = 0;
        if (str == null || str.length() == 0) {
            i2 = 8;
        }
        tuxTextView.setVisibility(i2);
        TuxTextView tuxTextView2 = (TuxTextView) a(R.id.edd);
        l.b(tuxTextView2, "");
        tuxTextView2.setText(str);
    }

    public final void setSubDescText(String str) {
        l.d(str, "");
        TuxTextView tuxTextView = (TuxTextView) a(R.id.edc);
        l.b(tuxTextView, "");
        tuxTextView.setVisibility(0);
        TuxTextView tuxTextView2 = (TuxTextView) a(R.id.edc);
        l.b(tuxTextView2, "");
        tuxTextView2.setText(str);
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

    public final void a(Integer num, int i2) {
        if (num == null) {
            TuxIconView tuxIconView = (TuxIconView) a(R.id.akg);
            l.b(tuxIconView, "");
            tuxIconView.setVisibility(8);
            return;
        }
        TuxIconView tuxIconView2 = (TuxIconView) a(R.id.akg);
        l.b(tuxIconView2, "");
        tuxIconView2.setVisibility(0);
        ((TuxIconView) a(R.id.akg)).setIconRes(num.intValue());
        ((TuxIconView) a(R.id.akg)).setTintColor(i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OrderSubmitInfoView(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private OrderSubmitInfoView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(6514);
        com.a.a(LayoutInflater.from(context), R.layout.rg, this, true);
        MethodCollector.o(6514);
    }
}
