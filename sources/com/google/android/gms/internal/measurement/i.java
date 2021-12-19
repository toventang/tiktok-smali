package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.a.b;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.f;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final class i extends f.a {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f51007c = null;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f51008d = null;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Context f51009e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Bundle f51010f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ f f51011g;

    static {
        Covode.recordClassIndex(31866);
    }

    @Override // com.google.android.gms.internal.measurement.f.a
    public final void b() {
        String str;
        String str2;
        boolean z;
        boolean z2;
        int i2;
        try {
            this.f51011g.f50842d = new ArrayList();
            String str3 = null;
            if (f.a(this.f51007c, this.f51008d)) {
                str2 = this.f51008d;
                str = this.f51007c;
                str3 = this.f51011g.f50839a;
            } else {
                str = null;
                str2 = null;
            }
            f.a(this.f51009e);
            if (f.f50836e.booleanValue() || str != null) {
                z = true;
            } else {
                z = false;
            }
            f fVar = this.f51011g;
            fVar.f50845h = fVar.a(this.f51009e, z);
            if (this.f51011g.f50845h != null) {
                int a2 = DynamiteModule.a(this.f51009e, ModuleDescriptor.MODULE_ID);
                int a3 = DynamiteModule.a(this.f51009e, ModuleDescriptor.MODULE_ID, false);
                if (z) {
                    i2 = Math.max(a2, a3);
                    if (a3 < a2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    if (a2 > 0) {
                        a3 = a2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    i2 = a3;
                }
                this.f51011g.f50845h.initialize(b.a(this.f51009e), new zzae(31000, (long) i2, z2, str3, str, str2, this.f51010f), this.f50848a);
            }
        } catch (Exception e2) {
            this.f51011g.a(e2, true, false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    i(f fVar, String str, String str2, Context context, Bundle bundle) {
        super(fVar);
        this.f51011g = fVar;
        this.f51009e = context;
        this.f51010f = bundle;
    }
}
