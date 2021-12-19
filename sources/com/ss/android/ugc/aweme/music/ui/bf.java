package com.ss.android.ugc.aweme.music.ui;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.settings.v;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import f.a.d.f;
import h.f.b.l;
import java.util.Map;

public final class bf extends a {
    static {
        Covode.recordClassIndex(71941);
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
        final /* synthetic */ bf f111926a;

        /* renamed from: b  reason: collision with root package name */
        private int f111927b;

        /* renamed from: c  reason: collision with root package name */
        private int f111928c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f111929d;

        static {
            Covode.recordClassIndex(71942);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(bf bfVar) {
            this.f111926a = bfVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(p pVar) {
            int i2;
            h hVar;
            p pVar2 = pVar;
            l.d(pVar2, "");
            int i3 = pVar2.f112023a;
            int i4 = pVar2.f112024b;
            Effect effect = pVar2.f112025c;
            long j2 = pVar2.f112026d;
            if (i4 != -102) {
                if (i4 == -104 && (hVar = this.f111926a.f111818b) != null) {
                    hVar.b(effect);
                }
                if (-100 == i3) {
                    this.f111927b = i4;
                } else if (-101 == i3) {
                    this.f111928c = i4;
                }
                h hVar2 = this.f111926a.f111818b;
                if (hVar2 != null) {
                    if (TextUtils.isEmpty(this.f111926a.f111820d)) {
                        i2 = this.f111927b;
                    } else {
                        i2 = (this.f111927b + this.f111928c) / 2;
                    }
                    hVar2.a(i2, effect, Long.valueOf(j2));
                }
            } else if (!this.f111929d) {
                this.f111929d = true;
                h hVar3 = this.f111926a.f111818b;
                if (hVar3 != null) {
                    hVar3.a(effect);
                }
            }
        }
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bf f111930a;

        static {
            Covode.recordClassIndex(71943);
        }

        b(bf bfVar) {
            this.f111930a = bfVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            q qVar = (q) obj;
            String str2 = qVar.f112027a;
            Integer num = qVar.f112029c;
            Effect effect = qVar.f112031e;
            Integer num2 = qVar.f112032f;
            if (num2 != null && num2.intValue() == -105) {
                h hVar = this.f111930a.f111818b;
                if (hVar != null) {
                    if (effect != null) {
                        str = effect.getEffectId();
                    } else {
                        str = null;
                    }
                    hVar.a(str, effect);
                }
            } else if ((num != null && num.intValue() == -103) || TextUtils.isEmpty(str2)) {
                h hVar2 = this.f111930a.f111818b;
                if (hVar2 != null) {
                    l.b(qVar, "");
                    hVar2.b(qVar);
                }
            } else {
                h hVar3 = this.f111930a.f111818b;
                if (hVar3 != null) {
                    l.b(qVar, "");
                    hVar3.a(qVar);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.music.ui.a
    public final void a(Map<String, String> map, g gVar) {
        if (v.a()) {
            h hVar = this.f111818b;
            if (hVar != null) {
                hVar.f111980c = gVar;
            }
            a(map);
            return;
        }
        h hVar2 = this.f111818b;
        if (hVar2 != null) {
            hVar2.a(gVar);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bf(android.content.Context r4, java.lang.String r5, com.ss.android.ugc.aweme.shortvideo.model.MusicModel r6, com.ss.android.ugc.aweme.music.f r7) {
        /*
            r3 = this;
            java.lang.String r2 = ""
            h.f.b.l.d(r4, r2)
            h.f.b.l.d(r7, r2)
            android.content.Context r1 = r4.getApplicationContext()
            boolean r0 = com.ss.android.ugc.aweme.lancet.a.a.f107168c
            if (r0 != 0) goto L_0x0017
        L_0x0010:
            h.f.b.l.b(r1, r2)
            r3.<init>(r1, r5, r6, r7)
            return
        L_0x0017:
            if (r1 == 0) goto L_0x001a
            goto L_0x0010
        L_0x001a:
            android.app.Application r1 = com.ss.android.ugc.aweme.lancet.a.a.f107166a
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.bf.<init>(android.content.Context, java.lang.String, com.ss.android.ugc.aweme.shortvideo.model.MusicModel, com.ss.android.ugc.aweme.music.f):void");
    }
}
