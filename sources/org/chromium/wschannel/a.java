package org.chromium.wschannel;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

public class a extends Observable {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f159766a;

    static {
        Covode.recordClassIndex(106452);
    }

    public static a a() {
        MethodCollector.i(11361);
        if (f159766a == null) {
            synchronized (a.class) {
                try {
                    if (f159766a == null) {
                        f159766a = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11361);
                    throw th;
                }
            }
        }
        a aVar = f159766a;
        MethodCollector.o(11361);
        return aVar;
    }

    private void a(Map<String, Object> map) {
        setChanged();
        notifyObservers(map);
    }

    public final void a(String str, long j2, long j3, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("sent_bytes", Long.valueOf(j2));
        hashMap.put("received_bytes", Long.valueOf(j3));
        hashMap.put("is_heartbeat_frame", Boolean.valueOf(z));
        a(hashMap);
    }
}
