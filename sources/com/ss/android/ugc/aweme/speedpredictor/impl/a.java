package com.ss.android.ugc.aweme.speedpredictor.impl;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.speedpredictor.api.e;
import com.ss.android.ugc.h.i;

final class a {

    /* renamed from: com.ss.android.ugc.aweme.speedpredictor.impl.a$a  reason: collision with other inner class name */
    static class C3501a {
        static {
            Covode.recordClassIndex(87996);
        }
    }

    static {
        Covode.recordClassIndex(87995);
    }

    /* access modifiers changed from: package-private */
    public static class b {
        static {
            Covode.recordClassIndex(87998);
        }

        static e a(i iVar) {
            if (iVar == null) {
                return null;
            }
            e eVar = new e(iVar.f148520c * 8.0d, (double) iVar.f148521d);
            eVar.f134670d = iVar.f148522e;
            return eVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static class c {
        static {
            Covode.recordClassIndex(87999);
        }

        static e[] a(i[] iVarArr) {
            if (iVarArr == null) {
                return null;
            }
            e[] eVarArr = new e[iVarArr.length];
            for (int i2 = 0; i2 < iVarArr.length; i2++) {
                eVarArr[i2] = b.a(iVarArr[i2]);
            }
            return eVarArr;
        }
    }
}
