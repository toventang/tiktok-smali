package com.ss.android.ugc.aweme.im.sdk.relations.b;

import android.icu.text.AlphabeticIndex;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.en;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f102966a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final c f102967b;

    /* renamed from: c  reason: collision with root package name */
    private static final Locale f102968c;

    static class c implements c {

        /* renamed from: b  reason: collision with root package name */
        public static final a f102970b = new a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public final AlphabeticIndex.ImmutableIndex<?> f102971a;

        /* renamed from: c  reason: collision with root package name */
        private final int f102972c;

        static {
            Covode.recordClassIndex(66007);
        }

        public static final class a {
            static {
                Covode.recordClassIndex(66008);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final int a() {
            return this.f102972c + 1;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.relations.b.c
        public final String a(String str) {
            int c2;
            if (a.a(str) || (c2 = c(str)) < 0 || c2 >= this.f102972c + 1) {
                return "#";
            }
            AlphabeticIndex.Bucket<?> bucket = this.f102971a.getBucket(c2);
            l.b(bucket, "");
            String label = bucket.getLabel();
            l.b(label, "");
            return label;
        }

        public int c(String str) {
            boolean z;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return -1;
            }
            try {
                int bucketIndex = this.f102971a.getBucketIndex(str);
                AlphabeticIndex.Bucket<?> bucket = this.f102971a.getBucket(bucketIndex);
                l.b(bucket, "");
                if (bucket.getLabelType() != AlphabeticIndex.Bucket.LabelType.NORMAL) {
                    return -1;
                }
                return bucketIndex;
            } catch (ArrayIndexOutOfBoundsException e2) {
                com.ss.android.ugc.aweme.im.service.m.a.a(e2);
                return -1;
            }
        }

        public c(List<Locale> list) {
            l.d(list, "");
            AlphabeticIndex maxLabelCount = new AlphabeticIndex(list.get(0)).setMaxLabelCount(100);
            l.b(maxLabelCount, "");
            Iterator<Locale> it = list.iterator();
            while (it.hasNext()) {
                maxLabelCount.addLabels(it.next());
            }
            AlphabeticIndex.ImmutableIndex<?> buildImmutableIndex = maxLabelCount.buildImmutableIndex();
            l.b(buildImmutableIndex, "");
            this.f102971a = buildImmutableIndex;
            this.f102972c = buildImmutableIndex.getBucketCount();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
            if (r1 < 10) goto L_0x0027;
         */
        @Override // com.ss.android.ugc.aweme.im.sdk.relations.b.c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String b(java.lang.String r8) {
            /*
                r7 = this;
                r0 = 0
                r6 = 1
                if (r8 == 0) goto L_0x000a
                int r0 = r8.length()
                if (r0 != 0) goto L_0x0010
            L_0x000a:
                r0 = 1
            L_0x000b:
                java.lang.String r5 = "0"
                if (r0 == 0) goto L_0x0012
                return r5
            L_0x0010:
                r0 = 0
                goto L_0x000b
            L_0x0012:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r3 = 0
                r2 = 0
            L_0x0019:
                int r0 = r8.length()
                if (r2 >= r0) goto L_0x003f
                int r1 = r7.a(r8, r2)
                r0 = 10
                if (r1 >= r0) goto L_0x002a
            L_0x0027:
                r4.append(r5)
            L_0x002a:
                r0 = 99
                if (r1 != r0) goto L_0x0030
                int r2 = r2 + 1
            L_0x0030:
                java.lang.String r0 = java.lang.String.valueOf(r1)
                r4.append(r0)
                int r3 = r3 + 1
                int r2 = r2 + r6
                r0 = 12
                if (r3 >= r0) goto L_0x0041
                goto L_0x0019
            L_0x003f:
                r1 = 0
                goto L_0x0027
            L_0x0041:
                java.lang.String r1 = r4.toString()
                java.lang.String r0 = ""
                h.f.b.l.b(r1, r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.relations.b.b.c.b(java.lang.String):java.lang.String");
        }

        public int a(String str, int i2) {
            l.d(str, "");
            String substring = str.substring(i2, i2 + 1);
            l.b(substring, "");
            int c2 = c(substring);
            if (c2 != -1) {
                return c2;
            }
            char charAt = str.charAt(i2);
            if (Character.isUpperCase(charAt)) {
                return ((this.f102972c + 1) + charAt) - 65;
            }
            if (Character.isLowerCase(charAt)) {
                return (((this.f102972c + 1) + charAt) - 97) + 26;
            }
            if (Character.isDigit(charAt)) {
                return (((this.f102972c + 1) + charAt) - 48) + 52;
            }
            if (a.b(charAt)) {
                return this.f102972c + 1 + 62;
            }
            String substring2 = str.substring(i2);
            l.b(substring2, "");
            if (a.a(substring2)) {
                return 99;
            }
            return this.f102972c + 1 + 63;
        }
    }

    private b() {
    }

    static {
        c bVar;
        Covode.recordClassIndex(66004);
        Locale a2 = en.a();
        l.b(a2, "");
        f102968c = a2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(a2);
        if (Build.VERSION.SDK_INT > 24) {
            String language = a2.getLanguage();
            Locale locale = Locale.CHINESE;
            l.b(locale, "");
            if (l.a((Object) language, (Object) locale.getLanguage())) {
                bVar = new a(arrayList);
            } else {
                Locale locale2 = Locale.ENGLISH;
                l.b(locale2, "");
                if (l.a((Object) language, (Object) locale2.getLanguage())) {
                    bVar = new a(arrayList);
                } else {
                    Locale locale3 = Locale.JAPANESE;
                    l.b(locale3, "");
                    if (l.a((Object) language, (Object) locale3.getLanguage())) {
                        Locale locale4 = Locale.CHINESE;
                        l.b(locale4, "");
                        arrayList.add(locale4);
                        bVar = new d(arrayList);
                    } else {
                        Locale locale5 = Locale.KOREAN;
                        l.b(locale5, "");
                        if (l.a((Object) language, (Object) locale5.getLanguage())) {
                            bVar = new e(arrayList);
                        } else {
                            bVar = new c(arrayList);
                        }
                    }
                }
            }
        } else {
            bVar = new C2606b();
        }
        f102967b = bVar;
    }

    static final class a extends c {
        static {
            Covode.recordClassIndex(66005);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(List<Locale> list) {
            super(list);
            l.d(list, "");
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.relations.b.b.c
        public final int a(String str, int i2) {
            l.d(str, "");
            String substring = str.substring(i2, i2 + 1);
            l.b(substring, "");
            int c2 = c(substring);
            char charAt = str.charAt(i2);
            if (i2 != 0 && Character.isLowerCase(charAt)) {
                c2 += 26;
            }
            if (c2 != -1) {
                return c2;
            }
            if (Character.isDigit(charAt)) {
                return ((a() + charAt) - 48) + 26;
            }
            if (a.b(charAt)) {
                return a() + 36;
            }
            String substring2 = str.substring(i2);
            l.b(substring2, "");
            if (a.a(substring2)) {
                return 99;
            }
            return a() + 37;
        }
    }

    static final class d extends c {
        static {
            Covode.recordClassIndex(66009);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(List<Locale> list) {
            super(list);
            l.d(list, "");
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.relations.b.b.c
        public final int c(String str) {
            boolean z;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return -1;
            }
            int c2 = super.c(str);
            if (c2 == -1) {
                return super.c(a.c(str));
            }
            return c2;
        }
    }

    static final class e extends c {
        static {
            Covode.recordClassIndex(66010);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(List<Locale> list) {
            super(list);
            l.d(list, "");
        }
    }

    public static final String a(String str) {
        String a2 = f102967b.a(str);
        l.b(a2, "");
        return a2;
    }

    public static final String b(String str) {
        String b2 = f102967b.b(str);
        l.b(b2, "");
        return b2;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b.b$b  reason: collision with other inner class name */
    static final class C2606b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f102969a = en.b();

        static {
            Covode.recordClassIndex(66006);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.relations.b.c
        public final String a(String str) {
            boolean z = this.f102969a;
            String str2 = "#";
            if (!TextUtils.isEmpty(str)) {
                char charAt = str.charAt(0);
                if ((charAt >= 19968 && charAt <= 40869) || a.a(charAt)) {
                    str2 = a.c(str).substring(0, 1).toUpperCase();
                    if (TextUtils.isEmpty(str2)) {
                        str2 = str.substring(0, 1).toUpperCase();
                    }
                } else if (!Character.isDigit(charAt) && !a.b(charAt) && !a.a(str) && !z) {
                    str2 = str.substring(0, 1);
                }
            }
            l.b(str2, "");
            return str2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
            if (r5 < 10) goto L_0x0032;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
            if (r5 == 64) goto L_0x0037;
         */
        @Override // com.ss.android.ugc.aweme.im.sdk.relations.b.c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String b(java.lang.String r8) {
            /*
            // Method dump skipped, instructions count: 140
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.relations.b.b.C2606b.b(java.lang.String):java.lang.String");
        }
    }
}
