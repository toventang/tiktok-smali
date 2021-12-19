package com.ss.android.ugc.aweme.video.hashtag.helper;

import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class BaseTitleHelper extends ac {

    /* renamed from: d  reason: collision with root package name */
    public static final a f143426d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public b f143427a;

    /* renamed from: b  reason: collision with root package name */
    public String f143428b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f143429c = "";

    public interface b {
        static {
            Covode.recordClassIndex(93856);
        }
    }

    static {
        Covode.recordClassIndex(93854);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(93855);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static BaseTitleHelper a(e eVar) {
            l.d(eVar, "");
            ac a2 = ae.a(eVar, (ad.b) null).a(TitleHelper.class);
            l.b(a2, "");
            return (BaseTitleHelper) a2;
        }
    }
}
