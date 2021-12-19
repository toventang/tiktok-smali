package com.ss.android.ugc.aweme.comment.j;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import com.ss.android.ugc.aweme.comment.model.Comment;

public final class f extends b<BaseCommentResponse> {

    /* renamed from: b  reason: collision with root package name */
    public String f72027b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f72028c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f72029d = "";

    /* renamed from: e  reason: collision with root package name */
    public Comment f72030e;

    static {
        Covode.recordClassIndex(44251);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 4) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.comment.j.b, com.ss.android.ugc.aweme.common.b
    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        n.a().a(this.mHandler, new g(this, objArr), 0);
        return true;
    }
}
