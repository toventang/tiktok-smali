package com.ss.android.ugc.aweme.story.edit.business.shared.d;

import com.bytedance.als.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.a;
import com.bytedance.o.f;
import com.bytedance.scene.group.b;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.y;
import h.k.i;

public final class d extends j<c> implements a, c {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f137325a = {new y(d.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/story/edit/model/StoryEditModel;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public final c f137326b = this;

    /* renamed from: c  reason: collision with root package name */
    public e f137327c;

    /* renamed from: d  reason: collision with root package name */
    private final h.h.d f137328d = com.bytedance.o.b.a.a(getDiContainer(), StoryEditModel.class);

    /* renamed from: e  reason: collision with root package name */
    private final f f137329e;

    /* renamed from: f  reason: collision with root package name */
    private final b f137330f;

    /* renamed from: g  reason: collision with root package name */
    private final int f137331g = R.id.a7d;

    static {
        Covode.recordClassIndex(89817);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ c getApiComponent() {
        return this.f137326b;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f137329e;
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        if (((StoryEditModel) this.f137328d.a(this, f137325a[0])).getClips().size() > 1) {
            e eVar = new e(getDiContainer());
            this.f137327c = eVar;
            this.f137330f.a(this.f137331g, eVar, "StoryClipNavigateScene");
        }
    }

    @Override // com.ss.android.ugc.aweme.story.edit.business.shared.d.c
    public final void a(boolean z) {
        if (this.f137327c != null) {
            if (z) {
                b bVar = this.f137330f;
                e eVar = this.f137327c;
                if (eVar == null) {
                    l.a("scene");
                }
                if (!bVar.g(eVar)) {
                    b bVar2 = this.f137330f;
                    e eVar2 = this.f137327c;
                    if (eVar2 == null) {
                        l.a("scene");
                    }
                    bVar2.e(eVar2);
                    return;
                }
                return;
            }
            b bVar3 = this.f137330f;
            e eVar3 = this.f137327c;
            if (eVar3 == null) {
                l.a("scene");
            }
            if (bVar3.g(eVar3)) {
                b bVar4 = this.f137330f;
                e eVar4 = this.f137327c;
                if (eVar4 == null) {
                    l.a("scene");
                }
                bVar4.d(eVar4);
            }
        }
    }

    public d(f fVar, b bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f137329e = fVar;
        this.f137330f = bVar;
    }
}
