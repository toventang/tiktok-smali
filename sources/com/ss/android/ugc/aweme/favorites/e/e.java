package com.ss.android.ugc.aweme.favorites.e;

import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.favorites.api.UserFavoritesApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class e extends a<Comment, c> {
    static {
        Covode.recordClassIndex(56916);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.comment.model.Comment>, java.util.List<com.ss.android.ugc.aweme.comment.model.Comment> */
    @Override // com.ss.android.ugc.aweme.common.e.a
    public final List<Comment> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((c) this.mData).f90602a;
    }

    public e() {
        c cVar = new c();
        cVar.f90602a = new ArrayList();
        cVar.a(true);
        this.mData = cVar;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isHasMore() {
        if (this.mData == null || !((c) this.mData).a()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void refreshList(Object... objArr) {
        a(0);
    }

    private void a(final int i2) {
        n.a().a(this.mHandler, new Callable() {
            /* class com.ss.android.ugc.aweme.favorites.e.e.AnonymousClass1 */

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f90611b = 30;

            static {
                Covode.recordClassIndex(56917);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return UserFavoritesApi.b(i2, this.f90611b);
            }
        }, 0);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void loadMoreList(Object... objArr) {
        a(((c) this.mData).f90603b);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        c cVar = (c) obj;
        boolean z2 = false;
        if (cVar == null || b.a((Collection) cVar.f90602a)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i2 = this.mListQueryType;
            if (i2 == 1) {
                this.mData = cVar;
            } else if (i2 == 4) {
                if (this.mData == null) {
                    this.mData = cVar;
                    return;
                }
                List list = (List) Objects.requireNonNull(((c) this.mData).f90602a);
                List<? extends Comment> list2 = cVar.f90602a;
                List<? extends Comment> list3 = ((c) this.mData).f90602a;
                ArrayList arrayList = new ArrayList();
                for (Comment comment : list2) {
                    arrayList.add(comment);
                    for (Comment comment2 : list3) {
                        if (comment.getCid().equals(comment2.getCid())) {
                            arrayList.remove(comment);
                        }
                    }
                }
                list.addAll(arrayList);
                ((c) this.mData).f90603b = cVar.f90603b;
                c cVar2 = (c) this.mData;
                if (cVar.a() && ((c) this.mData).a()) {
                    z2 = true;
                }
                cVar2.a(z2);
            }
        } else if (this.mData != null) {
            if (this.mListQueryType == 1) {
                ((List) Objects.requireNonNull(((c) this.mData).f90602a)).clear();
            }
            ((c) this.mData).a(false);
        }
    }
}
