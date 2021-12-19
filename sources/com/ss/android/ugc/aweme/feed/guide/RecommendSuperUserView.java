package com.ss.android.ugc.aweme.feed.guide;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.common.d.d;
import com.ss.android.ugc.aweme.feed.adapter.aw;
import com.ss.android.ugc.aweme.feed.adapter.ax;
import com.ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.ss.android.ugc.aweme.profile.ui.widget.h;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class RecommendSuperUserView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f93233a;

    /* renamed from: b  reason: collision with root package name */
    public aw f93234b;

    /* renamed from: c  reason: collision with root package name */
    public GalleryLayoutManager f93235c;

    /* renamed from: d  reason: collision with root package name */
    private String f93236d = "";

    /* renamed from: e  reason: collision with root package name */
    private List<UserWithAweme> f93237e = new ArrayList();

    static {
        Covode.recordClassIndex(59120);
    }

    public final List<UserWithAweme> getMCardItems() {
        return this.f93237e;
    }

    public final String getRequestId() {
        return this.f93236d;
    }

    public final aw getAdapter() {
        aw awVar = this.f93234b;
        if (awVar == null) {
            l.a("adapter");
        }
        return awVar;
    }

    public final GalleryLayoutManager getLayoutManager() {
        GalleryLayoutManager galleryLayoutManager = this.f93235c;
        if (galleryLayoutManager == null) {
            l.a("layoutManager");
        }
        return galleryLayoutManager;
    }

    public final RecyclerView getList() {
        RecyclerView recyclerView = this.f93233a;
        if (recyclerView == null) {
            l.a("list");
        }
        return recyclerView;
    }

    public final void a() {
        RecyclerView recyclerView = this.f93233a;
        if (recyclerView == null) {
            l.a("list");
        }
        GalleryLayoutManager galleryLayoutManager = this.f93235c;
        if (galleryLayoutManager == null) {
            l.a("layoutManager");
        }
        RecyclerView.ViewHolder f2 = recyclerView.f(galleryLayoutManager.f93214b);
        if (f2 != null) {
            Objects.requireNonNull(f2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder");
            ((ax) f2).f();
        }
        RecyclerView recyclerView2 = this.f93233a;
        if (recyclerView2 == null) {
            l.a("list");
        }
        GalleryLayoutManager galleryLayoutManager2 = this.f93235c;
        if (galleryLayoutManager2 == null) {
            l.a("layoutManager");
        }
        RecyclerView.ViewHolder f3 = recyclerView2.f(galleryLayoutManager2.f93214b + 1);
        if (f3 != null) {
            Objects.requireNonNull(f3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder");
            ((ax) f3).c();
        }
        RecyclerView recyclerView3 = this.f93233a;
        if (recyclerView3 == null) {
            l.a("list");
        }
        GalleryLayoutManager galleryLayoutManager3 = this.f93235c;
        if (galleryLayoutManager3 == null) {
            l.a("layoutManager");
        }
        RecyclerView.ViewHolder f4 = recyclerView3.f(galleryLayoutManager3.f93214b - 1);
        if (f4 != null) {
            Objects.requireNonNull(f4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder");
            ((ax) f4).c();
        }
    }

    public final void setAdapter(aw awVar) {
        l.d(awVar, "");
        this.f93234b = awVar;
    }

    public final void setLayoutManager(GalleryLayoutManager galleryLayoutManager) {
        l.d(galleryLayoutManager, "");
        this.f93235c = galleryLayoutManager;
    }

    public final void setList(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        this.f93233a = recyclerView;
    }

    public final void setMCardItems(List<UserWithAweme> list) {
        l.d(list, "");
        this.f93237e = list;
    }

    public final void setRequestId(String str) {
        l.d(str, "");
        this.f93236d = str;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(!(parent instanceof RecyclerView));
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setContainer(WeakReference<Activity> weakReference) {
        l.d(weakReference, "");
        GalleryLayoutManager galleryLayoutManager = this.f93235c;
        if (galleryLayoutManager == null) {
            l.a("layoutManager");
        }
        galleryLayoutManager.f93220h = weakReference;
    }

    public final void setOnItemOperationListener(h.b bVar) {
        l.d(bVar, "");
        aw awVar = this.f93234b;
        if (awVar == null) {
            l.a("adapter");
        }
        l.d(bVar, "");
        awVar.f91614c = bVar;
    }

    public final void setOnViewFirstShowListener(d<ax> dVar) {
        l.d(dVar, "");
        aw awVar = this.f93234b;
        if (awVar == null) {
            l.a("adapter");
        }
        l.d(dVar, "");
        awVar.f91613b = dVar;
    }

    public final void setData(List<UserWithAweme> list) {
        l.d(list, "");
        this.f93236d = this.f93236d;
        this.f93237e = list;
        aw awVar = this.f93234b;
        if (awVar == null) {
            l.a("adapter");
        }
        awVar.b_(this.f93237e);
        aw awVar2 = this.f93234b;
        if (awVar2 == null) {
            l.a("adapter");
        }
        String str = this.f93236d;
        l.d(str, "");
        awVar2.f91612a = str;
        aw awVar3 = this.f93234b;
        if (awVar3 == null) {
            l.a("adapter");
        }
        awVar3.notifyDataSetChanged();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecommendSuperUserView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
        MethodCollector.i(12859);
        RecyclerView recyclerView = new RecyclerView(getContext());
        this.f93233a = recyclerView;
        addView(recyclerView, new ViewGroup.LayoutParams(-1, -1));
        GalleryLayoutManager galleryLayoutManager = new GalleryLayoutManager();
        this.f93235c = galleryLayoutManager;
        RecyclerView recyclerView2 = this.f93233a;
        if (recyclerView2 == null) {
            l.a("list");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The attach RecycleView must not null!!");
            MethodCollector.o(12859);
            throw illegalArgumentException;
        }
        galleryLayoutManager.f93223k = recyclerView2;
        galleryLayoutManager.f93213a = Math.max(0, 0);
        recyclerView2.setLayoutManager(galleryLayoutManager);
        galleryLayoutManager.f93216d.a(recyclerView2);
        recyclerView2.a(galleryLayoutManager.f93217e);
        GalleryLayoutManager galleryLayoutManager2 = this.f93235c;
        if (galleryLayoutManager2 == null) {
            l.a("layoutManager");
        }
        Context context2 = getContext();
        l.b(context2, "");
        galleryLayoutManager2.f93221i = new g(context2);
        GalleryLayoutManager galleryLayoutManager3 = this.f93235c;
        if (galleryLayoutManager3 == null) {
            l.a("layoutManager");
        }
        l.d(galleryLayoutManager3, "");
        aw awVar = new aw(galleryLayoutManager3);
        awVar.d(false);
        awVar.c(this.f93237e);
        this.f93234b = awVar;
        RecyclerView recyclerView3 = this.f93233a;
        if (recyclerView3 == null) {
            l.a("list");
        }
        aw awVar2 = this.f93234b;
        if (awVar2 == null) {
            l.a("adapter");
        }
        recyclerView3.setAdapter(awVar2);
        RecyclerView recyclerView4 = this.f93233a;
        if (recyclerView4 == null) {
            l.a("list");
        }
        RecyclerView recyclerView5 = this.f93233a;
        if (recyclerView5 == null) {
            l.a("list");
        }
        recyclerView4.setItemAnimator(new j(recyclerView5));
        MethodCollector.o(12859);
    }
}
