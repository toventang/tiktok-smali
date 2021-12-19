package com.bytedance.ies.ugc.appcontext;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class e {
    public static final a q = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Application f34613a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f34614b;

    /* renamed from: c  reason: collision with root package name */
    public f.d f34615c;

    /* renamed from: d  reason: collision with root package name */
    public String f34616d;

    /* renamed from: e  reason: collision with root package name */
    public Integer f34617e;

    /* renamed from: f  reason: collision with root package name */
    public String f34618f;

    /* renamed from: g  reason: collision with root package name */
    public String f34619g;

    /* renamed from: h  reason: collision with root package name */
    public String f34620h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f34621i;

    /* renamed from: j  reason: collision with root package name */
    public long f34622j;

    /* renamed from: k  reason: collision with root package name */
    public String f34623k;

    /* renamed from: l  reason: collision with root package name */
    public int f34624l;

    /* renamed from: m  reason: collision with root package name */
    public String f34625m;
    public boolean n;
    public int o;
    public boolean p;

    static {
        Covode.recordClassIndex(20749);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(20750);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private e() {
        this.f34622j = -1;
        this.f34624l = -1;
    }

    public final Application a() {
        Application application = this.f34613a;
        if (application == null) {
            l.a("context");
        }
        return application;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public e(Application application, b<? super e, z> bVar) {
        this();
        l.d(application, "");
        l.d(bVar, "");
        this.f34613a = application;
        bVar.invoke(this);
    }
}
