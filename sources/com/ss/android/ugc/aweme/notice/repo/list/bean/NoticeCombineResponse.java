package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.g;
import h.f.b.l;

public final class NoticeCombineResponse extends BaseResponse {
    @c(a = "data")
    private final NoticeCombineDatas data;

    static {
        Covode.recordClassIndex(72535);
    }

    public NoticeCombineResponse() {
        this(null, 1, null);
    }

    public static /* synthetic */ NoticeCombineResponse copy$default(NoticeCombineResponse noticeCombineResponse, NoticeCombineDatas noticeCombineDatas, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            noticeCombineDatas = noticeCombineResponse.data;
        }
        return noticeCombineResponse.copy(noticeCombineDatas);
    }

    public final NoticeCombineDatas component1() {
        return this.data;
    }

    public final NoticeCombineResponse copy(NoticeCombineDatas noticeCombineDatas) {
        return new NoticeCombineResponse(noticeCombineDatas);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof NoticeCombineResponse) && l.a(this.data, ((NoticeCombineResponse) obj).data);
        }
        return true;
    }

    public final int hashCode() {
        NoticeCombineDatas noticeCombineDatas = this.data;
        if (noticeCombineDatas != null) {
            return noticeCombineDatas.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "NoticeCombineResponse(data=" + this.data + ")";
    }

    public final NoticeCombineDatas getData() {
        return this.data;
    }

    public NoticeCombineResponse(NoticeCombineDatas noticeCombineDatas) {
        this.data = noticeCombineDatas;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NoticeCombineResponse(NoticeCombineDatas noticeCombineDatas, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : noticeCombineDatas);
    }
}
