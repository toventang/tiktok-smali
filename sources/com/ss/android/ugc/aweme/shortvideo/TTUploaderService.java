package com.ss.android.ugc.aweme.shortvideo;

import b.i;
import com.bytedance.covode.number.Covode;
import com.google.c.h.a.k;
import com.google.c.h.a.l;
import com.google.c.h.a.q;
import com.google.c.h.a.u;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.property.AVPreferences;
import com.ss.android.ugc.aweme.publish.f.d;
import com.ss.android.ugc.aweme.publish.f.h;
import com.ss.android.ugc.aweme.uploader.retrofit.UploaderRetrofitService;
import java.io.IOException;
import java.util.HashMap;
import l.b.f;
import l.b.o;
import l.b.t;

public final class TTUploaderService {

    /* renamed from: a  reason: collision with root package name */
    private int f124775a = 0;

    public interface RetrofitService {
        static {
            Covode.recordClassIndex(81989);
        }

        @f(a = "/aweme/v1/pre/post/check/")
        q<ct> getServerPrePostResult(@t(a = "check_type") int i2, @t(a = "freq_limit") int i3);

        @o(a = "/aweme/v1/post/prompts/")
        f.a.t<ac> getTitleSensitivityResult(@t(a = "text") String str, @t(a = "text_type") int i2);
    }

    static {
        Covode.recordClassIndex(81988);
    }

    static UploaderRetrofitService b() {
        return (UploaderRetrofitService) g.a().C().createRetrofit(AVApiImpl.b().a(), true, UploaderRetrofitService.class);
    }

    public static void c() {
        if (!g.a().A().a()) {
            i.b(eg.f128416a, i.f4824a);
        }
    }

    public final q<h> a() {
        if (g.a().A().a()) {
            return l.a(new Throwable());
        }
        q<d> uploadAuthKeyConfig = b().getUploadAuthKeyConfig(new HashMap(0));
        l.a(uploadAuthKeyConfig, new a(this.f124775a), u.a.INSTANCE);
        return l.a(uploadAuthKeyConfig, IOException.class, ef.f128415a, u.a.INSTANCE);
    }

    static class a implements k<h> {

        /* renamed from: a  reason: collision with root package name */
        private int f124776a;

        static {
            Covode.recordClassIndex(81990);
        }

        @Override // com.google.c.h.a.k
        public final void onFailure(Throwable th) {
        }

        public a(int i2) {
            this.f124776a = i2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.c.h.a.k
        public final /* synthetic */ void onSuccess(h hVar) {
            boolean z;
            h hVar2 = hVar;
            if (hVar2 instanceof d) {
                g.a().e().setSdkV4AuthKey(g.a().G().b(hVar2));
                d dVar = (d) hVar2;
                if (dVar.f118723b != null) {
                    AVPreferences e2 = g.a().e();
                    boolean z2 = false;
                    if (dVar.f118723b.f118739b == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    e2.setEnablePreUpload(z);
                    g.a().e().setPreUploadEncryptionMode(dVar.f118723b.f118740c);
                    AVPreferences e3 = g.a().e();
                    if (dVar.f118723b.f118738a == 0) {
                        z2 = true;
                    }
                    e3.setWatermarkHardcode(z2);
                }
            }
        }
    }
}
