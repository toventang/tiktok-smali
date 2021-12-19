package com.ss.android.ugc.aweme.util;

import android.text.style.ForegroundColorSpan;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.setting.x;
import h.a.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f142510a = new l();

    private l() {
    }

    static {
        Covode.recordClassIndex(93203);
    }

    public static List<b> a(String str) {
        String str2;
        h.f.b.l.d(str, "");
        List<String> c2 = x.c();
        if (c2 == null || c2.isEmpty()) {
            return z.INSTANCE;
        }
        int length = str.length();
        Boolean[] boolArr = new Boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            boolArr[i2] = false;
        }
        Iterator<T> it = x.c().iterator();
        while (it.hasNext()) {
            Matcher matcher = Pattern.compile(it.next()).matcher(str);
            while (matcher.find()) {
                int end = matcher.end();
                for (int start = matcher.start(); start < end; start++) {
                    boolArr[start] = true;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < length; i3++) {
            if (boolArr[i3].booleanValue()) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            sb.append(str2);
        }
        Matcher matcher2 = Pattern.compile("1+").matcher(sb);
        while (matcher2.find()) {
            arrayList.add(new b(matcher2.start(), matcher2.end()));
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0086, code lost:
        r6.add(new com.ss.android.ugc.aweme.util.l.a(new android.text.style.ForegroundColorSpan(r8), r9.f142514a, r9.f142515b));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.widget.TextView r13) {
        /*
        // Method dump skipped, instructions count: 238
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.util.l.a(android.widget.TextView):boolean");
    }

    public static final class b {
        @c(a = "start")

        /* renamed from: a  reason: collision with root package name */
        public final int f142514a;
        @c(a = "end")

        /* renamed from: b  reason: collision with root package name */
        public final int f142515b;

        static {
            Covode.recordClassIndex(93205);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f142514a == bVar.f142514a && this.f142515b == bVar.f142515b;
        }

        public final int hashCode() {
            return (this.f142514a * 31) + this.f142515b;
        }

        public final String toString() {
            return "HighlightInfo(start=" + this.f142514a + ", end=" + this.f142515b + ")";
        }

        public b(int i2, int i3) {
            this.f142514a = i2;
            this.f142515b = i3;
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final ForegroundColorSpan f142511a;

        /* renamed from: b  reason: collision with root package name */
        public final int f142512b;

        /* renamed from: c  reason: collision with root package name */
        public final int f142513c;

        static {
            Covode.recordClassIndex(93204);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.f.b.l.a(this.f142511a, aVar.f142511a) && this.f142512b == aVar.f142512b && this.f142513c == aVar.f142513c;
        }

        public final int hashCode() {
            ForegroundColorSpan foregroundColorSpan = this.f142511a;
            return ((((foregroundColorSpan != null ? foregroundColorSpan.hashCode() : 0) * 31) + this.f142512b) * 31) + this.f142513c;
        }

        public final String toString() {
            return "HighLightSpan(span=" + this.f142511a + ", start=" + this.f142512b + ", end=" + this.f142513c + ")";
        }

        public a(ForegroundColorSpan foregroundColorSpan, int i2, int i3) {
            h.f.b.l.d(foregroundColorSpan, "");
            this.f142511a = foregroundColorSpan;
            this.f142512b = i2;
            this.f142513c = i3;
        }
    }
}
