package com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.bullet.utils.c;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import h.f.b.l;
import org.json.JSONObject;

public final class OpenSchemaSingleTaskMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f104513b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f104514c = "openSingletonSchema";

    static {
        Covode.recordClassIndex(66943);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66944);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f104514c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenSchemaSingleTaskMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        String optString = jSONObject.optString("schema");
        String optString2 = jSONObject.optString("page");
        int optInt = jSONObject.optInt("is_back");
        boolean z = false;
        if (l.a((Object) optString2, (Object) "AWEVideoNewPublishViewController")) {
            Class<? extends Activity> videoPublishActivityClass = AVExternalServiceImpl.a().classnameService().getVideoPublishActivityClass();
            Activity[] activityStack = ActivityStack.getActivityStack();
            l.b(activityStack, "");
            for (Activity activity : activityStack) {
                if (l.a((Object) activity.getClass().getName(), (Object) videoPublishActivityClass.getName())) {
                    Intent intent = new Intent(e(), videoPublishActivityClass);
                    intent.addFlags(67108864);
                    intent.addFlags(268435456);
                    Context e2 = e();
                    if (e2 != null) {
                        com.ss.android.ugc.tiktok.security.a.a.a(intent, e2);
                        e2.startActivity(intent);
                    }
                }
            }
            aVar.a(0, "No video publish activity in stack");
            return;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(e(), "//bullet/single_task?intercept_page=show_window");
        Intent buildIntent = buildRoute.buildIntent();
        if (optInt == 1) {
            z = true;
        }
        buildIntent.putExtra("is_clear_top", z);
        SmartRoute withParam = buildRoute.withParam(buildIntent);
        l.b(optString, "");
        withParam.withParam(c.a(optString)).addFlags(67108864).addFlags(268435456).open();
        aVar.a((Object) null);
    }
}
