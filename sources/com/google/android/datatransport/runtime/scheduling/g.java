package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import dagger.a.c;
import dagger.a.f;
import javax.a.a;

public final class g implements c<s> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Context> f49548a;

    /* renamed from: b  reason: collision with root package name */
    private final a<com.google.android.datatransport.runtime.scheduling.a.c> f49549b;

    /* renamed from: c  reason: collision with root package name */
    private final a<com.google.android.datatransport.runtime.scheduling.jobscheduling.g> f49550c;

    /* renamed from: d  reason: collision with root package name */
    private final a<com.google.android.datatransport.runtime.d.a> f49551d;

    static {
        Covode.recordClassIndex(31001);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        Object aVar;
        Context context = this.f49548a.get();
        com.google.android.datatransport.runtime.scheduling.a.c cVar = this.f49549b.get();
        com.google.android.datatransport.runtime.scheduling.jobscheduling.g gVar = this.f49550c.get();
        com.google.android.datatransport.runtime.d.a aVar2 = this.f49551d.get();
        if (Build.VERSION.SDK_INT >= 21) {
            aVar = new e(context, cVar, gVar);
        } else {
            aVar = new com.google.android.datatransport.runtime.scheduling.jobscheduling.a(context, cVar, aVar2, gVar);
        }
        return f.a(aVar, "Cannot return null from a non-@Nullable @Provides method");
    }

    public g(a<Context> aVar, a<com.google.android.datatransport.runtime.scheduling.a.c> aVar2, a<com.google.android.datatransport.runtime.scheduling.jobscheduling.g> aVar3, a<com.google.android.datatransport.runtime.d.a> aVar4) {
        this.f49548a = aVar;
        this.f49549b = aVar2;
        this.f49550c = aVar3;
        this.f49551d = aVar4;
    }
}
