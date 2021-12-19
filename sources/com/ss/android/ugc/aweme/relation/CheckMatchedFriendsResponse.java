package com.ss.android.ugc.aweme.relation;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.g;

public final class CheckMatchedFriendsResponse extends BaseResponse {
    @c(a = "has_data")
    private final boolean hasData;

    static {
        Covode.recordClassIndex(78235);
    }

    public CheckMatchedFriendsResponse() {
        this(false, 1, null);
    }

    public static /* synthetic */ CheckMatchedFriendsResponse copy$default(CheckMatchedFriendsResponse checkMatchedFriendsResponse, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = checkMatchedFriendsResponse.hasData;
        }
        return checkMatchedFriendsResponse.copy(z);
    }

    public final boolean component1() {
        return this.hasData;
    }

    public final CheckMatchedFriendsResponse copy(boolean z) {
        return new CheckMatchedFriendsResponse(z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof CheckMatchedFriendsResponse) && this.hasData == ((CheckMatchedFriendsResponse) obj).hasData;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.hasData;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "CheckMatchedFriendsResponse(hasData=" + this.hasData + ")";
    }

    public final boolean getHasData() {
        return this.hasData;
    }

    public CheckMatchedFriendsResponse(boolean z) {
        this.hasData = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckMatchedFriendsResponse(boolean z, int i2, g gVar) {
        this((i2 & 1) != 0 ? false : z);
    }
}
