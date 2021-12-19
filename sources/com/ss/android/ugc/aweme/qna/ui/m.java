package com.ss.android.ugc.aweme.qna.ui;

import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.qna.model.c;
import com.ss.android.ugc.aweme.qna.model.f;
import com.ss.android.ugc.aweme.qna.model.g;
import com.ss.android.ugc.aweme.qna.model.h;
import h.f.b.l;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final a f119615a = new a();

    public static final class a extends j.e<f> {
        static {
            Covode.recordClassIndex(77710);
        }

        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // androidx.recyclerview.widget.j.e
        public final /* synthetic */ boolean a(f fVar, f fVar2) {
            f fVar3 = fVar;
            f fVar4 = fVar2;
            l.d(fVar3, "");
            l.d(fVar4, "");
            return l.a((Object) fVar3.f119497h, (Object) fVar4.f119497h);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // androidx.recyclerview.widget.j.e
        public final /* synthetic */ boolean b(f fVar, f fVar2) {
            f fVar3 = fVar;
            f fVar4 = fVar2;
            l.d(fVar3, "");
            l.d(fVar4, "");
            if ((fVar3 instanceof h) && (fVar4 instanceof h)) {
                h hVar = (h) fVar3;
                h hVar2 = (h) fVar4;
                if ((!l.a(hVar.f119515k, hVar2.f119515k)) || (!l.a((Object) hVar.f119511d, (Object) hVar2.f119511d)) || hVar.f119516l != hVar2.f119516l || hVar.f119517m != hVar2.f119517m) {
                    return false;
                }
            }
            if ((fVar3 instanceof c) && (fVar4 instanceof c)) {
                c cVar = (c) fVar3;
                c cVar2 = (c) fVar4;
                if (!(!(!l.a((Object) cVar.f119483c, (Object) cVar2.f119483c)) && cVar.f119486f.f119521b == cVar2.f119486f.f119521b && cVar.f119486f.f119520a == cVar2.f119486f.f119520a)) {
                    return false;
                }
            }
            if ((fVar3 instanceof g) && (fVar4 instanceof g)) {
                g gVar = (g) fVar3;
                g gVar2 = (g) fVar4;
                if (!(!(!l.a((Object) gVar.f119501d, (Object) gVar2.f119501d)) && gVar.f119505k.f119521b == gVar2.f119505k.f119521b && gVar.f119505k.f119520a == gVar2.f119505k.f119520a)) {
                    return false;
                }
            }
            return l.a((Object) fVar3.f119497h, (Object) fVar4.f119497h);
        }
    }

    static {
        Covode.recordClassIndex(77709);
    }
}
