package com.ss.android.ugc.aweme.ecommerce.ordercenter;

import android.app.Activity;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.google.gson.f;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.ordercenter.event.j;
import com.ss.android.ugc.aweme.ecommerce.ordercenter.event.k;
import com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.api.OrderEntranceApi;
import com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.GetEntranceInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.OrderEntranceType;
import com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.TradeEntranceInfo;
import com.ss.android.ugc.aweme.ecommerce.service.b;
import f.a.t;
import h.f.b.l;
import java.util.Set;

public final class OrderCenterEntry implements au, com.ss.android.ugc.aweme.ecommerce.service.b {

    /* renamed from: f  reason: collision with root package name */
    private static final a f86216f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public b.a f86217a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f86218b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private final Keva f86219c = Keva.getRepo("ec_order_center_entrance_infos");

    /* renamed from: d  reason: collision with root package name */
    private final Keva.OnChangeListener f86220d = new d(this);

    /* renamed from: e  reason: collision with root package name */
    private boolean f86221e;

    static {
        Covode.recordClassIndex(53947);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestory();
        }
    }

    static final class a {
        static {
            Covode.recordClassIndex(53948);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c extends f.a.g.b<GetEntranceInfoResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OrderCenterEntry f86225a;

        static {
            Covode.recordClassIndex(53950);
        }

        @Override // f.a.z
        public final void onComplete() {
            dispose();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(OrderCenterEntry orderCenterEntry) {
            this.f86225a = orderCenterEntry;
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
            dispose();
        }

        @Override // f.a.z
        public final /* synthetic */ void onNext(Object obj) {
            com.ss.android.ugc.aweme.ecommerce.api.model.a aVar = (com.ss.android.ugc.aweme.ecommerce.api.model.a) obj;
            l.d(aVar, "");
            if (aVar.isCodeOK()) {
                if (aVar.data == null) {
                    this.f86225a.a(new TradeEntranceInfo(0, null, null, null, 15, null));
                } else {
                    int type = aVar.data.getType();
                    if (type == OrderEntranceType.OPEN.ordinal() || type == OrderEntranceType.CLOSE.ordinal()) {
                        this.f86225a.a((TradeEntranceInfo) aVar.data);
                    }
                }
            }
            dispose();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OrderCenterEntry f86222a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f86223b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f86224c;

        static {
            Covode.recordClassIndex(53949);
        }

        b(OrderCenterEntry orderCenterEntry, boolean z, String str) {
            this.f86222a = orderCenterEntry;
            this.f86223b = z;
            this.f86224c = str;
        }

        public final void run() {
            b.a aVar = this.f86222a.f86217a;
            if (aVar != null) {
                aVar.a(this.f86223b, this.f86224c);
            }
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestory() {
        this.f86219c.unRegisterChangeListener(this.f86220d);
        this.f86218b.removeCallbacksAndMessages(null);
        this.f86217a = null;
    }

    private static String b() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        String curUserId = g2.getCurUserId();
        if (curUserId == null || curUserId.length() == 0) {
            return "unknown";
        }
        return curUserId;
    }

    private final TradeEntranceInfo c() {
        try {
            Object a2 = new f().a(this.f86219c.getString(b(), "{}"), TradeEntranceInfo.class);
            l.b(a2, "");
            return (TradeEntranceInfo) a2;
        } catch (Throwable th) {
            com.bytedance.services.apm.api.a.a(th);
            return new TradeEntranceInfo(0, null, null, null, 15, null);
        }
    }

    public final void a() {
        boolean z;
        TradeEntranceInfo c2 = c();
        if (c2.getType() == OrderEntranceType.OPEN.ordinal()) {
            z = true;
        } else {
            z = false;
        }
        String tips = c2.getTips();
        if (tips == null) {
            tips = "";
        }
        Integer toReviewCount = c2.getToReviewCount();
        if (l.a(Looper.getMainLooper(), Looper.myLooper())) {
            b.a aVar = this.f86217a;
            if (aVar != null) {
                aVar.a(z, tips);
            }
        } else {
            this.f86218b.post(new b(this, z, tips));
        }
        if (z && !this.f86221e) {
            new k(toReviewCount).d();
            this.f86221e = true;
        }
    }

    public final void a(TradeEntranceInfo tradeEntranceInfo) {
        TradeEntranceInfo tradeEntranceInfo2 = tradeEntranceInfo;
        Keva keva = this.f86219c;
        String b2 = b();
        f fVar = new f();
        if (tradeEntranceInfo2 == null) {
            tradeEntranceInfo2 = new TradeEntranceInfo(0, null, null, null, 15, null);
        }
        keva.storeString(b2, fVar.b(tradeEntranceInfo2));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.b
    public final void a(Activity activity) {
        String str;
        l.d(activity, "");
        TradeEntranceInfo c2 = c();
        String schema = c2.getSchema();
        if (schema == null || schema.length() == 0) {
            str = "aweme://ec/order_center";
        } else {
            str = c2.getSchema();
        }
        Uri parse = Uri.parse(str);
        Uri.Builder builder = new Uri.Builder();
        l.b(parse, "");
        Uri.Builder encodedPath = builder.scheme(parse.getScheme()).encodedAuthority(parse.getAuthority()).encodedPath(parse.getPath());
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        l.b(queryParameterNames, "");
        for (T t : queryParameterNames) {
            encodedPath.appendQueryParameter(t, parse.getQueryParameter(t));
        }
        if (!parse.getQueryParameterNames().contains("previous_page")) {
            encodedPath.appendQueryParameter("previous_page", "Personal_Home_Page");
        }
        SmartRouter.buildRoute(activity, encodedPath.build().toString()).open();
        c2.setTips("");
        c2.setSchema("");
        a(c2);
        new j(c2.getToReviewCount()).d();
    }

    static final class d implements Keva.OnChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OrderCenterEntry f86226a;

        static {
            Covode.recordClassIndex(53951);
        }

        d(OrderCenterEntry orderCenterEntry) {
            this.f86226a = orderCenterEntry;
        }

        @Override // com.bytedance.keva.Keva.OnChangeListener
        public final void onChanged(Keva keva, String str) {
            this.f86226a.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.b
    public final void a(i iVar, b.a aVar) {
        l.d(iVar, "");
        l.d(aVar, "");
        if (this.f86217a == null) {
            this.f86217a = aVar;
            iVar.a(this);
            this.f86219c.registerChangeListener(this.f86220d);
            t<GetEntranceInfoResponse> b2 = ((OrderEntranceApi) OrderEntranceApi.a.f86245a.a(OrderEntranceApi.class)).getEntranceInfo().b(f.a.h.a.b(f.a.k.a.f158006c));
            l.b(b2, "");
            b2.b(new c(this));
            a();
            return;
        }
        throw new RuntimeException("Do not init reduplicative!");
    }
}
