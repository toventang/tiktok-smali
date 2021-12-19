package com.ss.android.ugc.aweme.story.record.recordcontrol;

import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import h.f.b.l;

public final class b extends a {
    static {
        Covode.recordClassIndex(90520);
    }

    @Override // com.ss.android.ugc.aweme.story.record.recordcontrol.a
    public final void a() {
        bj.a("AudioCaptureControlStrategy initAudio() called");
        this.f138419a.c(PrivacyCert.Builder.Companion.with("bpea-304").usage("When users are on the video shooting page, they can use the camera and microphone to create video works in TikTok. ").tag("").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(ASCameraView aSCameraView) {
        super(aSCameraView);
        l.d(aSCameraView, "");
    }
}
