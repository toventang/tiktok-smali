package com.lynx.component.svg.a;

import android.graphics.Matrix;
import com.appsflyer.BuildConfig;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.component.svg.a.a;
import com.lynx.component.svg.a.d;
import com.lynx.component.svg.a.f;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.utils.ColorUtils;
import com.lynx.tasm.utils.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.xml.sax.Attributes;
import org.xmlpull.v1.XmlPullParser;

/* access modifiers changed from: package-private */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private f f55386a;

    /* renamed from: b  reason: collision with root package name */
    private f.ae f55387b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f55388c;

    /* renamed from: d  reason: collision with root package name */
    private int f55389d;

    static {
        Covode.recordClassIndex(34694);
    }

    i() {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0033 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.lynx.component.svg.a.f a(java.io.InputStream r4) {
        /*
            r3 = this;
            r2 = 6532(0x1984, float:9.153E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r2)
            boolean r0 = r4.markSupported()
            if (r0 != 0) goto L_0x0011
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r0.<init>(r4)
            r4 = r0
        L_0x0011:
            r0 = 3
            r4.mark(r0)     // Catch:{ IOException -> 0x0033 }
            int r1 = r4.read()     // Catch:{ IOException -> 0x0033 }
            int r0 = r4.read()     // Catch:{ IOException -> 0x0033 }
            int r0 = r0 << 8
            int r1 = r1 + r0
            r4.reset()     // Catch:{ IOException -> 0x0033 }
            r0 = 35615(0x8b1f, float:4.9907E-41)
            if (r1 != r0) goto L_0x0033
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0033 }
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0033 }
            r0.<init>(r4)     // Catch:{ IOException -> 0x0033 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0033 }
            r4 = r1
        L_0x0033:
            r3.b(r4)     // Catch:{ all -> 0x003f }
            com.lynx.component.svg.a.f r0 = r3.f55386a     // Catch:{ all -> 0x003f }
            r4.close()     // Catch:{ IOException -> 0x003b }
        L_0x003b:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            return r0
        L_0x003f:
            r0 = move-exception
            r4.close()     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.component.svg.a.i.a(java.io.InputStream):com.lynx.component.svg.a.f");
    }

    private static void a(f.ao aoVar, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            int i3 = AnonymousClass1.f55391b[b.a(attributes.getLocalName(i2)).ordinal()];
            if (i3 == 1) {
                aoVar.f55293c = c(trim);
            } else if (i3 == 2) {
                aoVar.f55294d = c(trim);
            } else if (i3 == 3) {
                aoVar.f55295e = c(trim);
                if (aoVar.f55295e.b()) {
                    throw new h("Invalid <use> element. width cannot be negative");
                }
            } else if (i3 == 4) {
                aoVar.f55296f = c(trim);
                if (aoVar.f55296f.b()) {
                    throw new h("Invalid <use> element. height cannot be negative");
                }
            } else if (i3 == 6 && ("".equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2)))) {
                aoVar.f55292a = trim;
            }
        }
    }

    private static void a(f.n nVar, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            int i3 = AnonymousClass1.f55391b[b.a(attributes.getLocalName(i2)).ordinal()];
            if (i3 == 1) {
                nVar.f55325b = c(trim);
            } else if (i3 == 2) {
                nVar.f55326c = c(trim);
            } else if (i3 == 3) {
                nVar.f55327d = c(trim);
                if (nVar.f55327d.b()) {
                    throw new h("Invalid <use> element. width cannot be negative");
                }
            } else if (i3 == 4) {
                nVar.f55328e = c(trim);
                if (nVar.f55328e.b()) {
                    throw new h("Invalid <use> element. height cannot be negative");
                }
            } else if (i3 != 6) {
                if (i3 == 7) {
                    a(nVar, trim);
                }
            } else if ("".equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2))) {
                nVar.f55324a = trim;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x0075 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0205  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.lynx.component.svg.a.f.s r23, org.xml.sax.Attributes r24) {
        /*
        // Method dump skipped, instructions count: 654
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.component.svg.a.i.a(com.lynx.component.svg.a.f$s, org.xml.sax.Attributes):void");
    }

    private static void a(f.y yVar, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            int i3 = AnonymousClass1.f55391b[b.a(attributes.getLocalName(i2)).ordinal()];
            if (i3 == 1) {
                yVar.f55353a = c(trim);
            } else if (i3 == 2) {
                yVar.f55354b = c(trim);
            } else if (i3 == 3) {
                yVar.f55355c = c(trim);
                if (yVar.f55355c.b()) {
                    throw new h("Invalid <rect> element. width cannot be negative");
                }
            } else if (i3 == 4) {
                yVar.f55356d = c(trim);
                if (yVar.f55356d.b()) {
                    throw new h("Invalid <rect> element. height cannot be negative");
                }
            } else if (i3 == 10) {
                yVar.f55357f = c(trim);
                if (yVar.f55357f.b()) {
                    throw new h("Invalid <rect> element. rx cannot be negative");
                }
            } else if (i3 != 11) {
                continue;
            } else {
                yVar.f55358g = c(trim);
                if (yVar.f55358g.b()) {
                    throw new h("Invalid <rect> element. ry cannot be negative");
                }
            }
        }
    }

    private static void a(f.c cVar, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            switch (AnonymousClass1.f55391b[b.a(attributes.getLocalName(i2)).ordinal()]) {
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    cVar.f55301a = c(trim);
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    cVar.f55302b = c(trim);
                    break;
                case ABRConfig.ABR_SELECT_SCENE:
                    cVar.f55303c = c(trim);
                    if (!cVar.f55303c.b()) {
                        break;
                    } else {
                        throw new h("Invalid <circle> element. r cannot be negative");
                    }
            }
        }
    }

    private static void a(f.h hVar, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            switch (AnonymousClass1.f55391b[b.a(attributes.getLocalName(i2)).ordinal()]) {
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    hVar.f55311c = c(trim);
                    if (!hVar.f55311c.b()) {
                        break;
                    } else {
                        throw new h("Invalid <ellipse> element. rx cannot be negative");
                    }
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    hVar.f55312d = c(trim);
                    if (!hVar.f55312d.b()) {
                        break;
                    } else {
                        throw new h("Invalid <ellipse> element. ry cannot be negative");
                    }
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    hVar.f55309a = c(trim);
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    hVar.f55310b = c(trim);
                    break;
            }
        }
    }

    private static void a(f.p pVar, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            switch (AnonymousClass1.f55391b[b.a(attributes.getLocalName(i2)).ordinal()]) {
                case 15:
                    pVar.f55332a = c(trim);
                    break;
                case 16:
                    pVar.f55333b = c(trim);
                    break;
                case 17:
                    pVar.f55334c = c(trim);
                    break;
                case LiveRechargeAgeThresholdSetting.DEFAULT:
                    pVar.f55335d = c(trim);
                    break;
            }
        }
    }

    private static void a(f.w wVar, Attributes attributes, String str) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            if (b.a(attributes.getLocalName(i2)) == b.points) {
                d dVar = new d(attributes.getValue(i2));
                ArrayList<Float> arrayList = new ArrayList();
                dVar.b();
                while (!dVar.a()) {
                    float d2 = dVar.d();
                    if (!Float.isNaN(d2)) {
                        dVar.c();
                        float d3 = dVar.d();
                        if (!Float.isNaN(d3)) {
                            dVar.c();
                            arrayList.add(Float.valueOf(d2));
                            arrayList.add(Float.valueOf(d3));
                        } else {
                            throw new h("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                        }
                    } else {
                        throw new h("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                }
                wVar.f55352a = new float[arrayList.size()];
                int i3 = 0;
                for (Float f2 : arrayList) {
                    wVar.f55352a[i3] = f2.floatValue();
                    i3++;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0026, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.lynx.component.svg.a.f.i r5, org.xml.sax.Attributes r6) {
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.component.svg.a.i.a(com.lynx.component.svg.a.f$i, org.xml.sax.Attributes):void");
    }

    private static void a(f.ah ahVar, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            switch (AnonymousClass1.f55391b[b.a(attributes.getLocalName(i2)).ordinal()]) {
                case 15:
                    ahVar.f55271f = c(trim);
                    break;
                case 16:
                    ahVar.f55272g = c(trim);
                    break;
                case 17:
                    ahVar.f55273h = c(trim);
                    break;
                case LiveRechargeAgeThresholdSetting.DEFAULT:
                    ahVar.f55274i = c(trim);
                    break;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.lynx.component.svg.a.f.al r4, org.xml.sax.Attributes r5) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.component.svg.a.i.a(com.lynx.component.svg.a.f$al, org.xml.sax.Attributes):void");
    }

    private static void a(f.d dVar, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            if (AnonymousClass1.f55391b[b.a(attributes.getLocalName(i2)).ordinal()] == 25) {
                if ("objectBoundingBox".equals(trim)) {
                    dVar.f55304a = false;
                } else if ("userSpaceOnUse".equals(trim)) {
                    dVar.f55304a = true;
                } else {
                    throw new h("Invalid value for attribute clipPathUnits");
                }
            }
        }
    }

    private static void a(f.v vVar, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            int i3 = AnonymousClass1.f55391b[b.a(attributes.getLocalName(i2)).ordinal()];
            if (i3 == 1) {
                vVar.f55347d = c(trim);
            } else if (i3 == 2) {
                vVar.f55348e = c(trim);
            } else if (i3 == 3) {
                vVar.f55349f = c(trim);
                if (vVar.f55349f.b()) {
                    throw new h("Invalid <pattern> element. width cannot be negative");
                }
            } else if (i3 == 4) {
                vVar.f55350g = c(trim);
                if (vVar.f55350g.b()) {
                    throw new h("Invalid <pattern> element. height cannot be negative");
                }
            } else if (i3 != 6) {
                switch (i3) {
                    case 26:
                        if (!"objectBoundingBox".equals(trim)) {
                            if ("userSpaceOnUse".equals(trim)) {
                                vVar.f55344a = true;
                                break;
                            } else {
                                break;
                            }
                        } else {
                            vVar.f55344a = false;
                            continue;
                        }
                    case 27:
                        if (!"objectBoundingBox".equals(trim)) {
                            if ("userSpaceOnUse".equals(trim)) {
                                vVar.f55345b = true;
                                break;
                            } else {
                                break;
                            }
                        } else {
                            vVar.f55345b = false;
                            continue;
                        }
                    case 28:
                        vVar.f55346c = b(trim);
                        continue;
                }
            } else if ("".equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2))) {
                vVar.f55351h = trim;
            }
        }
    }

    private static void a(f.am amVar, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            int i3 = AnonymousClass1.f55391b[b.a(attributes.getLocalName(i2)).ordinal()];
            if (i3 == 7) {
                a(amVar, trim);
            } else if (i3 != 57) {
                continue;
            } else {
                d dVar = new d(trim);
                dVar.b();
                float b2 = n.b(dVar.i(), 0.0f);
                dVar.c();
                float b3 = n.b(dVar.i(), 0.0f);
                dVar.c();
                float b4 = n.b(dVar.i(), 0.0f);
                dVar.c();
                float b5 = n.b(dVar.i(), 0.0f);
                if (Float.isNaN(b2) || Float.isNaN(b3) || Float.isNaN(b4) || Float.isNaN(b5)) {
                    throw new h("Invalid viewBox definition - should have four numbers");
                } else if (b4 < 0.0f) {
                    throw new h("Invalid viewBox. width cannot be negative");
                } else if (b5 >= 0.0f) {
                    amVar.r = new f.a(b2, b3, b4, b5);
                } else {
                    throw new h("Invalid viewBox. height cannot be negative");
                }
            }
        }
    }

    private static void a(f.m mVar, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            if (b.a(attributes.getLocalName(i2)) == b.transform) {
                mVar.a(b(attributes.getValue(i2)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements Attributes {

        /* renamed from: b  reason: collision with root package name */
        private XmlPullParser f55424b;

        static {
            Covode.recordClassIndex(34700);
        }

        public final int getIndex(String str) {
            return -1;
        }

        public final int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public final String getType(int i2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getType(String str) {
            return null;
        }

        public final String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getValue(String str) {
            return null;
        }

        public final String getValue(String str, String str2) {
            return null;
        }

        public final int getLength() {
            return this.f55424b.getAttributeCount();
        }

        public final String getLocalName(int i2) {
            return this.f55424b.getAttributeName(i2);
        }

        public final String getURI(int i2) {
            return this.f55424b.getAttributeNamespace(i2);
        }

        @Override // org.xml.sax.Attributes
        public final String getValue(int i2) {
            return this.f55424b.getAttributeValue(i2);
        }

        public final String getQName(int i2) {
            String attributeName = this.f55424b.getAttributeName(i2);
            if (this.f55424b.getAttributePrefix(i2) != null) {
                return this.f55424b.getAttributePrefix(i2) + ':' + attributeName;
            }
            return attributeName;
        }

        public e(XmlPullParser xmlPullParser) {
            this.f55424b = xmlPullParser;
        }
    }

    /* access modifiers changed from: package-private */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        String f55419a;

        /* renamed from: b  reason: collision with root package name */
        int f55420b;

        /* renamed from: c  reason: collision with root package name */
        int f55421c;

        /* renamed from: d  reason: collision with root package name */
        private c f55422d = new c();

        static {
            Covode.recordClassIndex(34699);
        }

        static boolean a(int i2) {
            return i2 == 32 || i2 == 10 || i2 == 13 || i2 == 9;
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            while (true) {
                int i2 = this.f55420b;
                if (i2 < this.f55421c && a((int) this.f55419a.charAt(i2))) {
                    this.f55420b++;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean c() {
            b();
            int i2 = this.f55420b;
            if (i2 == this.f55421c || this.f55419a.charAt(i2) != ',') {
                return false;
            }
            this.f55420b++;
            b();
            return true;
        }

        /* access modifiers changed from: package-private */
        public final float d() {
            float a2 = this.f55422d.a(this.f55419a, this.f55420b, this.f55421c);
            if (!Float.isNaN(a2)) {
                this.f55420b = this.f55422d.f55215a;
            }
            return a2;
        }

        /* access modifiers changed from: package-private */
        public final float e() {
            c();
            float a2 = this.f55422d.a(this.f55419a, this.f55420b, this.f55421c);
            if (!Float.isNaN(a2)) {
                this.f55420b = this.f55422d.f55215a;
            }
            return a2;
        }

        /* access modifiers changed from: package-private */
        public final Integer f() {
            int i2 = this.f55420b;
            if (i2 == this.f55421c) {
                return null;
            }
            String str = this.f55419a;
            this.f55420b = i2 + 1;
            return Integer.valueOf(str.charAt(i2));
        }

        /* access modifiers changed from: package-private */
        public final f.o g() {
            float d2 = d();
            if (Float.isNaN(d2)) {
                return null;
            }
            f.an l2 = l();
            if (l2 == null) {
                return new f.o(d2, f.an.px);
            }
            return new f.o(d2, l2);
        }

        /* access modifiers changed from: package-private */
        public final int h() {
            int i2 = this.f55420b;
            int i3 = this.f55421c;
            if (i2 == i3) {
                return -1;
            }
            int i4 = i2 + 1;
            this.f55420b = i4;
            if (i4 < i3) {
                return this.f55419a.charAt(i4);
            }
            return -1;
        }

        private Boolean k() {
            int i2 = this.f55420b;
            if (i2 == this.f55421c) {
                return null;
            }
            char charAt = this.f55419a.charAt(i2);
            if (charAt != '0' && charAt != '1') {
                return null;
            }
            boolean z = true;
            this.f55420b++;
            if (charAt != '1') {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        /* access modifiers changed from: package-private */
        public final String i() {
            if (a()) {
                return null;
            }
            char charAt = this.f55419a.charAt(this.f55420b);
            if (a((int) charAt) || charAt == ' ') {
                return null;
            }
            int i2 = this.f55420b;
            int h2 = h();
            while (h2 != -1 && h2 != 32 && !a(h2)) {
                h2 = h();
            }
            return this.f55419a.substring(i2, this.f55420b);
        }

        private f.an l() {
            if (a()) {
                return null;
            }
            if (this.f55419a.charAt(this.f55420b) == '%') {
                this.f55420b++;
                return f.an.percent;
            }
            int i2 = this.f55420b;
            int i3 = this.f55421c;
            if (i2 > i3 - 2) {
                return null;
            }
            if (i2 > i3 - 3) {
                try {
                    String substring = this.f55419a.substring(i2, i2 + 3);
                    if ("rem".equals(substring)) {
                        this.f55420b += 3;
                        return f.an.rem;
                    } else if ("rpx".equals(substring)) {
                        this.f55420b += 3;
                        return f.an.rpx;
                    }
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            }
            String str = this.f55419a;
            int i4 = this.f55420b;
            f.an valueOf = f.an.valueOf(str.substring(i4, i4 + 2).toLowerCase(Locale.US));
            this.f55420b += 2;
            return valueOf;
        }

        /* access modifiers changed from: package-private */
        public final boolean a() {
            if (this.f55420b == this.f55421c) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final String j() {
            if (a()) {
                return null;
            }
            int i2 = this.f55420b;
            int charAt = this.f55419a.charAt(i2);
            while (true) {
                if ((charAt < 97 || charAt > 122) && (charAt < 65 || charAt > 90)) {
                    int i3 = this.f55420b;
                } else {
                    charAt = h();
                }
            }
            int i32 = this.f55420b;
            while (a(charAt)) {
                charAt = h();
            }
            if (charAt == 40) {
                this.f55420b++;
                return this.f55419a.substring(i2, i32);
            }
            this.f55420b = i2;
            return null;
        }

        /* access modifiers changed from: package-private */
        public final Boolean a(Object obj) {
            if (obj == null) {
                return null;
            }
            c();
            return k();
        }

        d(String str) {
            String trim = str.trim();
            this.f55419a = trim;
            this.f55421c = trim.length();
        }

        /* access modifiers changed from: package-private */
        public final float a(float f2) {
            if (Float.isNaN(f2)) {
                return Float.NaN;
            }
            c();
            return d();
        }

        /* access modifiers changed from: package-private */
        public final boolean a(char c2) {
            int i2 = this.f55420b;
            if (i2 >= this.f55421c || this.f55419a.charAt(i2) != c2) {
                return false;
            }
            this.f55420b++;
            return true;
        }

        /* access modifiers changed from: package-private */
        public final boolean a(String str) {
            int length = str.length();
            int i2 = this.f55420b;
            if (i2 > this.f55421c - length || !this.f55419a.substring(i2, i2 + length).equals(str)) {
                return false;
            }
            this.f55420b += length;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final Map<String, d.a> f55392a;

        static {
            Covode.recordClassIndex(34696);
            HashMap hashMap = new HashMap(10);
            f55392a = hashMap;
            hashMap.put("none", d.a.none);
            hashMap.put("xMinYMin", d.a.xMinYMin);
            hashMap.put("xMidYMin", d.a.xMidYMin);
            hashMap.put("xMaxYMin", d.a.xMaxYMin);
            hashMap.put("xMinYMid", d.a.xMinYMid);
            hashMap.put("xMidYMid", d.a.xMidYMid);
            hashMap.put("xMaxYMid", d.a.xMaxYMid);
            hashMap.put("xMinYMax", d.a.xMinYMax);
            hashMap.put("xMidYMax", d.a.xMidYMax);
            hashMap.put("xMaxYMax", d.a.xMaxYMax);
        }

        static d.a a(String str) {
            return f55392a.get(str);
        }
    }

    /* access modifiers changed from: package-private */
    public enum c {
        svg,
        circle,
        clipPath,
        defs,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        use,
        UNSUPPORTED;
        
        private static final Map<String, c> t = new HashMap();

        static {
            Covode.recordClassIndex(34698);
            c[] values = values();
            for (c cVar : values) {
                if (cVar != UNSUPPORTED) {
                    t.put(cVar.name(), cVar);
                }
            }
        }

        public static c a(String str) {
            c cVar = t.get(str);
            if (cVar != null) {
                return cVar;
            }
            return UNSUPPORTED;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.i$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f55390a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f55391b;

        /* JADX WARNING: Can't wrap try/catch for region: R(150:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|(2:41|42)|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|(2:65|66)|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|(2:147|148)|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|(3:185|186|188)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(151:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|37|38|39|(2:41|42)|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|(2:65|66)|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|(2:147|148)|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|(3:185|186|188)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(152:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|37|38|39|(2:41|42)|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|(2:65|66)|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|(2:147|148)|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|(3:185|186|188)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(154:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|37|38|39|(2:41|42)|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|(2:65|66)|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|(2:147|148)|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(155:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|29|30|31|33|34|35|37|38|39|(2:41|42)|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|(2:65|66)|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|(2:147|148)|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(156:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|25|26|27|29|30|31|33|34|35|37|38|39|(2:41|42)|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|(2:65|66)|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|(2:147|148)|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(157:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|25|26|27|29|30|31|33|34|35|37|38|39|(2:41|42)|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|(2:147|148)|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(158:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|(2:41|42)|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|(2:147|148)|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(159:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|(2:41|42)|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|61|62|63|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|(2:147|148)|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(160:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|(2:41|42)|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|61|62|63|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|(2:147|148)|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(162:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|(2:41|42)|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|57|58|59|61|62|63|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|(2:147|148)|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(163:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|(2:41|42)|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|57|58|59|61|62|63|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(165:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|(2:41|42)|43|(2:45|46)|47|(2:49|50)|51|53|54|55|57|58|59|61|62|63|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(167:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|(2:41|42)|43|(2:45|46)|47|49|50|51|53|54|55|57|58|59|61|62|63|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(169:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|(2:41|42)|43|45|46|47|49|50|51|53|54|55|57|58|59|61|62|63|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(170:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|49|50|51|53|54|55|57|58|59|61|62|63|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x0196 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x01a2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x01ae */
        /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x01ba */
        /* JADX WARNING: Missing exception handler attribute for start block: B:109:0x01c6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:111:0x01d2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:113:0x01de */
        /* JADX WARNING: Missing exception handler attribute for start block: B:115:0x01ea */
        /* JADX WARNING: Missing exception handler attribute for start block: B:117:0x01f6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:119:0x0202 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:121:0x020e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:123:0x021a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:125:0x0226 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:127:0x0232 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:129:0x023e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:131:0x024a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:133:0x0256 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:135:0x0262 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:137:0x026e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:139:0x027a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:141:0x0286 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:143:0x0292 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:145:0x029e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:147:0x02aa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:153:0x02c7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:155:0x02d1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:157:0x02db */
        /* JADX WARNING: Missing exception handler attribute for start block: B:159:0x02e5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:161:0x02ef */
        /* JADX WARNING: Missing exception handler attribute for start block: B:163:0x02f9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:165:0x0303 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:167:0x030d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:169:0x0317 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:171:0x0321 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:173:0x032b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:175:0x0335 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:177:0x033f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:179:0x0349 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:181:0x0353 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:183:0x035f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:185:0x0369 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x00e2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x00ee */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x00fa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x0106 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0112 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x011e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x012a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0136 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x0142 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x014e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x015a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x0166 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x0172 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x017e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x018a */
        static {
            /*
            // Method dump skipped, instructions count: 884
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.component.svg.a.i.AnonymousClass1.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    public enum b {
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        f55397e,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        transform,
        ab,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;
        
        private static final Map<String, b> aq = new HashMap();

        static {
            Covode.recordClassIndex(34697);
            b[] values = values();
            for (b bVar : values) {
                if (bVar != UNSUPPORTED) {
                    aq.put(bVar.name().replace('_', '-'), bVar);
                }
            }
        }

        public static b a(String str) {
            b bVar = aq.get(str);
            if (bVar != null) {
                return bVar;
            }
            return UNSUPPORTED;
        }
    }

    private static f.o a(d dVar) {
        if (dVar.a("auto")) {
            return new f.o();
        }
        return dVar.g();
    }

    private static float d(String str) {
        int length = str.length();
        if (length != 0) {
            return a(str, length);
        }
        throw new h("Invalid float value (empty string)");
    }

    private static Float e(String str) {
        try {
            float d2 = d(str);
            if (d2 < 0.0f) {
                d2 = 0.0f;
            } else if (d2 > 1.0f) {
                d2 = 1.0f;
            }
            return Float.valueOf(d2);
        } catch (h unused) {
            return null;
        }
    }

    private static f.aj h(String str) {
        str.hashCode();
        if (str.equals("none")) {
            return f.e.f55306c;
        }
        if (str.equals("currentColor")) {
            return f.C1255f.f55308a;
        }
        try {
            return i(str);
        } catch (h unused) {
            return null;
        }
    }

    private static f.e i(String str) {
        try {
            return new f.e(ColorUtils.a(str));
        } catch (Exception e2) {
            throw new h(e2.toString());
        }
    }

    private static f.ab.a j(String str) {
        if ("nonzero".equals(str)) {
            return f.ab.a.NonZero;
        }
        if ("evenodd".equals(str)) {
            return f.ab.a.EvenOdd;
        }
        return null;
    }

    private static f.ab.e p(String str) {
        str.hashCode();
        if (str.equals("none")) {
            return f.ab.e.None;
        }
        if (!str.equals("non-scaling-stroke")) {
            return null;
        }
        return f.ab.e.NonScalingStroke;
    }

    private static f.ab.b k(String str) {
        if ("butt".equals(str)) {
            return f.ab.b.Butt;
        }
        if ("round".equals(str)) {
            return f.ab.b.Round;
        }
        if ("square".equals(str)) {
            return f.ab.b.Square;
        }
        return null;
    }

    private static f.ab.c l(String str) {
        if ("miter".equals(str)) {
            return f.ab.c.Miter;
        }
        if ("round".equals(str)) {
            return f.ab.c.Round;
        }
        if ("bevel".equals(str)) {
            return f.ab.c.Bevel;
        }
        return null;
    }

    private static f.ab.d q(String str) {
        str.hashCode();
        switch (str.hashCode()) {
            case -933002398:
                if (!str.equals("optimizeQuality")) {
                    return null;
                }
                return f.ab.d.optimizeQuality;
            case 3005871:
                if (!str.equals("auto")) {
                    return null;
                }
                return f.ab.d.auto;
            case 362741610:
                if (!str.equals("optimizeSpeed")) {
                    return null;
                }
                return f.ab.d.optimizeSpeed;
            default:
                return null;
        }
    }

    private static String r(String str) {
        if (str.equals("none") || !str.startsWith("url(")) {
            return null;
        }
        if (str.endsWith(")")) {
            return str.substring(4, str.length() - 1).trim();
        }
        return str.substring(4).trim();
    }

    private static Float a(String str) {
        if (str.length() != 0) {
            int length = str.length();
            boolean z = false;
            if (str.charAt(str.length() - 1) == '%') {
                length--;
                z = true;
            }
            try {
                float a2 = a(str, length);
                float f2 = 100.0f;
                if (z) {
                    a2 /= 100.0f;
                }
                if (a2 < 0.0f) {
                    f2 = 0.0f;
                } else if (a2 <= 100.0f) {
                    f2 = a2;
                }
                return Float.valueOf(f2);
            } catch (NumberFormatException e2) {
                throw new h("Invalid offset value in <stop>: ".concat(String.valueOf(str)), e2);
            }
        } else {
            throw new h("Invalid offset value in <stop> (empty string)");
        }
    }

    private static d f(String str) {
        d dVar = new d(str);
        dVar.b();
        String i2 = dVar.i();
        if ("defer".equals(i2)) {
            dVar.b();
            i2 = dVar.i();
        }
        d.a a2 = a.a(i2);
        d.b bVar = null;
        dVar.b();
        if (!dVar.a()) {
            String i3 = dVar.i();
            i3.hashCode();
            if (i3.equals("meet")) {
                bVar = d.b.meet;
            } else if (!i3.equals("slice")) {
                throw new h("Invalid preserveAspectRatio definition: ".concat(String.valueOf(str)));
            } else {
                bVar = d.b.slice;
            }
        }
        return new d(a2, bVar);
    }

    private static f.aj g(String str) {
        if (!str.startsWith("url(")) {
            return h(str);
        }
        int indexOf = str.indexOf(")");
        f.aj ajVar = null;
        if (indexOf == -1) {
            return new f.r(str.substring(4).trim(), null);
        }
        String trim = str.substring(4, indexOf).trim();
        String trim2 = str.substring(indexOf + 1).trim();
        if (trim2.length() > 0) {
            ajVar = h(trim2);
        }
        return new f.r(trim, ajVar);
    }

    private static f.o[] m(String str) {
        f.o g2;
        d dVar = new d(str);
        dVar.b();
        if (dVar.a() || (g2 = dVar.g()) == null || g2.b()) {
            return null;
        }
        float f2 = g2.f55330a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(g2);
        while (!dVar.a()) {
            dVar.c();
            f.o g3 = dVar.g();
            if (g3 == null || g3.b()) {
                return null;
            }
            arrayList.add(g3);
            f2 += g3.f55330a;
        }
        if (f2 == 0.0f) {
            return null;
        }
        return (f.o[]) arrayList.toArray(new f.o[arrayList.size()]);
    }

    private static Boolean n(String str) {
        str.hashCode();
        switch (str.hashCode()) {
            case -1217487446:
                if (!str.equals("hidden")) {
                    return null;
                }
                return Boolean.FALSE;
            case -907680051:
                if (!str.equals("scroll")) {
                    return null;
                }
                return Boolean.FALSE;
            case 3005871:
                if (!str.equals("auto")) {
                    return null;
                }
                return Boolean.TRUE;
            case 466743410:
                if (!str.equals("visible")) {
                    return null;
                }
                return Boolean.TRUE;
            default:
                return null;
        }
    }

    private static f.b o(String str) {
        if ("auto".equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        d dVar = new d(str.substring(5));
        dVar.b();
        f.o a2 = a(dVar);
        dVar.c();
        f.o a3 = a(dVar);
        dVar.c();
        f.o a4 = a(dVar);
        dVar.c();
        f.o a5 = a(dVar);
        dVar.b();
        if (dVar.a(')') || dVar.a()) {
            return new f.b(a2, a3, a4, a5);
        }
        return null;
    }

    private static f.o c(String str) {
        if (str.length() != 0) {
            int length = str.length();
            f.an anVar = f.an.px;
            char charAt = str.charAt(length - 1);
            if (charAt == '%') {
                length--;
                anVar = f.an.percent;
            } else {
                if (str.endsWith("rpx")) {
                    anVar = f.an.rpx;
                } else if (str.endsWith("rem")) {
                    anVar = f.an.rem;
                } else if (length > 2 && Character.isLetter(charAt) && Character.isLetter(str.charAt(length - 2))) {
                    length -= 2;
                    try {
                        anVar = f.an.valueOf(str.substring(length).toLowerCase(Locale.US));
                    } catch (IllegalArgumentException unused) {
                        throw new h("Invalid length unit specifier: ".concat(String.valueOf(str)));
                    }
                }
                length -= 3;
            }
            try {
                return new f.o(a(str, length), anVar);
            } catch (NumberFormatException e2) {
                throw new h("Invalid length value: ".concat(String.valueOf(str)), e2);
            }
        } else {
            throw new h("Invalid length value (empty string)");
        }
    }

    private static Matrix b(String str) {
        Matrix matrix = new Matrix();
        d dVar = new d(str);
        dVar.b();
        while (!dVar.a()) {
            String j2 = dVar.j();
            if (j2 != null) {
                j2.hashCode();
                char c2 = 65535;
                switch (j2.hashCode()) {
                    case -1081239615:
                        if (j2.equals("matrix")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -925180581:
                        if (j2.equals("rotate")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 109250890:
                        if (j2.equals("scale")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 109493390:
                        if (j2.equals("skewX")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 109493391:
                        if (j2.equals("skewY")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 1052832078:
                        if (j2.equals("translate")) {
                            c2 = 5;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        dVar.b();
                        float d2 = dVar.d();
                        dVar.c();
                        float d3 = dVar.d();
                        dVar.c();
                        float d4 = dVar.d();
                        dVar.c();
                        float d5 = dVar.d();
                        dVar.c();
                        float d6 = dVar.d();
                        dVar.c();
                        float d7 = dVar.d();
                        dVar.b();
                        if (!Float.isNaN(d7) && dVar.a(')')) {
                            Matrix matrix2 = new Matrix();
                            matrix2.setValues(new float[]{d2, d4, d6, d3, d5, d7, 0.0f, 0.0f, 1.0f});
                            matrix.preConcat(matrix2);
                            break;
                        } else {
                            throw new h("Invalid transform list: ".concat(String.valueOf(str)));
                        }
                        break;
                    case 1:
                        dVar.b();
                        float d8 = dVar.d();
                        float e2 = dVar.e();
                        float e3 = dVar.e();
                        dVar.b();
                        if (Float.isNaN(d8) || !dVar.a(')')) {
                            throw new h("Invalid transform list: ".concat(String.valueOf(str)));
                        } else if (Float.isNaN(e2)) {
                            matrix.preRotate(d8);
                            break;
                        } else if (!Float.isNaN(e3)) {
                            matrix.preRotate(d8, e2, e3);
                            break;
                        } else {
                            throw new h("Invalid transform list: ".concat(String.valueOf(str)));
                        }
                        break;
                    case 2:
                        dVar.b();
                        float d9 = dVar.d();
                        float e4 = dVar.e();
                        dVar.b();
                        if (!Float.isNaN(d9) && dVar.a(')')) {
                            if (!Float.isNaN(e4)) {
                                matrix.preScale(d9, e4);
                                break;
                            } else {
                                matrix.preScale(d9, d9);
                                break;
                            }
                        } else {
                            throw new h("Invalid transform list: ".concat(String.valueOf(str)));
                        }
                        break;
                    case 3:
                        dVar.b();
                        float d10 = dVar.d();
                        dVar.b();
                        if (!Float.isNaN(d10) && dVar.a(')')) {
                            matrix.preSkew((float) Math.tan(Math.toRadians((double) d10)), 0.0f);
                            break;
                        } else {
                            throw new h("Invalid transform list: ".concat(String.valueOf(str)));
                        }
                    case 4:
                        dVar.b();
                        float d11 = dVar.d();
                        dVar.b();
                        if (!Float.isNaN(d11) && dVar.a(')')) {
                            matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians((double) d11)));
                            break;
                        } else {
                            throw new h("Invalid transform list: ".concat(String.valueOf(str)));
                        }
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        dVar.b();
                        float d12 = dVar.d();
                        float e5 = dVar.e();
                        dVar.b();
                        if (!Float.isNaN(d12) && dVar.a(')')) {
                            if (!Float.isNaN(e5)) {
                                matrix.preTranslate(d12, e5);
                                break;
                            } else {
                                matrix.preTranslate(d12, 0.0f);
                                break;
                            }
                        } else {
                            throw new h("Invalid transform list: ".concat(String.valueOf(str)));
                        }
                        break;
                    default:
                        throw new h("Invalid transform list fn: " + j2 + ")");
                }
                if (dVar.a()) {
                    return matrix;
                }
                dVar.c();
            } else {
                throw new h("Bad transform function encountered in transform list: ".concat(String.valueOf(str)));
            }
        }
        return matrix;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:201:0x041e, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(java.io.InputStream r13) {
        /*
        // Method dump skipped, instructions count: 1264
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.component.svg.a.i.b(java.io.InputStream):void");
    }

    private static void a(f.ak akVar, String str) {
        akVar.q = f(str);
    }

    private static void a(String str, Object... objArr) {
        LLog.a(3, "SVGParser", com.a.a(str, objArr));
    }

    private static float a(String str, int i2) {
        float a2 = new c().a(str, 0, i2);
        if (!Float.isNaN(a2)) {
            return a2;
        }
        throw new h("Invalid float value: ".concat(String.valueOf(str)));
    }

    private static void a(f.aa aaVar, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            if (AnonymousClass1.f55391b[b.a(attributes.getLocalName(i2)).ordinal()] == 24) {
                aaVar.f55242a = a(trim);
            }
        }
    }

    private static void a(f.ac acVar, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            int i3 = AnonymousClass1.f55391b[b.a(attributes.getLocalName(i2)).ordinal()];
            if (i3 == 1) {
                acVar.f55261a = c(trim);
            } else if (i3 == 2) {
                acVar.f55262b = c(trim);
            } else if (i3 == 3) {
                acVar.f55263c = c(trim);
                if (acVar.f55263c.b()) {
                    throw new h("Invalid <svg> element. width cannot be negative");
                }
            } else if (i3 == 4) {
                acVar.f55264d = c(trim);
                if (acVar.f55264d.b()) {
                    throw new h("Invalid <svg> element. height cannot be negative");
                }
            } else if (i3 == 5) {
                acVar.f55265e = trim;
            }
        }
    }

    private static void b(f.ag agVar, Attributes attributes) {
        int i2;
        for (int i3 = 0; i3 < attributes.getLength(); i3++) {
            String trim = attributes.getValue(i3).trim();
            if (trim.length() != 0) {
                if (AnonymousClass1.f55391b[b.a(attributes.getLocalName(i3)).ordinal()] == 29) {
                    a.C1254a aVar = new a.C1254a(trim.replaceAll("/\\*.*?\\*/", ""));
                    while (!aVar.a()) {
                        aVar.b();
                        if (aVar.a()) {
                            i2 = aVar.f55420b;
                        } else {
                            int i4 = aVar.f55420b;
                            i2 = aVar.f55420b;
                            int charAt = aVar.f55419a.charAt(aVar.f55420b);
                            if (charAt == 45) {
                                charAt = aVar.h();
                            }
                            if ((charAt >= 65 && charAt <= 90) || ((charAt >= 97 && charAt <= 122) || charAt == 95)) {
                                int h2 = aVar.h();
                                while (true) {
                                    if ((h2 < 65 || h2 > 90) && ((h2 < 97 || h2 > 122) && !((h2 >= 48 && h2 <= 57) || h2 == 45 || h2 == 95))) {
                                        break;
                                    }
                                    h2 = aVar.h();
                                }
                                i2 = aVar.f55420b;
                            }
                            aVar.f55420b = i4;
                        }
                        String str = null;
                        if (i2 != aVar.f55420b) {
                            str = aVar.f55419a.substring(aVar.f55420b, i2);
                            aVar.f55420b = i2;
                        }
                        aVar.b();
                        if (!aVar.a(';')) {
                            if (!aVar.a(':')) {
                                break;
                            }
                            aVar.b();
                            if (!aVar.a()) {
                                int i5 = aVar.f55420b;
                                int i6 = aVar.f55420b;
                                int charAt2 = aVar.f55419a.charAt(aVar.f55420b);
                                while (charAt2 != -1 && charAt2 != 59 && charAt2 != 125 && charAt2 != 33 && charAt2 != 10 && charAt2 != 13) {
                                    if (!a.C1254a.a(charAt2)) {
                                        i6 = aVar.f55420b + 1;
                                    }
                                    charAt2 = aVar.h();
                                }
                                if (aVar.f55420b > i5) {
                                    String substring = aVar.f55419a.substring(i5, i6);
                                    if (substring != null) {
                                        aVar.b();
                                        if (aVar.a() || aVar.a(';')) {
                                            if (agVar.n == null) {
                                                agVar.n = new f.ab();
                                            }
                                            a(agVar.n, str, substring);
                                            aVar.b();
                                        }
                                    }
                                } else {
                                    aVar.f55420b = i5;
                                }
                            }
                        }
                    }
                } else {
                    if (agVar.f55270m == null) {
                        agVar.f55270m = new f.ab();
                    }
                    a(agVar.f55270m, attributes.getLocalName(i3), attributes.getValue(i3).trim());
                }
            }
        }
    }

    private static void a(f.ag agVar, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String qName = attributes.getQName(i2);
            if (qName.equals("id") || qName.equals("xml:id")) {
                agVar.f55268k = attributes.getValue(i2).trim();
                return;
            } else if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i2).trim();
                if ("default".equals(trim)) {
                    agVar.f55269l = Boolean.FALSE;
                    return;
                } else if ("preserve".equals(trim)) {
                    agVar.f55269l = Boolean.TRUE;
                    return;
                } else {
                    throw new h("Invalid value for \"xml:space\" attribute: ".concat(String.valueOf(trim)));
                }
            }
        }
    }

    private static void a(f.ab abVar, String str, String str2) {
        if (str2.length() != 0 && !str2.equals("inherit")) {
            switch (AnonymousClass1.f55391b[b.a(str).ordinal()]) {
                case 30:
                    abVar.f55244b = g(str2);
                    if (abVar.f55244b != null) {
                        abVar.f55243a |= 1;
                        return;
                    }
                    return;
                case 31:
                    abVar.f55245c = j(str2);
                    if (abVar.f55245c != null) {
                        abVar.f55243a |= 2;
                        return;
                    }
                    return;
                case 32:
                    abVar.f55246d = e(str2);
                    if (abVar.f55246d != null) {
                        abVar.f55243a |= 4;
                        return;
                    }
                    return;
                case 33:
                    abVar.f55247e = g(str2);
                    if (abVar.f55247e != null) {
                        abVar.f55243a |= 8;
                        return;
                    }
                    return;
                case 34:
                    abVar.f55248f = e(str2);
                    if (abVar.f55248f != null) {
                        abVar.f55243a |= 16;
                        return;
                    }
                    return;
                case 35:
                    try {
                        abVar.f55249g = c(str2);
                        abVar.f55243a |= 32;
                        return;
                    } catch (h unused) {
                        return;
                    }
                case 36:
                    abVar.f55250h = k(str2);
                    if (abVar.f55250h != null) {
                        abVar.f55243a |= 64;
                        return;
                    }
                    return;
                case 37:
                    abVar.f55251i = l(str2);
                    if (abVar.f55251i != null) {
                        abVar.f55243a |= 128;
                        return;
                    }
                    return;
                case 38:
                    try {
                        abVar.f55252j = Float.valueOf(d(str2));
                        abVar.f55243a |= 256;
                        return;
                    } catch (h unused2) {
                        return;
                    }
                case 39:
                    if ("none".equals(str2)) {
                        abVar.f55253k = null;
                        abVar.f55243a |= 512;
                        return;
                    }
                    abVar.f55253k = m(str2);
                    if (abVar.f55253k != null) {
                        abVar.f55243a |= 512;
                        return;
                    }
                    return;
                case 40:
                    try {
                        abVar.f55254l = c(str2);
                        abVar.f55243a |= 1024;
                        return;
                    } catch (h unused3) {
                        return;
                    }
                case 41:
                    abVar.f55255m = e(str2);
                    abVar.f55243a |= 2048;
                    return;
                case 42:
                    try {
                        abVar.n = i(str2);
                        abVar.f55243a |= 4096;
                        return;
                    } catch (h unused4) {
                        return;
                    }
                case 43:
                    abVar.o = n(str2);
                    if (abVar.o != null) {
                        abVar.f55243a |= 524288;
                        return;
                    }
                    return;
                case BuildConfig.VERSION_CODE:
                    if (str2.indexOf(124) < 0 && "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains("|" + str2 + '|')) {
                        abVar.q = Boolean.valueOf(!str2.equals("none"));
                        abVar.f55243a |= 16777216;
                        return;
                    }
                    return;
                case 45:
                    if (str2.indexOf(124) < 0 && "|visible|hidden|collapse|".contains("|" + str2 + '|')) {
                        abVar.r = Boolean.valueOf(str2.equals("visible"));
                        abVar.f55243a |= 33554432;
                        return;
                    }
                    return;
                case 46:
                    if (str2.equals("currentColor")) {
                        abVar.s = f.C1255f.f55308a;
                    } else {
                        try {
                            abVar.s = i(str2);
                        } catch (h e2) {
                            e2.getMessage();
                            return;
                        }
                    }
                    abVar.f55243a |= 67108864;
                    return;
                case 47:
                    abVar.t = e(str2);
                    abVar.f55243a |= 134217728;
                    return;
                case 48:
                    abVar.p = o(str2);
                    if (abVar.p != null) {
                        abVar.f55243a |= 1048576;
                        return;
                    }
                    return;
                case 49:
                    abVar.u = r(str2);
                    abVar.f55243a |= 268435456;
                    return;
                case 50:
                    abVar.v = j(str2);
                    abVar.f55243a |= 536870912;
                    return;
                case 51:
                    if (str2.equals("currentColor")) {
                        abVar.w = f.C1255f.f55308a;
                    } else {
                        try {
                            abVar.w = i(str2);
                        } catch (h e3) {
                            e3.getMessage();
                            return;
                        }
                    }
                    abVar.f55243a |= 2147483648L;
                    return;
                case 52:
                    abVar.x = e(str2);
                    abVar.f55243a |= 4294967296L;
                    return;
                case 53:
                    if (str2.equals("currentColor")) {
                        abVar.y = f.C1255f.f55308a;
                    } else {
                        try {
                            abVar.y = i(str2);
                        } catch (h e4) {
                            e4.getMessage();
                            return;
                        }
                    }
                    abVar.f55243a |= 8589934592L;
                    return;
                case 54:
                    abVar.z = e(str2);
                    abVar.f55243a |= 17179869184L;
                    return;
                case 55:
                    abVar.A = p(str2);
                    if (abVar.A != null) {
                        abVar.f55243a |= 34359738368L;
                        return;
                    }
                    return;
                case 56:
                    abVar.B = q(str2);
                    if (abVar.B != null) {
                        abVar.f55243a |= 137438953472L;
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
