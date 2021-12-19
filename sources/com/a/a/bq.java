package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.RelativeLayout;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.ss.android.ugc.aweme.discover.widget.BannerSwipeRefreshLayout;
import com.ss.android.ugc.aweme.discover.widget.DiscoveryRecyclerView;
import com.zhiliaoapp.musically.R;

public final class bq implements e {
    static {
        Covode.recordClassIndex(1980);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(3327);
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.b69);
        ViewGroup.LayoutParams a2 = a.a(viewGroup, -1, -1);
        BannerSwipeRefreshLayout bannerSwipeRefreshLayout = new BannerSwipeRefreshLayout(context);
        bannerSwipeRefreshLayout.setId(R.id.x3);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(3, R.id.e_f);
        }
        DiscoveryRecyclerView discoveryRecyclerView = new DiscoveryRecyclerView(context);
        discoveryRecyclerView.setId(R.id.cbi);
        discoveryRecyclerView.setClipToPadding(false);
        discoveryRecyclerView.setPadding(discoveryRecyclerView.getPaddingLeft(), discoveryRecyclerView.getPaddingTop(), discoveryRecyclerView.getPaddingRight(), (int) resources.getDimension(R.dimen.j0));
        ViewGroup.MarginLayoutParams a3 = a.a(bannerSwipeRefreshLayout, -1, -1);
        a.a(discoveryRecyclerView);
        if (discoveryRecyclerView.getParent() == null) {
            bannerSwipeRefreshLayout.addView(discoveryRecyclerView, a3);
        }
        a.a(bannerSwipeRefreshLayout);
        if (bannerSwipeRefreshLayout.getParent() == null) {
            relativeLayout.addView(bannerSwipeRefreshLayout, layoutParams);
        }
        View view = new View(context);
        view.setBackgroundColor(resources.getColor(R.color.f159928l));
        view.setId(R.id.e_f);
        ViewGroup.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        a.a(view);
        if (view.getParent() == null) {
            relativeLayout.addView(view, layoutParams2);
        }
        View dmtStatusView = new DmtStatusView(context);
        dmtStatusView.setId(R.id.e_o);
        dmtStatusView.setBackgroundColor(resources.getColor(R.color.f159928l));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(3, R.id.e_f);
        }
        a.a(dmtStatusView);
        if (dmtStatusView.getParent() == null) {
            relativeLayout.addView(dmtStatusView, layoutParams3);
        }
        a.a(relativeLayout);
        relativeLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(relativeLayout);
        }
        MethodCollector.o(3327);
        return relativeLayout;
    }
}
