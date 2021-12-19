package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class ca {

    /* renamed from: a  reason: collision with root package name */
    public static final ca f142756a = new ca();

    /* renamed from: b  reason: collision with root package name */
    private static final h f142757b = i.a((h.f.a.a) b.f142760a);

    /* renamed from: c  reason: collision with root package name */
    private static final h f142758c = i.a((h.f.a.a) a.f142759a);

    public static Keva a() {
        return (Keva) f142757b.getValue();
    }

    private static Keva b() {
        return (Keva) f142758c.getValue();
    }

    private ca() {
    }

    static final class a extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f142759a = new a();

        static {
            Covode.recordClassIndex(93379);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("illegal_music_dialog");
        }
    }

    static final class b extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f142760a = new b();

        static {
            Covode.recordClassIndex(93380);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("illegal_music_panel");
        }
    }

    static {
        Covode.recordClassIndex(93378);
    }

    public static boolean a(String str) {
        return b().getBoolean(str, true);
    }

    public static void b(String str) {
        b().erase(str);
        a().erase(str);
    }

    public static void a(String str, boolean z) {
        a().storeBoolean(str, z);
    }

    public static void b(String str, boolean z) {
        b().storeBoolean(str, z);
    }
}
