package com.ss.android.ugc.gamora.editor.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.l;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f145676b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Keva f145677a;

    static {
        Covode.recordClassIndex(95675);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(95676);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public b() {
        Keva repo = Keva.getRepo("audio_enhance_repo");
        l.b(repo, "");
        this.f145677a = repo;
    }
}
