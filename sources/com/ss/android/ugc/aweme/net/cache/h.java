package com.ss.android.ugc.aweme.net.cache;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.c;
import com.bytedance.retrofit2.mime.TypedInput;
import com.ss.android.ugc.aweme.utils.bw;
import h.f.b.l;
import h.m.p;
import h.r;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import k.aa;
import k.q;

public final class h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f112266b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final bw f112267a;

    static {
        Covode.recordClassIndex(72146);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72147);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final String f112268a;

        /* renamed from: b  reason: collision with root package name */
        final String f112269b;

        /* renamed from: c  reason: collision with root package name */
        final int f112270c;

        /* renamed from: d  reason: collision with root package name */
        final String f112271d;

        /* renamed from: e  reason: collision with root package name */
        public final String f112272e;

        /* renamed from: f  reason: collision with root package name */
        final List<com.bytedance.retrofit2.client.b> f112273f;

        /* renamed from: g  reason: collision with root package name */
        public final long f112274g;

        static {
            Covode.recordClassIndex(72148);
        }

        public static final class a implements TypedInput {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f112275a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ bw.c f112276b;

            static {
                Covode.recordClassIndex(72149);
            }

            @Override // com.bytedance.retrofit2.mime.TypedInput
            public final long length() {
                return -1;
            }

            @Override // com.bytedance.retrofit2.mime.TypedInput
            public final String mimeType() {
                return this.f112275a.f112272e;
            }

            @Override // com.bytedance.retrofit2.mime.TypedInput
            public final InputStream in() {
                InputStream inputStream = this.f112276b.f142747a[1];
                l.b(inputStream, "");
                return inputStream;
            }

            a(b bVar, bw.c cVar) {
                this.f112275a = bVar;
                this.f112276b = cVar;
            }
        }

        public b(aa aaVar) {
            com.bytedance.retrofit2.client.b bVar;
            l.d(aaVar, "");
            try {
                k.h a2 = q.a(aaVar);
                this.f112268a = a2.s();
                this.f112269b = a2.s();
                this.f112270c = Integer.parseInt(a2.s());
                this.f112271d = a2.s();
                this.f112272e = a2.s();
                this.f112274g = Long.parseLong(a2.s());
                int parseInt = Integer.parseInt(a2.s());
                this.f112273f = new ArrayList(parseInt);
                for (int i2 = 0; i2 < parseInt; i2++) {
                    String s = a2.s();
                    ArrayList arrayList = (ArrayList) this.f112273f;
                    int a3 = p.a((CharSequence) s, ":", 0, false, 6);
                    if (a3 == -1) {
                        if (!p.b(s, ":", false)) {
                            bVar = new com.bytedance.retrofit2.client.b("", s);
                        } else if (s != null) {
                            String substring = s.substring(1);
                            l.b(substring, "");
                            bVar = new com.bytedance.retrofit2.client.b("", substring);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                    } else if (s != null) {
                        String substring2 = s.substring(0, a3);
                        l.b(substring2, "");
                        String substring3 = s.substring(a3 + 1);
                        l.b(substring3, "");
                        bVar = new com.bytedance.retrofit2.client.b(substring2, substring3);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    arrayList.add(bVar);
                }
            } finally {
                aaVar.close();
            }
        }

        public b(c cVar, Request request) {
            l.d(cVar, "");
            l.d(request, "");
            String str = cVar.f42473a;
            l.b(str, "");
            this.f112268a = str;
            String method = request.getMethod();
            l.b(method, "");
            this.f112269b = method;
            this.f112270c = cVar.f42474b;
            String str2 = cVar.f42475c;
            l.b(str2, "");
            this.f112271d = str2;
            String mimeType = cVar.f42477e.mimeType();
            this.f112272e = mimeType == null ? "" : mimeType;
            this.f112274g = System.currentTimeMillis();
            List<com.bytedance.retrofit2.client.b> list = cVar.f42476d;
            l.b(list, "");
            this.f112273f = list;
        }
    }

    public final c a(Request request) {
        d dVar;
        Object obj;
        Object obj2;
        l.d(request, "");
        f a2 = b.a(request);
        if (a2 == null || (dVar = a2.v) == null) {
            return null;
        }
        int i2 = dVar.f112262d;
        if (i2 != 1 && i2 != 2) {
            return null;
        }
        String a3 = b.a(b.e(request));
        try {
            obj = h.q.m223constructorimpl(this.f112267a.a(a3));
        } catch (Throwable th) {
            obj = h.q.m223constructorimpl(r.a(th));
        }
        if (h.q.m228isFailureimpl(obj)) {
            obj = null;
        }
        bw.c cVar = (bw.c) obj;
        if (cVar == null) {
            return null;
        }
        try {
            InputStream inputStream = cVar.f142747a[0];
            l.b(inputStream, "");
            obj2 = h.q.m223constructorimpl(new b(q.a(inputStream)));
        } catch (Throwable th2) {
            obj2 = h.q.m223constructorimpl(r.a(th2));
        }
        if (h.q.m226exceptionOrNullimpl(obj2) != null) {
            cVar.close();
        }
        if (h.q.m228isFailureimpl(obj2)) {
            obj2 = null;
        }
        b bVar = (b) obj2;
        if (bVar == null) {
            return null;
        }
        if (System.currentTimeMillis() - bVar.f112274g > ((long) dVar.f112261c)) {
            try {
                h.q.m223constructorimpl(Boolean.valueOf(this.f112267a.c(a3)));
            } catch (Throwable th3) {
                h.q.m223constructorimpl(r.a(th3));
            }
            return null;
        }
        l.d(cVar, "");
        return new c(bVar.f112268a, bVar.f112270c, bVar.f112271d, bVar.f112273f, new b.a(bVar, cVar));
    }
}
