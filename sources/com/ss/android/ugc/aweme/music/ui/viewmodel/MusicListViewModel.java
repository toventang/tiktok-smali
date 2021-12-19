package com.ss.android.ugc.aweme.music.ui.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ext.list.CommonListViewModel;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.o;
import com.ss.android.ugc.aweme.music.ui.d.e;
import f.a.t;
import h.f.b.l;
import h.f.b.m;
import h.p;
import java.util.List;

public final class MusicListViewModel extends CommonListViewModel<Object, MusicListState> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f112064b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final e f112065a = new e();

    static {
        Covode.recordClassIndex(72021);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72022);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    public final h.f.a.b<MusicListState, t<p<List<Object>, o>>> a() {
        return new c(this);
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    public final h.f.a.b<MusicListState, t<p<List<Object>, o>>> b() {
        return new b(this);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new MusicListState(null, null, 3, null);
    }

    static final class b extends m implements h.f.a.b<MusicListState, t<p<? extends List<? extends Object>, ? extends o>>> {
        final /* synthetic */ MusicListViewModel this$0;

        static {
            Covode.recordClassIndex(72023);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(MusicListViewModel musicListViewModel) {
            super(1);
            this.this$0 = musicListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ t<p<? extends List<? extends Object>, ? extends o>> invoke(MusicListState musicListState) {
            MusicListState musicListState2 = musicListState;
            l.d(musicListState2, "");
            t d2 = e.a(this.this$0.f112065a, musicListState2.getMusicId(), (long) ((ListState) musicListState2.getSubstate()).getPayload().f39460b, 0, 4).d(AnonymousClass1.f112066a);
            l.b(d2, "");
            return d2;
        }
    }

    static final class c extends m implements h.f.a.b<MusicListState, t<p<? extends List<? extends Object>, ? extends o>>> {
        final /* synthetic */ MusicListViewModel this$0;

        static {
            Covode.recordClassIndex(72025);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(MusicListViewModel musicListViewModel) {
            super(1);
            this.this$0 = musicListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ t<p<? extends List<? extends Object>, ? extends o>> invoke(MusicListState musicListState) {
            int i2;
            MusicListState musicListState2 = musicListState;
            l.d(musicListState2, "");
            if (com.bytedance.ies.abmock.b.a().a(true, "music_detail_more_sounds", 0) < 0) {
                i2 = 3;
            } else {
                i2 = 20;
            }
            t d2 = e.a(this.this$0.f112065a, musicListState2.getMusicId(), 0, i2, 2).d(AnonymousClass1.f112067a);
            l.b(d2, "");
            return d2;
        }
    }
}
