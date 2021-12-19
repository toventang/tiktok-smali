package com.ss.android.ugc.gamora.editor.toolbar;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.bytedance.ui_component.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;

public final class ab extends b<ReplaceMusicToolbarViewModel> {

    /* renamed from: a  reason: collision with root package name */
    private final h.f.a.a<ReplaceMusicToolbarViewModel> f147033a = a.f147038a;

    /* renamed from: b  reason: collision with root package name */
    private final f f147034b;

    /* renamed from: c  reason: collision with root package name */
    private final com.bytedance.scene.group.b f147035c;

    /* renamed from: d  reason: collision with root package name */
    private final int f147036d = R.id.ath;

    /* renamed from: e  reason: collision with root package name */
    private final int f147037e = R.id.v9;

    static {
        Covode.recordClassIndex(96844);
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<ReplaceMusicToolbarViewModel> b() {
        return this.f147033a;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f147035c;
    }

    static final class a extends m implements h.f.a.a<ReplaceMusicToolbarViewModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f147038a = new a();

        static {
            Covode.recordClassIndex(96845);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ReplaceMusicToolbarViewModel invoke() {
            return new ReplaceMusicToolbarViewModel();
        }
    }

    @Override // com.bytedance.ui_component.b, com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        this.f147035c.a(this.f147036d, new ac(this.f147034b), "ReplaceMusicToolbarScene");
    }

    public ab(f fVar, com.bytedance.scene.group.b bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f147034b = fVar;
        this.f147035c = bVar;
    }
}
