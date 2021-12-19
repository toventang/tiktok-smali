package com.ss.android.ugc.aweme.setting.page.backgroundaudio;

import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.experiment.c;

public final class BGAudioViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public final t<Boolean> f122419a;

    /* renamed from: b  reason: collision with root package name */
    public final t<c.a> f122420b;

    static {
        Covode.recordClassIndex(80275);
    }

    public BGAudioViewModel() {
        t<Boolean> tVar = new t<>();
        tVar.setValue(Boolean.valueOf(c.b()));
        this.f122419a = tVar;
        t<c.a> tVar2 = new t<>();
        tVar2.setValue(c.e());
        this.f122420b = tVar2;
    }
}
