package com.ss.android.ugc.aweme.publish.f;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.a;
import com.ss.android.ugc.aweme.base.api.b;

public final class g extends a {
    @c(a = "captionAppKey")
    public String A;
    @c(a = "captionAuthorization")
    public String B;
    @c(a = "userStoreRegion")
    public String C;
    @c(a = "aiCutAuthorization")
    public String D;
    @c(a = "aiCutAppKey")
    public String E;
    @c(a = "authorization2")
    public c F;
    @c(a = "captionAuthorization2")
    public c G;
    @c(a = "testSpeedAuthorization2")
    public c H;
    @c(a = "upload_main_network_type")
    public int I;
    @c(a = "upload_backup_network_type")
    public int J;
    @b
    @c(a = "appKey")

    /* renamed from: a  reason: collision with root package name */
    public String f118750a;
    @b
    @c(a = "fileHostName")

    /* renamed from: b  reason: collision with root package name */
    public String f118751b;
    @b
    @c(a = "videoHostName")

    /* renamed from: c  reason: collision with root package name */
    public String f118752c;
    @c(a = "sliceTimeout")

    /* renamed from: d  reason: collision with root package name */
    public int f118753d;
    @c(a = "sliceRetryCount")

    /* renamed from: e  reason: collision with root package name */
    public int f118754e;
    @c(a = "sliceSize")

    /* renamed from: f  reason: collision with root package name */
    public int f118755f;
    @c(a = "fileRetryCount")

    /* renamed from: g  reason: collision with root package name */
    public int f118756g = 1;
    @c(a = "maxFailTime")

    /* renamed from: h  reason: collision with root package name */
    public int f118757h;
    @b
    @c(a = "authorization")

    /* renamed from: i  reason: collision with root package name */
    public String f118758i;
    @c(a = "enableHttps")

    /* renamed from: j  reason: collision with root package name */
    public int f118759j;
    @c(a = "enableExternDNS")

    /* renamed from: k  reason: collision with root package name */
    public int f118760k;
    @c(a = "aliveMaxFailTime")

    /* renamed from: l  reason: collision with root package name */
    public int f118761l = 6;
    @c(a = "enableTTNetDNS")

    /* renamed from: m  reason: collision with root package name */
    public int f118762m;
    @c(a = "enablePostMethod")
    public int n;
    @c(a = "openTimeOut")
    public int o = 5000;
    @c(a = "uploadRegion")
    public String p;
    @c(a = "enableExternNet")
    public int q;
    @c(a = "enableQuic")
    public int r;
    @c(a = "enableMutitask")
    public int s;
    @c(a = "ttnetConfigValue")
    public int t;
    @c(a = "enable_tt_uploader_log_callback")
    public boolean u;
    @c(a = "is_stream_upload_enable")
    public int v;
    @c(a = "enable_client_network_judgement")
    public boolean w;
    @c(a = "enable_tt_uploader_ev_state")
    public boolean x;
    @c(a = "testSpeedAppKey")
    public String y;
    @c(a = "testSpeedAuthorization")
    public String z;

    static {
        Covode.recordClassIndex(77138);
    }

    public final String toString() {
        return "UploadVideoConfig{appKey='" + this.f118750a + '\'' + ", fileHostName='" + this.f118751b + '\'' + ", videoHostName='" + this.f118752c + '\'' + ", sliceTimeout=" + this.f118753d + ", sliceRetryCount=" + this.f118754e + ", sliceSize=" + this.f118755f + ", fileRetryCount=" + this.f118756g + ", maxFailTime=" + this.f118757h + ", authorization='" + this.f118758i + '\'' + ", enableHttps=" + this.f118759j + ", enableExternDNS=" + this.f118760k + ", aliveMaxFailTime=" + this.f118761l + ", enableTTNetDNS=" + this.f118762m + ", enablePostMethod=" + this.n + ", openTimeOut=" + this.o + ", uploadRegion='" + this.p + '\'' + ", enableExternNet=" + this.q + ", enableQuic=" + this.r + ", enableMutitask=" + this.s + ", ttnetConfigValue=" + this.t + ", enableTTUploaderLogCallback=" + this.u + ", isStreamUploadEnable=" + this.v + ", enableClientNetworkJudgement=" + this.w + ", testSpeedAppKey='" + this.y + '\'' + ", testSpeedAuthorization='" + this.z + '\'' + ", captionAppKey='" + this.A + '\'' + ", captionAuthorization='" + this.B + '\'' + ", aiCutAuthorization='" + this.D + '\'' + ", aiCutAppKey='" + this.E + '\'' + ", authorization2=" + this.F + '\'' + ", captionAuthorization2=" + this.G + '\'' + ", testSpeedAuthorization2=" + this.H + '\'' + ", mainNetworkType='" + this.I + '\'' + ", backupNetworkType='" + this.J + '\'' + '}';
    }
}
