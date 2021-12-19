package com.ss.android.ugc.aweme.watermark;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f144787a = new j();

    /* renamed from: b  reason: collision with root package name */
    private static final h f144788b = i.a((h.f.a.a) a.f144789a);

    static Keva a() {
        return (Keva) f144788b.getValue();
    }

    private j() {
    }

    static final class a extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f144789a = new a();

        static {
            Covode.recordClassIndex(94695);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("repo_watermark_resource");
        }
    }

    static {
        Covode.recordClassIndex(94694);
    }

    public static void a(boolean z) {
        a().storeBoolean("key_ending_audio_ready", z);
    }

    public static void a(int i2, int i3) {
        a().storeString("key_ending_frame_ready", b(i2, i3));
    }

    static String b(int i2, int i3) {
        return new StringBuilder().append(i2).append('-').append(i3).toString();
    }

    static String c(String str, boolean z) {
        return (z ? 1 : 0) + str;
    }

    public static void a(String str, boolean z) {
        l.d(str, "");
        a().storeString(c("key_ending_effects_path", z), str);
    }

    public static void b(String str, boolean z) {
        l.d(str, "");
        a().storeString(c("key_user_fingerprint", z), str);
    }
}
