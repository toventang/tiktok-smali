package com.ss.android.ugc.aweme.sharer;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.sharer.ui.e;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f124521a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, IChannelApi> f124522b = new LinkedHashMap();

    private c() {
    }

    static {
        Covode.recordClassIndex(81777);
        for (IChannelApi iChannelApi : ServiceManager.get().getServices(IChannelApi.class)) {
            Map<String, IChannelApi> map = f124522b;
            String a2 = iChannelApi.a();
            l.b(iChannelApi, "");
            map.put(a2, iChannelApi);
        }
    }

    public static b a(String str, d dVar) {
        l.d(str, "");
        IChannelApi iChannelApi = f124522b.get(str);
        if (iChannelApi != null) {
            return iChannelApi.a(dVar);
        }
        return null;
    }

    public static boolean a(String str, d dVar, e.b bVar) {
        b a2;
        l.d(str, "");
        l.d(bVar, "");
        IChannelApi iChannelApi = f124522b.get(str);
        if (iChannelApi == null || (a2 = iChannelApi.a(dVar)) == null) {
            return false;
        }
        bVar.a(a2);
        return true;
    }
}
