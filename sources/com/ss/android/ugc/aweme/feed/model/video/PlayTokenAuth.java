package com.ss.android.ugc.aweme.feed.model.video;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class PlayTokenAuth implements Serializable {
    @c(a = "auth")
    public String auth;
    public int hostIndex;
    @c(a = "hosts")
    public List<String> hosts;
    @c(a = "token")
    public String token;
    @c(a = "version")
    public Integer version;
    @c(a = "vid")
    public String vid;

    static {
        Covode.recordClassIndex(59543);
    }

    public final void resetHostIndex() {
        this.hostIndex = 0;
    }

    public final String getAuth() {
        return this.auth;
    }

    public final int getHostIndex() {
        return this.hostIndex;
    }

    public final List<String> getHosts() {
        return this.hosts;
    }

    public final String getToken() {
        return this.token;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public final String getVid() {
        return this.vid;
    }

    public final int getVersionN() {
        Integer num = this.version;
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    public final String tryGetHost() {
        List<String> list = this.hosts;
        if (list == null || this.hostIndex >= list.size()) {
            return null;
        }
        List<String> list2 = this.hosts;
        if (list2 == null) {
            l.b();
        }
        return list2.get(this.hostIndex);
    }

    public final boolean tryUseNextHost() {
        List<String> list = this.hosts;
        if (list == null || this.hostIndex >= list.size() - 1) {
            return false;
        }
        this.hostIndex++;
        return true;
    }

    public final void setAuth(String str) {
        this.auth = str;
    }

    public final void setHostIndex(int i2) {
        this.hostIndex = i2;
    }

    public final void setHosts(List<String> list) {
        this.hosts = list;
    }

    public final void setToken(String str) {
        this.token = str;
    }

    public final void setVersion(Integer num) {
        this.version = num;
    }

    public final void setVid(String str) {
        this.vid = str;
    }

    public final void setVersionN(int i2) {
        this.version = Integer.valueOf(i2);
    }
}
