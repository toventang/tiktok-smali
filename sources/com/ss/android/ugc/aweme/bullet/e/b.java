package com.ss.android.ugc.aweme.bullet.e;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bullet.e.a;
import h.f.b.l;
import java.util.Iterator;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f69286a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f69287b = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(42721);
    }

    public static c a(Uri uri) {
        l.d(uri, "");
        a aVar = f69286a;
        l.d(uri, "");
        Iterator<a.C1563a> it = aVar.f69283a.iterator();
        while (it.hasNext()) {
            a.C1563a next = it.next();
            if (l.a(next.f69284a, uri)) {
                it.remove();
                return next.f69285b;
            }
        }
        return null;
    }

    public static c b(Uri uri) {
        T t;
        l.d(uri, "");
        a aVar = f69286a;
        l.d(uri, "");
        Iterator<T> it = aVar.f69283a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (l.a(t.f69284a, uri)) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            return t2.f69285b;
        }
        return null;
    }

    public static void a(String str, h.f.a.b<? super Uri, c> bVar) {
        l.d(str, "");
        l.d(bVar, "");
        Uri parse = Uri.parse(str);
        l.b(parse, "");
        l.d(parse, "");
        l.d(bVar, "");
        a aVar = f69286a;
        l.d(parse, "");
        l.d(bVar, "");
        aVar.f69283a.add(new a.C1563a(parse, bVar.invoke(parse)));
    }
}
