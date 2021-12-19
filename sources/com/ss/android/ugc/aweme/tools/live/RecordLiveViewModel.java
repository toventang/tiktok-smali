package com.ss.android.ugc.aweme.tools.live;

import androidx.lifecycle.ac;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.d;
import com.ss.android.ugc.asve.recorder.c.a;
import com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import h.f.b.l;

public final class RecordLiveViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public IRecordingOperationPanel f140216a;

    /* renamed from: b  reason: collision with root package name */
    public d f140217b;

    /* renamed from: c  reason: collision with root package name */
    public a f140218c;

    /* renamed from: d  reason: collision with root package name */
    public ShortVideoContext f140219d;

    static {
        Covode.recordClassIndex(91612);
    }

    public final d a() {
        d dVar = this.f140217b;
        if (dVar == null) {
            l.a("cameraApiComponent");
        }
        return dVar;
    }
}
