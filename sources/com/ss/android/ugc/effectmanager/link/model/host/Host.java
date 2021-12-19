package com.ss.android.ugc.effectmanager.link.model.host;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.net.URI;

public class Host {
    public String host;
    private String path;
    public int port = -1;
    public String schema;
    public long sortTime;
    public long weightTime;

    static {
        Covode.recordClassIndex(95589);
    }

    public long getSortTime() {
        return this.sortTime + this.weightTime;
    }

    public String toString() {
        return "Host{weightTime=" + this.weightTime + ", schema='" + this.schema + '\'' + ", host='" + this.host + '\'' + '}';
    }

    public String getItemName() {
        String str = this.schema + "://" + this.host;
        if (this.port != -1) {
            str = str + ":" + this.port;
        }
        if (!TextUtils.isEmpty(this.path)) {
            return str + this.path;
        }
        return str;
    }

    public boolean hostEquals(Host host2) {
        if (host2 != null && host2.host.equals(this.host) && host2.schema.equals(this.schema)) {
            return true;
        }
        return false;
    }

    public Host(String str) {
        URI create = URI.create(str);
        this.host = create.getHost();
        this.schema = create.getScheme();
        this.port = create.getPort();
        this.path = create.getPath();
    }

    public Host(URI uri) {
        this.host = uri.getHost();
        this.schema = uri.getScheme();
        this.path = uri.getPath();
    }

    public Host(String str, String str2) {
        this.host = str;
        this.schema = str2;
    }

    public Host(String str, String str2, long j2) {
        this.host = str;
        this.schema = str2;
        this.weightTime = j2;
    }
}
