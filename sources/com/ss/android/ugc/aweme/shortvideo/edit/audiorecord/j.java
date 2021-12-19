package com.ss.android.ugc.aweme.shortvideo.edit.audiorecord;

import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.VEAudioRecorder;
import com.ss.android.vesdk.z;
import h.f.b.l;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    final VEAudioRecorder f126933a = new VEAudioRecorder();

    static {
        Covode.recordClassIndex(83273);
    }

    public final String a() {
        try {
            String a2 = this.f126933a.a();
            l.b(a2, "");
            return a2;
        } catch (z unused) {
            return "";
        }
    }

    public final long a(PrivacyCert privacyCert) {
        return this.f126933a.a(privacyCert);
    }
}
