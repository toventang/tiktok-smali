package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.property.db;
import com.ss.android.ugc.aweme.services.IVEABService;
import h.f.b.l;
import h.p;
import java.util.Map;

public final class VEABServiceImpl implements IVEABService {
    static {
        Covode.recordClassIndex(76838);
    }

    @Override // com.ss.android.ugc.aweme.services.IVEABService
    public final Map<String, db.a> getVESDKABPropertyMap() {
        return ez.b();
    }

    @Override // com.ss.android.ugc.aweme.services.IVEABService
    public final void clearPanel() {
        c.I.a().a();
    }

    @Override // com.ss.android.ugc.aweme.services.IVEABService
    public final p<Object, Integer> getABValue(db.a aVar) {
        l.d(aVar, "");
        return c.I.a(aVar);
    }

    @Override // com.ss.android.ugc.aweme.services.IVEABService
    public final void setABPanelValue(db.a aVar, String str) {
        l.d(aVar, "");
        ez ezVar = c.I;
        l.d(aVar, "");
        if (str == null) {
            ezVar.a().g(aVar);
            return;
        }
        db.b b2 = aVar.b();
        if (b2 != null) {
            int i2 = fa.f118531b[b2.ordinal()];
            if (i2 == 1) {
                try {
                    ezVar.a().a(aVar, Boolean.parseBoolean(str));
                } catch (Exception unused) {
                }
            } else if (i2 == 2) {
                ezVar.a().a(aVar, Integer.parseInt(str));
            } else if (i2 == 3) {
                ezVar.a().a(aVar, Long.parseLong(str));
            } else if (i2 == 4) {
                ezVar.a().a(aVar, Float.parseFloat(str));
            } else if (i2 == 5) {
                ezVar.a().a(aVar, str);
            }
        }
    }
}
