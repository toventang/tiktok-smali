package com.ss.android.ugc.aweme.shortvideo.upload;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.property.b;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.publish.a.c;
import com.ss.android.ugc.aweme.shortvideo.upload.c;
import com.ss.android.vesdk.r;
import dmt.av.video.z;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements r {

    /* renamed from: a  reason: collision with root package name */
    private final c.AnonymousClass1 f132109a;

    /* renamed from: b  reason: collision with root package name */
    private final SynthetiseResult f132110b;

    /* renamed from: c  reason: collision with root package name */
    private final z f132111c;

    static {
        Covode.recordClassIndex(86533);
    }

    e(c.AnonymousClass1 r1, SynthetiseResult synthetiseResult, z zVar) {
        this.f132109a = r1;
        this.f132110b = synthetiseResult;
        this.f132111c = zVar;
    }

    @Override // com.ss.android.vesdk.r
    public final void onCallback(int i2, int i3, float f2, String str) {
        c.AnonymousClass1 r3 = this.f132109a;
        SynthetiseResult synthetiseResult = this.f132110b;
        z zVar = this.f132111c;
        SynthetiseResult clone = synthetiseResult.clone();
        clone.ret = Math.round(f2);
        if (r3.a((Throwable) c.a.a().a(clone).a("Compiler failed. type = " + i2 + " ext = " + i3 + " f = " + f2 + " msg = " + str).a())) {
            if (i3 == -214) {
                b.f118355a = true;
            }
            zVar.w.s();
        }
    }
}
