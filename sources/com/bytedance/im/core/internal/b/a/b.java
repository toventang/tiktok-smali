package com.bytedance.im.core.internal.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.bd;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;

public abstract class b extends w {

    /* renamed from: a  reason: collision with root package name */
    protected k f38421a;

    static {
        Covode.recordClassIndex(22985);
    }

    /* access modifiers changed from: protected */
    public abstract void a(int i2, ResponseBody responseBody, bd bdVar);

    public b(int i2) {
        super(i2);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (!kVar.l() || kVar.f38725f == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(k kVar, Runnable runnable) {
        if (a(kVar) && kVar.f38725f.body != null) {
            this.f38421a = kVar;
            Response response = kVar.f38725f;
            a(response.inbox_type.intValue(), response.body, kVar.f38726g);
        }
    }
}
