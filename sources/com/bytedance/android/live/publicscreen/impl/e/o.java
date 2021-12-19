package com.bytedance.android.live.publicscreen.impl.e;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.live.publicscreen.impl.api.a.a;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class o implements f {

    /* renamed from: a  reason: collision with root package name */
    private final h f12360a;

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.android.live.publicscreen.impl.model.f f12361b;

    /* renamed from: c  reason: collision with root package name */
    private final long f12362c;

    static {
        Covode.recordClassIndex(6794);
    }

    o(h hVar, com.bytedance.android.live.publicscreen.impl.model.f fVar, long j2) {
        this.f12360a = hVar;
        this.f12361b = fVar;
        this.f12362c = j2;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        h hVar = this.f12360a;
        com.bytedance.android.live.publicscreen.impl.model.f fVar = this.f12361b;
        long j2 = this.f12362c;
        d dVar = (d) obj;
        if (dVar == null || dVar.data == null) {
            fVar.a((CharSequence) null);
        } else {
            fVar.a(((a) dVar.data).f12213a);
            b.a.a("livesdk_translate_comment").a(hVar.f12348m.f12208l).a("user_type", hVar.f12348m.f12205i ? "anchor" : "user").a("translation_succeed", "1").a("to_user_id", j2).b();
        }
        fVar.b(false);
        fVar.a(true);
        hVar.c(fVar);
    }
}
