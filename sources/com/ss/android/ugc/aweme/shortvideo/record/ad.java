package com.ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;
import java.io.File;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ad implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final u f130035a;

    /* renamed from: b  reason: collision with root package name */
    private final File f130036b;

    /* renamed from: c  reason: collision with root package name */
    private final int f130037c;

    static {
        Covode.recordClassIndex(85326);
    }

    ad(u uVar, File file, int i2) {
        this.f130035a = uVar;
        this.f130036b = file;
        this.f130037c = i2;
    }

    public final void run() {
        this.f130035a.a(this.f130036b, this.f130037c);
    }
}
