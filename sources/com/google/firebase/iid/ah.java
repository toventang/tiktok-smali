package com.google.firebase.iid;

import android.util.Log;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.c.h;
import java.util.Map;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public class ah {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f54397a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Pair<String, String>, h<v>> f54398b = new androidx.c.a();

    /* access modifiers changed from: package-private */
    public interface a {
        static {
            Covode.recordClassIndex(33776);
        }

        h<v> a();
    }

    static {
        Covode.recordClassIndex(33775);
    }

    ah(Executor executor) {
        this.f54397a = executor;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ h a(Pair pair, h hVar) {
        MethodCollector.i(13103);
        synchronized (this) {
            try {
                this.f54398b.remove(pair);
            } finally {
                MethodCollector.o(13103);
            }
        }
        return hVar;
    }

    /* access modifiers changed from: package-private */
    public final synchronized h<v> a(String str, String str2, a aVar) {
        MethodCollector.i(13102);
        Pair<String, String> pair = new Pair<>(str, str2);
        h<v> hVar = this.f54398b.get(pair);
        if (hVar != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String.valueOf(String.valueOf(pair)).length();
            }
            MethodCollector.o(13102);
            return hVar;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String.valueOf(String.valueOf(pair)).length();
        }
        h<TContinuationResult> b2 = aVar.a().b(this.f54397a, new ai(this, pair));
        this.f54398b.put(pair, b2);
        MethodCollector.o(13102);
        return b2;
    }
}
