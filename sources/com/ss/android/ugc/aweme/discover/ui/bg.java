package com.ss.android.ugc.aweme.discover.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.adapter.a.a;
import com.ss.android.ugc.aweme.discover.adapter.a.b;
import com.ss.android.ugc.aweme.discover.adapter.ah;
import com.ss.android.ugc.aweme.discover.adapter.i;
import com.ss.android.ugc.aweme.discover.mixfeed.g;
import com.ss.android.ugc.aweme.discover.ui.ba;
import com.ss.android.ugc.aweme.discover.ui.be;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.search.k.d;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.search.l.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.LinkedList;
import java.util.List;

public final class bg extends be<Music> implements i, ba.a<Music> {

    /* renamed from: i  reason: collision with root package name */
    public int f82434i;

    /* renamed from: j  reason: collision with root package name */
    private List<b> f82435j = new LinkedList();

    static {
        Covode.recordClassIndex(51305);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.ui.be
    public final void b() {
        super.b();
        this.f82425c.setText(R.string.dcu);
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.ba.a
    public final RecyclerView.ViewHolder a() {
        ViewGroup viewGroup = (ViewGroup) this.f82424b;
        l.d(viewGroup, "");
        l.d(this, "");
        return ah.a.a(viewGroup, this);
    }

    @Override // com.ss.android.ugc.aweme.discover.adapter.i
    public final int a(Music music) {
        return this.f82434i;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.ba.a
    public final void a(RecyclerView.ViewHolder viewHolder, ao<Music> aoVar) {
        a aVar = (a) viewHolder;
        aVar.b("general_search");
        aVar.a(aoVar.f82308a, aoVar.f82309b.f121271f);
        aVar.a(this.f82428f);
        this.f82435j.add(aVar);
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.be
    public final void a(final List<Music> list, final r rVar, boolean z) {
        super.a(list, rVar, z);
        this.f82435j.clear();
        Music music = list.get(0);
        if (music == null || music.getSoundsListType() != 2) {
            this.f82425c.setText(R.string.dcu);
        } else {
            this.f82425c.setText(R.string.hg);
        }
        j.a(this.f82424b, new Runnable() {
            /* class com.ss.android.ugc.aweme.discover.ui.bg.AnonymousClass1 */

            static {
                Covode.recordClassIndex(51306);
            }

            public final void run() {
                g gVar;
                Music music = (Music) list.get(0);
                r rVar = rVar;
                if (music != null && rVar != null && (gVar = (g) music.getExtraParamFromPretreatment().get(g.class)) != null) {
                    if (music.getSoundsListType() == 1 || music.getSoundsListType() == 2) {
                        ((d) com.ss.android.ugc.aweme.discover.mixfeed.b.b.a(rVar).g(gVar.f81773a)).x(gVar.f81774b).f();
                    }
                }
            }
        });
        b(list, rVar, z);
    }

    public bg(View view, Context context, boolean z, be.a aVar) {
        super(view, context, aVar);
        a(new ba(this));
    }
}
