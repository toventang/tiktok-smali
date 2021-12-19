package com.ss.android.ugc.gamora.editor.sticker.read;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.d;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.port.in.g;
import h.f.b.l;
import l.b.o;

public final class ReadTextV2Api {

    /* renamed from: a  reason: collision with root package name */
    public static final a f146816a = new a((byte) 0);

    public interface Api {
        static {
            Covode.recordClassIndex(96699);
        }

        @o(a = "/media/api/text/speech/invoke/")
        b<FetchTextAudioResponse> get(@z(a = "req_text") String str, @z(a = "text_speaker") String str2, @d Object obj);
    }

    static {
        Covode.recordClassIndex(96698);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(96700);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static FetchTextAudioResponse a(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            com.bytedance.ttnet.d.d dVar = new com.bytedance.ttnet.d.d();
            dVar.f28943d = 30000;
            dVar.f28942c = 30000;
            dVar.f28944e = 30000;
            T t = ((Api) g.a().C().createRetrofit(g.a().C().getApiHost(), true, Api.class)).get(str, str2, dVar).execute().f42630b;
            l.b(t, "");
            return t;
        }
    }
}
