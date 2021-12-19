package com.ss.android.ugc.aweme.profile.widgets;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.survey.d;
import com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState;
import com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel;
import h.f.b.l;
import h.f.b.m;
import java.lang.ref.WeakReference;

public final class q implements d.a {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<MyProfileGuideViewModel> f118035a;

    static {
        Covode.recordClassIndex(76593);
    }

    @Override // com.ss.android.ugc.aweme.profile.survey.d.a
    public final void a() {
        MyProfileGuideViewModel myProfileGuideViewModel = this.f118035a.get();
        if (myProfileGuideViewModel != null) {
            myProfileGuideViewModel.g(b.f118036a);
        }
    }

    public q(MyProfileGuideViewModel myProfileGuideViewModel) {
        l.d(myProfileGuideViewModel, "");
        this.f118035a = new WeakReference<>(myProfileGuideViewModel);
    }

    static final class b extends m implements h.f.a.b<MyProfileGuideState, MyProfileGuideState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f118036a = new b();

        static {
            Covode.recordClassIndex(76595);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
            MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
            l.d(myProfileGuideState2, "");
            return MyProfileGuideState.copy$default(myProfileGuideState2, false, false, false, true, null, null, null, false, false, false, null, null, null, null, 16359, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.survey.d.a
    public final void a(com.ss.android.ugc.aweme.cu.a aVar) {
        MyProfileGuideViewModel myProfileGuideViewModel = this.f118035a.get();
        if (myProfileGuideViewModel != null) {
            myProfileGuideViewModel.g(new a(aVar));
        }
    }

    static final class a extends m implements h.f.a.b<MyProfileGuideState, MyProfileGuideState> {
        final /* synthetic */ com.ss.android.ugc.aweme.cu.a $surveyData;

        static {
            Covode.recordClassIndex(76594);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(com.ss.android.ugc.aweme.cu.a aVar) {
            super(1);
            this.$surveyData = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
            MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
            l.d(myProfileGuideState2, "");
            return MyProfileGuideState.copy$default(myProfileGuideState2, false, false, false, true, this.$surveyData, null, null, false, false, false, null, null, null, null, 16359, null);
        }
    }
}
