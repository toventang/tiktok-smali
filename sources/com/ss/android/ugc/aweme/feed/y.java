package com.ss.android.ugc.aweme.feed;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bs.b;
import com.ss.android.ugc.aweme.logger.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    private List<Object> f95378a;

    static {
        Covode.recordClassIndex(60397);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static y f95379a = new y((byte) 0);

        static {
            Covode.recordClassIndex(60398);
        }
    }

    private y() {
        this.f95378a = new ArrayList();
    }

    public final void a() {
        Iterator<Object> it = this.f95378a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* synthetic */ y(byte b2) {
        this();
    }

    public static void a(b bVar) {
        HashMap<String, Long> hashMap = bVar.R;
        HashMap<String, Long> hashMap2 = bVar.S;
        for (Map.Entry<String, Long> entry : hashMap.entrySet()) {
            a.b.f109011a.a(entry.getKey() + "_duration_pre", entry.getValue().longValue());
        }
        for (Map.Entry<String, Long> entry2 : hashMap2.entrySet()) {
            a.b.f109011a.a(entry2.getKey() + "_duration_post", entry2.getValue().longValue());
        }
    }
}
