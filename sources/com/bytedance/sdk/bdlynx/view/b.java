package com.bytedance.sdk.bdlynx.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bdlynx.e.b.a.c;
import h.a.n;
import h.f.b.l;
import h.m.p;
import h.w;
import java.io.File;
import java.util.Iterator;
import java.util.List;

public final class b implements com.bytedance.sdk.bdlynx.d.b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f43795b = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    private static final List<String> f43796e = n.b("http", "https");

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.sdk.bdlynx.c.b f43797a;

    /* renamed from: c  reason: collision with root package name */
    private c f43798c;

    /* renamed from: d  reason: collision with root package name */
    private final com.bytedance.sdk.bdlynx.d.a f43799d;

    public static final class a {
        static {
            Covode.recordClassIndex(26789);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private com.bytedance.sdk.bdlynx.c.b a() {
        com.bytedance.sdk.bdlynx.c.b bVar = this.f43797a;
        if (bVar == null) {
            l.a("monitorSession");
        }
        return bVar;
    }

    static {
        Covode.recordClassIndex(26788);
    }

    @Override // com.bytedance.sdk.bdlynx.d.b
    public final void a(com.bytedance.sdk.bdlynx.c.b bVar) {
        l.c(bVar, "");
        this.f43797a = bVar;
    }

    public b(com.bytedance.sdk.bdlynx.d.a aVar) {
        l.c(aVar, "");
        this.f43799d = aVar;
    }

    private static String a(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        return p.j(str, str2);
    }

    private static String a(com.bytedance.sdk.bdlynx.e.b.a.b bVar, String str) {
        T t;
        List<String> list = bVar.f43716f;
        if (list != null) {
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
                    return p.a(substring, '?');
                }
                throw new w("null cannot be cast to non-null type");
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0127  */
    @Override // com.bytedance.sdk.bdlynx.d.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(com.bytedance.sdk.bdlynx.d.c r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 299
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.bdlynx.view.b.a(com.bytedance.sdk.bdlynx.d.c, java.lang.String):java.lang.String");
    }

    private final String a(com.bytedance.sdk.bdlynx.e.b.a.b bVar, String str, String str2) {
        String a2 = a(bVar, str);
        if (a2 != null) {
            String a3 = a(a2, str2);
            String a4 = this.f43799d.a();
            if (a4 != null) {
                File file = new File(a4 + File.separator + a3);
                if (file.exists()) {
                    return file.getAbsolutePath();
                }
            }
        }
        return null;
    }
}
