package com.ss.android.ugc.aweme.specact.pendant.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;

public final class a extends BaseResponse {
    @c(a = "err_no")

    /* renamed from: a  reason: collision with root package name */
    public int f134098a;
    @c(a = "data")

    /* renamed from: b  reason: collision with root package name */
    public C3478a f134099b;

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.b.a$a  reason: collision with other inner class name */
    public static final class C3478a {
        @c(a = "amount")

        /* renamed from: a  reason: collision with root package name */
        public int f134100a;
        @c(a = "amount_type")

        /* renamed from: b  reason: collision with root package name */
        public String f134101b;
        @c(a = "next_req_interval")

        /* renamed from: c  reason: collision with root package name */
        public int f134102c;
        @c(a = "cold_down")

        /* renamed from: d  reason: collision with root package name */
        public int f134103d;
        @c(a = "is_last_round")

        /* renamed from: e  reason: collision with root package name */
        public boolean f134104e;
        @c(a = "display_amount")

        /* renamed from: f  reason: collision with root package name */
        public int f134105f;
        @c(a = "display_cash_amount")

        /* renamed from: g  reason: collision with root package name */
        public int f134106g;
        @c(a = "display_cash_amount_i18n")

        /* renamed from: h  reason: collision with root package name */
        public String f134107h;
        @c(a = "show_points")

        /* renamed from: i  reason: collision with root package name */
        public boolean f134108i;
        @c(a = "canival_ratio")

        /* renamed from: j  reason: collision with root package name */
        public final int f134109j;

        static {
            Covode.recordClassIndex(87715);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3478a)) {
                return false;
            }
            C3478a aVar = (C3478a) obj;
            return this.f134100a == aVar.f134100a && l.a(this.f134101b, aVar.f134101b) && this.f134102c == aVar.f134102c && this.f134103d == aVar.f134103d && this.f134104e == aVar.f134104e && this.f134105f == aVar.f134105f && this.f134106g == aVar.f134106g && l.a(this.f134107h, aVar.f134107h) && this.f134108i == aVar.f134108i && this.f134109j == aVar.f134109j;
        }

        public final int hashCode() {
            int i2 = this.f134100a * 31;
            String str = this.f134101b;
            int i3 = 0;
            int hashCode = (((((i2 + (str != null ? str.hashCode() : 0)) * 31) + this.f134102c) * 31) + this.f134103d) * 31;
            boolean z = this.f134104e;
            int i4 = 1;
            if (z) {
                z = true;
            }
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = z ? 1 : 0;
            int i8 = (((((hashCode + i5) * 31) + this.f134105f) * 31) + this.f134106g) * 31;
            String str2 = this.f134107h;
            if (str2 != null) {
                i3 = str2.hashCode();
            }
            int i9 = (i8 + i3) * 31;
            if (!this.f134108i) {
                i4 = 0;
            }
            return ((i9 + i4) * 31) + this.f134109j;
        }

        public final String toString() {
            return "Data(amount=" + this.f134100a + ", amountType=" + this.f134101b + ", nextReqInterval=" + this.f134102c + ", coldDown=" + this.f134103d + ", isLastRound=" + this.f134104e + ", disPlayAmount=" + this.f134105f + ", disPlayCashAmount=" + this.f134106g + ", disPlayCashAmountI18n=" + this.f134107h + ", showPoints=" + this.f134108i + ", canivalRatio=" + this.f134109j + ")";
        }
    }

    static {
        Covode.recordClassIndex(87714);
    }
}
