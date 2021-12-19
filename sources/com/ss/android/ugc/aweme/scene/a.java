package com.ss.android.ugc.aweme.scene;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.c.b;
import com.bytedance.scene.j;
import com.bytedance.scene.navigation.d;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.utils.i;
import h.f.b.l;
import h.z;
import java.util.List;

public final class a {
    static {
        Covode.recordClassIndex(78725);
    }

    /* renamed from: com.ss.android.ugc.aweme.scene.a$a  reason: collision with other inner class name */
    public static final class C3123a extends b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f120834a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f120835b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f120836c;

        static {
            Covode.recordClassIndex(78726);
        }

        /* renamed from: com.ss.android.ugc.aweme.scene.a$a$a  reason: collision with other inner class name */
        static final class RunnableC3124a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C3123a f120837a;

            static {
                Covode.recordClassIndex(78727);
            }

            RunnableC3124a(C3123a aVar) {
                this.f120837a = aVar;
            }

            public final void run() {
                this.f120837a.f120834a.b(this.f120837a);
            }
        }

        @Override // com.bytedance.scene.c.c, com.bytedance.scene.c.b
        public final void a(j jVar) {
            l.d(jVar, "");
            if (l.a(jVar.getClass(), this.f120835b)) {
                new SafeHandler(this.f120834a).post(new RunnableC3124a(this));
                this.f120836c.invoke();
            }
        }

        C3123a(d dVar, Class cls, h.f.a.a aVar) {
            this.f120834a = dVar;
            this.f120835b = cls;
            this.f120836c = aVar;
        }
    }

    public static final Activity a(Context context) {
        l.d(context, "");
        return i.a(context);
    }

    public static final boolean a(d dVar, j jVar) {
        l.d(dVar, "");
        l.d(jVar, "");
        List<j> C = dVar.C();
        l.b(C, "");
        for (T t : C) {
            if (l.a((Object) t, (Object) jVar)) {
                if (t != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static final boolean a(d dVar, Class<? extends j> cls) {
        l.d(dVar, "");
        l.d(cls, "");
        List<j> C = dVar.C();
        l.b(C, "");
        for (T t : C) {
            if (l.a(t.getClass(), cls)) {
                if (t != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static final void a(d dVar, Class<? extends j> cls, h.f.a.a<z> aVar) {
        l.d(dVar, "");
        l.d(cls, "");
        l.d(aVar, "");
        dVar.a(new C3123a(dVar, cls, aVar));
    }
}
