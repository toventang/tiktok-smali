package com.ss.android.ugc.aweme.shortvideo.beauty;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.a.a.f;
import com.bytedance.creativex.recorder.a.i;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.dp;
import com.ss.android.ugc.aweme.utils.bj;
import h.a.ag;
import h.f.b.l;
import h.f.b.m;
import h.v;
import h.z;
import java.util.HashMap;

public final class a {

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<Boolean, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f125001a = new b();

        static {
            Covode.recordClassIndex(82116);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(Boolean bool) {
            return bool.booleanValue() ? "composer1" : "beautifynew1";
        }
    }

    static {
        Covode.recordClassIndex(82114);
    }

    public static final class e implements f {
        static {
            Covode.recordClassIndex(82135);
        }

        e() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.beauty.a$a  reason: collision with other inner class name */
    public static final class C3263a extends m implements h.f.a.a<com.ss.android.ugc.tools.b.a.d> {
        final /* synthetic */ boolean $isStory;

        static {
            Covode.recordClassIndex(82115);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3263a(boolean z) {
            super(0);
            this.$isStory = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.tools.b.a.d invoke() {
            Application application = i.f115645a;
            l.b(application, "");
            com.ss.android.ugc.aweme.effectplatform.f a2 = com.ss.android.ugc.aweme.effectplatform.c.a(application, null);
            a2.a(ag.a(v.a("is_story", Integer.valueOf(this.$isStory ? 1 : 0))));
            return a2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f125015a = new d();

        static {
            Covode.recordClassIndex(82131);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.android.ugc.aweme.tools.beauty.e.a.f138912b = i.f115645a;
            com.ss.android.ugc.aweme.tools.beauty.e.a.f138918h = com.ss.android.ugc.aweme.beauty.b.a();
            com.ss.android.ugc.aweme.tools.beauty.e.a aVar = com.ss.android.ugc.aweme.tools.beauty.e.a.s;
            Boolean b2 = g.a().y().b();
            l.b(b2, "");
            aVar.f138935a = b2.booleanValue();
            com.ss.android.ugc.aweme.tools.beauty.e.a.f138920j = g.a().e().getBeautificationMode(0);
            AnonymousClass1 r0 = new com.ss.android.ugc.aweme.tools.beauty.e.b.b() {
                /* class com.ss.android.ugc.aweme.shortvideo.beauty.a.d.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(82132);
                }
            };
            l.d(r0, "");
            com.ss.android.ugc.aweme.tools.beauty.e.a.f138917g = r0;
            AnonymousClass2 r02 = new com.ss.android.ugc.aweme.tools.beauty.e.a.f() {
                /* class com.ss.android.ugc.aweme.shortvideo.beauty.a.d.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(82133);
                }
            };
            l.d(r02, "");
            com.ss.android.ugc.aweme.tools.beauty.e.a.p = r02;
            AnonymousClass3 r03 = new com.ss.android.ugc.aweme.tools.beauty.e.a.b() {
                /* class com.ss.android.ugc.aweme.shortvideo.beauty.a.d.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(82134);
                }

                @Override // com.ss.android.ugc.aweme.tools.beauty.e.a.b
                public final void a(String str, HashMap<String, String> hashMap) {
                    l.d(str, "");
                    l.d(hashMap, "");
                    com.ss.android.ugc.aweme.utils.d.a(str, hashMap);
                }
            };
            l.d(r03, "");
            com.ss.android.ugc.aweme.tools.beauty.e.a.q = r03;
            com.ss.android.ugc.aweme.filter.d.a();
            com.ss.android.ugc.aweme.tools.beauty.e.a.r = true;
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<i.b, z> {
        final /* synthetic */ boolean $enableToast;
        final /* synthetic */ boolean $isStory;

        static {
            Covode.recordClassIndex(82117);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(boolean z, boolean z2) {
            super(1);
            this.$enableToast = z;
            this.$isStory = z2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(i.b bVar) {
            i.b bVar2 = bVar;
            l.d(bVar2, "");
            AnonymousClass1 r0 = AnonymousClass1.f125002a;
            l.d(r0, "");
            bVar2.f28099a = r0;
            AnonymousClass6 r02 = AnonymousClass6.f125011a;
            l.d(r02, "");
            bVar2.f28100b = r02;
            AnonymousClass7 r03 = AnonymousClass7.f125012a;
            l.d(r03, "");
            bVar2.f28101c = r03;
            AnonymousClass8 r04 = AnonymousClass8.f125013a;
            l.d(r04, "");
            bVar2.f28102d = r04;
            bVar2.a(bVar2.f28102d);
            AnonymousClass9 r05 = AnonymousClass9.f125014a;
            l.d(r05, "");
            bVar2.f28104f = r05;
            AnonymousClass10 r06 = AnonymousClass10.f125003a;
            l.d(r06, "");
            bVar2.f28105g = r06;
            AnonymousClass11 r07 = AnonymousClass11.f125004a;
            l.d(r07, "");
            bVar2.f28106h = r07;
            AnonymousClass12 r08 = AnonymousClass12.f125005a;
            l.d(r08, "");
            bVar2.f28107i = r08;
            AnonymousClass13 r09 = AnonymousClass13.f125006a;
            l.d(r09, "");
            bVar2.f28108j = r09;
            AnonymousClass2 r010 = AnonymousClass2.f125007a;
            l.d(r010, "");
            bVar2.f28109k = r010;
            bVar2.n = AnonymousClass3.f125008a;
            bVar2.p = dp.a().a();
            AnonymousClass4 r011 = AnonymousClass4.f125009a;
            l.d(r011, "");
            bVar2.o = r011;
            bVar2.s = com.ss.android.ugc.aweme.filter.b.b.a();
            bVar2.t = this.$enableToast;
            if (this.$isStory) {
                b bVar3 = new b("");
                l.d(bVar3, "");
                bVar2.u = bVar3;
                bVar2.a(AnonymousClass5.f125010a);
            }
            return z.f158842a;
        }
    }

    public static final com.bytedance.creativex.recorder.a.i a(com.bytedance.o.f fVar, boolean z) {
        l.d(fVar, "");
        d dVar = d.f125015a;
        e eVar = new e();
        ShortVideoContext shortVideoContext = (ShortVideoContext) fVar.b(ShortVideoContext.class, null);
        boolean z2 = true;
        if (shortVideoContext == null || !shortVideoContext.aP) {
            z2 = false;
        }
        return new com.bytedance.creativex.recorder.a.i(fVar, new C3263a(z2), b.f125001a, eVar, bj.f142677a, dVar, new c(z, z2));
    }
}
