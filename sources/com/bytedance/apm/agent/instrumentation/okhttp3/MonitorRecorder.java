package com.bytedance.apm.agent.instrumentation.okhttp3;

import com.bytedance.apm.agent.instrumentation.transaction.TransactionData;
import com.bytedance.apm.agent.instrumentation.transaction.TransactionState;
import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.apm.c;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import okhttp3.FormBody;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONObject;

public class MonitorRecorder {
    static {
        Covode.recordClassIndex(14349);
    }

    public static int com_bytedance_apm_agent_instrumentation_okhttp3_MonitorRecorder_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2, Throwable th) {
        return 0;
    }

    public static void reportExceptionMonitor(TransactionState transactionState, Exception exc) {
    }

    public static void reportMonitorData(TransactionState transactionState, Response response) {
        if (transactionState != null && response != null) {
            reportMonitorData(transactionState, "okhttp");
        }
    }

    public static void recordResponse(Response response, TransactionState transactionState) {
        if (response != null && transactionState != null) {
            transactionState.setStatusCode(response.code());
            if (response.body() != null) {
                transactionState.setBytesReceived(response.body().contentLength());
            }
        }
    }

    public static void recordRequest(Request request, TransactionState transactionState) {
        if (request != null && transactionState != null) {
            transactionState.addAssistData("NetworkLib", "OkHttp3");
            transactionState.setUrl(request.url().toString());
            transactionState.setMethod(request.method());
            transactionState.setStartTime(System.currentTimeMillis());
            transactionState.setCarrier("");
            transactionState.setWanType("");
            RequestBody body = request.body();
            if (body == null) {
                return;
            }
            if (body instanceof FormBody) {
                transactionState.setBytesSent(body.contentLength());
            } else if (body instanceof MultipartBody) {
                try {
                    transactionState.setBytesSent(body.contentLength());
                } catch (IOException e2) {
                    com_bytedance_apm_agent_instrumentation_okhttp3_MonitorRecorder_com_ss_android_ugc_aweme_lancet_LogLancet_d("TransactionData:", "can not get MultipartBody content length", e2);
                }
            }
        }
    }

    public static void reportMonitorData(TransactionState transactionState, String str) {
        long startTime;
        if (transactionState != null) {
            TransactionData end = transactionState.end();
            if (c.e()) {
                String[] strArr = new String[1];
                String str2 = "auto plugin, reportMonitorData: " + end.toString();
            }
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("sent_bytes", end.getBytesSent());
                jSONObject2.put("received_bytes", end.getBytesReceived());
                jSONObject.put("response", jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("request_log", jSONObject);
                jSONObject3.put("net_consume_type", str);
                long totalTime = end.getTotalTime();
                if (transactionState.getStartTime() == 0) {
                    startTime = end.getRequestStart();
                } else {
                    startTime = transactionState.getStartTime();
                }
                MonitorTool.monitorSLA(totalTime, startTime, end.getUrl(), "", "", end.getStatusCode(), jSONObject3);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
