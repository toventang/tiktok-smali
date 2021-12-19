package com.bytedance.android.live.wallet.c;

import com.bytedance.android.live.e;
import com.bytedance.android.livesdkapi.host.i;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f13083a = new a();

    private a() {
    }

    /* renamed from: com.bytedance.android.live.wallet.c.a$a  reason: collision with other inner class name */
    public static final class C0275a {
        @c(a = "error_code")

        /* renamed from: a  reason: collision with root package name */
        public final int f13084a;
        @c(a = "detail_code")

        /* renamed from: b  reason: collision with root package name */
        public final int f13085b;
        @c(a = "error_message")

        /* renamed from: c  reason: collision with root package name */
        public final String f13086c;

        static {
            Covode.recordClassIndex(7264);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0275a)) {
                return false;
            }
            C0275a aVar = (C0275a) obj;
            return this.f13084a == aVar.f13084a && this.f13085b == aVar.f13085b && l.a(this.f13086c, aVar.f13086c);
        }

        public final int hashCode() {
            int i2 = ((this.f13084a * 31) + this.f13085b) * 31;
            String str = this.f13086c;
            return i2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "ChargeFailEntity(errorCode=" + this.f13084a + ", detailCode=" + this.f13085b + ", msg=" + this.f13086c + ")";
        }

        private /* synthetic */ C0275a() {
            this(-1, -1, "");
        }

        public final String a() {
            String b2 = e.a.f9628b.b(this);
            l.b(b2, "");
            return b2;
        }

        public C0275a(int i2, int i3, String str) {
            l.d(str, "");
            this.f13084a = i2;
            this.f13085b = i3;
            this.f13086c = str;
        }
    }

    static {
        Covode.recordClassIndex(7263);
    }

    public static void a(int i2, int i3, String str) {
        if (str == null) {
            str = "";
        }
        ((i) com.bytedance.android.live.t.a.a(i.class)).a("recharge_fail", new C0275a(i2, i3, str).a());
    }
}
