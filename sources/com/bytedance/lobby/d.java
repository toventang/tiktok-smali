package com.bytedance.lobby;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public int f40175a;

    /* renamed from: b  reason: collision with root package name */
    public String f40176b;

    /* renamed from: c  reason: collision with root package name */
    public String f40177c;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f40178d;

    static {
        Covode.recordClassIndex(24761);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f40179a = 1;

        /* renamed from: b  reason: collision with root package name */
        public String f40180b;

        /* renamed from: c  reason: collision with root package name */
        public String f40181c;

        /* renamed from: d  reason: collision with root package name */
        public Bundle f40182d;

        static {
            Covode.recordClassIndex(24762);
        }

        public final a a() {
            this.f40179a = 2;
            return this;
        }

        public final d b() {
            return new d(this, (byte) 0);
        }

        public final a a(Bundle bundle) {
            this.f40182d = bundle;
            return this;
        }

        a(String str, String str2) {
            this.f40180b = str;
            this.f40181c = str2;
        }
    }

    public static final class b extends a {
        static {
            Covode.recordClassIndex(24763);
        }

        public b(String str) {
            super("facebook", str);
        }
    }

    public static final class c extends a {
        static {
            Covode.recordClassIndex(24764);
        }

        public c(String str) {
            super("google", str);
        }
    }

    /* renamed from: com.bytedance.lobby.d$d  reason: collision with other inner class name */
    public static final class C0983d extends a {
        static {
            Covode.recordClassIndex(24765);
        }

        public C0983d(String str) {
            super("google_onetap", str);
        }
    }

    public static final class e extends a {
        static {
            Covode.recordClassIndex(24766);
        }

        public e(String str) {
            super("google_web", str);
        }
    }

    public static final class f extends a {
        static {
            Covode.recordClassIndex(24767);
        }

        public f(String str) {
            super("instagram", str);
        }
    }

    public static final class g extends a {
        static {
            Covode.recordClassIndex(24768);
        }

        public g(String str) {
            super("kakaotalk", str);
        }
    }

    public static final class h extends a {
        static {
            Covode.recordClassIndex(24769);
        }

        public h(String str) {
            super("line", str);
        }
    }

    public static final class i extends a {
        static {
            Covode.recordClassIndex(24770);
        }

        public i(String str) {
            super("twitter", str);
        }
    }

    public static final class j extends a {
        static {
            Covode.recordClassIndex(24771);
        }

        public j(String str) {
            super("vk", str);
        }
    }

    private d(a aVar) {
        Bundle bundle;
        this.f40175a = aVar.f40179a;
        this.f40176b = aVar.f40180b;
        this.f40177c = aVar.f40181c;
        if (aVar.f40182d == null) {
            bundle = new Bundle();
        } else {
            bundle = aVar.f40182d;
        }
        this.f40178d = bundle;
    }

    /* synthetic */ d(a aVar, byte b2) {
        this(aVar);
    }
}
