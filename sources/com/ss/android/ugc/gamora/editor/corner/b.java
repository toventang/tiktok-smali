package com.ss.android.ugc.gamora.editor.corner;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class b extends com.bytedance.ui_component.b<EditCornerViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    public final int f145740a = R.id.asi;

    /* renamed from: b  reason: collision with root package name */
    private final h f145741b;

    /* renamed from: c  reason: collision with root package name */
    private final h.f.a.a<EditCornerViewModel> f145742c;

    /* renamed from: d  reason: collision with root package name */
    private final f f145743d;

    /* renamed from: e  reason: collision with root package name */
    private final com.bytedance.scene.group.b f145744e;

    static {
        Covode.recordClassIndex(95738);
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<EditCornerViewModel> b() {
        return this.f145742c;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f145744e;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f145743d;
    }

    static final class a extends m implements h.f.a.a<c> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f145745a = new a();

        static {
            Covode.recordClassIndex(95739);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return new c();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.corner.b$b  reason: collision with other inner class name */
    static final class C3880b extends m implements h.f.a.a<EditCornerViewModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3880b f145746a = new C3880b();

        static {
            Covode.recordClassIndex(95740);
        }

        C3880b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditCornerViewModel invoke() {
            return new EditCornerViewModel();
        }
    }

    public b(f fVar, com.bytedance.scene.group.b bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f145743d = fVar;
        this.f145744e = bVar;
        h a2 = i.a((h.f.a.a) a.f145745a);
        this.f145741b = a2;
        this.f145742c = C3880b.f145746a;
        bVar.a(R.id.asi, (c) a2.getValue(), "EditCornerScene");
    }
}
