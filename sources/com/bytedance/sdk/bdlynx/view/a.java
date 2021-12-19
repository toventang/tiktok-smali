package com.bytedance.sdk.bdlynx.view;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bdlynx.d.b;
import com.bytedance.sdk.bdlynx.d.c;
import h.a.n;
import h.e.j;
import h.f.b.l;
import h.m.p;
import h.w;
import java.io.File;
import java.util.Iterator;
import java.util.List;

public final class a implements b {

    /* renamed from: b  reason: collision with root package name */
    public static final C1064a f43792b = new C1064a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private static final List<String> f43793c = n.b("http", "https", "file", "content", "res", "data", "asset");

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.sdk.bdlynx.c.b f43794a;

    /* renamed from: com.bytedance.sdk.bdlynx.view.a$a  reason: collision with other inner class name */
    public static final class C1064a {
        static {
            Covode.recordClassIndex(26787);
        }

        private C1064a() {
        }

        public /* synthetic */ C1064a(byte b2) {
            this();
        }
    }

    private com.bytedance.sdk.bdlynx.c.b a() {
        com.bytedance.sdk.bdlynx.c.b bVar = this.f43794a;
        if (bVar == null) {
            l.a("monitorSession");
        }
        return bVar;
    }

    static {
        Covode.recordClassIndex(26786);
    }

    @Override // com.bytedance.sdk.bdlynx.d.b
    public final void a(com.bytedance.sdk.bdlynx.c.b bVar) {
        l.c(bVar, "");
        this.f43794a = bVar;
    }

    private static String b(c cVar, String str) {
        String path;
        File parentFile;
        File a2;
        File h2;
        Uri uri = cVar.f43700c;
        if (uri == null || (path = uri.getPath()) == null || (parentFile = new File(path).getParentFile()) == null || (a2 = j.a(parentFile, str)) == null || (h2 = j.h(a2)) == null) {
            return null;
        }
        return new Uri.Builder().scheme(uri.getScheme()).path(h2.getCanonicalPath()).build().toString();
    }

    @Override // com.bytedance.sdk.bdlynx.d.b
    public final String a(c cVar, String str) {
        boolean z;
        String b2;
        List<String> list;
        T t;
        String b3;
        File a2;
        String canonicalPath;
        l.c(cVar, "");
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        a();
        com.bytedance.sdk.bdlynx.a.f.b a3 = com.bytedance.sdk.bdlynx.a.f.b.a();
        f fVar = new f(null, str, null, 13);
        Uri parse = Uri.parse(str);
        l.a((Object) parse, "");
        if ((l.a((Object) parse.getScheme(), (Object) "http") || l.a((Object) parse.getScheme(), (Object) "https")) && (list = cVar.f43698a) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (p.b(str, (String) t, false)) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                int length = t2.length();
                if (str != null) {
                    String substring = str.substring(length);
                    l.a((Object) substring, "");
                    String a4 = p.a(substring, '?');
                    char c2 = File.separatorChar;
                    l.d(a4, "");
                    if (a4.length() > 0 && h.m.a.a(a4.charAt(0), c2, false)) {
                        a4 = ".".concat(String.valueOf(a4));
                    }
                    String str2 = cVar.f43699b;
                    if (str2 == null || (a2 = j.a(new File(str2), a4)) == null || (canonicalPath = a2.getCanonicalPath()) == null || !new File(canonicalPath).exists()) {
                        b3 = b(cVar, a4);
                    } else {
                        b3 = new Uri.Builder().scheme("file").path(canonicalPath).build().toString();
                    }
                    if (b3 != null) {
                        com.bytedance.sdk.bdlynx.c.b a5 = a();
                        fVar.a("success");
                        fVar.b(b3);
                        fVar.f43819d = com.bytedance.sdk.bdlynx.a.f.b.a(a3);
                        a5.a(fVar);
                        return b3;
                    }
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            }
        }
        if (!parse.isRelative() || (b2 = b(cVar, str)) == null) {
            com.bytedance.sdk.bdlynx.c.b a6 = a();
            fVar.f43819d = com.bytedance.sdk.bdlynx.a.f.b.a(a3);
            a6.a(fVar);
            return null;
        }
        com.bytedance.sdk.bdlynx.c.b a7 = a();
        fVar.a("success");
        fVar.b(b2);
        fVar.f43819d = com.bytedance.sdk.bdlynx.a.f.b.a(a3);
        a7.a(fVar);
        return b2;
    }
}
