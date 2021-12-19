package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Iterator;

final class bg extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ be f50707a;

    static {
        Covode.recordClassIndex(31673);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    bg(be beVar) {
        super(null);
        this.f50707a = beVar;
    }

    public final void onChange(boolean z) {
        MethodCollector.i(7643);
        be beVar = this.f50707a;
        synchronized (beVar.f50699a) {
            try {
                beVar.f50700b = null;
                br.f50719c.incrementAndGet();
            } finally {
                MethodCollector.o(7643);
            }
        }
        synchronized (beVar) {
            try {
                Iterator<Object> it = beVar.f50701c.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } finally {
                MethodCollector.o(7643);
            }
        }
    }
}
