package com.ss.android.ugc.aweme.poi_api.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.a.c;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2951a f115528a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final a f115529b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(74412);
    }

    /* renamed from: com.ss.android.ugc.aweme.poi_api.a.a$a  reason: collision with other inner class name */
    public static final class C2951a {
        @c(a = "enable")

        /* renamed from: a  reason: collision with root package name */
        public final boolean f115530a;
        @c(a = "poi_service_settings")

        /* renamed from: b  reason: collision with root package name */
        public final String f115531b;
        @c(a = "location_map_settings")

        /* renamed from: c  reason: collision with root package name */
        public final String f115532c;
        @c(a = "location_cache_time")

        /* renamed from: d  reason: collision with root package name */
        public final int f115533d;
        @c(a = "waze_url")

        /* renamed from: e  reason: collision with root package name */
        public final String f115534e;
        @c(a = "static_map_url")

        /* renamed from: f  reason: collision with root package name */
        public final String f115535f;

        static {
            Covode.recordClassIndex(74413);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2951a)) {
                return false;
            }
            C2951a aVar = (C2951a) obj;
            return this.f115530a == aVar.f115530a && l.a(this.f115531b, aVar.f115531b) && l.a(this.f115532c, aVar.f115532c) && this.f115533d == aVar.f115533d && l.a(this.f115534e, aVar.f115534e) && l.a(this.f115535f, aVar.f115535f);
        }

        public final int hashCode() {
            boolean z = this.f115530a;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = i2 * 31;
            String str = this.f115531b;
            int i6 = 0;
            int hashCode = (i5 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f115532c;
            int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f115533d) * 31;
            String str3 = this.f115534e;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f115535f;
            if (str4 != null) {
                i6 = str4.hashCode();
            }
            return hashCode3 + i6;
        }

        private C2951a() {
            this.f115530a = false;
            this.f115531b = null;
            this.f115532c = null;
            this.f115533d = 3600000;
            this.f115534e = null;
            this.f115535f = null;
        }

        public final String toString() {
            return "Config(enable=" + this.f115530a + ", poiKey=" + this.f115531b + ", mapKey=" + this.f115532c + ", locationCacheTime=" + this.f115533d + ')';
        }

        public /* synthetic */ C2951a(byte b2) {
            this();
        }
    }

    public static C2951a a() {
        C2951a aVar = (C2951a) SettingsManager.a().a("poi_config", C2951a.class, f115528a);
        if (aVar == null) {
            aVar = new C2951a((byte) 0);
        }
        l.b(aVar, "");
        return aVar;
    }
}
