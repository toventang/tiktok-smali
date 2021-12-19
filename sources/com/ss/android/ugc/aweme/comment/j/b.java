package com.ss.android.ugc.aweme.comment.j;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.m.d;
import h.f.b.l;
import java.util.Arrays;

public abstract class b<T> extends com.ss.android.ugc.aweme.common.b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final d f72021a = new d();

    static {
        Covode.recordClassIndex(44247);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public void handleData(T t) {
        super.handleData(t);
        if (t instanceof BaseResponse) {
            this.f72021a.a(t);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public boolean sendRequest(Object... objArr) {
        l.d(objArr, "");
        this.f72021a.a();
        if (!super.sendRequest(Arrays.copyOf(objArr, objArr.length))) {
            return false;
        }
        return true;
    }
}
