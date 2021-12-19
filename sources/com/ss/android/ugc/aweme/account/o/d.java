package com.ss.android.ugc.aweme.account.o;

import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.experiment.o;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.base.e;
import com.ss.android.ugc.aweme.account.login.v2.ui.a.m;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import f.a.n;
import h.f.b.l;
import h.h;
import h.i;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class d extends m {

    /* renamed from: a  reason: collision with root package name */
    public static final a f65228a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f65229b = i.a((h.f.a.a) new c(this));

    /* renamed from: j  reason: collision with root package name */
    private HashMap f65230j;

    static {
        Covode.recordClassIndex(40117);
    }

    private String g() {
        return (String) this.f65229b.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final View c(int i2) {
        if (this.f65230j == null) {
            this.f65230j = new HashMap();
        }
        View view = (View) this.f65230j.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f65230j.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.f65230j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        h();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40118);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static n<com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.n>> a(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, String str, String str2) {
            l.d(cVar, "");
            l.d(str, "");
            l.d(str2, "");
            return x.a(cVar, str, cVar.A(), cVar.V_(), "", str2, (String) null, 192);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(40120);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return e.c(this.this$0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.o.d$d  reason: collision with other inner class name */
    static final class C1456d implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f65232a;

        static {
            Covode.recordClassIndex(40121);
        }

        C1456d(d dVar) {
            this.f65232a = dVar;
        }

        @Override // f.a.d.a
        public final void a() {
            this.f65232a.t();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m
    public final com.ss.android.ugc.aweme.account.login.v2.ui.a.l e() {
        com.ss.android.ugc.aweme.account.login.v2.ui.a.l lVar = new com.ss.android.ugc.aweme.account.login.v2.ui.a.l();
        lVar.f64883b = true;
        lVar.a(g());
        lVar.f64885d = e.d(this);
        return lVar;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m
    public final void i() {
        a.a(this, g(), "resend").a(new C1456d(this)).c();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        int i2;
        if (o.a()) {
            i2 = R.string.ar0;
        } else {
            i2 = R.string.ary;
        }
        com.ss.android.ugc.aweme.account.login.v2.ui.b bVar = new com.ss.android.ugc.aweme.account.login.v2.ui.b(null, null, false, null, null, false, null, false, false, 2047);
        bVar.f65051e = getString(i2);
        Locale locale = Locale.US;
        String string = getString(R.string.aqy);
        l.b(string, "");
        String a2 = com.a.a(locale, string, Arrays.copyOf(new Object[]{g()}, 1));
        l.b(a2, "");
        bVar.f65052f = a2;
        bVar.f65047a = " ";
        bVar.f65056j = false;
        return bVar;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m
    public final void a(String str) {
        l.d(str, "");
        x.a(this, str, 22, (Map<String, String>) null).d(new b(this)).c();
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f65231a;

        static {
            Covode.recordClassIndex(40119);
        }

        b(d dVar) {
            this.f65231a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.sdk.a.a.a.f fVar = (com.bytedance.sdk.a.a.a.f) obj;
            d dVar = this.f65231a;
            l.b(fVar, "");
            String str = fVar.f43086j;
            l.b(str, "");
            e.b(dVar, str);
            d dVar2 = this.f65231a;
            Bundle arguments = dVar2.getArguments();
            if (arguments == null) {
                l.b();
            }
            l.b(arguments, "");
            dVar2.a(arguments);
        }
    }
}
