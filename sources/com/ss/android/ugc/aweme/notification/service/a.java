package com.ss.android.ugc.aweme.notification.service;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2916a f113831a = new C2916a((byte) 0);

    static {
        Covode.recordClassIndex(73203);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.service.a$a  reason: collision with other inner class name */
    public static final class C2916a {
        static {
            Covode.recordClassIndex(73204);
        }

        private C2916a() {
        }

        public static IIMService a() {
            IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
            l.b(createIIMServicebyMonsterPlugin, "");
            return createIIMServicebyMonsterPlugin;
        }

        public /* synthetic */ C2916a(byte b2) {
            this();
        }
    }
}
