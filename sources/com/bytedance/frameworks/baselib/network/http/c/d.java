package com.bytedance.frameworks.baselib.network.http.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<URI, List<e>> f28958a = new HashMap();

    static {
        Covode.recordClassIndex(16994);
    }

    private static URI b(URI uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URI("http", uri.getHost(), null, null);
        } catch (URISyntaxException unused) {
            return uri;
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.c.c
    public final synchronized List<e> a(URI uri) {
        List<e> unmodifiableList;
        MethodCollector.i(2023);
        if (uri != null) {
            ArrayList arrayList = new ArrayList();
            List<e> list = this.f28958a.get(uri);
            if (list != null) {
                Iterator<e> it = list.iterator();
                while (it.hasNext()) {
                    e next = it.next();
                    if (next.a()) {
                        it.remove();
                    } else {
                        arrayList.add(next);
                    }
                }
            }
            for (Map.Entry<URI, List<e>> entry : this.f28958a.entrySet()) {
                if (!uri.equals(entry.getKey())) {
                    Iterator<e> it2 = entry.getValue().iterator();
                    while (it2.hasNext()) {
                        e next2 = it2.next();
                        if (e.a(next2.f28963d, uri.getHost())) {
                            if (next2.a()) {
                                it2.remove();
                            } else if (!arrayList.contains(next2)) {
                                arrayList.add(next2);
                            }
                        }
                    }
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
            MethodCollector.o(2023);
        } else {
            NullPointerException nullPointerException = new NullPointerException("uri == null");
            MethodCollector.o(2023);
            throw nullPointerException;
        }
        return unmodifiableList;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.c.c
    public final synchronized void a(URI uri, e eVar) {
        MethodCollector.i(2013);
        if (eVar != null) {
            URI b2 = b(uri);
            List<e> list = this.f28958a.get(b2);
            if (list == null) {
                list = new ArrayList<>();
                this.f28958a.put(b2, list);
            } else {
                list.remove(eVar);
            }
            list.add(eVar);
            MethodCollector.o(2013);
        } else {
            NullPointerException nullPointerException = new NullPointerException("cookie == null");
            MethodCollector.o(2013);
            throw nullPointerException;
        }
    }
}
