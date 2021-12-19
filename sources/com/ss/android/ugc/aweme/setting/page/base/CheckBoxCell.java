package com.ss.android.ugc.aweme.setting.page.base;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;

public abstract class CheckBoxCell<T> extends PowerCell<T> implements View.OnClickListener {
    static {
        Covode.recordClassIndex(80291);
    }
}
