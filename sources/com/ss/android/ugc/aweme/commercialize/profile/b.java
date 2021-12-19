package com.ss.android.ugc.aweme.commercialize.profile;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.common.e.c;
import com.ss.android.ugc.aweme.common.m;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class b extends com.ss.android.ugc.aweme.common.e.b<n> {
    static {
        Covode.recordClassIndex(46352);
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.e.b
    public final void b() {
        if (this.f76396h != null && this.f76397i != null) {
            com.ss.android.ugc.aweme.common.b bVar = this.f76396h;
            l.b(bVar, "");
            int i2 = ((a) bVar).mListQueryType;
            if (i2 == 1) {
                ((c) this.f76397i).b();
            } else if (i2 == 4) {
                ((c) this.f76397i).aO_();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o, com.ss.android.ugc.aweme.common.e.b
    public final void c() {
        if (this.f76396h != null && this.f76397i != null) {
            if (this.f76397i instanceof e) {
                m mVar = this.f76397i;
                Objects.requireNonNull(mVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.profile.AdFakeUserProfileAwemeListFragment");
                com.ss.android.ugc.aweme.common.b bVar = this.f76396h;
                l.b(bVar, "");
                T t = bVar.mData;
                l.b(t, "");
                ((e) mVar).f75161d = t.maxCursor;
            } else if (this.f76397i instanceof com.ss.android.ugc.aweme.detail.h.b) {
                m mVar2 = this.f76397i;
                Objects.requireNonNull(mVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel");
                com.ss.android.ugc.aweme.feed.param.b bVar2 = ((com.ss.android.ugc.aweme.feed.q.a) mVar2).aJ;
                l.b(bVar2, "");
                com.ss.android.ugc.aweme.common.b bVar3 = this.f76396h;
                l.b(bVar3, "");
                T t2 = bVar3.mData;
                l.b(t2, "");
                bVar2.setMaxCursor(t2.maxCursor);
            }
            com.ss.android.ugc.aweme.common.b bVar4 = this.f76396h;
            l.b(bVar4, "");
            if (((a) bVar4).mListQueryType == 1) {
                com.ss.android.ugc.aweme.common.b bVar5 = this.f76396h;
                l.b(bVar5, "");
                if (((a) bVar5).isDataEmpty()) {
                    ((c) this.f76397i).f();
                    return;
                }
                com.ss.android.ugc.aweme.common.b bVar6 = this.f76396h;
                l.b(bVar6, "");
                List items = ((a) bVar6).getItems();
                com.ss.android.ugc.aweme.common.b bVar7 = this.f76396h;
                l.b(bVar7, "");
                ((c) this.f76397i).b(items, ((a) bVar7).isHasMore());
                return;
            }
            com.ss.android.ugc.aweme.common.b bVar8 = this.f76396h;
            l.b(bVar8, "");
            if (((a) bVar8).mListQueryType == 4) {
                com.ss.android.ugc.aweme.common.b bVar9 = this.f76396h;
                l.b(bVar9, "");
                List items2 = ((a) bVar9).getItems();
                com.ss.android.ugc.aweme.common.b bVar10 = this.f76396h;
                l.b(bVar10, "");
                ((c) this.f76397i).b(items2, ((a) bVar10).isHasMore());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o, com.ss.android.ugc.aweme.common.e.b
    public final void a_(Exception exc) {
        if (this.f76396h != null && this.f76397i != null) {
            com.ss.android.ugc.aweme.common.b bVar = this.f76396h;
            l.b(bVar, "");
            int i2 = ((a) bVar).mListQueryType;
            if (i2 == 1) {
                ((c) this.f76397i).b(exc);
            } else if (i2 == 4) {
                ((c) this.f76397i).c(exc);
            }
        }
    }
}
