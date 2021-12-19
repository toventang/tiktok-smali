package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.IOException;

final /* synthetic */ class cd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final ac f52953a;

    static {
        Covode.recordClassIndex(32723);
    }

    cd(ac acVar) {
        this.f52953a = acVar;
    }

    public final void run() {
        ac acVar = this.f52953a;
        for (File file : acVar.b()) {
            if (file.listFiles() != null) {
                ac.a(file);
                long b2 = ac.b(file);
                if (((long) acVar.f52771b.a()) != b2) {
                    try {
                        new File(new File(file, String.valueOf(b2)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        ac.f52768a.b("Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File file2 : file.listFiles()) {
                    ac.a(file2);
                }
            }
        }
    }
}
