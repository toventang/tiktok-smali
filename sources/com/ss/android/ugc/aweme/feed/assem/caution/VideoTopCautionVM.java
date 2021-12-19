package com.ss.android.ugc.aweme.feed.assem.caution;

import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.KtfInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.shortvideo.i;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import java.util.Arrays;

public final class VideoTopCautionVM extends FeedBaseViewModel<g> {

    /* renamed from: k  reason: collision with root package name */
    boolean f92077k;

    static {
        Covode.recordClassIndex(58045);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ j f() {
        return new g();
    }

    static final class a extends m implements h.f.a.b<g, g> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f92078a = new a();

        static {
            Covode.recordClassIndex(58046);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ g invoke(g gVar) {
            g gVar2 = gVar;
            l.d(gVar2, "");
            return g.a(false, gVar2.f92092b);
        }
    }

    static final class b extends m implements h.f.a.b<g, g> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f92079a = new b();

        static {
            Covode.recordClassIndex(58047);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ g invoke(g gVar) {
            g gVar2 = gVar;
            l.d(gVar2, "");
            return g.a(false, gVar2.f92092b);
        }
    }

    static final class c extends m implements h.f.a.b<g, z> {
        final /* synthetic */ VideoTopCautionVM this$0;

        static {
            Covode.recordClassIndex(58048);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VideoTopCautionVM videoTopCautionVM) {
            super(1);
            this.this$0 = videoTopCautionVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(g gVar) {
            VideoItemParams videoItemParams;
            Aweme aweme;
            i uploadMiscInfoStruct;
            KtfInfo ktfInfo;
            Aweme aweme2;
            g gVar2 = gVar;
            l.d(gVar2, "");
            if (!gVar2.f92091a) {
                VideoItemParams videoItemParams2 = (VideoItemParams) this.this$0.g();
                String str = null;
                if (!(videoItemParams2 == null || videoItemParams2.mAweme == null || (videoItemParams = (VideoItemParams) this.this$0.g()) == null || (aweme = videoItemParams.mAweme) == null || (uploadMiscInfoStruct = aweme.getUploadMiscInfoStruct()) == null || (ktfInfo = uploadMiscInfoStruct.ktfInfo) == null)) {
                    l.b(ktfInfo, "");
                    String cautionLabel = ktfInfo.getCautionLabel();
                    String a2 = com.a.a(ktfInfo.getWarningText(), Arrays.copyOf(new Object[]{cautionLabel}, 1));
                    l.b(a2, "");
                    int a3 = p.a((CharSequence) a2, cautionLabel, 0, false, 6);
                    final SpannableString spannableString = new SpannableString(a2);
                    if (a3 >= 0) {
                        spannableString.setSpan(new StyleSpan(1), a3, cautionLabel.length(), 18);
                    }
                    this.this$0.a(new h.f.a.b<g, g>() {
                        /* class com.ss.android.ugc.aweme.feed.assem.caution.VideoTopCautionVM.c.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(58049);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ g invoke(g gVar) {
                            l.d(gVar, "");
                            return g.a(true, spannableString);
                        }
                    });
                    d dVar = new d();
                    VideoItemParams videoItemParams3 = (VideoItemParams) this.this$0.g();
                    if (!(videoItemParams3 == null || (aweme2 = videoItemParams3.mAweme) == null)) {
                        str = aweme2.getAid();
                    }
                    r.a("tns_banner_popout_ktf", dVar.a("object_id", str).a("enter_from", this.this$0.p).f66730a);
                }
            }
            return z.f158842a;
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams] */
    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final /* synthetic */ g a(g gVar, VideoItemParams videoItemParams) {
        l.d(gVar, "");
        l.d(videoItemParams, "");
        return new g();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, java.lang.Object] */
    @Override // com.bytedance.ext_power_list.j
    public final /* synthetic */ VideoItemParams b(j jVar, VideoItemParams videoItemParams) {
        l.d(jVar, "");
        l.d(videoItemParams, "");
        return videoItemParams;
    }
}
