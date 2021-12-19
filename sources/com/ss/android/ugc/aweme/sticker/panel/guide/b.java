package com.ss.android.ugc.aweme.sticker.panel.guide;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.sticker.panel.guide.h;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.a.q;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class b implements g {

    /* renamed from: b  reason: collision with root package name */
    public static final a f135142b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public h f135143a;

    /* renamed from: c  reason: collision with root package name */
    private final List<q<Effect, ExtraParams, f, f>> f135144c;

    /* renamed from: d  reason: collision with root package name */
    private final h.f.a.a<f> f135145d;

    static {
        Covode.recordClassIndex(88340);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(88345);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a(q<? super Effect, ? super ExtraParams, ? super f, ? extends f> qVar) {
        l.d(qVar, "");
        this.f135144c.add(qVar);
    }

    private b(h.f.a.a<f> aVar) {
        this.f135145d = aVar;
        this.f135144c = new ArrayList();
        a(new q<Effect, ExtraParams, f, f>(this) {
            /* class com.ss.android.ugc.aweme.sticker.panel.guide.b.AnonymousClass1 */
            final /* synthetic */ b this$0;

            static {
                Covode.recordClassIndex(88341);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // h.f.a.q
            public final /* synthetic */ f invoke(Effect effect, ExtraParams extraParams, f fVar) {
                Effect effect2 = effect;
                ExtraParams extraParams2 = extraParams;
                l.d(effect2, "");
                l.d(fVar, "");
                if (extraParams2 == null || !extraParams2.isGifValid()) {
                    return null;
                }
                return new c(effect2, extraParams2, new h(this) {
                    /* class com.ss.android.ugc.aweme.sticker.panel.guide.b.AnonymousClass1.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f135146a;

                    static {
                        Covode.recordClassIndex(88342);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f135146a = r1;
                    }

                    @Override // com.ss.android.ugc.aweme.sticker.panel.guide.h
                    public final void a(boolean z, Effect effect, h.a aVar) {
                        l.d(effect, "");
                        l.d(aVar, "");
                        h hVar = this.f135146a.this$0.f135143a;
                        if (hVar != null) {
                            hVar.a(z, effect, aVar);
                        }
                    }
                });
            }
        });
        a(new q<Effect, ExtraParams, f, f>(this) {
            /* class com.ss.android.ugc.aweme.sticker.panel.guide.b.AnonymousClass2 */
            final /* synthetic */ b this$0;

            static {
                Covode.recordClassIndex(88343);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // h.f.a.q
            public final /* synthetic */ f invoke(Effect effect, ExtraParams extraParams, f fVar) {
                Effect effect2 = effect;
                ExtraParams extraParams2 = extraParams;
                l.d(effect2, "");
                l.d(fVar, "");
                if (extraParams2 == null || !extraParams2.isLottieValid()) {
                    return null;
                }
                return new k(effect2, extraParams2, new h(this) {
                    /* class com.ss.android.ugc.aweme.sticker.panel.guide.b.AnonymousClass2.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass2 f135147a;

                    static {
                        Covode.recordClassIndex(88344);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f135147a = r1;
                    }

                    @Override // com.ss.android.ugc.aweme.sticker.panel.guide.h
                    public final void a(boolean z, Effect effect, h.a aVar) {
                        l.d(effect, "");
                        l.d(aVar, "");
                        h hVar = this.f135147a.this$0.f135143a;
                        if (hVar != null) {
                            hVar.a(z, effect, aVar);
                        }
                    }
                });
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    @Override // com.ss.android.ugc.aweme.sticker.panel.guide.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.sticker.panel.guide.f a(com.ss.android.ugc.effectmanager.effect.model.Effect r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0008
            com.ss.android.ugc.aweme.sticker.panel.guide.f$a r0 = new com.ss.android.ugc.aweme.sticker.panel.guide.f$a
            r0.<init>()
            return r0
        L_0x0008:
            h.f.a.a<com.google.gson.f> r0 = r4.f135145d
            java.lang.Object r3 = r0.invoke()
            com.google.gson.f r3 = (com.google.gson.f) r3
            java.lang.String r2 = r5.getExtra()
            if (r2 == 0) goto L_0x001c
            int r0 = r2.length()
            if (r0 != 0) goto L_0x004b
        L_0x001c:
            r0 = 1
        L_0x001d:
            r1 = 0
            if (r0 == 0) goto L_0x0042
        L_0x0020:
            r0 = r1
        L_0x0021:
            java.util.List<h.f.a.q<com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams, com.google.gson.f, com.ss.android.ugc.aweme.sticker.panel.guide.f>> r1 = r4.f135144c
            java.util.Iterator r2 = r1.iterator()
        L_0x0027:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x003c
            java.lang.Object r1 = r2.next()
            h.f.a.q r1 = (h.f.a.q) r1
            java.lang.Object r1 = r1.invoke(r5, r0, r3)
            com.ss.android.ugc.aweme.sticker.panel.guide.f r1 = (com.ss.android.ugc.aweme.sticker.panel.guide.f) r1
            if (r1 == 0) goto L_0x0027
        L_0x003b:
            return r1
        L_0x003c:
            com.ss.android.ugc.aweme.sticker.panel.guide.a.a r1 = new com.ss.android.ugc.aweme.sticker.panel.guide.a.a
            r1.<init>(r5)
            goto L_0x003b
        L_0x0042:
            java.lang.Class<com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams> r0 = com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams.class
            java.lang.Object r0 = r3.a(r2, r0)     // Catch:{ Exception -> 0x0020 }
            com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams r0 = (com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams) r0     // Catch:{ Exception -> 0x0020 }
            goto L_0x0021
        L_0x004b:
            r0 = 0
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.panel.guide.b.a(com.ss.android.ugc.effectmanager.effect.model.Effect):com.ss.android.ugc.aweme.sticker.panel.guide.f");
    }

    public /* synthetic */ b(h.f.a.a aVar, byte b2) {
        this(aVar);
    }
}
