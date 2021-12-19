package com.ss.android.ugc.aweme.ftc.components.audioeffect;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effectplatform.f;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final h f97610a = i.a((h.f.a.a) C2352b.f97614a);

    /* renamed from: b  reason: collision with root package name */
    public static f f97611b;

    /* renamed from: c  reason: collision with root package name */
    public static final h f97612c = i.a((h.f.a.a) c.f97615a);

    /* renamed from: d  reason: collision with root package name */
    public static final a f97613d = new a((byte) 0);

    public interface d {
        static {
            Covode.recordClassIndex(62030);
        }

        void a(Effect effect);

        void a(Effect effect, ExceptionResult exceptionResult);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(62027);
        }

        public static b a() {
            return (b) b.f97610a.getValue();
        }

        public static g c() {
            return (g) b.f97612c.getValue();
        }

        private a() {
        }

        public static f b() {
            if (b.f97611b == null) {
                Application application = com.ss.android.ugc.aweme.port.in.i.f115645a;
                l.b(application, "");
                f a2 = com.ss.android.ugc.aweme.effectplatform.c.a(application, null);
                com.ss.android.ugc.aweme.port.in.g.a().v();
                b.f97611b = a2;
            }
            return b.f97611b;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.b$b  reason: collision with other inner class name */
    static final class C2352b extends m implements h.f.a.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2352b f97614a = new C2352b();

        static {
            Covode.recordClassIndex(62028);
        }

        C2352b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            return new b((byte) 0);
        }
    }

    static final class c extends m implements h.f.a.a<g> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f97615a = new c();

        static {
            Covode.recordClassIndex(62029);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ g invoke() {
            return new g((byte) 0);
        }
    }

    static {
        Covode.recordClassIndex(62026);
    }

    public static final class e implements IFetchEffectListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f97616a;

        static {
            Covode.recordClassIndex(62031);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
        }

        e(d dVar) {
            this.f97616a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            Effect effect2 = effect;
            d dVar = this.f97616a;
            if (dVar != null) {
                dVar.a(effect2);
            }
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            l.d(exceptionResult, "");
            d dVar = this.f97616a;
            if (dVar != null) {
                dVar.a(effect, exceptionResult);
            }
        }
    }

    public /* synthetic */ b(byte b2) {
        this();
    }

    public static boolean a(Effect effect) {
        f b2;
        if (a.a(effect)) {
            return true;
        }
        if (effect == null || (((b2 = a.b()) == null || !b2.a(effect)) && effect.getEffectType() == 0)) {
            return false;
        }
        return true;
    }
}
