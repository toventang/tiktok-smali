package com.bytedance.im.core.d;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public class az implements Serializable {
    private String basicExtInfo;
    private String senderNickName;
    private String senderPortrait;

    static {
        Covode.recordClassIndex(22726);
    }

    public String getBasicExtInfo() {
        return this.basicExtInfo;
    }

    public String getSenderNickName() {
        return this.senderNickName;
    }

    public String getSenderPortrait() {
        return this.senderPortrait;
    }

    public az(String str, String str2, String str3) {
        this.senderPortrait = str;
        this.senderNickName = str2;
        this.basicExtInfo = str3;
    }
}
