package com.ss.android.ugc.aweme.im.sdk.chat.feature.a.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.im.core.api.b.e;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.t;
import com.ss.android.ugc.aweme.im.service.c.d;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public c.a f100332a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f100333b;

    /* renamed from: c  reason: collision with root package name */
    public ai f100334c;

    static {
        Covode.recordClassIndex(64102);
    }

    public final void a() {
        ai aiVar = this.f100334c;
        if (aiVar != null) {
            t.a(aiVar, (b<ai>) null);
            this.f100334c = null;
        }
    }

    public final synchronized void a(e eVar, boolean z) {
        T t;
        MethodCollector.i(5659);
        l.d(eVar, "");
        if (!d.b() || this.f100333b) {
            MethodCollector.o(5659);
            return;
        }
        List<ai> i2 = eVar.i();
        if (i2.size() > 5) {
            this.f100333b = true;
            MethodCollector.o(5659);
            return;
        }
        Iterator<T> it = i2.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.getMsgType() == 15) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null || z) {
            this.f100334c = t2;
            this.f100333b = true;
        }
        if (!(this.f100334c == null || this.f100332a == null)) {
            c.a aVar = this.f100332a;
            if (aVar == null) {
                l.a("onSayHiMessageDetected");
            }
            aVar.a(this.f100334c);
        }
        MethodCollector.o(5659);
    }
}
