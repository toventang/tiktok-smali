package com.bytedance.apm.agent.instrumentation.okhttp3;

import com.bytedance.apm.c;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.Version;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class OkHttpRecord {
    public List<DnsInfo> addressList = new ArrayList();
    public HeaderRequest headerRequest = new HeaderRequest();
    public OtherInfo otherInfo = new OtherInfo();
    public JSONObject recordJson = new JSONObject();
    public RecordResponse recordResponse = new RecordResponse();
    public SocketInfo socketInfo = new SocketInfo();
    public DetailedDuration timeDetailedDuration = new DetailedDuration();
    public TimeRequest timeRequest = new TimeRequest();

    public static class DetailedDuration {
        public int body_recv;
        public boolean cdn_hit_cache;
        public int dns;
        public int edge;
        public int header_recv;
        public int inner;
        public int origin;
        public int proxy = -3;
        public int rtt;
        public int send;
        public int ssl;
        public int tcp;
        public int ttfb;

        static {
            Covode.recordClassIndex(14353);
        }
    }

    public static class DnsInfo {
        public String address;

        static {
            Covode.recordClassIndex(14354);
        }
    }

    public static class HeaderRequest {
        public List<String> serverTimings = new ArrayList();
        public String x_tt_content_encoding;
        public String x_tt_trace_host;
        public String x_tt_trace_id;
        public String x_tt_trace_tag;

        static {
            Covode.recordClassIndex(14355);
        }
    }

    public static class OtherInfo {
        public boolean is_main_process = c.b();
        public String libcore = "okhttp";
        public String version = Version.userAgent();

        static {
            Covode.recordClassIndex(14356);
        }
    }

    public static class SocketInfo {
        public String host;
        public String port;
        public String remote;
        public boolean socketReused;

        static {
            Covode.recordClassIndex(14358);
        }
    }

    public static class TimeRequest {
        public long duration;
        public long request_sent_time;
        public long response_recv_time;
        public long start_time;

        static {
            Covode.recordClassIndex(14359);
        }
    }

    static {
        Covode.recordClassIndex(14352);
    }

    public String toString() {
        fillDnsInfo();
        fillSocketInfo();
        fillResponse();
        dealTime();
        dealOther();
        dealHeader();
        return this.recordJson.toString();
    }

    private void dealOther() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("libcore", this.otherInfo.libcore);
            jSONObject.put("version", this.otherInfo.version);
            jSONObject.put("is_main_process", this.otherInfo.is_main_process);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        try {
            this.recordJson.put("other", jSONObject);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
    }

    private void fillSocketInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("remote", this.socketInfo.remote);
            jSONObject.put("remote_host", this.socketInfo.host);
            jSONObject.put("remote_port", this.socketInfo.port);
            jSONObject.put("socket_reused", this.socketInfo.socketReused);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        try {
            this.recordJson.put("socket", jSONObject);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
    }

    private void dealHeader() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x-tt-content-encoding", this.headerRequest.x_tt_content_encoding);
            jSONObject.put("x-tt-trace-host", this.headerRequest.x_tt_trace_host);
            jSONObject.put("x-tt-trace-id", this.headerRequest.x_tt_trace_id);
            jSONObject.put("x-tt-trace-tag", this.headerRequest.x_tt_trace_tag);
            JSONArray jSONArray = new JSONArray();
            for (String str : this.headerRequest.serverTimings) {
                jSONArray.put(str);
            }
            jSONObject.put("server-timing", jSONArray);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        try {
            this.recordJson.put("header", jSONObject);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
    }

    private void fillDnsInfo() {
        JSONObject jSONObject = new JSONObject();
        if (!this.addressList.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (DnsInfo dnsInfo : this.addressList) {
                jSONArray.put(dnsInfo.address);
            }
            try {
                jSONObject.put("address_list", jSONArray);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        try {
            this.recordJson.put("dns", jSONObject);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
    }

    private void fillResponse() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", this.recordResponse.code);
            jSONObject.put("sent_bytes", this.recordResponse.sent_bytes);
            jSONObject.put("received_bytes", this.recordResponse.received_bytes);
            jSONObject.put("via_proxy", this.recordResponse.via_Proxy);
            jSONObject.put("network_accessed", this.recordResponse.network_accessed);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        try {
            this.recordJson.put("response", jSONObject);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
    }

    private void dealTime() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("duration", this.timeRequest.duration);
            jSONObject2.put("request_sent_time", this.timeRequest.request_sent_time);
            jSONObject2.put("response_recv_time", this.timeRequest.response_recv_time);
            jSONObject2.put("start_time", this.timeRequest.start_time);
            jSONObject.put("request", jSONObject2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("edge", this.timeDetailedDuration.edge);
            jSONObject3.put("ttfb", this.timeDetailedDuration.ttfb);
            jSONObject3.put("rtt", this.timeDetailedDuration.rtt);
            jSONObject3.put("inner", this.timeDetailedDuration.inner);
            jSONObject3.put("cdn_hit_cache", this.timeDetailedDuration.cdn_hit_cache);
            jSONObject3.put("origin", this.timeDetailedDuration.origin);
            jSONObject3.put("proxy", this.timeDetailedDuration.proxy);
            jSONObject3.put("dns", this.timeDetailedDuration.dns);
            jSONObject3.put("tcp", this.timeDetailedDuration.tcp);
            jSONObject3.put("ssl", this.timeDetailedDuration.ssl);
            jSONObject3.put("send", this.timeDetailedDuration.send);
            jSONObject3.put("header_recv", this.timeDetailedDuration.header_recv);
            jSONObject3.put("body_recv", this.timeDetailedDuration.body_recv);
            jSONObject.put("detailed_duration", jSONObject3);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        try {
            this.recordJson.put("timing", jSONObject);
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
    }

    public class RecordResponse {
        public int code;
        public boolean network_accessed;
        public long received_bytes;
        public long sent_bytes;
        public boolean via_Proxy;

        static {
            Covode.recordClassIndex(14357);
        }

        public RecordResponse() {
        }
    }
}
