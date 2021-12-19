package com.google.android.datatransport.cct;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.backends.d;
import com.google.android.datatransport.runtime.backends.h;
import com.google.android.datatransport.runtime.backends.m;

public class CctBackendFactory implements d {
    static {
        Covode.recordClassIndex(30854);
    }

    @Override // com.google.android.datatransport.runtime.backends.d
    public m create(h hVar) {
        return new d(hVar.a(), hVar.b(), hVar.c());
    }
}
