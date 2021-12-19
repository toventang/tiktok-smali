package com.ss.android.ugc.aweme.discover.repo.gson;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.discover.model.TrendingTopicList;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import h.f.b.m;
import h.h;
import h.i;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final f f82023a = GsonHolder.a().b();

    /* renamed from: b  reason: collision with root package name */
    public static final ExecutorService f82024b = g.e();

    /* renamed from: c  reason: collision with root package name */
    public static final a f82025c = new a();

    /* renamed from: d  reason: collision with root package name */
    private static final h f82026d = i.a((h.f.a.a) C1919a.f82027a);

    public static boolean a() {
        return ((Boolean) f82026d.getValue()).booleanValue();
    }

    private a() {
    }

    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final c f82030a = new c();

        static {
            Covode.recordClassIndex(51058);
        }

        c() {
        }

        public final void run() {
            a.f82023a.a(TrendingTopicList.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.repo.gson.a$a  reason: collision with other inner class name */
    static final class C1919a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1919a f82027a = new C1919a();

        static {
            Covode.recordClassIndex(51056);
        }

        C1919a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(com.ss.android.ugc.aweme.discover.f.b.b());
        }
    }

    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f82028a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TrendingTopicList f82029b;

        static {
            Covode.recordClassIndex(51057);
        }

        public b(String str, TrendingTopicList trendingTopicList) {
            this.f82028a = str;
            this.f82029b = trendingTopicList;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            TrendingTopicList trendingTopicList = (TrendingTopicList) a.f82023a.a(this.f82028a, TrendingTopicList.class);
            if (trendingTopicList != null && trendingTopicList.items.size() > this.f82029b.items.size()) {
                trendingTopicList.setItems(trendingTopicList.items.subList(this.f82029b.items.size(), trendingTopicList.items.size()));
            }
            return trendingTopicList;
        }
    }

    static {
        Covode.recordClassIndex(51055);
    }
}
