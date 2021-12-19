package com.bytedance.creativex.recorder.gesture.api;

import android.view.ScaleGestureDetector;
import com.bytedance.als.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout;

public interface b extends com.bytedance.als.b {
    static {
        Covode.recordClassIndex(16653);
    }

    d a(int i2);

    void a(d dVar);

    void a(d dVar, int i2);

    void a(h hVar);

    void a(boolean z);

    void b(h hVar);

    h<VideoRecordGestureLayout.a> c();

    h<ScaleGestureDetector> d();
}
