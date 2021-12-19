package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class au extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    final int f52834a;

    static {
        Covode.recordClassIndex(32686);
    }

    au(String str) {
        super(str);
        this.f52834a = -1;
    }

    au(String str, int i2) {
        super(str);
        this.f52834a = i2;
    }

    au(String str, Exception exc) {
        super(str, exc);
        this.f52834a = -1;
    }

    au(String str, Exception exc, int i2) {
        super(str, exc);
        this.f52834a = i2;
    }
}
