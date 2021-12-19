package com.ss.android.ugc.aweme.discover.ui.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.common.e.b;
import com.ss.android.ugc.aweme.common.m;
import com.ss.android.ugc.aweme.discover.j.d;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class g extends b<d> {
    static {
        Covode.recordClassIndex(51408);
    }

    public final List<Aweme> d() {
        List<Aweme> items;
        a aVar = (a) this.f76396h;
        if (aVar == null || (items = aVar.getItems()) == null) {
            return new ArrayList();
        }
        return items;
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o, com.ss.android.ugc.aweme.common.e.b
    public final void c() {
        if (this.f76396h != null && this.f76397i != null) {
            com.ss.android.ugc.aweme.common.b bVar = this.f76396h;
            l.b(bVar, "");
            int i2 = ((a) bVar).mListQueryType;
            if (i2 == 1) {
                com.ss.android.ugc.aweme.common.b bVar2 = this.f76396h;
                l.b(bVar2, "");
                if (!((a) bVar2).isDataEmpty()) {
                    m mVar = this.f76397i;
                    Objects.requireNonNull(mVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.ui.suicide.ISearchSuicideView");
                    com.ss.android.ugc.aweme.common.b bVar3 = this.f76396h;
                    l.b(bVar3, "");
                    ((a) mVar).a(((a) bVar3).isHasMore());
                }
            } else if (i2 == 4) {
                m mVar2 = this.f76397i;
                Objects.requireNonNull(mVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.ui.suicide.ISearchSuicideView");
                com.ss.android.ugc.aweme.common.b bVar4 = this.f76396h;
                l.b(bVar4, "");
                List<? extends Aweme> items = ((a) bVar4).getItems();
                com.ss.android.ugc.aweme.common.b bVar5 = this.f76396h;
                l.b(bVar5, "");
                ((a) mVar2).d(items, ((a) bVar5).isHasMore());
            }
            com.ss.android.ugc.aweme.common.b bVar6 = this.f76396h;
            l.b(bVar6, "");
            T t = bVar6.mData;
            Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.SearchApiResult");
            GlobalDoodleConfig globalDoodleConfig = t.globalDoodleConfig;
            m mVar3 = this.f76397i;
            Objects.requireNonNull(mVar3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.ui.suicide.ISearchSuicideView");
            ((a) mVar3).a(globalDoodleConfig);
            m mVar4 = this.f76397i;
            Objects.requireNonNull(mVar4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.ui.suicide.ISearchSuicideView");
            com.ss.android.ugc.aweme.common.b bVar7 = this.f76396h;
            l.b(bVar7, "");
            T t2 = bVar7.mData;
            Objects.requireNonNull(t2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.SearchApiResult");
            ((a) mVar4).a(t2.logPb);
        }
    }
}
