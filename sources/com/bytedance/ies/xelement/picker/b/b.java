package com.bytedance.ies.xelement.picker.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.picker.c.a;
import com.bytedance.ies.xelement.picker.c.c;
import com.bytedance.ies.xelement.picker.e.j;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public final class b extends a<b> {

    /* renamed from: a  reason: collision with root package name */
    private c f37245a;

    /* renamed from: b  reason: collision with root package name */
    private String f37246b = "-";

    /* renamed from: c  reason: collision with root package name */
    private String f37247c;

    /* renamed from: d  reason: collision with root package name */
    private String f37248d;

    /* renamed from: e  reason: collision with root package name */
    private String f37249e;

    static {
        Covode.recordClassIndex(22399);
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.ies.xelement.picker.b.a
    public final a a() {
        return this.f37245a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (r2 != false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String c() {
        /*
            r8 = this;
            com.bytedance.ies.xelement.picker.c.c r0 = r8.f37245a
            boolean[] r2 = r0.F
            java.lang.String r5 = "dd"
            java.lang.String r6 = "MM"
            java.lang.String r7 = "yyyy"
            if (r2 == 0) goto L_0x0010
            int r1 = r2.length
            r0 = 3
            if (r1 == r0) goto L_0x002e
        L_0x0010:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r7)
            java.lang.String r0 = r8.f37246b
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r1 = r0.append(r6)
            java.lang.String r0 = r8.f37246b
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x002e:
            r0 = 0
            boolean r4 = r2[r0]
            r0 = 1
            boolean r3 = r2[r0]
            r0 = 2
            boolean r2 = r2[r0]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r4 == 0) goto L_0x004a
            r1.append(r7)
            if (r3 != 0) goto L_0x0045
            if (r2 == 0) goto L_0x0059
        L_0x0045:
            java.lang.String r0 = r8.f37246b
            r1.append(r0)
        L_0x004a:
            if (r3 == 0) goto L_0x005e
            r1.append(r6)
            if (r2 == 0) goto L_0x0059
            java.lang.String r0 = r8.f37246b
            r1.append(r0)
        L_0x0056:
            r1.append(r5)
        L_0x0059:
            java.lang.String r0 = r1.toString()
            return r0
        L_0x005e:
            if (r2 == 0) goto L_0x0059
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.picker.b.b.c():java.lang.String");
    }

    public final com.bytedance.ies.xelement.picker.view.b b() {
        SimpleDateFormat simpleDateFormat;
        this.f37245a.Y = this.f37246b;
        try {
            simpleDateFormat = new SimpleDateFormat(c(), Locale.getDefault());
        } catch (Exception unused) {
            String str = this.f37248d;
            if (str != null) {
                this.f37248d = str.replace(this.f37246b, "-");
            }
            String str2 = this.f37249e;
            if (str2 != null) {
                this.f37249e = str2.replace(this.f37246b, "-");
            }
            String str3 = this.f37247c;
            if (str3 != null) {
                this.f37247c = str3.replace(this.f37246b, "-");
            }
            this.f37246b = "-";
            simpleDateFormat = new SimpleDateFormat(c(), Locale.getDefault());
        }
        String str4 = this.f37248d;
        if (str4 != null) {
            try {
                Date parse = simpleDateFormat.parse(str4);
                this.f37245a.I = Calendar.getInstance();
                this.f37245a.I.setTime(parse);
            } catch (ParseException unused2) {
            }
        }
        String str5 = this.f37249e;
        if (str5 != null) {
            try {
                Date parse2 = simpleDateFormat.parse(str5);
                this.f37245a.J = Calendar.getInstance();
                this.f37245a.J.setTime(parse2);
            } catch (ParseException unused3) {
            }
        }
        String str6 = this.f37247c;
        if (str6 != null) {
            try {
                Date parse3 = simpleDateFormat.parse(str6);
                this.f37245a.H = Calendar.getInstance();
                this.f37245a.H.setTime(parse3);
            } catch (ParseException unused4) {
            }
        }
        return new com.bytedance.ies.xelement.picker.view.b(this.f37245a);
    }

    public final b d(String str) {
        this.f37247c = str;
        return this;
    }

    public final b a(com.bytedance.ies.xelement.c.a aVar) {
        this.f37245a.X = aVar;
        return this;
    }

    public final b a(j jVar) {
        this.f37245a.D = jVar;
        return this;
    }

    public final b c(String str) {
        if (str == null) {
            this.f37246b = "-";
        } else {
            this.f37246b = str;
        }
        return this;
    }

    public b(Context context) {
        c cVar = new c();
        this.f37245a = cVar;
        cVar.f37261f = context;
    }

    public final b b(String str) {
        if ("year".equals(str)) {
            this.f37245a.F = new boolean[]{true, false, false};
        } else if ("month".equals(str)) {
            this.f37245a.F = new boolean[]{true, true, false};
        } else if ("day".equals(str)) {
            this.f37245a.F = new boolean[]{true, true, true};
        } else {
            this.f37245a.G = new boolean[]{true, true, true};
        }
        return this;
    }

    public final b a(String str, String str2) {
        this.f37248d = str;
        this.f37249e = str2;
        return this;
    }
}
