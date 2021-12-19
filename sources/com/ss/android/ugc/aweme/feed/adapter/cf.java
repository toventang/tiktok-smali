package com.ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cd;
import com.ss.android.ugc.aweme.feed.assem.g;
import com.ss.android.ugc.aweme.feed.e.l;
import com.ss.android.ugc.aweme.feed.helper.c;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import h.f.a.b;

public final class cf implements cd {

    /* renamed from: a  reason: collision with root package name */
    public final View f91766a;

    /* renamed from: b  reason: collision with root package name */
    public final s<ag> f91767b;

    /* renamed from: c  reason: collision with root package name */
    public final Fragment f91768c;

    /* renamed from: d  reason: collision with root package name */
    public final View.OnTouchListener f91769d;

    /* renamed from: e  reason: collision with root package name */
    public final BaseFeedPageParams f91770e;

    /* renamed from: f  reason: collision with root package name */
    public final l f91771f;

    /* renamed from: g  reason: collision with root package name */
    public final c f91772g;

    /* renamed from: h  reason: collision with root package name */
    public final View.OnTouchListener f91773h;

    /* renamed from: i  reason: collision with root package name */
    public final LongPressLayout.a f91774i;

    /* renamed from: j  reason: collision with root package name */
    public final String f91775j;

    /* renamed from: k  reason: collision with root package name */
    public final long f91776k;

    /* renamed from: l  reason: collision with root package name */
    public final String f91777l;

    /* renamed from: m  reason: collision with root package name */
    public final int f91778m;
    public final g n;
    public final b<String, View> o;

    static {
        Covode.recordClassIndex(57771);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r18v0, resolved type: h.f.a.b<? super java.lang.String, ? extends android.view.View> */
    /* JADX WARN: Multi-variable type inference failed */
    public cf(View view, s<ag> sVar, Fragment fragment, View.OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, l lVar, c cVar, View.OnTouchListener onTouchListener2, LongPressLayout.a aVar, String str, long j2, String str2, int i2, g gVar, b<? super String, ? extends View> bVar) {
        h.f.b.l.d(view, "");
        h.f.b.l.d(sVar, "");
        h.f.b.l.d(fragment, "");
        h.f.b.l.d(onTouchListener, "");
        h.f.b.l.d(baseFeedPageParams, "");
        h.f.b.l.d(lVar, "");
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(onTouchListener2, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(str, "");
        this.f91766a = view;
        this.f91767b = sVar;
        this.f91768c = fragment;
        this.f91769d = onTouchListener;
        this.f91770e = baseFeedPageParams;
        this.f91771f = lVar;
        this.f91772g = cVar;
        this.f91773h = onTouchListener2;
        this.f91774i = aVar;
        this.f91775j = str;
        this.f91776k = j2;
        this.f91777l = str2;
        this.f91778m = i2;
        this.n = gVar;
        this.o = bVar;
    }
}
