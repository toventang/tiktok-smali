package com.ss.android.ugc.aweme.user;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {

    /* renamed from: h  reason: collision with root package name */
    public static final a f142344h = new a((byte) 0);
    @com.google.gson.a.c(a = "uid")

    /* renamed from: a  reason: collision with root package name */
    public final String f142345a;
    @com.google.gson.a.c(a = "short_id")

    /* renamed from: b  reason: collision with root package name */
    public final String f142346b;
    @com.google.gson.a.c(a = "unique_id")

    /* renamed from: c  reason: collision with root package name */
    public final String f142347c;
    @com.google.gson.a.c(a = "nickname")

    /* renamed from: d  reason: collision with root package name */
    public String f142348d;
    @com.google.gson.a.c(a = "avatar_url")

    /* renamed from: e  reason: collision with root package name */
    public String f142349e;
    @com.google.gson.a.c(a = "sec_uid")

    /* renamed from: f  reason: collision with root package name */
    public final String f142350f;
    @com.google.gson.a.c(a = "app_id")

    /* renamed from: g  reason: collision with root package name */
    public final long f142351g;

    static {
        Covode.recordClassIndex(93105);
    }

    public c() {
        this(null, null, null, null, null, null, 0, 127);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(93106);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x004e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.ss.android.ugc.aweme.user.c a(com.ss.android.ugc.aweme.profile.model.User r10) {
            /*
                java.lang.String r8 = ""
                h.f.b.l.d(r10, r8)
                com.ss.android.ugc.aweme.user.c r2 = new com.ss.android.ugc.aweme.user.c
                java.lang.String r3 = r10.getUid()
                h.f.b.l.b(r3, r8)
                java.lang.String r4 = r10.getShortId()
                h.f.b.l.b(r4, r8)
                java.lang.String r5 = r10.getUniqueId()
                h.f.b.l.b(r5, r8)
                java.lang.String r6 = r10.getNickname()
                h.f.b.l.b(r6, r8)
                com.ss.android.ugc.aweme.base.model.UrlModel r0 = r10.getAvatarThumb()
                if (r0 == 0) goto L_0x003d
                com.ss.android.ugc.aweme.base.model.UrlModel r0 = r10.getAvatarThumb()
                h.f.b.l.b(r0, r8)
                java.util.List r0 = r0.getUrlList()
                r1 = 0
                if (r0 == 0) goto L_0x003d
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x0050
            L_0x003d:
                r7 = r8
            L_0x003e:
                h.f.b.l.b(r7, r8)
                java.lang.String r0 = r10.getSecUid()
                if (r0 != 0) goto L_0x004e
            L_0x0047:
                int r0 = com.bytedance.ies.ugc.appcontext.d.n
                long r9 = (long) r0
                r2.<init>(r3, r4, r5, r6, r7, r8, r9)
                return r2
            L_0x004e:
                r8 = r0
                goto L_0x0047
            L_0x0050:
                com.ss.android.ugc.aweme.base.model.UrlModel r0 = r10.getAvatarThumb()
                h.f.b.l.b(r0, r8)
                java.util.List r0 = r0.getUrlList()
                java.lang.Object r7 = r0.get(r1)
                java.lang.String r7 = (java.lang.String) r7
                goto L_0x003e
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.user.c.a.a(com.ss.android.ugc.aweme.profile.model.User):com.ss.android.ugc.aweme.user.c");
        }
    }

    public final String a() {
        String str = this.f142347c;
        if (str == null || str.length() == 0) {
            return this.f142346b;
        }
        return this.f142347c;
    }

    public c(String str, String str2, String str3, String str4, String str5, String str6, long j2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(str6, "");
        this.f142345a = str;
        this.f142346b = str2;
        this.f142347c = str3;
        this.f142348d = str4;
        this.f142349e = str5;
        this.f142350f = str6;
        this.f142351g = j2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ c(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, long r16, int r18) {
        /*
            r9 = this;
            r5 = r14
            r1 = r10
            r2 = r11
            r3 = r12
            r7 = r16
            r4 = r13
            r0 = r18 & 1
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x000e
            r1 = r6
        L_0x000e:
            r0 = r18 & 2
            if (r0 == 0) goto L_0x0013
            r2 = r6
        L_0x0013:
            r0 = r18 & 4
            if (r0 == 0) goto L_0x0018
            r3 = r6
        L_0x0018:
            r0 = r18 & 8
            if (r0 == 0) goto L_0x001d
            r4 = r6
        L_0x001d:
            r0 = r18 & 16
            if (r0 == 0) goto L_0x0022
            r5 = r6
        L_0x0022:
            r0 = r18 & 32
            if (r0 == 0) goto L_0x0032
        L_0x0026:
            r0 = r18 & 64
            if (r0 == 0) goto L_0x002d
            int r0 = com.bytedance.ies.ugc.appcontext.d.n
            long r7 = (long) r0
        L_0x002d:
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0032:
            r6 = r15
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.user.c.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int):void");
    }
}
