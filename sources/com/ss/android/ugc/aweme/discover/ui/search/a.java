package com.ss.android.ugc.aweme.discover.ui.search;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public static int f82639a = -1;

    /* renamed from: b  reason: collision with root package name */
    public static final a f82640b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final h f82641c = i.a((h.f.a.a) C1943a.f82642a);

    public interface b {
        static {
            Covode.recordClassIndex(51465);
        }

        void a(Aweme aweme, String str, String str2);
    }

    public static Map<Integer, WeakReference<b>> b() {
        return (Map) f82641c.getValue();
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.a$a  reason: collision with other inner class name */
    static final class C1943a extends m implements h.f.a.a<Map<Integer, WeakReference<b>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1943a f82642a = new C1943a();

        static {
            Covode.recordClassIndex(51464);
        }

        C1943a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<Integer, WeakReference<b>> invoke() {
            return new LinkedHashMap();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.c
    public final boolean a() {
        if (!b().isEmpty()) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(51463);
    }

    public static void a(b bVar) {
        l.d(bVar, "");
        Iterator<Map.Entry<Integer, WeakReference<b>>> it = b().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, WeakReference<b>> next = it.next();
            if (next.getValue().get() == bVar || next.getValue().get() == null) {
                it.remove();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.c
    public final void a(Aweme aweme, String str, String str2) {
        b bVar;
        l.d(aweme, "");
        l.d(str, "");
        l.d(str2, "");
        Iterator<Map.Entry<Integer, WeakReference<b>>> it = b().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, WeakReference<b>> next = it.next();
            if (next.getValue().get() == null) {
                it.remove();
            } else if (next.getKey().intValue() == f82639a && (bVar = next.getValue().get()) != null) {
                bVar.a(aweme, str, str2);
            }
        }
    }
}
