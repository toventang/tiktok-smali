package com.ss.android.ugc.aweme.deeplink;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    static t f79533a;

    /* renamed from: b  reason: collision with root package name */
    static String f79534b = "";

    /* renamed from: c  reason: collision with root package name */
    static boolean f79535c;

    /* renamed from: d  reason: collision with root package name */
    static b f79536d;

    /* renamed from: e  reason: collision with root package name */
    static c f79537e = new c();

    /* renamed from: f  reason: collision with root package name */
    static d f79538f;

    /* renamed from: g  reason: collision with root package name */
    public static final u f79539g = new u();

    private u() {
    }

    public static s a() {
        t tVar = f79533a;
        if (tVar != null) {
            return tVar.f79532b;
        }
        return null;
    }

    static {
        Covode.recordClassIndex(49401);
    }

    public static void a(String str) {
        l.d(str, "");
        f79534b = str;
    }

    static final class a extends m implements h.f.a.b<w, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f79540a = new a();

        static {
            Covode.recordClassIndex(49402);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(w wVar) {
            Integer num;
            w wVar2 = wVar;
            l.d(wVar2, "");
            String str = wVar2.f79544a;
            t tVar = u.f79533a;
            if (!(tVar == null || (num = tVar.f79531a.get(str)) == null)) {
                tVar.f79532b.f79529a = num.intValue();
            }
            s a2 = u.a();
            if (a2 != null) {
                d dVar = u.f79538f;
                if (dVar == null) {
                    l.b();
                }
                a2.a(dVar, a2);
            }
            return z.f158842a;
        }
    }
}
