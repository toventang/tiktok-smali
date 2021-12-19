package com.ss.android.ug.bus;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ug.bus.c;
import com.ss.android.ugc.aweme.au;
import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
public class UgCallbackCenter$2 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ConcurrentHashMap f61860a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c.a f61861b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Type f61862c;

    static {
        Covode.recordClassIndex(38023);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* access modifiers changed from: package-private */
    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        this.f61860a.remove(this.f61861b);
        if (this.f61860a.isEmpty()) {
            c.f61870a.remove(this.f61862c);
        }
    }

    UgCallbackCenter$2(ConcurrentHashMap concurrentHashMap, c.a aVar, Type type) {
        this.f61860a = concurrentHashMap;
        this.f61861b = aVar;
        this.f61862c = type;
    }
}
