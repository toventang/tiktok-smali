package com.ss.android.ugc.aweme.model.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.tools.f.b;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f110672a;

    /* renamed from: b  reason: collision with root package name */
    public final String f110673b;

    /* renamed from: c  reason: collision with root package name */
    public final Music f110674c;

    /* renamed from: d  reason: collision with root package name */
    public final String f110675d;

    /* renamed from: e  reason: collision with root package name */
    public final String f110676e;

    /* renamed from: f  reason: collision with root package name */
    public final String f110677f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f110678g;

    /* renamed from: h  reason: collision with root package name */
    public final String f110679h;

    /* renamed from: i  reason: collision with root package name */
    public final String f110680i;

    /* renamed from: j  reason: collision with root package name */
    public final String f110681j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f110682k;

    /* renamed from: l  reason: collision with root package name */
    public final String f110683l;

    /* renamed from: m  reason: collision with root package name */
    public final Integer f110684m;
    public final com.ss.android.ugc.aweme.tools.f.a n;
    public final b o;

    static {
        Covode.recordClassIndex(71034);
    }

    public a() {
        this(null, null, null, null, null, null, null, false, null, null, 32767);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f110672a, aVar.f110672a) && l.a(this.f110673b, aVar.f110673b) && l.a(this.f110674c, aVar.f110674c) && l.a(this.f110675d, aVar.f110675d) && l.a(this.f110676e, aVar.f110676e) && l.a(this.f110677f, aVar.f110677f) && this.f110678g == aVar.f110678g && l.a(this.f110679h, aVar.f110679h) && l.a(this.f110680i, aVar.f110680i) && l.a(this.f110681j, aVar.f110681j) && this.f110682k == aVar.f110682k && l.a(this.f110683l, aVar.f110683l) && l.a(this.f110684m, aVar.f110684m) && l.a(this.n, aVar.n) && l.a(this.o, aVar.o);
    }

    public final int hashCode() {
        String str = this.f110672a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f110673b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Music music = this.f110674c;
        int hashCode3 = (hashCode2 + (music != null ? music.hashCode() : 0)) * 31;
        String str3 = this.f110675d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f110676e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f110677f;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z = this.f110678g;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode6 + i4) * 31;
        String str6 = this.f110679h;
        int hashCode7 = (i7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f110680i;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f110681j;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        if (!this.f110682k) {
            i3 = 0;
        }
        int i8 = (hashCode9 + i3) * 31;
        String str9 = this.f110683l;
        int hashCode10 = (i8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        Integer num = this.f110684m;
        int hashCode11 = (hashCode10 + (num != null ? num.hashCode() : 0)) * 31;
        com.ss.android.ugc.aweme.tools.f.a aVar = this.n;
        int hashCode12 = (hashCode11 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        b bVar = this.o;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return hashCode12 + i2;
    }

    public final String toString() {
        return "PropReuseConfig(creationId=" + this.f110672a + ", shootWay=" + this.f110673b + ", music=" + this.f110674c + ", musicOrigin=" + this.f110675d + ", groupId=" + this.f110676e + ", enterFrom=" + this.f110677f + ", isAutoTryNext=" + this.f110678g + ", from=" + this.f110679h + ", stickerFrom=" + this.f110680i + ", gradeKey=" + this.f110681j + ", isNeedShowLoading=" + this.f110682k + ", giphyIds=" + this.f110683l + ", videoLength=" + this.f110684m + ", reuseStickerDAInterceptor=" + this.n + ", reuseStickerDownloadFinishListener=" + this.o + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.model.a.a$a  reason: collision with other inner class name */
    public static final class C2826a {

        /* renamed from: a  reason: collision with root package name */
        public Music f110685a;

        /* renamed from: b  reason: collision with root package name */
        public String f110686b;

        /* renamed from: c  reason: collision with root package name */
        public String f110687c;

        /* renamed from: d  reason: collision with root package name */
        public String f110688d = "";

        /* renamed from: e  reason: collision with root package name */
        public String f110689e = "";

        /* renamed from: f  reason: collision with root package name */
        public boolean f110690f = true;

        /* renamed from: g  reason: collision with root package name */
        public Integer f110691g;

        /* renamed from: h  reason: collision with root package name */
        public b f110692h;

        /* renamed from: i  reason: collision with root package name */
        private String f110693i;

        /* renamed from: j  reason: collision with root package name */
        private String f110694j;

        /* renamed from: k  reason: collision with root package name */
        private String f110695k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f110696l;

        /* renamed from: m  reason: collision with root package name */
        private String f110697m = "";
        private String n = "";
        private com.ss.android.ugc.aweme.tools.f.a o;

        static {
            Covode.recordClassIndex(71035);
        }

        public final a a() {
            return new a(this.f110693i, this.f110694j, this.f110685a, this.f110695k, this.f110686b, this.f110687c, this.f110696l, this.f110688d, this.f110689e, this.f110697m, this.f110690f, this.n, this.f110691g, this.o, this.f110692h);
        }

        public final C2826a a(com.ss.android.ugc.aweme.tools.f.a aVar) {
            l.d(aVar, "");
            this.o = aVar;
            return this;
        }

        public final C2826a b(String str) {
            l.d(str, "");
            this.f110695k = str;
            return this;
        }

        public final C2826a a(String str) {
            l.d(str, "");
            this.f110694j = str;
            return this;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ a(java.lang.String r17, com.ss.android.ugc.aweme.music.model.Music r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, boolean r24, java.lang.String r25, java.lang.Integer r26, int r27) {
        /*
            r16 = this;
            r1 = r27
            r11 = r24
            r10 = r23
            r9 = r22
            r8 = r21
            r2 = r17
            r3 = r18
            r4 = r19
            r6 = r20
            r0 = r1 & 2
            r13 = 0
            if (r0 == 0) goto L_0x0018
            r2 = r13
        L_0x0018:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x001d
            r3 = r13
        L_0x001d:
            r0 = r1 & 8
            if (r0 == 0) goto L_0x0022
            r4 = r13
        L_0x0022:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x0027
            r6 = r13
        L_0x0027:
            r0 = r1 & 128(0x80, float:1.794E-43)
            java.lang.String r12 = ""
            if (r0 == 0) goto L_0x002e
            r8 = r12
        L_0x002e:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0033
            r9 = r12
        L_0x0033:
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0038
            r10 = r12
        L_0x0038:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x003e
            r0 = 1
            r11 = 1
        L_0x003e:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0054
        L_0x0042:
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0051
        L_0x0046:
            r1 = 0
            r5 = 0
            r7 = 0
            r14 = 0
            r15 = 0
            r0 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x0051:
            r13 = r26
            goto L_0x0046
        L_0x0054:
            r12 = r25
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.model.a.a.<init>(java.lang.String, com.ss.android.ugc.aweme.music.model.Music, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.Integer, int):void");
    }

    public a(String str, String str2, Music music, String str3, String str4, String str5, boolean z, String str6, String str7, String str8, boolean z2, String str9, Integer num, com.ss.android.ugc.aweme.tools.f.a aVar, b bVar) {
        l.d(str6, "");
        l.d(str7, "");
        l.d(str8, "");
        l.d(str9, "");
        this.f110672a = str;
        this.f110673b = str2;
        this.f110674c = music;
        this.f110675d = str3;
        this.f110676e = str4;
        this.f110677f = str5;
        this.f110678g = z;
        this.f110679h = str6;
        this.f110680i = str7;
        this.f110681j = str8;
        this.f110682k = z2;
        this.f110683l = str9;
        this.f110684m = num;
        this.n = aVar;
        this.o = bVar;
    }
}
