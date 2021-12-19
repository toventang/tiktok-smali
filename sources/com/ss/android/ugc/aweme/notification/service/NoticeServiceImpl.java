package com.ss.android.ugc.aweme.notification.service;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.inbox.b.b;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.ss.android.ugc.aweme.notification.MusNewNotificationFragment;
import com.ss.android.ugc.aweme.notification.d.c;
import com.ss.android.ugc.aweme.notification.e.a;
import com.ss.android.ugc.aweme.notification.e.c;
import com.ss.android.ugc.aweme.notification.e.d;
import com.ss.android.ugc.aweme.notification.followrequest.api.FollowRequestApiManager;
import com.ss.android.ugc.aweme.notification.followrequest.model.ApproveResponse;
import com.ss.android.ugc.aweme.notification.followrequest.model.RejectResponse;
import com.ss.android.ugc.aweme.notification.utils.h;
import com.ss.android.ugc.aweme.notification.utils.i;
import com.ss.android.ugc.aweme.notification.utils.n;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class NoticeServiceImpl implements INoticeService {
    static {
        Covode.recordClassIndex(73200);
    }

    public static final class a implements com.ss.android.ugc.aweme.notice.api.services.a {
        static {
            Covode.recordClassIndex(73201);
        }

        a() {
        }

        @Override // com.ss.android.ugc.aweme.notice.api.services.a
        public final Aweme a(String str) {
            l.d(str, "");
            l.d(str, "");
            return null;
        }

        @Override // com.ss.android.ugc.aweme.notice.api.services.a
        public final void a(Aweme aweme) {
            l.d(aweme, "");
            l.d(aweme, "");
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void c() {
        d.b(c.a.C2897a.f113333a);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void d() {
        d.a(a.j.f113391a);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final com.ss.android.ugc.aweme.notice.api.services.a b() {
        c.HandlerC2905c b2 = com.ss.android.ugc.aweme.notification.e.c.b();
        if (b2 != null) {
            return b2;
        }
        return new a();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final <T extends com.ss.android.ugc.aweme.base.f.a> Class<? extends T> a() {
        if (b.b()) {
            return com.ss.android.ugc.aweme.inbox.l.class;
        }
        if (!com.ss.android.ugc.aweme.notice.api.ab.a.b() || b.a() != 0) {
            return MusNewNotificationFragment.class;
        }
        return com.ss.android.ugc.aweme.notification.c.class;
    }

    public static INoticeService f() {
        MethodCollector.i(329);
        Object a2 = com.ss.android.ugc.b.a(INoticeService.class, false);
        if (a2 != null) {
            INoticeService iNoticeService = (INoticeService) a2;
            MethodCollector.o(329);
            return iNoticeService;
        }
        if (com.ss.android.ugc.b.cX == null) {
            synchronized (INoticeService.class) {
                try {
                    if (com.ss.android.ugc.b.cX == null) {
                        com.ss.android.ugc.b.cX = new NoticeServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(329);
                    throw th;
                }
            }
        }
        NoticeServiceImpl noticeServiceImpl = (NoticeServiceImpl) com.ss.android.ugc.b.cX;
        MethodCollector.o(329);
        return noticeServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final int e() {
        if (!com.ss.android.ugc.aweme.notice.api.ab.a.b()) {
            return 0;
        }
        if (a.f.a().f113377d) {
            return 4;
        }
        if (a.f.a().f113378e) {
            return 3;
        }
        if (a.f.a().f113379f) {
            return 2;
        }
        if (a.f.a().f113376c) {
            return 1;
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final String a(User user) {
        return i.a(null, user);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void a(int i2) {
        d.a(new a.k(i2));
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean b(BaseResponse baseResponse) {
        l.d(baseResponse, "");
        if (!(baseResponse instanceof RejectResponse) || ((RejectResponse) baseResponse).reject_status != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d0 A[Catch:{ Exception -> 0x00f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r13) {
        /*
        // Method dump skipped, instructions count: 253
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.service.NoticeServiceImpl.a(android.content.Context):void");
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean a(BaseResponse baseResponse) {
        l.d(baseResponse, "");
        if (!(baseResponse instanceof ApproveResponse) || ((ApproveResponse) baseResponse).approve_status != 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void a(Bundle bundle, int i2) {
        n.a(bundle, i2);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void b(Handler handler, String str) {
        l.d(handler, "");
        l.d(str, "");
        FollowRequestApiManager.a(handler, str);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void a(Handler handler, String str) {
        l.d(handler, "");
        l.d(str, "");
        FollowRequestApiManager.a(handler, str, 0);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean a(Context context, User user, String str, String str2, boolean z) {
        return h.a(context, user, str, str2, null, z, 16);
    }
}
