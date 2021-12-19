package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.tux.business.story.StoryBrandView;
import com.zhiliaoapp.musically.R;

public final class bz implements e {
    static {
        Covode.recordClassIndex(1989);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(411);
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -2, -2);
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.bho);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 17;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams)) {
            ((DrawerLayout.d) layoutParams).f2691a = 17;
        }
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_icon", new a.b("2131755497", "raw"), tuxIconView, layoutParams);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_iconWidth", new a.d("24", "dp"), tuxIconView, layoutParams);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_iconHeight", new a.d("24", "dp"), tuxIconView, layoutParams);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_tintColor", new a.b("2130968613", "attr"), tuxIconView, layoutParams);
        com.ss.android.ugc.aweme.tux.a.j.e.a(tuxIconView, layoutParams);
        android.view.a.a(tuxIconView);
        if (tuxIconView.getParent() == null) {
            frameLayout.addView(tuxIconView, layoutParams);
        }
        StoryBrandView storyBrandView = new StoryBrandView(context);
        storyBrandView.setId(R.id.bi3);
        storyBrandView.setVisibility(4);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        com.ss.android.ugc.aweme.tux.business.a.a.a("app:ring_width", new a.d("2.5", "dp"), storyBrandView, layoutParams2);
        com.ss.android.ugc.aweme.tux.business.a.a.a(storyBrandView, layoutParams2);
        android.view.a.a(storyBrandView);
        if (storyBrandView.getParent() == null) {
            frameLayout.addView(storyBrandView, layoutParams2);
        }
        AvatarImageView avatarImageView = new AvatarImageView(context);
        avatarImageView.setId(R.id.bu0);
        avatarImageView.setVisibility(8);
        avatarImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 17;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams3)) {
            ((DrawerLayout.d) layoutParams3).f2691a = 17;
        }
        android.view.a.a(avatarImageView);
        if (avatarImageView.getParent() == null) {
            frameLayout.addView(avatarImageView, layoutParams3);
        }
        android.view.a.a(frameLayout);
        frameLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.o(411);
        return frameLayout;
    }
}
