package com.ss.android.ugc.aweme.following.ui.view;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;

public interface a {
    static {
        Covode.recordClassIndex(61243);
    }

    void a(int i2, int i3);

    void a(int i2, int i3, String str);

    Context getContext();

    m getLifeCycleOwner();

    void setOnClickListener(View.OnClickListener onClickListener);
}
