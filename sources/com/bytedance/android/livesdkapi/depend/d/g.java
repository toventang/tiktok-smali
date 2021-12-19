package com.bytedance.android.livesdkapi.depend.d;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;

public interface g {

    public interface c {
        static {
            Covode.recordClassIndex(13598);
        }

        void a(b bVar, Object obj);
    }

    public interface e extends c {
        static {
            Covode.recordClassIndex(13601);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(13595);
    }

    void a(k kVar);

    void a(com.bytedance.android.livesdkapi.depend.model.c.a aVar);

    void a(String str, q qVar);

    void a(String str, com.bytedance.android.livesdkapi.view.d dVar, int i2, d dVar2, c cVar, String str2);

    void a(String str, String str2, com.bytedance.android.livesdkapi.view.d dVar, int i2, d dVar2, c cVar);

    void a(boolean z, Context context);

    void b(String str, String str2, com.bytedance.android.livesdkapi.view.d dVar, int i2, d dVar2, c cVar, String str3);

    boolean c(Context context);

    void d(Context context);

    void e(Context context);

    void f(Context context);

    void f(String str);

    void f(boolean z);

    void g(String str);

    boolean g(Context context);

    void h(boolean z);

    void j();

    int k();

    boolean l();

    String m();

    String n();

    View o();

    void p();

    int q();

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f22954a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f22955b;

        /* renamed from: c  reason: collision with root package name */
        public final int f22956c;

        static {
            Covode.recordClassIndex(13599);
        }

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public boolean f22957a;

            /* renamed from: b  reason: collision with root package name */
            public boolean f22958b;

            /* renamed from: c  reason: collision with root package name */
            public int f22959c;

            static {
                Covode.recordClassIndex(13600);
            }

            public final d a() {
                return new d(this, (byte) 0);
            }
        }

        private d(a aVar) {
            this.f22954a = aVar.f22957a;
            this.f22955b = aVar.f22958b;
            this.f22956c = aVar.f22959c;
        }

        /* synthetic */ d(a aVar, byte b2) {
            this(aVar);
        }
    }

    public enum b {
        UNKNOWN,
        PLAYER_PREPARED,
        COMPLETE_PLAY,
        MEDIA_ERROR,
        DISPLAYED_PLAY,
        STOP_WHEN_PLAYING_OTHER,
        STOP_WHEN_JOIN_INTERACT,
        BUFFERING_START,
        BUFFERING_END,
        INTERACT_SEI,
        VIDEO_SIZE_CHANGED,
        START_SWITCH_RESOLUTION,
        PLAYER_DETACHED,
        RESOLUTION_DEGRADE;

        static {
            Covode.recordClassIndex(13597);
        }

        public static b valueOf(int i2) {
            if (i2 < 0 || i2 >= values().length) {
                return UNKNOWN;
            }
            return values()[i2];
        }
    }

    public static class a {
        static {
            Covode.recordClassIndex(13596);
        }

        public static String a(Context context) {
            if (context == null) {
                return "@";
            }
            return context.toString();
        }
    }
}
