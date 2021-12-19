package com.ss.android.ugc.aweme.simkit.impl.bitrateselector;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bitrateselector.a.b.b;
import com.ss.android.ugc.aweme.bitrateselector.a.c;
import com.ss.android.ugc.aweme.bitrateselector.a.g;
import com.ss.android.ugc.aweme.simkit.d;
import com.ss.android.ugc.f.a.a.a.a.a;
import com.ss.android.ugc.playerkit.simapicommon.a.i;
import java.util.Map;

public final class h {
    static {
        Covode.recordClassIndex(87364);
    }

    public static Map<String, Object> a(i iVar, double d2, g gVar) {
        a a2;
        if (gVar == g.INTELLIGENT) {
            return new com.ss.android.ugc.aweme.bitrateselector.a.b.a().a();
        }
        b bVar = new b();
        bVar.f68697a.put("internet_speed", Integer.valueOf((int) d2));
        Map<String, Object> map = bVar.f68697a;
        map.put("source_id", iVar.getSourceId());
        c autoBitrateSetStrategy = d.a().b().getCommonConfig().getAutoBitrateSetStrategy();
        if (!(autoBitrateSetStrategy == null || (a2 = autoBitrateSetStrategy.a(iVar.getSourceId())) == null)) {
            map.put("KEY_AUTO_BITRATE_SET", a2);
        }
        return map;
    }
}
