package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.imagepipeline.o.d;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareQnAContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.d.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.b;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.k;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.r;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.t;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.List;

public class ap extends a<ShareQnAContent> {
    private RemoteImageView A;

    /* renamed from: a  reason: collision with root package name */
    private RemoteImageView f101373a;

    /* renamed from: b  reason: collision with root package name */
    private TuxTextView f101374b;
    private TuxTextView x;
    private RemoteImageView y;
    private RemoteImageView z;

    static {
        Covode.recordClassIndex(64822);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public void a() {
        super.a();
        View findViewById = this.itemView.findViewById(R.id.adh);
        l.b(findViewById, "");
        this.o = a.C2518a.a(findViewById);
        View findViewById2 = this.itemView.findViewById(R.id.icon_iv);
        l.b(findViewById2, "");
        this.f101373a = (RemoteImageView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.title_tv);
        l.b(findViewById3, "");
        this.f101374b = (TuxTextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.akl);
        l.b(findViewById4, "");
        this.x = (TuxTextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.bml);
        l.b(findViewById5, "");
        this.y = (RemoteImageView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.bmm);
        l.b(findViewById6, "");
        this.z = (RemoteImageView) findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.bmn);
        l.b(findViewById7, "");
        this.A = (RemoteImageView) findViewById7;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public final void bE_() {
        View view = this.itemView;
        l.b(view, "");
        Context context = view.getContext();
        l.b(context, "");
        float dimensionPixelSize = (float) context.getResources().getDimensionPixelSize(R.dimen.li);
        if (r.a()) {
            RemoteImageView remoteImageView = this.y;
            if (remoteImageView == null) {
                l.a("img1View");
            }
            b.a(remoteImageView, new float[]{0.0f, 0.0f, 0.0f, dimensionPixelSize});
            RemoteImageView remoteImageView2 = this.A;
            if (remoteImageView2 == null) {
                l.a("img3View");
            }
            b.a(remoteImageView2, new float[]{0.0f, 0.0f, dimensionPixelSize, 0.0f});
            return;
        }
        RemoteImageView remoteImageView3 = this.y;
        if (remoteImageView3 == null) {
            l.a("img1View");
        }
        b.a(remoteImageView3, new float[]{0.0f, 0.0f, dimensionPixelSize, 0.0f});
        RemoteImageView remoteImageView4 = this.A;
        if (remoteImageView4 == null) {
            l.a("img3View");
        }
        b.a(remoteImageView4, new float[]{0.0f, 0.0f, 0.0f, dimensionPixelSize});
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ap(View view, com.ss.android.ugc.aweme.im.sdk.chat.data.e.b bVar) {
        super(view);
        l.d(view, "");
        l.d(bVar, "");
    }

    public void a(ai aiVar, ai aiVar2, ShareQnAContent shareQnAContent, int i2) {
        String str;
        long j2;
        UrlModel urlModel;
        UrlModel urlModel2;
        List<UrlModel> awemeCoverList;
        List<UrlModel> awemeCoverList2;
        List<UrlModel> awemeCoverList3;
        l.d(aiVar, "");
        super.a(aiVar, aiVar2, (BaseContent) shareQnAContent, i2);
        androidx.core.f.a a2 = androidx.core.f.a.a();
        TuxTextView tuxTextView = this.f101374b;
        if (tuxTextView == null) {
            l.a("titleView");
        }
        UrlModel urlModel3 = null;
        if (shareQnAContent != null) {
            str = shareQnAContent.getQuestionName();
        } else {
            str = null;
        }
        tuxTextView.setText(str);
        TuxTextView tuxTextView2 = this.x;
        if (tuxTextView2 == null) {
            l.a("descView");
        }
        tuxTextView2.setVisibility(0);
        TuxTextView tuxTextView3 = this.x;
        if (tuxTextView3 == null) {
            l.a("descView");
        }
        View view = this.itemView;
        l.b(view, "");
        Context context = view.getContext();
        l.b(context, "");
        Resources resources = context.getResources();
        Object[] objArr = new Object[1];
        if (shareQnAContent != null) {
            j2 = (long) shareQnAContent.getUserCount();
        } else {
            j2 = 0;
        }
        objArr[0] = a2.b(k.a(j2));
        tuxTextView3.setText(resources.getString(R.string.cg_, objArr));
        this.o.a(50331649, Boolean.valueOf(t.b(aiVar, shareQnAContent)));
        RemoteImageView remoteImageView = this.f101373a;
        if (remoteImageView == null) {
            l.a("iconView");
        }
        com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a(remoteImageView, 2131232830);
        RemoteImageView remoteImageView2 = this.y;
        if (remoteImageView2 == null) {
            l.a("img1View");
        }
        if (shareQnAContent == null || (awemeCoverList3 = shareQnAContent.getAwemeCoverList()) == null) {
            urlModel = null;
        } else {
            urlModel = (UrlModel) n.b((List) awemeCoverList3, 0);
        }
        com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a(remoteImageView2, urlModel, (d) null, 0, 0, (com.facebook.drawee.c.d) null, 60);
        RemoteImageView remoteImageView3 = this.z;
        if (remoteImageView3 == null) {
            l.a("img2View");
        }
        if (shareQnAContent == null || (awemeCoverList2 = shareQnAContent.getAwemeCoverList()) == null) {
            urlModel2 = null;
        } else {
            urlModel2 = (UrlModel) n.b((List) awemeCoverList2, 1);
        }
        com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a(remoteImageView3, urlModel2, (d) null, 0, 0, (com.facebook.drawee.c.d) null, 60);
        RemoteImageView remoteImageView4 = this.A;
        if (remoteImageView4 == null) {
            l.a("img3View");
        }
        if (!(shareQnAContent == null || (awemeCoverList = shareQnAContent.getAwemeCoverList()) == null)) {
            urlModel3 = (UrlModel) n.b((List) awemeCoverList, 2);
        }
        com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a(remoteImageView4, urlModel3, (d) null, 0, 0, (com.facebook.drawee.c.d) null, 60);
        this.o.a(50331648, 49);
        this.o.a(67108864, this.s);
    }
}
