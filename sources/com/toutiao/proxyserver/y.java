package com.toutiao.proxyserver;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final b f155050a;

    /* renamed from: b  reason: collision with root package name */
    public final List<com.toutiao.proxyserver.net.c> f155051b;

    /* renamed from: c  reason: collision with root package name */
    public final a f155052c;

    static {
        Covode.recordClassIndex(103216);
    }

    /* access modifiers changed from: package-private */
    public static final class c extends Exception {
        static {
            Covode.recordClassIndex(103219);
        }

        c() {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final String f155062a;

        /* renamed from: b  reason: collision with root package name */
        final String f155063b;

        /* renamed from: c  reason: collision with root package name */
        final String f155064c;

        static {
            Covode.recordClassIndex(103218);
        }

        public final String toString() {
            return "RequestLine{method='" + this.f155062a + '\'' + ", path='" + this.f155063b + '\'' + ", version='" + this.f155064c + '\'' + '}';
        }

        b(String str, String str2, String str3) {
            this.f155062a = str;
            this.f155063b = str2;
            this.f155064c = str3;
        }
    }

    public final String toString() {
        return "Request{requestLine=" + this.f155050a + ", headers=" + this.f155051b + ", extra=" + this.f155052c + '}';
    }

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final int f155053a;

        /* renamed from: b  reason: collision with root package name */
        final String f155054b;

        /* renamed from: c  reason: collision with root package name */
        final String f155055c;

        /* renamed from: d  reason: collision with root package name */
        final String f155056d;

        /* renamed from: e  reason: collision with root package name */
        final int f155057e;

        /* renamed from: f  reason: collision with root package name */
        final int f155058f;

        /* renamed from: g  reason: collision with root package name */
        final String f155059g;

        /* renamed from: h  reason: collision with root package name */
        final List<String> f155060h;

        /* renamed from: i  reason: collision with root package name */
        final String f155061i;

        static {
            Covode.recordClassIndex(103217);
        }

        public final String toString() {
            return "Extra{flag=" + this.f155053a + ", rawKey='" + this.f155054b + '\'' + ", key='" + this.f155055c + '\'' + ", from=" + this.f155057e + ", to=" + this.f155058f + ", urls=" + this.f155060h + '}';
        }

        static a a(b bVar, List<com.toutiao.proxyserver.net.c> list) {
            int indexOf = bVar.f155063b.indexOf("?");
            if (indexOf != -1) {
                ArrayList arrayList = new ArrayList();
                String[] split = bVar.f155063b.substring(indexOf + 1).split("&");
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                int i2 = 0;
                for (String str6 : split) {
                    String[] split2 = str6.split("=");
                    if (split2.length == 2) {
                        if ("rk".equals(split2[0])) {
                            str2 = Uri.decode(split2[1]);
                        } else if ("k".equals(split2[0])) {
                            str3 = split2[1];
                        } else if (split2[0].startsWith("u")) {
                            arrayList.add(Uri.decode(split2[1]));
                        } else if ("f".equals(split2[0])) {
                            if (com.toutiao.proxyserver.g.b.a(split2[1], 0) == 1) {
                                i2 = 1;
                            }
                        } else if ("s".equals(split2[0])) {
                            str5 = split2[1];
                        } else if ("ah".equals(split2[0])) {
                            str4 = split2[1];
                        }
                    }
                }
                if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                    throw new c();
                }
                int i3 = 0;
                int i4 = 0;
                for (com.toutiao.proxyserver.net.c cVar : list) {
                    if (cVar != null && "Range".equalsIgnoreCase(cVar.f154930a)) {
                        int indexOf2 = cVar.f154931b.indexOf("=");
                        if (indexOf2 == -1) {
                            throw new c();
                        } else if ("bytes".equalsIgnoreCase(cVar.f154931b.substring(0, indexOf2).trim())) {
                            String substring = cVar.f154931b.substring(indexOf2 + 1);
                            if (!substring.contains(",")) {
                                int indexOf3 = substring.indexOf("-");
                                if (indexOf3 != -1) {
                                    String trim = substring.substring(0, indexOf3).trim();
                                    String trim2 = substring.substring(indexOf3 + 1).trim();
                                    try {
                                        if (trim.length() > 0) {
                                            i3 = Integer.parseInt(trim);
                                        }
                                        if (trim2.length() <= 0 || i3 <= (i4 = Integer.parseInt(trim2))) {
                                            str = cVar.f154931b;
                                        } else {
                                            throw new c();
                                        }
                                    } catch (NumberFormatException unused) {
                                        throw new c();
                                    }
                                } else {
                                    throw new c();
                                }
                            } else {
                                throw new c();
                            }
                        } else {
                            throw new c();
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new a(i2, str2, str3, str4, i3, i4, str, arrayList, str5);
                }
                throw new c();
            }
            throw new c();
        }

        private a(int i2, String str, String str2, String str3, int i3, int i4, String str4, List<String> list, String str5) {
            this.f155053a = i2;
            this.f155054b = str;
            this.f155055c = str2;
            this.f155056d = str3;
            this.f155057e = i3;
            this.f155058f = i4;
            this.f155059g = str4;
            this.f155060h = list;
            this.f155061i = str5;
        }
    }

    public static y a(InputStream inputStream) {
        MethodCollector.i(10267);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, com.toutiao.proxyserver.g.b.f154859a));
        ArrayList arrayList = new ArrayList();
        b bVar = null;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (!TextUtils.isEmpty(readLine)) {
                String trim = readLine.trim();
                if (bVar == null) {
                    int indexOf = trim.indexOf(32);
                    if (indexOf != -1) {
                        int lastIndexOf = trim.lastIndexOf(32);
                        if (lastIndexOf > indexOf) {
                            String trim2 = trim.substring(0, indexOf).trim();
                            String trim3 = trim.substring(indexOf + 1, lastIndexOf).trim();
                            String trim4 = trim.substring(lastIndexOf + 1).trim();
                            if (trim2.length() == 0 || trim3.length() == 0 || trim4.length() == 0) {
                                c cVar = new c();
                                MethodCollector.o(10267);
                            } else {
                                bVar = new b(trim2, trim3, trim4);
                            }
                        } else {
                            c cVar2 = new c();
                            MethodCollector.o(10267);
                            throw cVar2;
                        }
                    } else {
                        c cVar3 = new c();
                        MethodCollector.o(10267);
                        throw cVar3;
                    }
                } else {
                    try {
                        int indexOf2 = trim.indexOf(":");
                        if (indexOf2 != -1) {
                            arrayList.add(new com.toutiao.proxyserver.net.c(trim.substring(0, indexOf2), trim.substring(indexOf2 + 1)));
                        } else {
                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("request header format error, header: ".concat(String.valueOf(trim)));
                            MethodCollector.o(10267);
                            throw illegalArgumentException;
                        }
                    } catch (IllegalArgumentException unused) {
                        c cVar4 = new c();
                        MethodCollector.o(10267);
                        throw cVar4;
                    }
                }
            } else if (bVar != null) {
                y yVar = new y(bVar, arrayList, a.a(bVar, arrayList));
                MethodCollector.o(10267);
                return yVar;
            } else {
                c cVar5 = new c();
                MethodCollector.o(10267);
                throw cVar5;
            }
        }
        c cVar6 = new c();
        MethodCollector.o(10267);
        throw cVar6;
    }

    private y(b bVar, List<com.toutiao.proxyserver.net.c> list, a aVar) {
        this.f155050a = bVar;
        this.f155051b = list;
        this.f155052c = aVar;
    }

    static String a(String str, String str2, List<String> list, String str3) {
        StringBuilder sb = new StringBuilder(512);
        while (true) {
            String a2 = a(sb, str, str2, list, str3);
            if (a2.length() <= 3072) {
                return a2;
            }
            if (list.size() == 1) {
                return null;
            }
            list.remove(list.size() - 1);
        }
    }

    private static String a(StringBuilder sb, String str, String str2, List<String> list, String str3) {
        sb.delete(0, sb.length());
        sb.append("rk=").append(Uri.encode(str));
        sb.append("&k=").append(str2);
        if (!TextUtils.isEmpty(str3)) {
            sb.append("&s=").append(str3);
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append("&u").append(i2).append("=").append(Uri.encode(list.get(i2)));
        }
        sb.append("&ah=").append(u.a(str, str2, list, str3));
        return sb.toString();
    }
}
