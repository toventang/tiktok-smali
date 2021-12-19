package com.ss.android.ugc.aweme.commercialize.tasks.a;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.c.a.c;
import com.bytedance.ies.ugc.aweme.rich.c.a.g;
import h.f.b.l;
import java.util.Objects;

public final class e extends com.bytedance.ies.ugc.aweme.rich.c.a.a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f75316d = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    private final String f75317e;

    static {
        Covode.recordClassIndex(46476);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(46477);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.c.a.b
    public final boolean b() {
        String str;
        if (TextUtils.isEmpty(this.f75317e)) {
            return false;
        }
        Uri parse = Uri.parse(this.f75317e);
        l.b(parse, "");
        String scheme = parse.getScheme();
        if (scheme != null) {
            Objects.requireNonNull(scheme, "null cannot be cast to non-null type java.lang.String");
            str = scheme.toLowerCase();
            l.b(str, "");
        } else {
            str = null;
        }
        if (a(str) || l.a((Object) str, (Object) "aweme")) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.c.a.a
    public final g a() {
        String str;
        Uri parse = Uri.parse(this.f75317e);
        String str2 = "";
        l.b(parse, str2);
        String scheme = parse.getScheme();
        if (scheme != null) {
            Objects.requireNonNull(scheme, "null cannot be cast to non-null type java.lang.String");
            str = scheme.toLowerCase();
            l.b(str, str2);
        } else {
            str = null;
        }
        if (a(str)) {
            com.ss.android.ugc.aweme.commercialize.tasks.a.f75298a.a(this.f75317e);
            boolean a2 = com.ss.android.ugc.aweme.commercialize.tasks.a.f75298a.a(this.f35145b, this.f75317e, (String) null);
            com.ss.android.ugc.aweme.commercialize.tasks.a.f75298a.d(this.f75317e);
            if (!a2) {
                str2 = "handle sslocal scheme failed";
            }
            return new g(a2, str2);
        } else if (!l.a((Object) str, (Object) "aweme")) {
            return new g(false);
        } else {
            boolean b2 = com.ss.android.ugc.aweme.commercialize.tasks.a.f75298a.b(this.f75317e);
            if (!b2) {
                str2 = "handle aweme scheme failed";
            }
            return new g(b2, str2);
        }
    }

    private static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.equals("sslocal", str) || TextUtils.equals("localsdk", str)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(c cVar, Bundle bundle) {
        super(cVar, bundle);
        l.d(cVar, "");
        l.d(bundle, "");
        String string = bundle.getString("open_url", "");
        l.b(string, "");
        this.f75317e = string;
    }
}
