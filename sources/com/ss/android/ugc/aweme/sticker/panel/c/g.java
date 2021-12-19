package com.ss.android.ugc.aweme.sticker.panel.c;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.a;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.view.style.StyleTextView;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class g implements h {

    /* renamed from: a  reason: collision with root package name */
    public boolean f135098a;

    /* renamed from: b  reason: collision with root package name */
    private LinearLayout f135099b;

    /* renamed from: c  reason: collision with root package name */
    private SimpleDraweeView f135100c;

    /* renamed from: d  reason: collision with root package name */
    private StyleTextView f135101d;

    /* renamed from: e  reason: collision with root package name */
    private SimpleDraweeView f135102e;

    /* renamed from: f  reason: collision with root package name */
    private LinearLayout f135103f;

    static {
        Covode.recordClassIndex(88324);
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c.h
    public final i a() {
        return i.NormalStickerInfoHandlerPriority;
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c.h
    public final void b() {
        LinearLayout linearLayout = this.f135099b;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    public g(boolean z) {
        this.f135098a = z;
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c.h
    public final void a(View view) {
        l.d(view, "");
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.c8k);
        this.f135099b = linearLayout;
        if (this.f135098a) {
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            this.f135100c = (SimpleDraweeView) view.findViewById(R.id.eb6);
            this.f135101d = (StyleTextView) view.findViewById(R.id.ebb);
            this.f135102e = (SimpleDraweeView) view.findViewById(R.id.cup);
            this.f135103f = (LinearLayout) view.findViewById(R.id.cuo);
        } else if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c.h
    public final boolean a(a aVar) {
        String str;
        List<String> urlList;
        l.d(aVar, "");
        Effect effect = aVar.f135378a;
        if (!com.ss.android.ugc.aweme.sticker.p.g.d(effect) || !this.f135098a) {
            b();
            return false;
        }
        LinearLayout linearLayout = this.f135103f;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        SimpleDraweeView simpleDraweeView = this.f135102e;
        if (simpleDraweeView != null) {
            simpleDraweeView.setVisibility(8);
        }
        SimpleDraweeView simpleDraweeView2 = this.f135100c;
        if (simpleDraweeView2 != null) {
            simpleDraweeView2.setVisibility(0);
        }
        StyleTextView styleTextView = this.f135101d;
        if (styleTextView != null) {
            styleTextView.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f135099b;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        SimpleDraweeView simpleDraweeView3 = this.f135100c;
        if (simpleDraweeView3 != null) {
            UrlModel iconUrl = effect.getIconUrl();
            if (iconUrl == null || (urlList = iconUrl.getUrlList()) == null) {
                str = null;
            } else {
                str = (String) n.h((List) urlList);
            }
            com.ss.android.ugc.tools.c.a.a(simpleDraweeView3, str);
        }
        StyleTextView styleTextView2 = this.f135101d;
        if (styleTextView2 == null) {
            return true;
        }
        styleTextView2.setText(effect.getName());
        return true;
    }
}
