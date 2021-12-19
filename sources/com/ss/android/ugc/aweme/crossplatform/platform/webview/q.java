package com.ss.android.ugc.aweme.crossplatform.platform.webview;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.settings.ag;
import com.ss.android.ugc.aweme.settings.ah;
import h.a.i;
import h.f.a.m;
import h.f.a.r;
import h.f.b.l;
import h.m.p;
import h.z;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public final class q {

    /* renamed from: b  reason: collision with root package name */
    public static final q f78917b = new q();

    /* renamed from: c  reason: collision with root package name */
    static final CopyOnWriteArrayList<String> f78918c = new CopyOnWriteArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    static final CopyOnWriteArrayList<String> f78919d = new CopyOnWriteArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public static final a f78920e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public r<? super WebView, ? super String, ? super Map<String, String>, ? super m<? super String, ? super Map<String, String>, z>, z> f78921a;

    public static final class a {
        static {
            Covode.recordClassIndex(48977);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(48976);
    }

    private q() {
        try {
            String[] a2 = ah.a();
            Collection<? extends String> collection = (a2 == null || (collection = i.j(a2)) == null) ? h.a.z.INSTANCE : collection;
            String[] a3 = ag.a();
            Collection<? extends String> collection2 = (a3 == null || (collection2 = i.j(a3)) == null) ? h.a.z.INSTANCE : collection2;
            if (!d.a(collection2) && !d.a(collection2)) {
                f78918c.addAll(collection2);
            }
            if (!d.a(collection) && !d.a(collection)) {
                f78919d.addAll(collection);
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean a(String str) {
        l.d(str, "");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (p.a((CharSequence) str, (CharSequence) "https", false) || p.a((CharSequence) str, (CharSequence) "http", false)) {
            return true;
        }
        return false;
    }
}
