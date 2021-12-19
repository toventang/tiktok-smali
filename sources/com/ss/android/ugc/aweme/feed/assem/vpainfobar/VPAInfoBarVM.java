package com.ss.android.ugc.aweme.feed.assem.vpainfobar;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VPAInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.x.g;
import com.ss.android.ugc.aweme.shortvideo.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;

public final class VPAInfoBarVM extends FeedBaseViewModel<f> {
    static {
        Covode.recordClassIndex(58708);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ j f() {
        return new f();
    }

    public final int h() {
        Aweme aweme;
        VideoItemParams videoItemParams = (VideoItemParams) g();
        if (videoItemParams != null) {
            aweme = videoItemParams.mAweme;
        } else {
            aweme = null;
        }
        if (g.a(aweme)) {
            return 0;
        }
        return 8;
    }

    public static final class a extends ImageSpan {
        static {
            Covode.recordClassIndex(58709);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(context, 2131231742);
            l.d(context, "");
        }

        public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
            l.d(canvas, "");
            l.d(charSequence, "");
            l.d(paint, "");
            Drawable drawable = getDrawable();
            canvas.save();
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            l.b(drawable, "");
            canvas.translate(f2, (float) (((((fontMetricsInt.descent + i5) + i5) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2)));
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    static final class b extends m implements h.f.a.b<f, f> {
        final /* synthetic */ VPAInfoBarVM this$0;

        static {
            Covode.recordClassIndex(58710);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VPAInfoBarVM vPAInfoBarVM) {
            super(1);
            this.this$0 = vPAInfoBarVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ f invoke(f fVar) {
            f fVar2 = fVar;
            l.d(fVar2, "");
            VPAInfoBarVM vPAInfoBarVM = this.this$0;
            Object g2 = vPAInfoBarVM.g();
            if (g2 == null) {
                l.b();
            }
            return vPAInfoBarVM.a(fVar2, (VideoItemParams) g2);
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

    public final f a(f fVar, VideoItemParams videoItemParams) {
        Aweme aweme;
        SpannableString spannableString;
        Resources c2;
        int i2;
        Aweme aweme2;
        i uploadMiscInfoStruct;
        VPAInfo vPAInfo;
        Aweme aweme3;
        int i3;
        VideoItemParams videoItemParams2;
        VideoItemParams videoItemParams3;
        l.d(fVar, "");
        l.d(videoItemParams, "");
        VideoItemParams videoItemParams4 = (VideoItemParams) g();
        String str = null;
        if (videoItemParams4 != null) {
            aweme = videoItemParams4.mAweme;
        } else {
            aweme = null;
        }
        if (!g.a(aweme)) {
            spannableString = null;
        } else {
            StringBuilder sb = new StringBuilder();
            VideoItemParams videoItemParams5 = (VideoItemParams) g();
            if (videoItemParams5 == null || (aweme2 = videoItemParams5.mAweme) == null || (uploadMiscInfoStruct = aweme2.getUploadMiscInfoStruct()) == null || (vPAInfo = uploadMiscInfoStruct.vpaInfo) == null || vPAInfo.getInfoBarType() != 1) {
                c2 = com.bytedance.ies.ugc.appcontext.g.c();
                i2 = R.string.bw1;
            } else {
                c2 = com.bytedance.ies.ugc.appcontext.g.c();
                i2 = R.string.bw0;
            }
            spannableString = new SpannableString(sb.append(c2.getString(i2)).append("  ").toString());
            Application a2 = com.bytedance.ies.ugc.appcontext.g.a();
            l.b(a2, "");
            spannableString.setSpan(new a(a2), spannableString.length() - 1, spannableString.length(), 18);
        }
        int h2 = h();
        VideoItemParams videoItemParams6 = (VideoItemParams) g();
        if (videoItemParams6 != null) {
            aweme3 = videoItemParams6.mAweme;
        } else {
            aweme3 = null;
        }
        if (g.a(aweme3) && com.ss.android.ugc.aweme.compliance.api.a.e().c() != 2) {
            VideoItemParams videoItemParams7 = (VideoItemParams) g();
            if (videoItemParams7 != null) {
                str = videoItemParams7.mEventType;
            }
            if (l.a((Object) "homepage_hot", (Object) str) && (videoItemParams2 = (VideoItemParams) g()) != null && videoItemParams2.mPageType == 0 && (videoItemParams3 = (VideoItemParams) g()) != null && videoItemParams3.mAwemeFromPage == 1) {
                i3 = 0;
                return new f(spannableString, h2, i3);
            }
        }
        i3 = 8;
        return new f(spannableString, h2, i3);
    }
}
