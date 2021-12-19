package com.ss.android.ugc.gamora.editor.subtitle;

import androidx.lifecycle.LiveData;
import com.bytedance.als.b;
import com.bytedance.als.h;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;

public interface e extends b {
    static {
        Covode.recordClassIndex(96793);
    }

    h<List<com.ss.android.ugc.aweme.sticker.data.h>> a();

    void a(VideoPublishEditModel videoPublishEditModel, int i2);

    void a(List<com.ss.android.ugc.aweme.sticker.data.h> list);

    void b();

    void c();

    void e();

    void f();

    void g();

    boolean h();

    LiveData<Boolean> i();
}
