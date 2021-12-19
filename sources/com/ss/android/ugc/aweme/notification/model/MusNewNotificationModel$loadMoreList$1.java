package com.ss.android.ugc.aweme.notification.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import java.util.List;
import java.util.concurrent.Callable;

final class MusNewNotificationModel$loadMoreList$1<V> implements Callable {
    final /* synthetic */ List $notices;

    static {
        Covode.recordClassIndex(73163);
    }

    MusNewNotificationModel$loadMoreList$1(List list) {
        this.$notices = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return MusNotificationApiManager.a(this.$notices);
    }
}
