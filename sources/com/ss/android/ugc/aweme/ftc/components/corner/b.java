package com.ss.android.ugc.aweme.ftc.components.corner;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class b extends com.bytedance.ui_component.b<FTCEditCornerViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    public final int f97759a = R.id.asi;

    /* renamed from: b  reason: collision with root package name */
    private final h f97760b;

    /* renamed from: c  reason: collision with root package name */
    private final h.f.a.a<FTCEditCornerViewModel> f97761c;

    /* renamed from: d  reason: collision with root package name */
    private final f f97762d;

    /* renamed from: e  reason: collision with root package name */
    private final com.bytedance.scene.group.b f97763e;

    static {
        Covode.recordClassIndex(62118);
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<FTCEditCornerViewModel> b() {
        return this.f97761c;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f97763e;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f97762d;
    }

    static final class a extends m implements h.f.a.a<c> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f97764a = new a();

        static {
            Covode.recordClassIndex(62119);
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

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.corner.b$b  reason: collision with other inner class name */
    static final class C2359b extends m implements h.f.a.a<FTCEditCornerViewModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2359b f97765a = new C2359b();

        static {
            Covode.recordClassIndex(62120);
        }

        C2359b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FTCEditCornerViewModel invoke() {
            return new FTCEditCornerViewModel();
        }
    }

    public b(f fVar, com.bytedance.scene.group.b bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f97762d = fVar;
        this.f97763e = bVar;
        h a2 = i.a((h.f.a.a) a.f97764a);
        this.f97760b = a2;
        this.f97761c = C2359b.f97765a;
        bVar.a(R.id.asi, (c) a2.getValue(), "FTCEditCornerScene");
    }
}
