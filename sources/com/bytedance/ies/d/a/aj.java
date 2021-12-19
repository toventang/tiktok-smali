package com.bytedance.ies.d.a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;
import h.m.p;
import h.w;
import java.net.URLDecoder;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public final class aj {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f33212a = {new y(ab.a(aj.class), "uri", "getUri()Landroid/net/Uri;"), new y(ab.a(aj.class), "host", "getHost()Ljava/lang/String;"), new y(ab.a(aj.class), "queryMap", "getQueryMap()Ljava/util/SortedMap;"), new y(ab.a(aj.class), "hash", "getHash()Ljava/lang/String;")};

    /* renamed from: b  reason: collision with root package name */
    public final String f33213b;

    /* renamed from: c  reason: collision with root package name */
    private final h f33214c = h.i.a((h.f.a.a) new d(this));

    /* renamed from: d  reason: collision with root package name */
    private final h f33215d = h.i.a((h.f.a.a) new b(this));

    /* renamed from: e  reason: collision with root package name */
    private final h f33216e = h.i.a((h.f.a.a) new c(this));

    /* renamed from: f  reason: collision with root package name */
    private final h f33217f = h.i.a((h.f.a.a) new a(this));

    public final Uri a() {
        return (Uri) this.f33214c.getValue();
    }

    public final String b() {
        return (String) this.f33215d.getValue();
    }

    public final SortedMap<String, String> c() {
        return (SortedMap) this.f33216e.getValue();
    }

    public final String d() {
        return (String) this.f33217f.getValue();
    }

    static final class b extends m implements h.f.a.a<String> {
        final /* synthetic */ aj this$0;

        static {
            Covode.recordClassIndex(19836);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(aj ajVar) {
            super(0);
            this.this$0 = ajVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String host = this.this$0.a().getHost();
            if (host == null) {
                return "";
            }
            return host;
        }
    }

    static final class d extends m implements h.f.a.a<Uri> {
        final /* synthetic */ aj this$0;

        static {
            Covode.recordClassIndex(19838);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(aj ajVar) {
            super(0);
            this.this$0 = ajVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Uri invoke() {
            return Uri.parse(this.this$0.f33213b);
        }
    }

    static {
        Covode.recordClassIndex(19834);
    }

    static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ aj this$0;

        static {
            Covode.recordClassIndex(19835);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(aj ajVar) {
            super(0);
            this.this$0 = ajVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String fragment = this.this$0.a().getFragment();
            if (fragment == null) {
                fragment = "";
            }
            if (!p.a((CharSequence) fragment, (CharSequence) "?", false)) {
                return "#".concat(String.valueOf(fragment));
            }
            List<String> b2 = p.b(fragment, new String[]{"?"});
            String str = b2.get(1);
            if (str.length() > 0) {
                for (T t : p.b(str, new String[]{"&"})) {
                    int a2 = p.a((CharSequence) t, "=", 0, false, 6);
                    if (a2 > 0) {
                        SortedMap<String, String> c2 = this.this$0.c();
                        if (t != null) {
                            String substring = t.substring(0, a2);
                            l.a((Object) substring, "");
                            String decode = URLDecoder.decode(substring, "UTF-8");
                            String substring2 = t.substring(a2 + 1);
                            l.a((Object) substring2, "");
                            c2.put(decode, URLDecoder.decode(substring2, "UTF-8"));
                        } else {
                            throw new w("null cannot be cast to non-null type");
                        }
                    }
                }
            }
            return "#" + b2.get(0);
        }
    }

    static final class c extends m implements h.f.a.a<SortedMap<String, String>> {
        final /* synthetic */ aj this$0;

        static {
            Covode.recordClassIndex(19837);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(aj ajVar) {
            super(0);
            this.this$0 = ajVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SortedMap<String, String> invoke() {
            String query;
            List<String> c2;
            Uri a2 = this.this$0.a();
            l.c(a2, "");
            TreeMap treeMap = new TreeMap();
            String fragment = a2.getFragment();
            if (fragment != null && p.e((CharSequence) fragment, (CharSequence) "?")) {
                for (String str : p.c((String) p.c(fragment, new String[]{"?"}).get(1), new String[]{"&"})) {
                    int a3 = p.a((CharSequence) str, "=", 0, false, 6);
                    if (a3 >= 0) {
                        if (str != null) {
                            String substring = str.substring(0, a3);
                            l.a((Object) substring, "");
                            String decode = URLDecoder.decode(substring, "UTF-8");
                            l.a((Object) decode, "");
                            String substring2 = str.substring(a3 + 1);
                            l.a((Object) substring2, "");
                            String decode2 = URLDecoder.decode(substring2, "UTF-8");
                            l.a((Object) decode2, "");
                            treeMap.put(decode, decode2);
                        } else {
                            throw new w("null cannot be cast to non-null type");
                        }
                    }
                }
            }
            String query2 = a2.getQuery();
            if (!(query2 == null || query2.length() == 0 || (query = a2.getQuery()) == null || (c2 = p.c(query, new String[]{"&"})) == null)) {
                for (String str2 : c2) {
                    int a4 = p.a((CharSequence) str2, "=", 0, false, 6);
                    if (a4 >= 0) {
                        if (str2 != null) {
                            String substring3 = str2.substring(0, a4);
                            l.a((Object) substring3, "");
                            String decode3 = URLDecoder.decode(substring3, "UTF-8");
                            l.a((Object) decode3, "");
                            String substring4 = str2.substring(a4 + 1);
                            l.a((Object) substring4, "");
                            String decode4 = URLDecoder.decode(substring4, "UTF-8");
                            l.a((Object) decode4, "");
                            treeMap.put(decode3, decode4);
                        } else {
                            throw new w("null cannot be cast to non-null type");
                        }
                    }
                }
            }
            return treeMap;
        }
    }

    public aj(String str) {
        l.c(str, "");
        this.f33213b = str;
    }
}
