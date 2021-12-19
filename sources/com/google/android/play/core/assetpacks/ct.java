package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.tasks.d;
import java.util.HashMap;
import java.util.List;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ct implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final cw f53009a;

    static {
        Covode.recordClassIndex(32739);
    }

    ct(cw cwVar) {
        this.f53009a = cwVar;
    }

    public final void run() {
        cw cwVar = this.f53009a;
        dj a2 = cwVar.f53014c.a();
        ac acVar = cwVar.f53013b;
        HashMap hashMap = new HashMap();
        for (String str : acVar.a().keySet()) {
            hashMap.put(str, Long.valueOf(acVar.c(str)));
        }
        d<List<String>> a3 = a2.a(hashMap);
        ac acVar2 = cwVar.f53013b;
        acVar2.getClass();
        a3.a(cwVar.f53015d.a(), new cu(acVar2));
        a3.a(cwVar.f53015d.a(), cv.f53011a);
    }
}
