package com.ss.android.ugc.aweme.recommend;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import h.a.n;
import h.z;
import java.util.List;

public interface a {

    /* renamed from: c  reason: collision with root package name */
    public static final C3099a f120059c = C3099a.f120061b;

    public static final class b {
        static {
            Covode.recordClassIndex(78035);
        }
    }

    static {
        Covode.recordClassIndex(78033);
    }

    void a(int i2, int i3, String str);

    void a(com.ss.android.ugc.aweme.inbox.widget.b bVar);

    void a(User user);

    void a(boolean z);

    com.ss.android.ugc.aweme.following.ui.view.a getFollowBtn();

    View getView();

    void setEventListener(h.f.a.b<? super Integer, z> bVar);

    /* renamed from: com.ss.android.ugc.aweme.recommend.a$a  reason: collision with other inner class name */
    public static final class C3099a {

        /* renamed from: a  reason: collision with root package name */
        public static final List<Integer> f120060a = n.b(9, 10);

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ C3099a f120061b = new C3099a();

        private C3099a() {
        }

        static {
            Covode.recordClassIndex(78034);
        }
    }
}
