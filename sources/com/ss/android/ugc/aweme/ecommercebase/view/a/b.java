package com.ss.android.ugc.aweme.ecommercebase.view.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f87722d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final a f87723a;

    /* renamed from: b  reason: collision with root package name */
    public final a f87724b;

    /* renamed from: c  reason: collision with root package name */
    public final a f87725c;

    static {
        Covode.recordClassIndex(55180);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f87723a, bVar.f87723a) && l.a(this.f87724b, bVar.f87724b) && l.a(this.f87725c, bVar.f87725c);
    }

    public final int hashCode() {
        a aVar = this.f87723a;
        int i2 = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        a aVar2 = this.f87724b;
        int hashCode2 = (hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        a aVar3 = this.f87725c;
        if (aVar3 != null) {
            i2 = aVar3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "TagVO(icon=" + this.f87723a + ", background=" + this.f87724b + ", tagVOText=" + this.f87725c + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(55181);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0048  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.ss.android.ugc.aweme.ecommercebase.view.a.b a(com.ss.android.ugc.aweme.ecommercebase.dto.PromotionItem r8) {
            /*
            // Method dump skipped, instructions count: 109
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercebase.view.a.b.a.a(com.ss.android.ugc.aweme.ecommercebase.dto.PromotionItem):com.ss.android.ugc.aweme.ecommercebase.view.a.b");
        }
    }

    public b(a aVar, a aVar2, a aVar3) {
        this.f87723a = aVar;
        this.f87724b = aVar2;
        this.f87725c = aVar3;
    }
}
