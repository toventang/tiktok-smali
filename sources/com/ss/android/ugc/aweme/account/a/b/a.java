package com.ss.android.ugc.aweme.account.a.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f62575a = new HashMap();

    static {
        Covode.recordClassIndex(38509);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.a.b.a$a  reason: collision with other inner class name */
    public interface AbstractC1370a {

        /* renamed from: a  reason: collision with root package name */
        public static final AbstractC1370a f62576a = new AbstractC1370a() {
            /* class com.ss.android.ugc.aweme.account.a.b.a.AbstractC1370a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(38511);
            }

            @Override // com.ss.android.ugc.aweme.account.a.b.a.AbstractC1370a
            public final String a(String str) {
                if (TextUtils.isEmpty(str) || "null".equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: b  reason: collision with root package name */
        public static final AbstractC1370a f62577b = new AbstractC1370a() {
            /* class com.ss.android.ugc.aweme.account.a.b.a.AbstractC1370a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(38512);
            }

            @Override // com.ss.android.ugc.aweme.account.a.b.a.AbstractC1370a
            public final String a(String str) {
                if (TextUtils.isEmpty(str) || "null".equals(str) || "0".equals(str)) {
                    return "";
                }
                return str;
            }
        };

        String a(String str);

        static {
            Covode.recordClassIndex(38510);
        }
    }

    public final a a(String str, String str2) {
        return a(str, str2, AbstractC1370a.f62576a);
    }

    public final a a(String str, int i2) {
        return a(str, String.valueOf(i2), AbstractC1370a.f62576a);
    }

    public final a a(String str, long j2) {
        return a(str, String.valueOf(j2), AbstractC1370a.f62576a);
    }

    private a a(String str, String str2, AbstractC1370a aVar) {
        this.f62575a.put(str, aVar.a(str2));
        return this;
    }
}
