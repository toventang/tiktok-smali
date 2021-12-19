package com.google.android.play.core.b;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public final class at {

    /* renamed from: a  reason: collision with root package name */
    private final Context f53119a;

    static {
        Covode.recordClassIndex(32801);
    }

    public at(Context context) {
        this.f53119a = context;
    }

    private static String a(Locale locale) {
        String concat;
        String valueOf = String.valueOf(locale.getLanguage());
        if (locale.getCountry().isEmpty()) {
            concat = "";
        } else {
            String valueOf2 = String.valueOf(locale.getCountry());
            concat = valueOf2.length() != 0 ? "_".concat(valueOf2) : new String("_");
        }
        String valueOf3 = String.valueOf(concat);
        return valueOf3.length() != 0 ? valueOf.concat(valueOf3) : new String(valueOf);
    }

    public final List<String> a() {
        Configuration configuration = this.f53119a.getResources().getConfiguration();
        if (Build.VERSION.SDK_INT < 24) {
            return Collections.singletonList(a(configuration.locale));
        }
        LocaleList locales = configuration.getLocales();
        ArrayList arrayList = new ArrayList(locales.size());
        for (int i2 = 0; i2 < locales.size(); i2++) {
            arrayList.add(a(locales.get(i2)));
        }
        return arrayList;
    }
}
