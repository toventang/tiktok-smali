package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class aa extends z {

    /* renamed from: a  reason: collision with root package name */
    private final List<z> f124808a = new ArrayList();

    static {
        Covode.recordClassIndex(82006);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.z
    public final void a() {
        for (z zVar : new ArrayList(this.f124808a)) {
            zVar.a();
        }
        super.a();
    }

    public final void a(z zVar) {
        this.f124808a.add(zVar);
    }

    public final void b(z zVar) {
        this.f124808a.remove(zVar);
    }
}
