package com.bytedance.common.wschannel.channel;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public interface IWsChannelClient {
    static {
        Covode.recordClassIndex(15965);
    }

    void destroy();

    void init(Context context, IWsChannelClient iWsChannelClient);

    boolean isConnected();

    void onAppStateChanged(int i2);

    void onConnection(JSONObject jSONObject);

    void onMessage(byte[] bArr);

    void onNetworkStateChanged(int i2);

    void onParameterChange(Map<String, Object> map, List<String> list);

    void openConnection(Map<String, Object> map, List<String> list);

    boolean sendMessage(byte[] bArr);

    void stopConnection();
}
