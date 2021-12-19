package com.weekend.recorder.api;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.weekend.recorder.api.a.a;
import com.weekend.recorder.api.a.b;

public interface IAutoRecorder {
    static {
        Covode.recordClassIndex(103862);
    }

    boolean getWeekEndRecorderSwitch(Context context);

    void init(String str, String str2, b bVar, a aVar);

    void switchEnable(Context context, boolean z);
}
