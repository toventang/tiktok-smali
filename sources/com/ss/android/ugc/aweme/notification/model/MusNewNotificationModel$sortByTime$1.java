package com.ss.android.ugc.aweme.notification.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.Comparator;

/* access modifiers changed from: package-private */
public final class MusNewNotificationModel$sortByTime$1<T> implements Comparator {
    public static final MusNewNotificationModel$sortByTime$1 INSTANCE = new MusNewNotificationModel$sortByTime$1();

    static {
        Covode.recordClassIndex(73165);
    }

    MusNewNotificationModel$sortByTime$1() {
    }

    public final int compare(MusNotice musNotice, MusNotice musNotice2) {
        long j2 = musNotice2.createTime - musNotice.createTime;
        if (j2 > 0) {
            return 1;
        }
        if (j2 < 0) {
            return -1;
        }
        return 0;
    }
}
