package com.bytedance.apm.trace.model;

import com.bytedance.covode.number.Covode;
import java.util.List;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected List<String> f25389a;

    static {
        Covode.recordClassIndex(14759);
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        if (!this.f25389a.contains(str)) {
            this.f25389a.add(str);
        }
    }
}
