package com.ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.m.c;
import com.ss.android.ugc.aweme.shortvideo.record.u;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.vesdk.lens.VEModelDownload;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.p;

/* access modifiers changed from: package-private */
public final /* synthetic */ class w implements VEModelDownload.a {

    /* renamed from: a  reason: collision with root package name */
    private final u f130183a;

    static {
        Covode.recordClassIndex(85395);
    }

    w(u uVar) {
        this.f130183a = uVar;
    }

    @Override // com.ss.android.vesdk.lens.VEModelDownload.a
    public final void a(String str, String str2, VEModelDownload.b bVar) {
        u uVar = this.f130183a;
        if (str.isEmpty() || str2.isEmpty()) {
            bVar.a();
            return;
        }
        u.AnonymousClass1 r5 = new c.a(bVar) {
            /* class com.ss.android.ugc.aweme.shortvideo.record.u.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ VEModelDownload.b f130169a;

            static {
                Covode.recordClassIndex(85384);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.m.c.a
            public final void a() {
                this.f130169a.a();
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.m.c.a
            public final void a(String str) {
                this.f130169a.a(str);
            }

            {
                this.f130169a = r2;
            }
        };
        l.d(str2, "");
        l.d(str, "");
        l.d(r5, "");
        String[] strArr = {str2};
        DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(strArr, ag.b(new p(str2, n.c(str))), new c.b(str, r5));
    }
}
