package com.ss.android.ugc.aweme.network.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ml.ab.SmartPreloadCommentV2Experiment;
import com.ss.android.ugc.aweme.ml.ab.SmartPreloadProfileV2Experiment;
import h.f.b.m;
import h.h;
import h.i;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f112543a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final h f112544b = i.a((h.f.a.a) b.f112547a);

    /* renamed from: c  reason: collision with root package name */
    private static final h f112545c = i.a((h.f.a.a) a.f112546a);

    public static final boolean a() {
        return ((Boolean) f112544b.getValue()).booleanValue();
    }

    public static final boolean b() {
        return ((Boolean) f112545c.getValue()).booleanValue();
    }

    private e() {
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f112547a = new b();

        static {
            Covode.recordClassIndex(72330);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(com.bytedance.ies.abmock.b.a().a(true, "power_preload_init_enable", true));
        }
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f112546a = new a();

        static {
            Covode.recordClassIndex(72329);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((SmartPreloadCommentV2Experiment.a.c() || SmartPreloadProfileV2Experiment.a.c()) && e.a()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(72328);
    }
}
