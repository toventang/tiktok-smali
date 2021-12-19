package com.ss.android.ugc.aweme.deeplink.b;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.RouteManager;
import com.ss.android.ugc.aweme.deeplink.actions.a.b;
import com.ss.android.ugc.aweme.deeplink.d;
import h.f.b.l;
import h.p;
import java.util.HashMap;

public final class a extends b {
    static {
        Covode.recordClassIndex(49352);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.b.b
    public final p<Boolean, String> a(d dVar, HashMap<String, Object> hashMap) {
        Class<?> cls;
        String targetPageName;
        String str = "";
        l.d(dVar, str);
        l.d(hashMap, str);
        Uri uri = dVar.f79465e;
        String str2 = "//" + uri.getHost() + uri.getPath();
        RouteManager instance = RouteManager.getInstance();
        l.b(instance, str);
        Object obj = null;
        try {
            cls = Class.forName(instance.getExternalRouteMap().get(str2));
        } catch (Throwable unused) {
            dVar.f79464d.finish();
            cls = null;
        }
        a(uri, dVar, hashMap);
        if (cls != null) {
            obj = cls.newInstance();
        }
        b bVar = (b) obj;
        if (bVar != null) {
            bVar.open(dVar.f79464d, uri.toString(), hashMap);
        }
        if (!(bVar == null || (targetPageName = bVar.getTargetPageName()) == null)) {
            str = targetPageName;
        }
        a(str);
        this.f79445b = true;
        return new p<>(Boolean.valueOf(this.f79445b), this.f79444a);
    }
}
