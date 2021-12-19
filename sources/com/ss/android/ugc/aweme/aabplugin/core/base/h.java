package com.ss.android.ugc.aweme.aabplugin.core.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import f.a.d.f;

final /* synthetic */ class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f62487a;

    static {
        Covode.recordClassIndex(38453);
    }

    h(a aVar) {
        this.f62487a = aVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        MethodCollector.i(10149);
        synchronized (a.class) {
            try {
                if (a.f62459a && a.f62461c != null) {
                    d.a().unregisterReceiver(a.f62461c);
                    a.f62459a = false;
                }
            } finally {
                MethodCollector.o(10149);
            }
        }
    }
}
