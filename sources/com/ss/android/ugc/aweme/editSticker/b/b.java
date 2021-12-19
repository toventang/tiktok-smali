package com.ss.android.ugc.aweme.editSticker.b;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.editSticker.h;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.c.b.a.d;
import h.c.b.a.k;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import java.io.File;
import java.io.IOException;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.i;

public final class b {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.editSticker.b.b$b  reason: collision with other inner class name */
    public static final class C2137b extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        static {
            Covode.recordClassIndex(55380);
        }

        C2137b(h.c.d dVar) {
            super(dVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.b(null, this);
        }
    }

    static {
        Covode.recordClassIndex(55378);
    }

    /* access modifiers changed from: package-private */
    public static final class c extends k implements m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ Effect $this_unzipEffectRes;
        int label;

        static {
            Covode.recordClassIndex(55381);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Effect effect, h.c.d dVar) {
            super(2, dVar);
            this.$this_unzipEffectRes = effect;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new c(this.$this_unzipEffectRes, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((c) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        private static boolean a(File file) {
            MethodCollector.i(3758);
            try {
                e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
                if (e.a(file.getAbsolutePath(), cVar)) {
                    e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
                }
                if (e.c(file.getAbsolutePath(), cVar)) {
                    e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                    MethodCollector.o(3758);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.o(3758);
            return delete;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                try {
                    File file = new File(this.$this_unzipEffectRes.getZipPath());
                    try {
                        FileUtils.INSTANCE.removeDir(this.$this_unzipEffectRes.getUnzipPath());
                        FileUtils.INSTANCE.unZip(this.$this_unzipEffectRes.getZipPath(), this.$this_unzipEffectRes.getUnzipPath());
                    } catch (IOException e2) {
                        h d2 = com.ss.android.ugc.aweme.editSticker.d.d();
                        if (d2 != null) {
                            d2.b(Log.getStackTraceString(e2));
                        }
                    } catch (Throwable th) {
                        a(file);
                        throw th;
                    }
                    a(file);
                } catch (Exception e3) {
                    h d3 = com.ss.android.ugc.aweme.editSticker.d.d();
                    if (d3 != null) {
                        d3.b("EffectExt unzipEffectRes, effect id : " + this.$this_unzipEffectRes.getEffectId() + " , exception : " + Log.getStackTraceString(e3));
                    }
                }
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final boolean a(Effect effect) {
        File[] listFiles;
        String str;
        l.d(effect, "");
        try {
            File file = new File(effect.getUnzipPath());
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2 != null) {
                        str = file2.getName();
                    } else {
                        str = null;
                    }
                    if (l.a((Object) str, (Object) "config.json")) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e2) {
            h d2 = com.ss.android.ugc.aweme.editSticker.d.d();
            if (d2 != null) {
                d2.b("EffectExt isUnzipEffectResExistSync, effect id : " + effect.getEffectId() + " , exception : " + Log.getStackTraceString(e2));
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a extends k implements m<am, h.c.d<? super Boolean>, Object> {
        final /* synthetic */ Effect $this_isUnzipEffectResExistAsync;
        int label;

        static {
            Covode.recordClassIndex(55379);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Effect effect, h.c.d dVar) {
            super(2, dVar);
            this.$this_isUnzipEffectResExistAsync = effect;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new a(this.$this_isUnzipEffectResExistAsync, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super Boolean> dVar) {
            return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            File[] listFiles;
            String str;
            if (this.label == 0) {
                r.a(obj);
                try {
                    File file = new File(this.$this_isUnzipEffectResExistAsync.getUnzipPath());
                    if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                        for (File file2 : listFiles) {
                            if (file2 != null) {
                                str = file2.getName();
                            } else {
                                str = null;
                            }
                            if (l.a((Object) str, (Object) "config.json")) {
                                return true;
                            }
                        }
                    }
                    return false;
                } catch (Exception e2) {
                    h d2 = com.ss.android.ugc.aweme.editSticker.d.d();
                    if (d2 != null) {
                        d2.b("EffectExt isUnzipEffectResExistAsync, effect id : " + this.$this_isUnzipEffectResExistAsync.getEffectId() + " , exception : " + Log.getStackTraceString(e2));
                    }
                    return false;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public static final Object a(Effect effect, h.c.d<? super Boolean> dVar) {
        return i.a(bf.f159041b, new a(effect, null), dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(com.ss.android.ugc.effectmanager.effect.model.Effect r6, h.c.d<? super h.z> r7) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.b.b.b(com.ss.android.ugc.effectmanager.effect.model.Effect, h.c.d):java.lang.Object");
    }
}
