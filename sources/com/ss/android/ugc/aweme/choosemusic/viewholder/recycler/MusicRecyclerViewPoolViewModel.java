package com.ss.android.ugc.aweme.choosemusic.viewholder.recycler;

import android.content.Context;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.h;
import h.i;

public final class MusicRecyclerViewPoolViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public static final a f70962a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f70963b = i.a((h.f.a.a) b.f70964a);

    static {
        Covode.recordClassIndex(43695);
    }

    public final RecyclerView.RecycledViewPool a() {
        return (RecyclerView.RecycledViewPool) this.f70963b.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(43696);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static RecyclerView.RecycledViewPool a(Context context) {
            if (context instanceof e) {
                return ((MusicRecyclerViewPoolViewModel) ae.a((e) context, (ad.b) null).a(MusicRecyclerViewPoolViewModel.class)).a();
            }
            return null;
        }
    }

    static final class b extends m implements h.f.a.a<RecyclerView.RecycledViewPool> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f70964a = new b();

        static {
            Covode.recordClassIndex(43697);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RecyclerView.RecycledViewPool invoke() {
            RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
            recycledViewPool.setMaxRecycledViews(0, 18);
            return recycledViewPool;
        }
    }
}
