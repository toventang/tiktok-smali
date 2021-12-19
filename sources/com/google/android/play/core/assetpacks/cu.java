package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.tasks.b;
import java.io.File;
import java.util.List;

final /* synthetic */ class cu implements b {

    /* renamed from: a  reason: collision with root package name */
    private final ac f53010a;

    static {
        Covode.recordClassIndex(32740);
    }

    cu(ac acVar) {
        this.f53010a = acVar;
    }

    @Override // com.google.android.play.core.tasks.b
    public final void a(Object obj) {
        ac acVar = this.f53010a;
        List list = (List) obj;
        int a2 = acVar.f52771b.a();
        for (File file : acVar.b()) {
            if (!list.contains(file.getName()) && ac.b(file) != ((long) a2)) {
                ac.c(file);
            }
        }
    }
}
