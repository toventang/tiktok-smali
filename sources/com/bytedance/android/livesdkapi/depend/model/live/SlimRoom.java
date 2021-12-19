package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.MaskLayer;
import com.bytedance.android.livesdk.model.WarningTag;
import com.bytedance.android.livesdk.model.utils.b;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class SlimRoom {
    @c(a = "client_version")
    String clientVersion;
    @c(a = "id")
    long id;
    @c(a = "live_type_screenshot")
    public boolean isScreenshot;
    @c(a = "live_type_third_party")
    public boolean isThirdParty;
    @c(a = "common_label_list")
    String labels;
    @c(a = "layout")
    public long layout;
    @c(a = "link_mic")
    a linkMic;
    @c(a = "live_type_audio")
    boolean liveTypeAudio;
    @c(a = "mask_layer")
    public MaskLayer maskLayer;
    @c(a = "orientation")
    int orientation;
    @c(a = "owner_user_id")
    long ownerUserId;
    @c(a = "os_type")
    int platform;
    @c(a = "private_info")
    String privateInfo;
    @c(a = "stream_url")
    StreamUrl streamUrl;
    @c(a = "warning_tag")
    public WarningTag warningTag;

    public static class a {
        @c(a = "show_user_list")

        /* renamed from: a  reason: collision with root package name */
        public List<User> f23031a;
        @c(a = "audience_id_list")

        /* renamed from: b  reason: collision with root package name */
        public List<Long> f23032b;
        @c(a = "followed_count")

        /* renamed from: c  reason: collision with root package name */
        public int f23033c;

        static {
            Covode.recordClassIndex(13659);
        }
    }

    static {
        Covode.recordClassIndex(13658);
    }

    public String getClientVersion() {
        return this.clientVersion;
    }

    public long getId() {
        return this.id;
    }

    public String getLabels() {
        return this.labels;
    }

    public long getLayout() {
        return this.layout;
    }

    public a getLinkMic() {
        return this.linkMic;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public long getOwnerUserId() {
        return this.ownerUserId;
    }

    public int getPlatform() {
        return this.platform;
    }

    public String getPrivateInfo() {
        return this.privateInfo;
    }

    public StreamUrl getStreamUrl() {
        return this.streamUrl;
    }

    public boolean isLiveTypeScreenshot() {
        return this.isScreenshot;
    }

    public String buildPullUrl() {
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 == null) {
            return null;
        }
        return buildPullUrl(streamUrl2.r);
    }

    public String getSdkParams() {
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 == null) {
            return null;
        }
        return getSdkParams(streamUrl2.r);
    }

    public s getStreamUrlExtra() {
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 == null) {
            return null;
        }
        return streamUrl2.f23045l;
    }

    public s getStreamUrlExtraSafely() {
        s streamUrlExtra = getStreamUrlExtra();
        if (streamUrlExtra == null) {
            return new s();
        }
        return streamUrlExtra;
    }

    public String getMultiStreamDefaultQualitySdkKey() {
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 == null || streamUrl2.o == null || this.streamUrl.o.getDefaultQuality() == null) {
            return null;
        }
        return this.streamUrl.o.getDefaultQuality().sdkKey;
    }

    public void init() {
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 != null) {
            streamUrl2.b();
            if (this.streamUrl.o != null) {
                this.streamUrl.c();
            }
        }
    }

    public String getMultiStreamData() {
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 == null || streamUrl2.o == null || this.streamUrl.o.getPullData() == null) {
            return null;
        }
        return this.streamUrl.o.getPullData().getStreamData();
    }

    public i getStreamType() {
        if (this.layout == 1) {
            return i.OFFICIAL_ACTIVITY;
        }
        if (this.isScreenshot) {
            return i.SCREEN_RECORD;
        }
        if (this.isThirdParty) {
            return i.THIRD_PARTY;
        }
        if (this.liveTypeAudio) {
            return i.AUDIO;
        }
        return i.VIDEO;
    }

    public void setClientVersion(String str) {
        this.clientVersion = str;
    }

    public void setId(long j2) {
        this.id = j2;
    }

    public void setLabels(String str) {
        this.labels = str;
    }

    public void setLayout(long j2) {
        this.layout = j2;
    }

    public void setLinkMic(a aVar) {
        this.linkMic = aVar;
    }

    public void setLiveTypeScreenshot(boolean z) {
        this.isScreenshot = z;
    }

    public void setOrientation(int i2) {
        this.orientation = i2;
    }

    public void setOwnerUserId(long j2) {
        this.ownerUserId = j2;
    }

    public void setPlatform(int i2) {
        this.platform = i2;
    }

    public void setPrivateInfo(String str) {
        this.privateInfo = str;
    }

    public void setStreamUrl(StreamUrl streamUrl2) {
        this.streamUrl = streamUrl2;
    }

    public String getSdkParams(String str) {
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 == null) {
            return null;
        }
        return streamUrl2.sdkParamsMap.get(str);
    }

    public String buildPullUrl(String str) {
        String str2;
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 == null || (str2 = streamUrl2.qualityMap.get(str)) == null) {
            return null;
        }
        b bVar = new b(str2);
        bVar.a("anchor_device_platform", this.platform);
        bVar.a("anchor_version", this.clientVersion);
        bVar.a("room_id", this.id);
        bVar.a("anchor_id", this.ownerUserId);
        return bVar.a();
    }
}
