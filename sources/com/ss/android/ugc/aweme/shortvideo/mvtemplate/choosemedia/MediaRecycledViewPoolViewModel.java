package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.h;
import h.i;

public final class MediaRecycledViewPoolViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public static final a f128823a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f128824b = i.a((h.f.a.a) b.f128825a);

    static {
        Covode.recordClassIndex(84548);
    }

    public final RecyclerView.RecycledViewPool a() {
        return (RecyclerView.RecycledViewPool) this.f128824b.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(84549);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static RecyclerView.RecycledViewPool a(e eVar) {
            if (eVar != null) {
                return ((MediaRecycledViewPoolViewModel) ae.a(eVar, (ad.b) null).a(MediaRecycledViewPoolViewModel.class)).a();
            }
            return null;
        }
    }

    static final class b extends m implements h.f.a.a<RecyclerView.RecycledViewPool> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f128825a = new b();

        static {
            Covode.recordClassIndex(84550);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RecyclerView.RecycledViewPool invoke() {
            RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
            recycledViewPool.setMaxRecycledViews(0, 30);
            return recycledViewPool;
        }
    }
}
