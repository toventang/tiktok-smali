package com.bytedance.android.live.publicscreen.impl.e;

import android.text.TextUtils;
import com.bytedance.android.live.a.a.b.a;
import com.bytedance.android.live.network.model.b;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class p implements f {

    /* renamed from: a  reason: collision with root package name */
    private final h f12363a;

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.android.live.publicscreen.impl.model.f f12364b;

    /* renamed from: c  reason: collision with root package name */
    private final long f12365c;

    static {
        Covode.recordClassIndex(6795);
    }

    p(h hVar, com.bytedance.android.live.publicscreen.impl.model.f fVar, long j2) {
        this.f12363a = hVar;
        this.f12364b = fVar;
        this.f12365c = j2;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        h hVar = this.f12363a;
        com.bytedance.android.live.publicscreen.impl.model.f fVar = this.f12364b;
        long j2 = this.f12365c;
        Throwable th = (Throwable) obj;
        fVar.b(false);
        fVar.a(true);
        hVar.c(fVar);
        if (th instanceof b) {
            a aVar = (a) th;
            if (!TextUtils.isEmpty(aVar.getPrompt())) {
                b.a.a("livesdk_translate_comment").a(hVar.f12348m.f12208l).a("user_type", hVar.f12348m.f12205i ? "anchor" : "user").a("to_user_id", j2).a("translation_failed_reason", aVar.getPrompt()).a("translation_succeed", "0").b();
            }
        }
    }
}
