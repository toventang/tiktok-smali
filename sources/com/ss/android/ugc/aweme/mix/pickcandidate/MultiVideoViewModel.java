package com.ss.android.ugc.aweme.mix.pickcandidate;

import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.f;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.ss.android.ugc.aweme.mix.api.response.c;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import f.a.d.f;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import h.q;
import java.util.ArrayList;
import java.util.List;

public final class MultiVideoViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public List<Aweme> f110195a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public List<a> f110196b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public List<Aweme> f110197c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public t<Integer> f110198d = new t<>();

    /* renamed from: e  reason: collision with root package name */
    public t<Integer> f110199e = new t<>();

    /* renamed from: f  reason: collision with root package name */
    public boolean f110200f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f110201g = true;

    /* renamed from: h  reason: collision with root package name */
    public boolean f110202h;

    /* renamed from: i  reason: collision with root package name */
    public t<Integer> f110203i = new t<>();

    /* renamed from: j  reason: collision with root package name */
    public List<String> f110204j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public String f110205k = "";

    /* renamed from: l  reason: collision with root package name */
    private final h f110206l = i.a((h.f.a.a) new b(this));

    static {
        Covode.recordClassIndex(70735);
    }

    public final com.bytedance.ies.powerlist.page.config.b<c> a() {
        return (com.bytedance.ies.powerlist.page.config.b) this.f110206l.getValue();
    }

    public enum a {
        SUCCESS(0),
        EMPTY(1),
        ERROR(2);
        
        private int status;

        public final int getStatus() {
            return this.status;
        }

        static {
            Covode.recordClassIndex(70736);
        }

        public final void setStatus(int i2) {
            this.status = i2;
        }

        private a(int i2) {
            this.status = i2;
        }
    }

    static final class b extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ MultiVideoViewModel this$0;

        static {
            Covode.recordClassIndex(70737);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(MultiVideoViewModel multiVideoViewModel) {
            super(0);
            this.this$0 = multiVideoViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            com.bytedance.ies.powerlist.page.config.c cVar = new com.bytedance.ies.powerlist.page.config.c();
            cVar.f34357b = false;
            cVar.f34358c = LoadingFooterCell.class;
            return new com.bytedance.ies.powerlist.page.config.b<c>(this, cVar) {
                /* class com.ss.android.ugc.aweme.mix.pickcandidate.MultiVideoViewModel.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f110208a;

                static {
                    Covode.recordClassIndex(70738);
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.MultiVideoViewModel$b$1$b  reason: collision with other inner class name */
                static final class C2820b<T> implements f {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ h.c.d f110211a;

                    static {
                        Covode.recordClassIndex(70740);
                    }

                    C2820b(h.c.d dVar) {
                        this.f110211a = dVar;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        this.f110211a.resumeWith(q.m223constructorimpl(f.a.a(new Exception(((Throwable) obj).getMessage()))));
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.MultiVideoViewModel$b$1$d */
                static final class d<T> implements f.a.d.f {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f110214a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ h.c.d f110215b;

                    static {
                        Covode.recordClassIndex(70742);
                    }

                    d(AnonymousClass1 r1, h.c.d dVar) {
                        this.f110214a = r1;
                        this.f110215b = dVar;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        this.f110215b.resumeWith(q.m223constructorimpl(f.a.a(new Exception(((Throwable) obj).getMessage()))));
                        this.f110214a.f110208a.this$0.f110199e.postValue(Integer.valueOf(a.ERROR.getStatus()));
                    }
                }

                @Override // com.bytedance.ies.powerlist.page.config.d
                public final void a(h.c.d<? super com.bytedance.ies.powerlist.page.f<com.ss.android.ugc.aweme.mix.api.response.c>> dVar) {
                    l.d(dVar, "");
                    l.b(MixFeedApi.a.a().getMixCandidateFeeds(0).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c(this, dVar), new d(this, dVar)), "");
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.MultiVideoViewModel$b$1$a */
                static final class a<T> implements f.a.d.f {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f110209a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ h.c.d f110210b;

                    static {
                        Covode.recordClassIndex(70739);
                    }

                    a(AnonymousClass1 r1, h.c.d dVar) {
                        this.f110209a = r1;
                        this.f110210b = dVar;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        com.ss.android.ugc.aweme.mix.api.response.c cVar = (com.ss.android.ugc.aweme.mix.api.response.c) obj;
                        List<Aweme> mixVideos = cVar.getMixVideos();
                        if (mixVideos != null) {
                            for (Aweme aweme : mixVideos) {
                                this.f110209a.f110208a.this$0.f110195a.add(aweme);
                            }
                        }
                        this.f110209a.f110208a.this$0.f110196b.addAll(this.f110209a.f110208a.this$0.a(cVar.getMixVideos()));
                        this.f110209a.f110208a.this$0.f110200f = cVar.getHasMore();
                        if (cVar.getHasMore()) {
                            this.f110210b.resumeWith(q.m223constructorimpl(f.a.a(null, cVar, this.f110209a.f110208a.this$0.a(cVar.getMixVideos()))));
                        } else {
                            this.f110210b.resumeWith(q.m223constructorimpl(f.a.a(this.f110209a.f110208a.this$0.a(cVar.getMixVideos()))));
                        }
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.MultiVideoViewModel$b$1$c */
                static final class c<T> implements f.a.d.f {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f110212a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ h.c.d f110213b;

                    static {
                        Covode.recordClassIndex(70741);
                    }

                    c(AnonymousClass1 r1, h.c.d dVar) {
                        this.f110212a = r1;
                        this.f110213b = dVar;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        com.ss.android.ugc.aweme.mix.api.response.c cVar = (com.ss.android.ugc.aweme.mix.api.response.c) obj;
                        List<Aweme> mixVideos = cVar.getMixVideos();
                        if (mixVideos != null) {
                            for (Aweme aweme : mixVideos) {
                                this.f110212a.f110208a.this$0.f110195a.add(aweme);
                            }
                        }
                        List<a> a2 = this.f110212a.f110208a.this$0.a(cVar.getMixVideos());
                        this.f110212a.f110208a.this$0.f110196b.addAll(a2);
                        this.f110212a.f110208a.this$0.f110200f = cVar.getHasMore();
                        if (cVar.getHasMore()) {
                            this.f110212a.f110208a.this$0.f110199e.postValue(Integer.valueOf(a.SUCCESS.getStatus()));
                            this.f110213b.resumeWith(q.m223constructorimpl(f.a.a(null, cVar, a2)));
                            return;
                        }
                        if (cVar.getMixVideos() != null) {
                            List<Aweme> mixVideos2 = cVar.getMixVideos();
                            if (mixVideos2 == null) {
                                l.b();
                            }
                            if (!mixVideos2.isEmpty()) {
                                this.f110212a.f110208a.this$0.f110199e.postValue(Integer.valueOf(a.SUCCESS.getStatus()));
                                this.f110213b.resumeWith(q.m223constructorimpl(f.a.a(a2)));
                            }
                        }
                        this.f110212a.f110208a.this$0.f110199e.postValue(Integer.valueOf(a.EMPTY.getStatus()));
                        this.f110213b.resumeWith(q.m223constructorimpl(f.a.a(a2)));
                    }
                }

                {
                    this.f110208a = r1;
                }

                @Override // com.bytedance.ies.powerlist.page.config.d
                public final /* synthetic */ void b(h.c.d dVar, Object obj) {
                    com.ss.android.ugc.aweme.mix.api.response.c cVar = (com.ss.android.ugc.aweme.mix.api.response.c) obj;
                    l.d(dVar, "");
                    l.d(cVar, "");
                    if (this.f110208a.this$0.f110201g && cVar.getHasMore()) {
                        l.b(MixFeedApi.a.a().getMixCandidateFeeds(cVar.getMaxCursor()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new a(this, dVar), new C2820b(dVar)), "");
                    }
                }
            };
        }
    }

    public final void b() {
        a().f34367c.e();
    }

    private void a(int i2) {
        this.f110198d.postValue(Integer.valueOf(i2));
    }

    private void b(int i2) {
        this.f110203i.postValue(Integer.valueOf(i2));
    }

    public final void a(Aweme aweme) {
        if (aweme != null) {
            this.f110197c.add(aweme);
            a(this.f110197c.size());
            if (this.f110203i.getValue() != null) {
                Integer value = this.f110203i.getValue();
                if (value == null) {
                    l.b();
                }
                b(value.intValue() + 1);
            }
        }
    }

    public final void b(Aweme aweme) {
        if (aweme != null) {
            this.f110197c.remove(aweme);
            a(this.f110197c.size());
            if (this.f110203i.getValue() != null) {
                Integer value = this.f110203i.getValue();
                if (value == null) {
                    l.b();
                }
                b(value.intValue() - 1);
            }
        }
    }

    public final List<a> a(List<? extends Aweme> list) {
        UrlModel urlModel;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Aweme aweme : list) {
                a aVar = new a();
                Video video = aweme.getVideo();
                if (video != null) {
                    urlModel = video.getCover();
                } else {
                    urlModel = null;
                }
                aVar.f110216a = urlModel;
                aVar.f110218c = aweme.playlistBlocked;
                aVar.f110222g = aweme.playlistBlocked;
                PlayListInfo playListInfo = aweme.playlist_info;
                if (playListInfo != null) {
                    if (p.a(playListInfo.getMixId(), this.f110205k, false)) {
                        aVar.f110221f = true;
                        aVar.f110217b = true;
                    } else {
                        aVar.f110219d = true;
                        aVar.f110218c = true;
                    }
                }
                aVar.f110220e = aweme;
                for (Aweme aweme2 : this.f110197c) {
                    if (l.a(aweme, aweme2)) {
                        aVar.f110217b = true;
                        aVar.f110221f = true;
                    }
                }
                for (String str : this.f110204j) {
                    if (l.a((Object) aweme.getAid(), (Object) str)) {
                        aVar.f110219d = false;
                        aVar.f110218c = false;
                        aVar.f110221f = false;
                        aVar.f110217b = false;
                    }
                }
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }
}
