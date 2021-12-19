package com.ss.android.ugc.aweme.friends.service;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.experiment.fi;
import com.ss.android.ugc.aweme.friends.g;
import com.ss.android.ugc.aweme.friends.model.Friend;
import com.ss.android.ugc.aweme.friends.model.FriendList;
import com.ss.android.ugc.aweme.friends.model.UploadContactsResult;
import com.ss.android.ugc.aweme.friends.ui.w;
import com.ss.android.ugc.aweme.friends.ui.x;
import com.ss.android.ugc.aweme.friends.ui.y;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.CheckMatchedFriendsResponse;
import f.a.ab;
import f.a.t;
import h.p;
import java.util.HashMap;
import java.util.List;

public interface IFriendsService {

    /* renamed from: b  reason: collision with root package name */
    public static final a f97036b = a.f97037a;

    public interface b {
        static {
            Covode.recordClassIndex(61670);
        }

        void a();

        boolean b();
    }

    public interface c {
        static {
            Covode.recordClassIndex(61671);
        }

        void a();

        void a(Fragment fragment);
    }

    public interface d {
        static {
            Covode.recordClassIndex(61672);
        }

        p<Boolean, Long> a(com.ss.android.ugc.aweme.recommend.f fVar);

        void a(com.ss.android.ugc.aweme.recommend.f fVar, p<Boolean, Long> pVar);
    }

    public interface e {
        static {
            Covode.recordClassIndex(61673);
        }

        void a();

        void b();
    }

    public interface f {
        static {
            Covode.recordClassIndex(61674);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(61668);
    }

    Intent a(Context context, int i2, int i3, String str, String str2);

    fi a(int i2);

    com.ss.android.ugc.aweme.friends.invite.b a(androidx.fragment.app.e eVar);

    com.ss.android.ugc.aweme.friends.invite.c a(Fragment fragment);

    x a(Context context);

    y a(Context context, HashMap<String, Boolean> hashMap, boolean z, boolean z2);

    ab<CheckMatchedFriendsResponse> a();

    t<FriendList<Friend>> a(String str, int i2);

    p<String, HashMap<String, Object>> a(String str, p<String, ? extends HashMap<String, Object>> pVar);

    void a(int i2, String str, String str2, Context context);

    void a(Activity activity, com.ss.android.ugc.aweme.friends.ui.f fVar);

    void a(fi fiVar, String str, String str2, Context context);

    void a(g gVar);

    void a(String str);

    void a(String str, boolean z);

    boolean a(Activity activity);

    boolean a(User user);

    boolean a(boolean z);

    com.ss.android.ugc.aweme.friends.invite.a b(Context context);

    IContactService b();

    t<UploadContactsResult> b(int i2);

    void b(g gVar);

    void b(boolean z);

    boolean b(Activity activity);

    t<List<Friend>> c(int i2);

    Class<? extends com.ss.android.ugc.aweme.ufr.a> c();

    void c(boolean z);

    com.ss.android.ugc.aweme.friends.c d();

    boolean e();

    Class<? extends com.ss.android.ugc.aweme.ufr.a> f();

    com.ss.android.ugc.aweme.friends.d g();

    long h();

    w i();

    b j();

    d k();

    boolean l();

    boolean m();

    com.ss.android.ugc.aweme.friends.widget.contact.c n();

    void o();

    boolean p();

    b q();

    void r();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f97037a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(61669);
        }
    }
}
