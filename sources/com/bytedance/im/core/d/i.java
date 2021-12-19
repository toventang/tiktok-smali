package com.bytedance.im.core.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.internal.utils.h;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class i implements Serializable {
    private String conversationId;
    private String desc;
    private Map<String, String> ext;
    private String icon;
    private int mode;
    private String name;
    private String notice;
    private long owner;
    private String secOwner;
    private int silent;
    private int silentNormalOnly;
    private long version;

    static {
        Covode.recordClassIndex(22764);
    }

    public String getConversationId() {
        return this.conversationId;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getIcon() {
        return this.icon;
    }

    public int getMode() {
        return this.mode;
    }

    public String getName() {
        return this.name;
    }

    public String getNotice() {
        return this.notice;
    }

    public long getOwner() {
        return this.owner;
    }

    public String getSecOwner() {
        return this.secOwner;
    }

    public int getSilent() {
        return this.silent;
    }

    public int getSilentNormalOnly() {
        return this.silentNormalOnly;
    }

    public long getVersion() {
        return this.version;
    }

    public String getExtStr() {
        return h.a(this.ext);
    }

    public synchronized Map<String, String> getExt() {
        Map<String, String> map;
        MethodCollector.i(1952);
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        map = this.ext;
        MethodCollector.o(1952);
        return map;
    }

    public void setConversationId(String str) {
        this.conversationId = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setExt(Map<String, String> map) {
        this.ext = map;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setMode(int i2) {
        this.mode = i2;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNotice(String str) {
        this.notice = str;
    }

    public void setOwner(long j2) {
        this.owner = j2;
    }

    public void setSecOwner(String str) {
        this.secOwner = str;
    }

    public void setSilent(int i2) {
        this.silent = i2;
    }

    public void setSilentNormalOnly(int i2) {
        this.silentNormalOnly = i2;
    }

    public void setVersion(long j2) {
        this.version = j2;
    }

    public void setExtStr(String str) {
        this.ext = h.a(str);
    }
}
