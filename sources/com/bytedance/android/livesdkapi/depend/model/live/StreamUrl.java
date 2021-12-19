package com.bytedance.android.livesdkapi.depend.model.live;

import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class StreamUrl {
    @c(a = "id")

    /* renamed from: a  reason: collision with root package name */
    public long f23034a;
    @c(a = "id_str")

    /* renamed from: b  reason: collision with root package name */
    public String f23035b;
    @c(a = "provider")

    /* renamed from: c  reason: collision with root package name */
    public int f23036c;
    @c(a = "rtmp_push_url")

    /* renamed from: d  reason: collision with root package name */
    public String f23037d;
    @c(a = "push_urls")

    /* renamed from: e  reason: collision with root package name */
    public List<String> f23038e;
    @c(a = "rtmp_pull_url")

    /* renamed from: f  reason: collision with root package name */
    public String f23039f;
    @c(a = "flv_pull_url")

    /* renamed from: g  reason: collision with root package name */
    public Map<String, String> f23040g;
    @c(a = "resolution_name")

    /* renamed from: h  reason: collision with root package name */
    public Map<String, String> f23041h;
    @c(a = "flv_pull_url_params")

    /* renamed from: i  reason: collision with root package name */
    Map<String, String> f23042i;
    @c(a = "candidate_resolution")

    /* renamed from: j  reason: collision with root package name */
    public List<String> f23043j;
    @c(a = "default_resolution")

    /* renamed from: k  reason: collision with root package name */
    public String f23044k;
    @c(a = "extra")

    /* renamed from: l  reason: collision with root package name */
    public s f23045l;
    @c(a = "rtmp_pull_url_params")

    /* renamed from: m  reason: collision with root package name */
    String f23046m;
    @c(a = "rtmp_push_url_params")
    public String n;
    @c(a = "live_core_sdk_data")
    public LiveCoreSDKData o;
    public String p;
    public String q;
    public final LinkedList<LiveCoreSDKData.Quality> qualityList = new LinkedList<>();
    final LinkedHashMap<String, String> qualityMap = new LinkedHashMap<>();
    public String r = null;
    public String s = null;
    final LinkedHashMap<String, String> sdkParamsMap = new LinkedHashMap<>();
    LiveCoreSDKData.Quality t = null;
    private LiveCoreSDKData.Quality u = null;

    static {
        Covode.recordClassIndex(13665);
    }

    public final String a() {
        if (TextUtils.isEmpty(this.p)) {
            return this.f23037d;
        }
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.t = null;
        this.u = null;
        this.qualityList.clear();
        LiveCoreSDKData liveCoreSDKData = this.o;
        if (liveCoreSDKData != null) {
            if (liveCoreSDKData.getQualityList() != null && this.o.getQualityList().size() > 0) {
                for (LiveCoreSDKData.Quality quality : this.o.getQualityList()) {
                    this.qualityList.add(quality);
                    if (this.u == null) {
                        this.u = quality;
                    }
                }
            }
            this.t = this.o.getDefaultQuality();
            if (this.qualityList.isEmpty()) {
                LiveCoreSDKData.Quality quality2 = this.t;
                this.u = quality2;
                this.qualityList.add(quality2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        String str;
        this.qualityMap.clear();
        this.sdkParamsMap.clear();
        this.r = null;
        this.s = null;
        List<String> list = this.f23043j;
        if (!(list == null || this.f23041h == null || this.f23040g == null)) {
            for (String str2 : list) {
                String str3 = this.f23041h.get(str2);
                if (!(str3 == null || (str = this.f23040g.get(str2)) == null)) {
                    Map<String, String> map = this.f23042i;
                    String str4 = map == null ? null : map.get(str2);
                    this.qualityMap.put(str3, str);
                    this.sdkParamsMap.put(str3, str4);
                    if (str2.equals(this.f23044k)) {
                        this.r = str3;
                    } else if (this.r == null) {
                        this.r = str3;
                    }
                    if (this.s == null) {
                        this.s = str3;
                    }
                }
            }
        }
        if (this.qualityMap.isEmpty() && !TextUtils.isEmpty(this.f23039f)) {
            this.r = "default";
            this.s = "default";
            this.qualityMap.put("default", this.f23039f);
            this.sdkParamsMap.put(this.r, this.f23046m);
        }
    }
}
