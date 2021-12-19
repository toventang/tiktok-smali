package com.ss.android.ugc.aweme.feed.assem.progressbar;

import android.view.KeyEvent;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.seekbar.h;
import h.c.b.a.k;
import h.f.b.l;
import h.f.b.m;
import h.r;
import h.z;
import kotlinx.coroutines.am;

public final class VideoProgressBarViewModel extends FeedBaseViewModel<m> {

    /* renamed from: l  reason: collision with root package name */
    public static final a f92365l = new a((byte) 0);

    /* renamed from: k  reason: collision with root package name */
    public long f92366k;

    static {
        Covode.recordClassIndex(58410);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(58411);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ j f() {
        return new m();
    }

    public final void a(boolean z) {
        a(new e(z));
    }

    static final class d extends m implements h.f.a.b<m, m> {
        final /* synthetic */ boolean $splashing;

        static {
            Covode.recordClassIndex(58414);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(boolean z) {
            super(1);
            this.$splashing = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ m invoke(m mVar) {
            m mVar2 = mVar;
            l.d(mVar2, "");
            return m.a(mVar2, 0, false, this.$splashing, 0, 0, 27);
        }
    }

    static final class e extends m implements h.f.a.b<m, m> {
        final /* synthetic */ boolean $showing;

        static {
            Covode.recordClassIndex(58415);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(boolean z) {
            super(1);
            this.$showing = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ m invoke(m mVar) {
            m mVar2 = mVar;
            l.d(mVar2, "");
            return m.a(mVar2, 0, this.$showing, false, 0, 0, 29);
        }
    }

    static final class b extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ boolean $isUp;
        int label;
        final /* synthetic */ VideoProgressBarViewModel this$0;

        static {
            Covode.recordClassIndex(58412);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VideoProgressBarViewModel videoProgressBarViewModel, boolean z, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = videoProgressBarViewModel;
            this.$isUp = z;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new b(this.this$0, this.$isUp, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Aweme aweme;
            VideoItemParams videoItemParams;
            Aweme aweme2;
            String fromGroupId;
            if (this.label == 0) {
                r.a(obj);
                if (this.$isUp) {
                    str = "up";
                } else {
                    str = "down";
                }
                VideoItemParams videoItemParams2 = (VideoItemParams) this.this$0.g();
                if (videoItemParams2 != null) {
                    aweme = videoItemParams2.mAweme;
                } else {
                    aweme = null;
                }
                String str2 = "";
                if (!(aweme == null || (videoItemParams = (VideoItemParams) this.this$0.g()) == null || (aweme2 = videoItemParams.mAweme) == null || (fromGroupId = aweme2.getFromGroupId()) == null)) {
                    str2 = fromGroupId;
                }
                com.ss.android.ugc.aweme.common.r.a("adjust_volumn", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.this$0.p).a("to_status", str).a("group_id", str2).f66730a);
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class c extends m implements h.f.a.b<m, m> {
        final /* synthetic */ com.ss.android.ugc.aweme.feed.ui.seekbar.e $event;
        final /* synthetic */ VideoProgressBarViewModel this$0;

        static {
            Covode.recordClassIndex(58413);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VideoProgressBarViewModel videoProgressBarViewModel, com.ss.android.ugc.aweme.feed.ui.seekbar.e eVar) {
            super(1);
            this.this$0 = videoProgressBarViewModel;
            this.$event = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ m invoke(m mVar) {
            int i2;
            Aweme aweme;
            Video video;
            Aweme aweme2;
            Video video2;
            m mVar2 = mVar;
            l.d(mVar2, "");
            VideoItemParams videoItemParams = (VideoItemParams) this.this$0.g();
            int i3 = 0;
            if (videoItemParams == null || (aweme2 = videoItemParams.mAweme) == null || (video2 = aweme2.getVideo()) == null) {
                i2 = 0;
            } else {
                i2 = video2.getDuration();
            }
            VideoItemParams videoItemParams2 = (VideoItemParams) this.this$0.g();
            if (!(videoItemParams2 == null || (aweme = videoItemParams2.mAweme) == null || (video = aweme.getVideo()) == null)) {
                i3 = video.getDuration();
            }
            double d2 = (double) i3;
            double d3 = (double) this.$event.f95103d;
            Double.isNaN(d3);
            Double.isNaN(d2);
            return m.a(mVar2, 0, false, false, (int) (d2 * (d3 / 100.0d)), i2, 7);
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

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        if (((com.ss.android.ugc.aweme.main.l) r0).n() != false) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(boolean r9, android.app.Activity r10) {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarViewModel.a(boolean, android.app.Activity):boolean");
    }

    public final void a(int i2, KeyEvent keyEvent, boolean z) {
        Aweme aweme;
        VideoItemParams videoItemParams = (VideoItemParams) g();
        if (videoItemParams != null) {
            aweme = videoItemParams.mAweme;
        } else {
            aweme = null;
        }
        h hVar = new h(aweme, this.p, ((FeedBaseViewModel) this).o, i2, keyEvent);
        hVar.f95114a = z;
        com.ss.android.ugc.d.a.c.a(hVar);
    }
}
