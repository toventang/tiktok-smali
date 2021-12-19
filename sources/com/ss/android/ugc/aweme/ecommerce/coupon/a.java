package com.ss.android.ugc.aweme.ecommerce.coupon;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.utils.dg;
import h.f.b.l;
import java.util.List;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final C2054a f85749d = new C2054a((byte) 0);
    @c(a = "voucher")

    /* renamed from: a  reason: collision with root package name */
    public final Voucher f85750a;
    @c(a = "voucher_type")

    /* renamed from: b  reason: collision with root package name */
    public final Integer f85751b;
    @c(a = "vouchers")

    /* renamed from: c  reason: collision with root package name */
    public final List<Voucher> f85752c;

    static {
        Covode.recordClassIndex(53625);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.coupon.a$a  reason: collision with other inner class name */
    public static final class C2054a {
        static {
            Covode.recordClassIndex(53626);
        }

        private C2054a() {
        }

        public /* synthetic */ C2054a(byte b2) {
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
            return (a) obj;
        }
    }
}
