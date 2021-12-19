package com.bytedance.ies.xelement;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.g;

public final class XElementConfigLite {
    private final b<Context, DeclarativeVideoPlayBoxViewDelegate> declarativeVideoPlayBoxViewProvider;

    static {
        Covode.recordClassIndex(21962);
    }

    public final b<Context, DeclarativeVideoPlayBoxViewDelegate> getDeclarativeVideoPlayBoxViewProvider() {
        return this.declarativeVideoPlayBoxViewProvider;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: h.f.a.b<? super android.content.Context, ? extends com.bytedance.ies.xelement.DeclarativeVideoPlayBoxViewDelegate> */
    /* JADX WARN: Multi-variable type inference failed */
    private XElementConfigLite(b<? super Context, ? extends DeclarativeVideoPlayBoxViewDelegate> bVar) {
        this.declarativeVideoPlayBoxViewProvider = bVar;
    }

    public /* synthetic */ XElementConfigLite(b bVar, g gVar) {
        this(bVar);
    }
}
