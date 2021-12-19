package com.bytedance.helios.sdk.f.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.b.n;
import com.bytedance.helios.api.config.ApiInfo;
import com.bytedance.helios.api.config.ControlConfig;
import com.bytedance.helios.sdk.utils.c;
import com.bytedance.helios.sdk.utils.f;
import h.f.b.l;
import h.m.p;
import java.util.List;
import java.util.Map;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f30963a;

    static {
        Covode.recordClassIndex(17963);
    }

    public d(boolean z) {
        this.f30963a = z;
    }

    @Override // com.bytedance.helios.sdk.f.a.b
    public final boolean a(n nVar, ApiInfo apiInfo) {
        boolean z;
        Map<String, String> extraInfo;
        l.c(nVar, "");
        l.c(apiInfo, "");
        ControlConfig controlConfig = (ControlConfig) nVar.y.f30653e;
        String str = (controlConfig == null || (extraInfo = controlConfig.getExtraInfo()) == null) ? null : extraInfo.get("permissions");
        if (nVar.f30673b != 102600 || str == null || p.a((CharSequence) str)) {
            z = true;
        } else {
            Object[] objArr = nVar.y.f30649a;
            Object[] objArr2 = objArr != null ? objArr[0] : null;
            List a2 = c.a(str, String[].class);
            if (objArr2 != null && (objArr2 instanceof Object[])) {
                Object[] objArr3 = objArr2;
                if (objArr3.length > 0) {
                    int size = a2.size();
                    z = false;
                    for (int i2 = 0; i2 < size; i2++) {
                        Object obj = a2.get(i2);
                        int length = objArr3.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            int i5 = i4 + 1;
                            if (l.a(objArr3[i3], obj)) {
                                if (this.f30963a) {
                                    objArr2[i4] = "";
                                }
                                nVar.w = true;
                                z = true;
                            }
                            i3++;
                            i4 = i5;
                        }
                    }
                    if (!z) {
                        return z;
                    }
                }
            }
            return false;
        }
        nVar.u.add("parameter");
        f.a("Helios-Control-Api", "ParameterCondition isBlock=" + this.f30963a + " id=" + nVar.f30673b + " startedTime=" + nVar.f30683l, (String) null, 12);
        return z;
    }
}
