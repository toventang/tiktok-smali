package com.ss.android.ugc.aweme.emoji.emojichoose;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import java.util.List;

final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final i f89272a;

    /* renamed from: b  reason: collision with root package name */
    private final List f89273b;

    /* renamed from: c  reason: collision with root package name */
    private final List f89274c;

    /* renamed from: d  reason: collision with root package name */
    private final View f89275d;

    /* renamed from: e  reason: collision with root package name */
    private final SwipeControlledViewPager f89276e;

    static {
        Covode.recordClassIndex(56102);
    }

    l(i iVar, List list, List list2, View view, SwipeControlledViewPager swipeControlledViewPager) {
        this.f89272a = iVar;
        this.f89273b = list;
        this.f89274c = list2;
        this.f89275d = view;
        this.f89276e = swipeControlledViewPager;
    }

    public final void run() {
        i iVar = this.f89272a;
        iVar.a(iVar.f89260k, iVar.f89261l, this.f89273b, this.f89274c, this.f89275d, this.f89276e);
    }
}
