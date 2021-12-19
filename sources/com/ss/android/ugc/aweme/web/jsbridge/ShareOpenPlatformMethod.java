package com.ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.api.AnchorAutoSelectionService;
import com.ss.android.ugc.aweme.api.f;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.metrics.ah;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.utils.gf;
import com.ss.android.ugc.aweme.utils.hk;
import h.f.b.l;
import h.f.b.z;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public final class ShareOpenPlatformMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: d  reason: collision with root package name */
    public static final a f144941d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f144942a;

    /* renamed from: b  reason: collision with root package name */
    public String f144943b;

    /* renamed from: c  reason: collision with root package name */
    public String f144944c;

    static {
        Covode.recordClassIndex(94783);
    }

    private ShareOpenPlatformMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(94784);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ ShareOpenPlatformMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public ShareOpenPlatformMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    public final void a(JSONObject jSONObject) {
        List<String> list;
        int i2;
        Integer height;
        Integer width;
        String str = null;
        if (jSONObject != null) {
            Integer valueOf = Integer.valueOf(jSONObject.getInt("action_type"));
            String string = jSONObject.getString("anchor_source_type");
            String string2 = jSONObject.getString("extra");
            if (valueOf != null) {
                boolean z = true;
                if (valueOf.intValue() == 1 && hk.a(string)) {
                    b.i<com.ss.android.ugc.aweme.api.a> a2 = AnchorAutoSelectionService.a.a(this.f144944c, string2, string, 4);
                    a2.f();
                    com.ss.android.ugc.aweme.api.a d2 = a2.d();
                    if (d2.f66440a == 0) {
                        CreateAnchorInfo createAnchorInfo = d2.f66442c;
                        UrlModel urlModel = new UrlModel();
                        f fVar = d2.f66444e;
                        if (fVar != null) {
                            list = fVar.getUrlList();
                        } else {
                            list = null;
                        }
                        urlModel.setUrlList(list);
                        f fVar2 = d2.f66444e;
                        if (fVar2 != null) {
                            str = fVar2.getUri();
                        }
                        urlModel.setUri(str);
                        f fVar3 = d2.f66444e;
                        int i3 = 0;
                        if (fVar3 == null || (width = fVar3.getWidth()) == null) {
                            i2 = 0;
                        } else {
                            i2 = width.intValue();
                        }
                        urlModel.setWidth(i2);
                        f fVar4 = d2.f66444e;
                        if (!(fVar4 == null || (height = fVar4.getHeight()) == null)) {
                            i3 = height.intValue();
                        }
                        urlModel.setHeight(i3);
                        long currentTimeMillis = System.currentTimeMillis();
                        gf.a();
                        z.e eVar = new z.e();
                        eVar.element = (T) new RecordConfig.Builder().creationId(UUID.randomUUID().toString()).shootWay("direct_shoot").groupId(ah.f109484b).fromMain(true).startRecordTime(currentTimeMillis).musicType(1).translationType(com.ss.android.ugc.aweme.setting.i.c.a()).enterFrom(this.f144942a).enterMethod(this.f144943b);
                        if (createAnchorInfo != null) {
                            T t = eVar.element;
                            int type = createAnchorInfo.getType();
                            String content = createAnchorInfo.getContent();
                            String keyword = createAnchorInfo.getKeyword();
                            String url = createAnchorInfo.getUrl();
                            String extra = createAnchorInfo.getExtra();
                            Boolean bool = d2.f66443d;
                            if (bool != null) {
                                z = bool.booleanValue();
                            }
                            eVar.element = (T) t.setAutoSelectedAnchor(new com.ss.android.ugc.aweme.common.a(type, content, keyword, null, 4, null, urlModel, z, url, null, null, extra, null, 5672, null)).setOpenPlatformExtra(string2).setOpenPlatformClientKey(this.f144944c);
                        }
                        IExternalService a3 = AVExternalServiceImpl.a();
                        Context actContext = getActContext();
                        l.b(actContext, "");
                        a3.asyncServiceForMainRecordService(actContext, "direct_shoot", new c(this, eVar));
                    }
                }
            }
        }
    }

    public static final class b implements IAccountService.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShareOpenPlatformMethod f144945a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ JSONObject f144946b;

        static {
            Covode.recordClassIndex(94785);
        }

        b(ShareOpenPlatformMethod shareOpenPlatformMethod, JSONObject jSONObject) {
            this.f144945a = shareOpenPlatformMethod;
            this.f144946b = jSONObject;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.g
        public final void onResult(int i2, int i3, Object obj) {
            if (i2 == 1 && i3 == 1) {
                this.f144945a.a(this.f144946b);
            }
        }
    }

    public static final class c extends SimpleServiceLoadCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShareOpenPlatformMethod f144947a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f144948b;

        static {
            Covode.recordClassIndex(94786);
        }

        c(ShareOpenPlatformMethod shareOpenPlatformMethod, z.e eVar) {
            this.f144947a = shareOpenPlatformMethod;
            this.f144948b = eVar;
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j2) {
            com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a.b bVar;
            l.d(asyncAVService, "");
            e a2 = p.a(this.f144947a.getActContext());
            Activity activity = null;
            if (a2 == null || (bVar = (com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a.b) HomeTabViewModel.a.a(a2).a("PUBLISH")) == null || !bVar.k()) {
                IRecordService recordService = asyncAVService.uiService().recordService();
                Context actContext = this.f144947a.getActContext();
                l.b(actContext, "");
                recordService.startRecord(actContext, this.f144948b.element.build());
            } else {
                IRecordService recordService2 = asyncAVService.uiService().recordService();
                Context actContext2 = this.f144947a.getActContext();
                l.b(actContext2, "");
                recordService2.startSpecialPlusEntrance(actContext2, this.f144948b.element.build());
                bVar.j();
            }
            Context actContext3 = this.f144947a.getActContext();
            l.b(actContext3, "");
            while (true) {
                if (actContext3 != null) {
                    if (!(actContext3 instanceof Activity)) {
                        if (!(actContext3 instanceof ContextWrapper)) {
                            break;
                        }
                        actContext3 = ((ContextWrapper) actContext3).getBaseContext();
                    } else {
                        activity = (Activity) actContext3;
                        break;
                    }
                } else {
                    break;
                }
            }
            com.ss.android.ugc.aweme.t.b.a(activity, "PUBLISH");
            com.ss.android.ugc.aweme.turbo.api.b.a().openCamera();
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        String str;
        String str2;
        String str3 = null;
        if (jSONObject != null) {
            try {
                str2 = jSONObject.getString("client_key");
            } catch (JSONException unused) {
            }
        } else {
            str2 = null;
        }
        this.f144944c = str2;
        if (jSONObject != null) {
            try {
                str = jSONObject.getString("enter_from");
            } catch (JSONException unused2) {
            }
        } else {
            str = null;
        }
        this.f144942a = str;
        if (jSONObject != null) {
            str3 = jSONObject.getString("enter_method");
        }
        this.f144943b = str3;
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (!g2.isLogin()) {
            Activity a2 = com.bytedance.ies.bullet.ui.common.d.e.a(getActContext());
            if (a2 != null) {
                IAccountService.d dVar = new IAccountService.d();
                dVar.f62401a = a2;
                dVar.f62402b = this.f144942a;
                dVar.f62403c = this.f144943b;
                dVar.f62405e = new b(this, jSONObject);
                com.ss.android.ugc.aweme.account.b.b().showLoginAndRegisterView(dVar.a());
                return;
            }
            return;
        }
        a(jSONObject);
    }
}
