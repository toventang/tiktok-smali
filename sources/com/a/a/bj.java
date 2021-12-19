package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.ui.AudioControlView;
import com.ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.ss.android.ugc.aweme.shortvideo.ui.NewVideoPlayerProgressbar;
import com.zhiliaoapp.musically.R;

public final class bj implements e {
    static {
        Covode.recordClassIndex(1973);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(649);
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a2)) {
            ((LinearLayout.LayoutParams) a2).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a2)) {
            ((FrameLayout.LayoutParams) a2).gravity = 80;
        }
        if (DrawerLayout.d.class.isInstance(a2)) {
            ((DrawerLayout.d) a2).f2691a = 80;
        }
        AudioControlView audioControlView = new AudioControlView(context);
        audioControlView.setId(R.id.nj);
        audioControlView.setAlpha(0.0f);
        audioControlView.setForegroundColor(resources.getColor(R.color.bm));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 80;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams)) {
            ((DrawerLayout.d) layoutParams).f2691a = 80;
        }
        a.a(audioControlView);
        if (audioControlView.getParent() == null) {
            frameLayout.addView(audioControlView, layoutParams);
        }
        LineProgressBar lineProgressBar = new LineProgressBar(context);
        lineProgressBar.setId(R.id.cag);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        a.a(lineProgressBar);
        if (lineProgressBar.getParent() == null) {
            frameLayout.addView(lineProgressBar, layoutParams2);
        }
        NewVideoPlayerProgressbar newVideoPlayerProgressbar = new NewVideoPlayerProgressbar(context);
        newVideoPlayerProgressbar.setId(R.id.fgu);
        newVideoPlayerProgressbar.setReachedBarColor(resources.getColor(R.color.a_));
        newVideoPlayerProgressbar.setReachedProgressBarHeight(TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        a.a(newVideoPlayerProgressbar);
        if (newVideoPlayerProgressbar.getParent() == null) {
            frameLayout.addView(newVideoPlayerProgressbar, layoutParams3);
        }
        a.a(frameLayout);
        frameLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.o(649);
        return frameLayout;
    }
}
