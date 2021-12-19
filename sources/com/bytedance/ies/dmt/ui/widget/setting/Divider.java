package com.bytedance.ies.dmt.ui.widget.setting;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.b;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class Divider extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private View f33680a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f33681b;

    /* renamed from: c  reason: collision with root package name */
    private View f33682c;

    static {
        Covode.recordClassIndex(20036);
    }

    public TextView getTxtLeft() {
        return this.f33681b;
    }

    public Divider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private Divider(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(12063);
        View inflate = View.inflate(context, R.layout.bi0, this);
        this.f33680a = inflate;
        this.f33681b = (TextView) inflate.findViewById(R.id.f1u);
        this.f33682c = this.f33680a.findViewById(R.id.fbk);
        this.f33680a.setBackgroundColor(b.c(getContext(), R.color.f159928l));
        new StringBuilder("getBaseStyle() called with: context = [").append(context).append("], attrs = [").append(attributeSet).append("]");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.vg, R.attr.xm, R.attr.afb});
        if (obtainStyledAttributes.getBoolean(0, false)) {
            this.f33682c.setVisibility(8);
        }
        this.f33682c.setBackgroundColor(b.c(context, R.color.b2));
        this.f33680a.setBackgroundColor(b.c(context, R.color.f159928l));
        String string = obtainStyledAttributes.getString(2);
        if (!TextUtils.isEmpty(string)) {
            this.f33681b.setText(string);
        } else {
            this.f33681b.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) this.f33682c.getLayoutParams()).bottomMargin = (int) n.b(getContext(), 4.0f);
        }
        this.f33681b.setTextColor(b.c(context, R.color.c5));
        if (obtainStyledAttributes.getBoolean(1, false)) {
            this.f33681b.setAllCaps(true);
        }
        obtainStyledAttributes.recycle();
        MethodCollector.o(12063);
    }
}
