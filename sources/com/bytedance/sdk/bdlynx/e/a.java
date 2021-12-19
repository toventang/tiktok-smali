package com.bytedance.sdk.bdlynx.e;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import java.util.Iterator;
import java.util.List;

public final class a implements d {
    static {
        Covode.recordClassIndex(26745);
    }

    /* renamed from: com.bytedance.sdk.bdlynx.e.a$a  reason: collision with other inner class name */
    static final class C1059a extends m implements b<List<? extends String>, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1059a f43701a = new C1059a();

        static {
            Covode.recordClassIndex(26746);
        }

        C1059a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(List<? extends String> list) {
            List<? extends String> list2 = list;
            l.c(list2, "");
            Iterator<T> it = list2.iterator();
            if (it.hasNext()) {
                String next = it.next();
                while (it.hasNext()) {
                    next = next + ((String) it.next());
                }
                return next;
            }
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
    }

    @Override // com.bytedance.sdk.bdlynx.e.d
    public final String a(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        return (String) C1059a.f43701a.invoke(n.b(str, str2));
    }
}
