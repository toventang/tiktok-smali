package com.ss.android.ugc.playerkit.simapicommon.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;
import java.util.List;

public class f implements Serializable {
    @c(a = "auth")
    String auth;
    private int hostIndex;
    @c(a = "hosts")
    List<String> hosts;
    public Object origin;
    @c(a = "token")
    String token;
    @c(a = "version")
    Integer version;
    @c(a = "vid")
    String vid;

    static {
        Covode.recordClassIndex(98033);
    }

    public void resetHostIndex() {
        this.hostIndex = 0;
    }

    public String getAuth() {
        return this.auth;
    }

    public int getHostIndex() {
        return this.hostIndex;
    }

    public List<String> getHosts() {
        return this.hosts;
    }

    public String getToken() {
        return this.token;
    }

    public String getVid() {
        return this.vid;
    }

    public int getVersion() {
        Integer num = this.version;
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    public String tryGetHost() {
        List<String> list = this.hosts;
        if (list == null || this.hostIndex >= list.size()) {
            return null;
        }
        return this.hosts.get(this.hostIndex);
    }

    public boolean tryUseNextHost() {
        List<String> list = this.hosts;
        if (list == null || this.hostIndex >= list.size() - 1) {
            return false;
        }
        this.hostIndex++;
        return true;
    }

    public void setAuth(String str) {
        this.auth = str;
    }

    public void setHostIndex(int i2) {
        this.hostIndex = i2;
    }

    public void setHosts(List<String> list) {
        this.hosts = list;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setVid(String str) {
        this.vid = str;
    }

    public void setVersion(int i2) {
        this.version = Integer.valueOf(i2);
    }
}
