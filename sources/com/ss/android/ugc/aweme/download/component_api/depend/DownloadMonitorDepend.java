package com.ss.android.ugc.aweme.download.component_api.depend;

import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.depend.w;
import java.util.Map;
import org.json.JSONObject;

public class DownloadMonitorDepend implements w {
    private String eventName;
    private String eventPage;
    private Map<String, String> extraInfo;
    private IMonitorLogSendDepend logDepend;

    static {
        Covode.recordClassIndex(51806);
    }

    @Override // com.ss.android.socialbase.downloader.depend.w
    public String getEventPage() {
        return this.eventPage;
    }

    @Override // com.ss.android.socialbase.downloader.depend.w
    public void monitorLogSend(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                Map<String, String> map = this.extraInfo;
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        String key = entry.getKey();
                        if (jSONObject.get(key) == null) {
                            jSONObject.put(key, entry.getValue());
                        }
                    }
                }
                IMonitorLogSendDepend iMonitorLogSendDepend = this.logDepend;
                if (iMonitorLogSendDepend != null) {
                    iMonitorLogSendDepend.sendMonitorLog(this.eventName, jSONObject);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public DownloadMonitorDepend(IMonitorLogSendDepend iMonitorLogSendDepend, Map<String, String> map, String str, String str2) {
        this.logDepend = iMonitorLogSendDepend;
        this.extraInfo = map;
        this.eventPage = str;
        this.eventName = str2;
    }
}
