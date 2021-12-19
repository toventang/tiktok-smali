package com.bytedance.ies.uikit.dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class RecycleListView extends ListView {

    /* renamed from: a  reason: collision with root package name */
    public boolean f35416a = true;

    static {
        Covode.recordClassIndex(21190);
    }

    public RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(14180);
        MethodCollector.o(14180);
    }
}
