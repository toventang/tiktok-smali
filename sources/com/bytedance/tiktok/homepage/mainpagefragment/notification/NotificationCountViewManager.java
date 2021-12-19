package com.bytedance.tiktok.homepage.mainpagefragment.notification;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.discover.tooltip.NotificationCountViewService;
import com.ss.android.ugc.b;

public final class NotificationCountViewManager {

    /* renamed from: a  reason: collision with root package name */
    public static a f44360a;

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f44361b = new Companion((byte) 0);

    static {
        Covode.recordClassIndex(27172);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(27173);
        }

        private Companion() {
        }

        public static final class NotificationCountViewServiceImpl implements NotificationCountViewService {
            static {
                Covode.recordClassIndex(27174);
            }

            @Override // com.ss.android.ugc.aweme.discover.tooltip.NotificationCountViewService
            public final void a() {
                a aVar = NotificationCountViewManager.f44360a;
                if (aVar != null) {
                    aVar.a();
                }
            }

            @Override // com.ss.android.ugc.aweme.discover.tooltip.NotificationCountViewService
            public final void b() {
                a aVar = NotificationCountViewManager.f44360a;
                if (aVar != null) {
                    aVar.b();
                }
            }

            @Override // com.ss.android.ugc.aweme.discover.tooltip.NotificationCountViewService
            public final void c() {
                a aVar = NotificationCountViewManager.f44360a;
                if (aVar != null) {
                    aVar.c();
                }
            }

            public static NotificationCountViewService d() {
                MethodCollector.i(3574);
                Object a2 = b.a(NotificationCountViewService.class, false);
                if (a2 != null) {
                    NotificationCountViewService notificationCountViewService = (NotificationCountViewService) a2;
                    MethodCollector.o(3574);
                    return notificationCountViewService;
                }
                if (b.f145532g == null) {
                    synchronized (NotificationCountViewService.class) {
                        try {
                            if (b.f145532g == null) {
                                b.f145532g = new NotificationCountViewServiceImpl();
                            }
                        } catch (Throwable th) {
                            MethodCollector.o(3574);
                            throw th;
                        }
                    }
                }
                NotificationCountViewServiceImpl notificationCountViewServiceImpl = (NotificationCountViewServiceImpl) b.f145532g;
                MethodCollector.o(3574);
                return notificationCountViewServiceImpl;
            }
        }

        public /* synthetic */ Companion(byte b2) {
            this();
        }
    }
}
