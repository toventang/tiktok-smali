package dmt.av.video.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.property.cu;

public final class a implements com.ss.android.ugc.aweme.shortvideo.ui.task.a {

    /* renamed from: a  reason: collision with root package name */
    public static final C4147a f156888a = new C4147a((byte) 0);

    static {
        Covode.recordClassIndex(104211);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.task.a
    public final boolean b() {
        return false;
    }

    /* renamed from: dmt.av.video.f.a$a  reason: collision with other inner class name */
    public static final class C4147a {
        static {
            Covode.recordClassIndex(104212);
        }

        private C4147a() {
        }

        public /* synthetic */ C4147a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.task.a
    public final void a() {
        Keva repo = Keva.getRepo("clean_synthetic_video");
        if (cu.a() && !repo.getBoolean("key_clean_synthetic_video_only_once", false)) {
            repo.storeBoolean("key_clean_synthetic_video_only_once", true);
            dmt.av.video.a.a.a("record_page");
        }
    }
}
