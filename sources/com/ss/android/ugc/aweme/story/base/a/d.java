package com.ss.android.ugc.aweme.story.base.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final c f136875a = new c((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public static final d f136876b = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(89451);
    }

    public static final c a() {
        SettingsManager a2 = SettingsManager.a();
        c cVar = f136875a;
        c cVar2 = (c) a2.a("studio_tt_story_settings", c.class, cVar);
        return cVar2 == null ? cVar : cVar2;
    }
}
