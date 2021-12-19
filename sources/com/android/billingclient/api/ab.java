package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.h;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.h.a;
import com.google.android.gms.internal.h.b;
import java.util.concurrent.Callable;

final class ab implements Callable<Void> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ i f5789a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ j f5790b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ e f5791c;

    static {
        Covode.recordClassIndex(2427);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Void call() {
        int i2;
        String str;
        e eVar = this.f5791c;
        i iVar = this.f5789a;
        j jVar = this.f5790b;
        String str2 = iVar.f5856a;
        try {
            String valueOf = String.valueOf(str2);
            if (valueOf.length() != 0) {
                "Consuming purchase with token: ".concat(valueOf);
            } else {
                new String("Consuming purchase with token: ");
            }
            if (eVar.f5829j) {
                a aVar = eVar.f5824e;
                String packageName = eVar.f5823d.getPackageName();
                boolean z = eVar.f5829j;
                String str3 = eVar.f5821b;
                Bundle bundle = new Bundle();
                if (z) {
                    bundle.putString("playBillingLibraryVersion", str3);
                }
                Bundle c2 = aVar.c(packageName, str2, bundle);
                i2 = c2.getInt("RESPONSE_CODE");
                str = b.b(c2);
            } else {
                i2 = eVar.f5824e.a(eVar.f5823d.getPackageName(), str2);
                str = "";
            }
            h.a a2 = h.a();
            a2.f5854a = i2;
            a2.f5855b = str;
            h a3 = a2.a();
            if (i2 == 0) {
                eVar.a(new aj(jVar, a3, str2));
                return null;
            }
            eVar.a(new ai(i2, jVar, a3, str2));
            return null;
        } catch (Exception e2) {
            eVar.a(new ak(e2, jVar, str2));
            return null;
        }
    }

    ab(e eVar, i iVar, j jVar) {
        this.f5791c = eVar;
        this.f5789a = iVar;
        this.f5790b = jVar;
    }
}
