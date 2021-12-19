package com.ss.android.ugc.aweme.music.presenter;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;
import com.google.gson.a.c;

public final class EditOriginMusicTitlePresenter {

    /* renamed from: a  reason: collision with root package name */
    public b f111564a;

    public interface MusicTitleApi {
        static {
            Covode.recordClassIndex(71694);
        }

        @t(a = "/aweme/v1/music/update/")
        @g
        f.a.t<a> alterMusicTitle(@e(a = "music_id") String str, @e(a = "title") String str2);
    }

    public static class a {
        @c(a = "status_code")

        /* renamed from: a  reason: collision with root package name */
        public int f111566a;
        @c(a = "status_msg")

        /* renamed from: b  reason: collision with root package name */
        public String f111567b;

        static {
            Covode.recordClassIndex(71695);
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(71696);
        }

        void a();

        void a(String str);
    }

    static {
        Covode.recordClassIndex(71692);
    }

    public EditOriginMusicTitlePresenter(b bVar) {
        this.f111564a = bVar;
    }
}
