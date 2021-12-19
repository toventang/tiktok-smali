package com.ss.android.ugc.aweme.im.sdk.common.controller.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.o;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.h;
import com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.c;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f102404a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static o f102405b = new a();

    public static final class a implements o {
        static {
            Covode.recordClassIndex(65553);
        }

        a() {
        }

        @Override // com.bytedance.im.core.a.o
        public final long a(h hVar) {
            long j2 = 0;
            if (hVar == null) {
                return 0;
            }
            ai lastMessage = hVar.getLastMessage();
            if (lastMessage != null) {
                j2 = lastMessage.getCreatedAt();
            }
            if (hVar.isStickTop()) {
                j2 = h.j.h.a(j2, hVar.getUpdatedTime());
            }
            if (j2 < 10000000000L) {
                j2 *= 1000;
            }
            long a2 = h.j.h.a(c.b(hVar), j2);
            int a3 = z.a(hVar);
            double pow = Math.pow(10.0d, 13.0d);
            double d2 = (double) a3;
            Double.isNaN(d2);
            double d3 = pow * d2;
            double d4 = (double) a2;
            Double.isNaN(d4);
            return (long) (d3 + d4);
        }
    }

    private d() {
    }

    static {
        Covode.recordClassIndex(65552);
    }
}
