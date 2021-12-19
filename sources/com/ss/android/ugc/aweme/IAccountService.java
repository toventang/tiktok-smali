package com.ss.android.ugc.aweme;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;

public interface IAccountService {

    public interface a {
        static {
            Covode.recordClassIndex(38357);
        }

        i<Bundle> a(Bundle bundle);

        i<Bundle> a(Bundle bundle, com.ss.android.ugc.aweme.ac.b bVar);

        i<Bundle> b(Bundle bundle);
    }

    public interface b {
        static {
            Covode.recordClassIndex(38358);
        }

        void onAccountResult(int i2, boolean z, int i3, User user);
    }

    public interface e {
        static {
            Covode.recordClassIndex(38361);
        }
    }

    public interface f {
        static {
            Covode.recordClassIndex(38362);
        }

        void a(int i2, int i3);
    }

    public interface g {
        static {
            Covode.recordClassIndex(38363);
        }

        void onResult(int i2, int i3, Object obj);
    }

    static {
        Covode.recordClassIndex(38356);
    }

    void a(b bVar);

    String b();

    void b(b bVar);

    IAgeGateService c();

    bk d();

    IAccountUserService e();

    bv f();

    bo g();

    bj h();

    br i();

    bs j();

    bn k();

    ca l();

    cb m();

    bm n();

    void o();

    boolean p();

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public Activity f62401a;

        /* renamed from: b  reason: collision with root package name */
        public String f62402b;

        /* renamed from: c  reason: collision with root package name */
        public String f62403c;

        /* renamed from: d  reason: collision with root package name */
        public Bundle f62404d;

        /* renamed from: e  reason: collision with root package name */
        public g f62405e;

        /* renamed from: f  reason: collision with root package name */
        public f f62406f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f62407g;

        static {
            Covode.recordClassIndex(38360);
        }

        public final c a() {
            return new c(this, (byte) 0);
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public Activity f62394a;

        /* renamed from: b  reason: collision with root package name */
        public String f62395b;

        /* renamed from: c  reason: collision with root package name */
        public String f62396c;

        /* renamed from: d  reason: collision with root package name */
        public Bundle f62397d;

        /* renamed from: e  reason: collision with root package name */
        public g f62398e;

        /* renamed from: f  reason: collision with root package name */
        public f f62399f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f62400g;

        static {
            Covode.recordClassIndex(38359);
        }

        private c(d dVar) {
            Bundle bundle;
            this.f62394a = dVar.f62401a;
            this.f62395b = dVar.f62402b;
            this.f62396c = dVar.f62403c;
            if (dVar.f62404d == null) {
                bundle = new Bundle();
            } else {
                bundle = dVar.f62404d;
            }
            this.f62397d = bundle;
            this.f62398e = dVar.f62405e;
            this.f62399f = dVar.f62406f;
            this.f62400g = dVar.f62407g;
            if (!TextUtils.isEmpty(this.f62395b)) {
                this.f62397d.putString("enter_from", this.f62395b);
            }
            if (!TextUtils.isEmpty(this.f62396c)) {
                this.f62397d.putString("enter_method", this.f62396c);
            }
        }

        /* synthetic */ c(d dVar, byte b2) {
            this(dVar);
        }
    }
}
