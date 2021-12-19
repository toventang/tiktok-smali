package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final s f122553a = new s();

    /* renamed from: b  reason: collision with root package name */
    private static final h f122554b = i.a((h.f.a.a) a.f122555a);

    public static boolean a() {
        return ((Boolean) f122554b.getValue()).booleanValue();
    }

    private s() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f122555a = new a();

        static {
            Covode.recordClassIndex(80409);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (b.a().a(true, "studio_can_cancel_loading_in_duet", 0) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(80408);
    }
}
