package com.ss.android.ugc.aweme.comment.j;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.comment.i.g;
import com.ss.android.ugc.aweme.comment.model.BaseCommentResponse;

public final class c extends b<BaseCommentResponse> {

    /* renamed from: b  reason: collision with root package name */
    public String f72022b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f72023c = "";

    /* renamed from: d  reason: collision with root package name */
    public g f72024d;

    static {
        Covode.recordClassIndex(44248);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length < 2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.comment.j.b, com.ss.android.ugc.aweme.common.b
    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        n.a().a(this.mHandler, new d(this, objArr), 0);
        return true;
    }
}
