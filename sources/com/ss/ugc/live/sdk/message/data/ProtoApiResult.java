package com.ss.ugc.live.sdk.message.data;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProtoApiResult {
    public String cursor;
    public long delayTimeBeforeDispatch;
    public long fetchInterval;
    public int fetchType;
    public long heartbeatDuration;
    public String internalExt;
    public long logId;
    public List<IMessage> messages;
    public boolean needAck;
    public long now;
    public String payloadType;
    public String pushServer;
    public Map<String, String> routeParams;

    static {
        Covode.recordClassIndex(102775);
    }

    public String getFormatAckInfo() {
        return "log id is " + this.logId + ", internal ext is " + this.internalExt;
    }

    public String getFormatRouteParams() {
        if (this.routeParams == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : this.routeParams.entrySet()) {
            if (entry != null) {
                arrayList.add(entry.getKey() + "=" + entry.getValue());
            }
        }
        return TextUtils.join("&", arrayList);
    }
}
