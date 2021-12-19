package com.ss.android.ugc.aweme.choosemusic.a;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.e.a;
import com.ss.android.ugc.aweme.choosemusic.viewholder.a.b;
import com.ss.android.ugc.aweme.discover.c.c;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class h extends c<MusicSearchHistory> implements a.AbstractC1593a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f70302a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private RecyclerView f70303b;

    static {
        Covode.recordClassIndex(43366);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(43367);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public h() {
        a(new b());
        a(new com.ss.android.ugc.aweme.choosemusic.viewholder.a.a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.f70303b = recyclerView;
        com.ss.android.ugc.aweme.choosemusic.e.c g2 = com.ss.android.ugc.aweme.choosemusic.e.c.g();
        if (g2.f70524c == null) {
            g2.f70524c = new ArrayList();
        }
        g2.f70524c.add(new WeakReference<>(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f70303b = null;
        com.ss.android.ugc.aweme.choosemusic.e.c g2 = com.ss.android.ugc.aweme.choosemusic.e.c.g();
        if (g2.f70524c != null) {
            Iterator<WeakReference<a.AbstractC1593a>> it = g2.f70524c.iterator();
            while (it.hasNext()) {
                WeakReference<a.AbstractC1593a> next = it.next();
                if (next != null && next.get() == this) {
                    it.remove();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.e.a.AbstractC1593a
    public final void a(List<MusicSearchHistory> list) {
        l.d(list, "");
        this.f80903j.clear();
        for (MusicSearchHistory musicSearchHistory : list) {
            this.f80903j.add(musicSearchHistory);
            if (this.f80903j.size() >= 10) {
                break;
            }
        }
        if (this.f80903j.size() == 0) {
            RecyclerView recyclerView = this.f70303b;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
        } else if (this.f80903j.size() >= 3) {
            this.f80903j.add(new MusicSearchHistory("", Integer.MAX_VALUE));
        }
        notifyDataSetChanged();
    }
}
