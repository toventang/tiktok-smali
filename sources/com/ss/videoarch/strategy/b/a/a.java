package com.ss.videoarch.strategy.b.a;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public int f154407a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f154408b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f154409c = 300;

    /* renamed from: d  reason: collision with root package name */
    public int f154410d;

    /* renamed from: e  reason: collision with root package name */
    public int f154411e;

    /* renamed from: f  reason: collision with root package name */
    public String f154412f = "";

    /* renamed from: g  reason: collision with root package name */
    public int f154413g = 8000;

    /* renamed from: h  reason: collision with root package name */
    public boolean f154414h;

    /* renamed from: i  reason: collision with root package name */
    public JSONArray f154415i;

    /* renamed from: j  reason: collision with root package name */
    public String f154416j;

    /* renamed from: k  reason: collision with root package name */
    public String f154417k;

    /* renamed from: l  reason: collision with root package name */
    public Map<String, Integer> f154418l = new HashMap();

    /* renamed from: m  reason: collision with root package name */
    private JSONObject f154419m;
    private JSONObject n;

    static {
        Covode.recordClassIndex(102921);
    }

    public final Set<String> a() {
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = this.f154415i;
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i2 = 0; i2 < this.f154415i.length(); i2++) {
                JSONObject optJSONObject = this.f154415i.optJSONObject(i2);
                if (optJSONObject != null && optJSONObject.has("DomainName")) {
                    String optString = optJSONObject.optString("DomainName");
                    hashSet.add(optString);
                    this.f154418l.put(optString, Integer.valueOf(optJSONObject.optInt("DomainParseType")));
                }
            }
        }
        return hashSet;
    }

    public final JSONArray a(String str) {
        JSONObject jSONObject = this.n;
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.has(str)) {
                return this.n.getJSONArray(str);
            }
            return null;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final JSONObject b(String str) {
        JSONObject jSONObject = this.f154419m;
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.has("Settings")) {
                JSONObject jSONObject2 = this.f154419m.getJSONObject("Settings");
                if (jSONObject2.has("BatchSettingsParams")) {
                    String optString = jSONObject2.getJSONObject("BatchSettingsParams").getJSONObject("live_stream_strategy_engine").optString(str);
                    if (optString != null && optString.startsWith("﻿")) {
                        optString = optString.substring(1);
                    }
                    return new JSONObject(optString);
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return null;
    }

    public a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject != null) {
            try {
                if (jSONObject.has("ResponseMetadata") && (optJSONObject = jSONObject.optJSONObject("ResponseMetadata")) != null && optJSONObject.has("RequestId")) {
                    this.f154416j = optJSONObject.optString("RequestId");
                }
                if (jSONObject.has("Result")) {
                    this.f154419m = jSONObject.optJSONObject("Result");
                }
                JSONObject jSONObject2 = this.f154419m;
                if (jSONObject2 != null) {
                    if (jSONObject2.has("DomainInfos")) {
                        this.f154415i = this.f154419m.optJSONArray("DomainInfos");
                    }
                    if (this.f154419m.has("NodeInfos")) {
                        this.n = this.f154419m.optJSONObject("NodeInfos");
                    }
                    if (this.f154419m.has("DnsTTL")) {
                        this.f154409c = this.f154419m.optInt("DnsTTL");
                    }
                    if (this.f154419m.has("EnableSelectNode")) {
                        this.f154414h = this.f154419m.optBoolean("EnableSelectNode");
                    }
                    if (this.f154419m.has("Settings")) {
                        JSONObject jSONObject3 = this.f154419m.getJSONObject("Settings");
                        if (jSONObject3.has("BatchSettingsParams")) {
                            String optString = jSONObject3.getJSONObject("BatchSettingsParams").getJSONObject("live_stream_strategy_engine").optString("2");
                            if (optString != null && optString.startsWith("﻿")) {
                                optString = optString.substring(1);
                            }
                            JSONObject jSONObject4 = new JSONObject(optString);
                            if (jSONObject4.has("DnsTTL")) {
                                this.f154409c = jSONObject4.optInt("DnsTTL");
                            }
                            if (jSONObject4.has("NeedIPV6")) {
                                this.f154407a = jSONObject4.optInt("NeedIPV6");
                            }
                            if (jSONObject4.has("HttpDnsEnable")) {
                                this.f154408b = jSONObject4.optInt("HttpDnsEnable");
                            }
                            if (jSONObject4.has("EnableIpv6Probe")) {
                                this.f154411e = jSONObject4.optInt("EnableIpv6Probe");
                            }
                            if (jSONObject4.has("EnableUDPProbe")) {
                                this.f154410d = jSONObject4.optInt("EnableUDPProbe");
                            }
                            if (jSONObject4.has("UDPProbeHost")) {
                                this.f154412f = jSONObject4.optString("UDPProbeHost");
                            }
                            if (jSONObject4.has("UDPProbePort")) {
                                this.f154413g = jSONObject4.optInt("UDPProbePort");
                            }
                        }
                    }
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public final Object a(String str, String str2) {
        JSONObject jSONObject = this.f154419m;
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.has("Settings")) {
                JSONObject jSONObject2 = this.f154419m.getJSONObject("Settings");
                if (jSONObject2.has("BatchSettingsParams")) {
                    String optString = jSONObject2.getJSONObject("BatchSettingsParams").getJSONObject("live_stream_strategy_engine").optString(str);
                    if (optString != null && optString.startsWith("﻿")) {
                        optString = optString.substring(1);
                    }
                    JSONObject jSONObject3 = new JSONObject(optString);
                    if (jSONObject3.has(str2)) {
                        return jSONObject3.get(str2);
                    }
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return null;
    }
}
