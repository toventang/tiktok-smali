package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.api.model.ToastContent;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.a;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.OrderShopDigest;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.ShopOrder;
import com.ss.android.ugc.aweme.ecommerce.common.b;
import com.ss.android.ugc.aweme.ecommerce.router.j;
import com.ss.android.ugc.aweme.utils.dg;
import com.ss.android.ugc.aweme.utils.hk;
import com.zhiliaoapp.musically.R;
import h.c.b.a.k;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.m.p;
import h.r;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;
import kotlinx.coroutines.internal.o;

public final class TransparentLoadingOSPActivity extends b {

    /* renamed from: a  reason: collision with root package name */
    public OrderSubmitRequestParam f84755a;

    /* renamed from: b  reason: collision with root package name */
    public HashMap<String, Object> f84756b;

    /* renamed from: c  reason: collision with root package name */
    public String f84757c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f84758d = "";

    /* renamed from: e  reason: collision with root package name */
    public String f84759e = "";

    /* renamed from: f  reason: collision with root package name */
    public String f84760f;

    /* renamed from: h  reason: collision with root package name */
    private SparseArray f84761h;

    static {
        Covode.recordClassIndex(52972);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.b, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f84761h;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.b, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f84761h == null) {
            this.f84761h = new SparseArray();
        }
        View view = (View) this.f84761h.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f84761h.put(i2, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.TransparentLoadingOSPActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.TransparentLoadingOSPActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.TransparentLoadingOSPActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public final void onBackPressed() {
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
        TuxDualBallView tuxDualBallView = (TuxDualBallView) _$_findCachedViewById(R.id.eu5);
        l.b(tuxDualBallView, "");
        tuxDualBallView.setVisibility(0);
        ((TuxDualBallView) _$_findCachedViewById(R.id.eu5)).b();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.ecommerce.common.b, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        String string;
        String string2;
        String string3;
        Object obj;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.TransparentLoadingOSPActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.b50);
        String str = "0";
        if (bundle == null) {
            string = a(getIntent(), "requestParams");
            string2 = a(getIntent(), "trackParams");
            string3 = a(getIntent(), "repoId");
            String a2 = a(getIntent(), "buy_type");
            if (a2 != null) {
                str = a2;
            }
            this.f84759e = str;
            this.f84758d = a(getIntent(), "_originalSchema");
            this.f84760f = a(getIntent(), "cart_storage_key");
        } else {
            string = bundle.getString("requestParams");
            string2 = bundle.getString("trackParams");
            string3 = bundle.getString("repoId");
            this.f84758d = bundle.getString("_originalSchema");
            String string4 = bundle.getString("buy_type");
            if (string4 != null) {
                str = string4;
            }
            this.f84759e = str;
            this.f84760f = a(getIntent(), "cart_storage_key");
        }
        if (string == null) {
            try {
                if (this.f84760f != null) {
                    Object a3 = com.bytedance.ies.xbridge.base.a.b.a(this).a(this.f84760f);
                    if (!(a3 instanceof String)) {
                        a3 = null;
                    }
                    string = (String) a3;
                }
            } catch (Exception e2) {
                com.bytedance.services.apm.api.a.a(e2.toString());
            }
        }
        if (string3 == null) {
            string3 = "default_repo_id" + UUID.randomUUID();
        }
        this.f84757c = string3;
        this.f84755a = (OrderSubmitRequestParam) dg.a(string, OrderSubmitRequestParam.class);
        try {
            obj = j.a().a(string2, HashMap.class);
        } catch (Exception unused) {
            obj = null;
        }
        this.f84756b = (HashMap) obj;
        OrderSubmitRequestParam orderSubmitRequestParam = this.f84755a;
        HashMap<String, Object> hashMap = this.f84756b;
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        l.d(hashMap, "");
        if (orderSubmitRequestParam != null) {
            bz unused2 = i.a(bs.f159054a, o.f159148a, null, new a(orderSubmitRequestParam, null, this, hashMap), 2);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.TransparentLoadingOSPActivity", "onCreate", false);
    }

    static final class a extends k implements m<am, d<? super z>, Object> {
        final /* synthetic */ OrderSubmitRequestParam $it;
        final /* synthetic */ HashMap $trackParams$inlined;
        int label;
        final /* synthetic */ TransparentLoadingOSPActivity this$0;

        static {
            Covode.recordClassIndex(52973);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(OrderSubmitRequestParam orderSubmitRequestParam, d dVar, TransparentLoadingOSPActivity transparentLoadingOSPActivity, HashMap hashMap) {
            super(2, dVar);
            this.$it = orderSubmitRequestParam;
            this.this$0 = transparentLoadingOSPActivity;
            this.$trackParams$inlined = hashMap;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new a(this.$it, dVar, this.this$0, this.$trackParams$inlined);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            int i2;
            List<ShopOrder> list;
            T t;
            ExceptionUX exceptionUX;
            Integer exceptionUXType;
            String str;
            T t2;
            ExceptionUX exceptionUX2;
            ToastContent toastContent;
            T t3;
            ExceptionUX exceptionUX3;
            ToastContent toastContent2;
            T t4;
            Object obj2 = obj;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i3 = this.label;
            if (i3 == 0) {
                r.a(obj2);
                List<OrderShopDigest> orderShopDigest = this.$it.getOrderShopDigest();
                String addressId = this.$it.getAddressId();
                Integer e2 = p.e(this.this$0.f84759e);
                if (e2 != null) {
                    i2 = e2.intValue();
                } else {
                    i2 = 0;
                }
                BillInfoRequest billInfoRequest = new BillInfoRequest(addressId, i2, orderShopDigest, true, true, true, true, null, null, this.$it.getToAutoClaimVoucherTypeIDs(), true, null, null, null, this.$it.getActivityIds(), 12288, null);
                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.a a2 = a.C2033a.a(this.this$0.f84757c);
                HashMap hashMap = this.$trackParams$inlined;
                this.label = 1;
                obj2 = a2.a(billInfoRequest, true, hashMap, false, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else if (i3 == 1) {
                r.a(obj2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.ss.android.ugc.aweme.ecommerce.api.model.a aVar2 = (com.ss.android.ugc.aweme.ecommerce.api.model.a) obj2;
            String str2 = null;
            if (aVar2 == null || (t4 = aVar2.data) == null) {
                list = null;
            } else {
                list = t4.getShopOrders();
            }
            if (!(list != null || aVar2 == null || (t = aVar2.data) == null || (exceptionUX = t.getExceptionUX()) == null || (exceptionUXType = exceptionUX.getExceptionUXType()) == null || exceptionUXType.intValue() != 0)) {
                if (aVar2 == null || (t3 = aVar2.data) == null || (exceptionUX3 = t3.getExceptionUX()) == null || (toastContent2 = exceptionUX3.getToastContent()) == null) {
                    str = null;
                } else {
                    str = toastContent2.getMessage();
                }
                if (hk.a(str)) {
                    TuxDualBallView tuxDualBallView = (TuxDualBallView) this.this$0._$_findCachedViewById(R.id.eu5);
                    l.b(tuxDualBallView, "");
                    tuxDualBallView.setVisibility(8);
                    com.bytedance.tux.g.b a3 = new com.bytedance.tux.g.b(this.this$0).a();
                    if (!(aVar2 == null || (t2 = aVar2.data) == null || (exceptionUX2 = t2.getExceptionUX()) == null || (toastContent = exceptionUX2.getToastContent()) == null)) {
                        str2 = toastContent.getMessage();
                    }
                    a3.a(str2).b();
                    if (this.this$0.f84760f != null) {
                        com.bytedance.ies.xbridge.base.a.b.a(this.this$0).b(this.this$0.f84760f);
                    }
                    this.this$0.finish();
                    return z.f158842a;
                }
            }
            String str3 = "bill_info_resp_" + System.currentTimeMillis();
            com.bytedance.ies.xbridge.base.a.b.a(this.this$0).a(str3, dg.a().b(aVar2));
            TransparentLoadingOSPActivity transparentLoadingOSPActivity = this.this$0;
            SmartRouter.buildRoute(transparentLoadingOSPActivity, Uri.parse(transparentLoadingOSPActivity.f84758d).buildUpon().appendQueryParameter("bill_info_resp_key", str3).appendQueryParameter("_cartPrefetchBill", "1").toString()).open();
            TuxDualBallView tuxDualBallView2 = (TuxDualBallView) this.this$0._$_findCachedViewById(R.id.eu5);
            l.b(tuxDualBallView2, "");
            tuxDualBallView2.setVisibility(8);
            this.this$0.finish();
            return z.f158842a;
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
