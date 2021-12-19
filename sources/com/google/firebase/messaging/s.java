package com.google.firebase.messaging;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Iterator;

/* access modifiers changed from: package-private */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final r f54631a;

    static {
        Covode.recordClassIndex(33899);
    }

    s(r rVar) {
        this.f54631a = rVar;
    }

    public final void run() {
        MethodCollector.i(5697);
        r rVar = this.f54631a;
        synchronized (rVar.f54628d) {
            try {
                SharedPreferences.Editor edit = rVar.f54625a.edit();
                String str = rVar.f54626b;
                StringBuilder sb = new StringBuilder();
                Iterator<String> it = rVar.f54628d.iterator();
                while (it.hasNext()) {
                    sb.append(it.next()).append(rVar.f54627c);
                }
                edit.putString(str, sb.toString()).commit();
            } finally {
                MethodCollector.o(5697);
            }
        }
    }
}
