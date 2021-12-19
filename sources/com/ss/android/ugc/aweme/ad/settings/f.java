package com.ss.android.ugc.aweme.ad.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.a.c;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final a f66158a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public static final f f66159b = new f();

    /* renamed from: c  reason: collision with root package name */
    private static final h f66160c = i.a((h.f.a.a) b.f66163a);

    public static final a a() {
        return (a) f66160c.getValue();
    }

    private f() {
    }

    public static final class a {
        @c(a = "max_upload_fail_url")

        /* renamed from: a  reason: collision with root package name */
        public final int f66161a;
        @c(a = "sampling_rate")

        /* renamed from: b  reason: collision with root package name */
        public final int f66162b;

        static {
            Covode.recordClassIndex(40671);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f66161a == aVar.f66161a && this.f66162b == aVar.f66162b;
        }

        public final int hashCode() {
            return (this.f66161a * 31) + this.f66162b;
        }

        public final String toString() {
            return "UAWPIConfig(maxUploadFailUrl=" + this.f66161a + ", samplingRate=" + this.f66162b + ")";
        }

        private a() {
            this.f66161a = 50;
            this.f66162b = 3;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f66163a = new b();

        static {
            Covode.recordClassIndex(40672);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            Object a2 = SettingsManager.a().a("upload_ad_web_preload_info_config", a.class, f.f66158a);
            if (a2 == null) {
                a2 = f.f66158a;
            }
            l.b(a2, "");
            return a2;
        }
    }

    static {
        Covode.recordClassIndex(40670);
    }
}
