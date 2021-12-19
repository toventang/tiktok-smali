package com.ss.android.ugc.trill.share.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.u.a;
import com.ss.android.ugc.aweme.shortvideo.util.am;
import com.ss.android.ugc.aweme.video.e;
import java.io.File;

public final class f implements a {

    /* renamed from: a  reason: collision with root package name */
    private final String f150652a = am.d(d.a());

    static {
        Covode.recordClassIndex(99068);
    }

    @Override // com.bytedance.u.a
    public final String a() {
        return "CACHE";
    }

    @Override // com.bytedance.u.a
    public final boolean d() {
        return false;
    }

    @Override // com.bytedance.u.a
    public final boolean b() {
        e.e(this.f150652a);
        return true;
    }

    @Override // com.bytedance.u.a
    public final File c() {
        return new File(this.f150652a);
    }

    @Override // com.bytedance.u.a
    public final long e() {
        return e.d(this.f150652a);
    }
}
