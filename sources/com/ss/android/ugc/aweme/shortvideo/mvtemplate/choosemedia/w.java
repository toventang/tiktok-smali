package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.tools.utils.i;

public interface w {
    static {
        Covode.recordClassIndex(84809);
    }

    a a();

    void a(boolean z, MusicModel musicModel, String str);

    a e();

    void g();

    boolean i();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public MusicModel f129191a;

        /* renamed from: b  reason: collision with root package name */
        public String f129192b;

        static {
            Covode.recordClassIndex(84810);
        }

        private /* synthetic */ a() {
            this(null, null);
        }

        public final boolean a() {
            String str;
            if (this.f129191a == null || (str = this.f129192b) == null || !i.a(str)) {
                return false;
            }
            return true;
        }

        public a(MusicModel musicModel, String str) {
            this.f129191a = musicModel;
            this.f129192b = str;
        }
    }
}
