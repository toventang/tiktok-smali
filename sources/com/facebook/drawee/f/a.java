package com.facebook.drawee.f;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;
import com.facebook.drawee.e.f;
import com.facebook.drawee.e.g;
import com.facebook.drawee.e.p;
import com.facebook.drawee.e.q;
import com.facebook.drawee.h.c;
import com.facebook.imagepipeline.p.b;

public class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public e f47454a;

    /* renamed from: b  reason: collision with root package name */
    public final d f47455b;

    /* renamed from: c  reason: collision with root package name */
    public final g f47456c;

    /* renamed from: d  reason: collision with root package name */
    private final Drawable f47457d;

    /* renamed from: e  reason: collision with root package name */
    private final Resources f47458e;

    /* renamed from: f  reason: collision with root package name */
    private final f f47459f;

    static {
        Covode.recordClassIndex(28797);
    }

    @Override // com.facebook.drawee.h.b
    public final Drawable a() {
        return this.f47455b;
    }

    public final void a(e eVar) {
        this.f47454a = eVar;
        f.a((com.facebook.drawee.e.c) this.f47455b, eVar);
        for (int i2 = 0; i2 < this.f47459f.f47350a.length; i2++) {
            f.a(h(i2), this.f47454a, this.f47458e);
        }
    }

    @Override // com.facebook.drawee.h.c
    public final void b() {
        this.f47456c.setDrawable(this.f47457d);
        e();
    }

    private void e() {
        f fVar = this.f47459f;
        if (fVar != null) {
            fVar.a();
            this.f47459f.c();
            f();
            f(1);
            this.f47459f.d();
            this.f47459f.b();
        }
    }

    private void f() {
        g(1);
        g(2);
        g(3);
        g(4);
        g(5);
    }

    @Override // com.facebook.drawee.h.c
    public final void c() {
        this.f47459f.a();
        f();
        if (this.f47459f.a(5) != null) {
            f(5);
        } else {
            f(1);
        }
        this.f47459f.b();
    }

    @Override // com.facebook.drawee.h.c
    public final void d() {
        this.f47459f.a();
        f();
        if (this.f47459f.a(4) != null) {
            f(4);
        } else {
            f(1);
        }
        this.f47459f.b();
    }

    private void f(int i2) {
        if (i2 >= 0) {
            this.f47459f.c(i2);
        }
    }

    private void g(int i2) {
        if (i2 >= 0) {
            this.f47459f.d(i2);
        }
    }

    @Override // com.facebook.drawee.h.c
    public final void a(Drawable drawable) {
        d dVar = this.f47455b;
        dVar.f47473a = drawable;
        dVar.invalidateSelf();
    }

    public final void b(int i2) {
        this.f47459f.b(i2);
    }

    public final void c(Drawable drawable) {
        a(5, drawable);
    }

    public final void e(int i2) {
        a(4, this.f47458e.getDrawable(i2));
    }

    private void a(float f2) {
        Drawable a2 = this.f47459f.a(3);
        if (a2 != null) {
            if (f2 >= 0.999f) {
                if (a2 instanceof Animatable) {
                    ((Animatable) a2).stop();
                }
                g(3);
            } else {
                if (a2 instanceof Animatable) {
                    ((Animatable) a2).start();
                }
                f(3);
            }
            a2.setLevel(Math.round(f2 * 10000.0f));
        }
    }

    public final void b(Drawable drawable) {
        a(1, drawable);
    }

    public final void c(int i2) {
        a(1, this.f47458e.getDrawable(i2));
    }

    public final void d(int i2) {
        a(5, this.f47458e.getDrawable(i2));
    }

    private com.facebook.drawee.e.c h(int i2) {
        boolean z;
        f fVar = this.f47459f;
        boolean z2 = true;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        i.a(z);
        if (i2 >= fVar.f47351b.length) {
            z2 = false;
        }
        i.a(z2);
        if (fVar.f47351b[i2] == null) {
            fVar.f47351b[i2] = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001f: APUT  
                  (wrap: com.facebook.drawee.e.c[] : 0x0018: IGET  (r1v9 com.facebook.drawee.e.c[]) = (r2v0 'fVar' com.facebook.drawee.e.f) com.facebook.drawee.e.a.b com.facebook.drawee.e.c[])
                  (r4v0 'i2' int)
                  (wrap: com.facebook.drawee.e.a$1 : 0x001c: CONSTRUCTOR  (r0v12 com.facebook.drawee.e.a$1) = (r2v0 'fVar' com.facebook.drawee.e.f), (r4v0 'i2' int) call: com.facebook.drawee.e.a.1.<init>(com.facebook.drawee.e.a, int):void type: CONSTRUCTOR)
                 in method: com.facebook.drawee.f.a.h(int):com.facebook.drawee.e.c, file: classes6.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001c: CONSTRUCTOR  (r0v12 com.facebook.drawee.e.a$1) = (r2v0 'fVar' com.facebook.drawee.e.f), (r4v0 'i2' int) call: com.facebook.drawee.e.a.1.<init>(com.facebook.drawee.e.a, int):void type: CONSTRUCTOR in method: com.facebook.drawee.f.a.h(int):com.facebook.drawee.e.c, file: classes6.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:416)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 19 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.facebook.drawee.e.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 23 more
                */
            /*
                this = this;
                com.facebook.drawee.e.f r2 = r3.f47459f
                r1 = 1
                r0 = 0
                if (r4 < 0) goto L_0x0044
                r0 = 1
            L_0x0007:
                com.facebook.common.d.i.a(r0)
                com.facebook.drawee.e.c[] r0 = r2.f47351b
                int r0 = r0.length
                if (r4 >= r0) goto L_0x0042
            L_0x000f:
                com.facebook.common.d.i.a(r1)
                com.facebook.drawee.e.c[] r0 = r2.f47351b
                r0 = r0[r4]
                if (r0 != 0) goto L_0x0021
                com.facebook.drawee.e.c[] r1 = r2.f47351b
                com.facebook.drawee.e.a$1 r0 = new com.facebook.drawee.e.a$1
                r0.<init>(r4)
                r1[r4] = r0
            L_0x0021:
                com.facebook.drawee.e.c[] r0 = r2.f47351b
                r1 = r0[r4]
                android.graphics.drawable.Drawable r0 = r1.getDrawable()
                boolean r0 = r0 instanceof com.facebook.drawee.e.h
                if (r0 == 0) goto L_0x0033
                android.graphics.drawable.Drawable r1 = r1.getDrawable()
                com.facebook.drawee.e.g r1 = (com.facebook.drawee.e.g) r1
            L_0x0033:
                android.graphics.drawable.Drawable r0 = r1.getDrawable()
                boolean r0 = r0 instanceof com.facebook.drawee.e.p
                if (r0 == 0) goto L_0x0041
                android.graphics.drawable.Drawable r1 = r1.getDrawable()
                com.facebook.drawee.e.g r1 = (com.facebook.drawee.e.g) r1
            L_0x0041:
                return r1
            L_0x0042:
                r1 = 0
                goto L_0x000f
            L_0x0044:
                r0 = 0
                goto L_0x0007
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.f.a.h(int):com.facebook.drawee.e.c");
        }

        public final p a(int i2) {
            com.facebook.drawee.e.c h2 = h(i2);
            if (h2 instanceof p) {
                return (p) h2;
            }
            Drawable a2 = f.a(h2.setDrawable(f.f47484a), q.b.f47436b, (PointF) null);
            h2.setDrawable(a2);
            i.a(a2, "Parent has no child drawable!");
            return (p) a2;
        }

        public final void d(Drawable drawable) {
            boolean z;
            if (6 < this.f47459f.f47350a.length) {
                z = true;
            } else {
                z = false;
            }
            i.a(z, "The given index does not correspond to an overlay image.");
            a(6, drawable);
        }

        a(b bVar) {
            int i2;
            int i3;
            int i4 = 0;
            ColorDrawable colorDrawable = new ColorDrawable(0);
            this.f47457d = colorDrawable;
            b.a();
            this.f47458e = bVar.f47462c;
            this.f47454a = bVar.t;
            g gVar = new g(colorDrawable);
            this.f47456c = gVar;
            int i5 = 1;
            if (bVar.r != null) {
                i2 = bVar.r.size();
            } else {
                i2 = 1;
            }
            if (bVar.s != null) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            int i6 = i2 + i3;
            Drawable[] drawableArr = new Drawable[(i6 + 6)];
            drawableArr[0] = c(bVar.q, (q.b) null);
            drawableArr[1] = c(bVar.f47465f, bVar.f47466g);
            q.b bVar2 = bVar.n;
            PointF pointF = bVar.o;
            gVar.setColorFilter(bVar.p);
            drawableArr[2] = f.a(gVar, bVar2, pointF);
            drawableArr[3] = c(bVar.f47471l, bVar.f47472m);
            drawableArr[4] = c(bVar.f47467h, bVar.f47468i);
            drawableArr[5] = c(bVar.f47469j, bVar.f47470k);
            if (i6 > 0) {
                if (bVar.r != null) {
                    for (Drawable drawable : bVar.r) {
                        drawableArr[i4 + 6] = c(drawable, (q.b) null);
                        i4++;
                    }
                    i5 = i4;
                }
                if (bVar.s != null) {
                    drawableArr[i5 + 6] = c(bVar.s, (q.b) null);
                }
            }
            f fVar = new f(drawableArr);
            this.f47459f = fVar;
            fVar.b(bVar.f47463d);
            d dVar = new d(f.a(fVar, this.f47454a));
            this.f47455b = dVar;
            dVar.mutate();
            e();
            b.a();
        }

        public final void a(q.b bVar) {
            i.a(bVar);
            a(2).a(bVar);
        }

        private Drawable c(Drawable drawable, q.b bVar) {
            return f.a(f.a(drawable, this.f47454a, this.f47458e), bVar, (PointF) null);
        }

        private void d(Drawable drawable, q.b bVar) {
            a(4, drawable);
            a(4).a(bVar);
        }

        public final void a(int i2, q.b bVar) {
            a(this.f47458e.getDrawable(i2), bVar);
        }

        @Override // com.facebook.drawee.h.c
        public final void a(float f2, boolean z) {
            if (this.f47459f.a(3) != null) {
                this.f47459f.a();
                a(f2);
                if (z) {
                    this.f47459f.d();
                }
                this.f47459f.b();
            }
        }

        public final void b(int i2, q.b bVar) {
            b(this.f47458e.getDrawable(i2), bVar);
        }

        public final void b(Drawable drawable, q.b bVar) {
            a(5, drawable);
            a(5).a(bVar);
        }

        public final void c(int i2, q.b bVar) {
            d(this.f47458e.getDrawable(i2), bVar);
        }

        public final void a(int i2, Drawable drawable) {
            if (drawable == null) {
                this.f47459f.a(i2, null);
                return;
            }
            h(i2).setDrawable(f.a(drawable, this.f47454a, this.f47458e));
        }

        public final void a(Drawable drawable, q.b bVar) {
            a(1, drawable);
            a(1).a(bVar);
        }

        @Override // com.facebook.drawee.h.c
        public final void a(Drawable drawable, float f2, boolean z) {
            Drawable a2 = f.a(drawable, this.f47454a, this.f47458e);
            a2.mutate();
            this.f47456c.setDrawable(a2);
            this.f47459f.a();
            f();
            f(2);
            a(f2);
            if (z) {
                this.f47459f.d();
            }
            this.f47459f.b();
        }
    }
