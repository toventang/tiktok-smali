package com.bytedance.assem.arch.extensions;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.m;
import com.bytedance.assem.arch.b.g;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.e;
import com.bytedance.assem.arch.core.p;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.f.b.z;
import h.w;

public final class d {
    static {
        Covode.recordClassIndex(14914);
    }

    public static final class a extends i.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AssemSupervisor f25632a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f25633b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f25634c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f25635d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Assembler f25636e;

        static {
            Covode.recordClassIndex(14915);
        }

        @Override // androidx.fragment.app.i.b
        public final void onFragmentViewDestroyed(i iVar, Fragment fragment) {
            l.c(iVar, "");
            l.c(fragment, "");
            super.onFragmentViewDestroyed(iVar, fragment);
            if (fragment == this.f25633b) {
                this.f25632a.b();
                this.f25636e.d(fragment);
            }
        }

        a(AssemSupervisor assemSupervisor, Fragment fragment, z.e eVar, e eVar2, Assembler assembler) {
            this.f25632a = assemSupervisor;
            this.f25633b = fragment;
            this.f25634c = eVar;
            this.f25635d = eVar2;
            this.f25636e = assembler;
        }
    }

    public static final void a(p pVar, b<? super Assembler, h.z> bVar) {
        l.c(pVar, "");
        l.c(bVar, "");
        androidx.fragment.app.e b2 = b.b(pVar);
        if (b2 != null) {
            ac a2 = ae.a(b2, (ad.b) null).a(Assembler.class);
            l.a((Object) a2, "");
            Assembler assembler = (Assembler) a2;
            com.bytedance.assem.arch.core.d b3 = assembler.b(pVar);
            if (b3 == null) {
                b3 = new com.bytedance.assem.arch.core.d(assembler.b(pVar.bx_().f25531d));
                assembler.a(pVar, b3);
            }
            e c2 = assembler.c(pVar);
            if (c2 == null) {
                c2 = new e(assembler.c(pVar.bx_().f25531d));
                assembler.a(pVar, c2);
            }
            if (assembler.a(pVar) == null) {
                AssemSupervisor a3 = AssemSupervisor.a.a(pVar, b2, b3, c2);
                View s = pVar.s();
                if (s != null) {
                    a3.a(s);
                    assembler.a(pVar, a3);
                    pVar.f25546d.a(new AssembleExtKt$assemble$3(pVar, assembler));
                } else {
                    throw new IllegalArgumentException("The UIAssem's root view is null, check if it has no layout or the assemble called before UIAssem#onViewCreated}.".toString());
                }
            }
            bVar.invoke(assembler);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008a, code lost:
        if (r11.f25562a.containsKey(new com.bytedance.assem.arch.core.o(r3, null)) == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008c, code lost:
        r4 = r5.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0092, code lost:
        if (r4 == java.lang.Object.class) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0094, code lost:
        r9 = r4.getInterfaces();
        h.f.b.l.a((java.lang.Object) r9, "");
        r8 = new java.util.ArrayList();
        r7 = r9.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a2, code lost:
        if (r3 >= r7) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a4, code lost:
        r1 = r9[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ac, code lost:
        if (com.bytedance.assem.arch.service.c.class.isAssignableFrom(r1) == false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ae, code lost:
        r8.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b1, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b4, code lost:
        r1 = r8.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00be, code lost:
        if (r1.hasNext() == false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c0, code lost:
        r0 = (java.lang.Class) r1.next();
        h.f.b.l.a((java.lang.Object) r0, "");
        r11.a(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d9, code lost:
        r4 = r4.getSuperclass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00dd, code lost:
        if (r4 != null) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.fragment.app.Fragment r13, h.f.a.b<? super com.bytedance.assem.arch.core.Assembler, h.z> r14) {
        /*
        // Method dump skipped, instructions count: 308
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.assem.arch.extensions.d.a(androidx.fragment.app.Fragment, h.f.a.b):void");
    }

    public static final void a(g gVar, b<? super Assembler, h.z> bVar) {
        com.bytedance.assem.arch.core.d dVar;
        l.c(gVar, "");
        l.c(bVar, "");
        androidx.fragment.app.e aD_ = gVar.aD_();
        if (aD_ != null) {
            e eVar = null;
            ac a2 = ae.a(aD_, (ad.b) null).a(Assembler.class);
            l.a((Object) a2, "");
            Assembler assembler = (Assembler) a2;
            z.e eVar2 = new z.e();
            eVar2.element = (T) assembler.b(gVar);
            if (eVar2.element == null) {
                m aF_ = gVar.aF_();
                if (aF_ instanceof com.bytedance.assem.arch.core.a) {
                    m aF_2 = gVar.aF_();
                    if (aF_2 != null) {
                        dVar = ((com.bytedance.assem.arch.core.a) aF_2).bx_().f25533f;
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                } else {
                    if (aF_ instanceof Fragment) {
                        m aF_3 = gVar.aF_();
                        if (aF_3 != null) {
                            AssemSupervisor a3 = b.a((Fragment) aF_3);
                            if (a3 != null) {
                                dVar = a3.f25533f;
                            }
                        } else {
                            throw new w("null cannot be cast to non-null type");
                        }
                    } else if (aF_ instanceof androidx.fragment.app.e) {
                        m aF_4 = gVar.aF_();
                        if (aF_4 != null) {
                            AssemSupervisor a4 = b.a((androidx.fragment.app.e) aF_4);
                            if (a4 != null) {
                                dVar = a4.f25533f;
                            }
                        } else {
                            throw new w("null cannot be cast to non-null type");
                        }
                    } else if (aF_ instanceof g) {
                        m aF_5 = gVar.aF_();
                        if (aF_5 != null) {
                            AssemSupervisor a5 = b.a((g) aF_5);
                            if (a5 != null) {
                                dVar = a5.f25533f;
                            }
                        } else {
                            throw new w("null cannot be cast to non-null type");
                        }
                    } else {
                        throw new IllegalStateException("Don't support this LifecycleOwner.");
                    }
                    dVar = null;
                }
                eVar2.element = (T) new com.bytedance.assem.arch.core.d(dVar);
                assembler.a((m) gVar, (com.bytedance.assem.arch.core.d) eVar2.element);
            }
            e c2 = assembler.c(gVar);
            if (c2 == null) {
                m aF_6 = gVar.aF_();
                if (aF_6 instanceof com.bytedance.assem.arch.core.a) {
                    m aF_7 = gVar.aF_();
                    if (aF_7 != null) {
                        eVar = ((com.bytedance.assem.arch.core.a) aF_7).bx_().f25534g;
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                } else if (aF_6 instanceof Fragment) {
                    m aF_8 = gVar.aF_();
                    if (aF_8 != null) {
                        AssemSupervisor a6 = b.a((Fragment) aF_8);
                        if (a6 != null) {
                            eVar = a6.f25534g;
                        }
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                } else if (aF_6 instanceof androidx.fragment.app.e) {
                    m aF_9 = gVar.aF_();
                    if (aF_9 != null) {
                        AssemSupervisor a7 = b.a((androidx.fragment.app.e) aF_9);
                        if (a7 != null) {
                            eVar = a7.f25534g;
                        }
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                } else if (aF_6 instanceof g) {
                    m aF_10 = gVar.aF_();
                    if (aF_10 != null) {
                        AssemSupervisor a8 = b.a((g) aF_10);
                        if (a8 != null) {
                            eVar = a8.f25534g;
                        }
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                } else {
                    throw new IllegalStateException("Don't support this LifecycleOwner.");
                }
                c2 = new e(eVar);
                assembler.a(gVar, c2);
            }
            if (assembler.a(gVar) == null) {
                AssemSupervisor a9 = AssemSupervisor.a.a(gVar, gVar.aD_(), eVar2.element, c2);
                a9.a(gVar.aE_());
                assembler.a(gVar, a9);
                gVar.getLifecycle().a(new AssembleExtKt$assemble$$inlined$let$lambda$1(gVar, eVar2, c2, assembler));
            }
            bVar.invoke(assembler);
        }
    }
}
