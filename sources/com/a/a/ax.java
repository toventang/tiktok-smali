package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.pickview.b.b;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.translation.ui.TranslationStatusView;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.ss.android.ugc.aweme.views.MentionTextView;
import com.zhiliaoapp.musically.R;

public final class ax implements e {
    static {
        Covode.recordClassIndex(1960);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(3433);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams a2 = a.a(viewGroup, -1, -2);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.akd);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            int i2 = Build.VERSION.SDK_INT;
            layoutParams.setMarginEnd((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = (int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics());
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.ako);
        linearLayout2.setOrientation(0);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        MentionTextView mentionTextView = new MentionTextView(context);
        mentionTextView.setId(R.id.ak7);
        mentionTextView.setEllipsize(TextUtils.TruncateAt.END);
        mentionTextView.setIncludeFontPadding(false);
        mentionTextView.setVerticalFadingEdgeEnabled(true);
        mentionTextView.setMaxLines(4);
        mentionTextView.setPadding(mentionTextView.getPaddingLeft(), (int) TypedValue.applyDimension(1, 4.5f, resources.getDisplayMetrics()), mentionTextView.getPaddingRight(), mentionTextView.getPaddingBottom());
        mentionTextView.setShadowLayer(mentionTextView.getShadowRadius(), mentionTextView.getShadowDx(), mentionTextView.getShadowDy(), resources.getColor(R.color.iu));
        mentionTextView.setShadowLayer(mentionTextView.getShadowRadius(), mentionTextView.getShadowDx(), 1.0f, mentionTextView.getShadowColor());
        mentionTextView.setShadowLayer(1.0f, mentionTextView.getShadowDx(), mentionTextView.getShadowDy(), mentionTextView.getShadowColor());
        mentionTextView.setTextAlignment(5);
        mentionTextView.setTextColor(resources.getColorStateList(R.color.a_));
        mentionTextView.setTextSize(2, 15.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((FrameLayout.LayoutParams) layoutParams3).gravity = 16;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams3)) {
            ((DrawerLayout.d) layoutParams3).f2691a = 16;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            int i3 = Build.VERSION.SDK_INT;
            layoutParams3.setMarginStart((int) resources.getDimension(R.dimen.g5));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = (int) resources.getDimension(R.dimen.g5);
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.weight = 1.0f;
        }
        mentionTextView.setGravity(8388611);
        mentionTextView.setFadingEdgeLength((int) resources.getDimension(R.dimen.ft));
        mentionTextView.setLineSpacing(TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), 1.0f);
        a.a(mentionTextView);
        if (mentionTextView.getParent() == null) {
            linearLayout2.addView(mentionTextView, layoutParams3);
        }
        a.a(linearLayout2);
        if (linearLayout2.getParent() == null) {
            frameLayout.addView(linearLayout2, layoutParams2);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.f9q);
        tuxTextView.setText(R.string.bv8);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.a_));
        tuxTextView.setVisibility(8);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 8388693;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 8388693;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams4)) {
            ((DrawerLayout.d) layoutParams4).f2691a = 8388693;
        }
        f.a("app:tux_font", new a.c("H3_Semibold"), tuxTextView, layoutParams4);
        f.a(tuxTextView, layoutParams4);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            frameLayout.addView(tuxTextView, layoutParams4);
        }
        android.view.a.a(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout, layoutParams);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.dch);
        tuxTextView2.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), tuxTextView2.getPaddingTop(), tuxTextView2.getPaddingRight(), tuxTextView2.getPaddingBottom());
        tuxTextView2.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), tuxTextView2.getPaddingTop(), tuxTextView2.getPaddingRight(), tuxTextView2.getPaddingBottom());
        tuxTextView2.setPadding(tuxTextView2.getPaddingLeft(), tuxTextView2.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), tuxTextView2.getPaddingBottom());
        tuxTextView2.setPadding(tuxTextView2.getPaddingLeft(), tuxTextView2.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), tuxTextView2.getPaddingBottom());
        tuxTextView2.setPadding(tuxTextView2.getPaddingLeft(), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), tuxTextView2.getPaddingRight(), tuxTextView2.getPaddingBottom());
        tuxTextView2.setPadding(tuxTextView2.getPaddingLeft(), tuxTextView2.getPaddingTop(), tuxTextView2.getPaddingRight(), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        tuxTextView2.setVisibility(8);
        tuxTextView2.setMaxLines(1);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setClickable(false);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            int i4 = Build.VERSION.SDK_INT;
            layoutParams5.setMarginStart((int) resources.getDimension(R.dimen.g5));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).leftMargin = (int) resources.getDimension(R.dimen.g5);
        }
        f.a("app:tux_font", new a.c("SmallText2_Semibold"), tuxTextView2, layoutParams5);
        f.a(tuxTextView2, layoutParams5);
        android.view.a.a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            linearLayout.addView(tuxTextView2, layoutParams5);
        }
        TuxTag tuxTag = new TuxTag(context);
        tuxTag.setId(R.id.epz);
        tuxTag.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), tuxTag.getPaddingTop(), tuxTag.getPaddingRight(), tuxTag.getPaddingBottom());
        tuxTag.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), tuxTag.getPaddingTop(), tuxTag.getPaddingRight(), tuxTag.getPaddingBottom());
        tuxTag.setPadding(tuxTag.getPaddingLeft(), tuxTag.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), tuxTag.getPaddingBottom());
        tuxTag.setPadding(tuxTag.getPaddingLeft(), tuxTag.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), tuxTag.getPaddingBottom());
        tuxTag.setPadding(tuxTag.getPaddingLeft(), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), tuxTag.getPaddingRight(), tuxTag.getPaddingBottom());
        tuxTag.setPadding(tuxTag.getPaddingLeft(), tuxTag.getPaddingTop(), tuxTag.getPaddingRight(), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        tuxTag.setVisibility(8);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            int i5 = Build.VERSION.SDK_INT;
            layoutParams6.setMarginStart((int) resources.getDimension(R.dimen.g5));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            ((ViewGroup.MarginLayoutParams) layoutParams6).leftMargin = (int) resources.getDimension(R.dimen.g5);
        }
        f.a("app:tux_tagIsHollow", new a.c("true"), tuxTag, layoutParams6);
        f.a("app:tux_tagSize", new a.c("tiny"), tuxTag, layoutParams6);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        f.a("app:tux_tagTextColor", new a.b("2131099676", b.f37372a), tuxTag, layoutParams6);
        f.a("app:tux_tagIconColor", new a.b("2131099676", b.f37372a), tuxTag, layoutParams6);
        f.a(tuxTag, layoutParams6);
        android.view.a.a(tuxTag);
        if (tuxTag.getParent() == null) {
            linearLayout.addView(tuxTag, layoutParams6);
        }
        View translationStatusView = new TranslationStatusView(context);
        translationStatusView.setId(R.id.eqo);
        translationStatusView.setVisibility(8);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            int i6 = Build.VERSION.SDK_INT;
            layoutParams7.setMarginStart((int) resources.getDimension(R.dimen.g5));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            ((ViewGroup.MarginLayoutParams) layoutParams7).leftMargin = (int) resources.getDimension(R.dimen.g5);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            ((ViewGroup.MarginLayoutParams) layoutParams7).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(translationStatusView);
        if (translationStatusView.getParent() == null) {
            linearLayout.addView(translationStatusView, layoutParams7);
        }
        android.view.a.a(linearLayout);
        linearLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        MethodCollector.o(3433);
        return linearLayout;
    }
}
