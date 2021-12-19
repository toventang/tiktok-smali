package com.squareup.a.a.a;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k.aa;
import k.f;
import k.i;
import k.q;

/* access modifiers changed from: package-private */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final f[] f57518a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<i, Integer> f57519b;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f57520a;

        /* renamed from: b  reason: collision with root package name */
        public int f57521b;

        /* renamed from: c  reason: collision with root package name */
        f[] f57522c;

        /* renamed from: d  reason: collision with root package name */
        int f57523d;

        /* renamed from: e  reason: collision with root package name */
        int f57524e;

        /* renamed from: f  reason: collision with root package name */
        int f57525f;

        /* renamed from: g  reason: collision with root package name */
        private final List<f> f57526g = new ArrayList();

        /* renamed from: h  reason: collision with root package name */
        private final k.h f57527h;

        static {
            Covode.recordClassIndex(35903);
        }

        private int e() {
            return this.f57527h.h() & 255;
        }

        public final List<f> c() {
            ArrayList arrayList = new ArrayList(this.f57526g);
            this.f57526g.clear();
            return arrayList;
        }

        private void d() {
            this.f57526g.clear();
            Arrays.fill(this.f57522c, (Object) null);
            this.f57523d = this.f57522c.length - 1;
            this.f57524e = 0;
            this.f57525f = 0;
        }

        private i f() {
            boolean z;
            int e2 = e();
            if ((e2 & 128) == 128) {
                z = true;
            } else {
                z = false;
            }
            int a2 = a(e2, 127);
            if (z) {
                return i.of(j.f57550a.a(this.f57527h.k((long) a2)));
            }
            return this.f57527h.g((long) a2);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            int i2 = this.f57521b;
            int i3 = this.f57525f;
            if (i2 >= i3) {
                return;
            }
            if (i2 == 0) {
                d();
            } else {
                a(i3 - i2);
            }
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            while (!this.f57527h.e()) {
                int h2 = this.f57527h.h() & 255;
                if (h2 == 128) {
                    throw new IOException("index == 0");
                } else if ((h2 & 128) == 128) {
                    int a2 = a(h2, 127) - 1;
                    if (d(a2)) {
                        this.f57526g.add(h.f57518a[a2]);
                    } else {
                        int b2 = b(a2 - h.f57518a.length);
                        if (b2 >= 0) {
                            f[] fVarArr = this.f57522c;
                            if (b2 <= fVarArr.length - 1) {
                                this.f57526g.add(fVarArr[b2]);
                            }
                        }
                        throw new IOException("Header index too large " + (a2 + 1));
                    }
                } else if (h2 == 64) {
                    a(new f(h.a(f()), f()));
                } else if ((h2 & 64) == 64) {
                    a(new f(c(a(h2, 63) - 1), f()));
                } else if ((h2 & 32) == 32) {
                    int a3 = a(h2, 31);
                    this.f57521b = a3;
                    if (a3 < 0 || a3 > this.f57520a) {
                        throw new IOException("Invalid dynamic table size update " + this.f57521b);
                    }
                    a();
                } else if (h2 == 16 || h2 == 0) {
                    this.f57526g.add(new f(h.a(f()), f()));
                } else {
                    this.f57526g.add(new f(c(a(h2, 15) - 1), f()));
                }
            }
        }

        private int b(int i2) {
            return this.f57523d + 1 + i2;
        }

        private static boolean d(int i2) {
            if (i2 < 0 || i2 > h.f57518a.length - 1) {
                return false;
            }
            return true;
        }

        private i c(int i2) {
            if (d(i2)) {
                return h.f57518a[i2].f57514h;
            }
            return this.f57522c[b(i2 - h.f57518a.length)].f57514h;
        }

        a(aa aaVar) {
            f[] fVarArr = new f[8];
            this.f57522c = fVarArr;
            this.f57523d = fVarArr.length - 1;
            this.f57524e = 0;
            this.f57525f = 0;
            this.f57520a = 4096;
            this.f57521b = 4096;
            this.f57527h = q.a(aaVar);
        }

        private int a(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.f57522c.length - 1;
                while (true) {
                    i3 = this.f57523d;
                    if (length < i3 || i2 <= 0) {
                        f[] fVarArr = this.f57522c;
                        System.arraycopy(fVarArr, i3 + 1, fVarArr, i3 + 1 + i4, this.f57524e);
                        this.f57523d += i4;
                    } else {
                        i2 -= this.f57522c[length].f57516j;
                        this.f57525f -= this.f57522c[length].f57516j;
                        this.f57524e--;
                        i4++;
                        length--;
                    }
                }
                f[] fVarArr2 = this.f57522c;
                System.arraycopy(fVarArr2, i3 + 1, fVarArr2, i3 + 1 + i4, this.f57524e);
                this.f57523d += i4;
            }
            return i4;
        }

        private void a(f fVar) {
            this.f57526g.add(fVar);
            int i2 = fVar.f57516j;
            int i3 = this.f57521b;
            if (i2 > i3) {
                d();
                return;
            }
            a((this.f57525f + i2) - i3);
            int i4 = this.f57524e + 1;
            f[] fVarArr = this.f57522c;
            if (i4 > fVarArr.length) {
                f[] fVarArr2 = new f[(fVarArr.length * 2)];
                System.arraycopy(fVarArr, 0, fVarArr2, fVarArr.length, fVarArr.length);
                this.f57523d = this.f57522c.length - 1;
                this.f57522c = fVarArr2;
            }
            int i5 = this.f57523d;
            this.f57523d = i5 - 1;
            this.f57522c[i5] = fVar;
            this.f57524e++;
            this.f57525f += i2;
        }

        private int a(int i2, int i3) {
            int i4 = i2 & i3;
            if (i4 < i3) {
                return i4;
            }
            int i5 = 0;
            while (true) {
                int e2 = e();
                if ((e2 & 128) == 0) {
                    return i3 + (e2 << i5);
                }
                i3 += (e2 & 127) << i5;
                i5 += 7;
            }
        }
    }

    static {
        Covode.recordClassIndex(35902);
        int i2 = 0;
        f[] fVarArr = {new f(f.f57511e, ""), new f(f.f57508b, "GET"), new f(f.f57508b, "POST"), new f(f.f57509c, "/"), new f(f.f57509c, "/index.html"), new f(f.f57510d, "http"), new f(f.f57510d, "https"), new f(f.f57507a, "200"), new f(f.f57507a, "204"), new f(f.f57507a, "206"), new f(f.f57507a, "304"), new f(f.f57507a, "400"), new f(f.f57507a, "404"), new f(f.f57507a, "500"), new f("accept-charset", ""), new f("accept-encoding", "gzip, deflate"), new f("accept-language", ""), new f("accept-ranges", ""), new f("accept", ""), new f("access-control-allow-origin", ""), new f("age", ""), new f("allow", ""), new f("authorization", ""), new f("cache-control", ""), new f("content-disposition", ""), new f("content-encoding", ""), new f("content-language", ""), new f("content-length", ""), new f("content-location", ""), new f("content-range", ""), new f("content-type", ""), new f("cookie", ""), new f("date", ""), new f("etag", ""), new f("expect", ""), new f("expires", ""), new f("from", ""), new f("host", ""), new f("if-match", ""), new f("if-modified-since", ""), new f("if-none-match", ""), new f("if-range", ""), new f("if-unmodified-since", ""), new f("last-modified", ""), new f("link", ""), new f("location", ""), new f("max-forwards", ""), new f("proxy-authenticate", ""), new f("proxy-authorization", ""), new f("range", ""), new f("referer", ""), new f("refresh", ""), new f("retry-after", ""), new f("server", ""), new f("set-cookie", ""), new f("strict-transport-security", ""), new f("transfer-encoding", ""), new f("user-agent", ""), new f("vary", ""), new f("via", ""), new f("www-authenticate", "")};
        f57518a = fVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(fVarArr.length);
        while (true) {
            f[] fVarArr2 = f57518a;
            if (i2 < fVarArr2.length) {
                if (!linkedHashMap.containsKey(fVarArr2[i2].f57514h)) {
                    linkedHashMap.put(fVarArr2[i2].f57514h, Integer.valueOf(i2));
                }
                i2++;
            } else {
                f57519b = Collections.unmodifiableMap(linkedHashMap);
                return;
            }
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final f f57528a;

        static {
            Covode.recordClassIndex(35904);
        }

        b(f fVar) {
            this.f57528a = fVar;
        }

        private void a(i iVar) {
            a(iVar.size(), 127);
            this.f57528a.a(iVar);
        }

        /* access modifiers changed from: package-private */
        public final void a(List<f> list) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                i asciiLowercase = list.get(i2).f57514h.toAsciiLowercase();
                Integer num = h.f57519b.get(asciiLowercase);
                if (num != null) {
                    a(num.intValue() + 1, 15);
                    a(list.get(i2).f57515i);
                } else {
                    this.f57528a.a(0);
                    a(asciiLowercase);
                    a(list.get(i2).f57515i);
                }
            }
        }

        private void a(int i2, int i3) {
            if (i2 < i3) {
                this.f57528a.a(i2 | 0);
                return;
            }
            this.f57528a.a(i3 | 0);
            int i4 = i2 - i3;
            while (i4 >= 128) {
                this.f57528a.a(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.f57528a.a(i4);
        }
    }

    public static i a(i iVar) {
        int size = iVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            byte b2 = iVar.getByte(i2);
            if (b2 >= 65 && b2 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + iVar.utf8());
            }
        }
        return iVar;
    }
}
