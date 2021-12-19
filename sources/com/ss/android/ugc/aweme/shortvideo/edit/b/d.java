package com.ss.android.ugc.aweme.shortvideo.edit.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f126952a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final h f126953b = i.a((h.f.a.a) a.f126954a);

    public static Keva a() {
        return (Keva) f126953b.getValue();
    }

    private d() {
    }

    static final class a extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f126954a = new a();

        static {
            Covode.recordClassIndex(83285);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("auto_enhance_keva");
        }
    }

    public static boolean b() {
        return a().getBoolean("key_show_toast", true);
    }

    static {
        Covode.recordClassIndex(83284);
    }
}
