package com.a.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.tux.business.upvote.UpvoteBubbleView;
import com.zhiliaoapp.musically.R;

public final class cr implements e {
    static {
        Covode.recordClassIndex(2008);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(2334);
        context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -1);
        UpvoteBubbleView upvoteBubbleView = new UpvoteBubbleView(context);
        upvoteBubbleView.setId(R.id.fcf);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 8388627;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 8388627;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams)) {
            ((DrawerLayout.d) layoutParams).f2691a = 8388627;
        }
        a.a(upvoteBubbleView);
        if (upvoteBubbleView.getParent() == null) {
            frameLayout.addView(upvoteBubbleView, layoutParams);
        }
        UpvoteBubbleView upvoteBubbleView2 = new UpvoteBubbleView(context);
        upvoteBubbleView2.setId(R.id.fcg);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 8388627;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 8388627;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams2)) {
            ((DrawerLayout.d) layoutParams2).f2691a = 8388627;
        }
        a.a(upvoteBubbleView2);
        if (upvoteBubbleView2.getParent() == null) {
            frameLayout.addView(upvoteBubbleView2, layoutParams2);
        }
        a.a(frameLayout);
        frameLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.o(2334);
        return frameLayout;
    }
}
