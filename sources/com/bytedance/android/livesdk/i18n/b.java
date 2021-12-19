package com.bytedance.android.livesdk.i18n;

import android.text.TextUtils;
import com.bytedance.android.live.core.c.a;
import com.bytedance.android.livesdk.i18n.I18nDbManager;
import com.bytedance.android.livesdk.i18n.I18nUpdateManager;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class b {

    /* renamed from: f  reason: collision with root package name */
    private static b f18219f;

    /* renamed from: a  reason: collision with root package name */
    public String f18220a = "";

    /* renamed from: b  reason: collision with root package name */
    public long f18221b;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, String> f18222c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public I18nUpdateManager f18223d;

    /* renamed from: e  reason: collision with root package name */
    public I18nDbManager f18224e;

    /* renamed from: g  reason: collision with root package name */
    private I18nUpdateManager.a f18225g = new I18nUpdateManager.a() {
        /* class com.bytedance.android.livesdk.i18n.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(10119);
        }

        @Override // com.bytedance.android.livesdk.i18n.I18nUpdateManager.a
        public final void a(String str, long j2, Map<String, String> map) {
            if (TextUtils.isEmpty(str) || !TextUtils.equals(str, b.this.f18220a)) {
                if (TextUtils.isEmpty(str)) {
                    a.a(6, "i18n_translation", "locale is not matched on api result, locale in result is empty");
                } else {
                    a.a(6, "i18n_translation", "locale is not matched on api result, locale in result is ".concat(String.valueOf(str)));
                }
            } else if (j2 == b.this.f18221b) {
                if (b.this.f18222c != null && b.this.f18222c.isEmpty()) {
                    b.this.f18224e.queryTranslations();
                }
                a.a(3, "i18n_translation", "version from api is lower than or equals with version in memory");
            } else if (map == null || map.isEmpty()) {
                if (b.this.f18222c != null && b.this.f18222c.isEmpty()) {
                    b.this.f18224e.queryTranslations();
                }
                a.a(3, "i18n_translation", "translations from api is empty, no need process");
            } else {
                b.this.f18221b = j2;
                b.this.f18222c = map;
                a.a(3, "i18n_translation", "on api result, update translationMap in memory, version is " + b.this.f18221b);
                b.this.f18224e.updateTranslations(j2, map);
            }
        }
    };

    /* renamed from: h  reason: collision with root package name */
    private I18nDbManager.a f18226h = new I18nDbManager.a() {
        /* class com.bytedance.android.livesdk.i18n.b.AnonymousClass2 */

        static {
            Covode.recordClassIndex(10120);
        }

        @Override // com.bytedance.android.livesdk.i18n.I18nDbManager.a
        public final void a(Exception exc) {
            a.a(6, "i18n_translation", exc.toString());
        }

        @Override // com.bytedance.android.livesdk.i18n.I18nDbManager.a
        public final void a(String str, Exception exc) {
            a.a(6, "i18n_translation", exc.toString());
            if (TextUtils.isEmpty(str) || !TextUtils.equals(b.this.f18220a, str)) {
                if (TextUtils.isEmpty(str)) {
                    a.a(6, "i18n_translation", "on db query result, but locale from db is empty");
                } else {
                    a.a(3, "i18n_translation", "on db query result, but locale is not matched");
                }
            }
            b.this.f18223d.a(b.this.f18221b);
        }

        @Override // com.bytedance.android.livesdk.i18n.I18nDbManager.a
        public final void a(String str, I18nDbManager.b bVar) {
            if (TextUtils.isEmpty(str) || !TextUtils.equals(b.this.f18220a, str)) {
                if (TextUtils.isEmpty(str)) {
                    a.a(6, "i18n_translation", "on db query result, but locale from db is empty");
                } else {
                    a.a(3, "i18n_translation", "on db query result, but locale is not matched");
                }
                b.this.f18223d.a(b.this.f18221b);
            } else if (bVar.f18200b == b.this.f18221b) {
                a.a(3, "i18n_translation", "version in db is lower than or equals with version in memory");
            } else if (bVar.f18201c == null || bVar.f18201c.isEmpty()) {
                b.this.f18223d.a(b.this.f18221b);
                a.a(3, "i18n_translation", "translations from db is empty, update from server");
            } else {
                b.this.f18221b = bVar.f18200b;
                b.this.f18222c = bVar.f18201c;
                a.a(3, "i18n_translation", "on db query result, update translationMap in memory, version is " + b.this.f18221b);
                b.this.f18223d.a(b.this.f18221b);
            }
        }
    };

    static {
        Covode.recordClassIndex(10118);
    }

    public static b a() {
        if (f18219f == null) {
            f18219f = new b();
        }
        return f18219f;
    }

    private b() {
    }

    public final String a(String str) {
        if (this.f18222c.containsKey(str)) {
            return this.f18222c.get(str);
        }
        I18nUpdateManager i18nUpdateManager = this.f18223d;
        if (i18nUpdateManager == null) {
            return null;
        }
        i18nUpdateManager.a(this.f18221b);
        return null;
    }

    public final void a(Locale locale) {
        a.a(3, "i18n_translation", "wanna switch locale");
        if (locale == null) {
            a.a(6, "i18n_translation", "new locale is empty, return");
            return;
        }
        String str = locale.getLanguage() + "_" + locale.getCountry().toLowerCase();
        a.a(3, "i18n_translation", "new locale is ".concat(String.valueOf(str)));
        if (TextUtils.equals(str, this.f18220a)) {
            a.a(3, "i18n_translation", "new locale is equals to current locale, return");
            return;
        }
        I18nUpdateManager i18nUpdateManager = this.f18223d;
        if (i18nUpdateManager != null) {
            a.a(3, "i18n_translation", "I18nUpdateManager destroy");
            i18nUpdateManager.f18205b.removeCallbacksAndMessages(null);
            if (i18nUpdateManager.f18211h != null && !i18nUpdateManager.f18211h.isDisposed()) {
                i18nUpdateManager.f18211h.dispose();
            }
            i18nUpdateManager.f18206c = null;
        }
        I18nDbManager i18nDbManager = this.f18224e;
        if (i18nDbManager != null) {
            i18nDbManager.destroy();
        }
        this.f18222c.clear();
        this.f18221b = 0;
        this.f18224e = new I18nDbManager(str, this.f18226h);
        this.f18223d = new I18nUpdateManager(str, this.f18225g);
        if (TextUtils.isEmpty(this.f18220a)) {
            a.a(3, "i18n_translation", "switch locale when app start, first query db");
            this.f18224e.queryTranslations();
        } else {
            a.a(3, "i18n_translation", "switch locale during app running, directly query api");
            this.f18223d.a(this.f18221b);
        }
        this.f18220a = str;
    }
}
