package com.ss.android.ugc.aweme.story.base.widget;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.h;
import com.bytedance.scene.j;
import com.bytedance.scene.navigation.d;
import com.bytedance.scene.navigation.g;
import h.f.b.l;

public final class a extends h {

    /* renamed from: c  reason: collision with root package name */
    public boolean f136939c;

    static {
        Covode.recordClassIndex(89502);
    }

    public final boolean canScrollHorizontally(int i2) {
        return this.f136939c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context) {
        super(context, null, 0);
        l.d(context, "");
    }

    public final void a(j jVar) {
        l.d(jVar, "");
        g gVar = new g(jVar.getClass());
        gVar.f43011c = false;
        gVar.f43012d = false;
        d dVar = new d();
        dVar.r = gVar.a();
        setNavigationScene(dVar);
        setRootSceneComponentFactory(new C3579a(jVar));
    }

    public /* synthetic */ a(Context context, byte b2) {
        this(context);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.base.widget.a$a  reason: collision with other inner class name */
    static final class C3579a implements com.bytedance.scene.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f136940a;

        static {
            Covode.recordClassIndex(89503);
        }

        C3579a(j jVar) {
            this.f136940a = jVar;
        }

        @Override // com.bytedance.scene.l
        public final j instantiateScene(ClassLoader classLoader, String str, Bundle bundle) {
            l.d(classLoader, "");
            l.d(str, "");
            if (l.a((Object) str, (Object) this.f136940a.getClass().getName())) {
                return this.f136940a;
            }
            return null;
        }
    }
}
