package com.ss.android.ugc.aweme.notification.service;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.notice.api.bean.c;
import com.ss.android.ugc.aweme.notice.api.count.OldRedPointService;
import com.ss.android.ugc.aweme.notice.api.count.RedPointService;
import com.ss.android.ugc.aweme.notification.redpoint.h;
import com.ss.android.ugc.b;

public class RedPointServiceImpl implements OldRedPointService, RedPointService {

    /* renamed from: a  reason: collision with root package name */
    private final RedPointService f113830a = h.b();

    static {
        Covode.recordClassIndex(73202);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.RedPointService, com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final void a() {
        this.f113830a.a();
    }

    public static OldRedPointService b() {
        MethodCollector.i(788);
        Object a2 = b.a(OldRedPointService.class, false);
        if (a2 != null) {
            OldRedPointService oldRedPointService = (OldRedPointService) a2;
            MethodCollector.o(788);
            return oldRedPointService;
        }
        if (b.cY == null) {
            synchronized (OldRedPointService.class) {
                try {
                    if (b.cY == null) {
                        b.cY = new RedPointServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(788);
                    throw th;
                }
            }
        }
        RedPointServiceImpl redPointServiceImpl = (RedPointServiceImpl) b.cY;
        MethodCollector.o(788);
        return redPointServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.RedPointService, com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final int a(int i2) {
        return this.f113830a.a(i2);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.RedPointService, com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final int b(int i2) {
        return this.f113830a.b(i2);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.RedPointService, com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final void a(Message message) {
        this.f113830a.a(message);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.RedPointService, com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final void a(boolean z) {
        this.f113830a.a(z);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.RedPointService, com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final void a(int i2, int i3) {
        this.f113830a.a(i2, i3);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.RedPointService, com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final void a(int i2, c cVar) {
        this.f113830a.a(i2, cVar);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.RedPointService, com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final void a(boolean z, int i2) {
        this.f113830a.a(z, i2);
    }
}
