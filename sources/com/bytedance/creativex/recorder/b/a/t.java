package com.bytedance.creativex.recorder.b.a;

import androidx.core.g.f;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.List;

public final class t extends b {

    /* renamed from: e  reason: collision with root package name */
    private static final f.b<t> f28204e = new f.b<>(1);

    /* renamed from: a  reason: collision with root package name */
    public List<TimeSpeedModelExtension> f28205a;

    /* renamed from: b  reason: collision with root package name */
    public long f28206b;

    /* renamed from: c  reason: collision with root package name */
    public TimeSpeedModelExtension f28207c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f28208d;

    private t() {
    }

    static {
        Covode.recordClassIndex(16535);
    }

    public final void a() {
        f28204e.release(this);
    }

    public final String toString() {
        return "RecordingProgressUpdateEvent{timeSpeedModels=" + this.f28205a + ", elapsedTimeInMicros=" + this.f28206b + '}';
    }

    public static t a(List<TimeSpeedModelExtension> list, long j2) {
        return a(list, j2, false);
    }

    public static t a(List<TimeSpeedModelExtension> list, long j2, TimeSpeedModelExtension timeSpeedModelExtension) {
        t a2 = a(list, j2, false);
        a2.f28207c = timeSpeedModelExtension;
        return a2;
    }

    public static t a(List<TimeSpeedModelExtension> list, long j2, boolean z) {
        t acquire = f28204e.acquire();
        if (acquire == null) {
            acquire = new t();
        }
        acquire.f28207c = null;
        acquire.f28205a = list;
        acquire.f28206b = j2;
        acquire.f28208d = z;
        return acquire;
    }
}
