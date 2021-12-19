package com.ss.android.ugc.aweme.commerce_sticker_impl.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.sticker.model.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class CommerceStickerDetailLinkLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private HashMap f73604a;

    static {
        Covode.recordClassIndex(45301);
    }

    public CommerceStickerDetailLinkLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final View a(int i2) {
        if (this.f73604a == null) {
            this.f73604a = new HashMap();
        }
        View view = (View) this.f73604a.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f73604a.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommerceStickerDetailLinkLayout f73605a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f73606b;

        static {
            Covode.recordClassIndex(45302);
        }

        a(CommerceStickerDetailLinkLayout commerceStickerDetailLinkLayout, c cVar) {
            this.f73605a = commerceStickerDetailLinkLayout;
            this.f73606b = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            r.a("click_link", new d().a("enter_from", "prop_page").a(StringSet.type, "web_link").a("prop_id", this.f73606b.getId()).f66730a);
            com.ss.android.ugc.aweme.commerce_sticker_api.a.a a2 = com.ss.android.ugc.aweme.commerce_sticker_impl.a.a.a();
            if (a2 != null) {
                Context context = this.f73605a.getContext();
                l.b(context, "");
                a2.a(context, this.f73606b.getDetailOpenUrl(), this.f73606b.getDetailWebUrl(), this.f73606b.getDetailWebUrlTitle(), "click_variable_button", this.f73606b.getId());
            }
        }
    }

    private /* synthetic */ CommerceStickerDetailLinkLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommerceStickerDetailLinkLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(9526);
        com.a.a(LayoutInflater.from(context), R.layout.r7, this, true);
        MethodCollector.o(9526);
    }
}
