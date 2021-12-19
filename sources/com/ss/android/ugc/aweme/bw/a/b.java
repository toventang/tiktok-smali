package com.ss.android.ugc.aweme.bw.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bw.a.c;
import com.ss.android.ugc.aweme.bw.a.d;
import java.util.Objects;

public class b<M extends c, V extends d> {

    /* renamed from: a  reason: collision with root package name */
    protected final String f69565a = getClass().getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    protected M f69566b;

    /* renamed from: c  reason: collision with root package name */
    protected V f69567c;

    static {
        Covode.recordClassIndex(42910);
    }

    public final void b() {
        M m2 = this.f69566b;
        if (m2 != null) {
            m2.onDestroy();
        }
        this.f69566b = null;
        this.f69567c = null;
    }

    public b(M m2, V v) {
        Objects.requireNonNull(m2, "Model can not null");
        Objects.requireNonNull(v, "View can not null");
        this.f69566b = m2;
        this.f69567c = v;
    }
}
