package com.ss.android.ugc.aweme.video.preload.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.speedpredictor.api.e;
import com.ss.android.ugc.h.i;

final class a {

    /* renamed from: com.ss.android.ugc.aweme.video.preload.b.a$a  reason: collision with other inner class name */
    static class C3825a {
        static {
            Covode.recordClassIndex(93982);
        }
    }

    static {
        Covode.recordClassIndex(93981);
    }

    /* access modifiers changed from: package-private */
    public static class b {
        static {
            Covode.recordClassIndex(93984);
        }

        static i a(e eVar) {
            if (eVar == null) {
                return null;
            }
            return new i(eVar.f134669c, eVar.f134667a / 8.0d, (long) eVar.f134668b, eVar.f134670d);
        }
    }

    static class c {
        static {
            Covode.recordClassIndex(93985);
        }

        static i[] a(e[] eVarArr) {
            if (eVarArr == null) {
                return null;
            }
            i[] iVarArr = new i[eVarArr.length];
            for (int i2 = 0; i2 < eVarArr.length; i2++) {
                iVarArr[i2] = b.a(eVarArr[i2]);
            }
            return iVarArr;
        }
    }
}
