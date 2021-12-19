package com.ttnet.org.chromium.net;

import com.bytedance.covode.number.Covode;

public abstract class TTAppInfoProvider {
    static {
        Covode.recordClassIndex(103400);
    }

    public abstract AppInfo a();

    public static class AppInfo {
        public String A;
        public String B;
        public String C;
        public String D;
        public String E;
        public String F;
        public String G;
        public String H;

        /* renamed from: a  reason: collision with root package name */
        public String f155441a;

        /* renamed from: b  reason: collision with root package name */
        public String f155442b;

        /* renamed from: c  reason: collision with root package name */
        public String f155443c;

        /* renamed from: d  reason: collision with root package name */
        public String f155444d;

        /* renamed from: e  reason: collision with root package name */
        public String f155445e;

        /* renamed from: f  reason: collision with root package name */
        public String f155446f;

        /* renamed from: g  reason: collision with root package name */
        public String f155447g;

        /* renamed from: h  reason: collision with root package name */
        public String f155448h;

        /* renamed from: i  reason: collision with root package name */
        public String f155449i;

        /* renamed from: j  reason: collision with root package name */
        public String f155450j;

        /* renamed from: k  reason: collision with root package name */
        public String f155451k;

        /* renamed from: l  reason: collision with root package name */
        public String f155452l;

        /* renamed from: m  reason: collision with root package name */
        public String f155453m;
        public String n;
        public String o;
        public String p;
        public String q;
        public String r;
        public String s;
        public String t;
        public String u;
        public String v;
        public String w;
        public String x;
        public String y;
        public String z;

        static {
            Covode.recordClassIndex(103401);
        }

        public String getAbi() {
            return this.s;
        }

        public String getAppId() {
            return this.f155442b;
        }

        public String getAppName() {
            return this.f155448h;
        }

        public String getCarrierRegion() {
            return this.D;
        }

        public String getChannel() {
            return this.f155451k;
        }

        public String getDeviceBrand() {
            return this.n;
        }

        public String getDeviceId() {
            return this.f155444d;
        }

        public String getDeviceModel() {
            return this.o;
        }

        public String getDevicePlatform() {
            return this.f155453m;
        }

        public String getDeviceType() {
            return this.f155447g;
        }

        public String getDomainBoe() {
            return this.y;
        }

        public String getDomainHttpDns() {
            return this.w;
        }

        public String getDomainNetlog() {
            return this.x;
        }

        public String getHostFirst() {
            return this.t;
        }

        public String getHostSecond() {
            return this.u;
        }

        public String getHostThird() {
            return this.v;
        }

        public String getHttpDnsRequestFlags() {
            return this.H;
        }

        public String getIsMainProcess() {
            return this.z;
        }

        public String getManifestVersionCode() {
            return this.r;
        }

        public String getNetAccessType() {
            return this.f155445e;
        }

        public String getOSApi() {
            return this.f155443c;
        }

        public String getOSVersion() {
            return this.f155452l;
        }

        public String getRegion() {
            return this.B;
        }

        public String getSdkAppID() {
            return this.f155449i;
        }

        public String getSdkVersion() {
            return this.f155450j;
        }

        public String getStoreIdc() {
            return this.A;
        }

        public String getSysRegion() {
            return this.C;
        }

        public String getTNCRequestFlags() {
            return this.G;
        }

        public String getTNCRequestHeader() {
            return this.E;
        }

        public String getTNCRequestQuery() {
            return this.F;
        }

        public String getUpdateVersionCode() {
            return this.q;
        }

        public String getUserId() {
            return this.f155441a;
        }

        public String getVersionCode() {
            return this.f155446f;
        }

        public String getVersionName() {
            return this.p;
        }
    }
}
