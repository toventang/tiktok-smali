package com.ss.android.ugc.aweme.feed.model.live;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.live.LiveCoreSDKData;
import com.ss.android.ugc.aweme.utils.ip;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LiveStreamUrl implements Serializable {
    private String bindNodeRtmpUrl;
    @c(a = "candidate_resolution")
    public ArrayList<String> candidateResolution;
    @c(a = "rtmp_pull_url_params")
    String defaultPullSdkParams;
    String defaultQualityName = null;
    @c(a = "default_resolution")
    public String defaultResolution;
    @c(a = "extra")
    LiveStreamUrlExtra extra;
    @c(a = "flv_pull_url")
    HashMap<String, String> flvPullUrl;
    @c(a = "id")
    public long id;
    @c(a = "id_str")
    String idStr;
    @c(a = "live_core_sdk_data")
    LiveCoreSDKData liveCoreSDKData;
    private String lowestQualityName = null;
    LiveCoreSDKData.Quality multiDefaultQuality = null;
    private LiveCoreSDKData.Quality multiLowestQuality = null;
    private String ngbRTMPUrl;
    @c(a = "provider")
    public int provider;
    @c(a = "flv_pull_url_params")
    Map<String, String> pullSdkParams;
    @c(a = "rtmp_push_url_params")
    String pushSdkParams;
    @c(a = "push_urls")
    List<String> pushUrlList;
    final LinkedList<LiveCoreSDKData.Quality> qualityList = new LinkedList<>();
    final LinkedHashMap<String, String> qualityMap = new LinkedHashMap<>();
    @c(a = "resolution_name")
    Map<String, String> resolutionName;
    @c(a = "rtmp_pull_url")
    public String rtmp_pull_url;
    @c(a = "rtmp_push_url")
    public String rtmp_push_url;
    final LinkedHashMap<String, String> sdkParamsMap = new LinkedHashMap<>();

    static {
        Covode.recordClassIndex(59500);
    }

    public String getBindNodeRtmpUrl() {
        return this.bindNodeRtmpUrl;
    }

    public String getDefaultQuality() {
        return this.defaultQualityName;
    }

    public LiveStreamUrlExtra getExtra() {
        return this.extra;
    }

    public long getId() {
        return this.id;
    }

    public String getIdStr() {
        return this.idStr;
    }

    public LiveCoreSDKData getLiveCoreSDKData() {
        return this.liveCoreSDKData;
    }

    public String getLowestQuality() {
        return this.lowestQualityName;
    }

    public int getProvider() {
        return this.provider;
    }

    public String getPushSdkParams() {
        return this.pushSdkParams;
    }

    public List<String> getPushUrlList() {
        return this.pushUrlList;
    }

    public List<LiveCoreSDKData.Quality> getQualityList() {
        return this.qualityList;
    }

    public String getRtmpPullUrl() {
        return this.rtmp_pull_url;
    }

    public Set<String> getQualities() {
        return this.qualityMap.keySet();
    }

    public String getMultiStreamDefaultQualityName() {
        LiveCoreSDKData.Quality quality = this.multiDefaultQuality;
        if (quality == null) {
            return "";
        }
        return quality.name;
    }

    public String getMultiStreamLowestQualityName() {
        LiveCoreSDKData.Quality quality = this.multiLowestQuality;
        if (quality == null) {
            return "";
        }
        return quality.name;
    }

    public String getPullSdkParams() {
        Map<String, String> map = this.pullSdkParams;
        if (map != null) {
            return map.get("ORIGIN");
        }
        return null;
    }

    public String getRtmpPushUrl() {
        if (ip.a(this.ngbRTMPUrl)) {
            return this.rtmp_push_url;
        }
        return this.ngbRTMPUrl;
    }

    /* access modifiers changed from: package-private */
    public boolean isPullUrlValid() {
        validatePullUrl();
        if (!this.qualityMap.isEmpty()) {
            return true;
        }
        return false;
    }

    public String getMultiStreamData() {
        LiveCoreSDKData liveCoreSDKData2 = this.liveCoreSDKData;
        if (liveCoreSDKData2 == null || liveCoreSDKData2.getPullData() == null) {
            return null;
        }
        return this.liveCoreSDKData.getPullData().getStreamData();
    }

    public String getMultiStreamDefaultPreviewQualitySdkKey() {
        LiveCoreSDKData liveCoreSDKData2 = this.liveCoreSDKData;
        if (liveCoreSDKData2 == null || liveCoreSDKData2.getDefaultPreviewQuality() == null) {
            return null;
        }
        return this.liveCoreSDKData.getDefaultPreviewQuality().sdkKey;
    }

    public String getMultiStreamDefaultQualitySdkKey() {
        LiveCoreSDKData liveCoreSDKData2 = this.liveCoreSDKData;
        if (liveCoreSDKData2 == null || liveCoreSDKData2.getDefaultQuality() == null) {
            return null;
        }
        return this.liveCoreSDKData.getDefaultQuality().sdkKey;
    }

    /* access modifiers changed from: package-private */
    public boolean isMultiPullDataValid() {
        if (this.liveCoreSDKData == null) {
            return false;
        }
        validateMultiPullData();
        if (!this.qualityList.isEmpty()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void validateMultiPullData() {
        this.multiDefaultQuality = null;
        this.multiLowestQuality = null;
        this.qualityList.clear();
        LiveCoreSDKData liveCoreSDKData2 = this.liveCoreSDKData;
        if (liveCoreSDKData2 != null) {
            if (!ip.a(liveCoreSDKData2.getQualityList())) {
                for (LiveCoreSDKData.Quality quality : this.liveCoreSDKData.getQualityList()) {
                    this.qualityList.add(quality);
                    if (this.multiLowestQuality == null) {
                        this.multiLowestQuality = quality;
                    }
                }
            }
            this.multiDefaultQuality = this.liveCoreSDKData.getDefaultQuality();
            if (this.qualityList.isEmpty()) {
                LiveCoreSDKData.Quality quality2 = this.multiDefaultQuality;
                this.multiLowestQuality = quality2;
                this.qualityList.add(quality2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void validatePullUrl() {
        String str;
        String str2;
        this.qualityMap.clear();
        this.sdkParamsMap.clear();
        this.defaultQualityName = null;
        this.lowestQualityName = null;
        ArrayList<String> arrayList = this.candidateResolution;
        if (!(arrayList == null || this.resolutionName == null || this.flvPullUrl == null)) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                String str3 = this.resolutionName.get(next);
                if (!(str3 == null || (str = this.flvPullUrl.get(next)) == null)) {
                    Map<String, String> map = this.pullSdkParams;
                    if (map == null) {
                        str2 = null;
                    } else {
                        str2 = map.get(next);
                    }
                    this.qualityMap.put(str3, str);
                    this.sdkParamsMap.put(str3, str2);
                    if (next.equals(this.defaultResolution)) {
                        this.defaultQualityName = str3;
                    } else if (this.defaultQualityName == null) {
                        this.defaultQualityName = str3;
                    }
                    if (this.lowestQualityName == null) {
                        this.lowestQualityName = str3;
                    }
                }
            }
        }
        if (this.qualityMap.isEmpty() && !TextUtils.isEmpty(this.rtmp_pull_url)) {
            this.defaultQualityName = "default";
            this.lowestQualityName = "default";
            this.qualityMap.put("default", this.rtmp_pull_url);
            this.sdkParamsMap.put(this.defaultQualityName, this.defaultPullSdkParams);
        }
    }

    public String toString() {
        return "LiveStreamUrl{id=" + this.id + ", idStr='" + this.idStr + '\'' + ", provider=" + this.provider + ", rtmpPushUrl='" + this.rtmp_push_url + '\'' + ", pushUrlList=" + this.pushUrlList + ", rtmp_pull_url='" + this.rtmp_pull_url + '\'' + ", flvPullUrl=" + this.flvPullUrl + ", resolutionName=" + this.resolutionName + ", pullSdkParams=" + this.pullSdkParams + ", candidateResolution=" + this.candidateResolution + ", defaultResolution='" + this.defaultResolution + '\'' + ", extra=" + this.extra + ", defaultPullSdkParams='" + this.defaultPullSdkParams + '\'' + ", pushSdkParams='" + this.pushSdkParams + '\'' + ", liveCoreSDKData=" + this.liveCoreSDKData + ", ngbRTMPUrl='" + this.ngbRTMPUrl + '\'' + ", bindNodeRtmpUrl='" + this.bindNodeRtmpUrl + '\'' + ", qualityMap=" + this.qualityMap + ", sdkParamsMap=" + this.sdkParamsMap + ", qualityList=" + this.qualityList + ", defaultQualityName='" + this.defaultQualityName + '\'' + ", lowestQualityName='" + this.lowestQualityName + '\'' + ", multiDefaultQuality=" + this.multiDefaultQuality + ", multiLowestQuality=" + this.multiLowestQuality + '}';
    }

    public void setBindNodeRtmpUrl(String str) {
        this.bindNodeRtmpUrl = str;
    }

    public void setCandidateResolution(ArrayList<String> arrayList) {
        this.candidateResolution = arrayList;
    }

    public void setDefaultResolution(String str) {
        this.defaultResolution = str;
    }

    public void setExtra(LiveStreamUrlExtra liveStreamUrlExtra) {
        this.extra = liveStreamUrlExtra;
    }

    public void setFlvPullUrl(HashMap<String, String> hashMap) {
        this.flvPullUrl = hashMap;
    }

    public void setId(long j2) {
        this.id = j2;
    }

    public void setIdStr(String str) {
        this.idStr = str;
    }

    @c(a = "live_core_sdk_data")
    public void setLiveCoreSDKData(LiveCoreSDKData liveCoreSDKData2) {
        this.liveCoreSDKData = liveCoreSDKData2;
    }

    public void setNgbRTMPUrl(String str) {
        this.ngbRTMPUrl = str;
    }

    public void setProvider(int i2) {
        this.provider = i2;
    }

    @c(a = "rtmp_push_url_params")
    public void setPushSdkParams(String str) {
        this.pushSdkParams = str;
    }

    @c(a = "push_urls")
    public void setPushUrlList(List<String> list) {
        this.pushUrlList = list;
    }

    public void setResolutionName(Map<String, String> map) {
        this.resolutionName = map;
    }

    public void setRtmpPullUrl(String str) {
        this.rtmp_pull_url = str;
    }

    public void setRtmpPushUrl(String str) {
        this.rtmp_push_url = str;
    }
}
