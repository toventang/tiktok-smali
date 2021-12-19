package com.ss.android.ugc.aweme.external.a;

import android.os.Bundle;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.ad;
import com.ss.android.ugc.aweme.property.b;
import com.ss.android.ugc.aweme.services.external.ability.IOpenPhotoNextService;
import com.ss.android.ugc.aweme.services.external.ability.IPageToFinish;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.c;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.dp;
import com.ss.android.ugc.aweme.shortvideo.dt;
import com.ss.android.ugc.aweme.shortvideo.dv;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.tools.mvtemplate.a.e;
import h.f.b.l;
import java.util.List;

public final class f implements IOpenPhotoNextService {
    static {
        Covode.recordClassIndex(56686);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f90311a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f90312b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Bundle f90313c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f90314d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ IPageToFinish f90315e;

        static {
            Covode.recordClassIndex(56687);
        }

        a(e eVar, boolean z, Bundle bundle, List list, IPageToFinish iPageToFinish) {
            this.f90311a = eVar;
            this.f90312b = z;
            this.f90313c = bundle;
            this.f90314d = list;
            this.f90315e = iPageToFinish;
        }

        public final void run() {
            com.ss.android.ugc.aweme.tools.mvtemplate.a.e eVar = new com.ss.android.ugc.aweme.tools.mvtemplate.a.e(this.f90311a, this.f90312b);
            Bundle bundle = this.f90313c;
            dv.f126646e = dv.f126645d;
            ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
            shortVideoContext.q = bundle.getString("creation_id");
            shortVideoContext.r = bundle.getString("shoot_way");
            shortVideoContext.t = bundle.getString("shoot_from");
            shortVideoContext.x = bundle.getString("enter_from");
            shortVideoContext.y = bundle.getString("enter_method");
            shortVideoContext.z = bundle.getString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE");
            shortVideoContext.ao = (UrlModel) bundle.getSerializable("send_to_user_head");
            shortVideoContext.A = (ad) bundle.getSerializable("open_platform_share_context");
            shortVideoContext.C = 0;
            shortVideoContext.a(c.a());
            shortVideoContext.a(com.ss.android.ugc.aweme.port.in.c.o.getVideoWidth());
            shortVideoContext.b(com.ss.android.ugc.aweme.port.in.c.o.getVideoHeight());
            shortVideoContext.a(new dt());
            shortVideoContext.b(0L);
            shortVideoContext.c(b.a() ? 1 : 0);
            shortVideoContext.e(dp.a().a());
            if (bundle.getParcelable("stitch_params") != null) {
                shortVideoContext.a((StitchParams) bundle.getParcelable("stitch_params"));
            } else {
                shortVideoContext.k();
            }
            l.b(shortVideoContext, "");
            if (l.a((Object) "system_upload", (Object) shortVideoContext.r) || l.a((Object) "lv_sync", (Object) shortVideoContext.r)) {
                cr.a().d();
            }
            eVar.a(shortVideoContext, this.f90314d, new e.b(this) {
                /* class com.ss.android.ugc.aweme.external.a.f.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f90316a;

                static {
                    Covode.recordClassIndex(56688);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f90316a = r1;
                }

                @Override // com.ss.android.ugc.aweme.tools.mvtemplate.a.e.b
                public final void a(boolean z) {
                    this.f90316a.f90315e.onFinish(z);
                }
            }, true, Long.valueOf(System.currentTimeMillis()), true, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IOpenPhotoNextService
    public final void gotoNextPage(androidx.fragment.app.e eVar, boolean z, Bundle bundle, List<String> list, IPageToFinish iPageToFinish) {
        l.d(eVar, "");
        l.d(bundle, "");
        l.d(list, "");
        l.d(iPageToFinish, "");
        eVar.runOnUiThread(new a(eVar, z, bundle, list, iPageToFinish));
    }
}
