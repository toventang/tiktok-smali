package com.ss.android.ugc.aweme.ay;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.a.b;
import com.bytedance.lighten.a.v;
import com.ss.android.ugc.aweme.utils.hd;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class h extends b.a {

    public static final class a implements b<Object, com.bytedance.lighten.a.a.a> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f67804b = new a();

        /* renamed from: c  reason: collision with root package name */
        public static final C1531a f67805c = new C1531a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public final String f67806a = "ImageUrlModelConverter";

        /* renamed from: d  reason: collision with root package name */
        private final boolean f67807d = false;

        /* renamed from: e  reason: collision with root package name */
        private Pattern f67808e;

        /* renamed from: f  reason: collision with root package name */
        private String f67809f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f67810g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f67811h = true;

        /* renamed from: com.ss.android.ugc.aweme.ay.h$a$a  reason: collision with other inner class name */
        public static final class C1531a {
            static {
                Covode.recordClassIndex(41740);
            }

            private C1531a() {
            }

            public /* synthetic */ C1531a(byte b2) {
                this();
            }
        }

        static {
            Covode.recordClassIndex(41739);
        }

        public a() {
            a();
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x0043 A[Catch:{ all -> 0x0060 }] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0053 A[Catch:{ all -> 0x0060 }] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0054 A[Catch:{ all -> 0x0060 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.util.regex.Pattern a() {
            /*
            // Method dump skipped, instructions count: 101
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ay.h.a.a():java.util.regex.Pattern");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.lighten.a.a.b
        public final /* synthetic */ com.bytedance.lighten.a.a.a a(Object obj, v vVar) {
            l.d(vVar, "");
            if (!(obj instanceof com.ss.android.ugc.aweme.base.l)) {
                return null;
            }
            return a((com.ss.android.ugc.aweme.base.l) obj, vVar.f39914j, vVar.f39915k);
        }

        private static void a(com.ss.android.ugc.aweme.base.l lVar, boolean z, boolean z2) {
            String str;
            ArrayList arrayList;
            l.d(lVar, "");
            if (!z || !z2) {
                str = "ilog=not_shrink";
            } else {
                str = "ilog=not_shrink_test";
            }
            List<String> list = lVar.f68145b;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList(n.a((Iterable) list, 10));
                for (T t : list) {
                    l.b(t, "");
                    arrayList2.add(p.e((CharSequence) t, (CharSequence) "?") ? ((String) t) + '&' + str : ((String) t) + '?' + str);
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            lVar.f68145b = arrayList;
        }

        private com.bytedance.lighten.a.a.a a(com.ss.android.ugc.aweme.base.l lVar, int i2, int i3) {
            boolean z;
            Matcher matcher;
            String str;
            l.d(lVar, "");
            if (!this.f67811h) {
                return new com.bytedance.lighten.a.a.a(lVar.f68145b);
            }
            if (i2 <= 0 || i3 <= 0) {
                if (this.f67807d) {
                    hd.a(new Object[]{this.f67806a, "ImageCropUtils.convertedImageUrls(ImageCropUtils.kt:48)\n", lVar.f68144a + " no size error, return " + lVar.f68145b});
                }
                return new com.bytedance.lighten.a.a.a(lVar.f68145b);
            } else if (!this.f67810g) {
                a(lVar, false, false);
                if (this.f67807d) {
                    hd.a(new Object[]{this.f67806a, "ImageCropUtils.convertedImageUrls(ImageCropUtils.kt:48)\n", lVar.f68144a + " not open, return " + lVar.f68145b});
                }
                return new com.bytedance.lighten.a.a.a(lVar.f68145b);
            } else {
                String str2 = lVar.f68144a;
                if (str2 == null || str2.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (this.f67807d) {
                        hd.a(new Object[]{this.f67806a, "ImageCropUtils.convertedImageUrls(ImageCropUtils.kt:56)\n", "no uri error, return " + lVar.f68145b});
                    }
                    return new com.bytedance.lighten.a.a.a(lVar.f68145b);
                }
                if (p.b(str2, "large/", false)) {
                    str2 = p.b(str2, "large/", "", false);
                }
                List<String> list = lVar.f68145b;
                if (list == null || list.isEmpty()) {
                    if (this.f67807d) {
                        hd.a(new Object[]{this.f67806a, "ImageCropUtils.convertedImageUrls(ImageCropUtils.kt:56)\n", "empty image list error, return " + lVar.f68145b});
                    }
                    return new com.bytedance.lighten.a.a.a(lVar.f68145b);
                }
                Pattern a2 = a();
                if (a2 == null || (matcher = a2.matcher(str2)) == null || !matcher.matches()) {
                    a(lVar, true, true);
                    if (this.f67807d) {
                        hd.a(new Object[]{this.f67806a, "ImageCropUtils.convertedImageUrls(ImageCropUtils.kt:56)\n", str2 + " not match error, return " + lVar.f68145b});
                    }
                    return new com.bytedance.lighten.a.a.a(lVar.f68145b);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        Uri parse = Uri.parse(it.next());
                        Locale locale = Locale.US;
                        String str3 = this.f67809f;
                        if (str3 == null) {
                            l.b();
                        }
                        l.b(parse, "");
                        String a3 = com.a.a(locale, str3, Arrays.copyOf(new Object[]{parse.getScheme(), parse.getHost(), str2, Integer.valueOf(i2), Integer.valueOf(i3)}, 5));
                        l.b(a3, "");
                        if (p.e((CharSequence) a3, (CharSequence) "?")) {
                            str = a3 + "&ilog=shrink";
                        } else {
                            str = a3 + "?ilog=shrink";
                        }
                        if (str != null) {
                            linkedHashSet.add(str);
                        }
                    } catch (Exception unused) {
                    }
                }
                if (!linkedHashSet.isEmpty()) {
                    list.addAll(0, linkedHashSet);
                }
                if (this.f67807d) {
                    hd.a(new Object[]{this.f67806a, "ImageCropUtils.convertedImageUrls(ImageCropUtils.kt:67)\n", str2 + " match, return " + lVar.f68145b});
                }
                return new com.bytedance.lighten.a.a.a(lVar.f68145b);
            }
        }
    }

    static {
        Covode.recordClassIndex(41738);
    }

    @Override // com.bytedance.lighten.a.a.b.a
    public final b<Object, com.bytedance.lighten.a.a.a> a() {
        return a.f67804b;
    }
}
