package com.ss.android.ugc.tools.infosticker.view.internal.main;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.tools.c.a;
import com.ss.android.ugc.tools.infosticker.view.internal.base.e;
import com.ss.android.ugc.tools.utils.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public class k extends e<EffectCategoryResponse, Effect> {
    static {
        Covode.recordClassIndex(98582);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(TabLayout tabLayout) {
        super(tabLayout);
        l.d(tabLayout, "");
    }

    public View a(Context context, EffectCategoryResponse effectCategoryResponse) {
        l.d(context, "");
        l.d(effectCategoryResponse, "");
        j jVar = new j(context, (byte) 0);
        jVar.getTextView().setText(effectCategoryResponse.getName());
        String icon_selected_url = effectCategoryResponse.getIcon_selected_url();
        if (icon_selected_url != null) {
            a.a(jVar.getIconImgView(), icon_selected_url);
        }
        jVar.getIconImgView().setAlpha(0.5f);
        return jVar;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.e
    public void a(View view, int i2) {
        if (!(view instanceof j)) {
            view = null;
        }
        j jVar = (j) view;
        if (jVar != null) {
            jVar.getContentView().setBackground(null);
            jVar.getIconImgView().setAlpha(0.5f);
            TextView textView = jVar.getTextView();
            Context context = jVar.getContext();
            l.b(context, "");
            textView.setTextColor(context.getResources().getColor(R.color.a26));
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.e
    public void b(View view, int i2) {
        if (!(view instanceof j)) {
            view = null;
        }
        j jVar = (j) view;
        if (jVar != null) {
            View contentView = jVar.getContentView();
            Context context = jVar.getContext();
            l.b(context, "");
            contentView.setBackground(context.getResources().getDrawable(R.drawable.s4));
            jVar.getIconImgView().setAlpha(1.0f);
            TextView textView = jVar.getTextView();
            Context context2 = jVar.getContext();
            l.b(context2, "");
            textView.setTextColor(context2.getResources().getColor(R.color.a25));
        }
    }

    /* access modifiers changed from: protected */
    public void a(View view, EffectCategoryResponse effectCategoryResponse, int i2, int i3) {
        float a2;
        float a3;
        l.d(view, "");
        l.d(effectCategoryResponse, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            if (i2 == 0) {
                Context context = view.getContext();
                l.b(context, "");
                a2 = r.a(context, 12.0f);
            } else {
                Context context2 = view.getContext();
                l.b(context2, "");
                a2 = r.a(context2, 5.0f);
            }
            int i4 = (int) a2;
            if (i2 == i3 - 1) {
                Context context3 = view.getContext();
                l.b(context3, "");
                a3 = r.a(context3, 12.0f);
            } else {
                Context context4 = view.getContext();
                l.b(context4, "");
                a3 = r.a(context4, 5.0f);
            }
            int i5 = (int) a3;
            int i6 = Build.VERSION.SDK_INT;
            marginLayoutParams.setMarginStart(i4);
            marginLayoutParams.setMarginEnd(i5);
            marginLayoutParams.leftMargin = i4;
            marginLayoutParams.rightMargin = i5;
            view.setLayoutParams(marginLayoutParams);
            view.invalidate();
        }
    }
}
