package com.ss.android.ugc.aweme.music.ui;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effectplatform.f;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import f.a.l.g;
import f.a.t;
import f.a.v;
import f.a.w;
import h.a.n;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class o {
    static {
        Covode.recordClassIndex(71979);
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f112010a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f112011b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Effect f112012c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f112013d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Map f112014e;

        static {
            Covode.recordClassIndex(71988);
        }

        b(g gVar, String str, Effect effect, Context context, Map map) {
            this.f112010a = gVar;
            this.f112011b = str;
            this.f112012c = effect;
            this.f112013d = context;
            this.f112014e = map;
        }

        @Override // f.a.w
        public final void subscribe(final v<q> vVar) {
            l.d(vVar, "");
            IAVEffectService effectService = AVExternalServiceImpl.a().abilityService().effectService();
            final AnonymousClass1 r3 = new h.f.a.b<Effect, z>(this) {
                /* class com.ss.android.ugc.aweme.music.ui.o.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(71989);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(Effect effect) {
                    a(effect);
                    return z.f158842a;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: f.a.l.g */
                /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                public final void a(Effect effect) {
                    this.this$0.f112010a.onNext(new p(-101, -104, effect, 8));
                    v vVar = vVar;
                    vVar.a(new q(null, null, null, null, effect, -105, null, 79));
                    vVar.a();
                }
            };
            if (TextUtils.isEmpty(this.f112011b)) {
                r3.a(null);
                return;
            }
            Effect effect = this.f112012c;
            if (effect == null) {
                effectService.buildEffectPlatform(this.f112013d, new IAVEffectService.IAVEffectReadyCallback<f>(this) {
                    /* class com.ss.android.ugc.aweme.music.ui.o.b.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f112015a;

                    static {
                        Covode.recordClassIndex(71990);
                    }

                    /* renamed from: com.ss.android.ugc.aweme.music.ui.o$b$2$a */
                    public static final class a implements IFetchEffectListListener {

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass2 f112017a;

                        static {
                            Covode.recordClassIndex(71991);
                        }

                        a(AnonymousClass2 r1) {
                            this.f112017a = r1;
                        }

                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                        public final void onFail(ExceptionResult exceptionResult) {
                            r3.a(null);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                        public final /* synthetic */ void onSuccess(List<Effect> list) {
                            Effect effect;
                            List<Effect> list2 = list;
                            AnonymousClass1 r1 = r3;
                            if (list2 != null) {
                                effect = list2.get(0);
                            } else {
                                effect = null;
                            }
                            r1.a(effect);
                        }
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
                    public final /* synthetic */ void finish(f fVar) {
                        f fVar2 = fVar;
                        if (fVar2 != null) {
                            String str = this.f112015a.f112011b;
                            if (str == null) {
                                l.b();
                            }
                            fVar2.a(n.a(str), this.f112015a.f112014e, false, (IFetchEffectListListener) new a(this));
                        }
                    }

                    {
                        this.f112015a = r1;
                    }
                }, null);
            } else {
                r3.a(effect);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f111999a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Effect f112000b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f112001c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f112002d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Map f112003e;

        static {
            Covode.recordClassIndex(71980);
        }

        a(String str, Effect effect, g gVar, Context context, Map map) {
            this.f111999a = str;
            this.f112000b = effect;
            this.f112001c = gVar;
            this.f112002d = context;
            this.f112003e = map;
        }

        @Override // f.a.w
        public final void subscribe(final v<q> vVar) {
            l.d(vVar, "");
            final AnonymousClass1 r1 = new h.f.a.b<Effect, z>() {
                /* class com.ss.android.ugc.aweme.music.ui.o.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(71981);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(Effect effect) {
                    a(effect);
                    return z.f158842a;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                public final void a(Effect effect) {
                    v vVar = vVar;
                    vVar.a(new q(null, null, null, null, effect, 100, null, 79));
                    vVar.a();
                }
            };
            final AnonymousClass2 r5 = new m<Effect, ExceptionResult, z>() {
                /* class com.ss.android.ugc.aweme.music.ui.o.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(71982);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ z invoke(Effect effect, ExceptionResult exceptionResult) {
                    a(effect, exceptionResult);
                    return z.f158842a;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                public final void a(Effect effect, ExceptionResult exceptionResult) {
                    l.d(exceptionResult, "");
                    v vVar = vVar;
                    vVar.a(new q(null, null, null, null, effect, -103, exceptionResult, 15));
                    vVar.a();
                }
            };
            if (TextUtils.isEmpty(this.f111999a)) {
                r5.a(this.f112000b, new ExceptionResult(-1));
                return;
            }
            final IAVEffectService effectService = AVExternalServiceImpl.a().abilityService().effectService();
            final AnonymousClass3 r3 = new h.f.a.b<Effect, z>(this) {
                /* class com.ss.android.ugc.aweme.music.ui.o.a.AnonymousClass3 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(71983);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(Effect effect) {
                    a(effect);
                    return z.f158842a;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: f.a.l.g */
                /* JADX WARN: Multi-variable type inference failed */
                public final void a(final Effect effect) {
                    this.this$0.f112001c.onNext(new p(-101, -104, effect, 8));
                    effectService.buildEffectPlatform(this.this$0.f112002d, new IAVEffectService.IAVEffectReadyCallback<f>(this) {
                        /* class com.ss.android.ugc.aweme.music.ui.o.a.AnonymousClass3.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass3 f112004a;

                        static {
                            Covode.recordClassIndex(71984);
                        }

                        /* renamed from: com.ss.android.ugc.aweme.music.ui.o$a$3$1$a  reason: collision with other inner class name */
                        public static final class C2863a implements IEffectDownloadProgressListener {

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ AnonymousClass1 f112006a;

                            static {
                                Covode.recordClassIndex(71985);
                            }

                            C2863a(AnonymousClass1 r1) {
                                this.f112006a = r1;
                            }

                            /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: f.a.l.g */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                            public final void onStart(Effect effect) {
                                l.d(effect, "");
                                this.f112006a.f112004a.this$0.f112001c.onNext(new p(-101, -102, effect, 8));
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                            public final /* synthetic */ void onSuccess(Effect effect) {
                                Effect effect2 = effect;
                                l.d(effect2, "");
                                r1.a(effect2);
                            }

                            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                            public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                                l.d(exceptionResult, "");
                                r5.a(effect, exceptionResult);
                            }

                            /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: f.a.l.g */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
                            public final void onProgress(Effect effect, int i2, long j2) {
                                l.d(effect, "");
                                this.f112006a.f112004a.this$0.f112001c.onNext(new p(-101, i2, effect, j2));
                            }
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
                        public final /* synthetic */ void finish(f fVar) {
                            f fVar2 = fVar;
                            if (fVar2 == null) {
                                return;
                            }
                            if (fVar2.a(effect)) {
                                r1.a(effect);
                                return;
                            }
                            C2863a aVar = new C2863a(this);
                            IAVEffectService iAVEffectService = effectService;
                            String str = this.f112004a.this$0.f111999a;
                            if (str == null) {
                                l.b();
                            }
                            iAVEffectService.fetchEffectResource(str, true, this.f112004a.this$0.f112003e, fVar2, aVar);
                        }

                        {
                            this.f112004a = r1;
                        }
                    }, null);
                }
            };
            Effect effect = this.f112000b;
            if (effect == null) {
                effectService.buildEffectPlatform(this.f112002d, new IAVEffectService.IAVEffectReadyCallback<f>(this) {
                    /* class com.ss.android.ugc.aweme.music.ui.o.a.AnonymousClass4 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f112007a;

                    static {
                        Covode.recordClassIndex(71986);
                    }

                    /* renamed from: com.ss.android.ugc.aweme.music.ui.o$a$4$a  reason: collision with other inner class name */
                    public static final class C2864a implements IFetchEffectListListener {

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass4 f112009a;

                        static {
                            Covode.recordClassIndex(71987);
                        }

                        C2864a(AnonymousClass4 r1) {
                            this.f112009a = r1;
                        }

                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                        public final void onFail(ExceptionResult exceptionResult) {
                            r3.a(null);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                        public final /* synthetic */ void onSuccess(List<Effect> list) {
                            Effect effect;
                            List<Effect> list2 = list;
                            AnonymousClass3 r1 = r3;
                            if (list2 != null) {
                                effect = list2.get(0);
                            } else {
                                effect = null;
                            }
                            r1.a(effect);
                        }
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
                    public final /* synthetic */ void finish(f fVar) {
                        f fVar2 = fVar;
                        if (fVar2 != null) {
                            String str = this.f112007a.f111999a;
                            if (str == null) {
                                l.b();
                            }
                            fVar2.a(n.a(str), this.f112007a.f112003e, false, (IFetchEffectListListener) new C2864a(this));
                        }
                    }

                    {
                        this.f112007a = r1;
                    }
                }, null);
            } else {
                r3.a(effect);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusicModel f112018a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.music.f f112019b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f112020c;

        static {
            Covode.recordClassIndex(71992);
        }

        c(MusicModel musicModel, com.ss.android.ugc.aweme.music.f fVar, g gVar) {
            this.f112018a = musicModel;
            this.f112019b = fVar;
            this.f112020c = gVar;
        }

        @Override // f.a.w
        public final void subscribe(final v<q> vVar) {
            l.d(vVar, "");
            MusicModel musicModel = this.f112018a;
            if (musicModel == null) {
                vVar.a(new q(null, null, -103, null, null, null, null, 123));
                vVar.a();
            } else if (!this.f112019b.a(musicModel, new com.ss.android.ugc.aweme.music.service.b(this) {
                /* class com.ss.android.ugc.aweme.music.ui.o.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f112021a;

                static {
                    Covode.recordClassIndex(71993);
                }

                @Override // com.ss.android.ugc.aweme.music.service.b
                public final void a() {
                }

                /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: f.a.l.g */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.ss.android.ugc.aweme.music.service.b
                public final void b() {
                    this.f112021a.f112020c.onNext(new p(-100, -102, (Effect) null, 12));
                }

                /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: f.a.l.g */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.ss.android.ugc.aweme.music.service.b
                public final void a(int i2) {
                    this.f112021a.f112020c.onNext(new p(-100, i2, (Effect) null, 12));
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.ss.android.ugc.aweme.music.service.b
                public final void a(com.ss.android.ugc.musicprovider.a aVar) {
                    l.d(aVar, "");
                    vVar.a(new q(null, null, -103, aVar, null, null, null, 115));
                    vVar.a();
                }

                {
                    this.f112021a = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.ss.android.ugc.aweme.music.service.b
                public final void a(String str, MusicWaveBean musicWaveBean) {
                    l.d(str, "");
                    vVar.a(new q(str, musicWaveBean, 100, null, null, null, null, 120));
                    vVar.a();
                }
            }, true, true)) {
                vVar.a(new q(null, null, -103, new com.ss.android.ugc.musicprovider.a(-1, "don`t start download music"), null, null, null, 115));
                vVar.a();
            }
        }
    }

    public static final t<q> a(com.ss.android.ugc.aweme.music.f fVar, MusicModel musicModel, g<p> gVar) {
        l.d(fVar, "");
        l.d(gVar, "");
        t<q> a2 = t.a(new c(musicModel, fVar, gVar));
        l.b(a2, "");
        return a2;
    }

    public static final t<q> a(Context context, String str, Effect effect, g<p> gVar, Map<String, String> map) {
        l.d(context, "");
        l.d(gVar, "");
        t<q> a2 = t.a(new a(str, effect, gVar, context, map));
        l.b(a2, "");
        return a2;
    }
}
