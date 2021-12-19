package com.ss.android.ugc.aweme.commercialize.live.b;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.utils.hk;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1684a f74546a = new C1684a();

    /* renamed from: b  reason: collision with root package name */
    public static final a f74547b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final h f74548c = i.a((h.f.a.a) c.f74554a);

    public static final C1684a a() {
        return (C1684a) f74548c.getValue();
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.b.a$a  reason: collision with other inner class name */
    public static final class C1684a {
        @com.google.gson.a.c(a = "live-link-list")

        /* renamed from: a  reason: collision with root package name */
        public final b f74549a;
        @com.google.gson.a.c(a = "live-link-pin")

        /* renamed from: b  reason: collision with root package name */
        public final b f74550b;
        @com.google.gson.a.c(a = "live-link-preview")

        /* renamed from: c  reason: collision with root package name */
        public final b f74551c;

        static {
            Covode.recordClassIndex(45970);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1684a)) {
                return false;
            }
            C1684a aVar = (C1684a) obj;
            return l.a(this.f74549a, aVar.f74549a) && l.a(this.f74550b, aVar.f74550b) && l.a(this.f74551c, aVar.f74551c);
        }

        public final int hashCode() {
            b bVar = this.f74549a;
            int i2 = 0;
            int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
            b bVar2 = this.f74550b;
            int hashCode2 = (hashCode + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
            b bVar3 = this.f74551c;
            if (bVar3 != null) {
                i2 = bVar3.hashCode();
            }
            return hashCode2 + i2;
        }

        public final String toString() {
            return "BASchemaConfigData(liveLinkList=" + this.f74549a + ", liveLinkPin=" + this.f74550b + ", liveLinkPreview=" + this.f74551c + ")";
        }

        public /* synthetic */ C1684a() {
            this(new b(null, "aweme://lynxview/?channel=tiktok_ba_lynx_v2&bundle=live-link-list/template.js&hide_nav_bar=1&group=tiktok_ba_lynx_v2&hide_status_bar=0&fallback_url=https://www.tiktok.com/falcon/tiktok_ba_lynx_v2/live-link-list", 1), new b(null, "aweme://lynxview/?channel=tiktok_ba_lynx_v2&bundle=live-link-pin/template.js&hide_nav_bar=1&group=tiktok_ba_lynx_v2&hide_status_bar=0&fallback_url=https://www.tiktok.com/falcon/tiktok_ba_lynx_v2/live-link-pin", 1), new b(null, "aweme://lynxview/?channel=tiktok_ba_lynx_v2&bundle=live-link-preview/template.js&hide_nav_bar=1&group=tiktok_ba_lynx_v2&hide_status_bar=0&fallback_url=https://www.tiktok.com/falcon/tiktok_ba_lynx_v2/live-link-preview", 1));
        }

        private C1684a(b bVar, b bVar2, b bVar3) {
            l.d(bVar, "");
            l.d(bVar2, "");
            l.d(bVar3, "");
            this.f74549a = bVar;
            this.f74550b = bVar2;
            this.f74551c = bVar3;
        }
    }

    static final class c extends m implements h.f.a.a<C1684a> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f74554a = new c();

        static {
            Covode.recordClassIndex(45972);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ C1684a invoke() {
            Object a2 = SettingsManager.a().a("ba_live_link_schema", C1684a.class, a.f74546a);
            if (a2 == null) {
                a2 = a.f74546a;
            }
            l.b(a2, "");
            return a2;
        }
    }

    static {
        Covode.recordClassIndex(45969);
    }

    public static final class b {
        @com.google.gson.a.c(a = "fallback_url")

        /* renamed from: a  reason: collision with root package name */
        public final String f74552a;
        @com.google.gson.a.c(a = "schema")

        /* renamed from: b  reason: collision with root package name */
        public final String f74553b;

        static {
            Covode.recordClassIndex(45971);
        }

        public b() {
            this(null, null, 3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return l.a(this.f74552a, bVar.f74552a) && l.a(this.f74553b, bVar.f74553b);
        }

        public final int hashCode() {
            String str = this.f74552a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f74553b;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode + i2;
        }

        public final String toString() {
            return "LiveLinkData(fallback_url=" + this.f74552a + ", schema=" + this.f74553b + ")";
        }

        public final String a() {
            Uri.Builder buildUpon = Uri.parse(this.f74553b).buildUpon();
            if (hk.a(this.f74552a)) {
                buildUpon.appendQueryParameter("fallback_url", this.f74552a);
            }
            String uri = buildUpon.build().toString();
            l.b(uri, "");
            return uri;
        }

        private b(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            this.f74552a = str;
            this.f74553b = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(String str, String str2, int i2) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2);
        }
    }
}
