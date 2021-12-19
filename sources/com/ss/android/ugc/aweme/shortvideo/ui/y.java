package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.property.cu;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.ui.creationflow.b;
import com.ss.android.ugc.aweme.shortvideo.ui.creationflow.c;
import com.ss.android.ugc.tools.f.b;
import com.ss.android.ugc.tools.utils.q;
import h.c.b.a.k;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import java.io.File;
import java.lang.reflect.Type;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;

public final class y {
    static {
        Covode.recordClassIndex(86464);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends k implements m<am, d<? super z>, Object> {
        final /* synthetic */ ShortVideoContext $shortVideoContext;
        int label;

        static {
            Covode.recordClassIndex(86465);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ShortVideoContext shortVideoContext, d dVar) {
            super(2, dVar);
            this.$shortVideoContext = shortVideoContext;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new a(this.$shortVideoContext, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        private static boolean a(File file) {
            MethodCollector.i(11467);
            try {
                e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
                if (e.a(file.getAbsolutePath(), cVar)) {
                    e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
                }
                if (e.c(file.getAbsolutePath(), cVar)) {
                    e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                    MethodCollector.o(11467);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.o(11467);
            return delete;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                Workspace workspace = this.$shortVideoContext.f124757b.f124713h;
                File a2 = workspace.a();
                if (!a2.exists()) {
                    a2 = null;
                }
                if (a2 != null) {
                    a(a2);
                    StringBuilder sb = new StringBuilder("delete video, path is ");
                    File a3 = workspace.a();
                    l.b(a3, "");
                    q.b(sb.append(a3.getPath()).toString());
                }
                File b2 = workspace.b();
                if (b2.exists()) {
                    a(b2);
                    StringBuilder sb2 = new StringBuilder("delete audio, path is ");
                    File b3 = workspace.b();
                    l.b(b3, "");
                    q.b(sb2.append(b3.getPath()).toString());
                }
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final void a(androidx.appcompat.app.d dVar, com.ss.android.ugc.aweme.shortvideo.w.a aVar, h.f.a.a<? extends ShortVideoContext> aVar2, h.f.a.a<f> aVar3, h.f.a.a<? extends com.bytedance.creativex.recorder.b.a.m> aVar4, h.f.a.a<? extends com.bytedance.creativex.recorder.b.a.d> aVar5) {
        l.d(dVar, "");
        l.d(aVar, "");
        l.d(aVar2, "");
        l.d(aVar3, "");
        l.d(aVar4, "");
        l.d(aVar5, "");
        ShortVideoContext shortVideoContext = (ShortVideoContext) aVar2.invoke();
        Object a2 = aVar3.invoke().a((Type) c.class, (String) null);
        l.b(a2, "");
        c cVar = (c) a2;
        if (shortVideoContext.f124757b.f124706a == 1 && shortVideoContext.f124758c == 0 && !shortVideoContext.f124757b.f124714i) {
            cr.a().q = "";
            b a3 = new b().a("enter_from", "video_shoot_page").a("creation_id", shortVideoContext.q);
            if (shortVideoContext.C != 0) {
                a3.a("creation_id", shortVideoContext.q);
            }
            if (shortVideoContext.f124758c == 0) {
                a3.a("draft_way", "general_draft_list");
            }
            com.ss.android.ugc.aweme.utils.d.a("click_draft_edit_cancel", a3.f149193a);
            if (shortVideoContext.f124758c == 0) {
                AVServiceImpl.a().draftService().enterDraftBox(dVar);
            }
        }
        if (dVar.getIntent().getBooleanExtra("navigate_back_to_main", false)) {
            Intent intent = new Intent(dVar, com.ss.android.ugc.aweme.port.in.c.f115624c.d());
            try {
                com.ss.android.ugc.tiktok.security.a.a.a(intent, dVar);
                dVar.startActivity(intent);
            } catch (Exception unused) {
                com.ss.android.ugc.aweme.df.q.a("returnmain", new ar().a("event", "crash").a());
            }
        }
        if (shortVideoContext.ai) {
            dVar.setResult(-1);
        }
        if (shortVideoContext.f124757b.f124714i) {
            cVar.a(new b.C3421b(dVar, ((com.bytedance.creativex.recorder.b.a.m) aVar4.invoke()).a(), shortVideoContext, ((com.bytedance.creativex.recorder.b.a.d) aVar5.invoke()).N()));
        } else if (shortVideoContext.c()) {
            cVar.a(new b.d(dVar, aVar.f132671a));
        } else if (shortVideoContext.f124757b.f124706a != 1) {
            q.b("current restoreType is " + shortVideoContext.f124757b.f124706a);
            cVar.a(new b.c(dVar));
            if (cu.a()) {
                bz unused2 = i.a(bs.f159054a, bf.f159041b, null, new a(shortVideoContext, null), 2);
            }
        } else {
            cVar.a(new b.c(dVar));
        }
    }
}
