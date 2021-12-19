package leakcanary;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import m.a;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final Set<h> f159379a = new LinkedHashSet();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, KeyedWeakReference> f159380b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final ReferenceQueue<Object> f159381c = new ReferenceQueue<>();

    /* renamed from: d  reason: collision with root package name */
    private final b f159382d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f159383e;

    /* renamed from: f  reason: collision with root package name */
    private final h.f.a.a<Boolean> f159384f;

    static {
        Covode.recordClassIndex(105819);
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f159385a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f159386b;

        static {
            Covode.recordClassIndex(105820);
        }

        a(g gVar, String str) {
            this.f159385a = gVar;
            this.f159386b = str;
        }

        public final void run() {
            this.f159385a.a(this.f159386b);
        }
    }

    private final void b() {
        while (true) {
            KeyedWeakReference keyedWeakReference = (KeyedWeakReference) this.f159381c.poll();
            if (keyedWeakReference != null) {
                this.f159380b.remove(keyedWeakReference.getKey());
            } else {
                return;
            }
        }
    }

    public final synchronized int a() {
        MethodCollector.i(5355);
        b();
        Map<String, KeyedWeakReference> map = this.f159380b;
        if (map.isEmpty()) {
            MethodCollector.o(5355);
            return 0;
        }
        int i2 = 0;
        for (Map.Entry<String, KeyedWeakReference> entry : map.entrySet()) {
            if (entry.getValue().getRetainedUptimeMillis() != -1) {
                i2++;
            }
        }
        MethodCollector.o(5355);
        return i2;
    }

    public final synchronized void a(Object obj) {
        MethodCollector.i(5364);
        l.c(obj, "");
        a(obj, "");
        MethodCollector.o(5364);
    }

    public final synchronized void a(String str) {
        MethodCollector.i(5511);
        b();
        KeyedWeakReference keyedWeakReference = this.f159380b.get(str);
        if (keyedWeakReference != null) {
            keyedWeakReference.setRetainedUptimeMillis(this.f159382d.a());
            Iterator<T> it = this.f159379a.iterator();
            while (it.hasNext()) {
                it.next().onObjectRetained();
            }
        }
        MethodCollector.o(5511);
    }

    public final synchronized void b(Object obj) {
        MethodCollector.i(5489);
        l.c(obj, "");
        Map<String, KeyedWeakReference> map = this.f159380b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, KeyedWeakReference> entry : map.entrySet()) {
            Object obj2 = entry.getValue().get();
            if (obj2 != null && l.a(obj2, obj)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (String str : linkedHashMap.keySet()) {
            this.f159380b.remove(str);
        }
        MethodCollector.o(5489);
    }

    public final synchronized void a(long j2) {
        MethodCollector.i(5504);
        Map<String, KeyedWeakReference> map = this.f159380b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, KeyedWeakReference> entry : map.entrySet()) {
            if (entry.getValue().getWatchUptimeMillis() <= j2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (KeyedWeakReference keyedWeakReference : linkedHashMap.values()) {
            keyedWeakReference.clear();
        }
        this.f159380b.keySet().removeAll(linkedHashMap.keySet());
        MethodCollector.o(5504);
    }

    public final synchronized void a(h hVar) {
        MethodCollector.i(5357);
        l.c(hVar, "");
        this.f159379a.add(hVar);
        MethodCollector.o(5357);
    }

    private synchronized void a(Object obj, String str) {
        String str2;
        String str3;
        MethodCollector.i(5381);
        l.c(obj, "");
        l.c(str, "");
        if (!this.f159384f.invoke().booleanValue()) {
            MethodCollector.o(5381);
            return;
        }
        b();
        String uuid = UUID.randomUUID().toString();
        l.a((Object) uuid, "");
        KeyedWeakReference keyedWeakReference = new KeyedWeakReference(obj, uuid, str, this.f159382d.a(), this.f159381c);
        a.AbstractC4200a aVar = m.a.f159491a;
        if (aVar != null) {
            StringBuilder sb = new StringBuilder("Watching ");
            if (obj instanceof Class) {
                str2 = obj.toString();
            } else {
                str2 = "instance of " + obj.getClass().getName();
            }
            StringBuilder append = sb.append(str2);
            if (str.length() > 0) {
                str3 = " named ".concat(String.valueOf(str));
            } else {
                str3 = "";
            }
            aVar.a(append.append(str3).append(" with key ").append(uuid).toString());
        }
        this.f159380b.put(uuid, keyedWeakReference);
        this.f159383e.execute(new a(this, uuid));
        MethodCollector.o(5381);
    }

    public g(b bVar, Executor executor, h.f.a.a<Boolean> aVar) {
        l.c(bVar, "");
        l.c(executor, "");
        l.c(aVar, "");
        this.f159382d = bVar;
        this.f159383e = executor;
        this.f159384f = aVar;
    }
}
