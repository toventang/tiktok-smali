package com.ss.android.ugc.aweme.qainvitation.e;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;
import java.util.List;

public final class j extends BaseResponse {
    @c(a = "block_results")

    /* renamed from: a  reason: collision with root package name */
    public final List<h> f119156a;

    static {
        Covode.recordClassIndex(77375);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof j) && l.a(this.f119156a, ((j) obj).f119156a);
        }
        return true;
    }

    public final int hashCode() {
        List<h> list = this.f119156a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "UserPrivacyCheckData(filteredContactList=" + this.f119156a + ")";
    }

    private j() {
        this.f119156a = null;
    }

    public /* synthetic */ j(byte b2) {
        this();
    }
}
