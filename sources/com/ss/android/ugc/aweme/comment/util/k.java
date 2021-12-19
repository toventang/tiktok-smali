package com.ss.android.ugc.aweme.comment.util;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.comment.i.h;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import org.json.JSONObject;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final b f72843a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static c f72844b;

    /* renamed from: c  reason: collision with root package name */
    public static final k f72845c = new k();

    public interface a {
        static {
            Covode.recordClassIndex(44874);
        }

        void a(long j2, boolean z, int i2);
    }

    private k() {
    }

    public static final class b extends Handler {
        static {
            Covode.recordClassIndex(44875);
        }

        public b() {
            super(Looper.getMainLooper());
        }

        public final void handleMessage(Message message) {
            Bundle data;
            a aVar;
            long j2;
            int i2;
            l.d(message, "");
            super.handleMessage(message);
            if (message.what == 0 && (data = message.getData()) != null && Long.valueOf(data.getLong("key_finish_ts")) != null && k.f72844b != null) {
                c cVar = k.f72844b;
                if (cVar != null) {
                    cVar.f72853h = System.currentTimeMillis();
                }
                c cVar2 = k.f72844b;
                if (cVar2 == null) {
                    l.b();
                }
                if (cVar2.b() >= 0) {
                    c cVar3 = k.f72844b;
                    if (cVar3 == null) {
                        l.b();
                    }
                    if (cVar3.a() >= 0) {
                        c cVar4 = k.f72844b;
                        if (cVar4 == null) {
                            l.b();
                        }
                        if (cVar4.c() >= 0) {
                            c cVar5 = k.f72844b;
                            if (!(cVar5 == null || (aVar = cVar5.f72854i) == null)) {
                                c cVar6 = k.f72844b;
                                if (cVar6 != null) {
                                    j2 = cVar6.d();
                                } else {
                                    j2 = -1;
                                }
                                c cVar7 = k.f72844b;
                                if (cVar7 != null) {
                                    i2 = cVar7.f72849d;
                                } else {
                                    i2 = 0;
                                }
                                aVar.a(j2, true, i2);
                            }
                            j.a("CommentPageLoadTimer: finishRecord(): duration = " + k.c());
                            k.b();
                            k.f72844b = null;
                        }
                    }
                }
            }
        }
    }

    static long c() {
        c cVar = f72844b;
        if (cVar != null) {
            return cVar.d();
        }
        return -1;
    }

    private static long d() {
        c cVar = f72844b;
        if (cVar != null) {
            return cVar.a();
        }
        return -1;
    }

    private static long e() {
        c cVar = f72844b;
        if (cVar != null) {
            return cVar.b();
        }
        return -1;
    }

    private static long f() {
        c cVar = f72844b;
        if (cVar != null) {
            return cVar.c();
        }
        return -1;
    }

    private static long g() {
        c cVar = f72844b;
        if (cVar != null) {
            return System.currentTimeMillis() - cVar.f72850e;
        }
        return -1;
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f72846a;

        /* renamed from: b  reason: collision with root package name */
        public String f72847b;

        /* renamed from: c  reason: collision with root package name */
        public Boolean f72848c;

        /* renamed from: d  reason: collision with root package name */
        public int f72849d;

        /* renamed from: e  reason: collision with root package name */
        public long f72850e;

        /* renamed from: f  reason: collision with root package name */
        public long f72851f;

        /* renamed from: g  reason: collision with root package name */
        public long f72852g;

        /* renamed from: h  reason: collision with root package name */
        public long f72853h;

        /* renamed from: i  reason: collision with root package name */
        public a f72854i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f72855j;

        static {
            Covode.recordClassIndex(44876);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f72846a == cVar.f72846a && l.a(this.f72847b, cVar.f72847b) && l.a(this.f72848c, cVar.f72848c) && this.f72849d == cVar.f72849d && this.f72850e == cVar.f72850e && this.f72851f == cVar.f72851f && this.f72852g == cVar.f72852g && this.f72853h == cVar.f72853h && l.a(this.f72854i, cVar.f72854i) && this.f72855j == cVar.f72855j;
        }

        public final String toString() {
            return "TimeRecorder(isFirstShow=" + this.f72846a + ", eventType=" + this.f72847b + ", isLoadSuccess=" + this.f72848c + ", loadDataCount=" + this.f72849d + ", showFragmentStartAt=" + this.f72850e + ", networkStartAt=" + this.f72851f + ", networkFinishedAt=" + this.f72852g + ", viewHolderFinishedAt=" + this.f72853h + ", listener=" + this.f72854i + ", isFirstLoad=" + this.f72855j + ")";
        }

        public final long a() {
            long j2 = this.f72851f;
            long j3 = this.f72850e;
            if (1 <= j3 && j2 > j3) {
                return j2 - j3;
            }
            return -1;
        }

        public final long b() {
            long j2 = this.f72852g;
            long j3 = this.f72851f;
            if (1 <= j3 && j2 > j3) {
                return j2 - j3;
            }
            return -1;
        }

        public final long c() {
            long j2 = this.f72853h;
            long j3 = this.f72852g;
            if (1 <= j3 && j2 > j3) {
                return j2 - j3;
            }
            return -1;
        }

        public final long d() {
            long j2 = this.f72850e;
            long j3 = this.f72853h;
            if (1 <= j2 && j3 > j2) {
                return j3 - j2;
            }
            long j4 = this.f72852g;
            if (1 <= j2 && j4 > j2) {
                return j4 - j2;
            }
            return -1;
        }

        public final int hashCode() {
            int i2;
            int i3;
            boolean z = this.f72846a;
            int i4 = 1;
            if (z) {
                z = true;
            }
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = z ? 1 : 0;
            int i8 = i5 * 31;
            String str = this.f72847b;
            int i9 = 0;
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            int i10 = (i8 + i2) * 31;
            Boolean bool = this.f72848c;
            if (bool != null) {
                i3 = bool.hashCode();
            } else {
                i3 = 0;
            }
            long j2 = this.f72850e;
            long j3 = this.f72851f;
            long j4 = this.f72852g;
            long j5 = this.f72853h;
            int i11 = (((((((((((i10 + i3) * 31) + this.f72849d) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31;
            a aVar = this.f72854i;
            if (aVar != null) {
                i9 = aVar.hashCode();
            }
            int i12 = (i11 + i9) * 31;
            if (!this.f72855j) {
                i4 = 0;
            }
            return i12 + i4;
        }

        private c(boolean z, String str, long j2, a aVar) {
            this.f72846a = z;
            this.f72847b = str;
            this.f72848c = null;
            this.f72849d = 0;
            this.f72850e = j2;
            this.f72851f = 0;
            this.f72852g = 0;
            this.f72853h = 0;
            this.f72854i = aVar;
            this.f72855j = false;
        }

        public /* synthetic */ c(boolean z, String str, long j2, a aVar, byte b2) {
            this(z, str, j2, aVar);
        }
    }

    static {
        Covode.recordClassIndex(44873);
    }

    public static final void a() {
        c cVar = f72844b;
        if (cVar != null) {
            cVar.f72851f = System.currentTimeMillis();
            c cVar2 = f72844b;
            if (cVar2 != null) {
                cVar2.f72855j = true;
            }
            j.a("CommentPageLoadTimer: beginNetworkLoad()");
        }
    }

    public static void b() {
        c cVar;
        if (h.a() && (cVar = f72844b) != null && cVar.b() >= 0) {
            c cVar2 = f72844b;
            if (cVar2 == null) {
                l.b();
            }
            if (cVar2.a() >= 0) {
                c cVar3 = f72844b;
                if (cVar3 == null) {
                    l.b();
                }
                if (cVar3.c() >= 0) {
                    JSONObject jSONObject = new JSONObject();
                    c cVar4 = f72844b;
                    if (cVar4 == null) {
                        l.b();
                    }
                    jSONObject.put("need_refresh", cVar4.f72846a);
                    JSONObject jSONObject2 = new JSONObject();
                    c cVar5 = f72844b;
                    if (cVar5 == null) {
                        l.b();
                    }
                    jSONObject2.put("is_first", cVar5.f72846a);
                    c cVar6 = f72844b;
                    if (cVar6 == null) {
                        l.b();
                    }
                    jSONObject2.put("list_count", cVar6.f72849d);
                    c cVar7 = f72844b;
                    if (cVar7 == null) {
                        l.b();
                    }
                    String str = cVar7.f72847b;
                    String str2 = "";
                    if (str == null) {
                        str = str2;
                    }
                    jSONObject2.put("event_type", str);
                    jSONObject2.put("duration", c());
                    c cVar8 = f72844b;
                    if (cVar8 == null) {
                        l.b();
                    }
                    jSONObject2.put("start_duration", cVar8.a());
                    c cVar9 = f72844b;
                    if (cVar9 == null) {
                        l.b();
                    }
                    jSONObject2.put("view_duration", cVar9.c());
                    c cVar10 = f72844b;
                    if (cVar10 == null) {
                        l.b();
                    }
                    jSONObject2.put("request_duration", cVar10.b());
                    StringBuilder append = new StringBuilder("CommentPageLoadTimer: uploadApmAgent(): duration = ").append(c()).append(" phase1 = ");
                    c cVar11 = f72844b;
                    if (cVar11 == null) {
                        l.b();
                    }
                    StringBuilder append2 = append.append(cVar11.a()).append(" phase2 = ");
                    c cVar12 = f72844b;
                    if (cVar12 == null) {
                        l.b();
                    }
                    StringBuilder append3 = append2.append(cVar12.b()).append(" phase3 = ");
                    c cVar13 = f72844b;
                    if (cVar13 == null) {
                        l.b();
                    }
                    StringBuilder append4 = append3.append(cVar13.c()).append(" is_first = ");
                    c cVar14 = f72844b;
                    if (cVar14 == null) {
                        l.b();
                    }
                    StringBuilder append5 = append4.append(cVar14.f72846a).append(" list_count = ");
                    c cVar15 = f72844b;
                    if (cVar15 == null) {
                        l.b();
                    }
                    StringBuilder append6 = append5.append(cVar15.f72849d).append(" event_type = ");
                    c cVar16 = f72844b;
                    if (cVar16 == null) {
                        l.b();
                    }
                    String str3 = cVar16.f72847b;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    j.a(append6.append(str2).toString());
                    com.bytedance.apm.b.a("comment_page_load_time", jSONObject, (JSONObject) null, jSONObject2);
                }
            }
        }
    }

    public static final void a(int i2) {
        a aVar;
        long j2;
        c cVar = f72844b;
        if (cVar != null) {
            cVar.f72852g = System.currentTimeMillis();
            c cVar2 = f72844b;
            if (cVar2 != null) {
                cVar2.f72849d = i2;
            }
            j.a("CommentPageLoadTimer: onDataLoadSuccess(), commentCount = ".concat(String.valueOf(i2)));
            if (i2 == 0) {
                c cVar3 = f72844b;
                if (!(cVar3 == null || (aVar = cVar3.f72854i) == null)) {
                    c cVar4 = f72844b;
                    if (cVar4 != null) {
                        j2 = cVar4.d();
                    } else {
                        j2 = -1;
                    }
                    aVar.a(j2, true, i2);
                }
                b();
                f72844b = null;
            }
        }
    }

    public static final class d implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Aweme f72856a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f72857b;

        static {
            Covode.recordClassIndex(44877);
        }

        d(Aweme aweme, h hVar) {
            this.f72856a = aweme;
            this.f72857b = hVar;
        }

        @Override // com.ss.android.ugc.aweme.comment.util.k.a
        public final void a(long j2, boolean z, int i2) {
            String str;
            String str2;
            com.ss.android.ugc.aweme.cc.b bVar;
            String str3;
            Aweme aweme = this.f72856a;
            if (aweme != null) {
                if (!z) {
                    str = "fail";
                } else if (i2 == 0) {
                    str = "empty";
                } else {
                    str = "success";
                }
                String aid = aweme.getAid();
                String authorUid = this.f72856a.getAuthorUid();
                h hVar = this.f72857b;
                if (hVar != null) {
                    str2 = hVar.getEnterFrom();
                } else {
                    str2 = null;
                }
                com.ss.android.ugc.aweme.comment.m.c.a(aid, authorUid, str2, str, j2);
                if (z) {
                    bVar = com.ss.android.ugc.aweme.cc.b.SUCCESS;
                } else {
                    bVar = com.ss.android.ugc.aweme.cc.b.FAIL;
                }
                int i3 = !z ? 1 : 0;
                h hVar2 = this.f72857b;
                if (hVar2 == null || (str3 = hVar2.getEnterFrom()) == null) {
                    str3 = "";
                }
                k.a(UGCMonitor.EVENT_COMMENT, i3, str3, false);
                com.ss.android.ugc.aweme.cc.c.a(UGCMonitor.EVENT_COMMENT, bVar, 4);
            }
        }
    }

    public static final a a(Aweme aweme, h hVar) {
        return new d(aweme, hVar);
    }

    public static final void a(boolean z, String str, a aVar) {
        l.d(str, "");
        com.ss.android.ugc.aweme.cc.c.a(UGCMonitor.EVENT_COMMENT);
        j.a("CommentPageLoadTimer: beginRecord(): isFirstShow = " + z + ", eventType=" + str);
        f72843a.removeCallbacksAndMessages(null);
        f72844b = new c(z, str, System.currentTimeMillis(), aVar, (byte) 0);
    }

    public static final void a(String str, int i2, String str2, boolean z) {
        long g2;
        long j2;
        l.d(str, "");
        l.d(str2, "");
        c cVar = f72844b;
        if (cVar != null && cVar.f72855j) {
            c cVar2 = f72844b;
            if (cVar2 != null) {
                cVar2.f72855j = false;
            }
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("page_type", str).a("result", i2).a("enter_from", str2);
            if (!z) {
                g2 = c();
            } else {
                g2 = g();
            }
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("duration", g2).a("duration_before_network", d());
            long j3 = -1;
            if (!z) {
                j2 = e();
            } else {
                j2 = -1;
            }
            com.ss.android.ugc.aweme.app.f.d a4 = a3.a("duration_network", j2);
            if (!z) {
                j3 = f();
            }
            r.a("page_load_time", a4.a("duration_after_network", j3).f66730a);
        }
    }
}
