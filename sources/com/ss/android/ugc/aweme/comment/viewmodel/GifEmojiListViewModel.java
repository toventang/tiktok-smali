package com.ss.android.ugc.aweme.comment.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.o;
import com.ss.android.ugc.aweme.comment.model.GifEmoji;
import f.a.t;
import h.a.z;
import h.f.b.l;
import h.i;
import h.m;
import h.p;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class GifEmojiListViewModel extends JediViewModel<GifEmojiListState> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f72911e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.comment.k.c f72912a = new com.ss.android.ugc.aweme.comment.k.c();

    /* renamed from: b  reason: collision with root package name */
    final h.h f72913b = i.a(m.NONE, b.f72916a);

    /* renamed from: c  reason: collision with root package name */
    public f.a.b.b f72914c;

    /* renamed from: d  reason: collision with root package name */
    public final ListMiddleware<GifEmojiListState, GifEmoji, o> f72915d = new ListMiddleware<>(new c(this), new d(this), null, null, 12);

    static {
        Covode.recordClassIndex(44909);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44910);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bg_() {
        super.bg_();
        ListMiddleware<GifEmojiListState, GifEmoji, o> listMiddleware = this.f72915d;
        listMiddleware.a(b.f72969a, e.f72919a);
        a(listMiddleware);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ GifEmojiListState d() {
        return new GifEmojiListState(null, null, null, 7, null);
    }

    static final class b extends h.f.b.m implements h.f.a.a<t<Long>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f72916a = new b();

        static {
            Covode.recordClassIndex(44911);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Long> invoke() {
            return t.b(200, TimeUnit.MILLISECONDS).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.h.a.b(f.a.k.a.f158006c));
        }
    }

    public final void a() {
        f.a.b.b bVar = this.f72914c;
        if (bVar != null && !bVar.isDisposed()) {
            bVar.dispose();
        }
        c(h.f72921a);
    }

    public static final class f extends h.f.b.m implements h.f.a.b<GifEmojiListState, GifEmojiListState> {
        final /* synthetic */ String $awemeId;

        static {
            Covode.recordClassIndex(44917);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(1);
            this.$awemeId = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ GifEmojiListState invoke(GifEmojiListState gifEmojiListState) {
            GifEmojiListState gifEmojiListState2 = gifEmojiListState;
            l.d(gifEmojiListState2, "");
            return GifEmojiListState.copy$default(gifEmojiListState2, null, this.$awemeId, null, 5, null);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<GifEmojiListState, t<p<? extends List<? extends GifEmoji>, ? extends o>>> {
        final /* synthetic */ GifEmojiListViewModel this$0;

        static {
            Covode.recordClassIndex(44912);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(GifEmojiListViewModel gifEmojiListViewModel) {
            super(1);
            this.this$0 = gifEmojiListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ t<p<? extends List<? extends GifEmoji>, ? extends o>> invoke(GifEmojiListState gifEmojiListState) {
            GifEmojiListState gifEmojiListState2 = gifEmojiListState;
            l.d(gifEmojiListState2, "");
            t<R> d2 = this.this$0.f72912a.a(gifEmojiListState2.getKeyword(), 0, gifEmojiListState2.getAwemeId()).d(AnonymousClass1.f72917a);
            l.b(d2, "");
            return d2;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<GifEmojiListState, t<p<? extends List<? extends GifEmoji>, ? extends o>>> {
        final /* synthetic */ GifEmojiListViewModel this$0;

        static {
            Covode.recordClassIndex(44914);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(GifEmojiListViewModel gifEmojiListViewModel) {
            super(1);
            this.this$0 = gifEmojiListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ t<p<? extends List<? extends GifEmoji>, ? extends o>> invoke(GifEmojiListState gifEmojiListState) {
            GifEmojiListState gifEmojiListState2 = gifEmojiListState;
            l.d(gifEmojiListState2, "");
            t<R> d2 = this.this$0.f72912a.a(gifEmojiListState2.getKeyword(), gifEmojiListState2.getListState().getPayload().f39460b, gifEmojiListState2.getAwemeId()).d(AnonymousClass1.f72918a);
            l.b(d2, "");
            return d2;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<GifEmojiListState, GifEmojiListState> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f72921a = new h();

        static {
            Covode.recordClassIndex(44921);
        }

        h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ GifEmojiListState invoke(GifEmojiListState gifEmojiListState) {
            GifEmojiListState gifEmojiListState2 = gifEmojiListState;
            l.d(gifEmojiListState2, "");
            return GifEmojiListState.copy$default(gifEmojiListState2, null, null, ListState.copy$default(gifEmojiListState2.getListState(), null, z.INSTANCE, null, null, new com.bytedance.jedi.arch.ext.list.b(true), 13, null), 3, null);
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.b<GifEmojiListState, h.z> {
        final /* synthetic */ CharSequence $keyword;
        final /* synthetic */ GifEmojiListViewModel this$0;

        static {
            Covode.recordClassIndex(44918);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(GifEmojiListViewModel gifEmojiListViewModel, CharSequence charSequence) {
            super(1);
            this.this$0 = gifEmojiListViewModel;
            this.$keyword = charSequence;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(GifEmojiListState gifEmojiListState) {
            GifEmojiListState gifEmojiListState2 = gifEmojiListState;
            l.d(gifEmojiListState2, "");
            if (!l.a((Object) this.$keyword, (Object) gifEmojiListState2.getKeyword())) {
                this.this$0.c(new h.f.a.b<GifEmojiListState, GifEmojiListState>(this) {
                    /* class com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel.g.AnonymousClass1 */
                    final /* synthetic */ g this$0;

                    static {
                        Covode.recordClassIndex(44919);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ GifEmojiListState invoke(GifEmojiListState gifEmojiListState) {
                        GifEmojiListState gifEmojiListState2 = gifEmojiListState;
                        l.d(gifEmojiListState2, "");
                        return GifEmojiListState.copy$default(gifEmojiListState2, String.valueOf(this.this$0.$keyword), null, null, 6, null);
                    }
                });
                f.a.b.b bVar = this.this$0.f72914c;
                if (bVar != null && !bVar.isDisposed()) {
                    bVar.dispose();
                }
                GifEmojiListViewModel gifEmojiListViewModel = this.this$0;
                gifEmojiListViewModel.f72914c = ((t) gifEmojiListViewModel.f72913b.getValue()).d(new f.a.d.f(this) {
                    /* class com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel.g.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ g f72920a;

                    static {
                        Covode.recordClassIndex(44920);
                    }

                    {
                        this.f72920a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        this.f72920a.this$0.f72915d.refresh();
                    }
                });
            }
            return h.z.f158842a;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.m<GifEmojiListState, ListState<GifEmoji, o>, GifEmojiListState> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f72919a = new e();

        static {
            Covode.recordClassIndex(44916);
        }

        e() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ GifEmojiListState invoke(GifEmojiListState gifEmojiListState, ListState<GifEmoji, o> listState) {
            GifEmojiListState gifEmojiListState2 = gifEmojiListState;
            ListState<GifEmoji, o> listState2 = listState;
            l.d(gifEmojiListState2, "");
            l.d(listState2, "");
            return GifEmojiListState.copy$default(gifEmojiListState2, null, null, listState2, 3, null);
        }
    }
}
