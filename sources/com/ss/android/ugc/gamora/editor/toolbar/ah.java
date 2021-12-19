package com.ss.android.ugc.gamora.editor.toolbar;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.bytedance.ui_component.b;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bp;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import java.lang.reflect.Type;

public final class ah extends b<EditToolbarViewModel> {

    /* renamed from: a  reason: collision with root package name */
    private final h.f.a.a<EditToolbarViewModel> f147061a = a.f147066a;

    /* renamed from: b  reason: collision with root package name */
    private final f f147062b;

    /* renamed from: c  reason: collision with root package name */
    private final com.bytedance.scene.group.b f147063c;

    /* renamed from: d  reason: collision with root package name */
    private final int f147064d = R.id.ath;

    /* renamed from: e  reason: collision with root package name */
    private final int f147065e = R.id.v9;

    static {
        Covode.recordClassIndex(96864);
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<EditToolbarViewModel> b() {
        return this.f147061a;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f147063c;
    }

    static final class a extends m implements h.f.a.a<EditToolbarViewModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f147066a = new a();

        static {
            Covode.recordClassIndex(96865);
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
        com.bytedance.scene.group.b bVar = this.f147063c;
        Object a2 = this.f147062b.a((Type) VideoPublishEditModel.class, (String) null);
        l.b(a2, "");
        if (bp.j((VideoPublishEditModel) a2)) {
            com.bytedance.scene.ktx.a.a(bVar, this.f147064d, new g(this.f147062b), "EditTitleBarScene");
            com.bytedance.scene.ktx.a.a(bVar, this.f147065e, new c(this.f147062b), "EditBottomBarScene");
            return;
        }
        bVar.a(this.f147064d, new g(this.f147062b), "EditTitleBarScene");
        bVar.a(this.f147065e, new c(this.f147062b), "EditBottomBarScene");
    }

    public ah(f fVar, com.bytedance.scene.group.b bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f147062b = fVar;
        this.f147063c = bVar;
    }
}
