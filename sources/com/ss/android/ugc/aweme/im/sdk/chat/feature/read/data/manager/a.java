package com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.manager;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.h;
import com.ss.android.ugc.aweme.im.sdk.common.controller.b.c;
import h.f.b.l;

public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final C2503a f100932e = new C2503a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public ai f100933a;

    /* renamed from: b  reason: collision with root package name */
    public int f100934b = -1;

    /* renamed from: c  reason: collision with root package name */
    boolean f100935c;

    /* renamed from: d  reason: collision with root package name */
    public final h f100936d;

    /* renamed from: f  reason: collision with root package name */
    private ai f100937f;

    static {
        Covode.recordClassIndex(64566);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.manager.a$a  reason: collision with other inner class name */
    public static final class C2503a {
        static {
            Covode.recordClassIndex(64567);
        }

        private C2503a() {
        }

        public /* synthetic */ C2503a(byte b2) {
            this();
        }
    }

    public final void a() {
        Long l2;
        ai aiVar = this.f100933a;
        if (aiVar == null || l.a(this.f100937f, aiVar)) {
            StringBuilder sb = new StringBuilder("reportMessageReply lastReportMessage has been replied: ");
            ai aiVar2 = this.f100933a;
            Long l3 = null;
            if (aiVar2 != null) {
                l2 = Long.valueOf(aiVar2.getMsgId());
            } else {
                l2 = null;
            }
            StringBuilder append = sb.append(l2).append(", ");
            ai aiVar3 = this.f100937f;
            if (aiVar3 != null) {
                l3 = Long.valueOf(aiVar3.getMsgId());
            }
            com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateReporter", append.append(l3).toString());
            return;
        }
        this.f100937f = this.f100933a;
        a("replied");
    }

    public a(h hVar) {
        l.d(hVar, "");
        this.f100936d = hVar;
    }

    public final void a(String str) {
        com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateReporter", "reportReadStateInternal: ".concat(String.valueOf(str)));
        c.a(this.f100936d, str);
    }
}
