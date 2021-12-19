package com.ss.android.ugc.aweme.newfollow.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.base.h.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public volatile List<String> f112590a;

    /* renamed from: b  reason: collision with root package name */
    private List<String> f112591b;

    static {
        Covode.recordClassIndex(72353);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final e f112592a = new e();

        static {
            Covode.recordClassIndex(72354);
        }
    }

    private static com.ss.android.ugc.aweme.base.h.e d() {
        return c.a(d.a(), "rec_user");
    }

    private static void e() {
        d().b("to_report_rec_user_ids", "");
    }

    private static String f() {
        return d().a("to_report_rec_user_ids", "");
    }

    public final void b() {
        if (this.f112590a != null) {
            this.f112590a.clear();
        }
        List<String> list = this.f112591b;
        if (list != null) {
            list.clear();
        }
        e();
    }

    public final void c() {
        a();
        d().b("to_report_rec_user_ids", a());
    }

    private void g() {
        if (!f().isEmpty()) {
            for (Object obj : Arrays.asList(f().split(","))) {
                if (this.f112590a.contains(obj)) {
                    this.f112590a.remove(obj);
                }
            }
        }
    }

    public final String a() {
        String f2 = f();
        if (this.f112590a == null || this.f112590a.size() == 0) {
            return f2;
        }
        StringBuilder sb = new StringBuilder();
        if (!f2.isEmpty()) {
            sb.append(f2);
            sb.append(",");
        }
        g();
        ArrayList arrayList = new ArrayList(this.f112590a);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            sb.append((String) arrayList.get(i2));
            sb.append(",");
        }
        String sb2 = sb.toString();
        if (sb2.endsWith(",")) {
            return sb2.substring(0, sb2.length() - 1);
        }
        return sb2;
    }

    public final void a(int i2, String str) {
        if (this.f112591b == null) {
            this.f112591b = new ArrayList();
        }
        if (this.f112590a == null) {
            this.f112590a = new ArrayList();
        }
        String str2 = i2 + ":" + str;
        if (!this.f112591b.contains(str2)) {
            this.f112590a.add(str2);
            this.f112591b.add(str2);
        }
    }
}
