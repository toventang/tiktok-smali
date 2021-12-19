package com.ss.android.ugc.aweme.download.impl.component_impl;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.a.b;
import com.ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f83118a = new c();

    private c() {
    }

    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IDownloadSdkMonitorDepend f83119a;

        static {
            Covode.recordClassIndex(51823);
        }

        @Override // com.ss.android.socialbase.a.b
        public final long e() {
            return this.f83119a.getUpdateVersionCode();
        }

        @Override // com.ss.android.socialbase.a.b
        public final String[] h() {
            return this.f83119a.getMonitorHosts();
        }

        @Override // com.ss.android.socialbase.a.b
        public final Context a() {
            Context context = this.f83119a.getContext();
            if (context == null) {
                l.b();
            }
            return context;
        }

        @Override // com.ss.android.socialbase.a.b
        public final String b() {
            String aid = this.f83119a.getAid();
            if (aid == null) {
                return "";
            }
            return aid;
        }

        @Override // com.ss.android.socialbase.a.b
        public final String c() {
            String deviceId = this.f83119a.getDeviceId();
            if (deviceId == null) {
                return "";
            }
            return deviceId;
        }

        @Override // com.ss.android.socialbase.a.b
        public final String d() {
            String channel = this.f83119a.getChannel();
            if (channel == null) {
                return "";
            }
            return channel;
        }

        @Override // com.ss.android.socialbase.a.b
        public final String f() {
            String appVersionName = this.f83119a.getAppVersionName();
            if (appVersionName == null) {
                return "";
            }
            return appVersionName;
        }

        @Override // com.ss.android.socialbase.a.b
        public final String g() {
            String packageName = this.f83119a.getPackageName();
            if (packageName == null) {
                l.b();
            }
            return packageName;
        }

        a(IDownloadSdkMonitorDepend iDownloadSdkMonitorDepend) {
            this.f83119a = iDownloadSdkMonitorDepend;
        }
    }

    static {
        Covode.recordClassIndex(51822);
    }
}
