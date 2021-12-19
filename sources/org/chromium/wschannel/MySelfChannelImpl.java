package org.chromium.wschannel;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.apm.b;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ttnet.org.chromium.net.c;
import com.ttnet.org.chromium.net.x;
import h.m.p;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.CronetClient;
import org.json.JSONException;
import org.json.JSONObject;

public class MySelfChannelImpl implements WeakHandler.IHandler, IWsChannelClient {
    private static String WSCHANNEL_ACTION_BACK;
    private static String WSCHANNEL_ACTION_FORE;
    private static c mCronetEngine;
    private static volatile int sChannelID = -1;
    private static volatile AtomicInteger sFirstConnection = new AtomicInteger(0);
    private static String sPackageName;
    private a mCallback = new a();
    private Context mContext;
    private x mWebsocketConnection;
    private IWsChannelClient mWsChannelClient;
    private boolean sharedConnection = true;

    public int cronetToWsStateAdapter(int i2) {
        if (i2 == -1) {
            return 0;
        }
        if (i2 == 0) {
            return 1;
        }
        if (i2 != 1) {
            return i2;
        }
        return 6;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onNetworkStateChanged(int i2) {
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void openConnection(Map map, List list) {
        org_chromium_wschannel_MySelfChannelImpl_com_ss_android_ugc_aweme_notice_api_ws_WsLancet_openConnection(this, map, list);
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void destroy() {
        x xVar = this.mWebsocketConnection;
        if (xVar != null) {
            xVar.b();
            this.mWebsocketConnection.d();
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean isConnected() {
        x xVar = this.mWebsocketConnection;
        if (xVar == null) {
            return false;
        }
        return xVar.c();
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void stopConnection() {
        x xVar = this.mWebsocketConnection;
        if (xVar != null) {
            xVar.b();
            this.mWebsocketConnection.d();
        }
    }

    static {
        Covode.recordClassIndex(106448);
    }

    private Map<String, String> getClientKeyHeaders() {
        try {
            return (Map) Class.forName("com.bytedance.ttnet.clientkey.ClientKeyManager").getMethod("getClientKeyHeaders", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void loadCronetKernel() {
        Object newInstance = Class.forName("com.bytedance.ttnet.TTNetInit").newInstance();
        Reflect.on(newInstance).call("getInitCompletedLatch");
        Reflect.on(newInstance).call("preInitCronetKernel");
    }

    public static ExecutorService org_chromium_wschannel_MySelfChannelImpl_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor() {
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        return g.a(a2.a());
    }

    /* access modifiers changed from: package-private */
    public class a extends x.b {
        static {
            Covode.recordClassIndex(106449);
        }

        a() {
        }

        @Override // com.ttnet.org.chromium.net.x.b
        public final void a(ByteBuffer byteBuffer, int i2) {
            byte[] bArr = new byte[byteBuffer.capacity()];
            try {
                byteBuffer.get(bArr);
                MySelfChannelImpl.this.onMessage(bArr);
            } catch (Throwable unused) {
            }
        }

        @Override // com.ttnet.org.chromium.net.x.b
        public final void a(int i2, String str) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(StringSet.type, 1);
                jSONObject.put("state", MySelfChannelImpl.this.cronetToWsStateAdapter(i2));
                jSONObject.put("url", str);
                MySelfChannelImpl.this.onConnection(jSONObject);
            } catch (Throwable unused) {
            }
        }

        @Override // com.ttnet.org.chromium.net.x.b
        public final void a(int i2, String str, String str2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(StringSet.type, 0);
                jSONObject.put("state", MySelfChannelImpl.this.cronetToWsStateAdapter(i2));
                jSONObject.put("url", str);
                jSONObject.put("error", str2);
                MySelfChannelImpl.this.onConnection(jSONObject);
            } catch (Throwable unused) {
            }
        }

        @Override // com.ttnet.org.chromium.net.x.b
        public final void a(String str, long j2, long j3, boolean z) {
            try {
                a.a().a(str, j2, j3, z);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onMessage(byte[] bArr) {
        IWsChannelClient iWsChannelClient = this.mWsChannelClient;
        if (iWsChannelClient != null) {
            iWsChannelClient.onMessage(bArr);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onConnection(JSONObject jSONObject) {
        if (this.mWsChannelClient != null) {
            try {
                jSONObject.put("channel_type", 1);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            this.mWsChannelClient.onConnection(jSONObject);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean sendMessage(byte[] bArr) {
        if (this.mWebsocketConnection == null) {
            return false;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        this.mWebsocketConnection.a(allocateDirect);
        return true;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onAppStateChanged(int i2) {
        Intent intent = new Intent();
        if (i2 == 1) {
            intent.setAction(WSCHANNEL_ACTION_FORE);
            if (!TextUtils.isEmpty(sPackageName)) {
                intent.setPackage(sPackageName);
            }
            this.mContext.sendBroadcast(intent);
        } else if (i2 == 2) {
            intent.setAction(WSCHANNEL_ACTION_BACK);
            if (!TextUtils.isEmpty(sPackageName)) {
                intent.setPackage(sPackageName);
            }
            this.mContext.sendBroadcast(intent);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onParameterChange(Map<String, Object> map, List<String> list) {
        x xVar = this.mWebsocketConnection;
        if (xVar != null) {
            xVar.b();
            this.mWebsocketConnection.d();
        }
        openConnection(map, list);
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void init(Context context, IWsChannelClient iWsChannelClient) {
        if (sFirstConnection.incrementAndGet() > 1) {
            this.sharedConnection = false;
        }
        this.mContext = context;
        sPackageName = context.getPackageName();
        this.mWsChannelClient = iWsChannelClient;
        try {
            loadCronetKernel();
        } catch (Throwable unused) {
        }
        mCronetEngine = CronetClient.getCronetEngine();
        WSCHANNEL_ACTION_BACK = this.mContext.getPackageName() + ".wschannel.APP_BACKGROUND";
        WSCHANNEL_ACTION_FORE = this.mContext.getPackageName() + ".wschannel.APP_FOREGROUND";
    }

    public void MySelfChannelImpl__openConnection$___twin___(Map<String, Object> map, List<String> list) {
        int intValue;
        if (list == null || list.size() <= 0) {
            throw new IllegalArgumentException("urls size <= 0 !!!");
        } else if (map == null || map.isEmpty()) {
            throw new IllegalArgumentException("configMap is empty !!!");
        } else {
            Object obj = map.get("channel_id");
            if (obj == null) {
                intValue = -1;
            } else {
                intValue = ((Integer) obj).intValue();
            }
            if (sChannelID == -1 && intValue > 0 && sFirstConnection.get() == 1) {
                sChannelID = intValue;
            }
            x.a a2 = mCronetEngine.a(this.mCallback, org_chromium_wschannel_MySelfChannelImpl_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor());
            try {
                a2.a(list);
                a2.a(String.valueOf(map.get("app_key")));
                a2.b(((Integer) map.get("fpid")).intValue());
                a2.c(((Integer) map.get("app_version")).intValue());
                a2.a(((Integer) map.get("aid")).intValue());
                a2.a(Long.parseLong((String) map.get("device_id")));
                a2.b(Long.parseLong((String) map.get("iid")));
                if (intValue > 0 && intValue == sChannelID) {
                    this.sharedConnection = true;
                }
                a2.a(this.sharedConnection);
                if (map.containsKey("sid")) {
                    a2.b((String) map.get("sid"));
                }
                String str = (String) map.get("extra");
                HashMap hashMap = new HashMap();
                if (!TextUtils.isEmpty(str)) {
                    String[] split = str.split("&");
                    for (String str2 : split) {
                        if (!TextUtils.isEmpty(str2)) {
                            String[] split2 = str2.split("=");
                            if (split2.length == 2) {
                                hashMap.put(split2[0], split2[1]);
                            }
                        }
                    }
                }
                a2.a(hashMap);
                try {
                    HashMap hashMap2 = new HashMap();
                    Map<String, String> clientKeyHeaders = getClientKeyHeaders();
                    if (clientKeyHeaders != null && !clientKeyHeaders.isEmpty()) {
                        hashMap2.putAll(clientKeyHeaders);
                    }
                    Map map2 = (Map) map.get("custom_headers");
                    if (map2 != null && !map2.isEmpty()) {
                        hashMap2.putAll(map2);
                    }
                    if (!hashMap2.isEmpty()) {
                        a2.b(hashMap2);
                    }
                } catch (Throwable unused) {
                }
                x a3 = a2.a();
                this.mWebsocketConnection = a3;
                a3.a();
            } catch (Throwable unused2) {
                throw new IllegalArgumentException("configMap contain err params !!!");
            }
        }
    }

    public static void org_chromium_wschannel_MySelfChannelImpl_com_ss_android_ugc_aweme_notice_api_ws_WsLancet_openConnection(MySelfChannelImpl mySelfChannelImpl, Map map, List list) {
        String str = "6->openConnection configMap: " + map + ",urls:" + list;
        com.ss.android.ugc.aweme.framework.a.a.b(4, "WsLancet", str);
        h.f.b.l.d(str, "");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", 4);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("message", str);
            try {
                jSONObject2.put("enter_from", (String) p.b((CharSequence) p.b(str, new String[]{"em="}).get(1), new String[]{"&"}).get(0));
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            }
            b.a("aweme_long_connection_status", jSONObject, (JSONObject) null, jSONObject2);
        } catch (Exception e3) {
            com.ss.android.ugc.aweme.framework.a.a.a(e3);
        }
        mySelfChannelImpl.MySelfChannelImpl__openConnection$___twin___(map, list);
    }
}
