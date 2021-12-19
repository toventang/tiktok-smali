package com.ss.android.ugc.aweme.app.f;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.w;
import java.util.HashMap;
import java.util.Map;

public class d {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f66729b;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f66730a = new HashMap();

    static {
        Covode.recordClassIndex(41073);
    }

    public final d a(Map<? extends String, ? extends String> map) {
        if (map != null) {
            this.f66730a.putAll(map);
        }
        return this;
    }

    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f66731a = new a() {
            /* class com.ss.android.ugc.aweme.app.f.d.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(41075);
            }

            @Override // com.ss.android.ugc.aweme.app.f.d.a
            public final String a(String str) {
                if (TextUtils.isEmpty(str) || "null".equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: b  reason: collision with root package name */
        public static final a f66732b = new a() {
            /* class com.ss.android.ugc.aweme.app.f.d.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(41076);
            }

            @Override // com.ss.android.ugc.aweme.app.f.d.a
            public final String a(String str) {
                if (TextUtils.isEmpty(str) || "null".equals(str) || "0".equals(str)) {
                    return "";
                }
                return str;
            }
        };

        String a(String str);

        static {
            Covode.recordClassIndex(41074);
        }
    }

    public final d a(HashMap<? extends String, ? extends String> hashMap) {
        if (hashMap != null) {
            this.f66730a.putAll(hashMap);
        }
        return this;
    }

    public final d a(String str, String str2) {
        return a(str, str2, a.f66731a);
    }

    public final d a(String str, double d2) {
        if (f66729b) {
            return a(str, String.valueOf(d2), a.f66731a);
        }
        return a(str, Double.valueOf(d2));
    }

    public final d a(String str, float f2) {
        if (f66729b) {
            return a(str, String.valueOf(f2), a.f66731a);
        }
        return a(str, Float.valueOf(f2));
    }

    public final d a(String str, int i2) {
        return a(str, String.valueOf(i2), a.f66731a);
    }

    public final d a(String str, long j2) {
        return a(str, String.valueOf(j2), a.f66731a);
    }

    public final d a(String str, Object obj) {
        if (obj != null) {
            a(str, new f().b(obj));
        }
        return this;
    }

    private d a(String str, String str2, a aVar) {
        this.f66730a.put(str, aVar.a(str2));
        return this;
    }

    public final d a(Aweme aweme, String str, String str2) {
        for (Map.Entry<String, String> entry : w.a(aweme, str, str2).entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
        return this;
    }
}
