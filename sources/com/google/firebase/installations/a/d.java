package com.google.firebase.installations.a;

import com.bytedance.covode.number.Covode;
import com.google.firebase.installations.a.a;
import com.google.firebase.installations.a.c;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static d f54536a = n().a();

    public static abstract class a {
        static {
            Covode.recordClassIndex(33839);
        }

        public abstract a a(long j2);

        public abstract a a(c.a aVar);

        public abstract a a(String str);

        public abstract d a();

        public abstract a b(long j2);

        public abstract a b(String str);

        public abstract a c(String str);

        public abstract a d(String str);
    }

    public abstract String a();

    public abstract c.a b();

    public abstract String c();

    public abstract String d();

    public abstract long e();

    public abstract long f();

    public abstract String g();

    public abstract a h();

    public final boolean i() {
        if (b() == c.a.REGISTERED) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if (b() == c.a.REGISTER_ERROR) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (b() == c.a.UNREGISTERED) {
            return true;
        }
        return false;
    }

    public final d m() {
        return h().a(c.a.NOT_GENERATED).a();
    }

    static {
        Covode.recordClassIndex(33838);
    }

    public static a n() {
        return new a.C1243a().b(0).a(c.a.ATTEMPT_MIGRATION).a(0);
    }

    public final boolean l() {
        if (b() == c.a.NOT_GENERATED || b() == c.a.ATTEMPT_MIGRATION) {
            return true;
        }
        return false;
    }

    public final d a(String str) {
        return h().d(str).a(c.a.REGISTER_ERROR).a();
    }
}
