package com.ss.android.ugc.aweme.notification.service;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.notice.api.count.NoticeCountService;
import com.ss.android.ugc.aweme.notice.api.count.OldRedPointService;
import com.ss.android.ugc.aweme.notification.redpoint.c;
import com.ss.android.ugc.aweme.notification.redpoint.f;
import com.ss.android.ugc.aweme.notification.redpoint.g;
import com.ss.android.ugc.aweme.utils.cg;
import com.ss.android.ugc.b;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class NoticeCountServiceImpl implements NoticeCountService {

    /* renamed from: b  reason: collision with root package name */
    private final h f113828b = i.a((h.f.a.a) a.f113829a);

    static {
        Covode.recordClassIndex(73198);
    }

    private final OldRedPointService e() {
        return (OldRedPointService) this.f113828b.getValue();
    }

    static final class a extends m implements h.f.a.a<OldRedPointService> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f113829a = new a();

        static {
            Covode.recordClassIndex(73199);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ OldRedPointService invoke() {
            return RedPointServiceImpl.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.NoticeCountService
    public final void b() {
        e().a();
    }

    public static NoticeCountService d() {
        MethodCollector.i(2747);
        Object a2 = b.a(NoticeCountService.class, false);
        if (a2 != null) {
            NoticeCountService noticeCountService = (NoticeCountService) a2;
            MethodCollector.o(2747);
            return noticeCountService;
        }
        if (b.cW == null) {
            synchronized (NoticeCountService.class) {
                try {
                    if (b.cW == null) {
                        b.cW = new NoticeCountServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2747);
                    throw th;
                }
            }
        }
        NoticeCountServiceImpl noticeCountServiceImpl = (NoticeCountServiceImpl) b.cW;
        MethodCollector.o(2747);
        return noticeCountServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.NoticeCountService
    public final void a() {
        if (com.ss.android.ugc.aweme.notice.api.ab.b.b()) {
            cg.a(com.ss.android.ugc.aweme.notification.redpoint.a.f113788b);
            IMService.createIIMServicebyMonsterPlugin(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.NoticeCountService
    public final Map<Integer, Integer> c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Number> g2 = n.g((Collection) f.b());
        com.ss.android.ugc.aweme.inbox.a.a.a(g2);
        for (Number number : g2) {
            int intValue = number.intValue();
            int a2 = com.ss.android.ugc.aweme.notice.api.b.a(intValue);
            if (a2 != 0) {
                linkedHashMap.put(Integer.valueOf(intValue), Integer.valueOf(a2));
            }
        }
        linkedHashMap.put(99, Integer.valueOf(g.c()));
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.NoticeCountService
    public final int a(int i2) {
        return e().a(i2);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.NoticeCountService
    public final int b(int i2) {
        return e().b(i2);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.NoticeCountService
    public final int a(String str) {
        l.d(str, "");
        return c.a().a(str);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.NoticeCountService
    public final void a(Message message) {
        l.d(message, "");
        e().a(message);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.NoticeCountService
    public final void a(boolean z) {
        e().a(z);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.NoticeCountService
    public final void a(int i2, int i3) {
        e().a(i2, i3);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.NoticeCountService
    public final void a(com.ss.android.ugc.aweme.notice.api.bean.c cVar, int... iArr) {
        l.d(iArr, "");
        for (int i2 : iArr) {
            e().a(i2, cVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.NoticeCountService
    public final void a(List<String> list, String str) {
        l.d(list, "");
        l.d(str, "");
        c.a().a(list, str);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.NoticeCountService
    public final void a(boolean z, int i2) {
        e().a(z, i2);
    }
}
