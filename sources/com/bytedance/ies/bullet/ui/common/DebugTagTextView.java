package com.bytedance.ies.bullet.ui.common;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class DebugTagTextView extends AppCompatTextView {
    static {
        Covode.recordClassIndex(19725);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DebugTagTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.c(context, "");
    }
}
