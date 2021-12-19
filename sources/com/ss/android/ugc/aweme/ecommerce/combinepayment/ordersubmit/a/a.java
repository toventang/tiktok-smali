package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.account.util.i;
import com.ss.android.ugc.aweme.utils.dg;
import h.f.b.l;
import java.util.Map;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final C2029a f84762d = new C2029a((byte) 0);
    @c(a = "refresh")

    /* renamed from: a  reason: collision with root package name */
    public final int f84763a;
    @c(a = "count")

    /* renamed from: b  reason: collision with root package name */
    public final Integer f84764b;
    @c(a = "cart_item")

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f84765c;

    static {
        Covode.recordClassIndex(52975);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.a$a  reason: collision with other inner class name */
    public static final class C2029a {
        static {
            Covode.recordClassIndex(52976);
        }

        private C2029a() {
        }

        public /* synthetic */ C2029a(byte b2) {
            this();
        }

        public static a a(String str) {
            Object obj;
            l.d(str, "");
            try {
                obj = dg.a(str, a.class);
            } catch (Exception unused) {
                obj = null;
            }
            a aVar = (a) obj;
            if (aVar == null) {
                return new a();
            }
            return aVar;
        }
    }

    public /* synthetic */ a() {
        this(1, null, null);
    }

    public final String a() {
        String b2 = i.a().b(this);
        if (b2 == null) {
            return "{}";
        }
        return b2;
    }

    public a(int i2, Integer num, Map<String, String> map) {
        this.f84763a = i2;
        this.f84764b = num;
        this.f84765c = map;
    }
}
