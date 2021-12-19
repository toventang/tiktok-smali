package com.ss.android.ugc.aweme.lancet.b;

import android.text.TextUtils;
import android.webkit.CookieManager;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.cw.g;
import h.a.n;
import h.f.b.l;
import h.m.p;
import h.z;
import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f107179a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f107180b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static AbstractC2753a f107181c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile boolean f107182d;

    /* renamed from: e  reason: collision with root package name */
    private static final List<String> f107183e = n.d("sessionid", "sid_tt", "sid_guard", "uid_tt");

    /* renamed from: com.ss.android.ugc.aweme.lancet.b.a$a  reason: collision with other inner class name */
    public interface AbstractC2753a {
        static {
            Covode.recordClassIndex(68563);
        }
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(68562);
    }

    public static List<String> a() {
        try {
            return com.bytedance.ttnet.a.a.a(d.a()).d(NetworkUtils.getShareCookieHost());
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static final boolean b() {
        if (TextUtils.equals(d.s, "lark_inhouse") || TextUtils.equals(d.s, "local_test")) {
            return true;
        }
        return false;
    }

    static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f107184a;

        static {
            Covode.recordClassIndex(68564);
        }

        b(String str) {
            this.f107184a = str;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            String str;
            String str2 = this.f107184a;
            if ((str2 != null && p.b(str2, "http://", false)) || ((str = this.f107184a) != null && p.b(str, "https://", false))) {
                List<String> a2 = a.a();
                if (a2 == null || a2.isEmpty()) {
                    a.b();
                    a.a(a.a(this.f107184a), a2, (String) null);
                } else {
                    URI create = URI.create(this.f107184a);
                    l.b(create, "");
                    String host = create.getHost();
                    l.b(host, "");
                    String c2 = a.c(host);
                    if (c2 != null && a2.contains(c2)) {
                        a.a(create, a2, CookieManager.getInstance().getCookie(create.getHost()));
                    }
                }
            }
            return null;
        }
    }

    public static final void b(String str) {
        if (!TextUtils.isEmpty(str) && f107179a) {
            i.b(new b(str), g.c());
        }
    }

    public static final String a(String str) {
        if (str != null) {
            try {
                URI create = URI.create(str);
                if (create == null) {
                    return "";
                }
                return create.getHost() + create.getPath();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return "";
    }

    public static String c(String str) {
        l.d(str, "");
        int length = str.length() - 1;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (length < 0) {
                break;
            }
            if (str.charAt(length) == '.') {
                if (i3 != 1) {
                    i3++;
                } else if (length > 0) {
                    i2 = length;
                }
            }
            length--;
        }
        String substring = str.substring(i2);
        l.b(substring, "");
        return substring;
    }

    private static boolean e(String str) {
        int i2 = 0;
        for (String str2 : f107183e) {
            if (p.a((CharSequence) str, (CharSequence) str2, false)) {
                i2++;
            }
        }
        if (i2 < f107183e.size()) {
            return true;
        }
        return false;
    }

    public static final void a(String str, boolean z) {
        if (!b()) {
            return;
        }
        if (!((!f107179a && !z) || str == null || f107181c == null)) {
            List<String> a2 = a();
            StringBuffer stringBuffer = new StringBuffer();
            if (a2 != null) {
                ArrayList arrayList = new ArrayList(n.a((Iterable) a2, 10));
                for (T t : a2) {
                    arrayList.add(stringBuffer.append((String) t).append(":").append(CookieManager.getInstance().getCookie(t)));
                }
            }
            new Date().toLocaleString();
            Thread currentThread = Thread.currentThread();
            l.b(currentThread, "");
            currentThread.getName();
        }
    }

    public static final void a(URI uri, Map<String, ? extends List<String>> map) {
        String str = "";
        try {
            if (f107179a && uri != null) {
                List<String> a2 = a();
                if (a2 == null || a2.isEmpty()) {
                    b();
                    a(a(uri.toString()), a2, (String) null);
                    return;
                }
                String host = uri.getHost();
                l.b(host, str);
                String c2 = c(host);
                if (c2 != null && a2.contains(c2)) {
                    if (!map.isEmpty()) {
                        StringBuilder sb = new StringBuilder();
                        for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
                            sb.append(entry).append(";");
                        }
                        String sb2 = sb.toString();
                        l.b(sb2, str);
                        str = sb2;
                    }
                    a(uri, a2, str);
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void a(String str, List<String> list, String str2) {
        if (!f107182d) {
            f107182d = true;
            String str3 = "";
            if (list != null) {
                ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    str3 = str3 + ((String) it.next());
                    arrayList.add(z.f158842a);
                }
            }
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject.put("host", str3);
                }
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("error_desc", str2);
                }
                jSONObject.put("uri", str);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            com.bytedance.apm.b.a("cookie_error", jSONObject);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    public static void a(java.net.URI r3, java.util.List<java.lang.String> r4, java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.lancet.b.a.a(java.net.URI, java.util.List, java.lang.String):void");
    }
}
