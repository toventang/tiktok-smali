package com.squareup.a.a.b;

import com.bytedance.covode.number.Covode;
import com.squareup.a.p;
import com.squareup.a.v;
import com.squareup.a.x;
import java.util.Date;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final v f57615a;

    /* renamed from: b  reason: collision with root package name */
    public final x f57616b;

    static {
        Covode.recordClassIndex(35933);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f57617a;

        /* renamed from: b  reason: collision with root package name */
        public final v f57618b;

        /* renamed from: c  reason: collision with root package name */
        public final x f57619c;

        /* renamed from: d  reason: collision with root package name */
        public Date f57620d;

        /* renamed from: e  reason: collision with root package name */
        public String f57621e;

        /* renamed from: f  reason: collision with root package name */
        public Date f57622f;

        /* renamed from: g  reason: collision with root package name */
        public String f57623g;

        /* renamed from: h  reason: collision with root package name */
        public Date f57624h;

        /* renamed from: i  reason: collision with root package name */
        public long f57625i;

        /* renamed from: j  reason: collision with root package name */
        public long f57626j;

        /* renamed from: k  reason: collision with root package name */
        public String f57627k;

        /* renamed from: l  reason: collision with root package name */
        public int f57628l = -1;

        static {
            Covode.recordClassIndex(35934);
        }

        public static boolean a(v vVar) {
            if (vVar.a("If-Modified-Since") == null && vVar.a("If-None-Match") == null) {
                return false;
            }
            return true;
        }

        public a(long j2, v vVar, x xVar) {
            this.f57617a = j2;
            this.f57618b = vVar;
            this.f57619c = xVar;
            if (xVar != null) {
                p pVar = xVar.f57936f;
                int length = pVar.f57876a.length / 2;
                for (int i2 = 0; i2 < length; i2++) {
                    String a2 = pVar.a(i2);
                    String b2 = pVar.b(i2);
                    if ("Date".equalsIgnoreCase(a2)) {
                        this.f57620d = g.a(b2);
                        this.f57621e = b2;
                    } else if ("Expires".equalsIgnoreCase(a2)) {
                        this.f57624h = g.a(b2);
                    } else if ("Last-Modified".equalsIgnoreCase(a2)) {
                        this.f57622f = g.a(b2);
                        this.f57623g = b2;
                    } else if ("ETag".equalsIgnoreCase(a2)) {
                        this.f57627k = b2;
                    } else if ("Age".equalsIgnoreCase(a2)) {
                        this.f57628l = d.b(b2, -1);
                    } else if (k.f57693b.equalsIgnoreCase(a2)) {
                        this.f57625i = Long.parseLong(b2);
                    } else if (k.f57694c.equalsIgnoreCase(a2)) {
                        this.f57626j = Long.parseLong(b2);
                    }
                }
            }
        }
    }

    private c(v vVar, x xVar) {
        this.f57615a = vVar;
        this.f57616b = xVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004e, code lost:
        if (r3.c().f57817g == false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(com.squareup.a.x r3, com.squareup.a.v r4) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.a.a.b.c.a(com.squareup.a.x, com.squareup.a.v):boolean");
    }

    public /* synthetic */ c(v vVar, x xVar, byte b2) {
        this(vVar, xVar);
    }
}
