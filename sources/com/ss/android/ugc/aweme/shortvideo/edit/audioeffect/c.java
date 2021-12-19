package com.ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Collection;

public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final h f126773b = i.a((h.f.a.a) b.f126778a);

    /* renamed from: c  reason: collision with root package name */
    public static com.ss.android.ugc.aweme.effectplatform.f f126774c;

    /* renamed from: d  reason: collision with root package name */
    public static final h f126775d = i.a((h.f.a.a) C3291c.f126779a);

    /* renamed from: e  reason: collision with root package name */
    public static final a f126776e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public CategoryPageModel f126777a;

    public interface d {
        static {
            Covode.recordClassIndex(83183);
        }

        void a(Effect effect);

        void a(Effect effect, ExceptionResult exceptionResult);
    }

    public interface e {
        static {
            Covode.recordClassIndex(83184);
        }

        void a(CategoryPageModel categoryPageModel);

        void a(String str);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(83180);
        }

        public static c a() {
            return (c) c.f126773b.getValue();
        }

        public static g c() {
            return (g) c.f126775d.getValue();
        }

        private a() {
        }

        public static com.ss.android.ugc.aweme.effectplatform.f b() {
            if (c.f126774c == null) {
                Application application = com.ss.android.ugc.aweme.port.in.i.f115645a;
                l.b(application, "");
                com.ss.android.ugc.aweme.effectplatform.f a2 = com.ss.android.ugc.aweme.effectplatform.c.a(application, null);
                com.ss.android.ugc.aweme.port.in.g.a().v();
                c.f126774c = a2;
            }
            return c.f126774c;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private c() {
    }

    static final class b extends m implements h.f.a.a<c> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f126778a = new b();

        static {
            Covode.recordClassIndex(83181);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return new c((byte) 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$c  reason: collision with other inner class name */
    static final class C3291c extends m implements h.f.a.a<g> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3291c f126779a = new C3291c();

        static {
            Covode.recordClassIndex(83182);
        }

        C3291c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ g invoke() {
            return new g((byte) 0);
        }
    }

    static {
        Covode.recordClassIndex(83179);
    }

    public static final class f implements IFetchEffectListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f126780a;

        static {
            Covode.recordClassIndex(83185);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
        }

        f(d dVar) {
            this.f126780a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            Effect effect2 = effect;
            d dVar = this.f126780a;
            if (dVar != null) {
                dVar.a(effect2);
            }
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            l.d(exceptionResult, "");
            d dVar = this.f126780a;
            if (dVar != null) {
                dVar.a(effect, exceptionResult);
            }
        }
    }

    public /* synthetic */ c(byte b2) {
        this();
    }

    public static final class g implements IFetchCategoryEffectListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f126781a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f126782b;

        static {
            Covode.recordClassIndex(83186);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(CategoryPageModel categoryPageModel) {
            CategoryPageModel categoryPageModel2 = categoryPageModel;
            this.f126781a.f126777a = categoryPageModel2;
            e eVar = this.f126782b;
            if (eVar != null) {
                eVar.a(categoryPageModel2);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
            if (r0 == null) goto L_0x000f;
         */
        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onFail(com.ss.android.ugc.effectmanager.common.task.ExceptionResult r3) {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$e r1 = r2.f126782b
                if (r1 == 0) goto L_0x0014
                if (r3 == 0) goto L_0x000f
                r3.getErrorCode()
                java.lang.String r0 = r3.getMsg()
                if (r0 != 0) goto L_0x0011
            L_0x000f:
                java.lang.String r0 = ""
            L_0x0011:
                r1.a(r0)
            L_0x0014:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c.g.onFail(com.ss.android.ugc.effectmanager.common.task.ExceptionResult):void");
        }

        g(c cVar, e eVar) {
            this.f126781a = cVar;
            this.f126782b = eVar;
        }
    }

    public static boolean a(Effect effect) {
        com.ss.android.ugc.aweme.effectplatform.f b2;
        if (a.a(effect)) {
            return true;
        }
        if (effect == null || (((b2 = a.b()) == null || !b2.a(effect)) && effect.getEffectType() == 0)) {
            return false;
        }
        return true;
    }

    public final void a(e eVar) {
        CategoryPageModel categoryPageModel = this.f126777a;
        if (categoryPageModel == null || com.bytedance.common.utility.collection.b.a((Collection) categoryPageModel.getUrl_prefix())) {
            com.ss.android.ugc.aweme.effectplatform.f b2 = a.b();
            if (b2 != null) {
                b2.a("voicechanger", "all", false, 0, 0, 0, "", (IFetchCategoryEffectListener) new g(this, eVar));
                return;
            }
            return;
        }
        eVar.a(this.f126777a);
    }
}
