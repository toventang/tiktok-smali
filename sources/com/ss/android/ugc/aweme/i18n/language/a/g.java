package com.ss.android.ugc.aweme.i18n.language.a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.language.d;
import com.ss.android.ugc.aweme.main.i;
import com.ss.android.ugc.aweme.main.j;
import com.ss.android.ugc.aweme.main.l;
import java.lang.ref.SoftReference;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public boolean f99779a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f99780b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f99781c;

    /* renamed from: d  reason: collision with root package name */
    a f99782d;

    /* renamed from: e  reason: collision with root package name */
    private Context f99783e;

    /* renamed from: f  reason: collision with root package name */
    private String f99784f;

    /* renamed from: g  reason: collision with root package name */
    private SoftReference<Context> f99785g;

    static {
        Covode.recordClassIndex(63619);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final g f99786a = new g((byte) 0);

        static {
            Covode.recordClassIndex(63620);
        }
    }

    private boolean a() {
        String[] strArr = {"MY"};
        int i2 = 0;
        do {
            String str = strArr[0];
            if (TextUtils.equals(str, d.g())) {
                this.f99784f = str;
                return false;
            }
            i2++;
        } while (i2 <= 0);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r0 != 1) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r1 == 1) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private g() {
        /*
            r4 = this;
            r4.<init>()
            android.content.Context r0 = com.bytedance.ies.ugc.appcontext.d.a()
            r4.f99783e = r0
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r0 = r0.locale
            java.lang.String r1 = r0.getLanguage()
            java.lang.String r0 = "en"
            boolean r3 = android.text.TextUtils.equals(r0, r1)
            r2 = 1
            r3 = r3 ^ r2
            r3 = r3 ^ r2
            r0 = 0
            if (r3 == 0) goto L_0x002a
            boolean r0 = r4.a()
            if (r0 == 0) goto L_0x004e
            r3 = 0
        L_0x002a:
            r1 = 2
            if (r3 != 0) goto L_0x0034
            com.ss.android.ugc.aweme.i18n.language.a.i.a(r1)
        L_0x0030:
            r2 = 0
        L_0x0031:
            r4.f99779a = r2
            return
        L_0x0034:
            int r0 = com.ss.android.ugc.aweme.i18n.language.a.i.a()
            if (r0 == 0) goto L_0x003d
            if (r0 == r2) goto L_0x0031
            goto L_0x0030
        L_0x003d:
            java.lang.Boolean r0 = com.ss.android.ugc.aweme.feed.s.a()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0048
            r1 = 1
        L_0x0048:
            com.ss.android.ugc.aweme.i18n.language.a.i.a(r1)
            if (r1 != r2) goto L_0x0030
            goto L_0x0031
        L_0x004e:
            com.ss.android.ugc.aweme.journey.p r0 = com.ss.android.ugc.aweme.journey.p.a.a()
            int r0 = r0.c()
            if (r0 != r2) goto L_0x002a
            r3 = 0
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.i18n.language.a.g.<init>():void");
    }

    /* synthetic */ g(byte b2) {
        this();
    }

    private static String[] a(String str) {
        if (TextUtils.equals(str, "MY")) {
            return new String[]{"ms-MY", "zh-Hant-TW", "en"};
        }
        return null;
    }

    private static boolean c(Context context) {
        if (!(context instanceof Activity)) {
            return false;
        }
        Activity activity = (Activity) context;
        if (!(activity instanceof j)) {
            return false;
        }
        Fragment curFragment = ((j) activity).getCurFragment();
        if (!(curFragment instanceof l)) {
            return false;
        }
        com.ss.android.ugc.aweme.base.f.a l2 = ((l) curFragment).l();
        if (!(l2 instanceof i) || !((i) l2).w().equals("FeedRecommendFragment")) {
            return false;
        }
        return true;
    }

    public final void b(Context context) {
        SoftReference<Context> softReference;
        if (this.f99781c) {
            if (!(context == null && ((softReference = this.f99785g) == null || (context = softReference.get()) == null)) && !com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34793i) {
                String[] a2 = a(this.f99784f);
                if (this.f99779a && c(context) && this.f99780b && a2 != null) {
                    b.i.b(new h(this, context, a2), b.i.f4826c);
                }
            }
        }
    }

    public final void a(Context context) {
        this.f99780b = true;
        SoftReference<Context> softReference = this.f99785g;
        if (softReference == null || softReference.get() == null) {
            this.f99785g = new SoftReference<>(context);
        }
        b(context);
    }
}
