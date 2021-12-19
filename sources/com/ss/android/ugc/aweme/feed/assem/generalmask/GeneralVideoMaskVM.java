package com.ss.android.ugc.aweme.feed.assem.generalmask;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.i.ah;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.y;
import com.ss.android.ugc.aweme.video.v;
import h.c.b.a.k;
import h.f.b.l;
import h.f.b.m;
import h.r;
import h.z;
import kotlinx.coroutines.am;

public final class GeneralVideoMaskVM extends FeedBaseViewModel<e> {
    static {
        Covode.recordClassIndex(58245);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ j f() {
        return new e();
    }

    static final class a extends m implements h.f.a.b<e, e> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f92255a = new a();

        static {
            Covode.recordClassIndex(58246);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ e invoke(e eVar) {
            e eVar2 = eVar;
            l.d(eVar2, "");
            return e.a(new com.bytedance.assem.arch.extensions.g(false), eVar2.f92263b);
        }
    }

    static final class g extends m implements h.f.a.b<am, z> {
        final /* synthetic */ String $awemeId;

        static {
            Covode.recordClassIndex(58252);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(String str) {
            super(1);
            this.$awemeId = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(am amVar) {
            l.d(amVar, "");
            com.ss.android.ugc.d.a.c.a(new ah(true, this.$awemeId));
            return z.f158842a;
        }
    }

    static final class c extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        int label;
        final /* synthetic */ GeneralVideoMaskVM this$0;

        static {
            Covode.recordClassIndex(58248);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(GeneralVideoMaskVM generalVideoMaskVM, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = generalVideoMaskVM;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new c(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((c) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Aweme aweme;
            if (this.label == 0) {
                r.a(obj);
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("scenario", "general");
                VideoItemParams videoItemParams = (VideoItemParams) this.this$0.g();
                if (videoItemParams == null || (aweme = videoItemParams.mAweme) == null) {
                    str = null;
                } else {
                    str = aweme.getAid();
                }
                com.ss.android.ugc.aweme.common.r.a("tns_mask_layer_click_skip", a2.a("group_id", str).f66730a);
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class d extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        int label;
        final /* synthetic */ GeneralVideoMaskVM this$0;

        static {
            Covode.recordClassIndex(58249);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(GeneralVideoMaskVM generalVideoMaskVM, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = generalVideoMaskVM;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new d(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((d) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Aweme aweme;
            if (this.label == 0) {
                r.a(obj);
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("scenario", "general");
                VideoItemParams videoItemParams = (VideoItemParams) this.this$0.g();
                if (videoItemParams == null || (aweme = videoItemParams.mAweme) == null) {
                    str = null;
                } else {
                    str = aweme.getAid();
                }
                com.ss.android.ugc.aweme.common.r.a("tns_mask_layer_click_watch", a2.a("group_id", str).f66730a);
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class e extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        int label;
        final /* synthetic */ GeneralVideoMaskVM this$0;

        static {
            Covode.recordClassIndex(58250);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(GeneralVideoMaskVM generalVideoMaskVM, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = generalVideoMaskVM;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new e(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((e) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Aweme aweme;
            if (this.label == 0) {
                r.a(obj);
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("scenario", "general");
                VideoItemParams videoItemParams = (VideoItemParams) this.this$0.g();
                if (videoItemParams == null || (aweme = videoItemParams.mAweme) == null) {
                    str = null;
                } else {
                    str = aweme.getAid();
                }
                com.ss.android.ugc.aweme.common.r.a("tns_show_mask_layer", a2.a("group_id", str).f66730a);
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class b extends m implements h.f.a.b<e, e> {
        final /* synthetic */ GeneralVideoMaskVM this$0;

        static {
            Covode.recordClassIndex(58247);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(GeneralVideoMaskVM generalVideoMaskVM) {
            super(1);
            this.this$0 = generalVideoMaskVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ e invoke(e eVar) {
            Aweme aweme;
            Aweme aweme2;
            VideoMaskInfo videoMaskInfo;
            Aweme aweme3;
            Aweme aweme4;
            User author;
            e eVar2 = eVar;
            l.d(eVar2, "");
            VideoItemParams videoItemParams = (VideoItemParams) this.this$0.g();
            Aweme aweme5 = null;
            if (videoItemParams != null) {
                aweme = videoItemParams.mAweme;
            } else {
                aweme = null;
            }
            y.h(aweme);
            VideoItemParams videoItemParams2 = (VideoItemParams) this.this$0.g();
            if (!(videoItemParams2 == null || (aweme4 = videoItemParams2.mAweme) == null || (author = aweme4.getAuthor()) == null)) {
                author.getNickname();
            }
            VideoItemParams videoItemParams3 = (VideoItemParams) this.this$0.g();
            if (videoItemParams3 != null) {
                aweme2 = videoItemParams3.mAweme;
            } else {
                aweme2 = null;
            }
            l.a(new com.bytedance.assem.arch.extensions.g(y.h(aweme2)), eVar2.f92262a);
            VideoItemParams videoItemParams4 = (VideoItemParams) this.this$0.g();
            if (videoItemParams4 == null || (aweme3 = videoItemParams4.mAweme) == null) {
                videoMaskInfo = null;
            } else {
                videoMaskInfo = aweme3.getGeneralMaskInfo();
            }
            VideoItemParams videoItemParams5 = (VideoItemParams) this.this$0.g();
            if (videoItemParams5 != null) {
                aweme5 = videoItemParams5.mAweme;
            }
            return e.a(new com.bytedance.assem.arch.extensions.g(y.h(aweme5)), videoMaskInfo);
        }
    }

    static final class f extends m implements h.f.a.b<e, z> {
        final /* synthetic */ GeneralVideoMaskVM this$0;

        static {
            Covode.recordClassIndex(58251);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(GeneralVideoMaskVM generalVideoMaskVM) {
            super(1);
            this.this$0 = generalVideoMaskVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            Aweme aweme;
            Aweme aweme2;
            Aweme aweme3;
            String aid;
            e eVar2 = eVar;
            l.d(eVar2, "");
            if (eVar2.f92262a.f25641a) {
                VideoItemParams videoItemParams = (VideoItemParams) this.this$0.g();
                Aweme aweme4 = null;
                if (videoItemParams != null) {
                    aweme = videoItemParams.mAweme;
                } else {
                    aweme = null;
                }
                if (y.f(aweme)) {
                    GeneralVideoMaskVM generalVideoMaskVM = this.this$0;
                    VideoItemParams videoItemParams2 = (VideoItemParams) generalVideoMaskVM.g();
                    if (videoItemParams2 != null) {
                        aweme4 = videoItemParams2.mAweme;
                    }
                    if (com.ss.android.ugc.aweme.commercialize.e.a.b.aW(aweme4)) {
                        com.ss.android.ugc.aweme.ad.feed.b.e a2 = com.ss.android.ugc.aweme.ad.feed.b.b.a();
                        if (a2 != null) {
                            a2.c();
                        }
                    } else {
                        VideoItemParams videoItemParams3 = (VideoItemParams) generalVideoMaskVM.g();
                        if (!(videoItemParams3 == null || (aweme2 = videoItemParams3.mAweme) == null)) {
                            aweme2.getAid();
                        }
                        v.O().B();
                    }
                    VideoItemParams videoItemParams4 = (VideoItemParams) generalVideoMaskVM.g();
                    if (!(videoItemParams4 == null || (aweme3 = videoItemParams4.mAweme) == null || (aid = aweme3.getAid()) == null)) {
                        generalVideoMaskVM.d(new g(aid));
                    }
                }
            }
            return z.f158842a;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, java.lang.Object] */
    @Override // com.bytedance.ext_power_list.j
    public final /* synthetic */ VideoItemParams b(j jVar, VideoItemParams videoItemParams) {
        l.d(jVar, "");
        l.d(videoItemParams, "");
        return videoItemParams;
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams] */
    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final /* synthetic */ e a(e eVar, VideoItemParams videoItemParams) {
        l.d(eVar, "");
        l.d(videoItemParams, "");
        Aweme aweme = videoItemParams.mAweme;
        l.b(aweme, "");
        return e.a(new com.bytedance.assem.arch.extensions.g(y.h(videoItemParams.mAweme)), aweme.getGeneralMaskInfo());
    }
}
