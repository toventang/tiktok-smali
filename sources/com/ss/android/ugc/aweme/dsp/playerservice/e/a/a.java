package com.ss.android.ugc.aweme.dsp.playerservice.e.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.playerservice.b.c;
import f.a.t;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Collection;
import java.util.List;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final h f83522a = i.a((h.f.a.a) C1977a.f83526a);

    /* renamed from: c  reason: collision with root package name */
    public final b f83523c = new b();

    static {
        Covode.recordClassIndex(52135);
    }

    public abstract boolean a();

    public abstract t<List<c>> b();

    public abstract t<List<c>> c();

    /* renamed from: com.ss.android.ugc.aweme.dsp.playerservice.e.a.a$a  reason: collision with other inner class name */
    static final class C1977a extends m implements h.f.a.a<f.a.l.c<Collection<? extends c>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1977a f83526a = new C1977a();

        static {
            Covode.recordClassIndex(52136);
        }

        C1977a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f.a.l.c<Collection<? extends c>> invoke() {
            return new f.a.l.c();
        }
    }
}
