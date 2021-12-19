package com.ss.android.ugc.aweme.im.sdk.chat.b.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.e;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.ReadStateViewModel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.a.c;
import com.ss.android.ugc.aweme.lego.p;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static e f100120a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f100121b = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(63819);
    }

    public static boolean a() {
        if (com.bytedance.ies.abmock.b.a().a(true, "im_preload_strategy", 0) == 1) {
            return true;
        }
        return false;
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.im.service.model.a f100122a;

        static {
            Covode.recordClassIndex(63820);
        }

        a(com.ss.android.ugc.aweme.im.service.model.a aVar) {
            this.f100122a = aVar;
        }

        public final void run() {
            com.ss.android.ugc.aweme.im.service.m.a.b("ImPreloadHelper", "create messageModel begin");
            String sessionId = this.f100122a.getSessionId();
            if (sessionId != null && sessionId.length() > 0) {
                String sessionId2 = this.f100122a.getSessionId();
                if (sessionId2 == null) {
                    l.b();
                }
                e a2 = e.a.a(sessionId2, ReadStateViewModel.f100939b);
                b.f100120a = a2;
                if (a2 != null) {
                    a2.f();
                }
            }
            com.ss.android.ugc.aweme.im.service.m.a.b("ImPreloadHelper", "create messageModel end");
        }
    }

    public static void a(com.ss.android.ugc.aweme.im.service.model.a aVar) {
        l.d(aVar, "");
        if (c.a()) {
            p.f107614a.post(new a(aVar));
        }
    }
}
