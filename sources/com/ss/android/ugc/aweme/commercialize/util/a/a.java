package com.ss.android.ugc.aweme.commercialize.util.a;

import android.net.Uri;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.log.a.a;
import h.f.b.l;
import h.m.p;
import h.z;
import java.util.concurrent.Callable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile b f75391a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f75392b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final String f75393c = (com.ss.android.ugc.aweme.commercialize.util.adrouter.a.f75399a.a() + "://adx");

    private a() {
    }

    static {
        Covode.recordClassIndex(46529);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.util.a.a$a  reason: collision with other inner class name */
    static final class CallableC1717a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Uri f75394a;

        static {
            Covode.recordClassIndex(46530);
        }

        CallableC1717a(Uri uri) {
            this.f75394a = uri;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            Uri uri = this.f75394a;
            b bVar = a.f75391a;
            a.f75391a = null;
            if (bVar != null) {
                String str2 = bVar.f75395a;
                if (str2 == null || str2.length() <= 0) {
                    String queryParameter = uri.getQueryParameter("tag");
                    if (queryParameter == null || queryParameter.length() <= 0) {
                        str = "draw_ad";
                    } else {
                        str = uri.getQueryParameter("tag");
                    }
                } else {
                    str = bVar.f75395a;
                }
                a.b a2 = com.ss.android.ugc.aweme.commercialize.log.a.a.a();
                a2.f74715a = str;
                a2.f74716b = "open_url_appback";
                a2.a(Long.valueOf(bVar.f75396b)).c(bVar.f75397c).b(Long.valueOf(bVar.f75398d)).c();
                if (str != null) {
                    com.bytedance.ies.ugc.aweme.rich.a.a.a(str, "open_url_appback", String.valueOf(bVar.f75396b), bVar.f75397c, String.valueOf(bVar.f75398d)).c();
                }
            }
            return z.f158842a;
        }
    }

    private static boolean a(String str) {
        if (str == null || !p.a((CharSequence) str, (CharSequence) "__back_url__", false)) {
            return false;
        }
        return true;
    }

    public static void a(Uri uri) {
        if (uri != null) {
            String uri2 = uri.toString();
            l.b(uri2, "");
            if (p.b(uri2, f75393c, false)) {
                i.b(new CallableC1717a(uri), i.f4824a);
            }
        }
    }

    public static final String a(String str, String str2) {
        if (!a(str)) {
            return str;
        }
        if (str2 != null && str2.length() > 0) {
            str = Uri.parse(str).buildUpon().appendQueryParameter("tag", str2).build().toString();
        }
        if (str == null) {
            return null;
        }
        String encode = Uri.encode(f75393c);
        l.b(encode, "");
        return p.a(str, "__back_url__", encode, false);
    }
}
