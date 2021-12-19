package com.ss.android.ugc.aweme.qainvitation.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.qainvitation.e.f;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f119157a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(77376);
    }

    public static final f a() {
        f fVar = new f(30);
        try {
            f fVar2 = (f) SettingsManager.a().a("qa_invitation_settings", f.class);
            return fVar2 == null ? fVar : fVar2;
        } catch (Exception unused) {
            return fVar;
        }
    }
}
