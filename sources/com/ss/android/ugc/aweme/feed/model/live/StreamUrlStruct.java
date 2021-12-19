package com.ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class StreamUrlStruct implements Serializable {
    @c(a = "live_core_sdk_data")
    public LiveCoreSDKData liveCoreSDKData;
    public LiveStreamUrlExtra liveStreamUrlExtra;
    @c(a = "candidate_resolution")
    public ArrayList<String> mCandidateResolutionList;
    @c(a = "default_resolution")
    public String mDefaultResolution;
    @c(a = "flv_pull_url")
    public HashMap<String, String> mFlvPullUrlMap;
    @c(a = "provider")
    public int provider;
    @c(a = "rtmp_pull_url")
    public String rtmp_pull_url;
    @c(a = "rtmp_push_url")
    public String rtmp_push_url;
    public String sdkParams = "";
    @c(a = "sid")
    public long sid;

    static {
        Covode.recordClassIndex(59514);
    }

    public String toString() {
        return "StreamUrlStruct{sid=" + this.sid + ", rtmp_pull_url='" + this.rtmp_pull_url + '\'' + ", rtmp_push_url='" + this.rtmp_push_url + '\'' + ", provider=" + this.provider + ", mFlvPullUrlMap=" + this.mFlvPullUrlMap + ", mCandidateResolutionList=" + this.mCandidateResolutionList + ", mDefaultResolution='" + this.mDefaultResolution + '\'' + ", liveCoreSDKData=" + this.liveCoreSDKData + ", liveStreamUrlExtra=" + this.liveStreamUrlExtra + '}';
    }
}
