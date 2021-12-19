package com.ss.android.ugc.aweme.ftc.components.toolbar;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.bytedance.ui_component.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;

public final class r extends b<FTCEditToolbarViewModel> {

    /* renamed from: a  reason: collision with root package name */
    private final h.f.a.a<FTCEditToolbarViewModel> f98291a = a.f98296a;

    /* renamed from: b  reason: collision with root package name */
    private final f f98292b;

    /* renamed from: c  reason: collision with root package name */
    private final com.bytedance.scene.group.b f98293c;

    /* renamed from: d  reason: collision with root package name */
    private final int f98294d = R.id.ath;

    /* renamed from: e  reason: collision with root package name */
    private final int f98295e = R.id.v9;

    static {
        Covode.recordClassIndex(62510);
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<FTCEditToolbarViewModel> b() {
        return this.f98291a;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f98293c;
    }

    static final class a extends m implements h.f.a.a<FTCEditToolbarViewModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f98296a = new a();

        static {
            Covode.recordClassIndex(62511);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FTCEditToolbarViewModel invoke() {
            return new FTCEditToolbarViewModel();
        }
    }

    @Override // com.bytedance.ui_component.b, com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        com.bytedance.scene.group.b bVar = this.f98293c;
        bVar.a(this.f98294d, new d(this.f98292b), "FTCEditTitleBarScene");
        bVar.a(this.f98295e, new a(this.f98292b), "FTCEditBottomBarScene");
    }

    public r(f fVar, com.bytedance.scene.group.b bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f98292b = fVar;
        this.f98293c = bVar;
    }
}
