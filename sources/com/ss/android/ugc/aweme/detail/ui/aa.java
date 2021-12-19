package com.ss.android.ugc.aweme.detail.ui;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.i.g;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.d.a.c;

/* access modifiers changed from: package-private */
public final /* synthetic */ class aa implements u {

    /* renamed from: a  reason: collision with root package name */
    private final z f79910a;

    /* renamed from: b  reason: collision with root package name */
    private final ScrollSwitchStateManager f79911b;

    /* renamed from: c  reason: collision with root package name */
    private final int f79912c;

    static {
        Covode.recordClassIndex(49710);
    }

    aa(z zVar, ScrollSwitchStateManager scrollSwitchStateManager, int i2) {
        this.f79910a = zVar;
        this.f79911b = scrollSwitchStateManager;
        this.f79912c = i2;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        z zVar = this.f79910a;
        ScrollSwitchStateManager scrollSwitchStateManager = this.f79911b;
        int i2 = this.f79912c;
        h.u uVar = (h.u) obj;
        int intValue = ((Integer) uVar.getFirst()).intValue();
        ((Float) uVar.getSecond()).floatValue();
        int intValue2 = ((Integer) uVar.getThird()).intValue();
        if (intValue == scrollSwitchStateManager.c("page_feed")) {
            if (!zVar.n) {
                zVar.n = true;
                c.a(new g());
            }
            if (intValue2 > i2) {
                zVar.f79992k.b(false);
            } else {
                zVar.f79992k.b(true);
            }
        }
    }
}
