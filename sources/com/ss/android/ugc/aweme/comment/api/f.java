package com.ss.android.ugc.aweme.comment.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;

public final class f extends BaseResponse {
    @c(a = "block_fail_toUserIds")

    /* renamed from: a  reason: collision with root package name */
    public final String f71465a;
    @c(a = "max_batch_size")

    /* renamed from: b  reason: collision with root package name */
    public final Integer f71466b;

    static {
        Covode.recordClassIndex(43989);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f71465a, fVar.f71465a) && l.a(this.f71466b, fVar.f71466b);
    }

    public final int hashCode() {
        String str = this.f71465a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.f71466b;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "UserBatchBlockResponse(blockFailToUserIds=" + this.f71465a + ", maxBatchSize=" + this.f71466b + ")";
    }

    private /* synthetic */ f() {
        this("", 0);
    }

    private f(String str, Integer num) {
        this.f71465a = str;
        this.f71466b = num;
    }
}
