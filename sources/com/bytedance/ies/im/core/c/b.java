package com.bytedance.ies.im.core.c;

import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.h;
import h.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final int f34018a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static final h f34019b = i.a((h.f.a.a) a.f34021a);

    /* renamed from: c  reason: collision with root package name */
    public static final b f34020c = new b();

    private b() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34021a = new a();

        static {
            Covode.recordClassIndex(20261);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (com.bytedance.ies.abmock.b.a().a(true, "im_replace_sp_with_keva", 1) != b.f34018a) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(20260);
    }
}
