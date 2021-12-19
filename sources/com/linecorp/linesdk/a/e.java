package com.linecorp.linesdk.a;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final d f54977a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f54978b;

    static {
        Covode.recordClassIndex(34527);
    }

    public final int hashCode() {
        return (this.f54977a.hashCode() * 31) + this.f54978b.hashCode();
    }

    public final String toString() {
        return "IssueAccessTokenResult{accessToken=" + ((Object) "#####") + ", permissions=" + this.f54978b + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f54977a.equals(eVar.f54977a)) {
            return false;
        }
        return this.f54978b.equals(eVar.f54978b);
    }

    public e(d dVar, List<String> list) {
        this.f54977a = dVar;
        this.f54978b = Collections.unmodifiableList(list);
    }
}
