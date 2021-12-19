package com.ss.android.ugc.aweme.emoji.d.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.dg;
import h.c.b.a.k;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import java.util.List;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f89119a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(56047);
    }

    public static final void a(com.ss.android.ugc.aweme.emoji.g.a aVar) {
        l.d(aVar, "");
        bz unused = i.a(an.a(bf.f159041b), null, null, new a(aVar, null), 3);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends k implements m<am, d<? super z>, Object> {
        final /* synthetic */ com.ss.android.ugc.aweme.emoji.g.a $emoji;
        int label;

        static {
            Covode.recordClassIndex(56048);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(com.ss.android.ugc.aweme.emoji.g.a aVar, d dVar) {
            super(2, dVar);
            this.$emoji = aVar;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new a(this.$emoji, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                com.ss.android.ugc.aweme.emoji.utils.d a2 = com.ss.android.ugc.aweme.emoji.utils.d.a();
                com.ss.android.ugc.aweme.emoji.g.a aVar = this.$emoji;
                List b2 = dg.b(a2.f89452a.getString("recent_gif_emojis", ""), com.ss.android.ugc.aweme.emoji.g.a[].class);
                if (b2.isEmpty()) {
                    b2.add(aVar);
                } else {
                    b2.remove(aVar);
                    b2.add(0, aVar);
                    if (b2.size() > 8) {
                        b2 = b2.subList(0, 8);
                    }
                }
                a2.f89452a.edit().putString("recent_gif_emojis", dg.a().b(b2)).commit();
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
