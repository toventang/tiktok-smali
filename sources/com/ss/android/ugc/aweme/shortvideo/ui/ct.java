package com.ss.android.ugc.aweme.shortvideo.ui;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.photo.a.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ct implements u {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131665a;

    static {
        Covode.recordClassIndex(86221);
    }

    ct(cj cjVar) {
        this.f131665a = cjVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        cj cjVar = this.f131665a;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return;
        }
        if (!bool.booleanValue()) {
            cjVar.f131601h.setAlpha(0.4f);
            cjVar.f131601h.a(0, null, 0);
            cjVar.f131606m.setValue(new a(cjVar.n.f125110b.getPermission(), cjVar.n.f125110b.getExcludeUserList(), cjVar.n.f125110b.getAllowRecommend()));
            cjVar.f131601h.setEnabled(false);
            cjVar.f131596c._enable.setValue(false);
            cjVar.f131596c._checked.setValue(false);
            cjVar.f131596c._alpha.setValue(Float.valueOf(0.4f));
            cjVar.f131597d._enable.setValue(false);
            cjVar.f131597d._checked.setValue(false);
            cjVar.f131597d._alpha.setValue(Float.valueOf(0.4f));
            cjVar.I.a(true);
            return;
        }
        cjVar.f131601h.setAlpha(1.0f);
        cjVar.f131601h.setEnabled(true);
        cjVar.f131596c._enable.setValue(true);
        cjVar.f131596c._alpha.setValue(Float.valueOf(1.0f));
        cjVar.f131597d._enable.setValue(true);
        cjVar.f131597d._alpha.setValue(Float.valueOf(1.0f));
        cjVar.I.a(false);
    }
}
