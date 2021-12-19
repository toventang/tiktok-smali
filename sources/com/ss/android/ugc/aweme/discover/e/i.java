package com.ss.android.ugc.aweme.discover.e;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;
import h.f.b.l;

public final class i implements b {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f80962a;

    static {
        Covode.recordClassIndex(50329);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof i) && l.a(this.f80962a, ((i) obj).f80962a);
        }
        return true;
    }

    public final int hashCode() {
        Bundle bundle = this.f80962a;
        if (bundle != null) {
            return bundle.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "OpenHotSpotEvent(toDetailBundle=" + this.f80962a + ")";
    }

    public i(Bundle bundle) {
        l.d(bundle, "");
        this.f80962a = bundle;
    }
}
