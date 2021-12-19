package com.ss.android.ugc.aweme.tools.draft.c;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.asve.editor.d;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.df.e;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.c.b.a.k;
import h.c.f;
import h.f.a.m;
import h.f.b.l;
import h.r;
import java.io.File;
import java.io.IOException;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.cd;
import kotlinx.coroutines.z;

public final class c {
    static {
        Covode.recordClassIndex(91202);
    }

    public static final am a() {
        z a2 = cd.a(null);
        return an.a(d.f62009a.plus(a2).plus(new a(CoroutineExceptionHandler.f158926c)));
    }

    public static final class a extends h.c.a implements CoroutineExceptionHandler {
        static {
            Covode.recordClassIndex(91203);
        }

        public a(f.c cVar) {
            super(cVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(f fVar, Throwable th) {
            e.a(th);
        }
    }

    public static final class b extends k implements m<am, h.c.d<? super h.z>, Object> {
        final /* synthetic */ Effect $this_unzipDraftStickerRes;
        int label;

        static {
            Covode.recordClassIndex(91204);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Effect effect, h.c.d dVar) {
            super(2, dVar);
            this.$this_unzipDraftStickerRes = effect;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new b(this.$this_unzipDraftStickerRes, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        private static boolean a(File file) {
            MethodCollector.i(108);
            try {
                e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
                if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                    com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
                }
                if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                    com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                    MethodCollector.o(108);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.o(108);
            return delete;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                File file = new File(this.$this_unzipDraftStickerRes.getZipPath());
                try {
                    FileUtils.INSTANCE.removeDir(this.$this_unzipDraftStickerRes.getUnzipPath());
                    FileUtils.INSTANCE.unZip(this.$this_unzipDraftStickerRes.getZipPath(), this.$this_unzipDraftStickerRes.getUnzipPath());
                } catch (IOException e2) {
                    bj.b(Log.getStackTraceString(e2));
                } catch (Throwable th) {
                    a(file);
                    throw th;
                }
                a(file);
                return h.z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
