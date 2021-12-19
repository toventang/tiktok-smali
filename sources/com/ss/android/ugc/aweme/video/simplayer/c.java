package com.ss.android.ugc.aweme.video.simplayer;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.api.l;
import com.ss.android.ugc.aweme.video.simplayer.f;

final class c implements f.a {

    /* renamed from: a  reason: collision with root package name */
    private l f143856a;

    static {
        Covode.recordClassIndex(94137);
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.f.a
    public final void a() {
        this.f143856a.a(0.0f, 0.0f);
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.f.a
    public final void b() {
        this.f143856a.a(1.0f, 1.0f);
    }

    c(l lVar) {
        this.f143856a = lVar;
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.f.a
    public final void a(String str) {
        this.f143856a.b(str);
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.f.a
    public final void a(float f2, float f3) {
        this.f143856a.a(f2, f3);
    }
}
