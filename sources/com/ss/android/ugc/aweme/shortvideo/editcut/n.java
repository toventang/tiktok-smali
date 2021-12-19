package com.ss.android.ugc.aweme.shortvideo.editcut;

import com.bytedance.als.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h;
import h.p;
import java.util.List;

public interface n extends b {
    static {
        Covode.recordClassIndex(84186);
    }

    void a(int i2, int i3);

    void a(h hVar);

    void a(p<Integer, Integer> pVar, p<Integer, Integer> pVar2);

    void a(boolean z, boolean z2);

    List<VideoSegment> b();

    void b(int i2, int i3);

    void b(List<? extends VideoSegment> list);

    void b(boolean z);

    void c(boolean z);

    void s();

    void t();

    void u();

    void v();

    void x();
}
