package com.ss.android.ugc.gamora.editor.lightening.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;

public final class b extends com.bytedance.ui_component.b<EditToolbarViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    private final h.f.a.a<EditToolbarViewModel> f146167a = a.f146171a;

    /* renamed from: b  reason: collision with root package name */
    private final f f146168b;

    /* renamed from: c  reason: collision with root package name */
    private final com.bytedance.scene.group.b f146169c;

    /* renamed from: d  reason: collision with root package name */
    private final int f146170d = R.id.ath;

    static {
        Covode.recordClassIndex(96058);
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<EditToolbarViewModel> b() {
        return this.f146167a;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f146169c;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f146168b;
    }

    static final class a extends m implements h.f.a.a<EditToolbarViewModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f146171a = new a();

        static {
            Covode.recordClassIndex(96059);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditToolbarViewModel invoke() {
            return new EditToolbarViewModel();
        }
    }

    @Override // com.bytedance.ui_component.b, com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        this.f146169c.a(this.f146170d, new a(getDiContainer()), "EditTitleBarScene");
    }

    public b(f fVar, com.bytedance.scene.group.b bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f146168b = fVar;
        this.f146169c = bVar;
    }
}
