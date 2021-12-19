package com.ss.android.ugc.aweme.ftc.components.audiorecord;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import h.f.b.l;
import h.f.b.m;

public final class FTCEditAudioRecordViewModel extends LifecycleAwareViewModel<FTCEditAudioRecordState> implements c {

    /* renamed from: a  reason: collision with root package name */
    final t<Boolean> f97687a = new t<>();

    static {
        Covode.recordClassIndex(62067);
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.audiorecord.c
    public final LiveData<Boolean> c() {
        return this.f97687a;
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.audiorecord.c
    public final void a() {
        d(b.f97689a);
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.audiorecord.c
    public final void b() {
        d(a.f97688a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new FTCEditAudioRecordState(null, 1, null);
    }

    static final class a extends m implements h.f.a.b<FTCEditAudioRecordState, FTCEditAudioRecordState> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f97688a = new a();

        static {
            Covode.recordClassIndex(62068);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditAudioRecordState invoke(FTCEditAudioRecordState fTCEditAudioRecordState) {
            FTCEditAudioRecordState fTCEditAudioRecordState2 = fTCEditAudioRecordState;
            l.d(fTCEditAudioRecordState2, "");
            return fTCEditAudioRecordState2.copy(new a.C1131a());
        }
    }

    static final class b extends m implements h.f.a.b<FTCEditAudioRecordState, FTCEditAudioRecordState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f97689a = new b();

        static {
            Covode.recordClassIndex(62069);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditAudioRecordState invoke(FTCEditAudioRecordState fTCEditAudioRecordState) {
            FTCEditAudioRecordState fTCEditAudioRecordState2 = fTCEditAudioRecordState;
            l.d(fTCEditAudioRecordState2, "");
            return fTCEditAudioRecordState2.copy(new a.b());
        }
    }
}
