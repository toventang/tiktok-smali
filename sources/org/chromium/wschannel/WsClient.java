package org.chromium.wschannel;

import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.cronet.websocket.IMessageReceiveListener;
import com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ttnet.org.chromium.net.c;
import com.ttnet.org.chromium.net.x;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.chromium.CronetClient;
import org.json.JSONObject;

public class WsClient implements IWsClient {
    private static c mCronetEngine;
    private a mCallback = new a();
    public IMessageReceiveListener mListener;
    private x mWebsocketConnection;

    static {
        Covode.recordClassIndex(106450);
    }

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
        return 5;
    }

    private c getCronetEngine() {
        try {
            loadCronetKernel();
        } catch (Throwable unused) {
        }
        return CronetClient.getCronetEngine();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient
    public boolean isConnected() {
        x xVar = this.mWebsocketConnection;
        if (xVar == null) {
            return false;
        }
        return xVar.c();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient
    public void stopConnection() {
        x xVar = this.mWebsocketConnection;
        if (xVar != null) {
            xVar.b();
            this.mWebsocketConnection.d();
        }
    }

    private static void loadCronetKernel() {
        Object newInstance = Class.forName("com.bytedance.ttnet.TTNetInit").newInstance();
        Reflect.on(newInstance).call("getInitCompletedLatch");
        Reflect.on(newInstance).call("preInitCronetKernel");
    }

    public static ExecutorService org_chromium_wschannel_WsClient_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor() {
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        return g.a(a2.a());
    }

    /* access modifiers changed from: package-private */
    public class a extends x.b {
        static {
            Covode.recordClassIndex(106451);
        }

        a() {
        }

        @Override // com.ttnet.org.chromium.net.x.b
        public final void a(String str) {
            if (WsClient.this.mListener != null) {
                WsClient.this.mListener.onFeedBackLog(str);
            }
        }

        @Override // com.ttnet.org.chromium.net.x.b
        public final void a(int i2, String str) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("state", WsClient.this.cronetToWsStateAdapter(i2));
                jSONObject.put("url", str);
                if (WsClient.this.mListener != null) {
                    WsClient.this.mListener.onConnection(i2, str, jSONObject);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // com.ttnet.org.chromium.net.x.b
        public final void a(ByteBuffer byteBuffer, int i2) {
            byte[] bArr = new byte[byteBuffer.capacity()];
            if (!(i2 == 1 || i2 == 2)) {
                i2 = 0;
            }
            try {
                byteBuffer.get(bArr);
                if (WsClient.this.mListener != null) {
                    WsClient.this.mListener.onMessage(bArr, i2);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // com.ttnet.org.chromium.net.x.b
        public final void a(int i2, String str, String str2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str);
                jSONObject.put("error", str2);
                if (WsClient.this.mListener != null) {
                    WsClient.this.mListener.onConnection(i2, str, jSONObject);
                }
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

    public WsClient(IMessageReceiveListener iMessageReceiveListener) {
        if (mCronetEngine == null) {
            mCronetEngine = getCronetEngine();
        }
        this.mListener = iMessageReceiveListener;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient
    public boolean sendMessage(byte[] bArr, int i2) {
        if (this.mWebsocketConnection == null) {
            return false;
        }
        if (i2 == 2) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
            allocateDirect.put(bArr);
            this.mWebsocketConnection.a(allocateDirect);
        } else if (i2 == 1) {
            this.mWebsocketConnection.a(new String(bArr, "UTF-8"));
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(i2)));
        }
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient
    public void onParameterChange(Map<String, String> map, Map<String, String> map2, List<String> list, boolean z, boolean z2) {
        x xVar = this.mWebsocketConnection;
        if (xVar != null) {
            xVar.b();
            this.mWebsocketConnection.d();
        }
        openConnection(map, map2, list, z, z2);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient
    public void openConnection(Map<String, String> map, Map<String, String> map2, List<String> list, boolean z, boolean z2) {
        if (list == null || list.size() <= 0) {
            throw new IllegalArgumentException("urls size <= 0 !!!");
        }
        x.a a2 = mCronetEngine.a(this.mCallback, org_chromium_wschannel_WsClient_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor());
        a2.a(list);
        if (map != null && !map.isEmpty()) {
            a2.a(map);
        }
        if (map2 != null && !map2.isEmpty()) {
            a2.b(map2);
        }
        a2.a(z);
        a2.b(z2);
        x a3 = a2.a();
        this.mWebsocketConnection = a3;
        a3.a();
    }
}
