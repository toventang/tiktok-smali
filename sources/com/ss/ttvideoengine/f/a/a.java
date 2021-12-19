package com.ss.ttvideoengine.f.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.mediakit.fetcher.AVMDLNewFetcherMakerInterface;
import com.ss.mediakit.fetcher.AVMDLURLFetcherInterface;
import com.ss.ttvideoengine.s.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a implements AVMDLNewFetcherMakerInterface {

    /* renamed from: a  reason: collision with root package name */
    private static final List<WeakReference<b>> f152513a = new ArrayList();

    static {
        Covode.recordClassIndex(101568);
    }

    private static synchronized b a(String str) {
        synchronized (a.class) {
            MethodCollector.i(13789);
            for (WeakReference<b> weakReference : f152513a) {
                b bVar = weakReference.get();
                if (bVar != null && TextUtils.equals(str, bVar.a())) {
                    MethodCollector.o(13789);
                    return bVar;
                }
            }
            MethodCollector.o(13789);
            return null;
        }
    }

    public static synchronized void a(b bVar) {
        synchronized (a.class) {
            MethodCollector.i(13734);
            if (bVar == null) {
                j.a("FetcherMakerNew", "storeListener fetcherListener is null");
                MethodCollector.o(13734);
                return;
            }
            j.a("FetcherMakerNew", "storeListener ".concat(String.valueOf(bVar)));
            f152513a.add(new WeakReference<>(bVar));
            MethodCollector.o(13734);
        }
    }

    public static synchronized void b(b bVar) {
        synchronized (a.class) {
            MethodCollector.i(13787);
            if (bVar == null) {
                j.a("FetcherMakerNew", "removeListener fetcherListener is null");
                MethodCollector.o(13787);
                return;
            }
            j.a("FetcherMakerNew", "removeListener ".concat(String.valueOf(bVar)));
            Iterator<WeakReference<b>> it = f152513a.iterator();
            while (it.hasNext()) {
                WeakReference<b> next = it.next();
                if (next == null || next.get() == null) {
                    it.remove();
                } else if (next.get() == bVar) {
                    it.remove();
                }
            }
            MethodCollector.o(13787);
        }
    }

    @Override // com.ss.mediakit.fetcher.AVMDLNewFetcherMakerInterface
    public final AVMDLURLFetcherInterface getFetcher(String str, String str2, String str3, String str4) {
        j.a("FetcherMakerNew", "getFetcher rawKey " + str + ", fileKey " + str2 + ", engineId " + str4);
        b a2 = a(str4);
        if (a2 == null) {
            j.e("FetcherMakerNew", "getFetcher MDLFetcherListener is null");
            return null;
        }
        c cVar = new c(a2);
        j.a("FetcherMakerNew", "return fetcher to mdl ".concat(String.valueOf(cVar)));
        return cVar;
    }
}
