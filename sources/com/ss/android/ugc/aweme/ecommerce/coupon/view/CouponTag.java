package com.ss.android.ugc.aweme.ecommerce.coupon.view;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class CouponTag extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final TuxTextView f85773a;

    static {
        Covode.recordClassIndex(53652);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CouponTag f85774a;

        static {
            Covode.recordClassIndex(53653);
        }

        a(CouponTag couponTag) {
            this.f85774a = couponTag;
        }

        public final void run() {
            Layout layout = this.f85774a.f85773a.getLayout();
            if (layout != null && layout.getEllipsisCount(layout.getLineCount() - 1) > 0) {
                this.f85774a.setVisibility(8);
            }
        }
    }

    public final void setText(String str) {
        l.d(str, "");
        this.f85773a.setText(str);
        setVisibility(0);
        post(new a(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CouponTag(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        l.d(context, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CouponTag(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(8855);
        setBackgroundResource(R.drawable.yh);
        com.a.a(LayoutInflater.from(context), R.layout.ob, this, true);
        View findViewById = findViewById(R.id.text);
        l.b(findViewById, "");
        this.f85773a = (TuxTextView) findViewById;
        MethodCollector.o(8855);
    }
}
