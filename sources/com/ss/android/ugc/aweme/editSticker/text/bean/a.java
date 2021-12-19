package com.ss.android.ugc.aweme.editSticker.text.bean;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.c.b.a.d;
import h.c.b.a.k;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.i;

public final class a extends com.ss.android.ugc.aweme.editSticker.b.a {

    /* renamed from: c  reason: collision with root package name */
    public InnerEffectTextLayoutConfig f88417c;

    /* renamed from: d  reason: collision with root package name */
    public Set<h> f88418d;

    /* renamed from: e  reason: collision with root package name */
    public final g f88419e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.a$a  reason: collision with other inner class name */
    public static final class C2145a extends d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(55642);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2145a(a aVar, h.c.d dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(this);
        }
    }

    static {
        Covode.recordClassIndex(55641);
    }

    public final int hashCode() {
        return this.f88093b.getEffectId().hashCode();
    }

    @Override // com.ss.android.ugc.aweme.editSticker.b.a
    public final boolean a() {
        if (this.f88419e.f88424a || this.f88419e.f88425b || super.a()) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return l.a((Object) ((com.ss.android.ugc.aweme.editSticker.b.a) obj).f88093b.getEffectId(), (Object) this.f88093b.getEffectId());
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class b extends k implements m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ List $fontBeanList;
        int label;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(55643);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, List list, Context context, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
            this.$fontBeanList = list;
            this.$context = context;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new b(this.this$0, this.$fontBeanList, this.$context, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                if (!this.this$0.f88419e.f88424a) {
                    final OuterEffectTextLayoutConfig outerEffectTextLayoutConfig = (OuterEffectTextLayoutConfig) com.ss.android.ugc.aweme.editSticker.d.b().a((Reader) new FileReader(this.this$0.f88093b.getUnzipPath() + File.separator + "effect_text.json"), OuterEffectTextLayoutConfig.class);
                    kotlinx.coroutines.android.b bVar = com.ss.android.ugc.asve.editor.d.f62009a;
                    AnonymousClass1 r1 = new m<am, h.c.d<? super z>, Object>(this, null) {
                        /* class com.ss.android.ugc.aweme.editSticker.text.bean.a.b.AnonymousClass1 */
                        int label;
                        final /* synthetic */ b this$0;

                        static {
                            Covode.recordClassIndex(55644);
                        }

                        {
                            this.this$0 = r2;
                        }

                        @Override // h.c.b.a.a
                        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                            l.d(dVar, "");
                            return 

                            /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
                                if (((java.lang.Boolean) r3).booleanValue() != false) goto L_0x0042;
                             */
                            /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
                            /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final java.lang.Object a(h.c.d<? super java.lang.Boolean> r6) {
                                /*
                                    r5 = this;
                                    boolean r0 = r6 instanceof com.ss.android.ugc.aweme.editSticker.text.bean.a.C2145a
                                    if (r0 == 0) goto L_0x0044
                                    r4 = r6
                                    com.ss.android.ugc.aweme.editSticker.text.bean.a$a r4 = (com.ss.android.ugc.aweme.editSticker.text.bean.a.C2145a) r4
                                    int r0 = r4.label
                                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r0 = r0 & r1
                                    if (r0 == 0) goto L_0x0044
                                    int r0 = r4.label
                                    int r0 = r0 - r1
                                    r4.label = r0
                                L_0x0013:
                                    java.lang.Object r3 = r4.result
                                    h.c.a.a r2 = h.c.a.a.COROUTINE_SUSPENDED
                                    int r0 = r4.label
                                    r1 = 1
                                    if (r0 == 0) goto L_0x002e
                                    if (r0 != r1) goto L_0x004a
                                    h.r.a(r3)
                                L_0x0021:
                                    java.lang.Boolean r3 = (java.lang.Boolean) r3
                                    boolean r0 = r3.booleanValue()
                                    if (r0 != 0) goto L_0x0042
                                L_0x0029:
                                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                                    return r0
                                L_0x002e:
                                    h.r.a(r3)
                                    boolean r0 = r5.a()
                                    if (r0 != 0) goto L_0x0042
                                    com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r5.f88093b
                                    r4.label = r1
                                    java.lang.Object r3 = com.ss.android.ugc.aweme.editSticker.b.b.a(r0, r4)
                                    if (r3 != r2) goto L_0x0021
                                    return r2
                                L_0x0042:
                                    r1 = 0
                                    goto L_0x0029
                                L_0x0044:
                                    com.ss.android.ugc.aweme.editSticker.text.bean.a$a r4 = new com.ss.android.ugc.aweme.editSticker.text.bean.a$a
                                    r4.<init>(r5, r6)
                                    goto L_0x0013
                                L_0x004a:
                                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                    r1.<init>(r0)
                                    throw r1
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.text.bean.a.a(h.c.d):java.lang.Object");
                            }

                            public /* synthetic */ a(Effect effect, g gVar) {
                                this(effect, new HashSet(), gVar);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            private a(Effect effect, Set<h> set, g gVar) {
                                super(effect);
                                l.d(effect, "");
                                l.d(set, "");
                                l.d(gVar, "");
                                this.f88417c = null;
                                this.f88418d = set;
                                this.f88419e = gVar;
                            }

                            public final Object a(Context context, List<h> list, h.c.d<? super z> dVar) {
                                Object a2 = i.a(bf.f159041b, new b(this, list, context, null), dVar);
                                if (a2 == h.c.a.a.COROUTINE_SUSPENDED) {
                                    return a2;
                                }
                                return z.f158842a;
                            }
                        }
