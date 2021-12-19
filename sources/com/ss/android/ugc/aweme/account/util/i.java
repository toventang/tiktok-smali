package com.ss.android.ugc.aweme.account.util;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import h.f.b.m;
import h.h;
import java.lang.reflect.Type;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f65484a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f65485b = false;

    /* renamed from: c  reason: collision with root package name */
    private static final h f65486c = h.i.a((h.f.a.a) a.f65487a);

    public static f a() {
        return (f) f65486c.getValue();
    }

    private i() {
    }

    static final class a extends m implements h.f.a.a<f> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f65487a = new a();

        static {
            Covode.recordClassIndex(40273);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f invoke() {
            return new f();
        }
    }

    static {
        Covode.recordClassIndex(40272);
    }

    public static <T> T a(String str, Class<T> cls) {
        return (T) a().a(str, (Class) cls);
    }

    public static <T> T a(String str, Type type) {
        return (T) a().a(str, type);
    }
}
