package com.ss.android.ugc.aweme.ce;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.c.a;
import com.bytedance.ies.powerpermissions.f;
import com.ss.android.ugc.aweme.ce.b;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b.AbstractC1579b f69817a;

    static {
        Covode.recordClassIndex(43048);
    }

    c(b.AbstractC1579b bVar) {
        this.f69817a = bVar;
    }

    @Override // com.bytedance.ies.powerpermissions.f
    public final void a(a[] aVarArr) {
        b.AbstractC1579b bVar = this.f69817a;
        if (bVar != null) {
            String[] strArr = new String[aVarArr.length];
            int[] iArr = new int[aVarArr.length];
            int i2 = 0;
            for (a aVar : aVarArr) {
                strArr[i2] = aVar.f34454a;
                iArr[i2] = aVar.f34455b == a.EnumC0768a.GRANTED ? 0 : -1;
                i2++;
            }
            bVar.a(strArr, iArr);
        }
    }
}
