package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.tux.c.e;
import com.bytedance.tux.c.f;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareChallengeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.d.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.k;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.r;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Arrays;

public class y extends a<ShareChallengeContent> {

    /* renamed from: a  reason: collision with root package name */
    private TuxIconView f101470a;

    /* renamed from: b  reason: collision with root package name */
    private TuxTextView f101471b;
    private TuxTextView x;
    private TextView y;
    private Drawable z;

    static {
        Covode.recordClassIndex(64888);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public final void bE_() {
        View view = this.itemView;
        l.b(view, "");
        Context context = view.getContext();
        l.b(context, "");
        e a2 = f.a(new a((float) context.getResources().getDimensionPixelSize(R.dimen.li)));
        View view2 = this.itemView;
        l.b(view2, "");
        Context context2 = view2.getContext();
        l.b(context2, "");
        this.z = a2.a(context2);
        TuxIconView tuxIconView = this.f101470a;
        if (tuxIconView == null) {
            l.a("iconView");
        }
        Drawable drawable = this.z;
        if (drawable == null) {
            l.a("iconShapeDrawable");
        }
        tuxIconView.setBackground(drawable);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public void a() {
        super.a();
        View findViewById = this.itemView.findViewById(R.id.adh);
        l.b(findViewById, "");
        this.o = a.C2518a.a(findViewById);
        View findViewById2 = this.itemView.findViewById(R.id.bji);
        l.b(findViewById2, "");
        this.f101470a = (TuxIconView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.icon_iv);
        l.b(findViewById3, "");
        ((RemoteImageView) findViewById3).setVisibility(8);
        View findViewById4 = this.itemView.findViewById(R.id.title_tv);
        l.b(findViewById4, "");
        this.f101471b = (TuxTextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.akl);
        l.b(findViewById5, "");
        this.x = (TuxTextView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.ei7);
        l.b(findViewById6, "");
        this.y = (TextView) findViewById6;
        TuxIconView tuxIconView = this.f101470a;
        if (tuxIconView == null) {
            l.a("iconView");
        }
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        tuxIconView.setIconHeight(h.g.a.a(TypedValue.applyDimension(1, 48.0f, system.getDisplayMetrics())));
        TuxIconView tuxIconView2 = this.f101470a;
        if (tuxIconView2 == null) {
            l.a("iconView");
        }
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        tuxIconView2.setIconWidth(h.g.a.a(TypedValue.applyDimension(1, 48.0f, system2.getDisplayMetrics())));
        TuxIconView tuxIconView3 = this.f101470a;
        if (tuxIconView3 == null) {
            l.a("iconView");
        }
        tuxIconView3.setTintColorRes(R.attr.bj);
        TuxIconView tuxIconView4 = this.f101470a;
        if (tuxIconView4 == null) {
            l.a("iconView");
        }
        tuxIconView4.setVisibility(0);
    }

    static final class a extends m implements b<e, z> {
        final /* synthetic */ float $cornerRadii;

        static {
            Covode.recordClassIndex(64889);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(float f2) {
            super(1);
            this.$cornerRadii = f2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            e eVar2 = eVar;
            l.d(eVar2, "");
            eVar2.f44775a = Integer.valueOf(Color.parseColor("#08202020"));
            if (r.a()) {
                eVar2.f44783i = Float.valueOf(this.$cornerRadii);
                eVar2.f44785k = Float.valueOf(this.$cornerRadii);
            } else {
                eVar2.f44784j = Float.valueOf(this.$cornerRadii);
                eVar2.f44786l = Float.valueOf(this.$cornerRadii);
            }
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(View view, com.ss.android.ugc.aweme.im.sdk.chat.data.e.b bVar) {
        super(view);
        l.d(view, "");
        l.d(bVar, "");
    }

    public void a(ai aiVar, ai aiVar2, ShareChallengeContent shareChallengeContent, int i2) {
        l.d(aiVar, "");
        l.d(shareChallengeContent, "");
        super.a(aiVar, aiVar2, (BaseContent) shareChallengeContent, i2);
        TuxTextView tuxTextView = this.f101471b;
        if (tuxTextView == null) {
            l.a("titleView");
        }
        tuxTextView.setText(shareChallengeContent.getTitle());
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
        String string = context.getResources().getString(R.string.cdn);
        l.b(string, "");
        String a2 = com.a.a(string, Arrays.copyOf(new Object[]{k.a(shareChallengeContent.getUserCount())}, 1));
        l.b(a2, "");
        tuxTextView3.setText(a2);
        TextView textView = this.y;
        if (textView == null) {
            l.a("tagView");
        }
        textView.setText(R.string.cdm);
        TuxIconView tuxIconView = this.f101470a;
        if (tuxIconView == null) {
            l.a("iconView");
        }
        tuxIconView.setIconRes(R.raw.icon_2pt_number);
        this.o.a(50331648, 18);
        this.o.a(67108864, shareChallengeContent.getChallengeId());
        this.o.a(50331649, Boolean.valueOf(shareChallengeContent.isCommerce()));
    }
}
