package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Iterator;

/* access modifiers changed from: package-private */
public final /* synthetic */ class cc implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final cd f50735a;

    static {
        Covode.recordClassIndex(31696);
    }

    cc(cd cdVar) {
        this.f50735a = cdVar;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        MethodCollector.i(8564);
        cd cdVar = this.f50735a;
        synchronized (cdVar.f50737a) {
            try {
                cdVar.f50738b = null;
                br.f50719c.incrementAndGet();
            } finally {
                MethodCollector.o(8564);
            }
        }
        synchronized (cdVar) {
            try {
                Iterator<Object> it = cdVar.f50739c.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } finally {
                MethodCollector.o(8564);
            }
        }
    }
}
