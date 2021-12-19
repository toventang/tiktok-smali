package com.a.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.feed.ui.seekbar.MutableSeekBar;
import com.zhiliaoapp.musically.R;

public final class bh implements e {
    static {
        Covode.recordClassIndex(1971);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(958);
        context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -1);
        MutableSeekBar mutableSeekBar = new MutableSeekBar(context);
        mutableSeekBar.setId(R.id.dwy);
        mutableSeekBar.setMax(10000);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        a.a(mutableSeekBar);
        if (mutableSeekBar.getParent() == null) {
            frameLayout.addView(mutableSeekBar, layoutParams);
        }
        a.a(frameLayout);
        frameLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.o(958);
        return frameLayout;
    }
}
