package com.bytedance.im.core.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.internal.utils.h;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class l implements Serializable {
    private String conversationId;
    private Map<String, String> ext;
    private int favor;
    private int mute;
    private int stickTop;
    private long version;

    static {
        Covode.recordClassIndex(22788);
    }

    public String getConversationId() {
        return this.conversationId;
    }

    public int getFavor() {
        return this.favor;
    }

    public int getMute() {
        return this.mute;
    }

    public int getStickTop() {
        return this.stickTop;
    }

    public long getVersion() {
        return this.version;
    }

    public String getExtStr() {
        return h.a(this.ext);
    }

    public boolean isFavor() {
        if (this.favor == 1) {
            return true;
        }
        return false;
    }

    public boolean isMute() {
        if (this.mute == 1) {
            return true;
        }
        return false;
    }

    public boolean isStickTop() {
        if (this.stickTop == 1) {
            return true;
        }
        return false;
    }

    public synchronized Map<String, String> getExt() {
        Map<String, String> map;
        MethodCollector.i(1963);
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        map = this.ext;
        MethodCollector.o(1963);
        return map;
    }

    public void setConversationId(String str) {
        this.conversationId = str;
    }

    public void setExt(Map<String, String> map) {
        this.ext = map;
    }

    public void setFavor(int i2) {
        this.favor = i2;
    }

    public void setMute(int i2) {
        this.mute = i2;
    }

    public void setStickTop(int i2) {
        this.stickTop = i2;
    }

    public void setVersion(long j2) {
        this.version = j2;
    }

    public void setExtStr(String str) {
        this.ext = h.a(str);
    }
}
