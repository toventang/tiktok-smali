package com.ss.android.ugc.aweme.crossplatform.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.a.z;
import h.f.b.m;
import h.h;
import h.i;
import java.util.List;

public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final h f78842b = i.a((h.f.a.a) b.f78845a);

    /* renamed from: c  reason: collision with root package name */
    public static final a f78843c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final h f78844a;

    public static final class a {
        static {
            Covode.recordClassIndex(48909);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<e> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f78845a = new b();

        static {
            Covode.recordClassIndex(48910);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ e invoke() {
            return new e((byte) 0);
        }
    }

    private e() {
        this.f78844a = i.a((h.f.a.a) new c(this));
    }

    static final class c extends m implements h.f.a.a<List<? extends String>> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(48911);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<? extends String> invoke() {
            List j2;
            Object[] objArr = (Object[]) SettingsManager.a().a("aweme_data_prefetch_allow_list", String[].class);
            if (objArr == null || (j2 = h.a.i.j(objArr)) == null) {
                return z.INSTANCE;
            }
            return j2;
        }
    }

    static {
        Covode.recordClassIndex(48908);
    }

    public /* synthetic */ e(byte b2) {
        this();
    }
}
