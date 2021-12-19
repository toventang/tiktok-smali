package com.bytedance.apm.agent.instrumentation.okhttp3;

import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord;
import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.apm.c;
import com.bytedance.apm.q.j;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.Headers;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

public class OkHttpEventListener extends EventListener {
    private static String sIgnoreMonitorLabel;
    private long connectStartTime;
    private long dnsStartTime;
    private boolean needToDeal = true;
    private OkHttpRecord okHttpRecord;
    public EventListener originListener;
    private long requestBodyEndTime;
    private JSONObject requestHeader;
    private long requestHeadersEndTime;
    private long requestHeadersStartTime;
    private long responseBodyStartTime;
    private JSONObject responseHeader;
    private long responseHeadersStartTime;
    private long secureConnectStartTime;
    private String url;

    static {
        Covode.recordClassIndex(14351);
    }

    private void record() {
        OkHttpRecord okHttpRecord2;
        String str;
        if (this.needToDeal && (okHttpRecord2 = this.okHttpRecord) != null) {
            okHttpRecord2.timeRequest.duration = System.currentTimeMillis() - this.okHttpRecord.timeRequest.start_time;
            try {
                JSONObject jSONObject = new JSONObject(this.okHttpRecord.toString());
                jSONObject.put("timing_totalSendBytes", this.okHttpRecord.recordResponse.sent_bytes);
                jSONObject.put("timing_totalReceivedBytes", this.okHttpRecord.recordResponse.received_bytes);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("request_log", jSONObject);
                jSONObject2.put("net_consume_type", "okhttp");
                JSONObject jSONObject3 = this.requestHeader;
                String str2 = "";
                if (jSONObject3 != null) {
                    str = jSONObject3.toString();
                } else {
                    str = str2;
                }
                jSONObject2.put("requestHeader", str);
                JSONObject jSONObject4 = this.responseHeader;
                if (jSONObject4 != null) {
                    str2 = jSONObject4.toString();
                }
                jSONObject2.put("responseHeader", str2);
                MonitorTool.monitorSLA(this.okHttpRecord.timeRequest.duration, this.okHttpRecord.timeRequest.start_time, this.url, this.okHttpRecord.socketInfo.remote, "", this.okHttpRecord.recordResponse.code, jSONObject2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void setIgnoreMonitorLabel(String str) {
        sIgnoreMonitorLabel = str;
    }

    public OkHttpEventListener(EventListener eventListener) {
        this.originListener = eventListener;
        this.okHttpRecord = new OkHttpRecord();
    }

    @Override // okhttp3.EventListener
    public void callEnd(Call call) {
        super.callEnd(call);
        EventListener eventListener = this.originListener;
        if (eventListener != null) {
            eventListener.callEnd(call);
        }
        record();
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(Call call) {
        super.requestBodyStart(call);
        EventListener eventListener = this.originListener;
        if (eventListener != null) {
            eventListener.requestBodyStart(call);
        }
    }

    @Override // okhttp3.EventListener
    public void callStart(Call call) {
        super.callStart(call);
        EventListener eventListener = this.originListener;
        if (eventListener != null) {
            eventListener.callStart(call);
        }
        if (this.needToDeal) {
            this.okHttpRecord.timeRequest.start_time = System.currentTimeMillis();
        }
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(Call call) {
        super.requestHeadersStart(call);
        if (this.needToDeal) {
            this.requestHeadersStartTime = System.currentTimeMillis();
            this.okHttpRecord.timeRequest.request_sent_time = this.requestHeadersStartTime;
        }
        EventListener eventListener = this.originListener;
        if (eventListener != null) {
            eventListener.requestHeadersStart(call);
        }
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(Call call) {
        super.responseBodyStart(call);
        if (this.needToDeal) {
            this.responseBodyStartTime = System.currentTimeMillis();
        }
        EventListener eventListener = this.originListener;
        if (eventListener != null) {
            eventListener.responseBodyStart(call);
        }
    }

    private JSONObject getHeaders(Headers headers) {
        JSONObject jSONObject = new JSONObject();
        if (headers != null) {
            try {
                for (String str : headers.names()) {
                    try {
                        jSONObject.put(str, headers.get(str));
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        return jSONObject;
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(Call call) {
        long currentTimeMillis;
        long j2;
        super.responseHeadersStart(call);
        if (this.needToDeal) {
            this.responseHeadersStartTime = System.currentTimeMillis();
            if (this.requestBodyEndTime != 0) {
                currentTimeMillis = System.currentTimeMillis();
                j2 = this.requestBodyEndTime;
            } else {
                currentTimeMillis = System.currentTimeMillis();
                j2 = this.requestHeadersEndTime;
            }
            OkHttpRecord.DetailedDuration detailedDuration = this.okHttpRecord.timeDetailedDuration;
            detailedDuration.ttfb = (int) (currentTimeMillis - j2);
            this.okHttpRecord.timeRequest.response_recv_time = System.currentTimeMillis();
        }
        EventListener eventListener = this.originListener;
        if (eventListener != null) {
            eventListener.responseHeadersStart(call);
        }
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(Call call) {
        super.secureConnectStart(call);
        if (this.needToDeal) {
            this.okHttpRecord.timeDetailedDuration.tcp = (int) (System.currentTimeMillis() - this.connectStartTime);
            this.secureConnectStartTime = System.currentTimeMillis();
        }
        EventListener eventListener = this.originListener;
        if (eventListener != null) {
            eventListener.secureConnectStart(call);
        }
    }

    private void dealSpecialHeader(Response response) {
        int i2;
        int i3;
        int i4;
        for (String str : response.headers("server-timing")) {
            if (!TextUtils.isEmpty(str)) {
                this.okHttpRecord.headerRequest.serverTimings.add(str);
                String[] split = str.split(",");
                for (String str2 : split) {
                    if (!TextUtils.isEmpty(str2) && str2.contains(";")) {
                        String[] split2 = str2.split(";");
                        if (split2.length >= 2) {
                            String replace = split2[0].replace(" ", "");
                            boolean z = true;
                            String replace2 = split2[1].replace(" ", "");
                            if (!TextUtils.isEmpty(replace)) {
                                replace.hashCode();
                                char c2 = 65535;
                                switch (replace.hashCode()) {
                                    case -1008619738:
                                        if (replace.equals("origin")) {
                                            c2 = 0;
                                            break;
                                        }
                                        break;
                                    case -138105374:
                                        if (replace.equals("cdn-cache")) {
                                            c2 = 1;
                                            break;
                                        }
                                        break;
                                    case 3108285:
                                        if (replace.equals("edge")) {
                                            c2 = 2;
                                            break;
                                        }
                                        break;
                                    case 100355670:
                                        if (replace.equals("inner")) {
                                            c2 = 3;
                                            break;
                                        }
                                        break;
                                }
                                switch (c2) {
                                    case 0:
                                        if (!TextUtils.isEmpty(replace2)) {
                                            String[] split3 = replace2.split("=");
                                            if (split3.length >= 2) {
                                                OkHttpRecord.DetailedDuration detailedDuration = this.okHttpRecord.timeDetailedDuration;
                                                if (!TextUtils.isEmpty(split3[1])) {
                                                    i2 = Integer.parseInt(split3[1]);
                                                } else {
                                                    i2 = 0;
                                                }
                                                detailedDuration.origin = i2;
                                                break;
                                            }
                                        }
                                        break;
                                    case 1:
                                        if (!TextUtils.isEmpty(replace2)) {
                                            String[] split4 = replace2.split("=");
                                            if (split4.length >= 2) {
                                                OkHttpRecord.DetailedDuration detailedDuration2 = this.okHttpRecord.timeDetailedDuration;
                                                if (TextUtils.isEmpty(split4[1]) || !split4[1].equalsIgnoreCase("hit")) {
                                                    z = false;
                                                }
                                                detailedDuration2.cdn_hit_cache = z;
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        if (!TextUtils.isEmpty(replace2)) {
                                            String[] split5 = replace2.split("=");
                                            if (split5.length >= 2) {
                                                OkHttpRecord.DetailedDuration detailedDuration3 = this.okHttpRecord.timeDetailedDuration;
                                                if (!TextUtils.isEmpty(split5[1])) {
                                                    i3 = Integer.parseInt(split5[1]);
                                                } else {
                                                    i3 = 0;
                                                }
                                                detailedDuration3.edge = i3;
                                                break;
                                            }
                                        }
                                        break;
                                    case 3:
                                        if (!TextUtils.isEmpty(replace2)) {
                                            String[] split6 = replace2.split("=");
                                            if (split6.length >= 2) {
                                                OkHttpRecord.DetailedDuration detailedDuration4 = this.okHttpRecord.timeDetailedDuration;
                                                if (!TextUtils.isEmpty(split6[1])) {
                                                    i4 = Integer.parseInt(split6[1]);
                                                } else {
                                                    i4 = 0;
                                                }
                                                detailedDuration4.inner = i4;
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
        int i5 = (this.okHttpRecord.timeDetailedDuration.ttfb - this.okHttpRecord.timeDetailedDuration.edge) - this.okHttpRecord.timeDetailedDuration.origin;
        if (i5 > 0) {
            this.okHttpRecord.timeDetailedDuration.rtt = i5;
        }
        int i6 = this.okHttpRecord.timeDetailedDuration.origin - this.okHttpRecord.timeDetailedDuration.inner;
        if (i6 > 0) {
            this.okHttpRecord.timeDetailedDuration.origin = i6;
        }
    }

    @Override // okhttp3.EventListener
    public void callFailed(Call call, IOException iOException) {
        super.callFailed(call, iOException);
        EventListener eventListener = this.originListener;
        if (eventListener != null) {
            eventListener.callFailed(call, iOException);
        }
        record();
    }

    @Override // okhttp3.EventListener
    public void connectionReleased(Call call, Connection connection) {
        super.connectionReleased(call, connection);
        EventListener eventListener = this.originListener;
        if (eventListener != null) {
            eventListener.connectionReleased(call, connection);
        }
    }

    @Override // okhttp3.EventListener
    public void dnsStart(Call call, String str) {
        super.dnsStart(call, str);
        if (this.needToDeal) {
            this.dnsStartTime = System.currentTimeMillis();
        }
        EventListener eventListener = this.originListener;
        if (eventListener != null) {
            eventListener.dnsStart(call, str);
        }
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(Call call, Handshake handshake) {
        super.secureConnectEnd(call, handshake);
        if (this.needToDeal) {
            this.okHttpRecord.timeDetailedDuration.ssl = (int) (System.currentTimeMillis() - this.secureConnectStartTime);
        }
        EventListener eventListener = this.originListener;
        if (eventListener != null) {
            eventListener.secureConnectEnd(call, handshake);
        }
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(Call call, Connection connection) {
        super.connectionAcquired(call, connection);
        EventListener eventListener = this.originListener;
        if (eventListener != null) {
            eventListener.connectionAcquired(call, connection);
        }
        if (!this.needToDeal) {
            return;
        }
        if (this.dnsStartTime == 0) {
            this.okHttpRecord.socketInfo.socketReused = true;
        } else {
            this.okHttpRecord.socketInfo.socketReused = false;
        }
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(Call call, long j2) {
        super.requestBodyEnd(call, j2);
        if (this.needToDeal) {
            this.requestBodyEndTime = System.currentTimeMillis();
            this.okHttpRecord.timeDetailedDuration.send = (int) (System.currentTimeMillis() - this.requestHeadersStartTime);
        }
        EventListener eventListener = this.originListener;
        if (eventListener != null) {
            eventListener.requestBodyEnd(call, j2);
        }
        if (this.needToDeal) {
            this.okHttpRecord.recordResponse.sent_bytes += j2;
        }
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(Call call, long j2) {
        super.responseBodyEnd(call, j2);
        EventListener eventListener = this.originListener;
        if (eventListener != null) {
            eventListener.responseBodyEnd(call, j2);
        }
        if (this.needToDeal) {
            this.okHttpRecord.recordResponse.received_bytes += j2;
            this.okHttpRecord.timeDetailedDuration.body_recv = (int) (System.currentTimeMillis() - this.responseBodyStartTime);
        }
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(Call call, Request request) {
        super.requestHeadersEnd(call, request);
        if (this.needToDeal) {
            this.requestHeadersEndTime = System.currentTimeMillis();
            this.okHttpRecord.timeDetailedDuration.send = (int) (System.currentTimeMillis() - this.requestHeadersStartTime);
        }
        EventListener eventListener = this.originListener;
        if (eventListener != null) {
            eventListener.requestHeadersEnd(call, request);
        }
        String header = request.header("User-Agent");
        String str = sIgnoreMonitorLabel;
        if (!(str == null || header == null || !header.contains(str))) {
            this.needToDeal = false;
        }
        if (this.needToDeal) {
            this.okHttpRecord.recordResponse.sent_bytes += request.headers().byteCount();
            this.url = request.url().toString();
            this.requestHeader = getHeaders(request.headers());
        }
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(Call call, Response response) {
        super.responseHeadersEnd(call, response);
        EventListener eventListener = this.originListener;
        if (eventListener != null) {
            eventListener.responseHeadersEnd(call, response);
        }
        if (this.needToDeal) {
            this.okHttpRecord.timeDetailedDuration.header_recv = (int) (System.currentTimeMillis() - this.responseHeadersStartTime);
            this.okHttpRecord.recordResponse.code = response.code();
            this.okHttpRecord.recordResponse.received_bytes += response.headers().byteCount();
            this.okHttpRecord.recordResponse.network_accessed = j.a(c.f24685a);
            this.okHttpRecord.headerRequest.x_tt_trace_id = response.header("x-tt-trace-id", "");
            this.okHttpRecord.headerRequest.x_tt_trace_host = response.header("x-tt-trace-host", "");
            this.okHttpRecord.headerRequest.x_tt_trace_tag = response.header("x-tt-trace-tag", "");
            this.okHttpRecord.headerRequest.x_tt_content_encoding = response.header("x-tt-content-encoding", "");
            try {
                dealSpecialHeader(response);
            } catch (Exception unused) {
            }
            this.responseHeader = getHeaders(response.headers());
        }
    }

    @Override // okhttp3.EventListener
    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        super.connectStart(call, inetSocketAddress, proxy);
        if (this.needToDeal) {
            this.connectStartTime = System.currentTimeMillis();
        }
        EventListener eventListener = this.originListener;
        if (eventListener != null) {
            eventListener.connectStart(call, inetSocketAddress, proxy);
        }
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(Call call, String str, List<InetAddress> list) {
        super.dnsEnd(call, str, list);
        EventListener eventListener = this.originListener;
        if (eventListener != null) {
            eventListener.dnsEnd(call, str, list);
        }
        if (this.needToDeal) {
            this.okHttpRecord.timeDetailedDuration.dns = (int) (System.currentTimeMillis() - this.dnsStartTime);
            if (list != null && list.size() > 0) {
                for (InetAddress inetAddress : list) {
                    OkHttpRecord.DnsInfo dnsInfo = new OkHttpRecord.DnsInfo();
                    dnsInfo.address = inetAddress.getHostAddress();
                    this.okHttpRecord.addressList.add(dnsInfo);
                }
            }
        }
    }

    @Override // okhttp3.EventListener
    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        boolean z;
        super.connectEnd(call, inetSocketAddress, proxy, protocol);
        EventListener eventListener = this.originListener;
        if (eventListener != null) {
            eventListener.connectEnd(call, inetSocketAddress, proxy, protocol);
        }
        if (this.needToDeal) {
            OkHttpRecord.RecordResponse recordResponse = this.okHttpRecord.recordResponse;
            if (proxy.address() != null) {
                z = true;
            } else {
                z = false;
            }
            recordResponse.via_Proxy = z;
            if (inetSocketAddress != null && inetSocketAddress.getAddress() != null) {
                this.okHttpRecord.socketInfo.remote = inetSocketAddress.getAddress().getHostAddress() + ":" + inetSocketAddress.getPort();
                this.okHttpRecord.socketInfo.host = inetSocketAddress.getAddress().getHostAddress();
                this.okHttpRecord.socketInfo.port = new StringBuilder().append(inetSocketAddress.getPort()).toString();
            }
        }
    }

    @Override // okhttp3.EventListener
    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        super.connectFailed(call, inetSocketAddress, proxy, protocol, iOException);
        EventListener eventListener = this.originListener;
        if (eventListener != null) {
            eventListener.connectFailed(call, inetSocketAddress, proxy, protocol, iOException);
        }
    }
}
