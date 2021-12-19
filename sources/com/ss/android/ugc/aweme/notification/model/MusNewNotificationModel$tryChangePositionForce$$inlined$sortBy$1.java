package com.ss.android.ugc.aweme.notification.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import h.b.a;
import java.util.Comparator;

public final class MusNewNotificationModel$tryChangePositionForce$$inlined$sortBy$1<T> implements Comparator {
    static {
        Covode.recordClassIndex(73167);
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return a.a(Integer.valueOf(((MusNotice) t).lowestPosition), Integer.valueOf(((MusNotice) t2).lowestPosition));
    }
}
