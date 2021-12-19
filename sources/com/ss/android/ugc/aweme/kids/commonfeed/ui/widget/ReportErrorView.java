package com.ss.android.ugc.aweme.kids.commonfeed.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class ReportErrorView extends LinearLayout {
    static {
        Covode.recordClassIndex(67961);
    }

    public ReportErrorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private ReportErrorView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    private ReportErrorView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0, 0);
        MethodCollector.i(6043);
        LayoutInflater.from(context).inflate(R.layout.ad9, this);
        MethodCollector.o(6043);
    }
}
