package com.ss.android.ugc.aweme.notification.model;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.notification.api.NoticeApiManager;
import com.ss.android.ugc.aweme.notification.bean.s;
import com.ss.android.ugc.aweme.profile.model.User;
import h.a.n;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class TranslationLikeListModel extends b<s> {
    public boolean isLoadMore;
    private final String itemId;
    private final long lastReadTimestamp;
    private final String subtitleId;

    static {
        Covode.recordClassIndex(73168);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        l.d(objArr, "");
        return true;
    }

    public final void refresh() {
        this.isLoadMore = false;
        fetchTranslationLikeList$default(this, 0, 0, 3, null);
    }

    public final void loadMore() {
        long j2;
        this.isLoadMore = true;
        T t = this.mData;
        long j3 = 0;
        if (t != null) {
            j2 = t.f113288d;
        } else {
            j2 = 0;
        }
        T t2 = this.mData;
        if (t2 != null) {
            j3 = t2.f113287c;
        }
        fetchTranslationLikeList(j2, j3);
    }

    /* access modifiers changed from: protected */
    public final void handleData(s sVar) {
        int i2;
        List<User> list;
        if (sVar == null) {
            this.mData = null;
            return;
        }
        List<User> list2 = sVar.f113290f;
        int i3 = 0;
        if (list2 == null || list2.isEmpty()) {
            sVar.f113285a = 0;
        } else {
            List<User> list3 = sVar.f113290f;
            if (list3 != null) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (T t : list3) {
                    if (hashSet.add(t.getUid())) {
                        arrayList.add(t);
                    }
                }
                list3 = n.g((Collection) arrayList);
            }
            sVar.f113290f = list3;
            if (this.lastReadTimestamp <= 0 || (list = sVar.f113290f) == null || ((list instanceof Collection) && list.isEmpty())) {
                i2 = 0;
            } else {
                i2 = 0;
                for (T t2 : list) {
                    List<User> list4 = ((s) this.mData).f113290f;
                    if (list4 != null) {
                        Iterator<T> it = list4.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            T next = it.next();
                            if (l.a((Object) t2.getUid(), (Object) next.getUid())) {
                                if (next != null) {
                                }
                            }
                        }
                    }
                    i2++;
                    if (i2 < 0) {
                        n.b();
                    }
                }
            }
            s sVar2 = (s) this.mData;
            if (sVar2 != null) {
                i3 = sVar2.f113289e;
            }
            sVar.f113289e = i3 + i2;
        }
        this.mData = sVar;
    }

    private final void fetchTranslationLikeList(long j2, long j3) {
        NoticeApiManager.f113218a.fetchTranslationLikeList(this.subtitleId, this.itemId, j2, j3).a(new TranslationLikeListModel$fetchTranslationLikeList$1(this), i.f4826c, null);
    }

    public TranslationLikeListModel(String str, String str2, long j2) {
        l.d(str, "");
        l.d(str2, "");
        this.subtitleId = str;
        this.itemId = str2;
        this.lastReadTimestamp = j2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TranslationLikeListModel(String str, String str2, long j2, int i2, g gVar) {
        this(str, str2, (i2 & 4) != 0 ? 0 : j2);
    }

    static /* synthetic */ void fetchTranslationLikeList$default(TranslationLikeListModel translationLikeListModel, long j2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = 0;
        }
        if ((i2 & 2) != 0) {
            j3 = 0;
        }
        translationLikeListModel.fetchTranslationLikeList(j2, j3);
    }
}
