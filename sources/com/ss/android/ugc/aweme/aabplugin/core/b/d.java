package com.ss.android.ugc.aweme.aabplugin.core.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.plugin.a.a;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.aabplugin.core.base.n;
import com.ss.android.ugc.aweme.aabplugin.core.base.p;
import h.f.b.l;
import java.util.Locale;
import java.util.Map;

public final class d extends n {
    public final Locale q;

    static {
        Covode.recordClassIndex(38433);
    }

    @Override // com.ss.android.ugc.aweme.aabplugin.core.base.n
    public final boolean b() {
        return true;
    }

    public final String e() {
        String language = this.q.getLanguage();
        l.b(language, "");
        return language;
    }

    @Override // com.ss.android.ugc.aweme.aabplugin.core.base.n
    public final void a(Map<String, String> map) {
        l.d(map, "");
        map.put(StringSet.name, "df_language");
        String language = this.q.getLanguage();
        l.b(language, "");
        map.put("language", language);
    }

    public /* synthetic */ d(Locale locale, boolean z, p pVar, a aVar) {
        this(locale, z, false, pVar, aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Locale locale, boolean z, boolean z2, p pVar, a aVar) {
        super("df_language_" + locale.getLanguage(), "com.ss.android.ugc.aweme.dflanguage", z, z2, pVar, aVar);
        l.d(locale, "");
        l.d(aVar, "");
        this.q = locale;
    }
}
