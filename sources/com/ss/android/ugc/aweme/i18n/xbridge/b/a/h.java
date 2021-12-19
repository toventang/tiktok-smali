package com.ss.android.ugc.aweme.i18n.xbridge.b.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.f;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend;
import com.bytedance.ies.xbridge.model.b.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.qrcode.c.b;
import com.ss.android.ugc.aweme.qrcode.c.d;
import com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity;
import com.ss.android.ugc.aweme.utils.dc;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.u;
import h.v;
import h.z;
import java.io.File;

public final class h implements IHostOpenDepend {
    static {
        Covode.recordClassIndex(63715);
    }

    public static final class a implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IHostOpenDepend.c f99970a;

        static {
            Covode.recordClassIndex(63716);
        }

        @Override // com.ss.android.ugc.aweme.qrcode.c.d
        public final String a() {
            return "";
        }

        a(IHostOpenDepend.c cVar) {
            this.f99970a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.qrcode.c.d
        public final boolean a(String str, int i2) {
            l.d(this, "");
            b.f119722a.remove(this);
            IHostOpenDepend.c cVar = this.f99970a;
            if (str == null) {
                str = "";
            }
            cVar.a(str);
            return true;
        }
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend
    public final void scanCode(c cVar, boolean z, IHostOpenDepend.c cVar2) {
        l.d(cVar2, "");
        Context context = (Context) com.ss.android.ugc.aweme.i18n.xbridge.d.d.a(cVar, Context.class);
        if (context == null) {
            cVar2.b("Context cannot be null");
            return;
        }
        r.a("qr_code_scan_enter", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "h5").f66730a);
        a aVar = new a(cVar2);
        l.d(aVar, "");
        b.f119722a.add(aVar);
        Activity a2 = com.bytedance.ies.xbridge.o.a.a(context);
        if (a2 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - QRCodePermissionActivity.f119804c >= 1000) {
                QRCodePermissionActivity.f119804c = currentTimeMillis;
                Intent intent = new Intent(a2, QRCodePermissionActivity.class);
                intent.putExtra("finishAfterScan", false);
                intent.putExtra("page_from", 3);
                intent.putExtra("camera_only", z);
                QRCodePermissionActivity.a(a2, intent);
            }
        }
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend
    public final z getGeckoInfo(String str, String str2, IHostOpenDepend.b bVar) {
        u uVar;
        long longValue;
        l.d(str, "");
        l.d(str2, "");
        l.d(bVar, "");
        if (com.bytedance.geckox.policy.b.a.f29951a == null || !com.bytedance.geckox.policy.b.a.f29951a.containsKey(str + "-" + str2)) {
            uVar = new u(false, null, null);
        } else {
            Long b2 = com.bytedance.geckox.utils.l.b(new File(f.a().f29842a.get(str)), str, str2);
            if (b2 == null) {
                longValue = 0;
            } else {
                longValue = b2.longValue();
            }
            UpdatePackage updatePackage = com.bytedance.geckox.policy.b.a.f29951a.get(str + "-" + str2);
            if (updatePackage == null || longValue == updatePackage.getVersion()) {
                uVar = new u(false, null, null);
            } else {
                uVar = new u(true, Long.valueOf(updatePackage.getFullPackage().getLength()), Long.valueOf(updatePackage.getVersion()));
            }
        }
        Boolean bool = (Boolean) uVar.getFirst();
        if (!bool.booleanValue()) {
            l.b(bool, "");
            bVar.a(new IHostOpenDepend.a(bool.booleanValue()));
        } else {
            String valueOf = String.valueOf(((Number) uVar.getThird()).longValue());
            l.b(bool, "");
            IHostOpenDepend.a aVar = new IHostOpenDepend.a(bool.booleanValue());
            aVar.f35864a = (Long) uVar.getSecond();
            aVar.f35865b = valueOf;
            bVar.a(aVar);
        }
        return z.f158842a;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend
    public final z updateGecko(String str, String str2, IHostOpenDepend.d dVar, boolean z) {
        l.d(str, "");
        l.d(str2, "");
        l.d(dVar, "");
        dc.b().a((String) null, ag.a(v.a(str, n.a(new CheckRequestBodyModel.TargetChannel(str2)))), new OptionCheckUpdateParams().setLazyUpdate(true).setListener(new a(dVar, str2)).setEnableDownloadAutoRetry(z).setChannelUpdatePriority(3));
        return z.f158842a;
    }
}
