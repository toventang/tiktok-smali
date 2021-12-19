package com.google.android.datatransport.cct.a;

import com.bytedance.covode.number.Covode;
import java.util.List;

public final class e extends k {

    /* renamed from: a  reason: collision with root package name */
    final List<q> f49323a;

    static {
        Covode.recordClassIndex(30862);
    }

    @Override // com.google.android.datatransport.cct.a.k
    public final List<q> a() {
        return this.f49323a;
    }

    public final int hashCode() {
        return this.f49323a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f49323a + "}";
    }

    public e(List<q> list) {
        this.f49323a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            return this.f49323a.equals(((k) obj).a());
        }
        return false;
    }
}
