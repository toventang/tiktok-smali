package com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet;

import android.app.Activity;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.search.k.ba;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import h.f.b.l;
import java.util.UUID;
import org.json.JSONObject;

public final class OpenEffectRecordMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final b f82669b = new b((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f82670c = "open_effect_record";

    /* renamed from: d  reason: collision with root package name */
    private k.a f82671d = k.a.PRIVATE;

    static {
        Covode.recordClassIndex(51491);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a implements IExternalService.ServiceLoadCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f82672a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f82673b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RecordConfig.Builder f82674c;

        static {
            Covode.recordClassIndex(51492);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onDismiss() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onFailed() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onOK() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j2) {
            l.d(asyncAVService, "");
            asyncAVService.uiService().recordService().startRecord(this.f82672a, this.f82674c.build());
        }

        a(Activity activity, String str, RecordConfig.Builder builder) {
            this.f82672a = activity;
            this.f82673b = str;
            this.f82674c = builder;
        }
    }

    public static final class b {
        static {
            Covode.recordClassIndex(51493);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q, com.bytedance.ies.bullet.c.c.a.e
    public final k.a b() {
        return this.f82671d;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f82670c;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e
    public final void a(k.a aVar) {
        l.d(aVar, "");
        this.f82671d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenEffectRecordMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        if (jSONObject.has("prop_id")) {
            String optString = jSONObject.optString("prop_id");
            try {
                String optString2 = jSONObject.optString("enter_from");
                String optString3 = jSONObject.optString("enter_method");
                String optString4 = jSONObject.optString("shoot_entrance");
                String optString5 = jSONObject.optString("shoot_way");
                String uuid = UUID.randomUUID().toString();
                l.b(uuid, "");
                RecordConfig.Builder enterFrom = new RecordConfig.Builder().sticker(optString).creationId(uuid).enterFrom("search_result");
                Activity j2 = f.j();
                if (j2 != null) {
                    IExternalService a2 = AVExternalServiceImpl.a();
                    l.b(optString4, "");
                    a2.asyncService(j2, optString4, new a(j2, optString4, enterFrom));
                }
                ((ba) ((ba) new ba().p(optString3)).o(optString2)).t(optString5).u(optString4).s(optString).r(uuid).f();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                aVar.a(jSONObject2);
            } catch (Exception e2) {
                aVar.a(0, e2.getMessage());
            }
        }
    }
}
