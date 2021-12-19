package com.ss.android.ugc.aweme.comment.j;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;

public final class l extends b<CommentResponse> {
    static {
        Covode.recordClassIndex(44259);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.comment.j.b, com.ss.android.ugc.aweme.common.b
    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        n.a().a(this.mHandler, new m(objArr), 0);
        return true;
    }
}
