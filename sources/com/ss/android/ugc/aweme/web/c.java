package com.ss.android.ugc.aweme.web;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.model.UpdatePackage;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.ad.feed.b.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.ad;
import h.f.b.l;
import h.h;
import h.i;
import h.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class c extends d {

    /* renamed from: a  reason: collision with root package name */
    private final h f144890a = i.a(m.NONE, a.f144894a);

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f144891b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private boolean f144892c;

    /* renamed from: d  reason: collision with root package name */
    private final Aweme f144893d;

    static {
        Covode.recordClassIndex(94738);
    }

    private final d b() {
        return (d) this.f144890a.getValue();
    }

    static final class a extends h.f.b.m implements h.f.a.a<d> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f144894a = new a();

        static {
            Covode.recordClassIndex(94739);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            IFeedAdService c2 = FeedAdServiceImpl.c();
            if (c2 != null) {
                return c2.b();
            }
            return null;
        }
    }

    private final void c() {
        if (this.f144891b.isEmpty() && !this.f144892c) {
            this.f144892c = true;
            d b2 = b();
            if (b2 != null) {
                b2.a(this.f144893d, true);
            }
        }
    }

    public c(Aweme aweme) {
        l.d(aweme, "");
        this.f144893d = aweme;
    }

    @Override // com.bytedance.geckox.f.a
    public final void a(String str, long j2) {
        l.d("GeckoX---onUpdateSuccess, channel: ".concat(String.valueOf(str)), "");
        super.a(str, j2);
        List<String> list = this.f144891b;
        Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        ad.b(list).remove(str);
        c();
    }

    @Override // com.ss.android.ugc.aweme.web.d, com.bytedance.geckox.f.a
    public final void a(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
        l.d("GeckoX---onCheckServerVersionSuccess, updateList empty: " + this.f144891b.isEmpty(), "");
        super.a(map, map2);
        this.f144891b.clear();
        if (map2 != null) {
            for (Map.Entry<String, List<UpdatePackage>> entry : map2.entrySet()) {
                List<UpdatePackage> value = entry.getValue();
                if (value != null) {
                    Iterator<T> it = value.iterator();
                    while (it.hasNext()) {
                        List<String> list = this.f144891b;
                        String channel = it.next().getChannel();
                        l.b(channel, "");
                        list.add(channel);
                    }
                }
            }
        }
        c();
    }
}
