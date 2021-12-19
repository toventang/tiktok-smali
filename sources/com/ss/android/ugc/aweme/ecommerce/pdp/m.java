package com.ss.android.ugc.aweme.ecommerce.pdp;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.pdp.b.k;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.a;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.api.PdpApi;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import f.a.d.f;
import h.f.b.l;
import java.util.HashMap;

public final class m implements IPdpStarter {

    /* renamed from: b  reason: collision with root package name */
    public static final a f86510b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private long f86511c = -1;

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f86512a = new b();

        static {
            Covode.recordClassIndex(54196);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f86513a = new c();

        static {
            Covode.recordClassIndex(54197);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class e<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final e f86515a = new e();

        static {
            Covode.recordClassIndex(54199);
        }

        e() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(54194);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54195);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IPdpStarter.PdpEnterParam f86514a;

        static {
            Covode.recordClassIndex(54198);
        }

        d(IPdpStarter.PdpEnterParam pdpEnterParam) {
            this.f86514a = pdpEnterParam;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ProductPackStruct productPackStruct = (ProductPackStruct) obj;
            if (this.f86514a.getChainKey() == null && productPackStruct.v != null) {
                HashMap<String, Object> visitReportParams = this.f86514a.getVisitReportParams();
                if (visitReportParams != null) {
                    visitReportParams.put("chain_key", productPackStruct.v);
                }
                this.f86514a.setChainKey(productPackStruct.v);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter
    public final com.ss.android.ugc.aweme.ecommerce.pdp.repository.d a(IPdpStarter.PdpEnterParam pdpEnterParam, boolean z) {
        l.d(pdpEnterParam, "");
        return a.C2085a.a().a(pdpEnterParam, false, 0, z, null);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter
    public final void a(androidx.fragment.app.e eVar, IPdpStarter.PdpEnterParam pdpEnterParam) {
        l.d(eVar, "");
        l.d(pdpEnterParam, "");
        if (SystemClock.elapsedRealtime() - this.f86511c > 1000) {
            this.f86511c = SystemClock.elapsedRealtime();
            if (pdpEnterParam.getFullScreen()) {
                com.ss.android.ugc.aweme.ecommerce.pdp.repository.d a2 = a(pdpEnterParam, false);
                a2.f86592c.a(b.f86512a, c.f86513a).dispose();
                Intent intent = new Intent(eVar, PdpActivity.class);
                intent.putExtra("ENTER_PARAMS", pdpEnterParam);
                intent.putExtra("CLICK_TIMESTAMP", SystemClock.elapsedRealtime());
                intent.putExtra("PREFETCH_TYPE", a2.f86591b);
                if (a2.f86593d != null) {
                    a.C2085a.a().a(a2.f86590a);
                    ProductPackStruct productPackStruct = a2.f86593d;
                    if (productPackStruct == null) {
                        l.b();
                    }
                    intent.putExtra("PREFETCH_RESULT", productPackStruct);
                    intent.putExtra("PREFETCH_FINISH_TIME", SystemClock.elapsedRealtime());
                }
                com.ss.android.ugc.tiktok.security.a.a.a(intent, eVar);
                eVar.startActivity(intent);
            } else {
                com.ss.android.ugc.aweme.ecommerce.pdp.c.a.a(eVar).b();
                com.ss.android.ugc.aweme.ecommerce.pdp.repository.d a3 = a(pdpEnterParam, false);
                a3.f86592c.a(new d(pdpEnterParam), e.f86515a).dispose();
                new k(eVar, pdpEnterParam);
                e eVar2 = new e();
                Bundle bundle = new Bundle();
                bundle.putSerializable("ENTER_PARAMS", pdpEnterParam);
                bundle.putBoolean("full_screen", pdpEnterParam.getFullScreen());
                bundle.putLong("CLICK_TIMESTAMP", SystemClock.elapsedRealtime());
                bundle.putInt("PREFETCH_TYPE", a3.f86591b);
                if (a3.f86593d != null) {
                    a.C2085a.a().a(a3.f86590a);
                    ProductPackStruct productPackStruct2 = a3.f86593d;
                    if (productPackStruct2 == null) {
                        l.b();
                    }
                    bundle.putParcelable("PREFETCH_RESULT", productPackStruct2);
                    bundle.putLong("PREFETCH_FINISH_TIME", SystemClock.elapsedRealtime());
                }
                eVar2.setArguments(bundle);
                i supportFragmentManager = eVar.getSupportFragmentManager();
                if (supportFragmentManager != null) {
                    eVar2.show(supportFragmentManager, "pdp_fragment");
                }
            }
            HashMap<String, Object> visitReportParams = pdpEnterParam.getVisitReportParams();
            if (visitReportParams != null) {
                PdpApi.a.a(visitReportParams);
            } else {
                com.ss.android.ugc.aweme.ecommerce.track.d.a(pdpEnterParam);
            }
        }
    }
}
