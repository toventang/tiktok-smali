package com.bytedance.ies.im.core.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.abmock.i;
import com.bytedance.im.core.a.g;
import com.bytedance.im.core.a.j;
import com.ss.android.ugc.aweme.utils.dg;
import h.c.b.a.k;
import h.c.d;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;

public final class f implements i {

    /* renamed from: a  reason: collision with root package name */
    public static final c f34064a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final f f34065b;

    /* renamed from: c  reason: collision with root package name */
    private static final h f34066c = h.i.a((h.f.a.a) b.f34067a);

    public static c b() {
        return (c) f34066c.getValue();
    }

    private f() {
    }

    static final class b extends m implements h.f.a.a<c> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f34067a = new b();

        static {
            Covode.recordClassIndex(20288);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return a();
        }

        private static c a() {
            try {
                return (c) com.bytedance.ies.abmock.b.a().a(true, "im_options_config", c.class);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Override // com.bytedance.ies.abmock.i
    public final void a() {
        com.bytedance.ies.im.core.api.a.b().b("SdkOptionsExperiment", "onConfigChanged");
        bz unused = kotlinx.coroutines.i.a(an.a(bf.f159040a), null, null, new a(null), 3);
    }

    static {
        Covode.recordClassIndex(20286);
        f fVar = new f();
        f34065b = fVar;
        SettingsManager.a().a(fVar);
    }

    static final class a extends k implements h.f.a.m<am, d<? super z>, Object> {
        int label;

        static {
            Covode.recordClassIndex(20287);
        }

        a(d dVar) {
            super(2, dVar);
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new a(dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
            if (r0.enable != r6.enable) goto L_0x0054;
         */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
            // Method dump skipped, instructions count: 286
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.im.core.e.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void a(com.bytedance.im.core.a.f fVar) {
        l.d(fVar, "");
        c b2 = b();
        if (b2 != null) {
            if (!b2.f34048a) {
                com.bytedance.ies.im.core.api.a.b().b("SdkOptionsExperiment", "init fail cause close experiment!");
            } else {
                com.bytedance.ies.im.core.api.a.b().b("SdkOptionsExperiment", "init for options:" + dg.a().b(b2));
                fVar.n = b2.f34050c;
                fVar.o = b2.f34049b;
                fVar.r = b2.f34051d;
                fVar.p = b2.f34052e;
                fVar.q = b2.f34053f;
            }
        }
        Object a2 = com.bytedance.ies.abmock.b.a().a(true, "im_options_fix_bug", b.class);
        if (a2 != null) {
            com.bytedance.ies.im.core.api.a.b().b("SdkOptionsExperiment", "init for options:" + dg.a().b(a2));
        }
        Object a3 = com.bytedance.ies.abmock.b.a().a(true, "im_options_ws_fake_death", a.class);
        if (a3 != null) {
            com.bytedance.ies.im.core.api.a.b().b("SdkOptionsExperiment", "init for ws fake death:" + dg.a().b(a3));
        }
        fVar.Z = ((Boolean) j.f34085d.getValue()).booleanValue();
        com.bytedance.ies.im.core.api.a.b().a("SdkOptionsExperiment", "options.sendMsgUseParallelQueue = " + fVar.Z);
        fVar.T = com.bytedance.ies.im.core.api.a.f().a().f33967f;
        com.bytedance.ies.im.core.api.a.b().a("SdkOptionsExperiment", "options.autoReportUnreadCount = " + fVar.T);
        com.bytedance.ies.im.core.api.a.a();
        fVar.af = com.bytedance.ies.im.core.api.a.a().g();
        fVar.z = true;
        com.bytedance.ies.im.core.api.a.b().a("SdkOptionsExperiment", "options.sendMsgFallbackPush = " + fVar.z);
        fVar.ah = false;
        com.bytedance.ies.im.core.api.a.b().b("SdkOptionsExperiment", "options.enableWal = " + fVar.ah);
        fVar.av = i.a().f34079a;
        fVar.ar = i.a().f34080b;
        com.bytedance.ies.im.core.api.a.b().a("SdkOptionsExperiment", "options.optimizeSendMsgLocalCost = " + fVar.av);
        com.bytedance.ies.im.core.api.a.b().a("SdkOptionsExperiment", "options.sendMsgOptimizerCacheSize = " + fVar.ar);
        fVar.ai = (com.bytedance.im.core.a.k) m.f34097c.getValue();
        com.bytedance.ies.im.core.api.a.b().b("SdkOptionsExperiment", "options.recentLinkConfig=" + fVar.ai);
        fVar.ak = ((Boolean) k.f34088a.getValue()).booleanValue();
        com.bytedance.ies.im.core.api.a.b().b("SdkOptionsExperiment", "options.pullRecentAndCmdParallel=" + fVar.ak);
        fVar.an = ((Number) n.f34104a.getValue()).intValue();
        com.bytedance.ies.im.core.api.a.b().b("SdkOptionsExperiment", "options.recoverVersion=" + fVar.an);
        fVar.ao = (com.bytedance.im.core.a.l) o.f34108b.getValue();
        com.bytedance.ies.im.core.api.a.b().b("SdkOptionsExperiment", "options.reportDBInfoConfig=" + fVar.ao);
        fVar.ap = (com.bytedance.im.core.a.m) q.f34116b.getValue();
        com.bytedance.ies.im.core.api.a.b().b("SdkOptionsExperiment", "options.reportTaskInfoConfig=" + fVar.ap);
        fVar.aq = ((Boolean) p.f34112b.getValue()).booleanValue();
        com.bytedance.ies.im.core.api.a.b().b("SdkOptionsExperiment", "options.reportDBMetricByTea=" + fVar.aq);
        fVar.ab = (j) h.f34072b.getValue();
        com.bytedance.ies.im.core.api.a.b().b("SdkOptionsExperiment", "options.optimizeConvListPullConfig=" + fVar.ab);
        fVar.ay = (g) s.f34125b.getValue();
        fVar.aj = ((Boolean) l.f34092b.getValue()).booleanValue();
        com.bytedance.ies.im.core.api.a.b().b("SdkOptionsExperiment", "options.recentLinkAsync=" + fVar.aj);
        fVar.as = ((Number) r.f34119a.getValue()).intValue();
        com.bytedance.ies.im.core.api.a.b().b("SdkOptionsExperiment", "options.retryDelConMode=" + fVar.as);
    }
}
