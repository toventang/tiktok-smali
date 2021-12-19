package com.ss.android.ugc.aweme.ecommerce.pdp;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.pdp.b.k;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.a;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.api.PdpApi;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.d;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;

public final class n implements IPdpStarter {

    /* renamed from: b  reason: collision with root package name */
    public static final a f86516b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private f.a.b.b f86517c;

    /* renamed from: d  reason: collision with root package name */
    private long f86518d = -1;

    static {
        Covode.recordClassIndex(54200);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54201);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f86519a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IPdpStarter.PdpEnterParam f86520b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f86521c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f86522d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f86523e;

        static {
            Covode.recordClassIndex(54202);
        }

        b(n nVar, IPdpStarter.PdpEnterParam pdpEnterParam, d dVar, e eVar, long j2) {
            this.f86519a = nVar;
            this.f86520b = pdpEnterParam;
            this.f86521c = dVar;
            this.f86522d = eVar;
            this.f86523e = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ProductPackStruct productPackStruct = (ProductPackStruct) obj;
            if (TextUtils.isEmpty(this.f86520b.getChainKey()) && !TextUtils.isEmpty(productPackStruct.v)) {
                HashMap<String, Object> visitReportParams = this.f86520b.getVisitReportParams();
                if (visitReportParams != null) {
                    String str = productPackStruct.v;
                    if (str == null) {
                        l.b();
                    }
                    visitReportParams.put("chain_key", str);
                }
                this.f86520b.setChainKey(productPackStruct.v);
            }
            a.C2085a.a().a(this.f86521c.f86590a);
            n nVar = this.f86519a;
            n.a((n) this.f86522d, (e) this.f86520b, (IPdpStarter.PdpEnterParam) productPackStruct, (ProductPackStruct) this.f86523e, (long) this.f86521c.f86591b, 0);
        }
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f86524a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f86525b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ IPdpStarter.PdpEnterParam f86526c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f86527d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f86528e;

        static {
            Covode.recordClassIndex(54203);
        }

        c(n nVar, e eVar, IPdpStarter.PdpEnterParam pdpEnterParam, long j2, d dVar) {
            this.f86524a = nVar;
            this.f86525b = eVar;
            this.f86526c = pdpEnterParam;
            this.f86527d = j2;
            this.f86528e = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ProductPackStruct productPackStruct;
            List<ProductPackStruct> list;
            Throwable th = (Throwable) obj;
            if (th instanceof IPdpStarter.b) {
                IPdpStarter.b bVar = (IPdpStarter.b) th;
                T t = bVar.getResp().data;
                if (t == null || (list = t.f86678a) == null) {
                    productPackStruct = null;
                } else {
                    productPackStruct = (ProductPackStruct) h.a.n.h((List) list);
                }
                n.a(this.f86525b, this.f86526c, productPackStruct, this.f86527d, this.f86528e.f86591b, bVar.getCode());
                return;
            }
            String productId = this.f86526c.getProductId();
            l.d(productId, "");
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.ecommerce.a.b(productId, 5));
            e eVar = this.f86525b;
            String string = eVar.getString(R.string.h2y);
            l.b(string, "");
            new com.bytedance.tux.g.b(eVar).a(string).b();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter
    public final d a(IPdpStarter.PdpEnterParam pdpEnterParam, boolean z) {
        l.d(pdpEnterParam, "");
        return a.C2085a.a().a(pdpEnterParam, false, 0, z, null);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter
    public final void a(e eVar, IPdpStarter.PdpEnterParam pdpEnterParam) {
        l.d(eVar, "");
        l.d(pdpEnterParam, "");
        if (System.currentTimeMillis() - this.f86518d > 1000) {
            this.f86518d = SystemClock.elapsedRealtime();
            if (!pdpEnterParam.getFullScreen()) {
                com.ss.android.ugc.aweme.ecommerce.pdp.c.a.a(eVar).b();
            }
            f.a.b.b bVar = this.f86517c;
            if (bVar != null) {
                bVar.dispose();
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            d a2 = a(pdpEnterParam, false);
            ProductPackStruct productPackStruct = a2.f86593d;
            if (productPackStruct != null) {
                if (TextUtils.isEmpty(pdpEnterParam.getChainKey()) && !TextUtils.isEmpty(productPackStruct.v)) {
                    HashMap<String, Object> visitReportParams = pdpEnterParam.getVisitReportParams();
                    if (visitReportParams != null) {
                        String str = productPackStruct.v;
                        if (str == null) {
                            l.b();
                        }
                        visitReportParams.put("chain_key", str);
                    }
                    pdpEnterParam.setChainKey(productPackStruct.v);
                }
                a.C2085a.a().a(a2.f86590a);
                a((n) eVar, (e) pdpEnterParam, (IPdpStarter.PdpEnterParam) productPackStruct, (ProductPackStruct) elapsedRealtime, (long) a2.f86591b, 0);
                return;
            }
            this.f86517c = a2.f86592c.a(new b(this, pdpEnterParam, a2, eVar, elapsedRealtime), new c(this, eVar, pdpEnterParam, elapsedRealtime, a2));
        }
    }

    public static void a(e eVar, IPdpStarter.PdpEnterParam pdpEnterParam, ProductPackStruct productPackStruct, long j2, int i2, int i3) {
        if (pdpEnterParam.getFullScreen()) {
            Intent intent = new Intent(eVar, PdpActivity.class);
            intent.putExtra("ENTER_PARAMS", pdpEnterParam);
            intent.putExtra("PREFETCH_RESULT", productPackStruct);
            intent.putExtra("CLICK_TIMESTAMP", j2);
            intent.putExtra("PREFETCH_FINISH_TIME", SystemClock.elapsedRealtime());
            intent.putExtra("PREFETCH_TYPE", i2);
            intent.putExtra("ERROR_CODE", i3);
            com.ss.android.ugc.tiktok.security.a.a.a(intent, eVar);
            eVar.startActivity(intent);
        } else if (!eVar.isFinishing()) {
            int i4 = Build.VERSION.SDK_INT;
            if (!eVar.isDestroyed()) {
                new k(eVar, pdpEnterParam);
                e eVar2 = new e();
                Bundle bundle = new Bundle();
                bundle.putSerializable("ENTER_PARAMS", pdpEnterParam);
                bundle.putBoolean("full_screen", pdpEnterParam.getFullScreen());
                bundle.putParcelable("PREFETCH_RESULT", productPackStruct);
                bundle.putLong("CLICK_TIMESTAMP", j2);
                bundle.putLong("PREFETCH_FINISH_TIME", SystemClock.elapsedRealtime());
                bundle.putInt("PREFETCH_TYPE", i2);
                bundle.putInt("ERROR_CODE", i3);
                eVar2.setArguments(bundle);
                i supportFragmentManager = eVar.getSupportFragmentManager();
                if (supportFragmentManager != null) {
                    eVar2.show(supportFragmentManager, "pdp_fragment");
                }
            } else {
                return;
            }
        } else {
            return;
        }
        HashMap<String, Object> visitReportParams = pdpEnterParam.getVisitReportParams();
        if (visitReportParams != null) {
            PdpApi.a.a(visitReportParams);
        } else {
            com.ss.android.ugc.aweme.ecommerce.track.d.a(pdpEnterParam);
        }
    }
}
