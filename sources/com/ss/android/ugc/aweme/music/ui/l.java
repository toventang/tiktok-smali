package com.ss.android.ugc.aweme.music.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import f.a.d.f;
import java.util.Map;

public final class l extends a {
    static {
        Covode.recordClassIndex(71974);
    }

    @Override // com.ss.android.ugc.aweme.music.ui.a
    public final f<q> c() {
        return new b(this);
    }

    @Override // com.ss.android.ugc.aweme.music.ui.a
    public final f<p> d() {
        return new a(this);
    }

    public static final class a implements f<p> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f111994a;

        /* renamed from: b  reason: collision with root package name */
        private int f111995b;

        /* renamed from: c  reason: collision with root package name */
        private int f111996c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f111997d;

        static {
            Covode.recordClassIndex(71975);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(l lVar) {
            this.f111994a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(p pVar) {
            int i2;
            p pVar2 = pVar;
            h.f.b.l.d(pVar2, "");
            int i3 = pVar2.f112023a;
            int i4 = pVar2.f112024b;
            Effect effect = pVar2.f112025c;
            long j2 = pVar2.f112026d;
            if (i4 == -102) {
                if (!this.f111997d) {
                    this.f111997d = true;
                    h hVar = this.f111994a.f111818b;
                    if (hVar != null) {
                        hVar.a(effect);
                    }
                }
            } else if (i4 == -104) {
                h hVar2 = this.f111994a.f111818b;
                if (hVar2 != null) {
                    hVar2.b(effect);
                }
            } else {
                if (-100 == i3) {
                    this.f111995b = i4;
                } else if (-101 == i3) {
                    this.f111996c = i4;
                }
                h hVar3 = this.f111994a.f111818b;
                if (hVar3 != null) {
                    if (this.f111994a.f111821e == null) {
                        i2 = this.f111996c;
                    } else {
                        i2 = (this.f111995b + this.f111996c) / 2;
                    }
                    hVar3.a(i2, effect, Long.valueOf(j2));
                }
            }
        }
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f111998a;

        static {
            Covode.recordClassIndex(71976);
        }

        b(l lVar) {
            this.f111998a = lVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
            if (r3 == null) goto L_0x002f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
            if (r3.intValue() != -105) goto L_0x002f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
            r1 = r5.f111998a.f111818b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
            if (r1 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
            if (r4 == null) goto L_0x0052;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
            r0 = r4.getEffectId();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
            r1.a(r0, r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
            r0 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
            if (r3.intValue() != -105) goto L_0x0010;
         */
        @Override // f.a.d.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r6) {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.music.ui.q r6 = (com.ss.android.ugc.aweme.music.ui.q) r6
                com.ss.android.ugc.effectmanager.effect.model.Effect r4 = r6.f112031e
                java.lang.Integer r3 = r6.f112032f
                java.lang.String r2 = ""
                if (r3 != 0) goto L_0x0024
            L_0x000a:
                r1 = -105(0xffffffffffffff97, float:NaN)
                if (r4 != 0) goto L_0x002d
                if (r3 != 0) goto L_0x001d
            L_0x0010:
                com.ss.android.ugc.aweme.music.ui.l r0 = r5.f111998a
                com.ss.android.ugc.aweme.music.ui.h r0 = r0.f111818b
                if (r0 == 0) goto L_0x001c
                h.f.b.l.b(r6, r2)
                r0.b(r6)
            L_0x001c:
                return
            L_0x001d:
                int r0 = r3.intValue()
                if (r0 == r1) goto L_0x003c
                goto L_0x0010
            L_0x0024:
                int r1 = r3.intValue()
                r0 = -103(0xffffffffffffff99, float:NaN)
                if (r1 == r0) goto L_0x0010
                goto L_0x000a
            L_0x002d:
                if (r3 != 0) goto L_0x003c
            L_0x002f:
                com.ss.android.ugc.aweme.music.ui.l r0 = r5.f111998a
                com.ss.android.ugc.aweme.music.ui.h r0 = r0.f111818b
                if (r0 == 0) goto L_0x003b
                h.f.b.l.b(r6, r2)
                r0.a(r6)
            L_0x003b:
                return
            L_0x003c:
                int r0 = r3.intValue()
                if (r0 != r1) goto L_0x002f
                com.ss.android.ugc.aweme.music.ui.l r0 = r5.f111998a
                com.ss.android.ugc.aweme.music.ui.h r1 = r0.f111818b
                if (r1 == 0) goto L_0x0051
                if (r4 == 0) goto L_0x0052
                java.lang.String r0 = r4.getEffectId()
            L_0x004e:
                r1.a(r0, r4)
            L_0x0051:
                return
            L_0x0052:
                r0 = 0
                goto L_0x004e
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.l.b.accept(java.lang.Object):void");
        }
    }

    @Override // com.ss.android.ugc.aweme.music.ui.a
    public final void a(Map<String, String> map, g gVar) {
        h hVar = this.f111818b;
        if (hVar != null) {
            hVar.a(gVar);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l(android.content.Context r9, java.lang.String r10, com.ss.android.ugc.aweme.shortvideo.model.MusicModel r11) {
        /*
            r8 = this;
            java.lang.String r2 = ""
            r3 = r9
            h.f.b.l.d(r3, r2)
            android.content.Context r1 = r3.getApplicationContext()
            boolean r0 = com.ss.android.ugc.aweme.lancet.a.a.f107168c
            if (r0 != 0) goto L_0x0022
        L_0x000e:
            h.f.b.l.b(r1, r2)
            com.ss.android.ugc.aweme.music.f r2 = new com.ss.android.ugc.aweme.music.f
            r4 = 0
            r5 = 1
            r6 = 1
            java.lang.String r7 = "prop_detail_page"
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = 2
            r2.f111468a = r0
            r8.<init>(r1, r10, r11, r2)
            return
        L_0x0022:
            if (r1 == 0) goto L_0x0025
            goto L_0x000e
        L_0x0025:
            android.app.Application r1 = com.ss.android.ugc.aweme.lancet.a.a.f107166a
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.l.<init>(android.content.Context, java.lang.String, com.ss.android.ugc.aweme.shortvideo.model.MusicModel):void");
    }
}
