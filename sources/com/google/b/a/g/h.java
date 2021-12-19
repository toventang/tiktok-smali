package com.google.b.a.g;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.regex.Pattern;

public final class h implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private static final TimeZone f53654a = TimeZone.getTimeZone("GMT");

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f53655b = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})([Tt](\\d{2}):(\\d{2}):(\\d{2})(\\.\\d+)?)?([Zz]|([+-])(\\d{2}):(\\d{2}))?");
    private static final long serialVersionUID = 1;
    private final boolean dateOnly;
    private final int tzShift;
    private final long value;

    public final int getTimeZoneShift() {
        return this.tzShift;
    }

    public final long getValue() {
        return this.value;
    }

    public final boolean isDateOnly() {
        return this.dateOnly;
    }

    public final String toString() {
        return toStringRfc3339();
    }

    static {
        Covode.recordClassIndex(33187);
    }

    public final int hashCode() {
        long j2;
        long[] jArr = new long[3];
        jArr[0] = this.value;
        if (this.dateOnly) {
            j2 = serialVersionUID;
        } else {
            j2 = 0;
        }
        jArr[1] = j2;
        jArr[2] = (long) this.tzShift;
        return Arrays.hashCode(jArr);
    }

    public final String toStringRfc3339() {
        StringBuilder sb = new StringBuilder();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f53654a);
        gregorianCalendar.setTimeInMillis(this.value + (((long) this.tzShift) * 60000));
        a(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        a(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        a(sb, gregorianCalendar.get(5), 2);
        if (!this.dateOnly) {
            sb.append('T');
            a(sb, gregorianCalendar.get(11), 2);
            sb.append(':');
            a(sb, gregorianCalendar.get(12), 2);
            sb.append(':');
            a(sb, gregorianCalendar.get(13), 2);
            if (gregorianCalendar.isSet(14)) {
                sb.append('.');
                a(sb, gregorianCalendar.get(14), 3);
            }
            int i2 = this.tzShift;
            if (i2 == 0) {
                sb.append('Z');
            } else {
                if (i2 > 0) {
                    sb.append('+');
                } else {
                    sb.append('-');
                    i2 = -i2;
                }
                a(sb, i2 / 60, 2);
                sb.append(':');
                a(sb, i2 % 60, 2);
            }
        }
        return sb.toString();
    }

    public h(long j2) {
        this(false, j2, null);
    }

    public h(String str) {
        h parseRfc3339 = parseRfc3339(str);
        this.dateOnly = parseRfc3339.dateOnly;
        this.value = parseRfc3339.value;
        this.tzShift = parseRfc3339.tzShift;
    }

    public h(Date date) {
        this(date.getTime());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.dateOnly == hVar.dateOnly && this.value == hVar.value && this.tzShift == hVar.tzShift) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.b.a.g.h parseRfc3339(java.lang.String r17) {
        /*
        // Method dump skipped, instructions count: 307
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.b.a.g.h.parseRfc3339(java.lang.String):com.google.b.a.g.h");
    }

    public h(long j2, int i2) {
        this(false, j2, Integer.valueOf(i2));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(java.util.Date r5, java.util.TimeZone r6) {
        /*
            r4 = this;
            long r2 = r5.getTime()
            if (r6 != 0) goto L_0x000c
            r1 = 0
        L_0x0007:
            r0 = 0
            r4.<init>(r0, r2, r1)
            return
        L_0x000c:
            long r0 = r5.getTime()
            int r1 = r6.getOffset(r0)
            r0 = 60000(0xea60, float:8.4078E-41)
            int r1 = r1 / r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.b.a.g.h.<init>(java.util.Date, java.util.TimeZone):void");
    }

    private static void a(StringBuilder sb, int i2, int i3) {
        if (i2 < 0) {
            sb.append('-');
            i2 = -i2;
        }
        int i4 = i2;
        while (i4 > 0) {
            i4 /= 10;
            i3--;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            sb.append('0');
        }
        if (i2 != 0) {
            sb.append(i2);
        }
    }

    public h(boolean z, long j2, Integer num) {
        int intValue;
        this.dateOnly = z;
        this.value = j2;
        if (z) {
            intValue = 0;
        } else if (num == null) {
            intValue = TimeZone.getDefault().getOffset(j2) / 60000;
        } else {
            intValue = num.intValue();
        }
        this.tzShift = intValue;
    }
}
