package com.ss.android.ugc.aweme.deeplink.b;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.b;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.DetailFeedServiceImpl;
import com.ss.android.ugc.aweme.aw;
import com.ss.android.ugc.aweme.deeplink.d;
import com.ss.android.ugc.aweme.deeplink.n;
import com.ss.android.ugc.tiktok.security.a.a;
import h.f.b.l;
import h.p;
import java.util.HashMap;
import java.util.Objects;

public final class c extends b {
    static {
        Covode.recordClassIndex(49354);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.b.b
    public final p<Boolean, String> a(d dVar, HashMap<String, Object> hashMap) {
        b a2;
        Class<?> cls;
        l.d(dVar, "");
        l.d(hashMap, "");
        Uri uri = dVar.f79465e;
        Activity activity = dVar.f79464d;
        Bundle bundle = null;
        aw awVar = null;
        for (aw awVar2 : n.a.b()) {
            String scheme = uri.getScheme();
            if (scheme == null) {
                scheme = "";
            }
            l.b(scheme, "");
            String host = uri.getHost();
            if (host == null) {
                host = "";
            }
            l.b(host, "");
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            l.b(path, "");
            if (awVar2.a(uri, scheme, host, path)) {
                awVar = awVar2;
            }
        }
        if (!(awVar == null || (cls = awVar.getClass()) == null)) {
            cls.getSimpleName();
        }
        a(uri, dVar, hashMap);
        Object obj = dVar.f79462b.get("from_token");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object obj2 = dVar.f79462b.get("is_from_notification");
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        if (awVar != null) {
            String host2 = uri.getHost();
            if (host2 == null) {
                host2 = "";
            }
            l.b(host2, "");
            String path2 = uri.getPath();
            if (path2 == null) {
                path2 = "";
            }
            l.b(path2, "");
            Intent a3 = awVar.a(activity, uri, host2, path2, str, booleanValue, false);
            if (a3 != null) {
                ComponentName component = a3.getComponent();
                if (component == null) {
                    l.b();
                }
                l.b(component, "");
                if (TextUtils.equals(component.getClassName(), DetailFeedServiceImpl.b().a().getName()) && (a2 = b.a(activity)) != null) {
                    bundle = a2.a();
                }
                a.a(a3, activity);
                activity.startActivity(a3, bundle);
            } else {
                awVar.a(activity, uri, booleanValue);
            }
            a(awVar.a(uri));
            this.f79445b = true;
            com.ss.android.ugc.aweme.deeplink.d.c.d(this.f79444a);
        }
        com.ss.android.ugc.aweme.deeplink.d.c.a("independent_transfer", LiveNetAdaptiveHurryTimeSetting.DEFAULT, dVar.f79465e, "compatible command");
        activity.finish();
        return new p<>(Boolean.valueOf(this.f79445b), this.f79444a);
    }
}
