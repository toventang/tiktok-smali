package com.ss.android.ugc.aweme.shortvideo.edit.audiorecord;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.p;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import h.f.b.l;
import h.f.b.m;

public final class EditAudioRecordViewModel extends LifecycleAwareViewModel<EditAudioRecordState> implements c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f126859a;

    /* renamed from: b  reason: collision with root package name */
    final t<Boolean> f126860b = new t<>();

    static {
        Covode.recordClassIndex(83228);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c
    public final LiveData<Boolean> e() {
        return this.f126860b;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c
    public final void a() {
        d(c.f126863a);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c
    public final void b() {
        d(b.f126862a);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c
    public final void c() {
        c(a.f126861a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new EditAudioRecordState(null, null, 3, null);
    }

    static final class a extends m implements h.f.a.b<EditAudioRecordState, EditAudioRecordState> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f126861a = new a();

        static {
            Covode.recordClassIndex(83229);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditAudioRecordState invoke(EditAudioRecordState editAudioRecordState) {
            EditAudioRecordState editAudioRecordState2 = editAudioRecordState;
            l.d(editAudioRecordState2, "");
            return EditAudioRecordState.copy$default(editAudioRecordState2, null, new p(), 1, null);
        }
    }

    static final class b extends m implements h.f.a.b<EditAudioRecordState, EditAudioRecordState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f126862a = new b();

        static {
            Covode.recordClassIndex(83230);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditAudioRecordState invoke(EditAudioRecordState editAudioRecordState) {
            EditAudioRecordState editAudioRecordState2 = editAudioRecordState;
            l.d(editAudioRecordState2, "");
            return EditAudioRecordState.copy$default(editAudioRecordState2, new a.C1131a(), null, 2, null);
        }
    }

    static final class c extends m implements h.f.a.b<EditAudioRecordState, EditAudioRecordState> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f126863a = new c();

        static {
            Covode.recordClassIndex(83231);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditAudioRecordState invoke(EditAudioRecordState editAudioRecordState) {
            EditAudioRecordState editAudioRecordState2 = editAudioRecordState;
            l.d(editAudioRecordState2, "");
            return EditAudioRecordState.copy$default(editAudioRecordState2, new a.b(), null, 2, null);
        }
    }
}
