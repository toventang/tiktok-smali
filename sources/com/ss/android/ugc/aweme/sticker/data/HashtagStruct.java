package com.ss.android.ugc.aweme.sticker.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class HashtagStruct implements Serializable {
    @c(a = "hashtag_id")
    public String hashtagId = "";
    @c(a = "hashtag_name")
    public String hashtagName = "";
    @c(a = "status")
    public int status;
    @c(a = "sticker_id")
    public String stickerId = "";

    static {
        Covode.recordClassIndex(88099);
    }

    public String getHashtagId() {
        return this.hashtagId;
    }

    public String getHashtagName() {
        return this.hashtagName;
    }

    public int getStatus() {
        return this.status;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public HashtagStruct() {
    }

    public void setHashtagId(String str) {
        this.hashtagId = str;
    }

    public void setHashtagName(String str) {
        this.hashtagName = str;
    }

    public void setStatus(int i2) {
        this.status = i2;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }

    public HashtagStruct(String str, String str2) {
        this.hashtagId = str;
        this.hashtagName = str2;
    }
}
