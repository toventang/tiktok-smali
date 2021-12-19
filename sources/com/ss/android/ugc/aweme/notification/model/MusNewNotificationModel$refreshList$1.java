package com.ss.android.ugc.aweme.notification.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notice.api.a;
import com.ss.android.ugc.aweme.notification.ab.f;
import com.ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import java.util.List;
import java.util.concurrent.Callable;

final class MusNewNotificationModel$refreshList$1<V> implements Callable {
    final /* synthetic */ int $noticeGroup;
    final /* synthetic */ List $notices;
    final /* synthetic */ MusNewNotificationModel this$0;

    static {
        Covode.recordClassIndex(73164);
    }

    MusNewNotificationModel$refreshList$1(MusNewNotificationModel musNewNotificationModel, int i2, List list) {
        this.this$0 = musNewNotificationModel;
        this.$noticeGroup = i2;
        this.$notices = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if ((f.a() && this.$noticeGroup == 37) || this.$noticeGroup == 599) {
            return MusNotificationApiManager.a(this.$notices, this.$noticeGroup);
        }
        if (this.$noticeGroup == a.b.a()) {
            return MusNotificationApiManager.a(this.$notices, this.this$0.liveData);
        }
        return MusNotificationApiManager.a(this.$notices);
    }
}
