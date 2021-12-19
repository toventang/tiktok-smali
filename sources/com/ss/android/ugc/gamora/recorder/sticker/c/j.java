package com.ss.android.ugc.gamora.recorder.sticker.c;

import androidx.lifecycle.LiveData;
import com.bytedance.als.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.sticker.a.a;
import com.ss.android.ugc.aweme.sharedar.b;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.f;
import java.util.List;

public interface j extends a {
    static {
        Covode.recordClassIndex(97868);
    }

    g<Boolean> A();

    LiveData<Boolean> B();

    e C();

    c D();

    f E();

    b F();

    void G();

    void H();

    List<String> I();

    void J();

    void K();

    void a(com.ss.android.ugc.aweme.sticker.presenter.g gVar);

    void e(boolean z);

    void f(boolean z);

    g<Boolean> z();
}
