package com.ss.android.ugc.aweme.sticker.q.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.senor.d;
import com.ss.android.vesdk.bc;
import h.f.b.l;

public final class c implements d {

    /* renamed from: b  reason: collision with root package name */
    public static final c f135437b = new c();

    /* renamed from: c  reason: collision with root package name */
    private static final bc f135438c = bc.a();

    /* renamed from: d  reason: collision with root package name */
    private static float[] f135439d = d.a.f135689a;

    private c() {
    }

    static {
        Covode.recordClassIndex(88481);
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.d
    public final void a(boolean z) {
        bc bcVar = f135438c;
        l.b(bcVar, "");
        bcVar.f151067e = z;
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.d
    public final void a(float[] fArr) {
        l.d(fArr, "");
        f135438c.f151066d = fArr;
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.d
    public final void a(float[] fArr, double d2) {
        bc bcVar = f135438c;
        if (fArr == null || fArr.length != 4) {
            bcVar.f151065c = bc.f151061a;
        } else {
            bcVar.f151065c = fArr;
        }
        bcVar.f151064b = d2;
    }
}
