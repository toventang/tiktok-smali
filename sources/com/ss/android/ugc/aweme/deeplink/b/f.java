package com.ss.android.ugc.aweme.deeplink.b;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.aw;
import com.ss.android.ugc.aweme.deeplink.n;
import h.f.b.l;
import java.util.HashMap;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<e, b> f79447a;

    /* renamed from: b  reason: collision with root package name */
    public static final f f79448b = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(49357);
        HashMap<e, b> hashMap = new HashMap<>();
        f79447a = hashMap;
        hashMap.put(e.TYPE_NONE, new d());
        hashMap.put(e.TYPE_COMMAND, new c());
        hashMap.put(e.TYPE_ACTION, new a());
    }

    public static boolean a(Uri uri) {
        for (aw awVar : n.a.b()) {
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
            if (awVar.a(uri, scheme, host, path)) {
                return true;
            }
        }
        return false;
    }
}
