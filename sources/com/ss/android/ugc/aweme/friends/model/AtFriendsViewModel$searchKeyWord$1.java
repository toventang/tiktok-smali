package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final class AtFriendsViewModel$searchKeyWord$1<V> implements Callable {
    final /* synthetic */ List $data;
    final /* synthetic */ String $keyWord;
    final /* synthetic */ AtFriendsViewModel this$0;

    static {
        Covode.recordClassIndex(61564);
    }

    AtFriendsViewModel$searchKeyWord$1(AtFriendsViewModel atFriendsViewModel, List list, String str) {
        this.this$0 = atFriendsViewModel;
        this.$data = list;
        this.$keyWord = str;
    }

    @Override // java.util.concurrent.Callable
    public final List<IMUser> call() {
        List<IMUser> searchFollowIMUser = this.this$0.searchFollowIMUser(this.$data, this.$keyWord);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t : searchFollowIMUser) {
            if (hashSet.add(t.getUid())) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }
}
