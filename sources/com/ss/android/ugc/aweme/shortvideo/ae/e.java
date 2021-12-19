package com.ss.android.ugc.aweme.shortvideo.ae;

import com.bytedance.covode.number.Covode;
import com.google.c.a.f;
import com.google.c.c.ap;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.g;
import java.util.ArrayList;
import java.util.List;

public final class e implements f<AVChallenge, g> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f124889a = new a((byte) 0);

    static {
        Covode.recordClassIndex(82057);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(82058);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static ArrayList<g> a(List<? extends AVChallenge> list) {
            if (list == null) {
                return new ArrayList<>();
            }
            return ap.a((Iterable) ap.a(list, new e()));
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.c.a.f
    public final /* synthetic */ g a(AVChallenge aVChallenge) {
        AVChallenge aVChallenge2 = aVChallenge;
        if (aVChallenge2 == null) {
            return null;
        }
        g gVar = new g();
        gVar.f128515a = aVChallenge2;
        return gVar;
    }
}
