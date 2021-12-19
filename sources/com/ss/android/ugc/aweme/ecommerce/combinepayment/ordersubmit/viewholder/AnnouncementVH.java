package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.lighten.a.q;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.b;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a;
import com.ss.android.ugc.aweme.ecommerce.track.c;
import com.ss.android.ugc.aweme.utils.bp;
import com.ss.android.ugc.aweme.utils.hk;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class AnnouncementVH extends JediSimpleViewHolder<b> implements au {

    /* renamed from: f  reason: collision with root package name */
    public final View f85089f;

    static {
        Covode.recordClassIndex(53181);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void e() {
        super.e();
        a.C2089a.a(this.f85089f, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnnouncementVH(View view) {
        super(view);
        l.d(view, "");
        this.f85089f = view;
    }

    public static final class a extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f85090a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f85091b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f85092c;

        static {
            Covode.recordClassIndex(53182);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                Uri.Builder buildUpon = Uri.parse(this.f85092c.f84815d).buildUpon();
                buildUpon.appendQueryParameter("source", "order_submit");
                SmartRouter.buildRoute(this.f85091b.getContext(), buildUpon.toString()).open();
                String str = this.f85092c.f84812a;
                if (str == null) {
                    str = "";
                }
                l.d(str, "");
                l.d("open", "");
                c.a("tiktokec_banner_click", new h.b(str, "open"));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view, b bVar) {
            super(700);
            this.f85091b = view;
            this.f85092c = bVar;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(b bVar) {
        String str;
        Spanned fromHtml;
        List<String> urls;
        List<String> urls2;
        com.bytedance.lighten.a.a.a imageUrlModel;
        b bVar2 = bVar;
        String str2 = "";
        l.d(bVar2, str2);
        View view = this.f85089f;
        if (hk.a(bVar2.f84815d)) {
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.ks);
            l.b(frameLayout, str2);
            frameLayout.setOnClickListener(new a(view, bVar2));
            AutoRTLImageView autoRTLImageView = (AutoRTLImageView) view.findViewById(R.id.lu);
            l.b(autoRTLImageView, str2);
            autoRTLImageView.setVisibility(0);
        } else {
            AutoRTLImageView autoRTLImageView2 = (AutoRTLImageView) view.findViewById(R.id.lu);
            l.b(autoRTLImageView2, str2);
            autoRTLImageView2.setVisibility(8);
            ((FrameLayout) view.findViewById(R.id.ks)).setOnClickListener(null);
        }
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.kr);
        l.b(smartImageView, str2);
        smartImageView.setVisibility(8);
        Image image = bVar2.f84816e;
        if (!(image == null || (imageUrlModel = image.toImageUrlModel()) == null)) {
            SmartImageView smartImageView2 = (SmartImageView) view.findViewById(R.id.kr);
            l.b(smartImageView2, str2);
            smartImageView2.setVisibility(0);
            v a2 = r.a(imageUrlModel);
            a2.A = q.MEDIUM;
            a2.E = (SmartImageView) view.findViewById(R.id.kr);
            a2.c();
        }
        Image image2 = bVar2.f84814c;
        if (image2 == null || (urls = image2.getUrls()) == null || urls.size() <= 0) {
            str = bVar2.f84813b;
        } else {
            StringBuilder sb = new StringBuilder("<img src='");
            Image image3 = bVar2.f84814c;
            str = sb.append((image3 == null || (urls2 = image3.getUrls()) == null) ? null : urls2.get(0)).append("'/> ").append(bVar2.f84813b).toString();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Context context = view.getContext();
            l.b(context, str2);
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.kt);
            l.b(tuxTextView, str2);
            fromHtml = Html.fromHtml(str, 0, new b(context, tuxTextView), null);
        } else {
            Context context2 = view.getContext();
            l.b(context2, str2);
            TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.kt);
            l.b(tuxTextView2, str2);
            fromHtml = Html.fromHtml(str, new b(context2, tuxTextView2), null);
        }
        if (fromHtml instanceof SpannableStringBuilder) {
            ImageSpan[] imageSpanArr = (ImageSpan[]) fromHtml.getSpans(0, fromHtml.length(), ImageSpan.class);
            for (ImageSpan imageSpan : imageSpanArr) {
                int spanStart = fromHtml.getSpanStart(imageSpan);
                int spanEnd = fromHtml.getSpanEnd(imageSpan);
                l.b(imageSpan, str2);
                Drawable drawable = imageSpan.getDrawable();
                l.b(drawable, str2);
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) fromHtml;
                spannableStringBuilder.setSpan(new a(drawable), spanStart, spanEnd, 34);
                spannableStringBuilder.removeSpan(imageSpan);
            }
        }
        TuxTextView tuxTextView3 = (TuxTextView) view.findViewById(R.id.kt);
        l.b(tuxTextView3, str2);
        tuxTextView3.setText(fromHtml);
        String str3 = bVar2.f84812a;
        if (str3 != null) {
            str2 = str3;
        }
        h.c(str2);
    }
}
