package com.ss.android.ugc.aweme.specact.pendant.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.service.d;
import com.ss.android.ugc.aweme.specact.pendant.c.d.c;
import com.ss.android.ugc.aweme.specact.pendant.c.e.a;
import com.ss.android.ugc.aweme.specact.popup.a.k;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ArrayList<c> f134128a = n.d(new c(), new com.ss.android.ugc.aweme.specact.pendant.c.b.b(), new a(), new com.ss.android.ugc.aweme.specact.pendant.c.d.a(), new com.ss.android.ugc.aweme.specact.pendant.c.a.a.b(), new com.ss.android.ugc.aweme.specact.pendant.c.c.b());

    /* renamed from: b  reason: collision with root package name */
    public static int f134129b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f134130c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f134131d;

    /* renamed from: e  reason: collision with root package name */
    public static final b f134132e = new b();

    /* renamed from: f  reason: collision with root package name */
    private static d f134133f;

    private b() {
    }

    static {
        Covode.recordClassIndex(87730);
    }

    public static void a(k.c cVar) {
        Iterator<c> it = f134128a.iterator();
        while (it.hasNext()) {
            it.next().a(cVar);
        }
    }

    public static void a(String str) {
        l.d(str, "");
        if (com.ss.android.ugc.aweme.local_test.a.a()) {
            if (f134133f == null) {
                Object service = ServiceManager.get().getService(LocalTestApi.class);
                l.b(service, "");
                f134133f = ((LocalTestApi) service).getSpecActDebugService();
            }
            d dVar = f134133f;
            if (dVar != null) {
                dVar.a("SpecBubble", str);
            }
        }
    }
}
