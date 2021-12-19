package com.ss.android.ugc.aweme.shortvideo.ad;

import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.basics.j;
import com.bytedance.bpea.basics.k;
import com.bytedance.bpea.store.a.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import h.f.b.l;

public final class a extends b {
    static {
        Covode.recordClassIndex(82049);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ad.b
    public final void a() {
        bj.a("AudioCaptureControlStrategy initAudio() called");
        this.f124882a.c(new PrivacyCert(new j("1055"), "Record audio  when shooting video.", new k[]{b.b()}));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ad.b
    public final void b() {
        bj.a("AudioCaptureControlStrategy releaseAudio() called");
        this.f124882a.d(new PrivacyCert(new j("1060"), "Record audio  when shooting video.", new k[]{b.b()}));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(ASCameraView aSCameraView) {
        super(aSCameraView);
        l.d(aSCameraView, "");
    }
}
