package com.ss.android.ugc.aweme.lego.a.a;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.a.b;
import com.ss.android.ugc.aweme.lego.a.c;
import com.ss.android.ugc.aweme.lego.a.e;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.n;
import com.ss.android.ugc.aweme.lego.p;
import h.f.b.l;
import java.util.List;

public final class f extends s implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    private c f107323a = new c(this);

    /* renamed from: c  reason: collision with root package name */
    private boolean f107324c;

    static {
        Covode.recordClassIndex(68684);
    }

    @Override // com.ss.android.ugc.e.a, com.ss.android.ugc.aweme.lego.a.a.s
    public final void b() {
        this.f107324c = false;
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f107325a;

        static {
            Covode.recordClassIndex(68685);
        }

        a(String str) {
            this.f107325a = str;
        }

        public final void run() {
            com.ss.android.ugc.aweme.lego.f.f107539d.a(this.f107325a);
        }
    }

    @Override // com.ss.android.ugc.e.a, com.ss.android.ugc.aweme.lego.a.a.s
    public final void a() {
        this.f107324c = true;
        if (b.f107371a == com.ss.android.ugc.aweme.lego.a.a.COLD_BOOT_BEGIN) {
            b.f107371a = com.ss.android.ugc.aweme.lego.a.a.COLD_BOOT_END;
            com.ss.android.ugc.aweme.lego.component.f fVar = com.ss.android.ugc.aweme.lego.f.f107546k;
            if (fVar != null) {
                fVar.a(com.ss.android.ugc.aweme.lego.a.f.COLD_BOOT_END);
            }
            e.f107374b.a(1207, 1000);
            e.f107374b.a(1208, 5000);
            com.ss.android.ugc.e.a aVar = com.ss.android.ugc.aweme.lego.f.f107547l.get(ad.REQUEST_SPARSE);
            if (aVar == null) {
                l.b();
            }
            aVar.a();
            com.ss.android.ugc.e.a aVar2 = com.ss.android.ugc.aweme.lego.f.f107547l.get(ad.REQUEST_IDLE);
            if (aVar2 == null) {
                l.b();
            }
            aVar2.a();
        }
        if (b.f107371a == com.ss.android.ugc.aweme.lego.a.a.HOT_BOOT_BEGIN) {
            b.f107371a = com.ss.android.ugc.aweme.lego.a.a.HOT_BOOT_END;
            com.ss.android.ugc.e.a aVar3 = com.ss.android.ugc.aweme.lego.f.f107547l.get(ad.REQUEST_SPARSE);
            if (aVar3 == null) {
                l.b();
            }
            aVar3.a();
            com.ss.android.ugc.e.a aVar4 = com.ss.android.ugc.aweme.lego.f.f107547l.get(ad.REQUEST_IDLE);
            if (aVar4 == null) {
                l.b();
            }
            aVar4.a();
        }
        this.f107323a.a(1201, 1000);
    }

    @Override // com.ss.android.ugc.e.a, com.ss.android.ugc.aweme.lego.a.a.s
    public final void a(List<? extends n> list) {
        l.d(list, "");
        super.a(list);
    }

    public final boolean handleMessage(Message message) {
        l.d(message, "");
        String b2 = com.ss.android.ugc.aweme.lego.f.f107539d.b(ae.BOOT_FINISH);
        if (b2 != null) {
            p.a(false).execute(new a(b2));
        }
        if (!com.ss.android.ugc.aweme.lego.f.f107539d.a(ae.BOOT_FINISH)) {
            return true;
        }
        this.f107323a.a(1201, 50);
        return true;
    }
}
