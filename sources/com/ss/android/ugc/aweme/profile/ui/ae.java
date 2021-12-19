package com.ss.android.ugc.aweme.profile.ui;

import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class ae {
    static {
        Covode.recordClassIndex(75468);
    }

    public static int b(User user) {
        if (user == null) {
            return 0;
        }
        if (a(user)) {
            return user.getFansCount();
        }
        return user.getFollowerCount();
    }

    public static List<FollowerDetail> a(List<FollowerDetail> list) {
        ArrayList arrayList = new ArrayList();
        if (b.a((Collection) list)) {
            return arrayList;
        }
        arrayList.clear();
        arrayList.addAll(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FollowerDetail followerDetail = (FollowerDetail) it.next();
            if (followerDetail != null && followerDetail.getFansCount() <= 0) {
                it.remove();
            }
        }
        return arrayList;
    }

    public static boolean a(User user) {
        if (user == null || b.a((Collection) user.getFollowerDetailList())) {
            return false;
        }
        List<FollowerDetail> a2 = a(user.getFollowerDetailList());
        if (!b.a((Collection) a2) && a2.size() > 1) {
            return true;
        }
        return false;
    }
}
