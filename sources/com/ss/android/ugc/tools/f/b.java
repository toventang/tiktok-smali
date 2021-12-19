package com.ss.android.ugc.tools.f;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import java.util.HashMap;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f149193a = new HashMap();

    static {
        Covode.recordClassIndex(98245);
    }

    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f149194a = new a() {
            /* class com.ss.android.ugc.tools.f.b.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(98247);
            }

            @Override // com.ss.android.ugc.tools.f.b.a
            public final String a(String str) {
                if (TextUtils.isEmpty(str) || "null".equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: b  reason: collision with root package name */
        public static final a f149195b = new a() {
            /* class com.ss.android.ugc.tools.f.b.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(98248);
            }

            @Override // com.ss.android.ugc.tools.f.b.a
            public final String a(String str) {
                if (TextUtils.isEmpty(str) || "null".equals(str) || "0".equals(str)) {
                    return "";
                }
                return str;
            }
        };

        String a(String str);

        static {
            Covode.recordClassIndex(98246);
        }
    }

    public final b a(Map<? extends String, ? extends String> map) {
        if (map != null) {
            this.f149193a.putAll(map);
        }
        return this;
    }

    public final b a(String str, String str2) {
        return a(str, str2, a.f149194a);
    }

    public final b b(String str, boolean z) {
        if (!z) {
            return this;
        }
        return a(str, 1);
    }

    public final b a(String str, int i2) {
        return a(str, String.valueOf(i2), a.f149194a);
    }

    public final b a(String str, long j2) {
        return a(str, String.valueOf(j2), a.f149194a);
    }

    public final b a(String str, Object obj) {
        if (obj != null) {
            a(str, new f().b(obj));
        }
        return this;
    }

    public final b a(String str, boolean z) {
        return a(str, String.valueOf(z), a.f149194a);
    }

    private b a(String str, String str2, a aVar) {
        this.f149193a.put(str, aVar.a(str2));
        return this;
    }
}
