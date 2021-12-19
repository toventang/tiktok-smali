package com.ss.android.ugc.aweme.global.config.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.f;
import com.ss.android.ugc.aweme.global.config.settings.a;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.utils.dw;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* access modifiers changed from: package-private */
public class b {

    /* renamed from: a  reason: collision with root package name */
    final Object f99073a = new Object();

    /* renamed from: b  reason: collision with root package name */
    final CopyOnWriteArrayList<a> f99074b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public IESSettingsProxy f99075c;

    /* renamed from: d  reason: collision with root package name */
    f f99076d = dw.a().b();

    static {
        Covode.recordClassIndex(63003);
    }

    b() {
        a();
    }

    public final void a() {
        MethodCollector.i(4456);
        synchronized (this.f99073a) {
            try {
                this.f99075c = new IESSettingsProxy();
                Iterator<a> it = this.f99074b.iterator();
                while (it.hasNext()) {
                    a next = it.next();
                    next.a(this.f99075c);
                    if (next instanceof a.C2416a) {
                        this.f99074b.remove(next);
                    }
                }
            } finally {
                MethodCollector.o(4456);
            }
        }
    }
}
