package com.ss.android.ugc.gamora.editor.filter.indicator;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.aweme.filter.FilterBean;
import h.f.b.l;
import h.f.b.m;

public final class EditFilterIndicatorViewModel extends LifecycleAwareViewModel<EditFilterIndicatorState> implements a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f145926a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f145927b = true;

    static {
        Covode.recordClassIndex(95889);
    }

    @Override // com.ss.android.ugc.gamora.editor.filter.indicator.a
    public final void a() {
        d(b.f145928a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new EditFilterIndicatorState(true, true, null, null, 12, null);
    }

    static final class a extends m implements h.f.a.b<EditFilterIndicatorState, EditFilterIndicatorState> {
        final /* synthetic */ boolean $isAutoUse;
        final /* synthetic */ boolean $isShowPrompt = true;
        final /* synthetic */ FilterBean $value;

        static {
            Covode.recordClassIndex(95890);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(boolean z, FilterBean filterBean, boolean z2) {
            super(1);
            this.$isAutoUse = z;
            this.$value = filterBean;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditFilterIndicatorState invoke(EditFilterIndicatorState editFilterIndicatorState) {
            EditFilterIndicatorState editFilterIndicatorState2 = editFilterIndicatorState;
            l.d(editFilterIndicatorState2, "");
            return EditFilterIndicatorState.copy$default(editFilterIndicatorState2, this.$isAutoUse, this.$isShowPrompt, this.$value, null, 8, null);
        }
    }

    static final class b extends m implements h.f.a.b<EditFilterIndicatorState, EditFilterIndicatorState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f145928a = new b();

        static {
            Covode.recordClassIndex(95891);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditFilterIndicatorState invoke(EditFilterIndicatorState editFilterIndicatorState) {
            EditFilterIndicatorState editFilterIndicatorState2 = editFilterIndicatorState;
            l.d(editFilterIndicatorState2, "");
            return EditFilterIndicatorState.copy$default(editFilterIndicatorState2, false, false, null, new a.b(), 7, null);
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.filter.indicator.a
    public final void a(boolean z, FilterBean filterBean) {
        this.f145926a = z;
        this.f145927b = true;
        c(new a(z, filterBean, true));
    }
}
