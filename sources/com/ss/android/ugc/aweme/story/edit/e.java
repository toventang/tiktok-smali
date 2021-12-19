package com.ss.android.ugc.aweme.story.edit;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.t;
import com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.StoryEditToolbarViewModel;
import com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class e implements com.ss.android.ugc.gamora.editor.rootscene.e {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.fragment.app.e f137579a;

    /* renamed from: b  reason: collision with root package name */
    private final h f137580b = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(90006);
    }

    private final StoryEditToolbarViewModel a() {
        return (StoryEditToolbarViewModel) this.f137580b.getValue();
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.e
    public final void a(boolean z) {
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.e
    public final void b(boolean z) {
    }

    static final class a extends m implements h.f.a.a<StoryEditToolbarViewModel> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(90007);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ StoryEditToolbarViewModel invoke() {
            return t.a(this.this$0.f137579a).a(StoryEditToolbarViewModel.class);
        }
    }

    private final EditStickerViewModel b() {
        JediViewModel a2 = t.a(this.f137579a).a(EditStickerViewModel.class);
        l.b(a2, "");
        return (EditStickerViewModel) a2;
    }

    public e(androidx.fragment.app.e eVar) {
        l.d(eVar, "");
        this.f137579a = eVar;
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.e
    public final void a(int i2, int i3) {
        a().a(i2);
        a().b(i3);
        b().a(Integer.valueOf(i2));
    }
}
