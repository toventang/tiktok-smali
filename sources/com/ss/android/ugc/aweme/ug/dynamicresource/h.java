package com.ss.android.ugc.aweme.ug.dynamicresource;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.u.f;
import h.f.b.l;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

public final class h implements Comparable<h> {

    /* renamed from: m  reason: collision with root package name */
    public static final a f141801m = new a((byte) 0);
    private static String n = "";

    /* renamed from: a  reason: collision with root package name */
    public final String f141802a;

    /* renamed from: b  reason: collision with root package name */
    public final k f141803b;

    /* renamed from: c  reason: collision with root package name */
    public final String f141804c;

    /* renamed from: d  reason: collision with root package name */
    public final f f141805d;

    /* renamed from: e  reason: collision with root package name */
    public final String f141806e;

    /* renamed from: f  reason: collision with root package name */
    public final int f141807f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f141808g;

    /* renamed from: h  reason: collision with root package name */
    public final Integer f141809h;

    /* renamed from: i  reason: collision with root package name */
    public g f141810i;

    /* renamed from: j  reason: collision with root package name */
    public String f141811j;

    /* renamed from: k  reason: collision with root package name */
    public int f141812k;

    /* renamed from: l  reason: collision with root package name */
    public Map<a<?>, Class<?>> f141813l;

    public final int hashCode() {
        String str = this.f141802a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        k kVar = this.f141803b;
        int hashCode2 = (hashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
        String str2 = this.f141804c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        f fVar = this.f141805d;
        int hashCode4 = (hashCode3 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        String str3 = this.f141806e;
        int hashCode5 = (((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f141807f) * 31;
        boolean z = this.f141808g;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode5 + i3) * 31;
        Integer num = this.f141809h;
        int hashCode6 = (i6 + (num != null ? num.hashCode() : 0)) * 31;
        g gVar = this.f141810i;
        int hashCode7 = (hashCode6 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        String str4 = this.f141811j;
        int hashCode8 = (((hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f141812k) * 31;
        Map<a<?>, Class<?>> map = this.f141813l;
        if (map != null) {
            i2 = map.hashCode();
        }
        return hashCode8 + i2;
    }

    public final String toString() {
        return "DynamicResourceStrategy(key=" + this.f141802a + ", type=" + this.f141803b + ", cdnUrl=" + this.f141804c + ", priority=" + this.f141805d + ", hash=" + this.f141806e + ", size=" + this.f141807f + ", enable=" + this.f141808g + ", fallback=" + this.f141809h + ", status=" + this.f141810i + ", localPath=" + this.f141811j + ", failureCount=" + this.f141812k + ", callbacks=" + this.f141813l + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(92685);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(92684);
    }

    private final String d() {
        int i2 = i.f141814a[this.f141803b.ordinal()];
        if (i2 == 1) {
            return j.f141816b;
        }
        if (i2 == 2) {
            return j.f141817c;
        }
        if (i2 != 3) {
            return "";
        }
        return j.f141818d;
    }

    private String e() {
        return a() + '/' + b();
    }

    public final String b() {
        return this.f141806e + d();
    }

    public final boolean c() {
        String e2 = e();
        if (a(e2)) {
            this.f141811j = e2;
            this.f141810i = g.SUCCESS;
            return true;
        }
        this.f141811j = "";
        if (this.f141810i != g.SUCCESS) {
            return false;
        }
        this.f141810i = g.IDLE;
        return false;
    }

    public final String a() {
        String str;
        String str2 = n;
        if (str2 == null || str2.length() == 0) {
            Context a2 = d.a();
            File a3 = com.bytedance.u.d.a(a2, f.PREFER_SD_CARD);
            String str3 = "";
            if (a3 != null) {
                str = a3.getPath();
            } else if (a(a2) == null) {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                l.b(externalStorageDirectory, str3);
                str = externalStorageDirectory.getPath();
            } else {
                File a4 = a(a2);
                if (a4 != null) {
                    str = a4.getPath();
                } else {
                    str = null;
                }
            }
            String a5 = l.a(str, (Object) ("/" + j.f141815a + '/'));
            if (a5 != null) {
                str3 = a5;
            }
            n = str3;
        }
        return n + this.f141802a;
    }

    public final void a(g gVar) {
        l.d(gVar, "");
        this.f141810i = gVar;
    }

    private static File a(Context context) {
        if (!TextUtils.isEmpty(null)) {
            return context.getExternalFilesDir(null);
        }
        if (com.ss.android.ugc.aweme.lancet.d.f107196d != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107196d;
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        com.ss.android.ugc.aweme.lancet.d.f107196d = externalFilesDir;
        return externalFilesDir;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!l.a((Object) this.f141802a, (Object) hVar.f141802a) || !l.a((Object) this.f141806e, (Object) hVar.f141806e)) {
            return false;
        }
        return true;
    }

    private static boolean a(String str) {
        if (str.length() <= 0 || !new File(str).exists()) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(h hVar) {
        h hVar2 = hVar;
        l.d(hVar2, "");
        int i2 = this.f141812k;
        int i3 = hVar2.f141812k;
        if (i2 < i3) {
            return 1;
        }
        if (i2 > i3) {
            return -1;
        }
        if (this.f141805d.getValue() > hVar2.f141805d.getValue() || (this.f141805d.getValue() == hVar2.f141805d.getValue() && this.f141807f > hVar2.f141807f)) {
            return 1;
        }
        if (this.f141805d.getValue() == hVar2.f141805d.getValue() && this.f141807f == hVar2.f141807f) {
            return 0;
        }
        return -1;
    }

    public /* synthetic */ h(String str, k kVar, String str2, f fVar, String str3, int i2, Integer num) {
        this(str, kVar, str2, fVar, str3, i2, true, num, g.IDLE, "", new LinkedHashMap());
    }

    private h(String str, k kVar, String str2, f fVar, String str3, int i2, boolean z, Integer num, g gVar, String str4, Map<a<?>, Class<?>> map) {
        l.d(str, "");
        l.d(kVar, "");
        l.d(str2, "");
        l.d(fVar, "");
        l.d(str3, "");
        l.d(gVar, "");
        l.d(str4, "");
        l.d(map, "");
        this.f141802a = str;
        this.f141803b = kVar;
        this.f141804c = str2;
        this.f141805d = fVar;
        this.f141806e = str3;
        this.f141807f = i2;
        this.f141808g = true;
        this.f141809h = num;
        this.f141810i = gVar;
        this.f141811j = str4;
        this.f141812k = 0;
        this.f141813l = map;
    }
}
