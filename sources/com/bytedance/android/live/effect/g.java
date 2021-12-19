package com.bytedance.android.live.effect;

import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.effect.api.a.j;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.live.effect.model.e;
import com.bytedance.android.live.u.h;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import f.a.t;
import f.a.v;
import f.a.w;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.List;

public final class g implements j {

    /* renamed from: a  reason: collision with root package name */
    static EffectManager f9836a;

    /* renamed from: b  reason: collision with root package name */
    public static final g f9837b = new g();

    private g() {
    }

    static final class a implements j.c<com.bytedance.android.livesdkapi.depend.model.a> {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<DataChannel> f9838a;

        static {
            Covode.recordClassIndex(5032);
        }

        @Override // com.bytedance.android.live.effect.api.a.j.c
        public final void a() {
            DataChannel dataChannel = this.f9838a.get();
            if (dataChannel != null) {
                dataChannel.c(j.class);
            }
        }

        public a(DataChannel dataChannel) {
            this.f9838a = new WeakReference<>(dataChannel);
        }

        @Override // com.bytedance.android.live.effect.api.a.j.c
        public final void a(List<e<com.bytedance.android.livesdkapi.depend.model.a>> list) {
            l.d(list, "");
            DataChannel dataChannel = this.f9838a.get();
            if (dataChannel != null) {
                dataChannel.b(a.class, list);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements IFetchEffectChannelListener {

        /* renamed from: a  reason: collision with root package name */
        public final String f9840a;

        /* renamed from: b  reason: collision with root package name */
        public final j.a<T> f9841b;

        /* renamed from: c  reason: collision with root package name */
        public final j.d<T> f9842c;

        /* renamed from: d  reason: collision with root package name */
        public final j.c<T> f9843d;

        static {
            Covode.recordClassIndex(5034);
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        private static boolean b() {
            if (com.ss.android.ugc.aweme.lancet.j.f107226e && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
                return com.ss.android.ugc.aweme.lancet.j.f107226e;
            }
            boolean a2 = a();
            com.ss.android.ugc.aweme.lancet.j.f107226e = a2;
            return a2;
        }

        public static final class a implements ICheckChannelListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f9844a;

            static {
                Covode.recordClassIndex(5035);
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
            public final void checkChannelFailed(ExceptionResult exceptionResult) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            a(c cVar) {
                this.f9844a = cVar;
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
            public final void checkChannelSuccess(boolean z) {
                if (z) {
                    g.f9836a.fetchEffectList(this.f9844a.f9840a, false, (IFetchEffectChannelListener) new d(this.f9844a.f9841b, this.f9844a.f9842c, this.f9844a.f9843d));
                }
            }
        }

        /* renamed from: com.bytedance.android.live.effect.g$c$c  reason: collision with other inner class name */
        static final class C0149c<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f9847a;

            static {
                Covode.recordClassIndex(5037);
            }

            C0149c(c cVar) {
                this.f9847a = cVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                List<e<T>> list = (List) obj;
                c cVar = this.f9847a;
                l.b(list, "");
                cVar.a(list);
            }
        }

        static final class b<T> implements w {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f9845a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ EffectChannelResponse f9846b;

            static {
                Covode.recordClassIndex(5036);
            }

            b(c cVar, EffectChannelResponse effectChannelResponse) {
                this.f9845a = cVar;
                this.f9846b = effectChannelResponse;
            }

            @Override // f.a.w
            public final void subscribe(v<List<e<T>>> vVar) {
                l.d(vVar, "");
                vVar.a(this.f9845a.f9842c.a(this.f9845a.f9841b.a(this.f9846b)));
            }
        }

        public final void a(List<e<T>> list) {
            if (list.isEmpty()) {
                onFail(new ExceptionResult(-1));
                return;
            }
            j.c<T> cVar = this.f9843d;
            if (cVar != null) {
                cVar.a(list);
            }
            y.e();
            if (b()) {
                g.f9836a.checkedEffectListUpdate(this.f9840a, new a(this));
            }
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
            y.e();
            if (b()) {
                g.f9836a.fetchEffectList(this.f9840a, false, (IFetchEffectChannelListener) new d(this.f9841b, this.f9842c, this.f9843d));
                return;
            }
            j.c<T> cVar = this.f9843d;
            if (cVar != null) {
                cVar.a();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
            if (h.b()) {
                t.a(new b(this, effectChannelResponse2)).a(new com.bytedance.android.livesdk.util.rxutils.f()).d(new C0149c(this));
            } else {
                a(this.f9842c.a(this.f9841b.a(effectChannelResponse2)));
            }
        }

        public c(String str, j.a<T> aVar, j.d<T> dVar, j.c<T> cVar) {
            l.d(str, "");
            l.d(aVar, "");
            l.d(dVar, "");
            this.f9840a = str;
            this.f9841b = aVar;
            this.f9842c = dVar;
            this.f9843d = cVar;
        }
    }

    static {
        Covode.recordClassIndex(5031);
        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IHostContext.class);
        l.b(a2, "");
        EffectManager effectManager = ((IHostContext) a2).getEffectManager();
        l.b(effectManager, "");
        f9836a = effectManager;
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements IFetchEffectChannelListener {

        /* renamed from: a  reason: collision with root package name */
        public final j.a<T> f9848a;

        /* renamed from: b  reason: collision with root package name */
        public final j.d<T> f9849b;

        /* renamed from: c  reason: collision with root package name */
        public final j.c<T> f9850c;

        static {
            Covode.recordClassIndex(5038);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
            j.c<T> cVar = this.f9850c;
            if (cVar != null) {
                cVar.a();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            List<e<T>> a2 = this.f9849b.a(this.f9848a.a(effectChannelResponse));
            if (a2.isEmpty()) {
                onFail(new ExceptionResult(-1));
                return;
            }
            j.c<T> cVar = this.f9850c;
            if (cVar != null) {
                cVar.a(a2);
            }
        }

        public d(j.a<T> aVar, j.d<T> dVar, j.c<T> cVar) {
            l.d(aVar, "");
            l.d(dVar, "");
            this.f9848a = aVar;
            this.f9849b = dVar;
            this.f9850c = cVar;
        }
    }

    static final class b implements IFetchEffectListener {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<j.b> f9839a;

        static {
            Covode.recordClassIndex(5033);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
        }

        public b(j.b bVar) {
            this.f9839a = new WeakReference<>(bVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            j.b bVar = this.f9839a.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            l.d(exceptionResult, "");
            this.f9839a.get();
        }
    }

    public static void a(j.c<FilterModel> cVar) {
        l.d(cVar, "");
        String str = com.bytedance.android.live.effect.api.a.f9640e;
        l.b(str, "");
        a(str, new com.bytedance.android.live.effect.c.a(), new com.bytedance.android.live.effect.c.b(), cVar);
    }

    public static void a(DataChannel dataChannel) {
        String str = com.bytedance.android.live.effect.api.a.f9639d;
        l.b(str, "");
        a(str, new com.bytedance.android.live.effect.e.f(), new com.bytedance.android.live.effect.e.g(), new a(dataChannel));
    }

    public static boolean a(com.bytedance.android.livesdkapi.depend.model.a aVar) {
        if (aVar == null) {
            return false;
        }
        return a(aVar.q);
    }

    public static boolean a(Effect effect) {
        if (effect == null) {
            return false;
        }
        if (DownloadableModelSupport.isInitialized()) {
            return DownloadableModelSupport.getInstance().isEffectReady(f9836a, effect);
        }
        return f9836a.isEffectDownloaded(effect);
    }

    public static void a(Effect effect, j.b bVar) {
        if (effect != null) {
            f9836a.fetchEffect(effect, new b(bVar));
        }
    }

    private static <T> void a(String str, j.a<T> aVar, j.d<T> dVar, j.c<T> cVar) {
        f9836a.fetchEffectListFromCache(str, new c(str, aVar, dVar, cVar));
    }
}
