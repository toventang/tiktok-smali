package com.ss.android.ugc.aweme.emoji.h;

import com.bytedance.covode.number.Covode;
import h.a.z;
import h.c.b.a.k;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import java.util.List;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static List<? extends com.ss.android.ugc.aweme.emoji.g.a> f89326a = z.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    public static int f89327b;

    /* renamed from: c  reason: collision with root package name */
    static boolean f89328c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f89329d = new a();

    /* renamed from: e  reason: collision with root package name */
    private static final am f89330e = an.a(bf.f159040a);

    private a() {
    }

    static {
        Covode.recordClassIndex(56126);
    }

    public static void a() {
        if (com.ss.android.ugc.aweme.emoji.utils.a.a()) {
            f89328c = true;
            f89327b = 0;
            bz unused = i.a(f89330e, bf.f159041b, null, new C2159a(null), 2);
        }
    }

    public static String b() {
        return "SELF_EMOJIS" + com.ss.android.ugc.aweme.emoji.utils.a.c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.emoji.h.a$a  reason: collision with other inner class name */
    public static final class C2159a extends k implements m<am, d<? super h.z>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        static {
            Covode.recordClassIndex(56127);
        }

        C2159a(d dVar) {
            super(2, dVar);
        }

        @Override // h.c.b.a.a
        public final d<h.z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            C2159a aVar = new C2159a(dVar);
            aVar.L$0 = obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super h.z> dVar) {
            return ((C2159a) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x00a1  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00bd  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00d7 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00db  */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
            // Method dump skipped, instructions count: 232
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.emoji.h.a.C2159a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}
