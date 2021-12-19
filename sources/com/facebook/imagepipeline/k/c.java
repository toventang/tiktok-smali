package com.facebook.imagepipeline.k;

import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.n.an;
import com.facebook.imagepipeline.o.b;

public interface c extends an {
    static {
        Covode.recordClassIndex(29025);
    }

    void onRequestCancellation(String str);

    void onRequestFailure(b bVar, String str, Throwable th, boolean z);

    void onRequestStart(b bVar, Object obj, String str, boolean z);

    void onRequestSuccess(b bVar, String str, boolean z);
}
