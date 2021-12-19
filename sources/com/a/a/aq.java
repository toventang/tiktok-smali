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
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView;
import com.ss.android.ugc.aweme.feed.AvatarImageWithLive;
import com.ss.android.ugc.aweme.feed.ui.LiveCircleView;
import com.ss.android.ugc.aweme.tux.business.story.StoryBrandView;
import com.zhiliaoapp.musically.R;

public final class aq implements e {
    static {
        Covode.recordClassIndex(1953);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        int i2;
        MethodCollector.i(345);
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        ViewGroup.LayoutParams a2 = a.a(viewGroup, (int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()), -2);
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        relativeLayout2.setId(R.id.p4);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        SmartAvatarBorderView smartAvatarBorderView = new SmartAvatarBorderView(context);
        smartAvatarBorderView.setId(R.id.fcu);
        smartAvatarBorderView.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(13, -1);
        }
        a.a(smartAvatarBorderView);
        if (smartAvatarBorderView.getParent() == null) {
            relativeLayout2.addView(smartAvatarBorderView, layoutParams2);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.bwx);
        appCompatImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        appCompatImageView.setImageResource(2131231756);
        appCompatImageView.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(18, R.id.fcu);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(6, R.id.fcu);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(19, R.id.fcu);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(8, R.id.fcu);
        }
        a.a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            relativeLayout2.addView(appCompatImageView, layoutParams3);
        }
        StoryBrandView storyBrandView = new StoryBrandView(context);
        storyBrandView.setId(R.id.fdu);
        storyBrandView.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 54.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 54.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(13, -1);
        }
        com.ss.android.ugc.aweme.tux.business.a.a.a("app:ring_width", new a.d("2.5", "dp"), storyBrandView, layoutParams4);
        com.ss.android.ugc.aweme.tux.business.a.a.a(storyBrandView, layoutParams4);
        android.view.a.a(storyBrandView);
        if (storyBrandView.getParent() == null) {
            relativeLayout2.addView(storyBrandView, layoutParams4);
        }
        LiveCircleView liveCircleView = new LiveCircleView(context);
        liveCircleView.setId(R.id.fcw);
        liveCircleView.setPadding((int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()));
        liveCircleView.setVisibility(8);
        liveCircleView.setStrokeWidth((int) TypedValue.applyDimension(1, 1.5f, resources.getDisplayMetrics()));
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 54.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 54.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(13, -1);
        }
        android.view.a.a(liveCircleView);
        if (liveCircleView.getParent() == null) {
            relativeLayout2.addView(liveCircleView, layoutParams5);
        }
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.dbp);
        smartImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        com.a.a.a.a.a aVar = new com.a.a.a.a.a();
        aVar.a("app:actualImageScaleType", new a.c("fitCenter"), smartImageView, layoutParams6);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            i2 = -1;
            layoutParams6.addRule(10, -1);
        } else {
            i2 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.addRule(14, i2);
        }
        aVar.a(smartImageView, layoutParams6);
        android.view.a.a(smartImageView);
        if (smartImageView.getParent() == null) {
            relativeLayout2.addView(smartImageView, layoutParams6);
        }
        AvatarImageWithLive avatarImageWithLive = new AvatarImageWithLive(context);
        avatarImageWithLive.setId(R.id.fd1);
        avatarImageWithLive.setVisibility(4);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.addRule(13, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.addRule(6, R.id.fcu);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.addRule(14, -1);
        }
        android.view.a.a(avatarImageWithLive);
        if (avatarImageWithLive.getParent() == null) {
            relativeLayout2.addView(avatarImageWithLive, layoutParams7);
        }
        android.view.a.a(relativeLayout2);
        if (relativeLayout2.getParent() == null) {
            relativeLayout.addView(relativeLayout2, layoutParams);
        }
        RemoteImageView remoteImageView = new RemoteImageView(context);
        remoteImageView.setId(R.id.p5);
        remoteImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        remoteImageView.setVisibility(8);
        remoteImageView.setImageResource(R.drawable.icon);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 45.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.addRule(14, -1);
        }
        android.view.a.a(remoteImageView);
        if (remoteImageView.getParent() == null) {
            relativeLayout.addView(remoteImageView, layoutParams8);
        }
        RelativeLayout relativeLayout3 = new RelativeLayout(context);
        relativeLayout3.setId(R.id.b7j);
        relativeLayout3.setPadding(relativeLayout3.getPaddingLeft(), relativeLayout3.getPaddingTop(), relativeLayout3.getPaddingRight(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()), -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.addRule(14, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9)) {
            ((ViewGroup.MarginLayoutParams) layoutParams9).topMargin = (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics());
        }
        AnimationImageView animationImageView = new AnimationImageView(context);
        animationImageView.setId(R.id.b7a);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.addRule(14, -1);
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams10)) {
            ((LinearLayout.LayoutParams) layoutParams10).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams10)) {
            ((FrameLayout.LayoutParams) layoutParams10).gravity = 17;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams10)) {
            ((DrawerLayout.d) layoutParams10).f2691a = 17;
        }
        android.view.a.a(animationImageView);
        if (animationImageView.getParent() == null) {
            relativeLayout3.addView(animationImageView, layoutParams10);
        }
        android.view.a.a(relativeLayout3);
        if (relativeLayout3.getParent() == null) {
            relativeLayout.addView(relativeLayout3, layoutParams9);
        }
        android.view.a.a(relativeLayout);
        relativeLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(relativeLayout);
        }
        MethodCollector.o(345);
        return relativeLayout;
    }
}
