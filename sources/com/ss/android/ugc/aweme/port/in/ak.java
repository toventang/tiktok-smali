package com.ss.android.ugc.aweme.port.in;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.model.AVSearchChallengeList;
import java.util.List;

public interface ak extends ag {

    /* renamed from: a  reason: collision with root package name */
    public static final String f115583a = (ag.class.getCanonicalName() + ":on_recommend_hash_get");

    public interface a<T> {
        static {
            Covode.recordClassIndex(74524);
        }

        void a();

        void a(List<T> list);
    }

    public interface b {
        static {
            Covode.recordClassIndex(74525);
        }

        boolean a(Object... objArr);
    }

    public interface c {
        static {
            Covode.recordClassIndex(74526);
        }

        boolean a(Object... objArr);
    }

    public interface d {
        static {
            Covode.recordClassIndex(74527);
        }

        com.ss.android.ugc.aweme.shortvideo.f a();

        void a(f fVar);
    }

    public interface e {
        static {
            Covode.recordClassIndex(74528);
        }

        void a(AVSearchChallengeList aVSearchChallengeList);

        void b();

        void c();
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public String f115584a;

        /* renamed from: b  reason: collision with root package name */
        public String f115585b;

        /* renamed from: c  reason: collision with root package name */
        public String f115586c;

        /* renamed from: d  reason: collision with root package name */
        public String f115587d;

        /* renamed from: e  reason: collision with root package name */
        public String f115588e;

        /* renamed from: f  reason: collision with root package name */
        public int f115589f;

        /* renamed from: g  reason: collision with root package name */
        public String f115590g;

        static {
            Covode.recordClassIndex(74529);
        }
    }

    b a(a<AVChallenge> aVar);

    c a(e eVar);

    d a(Fragment fragment);

    d a(androidx.fragment.app.e eVar);

    static {
        Covode.recordClassIndex(74523);
    }
}
