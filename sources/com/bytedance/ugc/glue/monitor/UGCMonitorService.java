package com.bytedance.ugc.glue.monitor;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class UGCMonitorService {
    private static UGCMonitorService instance = new UGCMonitorService();

    /* access modifiers changed from: protected */
    public void eventImpl(String str, Object obj) {
    }

    /* access modifiers changed from: protected */
    public void metricImpl(String str, String str2, int i2, Object... objArr) {
    }

    /* access modifiers changed from: protected */
    public void monitorImpl(String str, String str2, int i2, Object... objArr) {
    }

    /* access modifiers changed from: protected */
    public void sendImpl(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
    }

    protected UGCMonitorService() {
    }

    private static UGCMonitorService getInstance() {
        return instance;
    }

    public final void register() {
        instance = this;
    }

    static {
        Covode.recordClassIndex(27960);
    }

    static void event(String str, Object obj) {
        getInstance().eventImpl(str, obj);
    }

    static void metric(String str, String str2, int i2, Object... objArr) {
        getInstance().metricImpl(str, str2, i2, objArr);
    }

    static void monitor(String str, String str2, int i2, Object... objArr) {
        getInstance().monitorImpl(str, str2, i2, objArr);
    }

    static void send(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        getInstance().sendImpl(str, jSONObject, jSONObject2, jSONObject3);
    }
}
