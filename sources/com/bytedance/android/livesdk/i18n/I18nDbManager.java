package com.bytedance.android.livesdk.i18n;

import android.content.Context;
import android.text.TextUtils;
import androidx.room.i;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.i18n.db.I18nDatabase;
import com.bytedance.android.livesdk.i18n.db.d;
import com.bytedance.android.livesdk.i18n.db.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import f.a.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

public class I18nDbManager {
    private static volatile com.bytedance.android.livesdk.i18n.db.b informationDao;
    private static volatile boolean isPrepared;
    private static volatile e translationDao;
    private Map<String, String> cachedTranslationMap;
    private long cachedVersion;
    private a dbCallback;
    private boolean isQuerying;
    private boolean isUpdating;
    private String locale;
    private f.a.b.b queryDisposable;
    private f.a.b.b updateDisposable;

    /* access modifiers changed from: package-private */
    public interface a {
        static {
            Covode.recordClassIndex(10108);
        }

        void a(Exception exc);

        void a(String str, b bVar);

        void a(String str, Exception exc);
    }

    static {
        Covode.recordClassIndex(10107);
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        String f18199a;

        /* renamed from: b  reason: collision with root package name */
        long f18200b;

        /* renamed from: c  reason: collision with root package name */
        Map<String, String> f18201c;

        static {
            Covode.recordClassIndex(10109);
        }

        b() {
        }
    }

    private void updateCachedContentIfNeed() {
        long j2 = this.cachedVersion;
        if (j2 >= 0) {
            updateTranslations(j2, this.cachedTranslationMap);
            this.cachedVersion = -1;
            this.cachedTranslationMap = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void destroy() {
        com.bytedance.android.live.core.c.a.a(3, "i18n_translation", "I18nDbManager destroy");
        f.a.b.b bVar = this.queryDisposable;
        if (bVar != null && !bVar.isDisposed()) {
            this.queryDisposable.dispose();
        }
        f.a.b.b bVar2 = this.updateDisposable;
        if (bVar2 != null && !bVar2.isDisposed()) {
            this.updateDisposable.dispose();
        }
        this.dbCallback = null;
    }

    /* access modifiers changed from: package-private */
    public void queryTranslations() {
        com.bytedance.android.live.core.c.a.a(3, "i18n_translation", "query translations");
        if (this.isQuerying) {
            com.bytedance.android.live.core.c.a.a(3, "i18n_translation", "is querying, return");
            return;
        }
        this.isQuerying = true;
        this.queryDisposable = h.a((Callable) new c(this)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new d(this), new e(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ b lambda$queryTranslations$0$I18nDbManager() {
        com.bytedance.android.livesdk.i18n.db.a a2 = informationDao.a("locale");
        if (a2 == null) {
            throw new Exception("locale info not found in db");
        } else if (TextUtils.equals(this.locale, a2.f18235b)) {
            b bVar = new b();
            bVar.f18199a = this.locale;
            com.bytedance.android.livesdk.i18n.db.a a3 = informationDao.a("version");
            if (a3 != null) {
                bVar.f18200b = Long.valueOf(a3.f18235b).longValue();
                List<d> a4 = translationDao.a();
                if (!a4.isEmpty()) {
                    com.bytedance.android.live.core.c.a.a(3, "i18n_translation", a4.size() + " translations found in db, locale is " + this.locale + ", version is " + bVar.f18200b);
                    HashMap hashMap = new HashMap();
                    for (d dVar : a4) {
                        if (!TextUtils.isEmpty(dVar.f18239a) && !TextUtils.isEmpty(dVar.f18240b)) {
                            hashMap.put(dVar.f18239a, dVar.f18240b);
                        }
                    }
                    bVar.f18201c = hashMap;
                    return bVar;
                }
                throw new Exception("translations not found for locale: " + this.locale);
            }
            throw new Exception("version info not found in db");
        } else {
            throw new Exception("locale in db is " + a2.f18235b + ", but you are request for " + this.locale);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$updateTranslations$4$I18nDbManager(Boolean bool) {
        this.isUpdating = false;
        updateCachedContentIfNeed();
    }

    public static Context com_bytedance_android_livesdk_i18n_I18nDbManager_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$queryTranslations$1$I18nDbManager(b bVar) {
        this.isQuerying = false;
        a aVar = this.dbCallback;
        if (aVar != null) {
            aVar.a(this.locale, bVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$queryTranslations$2$I18nDbManager(Throwable th) {
        this.isQuerying = false;
        a aVar = this.dbCallback;
        if (aVar != null) {
            aVar.a(this.locale, new Exception(th));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$updateTranslations$5$I18nDbManager(Throwable th) {
        this.isUpdating = false;
        a aVar = this.dbCallback;
        if (aVar != null) {
            aVar.a(new Exception(th));
        }
        updateCachedContentIfNeed();
    }

    public static void prepareInit(Context context) {
        MethodCollector.i(9172);
        if (!isPrepared) {
            synchronized (I18nDbManager.class) {
                try {
                    if (!isPrepared) {
                        if (context != null) {
                            I18nDatabase i18nDatabase = (I18nDatabase) i.a(com_bytedance_android_livesdk_i18n_I18nDbManager_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context), I18nDatabase.class, "i18n_live").a();
                            translationDao = i18nDatabase.i();
                            informationDao = i18nDatabase.j();
                            isPrepared = true;
                        } else {
                            return;
                        }
                    }
                    MethodCollector.o(9172);
                } finally {
                    MethodCollector.o(9172);
                }
            }
        } else {
            MethodCollector.o(9172);
        }
    }

    I18nDbManager(String str, a aVar) {
        this.locale = str;
        this.dbCallback = aVar;
        prepareInit(com_bytedance_android_livesdk_i18n_I18nDbManager_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(y.e()));
    }

    /* access modifiers changed from: package-private */
    public void updateTranslations(long j2, Map<String, String> map) {
        com.bytedance.android.live.core.c.a.a(3, "i18n_translation", "update translations in db");
        if (TextUtils.isEmpty(this.locale) || map == null || map.isEmpty()) {
            if (TextUtils.isEmpty(this.locale)) {
                com.bytedance.android.live.core.c.a.a(6, "i18n_translation", "locale is empty, return");
            } else {
                com.bytedance.android.live.core.c.a.a(6, "i18n_translation", "translation map is empty, return");
            }
        } else if (this.isUpdating) {
            this.cachedVersion = j2;
            this.cachedTranslationMap = map;
            com.bytedance.android.live.core.c.a.a(3, "i18n_translation", "is updating, saved as cache and return");
        } else {
            this.isUpdating = true;
            this.updateDisposable = h.a((Callable) new f(this, map, j2)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new g(this), new h(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Boolean lambda$updateTranslations$3$I18nDbManager(Map map, long j2) {
        Set<Map.Entry> entrySet = map.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : entrySet) {
            if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                arrayList.add(new d((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        translationDao.b();
        translationDao.a(arrayList);
        informationDao.a(new com.bytedance.android.livesdk.i18n.db.a("locale", this.locale));
        informationDao.a(new com.bytedance.android.livesdk.i18n.db.a("version", String.valueOf(j2)));
        com.bytedance.android.live.core.c.a.a(3, "i18n_translation", arrayList.size() + " translations saved in db, locale is " + this.locale + ", version is " + j2);
        return true;
    }
}
