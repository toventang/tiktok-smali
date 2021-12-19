package com.ss.android.ugc.aweme.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.o;
import h.f.b.l;

public final class j implements s {

    /* renamed from: c  reason: collision with root package name */
    public static String f110770c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f110771d;

    /* renamed from: a  reason: collision with root package name */
    public final String f110772a;

    /* renamed from: b  reason: collision with root package name */
    final d f110773b;

    /* renamed from: e  reason: collision with root package name */
    private final String f110774e;

    public static final class a {
        static {
            Covode.recordClassIndex(71095);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static j a(o oVar, d dVar) {
            l.d(oVar, "");
            l.d(dVar, "");
            try {
                com.google.gson.l c2 = oVar.c("key");
                l.b(c2, "");
                String c3 = c2.c();
                com.google.gson.l c4 = oVar.c("thumbnail");
                l.b(c4, "");
                String c5 = c4.c();
                l.b(c3, "");
                l.b(c5, "");
                return new j(c3, c5, dVar);
            } catch (Exception e2) {
                e2.getMessage();
                return null;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.model.s
    public final String a() {
        return this.f110772a;
    }

    @Override // com.ss.android.ugc.aweme.model.s
    public final String b() {
        return this.f110774e;
    }

    @Override // com.ss.android.ugc.aweme.model.s
    public final d c() {
        return this.f110773b;
    }

    static {
        Covode.recordClassIndex(71094);
        a aVar = new a((byte) 0);
        f110771d = aVar;
        f110770c = aVar.getClass().getSimpleName();
    }

    public j(String str, String str2, d dVar) {
        l.d(str, "");
        l.d(str2, "");
        l.d(dVar, "");
        this.f110772a = str;
        this.f110774e = str2;
        this.f110773b = dVar;
    }
}
