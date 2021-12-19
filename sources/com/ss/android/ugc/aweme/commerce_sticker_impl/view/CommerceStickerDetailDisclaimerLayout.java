package com.ss.android.ugc.aweme.commerce_sticker_impl.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class CommerceStickerDetailDisclaimerLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private HashMap f73603a;

    static {
        Covode.recordClassIndex(45300);
    }

    public CommerceStickerDetailDisclaimerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final View a(int i2) {
        if (this.f73603a == null) {
            this.f73603a = new HashMap();
        }
        View view = (View) this.f73603a.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f73603a.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    private /* synthetic */ CommerceStickerDetailDisclaimerLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommerceStickerDetailDisclaimerLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(9533);
        a.a(LayoutInflater.from(context), R.layout.r5, this, true);
        MethodCollector.o(9533);
    }
}
