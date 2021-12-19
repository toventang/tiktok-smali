package com.ss.android.ugc.aweme.deeplink.actions.a;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.OpenResultCallback$$CC;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouteSet;
import com.bytedance.router.SmartRouter;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public abstract class a implements c {
    public static final C1850a Companion = new C1850a((byte) 0);

    static {
        Covode.recordClassIndex(49342);
    }

    public static int com_ss_android_ugc_aweme_deeplink_actions_base_AbsLinkAction_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onEmpty() {
        OpenResultCallback$$CC.onEmpty(this);
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onOpen(Intent intent) {
        OpenResultCallback$$CC.onOpen(this, intent);
    }

    /* renamed from: com.ss.android.ugc.aweme.deeplink.actions.a.a$a  reason: collision with other inner class name */
    public static final class C1850a {
        static {
            Covode.recordClassIndex(49343);
        }

        private C1850a() {
        }

        public /* synthetic */ C1850a(byte b2) {
            this();
        }
    }

    public final String getActionName() {
        String name = getClass().getName();
        l.b(name, "");
        return name;
    }

    public void onActionIntercept() {
        com_ss_android_ugc_aweme_deeplink_actions_base_AbsLinkAction_com_ss_android_ugc_aweme_lancet_LogLancet_d("BaseAction", getActionName() + " --> outer, on link action intercept");
    }

    public void onActionPreHandleFinish() {
        com_ss_android_ugc_aweme_deeplink_actions_base_AbsLinkAction_com_ss_android_ugc_aweme_lancet_LogLancet_d("BaseAction", getActionName() + " --> outer, on link action preHandle finish");
    }

    public void onActionStart() {
        com_ss_android_ugc_aweme_deeplink_actions_base_AbsLinkAction_com_ss_android_ugc_aweme_lancet_LogLancet_d("BaseAction", getActionName() + " --> outer, on link action start");
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onActionResult(Object obj) {
        com_ss_android_ugc_aweme_deeplink_actions_base_AbsLinkAction_com_ss_android_ugc_aweme_lancet_LogLancet_d("BaseAction", getActionName() + " --> on link action result");
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onSuccess(Intent intent) {
        com_ss_android_ugc_aweme_deeplink_actions_base_AbsLinkAction_com_ss_android_ugc_aweme_lancet_LogLancet_d("BaseAction", getActionName() + " --> on link success");
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onIntercept(String str) {
        com_ss_android_ugc_aweme_deeplink_actions_base_AbsLinkAction_com_ss_android_ugc_aweme_lancet_LogLancet_d("BaseAction", getActionName() + " --> on link intercept, link url is " + str);
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onMatched(String str) {
        com_ss_android_ugc_aweme_deeplink_actions_base_AbsLinkAction_com_ss_android_ugc_aweme_lancet_LogLancet_d("BaseAction", getActionName() + " --> on link matched, link url is " + str);
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onMissed(String str) {
        com_ss_android_ugc_aweme_deeplink_actions_base_AbsLinkAction_com_ss_android_ugc_aweme_lancet_LogLancet_d("BaseAction", getActionName() + " --> on link missed, link url is " + str);
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onFail(String str, String str2) {
        com_ss_android_ugc_aweme_deeplink_actions_base_AbsLinkAction_com_ss_android_ugc_aweme_lancet_LogLancet_d("BaseAction", getActionName() + " --> on link fail, link url is " + str + ", error is " + str2);
    }

    public boolean doRealOpen(Context context, String str, HashMap<String, Object> hashMap, ArrayList<Integer> arrayList) {
        l.d(context, "");
        l.d(str, "");
        l.d(hashMap, "");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, str);
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Integer) {
                Object value2 = entry.getValue();
                Objects.requireNonNull(value2, "null cannot be cast to non-null type kotlin.Int");
                buildRoute.withParam(entry.getKey(), ((Integer) value2).intValue());
            } else if (value instanceof Long) {
                Object value3 = entry.getValue();
                Objects.requireNonNull(value3, "null cannot be cast to non-null type kotlin.Long");
                buildRoute.withParam(entry.getKey(), ((Long) value3).longValue());
            } else if (value instanceof Float) {
                Object value4 = entry.getValue();
                Objects.requireNonNull(value4, "null cannot be cast to non-null type kotlin.Float");
                buildRoute.withParam(entry.getKey(), ((Float) value4).floatValue());
            } else if (value instanceof Double) {
                Object value5 = entry.getValue();
                Objects.requireNonNull(value5, "null cannot be cast to non-null type kotlin.Double");
                buildRoute.withParam(entry.getKey(), ((Double) value5).doubleValue());
            } else if (value instanceof Boolean) {
                Object value6 = entry.getValue();
                Objects.requireNonNull(value6, "null cannot be cast to non-null type kotlin.Boolean");
                buildRoute.withParam(entry.getKey(), ((Boolean) value6).booleanValue());
            } else if (value instanceof String) {
                Object value7 = entry.getValue();
                Objects.requireNonNull(value7, "null cannot be cast to non-null type kotlin.String");
                buildRoute.withParam(entry.getKey(), (String) value7);
            }
        }
        if (arrayList != null) {
            Iterator<Integer> it = arrayList.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                l.b(next, "");
                buildRoute.addFlags(next.intValue());
            }
        }
        SmartRouteSet buildRoute2 = SmartRouteSet.Companion.buildRoute(context);
        l.b(buildRoute, "");
        buildRoute2.addRoute(buildRoute);
        buildRoute2.withCallBack(this).open();
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.deeplink.actions.a.a */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean doRealOpen$default(a aVar, Context context, String str, HashMap hashMap, ArrayList arrayList, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 8) != 0) {
                arrayList = null;
            }
            return aVar.doRealOpen(context, str, hashMap, arrayList);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doRealOpen");
    }
}
