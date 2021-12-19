package com.bytedance.crash.ensure;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.crash.j.h;
import com.bytedance.services.apm.api.IEnsure;
import java.util.Collection;
import java.util.Map;

public class EnsureInitInner$1 implements IEnsure {
    static {
        Covode.recordClassIndex(16180);
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final void ensureNotReachHere() {
        d.a(null, "EnsureNotReachHere", null);
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final void reportLogException(Throwable th) {
        ensureNotReachHere(th);
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final boolean ensureFalse(boolean z) {
        if (z) {
            d.a(null, "EnsureFalse", null);
        }
        return z;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final boolean ensureNotNull(Object obj) {
        if (obj != null) {
            return true;
        }
        d.a(null, "EnsureNotNull", null);
        return false;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final void ensureNotReachHere(String str) {
        d.a(str, "EnsureNotReachHere", null);
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final boolean ensureTrue(boolean z) {
        if (!z) {
            d.a(null, "EnsureTrue", null);
        }
        return z;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final boolean ensureNotEmpty(Collection collection) {
        if (collection != null && collection.size() != 0) {
            return true;
        }
        d.a(null, "EnsureNotEmpty", null);
        return false;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final void ensureNotReachHere(Throwable th) {
        if (d.a(th)) {
            h.a(th, null, true);
        }
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final void reportLogException(Throwable th, String str) {
        ensureNotReachHere(th, str);
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final boolean ensureFalse(boolean z, String str) {
        if (z) {
            d.a(str, "EnsureFalse", null);
        }
        return z;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final boolean ensureNotNull(Object obj, String str) {
        if (obj != null) {
            return true;
        }
        d.a(str, "EnsureNotNull", null);
        return false;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final void ensureNotReachHere(String str, Map<String, String> map) {
        d.a(str, "EnsureNotReachHere", map);
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final boolean ensureTrue(boolean z, String str) {
        if (!z) {
            d.a(str, "EnsureTrue", null);
        }
        return z;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final void ensureNotReachHere(Throwable th, String str) {
        if (d.a(th)) {
            h.a(th, str, true);
        }
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final boolean ensureFalse(boolean z, String str, Map<String, String> map) {
        if (z) {
            d.a(str, "EnsureFalse", map);
        }
        return z;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final boolean ensureTrue(boolean z, String str, Map<String, String> map) {
        if (!z) {
            d.a(str, "EnsureTrue", map);
        }
        return z;
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final void reportLogException(int i2, Throwable th, String str) {
        if (d.a(th)) {
            h.a(th, str, false);
        }
    }

    @Override // com.bytedance.services.apm.api.IEnsure
    public final void ensureNotReachHere(Throwable th, String str, Map<String, String> map) {
        if (d.a(th)) {
            h.a(th, str, true, map, "core_exception_monitor");
        }
    }
}
