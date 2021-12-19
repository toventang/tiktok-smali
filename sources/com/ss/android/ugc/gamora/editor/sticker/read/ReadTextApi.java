package com.ss.android.ugc.gamora.editor.sticker.read;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.d;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.port.in.au;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.tools.AVApi;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class ReadTextApi {

    /* renamed from: a  reason: collision with root package name */
    public final h f146814a = i.a((h.f.a.a) a.f146815a);

    public interface Api {
        static {
            Covode.recordClassIndex(96695);
        }

        @t(a = "/media/api/text/speech/invoke/")
        f.a.t<FetchTextAudioResponse> submitText(@z(a = "req_text") String str, @d Object obj);
    }

    static {
        Covode.recordClassIndex(96694);
    }

    static final class a extends m implements h.f.a.a<Api> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f146815a = new a();

        static {
            Covode.recordClassIndex(96696);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Api invoke() {
            au C = g.a().C();
            AVApi b2 = AVApiImpl.b();
            l.b(b2, "");
            String a2 = b2.a();
            l.b(a2, "");
            return C.createRetrofit(a2, true, Api.class);
        }
    }
}
