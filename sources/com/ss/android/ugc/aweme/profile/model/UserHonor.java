package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class UserHonor implements Serializable {
    @c(a = "now_diamond")
    private long currentDiamond;
    @c(a = "icon")
    private UrlModel currentHonorIcon;
    @c(a = StringSet.name)
    private String currentHonorName;
    @c(a = "diamond_icon")
    private UrlModel diamondIcon;
    @c(a = "im_icon")
    private UrlModel imIcon;
    @c(a = "level")
    private int level;
    @c(a = "live_icon")
    private UrlModel liveIcon;
    @c(a = "next_diamond")
    private long nextDiamond;
    @c(a = "next_icon")
    private UrlModel nextHonorIcon;
    @c(a = "next_name")
    private String nextHonorName;
    @c(a = "total_diamond_count")
    private long totalDiamond;

    static {
        Covode.recordClassIndex(75282);
    }

    public long getCurrentDiamond() {
        return this.currentDiamond;
    }

    public UrlModel getCurrentHonorIcon() {
        return this.currentHonorIcon;
    }

    public String getCurrentHonorName() {
        return this.currentHonorName;
    }

    public UrlModel getDiamondIcon() {
        return this.diamondIcon;
    }

    public UrlModel getImIcon() {
        return this.imIcon;
    }

    public int getLevel() {
        return this.level;
    }

    public UrlModel getLiveIcon() {
        return this.liveIcon;
    }

    public long getNextDiamond() {
        return this.nextDiamond;
    }

    public UrlModel getNextHonorIcon() {
        return this.nextHonorIcon;
    }

    public String getNextHonorName() {
        return this.nextHonorName;
    }

    public long getTotalDiamond() {
        return this.totalDiamond;
    }

    public void setCurrentDiamond(long j2) {
        this.currentDiamond = j2;
    }

    public void setCurrentHonorIcon(UrlModel urlModel) {
        this.currentHonorIcon = urlModel;
    }

    public void setCurrentHonorName(String str) {
        this.currentHonorName = str;
    }

    public void setDiamondIcon(UrlModel urlModel) {
        this.diamondIcon = urlModel;
    }

    public void setImIcon(UrlModel urlModel) {
        this.imIcon = urlModel;
    }

    public void setLevel(int i2) {
        this.level = i2;
    }

    public void setLiveIcon(UrlModel urlModel) {
        this.liveIcon = urlModel;
    }

    public void setNextDiamond(long j2) {
        this.nextDiamond = j2;
    }

    public void setNextHonorIcon(UrlModel urlModel) {
        this.nextHonorIcon = urlModel;
    }

    public void setNextHonorName(String str) {
        this.nextHonorName = str;
    }

    public void setTotalDiamond(long j2) {
        this.totalDiamond = j2;
    }
}
