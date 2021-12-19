package com.ss.android.ugc.aweme.notification.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notification.vm.NotificationDetailVM;
import h.f.b.l;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public NotificationDetailVM f113045a;

    static {
        Covode.recordClassIndex(72686);
    }

    public f a() {
        return null;
    }

    public final NotificationDetailVM b() {
        NotificationDetailVM notificationDetailVM = this.f113045a;
        if (notificationDetailVM == null) {
            l.a("detailVM");
        }
        return notificationDetailVM;
    }

    public final void a(NotificationDetailVM notificationDetailVM) {
        l.d(notificationDetailVM, "");
        this.f113045a = notificationDetailVM;
    }
}
