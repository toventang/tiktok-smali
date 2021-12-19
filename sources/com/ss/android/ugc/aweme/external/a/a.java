package com.ss.android.ugc.aweme.external.a;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.external.a.e;
import com.ss.android.ugc.aweme.services.effect.EffectService;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.aweme.shortvideo.util.VideoCoverCacheImpl;
import com.ss.android.ugc.aweme.shortvideo.util.bo;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder;
import com.ss.android.ugc.effectmanager.IFetchModelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import dmt.av.video.c.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;
import java.util.Map;

public final class a implements IAVEffectService {
    static {
        Covode.recordClassIndex(56634);
    }

    public static final class c implements IAVEffectService.IAVEffectReadyCallback<com.ss.android.ugc.aweme.effectplatform.f> {
        static {
            Covode.recordClassIndex(56638);
        }

        c() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
        public final /* synthetic */ void finish(com.ss.android.ugc.aweme.effectplatform.f fVar) {
            com.ss.android.ugc.aweme.effectplatform.f fVar2 = fVar;
            if (fVar2 != null) {
                fVar2.a("default");
                fVar2.a("colorfilternew");
                fVar2.a("colorfilterexperiment");
                fVar2.a("mv");
                fVar2.a("infosticker");
                fVar2.a("infostickerv2");
                fVar2.a("emoji-android");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ IAVEffectService.IAVEffectReadyCallback $callback;

        static {
            Covode.recordClassIndex(56637);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(IAVEffectService.IAVEffectReadyCallback iAVEffectReadyCallback) {
            super(0);
            this.$callback = iAVEffectReadyCallback;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$callback.finish(null);
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.a<z> {
        final /* synthetic */ IAVEffectService.IAVEffectReadyCallback $callback;

        static {
            Covode.recordClassIndex(56641);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(IAVEffectService.IAVEffectReadyCallback iAVEffectReadyCallback) {
            super(0);
            this.$callback = iAVEffectReadyCallback;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            IAVEffectService.IAVEffectReadyCallback iAVEffectReadyCallback = this.$callback;
            if (iAVEffectReadyCallback != null) {
                iAVEffectReadyCallback.finish(new String[0]);
            }
            return z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.a<z> {
        final /* synthetic */ IAVEffectService.IAVEffectReadyCallback $callback;

        static {
            Covode.recordClassIndex(56644);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(IAVEffectService.IAVEffectReadyCallback iAVEffectReadyCallback) {
            super(0);
            this.$callback = iAVEffectReadyCallback;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$callback.finish(null);
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.a<z> {
        final /* synthetic */ IAVEffectService.IAVEffectReadyCallback $callback;

        static {
            Covode.recordClassIndex(56642);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(IAVEffectService.IAVEffectReadyCallback iAVEffectReadyCallback) {
            super(0);
            this.$callback = iAVEffectReadyCallback;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.android.ugc.aweme.port.in.c.d();
            DownloadableModelSupport instance = DownloadableModelSupport.getInstance();
            l.b(instance, "");
            this.$callback.finish(new C2169a(instance.getResourceFinder()));
            return z.f158842a;
        }

        /* renamed from: com.ss.android.ugc.aweme.external.a.a$f$a  reason: collision with other inner class name */
        public static final class C2169a implements IAVEffectService.ResourceFinder {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ DownloadableModelSupportResourceFinder f90286a;

            static {
                Covode.recordClassIndex(56643);
            }

            C2169a(DownloadableModelSupportResourceFinder downloadableModelSupportResourceFinder) {
                this.f90286a = downloadableModelSupportResourceFinder;
            }

            @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.ResourceFinder
            public final long createNativeResourceFinder(long j2) {
                return this.f90286a.createNativeResourceFinder(j2);
            }

            @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.ResourceFinder
            public final void release(long j2) {
                this.f90286a.release(j2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService
    public final void clearCacheInFTC() {
        Application application = com.ss.android.ugc.aweme.port.in.c.f115622a;
        l.b(application, "");
        buildEffectPlatform(application, new c(), null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.external.a.a$a  reason: collision with other inner class name */
    public static final class C2168a extends m implements h.f.a.a<z> {
        final /* synthetic */ IAVEffectService.IAVEffectReadyCallback $callback;
        final /* synthetic */ Context $context;
        final /* synthetic */ h.f.a.b $setParams;

        static {
            Covode.recordClassIndex(56635);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2168a(IAVEffectService.IAVEffectReadyCallback iAVEffectReadyCallback, Context context, h.f.a.b bVar) {
            super(0);
            this.$callback = iAVEffectReadyCallback;
            this.$context = context;
            this.$setParams = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            b.a aVar = dmt.av.video.c.b.f156874d;
            Application application = com.ss.android.ugc.aweme.port.in.c.f115622a;
            l.b(application, "");
            aVar.a(application).b();
            this.$callback.finish(com.ss.android.ugc.aweme.effectplatform.c.a(this.$context, new h.f.a.b<EffectPlatformBuilder, z>(this) {
                /* class com.ss.android.ugc.aweme.external.a.a.C2168a.AnonymousClass1 */
                final /* synthetic */ C2168a this$0;

                static {
                    Covode.recordClassIndex(56636);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(EffectPlatformBuilder effectPlatformBuilder) {
                    l.d(effectPlatformBuilder, "");
                    h.f.a.b bVar = this.this$0.$setParams;
                    if (bVar != null) {
                        bVar.invoke(effectPlatformBuilder);
                    }
                    return z.f158842a;
                }
            }));
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ IAVEffectService.IAVEffectReadyCallback $callback;
        final /* synthetic */ String[] $requirements;

        static {
            Covode.recordClassIndex(56639);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(String[] strArr, IAVEffectService.IAVEffectReadyCallback iAVEffectReadyCallback) {
            super(0);
            this.$requirements = strArr;
            this.$callback = iAVEffectReadyCallback;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            b.a aVar = dmt.av.video.c.b.f156874d;
            Application application = com.ss.android.ugc.aweme.port.in.c.f115622a;
            l.b(application, "");
            aVar.a(application).b();
            com.ss.android.ugc.aweme.port.in.c.d();
            DownloadableModelSupport.getInstance().fetchResourcesNeededByRequirements(this.$requirements, new IFetchModelListener(this) {
                /* class com.ss.android.ugc.aweme.external.a.a.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f90285a;

                static {
                    Covode.recordClassIndex(56640);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f90285a = r1;
                }

                @Override // com.ss.android.ugc.effectmanager.IFetchModelListener
                public final void onFailed(Exception exc) {
                    l.d(exc, "");
                    IAVEffectService.IAVEffectReadyCallback iAVEffectReadyCallback = this.f90285a.$callback;
                    if (iAVEffectReadyCallback != null) {
                        iAVEffectReadyCallback.finish(null);
                    }
                }

                @Override // com.ss.android.ugc.effectmanager.IFetchModelListener
                public final void onSuccess(String[] strArr) {
                    l.d(strArr, "");
                    IAVEffectService.IAVEffectReadyCallback iAVEffectReadyCallback = this.f90285a.$callback;
                    if (iAVEffectReadyCallback != null) {
                        iAVEffectReadyCallback.finish(strArr);
                    }
                }
            });
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService
    public final boolean isEffectControlGame(Effect effect) {
        l.d(effect, "");
        return com.ss.android.ugc.aweme.shortvideo.sticker.c.e(effect);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService
    public final void provideResourceFinder(IAVEffectService.IAVEffectReadyCallback<IAVEffectService.ResourceFinder> iAVEffectReadyCallback) {
        l.d(iAVEffectReadyCallback, "");
        e.a aVar = new e.a();
        aVar.f90301c = false;
        e.a a2 = aVar.a(new f(iAVEffectReadyCallback));
        a2.f90299a = new g(iAVEffectReadyCallback);
        a2.a();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService
    public final void fetchEffectModel(String[] strArr, IAVEffectService.IAVEffectReadyCallback<String[]> iAVEffectReadyCallback) {
        l.d(strArr, "");
        e.a aVar = new e.a();
        aVar.f90301c = false;
        e.a a2 = aVar.a(new d(strArr, iAVEffectReadyCallback));
        a2.f90299a = new e(iAVEffectReadyCallback);
        a2.a();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService
    public final void buildEffectPlatform(Context context, IAVEffectService.IAVEffectReadyCallback<com.ss.android.ugc.aweme.effectplatform.f> iAVEffectReadyCallback, h.f.a.b<? super EffectPlatformBuilder, z> bVar) {
        l.d(context, "");
        l.d(iAVEffectReadyCallback, "");
        buildEffectPlatform(context, false, iAVEffectReadyCallback, bVar);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService
    public final void buildEffectPlatform(Context context, boolean z, IAVEffectService.IAVEffectReadyCallback<com.ss.android.ugc.aweme.effectplatform.f> iAVEffectReadyCallback, h.f.a.b<? super EffectPlatformBuilder, z> bVar) {
        l.d(context, "");
        l.d(iAVEffectReadyCallback, "");
        e.a aVar = new e.a();
        aVar.f90301c = z;
        e.a a2 = aVar.a(new C2168a(iAVEffectReadyCallback, context, bVar));
        a2.f90299a = new b(iAVEffectReadyCallback);
        a2.a();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService
    public final void fetchEffectListResource(List<String> list, Map<String, String> map, boolean z, com.ss.android.ugc.aweme.effectplatform.f fVar, IFetchEffectListListener iFetchEffectListListener) {
        l.d(list, "");
        l.d(fVar, "");
        fVar.a(list, map, true, iFetchEffectListListener);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService
    public final void fetchEffectResource(String str, boolean z, Map<String, String> map, com.ss.android.ugc.aweme.effectplatform.f fVar, IFetchEffectListener iFetchEffectListener) {
        l.d(str, "");
        l.d(fVar, "");
        if (z) {
            EffectService.getInstance().fetchEffectWithMusicBind(fVar, str, map, iFetchEffectListener);
        } else {
            fVar.a(str, map, iFetchEffectListener);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService
    public final bo getVideoCoverBitmapCache(androidx.lifecycle.m mVar, String str, int i2, int i3, int i4, float f2) {
        l.d(mVar, "");
        l.d(str, "");
        com.ss.android.ttve.nativePort.d.a();
        VideoCoverCacheImpl videoCoverCacheImpl = new VideoCoverCacheImpl(mVar, str, i2, i3, i4, f2);
        l.b(videoCoverCacheImpl, "");
        return videoCoverCacheImpl;
    }
}
