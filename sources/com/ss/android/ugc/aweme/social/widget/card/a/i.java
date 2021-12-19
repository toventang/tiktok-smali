package com.ss.android.ugc.aweme.social.widget.card.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.social.widget.card.j;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.LinkedHashMap;
import java.util.Map;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final int f133750a;

    /* renamed from: b  reason: collision with root package name */
    public final g f133751b;

    /* renamed from: c  reason: collision with root package name */
    public final h f133752c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, String> f133753d;

    /* renamed from: e  reason: collision with root package name */
    public final j f133754e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f133755f;

    /* renamed from: g  reason: collision with root package name */
    public final b<com.ss.android.ugc.aweme.social.widget.card.view.a, z> f133756g;

    static {
        Covode.recordClassIndex(87496);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f133750a == iVar.f133750a && l.a(this.f133751b, iVar.f133751b) && l.a(this.f133752c, iVar.f133752c) && l.a(this.f133753d, iVar.f133753d) && l.a(this.f133754e, iVar.f133754e) && this.f133755f == iVar.f133755f && l.a(this.f133756g, iVar.f133756g);
    }

    public final int hashCode() {
        int i2 = this.f133750a * 31;
        g gVar = this.f133751b;
        int i3 = 0;
        int hashCode = (i2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        h hVar = this.f133752c;
        int hashCode2 = (hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31;
        Map<String, String> map = this.f133753d;
        int hashCode3 = (hashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        j jVar = this.f133754e;
        int hashCode4 = (hashCode3 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        boolean z = this.f133755f;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode4 + i4) * 31;
        b<com.ss.android.ugc.aweme.social.widget.card.view.a, z> bVar = this.f133756g;
        if (bVar != null) {
            i3 = bVar.hashCode();
        }
        return i7 + i3;
    }

    public final String toString() {
        return "SocialCardGroupConfig(scene=" + this.f133750a + ", permissionConfig=" + this.f133751b + ", recUserGroupCard=" + this.f133752c + ", eventExt=" + this.f133753d + ", stateListener=" + this.f133754e + ", withTitle=" + this.f133755f + ", titleConfig=" + this.f133756g + ")";
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f133757a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f133758b;

        /* renamed from: c  reason: collision with root package name */
        public b<? super com.ss.android.ugc.aweme.social.widget.card.view.a, z> f133759c;

        /* renamed from: d  reason: collision with root package name */
        private h f133760d;

        /* renamed from: e  reason: collision with root package name */
        private g f133761e;

        /* renamed from: f  reason: collision with root package name */
        private Map<String, String> f133762f = new LinkedHashMap();

        /* renamed from: g  reason: collision with root package name */
        private j f133763g;

        static {
            Covode.recordClassIndex(87497);
        }

        public final i a() {
            return new i(this.f133757a, this.f133761e, this.f133760d, this.f133762f, this.f133763g, this.f133758b, this.f133759c);
        }

        public final a a(g gVar) {
            l.d(gVar, "");
            this.f133761e = gVar;
            return this;
        }

        public final a a(h hVar) {
            l.d(hVar, "");
            this.f133760d = hVar;
            return this;
        }

        public final a b(String str) {
            l.d(str, "");
            this.f133762f.put("position", str);
            return this;
        }

        public final a c(String str) {
            l.d(str, "");
            this.f133762f.put("previous_page", str);
            return this;
        }

        public final a a(j jVar) {
            l.d(jVar, "");
            this.f133763g = jVar;
            return this;
        }

        public final a a(String str) {
            l.d(str, "");
            this.f133762f.put("enter_from", str);
            return this;
        }

        public final a a(Map<String, String> map) {
            l.d(map, "");
            this.f133762f.putAll(map);
            return this;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.social.widget.card.view.a, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public i(int i2, g gVar, h hVar, Map<String, String> map, j jVar, boolean z, b<? super com.ss.android.ugc.aweme.social.widget.card.view.a, z> bVar) {
        l.d(map, "");
        this.f133750a = i2;
        this.f133751b = gVar;
        this.f133752c = hVar;
        this.f133753d = map;
        this.f133754e = jVar;
        this.f133755f = z;
        this.f133756g = bVar;
    }
}
