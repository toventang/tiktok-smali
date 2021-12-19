package com.bytedance.ies.ugc.aweme.network.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.api.d;
import com.ss.android.ugc.aweme.app.api.g;
import com.ss.android.ugc.aweme.app.api.h;
import com.ss.android.ugc.aweme.app.api.i;
import com.ss.android.ugc.aweme.app.api.j;
import com.ss.android.ugc.aweme.app.api.k;

public class b<T> implements d, g, k {

    /* renamed from: a  reason: collision with root package name */
    j f34983a;

    /* renamed from: b  reason: collision with root package name */
    public e f34984b;

    /* renamed from: c  reason: collision with root package name */
    private a<T> f34985c;

    /* renamed from: e  reason: collision with root package name */
    private String f34986e;

    /* renamed from: f  reason: collision with root package name */
    private com.bytedance.frameworks.baselib.network.http.a f34987f;

    /* access modifiers changed from: package-private */
    public interface a<T> {
        static {
            Covode.recordClassIndex(20997);
        }

        void a(a<T> aVar);
    }

    static {
        Covode.recordClassIndex(20993);
    }

    @Override // com.ss.android.ugc.aweme.app.api.g
    public i getRequestLog() {
        return h.a(this);
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public String getRequestId() {
        return this.f34986e;
    }

    @Override // com.ss.android.ugc.aweme.app.api.g
    public com.bytedance.frameworks.baselib.network.http.a getRequestInfo() {
        return this.f34987f;
    }

    @Override // com.ss.android.ugc.aweme.app.api.k
    public void a(j jVar) {
        this.f34983a = jVar;
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public void setRequestId(String str) {
        this.f34986e = str;
    }

    @Override // com.ss.android.ugc.aweme.app.api.g
    public void setRequestInfo(com.bytedance.frameworks.baselib.network.http.a aVar) {
        this.f34987f = aVar;
    }

    b(a<T> aVar) {
        this.f34986e = "";
        this.f34985c = aVar;
    }

    public final void a(a<T> aVar) {
        this.f34985c.a(aVar);
        this.f34985c = null;
    }

    /* synthetic */ b(a aVar, byte b2) {
        this(aVar);
    }
}
