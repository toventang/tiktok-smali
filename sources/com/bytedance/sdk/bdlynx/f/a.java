package com.bytedance.sdk.bdlynx.f;

import android.content.Context;
import com.bytedance.bdp.bdpbase.manager.BdpManager;
import com.bytedance.bdp.bdpbase.util.DevicesUtil;
import com.bytedance.bdp.bdpbase.util.UIUtils;
import com.bytedance.bdp.serviceapi.hostimpl.Info.BdpHostInfo;
import com.bytedance.bdp.serviceapi.hostimpl.Info.BdpInfoService;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f43764a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static JSONObject f43765b;

    /* renamed from: c  reason: collision with root package name */
    private static final h f43766c = i.a((h.f.a.a) C1062a.f43767a);

    private static BdpInfoService b() {
        return (BdpInfoService) f43766c.getValue();
    }

    private a() {
    }

    /* renamed from: com.bytedance.sdk.bdlynx.f.a$a  reason: collision with other inner class name */
    static final class C1062a extends m implements h.f.a.a<BdpInfoService> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1062a f43767a = new C1062a();

        static {
            Covode.recordClassIndex(26772);
        }

        C1062a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BdpInfoService invoke() {
            return BdpManager.getInst().getService(BdpInfoService.class);
        }
    }

    static {
        Covode.recordClassIndex(26771);
    }

    public static JSONObject a() {
        JSONObject jSONObject = f43765b;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            BdpInfoService b2 = b();
            l.a((Object) b2, "");
            BdpHostInfo hostInfo = b2.getHostInfo();
            l.a((Object) hostInfo, "");
            jSONObject.put("deviceId", hostInfo.getDeviceId());
            BdpInfoService b3 = b();
            l.a((Object) b3, "");
            BdpHostInfo hostInfo2 = b3.getHostInfo();
            l.a((Object) hostInfo2, "");
            jSONObject.put("aid", hostInfo2.getAppId());
            BdpInfoService b4 = b();
            l.a((Object) b4, "");
            BdpHostInfo hostInfo3 = b4.getHostInfo();
            l.a((Object) hostInfo3, "");
            jSONObject.put("appName", hostInfo3.getAppName());
            BdpInfoService b5 = b();
            l.a((Object) b5, "");
            BdpHostInfo hostInfo4 = b5.getHostInfo();
            l.a((Object) hostInfo4, "");
            jSONObject.put("appVersion", hostInfo4.getVersionName());
            jSONObject.put("deviceModel", DevicesUtil.getModel());
            jSONObject.put("osVersion", DevicesUtil.getSystem());
            Context context = com.bytedance.sdk.bdlynx.a.a.f43616a;
            if (context != null) {
                jSONObject.put("statusBarHeight", UIUtils.px2dip(context, (float) DevicesUtil.getStatusBarHeight(context)));
                jSONObject.put("screenWidth", UIUtils.px2dip(context, (float) DevicesUtil.getScreenWidth(context)));
                jSONObject.put("screenHeight", UIUtils.px2dip(context, (float) DevicesUtil.getScreenHight(context)));
            }
            f43765b = jSONObject;
        }
        return jSONObject;
    }
}
