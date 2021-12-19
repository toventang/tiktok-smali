package com.ss.android.ugc.a.a.c;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.a.a.a.c;
import com.ss.android.ugc.a.a.a.d;
import com.ss.android.ugc.a.a.b.a;

public final class b<P extends a> {

    /* renamed from: a  reason: collision with root package name */
    public c<P> f61892a;

    /* renamed from: b  reason: collision with root package name */
    public P f61893b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f61894c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f61895d;

    static {
        Covode.recordClassIndex(38063);
    }

    public final P a() {
        if (this.f61892a != null) {
            if (this.f61893b == null && this.f61894c != null) {
                this.f61893b = (P) ((a) d.INSTANCE.getPresenter(this.f61894c.getString("presenter_id")));
            }
            if (this.f61893b == null) {
                this.f61893b = this.f61892a.a();
                d.INSTANCE.add(this.f61893b);
                Bundle bundle = this.f61894c;
                if (bundle != null) {
                    bundle.getBundle("presenter");
                }
            }
            this.f61894c = null;
        }
        return this.f61893b;
    }

    public b(c<P> cVar) {
        this.f61892a = cVar;
    }
}
