package com.ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.a.b;
import com.ss.android.ugc.aweme.choosemusic.b.c;
import com.ss.android.ugc.aweme.choosemusic.d.a;
import com.ss.android.ugc.aweme.choosemusic.viewholder.s;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.music.b.k;
import com.ss.android.ugc.aweme.music.ui.be;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.HashMap;
import java.util.List;

public final class u extends m<MusicModel> {

    /* renamed from: m  reason: collision with root package name */
    boolean f70870m;
    boolean n;
    public long o;
    public String p;
    private boolean q;

    static {
        Covode.recordClassIndex(43659);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.view.m
    public final f d() {
        b bVar;
        if (this.f70851l) {
            bVar = new b(this.f70847h, v.f70872a);
        } else {
            bVar = new b((k<c>) this.f70847h, false);
        }
        bVar.f70285f = this.f70870m;
        bVar.f70286g = this.n;
        bVar.f70288i = this.f70848i;
        return bVar;
    }

    public final void a(int i2) {
        this.f70840a.setTitle(i2);
    }

    public final void a(com.ss.android.ugc.aweme.choosemusic.b bVar) {
        if (this.f70845f instanceof b) {
            ((b) this.f70845f).f70284e = bVar;
        }
    }

    public final void a(com.ss.android.ugc.aweme.choosemusic.d.b bVar) {
        if (this.f70845f instanceof b) {
            ((b) this.f70845f).f70280a = bVar;
        }
    }

    public final void b(boolean z) {
        this.n = z;
        if (this.f70845f instanceof b) {
            ((b) this.f70845f).f70286g = this.n;
        }
    }

    private void a(List<MusicModel> list) {
        if (!this.q) {
            this.q = true;
            if (!(TextUtils.isEmpty(this.p) || list == null)) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    MusicModel musicModel = list.get(i2);
                    if (musicModel != null && this.p.equals(musicModel.getMusicId()) && (this.f70845f instanceof b)) {
                        this.f70841b.post(new w(this, i2, musicModel));
                        return;
                    }
                }
            }
        }
    }

    public final void a(boolean z) {
        this.f70870m = z;
        if (this.f70845f instanceof b) {
            ((b) this.f70845f).f70285f = this.f70870m;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i2, MusicModel musicModel) {
        AnonymousClass1 r1 = new r(this.f70844e) {
            /* class com.ss.android.ugc.aweme.choosemusic.view.u.AnonymousClass1 */

            static {
                Covode.recordClassIndex(43660);
            }

            @Override // androidx.recyclerview.widget.r
            public final int c() {
                return -1;
            }
        };
        r1.f3862g = i2;
        RecyclerView.i layoutManager = this.f70841b.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.a(r1);
        }
        this.f70841b.post(new x(this, i2, musicModel));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(int i2, MusicModel musicModel) {
        RecyclerView.ViewHolder f2 = this.f70841b.f(i2);
        if (f2 instanceof s) {
            ((b) this.f70845f).a((s) f2, musicModel);
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.view.m, com.ss.android.ugc.aweme.arch.c
    public final void a(List<MusicModel> list, boolean z) {
        super.a(list, z);
        if (list != null && this.o > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("tab_name", "local_song");
            hashMap.put("show_duration", String.valueOf(System.currentTimeMillis() - this.o));
            com.ss.android.ugc.aweme.common.r.a("local_music_show_duration", be.a(hashMap));
        }
        a(list);
    }

    public u(Context context, View view, a aVar, h.a aVar2, int i2) {
        super(context, view, aVar, aVar2, i2);
    }

    public u(Context context, View view, a aVar, h.a aVar2, k<c> kVar, int i2) {
        super(context, view, aVar, aVar2, kVar, i2);
    }

    public u(Context context, View view, a aVar, int i2, h.a aVar2, k<c> kVar, int i3) {
        super(context, view, aVar, i2, aVar2, kVar, i3);
    }
}
