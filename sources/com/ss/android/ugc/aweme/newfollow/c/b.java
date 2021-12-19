package com.ss.android.ugc.aweme.newfollow.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.h.d;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public volatile HashSet<String> f112575a;

    /* renamed from: b  reason: collision with root package name */
    public volatile HashSet<String> f112576b;

    /* renamed from: c  reason: collision with root package name */
    public volatile List<String> f112577c;

    /* renamed from: d  reason: collision with root package name */
    private HashSet<String> f112578d;

    static {
        Covode.recordClassIndex(72348);
    }

    private b() {
        d();
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final Map<String, b> f112579a = new ConcurrentHashMap(1);

        static {
            Covode.recordClassIndex(72349);
        }

        public static b a(String str) {
            Map<String, b> map = f112579a;
            b bVar = map.get(str);
            if (bVar != null) {
                return bVar;
            }
            b bVar2 = new b((byte) 0);
            map.put(str, bVar2);
            return bVar2;
        }
    }

    private static void e() {
        d.e().b("to_report_feed_ids", "");
    }

    private void d() {
        String a2 = d.e().a("to_report_feed_ids", "");
        if (!(a2 == null || a2.isEmpty())) {
            String[] split = a2.split(",");
            for (String str : split) {
                a(str);
            }
        }
    }

    public final String a() {
        if (com.bytedance.common.utility.collection.b.a((Collection) this.f112577c)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : this.f112577c) {
            sb.append(str);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public final String b() {
        if (com.bytedance.common.utility.collection.b.a((Collection) this.f112575a)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.f112575a.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public final void c() {
        if (this.f112575a != null) {
            if (!com.bytedance.common.utility.collection.b.a((Collection) this.f112576b)) {
                this.f112575a.removeAll(this.f112576b);
            } else {
                this.f112575a.clear();
            }
        }
        if (this.f112576b != null) {
            this.f112576b.clear();
        }
        e();
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    public final void a(String str) {
        if (str != null && !str.isEmpty()) {
            if (this.f112578d == null) {
                this.f112578d = new HashSet<>();
            }
            if (this.f112575a == null) {
                this.f112575a = new HashSet<>();
            }
            if (!this.f112578d.contains(str)) {
                this.f112575a.add(str);
                this.f112578d.add(str);
            }
        }
    }
}
