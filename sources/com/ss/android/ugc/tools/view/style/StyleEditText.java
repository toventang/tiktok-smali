package com.ss.android.ugc.tools.view.style;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public class StyleEditText extends AppCompatEditText {
    static {
        Covode.recordClassIndex(98813);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StyleEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        g.a((TextView) this, attributeSet, false);
    }
}
