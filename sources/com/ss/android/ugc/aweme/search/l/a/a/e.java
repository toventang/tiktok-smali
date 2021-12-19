package com.ss.android.ugc.aweme.search.l.a.a;

import com.bytedance.android.alog.c;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.search.l.a.b;
import h.f.b.l;
import java.util.HashMap;

public final class e extends a {

    /* renamed from: i  reason: collision with root package name */
    public static final a f121328i = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public String f121329b;

    /* renamed from: c  reason: collision with root package name */
    public Integer f121330c;

    /* renamed from: d  reason: collision with root package name */
    public Integer f121331d = -2;

    /* renamed from: e  reason: collision with root package name */
    public Integer f121332e;

    /* renamed from: f  reason: collision with root package name */
    public Integer f121333f;

    /* renamed from: g  reason: collision with root package name */
    public Integer f121334g;

    /* renamed from: h  reason: collision with root package name */
    public String f121335h;

    static {
        Covode.recordClassIndex(79071);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(79072);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final String toString() {
        return "SearchChainStatus(status=" + this.f121333f + ", errorCode=" + this.f121334g + ", errorDesc=" + this.f121335h + ')';
    }

    public final void a(Integer num) {
        if (this.f121330c == null) {
            this.f121330c = num;
            String str = num;
            if (num == null) {
                str = "";
            }
            a("request_type", str);
        }
    }

    public final void a(int i2) {
        this.f121333f = Integer.valueOf(i2);
        HashMap<String, Object> hashMap = this.f121307a;
        Object obj = this.f121333f;
        if (obj == null) {
            obj = "";
        }
        hashMap.put("status", obj);
    }

    public final void b(int i2) {
        int i3;
        this.f121334g = Integer.valueOf(i2);
        HashMap<String, Object> hashMap = this.f121307a;
        Integer num = this.f121334g;
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = -1;
        }
        hashMap.put("error_code", Integer.valueOf(i3));
    }

    public final void a(String str) {
        this.f121335h = str;
        HashMap<String, Object> hashMap = this.f121307a;
        String str2 = this.f121335h;
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("error_desc", str2);
    }

    public final void a(Throwable th) {
        com.ss.android.ugc.aweme.search.l.a.a.f121303d.b();
        b.a(this, th);
        Integer num = this.f121333f;
        if (num == null || num.intValue() != 0) {
            c.a(1, "SearchEventTrackerV2", "markThrowableStatus");
            com.ss.android.ugc.aweme.search.l.a.a.f121305f.a();
        }
    }

    public final void a(int i2, String str) {
        l.d(str, "");
        if (com.ss.android.ugc.aweme.search.l.a.a.f121303d.d()) {
            c.a(1, "SearchEventTrackerV2", "markCanceled: isFinishNetwork");
            com.ss.android.ugc.aweme.search.l.a.a.f121305f.a();
        } else {
            a(1, i2, "cancel, from: ".concat(String.valueOf(str)));
        }
        com.ss.android.ugc.aweme.search.l.a.a.f121301b = true;
    }

    public final void a(int i2, int i3, String str) {
        c.a(1, "SearchEventTrackerV2", "mark: status = " + i2 + ", errorCode = " + i3 + ", errorDesc: " + str);
        a(i2);
        b(i3);
        if (str == null) {
            str = "not define";
        }
        a(str);
        if (i2 != 0) {
            com.ss.android.ugc.aweme.search.l.a.a.f121305f.a();
        }
    }
}
