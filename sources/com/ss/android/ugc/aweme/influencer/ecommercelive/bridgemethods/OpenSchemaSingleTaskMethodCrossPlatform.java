package com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.utils.c;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import h.f.b.l;
import org.json.JSONObject;

public final class OpenSchemaSingleTaskMethodCrossPlatform extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f104515a = new a((byte) 0);

    static {
        Covode.recordClassIndex(66945);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66946);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public OpenSchemaSingleTaskMethodCrossPlatform(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
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
                    Intent intent = new Intent(getActContext(), videoPublishActivityClass);
                    intent.addFlags(67108864);
                    intent.addFlags(268435456);
                    Context actContext = getActContext();
                    com.ss.android.ugc.tiktok.security.a.a.a(intent, actContext);
                    actContext.startActivity(intent);
                }
            }
            aVar.a(0, "No video publish activity in stack");
            return;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(getActContext(), "//bullet/single_task?intercept_page=show_window");
        Intent buildIntent = buildRoute.buildIntent();
        if (optInt == 1) {
            z = true;
        }
        buildIntent.putExtra("is_clear_top", z);
        SmartRoute withParam = buildRoute.withParam(buildIntent);
        l.b(optString, "");
        withParam.withParam(c.a(optString)).addFlags(67108864).addFlags(268435456).open();
        aVar.a((Object) new JSONObject());
    }
}
