package com.ss.android.ugc.aweme.tools.beauty.d;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.dependence.a.a.b.e;
import com.ss.android.ugc.aweme.tools.beauty.c;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.b.a.d;
import com.ss.android.ugc.tools.utils.u;
import h.f.b.l;
import java.io.File;

public final class a extends com.ss.android.ugc.aweme.dependence.a.a.b.b<c, Void> {

    /* renamed from: i  reason: collision with root package name */
    public static final C3664a f138904i = new C3664a((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    private final d f138905j;

    static {
        Covode.recordClassIndex(90828);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.d.a$a  reason: collision with other inner class name */
    public static final class C3664a {
        static {
            Covode.recordClassIndex(90829);
        }

        private C3664a() {
        }

        public /* synthetic */ C3664a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.dependence.a.a.b.b
    public final boolean a() {
        ComposerBeauty composerBeauty = this.f79574h.f138896a;
        if (com.ss.android.ugc.aweme.tools.beauty.d.a(composerBeauty.getEffect().getEffectId()) < 0) {
            return true;
        }
        return this.f138905j.c(composerBeauty.getEffect());
    }

    public static final class b implements IFetchEffectListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f138906a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.dependence.a.a.a.b f138907b;

        static {
            Covode.recordClassIndex(90830);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
            this.f138907b.a(this.f138906a);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            this.f138907b.b(this.f138906a);
        }

        b(a aVar, com.ss.android.ugc.aweme.dependence.a.a.a.b bVar) {
            this.f138906a = aVar;
            this.f138907b = bVar;
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            l.d(exceptionResult, "");
            this.f138907b.c(this.f138906a);
        }
    }

    @Override // com.ss.android.ugc.aweme.dependence.a.a.b.b
    public final void b(com.ss.android.ugc.aweme.dependence.a.a.a.b<c, Void> bVar) {
        l.d(bVar, "");
        EffectManager c2 = this.f138905j.c();
        if (c2 != null) {
            c2.fetchEffect(this.f79574h.f138896a.getEffect(), new b(this, bVar));
            return;
        }
        String str = "failed by null effectManager,effect: " + this.f79574h.f138896a.getEffect().getName();
        com.ss.android.ugc.aweme.dependence.beauty.a.b(str);
        this.f79572f = new e(-1, str, null);
        bVar.c(this);
    }

    @Override // com.ss.android.ugc.aweme.dependence.a.a.b.b
    public final void c(com.ss.android.ugc.aweme.dependence.a.a.a.b<c, Void> bVar) {
        boolean z;
        l.d(bVar, "");
        ComposerBeauty composerBeauty = this.f79574h.f138896a;
        l.d(composerBeauty, "");
        l.d(composerBeauty, "");
        File file = new File(composerBeauty.getEffect().getUnzipPath());
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    File file2 = listFiles[i2];
                    l.b(file2, "");
                    if (l.a((Object) file2.getName(), (Object) "unzip_begin")) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            z = false;
            if (z) {
                if (listFiles != null) {
                    boolean z2 = false;
                    boolean z3 = false;
                    for (File file3 : listFiles) {
                        l.b(file3, "");
                        if (TextUtils.equals("config.json", file3.getName())) {
                            z3 = true;
                        }
                        if (TextUtils.equals("unzip_complete", file3.getName())) {
                            z2 = true;
                        }
                    }
                    if (z3 && z2) {
                        return;
                    }
                }
            } else if (listFiles != null) {
                for (File file4 : listFiles) {
                    l.b(file4, "");
                    if (TextUtils.equals("config.json", file4.getName())) {
                        return;
                    }
                }
            }
        }
        Effect effect = composerBeauty.getEffect();
        File file5 = new File(effect.getZipPath());
        File file6 = new File(effect.getUnzipPath());
        try {
            FileUtils.INSTANCE.removeDir(effect.getUnzipPath());
            FileUtils.INSTANCE.createFile(effect.getUnzipPath() + File.separator + "unzip_begin", true);
            u.a(file5, file6);
            FileUtils.INSTANCE.createFile(effect.getUnzipPath() + File.separator + "unzip_complete", true);
            com.ss.android.ugc.aweme.tools.beauty.e.a.a.b(composerBeauty, 0, "success");
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.dependence.beauty.a.a(Log.getStackTraceString(e2));
            com.ss.android.ugc.aweme.tools.beauty.e.a.a.b(composerBeauty, 1, e2.toString());
        } finally {
            com.ss.android.ugc.aweme.tools.beauty.g.d.a(file5);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(String str, c cVar, d dVar) {
        super(str, cVar);
        l.d(str, "");
        l.d(cVar, "");
        l.d(dVar, "");
        this.f138905j = dVar;
    }
}
