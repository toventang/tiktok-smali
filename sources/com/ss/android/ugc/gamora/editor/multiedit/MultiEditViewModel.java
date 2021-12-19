package com.ss.android.ugc.gamora.editor.multiedit;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f;
import h.f.b.l;
import h.f.b.m;
import h.p;

public final class MultiEditViewModel extends LifecycleAwareViewModel<MultiEditState> implements a {

    /* renamed from: a  reason: collision with root package name */
    private final t<Boolean> f146173a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    private final t<Boolean> f146174b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    private final f f146175c;

    static {
        Covode.recordClassIndex(96062);
    }

    @Override // com.ss.android.ugc.gamora.editor.multiedit.a
    public final LiveData<Boolean> c() {
        return this.f146173a;
    }

    @Override // com.ss.android.ugc.gamora.editor.multiedit.a
    public final LiveData<Boolean> e() {
        return this.f146174b;
    }

    @Override // com.ss.android.ugc.gamora.editor.multiedit.a
    public final void a() {
        d(a.f146176a);
    }

    @Override // com.ss.android.ugc.gamora.editor.multiedit.a
    public final boolean b() {
        return this.f146175c.t.f127885f;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new MultiEditState(null, null, null, 7, null);
    }

    public final void a(boolean z) {
        this.f146173a.setValue(Boolean.valueOf(z));
    }

    public final void b(boolean z) {
        this.f146174b.setValue(Boolean.valueOf(z));
    }

    static final class a extends m implements h.f.a.b<MultiEditState, MultiEditState> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f146176a = new a();

        static {
            Covode.recordClassIndex(96063);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ MultiEditState invoke(MultiEditState multiEditState) {
            MultiEditState multiEditState2 = multiEditState;
            l.d(multiEditState2, "");
            return MultiEditState.copy$default(multiEditState2, null, null, new a.b(), 3, null);
        }
    }

    public MultiEditViewModel(f fVar) {
        l.d(fVar, "");
        this.f146175c = fVar;
    }

    static final class b extends m implements h.f.a.b<MultiEditState, MultiEditState> {
        final /* synthetic */ boolean $hasEditInfo;
        final /* synthetic */ boolean $visible;

        static {
            Covode.recordClassIndex(96064);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(boolean z, boolean z2) {
            super(1);
            this.$hasEditInfo = z;
            this.$visible = z2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ MultiEditState invoke(MultiEditState multiEditState) {
            MultiEditState multiEditState2 = multiEditState;
            l.d(multiEditState2, "");
            return MultiEditState.copy$default(multiEditState2, new p(Boolean.valueOf(this.$hasEditInfo), Boolean.valueOf(this.$visible)), null, null, 6, null);
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.multiedit.a
    public final void a(boolean z, boolean z2) {
        d(new b(z, z2));
    }
}
