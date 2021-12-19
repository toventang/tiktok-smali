package com.ss.android.ugc.aweme.utils;

import android.widget.TextView;
import androidx.core.content.a.f;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class iu {
    static {
        Covode.recordClassIndex(93684);
    }

    public static final void a(TextView textView) {
        if (textView != null) {
            textView.setShadowLayer(textView.getResources().getDimension(R.dimen.s1), textView.getResources().getDimension(R.dimen.rz), textView.getResources().getDimension(R.dimen.s0), f.b(textView.getResources(), R.color.bo, null));
        }
    }
}
