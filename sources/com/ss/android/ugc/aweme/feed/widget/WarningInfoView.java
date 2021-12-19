package com.ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class WarningInfoView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private LiveTextView f95250a = ((LiveTextView) findViewById(R.id.f_k));

    static {
        Covode.recordClassIndex(60340);
    }

    public void setInfoText(CharSequence charSequence) {
        this.f95250a.setText(charSequence);
    }

    public WarningInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(8054);
        inflate(getContext(), R.layout.tt, this);
        MethodCollector.o(8054);
    }
}
