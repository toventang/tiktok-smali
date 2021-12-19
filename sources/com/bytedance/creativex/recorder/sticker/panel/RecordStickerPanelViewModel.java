package com.bytedance.creativex.recorder.sticker.panel;

import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.sticker.panel.e;
import com.bytedance.jedi.arch.af;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public final class RecordStickerPanelViewModel extends LifecycleAwareViewModel<StickerPanelState> implements com.bytedance.creativex.recorder.sticker.a.c {

    /* renamed from: a  reason: collision with root package name */
    public final t<Boolean> f28442a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    final com.bytedance.creativex.recorder.sticker.a.a f28443b;

    /* renamed from: c  reason: collision with root package name */
    final e.a f28444c;

    /* renamed from: d  reason: collision with root package name */
    private final h f28445d = i.a((h.f.a.a) c.f28447a);

    static {
        Covode.recordClassIndex(16713);
    }

    private final HashSet<f> a() {
        return (HashSet) this.f28445d.getValue();
    }

    static final class c extends m implements h.f.a.a<HashSet<f>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f28447a = new c();

        static {
            Covode.recordClassIndex(16716);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashSet<f> invoke() {
            return new HashSet();
        }
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new StickerPanelState(null, 1, null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bg_() {
        super.bg_();
        this.f28443b.a().a(this, new a(this));
    }

    static final class a<T> implements com.bytedance.als.m<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecordStickerPanelViewModel f28446a;

        static {
            Covode.recordClassIndex(16714);
        }

        a(RecordStickerPanelViewModel recordStickerPanelViewModel) {
            this.f28446a = recordStickerPanelViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Boolean bool) {
            Boolean bool2 = bool;
            RecordStickerPanelViewModel recordStickerPanelViewModel = this.f28446a;
            l.b(bool2, "");
            recordStickerPanelViewModel.a(bool2.booleanValue());
        }
    }

    @Override // com.bytedance.creativex.recorder.sticker.a.c
    public final void a(f fVar) {
        l.d(fVar, "");
        a().add(fVar);
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<StickerPanelState, StickerPanelState> {
        final /* synthetic */ boolean $show;
        final /* synthetic */ RecordStickerPanelViewModel this$0;

        static {
            Covode.recordClassIndex(16715);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(RecordStickerPanelViewModel recordStickerPanelViewModel, boolean z) {
            super(1);
            this.this$0 = recordStickerPanelViewModel;
            this.$show = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ StickerPanelState invoke(StickerPanelState stickerPanelState) {
            com.bytedance.ui_component.a aVar;
            StickerPanelState stickerPanelState2 = stickerPanelState;
            l.d(stickerPanelState2, "");
            if (this.$show) {
                aVar = new a.b();
                this.this$0.f28442a.setValue(true);
            } else {
                aVar = new a.C1131a();
                this.this$0.f28442a.setValue(false);
            }
            return stickerPanelState2.copy(aVar);
        }
    }

    @Override // com.bytedance.creativex.recorder.sticker.a.c
    public final void a(boolean z) {
        h.f.a.b<? super Boolean, Boolean> bVar = this.f28444c.f28470a;
        if (bVar == null || !bVar.invoke(Boolean.valueOf(z)).booleanValue()) {
            if (z) {
                HashSet<f> a2 = a();
                if (!(a2 instanceof Collection) || !a2.isEmpty()) {
                    Iterator<T> it = a2.iterator();
                    while (it.hasNext()) {
                        if (it.next().a()) {
                            return;
                        }
                    }
                }
            }
            d(new b(this, z));
        }
    }

    public RecordStickerPanelViewModel(com.bytedance.creativex.recorder.sticker.a.a aVar, e.a aVar2) {
        l.d(aVar, "");
        l.d(aVar2, "");
        this.f28443b = aVar;
        this.f28444c = aVar2;
    }
}
