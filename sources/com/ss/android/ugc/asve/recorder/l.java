package com.ss.android.ugc.asve.recorder;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.runtime.e;
import java.io.File;

public final class l extends e {

    /* renamed from: d  reason: collision with root package name */
    private final e f62310d;

    static {
        Covode.recordClassIndex(38287);
    }

    @Override // com.ss.android.vesdk.runtime.e
    public final String b() {
        String absolutePath = this.f62310d.c().getAbsolutePath();
        h.f.b.l.b(absolutePath, "");
        return absolutePath;
    }

    @Override // com.ss.android.vesdk.runtime.e
    public final String c() {
        String absolutePath = this.f62310d.d().getAbsolutePath();
        h.f.b.l.b(absolutePath, "");
        return absolutePath;
    }

    @Override // com.ss.android.vesdk.runtime.e
    public final String a() {
        String absolutePath = this.f62310d.b().getAbsolutePath();
        new File(absolutePath).mkdirs();
        h.f.b.l.b(absolutePath, "");
        return absolutePath;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(e eVar) {
        super(eVar.a().getAbsolutePath());
        h.f.b.l.d(eVar, "");
        this.f62310d = eVar;
    }
}
