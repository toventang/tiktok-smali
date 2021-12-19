package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.common.widget.DiggLayout;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout;
import com.zhiliaoapp.musically.R;

public final class ai implements e {
    static {
        Covode.recordClassIndex(1945);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(1954);
        Resources resources = context.getResources();
        FeedSwipeRefreshLayout feedSwipeRefreshLayout = new FeedSwipeRefreshLayout(context);
        feedSwipeRefreshLayout.setId(R.id.dk8);
        feedSwipeRefreshLayout.setKeepScreenOn(true);
        ViewGroup.LayoutParams a2 = a.a(viewGroup, -1, -1);
        LoadMoreFrameLayout loadMoreFrameLayout = new LoadMoreFrameLayout(context);
        loadMoreFrameLayout.setId(R.id.cic);
        ViewGroup.LayoutParams a3 = a.a(feedSwipeRefreshLayout, -1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams a4 = a.a(loadMoreFrameLayout, -1, -1);
        View view = new View(context);
        view.setId(R.id.ep9);
        view.setBackgroundColor(resources.getColor(R.color.a2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        a.a(view);
        if (view.getParent() == null) {
            linearLayout.addView(view, layoutParams);
        }
        VerticalViewPager verticalViewPager = new VerticalViewPager(context);
        verticalViewPager.setId(R.id.fk_);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 48;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 48;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams2)) {
            ((DrawerLayout.d) layoutParams2).f2691a = 48;
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.weight = 1.0f;
        }
        a.a(verticalViewPager);
        if (verticalViewPager.getParent() == null) {
            linearLayout.addView(verticalViewPager, layoutParams2);
        }
        View view2 = new View(context);
        view2.setId(R.id.w9);
        view2.setBackgroundColor(resources.getColor(R.color.a2));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        a.a(view2);
        if (view2.getParent() == null) {
            linearLayout.addView(view2, layoutParams3);
        }
        a.a(linearLayout);
        if (linearLayout.getParent() == null) {
            loadMoreFrameLayout.addView(linearLayout, a4);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.cuv);
        viewStub.setInflatedId(R.id.cuu);
        viewStub.setLayoutResource(R.layout.s6);
        ViewGroup.LayoutParams a5 = a.a(loadMoreFrameLayout, -1, -2);
        a.a(viewStub);
        if (viewStub.getParent() == null) {
            loadMoreFrameLayout.addView(viewStub, a5);
        }
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.ap_);
        viewStub2.setInflatedId(R.id.ap9);
        viewStub2.setLayoutResource(R.layout.s8);
        ViewGroup.LayoutParams a6 = a.a(loadMoreFrameLayout, -1, -2);
        a.a(viewStub2);
        if (viewStub2.getParent() == null) {
            loadMoreFrameLayout.addView(viewStub2, a6);
        }
        ViewStub viewStub3 = new ViewStub(context);
        viewStub3.setId(R.id.is);
        viewStub3.setInflatedId(R.id.ir);
        viewStub3.setLayoutResource(R.layout.rt);
        ViewGroup.LayoutParams a7 = a.a(loadMoreFrameLayout, -1, -1);
        a.a(viewStub3);
        if (viewStub3.getParent() == null) {
            loadMoreFrameLayout.addView(viewStub3, a7);
        }
        com.a.b.a.a(context, R.layout.s5, loadMoreFrameLayout, true, 0);
        View diggLayout = new DiggLayout(context);
        diggLayout.setId(R.id.am5);
        ViewGroup.LayoutParams a8 = a.a(loadMoreFrameLayout, -1, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(a8)) {
            ((RelativeLayout.LayoutParams) a8).addRule(13, -1);
        }
        a.a(diggLayout);
        if (diggLayout.getParent() == null) {
            loadMoreFrameLayout.addView(diggLayout, a8);
        }
        a.a(loadMoreFrameLayout);
        if (loadMoreFrameLayout.getParent() == null) {
            feedSwipeRefreshLayout.addView(loadMoreFrameLayout, a3);
        }
        a.a(feedSwipeRefreshLayout);
        feedSwipeRefreshLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(feedSwipeRefreshLayout);
        }
        MethodCollector.o(1954);
        return feedSwipeRefreshLayout;
    }
}
