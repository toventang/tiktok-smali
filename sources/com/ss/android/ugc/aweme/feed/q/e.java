package com.ss.android.ugc.aweme.feed.q;

import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.homepage.api.interaction.BaseScrollSwitchStateManager;
import f.a.d.f;
import java.util.Collection;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f93784a;

    static {
        Covode.recordClassIndex(59671);
    }

    e(a aVar) {
        this.f93784a = aVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        a aVar = this.f93784a;
        BaseScrollSwitchStateManager baseScrollSwitchStateManager = (BaseScrollSwitchStateManager) obj;
        if (aVar.W != null) {
            baseScrollSwitchStateManager.a(!b.a((Collection) aVar.W.e()));
        }
    }
}
