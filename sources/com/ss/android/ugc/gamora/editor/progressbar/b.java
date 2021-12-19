package com.ss.android.ugc.gamora.editor.progressbar;

import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.vesdk.x;
import com.zhiliaoapp.musically.R;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class b extends com.bytedance.ui_component.b<EditPreviewProgressViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    final com.bytedance.scene.group.b f146330a;

    /* renamed from: b  reason: collision with root package name */
    public final int f146331b = R.id.c9_;

    /* renamed from: c  reason: collision with root package name */
    private final h f146332c = i.a((h.f.a.a) new a(this));

    /* renamed from: d  reason: collision with root package name */
    private final h.f.a.a<EditPreviewProgressViewModel> f146333d = C3913b.f146335a;

    /* renamed from: e  reason: collision with root package name */
    private final f f146334e;

    static {
        Covode.recordClassIndex(96197);
    }

    private final com.ss.android.ugc.gamora.editor.progressbar.a.a a() {
        return (com.ss.android.ugc.gamora.editor.progressbar.a.a) this.f146332c.getValue();
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<EditPreviewProgressViewModel> b() {
        return this.f146333d;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f146330a;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f146334e;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.b$b  reason: collision with other inner class name */
    static final class C3913b extends m implements h.f.a.a<EditPreviewProgressViewModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3913b f146335a = new C3913b();

        static {
            Covode.recordClassIndex(96199);
        }

        C3913b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditPreviewProgressViewModel invoke() {
            return new EditPreviewProgressViewModel();
        }
    }

    static final class a extends m implements h.f.a.a<com.ss.android.ugc.gamora.editor.progressbar.a.a> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(96198);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.progressbar.a.a invoke() {
            com.ss.android.ugc.gamora.editor.progressbar.a.a aVar = new com.ss.android.ugc.gamora.editor.progressbar.a.a(this.this$0.getDiContainer());
            this.this$0.f146330a.a(this.this$0.f146331b, aVar, "EditProgressbarScene");
            return aVar;
        }
    }

    @Override // com.bytedance.als.j
    public final void onResume() {
        super.onResume();
        if (!this.f146330a.f(a())) {
            this.f146330a.a(this.f146331b, a(), "EditProgressbarScene");
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void d() {
        com.ss.android.ugc.gamora.editor.progressbar.a.a a2 = a();
        View view = a2.x;
        if (view == null) {
            l.a("rootView");
        }
        view.setVisibility(8);
        TextView textView = a2.G;
        if (textView == null) {
            l.a("longPressTips");
        }
        textView.setVisibility(8);
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = a2.a().d().f156778e;
        if (vEEditorAutoStartStopArbiter != null) {
            vEEditorAutoStartStopArbiter.f156723c = false;
        }
        a2.f146314i = true;
        a2.f146317l = true;
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        x.j f2;
        com.ss.android.ugc.gamora.editor.progressbar.a.a a2 = a();
        View view = a2.x;
        if (view == null) {
            l.a("rootView");
        }
        view.setVisibility(0);
        TextView textView = a2.G;
        if (textView == null) {
            l.a("longPressTips");
        }
        textView.setVisibility(8);
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = a2.a().d().f156778e;
        if (vEEditorAutoStartStopArbiter != null) {
            vEEditorAutoStartStopArbiter.f156723c = true;
        }
        g d2 = a2.d();
        if (!(d2 == null || (f2 = d2.f()) == null || f2 == x.j.PAUSED || a2.f146310e || !a2.f146314i)) {
            a2.C();
        }
        a2.f146317l = false;
        a2.f146314i = false;
    }

    public b(f fVar, com.bytedance.scene.group.b bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f146334e = fVar;
        this.f146330a = bVar;
    }
}
