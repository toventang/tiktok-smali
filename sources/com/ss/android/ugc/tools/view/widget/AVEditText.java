package com.ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.view.style.g;

public class AVEditText extends AppCompatEditText {
    static {
        Covode.recordClassIndex(98849);
    }

    public AVEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g.a((TextView) this, attributeSet, true);
    }
}
