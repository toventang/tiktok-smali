package com.ss.android.ugc.aweme.legacy;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics;
import com.ss.android.ugc.aweme.discover.mob.f;
import com.ss.android.ugc.aweme.discover.mob.l;
import com.ss.android.ugc.aweme.discover.mob.r;
import com.ss.android.ugc.aweme.search.h;
import com.ss.android.ugc.b;

public class SearchResultStatisticsImpl implements ISearchResultStatistics {

    /* renamed from: a  reason: collision with root package name */
    private final ISearchResultStatistics f107301a = h.f121133a.c();

    static {
        Covode.recordClassIndex(68660);
    }

    public static ISearchResultStatistics a() {
        MethodCollector.i(2783);
        Object a2 = b.a(ISearchResultStatistics.class, false);
        if (a2 != null) {
            ISearchResultStatistics iSearchResultStatistics = (ISearchResultStatistics) a2;
            MethodCollector.o(2783);
            return iSearchResultStatistics;
        }
        if (b.ci == null) {
            synchronized (ISearchResultStatistics.class) {
                try {
                    if (b.ci == null) {
                        b.ci = new SearchResultStatisticsImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2783);
                    throw th;
                }
            }
        }
        SearchResultStatisticsImpl searchResultStatisticsImpl = (SearchResultStatisticsImpl) b.ci;
        MethodCollector.o(2783);
        return searchResultStatisticsImpl;
    }

    @Override // com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics
    public final void a(f fVar) {
        this.f107301a.a(fVar);
    }

    @Override // com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics
    public final void a(l lVar) {
        this.f107301a.a(lVar);
    }

    @Override // com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics
    public final void a(r rVar) {
        this.f107301a.a(rVar);
    }
}
