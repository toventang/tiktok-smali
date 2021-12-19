package com.ss.android.ugc.aweme.comment.j;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.m.d;

public abstract class a<Item, Response> extends com.ss.android.ugc.aweme.common.e.a<Item, Response> {

    /* renamed from: a  reason: collision with root package name */
    public final d f72020a = new d();

    static {
        Covode.recordClassIndex(44246);
    }

    public abstract void a(Response response);

    @Override // com.ss.android.ugc.aweme.common.b, com.ss.android.ugc.aweme.common.e.a
    public boolean sendRequest(Object... objArr) {
        this.f72020a.a();
        return super.sendRequest(objArr);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public void handleData(Response response) {
        super.handleData(response);
        if (response instanceof BaseResponse) {
            this.f72020a.a(response);
        }
        a(response);
    }
}
