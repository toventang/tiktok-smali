package com.ss.android.ugc.aweme.notification.model;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.notification.api.NoticeApiManager;
import com.ss.android.ugc.aweme.notification.bean.c;
import com.ss.android.ugc.aweme.notification.bean.e;
import com.ss.android.ugc.aweme.profile.model.User;
import h.a.n;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class LikeListModel extends b<e> {
    public static final Companion Companion = new Companion(null);
    private final int diggType;
    public boolean isLoadMore;
    private final boolean isNew;
    private final long lastReadTimestamp;
    private final HashSet<String> mLoadedIds;
    private final String refId;

    static {
        Covode.recordClassIndex(73159);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        l.d(objArr, "");
        return true;
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(73160);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public final void refresh() {
        this.isLoadMore = false;
        fetchLikeList$default(this, 0, 0, 3, null);
    }

    public final void loadMore() {
        long j2;
        this.isLoadMore = true;
        T t = this.mData;
        long j3 = 0;
        if (t != null) {
            j2 = t.f113242c;
        } else {
            j2 = 0;
        }
        T t2 = this.mData;
        if (t2 != null) {
            j3 = t2.f113243d;
        }
        fetchLikeList(j2, j3);
    }

    /* access modifiers changed from: protected */
    public final void handleData(e eVar) {
        int i2;
        List<c> list;
        if (eVar == null) {
            this.mData = null;
            return;
        }
        List<c> list2 = eVar.f113245f;
        int i3 = 0;
        if (list2 == null || list2.isEmpty()) {
            eVar.f113240a = 0;
        } else {
            List<c> list3 = eVar.f113245f;
            if (list3 != null) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (T t : list3) {
                    User user = t.f113236a;
                    if (hashSet.add(user != null ? user.getUid() : null)) {
                        arrayList.add(t);
                    }
                }
                list3 = n.g((Collection) arrayList);
            }
            eVar.f113245f = list3;
            if (this.lastReadTimestamp <= 0 || (list = eVar.f113245f) == null || ((list instanceof Collection) && list.isEmpty())) {
                i2 = 0;
            } else {
                Iterator<T> it = list.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    if (it.next().f113237b >= this.lastReadTimestamp && (i2 = i2 + 1) < 0) {
                        n.b();
                    }
                }
            }
            e eVar2 = (e) this.mData;
            if (eVar2 != null) {
                i3 = eVar2.f113244e;
            }
            eVar.f113244e = i3 + i2;
        }
        this.mData = eVar;
    }

    private final void fetchLikeList(long j2, long j3) {
        NoticeApiManager.f113218a.fetchLikeList(j2, j3, 20, this.isNew, this.diggType, this.refId).a(new LikeListModel$fetchLikeList$1(this), i.f4826c, null);
    }

    public LikeListModel(String str, boolean z, int i2, long j2) {
        l.d(str, "");
        this.refId = str;
        this.isNew = z;
        this.diggType = i2;
        this.lastReadTimestamp = j2;
        this.mLoadedIds = new HashSet<>();
    }

    static /* synthetic */ void fetchLikeList$default(LikeListModel likeListModel, long j2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = 0;
        }
        if ((i2 & 2) != 0) {
            j3 = 0;
        }
        likeListModel.fetchLikeList(j2, j3);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LikeListModel(String str, boolean z, int i2, long j2, int i3, g gVar) {
        this(str, (i3 & 2) != 0 ? true : z, (i3 & 4) != 0 ? 1 : i2, (i3 & 8) != 0 ? 0 : j2);
    }
}
