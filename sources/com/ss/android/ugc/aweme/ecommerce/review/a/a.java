package com.ss.android.ugc.aweme.ecommerce.review.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct;
import h.f.b.l;
import java.util.List;

public abstract class a {
    static {
        Covode.recordClassIndex(54574);
    }

    private a() {
    }

    public /* synthetic */ a(byte b2) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.a.a$a  reason: collision with other inner class name */
    public static final class C2096a extends a {

        /* renamed from: a  reason: collision with root package name */
        public final ReviewItemStruct f86985a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f86986b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f86987c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f86988d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f86989e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f86990f;

        static {
            Covode.recordClassIndex(54575);
        }

        public static /* synthetic */ C2096a a(C2096a aVar, ReviewItemStruct reviewItemStruct, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2) {
            boolean z6 = z5;
            boolean z7 = z4;
            ReviewItemStruct reviewItemStruct2 = reviewItemStruct;
            boolean z8 = z;
            boolean z9 = z2;
            boolean z10 = z3;
            if ((i2 & 1) != 0) {
                reviewItemStruct2 = aVar.f86985a;
            }
            if ((i2 & 2) != 0) {
                z8 = aVar.f86986b;
            }
            if ((i2 & 4) != 0) {
                z9 = aVar.f86987c;
            }
            if ((i2 & 8) != 0) {
                z10 = aVar.f86988d;
            }
            if ((i2 & 16) != 0) {
                z7 = aVar.f86989e;
            }
            if ((i2 & 32) != 0) {
                z6 = aVar.f86990f;
            }
            return a(reviewItemStruct2, z8, z9, z10, z7, z6);
        }

        private static C2096a a(ReviewItemStruct reviewItemStruct, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            l.d(reviewItemStruct, "");
            return new C2096a(reviewItemStruct, z, z2, z3, z4, z5);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2096a)) {
                return false;
            }
            C2096a aVar = (C2096a) obj;
            return l.a(this.f86985a, aVar.f86985a) && this.f86986b == aVar.f86986b && this.f86987c == aVar.f86987c && this.f86988d == aVar.f86988d && this.f86989e == aVar.f86989e && this.f86990f == aVar.f86990f;
        }

        public final int hashCode() {
            ReviewItemStruct reviewItemStruct = this.f86985a;
            int hashCode = (reviewItemStruct != null ? reviewItemStruct.hashCode() : 0) * 31;
            boolean z = this.f86986b;
            int i2 = 1;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = (hashCode + i3) * 31;
            boolean z2 = this.f86987c;
            if (z2) {
                z2 = true;
            }
            int i7 = z2 ? 1 : 0;
            int i8 = z2 ? 1 : 0;
            int i9 = z2 ? 1 : 0;
            int i10 = (i6 + i7) * 31;
            boolean z3 = this.f86988d;
            if (z3) {
                z3 = true;
            }
            int i11 = z3 ? 1 : 0;
            int i12 = z3 ? 1 : 0;
            int i13 = z3 ? 1 : 0;
            int i14 = (i10 + i11) * 31;
            boolean z4 = this.f86989e;
            if (z4) {
                z4 = true;
            }
            int i15 = z4 ? 1 : 0;
            int i16 = z4 ? 1 : 0;
            int i17 = z4 ? 1 : 0;
            int i18 = (i14 + i15) * 31;
            if (!this.f86990f) {
                i2 = 0;
            }
            return i18 + i2;
        }

        public final String toString() {
            return "ReviewCellVO(struct=" + this.f86985a + ", mainReviewExpand=" + this.f86986b + ", appendReviewExpand=" + this.f86987c + ", sellerFistReplyExpand=" + this.f86988d + ", sellerAppendReplyExpand=" + this.f86989e + ", showDivider=" + this.f86990f + ")";
        }

        public /* synthetic */ C2096a(ReviewItemStruct reviewItemStruct) {
            this(reviewItemStruct, false, false, false, false, true);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private C2096a(ReviewItemStruct reviewItemStruct, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            super((byte) 0);
            l.d(reviewItemStruct, "");
            this.f86985a = reviewItemStruct;
            this.f86986b = z;
            this.f86987c = z2;
            this.f86988d = z3;
            this.f86989e = z4;
            this.f86990f = z5;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final List<ReviewFilterStruct> f86991a;

        static {
            Covode.recordClassIndex(54576);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && l.a(this.f86991a, ((b) obj).f86991a);
            }
            return true;
        }

        public final int hashCode() {
            List<ReviewFilterStruct> list = this.f86991a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "ReviewFilterVO(filters=" + this.f86991a + ")";
        }

        public b(List<ReviewFilterStruct> list) {
            l.d(list, "");
            this.f86991a = list;
        }
    }
}
