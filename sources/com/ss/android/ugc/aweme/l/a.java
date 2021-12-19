package com.ss.android.ugc.aweme.l;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class a {
    static {
        Covode.recordClassIndex(68552);
    }

    public static <T extends User> void a(List<User> list, List<T> list2) {
        if (!b.a((Collection) list2)) {
            for (T t : list2) {
                if (!list.isEmpty()) {
                    Iterator<User> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        User next = it.next();
                        if (!(next == null || t == null || !TextUtils.equals(next.getUid(), t.getUid()))) {
                            break;
                        }
                    }
                }
                list.add(t);
            }
        }
    }
}
