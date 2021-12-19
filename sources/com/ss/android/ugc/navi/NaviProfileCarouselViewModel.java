package com.ss.android.ugc.navi;

import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IProfileNaviService;
import com.ss.android.ugc.aweme.ProfileNaviServiceImpl;
import com.ss.android.ugc.aweme.bt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.hk;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.LinkedList;
import java.util.List;

public final class NaviProfileCarouselViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public final t<LinkedList<bt>> f148625a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f148626b = true;

    /* renamed from: c  reason: collision with root package name */
    public int f148627c;

    static {
        Covode.recordClassIndex(97951);
    }

    public final void a(User user) {
        l.d(user, "");
        if (this.f148626b) {
            ProfileNaviServiceImpl.a().a((IProfileNaviService) this.f148627c, 0, (m) new a(this, user));
        }
    }

    static final class a extends h.f.b.m implements m<Integer, List<? extends bt>, z> {
        final /* synthetic */ User $user;
        final /* synthetic */ NaviProfileCarouselViewModel this$0;

        static {
            Covode.recordClassIndex(97952);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(NaviProfileCarouselViewModel naviProfileCarouselViewModel, User user) {
            super(2);
            this.this$0 = naviProfileCarouselViewModel;
            this.$user = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Integer num, List<? extends bt> list) {
            LinkedList<bt> value;
            List<? extends bt> list2 = list;
            if (num.intValue() == 0) {
                if (list2 == null) {
                    this.this$0.f148626b = false;
                } else {
                    this.this$0.f148627c += list2.size();
                    if (this.this$0.f148625a.getValue() == null) {
                        this.this$0.f148625a.setValue(new LinkedList<>());
                    }
                    for (bt btVar : list2) {
                        if (hk.a(btVar.a()) && hk.a(btVar.b())) {
                            if ((!hk.a(this.$user.naviId) || !l.a((Object) this.$user.naviId, (Object) btVar.a())) && (value = this.this$0.f148625a.getValue()) != null) {
                                value.add(btVar);
                            }
                        }
                    }
                    this.this$0.f148625a.postValue(this.this$0.f148625a.getValue());
                }
            }
            return z.f158842a;
        }
    }
}
