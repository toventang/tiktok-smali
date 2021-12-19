package com.facebook.imagepipeline.q;

import com.bytedance.covode.number.Covode;
import com.facebook.h.c;
import com.facebook.imagepipeline.common.d;
import com.facebook.imagepipeline.j.e;
import java.io.OutputStream;

public interface b {
    static {
        Covode.recordClassIndex(29219);
    }

    boolean canResize(e eVar, com.facebook.imagepipeline.common.e eVar2, d dVar);

    boolean canTranscode(c cVar);

    String getIdentifier();

    a transcode(e eVar, OutputStream outputStream, com.facebook.imagepipeline.common.e eVar2, d dVar, c cVar, Integer num);
}
