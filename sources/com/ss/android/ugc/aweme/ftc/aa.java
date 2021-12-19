package com.ss.android.ugc.aweme.ftc;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.tools.utils.q;
import h.c.b.a.k;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import java.io.File;
import kotlinx.coroutines.am;

public final class aa {
    static {
        Covode.recordClassIndex(61889);
    }

    static final class a extends k implements m<am, d<? super z>, Object> {
        final /* synthetic */ ShortVideoContext $shortVideoContext;
        int label;

        static {
            Covode.recordClassIndex(61890);
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
            MethodCollector.i(10202);
            try {
                e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
                if (e.a(file.getAbsolutePath(), cVar)) {
                    e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
                }
                if (e.c(file.getAbsolutePath(), cVar)) {
                    e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                    MethodCollector.o(10202);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.o(10202);
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
}
