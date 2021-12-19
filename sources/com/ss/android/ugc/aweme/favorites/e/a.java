package com.ss.android.ugc.aweme.favorites.e;

import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.favorites.api.UserFavoritesApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

public final class a extends com.ss.android.ugc.aweme.common.e.a<Challenge, b> {
    static {
        Covode.recordClassIndex(56911);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final List<Challenge> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((b) this.mData).f90599a;
    }

    public a() {
        b bVar = new b();
        bVar.f90599a = new ArrayList();
        bVar.a(true);
        this.mData = bVar;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isHasMore() {
        if (this.mData == null || !((b) this.mData).a()) {
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
        a(((b) this.mData).f90600b, 10);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        b bVar = (b) obj;
        boolean z2 = false;
        if (bVar == null || b.a((Collection) bVar.f90599a)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i2 = this.mListQueryType;
            if (i2 == 1) {
                this.mData = bVar;
            } else if (i2 == 4) {
                if (this.mData == null) {
                    this.mData = bVar;
                    return;
                }
                List<Challenge> list = ((b) this.mData).f90599a;
                List<Challenge> list2 = bVar.f90599a;
                List<Challenge> list3 = ((b) this.mData).f90599a;
                ArrayList arrayList = new ArrayList();
                for (Challenge challenge : list2) {
                    arrayList.add(challenge);
                    for (Challenge challenge2 : list3) {
                        if (challenge.getCid().equals(challenge2.getCid())) {
                            arrayList.remove(challenge);
                        }
                    }
                }
                list.addAll(arrayList);
                ((b) this.mData).f90600b = bVar.f90600b;
                b bVar2 = (b) this.mData;
                if (bVar.a() && ((b) this.mData).a()) {
                    z2 = true;
                }
                bVar2.a(z2);
            }
        } else if (this.mData != null) {
            if (this.mListQueryType == 1) {
                ((b) this.mData).f90599a.clear();
            }
            ((b) this.mData).a(false);
        }
    }

    private void a(final int i2, final int i3) {
        n.a().a(this.mHandler, new Callable() {
            /* class com.ss.android.ugc.aweme.favorites.e.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(56912);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return UserFavoritesApi.a(i2, i3);
            }
        }, 0);
    }
}
