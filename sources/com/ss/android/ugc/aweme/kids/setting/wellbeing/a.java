package com.ss.android.ugc.aweme.kids.setting.wellbeing;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final h f107124a = i.a((h.f.a.a) b.f107127a);

    /* renamed from: b  reason: collision with root package name */
    public static final h f107125b = i.a((h.f.a.a) c.f107128a);

    /* renamed from: c  reason: collision with root package name */
    public static final C2751a f107126c = new C2751a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.wellbeing.a$a  reason: collision with other inner class name */
    public static final class C2751a {
        static {
            Covode.recordClassIndex(68530);
        }

        static Keva a() {
            return (Keva) a.f107125b.getValue();
        }

        private C2751a() {
        }

        public /* synthetic */ C2751a(byte b2) {
            this();
        }

        public static void a(long j2) {
            a().storeLong("play_time", j2);
        }

        public static void a(String str) {
            l.d(str, "");
            a().storeString("last_update_date", str);
        }
    }

    static final class c extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f107128a = new c();

        static {
            Covode.recordClassIndex(68532);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo((String) a.f107124a.getValue());
        }
    }

    static final class b extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f107127a = new b();

        static {
            Covode.recordClassIndex(68531);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            StringBuilder sb = new StringBuilder("kids_wellbeing");
            String userId = KidsAccountServiceImpl.h().b().getUserId();
            if (userId == null) {
                userId = "";
            }
            return sb.append(userId).toString();
        }
    }

    static {
        Covode.recordClassIndex(68529);
    }
}
