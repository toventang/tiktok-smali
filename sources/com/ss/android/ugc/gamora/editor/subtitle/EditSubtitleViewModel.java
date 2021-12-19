package com.ss.android.ugc.gamora.editor.subtitle;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.als.g;
import com.bytedance.als.h;
import com.bytedance.als.k;
import com.bytedance.als.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.aweme.property.dw;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.subtitle.n;
import h.f.b.m;
import h.z;
import java.util.List;

public final class EditSubtitleViewModel extends LifecycleAwareViewModel<EditSubtitleState> implements e {

    /* renamed from: a  reason: collision with root package name */
    public final h<List<com.ss.android.ugc.aweme.sticker.data.h>> f146929a;

    /* renamed from: b  reason: collision with root package name */
    public final g<z> f146930b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.subtitle.a f146931c;

    /* renamed from: d  reason: collision with root package name */
    private final t<Boolean> f146932d = new t<>();

    /* renamed from: e  reason: collision with root package name */
    private final l<List<com.ss.android.ugc.aweme.sticker.data.h>> f146933e;

    /* renamed from: f  reason: collision with root package name */
    private final k<z> f146934f;

    static {
        Covode.recordClassIndex(96766);
    }

    @Override // com.ss.android.ugc.gamora.editor.subtitle.e
    public final h<List<com.ss.android.ugc.aweme.sticker.data.h>> a() {
        return this.f146929a;
    }

    @Override // com.ss.android.ugc.gamora.editor.subtitle.e
    public final LiveData<Boolean> i() {
        return this.f146932d;
    }

    @Override // com.ss.android.ugc.gamora.editor.subtitle.e
    public final void b() {
        c(b.f146936a);
    }

    @Override // com.ss.android.ugc.gamora.editor.subtitle.e
    public final void c() {
        c(a.f146935a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new EditSubtitleState(null, null, 3, null);
    }

    @Override // com.ss.android.ugc.gamora.editor.subtitle.e
    public final void e() {
        this.f146934f.a((z) null);
    }

    @Override // com.ss.android.ugc.gamora.editor.subtitle.e
    public final void f() {
        com.ss.android.ugc.aweme.shortvideo.subtitle.a aVar = this.f146931c;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.subtitle.e
    public final void g() {
        com.ss.android.ugc.aweme.shortvideo.subtitle.a aVar = this.f146931c;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.subtitle.e
    public final boolean h() {
        com.ss.android.ugc.aweme.shortvideo.subtitle.a aVar = this.f146931c;
        if (aVar == null || !aVar.e()) {
            return false;
        }
        return true;
    }

    public EditSubtitleViewModel() {
        l<List<com.ss.android.ugc.aweme.sticker.data.h>> lVar = new l<>(null);
        this.f146933e = lVar;
        this.f146929a = lVar;
        k<z> kVar = new k<>();
        this.f146934f = kVar;
        this.f146930b = kVar;
    }

    @Override // com.ss.android.ugc.gamora.editor.subtitle.e
    public final void a(List<com.ss.android.ugc.aweme.sticker.data.h> list) {
        this.f146933e.b(list);
    }

    public final void a(boolean z) {
        this.f146932d.setValue(Boolean.valueOf(z));
    }

    static final class a extends m implements h.f.a.b<EditSubtitleState, EditSubtitleState> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f146935a = new a();

        static {
            Covode.recordClassIndex(96767);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditSubtitleState invoke(EditSubtitleState editSubtitleState) {
            EditSubtitleState editSubtitleState2 = editSubtitleState;
            h.f.b.l.d(editSubtitleState2, "");
            return EditSubtitleState.copy$default(editSubtitleState2, new a.C1131a(), null, 2, null);
        }
    }

    static final class b extends m implements h.f.a.b<EditSubtitleState, EditSubtitleState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f146936a = new b();

        static {
            Covode.recordClassIndex(96768);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditSubtitleState invoke(EditSubtitleState editSubtitleState) {
            EditSubtitleState editSubtitleState2 = editSubtitleState;
            h.f.b.l.d(editSubtitleState2, "");
            return EditSubtitleState.copy$default(editSubtitleState2, new a.b(), null, 2, null);
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.subtitle.e
    public final void a(VideoPublishEditModel videoPublishEditModel, int i2) {
        com.ss.android.ugc.aweme.shortvideo.subtitle.a nVar;
        h.f.b.l.d(videoPublishEditModel, "");
        if (dw.a()) {
            nVar = new com.ss.android.ugc.aweme.shortvideo.subtitle.m(videoPublishEditModel, i2);
        } else {
            nVar = new n(videoPublishEditModel, i2);
        }
        this.f146931c = nVar;
    }
}
