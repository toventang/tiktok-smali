package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtButton;
import com.ss.android.ugc.aweme.ai.d;
import com.zhiliaoapp.musically.R;

public class CheckButton extends DmtButton {
    static {
        Covode.recordClassIndex(68445);
    }

    public CheckButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private CheckButton(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, (byte) 0);
        setBackgroundResource(R.drawable.aw3);
        setOnTouchListener(new d());
    }
}
