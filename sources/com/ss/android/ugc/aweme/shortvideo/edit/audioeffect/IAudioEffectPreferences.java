package com.ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.a.a;
import com.bytedance.cukaie.closet.a.b;
import com.bytedance.cukaie.closet.a.c;

@a(a = "AudioEffect")
public interface IAudioEffectPreferences {
    static {
        Covode.recordClassIndex(83164);
    }

    @c(a = "resource_version")
    int getResourceVersion(int i2);

    @b(a = "resource_version")
    void setResourceVersion(int i2);
}
