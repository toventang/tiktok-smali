package com.ss.android.ugc.aweme.shoutouts.review;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService;
import com.ss.android.ugc.aweme.shoutouts.d;
import com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsPrice;
import com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsProduct;
import com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsProductApi;
import com.ss.android.ugc.aweme.shoutouts.model.StandardMoney;
import com.ss.android.ugc.aweme.shoutouts.model.g;
import com.zhiliaoapp.musically.R;
import f.a.ae;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class ShoutoutsRedirectActivity extends com.bytedance.ies.foundation.activity.a implements WeakHandler.IHandler {

    /* renamed from: c  reason: collision with root package name */
    public static final a f133324c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f133325a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f133326b = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f133327d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f133328e = -1;

    /* renamed from: f  reason: collision with root package name */
    private String f133329f;

    /* renamed from: g  reason: collision with root package name */
    private final WeakHandler f133330g = new WeakHandler(this);

    /* renamed from: h  reason: collision with root package name */
    private SparseArray f133331h;

    static {
        Covode.recordClassIndex(87207);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f133331h;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f133331h == null) {
            this.f133331h = new SparseArray();
        }
        View view = (View) this.f133331h.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f133331h.put(i2, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsRedirectActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsRedirectActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsRedirectActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87208);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
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

    public static final class c implements ae<g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutoutsRedirectActivity f133334a;

        static {
            Covode.recordClassIndex(87211);
        }

        @Override // f.a.ae
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(ShoutoutsRedirectActivity shoutoutsRedirectActivity) {
            this.f133334a = shoutoutsRedirectActivity;
        }

        private static Bundle a(Intent intent) {
            try {
                return intent.getExtras();
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            l.d(th, "");
            new com.bytedance.tux.g.b(this.f133334a).a().e(R.string.fz8).b();
            this.f133334a.finish();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.ae
        public final /* synthetic */ void onSuccess(g gVar) {
            Video video;
            UrlModel cover;
            List<String> urlList;
            String str;
            UrlModel cover2;
            List<String> urlList2;
            g gVar2 = gVar;
            l.d(gVar2, "");
            if (!this.f133334a.isFinishing()) {
                try {
                    if (gVar2.f133225a == 0) {
                        ShoutoutsProduct shoutoutsProduct = gVar2.f133226b;
                        if (shoutoutsProduct != null) {
                            int status = shoutoutsProduct.getStatus();
                            if ((this.f133334a.f133325a == 2 && status == 2) || (this.f133334a.f133325a == 7 && status == 7 && this.f133334a.f133326b == 1)) {
                                IShoutOutsService shoutOutsService = AVExternalServiceImpl.a().shoutOutsService();
                                d dVar = new d();
                                dVar.setProductId(shoutoutsProduct.getProductId());
                                dVar.setDesc(shoutoutsProduct.getDescription());
                                Aweme videoInfo = shoutoutsProduct.getVideoInfo();
                                if (!(videoInfo == null || (video = videoInfo.getVideo()) == null || (cover = video.getCover()) == null || (urlList = cover.getUrlList()) == null || !(!urlList.isEmpty()))) {
                                    Video video2 = shoutoutsProduct.getVideoInfo().getVideo();
                                    if (video2 == null || (cover2 = video2.getCover()) == null || (urlList2 = cover2.getUrlList()) == null) {
                                        str = null;
                                    } else {
                                        str = urlList2.get(0);
                                    }
                                    dVar.setCoverUrl(str);
                                }
                                ShoutoutsPrice price = shoutoutsProduct.getPrice();
                                if (price != null) {
                                    com.ss.android.ugc.aweme.shoutouts.g gVar3 = new com.ss.android.ugc.aweme.shoutouts.g();
                                    gVar3.setCoin(price.getCoin());
                                    StandardMoney creatorEarning = price.getCreatorEarning();
                                    if (creatorEarning != null) {
                                        gVar3.setMoneyDes(ShoutoutsRedirectActivity.a(creatorEarning));
                                    }
                                    dVar.setPrice(gVar3);
                                    StandardMoney buyerPayment = price.getBuyerPayment();
                                    if (buyerPayment != null) {
                                        dVar.setBuyerMoneyDes(ShoutoutsRedirectActivity.a(buyerPayment));
                                    }
                                }
                                shoutOutsService.startShoutoutsPublishActivityFromNative(this.f133334a, dVar);
                                this.f133334a.finish();
                                return;
                            }
                            ShoutoutsRedirectActivity shoutoutsRedirectActivity = this.f133334a;
                            shoutoutsRedirectActivity.a(a(shoutoutsRedirectActivity.getIntent()));
                            return;
                        }
                        new com.bytedance.tux.g.b(this.f133334a).a().a(this.f133334a.getResources().getString(R.string.fz8)).b();
                        this.f133334a.finish();
                        return;
                    }
                    new com.bytedance.tux.g.b(this.f133334a).a().a(this.f133334a.getResources().getString(R.string.fz8)).b();
                    this.f133334a.finish();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    new com.bytedance.tux.g.b(this.f133334a).a().a(this.f133334a.getResources().getString(R.string.fz8)).b();
                    this.f133334a.finish();
                }
            }
        }
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    static final class b extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f133332a = new b();

        static {
            Covode.recordClassIndex(87209);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f133333a);
            return z.f158842a;
        }
    }

    public static com.ss.android.ugc.aweme.shoutouts.a a(StandardMoney standardMoney) {
        com.ss.android.ugc.aweme.shoutouts.a aVar = new com.ss.android.ugc.aweme.shoutouts.a();
        aVar.setCurrencyCharacter(standardMoney.getCurrencyCharacter());
        aVar.setCurrencyName(standardMoney.getCurrencyName());
        aVar.setMoney(standardMoney.getMoney());
        return aVar;
    }

    public final void a(Bundle bundle) {
        Set<String> keySet;
        String str = "https://www.tiktok.com/web-inapp/shoutouts/creator/entry/?hide_nav_bar=1";
        if (!(bundle == null || (keySet = bundle.keySet()) == null)) {
            for (String str2 : keySet) {
                str = str + '&' + str2 + '=' + a(bundle, str2);
            }
        }
        com.ss.android.ugc.aweme.shoutouts.b.a.b(this, str);
        finish();
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        Integer num;
        Integer num2;
        Integer num3;
        String str;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsRedirectActivity", "onCreate", true);
        activityConfiguration(b.f133332a);
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setContentView(R.layout.b0e);
        String dataString = getIntent().getDataString();
        if (dataString == null || !p.b(dataString, "aweme://shoutouts/detail/redirect", false)) {
            Intent intent = getIntent();
            Integer num4 = null;
            if (intent != null) {
                num = Integer.valueOf(intent.getIntExtra("origin_product_status", -1));
            } else {
                num = null;
            }
            this.f133325a = num.intValue();
            Intent intent2 = getIntent();
            if (intent2 != null) {
                num2 = Integer.valueOf(intent2.getIntExtra("origin_enroll_status", -1));
            } else {
                num2 = null;
            }
            this.f133327d = num2.intValue();
            Intent intent3 = getIntent();
            if (intent3 != null) {
                num3 = Integer.valueOf(intent3.getIntExtra("origin_order_status", -1));
            } else {
                num3 = null;
            }
            this.f133328e = num3.intValue();
            Intent intent4 = getIntent();
            if (intent4 != null) {
                str = a(intent4, "order_id");
            } else {
                str = null;
            }
            this.f133329f = str;
            Intent intent5 = getIntent();
            if (intent5 != null) {
                num4 = Integer.valueOf(intent5.getIntExtra("force_edit", -1));
            }
            int intValue = num4.intValue();
            this.f133326b = intValue;
            int i2 = this.f133325a;
            if (i2 == 2 || (i2 == 7 && intValue == 1)) {
                com.ss.android.ugc.aweme.account.b.g().queryUser(this.f133330g);
            } else {
                a(a(getIntent()));
            }
        } else {
            com.ss.android.ugc.aweme.account.b.g().queryUser(this.f133330g);
        }
        Intent intent6 = getIntent();
        if (intent6 != null) {
            intent6.getDataString();
        }
        Intent intent7 = getIntent();
        if (intent7 != null) {
            a(intent7);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsRedirectActivity", "onCreate", false);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        User user;
        Set<String> keySet;
        if (message == null || message.what != 112 || !(message.obj instanceof User)) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            user = g2.getCurUser();
        } else {
            Object obj = message.obj;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
            user = (User) obj;
        }
        String dataString = getIntent().getDataString();
        String str = null;
        Bundle bundle = null;
        if (dataString == null || !p.b(dataString, "aweme://shoutouts/detail/redirect", false)) {
            if (user != null) {
                l.d(user, "");
                int i2 = user.shoutoutsStatus % 100;
                if (i2 == 2 || i2 == 7) {
                    IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
                    l.b(g3, "");
                    ShoutoutsProductApi.a.a().getProduct(g3.getCurUserId(), null).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a_(new c(this));
                    return;
                }
            }
            a(a(getIntent()));
            return;
        }
        if (user != null) {
            l.d(user, "");
            if (user.shoutoutsStatus / 100 != 4) {
                SmartRoute buildRoute = SmartRouter.buildRoute(this, "//shoutouts/detail");
                Intent intent = getIntent();
                if (intent != null) {
                    bundle = a(intent);
                }
                buildRoute.withParam(bundle).open();
                finish();
                return;
            }
        }
        Bundle a2 = a(getIntent());
        if (!(a2 == null || (keySet = a2.keySet()) == null)) {
            for (String str2 : keySet) {
                Object a3 = a(a2, str2);
                str = str == null ? str2 + '=' + a3 : str + '&' + str2 + '=' + a3;
            }
            if (str != null) {
                l.d(this, "");
                l.d(str, "");
                com.ss.android.ugc.aweme.shoutouts.b.a.b(this, "https://www.tiktok.com/web-inapp/shoutouts/creator/entry/?".concat(String.valueOf(str)));
            }
        }
        finish();
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
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
