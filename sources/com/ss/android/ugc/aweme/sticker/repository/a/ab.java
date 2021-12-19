package com.ss.android.ugc.aweme.sticker.repository.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class ab {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f135462a;

    /* renamed from: b  reason: collision with root package name */
    public final String f135463b;

    /* renamed from: c  reason: collision with root package name */
    public final long f135464c;

    static {
        Covode.recordClassIndex(88507);
    }

    public ab() {
        this(0, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        return l.a(this.f135462a, abVar.f135462a) && l.a(this.f135463b, abVar.f135463b) && this.f135464c == abVar.f135464c;
    }

    public final int hashCode() {
        Integer num = this.f135462a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f135463b;
        if (str != null) {
            i2 = str.hashCode();
        }
        long j2 = this.f135464c;
        return ((hashCode + i2) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "StickerDownloadInfo(errorCode=" + this.f135462a + ", errorMsg=" + this.f135463b + ", totalSize=" + this.f135464c + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ab(long j2, int i2) {
        this(null, null, (i2 & 4) != 0 ? 0 : j2);
    }

    public ab(Integer num, String str, long j2) {
        this.f135462a = num;
        this.f135463b = str;
        this.f135464c = j2;
    }
}
