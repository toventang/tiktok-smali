package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.a;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.b;
import com.google.android.play.core.b.bg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* access modifiers changed from: package-private */
public final class bm {

    /* renamed from: a  reason: collision with root package name */
    static final b f52892a = new b("ExtractorSessionStoreView");

    /* renamed from: b  reason: collision with root package name */
    final ac f52893b;

    /* renamed from: c  reason: collision with root package name */
    final bg<dj> f52894c;

    /* renamed from: d  reason: collision with root package name */
    final ay f52895d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<Integer, bj> f52896e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    final ReentrantLock f52897f = new ReentrantLock();

    /* renamed from: g  reason: collision with root package name */
    private final bg<Executor> f52898g;

    static {
        Covode.recordClassIndex(32705);
    }

    bm(ac acVar, bg<dj> bgVar, ay ayVar, bg<Executor> bgVar2) {
        this.f52893b = acVar;
        this.f52894c = bgVar;
        this.f52895d = ayVar;
        this.f52898g = bgVar2;
    }

    static String a(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            return stringArrayList.get(0);
        }
        throw new au("Session without pack received.");
    }

    static <T> List<T> a(List<T> list) {
        return list == null ? Collections.emptyList() : list;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        a(new bg(this, i2));
    }

    /* access modifiers changed from: package-private */
    public final bj b(int i2) {
        Map<Integer, bj> map = this.f52896e;
        Integer valueOf = Integer.valueOf(i2);
        bj bjVar = map.get(valueOf);
        if (bjVar != null) {
            return bjVar;
        }
        throw new au(a.a("Could not find session %d while trying to get it", new Object[]{valueOf}), i2);
    }

    /* access modifiers changed from: package-private */
    public final void c(int i2) {
        a(new bf(this, i2));
    }

    /* access modifiers changed from: package-private */
    public final <T> T a(bl<T> blVar) {
        try {
            this.f52897f.lock();
            return blVar.a();
        } finally {
            this.f52897f.unlock();
        }
    }
}
