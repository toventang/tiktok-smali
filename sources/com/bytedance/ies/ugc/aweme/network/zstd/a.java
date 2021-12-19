package com.bytedance.ies.ugc.aweme.network.zstd;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.retrofit2.s;
import com.bytedance.zoin.zstd.ZstdInputStream;
import h.f.b.l;
import java.io.InputStream;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class a implements e.j {

    /* renamed from: a  reason: collision with root package name */
    public static final C0788a f35041a = new C0788a((byte) 0);

    static {
        Covode.recordClassIndex(21025);
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.network.zstd.a$a  reason: collision with other inner class name */
    public static final class C0788a {
        static {
            Covode.recordClassIndex(21026);
        }

        private C0788a() {
        }

        public /* synthetic */ C0788a(byte b2) {
            this();
        }
    }

    private static String a(Map<String, List<String>> map, String str) {
        List<String> list = map.get(str);
        if (list == null) {
            Locale locale = Locale.US;
            l.b(locale, "");
            String lowerCase = str.toLowerCase(locale);
            l.b(lowerCase, "");
            list = map.get(lowerCase);
            if (list == null) {
                return null;
            }
        }
        return list.get(list.size() - 1);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.e.j
    public final InputStream a(InputStream inputStream, Map<String, List<String>> map, s sVar) {
        Map<String, Long> map2;
        Map<String, Long> map3;
        l.d(inputStream, "");
        l.d(map, "");
        try {
            if (!l.a((Object) "ttzip", (Object) a(map, "Content-Encoding"))) {
                return inputStream;
            }
            String a2 = a(map, "ttzip-version");
            ZstdInputStream zstdInputStream = new ZstdInputStream(inputStream);
            if (a2 != null) {
                zstdInputStream.setDict(c.f35049a.a(a2));
            }
            if (!(sVar == null || (map3 = sVar.M) == null)) {
                map3.put("zstd_err_code", 0L);
            }
            return zstdInputStream;
        } catch (Exception e2) {
            if (!(sVar == null || (map2 = sVar.M) == null)) {
                map2.put("zstd_err_code", 1L);
            }
            throw e2;
        }
    }
}
