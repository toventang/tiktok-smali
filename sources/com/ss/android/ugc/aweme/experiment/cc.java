package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.a.c;
import h.f.b.l;

public final class cc {

    /* renamed from: a  reason: collision with root package name */
    public static final a f89689a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final cc f89690b = new cc();

    public static final class a {
        @c(a = "music_cdn_url")

        /* renamed from: a  reason: collision with root package name */
        public final String f89691a = null;
        @c(a = "hashtag_cdn_url")

        /* renamed from: b  reason: collision with root package name */
        public final String f89692b = null;

        static {
            Covode.recordClassIndex(56364);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f89691a, aVar.f89691a) && l.a(this.f89692b, aVar.f89692b);
        }

        public final int hashCode() {
            String str = this.f89691a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f89692b;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode + i2;
        }

        public final String toString() {
            return "Config(musicCdnUrl=" + this.f89691a + ", hashtagCdnUrl=" + this.f89692b + ")";
        }
    }

    private cc() {
    }

    static {
        Covode.recordClassIndex(56363);
    }

    public static String a() {
        a aVar = (a) SettingsManager.a().a("discovery_collect_template", a.class, f89689a);
        if (aVar == null) {
            aVar = new a();
        }
        l.b(aVar, "");
        return aVar.f89692b;
    }
}
