package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.d.a;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.livesdk.utils.aq;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.json.JSONObject;

public class SafeFrameLayout extends FrameLayout {
    static {
        Covode.recordClassIndex(13298);
    }

    public SafeFrameLayout(Context context) {
        super(context);
        MethodCollector.i(2659);
        MethodCollector.o(2659);
    }

    @Override // android.view.View
    public void restoreHierarchyState(SparseArray<Parcelable> sparseArray) {
        try {
            super.restoreHierarchyState(sparseArray);
        } catch (Exception e2) {
            JSONObject jSONObject = new JSONObject();
            a.a(jSONObject, "error_msg", e2.toString());
            JSONObject a2 = aq.a((ViewGroup) this);
            a.a(jSONObject, "dump", a2);
            int i2 = 0;
            if (a2.optJSONObject("repeat_id") != null) {
                i2 = 1;
            }
            c.a("ttlive_xg_restore_dump", i2, jSONObject);
        }
    }

    public SafeFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(2661);
        MethodCollector.o(2661);
    }
}
