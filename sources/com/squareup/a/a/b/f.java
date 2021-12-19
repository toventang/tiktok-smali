package com.squareup.a.a.b;

import com.bytedance.covode.number.Covode;
import com.squareup.a.a.a.d;
import com.squareup.a.a.a.e;
import com.squareup.a.a.j;
import com.squareup.a.p;
import com.squareup.a.u;
import com.squareup.a.v;
import com.squareup.a.x;
import com.squareup.a.y;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import k.aa;
import k.i;
import k.l;
import k.q;

public final class f implements j {

    /* renamed from: b  reason: collision with root package name */
    private static final i f57652b;

    /* renamed from: c  reason: collision with root package name */
    private static final i f57653c;

    /* renamed from: d  reason: collision with root package name */
    private static final i f57654d;

    /* renamed from: e  reason: collision with root package name */
    private static final i f57655e;

    /* renamed from: f  reason: collision with root package name */
    private static final i f57656f;

    /* renamed from: g  reason: collision with root package name */
    private static final i f57657g;

    /* renamed from: h  reason: collision with root package name */
    private static final i f57658h;

    /* renamed from: i  reason: collision with root package name */
    private static final i f57659i;

    /* renamed from: j  reason: collision with root package name */
    private static final List<i> f57660j;

    /* renamed from: k  reason: collision with root package name */
    private static final List<i> f57661k;

    /* renamed from: l  reason: collision with root package name */
    private static final List<i> f57662l;

    /* renamed from: m  reason: collision with root package name */
    private static final List<i> f57663m;

    /* renamed from: a  reason: collision with root package name */
    public final s f57664a;
    private final d n;
    private h o;
    private e p;

    class a extends l {
        static {
            Covode.recordClassIndex(35944);
        }

        @Override // k.aa, java.io.Closeable, k.l, java.lang.AutoCloseable
        public final void close() {
            f.this.f57664a.a(f.this);
            super.close();
        }

        public a(aa aaVar) {
            super(aaVar);
        }
    }

    @Override // com.squareup.a.a.b.j
    public final void b() {
        this.p.d().close();
    }

    static {
        Covode.recordClassIndex(35943);
        i encodeUtf8 = i.encodeUtf8("connection");
        f57652b = encodeUtf8;
        i encodeUtf82 = i.encodeUtf8("host");
        f57653c = encodeUtf82;
        i encodeUtf83 = i.encodeUtf8("keep-alive");
        f57654d = encodeUtf83;
        i encodeUtf84 = i.encodeUtf8("proxy-connection");
        f57655e = encodeUtf84;
        i encodeUtf85 = i.encodeUtf8("transfer-encoding");
        f57656f = encodeUtf85;
        i encodeUtf86 = i.encodeUtf8("te");
        f57657g = encodeUtf86;
        i encodeUtf87 = i.encodeUtf8("encoding");
        f57658h = encodeUtf87;
        i encodeUtf88 = i.encodeUtf8("upgrade");
        f57659i = encodeUtf88;
        f57660j = j.a(encodeUtf8, encodeUtf82, encodeUtf83, encodeUtf84, encodeUtf85, com.squareup.a.a.a.f.f57508b, com.squareup.a.a.a.f.f57509c, com.squareup.a.a.a.f.f57510d, com.squareup.a.a.a.f.f57511e, com.squareup.a.a.a.f.f57512f, com.squareup.a.a.a.f.f57513g);
        f57661k = j.a(encodeUtf8, encodeUtf82, encodeUtf83, encodeUtf84, encodeUtf85);
        f57662l = j.a(encodeUtf8, encodeUtf82, encodeUtf83, encodeUtf84, encodeUtf86, encodeUtf85, encodeUtf87, encodeUtf88, com.squareup.a.a.a.f.f57508b, com.squareup.a.a.a.f.f57509c, com.squareup.a.a.a.f.f57510d, com.squareup.a.a.a.f.f57511e, com.squareup.a.a.a.f.f57512f, com.squareup.a.a.a.f.f57513g);
        f57663m = j.a(encodeUtf8, encodeUtf82, encodeUtf83, encodeUtf84, encodeUtf86, encodeUtf85, encodeUtf87, encodeUtf88);
    }

    @Override // com.squareup.a.a.b.j
    public final x.a a() {
        if (this.n.f57428b != u.HTTP_2) {
            return a(this.p.c());
        }
        List<com.squareup.a.a.a.f> c2 = this.p.c();
        String str = null;
        p.a aVar = new p.a();
        int size = c2.size();
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = c2.get(i2).f57514h;
            String utf8 = c2.get(i2).f57515i.utf8();
            if (iVar.equals(com.squareup.a.a.a.f.f57507a)) {
                str = utf8;
            } else if (!f57663m.contains(iVar)) {
                aVar.a(iVar.utf8(), utf8);
            }
        }
        if (str != null) {
            r a2 = r.a("HTTP/1.1 ".concat(String.valueOf(str)));
            x.a aVar2 = new x.a();
            aVar2.f57943b = u.HTTP_2;
            aVar2.f57944c = a2.f57714b;
            aVar2.f57945d = a2.f57715c;
            return aVar2.a(aVar.a());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // com.squareup.a.a.b.j
    public final void a(h hVar) {
        this.o = hVar;
    }

    @Override // com.squareup.a.a.b.j
    public final void a(o oVar) {
        oVar.a(this.p.d());
    }

    @Override // com.squareup.a.a.b.j
    public final y a(x xVar) {
        return new l(xVar.f57936f, q.a(new a(this.p.f57489g)));
    }

    private static x.a a(List<com.squareup.a.a.a.f> list) {
        p.a aVar = new p.a();
        int size = list.size();
        String str = null;
        String str2 = "HTTP/1.1";
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = list.get(i2).f57514h;
            String utf8 = list.get(i2).f57515i.utf8();
            int i3 = 0;
            while (i3 < utf8.length()) {
                int indexOf = utf8.indexOf(0, i3);
                if (indexOf == -1) {
                    indexOf = utf8.length();
                }
                String substring = utf8.substring(i3, indexOf);
                if (iVar.equals(com.squareup.a.a.a.f.f57507a)) {
                    str = substring;
                } else if (iVar.equals(com.squareup.a.a.a.f.f57513g)) {
                    str2 = substring;
                } else if (!f57661k.contains(iVar)) {
                    aVar.a(iVar.utf8(), substring);
                }
                i3 = indexOf + 1;
            }
        }
        if (str != null) {
            r a2 = r.a(str2 + " " + str);
            x.a aVar2 = new x.a();
            aVar2.f57943b = u.SPDY_3;
            aVar2.f57944c = a2.f57714b;
            aVar2.f57945d = a2.f57715c;
            return aVar2.a(aVar.a());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    private static List<com.squareup.a.a.a.f> b(v vVar) {
        p pVar = vVar.f57921c;
        ArrayList arrayList = new ArrayList((pVar.f57876a.length / 2) + 5);
        arrayList.add(new com.squareup.a.a.a.f(com.squareup.a.a.a.f.f57508b, vVar.f57920b));
        arrayList.add(new com.squareup.a.a.a.f(com.squareup.a.a.a.f.f57509c, n.a(vVar.f57919a)));
        arrayList.add(new com.squareup.a.a.a.f(com.squareup.a.a.a.f.f57513g, "HTTP/1.1"));
        arrayList.add(new com.squareup.a.a.a.f(com.squareup.a.a.a.f.f57512f, j.a(vVar.f57919a)));
        arrayList.add(new com.squareup.a.a.a.f(com.squareup.a.a.a.f.f57510d, vVar.f57919a.f57879a));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = pVar.f57876a.length / 2;
        for (int i2 = 0; i2 < length; i2++) {
            i encodeUtf8 = i.encodeUtf8(pVar.a(i2).toLowerCase(Locale.US));
            if (!f57660j.contains(encodeUtf8)) {
                String b2 = pVar.b(i2);
                if (linkedHashSet.add(encodeUtf8)) {
                    arrayList.add(new com.squareup.a.a.a.f(encodeUtf8, b2));
                } else {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayList.size()) {
                            break;
                        } else if (((com.squareup.a.a.a.f) arrayList.get(i3)).f57514h.equals(encodeUtf8)) {
                            arrayList.set(i3, new com.squareup.a.a.a.f(encodeUtf8, ((com.squareup.a.a.a.f) arrayList.get(i3)).f57515i.utf8() + (char) 0 + b2));
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.squareup.a.a.b.j
    public final void a(v vVar) {
        List<com.squareup.a.a.a.f> list;
        if (this.p == null) {
            this.o.a();
            boolean c2 = i.c(vVar.f57920b);
            if (this.n.f57428b == u.HTTP_2) {
                p pVar = vVar.f57921c;
                list = new ArrayList<>((pVar.f57876a.length / 2) + 4);
                list.add(new com.squareup.a.a.a.f(com.squareup.a.a.a.f.f57508b, vVar.f57920b));
                list.add(new com.squareup.a.a.a.f(com.squareup.a.a.a.f.f57509c, n.a(vVar.f57919a)));
                list.add(new com.squareup.a.a.a.f(com.squareup.a.a.a.f.f57511e, j.a(vVar.f57919a)));
                list.add(new com.squareup.a.a.a.f(com.squareup.a.a.a.f.f57510d, vVar.f57919a.f57879a));
                int length = pVar.f57876a.length / 2;
                for (int i2 = 0; i2 < length; i2++) {
                    i encodeUtf8 = i.encodeUtf8(pVar.a(i2).toLowerCase(Locale.US));
                    if (!f57662l.contains(encodeUtf8)) {
                        list.add(new com.squareup.a.a.a.f(encodeUtf8, pVar.b(i2)));
                    }
                }
            } else {
                list = b(vVar);
            }
            e a2 = this.n.a(list, c2);
            this.p = a2;
            a2.f57491i.timeout((long) this.o.f57671b.y, TimeUnit.MILLISECONDS);
            this.p.f57492j.timeout((long) this.o.f57671b.z, TimeUnit.MILLISECONDS);
        }
    }

    public f(s sVar, d dVar) {
        this.f57664a = sVar;
        this.n = dVar;
    }

    @Override // com.squareup.a.a.b.j
    public final k.y a(v vVar, long j2) {
        return this.p.d();
    }
}
