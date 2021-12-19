package com.ss.android.ugc.aweme.profile;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState;
import com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import java.lang.ref.WeakReference;

public final class ac {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f115951a;

    /* renamed from: b  reason: collision with root package name */
    public static WeakReference<MyProfileGuideViewModel> f115952b;

    /* renamed from: c  reason: collision with root package name */
    public static final ac f115953c = new ac();

    private ac() {
    }

    static {
        Covode.recordClassIndex(74779);
    }

    static final class a extends m implements b<MyProfileGuideState, MyProfileGuideState> {
        final /* synthetic */ boolean $needShow;

        static {
            Covode.recordClassIndex(74780);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(boolean z) {
            super(1);
            this.$needShow = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
            MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
            l.d(myProfileGuideState2, "");
            return MyProfileGuideState.copy$default(myProfileGuideState2, false, false, false, false, null, null, null, false, this.$needShow, false, null, null, null, null, 16127, null);
        }
    }
}
