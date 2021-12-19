package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class TimeLockDesc extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private TextView f107002a = ((TextView) findViewById(R.id.el9));

    /* renamed from: b  reason: collision with root package name */
    private ImageView f107003b = ((ImageView) findViewById(R.id.e9q));

    static {
        Covode.recordClassIndex(68443);
    }

    public void setImageDrawable(Drawable drawable) {
        this.f107003b.setImageDrawable(drawable);
    }

    public void setText(String str) {
        this.f107002a.setText(str);
    }

    public TimeLockDesc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(6101);
        inflate(getContext(), R.layout.acn, this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.r9, R.attr.af7}, 0, 0);
        String string = obtainStyledAttributes.getString(0);
        if (obtainStyledAttributes.hasValue(1)) {
            this.f107003b.setImageDrawable(obtainStyledAttributes.getDrawable(1));
        }
        this.f107002a.setText(string);
        obtainStyledAttributes.recycle();
        MethodCollector.o(6101);
    }
}
