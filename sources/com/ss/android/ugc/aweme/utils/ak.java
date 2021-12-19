package com.ss.android.ugc.aweme.utils;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ak implements g {

    /* renamed from: a  reason: collision with root package name */
    private final String f142634a;

    static {
        Covode.recordClassIndex(93305);
    }

    ak(String str) {
        this.f142634a = str;
    }

    @Override // b.g
    public final Object then(i iVar) {
        if (iVar == null) {
            boolean z = ai.f142631a;
            return null;
        } else if (!iVar.c()) {
            iVar.b();
            return null;
        } else if (!ai.f142631a) {
            return null;
        } else {
            iVar.e();
            return null;
        }
    }
}
