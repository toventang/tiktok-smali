package com.bytedance.bddatefmt;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;
import h.f.b.l;
import java.util.Locale;

public class BDDateFormat {

    /* renamed from: a  reason: collision with root package name */
    public static final a f26342a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final String f26343b;

    static {
        Covode.recordClassIndex(15420);
    }

    private final native String nFormat(long j2, String str, String str2);

    private final native String nFormatRelative(int i2, int i3, String str);

    /* access modifiers changed from: package-private */
    public final native String nFormatAbbr(int i2, int i3, String str);

    public static final class a {
        static {
            Covode.recordClassIndex(15421);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static /* synthetic */ String a(int i2, a aVar) {
            MethodCollector.i(8675);
            Locale locale = Locale.getDefault();
            l.a((Object) locale, "");
            l.c(aVar, "");
            l.c(locale, "");
            BDDateFormat bDDateFormat = new BDDateFormat();
            l.c(aVar, "");
            l.c(locale, "");
            String nFormatAbbr = bDDateFormat.nFormatAbbr(i2, aVar.ordinal(), BDDateFormat.a(locale));
            MethodCollector.o(8675);
            return nFormatAbbr;
        }
    }

    public BDDateFormat() {
        this("");
    }

    public BDDateFormat(String str) {
        l.c(str, "");
        this.f26343b = str;
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a("rex");
        m.a(uptimeMillis, "rex");
    }

    static String a(Locale locale) {
        l.d(locale, "");
        String language = locale.getLanguage();
        String country = locale.getCountry();
        if (l.a((Object) language, (Object) "zh") && (country == null || country.length() == 0)) {
            return language + "-Hans-CN";
        }
        String b2 = b(locale);
        if ((b2 instanceof String) && b2 != null) {
            return b2;
        }
        return "";
    }

    private static String b(Locale locale) {
        l.c(locale, "");
        String language = locale.getLanguage();
        String country = locale.getCountry();
        if (l.a((Object) language, (Object) "zh")) {
            if (l.a((Object) country, (Object) "TW") || l.a((Object) country, (Object) "HK") || l.a((Object) country, (Object) "MO")) {
                return language + "-Hant-" + country;
            }
            if (l.a((Object) country, (Object) "CN") || l.a((Object) country, (Object) "SG")) {
                return language + "-Hans-" + country;
            }
        }
        return language + '-' + country;
    }

    public static /* synthetic */ String a(BDDateFormat bDDateFormat, long j2) {
        Locale locale = Locale.getDefault();
        l.a((Object) locale, "");
        return bDDateFormat.a(j2, locale);
    }

    public final String a(long j2, Locale locale) {
        MethodCollector.i(8721);
        l.c(locale, "");
        String nFormat = nFormat(j2, a(locale), this.f26343b);
        MethodCollector.o(8721);
        return nFormat;
    }
}
