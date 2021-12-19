package com.ss.android.ugc.aweme.filter.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.asve.editor.d;
import com.ss.android.ugc.aweme.dependence.a.a.b.e;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.tools.draft.c.c;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.c.b.a.k;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;

public final class a extends AbsDownloadListener {

    /* renamed from: d  reason: collision with root package name */
    public static final C2298a f95481d = new C2298a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public long f95482a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.dependence.a.a.b.b<Effect, z> f95483b;

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.dependence.a.a.a.b<Effect, z> f95484c;

    /* renamed from: e  reason: collision with root package name */
    private final am f95485e = c.a();

    static {
        Covode.recordClassIndex(60492);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.a.a$a  reason: collision with other inner class name */
    public static final class C2298a {
        static {
            Covode.recordClassIndex(60493);
        }

        private C2298a() {
        }

        public /* synthetic */ C2298a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
    public final void onStart(DownloadInfo downloadInfo) {
        super.onStart(downloadInfo);
        this.f95482a = System.currentTimeMillis();
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        bz unused = i.a(this.f95485e, d.f62009a, null, new b(this, null), 2);
    }

    static final class b extends k implements m<am, h.c.d<? super z>, Object> {
        int label;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(60494);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new b(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                this.label = 1;
                Object a2 = i.a(bf.f159041b, new c.b(this.this$0.f95483b.f79574h, null), this);
                if (a2 != h.c.a.a.COROUTINE_SUSPENDED) {
                    a2 = z.f158842a;
                }
                if (a2 == obj2) {
                    return obj2;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.f95483b.a(3);
            this.this$0.f95483b.f79571e = null;
            this.this$0.f95484c.b(this.this$0.f95483b);
            q.a("aweme_tool_draft_amazing_infosticker_update_download_error", 0, new ar().a("duration", String.valueOf(System.currentTimeMillis() - this.this$0.f95482a)).a());
            return z.f158842a;
        }
    }

    public a(com.ss.android.ugc.aweme.dependence.a.a.b.b<Effect, z> bVar, com.ss.android.ugc.aweme.dependence.a.a.a.b<Effect, z> bVar2) {
        l.d(bVar, "");
        l.d(bVar2, "");
        this.f95483b = bVar;
        this.f95484c = bVar2;
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        int i2;
        this.f95483b.a(4);
        com.ss.android.ugc.aweme.dependence.a.a.b.b<Effect, z> bVar = this.f95483b;
        if (baseException != null) {
            str = baseException.getMessage();
        } else {
            str = null;
        }
        bVar.f79572f = new e(-1, str, baseException);
        this.f95484c.c(this.f95483b);
        ar arVar = new ar();
        String b2 = bj.b(baseException);
        l.b(b2, "");
        ar a2 = arVar.a("errorDesc", b2);
        if (baseException != null) {
            i2 = baseException.getErrorCode();
        } else {
            i2 = 0;
        }
        q.a("aweme_tool_draft_amazing_infosticker_update_download_error", 1, a2.a("errorCode", Integer.valueOf(i2)).a());
    }
}
