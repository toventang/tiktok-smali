package com.ss.android.ugc.aweme.simkit.impl.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.simkit.api.d;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    private d f133503a;

    static {
        Covode.recordClassIndex(87328);
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.d
    public final void b() {
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f133504a = new b();

        static {
            Covode.recordClassIndex(87329);
        }
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.d
    public final void a() {
        d dVar = this.f133503a;
        if (dVar != null) {
            dVar.a();
        }
    }

    public b() {
        if (com.ss.android.ugc.aweme.simkit.d.a().b().getCommonConfig().getSuperResolutionStrategyConfigV2() != null) {
            this.f133503a = new c();
        } else if (com.ss.android.ugc.aweme.simkit.d.a().b().getCommonConfig().getSuperResolutionStrategyConfig() != null) {
            this.f133503a = new a();
        }
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.d
    public final int a(String str, boolean z, long j2, int i2, String str2, float f2) {
        d dVar = this.f133503a;
        if (dVar == null) {
            return 1;
        }
        return dVar.a(str, z, j2, i2, str2, f2);
    }
}
