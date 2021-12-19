package com.ss.android.ugc.aweme.ax.a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.a.q;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import java.util.Map;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    static final aa<m> f67734a = new aa<>(ab.a(m.class), a.f67736a);

    /* renamed from: b  reason: collision with root package name */
    public static final i f67735b = new i();

    private i() {
    }

    static {
        Covode.recordClassIndex(41692);
    }

    static final class a extends m implements q<Uri, g, Map<String, ? extends String>, m> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f67736a = new a();

        static {
            Covode.recordClassIndex(41693);
        }

        a() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ m invoke(Uri uri, g gVar, Map<String, ? extends String> map) {
            Uri uri2 = uri;
            g gVar2 = gVar;
            Map<String, ? extends String> map2 = map;
            l.d(uri2, "");
            l.d(gVar2, "");
            l.d(map2, "");
            if (l.a((Object) uri2.getScheme(), (Object) "http") || l.a((Object) uri2.getScheme(), (Object) "https") || 0 != 0) {
                return new j(uri2, gVar2, map2);
            }
            return null;
        }
    }
}
