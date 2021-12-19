package com.ss.android.ugc.aweme.watermark;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.aweme.watermark.v;
import h.f.a.r;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;

public final class i implements f {

    /* renamed from: a  reason: collision with root package name */
    private final h f144785a = h.i.a((h.f.a.a) b.f144786a);

    static {
        Covode.recordClassIndex(94691);
    }

    static final class a extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ boolean $isOwner;

        static {
            Covode.recordClassIndex(94692);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(boolean z) {
            super(0);
            this.$isOwner = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(this.$isOwner);
        }
    }

    static final class b extends m implements h.f.a.a<u> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f144786a = new b();

        static {
            Covode.recordClassIndex(94693);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ u invoke() {
            return new u();
        }
    }

    @Override // com.ss.android.ugc.aweme.watermark.f
    public final h a() {
        return (u) this.f144785a.getValue();
    }

    @Override // com.ss.android.ugc.aweme.watermark.f
    public final boolean d() {
        return new com.ss.android.ugc.aweme.shortvideo.upload.b.a.a().c();
    }

    @Override // com.ss.android.ugc.aweme.watermark.f
    public final String e() {
        return new com.ss.android.ugc.aweme.shortvideo.upload.b.a.a().a();
    }

    @Override // com.ss.android.ugc.aweme.watermark.f
    public final boolean b() {
        l.b(cr.a(), "");
        if (cr.h()) {
            return false;
        }
        com.ss.android.ugc.aweme.shortvideo.upload.b.a.a aVar = new com.ss.android.ugc.aweme.shortvideo.upload.b.a.a();
        if (!aVar.c()) {
            return false;
        }
        e.e(aVar.a());
        j.a(false);
        j.a(-1, -1);
        j.a("", false);
        j.a("", true);
        j.b("", false);
        j.b("", true);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.watermark.f
    public final long c() {
        l.b(cr.a(), "");
        if (cr.h()) {
            return 0;
        }
        com.ss.android.ugc.aweme.shortvideo.upload.b.a.a aVar = new com.ss.android.ugc.aweme.shortvideo.upload.b.a.a();
        if (!aVar.c()) {
            return 0;
        }
        return e.d(aVar.a());
    }

    @Override // com.ss.android.ugc.aweme.watermark.f
    public final void a(List<Integer> list, String str, com.ss.android.ugc.aweme.account.model.a aVar, r<? super Boolean, ? super List<String>, ? super String, ? super String, z> rVar, h.f.a.b<? super Throwable, z> bVar) {
        l.d(list, "");
        l.d(aVar, "");
        Application application = com.ss.android.ugc.aweme.port.in.i.f115645a;
        boolean a2 = l.a((Object) g.a().A().c(), (Object) aVar.c());
        com.ss.android.ugc.aweme.shortvideo.upload.b.a.a aVar2 = new com.ss.android.ugc.aweme.shortvideo.upload.b.a.a();
        boolean d2 = aVar2.d();
        if (aVar2.c()) {
            l.b(application, "");
            v vVar = new v(application, aVar2.a(), list, str, aVar, new a(a2), d2);
            bz unused = kotlinx.coroutines.i.a(an.a(vVar.f144837a.plus(bf.f159041b).plus(new v.f(CoroutineExceptionHandler.f158926c, bVar))), null, null, new v.g(vVar, rVar, null), 3);
        } else if (bVar != null) {
            bVar.invoke(new IllegalStateException("the new ending watermark is not enabled, skip loading ending watermark resources"));
        }
    }
}
