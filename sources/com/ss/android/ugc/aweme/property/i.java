package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.l;
import h.f.b.m;
import h.h;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final j f118554a = new j();

    /* renamed from: b  reason: collision with root package name */
    static final int f118555b = a().f118567b;

    /* renamed from: c  reason: collision with root package name */
    static final int f118556c = a().f118568c;

    /* renamed from: d  reason: collision with root package name */
    static final int f118557d = a().f118569d;

    /* renamed from: e  reason: collision with root package name */
    static final int f118558e = a().f118570e;

    /* renamed from: f  reason: collision with root package name */
    static final boolean f118559f = a().f118566a;

    /* renamed from: g  reason: collision with root package name */
    static final boolean f118560g = a().f118571f;

    /* renamed from: h  reason: collision with root package name */
    static final boolean f118561h = a().f118572g;

    /* renamed from: i  reason: collision with root package name */
    static final boolean f118562i = a().f118573h;

    /* renamed from: j  reason: collision with root package name */
    public static final i f118563j = new i();

    /* renamed from: k  reason: collision with root package name */
    private static final h f118564k = h.i.a((h.f.a.a) a.f118565a);

    private static final j a() {
        return (j) f118564k.getValue();
    }

    private i() {
    }

    static final class a extends m implements h.f.a.a<j> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f118565a = new a();

        static {
            Covode.recordClassIndex(76999);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ j invoke() {
            return a();
        }

        private static j a() {
            try {
                j jVar = (j) b.a().a(true, "creative_tools_brightness_enhance_config", j.class, i.f118554a);
                if (jVar == null) {
                    jVar = i.f118554a;
                }
                l.b(jVar, "");
                return jVar;
            } catch (Exception e2) {
                e2.printStackTrace();
                return i.f118554a;
            }
        }
    }

    static {
        Covode.recordClassIndex(76998);
    }
}
