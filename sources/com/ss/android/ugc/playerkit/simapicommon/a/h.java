package com.ss.android.ugc.playerkit.simapicommon.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class h implements Serializable {
    @c(a = "bit_rate")
    List<e> bitRate;
    @c(a = "cdn_url_expired")
    public long cdnUrlExpired;
    @c(a = "cla_info")
    b claInfo;
    boolean coldBoot;
    @c(a = "video_model")
    String dVideoModel;
    @c(a = "token_auth")
    f drmTokenAuth;
    @c(a = "is_drm_source")
    boolean enableIntertrustDrm;
    @c(a = "play_addr_h264")
    i h264PlayAddr;
    @c(a = "height")
    int height;
    @c(a = "is_bytevc1")
    public Integer isBytevc1;
    @c(a = "is_long_video")
    public Integer isLongVideo;
    @c(a = "meta")
    String meta;
    @c(a = "need_set_token")
    boolean needSetCookie;
    public Object origin;
    i playAddr;
    i playAddrBytevc1;
    @c(a = "play_addr_lowbr")
    public g playAddrLowbr;
    @c(a = "ratio")
    String ratio;
    private String sourceId;
    @c(a = "duration")
    int videoLength;
    @c(a = "big_thumbs")
    List<l> videoThumbs;
    @c(a = "width")
    int width;

    static {
        Covode.recordClassIndex(98035);
    }

    public boolean isLowBr() {
        return false;
    }

    public boolean enableIntertrustDrm() {
        return this.enableIntertrustDrm;
    }

    public List<e> getBitRate() {
        return this.bitRate;
    }

    public b getClaInfo() {
        return this.claInfo;
    }

    public f getDrmTokenAuth() {
        return this.drmTokenAuth;
    }

    public int getDuration() {
        return this.videoLength;
    }

    public i getH264PlayAddr() {
        return this.h264PlayAddr;
    }

    public int getHeight() {
        return this.height;
    }

    public Integer getIsBytevc1() {
        return this.isBytevc1;
    }

    public String getMeta() {
        return this.meta;
    }

    public String getRatio() {
        return this.ratio;
    }

    public String getSourceId() {
        return this.sourceId;
    }

    public int getVideoLength() {
        return this.videoLength;
    }

    public String getVideoModelStr() {
        return this.dVideoModel;
    }

    public List<l> getVideoThumbs() {
        return this.videoThumbs;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isColdBoot() {
        return this.coldBoot;
    }

    public boolean isNeedSetCookie() {
        return this.needSetCookie;
    }

    public i getProperPlayAddr() {
        return getPlayAddr();
    }

    public int getVidPlayVersion() {
        f fVar = this.drmTokenAuth;
        if (fVar != null) {
            return fVar.getVersion();
        }
        return 1;
    }

    public String getVideoId() {
        f fVar = this.drmTokenAuth;
        if (fVar != null) {
            return fVar.getVid();
        }
        return null;
    }

    public String getVideoIdApiHost() {
        f fVar = this.drmTokenAuth;
        if (fVar != null) {
            return fVar.tryGetHost();
        }
        return null;
    }

    public String getVideoIdAuth() {
        f fVar = this.drmTokenAuth;
        if (fVar != null) {
            return fVar.getAuth();
        }
        return null;
    }

    public String getVideoIdPToken() {
        f fVar = this.drmTokenAuth;
        if (fVar != null) {
            return fVar.getToken();
        }
        return null;
    }

    public i getPlayAddrBytevc1() {
        a();
        i iVar = this.playAddrBytevc1;
        if (iVar != null) {
            iVar.setBytevc1(true);
            this.playAddrBytevc1.setRatio(this.ratio);
        }
        return this.playAddrBytevc1;
    }

    public i getPlayAddrH264() {
        a();
        i iVar = this.playAddr;
        if (iVar != null) {
            iVar.setBytevc1(false);
            this.playAddr.setRatio(this.ratio);
        }
        return this.playAddr;
    }

    private void a() {
        List<e> list;
        List<e> list2;
        i iVar = this.playAddrBytevc1;
        if (!(iVar == null || iVar.getBitRate() == (list2 = this.bitRate))) {
            this.playAddrBytevc1.setBitRate(list2);
            this.playAddrBytevc1.setDuration((double) this.videoLength);
            this.playAddrBytevc1.setBytevc1(true);
        }
        i iVar2 = this.playAddr;
        if (iVar2 != null && iVar2.getBitRate() != (list = this.bitRate)) {
            this.playAddr.setBitRate(list);
            this.playAddr.setDuration((double) this.videoLength);
            this.playAddr.setBytevc1(false);
        }
    }

    public i getPlayAddr() {
        a();
        i iVar = this.playAddrBytevc1;
        if (iVar != null) {
            iVar.setBytevc1(true);
            this.playAddrBytevc1.setRatio(this.ratio);
        }
        i iVar2 = this.playAddr;
        if (iVar2 != null) {
            iVar2.setBytevc1(false);
            this.playAddr.setRatio(this.ratio);
        }
        if (checkVideo(this.playAddrBytevc1)) {
            return this.playAddrBytevc1;
        }
        return this.playAddr;
    }

    public String toString() {
        return "SimVideo{playAddr=" + this.playAddr + ", playAddrBytevc1=" + this.playAddrBytevc1 + ", height=" + this.height + ", width=" + this.width + ", ratio='" + this.ratio + '\'' + ", downloadAddr=, hasWaterMark=, videoLength=" + this.videoLength + ", bitRate=" + this.bitRate + ", newDownloadAddr=, suffixLogoAddr=, hasSuffixWaterMark=, needSetCookie=" + this.needSetCookie + ", misc_download_addrs=, isCallback=}";
    }

    public void setBitRate(List<e> list) {
        this.bitRate = list;
    }

    public void setClaInfo(b bVar) {
        this.claInfo = bVar;
    }

    public void setColdBoot(boolean z) {
        this.coldBoot = z;
    }

    public void setDrmTokenAuth(f fVar) {
        this.drmTokenAuth = fVar;
    }

    public void setDuration(double d2) {
        this.videoLength = (int) d2;
    }

    public void setEnableIntertrustDrm(boolean z) {
        this.enableIntertrustDrm = z;
    }

    public void setHeight(int i2) {
        this.height = i2;
    }

    public void setIsBytevc1(Integer num) {
        this.isBytevc1 = num;
    }

    public void setMeta(String str) {
        this.meta = str;
    }

    public void setNeedSetCookie(boolean z) {
        this.needSetCookie = z;
    }

    public void setPlayAddr(i iVar) {
        this.playAddr = iVar;
    }

    public void setPlayAddrBytevc1(i iVar) {
        this.playAddrBytevc1 = iVar;
    }

    public void setPlayAddrH264(i iVar) {
        this.h264PlayAddr = iVar;
    }

    public void setRatio(String str) {
        this.ratio = str;
    }

    public void setSourceId(String str) {
        setRationAndSourceId(str);
    }

    public void setVideoLength(int i2) {
        this.videoLength = i2;
    }

    public void setVideoModelStr(String str) {
        this.dVideoModel = str;
    }

    public void setVideoThumbs(List<l> list) {
        this.videoThumbs = list;
    }

    public void setWidth(int i2) {
        this.width = i2;
    }

    public void setRationAndSourceId(String str) {
        i iVar = this.playAddrBytevc1;
        if (iVar != null) {
            iVar.setRatio(this.ratio).setSourceId(str);
            this.playAddrBytevc1.setBytevc1(true);
        }
        i iVar2 = this.playAddr;
        if (iVar2 != null) {
            iVar2.setRatio(this.ratio).setSourceId(str);
            this.playAddr.setBytevc1(false);
        }
        this.sourceId = str;
    }

    public boolean checkVideo(g gVar) {
        List<String> urlList;
        if (!(gVar == null || (urlList = gVar.getUrlList()) == null || urlList.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            for (String str : urlList) {
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                }
            }
            gVar.setUrlList(arrayList);
            if (urlList.isEmpty() || TextUtils.isEmpty(gVar.getUri())) {
                return false;
            }
            return true;
        }
        return false;
    }
}
