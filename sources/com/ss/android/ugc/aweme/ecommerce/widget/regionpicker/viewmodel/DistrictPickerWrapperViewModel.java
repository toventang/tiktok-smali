package com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import h.f.b.l;
import h.f.b.m;
import java.util.List;

public final class DistrictPickerWrapperViewModel extends JediViewModel<DistrictPickerWrapperState> {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a f87693a;

    static {
        Covode.recordClassIndex(55159);
    }

    public final void a() {
        c(d.f87695a);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ DistrictPickerWrapperState d() {
        return new DistrictPickerWrapperState(false, false, false, false, null, 31, null);
    }

    public static final class a extends m implements h.f.a.b<DistrictPickerWrapperState, DistrictPickerWrapperState> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f87694a = new a();

        static {
            Covode.recordClassIndex(55160);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ DistrictPickerWrapperState invoke(DistrictPickerWrapperState districtPickerWrapperState) {
            DistrictPickerWrapperState districtPickerWrapperState2 = districtPickerWrapperState;
            l.d(districtPickerWrapperState2, "");
            return DistrictPickerWrapperState.copy$default(districtPickerWrapperState2, false, true, false, false, null, 29, null);
        }
    }

    public static final class b extends m implements h.f.a.b<DistrictPickerWrapperState, DistrictPickerWrapperState> {
        final /* synthetic */ List $regions;

        static {
            Covode.recordClassIndex(55161);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(List list) {
            super(1);
            this.$regions = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ DistrictPickerWrapperState invoke(DistrictPickerWrapperState districtPickerWrapperState) {
            DistrictPickerWrapperState districtPickerWrapperState2 = districtPickerWrapperState;
            l.d(districtPickerWrapperState2, "");
            return DistrictPickerWrapperState.copy$default(districtPickerWrapperState2, true, false, false, false, this.$regions, 14, null);
        }
    }

    public static final class c extends m implements h.f.a.b<DistrictPickerWrapperState, DistrictPickerWrapperState> {
        final /* synthetic */ List $regions;

        static {
            Covode.recordClassIndex(55162);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(1);
            this.$regions = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ DistrictPickerWrapperState invoke(DistrictPickerWrapperState districtPickerWrapperState) {
            DistrictPickerWrapperState districtPickerWrapperState2 = districtPickerWrapperState;
            l.d(districtPickerWrapperState2, "");
            return DistrictPickerWrapperState.copy$default(districtPickerWrapperState2, false, false, false, false, this.$regions, 15, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<DistrictPickerWrapperState, DistrictPickerWrapperState> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f87695a = new d();

        static {
            Covode.recordClassIndex(55163);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ DistrictPickerWrapperState invoke(DistrictPickerWrapperState districtPickerWrapperState) {
            DistrictPickerWrapperState districtPickerWrapperState2 = districtPickerWrapperState;
            l.d(districtPickerWrapperState2, "");
            return DistrictPickerWrapperState.copy$default(districtPickerWrapperState2, false, false, false, true, null, 23, null);
        }
    }

    public static final class e extends m implements h.f.a.b<DistrictPickerWrapperState, DistrictPickerWrapperState> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f87696a = new e();

        static {
            Covode.recordClassIndex(55164);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ DistrictPickerWrapperState invoke(DistrictPickerWrapperState districtPickerWrapperState) {
            DistrictPickerWrapperState districtPickerWrapperState2 = districtPickerWrapperState;
            l.d(districtPickerWrapperState2, "");
            return DistrictPickerWrapperState.copy$default(districtPickerWrapperState2, false, false, true, false, null, 27, null);
        }
    }
}
