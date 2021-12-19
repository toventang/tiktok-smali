package com.bytedance.j.a.c;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.f;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class b implements com.bytedance.ies.bullet.service.base.c.a {

    /* renamed from: a  reason: collision with root package name */
    public final a f38973a;

    static {
        Covode.recordClassIndex(23863);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f38974a = true;

        /* renamed from: b  reason: collision with root package name */
        public final List<com.bytedance.j.a.b.a> f38975b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public f f38976c;

        /* renamed from: d  reason: collision with root package name */
        public com.lynx.tasm.provider.b f38977d;

        /* renamed from: e  reason: collision with root package name */
        public final List<com.lynx.tasm.behavior.a> f38978e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        public final Map<String, com.bytedance.j.a.e.b> f38979f = new LinkedHashMap();

        /* renamed from: g  reason: collision with root package name */
        public a f38980g;

        /* renamed from: h  reason: collision with root package name */
        public h.f.a.b<? super LynxEnv, z> f38981h = C0924a.f38983a;

        /* renamed from: i  reason: collision with root package name */
        public Application f38982i;

        static {
            Covode.recordClassIndex(23864);
        }

        public final b a() {
            return new b(this.f38982i, this, (byte) 0);
        }

        /* renamed from: com.bytedance.j.a.c.b$a$a  reason: collision with other inner class name */
        static final class C0924a extends m implements h.f.a.b<LynxEnv, z> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0924a f38983a = new C0924a();

            static {
                Covode.recordClassIndex(23865);
            }

            C0924a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(LynxEnv lynxEnv) {
                l.c(lynxEnv, "");
                return z.f158842a;
            }
        }

        public a(Application application) {
            l.c(application, "");
            this.f38982i = application;
        }
    }

    private b(Application application, a aVar) {
        this.f38973a = aVar;
        l.c(application, "");
        e.f38995a = application;
    }

    public /* synthetic */ b(Application application, a aVar, byte b2) {
        this(application, aVar);
    }
}
