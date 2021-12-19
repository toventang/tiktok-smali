package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import android.content.Intent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.cut.ac;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.e;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.h;
import com.ss.android.ugc.tools.utils.k;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class bl implements bv {

    /* renamed from: a  reason: collision with root package name */
    public h f125730a;

    /* renamed from: b  reason: collision with root package name */
    private e f125731b;

    static {
        Covode.recordClassIndex(82574);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.bv
    public final void c() {
        e eVar = this.f125731b;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.bv
    public final ArrayList<String> a() {
        e eVar = this.f125731b;
        if (eVar != null) {
            return eVar.a();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.bv
    public final long b() {
        e eVar = this.f125731b;
        if (eVar != null) {
            return eVar.b();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.bv
    public final void a(h hVar) {
        this.f125730a = hVar;
    }

    public static final class a implements h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bl f125732a;

        static {
            Covode.recordClassIndex(82575);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(bl blVar) {
            this.f125732a = blVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.h
        public final void a(View view) {
            h hVar = this.f125732a.f125730a;
            if (hVar != null) {
                hVar.a(view);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.h
        public final void b(View view) {
            h hVar = this.f125732a.f125730a;
            if (hVar != null) {
                hVar.b(view);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.h
        public final void c(View view) {
            h hVar = this.f125732a.f125730a;
            if (hVar != null) {
                hVar.c(view);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.h
        public final void a(List<? extends MediaModel> list) {
            h hVar = this.f125732a.f125730a;
            if (hVar != null) {
                hVar.a(list);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.bv
    public final void a(List<? extends VideoSegment> list) {
        e eVar = this.f125731b;
        if (eVar != null) {
            eVar.b((List<VideoSegment>) list);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.bv
    public final void a(e eVar) {
        this.f125731b = eVar;
        if (eVar != null) {
            eVar.f125877i = new a(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.bv
    public final void a(boolean z) {
        e eVar = this.f125731b;
        if (eVar != null) {
            eVar.a(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.bv
    public final void b(boolean z) {
        ArrayList<ac> arrayList;
        e eVar = this.f125731b;
        if (eVar == null || k.a(eVar.c())) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            e eVar2 = this.f125731b;
            if (eVar2 == null) {
                l.b();
            }
            for (ac acVar : eVar2.c()) {
                if (!acVar.f125450b.f125485i) {
                    arrayList.add(acVar);
                }
            }
        }
        if (!k.a(arrayList)) {
            if (arrayList == null) {
                l.b();
            }
            for (ac acVar2 : arrayList) {
                VideoSegment videoSegment = acVar2.f125450b;
                l.b(videoSegment, "");
                videoSegment.o = z;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.bv
    public final void a(int i2, int i3, Intent intent) {
        if (i2 == 1001) {
            if (i3 != -1 || intent == null) {
                h hVar = this.f125730a;
                if (hVar != null) {
                    hVar.a((List<? extends MediaModel>) null);
                    return;
                }
                return;
            }
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
            h hVar2 = this.f125730a;
            if (hVar2 != null) {
                hVar2.a(parcelableArrayListExtra);
            }
        }
    }
}
