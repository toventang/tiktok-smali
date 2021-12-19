package com.ss.android.ugc.aweme.ax.a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.a.q;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import java.util.Map;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    static final aa<q> f67756a = new aa<>(ab.a(q.class), a.f67758a);

    /* renamed from: b  reason: collision with root package name */
    public static final x f67757b = new x();

    private x() {
    }

    static {
        Covode.recordClassIndex(41716);
    }

    static final class a extends m implements q<Uri, g, Map<String, ? extends String>, q> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f67758a = new a();

        static {
            Covode.recordClassIndex(41717);
        }

        a() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ q invoke(Uri uri, g gVar, Map<String, ? extends String> map) {
            Uri uri2 = uri;
            g gVar2 = gVar;
            Map<String, ? extends String> map2 = map;
            l.d(uri2, "");
            l.d(gVar2, "");
            l.d(map2, "");
            if (l.a((Object) uri2.getScheme(), (Object) "react-native")) {
                return new y(uri2, gVar2, map2);
            }
            return null;
        }
    }
}
