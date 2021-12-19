package com.ss.android.ugc.aweme.deeplink.c;

import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.deeplink.d;
import com.ss.android.ugc.aweme.deeplink.p;
import h.f.b.l;
import java.net.URLDecoder;
import java.util.Objects;

public final class c extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f79453a = new a((byte) 0);

    static {
        Covode.recordClassIndex(49362);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(49363);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.deeplink.c.b
    public final boolean a(d dVar) {
        String str = "";
        l.d(dVar, str);
        com.ss.android.ugc.aweme.deeplink.d.c.c("EntryNode");
        p pVar = dVar.f79463c;
        Intent intent = dVar.f79466f;
        Uri uri = dVar.f79465e;
        com.ss.android.ugc.aweme.deeplink.d.a aVar = new com.ss.android.ugc.aweme.deeplink.d.a(dVar.f79464d, dVar.f79466f);
        Object obj = dVar.f79462b.get("is_from_notification");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
        aVar.a(((Boolean) obj).booleanValue(), dVar.f79465e);
        k kVar = new k(pVar);
        Object obj2 = dVar.f79462b.get("is_from_notification");
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
        if (!((Boolean) obj2).booleanValue()) {
            kVar.a(dVar.f79464d, dVar.f79465e);
        }
        if (a(intent, "user_id") != null) {
            String a2 = a(intent, "user_id");
            if (a2 == null) {
                l.b();
            }
            pVar.e(a2);
        } else {
            String queryParameter = uri.getQueryParameter("params_url");
            if (queryParameter != null) {
                l.b(queryParameter, str);
                String queryParameter2 = Uri.parse(URLDecoder.decode(queryParameter)).getQueryParameter("user_id");
                if (queryParameter2 == null) {
                    queryParameter2 = str;
                }
                pVar.e(queryParameter2);
            }
        }
        String a3 = a(intent, "launch_method");
        if (a3 == null) {
            a3 = str;
        }
        pVar.a(a3);
        String a4 = a(intent, "page_source");
        if (a4 != null) {
            str = a4;
        }
        pVar.b(str);
        com.ss.android.ugc.aweme.deeplink.d.c.b("EntryNode");
        return true;
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
