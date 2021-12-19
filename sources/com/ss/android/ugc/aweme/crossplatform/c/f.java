package com.ss.android.ugc.aweme.crossplatform.c;

import android.net.Uri;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.LinkedHashMap;
import java.util.Map;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final h f78718a = i.a((h.f.a.a) b.f78721a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f78719b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final Map<Object, g> f78720c = new LinkedHashMap();

    public static final class a {
        static {
            Covode.recordClassIndex(48868);
        }

        public static f a() {
            return (f) f.f78718a.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<f> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f78721a = new b();

        static {
            Covode.recordClassIndex(48869);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f invoke() {
            return new f();
        }
    }

    static {
        Covode.recordClassIndex(48867);
    }

    private static String a(Object obj) {
        if (obj == null || !(obj instanceof WebView)) {
            return "";
        }
        return "h5";
    }

    public final void b(Object obj, String str, int i2) {
        String queryParameter;
        if (str != null) {
            try {
                Uri parse = Uri.parse(str);
                if (parse != null && l.a((Object) parse.getQueryParameter("_enable_stay_time_report"), (Object) "1") && (queryParameter = parse.getQueryParameter("_enter_from")) != null) {
                    l.b(queryParameter, "");
                    String queryParameter2 = parse.getQueryParameter("_project_name");
                    if (queryParameter2 == null) {
                        queryParameter2 = "unknown";
                    }
                    l.b(queryParameter2, "");
                    if (obj != null && this.f78720c.containsKey(obj)) {
                        if (i2 == 1) {
                            g gVar = this.f78720c.get(obj);
                            if (gVar == null) {
                                l.b();
                            }
                            g gVar2 = gVar;
                            gVar2.f78724b = true;
                            gVar2.a();
                        } else if (i2 == 2) {
                            this.f78720c.remove(obj);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void a(Object obj, String str, int i2) {
        String queryParameter;
        if (str != null) {
            try {
                Uri parse = Uri.parse(str);
                if (parse != null && l.a((Object) parse.getQueryParameter("_enable_stay_time_report"), (Object) "1") && (queryParameter = parse.getQueryParameter("_enter_from")) != null) {
                    l.b(queryParameter, "");
                    String queryParameter2 = parse.getQueryParameter("_project_name");
                    if (queryParameter2 == null) {
                        queryParameter2 = "unknown";
                    }
                    l.b(queryParameter2, "");
                    if (obj == null) {
                        return;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3 && this.f78720c.containsKey(obj)) {
                                a(obj, queryParameter2, queryParameter, obj);
                            }
                        } else if (this.f78720c.containsKey(obj)) {
                            a(obj, queryParameter2, queryParameter, obj);
                        } else {
                            a(obj, queryParameter2, queryParameter, a(obj));
                        }
                    } else if (this.f78720c.containsKey(obj)) {
                        g gVar = this.f78720c.get(obj);
                        if (gVar == null) {
                            l.b();
                        }
                        g gVar2 = gVar;
                        if (gVar2.f78724b) {
                            gVar2.f78724b = false;
                            gVar2.f78723a = System.currentTimeMillis();
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    private final void a(Object obj, String str, String str2, String str3) {
        Map<Object, g> map = this.f78720c;
        g gVar = new g(new e(str, str2, str3));
        gVar.f78723a = System.currentTimeMillis();
        map.put(obj, gVar);
    }

    private final void a(Object obj, String str, String str2, Object obj2) {
        g gVar = this.f78720c.get(obj);
        if (gVar == null) {
            l.b();
        }
        g gVar2 = gVar;
        if (!(!l.a((Object) gVar2.f78725c.f78715a, (Object) str)) && !(!l.a((Object) gVar2.f78725c.f78716b, (Object) str2))) {
            gVar = null;
        }
        g gVar3 = gVar;
        if (gVar3 != null) {
            gVar3.a();
            this.f78720c.remove(obj);
            a(obj, str, str2, a(obj2));
        }
    }
}
