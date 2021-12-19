package com.bytedance.ies.xelement.picker.b;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.picker.c.a;
import com.bytedance.ies.xelement.picker.c.c;
import com.bytedance.ies.xelement.picker.e.j;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public final class d extends a<d> {

    /* renamed from: a  reason: collision with root package name */
    private c f37251a;

    /* renamed from: b  reason: collision with root package name */
    private String f37252b = ":";

    /* renamed from: c  reason: collision with root package name */
    private String f37253c;

    /* renamed from: d  reason: collision with root package name */
    private String f37254d;

    /* renamed from: e  reason: collision with root package name */
    private String f37255e;

    static {
        Covode.recordClassIndex(22401);
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.ies.xelement.picker.b.a
    public final a a() {
        return this.f37251a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        if (r2 != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String c() {
        /*
            r7 = this;
            com.bytedance.ies.xelement.picker.c.c r0 = r7.f37251a
            boolean[] r2 = r0.G
            java.lang.String r6 = "mm"
            java.lang.String r5 = "HH"
            if (r2 == 0) goto L_0x000e
            int r1 = r2.length
            r0 = 3
            if (r1 == r0) goto L_0x0022
        L_0x000e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            java.lang.String r0 = r7.f37252b
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x0022:
            r0 = 0
            boolean r4 = r2[r0]
            r0 = 1
            boolean r3 = r2[r0]
            r0 = 2
            boolean r2 = r2[r0]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r4 == 0) goto L_0x003e
            r1.append(r5)
            if (r3 != 0) goto L_0x0039
            if (r2 == 0) goto L_0x004f
        L_0x0039:
            java.lang.String r0 = r7.f37252b
            r1.append(r0)
        L_0x003e:
            if (r3 == 0) goto L_0x0054
            r1.append(r6)
            if (r2 == 0) goto L_0x004f
            java.lang.String r0 = r7.f37252b
            r1.append(r0)
        L_0x004a:
            java.lang.String r0 = "ss"
            r1.append(r0)
        L_0x004f:
            java.lang.String r0 = r1.toString()
            return r0
        L_0x0054:
            if (r2 == 0) goto L_0x004f
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.picker.b.d.c():java.lang.String");
    }

    public final com.bytedance.ies.xelement.picker.view.d b() {
        SimpleDateFormat simpleDateFormat;
        this.f37251a.Y = this.f37252b;
        try {
            simpleDateFormat = new SimpleDateFormat(c(), Locale.getDefault());
        } catch (Exception unused) {
            String str = this.f37254d;
            if (str != null) {
                this.f37254d = str.replace(this.f37252b, ":");
            }
            String str2 = this.f37255e;
            if (str2 != null) {
                this.f37255e = str2.replace(this.f37252b, ":");
            }
            String str3 = this.f37253c;
            if (str3 != null) {
                this.f37253c = str3.replace(this.f37252b, ":");
            }
            this.f37252b = ":";
            simpleDateFormat = new SimpleDateFormat(c(), Locale.getDefault());
        }
        String str4 = this.f37254d;
        if (str4 != null) {
            try {
                Date parse = simpleDateFormat.parse(str4);
                this.f37251a.I = Calendar.getInstance();
                this.f37251a.I.setTime(parse);
            } catch (ParseException unused2) {
            }
        }
        if (this.f37251a.I == null) {
            this.f37251a.I = Calendar.getInstance();
            this.f37251a.I.set(LiveNetAdaptiveHurryTimeSetting.DEFAULT, 0, 1, 0, 0, 0);
        }
        String str5 = this.f37255e;
        if (str5 != null) {
            try {
                Date parse2 = simpleDateFormat.parse(str5);
                this.f37251a.J = Calendar.getInstance();
                this.f37251a.J.setTimeInMillis(parse2.getTime());
            } catch (ParseException unused3) {
            }
        }
        if (this.f37251a.J == null) {
            this.f37251a.J = Calendar.getInstance();
            this.f37251a.J.set(LiveNetAdaptiveHurryTimeSetting.DEFAULT, 0, 1, 23, 59, 59);
        }
        String str6 = this.f37253c;
        if (str6 != null) {
            try {
                Date parse3 = simpleDateFormat.parse(str6);
                this.f37251a.H = Calendar.getInstance();
                this.f37251a.H.setTime(parse3);
            } catch (ParseException unused4) {
            }
        }
        if (this.f37251a.H == null) {
            this.f37251a.H = Calendar.getInstance();
        }
        return new com.bytedance.ies.xelement.picker.view.d(this.f37251a);
    }

    public final d d(String str) {
        this.f37253c = str;
        return this;
    }

    public final d a(com.bytedance.ies.xelement.c.a aVar) {
        this.f37251a.X = aVar;
        return this;
    }

    public final d a(j jVar) {
        this.f37251a.D = jVar;
        return this;
    }

    public final d c(String str) {
        if (str == null) {
            this.f37252b = ":";
        } else {
            this.f37252b = str;
        }
        return this;
    }

    public d(Context context) {
        c cVar = new c();
        this.f37251a = cVar;
        cVar.f37261f = context;
    }

    public final d b(String str) {
        if ("hour".equals(str)) {
            this.f37251a.G = new boolean[]{true, false, false};
        } else if ("minute".equals(str)) {
            this.f37251a.G = new boolean[]{true, true, false};
        } else if ("second".equals(str)) {
            this.f37251a.G = new boolean[]{true, true, true};
        } else {
            this.f37251a.G = new boolean[]{true, true, false};
        }
        return this;
    }

    public final d a(String str, String str2) {
        this.f37254d = str;
        this.f37255e = str2;
        return this;
    }
}
