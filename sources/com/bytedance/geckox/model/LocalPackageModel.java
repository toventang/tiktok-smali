package com.bytedance.geckox.model;

import com.bytedance.covode.number.Covode;

public class LocalPackageModel {
    private String accessKey;
    private String channel;
    private String channelPath;
    private long latestVersion;

    static {
        Covode.recordClassIndex(17375);
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getChannelPath() {
        return this.channelPath;
    }

    public long getLatestVersion() {
        return this.latestVersion;
    }

    public void setAccessKey(String str) {
        this.accessKey = str;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setChannelPath(String str) {
        this.channelPath = str;
    }

    public void setLatestVersion(long j2) {
        this.latestVersion = j2;
    }

    public LocalPackageModel(String str, String str2) {
        this.accessKey = str;
        this.channel = str2;
    }
}
