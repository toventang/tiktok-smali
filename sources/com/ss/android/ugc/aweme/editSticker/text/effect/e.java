package com.ss.android.ugc.aweme.editSticker.text.effect;

import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.editSticker.b.a;
import com.ss.android.ugc.aweme.editSticker.f.c;
import h.c.b.a.k;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.h;
import h.i;
import h.z;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bz;

public final class e<T extends com.ss.android.ugc.aweme.editSticker.b.a> extends a {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.dependence.a.a.b.b<T, Void> f88481a;

    /* renamed from: b  reason: collision with root package name */
    public final m<T, d<? super z>, Object> f88482b;

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.dependence.a.a.a.b<T, Void> f88483c;

    /* renamed from: d  reason: collision with root package name */
    private final h f88484d = i.a((h.f.a.a) a.f88485a);

    static {
        Covode.recordClassIndex(55700);
    }

    static final class a extends h.f.b.m implements h.f.a.a<am> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f88485a = new a();

        static {
            Covode.recordClassIndex(55701);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ am invoke() {
            return c.a();
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.ugc.aweme.editSticker.text.effect.a
    public final void onSuccessed(DownloadInfo downloadInfo) {
        bz unused = kotlinx.coroutines.i.a((am) this.f88484d.getValue(), null, null, new b(this, null), 3);
    }

    static final class b extends k implements m<am, d<? super z>, Object> {
        int label;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(55702);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar, d dVar) {
            super(2, dVar);
            this.this$0 = eVar;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new b(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0068  */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
            // Method dump skipped, instructions count: 127
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.text.effect.e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.ugc.aweme.editSticker.text.effect.a
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        com.ss.android.ugc.aweme.editSticker.d.c cVar;
        this.f88481a.a(4);
        com.ss.android.ugc.aweme.dependence.a.a.b.b<T, Void> bVar = this.f88481a;
        if (baseException != null) {
            str = baseException.getMessage();
        } else {
            str = null;
        }
        bVar.f79572f = new com.ss.android.ugc.aweme.dependence.a.a.b.e(-1, str, baseException);
        this.f88483c.c(this.f88481a);
        Param param = this.f88481a.f79574h;
        if (param instanceof com.ss.android.ugc.aweme.editSticker.text.bean.a) {
            com.ss.android.ugc.aweme.editSticker.d.c cVar2 = com.ss.android.ugc.aweme.editSticker.b.f88088c;
            if (cVar2 != null) {
                cVar2.a(baseException, this.f88481a.f79574h.f88093b.getEffectId());
            }
        } else if ((param instanceof com.ss.android.ugc.aweme.editSticker.text.bean.h) && (cVar = com.ss.android.ugc.aweme.editSticker.b.f88088c) != null) {
            cVar.b(baseException, this.f88481a.f79574h.f88093b.getEffectId());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.m<? super T extends com.ss.android.ugc.aweme.editSticker.b.a, ? super h.c.d<? super h.z>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public e(com.ss.android.ugc.aweme.dependence.a.a.b.b<T, Void> bVar, m<? super T, ? super d<? super z>, ? extends Object> mVar, com.ss.android.ugc.aweme.dependence.a.a.a.b<T, Void> bVar2) {
        l.d(bVar, "");
        l.d(bVar2, "");
        this.f88481a = bVar;
        this.f88482b = mVar;
        this.f88483c = bVar2;
    }
}
