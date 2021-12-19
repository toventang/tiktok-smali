package com.ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory;
import com.ss.android.ugc.gamora.editor.rootscene.a;
import com.ss.android.ugc.gamora.editor.rootscene.c;
import com.ss.android.ugc.gamora.editor.rootscene.d;
import h.f.b.l;

public final class g implements IEditRootSceneFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final g f121881a = new g();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IEditRootSceneFactory f121882b;

    @Override // com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory
    public final d a(f fVar) {
        l.d(fVar, "");
        return this.f121882b.a(fVar);
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory
    public final Class<? extends d> a() {
        return this.f121882b.a();
    }

    static {
        Covode.recordClassIndex(79921);
    }

    private g() {
        IEditRootSceneFactory aVar;
        if (com.ss.android.ugc.aweme.port.in.g.a().A().a()) {
            aVar = new c();
        } else {
            aVar = new a();
        }
        this.f121882b = aVar;
    }
}
