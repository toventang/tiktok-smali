package com.ss.android.ugc.aweme.aabplugin.core.base;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.tasks.b;
import com.ss.android.ugc.aweme.aabplugin.core.b.e;
import java.util.Locale;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Locale f62481a;

    static {
        Covode.recordClassIndex(38449);
    }

    d(Locale locale) {
        this.f62481a = locale;
    }

    @Override // com.google.android.play.core.tasks.b
    public final void a(Object obj) {
        e.f62458b.put(this.f62481a.getLanguage(), Integer.valueOf(((Integer) obj).intValue()));
    }
}
