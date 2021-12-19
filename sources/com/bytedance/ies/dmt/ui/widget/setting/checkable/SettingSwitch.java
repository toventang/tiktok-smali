package com.bytedance.ies.dmt.ui.widget.setting.checkable;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.SwitchCompat;
import com.bytedance.covode.number.Covode;

public class SettingSwitch extends SwitchCompat {
    static {
        Covode.recordClassIndex(20044);
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public SettingSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
