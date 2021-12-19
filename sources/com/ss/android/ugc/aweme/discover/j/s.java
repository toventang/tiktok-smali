package com.ss.android.ugc.aweme.discover.j;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.discover.ui.af;

public final class s extends g<r> implements af {
    static {
        Covode.recordClassIndex(50527);
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.af
    public final /* bridge */ /* synthetic */ a e() {
        return (a) this.f76396h;
    }

    public s() {
        a((f) new r());
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.af
    public final boolean d() {
        if (this.f76396h == null || !((a) this.f76396h).isHasMore()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.discover.j.g, com.ss.android.ugc.aweme.discover.ui.af
    public final void a(String str) {
        if (this.f76396h != null) {
            ((f) this.f76396h).b(str);
        }
    }
}
