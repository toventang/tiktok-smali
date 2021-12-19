package com.ss.ugc.effectplatform;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.m.p;

public final class d {
    static {
        Covode.recordClassIndex(102374);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<String, String> {
        final /* synthetic */ String $key;
        final /* synthetic */ f $this_decryptList;

        static {
            Covode.recordClassIndex(102375);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar, String str) {
            super(1);
            this.$this_decryptList = fVar;
            this.$key = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(String str) {
            String str2 = str;
            l.c(str2, "");
            String decrypt = this.$this_decryptList.decrypt(str2, this.$key);
            if (decrypt == null) {
                return "";
            }
            return decrypt;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<String, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f153567a = new b();

        static {
            Covode.recordClassIndex(102376);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(String str) {
            String str2 = str;
            l.c(str2, "");
            return Boolean.valueOf(!p.a((CharSequence) str2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (h.m.p.a((java.lang.CharSequence) r0) == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        r5 = "760.0.0.148-alpha.2-mt";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<java.lang.String> a(com.ss.ugc.effectplatform.f r3, java.util.List<java.lang.String> r4, java.lang.String r5) {
        /*
            java.lang.String r1 = ""
            h.f.b.l.c(r3, r1)
            h.f.b.l.c(r5, r1)
            if (r4 != 0) goto L_0x000c
            r0 = 0
            return r0
        L_0x000c:
            boolean r0 = com.ss.ugc.effectplatform.d.a.f153565a
            if (r0 == 0) goto L_0x003d
            h.f.b.l.c(r3, r1)
            h.f.b.l.c(r4, r1)
            h.f.b.l.c(r5, r1)
            java.util.Iterator r2 = r4.iterator()
        L_0x001d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003b
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = h.m.p.a(r1)
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = r3.decrypt(r1, r5)
            if (r0 == 0) goto L_0x003b
            boolean r0 = h.m.p.a(r0)
            if (r0 == 0) goto L_0x003d
        L_0x003b:
            java.lang.String r5 = "760.0.0.148-alpha.2-mt"
        L_0x003d:
            h.l.h r1 = h.a.n.t(r4)
            com.ss.ugc.effectplatform.d$a r0 = new com.ss.ugc.effectplatform.d$a
            r0.<init>(r3, r5)
            h.l.h r1 = h.l.k.e(r1, r0)
            com.ss.ugc.effectplatform.d$b r0 = com.ss.ugc.effectplatform.d.b.f153567a
            h.l.h r0 = h.l.k.a(r1, r0)
            java.util.List r0 = h.l.k.g(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.d.a(com.ss.ugc.effectplatform.f, java.util.List, java.lang.String):java.util.List");
    }
}
