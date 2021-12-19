package com.ss.android.ugc.aweme.mix.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.model.d;
import java.io.Serializable;

public final class a implements Serializable {
    private String enterGroupId = "";
    private String mAid;
    private Aweme mAweme;
    private boolean mEnterCleanMode;
    private String mEventType;
    private boolean mNeedShowDialog = true;
    private String mSecUid;
    private String mUsrId;
    private String mVideoFrom;
    private String mixId;
    private d mixInfo;
    private long pageStartTime = -1;
    private String previousPage;
    private b searchParam;
    private Float videoPlayedPercentage;

    static {
        Covode.recordClassIndex(70425);
    }

    public final String getEnterGroupId() {
        return this.enterGroupId;
    }

    public final String getMAid() {
        return this.mAid;
    }

    public final Aweme getMAweme() {
        return this.mAweme;
    }

    public final boolean getMEnterCleanMode() {
        return this.mEnterCleanMode;
    }

    public final String getMEventType() {
        return this.mEventType;
    }

    public final boolean getMNeedShowDialog() {
        return this.mNeedShowDialog;
    }

    public final String getMSecUid() {
        return this.mSecUid;
    }

    public final String getMUsrId() {
        return this.mUsrId;
    }

    public final String getMVideoFrom() {
        return this.mVideoFrom;
    }

    public final String getMixId() {
        return this.mixId;
    }

    public final d getMixInfo() {
        return this.mixInfo;
    }

    public final long getPageStartTime() {
        return this.pageStartTime;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final b getSearchParam() {
        return this.searchParam;
    }

    public final Float getVideoPlayedPercentage() {
        return this.videoPlayedPercentage;
    }

    public final void setEnterGroupId(String str) {
        this.enterGroupId = str;
    }

    public final void setMAid(String str) {
        this.mAid = str;
    }

    public final void setMAweme(Aweme aweme) {
        this.mAweme = aweme;
    }

    public final void setMEnterCleanMode(boolean z) {
        this.mEnterCleanMode = z;
    }

    public final void setMEventType(String str) {
        this.mEventType = str;
    }

    public final void setMNeedShowDialog(boolean z) {
        this.mNeedShowDialog = z;
    }

    public final void setMSecUid(String str) {
        this.mSecUid = str;
    }

    public final void setMUsrId(String str) {
        this.mUsrId = str;
    }

    public final void setMVideoFrom(String str) {
        this.mVideoFrom = str;
    }

    public final void setMixId(String str) {
        this.mixId = str;
    }

    public final void setMixInfo(d dVar) {
        this.mixInfo = dVar;
    }

    public final void setPageStartTime(long j2) {
        this.pageStartTime = j2;
    }

    public final void setPreviousPage(String str) {
        this.previousPage = str;
    }

    public final void setSearchParam(b bVar) {
        this.searchParam = bVar;
    }

    public final void setVideoPlayedPercentage(Float f2) {
        this.videoPlayedPercentage = f2;
    }
}
