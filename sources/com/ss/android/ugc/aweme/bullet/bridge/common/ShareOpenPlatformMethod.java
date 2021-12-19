package com.ss.android.ugc.aweme.bullet.bridge.common;

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
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.metrics.ah;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
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

public final class ShareOpenPlatformMethod extends BaseBridgeMethod implements au {

    /* renamed from: e  reason: collision with root package name */
    public static final a f69037e = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public String f69038b;

    /* renamed from: c  reason: collision with root package name */
    public String f69039c;

    /* renamed from: d  reason: collision with root package name */
    public String f69040d;

    static {
        Covode.recordClassIndex(42576);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return "shareOpenPlatform";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42577);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareOpenPlatformMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    public final void b(JSONObject jSONObject) {
        List<String> list;
        int i2;
        Integer height;
        Integer width;
        int i3 = jSONObject.getInt("action_type");
        String string = jSONObject.getString("anchor_source_type");
        String string2 = jSONObject.getString("extra");
        boolean z = true;
        if (i3 == 1 && hk.a(string)) {
            b.i<com.ss.android.ugc.aweme.api.a> a2 = AnchorAutoSelectionService.a.a(this.f69040d, string2, string, 4);
            a2.f();
            com.ss.android.ugc.aweme.api.a d2 = a2.d();
            if (d2.f66440a == 0) {
                CreateAnchorInfo createAnchorInfo = d2.f66442c;
                UrlModel urlModel = new UrlModel();
                f fVar = d2.f66444e;
                String str = null;
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
                int i4 = 0;
                if (fVar3 == null || (width = fVar3.getWidth()) == null) {
                    i2 = 0;
                } else {
                    i2 = width.intValue();
                }
                urlModel.setWidth(i2);
                f fVar4 = d2.f66444e;
                if (!(fVar4 == null || (height = fVar4.getHeight()) == null)) {
                    i4 = height.intValue();
                }
                urlModel.setHeight(i4);
                long currentTimeMillis = System.currentTimeMillis();
                gf.a();
                z.e eVar = new z.e();
                eVar.element = (T) new RecordConfig.Builder().creationId(UUID.randomUUID().toString()).shootWay("direct_shoot").groupId(ah.f109484b).fromMain(true).startRecordTime(currentTimeMillis).musicType(1).translationType(com.ss.android.ugc.aweme.setting.i.c.a()).enterFrom(this.f69038b).enterMethod(this.f69039c);
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
                    eVar.element = (T) t.setAutoSelectedAnchor(new com.ss.android.ugc.aweme.common.a(type, content, keyword, null, 4, null, urlModel, z, url, null, null, extra, null, 5672, null)).setOpenPlatformExtra(string2).setOpenPlatformClientKey(this.f69040d);
                }
                Context e2 = e();
                if (e2 != null) {
                    AVExternalServiceImpl.a().asyncServiceForMainRecordService(e2, "direct_shoot", new c(e2, eVar));
                }
            }
        }
    }

    public static final class b implements IAccountService.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShareOpenPlatformMethod f69041a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ JSONObject f69042b;

        static {
            Covode.recordClassIndex(42578);
        }

        b(ShareOpenPlatformMethod shareOpenPlatformMethod, JSONObject jSONObject) {
            this.f69041a = shareOpenPlatformMethod;
            this.f69042b = jSONObject;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.g
        public final void onResult(int i2, int i3, Object obj) {
            if (i2 == 1 && i3 == 1) {
                this.f69041a.b(this.f69042b);
            }
        }
    }

    public static final class c extends SimpleServiceLoadCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f69043a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f69044b;

        static {
            Covode.recordClassIndex(42579);
        }

        c(Context context, z.e eVar) {
            this.f69043a = context;
            this.f69044b = eVar;
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j2) {
            com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a.b bVar;
            l.d(asyncAVService, "");
            e a2 = p.a(this.f69043a);
            Activity activity = null;
            if (a2 == null || (bVar = (com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a.b) HomeTabViewModel.a.a(a2).a("PUBLISH")) == null || !bVar.k()) {
                asyncAVService.uiService().recordService().startRecord(this.f69043a, this.f69044b.element.build());
            } else {
                asyncAVService.uiService().recordService().startSpecialPlusEntrance(this.f69043a, this.f69044b.element.build());
                bVar.j();
            }
            Context context = this.f69043a;
            while (true) {
                if (context != null) {
                    if (!(context instanceof Activity)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        activity = (Activity) context;
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

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        try {
            this.f69040d = jSONObject.getString("client_key");
        } catch (JSONException unused) {
        }
        try {
            this.f69038b = jSONObject.getString("enter_from");
            this.f69039c = jSONObject.getString("enter_method");
        } catch (JSONException unused2) {
        }
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (!g2.isLogin()) {
            Activity a2 = com.bytedance.ies.bullet.ui.common.d.e.a(e());
            if (a2 != null) {
                IAccountService.d dVar = new IAccountService.d();
                dVar.f62401a = a2;
                dVar.f62402b = this.f69038b;
                dVar.f62403c = this.f69039c;
                dVar.f62405e = new b(this, jSONObject);
                com.ss.android.ugc.aweme.account.b.b().showLoginAndRegisterView(dVar.a());
                return;
            }
            return;
        }
        b(jSONObject);
    }
}
