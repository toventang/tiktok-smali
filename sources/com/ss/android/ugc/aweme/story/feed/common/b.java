package com.ss.android.ugc.aweme.story.feed.common;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.adapter.cf;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.feed.ui.progress.StoryListProgressBar;
import dmt.viewpager.DmtRtlViewPager;
import h.f.b.l;

public abstract class b implements u<com.ss.android.ugc.aweme.arch.widgets.base.b> {

    /* renamed from: a  reason: collision with root package name */
    public c f137640a;

    /* renamed from: b  reason: collision with root package name */
    public DmtRtlViewPager f137641b;

    /* renamed from: c  reason: collision with root package name */
    public StoryFeedViewModel f137642c;

    /* renamed from: d  reason: collision with root package name */
    public a f137643d;

    /* renamed from: e  reason: collision with root package name */
    public Context f137644e;

    /* renamed from: f  reason: collision with root package name */
    public StoryListProgressBar f137645f;

    /* renamed from: g  reason: collision with root package name */
    public cf f137646g;

    /* renamed from: h  reason: collision with root package name */
    public View f137647h;

    static {
        Covode.recordClassIndex(90056);
    }

    public abstract void a(int i2);

    public abstract void a(Aweme aweme, int i2);

    public abstract void b(int i2);

    public abstract void g();

    public final c a() {
        c cVar = this.f137640a;
        if (cVar == null) {
            l.a("adapter");
        }
        return cVar;
    }

    public final DmtRtlViewPager b() {
        DmtRtlViewPager dmtRtlViewPager = this.f137641b;
        if (dmtRtlViewPager == null) {
            l.a("storyViewPager");
        }
        return dmtRtlViewPager;
    }

    public final StoryFeedViewModel c() {
        StoryFeedViewModel storyFeedViewModel = this.f137642c;
        if (storyFeedViewModel == null) {
            l.a("storyFeedVM");
        }
        return storyFeedViewModel;
    }

    public final a d() {
        a aVar = this.f137643d;
        if (aVar == null) {
            l.a("baseStoryPlayerView");
        }
        return aVar;
    }

    public final Context e() {
        Context context = this.f137644e;
        if (context == null) {
            l.a("context");
        }
        return context;
    }

    public final View f() {
        View view = this.f137647h;
        if (view == null) {
            l.a("rootView");
        }
        return view;
    }
}
