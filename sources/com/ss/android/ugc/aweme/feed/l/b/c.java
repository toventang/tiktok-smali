package com.ss.android.ugc.aweme.feed.l.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    a f93587a;

    /* renamed from: b  reason: collision with root package name */
    public final int f93588b;

    /* renamed from: c  reason: collision with root package name */
    private final d f93589c;

    public interface a {
        static {
            Covode.recordClassIndex(59279);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(59278);
    }

    @Override // com.ss.android.ugc.aweme.feed.l.b.a
    public final void a() {
        a aVar = this.f93587a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final String toString() {
        return "nodeId : " + this.f93588b;
    }

    public final void a(a aVar) {
        this.f93587a = aVar;
        this.f93589c.a(this);
    }

    public c(int i2, d dVar) {
        l.d(dVar, "");
        this.f93588b = i2;
        this.f93589c = dVar;
    }
}
