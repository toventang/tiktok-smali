package com.bytedance.frameworks.baselib.network.http.d.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.d.a.a.b;
import com.bytedance.frameworks.baselib.network.http.d.a.a.e;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.Dns;

public class i implements Dns {

    /* renamed from: c  reason: collision with root package name */
    private static volatile i f29242c;

    /* renamed from: a  reason: collision with root package name */
    ConcurrentMap<String, CopyOnWriteArrayList<k>> f29243a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final String f29244b = i.class.getSimpleName();

    static {
        Covode.recordClassIndex(17083);
    }

    public static i a() {
        MethodCollector.i(5789);
        if (f29242c == null) {
            synchronized (i.class) {
                try {
                    if (f29242c == null) {
                        f29242c = new i();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5789);
                    throw th;
                }
            }
        }
        i iVar = f29242c;
        MethodCollector.o(5789);
        return iVar;
    }

    @Override // okhttp3.Dns
    public List<InetAddress> lookup(String str) {
        b a2 = e.a().a(str);
        if (a2 == null || (a2.ipv4List.isEmpty() && a2.ipv6List.isEmpty())) {
            return Dns.SYSTEM.lookup(str);
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : a2.ipv6List) {
            arrayList.add(InetAddress.getByName(str2));
        }
        for (String str3 : a2.ipv4List) {
            arrayList.add(InetAddress.getByName(str3));
        }
        if (this.f29243a.containsKey(str)) {
            Iterator<k> it = this.f29243a.get(str).iterator();
            while (it.hasNext()) {
                k next = it.next();
                if (next.U.isEmpty() && next.T == b.a.UNKNOWN) {
                    next.T = a2.source;
                    next.U.addAll(a2.ipv6List);
                    next.U.addAll(a2.ipv4List);
                }
            }
        }
        return arrayList;
    }
}
