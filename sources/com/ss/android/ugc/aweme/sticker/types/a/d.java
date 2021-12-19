package com.ss.android.ugc.aweme.sticker.types.a;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.s;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean;
import com.ss.android.ugc.aweme.sticker.p.f;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d {

    /* renamed from: c  reason: collision with root package name */
    public static final a f135753c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public TextView f135754a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.sticker.presenter.handler.b.b f135755b;

    /* renamed from: d  reason: collision with root package name */
    private SimpleDraweeView f135756d;

    /* renamed from: e  reason: collision with root package name */
    private final LinearLayout f135757e;

    /* renamed from: f  reason: collision with root package name */
    private final String f135758f;

    static {
        Covode.recordClassIndex(88734);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(88735);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f135759a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FaceStickerBean f135760b;

        static {
            Covode.recordClassIndex(88736);
        }

        b(d dVar, FaceStickerBean faceStickerBean) {
            this.f135759a = dVar;
            this.f135760b = faceStickerBean;
        }

        public final void onClick(View view) {
            Context context;
            String str;
            Context context2;
            String str2;
            ClickAgent.onClick(view);
            cr a2 = cr.a();
            String str3 = "";
            l.b(a2, str3);
            a2.f125303i = false;
            cr a3 = cr.a();
            l.b(a3, str3);
            a3.f125304j = true;
            this.f135759a.f135755b.b(String.valueOf(this.f135760b.getStickerId()), "prop_panel");
            s z = g.a().z();
            TextView textView = this.f135759a.f135754a;
            if (textView != null) {
                context = textView.getContext();
            } else {
                context = null;
            }
            FaceStickerCommerceBean faceStickerCommerceBean = this.f135760b.getFaceStickerCommerceBean();
            if (faceStickerCommerceBean != null) {
                str = faceStickerCommerceBean.f134971b;
            } else {
                str = null;
            }
            if (!z.a(context, str)) {
                s z2 = g.a().z();
                TextView textView2 = this.f135759a.f135754a;
                if (textView2 != null) {
                    context2 = textView2.getContext();
                } else {
                    context2 = null;
                }
                FaceStickerCommerceBean faceStickerCommerceBean2 = this.f135760b.getFaceStickerCommerceBean();
                if (faceStickerCommerceBean2 != null) {
                    str2 = faceStickerCommerceBean2.f134970a;
                } else {
                    str2 = null;
                }
                String valueOf = String.valueOf(this.f135760b.getStickerId());
                if (!TextUtils.isEmpty(str2)) {
                    Uri.Builder appendQueryParameter = Uri.parse(str2).buildUpon().appendQueryParameter("enter_from", "commerce_sticker_button");
                    if (!TextUtils.isEmpty(valueOf)) {
                        str3 = valueOf;
                    }
                    str2 = appendQueryParameter.appendQueryParameter("sticker_id", str3).build().toString();
                }
                z2.a(context2, str2, null);
            }
        }
    }

    public final boolean a(Effect effect) {
        FaceStickerCommerceBean faceStickerCommerceBean;
        String str;
        FaceStickerBean a2 = f.a(effect, "");
        l.b(a2, "");
        if (effect == null || !effect.isBusiness() || (faceStickerCommerceBean = a2.getFaceStickerCommerceBean()) == null || 1 != faceStickerCommerceBean.f134973d) {
            this.f135757e.setVisibility(8);
            return false;
        }
        this.f135755b.a(String.valueOf(a2.getStickerId()), "prop_panel");
        this.f135757e.setVisibility(0);
        SimpleDraweeView simpleDraweeView = this.f135756d;
        UrlModel iconUrl = a2.getIconUrl();
        l.b(iconUrl, "");
        com.ss.android.ugc.tools.c.a.a(simpleDraweeView, iconUrl.getUrlList().get(0), -1, -1);
        TextView textView = this.f135754a;
        if (textView != null) {
            FaceStickerCommerceBean faceStickerCommerceBean2 = a2.getFaceStickerCommerceBean();
            if (faceStickerCommerceBean2 != null) {
                str = faceStickerCommerceBean2.f134972c;
            } else {
                str = null;
            }
            textView.setText(str);
        }
        TextView textView2 = this.f135754a;
        if (textView2 != null) {
            String str2 = this.f135758f;
            l.d(textView2, "");
            l.d(str2, "");
            Typeface a3 = com.ss.android.ugc.tools.view.style.f.a(str2);
            if (a3 != null) {
                textView2.setTypeface(a3);
            }
        }
        this.f135757e.setOnClickListener(new b(this, a2));
        return true;
    }

    public d(LinearLayout linearLayout, com.ss.android.ugc.aweme.sticker.presenter.handler.b.b bVar, String str) {
        l.d(linearLayout, "");
        l.d(bVar, "");
        l.d(str, "");
        this.f135757e = linearLayout;
        this.f135755b = bVar;
        this.f135758f = str;
        this.f135756d = (SimpleDraweeView) linearLayout.findViewById(R.id.abq);
        this.f135754a = (TextView) linearLayout.findViewById(R.id.abs);
    }
}
