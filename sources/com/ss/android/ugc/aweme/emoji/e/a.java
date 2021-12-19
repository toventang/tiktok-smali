package com.ss.android.ugc.aweme.emoji.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.google.gson.f;
import com.ss.android.ugc.aweme.utils.dg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import h.i;
import h.m;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final h f89121a = i.a(m.NONE, b.f89126a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f89122b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final f f89123c = dg.a();

    /* renamed from: d  reason: collision with root package name */
    private static final Type f89124d = new C2154a().type;

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicBoolean f89125e = new AtomicBoolean(false);

    /* renamed from: com.ss.android.ugc.aweme.emoji.e.a$a  reason: collision with other inner class name */
    public static final class C2154a extends com.google.gson.b.a<LinkedList<String>> {
        static {
            Covode.recordClassIndex(56052);
        }

        C2154a() {
        }
    }

    private a() {
    }

    static final class b extends h.f.b.m implements h.f.a.a<List<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f89126a = new b();

        static {
            Covode.recordClassIndex(56053);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<? extends String> invoke() {
            String[] stringArray = d.a().getResources().getStringArray(R.array.a7);
            l.b(stringArray, "");
            return h.a.i.j(stringArray);
        }
    }

    static {
        Covode.recordClassIndex(56051);
    }
}
