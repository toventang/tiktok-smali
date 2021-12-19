package com.ss.android.ugc.aweme.df;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import java.util.LinkedList;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static LinkedList<Activity> f80039a = new LinkedList<>();

    /* renamed from: b  reason: collision with root package name */
    public List<a> f80040b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f80041c;

    /* renamed from: d  reason: collision with root package name */
    public int f80042d;

    /* renamed from: e  reason: collision with root package name */
    public int f80043e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f80044f;

    public interface a {
        static {
            Covode.recordClassIndex(49822);
        }

        void a();

        void b();
    }

    public static class b implements a {
        static {
            Covode.recordClassIndex(49823);
        }

        @Override // com.ss.android.ugc.aweme.df.c.a
        public void a() {
        }

        @Override // com.ss.android.ugc.aweme.df.c.a
        public void b() {
        }
    }

    private c() {
    }

    public final boolean a() {
        if (this.f80042d <= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.df.c$c  reason: collision with other inner class name */
    public static final class C1870c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f80046a = new c((byte) 0);

        static {
            Covode.recordClassIndex(49824);
        }
    }

    static {
        Covode.recordClassIndex(49820);
    }

    public static Activity c() {
        if (f80039a.isEmpty()) {
            return null;
        }
        return f80039a.getLast();
    }

    public final void b() {
        if (this.f80042d > 0) {
            if (!this.f80044f) {
                for (a aVar : this.f80040b) {
                    aVar.b();
                }
                this.f80044f = true;
            }
        } else if (this.f80044f) {
            for (a aVar2 : this.f80040b) {
                aVar2.a();
            }
            this.f80044f = false;
        }
    }

    /* synthetic */ c(byte b2) {
        this();
    }

    public final void a(a aVar) {
        if (!this.f80040b.contains(aVar)) {
            this.f80040b.add(aVar);
        }
    }

    public final void b(a aVar) {
        if (this.f80040b.contains(aVar)) {
            this.f80040b.remove(aVar);
        }
    }
}
