package com.ss.android.ugc.aweme.search.l.a.a;

import com.bytedance.common.utility.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.a.d;

public final class c extends a {

    /* renamed from: b  reason: collision with root package name */
    public l.a f121312b;

    /* renamed from: c  reason: collision with root package name */
    private String f121313c;

    /* renamed from: d  reason: collision with root package name */
    private d f121314d;

    static {
        Covode.recordClassIndex(79068);
    }

    public final String toString() {
        return "SearchChainDeviceEnv(searchDomain=" + this.f121313c + ", network=" + this.f121312b + ", bandWidthQuality=" + this.f121314d + ')';
    }

    public final void a(l.a aVar) {
        if (this.f121312b == null) {
            this.f121312b = aVar;
            String str = aVar;
            if (aVar == null) {
                str = "";
            }
            a("network", str);
        }
    }

    public final void a(d dVar) {
        if (this.f121314d == null) {
            this.f121314d = dVar;
            String str = dVar;
            if (dVar == null) {
                str = "";
            }
            a("band_width_quality", str);
        }
    }

    public final void a(String str) {
        if (this.f121313c == null) {
            this.f121313c = str;
            if (str == null) {
                str = "";
            }
            a("search_domain", str);
        }
    }
}
