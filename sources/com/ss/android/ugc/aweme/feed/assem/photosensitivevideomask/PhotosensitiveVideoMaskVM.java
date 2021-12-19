package com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.g;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;

public final class PhotosensitiveVideoMaskVM extends FeedBaseViewModel<j> {
    static {
        Covode.recordClassIndex(58380);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ j f() {
        return new j();
    }

    public final void h() {
        b(new c(this));
    }

    public final void i() {
        if (com.ss.android.ugc.aweme.compliance.api.a.d().h() == 1) {
            a(new a(this));
        } else {
            a(new b(this));
        }
    }

    static final class c extends m implements h.f.a.b<j, z> {
        final /* synthetic */ PhotosensitiveVideoMaskVM this$0;

        static {
            Covode.recordClassIndex(58383);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(PhotosensitiveVideoMaskVM photosensitiveVideoMaskVM) {
            super(1);
            this.this$0 = photosensitiveVideoMaskVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(j jVar) {
            j jVar2 = jVar;
            l.d(jVar2, "");
            if (jVar2.f92360a != 8) {
                com.ss.android.ugc.aweme.compliance.api.a.d().a((IComplianceBusinessService) 2, (int) ((h.f.a.a<z>) null));
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.feed.i.b());
                this.this$0.a(AnonymousClass1.f92343a);
            }
            return z.f158842a;
        }
    }

    static final class a extends m implements h.f.a.b<j, j> {
        final /* synthetic */ PhotosensitiveVideoMaskVM this$0;

        static {
            Covode.recordClassIndex(58381);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(PhotosensitiveVideoMaskVM photosensitiveVideoMaskVM) {
            super(1);
            this.this$0 = photosensitiveVideoMaskVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ j invoke(j jVar) {
            l.d(jVar, "");
            String string = g.c().getString(R.string.dqa);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(g.a().getString(R.string.dqb) + "\n\n" + g.a().getString(R.string.dqc));
            int a2 = p.a((CharSequence) spannableStringBuilder, "\n\n", 0, false, 6);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(7, true), a2 + 1, a2 + 2, 33);
            return j.a(0, string, spannableStringBuilder.toString(), 8, 8);
        }
    }

    static final class b extends m implements h.f.a.b<j, j> {
        final /* synthetic */ PhotosensitiveVideoMaskVM this$0;

        static {
            Covode.recordClassIndex(58382);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(PhotosensitiveVideoMaskVM photosensitiveVideoMaskVM) {
            super(1);
            this.this$0 = photosensitiveVideoMaskVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ j invoke(j jVar) {
            l.d(jVar, "");
            String string = g.c().getString(R.string.dqe);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(g.a().getString(R.string.dq9) + "\n\n" + g.a().getString(R.string.dq_));
            int a2 = p.a((CharSequence) spannableStringBuilder, "\n\n", 0, false, 6);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(7, true), a2 + 1, a2 + 2, 33);
            return j.a(0, string, spannableStringBuilder.toString(), 0, 0);
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
}
