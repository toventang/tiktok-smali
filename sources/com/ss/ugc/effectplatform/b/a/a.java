package com.ss.ugc.effectplatform.b.a;

import com.bytedance.covode.number.Covode;
import d.a.b.c.f;
import d.a.d.a.g;
import d.a.d.a.h;
import d.a.d.a.i;
import d.a.d.a.j;
import d.a.d.a.k;
import d.a.d.a.m;
import h.a.n;
import h.m.l;
import h.z;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public final class a {

    /* renamed from: i  reason: collision with root package name */
    public static final C4084a f153482i = new C4084a((byte) 0);
    private static final l t = new l("[a-z0-9_-]{1,120}");

    /* renamed from: a  reason: collision with root package name */
    public final h f153483a;

    /* renamed from: b  reason: collision with root package name */
    public final h f153484b;

    /* renamed from: c  reason: collision with root package name */
    public d.a.b.a<Integer> f153485c;

    /* renamed from: d  reason: collision with root package name */
    public final f f153486d;

    /* renamed from: e  reason: collision with root package name */
    public d.a.b.a<Boolean> f153487e;

    /* renamed from: f  reason: collision with root package name */
    public d.a.b.a<Boolean> f153488f;

    /* renamed from: g  reason: collision with root package name */
    public final String f153489g;

    /* renamed from: h  reason: collision with root package name */
    public final int f153490h;

    /* renamed from: j  reason: collision with root package name */
    private final h f153491j;

    /* renamed from: k  reason: collision with root package name */
    private d.a.b.a<Long> f153492k;

    /* renamed from: l  reason: collision with root package name */
    private d.a.b.a<m> f153493l;

    /* renamed from: m  reason: collision with root package name */
    private d.a.b.a<Long> f153494m;
    private final d.a.a.b<String, c> n;
    private final d.a.b.b.a o;
    private final Runnable p;
    private final int q;
    private long r;
    private final d s;

    /* renamed from: com.ss.ugc.effectplatform.b.a.a$a  reason: collision with other inner class name */
    public static final class C4084a {
        static {
            Covode.recordClassIndex(102352);
        }

        private C4084a() {
        }

        public /* synthetic */ C4084a(byte b2) {
            this();
        }

        private static void a(h hVar) {
            if (d.a.d.a.d.b(hVar) && !d.a.d.a.d.c(hVar)) {
                throw new j("delete file exception occur,file = ".concat(String.valueOf(hVar)));
            }
        }

        public static String a(String str) {
            h.f.b.l.c(str, "");
            char[] cArr = new char[str.length()];
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                cArr[i2] = str.charAt(i2);
                char c2 = cArr[i2];
                if (!(c2 == '_' || c2 == '-' || ((c2 >= 'a' && c2 <= 'z') || (c2 >= '0' && c2 <= '9')))) {
                    cArr[i2] = '_';
                }
            }
            return new String(cArr);
        }

        public static void a(h hVar, h hVar2, boolean z) {
            if (z) {
                a(hVar2);
            }
            if (!d.a.d.a.d.a(hVar, hVar2)) {
                throw new j("rename file exception occur, from = " + hVar + ",to = " + hVar2);
            }
        }

        public static a a(String str, int i2, int i3, long j2, d dVar) {
            h a2;
            h.f.b.l.c(str, "");
            if (j2 <= 0) {
                throw new IllegalArgumentException("maxSize <= 0");
            } else if (i3 > 0) {
                if (!d.a.d.a.d.f(str)) {
                    d.a.d.a.d.e(str);
                    if (!d.a.d.a.d.f(str)) {
                        d.a.e.b.a("DiskLruCache", "Cache directory error".concat(String.valueOf(str)), null);
                    }
                }
                h a3 = new h(str).a("journal.bkp");
                if (a3 != null && d.a.d.a.d.b(a3) && (a2 = new h(str).a("journal")) != null && d.a.d.a.d.b(a2)) {
                    if (d.a.d.a.d.b(a2)) {
                        d.a.d.a.d.c(a3);
                    } else {
                        a(a3, a2, false);
                    }
                }
                a aVar = new a(str, i2, i3, j2, dVar, (byte) 0);
                if (d.a.d.a.d.b(aVar.f153483a)) {
                    try {
                        aVar.b();
                        aVar.c();
                        aVar.f153487e.f156544a = (V) true;
                        return aVar;
                    } catch (Exception e2) {
                        d.a.e.b.a("DiskLruCache", "DiskLruCache " + str + " is corrupt: " + e2.getMessage() + ", removing", null);
                        aVar.e();
                    }
                }
                d.a.d.a.d.e(str);
                a aVar2 = new a(str, i2, i3, j2, dVar, (byte) 0);
                aVar2.d();
                return aVar2;
            } else {
                throw new IllegalArgumentException("valueCount <= 0");
            }
        }
    }

    public final class b {

        /* renamed from: a  reason: collision with root package name */
        public final d.a.b.a<boolean[]> f153495a;

        /* renamed from: b  reason: collision with root package name */
        public d.a.b.a<Boolean> f153496b = new d.a.b.a<>(false);

        /* renamed from: c  reason: collision with root package name */
        public final c f153497c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f153498d;

        /* renamed from: e  reason: collision with root package name */
        private d.a.b.a<Boolean> f153499e = new d.a.b.a<>(false);

        static {
            Covode.recordClassIndex(102353);
        }

        public final void c() {
            this.f153498d.a(this, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.ugc.effectplatform.b.a.a$b$a  reason: collision with other inner class name */
        public static final class C4085a extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ int $index$inlined = 0;
            final /* synthetic */ b this$0;

            static {
                Covode.recordClassIndex(102354);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4085a(b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.f153496b.f156544a = (V) true;
                return z.f158842a;
            }
        }

        public final void b() {
            if (this.f153496b.f156544a.booleanValue()) {
                this.f153498d.a(this, false);
                this.f153498d.c(this.f153497c.f153504e);
            } else {
                this.f153498d.a(this, true);
            }
            this.f153499e.f156544a = (V) true;
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:10:0x0040 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: boolean */
        /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: boolean[] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v4, types: [d.a.d.a.g] */
        public final g a() {
            g gVar;
            boolean z = 0;
            if (this.f153498d.f153490h > 0) {
                f fVar = this.f153498d.f153486d;
                fVar.f156552a.lock();
                try {
                    if (h.f.b.l.a((Object) this.f153497c.f153502c.f156544a, (Object) this)) {
                        if (!this.f153497c.f153501b.f156544a.booleanValue()) {
                            boolean[] zArr = new boolean[this.f153498d.f153490h];
                            zArr[0] = true;
                            this.f153495a.f156544a = zArr;
                        }
                        h b2 = this.f153497c.b(0);
                        try {
                            z = d.a.d.a.d.a(b2, false);
                            gVar = z;
                        } catch (Exception unused) {
                            d.a.d.a.d.e(this.f153498d.f153489g);
                            try {
                                gVar = d.a.d.a.d.a(b2, z);
                            } catch (Exception unused2) {
                                b bVar = new b();
                                fVar.f156552a.unlock();
                                return bVar;
                            }
                        }
                        if (gVar == null) {
                            h.f.b.l.a();
                        }
                        return new c(gVar, new C4085a(this));
                    }
                    throw new IllegalStateException("Check failed.".toString());
                } finally {
                    fVar.f156552a.unlock();
                }
            } else {
                throw new IllegalArgumentException(("Expected index 0 to be greater than 0 and less than the maximum value count of " + this.f153498d.f153490h).toString());
            }
        }

        public b(a aVar, c cVar) {
            h.f.b.l.c(cVar, "");
            this.f153498d = aVar;
            this.f153497c = cVar;
            this.f153495a = new d.a.b.a<>(new boolean[aVar.f153490h]);
        }
    }

    private final boolean k() {
        return this.f153488f.f156544a.booleanValue();
    }

    private final void l() {
        if (k()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final class d implements k {

        /* renamed from: a  reason: collision with root package name */
        public final h[] f153506a;

        /* renamed from: b  reason: collision with root package name */
        public final d.a.d.a.c[] f153507b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f153508c;

        /* renamed from: d  reason: collision with root package name */
        private final long[] f153509d;

        /* renamed from: e  reason: collision with root package name */
        private final String f153510e;

        /* renamed from: f  reason: collision with root package name */
        private final long f153511f;

        static {
            Covode.recordClassIndex(102356);
        }

        @Override // d.a.d.a.k
        public final void a() {
            d.a.d.a.c[] cVarArr = this.f153507b;
            for (d.a.d.a.c cVar : cVarArr) {
                if (cVar != null) {
                    d.a.d.a.d.a((k) cVar);
                }
            }
        }

        public d(a aVar, String str, long j2, h[] hVarArr, d.a.d.a.c[] cVarArr, long[] jArr) {
            h.f.b.l.c(str, "");
            h.f.b.l.c(hVarArr, "");
            h.f.b.l.c(cVarArr, "");
            h.f.b.l.c(jArr, "");
            this.f153508c = aVar;
            this.f153510e = str;
            this.f153511f = j2;
            this.f153506a = hVarArr;
            this.f153507b = cVarArr;
            this.f153509d = jArr;
        }
    }

    static {
        Covode.recordClassIndex(102351);
    }

    private long i() {
        f fVar = this.f153486d;
        fVar.f156552a.lock();
        try {
            return this.r;
        } finally {
            fVar.f156552a.unlock();
        }
    }

    public final void e() {
        h();
        if (com.ss.ugc.effectplatform.util.k.c(this.f153489g)) {
            d.a.d.a.d.e(this.f153489g);
        }
    }

    public final Set<String> a() {
        f fVar = this.f153486d;
        fVar.f156552a.lock();
        try {
            return n.m(new LinkedHashSet(this.n.keySet()));
        } finally {
            fVar.f156552a.unlock();
        }
    }

    public final boolean g() {
        if (this.f153485c.f156544a.intValue() < 2000 || this.f153485c.f156544a.intValue() < this.n.size()) {
            return false;
        }
        return true;
    }

    public final class c {

        /* renamed from: a  reason: collision with root package name */
        public final d.a.a.a<Long> f153500a = new d.a.a.a<>();

        /* renamed from: b  reason: collision with root package name */
        public d.a.b.a<Boolean> f153501b;

        /* renamed from: c  reason: collision with root package name */
        public d.a.b.a<b> f153502c;

        /* renamed from: d  reason: collision with root package name */
        public d.a.b.a<Long> f153503d;

        /* renamed from: e  reason: collision with root package name */
        public final String f153504e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a f153505f;

        static {
            Covode.recordClassIndex(102355);
        }

        public final String a() {
            StringBuilder sb = new StringBuilder();
            Iterator<Long> it = this.f153500a.iterator();
            while (it.hasNext()) {
                sb.append(' ').append(it.next().longValue());
            }
            String sb2 = sb.toString();
            h.f.b.l.a((Object) sb2, "");
            return sb2;
        }

        private static j b(String[] strArr) {
            throw new Exception("unexpected journal line: ".concat(String.valueOf(strArr)));
        }

        public final h a(int i2) {
            if (i2 == 0) {
                return new h(this.f153505f.f153489g).a(this.f153504e);
            }
            return new h(this.f153505f.f153489g).a(this.f153504e + '.' + i2);
        }

        public final h b(int i2) {
            if (i2 == 0) {
                return new h(this.f153505f.f153489g).a(this.f153504e + ".tmp");
            }
            return new h(this.f153505f.f153489g).a(this.f153504e + '.' + i2 + ".tmp");
        }

        public final void a(String[] strArr) {
            h.f.b.l.c(strArr, "");
            if (strArr.length == this.f153505f.f153490h) {
                try {
                    int length = strArr.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        this.f153500a.set(i2, Long.valueOf(Long.parseLong(strArr[i2])));
                    }
                } catch (NumberFormatException unused) {
                    throw b(strArr);
                }
            } else {
                throw b(strArr);
            }
        }

        public c(a aVar, String str) {
            h.f.b.l.c(str, "");
            this.f153505f = aVar;
            this.f153504e = str;
            this.f153501b = new d.a.b.a<>(false);
            this.f153502c = new d.a.b.a<>(null);
            this.f153503d = new d.a.b.a<>(0L);
            int i2 = aVar.f153490h;
            for (int i3 = 0; i3 < i2; i3++) {
                this.f153500a.add(0L);
            }
        }
    }

    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f153512a;

        static {
            Covode.recordClassIndex(102357);
        }

        public final void run() {
            boolean z;
            f fVar = this.f153512a.f153486d;
            fVar.f156552a.lock();
            try {
                if (!this.f153512a.f153487e.f156544a.booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && !this.f153512a.f153488f.f156544a.booleanValue()) {
                    this.f153512a.f();
                    if (this.f153512a.g()) {
                        this.f153512a.d();
                        this.f153512a.f153485c.f156544a = (V) 0;
                    }
                    fVar.f156552a.unlock();
                }
            } finally {
                fVar.f156552a.unlock();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(a aVar) {
            this.f153512a = aVar;
        }
    }

    private void h() {
        f fVar = this.f153486d;
        fVar.f156552a.lock();
        try {
            if (!this.f153487e.f156544a.booleanValue() || this.f153488f.f156544a.booleanValue()) {
                this.f153488f.f156544a = (V) true;
                return;
            }
            Iterator it = new ArrayList(this.n.values()).iterator();
            while (it.hasNext()) {
                V v = ((c) it.next()).f153502c.f156544a;
                if (v != null) {
                    v.c();
                }
            }
            f();
            V v2 = this.f153493l.f156544a;
            if (v2 != null) {
                v2.a();
            }
            d.a.b.b.a(this.f153493l, null);
            this.f153488f.f156544a = (V) true;
            fVar.f156552a.unlock();
        } finally {
            fVar.f156552a.unlock();
        }
    }

    public final void c() {
        d.a.d.a.d.c(this.f153491j);
        Iterator<c> it = this.n.values().iterator();
        while (it.hasNext()) {
            c next = it.next();
            int i2 = 0;
            if (next.f153502c.f156544a == null) {
                int i3 = this.f153490h;
                while (i2 < i3) {
                    d.a.b.a<Long> aVar = this.f153492k;
                    aVar.f156544a = (V) Long.valueOf(aVar.f156544a.longValue() + next.f153500a.get(i2).longValue());
                    i2++;
                }
            } else {
                next.f153502c.f156544a = null;
                int i4 = this.f153490h;
                while (i2 < i4) {
                    com.ss.ugc.effectplatform.util.k.a(next.a(i2));
                    com.ss.ugc.effectplatform.util.k.a(next.b(i2));
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void f() {
        Map.Entry<String, c> next;
        while (this.f153492k.f156544a.longValue() > this.r) {
            int size = this.n.size();
            int i2 = 0;
            Iterator<Map.Entry<String, c>> it = this.n.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
                d dVar = this.s;
                if (dVar != null && dVar.a(next.getKey())) {
                    i2++;
                }
            }
            if (size - i2 < 10) {
                long i3 = i() * 2;
                f fVar = this.f153486d;
                fVar.f156552a.lock();
                try {
                    this.r = i3;
                    if (this.f153487e.f156544a.booleanValue()) {
                        this.o.execute(this.p);
                    }
                } finally {
                    fVar.f156552a.unlock();
                }
            }
            c(next.getKey());
        }
    }

    private final void j() {
        if (!this.f153487e.f156544a.booleanValue()) {
            f fVar = this.f153486d;
            fVar.f156552a.lock();
            try {
                if (d.a.d.a.d.b(this.f153484b)) {
                    if (!d.a.d.a.d.b(this.f153483a)) {
                        C4084a.a(this.f153484b, this.f153483a, false);
                    } else if (d.a.d.a.d.c(this.f153484b) && d.a.d.a.d.b(this.f153484b)) {
                        throw new j("failed to delete " + this.f153484b);
                    }
                }
                if (d.a.d.a.d.b(this.f153483a)) {
                    try {
                        b();
                        c();
                        this.f153487e.f156544a = (V) true;
                        return;
                    } catch (j e2) {
                        d.a.e.b.a("DiskLruCache", "DiskLruCache " + this.f153489g + " is corrupt: " + e2.getMessage() + ", removing", null);
                        e();
                        this.f153488f.f156544a = (V) false;
                    } catch (Throwable th) {
                        this.f153488f.f156544a = (V) false;
                        throw th;
                    }
                }
                d();
                this.f153487e.f156544a = (V) true;
                fVar.f156552a.unlock();
            } finally {
                fVar.f156552a.unlock();
            }
        }
    }

    public final void b() {
        d.a.d.a.c d2 = d.a.d.a.d.d(this.f153483a);
        if (d2 != null) {
            int i2 = 0;
            e eVar = new e(d2, d.a.d.a.b.Ascii, (byte) 0);
            try {
                String b2 = eVar.b();
                String b3 = eVar.b();
                String b4 = eVar.b();
                String b5 = eVar.b();
                String b6 = eVar.b();
                if ((!h.f.b.l.a((Object) "libcore.io.DiskLruCache", (Object) b2)) || (!h.f.b.l.a((Object) "1", (Object) b3)) || (!h.f.b.l.a((Object) String.valueOf(this.q), (Object) b4)) || (!h.f.b.l.a((Object) String.valueOf(this.f153490h), (Object) b5)) || (!h.f.b.l.a((Object) b6, (Object) ""))) {
                    throw new j("unexpected journal header: [" + b2 + ", " + b3 + ", " + b5 + ", " + b6 + "]");
                }
                while (true) {
                    try {
                        String b7 = eVar.b();
                        if (b7 != null) {
                            if (!f(b7)) {
                                break;
                            }
                            i2++;
                        } else {
                            break;
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f153485c.f156544a = (V) Integer.valueOf(i2 - this.n.size());
                if (eVar.c()) {
                    d();
                } else {
                    d.a.b.a<m> aVar = this.f153493l;
                    g a2 = d.a.d.a.d.a(this.f153483a, true);
                    if (a2 == null) {
                        h.f.b.l.a();
                    }
                    d.a.b.b.a(aVar, new d.a.d.a.l(a2, d.a.d.a.b.Ascii));
                }
                d.a.d.a.d.a(eVar);
            } catch (Exception e2) {
                throw e2;
            } catch (Throwable th) {
                d.a.d.a.d.a(eVar);
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void d() {
        g gVar;
        f fVar = this.f153486d;
        fVar.f156552a.lock();
        try {
            V v = this.f153493l.f156544a;
            if (v != null) {
                v.f156636a.close();
            }
            try {
                gVar = d.a.d.a.d.a(this.f153491j, false);
            } catch (Exception unused) {
                h hVar = this.f153491j;
                h.f.b.l.c(hVar, "");
                String str = hVar.f156633a;
                if (str != null) {
                    h.f.b.l.c(str, "");
                    new File(str).getAbsoluteFile().createNewFile();
                }
                gVar = d.a.d.a.d.a(this.f153491j, false);
            }
            if (gVar != null) {
                d.a.d.a.l lVar = new d.a.d.a.l(gVar, d.a.d.a.b.Ascii);
                try {
                    lVar.a("libcore.io.DiskLruCache");
                    lVar.a("\n");
                    lVar.a("1");
                    lVar.a("\n");
                    lVar.a(String.valueOf(this.q));
                    lVar.a("\n");
                    lVar.a(String.valueOf(this.f153490h));
                    lVar.a("\n");
                    lVar.a("\n");
                    for (c cVar : this.n.values()) {
                        if (cVar.f153502c.f156544a != null) {
                            lVar.a("DIRTY " + cVar.f153504e + '\n');
                        } else {
                            lVar.a("CLEAN " + cVar.f153504e + cVar.a() + '\n');
                        }
                    }
                    lVar.a();
                    if (d.a.d.a.d.b(this.f153483a)) {
                        C4084a.a(this.f153483a, this.f153484b, true);
                    }
                    C4084a.a(this.f153491j, this.f153483a, false);
                    d.a.d.a.d.c(this.f153484b);
                    d.a.b.a<m> aVar = this.f153493l;
                    g a2 = d.a.d.a.d.a(this.f153483a, true);
                    if (a2 == null) {
                        h.f.b.l.a();
                    }
                    d.a.b.b.a(aVar, new d.a.d.a.l(a2, d.a.d.a.b.Ascii));
                    fVar.f156552a.unlock();
                } catch (Throwable th) {
                    lVar.a();
                    throw th;
                }
            }
        } finally {
            fVar.f156552a.unlock();
        }
    }

    private static boolean g(String str) {
        return t.matches(str);
    }

    public final b e(String str) {
        if (str == null) {
            return null;
        }
        return h(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a6, code lost:
        if (r6 == -1) goto L_0x00a8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean f(java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 191
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.b.a.a.f(java.lang.String):boolean");
    }

    private b h(String str) {
        f fVar = this.f153486d;
        fVar.f156552a.lock();
        try {
            j();
            l();
            if (g(str)) {
                c cVar = this.n.get(str);
                if (cVar == null) {
                    cVar = new c(this, str);
                    this.n.put(str, cVar);
                } else if (cVar.f153502c.f156544a != null) {
                    d.a.e.b.a("DiskLruCache", "key: " + str + " is now in editing, return null!");
                    fVar.f156552a.unlock();
                    return null;
                }
                V v = (V) new b(this, cVar);
                cVar.f153502c.f156544a = v;
                V v2 = this.f153493l.f156544a;
                if (v2 != null) {
                    v2.a("DIRTY " + str + '\n');
                }
                V v3 = this.f153493l.f156544a;
                if (v3 != null) {
                    v3.f156636a.flush();
                }
                return v;
            }
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        } finally {
            fVar.f156552a.unlock();
        }
    }

    public final boolean c(String str) {
        if (str == null) {
            return false;
        }
        f fVar = this.f153486d;
        fVar.f156552a.lock();
        try {
            j();
            l();
            if (g(str)) {
                c cVar = this.n.get(str);
                if (cVar != null) {
                    if (cVar.f153502c.f156544a == null) {
                        d.a.b.a<Integer> aVar = this.f153485c;
                        aVar.f156544a = (V) Integer.valueOf(aVar.f156544a.intValue() + 1);
                        V v = this.f153493l.f156544a;
                        if (v != null) {
                            v.a("REMOVE " + str + '\n');
                        }
                        V v2 = this.f153493l.f156544a;
                        if (v2 != null) {
                            v2.f156636a.flush();
                        }
                        this.n.remove(str);
                        int i2 = this.f153490h;
                        for (int i3 = 0; i3 < i2; i3++) {
                            h a2 = cVar.a(i3);
                            try {
                                com.ss.ugc.effectplatform.util.k.a(a2);
                                d.a.b.a<Long> aVar2 = this.f153492k;
                                aVar2.f156544a = (V) Long.valueOf(aVar2.f156544a.longValue() - cVar.f153500a.get(i3).longValue());
                                cVar.f153500a.set(i3, 0L);
                            } catch (Exception unused) {
                                throw new Exception("failed to delete ".concat(String.valueOf(a2)));
                            }
                        }
                        if (g()) {
                            this.o.execute(this.p);
                        }
                        fVar.f156552a.unlock();
                        return true;
                    }
                }
                return false;
            }
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        } finally {
            fVar.f156552a.unlock();
        }
    }

    public final d d(String str) {
        d.a.d.a.c cVar;
        if (str == null) {
            return null;
        }
        f fVar = this.f153486d;
        fVar.f156552a.lock();
        try {
            j();
            l();
            if (g(str)) {
                c cVar2 = this.n.get(str);
                if (cVar2 == null) {
                    return null;
                }
                if (!cVar2.f153501b.f156544a.booleanValue()) {
                    fVar.f156552a.unlock();
                    return null;
                }
                int i2 = this.f153490h;
                d.a.d.a.c[] cVarArr = new d.a.d.a.c[i2];
                h[] hVarArr = new h[i2];
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    try {
                        hVarArr[i4] = cVar2.a(i4);
                        h hVar = hVarArr[i4];
                        if (hVar != null) {
                            cVarArr[i4] = d.a.d.a.d.d(hVar);
                        }
                    } catch (Exception unused) {
                        while (i3 < this.f153490h && (cVar = cVarArr[i3]) != null) {
                            d.a.d.a.d.a((k) cVar);
                            i3++;
                        }
                        fVar.f156552a.unlock();
                        return null;
                    }
                }
                d.a.b.a<Integer> aVar = this.f153485c;
                aVar.f156544a = (V) Integer.valueOf(aVar.f156544a.intValue() + 1);
                V v = this.f153493l.f156544a;
                if (v != null) {
                    v.a("READ " + str + '\n');
                }
                if (g()) {
                    this.o.execute(this.p);
                }
                d dVar = new d(this, str, cVar2.f153503d.f156544a.longValue(), hVarArr, cVarArr, n.f((Collection<Long>) cVar2.f153500a));
                fVar.f156552a.unlock();
                return dVar;
            }
            c(str);
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        } finally {
            fVar.f156552a.unlock();
        }
    }

    public final boolean b(String str) {
        if (str == null) {
            return false;
        }
        f fVar = this.f153486d;
        fVar.f156552a.lock();
        try {
            l();
            if (g(str)) {
                c cVar = this.n.get(str);
                if (cVar == null) {
                    return false;
                }
                if (!cVar.f153501b.f156544a.booleanValue()) {
                    fVar.f156552a.unlock();
                    return false;
                }
                try {
                    d.a.b.a<Integer> aVar = this.f153485c;
                    aVar.f156544a = (V) Integer.valueOf(aVar.f156544a.intValue() + 1);
                    V v = this.f153493l.f156544a;
                    if (v != null) {
                        v.a("READ " + str + '\n');
                    }
                    V v2 = this.f153493l.f156544a;
                    if (v2 != null) {
                        v2.f156636a.flush();
                    }
                    if (g()) {
                        this.o.execute(this.p);
                    }
                } catch (Exception unused) {
                }
                fVar.f156552a.unlock();
                return true;
            }
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        } finally {
            fVar.f156552a.unlock();
        }
    }

    public final boolean a(String str) {
        long j2;
        String str2;
        Long l2;
        h.f.b.l.c(str, "");
        f fVar = this.f153486d;
        fVar.f156552a.lock();
        try {
            l();
            if (g(str)) {
                c cVar = this.n.get(str);
                boolean z = false;
                if (cVar == null) {
                    cVar = new c(this, str);
                    this.n.put(str, cVar);
                } else if (cVar.f153502c.f156544a != null) {
                    fVar.f156552a.unlock();
                    return false;
                }
                h a2 = cVar.a(0);
                if (d.a.d.a.d.b(a2)) {
                    long longValue = cVar.f153500a.get(0).longValue();
                    d.a.d.a.f a3 = d.a.d.a.d.a(a2);
                    if (a3 == null || (l2 = a3.f156630f) == null) {
                        j2 = 0;
                    } else {
                        j2 = l2.longValue();
                    }
                    if (a3 != null && a3.f156631g == i.Directory) {
                        if (a2 != null) {
                            str2 = a2.f156633a;
                        } else {
                            str2 = null;
                        }
                        j2 = com.ss.ugc.effectplatform.util.k.a(str2);
                    }
                    cVar.f153500a.set(0, Long.valueOf(j2));
                    d.a.b.a<Long> aVar = this.f153492k;
                    aVar.f156544a = (V) Long.valueOf((aVar.f156544a.longValue() - longValue) + j2);
                    d.a.b.a<Integer> aVar2 = this.f153485c;
                    aVar2.f156544a = (V) Integer.valueOf(aVar2.f156544a.intValue() + 1);
                    cVar.f153502c.f156544a = null;
                    cVar.f153501b.f156544a = (V) true;
                    V v = this.f153493l.f156544a;
                    if (v != null) {
                        v.a("CLEAN " + cVar.f153504e + cVar.a() + '\n');
                    }
                    d.a.b.a<Long> aVar3 = this.f153494m;
                    aVar3.f156544a = (V) Long.valueOf(aVar3.f156544a.longValue() + 1);
                    cVar.f153503d.f156544a = this.f153494m.f156544a;
                    V v2 = this.f153493l.f156544a;
                    if (v2 != null) {
                        v2.f156636a.flush();
                    }
                    if (this.f153492k.f156544a.longValue() > this.r || g()) {
                        this.o.execute(this.p);
                    }
                    z = true;
                } else {
                    this.n.remove(cVar.f153504e);
                    V v3 = this.f153493l.f156544a;
                    if (v3 != null) {
                        v3.a("REMOVE " + cVar.f153504e + '\n');
                    }
                }
                return z;
            }
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        } finally {
            fVar.f156552a.unlock();
        }
    }

    public final void a(b bVar, boolean z) {
        long j2;
        Long l2;
        f fVar = this.f153486d;
        fVar.f156552a.lock();
        try {
            c cVar = bVar.f153497c;
            if (!(!h.f.b.l.a((Object) cVar.f153502c.f156544a, (Object) bVar))) {
                if (z && !cVar.f153501b.f156544a.booleanValue()) {
                    int i2 = this.f153490h;
                    for (int i3 = 0; i3 < i2; i3++) {
                        if (!((boolean[]) bVar.f153495a.f156544a)[i3]) {
                            bVar.c();
                            throw new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i3)));
                        } else if (cVar.b(i3) != null && !d.a.d.a.d.b(cVar.b(i3))) {
                            bVar.c();
                            return;
                        }
                    }
                }
                int i4 = this.f153490h;
                for (int i5 = 0; i5 < i4; i5++) {
                    h b2 = cVar.b(i5);
                    if (b2 != null) {
                        if (!z) {
                            com.ss.ugc.effectplatform.util.k.a(b2);
                        } else if (d.a.d.a.d.b(b2)) {
                            h a2 = cVar.a(i5);
                            d.a.d.a.d.a(b2, a2);
                            long longValue = cVar.f153500a.get(i5).longValue();
                            d.a.d.a.f a3 = d.a.d.a.d.a(a2);
                            if (a3 == null || (l2 = a3.f156630f) == null) {
                                j2 = 0;
                            } else {
                                j2 = l2.longValue();
                            }
                            cVar.f153500a.set(i5, Long.valueOf(j2));
                            d.a.b.a<Long> aVar = this.f153492k;
                            aVar.f156544a = (V) Long.valueOf((aVar.f156544a.longValue() - longValue) + j2);
                        }
                    }
                }
                d.a.b.a<Integer> aVar2 = this.f153485c;
                aVar2.f156544a = (V) Integer.valueOf(aVar2.f156544a.intValue() + 1);
                cVar.f153502c.f156544a = null;
                if (cVar.f153501b.f156544a.booleanValue() || z) {
                    cVar.f153501b.f156544a = (V) true;
                    V v = this.f153493l.f156544a;
                    if (v != null) {
                        v.a("CLEAN " + cVar.f153504e + cVar.a() + '\n');
                    }
                    if (z) {
                        d.a.b.a<Long> aVar3 = this.f153494m;
                        aVar3.f156544a = (V) Long.valueOf(aVar3.f156544a.longValue() + 1);
                        cVar.f153503d.f156544a = this.f153494m.f156544a;
                    }
                } else {
                    this.n.remove(cVar.f153504e);
                    V v2 = this.f153493l.f156544a;
                    if (v2 != null) {
                        v2.a("REMOVE " + cVar.f153504e + '\n');
                    }
                }
                V v3 = this.f153493l.f156544a;
                if (v3 != null) {
                    v3.f156636a.flush();
                }
                if (this.f153492k.f156544a.longValue() > this.r || g()) {
                    this.o.execute(this.p);
                }
                fVar.f156552a.unlock();
                return;
            }
            throw new IllegalStateException();
        } finally {
            fVar.f156552a.unlock();
        }
    }

    private a(String str, int i2, int i3, long j2, d dVar) {
        this.f153489g = str;
        this.q = i2;
        this.f153490h = i3;
        this.r = j2;
        this.s = dVar;
        this.f153492k = new d.a.b.a<>(0L);
        this.f153485c = new d.a.b.a<>(0);
        this.f153493l = new d.a.b.a<>(null);
        this.f153486d = new f();
        this.f153487e = new d.a.b.a<>(false);
        this.f153488f = new d.a.b.a<>(false);
        this.f153494m = new d.a.b.a<>(0L);
        this.n = new d.a.a.b<>();
        this.o = new d.a.b.b.a();
        this.p = new e(this);
        h a2 = new h(str).a("journal");
        if (a2 == null) {
            h.f.b.l.a();
        }
        this.f153483a = a2;
        h a3 = new h(str).a("journal.tmp");
        if (a3 == null) {
            h.f.b.l.a();
        }
        this.f153491j = a3;
        h a4 = new h(str).a("journal.bkp");
        if (a4 == null) {
            h.f.b.l.a();
        }
        this.f153484b = a4;
    }

    public /* synthetic */ a(String str, int i2, int i3, long j2, d dVar, byte b2) {
        this(str, i2, i3, j2, dVar);
    }
}
