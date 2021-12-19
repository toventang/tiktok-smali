package com.ss.android.ugc.aweme.comment.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f71784a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final h f71785b = i.a((h.f.a.a) a.f71786a);

    private e() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f71786a = new a();

        static {
            Covode.recordClassIndex(44144);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a(true, "ux_opt_comment_exp_v2", 1));
        }
    }

    static {
        Covode.recordClassIndex(44143);
    }

    public static final boolean a() {
        if (((Number) f71785b.getValue()).intValue() == 2) {
            return true;
        }
        return false;
    }
}
