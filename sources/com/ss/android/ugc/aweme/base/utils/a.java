package com.ss.android.ugc.aweme.base.utils;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f68424a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final h f68425b = i.a((h.f.a.a) b.f68426a);

    /* renamed from: com.ss.android.ugc.aweme.base.utils.a$a  reason: collision with other inner class name */
    public interface AbstractC1546a {
        static {
            Covode.recordClassIndex(42125);
        }

        void a(Activity activity, boolean z);
    }

    public static List<AbstractC1546a> a() {
        return (List) f68425b.getValue();
    }

    private a() {
    }

    static final class b extends m implements h.f.a.a<List<AbstractC1546a>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f68426a = new b();

        static {
            Covode.recordClassIndex(42126);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<AbstractC1546a> invoke() {
            return new ArrayList();
        }
    }

    static {
        Covode.recordClassIndex(42124);
    }

    public static final void a(AbstractC1546a aVar) {
        l.d(aVar, "");
        a().add(aVar);
    }
}
