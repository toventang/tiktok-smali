package com.ss.android.ugc.aweme.favorites.e;

import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.favorites.api.UserFavoritesApi;
import com.ss.android.ugc.aweme.question.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class f extends a<c, d> {
    static {
        Covode.recordClassIndex(56918);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final List<c> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((d) this.mData).f90606a;
    }

    public f() {
        d dVar = new d();
        dVar.f90606a = new ArrayList();
        dVar.a(true);
        this.mData = dVar;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isHasMore() {
        if (this.mData == null || !((d) this.mData).a()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void refreshList(Object... objArr) {
        a(0, 12);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void loadMoreList(Object... objArr) {
        a(((d) this.mData).f90607b, 10);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        d dVar = (d) obj;
        boolean z2 = false;
        if (dVar == null || b.a((Collection) dVar.f90606a)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i2 = this.mListQueryType;
            if (i2 == 1) {
                this.mData = dVar;
            } else if (i2 == 4) {
                if (this.mData == null) {
                    this.mData = dVar;
                    return;
                }
                List list = (List) Objects.requireNonNull(((d) this.mData).f90606a);
                List<c> list2 = dVar.f90606a;
                List<c> list3 = ((d) this.mData).f90606a;
                ArrayList arrayList = new ArrayList();
                for (c cVar : list2) {
                    arrayList.add(cVar);
                    for (c cVar2 : list3) {
                        if (cVar.getId().equals(cVar2.getId())) {
                            arrayList.remove(cVar);
                        }
                    }
                }
                list.addAll(arrayList);
                ((d) this.mData).f90607b = dVar.f90607b;
                d dVar2 = (d) this.mData;
                if (dVar.a() && ((d) this.mData).a()) {
                    z2 = true;
                }
                dVar2.a(z2);
            }
        } else if (this.mData != null) {
            if (this.mListQueryType == 1) {
                ((List) Objects.requireNonNull(((d) this.mData).f90606a)).clear();
            }
            ((d) this.mData).a(false);
        }
    }

    private void a(final int i2, final int i3) {
        n.a().a(this.mHandler, new Callable() {
            /* class com.ss.android.ugc.aweme.favorites.e.f.AnonymousClass1 */

            static {
                Covode.recordClassIndex(56919);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return UserFavoritesApi.c(i2, i3);
            }
        }, 0);
    }
}
