package com.ss.android.ugc.aweme.commerce_sticker_impl.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.ck.u;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.sticker.model.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class CommerceStickerDetailAuthorLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private HashMap f73599a;

    static {
        Covode.recordClassIndex(45297);
    }

    public CommerceStickerDetailAuthorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private View a(int i2) {
        if (this.f73599a == null) {
            this.f73599a = new HashMap();
        }
        View view = (View) this.f73599a.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f73599a.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final boolean a(c cVar) {
        String adOwnerName;
        setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) a(R.id.cz);
        l.b(linearLayout, "");
        linearLayout.setVisibility(8);
        if (cVar == null || (adOwnerName = cVar.getAdOwnerName()) == null || adOwnerName.length() == 0) {
            return false;
        }
        r.a("show_aduser_head", new d().a("enter_from", "prop_page").a("to_user_id", cVar.getAdOwnerId()).a("prop_id", cVar.getId()).f66730a);
        setVisibility(0);
        LinearLayout linearLayout2 = (LinearLayout) a(R.id.cz);
        l.b(linearLayout2, "");
        linearLayout2.setVisibility(0);
        TuxTextView tuxTextView = (TuxTextView) a(R.id.cy);
        if (tuxTextView != null) {
            tuxTextView.setText(adOwnerName);
        }
        TuxTextView tuxTextView2 = (TuxTextView) a(R.id.cy);
        if (tuxTextView2 != null) {
            tuxTextView2.setOnClickListener(new a(this, cVar));
        }
        return true;
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommerceStickerDetailAuthorLayout f73600a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f73601b;

        static {
            Covode.recordClassIndex(45298);
        }

        a(CommerceStickerDetailAuthorLayout commerceStickerDetailAuthorLayout, c cVar) {
            this.f73600a = commerceStickerDetailAuthorLayout;
            this.f73601b = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            r.a("click_aduser_head", new d().a("enter_from", "prop_page").a("to_user_id", this.f73601b.getAdOwnerId()).a("prop_id", this.f73601b.getId()).f66730a);
            r.a("enter_personal_detail", new d().a("enter_from", "prop_page").a("to_user_id", this.f73601b.getAdOwnerId()).a("prop_id", this.f73601b.getId()).f66730a);
            SmartRouter.buildRoute(this.f73600a.getContext(), u.a("aweme://user/profile/" + this.f73601b.getAdOwnerId()).a("sec_user_id", this.f73601b.getSecAdOwnerId()).a()).open();
        }
    }

    private /* synthetic */ CommerceStickerDetailAuthorLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommerceStickerDetailAuthorLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(9538);
        com.a.a(LayoutInflater.from(context), R.layout.r1, this, true);
        MethodCollector.o(9538);
    }
}
