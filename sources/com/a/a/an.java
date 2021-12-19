package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.rich.ui.RichTagView;
import com.bytedance.ies.xelement.pickview.b.b;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.ui.TagLayout;
import com.ss.android.ugc.aweme.commercialize.link.micro.CommerceMicroTagLayout;
import com.ss.android.ugc.aweme.commercialize.link.video.CommerceTagLayout;
import com.ss.android.ugc.aweme.commercialize.link.video.DouPlusTagLayout;
import com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer;
import com.ss.android.ugc.aweme.commercialize.views.ButtonAdBottomLabelView;
import com.ss.android.ugc.aweme.commercialize.views.CircleWaveLayout;
import com.ss.android.ugc.aweme.feed.adapter.WidgetContainerMonitorView;
import com.ss.android.ugc.aweme.feed.ui.DebugInfoView;
import com.ss.android.ugc.aweme.feed.ui.FeedInterceptTouchLayout;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.aweme.feed.ui.StoryTag;
import com.ss.android.ugc.aweme.miniapp.card.MicroAppVideoCardView;
import com.ss.android.ugc.aweme.setting.ui.RestrictTextView;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.zhiliaoapp.musically.R;

public final class an implements e {
    static {
        Covode.recordClassIndex(1950);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        int i2;
        float f2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        float f3;
        int i20;
        int i21;
        MethodCollector.i(2191);
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.fjk);
        frameLayout.setBackgroundColor(resources.getColor(R.color.a2));
        ViewGroup.LayoutParams a2 = a.a(viewGroup, -1, -1);
        View longPressLayout = new LongPressLayout(context);
        longPressLayout.setId(R.id.cja);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        a.a(longPressLayout);
        if (longPressLayout.getParent() == null) {
            frameLayout.addView(longPressLayout, layoutParams);
        }
        View frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.d6_);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        a.a(frameLayout2);
        if (frameLayout2.getParent() == null) {
            frameLayout.addView(frameLayout2, layoutParams2);
        }
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setId(R.id.agf);
        smartImageView.setBackgroundResource(R.drawable.b1c);
        smartImageView.setVisibility(8);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 17;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams3)) {
            ((DrawerLayout.d) layoutParams3).f2691a = 17;
        }
        a.a(smartImageView);
        if (smartImageView.getParent() == null) {
            frameLayout.addView(smartImageView, layoutParams3);
        }
        View view = new View(context);
        view.setId(R.id.bcv);
        view.setBackgroundResource(R.drawable.a07);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 108.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 48;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 48;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams4)) {
            ((DrawerLayout.d) layoutParams4).f2691a = 48;
        }
        a.a(view);
        if (view.getParent() == null) {
            frameLayout.addView(view, layoutParams4);
        }
        View view2 = new View(context);
        view2.setId(R.id.bct);
        view2.setBackgroundResource(R.drawable.a06);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 90.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = 80;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams5)) {
            ((DrawerLayout.d) layoutParams5).f2691a = 80;
        }
        a.a(view2);
        if (view2.getParent() == null) {
            frameLayout.addView(view2, layoutParams5);
        }
        View frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.bqg);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((LinearLayout.LayoutParams) layoutParams6).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.gravity = 17;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams6)) {
            ((DrawerLayout.d) layoutParams6).f2691a = 17;
        }
        a.a(frameLayout3);
        if (frameLayout3.getParent() == null) {
            frameLayout.addView(frameLayout3, layoutParams6);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.ey);
        ViewGroup.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -1);
        viewStub.setInflatedId(-1);
        a.a(viewStub);
        if (viewStub.getParent() == null) {
            frameLayout.addView(viewStub, layoutParams7);
        }
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.g0);
        viewStub2.setLayoutResource(R.layout.su);
        ViewGroup.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-1, -1);
        viewStub2.setInflatedId(-1);
        a.a(viewStub2);
        if (viewStub2.getParent() == null) {
            frameLayout.addView(viewStub2, layoutParams8);
        }
        ViewStub viewStub3 = new ViewStub(context);
        viewStub3.setId(R.id.b21);
        ViewGroup.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -2);
        viewStub3.setInflatedId(-1);
        a.a(viewStub3);
        if (viewStub3.getParent() == null) {
            frameLayout.addView(viewStub3, layoutParams9);
        }
        WidgetContainerMonitorView widgetContainerMonitorView = new WidgetContainerMonitorView(context);
        widgetContainerMonitorView.setId(R.id.fmg);
        ViewGroup.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-1, -1);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.epk);
        ViewGroup.LayoutParams a3 = a.a(widgetContainerMonitorView, -1, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(a3)) {
            ((RelativeLayout.LayoutParams) a3).addRule(2, R.id.dka);
        }
        View frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.fhw);
        RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 95.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.addRule(12, -1);
        }
        a.a(frameLayout4);
        if (frameLayout4.getParent() == null) {
            relativeLayout.addView(frameLayout4, layoutParams11);
        }
        View space = new Space(context);
        space.setId(R.id.d58);
        RelativeLayout.LayoutParams layoutParams12 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.addRule(2, R.id.q1);
        }
        a.a(space);
        if (space.getParent() == null) {
            relativeLayout.addView(space, layoutParams12);
        }
        View frameLayout5 = new FrameLayout(context);
        frameLayout5.setId(R.id.ffo);
        RelativeLayout.LayoutParams layoutParams13 = new RelativeLayout.LayoutParams(-2, -1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.addRule(2, R.id.q1);
        }
        a.a(frameLayout5);
        if (frameLayout5.getParent() == null) {
            relativeLayout.addView(frameLayout5, layoutParams13);
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setId(R.id.q1);
        RelativeLayout.LayoutParams layoutParams14 = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams14)) {
            layoutParams14.addRule(2, R.id.b4_);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.q0);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams layoutParams15 = new FrameLayout.LayoutParams(-2, -2);
        RemoteImageView remoteImageView = new RemoteImageView(context);
        remoteImageView.setId(R.id.g_);
        remoteImageView.setVisibility(8);
        LinearLayout.LayoutParams layoutParams16 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 76.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams16)) {
            int i22 = Build.VERSION.SDK_INT;
            layoutParams16.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams16)) {
            ((ViewGroup.MarginLayoutParams) layoutParams16).bottomMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        a.a(remoteImageView);
        if (remoteImageView.getParent() == null) {
            linearLayout.addView(remoteImageView, layoutParams16);
        }
        RemoteImageView remoteImageView2 = new RemoteImageView(context);
        remoteImageView2.setId(R.id.fv);
        remoteImageView2.setVisibility(8);
        LinearLayout.LayoutParams layoutParams17 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 76.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams17)) {
            int i23 = Build.VERSION.SDK_INT;
            layoutParams17.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams17)) {
            ((ViewGroup.MarginLayoutParams) layoutParams17).bottomMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        a.a(remoteImageView2);
        if (remoteImageView2.getParent() == null) {
            linearLayout.addView(remoteImageView2, layoutParams17);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.fet);
        linearLayout2.setOrientation(0);
        linearLayout2.setBackgroundResource(R.drawable.a0i);
        linearLayout2.setVisibility(8);
        LinearLayout.LayoutParams layoutParams18 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams18)) {
            int i24 = Build.VERSION.SDK_INT;
            layoutParams18.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams18)) {
            ((ViewGroup.MarginLayoutParams) layoutParams18).bottomMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        linearLayout2.setGravity(16);
        RemoteImageView remoteImageView3 = new RemoteImageView(context);
        remoteImageView3.setId(R.id.feu);
        LinearLayout.LayoutParams layoutParams19 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams19)) {
            int i25 = Build.VERSION.SDK_INT;
            layoutParams19.setMarginStart((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams19)) {
            ((ViewGroup.MarginLayoutParams) layoutParams19).topMargin = (int) TypedValue.applyDimension(1, 3.5f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams19)) {
            ((ViewGroup.MarginLayoutParams) layoutParams19).bottomMargin = (int) TypedValue.applyDimension(1, 3.5f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams19)) {
            int i26 = Build.VERSION.SDK_INT;
            layoutParams19.setMarginEnd((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        com.a.a.a.a.a aVar = new com.a.a.a.a.a();
        aVar.a("app:failureImage", new a.b("2131231787", "drawable"), remoteImageView3, layoutParams19);
        aVar.a("app:actualImageScaleType", new a.c("fitCenter"), remoteImageView3, layoutParams19);
        aVar.a(remoteImageView3, layoutParams19);
        android.view.a.a(remoteImageView3);
        if (remoteImageView3.getParent() == null) {
            linearLayout2.addView(remoteImageView3, layoutParams19);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.fev);
        tuxTextView.setTextColor(resources.getColorStateList(R.color.ac));
        LinearLayout.LayoutParams layoutParams20 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams20)) {
            int i27 = Build.VERSION.SDK_INT;
            i2 = 1;
            layoutParams20.setMarginEnd((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        } else {
            i2 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams20)) {
            f2 = 2.0f;
            ((ViewGroup.MarginLayoutParams) layoutParams20).topMargin = (int) TypedValue.applyDimension(i2, 2.0f, resources.getDisplayMetrics());
        } else {
            f2 = 2.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams20)) {
            ((ViewGroup.MarginLayoutParams) layoutParams20).bottomMargin = (int) TypedValue.applyDimension(i2, f2, resources.getDisplayMetrics());
        }
        f.a("app:tux_font", new a.c("P2_Regular"), tuxTextView, layoutParams20);
        f.a(tuxTextView, layoutParams20);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            linearLayout2.addView(tuxTextView, layoutParams20);
        }
        android.view.a.a(linearLayout2);
        if (linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2, layoutParams18);
        }
        View frameLayout7 = new FrameLayout(context);
        frameLayout7.setId(R.id.b6q);
        frameLayout7.setVisibility(8);
        ViewGroup.LayoutParams layoutParams21 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()));
        android.view.a.a(frameLayout7);
        if (frameLayout7.getParent() == null) {
            linearLayout.addView(frameLayout7, layoutParams21);
        }
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setId(R.id.fhb);
        ViewGroup.LayoutParams layoutParams22 = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams23 = new FrameLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams23)) {
            int i28 = Build.VERSION.SDK_INT;
            layoutParams23.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams23)) {
            i3 = 1;
            ((ViewGroup.MarginLayoutParams) layoutParams23).bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        } else {
            i3 = 1;
        }
        StoryTag storyTag = new StoryTag(context);
        storyTag.setId(R.id.ec8);
        storyTag.setPadding((int) TypedValue.applyDimension(i3, 5.0f, resources.getDisplayMetrics()), storyTag.getPaddingTop(), storyTag.getPaddingRight(), storyTag.getPaddingBottom());
        storyTag.setPadding(storyTag.getPaddingLeft(), storyTag.getPaddingTop(), (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), storyTag.getPaddingBottom());
        storyTag.setBackgroundColor(resources.getColor(R.color.c9));
        storyTag.setVisibility(8);
        LinearLayout.LayoutParams layoutParams24 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 22.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams24)) {
            int i29 = Build.VERSION.SDK_INT;
            i4 = 1;
            layoutParams24.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        } else {
            i4 = 1;
        }
        storyTag.setGravity(16);
        TuxIconView tuxIconView = new TuxIconView(context);
        ViewGroup.MarginLayoutParams a4 = android.view.a.a(storyTag, (int) TypedValue.applyDimension(i4, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(i4, 12.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(a4)) {
            int i30 = Build.VERSION.SDK_INT;
            a4.setMarginEnd((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(a4)) {
            i5 = 16;
            ((LinearLayout.LayoutParams) a4).gravity = 16;
        } else {
            i5 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a4)) {
            ((FrameLayout.LayoutParams) a4).gravity = i5;
        }
        if (DrawerLayout.d.class.isInstance(a4)) {
            ((DrawerLayout.d) a4).f2691a = i5;
        }
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_icon", new a.b("2131755499", "raw"), tuxIconView, a4);
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_tintColor", new a.b("2130968613", "attr"), tuxIconView, a4);
        com.ss.android.ugc.aweme.tux.a.j.e.a(tuxIconView, a4);
        android.view.a.a(tuxIconView);
        if (tuxIconView.getParent() == null) {
            storyTag.addView(tuxIconView, a4);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setText(R.string.g9a);
        tuxTextView2.setTextColor(resources.getColorStateList(R.color.a9));
        ViewGroup.MarginLayoutParams a5 = android.view.a.a(storyTag, -2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(a5)) {
            i6 = 16;
            ((LinearLayout.LayoutParams) a5).gravity = 16;
        } else {
            i6 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a5)) {
            ((FrameLayout.LayoutParams) a5).gravity = i6;
        }
        if (DrawerLayout.d.class.isInstance(a5)) {
            ((DrawerLayout.d) a5).f2691a = i6;
        }
        f.a("app:tux_font", new a.c("P3_Semibold"), tuxTextView2, a5);
        f.a(tuxTextView2, a5);
        android.view.a.a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            storyTag.addView(tuxTextView2, a5);
        }
        android.view.a.a(storyTag);
        if (storyTag.getParent() == null) {
            linearLayout3.addView(storyTag, layoutParams24);
        }
        View tagLayout = new TagLayout(context);
        tagLayout.setId(R.id.fhk);
        ViewGroup.LayoutParams layoutParams25 = new LinearLayout.LayoutParams(-1, -2);
        android.view.a.a(tagLayout);
        if (tagLayout.getParent() == null) {
            linearLayout3.addView(tagLayout, layoutParams25);
        }
        android.view.a.a(linearLayout3);
        if (linearLayout3.getParent() == null) {
            frameLayout8.addView(linearLayout3, layoutParams23);
        }
        View animationImageView = new AnimationImageView(context);
        animationImageView.setId(R.id.fh0);
        FrameLayout.LayoutParams layoutParams26 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 88.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 66.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams26)) {
            ((ViewGroup.MarginLayoutParams) layoutParams26).bottomMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(animationImageView);
        if (animationImageView.getParent() == null) {
            frameLayout8.addView(animationImageView, layoutParams26);
        }
        android.view.a.a(frameLayout8);
        if (frameLayout8.getParent() == null) {
            linearLayout.addView(frameLayout8, layoutParams22);
        }
        View commerceMicroTagLayout = new CommerceMicroTagLayout(context);
        commerceMicroTagLayout.setId(R.id.cm9);
        commerceMicroTagLayout.setVisibility(8);
        LinearLayout.LayoutParams layoutParams27 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams27)) {
            int i31 = Build.VERSION.SDK_INT;
            layoutParams27.setMarginStart((int) resources.getDimension(R.dimen.g5));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams27)) {
            int i32 = Build.VERSION.SDK_INT;
            layoutParams27.setMarginEnd((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams27)) {
            ((ViewGroup.MarginLayoutParams) layoutParams27).bottomMargin = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(commerceMicroTagLayout);
        if (commerceMicroTagLayout.getParent() == null) {
            linearLayout.addView(commerceMicroTagLayout, layoutParams27);
        }
        View commerceTagLayout = new CommerceTagLayout(context);
        commerceTagLayout.setId(R.id.caz);
        commerceTagLayout.setVisibility(8);
        LinearLayout.LayoutParams layoutParams28 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams28)) {
            int i33 = Build.VERSION.SDK_INT;
            layoutParams28.setMarginStart((int) resources.getDimension(R.dimen.g5));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams28)) {
            ((ViewGroup.MarginLayoutParams) layoutParams28).bottomMargin = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(commerceTagLayout);
        if (commerceTagLayout.getParent() == null) {
            linearLayout.addView(commerceTagLayout, layoutParams28);
        }
        View douPlusTagLayout = new DouPlusTagLayout(context);
        douPlusTagLayout.setId(R.id.aoq);
        douPlusTagLayout.setVisibility(8);
        LinearLayout.LayoutParams layoutParams29 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams29)) {
            int i34 = Build.VERSION.SDK_INT;
            layoutParams29.setMarginStart((int) resources.getDimension(R.dimen.g5));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams29)) {
            int i35 = Build.VERSION.SDK_INT;
            layoutParams29.setMarginEnd((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams29)) {
            ((ViewGroup.MarginLayoutParams) layoutParams29).bottomMargin = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(douPlusTagLayout);
        if (douPlusTagLayout.getParent() == null) {
            linearLayout.addView(douPlusTagLayout, layoutParams29);
        }
        View feedInterceptTouchLayout = new FeedInterceptTouchLayout(context, (byte) 0);
        feedInterceptTouchLayout.setId(R.id.b23);
        ViewGroup.LayoutParams layoutParams30 = new LinearLayout.LayoutParams(-2, -2);
        android.view.a.a(feedInterceptTouchLayout);
        if (feedInterceptTouchLayout.getParent() == null) {
            linearLayout.addView(feedInterceptTouchLayout, layoutParams30);
        }
        View frameLayout9 = new FrameLayout(context);
        frameLayout9.setId(R.id.b20);
        ViewGroup.LayoutParams layoutParams31 = new LinearLayout.LayoutParams(-2, -2);
        android.view.a.a(frameLayout9);
        if (frameLayout9.getParent() == null) {
            linearLayout.addView(frameLayout9, layoutParams31);
        }
        View feedInterceptTouchLayout2 = new FeedInterceptTouchLayout(context, (byte) 0);
        feedInterceptTouchLayout2.setId(R.id.c4q);
        LinearLayout.LayoutParams layoutParams32 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams32)) {
            int i36 = Build.VERSION.SDK_INT;
            layoutParams32.setMarginStart((int) resources.getDimension(R.dimen.g5));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams32)) {
            int i37 = Build.VERSION.SDK_INT;
            layoutParams32.setMarginEnd((int) resources.getDimension(R.dimen.g6));
        }
        android.view.a.a(feedInterceptTouchLayout2);
        if (feedInterceptTouchLayout2.getParent() == null) {
            linearLayout.addView(feedInterceptTouchLayout2, layoutParams32);
        }
        View feedInterceptTouchLayout3 = new FeedInterceptTouchLayout(context, (byte) 0);
        feedInterceptTouchLayout3.setId(R.id.fhu);
        LinearLayout.LayoutParams layoutParams33 = new LinearLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams33)) {
            ((RelativeLayout.LayoutParams) layoutParams33).addRule(2, R.id.du);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams33)) {
            ((ViewGroup.MarginLayoutParams) layoutParams33).bottomMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(feedInterceptTouchLayout3);
        if (feedInterceptTouchLayout3.getParent() == null) {
            linearLayout.addView(feedInterceptTouchLayout3, layoutParams33);
        }
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setId(R.id.du);
        linearLayout4.setOrientation(0);
        LinearLayout.LayoutParams layoutParams34 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 200.0f, resources.getDisplayMetrics()), -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams34)) {
            ((RelativeLayout.LayoutParams) layoutParams34).addRule(2, R.id.fhx);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams34)) {
            int i38 = Build.VERSION.SDK_INT;
            i7 = 1;
            layoutParams34.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        } else {
            i7 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams34)) {
            ((ViewGroup.MarginLayoutParams) layoutParams34).bottomMargin = (int) TypedValue.applyDimension(i7, 6.0f, resources.getDisplayMetrics());
        }
        RichTagView richTagView = new RichTagView(context);
        richTagView.setId(R.id.dt);
        LinearLayout.LayoutParams layoutParams35 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams35)) {
            i8 = 16;
            layoutParams35.gravity = 16;
        } else {
            i8 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams35)) {
            ((FrameLayout.LayoutParams) layoutParams35).gravity = i8;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams35)) {
            ((DrawerLayout.d) layoutParams35).f2691a = i8;
        }
        android.view.a.a(richTagView);
        if (richTagView.getParent() == null) {
            linearLayout4.addView(richTagView, layoutParams35);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.cmp);
        tuxTextView3.setVisibility(8);
        tuxTextView3.setTextColor(resources.getColorStateList(R.color.a_));
        LinearLayout.LayoutParams layoutParams36 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams36)) {
            int i39 = Build.VERSION.SDK_INT;
            layoutParams36.setMarginStart((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams36)) {
            i9 = 16;
            layoutParams36.gravity = 16;
        } else {
            i9 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams36)) {
            ((FrameLayout.LayoutParams) layoutParams36).gravity = i9;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams36)) {
            ((DrawerLayout.d) layoutParams36).f2691a = i9;
        }
        android.view.a.a(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            linearLayout4.addView(tuxTextView3, layoutParams36);
        }
        TuxTextView tuxTextView4 = new TuxTextView(context);
        tuxTextView4.setId(R.id.cmo);
        tuxTextView4.setMaxLines(1);
        tuxTextView4.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView4.setVisibility(8);
        tuxTextView4.setTextColor(resources.getColorStateList(R.color.a_));
        LinearLayout.LayoutParams layoutParams37 = new LinearLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams37)) {
            i10 = 16;
            layoutParams37.gravity = 16;
        } else {
            i10 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams37)) {
            ((FrameLayout.LayoutParams) layoutParams37).gravity = i10;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams37)) {
            ((DrawerLayout.d) layoutParams37).f2691a = i10;
        }
        f.a("app:tux_font", new a.c("H4_Semibold"), tuxTextView4, layoutParams37);
        f.a(tuxTextView4, layoutParams37);
        android.view.a.a(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            linearLayout4.addView(tuxTextView4, layoutParams37);
        }
        android.view.a.a(linearLayout4);
        if (linearLayout4.getParent() == null) {
            linearLayout.addView(linearLayout4, layoutParams34);
        }
        FrameLayout frameLayout10 = new FrameLayout(context);
        ViewGroup.LayoutParams layoutParams38 = new LinearLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams38)) {
            ((RelativeLayout.LayoutParams) layoutParams38).addRule(2, R.id.aqa);
        }
        FeedInterceptTouchLayout feedInterceptTouchLayout4 = new FeedInterceptTouchLayout(context, (byte) 0);
        feedInterceptTouchLayout4.setId(R.id.fhx);
        feedInterceptTouchLayout4.setPadding(feedInterceptTouchLayout4.getPaddingLeft(), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), feedInterceptTouchLayout4.getPaddingRight(), feedInterceptTouchLayout4.getPaddingBottom());
        FrameLayout.LayoutParams layoutParams39 = new FrameLayout.LayoutParams((int) resources.getDimension(R.dimen.g1), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams39)) {
            ((ViewGroup.MarginLayoutParams) layoutParams39).bottomMargin = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams39)) {
            int i40 = Build.VERSION.SDK_INT;
            layoutParams39.setMarginEnd((int) TypedValue.applyDimension(1, 90.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams39)) {
            int i41 = Build.VERSION.SDK_INT;
            layoutParams39.setMarginStart((int) resources.getDimension(R.dimen.g5));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams39)) {
            ((ViewGroup.MarginLayoutParams) layoutParams39).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(feedInterceptTouchLayout4);
        if (feedInterceptTouchLayout4.getParent() == null) {
            frameLayout10.addView(feedInterceptTouchLayout4, layoutParams39);
        }
        android.view.a.a(frameLayout10);
        if (frameLayout10.getParent() == null) {
            linearLayout.addView(frameLayout10, layoutParams38);
        }
        View frameLayout11 = new FrameLayout(context);
        frameLayout11.setId(R.id.fg4);
        LinearLayout.LayoutParams layoutParams40 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams40)) {
            int i42 = Build.VERSION.SDK_INT;
            layoutParams40.setMarginStart((int) resources.getDimension(R.dimen.g5));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams40)) {
            int i43 = Build.VERSION.SDK_INT;
            layoutParams40.setMarginEnd((int) resources.getDimension(R.dimen.g6));
        }
        android.view.a.a(frameLayout11);
        if (frameLayout11.getParent() == null) {
            linearLayout.addView(frameLayout11, layoutParams40);
        }
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setId(R.id.de9);
        linearLayout5.setBackgroundResource(R.drawable.a08);
        linearLayout5.setOrientation(0);
        linearLayout5.setVisibility(8);
        LinearLayout.LayoutParams layoutParams41 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 270.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        linearLayout5.setGravity(17);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams41)) {
            ((ViewGroup.MarginLayoutParams) layoutParams41).topMargin = (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams41)) {
            int i44 = Build.VERSION.SDK_INT;
            layoutParams41.setMarginStart((int) resources.getDimension(R.dimen.g5));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams41)) {
            int i45 = Build.VERSION.SDK_INT;
            layoutParams41.setMarginEnd((int) resources.getDimension(R.dimen.g6));
        }
        if (ConstraintLayout.a.class.isInstance(layoutParams41)) {
            i11 = 0;
            ((ConstraintLayout.a) layoutParams41).s = 0;
        } else {
            i11 = 0;
        }
        if (ConstraintLayout.a.class.isInstance(layoutParams41)) {
            ((ConstraintLayout.a) layoutParams41).q = i11;
        }
        if (ConstraintLayout.a.class.isInstance(layoutParams41)) {
            ((ConstraintLayout.a) layoutParams41).f2052i = R.id.bbl;
        }
        TuxIconView tuxIconView2 = new TuxIconView(context);
        LinearLayout.LayoutParams layoutParams42 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_tintColor", new a.b("2131099683", b.f37372a), tuxIconView2, layoutParams42);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams42)) {
            i12 = 17;
            layoutParams42.gravity = 17;
        } else {
            i12 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams42)) {
            ((FrameLayout.LayoutParams) layoutParams42).gravity = i12;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams42)) {
            ((DrawerLayout.d) layoutParams42).f2691a = i12;
        }
        com.ss.android.ugc.aweme.tux.a.j.e.a("app:tux_icon", new a.b("2131755454", "raw"), tuxIconView2, layoutParams42);
        com.ss.android.ugc.aweme.tux.a.j.e.a(tuxIconView2, layoutParams42);
        android.view.a.a(tuxIconView2);
        if (tuxIconView2.getParent() == null) {
            linearLayout5.addView(tuxIconView2, layoutParams42);
        }
        TuxTextView tuxTextView5 = new TuxTextView(context);
        tuxTextView5.setText(R.string.f4p);
        tuxTextView5.setTextColor(resources.getColorStateList(R.color.a9));
        LinearLayout.LayoutParams layoutParams43 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams43)) {
            int i46 = Build.VERSION.SDK_INT;
            layoutParams43.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams43)) {
            i13 = 16;
            layoutParams43.gravity = 16;
        } else {
            i13 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams43)) {
            ((FrameLayout.LayoutParams) layoutParams43).gravity = i13;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams43)) {
            ((DrawerLayout.d) layoutParams43).f2691a = i13;
        }
        f.a("app:tux_font", new a.c("P1_Semibold"), tuxTextView5, layoutParams43);
        f.a(tuxTextView5, layoutParams43);
        android.view.a.a(tuxTextView5);
        if (tuxTextView5.getParent() == null) {
            linearLayout5.addView(tuxTextView5, layoutParams43);
        }
        android.view.a.a(linearLayout5);
        if (linearLayout5.getParent() == null) {
            linearLayout.addView(linearLayout5, layoutParams41);
        }
        FrameLayout frameLayout12 = new FrameLayout(context);
        ViewGroup.LayoutParams layoutParams44 = new LinearLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams44)) {
            ((RelativeLayout.LayoutParams) layoutParams44).addRule(2, R.id.csi);
        }
        FrameLayout frameLayout13 = new FrameLayout(context);
        frameLayout13.setId(R.id.aqa);
        frameLayout13.setPadding(frameLayout13.getPaddingLeft(), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), frameLayout13.getPaddingRight(), frameLayout13.getPaddingBottom());
        FrameLayout.LayoutParams layoutParams45 = new FrameLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams45)) {
            ((ViewGroup.MarginLayoutParams) layoutParams45).bottomMargin = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams45)) {
            int i47 = Build.VERSION.SDK_INT;
            layoutParams45.setMarginStart((int) resources.getDimension(R.dimen.g5));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams45)) {
            ((ViewGroup.MarginLayoutParams) layoutParams45).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(frameLayout13);
        if (frameLayout13.getParent() == null) {
            frameLayout12.addView(frameLayout13, layoutParams45);
        }
        android.view.a.a(frameLayout12);
        if (frameLayout12.getParent() == null) {
            linearLayout.addView(frameLayout12, layoutParams44);
        }
        FrameLayout frameLayout14 = new FrameLayout(context);
        frameLayout14.setId(R.id.csi);
        ViewGroup.LayoutParams layoutParams46 = new LinearLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams46)) {
            ((RelativeLayout.LayoutParams) layoutParams46).addRule(12, -1);
        }
        ButtonAdBottomLabelView buttonAdBottomLabelView = new ButtonAdBottomLabelView(context);
        buttonAdBottomLabelView.setId(R.id.csj);
        FrameLayout.LayoutParams layoutParams47 = new FrameLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams47)) {
            int i48 = Build.VERSION.SDK_INT;
            layoutParams47.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams47)) {
            ((ViewGroup.MarginLayoutParams) layoutParams47).topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams47)) {
            ((ViewGroup.MarginLayoutParams) layoutParams47).bottomMargin = (int) resources.getDimension(R.dimen.g3);
        }
        android.view.a.a(buttonAdBottomLabelView);
        if (buttonAdBottomLabelView.getParent() == null) {
            frameLayout14.addView(buttonAdBottomLabelView, layoutParams47);
        }
        android.view.a.a(frameLayout14);
        if (frameLayout14.getParent() == null) {
            linearLayout.addView(frameLayout14, layoutParams46);
        }
        View frameLayout15 = new FrameLayout(context);
        frameLayout15.setId(R.id.az0);
        LinearLayout.LayoutParams layoutParams48 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams48)) {
            int i49 = Build.VERSION.SDK_INT;
            layoutParams48.setMarginStart((int) resources.getDimension(R.dimen.g5));
        }
        android.view.a.a(frameLayout15);
        if (frameLayout15.getParent() == null) {
            linearLayout.addView(frameLayout15, layoutParams48);
        }
        View space2 = new Space(context);
        space2.setId(R.id.bqv);
        space2.setVisibility(8);
        ViewGroup.LayoutParams layoutParams49 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        android.view.a.a(space2);
        if (space2.getParent() == null) {
            linearLayout.addView(space2, layoutParams49);
        }
        android.view.a.a(linearLayout);
        if (linearLayout.getParent() == null) {
            frameLayout6.addView(linearLayout, layoutParams15);
        }
        View frameLayout16 = new FrameLayout(context);
        frameLayout16.setId(R.id.dbm);
        frameLayout16.setVisibility(8);
        ViewGroup.LayoutParams layoutParams50 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 256.0f, resources.getDisplayMetrics()));
        android.view.a.a(frameLayout16);
        if (frameLayout16.getParent() == null) {
            frameLayout6.addView(frameLayout16, layoutParams50);
        }
        android.view.a.a(frameLayout6);
        if (frameLayout6.getParent() == null) {
            relativeLayout.addView(frameLayout6, layoutParams14);
        }
        View frameLayout17 = new FrameLayout(context);
        frameLayout17.setId(R.id.ed);
        frameLayout17.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams51 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams51)) {
            layoutParams51.addRule(2, R.id.b4_);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams51)) {
            int i50 = Build.VERSION.SDK_INT;
            layoutParams51.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        android.view.a.a(frameLayout17);
        if (frameLayout17.getParent() == null) {
            relativeLayout.addView(frameLayout17, layoutParams51);
        }
        View feedInterceptTouchLayout5 = new FeedInterceptTouchLayout(context, (byte) 0);
        feedInterceptTouchLayout5.setId(R.id.dls);
        RelativeLayout.LayoutParams layoutParams52 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams52)) {
            layoutParams52.addRule(2, R.id.dnh);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams52)) {
            layoutParams52.addRule(21, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams52)) {
            ((ViewGroup.MarginLayoutParams) layoutParams52).bottomMargin = (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams52)) {
            int i51 = Build.VERSION.SDK_INT;
            layoutParams52.setMarginEnd((int) TypedValue.applyDimension(1, 17.0f, resources.getDisplayMetrics()));
        }
        android.view.a.a(feedInterceptTouchLayout5);
        if (feedInterceptTouchLayout5.getParent() == null) {
            relativeLayout.addView(feedInterceptTouchLayout5, layoutParams52);
        }
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setId(R.id.dnh);
        linearLayout6.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams53 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams53)) {
            layoutParams53.addRule(2, R.id.fhw);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams53)) {
            i14 = -1;
            layoutParams53.addRule(21, -1);
        } else {
            i14 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams53)) {
            layoutParams53.addRule(11, i14);
        }
        linearLayout6.setGravity(8388613);
        CircleWaveLayout circleWaveLayout = new CircleWaveLayout(context);
        circleWaveLayout.setId(R.id.f363do);
        circleWaveLayout.setVisibility(8);
        LinearLayout.LayoutParams layoutParams54 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 61.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 61.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams54)) {
            layoutParams54.gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams54)) {
            ((FrameLayout.LayoutParams) layoutParams54).gravity = 1;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams54)) {
            ((DrawerLayout.d) layoutParams54).f2691a = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams54)) {
            ((ViewGroup.MarginLayoutParams) layoutParams54).bottomMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(circleWaveLayout);
        if (circleWaveLayout.getParent() == null) {
            linearLayout6.addView(circleWaveLayout, layoutParams54);
        }
        FrameLayout frameLayout18 = new FrameLayout(context);
        frameLayout18.setId(R.id.pg);
        LinearLayout.LayoutParams layoutParams55 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams55)) {
            int i52 = Build.VERSION.SDK_INT;
            layoutParams55.setMarginEnd((int) TypedValue.applyDimension(1, -1.0f, resources.getDisplayMetrics()));
        }
        android.view.a.a(frameLayout18);
        if (frameLayout18.getParent() == null) {
            linearLayout6.addView(frameLayout18, layoutParams55);
        }
        FeedInterceptTouchLayout feedInterceptTouchLayout6 = new FeedInterceptTouchLayout(context, (byte) 0);
        feedInterceptTouchLayout6.setId(R.id.am5);
        LinearLayout.LayoutParams layoutParams56 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams56)) {
            int i53 = Build.VERSION.SDK_INT;
            layoutParams56.setMarginEnd((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        android.view.a.a(feedInterceptTouchLayout6);
        if (feedInterceptTouchLayout6.getParent() == null) {
            linearLayout6.addView(feedInterceptTouchLayout6, layoutParams56);
        }
        FeedInterceptTouchLayout feedInterceptTouchLayout7 = new FeedInterceptTouchLayout(context, (byte) 0);
        feedInterceptTouchLayout7.setId(R.id.a_k);
        LinearLayout.LayoutParams layoutParams57 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams57)) {
            int i54 = Build.VERSION.SDK_INT;
            layoutParams57.setMarginEnd((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        android.view.a.a(feedInterceptTouchLayout7);
        if (feedInterceptTouchLayout7.getParent() == null) {
            linearLayout6.addView(feedInterceptTouchLayout7, layoutParams57);
        }
        FeedInterceptTouchLayout feedInterceptTouchLayout8 = new FeedInterceptTouchLayout(context, (byte) 0);
        feedInterceptTouchLayout8.setId(R.id.e11);
        LinearLayout.LayoutParams layoutParams58 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams58)) {
            int i55 = Build.VERSION.SDK_INT;
            layoutParams58.setMarginEnd((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        android.view.a.a(feedInterceptTouchLayout8);
        if (feedInterceptTouchLayout8.getParent() == null) {
            linearLayout6.addView(feedInterceptTouchLayout8, layoutParams58);
        }
        FeedInterceptTouchLayout feedInterceptTouchLayout9 = new FeedInterceptTouchLayout(context, (byte) 0);
        feedInterceptTouchLayout9.setId(R.id.co7);
        LinearLayout.LayoutParams layoutParams59 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams59)) {
            int i56 = Build.VERSION.SDK_INT;
            layoutParams59.setMarginEnd((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        android.view.a.a(feedInterceptTouchLayout9);
        if (feedInterceptTouchLayout9.getParent() == null) {
            linearLayout6.addView(feedInterceptTouchLayout9, layoutParams59);
        }
        android.view.a.a(linearLayout6);
        if (linearLayout6.getParent() == null) {
            relativeLayout.addView(linearLayout6, layoutParams53);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.bwy);
        appCompatImageView.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams60 = new RelativeLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams60)) {
            layoutParams60.addRule(8, R.id.dnh);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams60)) {
            int i57 = Build.VERSION.SDK_INT;
            i15 = 1;
            layoutParams60.setMarginEnd((int) TypedValue.applyDimension(1, -17.0f, resources.getDisplayMetrics()));
        } else {
            i15 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams60)) {
            ((ViewGroup.MarginLayoutParams) layoutParams60).bottomMargin = (int) TypedValue.applyDimension(i15, 15.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams60)) {
            layoutParams60.addRule(16, R.id.dnh);
        }
        android.view.a.a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            relativeLayout.addView(appCompatImageView, layoutParams60);
        }
        View frameLayout19 = new FrameLayout(context);
        frameLayout19.setId(R.id.b4_);
        RelativeLayout.LayoutParams layoutParams61 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams61)) {
            layoutParams61.addRule(12, -1);
        }
        android.view.a.a(frameLayout19);
        if (frameLayout19.getParent() == null) {
            relativeLayout.addView(frameLayout19, layoutParams61);
        }
        android.view.a.a(relativeLayout);
        if (relativeLayout.getParent() == null) {
            widgetContainerMonitorView.addView(relativeLayout, a3);
        }
        FrameLayout frameLayout20 = new FrameLayout(context);
        frameLayout20.setId(R.id.dka);
        ViewGroup.MarginLayoutParams a6 = android.view.a.a(widgetContainerMonitorView, -1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(a6)) {
            ((RelativeLayout.LayoutParams) a6).addRule(12, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a6)) {
            i16 = 1;
            a6.bottomMargin = (int) TypedValue.applyDimension(1, 47.0f, resources.getDisplayMetrics());
        } else {
            i16 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a6)) {
            a6.topMargin = (int) TypedValue.applyDimension(i16, 10.0f, resources.getDisplayMetrics());
        }
        LinearLayout linearLayout7 = new LinearLayout(context);
        linearLayout7.setOrientation(i16);
        ViewGroup.LayoutParams layoutParams62 = new FrameLayout.LayoutParams(-1, -2);
        View frameLayout21 = new FrameLayout(context);
        frameLayout21.setId(R.id.ec4);
        frameLayout21.setVisibility(8);
        LinearLayout.LayoutParams layoutParams63 = new LinearLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams63)) {
            i17 = 80;
            layoutParams63.gravity = 80;
        } else {
            i17 = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams63)) {
            ((FrameLayout.LayoutParams) layoutParams63).gravity = i17;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams63)) {
            ((DrawerLayout.d) layoutParams63).f2691a = i17;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams63)) {
            ((ViewGroup.MarginLayoutParams) layoutParams63).bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(frameLayout21);
        if (frameLayout21.getParent() == null) {
            linearLayout7.addView(frameLayout21, layoutParams63);
        }
        View frameLayout22 = new FrameLayout(context);
        frameLayout22.setId(R.id.eci);
        frameLayout22.setVisibility(8);
        LinearLayout.LayoutParams layoutParams64 = new LinearLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams64)) {
            i18 = 80;
            layoutParams64.gravity = 80;
        } else {
            i18 = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams64)) {
            ((FrameLayout.LayoutParams) layoutParams64).gravity = i18;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams64)) {
            ((DrawerLayout.d) layoutParams64).f2691a = i18;
        }
        android.view.a.a(frameLayout22);
        if (frameLayout22.getParent() == null) {
            linearLayout7.addView(frameLayout22, layoutParams64);
        }
        View a7 = com.a.b.a.a(context, R.layout.rp, linearLayout7, false, 0);
        a7.setId(R.id.akv);
        a7.setVisibility(8);
        ViewGroup.LayoutParams layoutParams65 = new LinearLayout.LayoutParams(-1, -2);
        if (a7.getParent() == null) {
            linearLayout7.addView(a7, layoutParams65);
        }
        FrameLayout frameLayout23 = new FrameLayout(context);
        frameLayout23.setId(R.id.uw);
        ViewGroup.LayoutParams layoutParams66 = new LinearLayout.LayoutParams(-1, -2);
        View a8 = com.a.b.a.a(context, R.layout.tf, frameLayout23, false, 0);
        a8.setId(R.id.b1v);
        a8.setVisibility(8);
        FrameLayout.LayoutParams layoutParams67 = new FrameLayout.LayoutParams(-1, -2);
        if (a8.getParent() == null) {
            frameLayout23.addView(a8, layoutParams67);
        }
        View a9 = com.a.b.a.a(context, R.layout.rq, frameLayout23, false, 0);
        a9.setId(R.id.eb);
        a9.setVisibility(8);
        FrameLayout.LayoutParams layoutParams68 = new FrameLayout.LayoutParams(-1, -2);
        if (a9.getParent() == null) {
            frameLayout23.addView(a9, layoutParams68);
        }
        View a10 = com.a.b.a.a(context, R.layout.sw, frameLayout23, false, 0);
        a10.setId(R.id.e0p);
        a10.setVisibility(8);
        FrameLayout.LayoutParams layoutParams69 = new FrameLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.fo));
        if (a10.getParent() == null) {
            frameLayout23.addView(a10, layoutParams69);
        }
        ViewStub viewStub4 = new ViewStub(context);
        viewStub4.setId(R.id.b25);
        viewStub4.setVisibility(8);
        FrameLayout.LayoutParams layoutParams70 = new FrameLayout.LayoutParams(-1, -2);
        viewStub4.setInflatedId(-1);
        android.view.a.a(viewStub4);
        if (viewStub4.getParent() == null) {
            frameLayout23.addView(viewStub4, layoutParams70);
        }
        View a11 = com.a.b.a.a(context, R.layout.tg, frameLayout23, false, 0);
        a11.setId(R.id.b1y);
        a11.setVisibility(8);
        FrameLayout.LayoutParams layoutParams71 = new FrameLayout.LayoutParams(-1, -2);
        if (a11.getParent() == null) {
            frameLayout23.addView(a11, layoutParams71);
        }
        View a12 = com.a.b.a.a(context, R.layout.s_, frameLayout23, false, 0);
        a12.setId(R.id.bbk);
        a12.setVisibility(8);
        FrameLayout.LayoutParams layoutParams72 = new FrameLayout.LayoutParams(-1, -2);
        if (a12.getParent() == null) {
            frameLayout23.addView(a12, layoutParams72);
        }
        View a13 = com.a.b.a.a(context, R.layout.td, frameLayout23, false, 0);
        a13.setId(R.id.dk2);
        a13.setVisibility(8);
        FrameLayout.LayoutParams layoutParams73 = new FrameLayout.LayoutParams(-1, -2);
        if (a13.getParent() == null) {
            frameLayout23.addView(a13, layoutParams73);
        }
        android.view.a.a(frameLayout23);
        if (frameLayout23.getParent() == null) {
            linearLayout7.addView(frameLayout23, layoutParams66);
        }
        View frameLayout24 = new FrameLayout(context);
        frameLayout24.setId(R.id.vu);
        ViewGroup.LayoutParams layoutParams74 = new LinearLayout.LayoutParams(-1, -2);
        android.view.a.a(frameLayout24);
        if (frameLayout24.getParent() == null) {
            linearLayout7.addView(frameLayout24, layoutParams74);
        }
        View view3 = new View(context);
        view3.setId(R.id.ffz);
        view3.setBackgroundColor(resources.getColor(R.color.c9));
        view3.setVisibility(8);
        ViewGroup.LayoutParams layoutParams75 = new LinearLayout.LayoutParams(-1, -2);
        android.view.a.a(view3);
        if (view3.getParent() == null) {
            linearLayout7.addView(view3, layoutParams75);
        }
        android.view.a.a(linearLayout7);
        if (linearLayout7.getParent() == null) {
            frameLayout20.addView(linearLayout7, layoutParams62);
        }
        android.view.a.a(frameLayout20);
        if (frameLayout20.getParent() == null) {
            widgetContainerMonitorView.addView(frameLayout20, a6);
        }
        View frameLayout25 = new FrameLayout(context);
        frameLayout25.setId(R.id.ecr);
        ViewGroup.LayoutParams a14 = android.view.a.a(widgetContainerMonitorView, -1, (int) TypedValue.applyDimension(1, 256.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(a14)) {
            ((RelativeLayout.LayoutParams) a14).addRule(2, R.id.dka);
        }
        android.view.a.a(frameLayout25);
        if (frameLayout25.getParent() == null) {
            widgetContainerMonitorView.addView(frameLayout25, a14);
        }
        View debugInfoView = new DebugInfoView(context);
        debugInfoView.setId(R.id.aii);
        debugInfoView.setVisibility(8);
        ViewGroup.MarginLayoutParams a15 = android.view.a.a(widgetContainerMonitorView, -1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(a15)) {
            a15.bottomMargin = (int) TypedValue.applyDimension(1, 210.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a15)) {
            int i58 = Build.VERSION.SDK_INT;
            a15.setMarginEnd((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a15)) {
            int i59 = Build.VERSION.SDK_INT;
            a15.setMarginStart((int) resources.getDimension(R.dimen.g5));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a15)) {
            a15.topMargin = (int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(debugInfoView);
        if (debugInfoView.getParent() == null) {
            widgetContainerMonitorView.addView(debugInfoView, a15);
        }
        RestrictTextView restrictTextView = new RestrictTextView(context);
        restrictTextView.setId(R.id.f60);
        restrictTextView.setShadowLayer(restrictTextView.getShadowRadius(), restrictTextView.getShadowDx(), restrictTextView.getShadowDy(), resources.getColor(R.color.f159928l));
        restrictTextView.setShadowLayer(restrictTextView.getShadowRadius(), restrictTextView.getShadowDx(), 1.0f, restrictTextView.getShadowColor());
        restrictTextView.setShadowLayer(1.0f, restrictTextView.getShadowDx(), restrictTextView.getShadowDy(), restrictTextView.getShadowColor());
        restrictTextView.setTextColor(resources.getColorStateList(R.color.nq));
        restrictTextView.setTextSize(2, 16.0f);
        restrictTextView.setVisibility(8);
        ViewGroup.MarginLayoutParams a16 = android.view.a.a(widgetContainerMonitorView, -2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(a16)) {
            int i60 = Build.VERSION.SDK_INT;
            i19 = 1;
            a16.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        } else {
            i19 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a16)) {
            a16.topMargin = (int) TypedValue.applyDimension(i19, 100.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(restrictTextView);
        if (restrictTextView.getParent() == null) {
            widgetContainerMonitorView.addView(restrictTextView, a16);
        }
        TuxTextView tuxTextView6 = new TuxTextView(context);
        tuxTextView6.setId(R.id.faw);
        tuxTextView6.setText(R.string.har);
        tuxTextView6.setTextAlignment(4);
        tuxTextView6.setTextColor(resources.getColorStateList(R.color.a9));
        tuxTextView6.setVisibility(8);
        ViewGroup.LayoutParams a17 = android.view.a.a(widgetContainerMonitorView, -2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(a17)) {
            ((RelativeLayout.LayoutParams) a17).addRule(13, -1);
        }
        tuxTextView6.setGravity(17);
        f.a("app:tux_font", new a.c("P2_Regular"), tuxTextView6, a17);
        f.a(tuxTextView6, a17);
        android.view.a.a(tuxTextView6);
        if (tuxTextView6.getParent() == null) {
            widgetContainerMonitorView.addView(tuxTextView6, a17);
        }
        View frameLayout26 = new FrameLayout(context);
        frameLayout26.setId(R.id.ec);
        frameLayout26.setVisibility(8);
        ViewGroup.MarginLayoutParams a18 = android.view.a.a(widgetContainerMonitorView, -2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(a18)) {
            int i61 = Build.VERSION.SDK_INT;
            f3 = 12.0f;
            i20 = 1;
            a18.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        } else {
            f3 = 12.0f;
            i20 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a18)) {
            a18.bottomMargin = (int) TypedValue.applyDimension(i20, f3, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(a18)) {
            ((RelativeLayout.LayoutParams) a18).addRule(2, R.id.dka);
        }
        android.view.a.a(frameLayout26);
        if (frameLayout26.getParent() == null) {
            widgetContainerMonitorView.addView(frameLayout26, a18);
        }
        View adHalfWebPageContainer = new AdHalfWebPageContainer(context);
        adHalfWebPageContainer.setId(R.id.ek);
        ViewGroup.MarginLayoutParams a19 = android.view.a.a(widgetContainerMonitorView, (int) TypedValue.applyDimension(1, 255.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 130.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a19)) {
            ((LinearLayout.LayoutParams) a19).gravity = 8388691;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a19)) {
            ((FrameLayout.LayoutParams) a19).gravity = 8388691;
        }
        if (DrawerLayout.d.class.isInstance(a19)) {
            ((DrawerLayout.d) a19).f2691a = 8388691;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a19)) {
            int i62 = Build.VERSION.SDK_INT;
            i21 = 1;
            a19.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        } else {
            i21 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a19)) {
            a19.bottomMargin = (int) TypedValue.applyDimension(i21, 12.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(a19)) {
            ((RelativeLayout.LayoutParams) a19).addRule(2, R.id.dka);
        }
        android.view.a.a(adHalfWebPageContainer);
        if (adHalfWebPageContainer.getParent() == null) {
            widgetContainerMonitorView.addView(adHalfWebPageContainer, a19);
        }
        android.view.a.a(widgetContainerMonitorView);
        if (widgetContainerMonitorView.getParent() == null) {
            frameLayout.addView(widgetContainerMonitorView, layoutParams10);
        }
        View adHalfWebPageMaskLayer = new AdHalfWebPageMaskLayer(context);
        adHalfWebPageMaskLayer.setId(R.id.to);
        adHalfWebPageMaskLayer.setVisibility(8);
        ViewGroup.LayoutParams layoutParams76 = new FrameLayout.LayoutParams(-1, -1);
        android.view.a.a(adHalfWebPageMaskLayer);
        if (adHalfWebPageMaskLayer.getParent() == null) {
            frameLayout.addView(adHalfWebPageMaskLayer, layoutParams76);
        }
        View frameLayout27 = new FrameLayout(context);
        frameLayout27.setId(R.id.er);
        ViewGroup.LayoutParams layoutParams77 = new FrameLayout.LayoutParams(-1, -1);
        android.view.a.a(frameLayout27);
        if (frameLayout27.getParent() == null) {
            frameLayout.addView(frameLayout27, layoutParams77);
        }
        MicroAppVideoCardView microAppVideoCardView = new MicroAppVideoCardView(context);
        microAppVideoCardView.setId(R.id.cm8);
        microAppVideoCardView.setVisibility(8);
        FrameLayout.LayoutParams layoutParams78 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 256.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 108.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams78)) {
            ((LinearLayout.LayoutParams) layoutParams78).gravity = 8388691;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams78)) {
            layoutParams78.gravity = 8388691;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams78)) {
            ((DrawerLayout.d) layoutParams78).f2691a = 8388691;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams78)) {
            int i63 = Build.VERSION.SDK_INT;
            layoutParams78.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams78)) {
            ((ViewGroup.MarginLayoutParams) layoutParams78).bottomMargin = (int) TypedValue.applyDimension(1, 58.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(microAppVideoCardView);
        if (microAppVideoCardView.getParent() == null) {
            frameLayout.addView(microAppVideoCardView, layoutParams78);
        }
        View frameLayout28 = new FrameLayout(context);
        frameLayout28.setId(R.id.aba);
        frameLayout28.setVisibility(8);
        FrameLayout.LayoutParams layoutParams79 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 272.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 139.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams79)) {
            ((LinearLayout.LayoutParams) layoutParams79).gravity = 8388691;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams79)) {
            layoutParams79.gravity = 8388691;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams79)) {
            ((DrawerLayout.d) layoutParams79).f2691a = 8388691;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams79)) {
            ((ViewGroup.MarginLayoutParams) layoutParams79).bottomMargin = (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(frameLayout28);
        if (frameLayout28.getParent() == null) {
            frameLayout.addView(frameLayout28, layoutParams79);
        }
        ViewStub viewStub5 = new ViewStub(context);
        viewStub5.setId(R.id.b0v);
        ViewGroup.LayoutParams layoutParams80 = new FrameLayout.LayoutParams(-1, -1);
        viewStub5.setInflatedId(-1);
        android.view.a.a(viewStub5);
        if (viewStub5.getParent() == null) {
            frameLayout.addView(viewStub5, layoutParams80);
        }
        FrameLayout frameLayout29 = new FrameLayout(context);
        frameLayout29.setId(R.id.ej);
        ViewGroup.LayoutParams layoutParams81 = new FrameLayout.LayoutParams(-1, -1);
        View a20 = com.a.b.a.a(context, R.layout.sb, frameLayout29, false, 0);
        if (a20.getParent() == null) {
            frameLayout29.addView(a20);
        }
        ViewStub viewStub6 = new ViewStub(context);
        viewStub6.setId(R.id.fjn);
        FrameLayout.LayoutParams layoutParams82 = new FrameLayout.LayoutParams(-1, -1);
        viewStub6.setInflatedId(-1);
        android.view.a.a(viewStub6);
        if (viewStub6.getParent() == null) {
            frameLayout29.addView(viewStub6, layoutParams82);
        }
        android.view.a.a(frameLayout29);
        if (frameLayout29.getParent() == null) {
            frameLayout.addView(frameLayout29, layoutParams81);
        }
        ViewStub viewStub7 = new ViewStub(context);
        viewStub7.setId(R.id.eqy);
        viewStub7.setLayoutResource(R.layout.tn);
        ViewGroup.LayoutParams layoutParams83 = new FrameLayout.LayoutParams(-1, -1);
        viewStub7.setInflatedId(-1);
        android.view.a.a(viewStub7);
        if (viewStub7.getParent() == null) {
            frameLayout.addView(viewStub7, layoutParams83);
        }
        ViewStub viewStub8 = new ViewStub(context);
        viewStub8.setId(R.id.ab8);
        ViewGroup.LayoutParams layoutParams84 = new FrameLayout.LayoutParams(-1, -1);
        viewStub8.setInflatedId(-1);
        android.view.a.a(viewStub8);
        if (viewStub8.getParent() == null) {
            frameLayout.addView(viewStub8, layoutParams84);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setId(R.id.afg);
        appCompatImageView2.setImageResource(2131233103);
        FrameLayout.LayoutParams layoutParams85 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams85)) {
            ((LinearLayout.LayoutParams) layoutParams85).gravity = 51;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams85)) {
            layoutParams85.gravity = 51;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams85)) {
            ((DrawerLayout.d) layoutParams85).f2691a = 51;
        }
        android.view.a.a(appCompatImageView2);
        if (appCompatImageView2.getParent() == null) {
            frameLayout.addView(appCompatImageView2, layoutParams85);
        }
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context);
        appCompatImageView3.setId(R.id.afh);
        appCompatImageView3.setImageResource(2131233104);
        FrameLayout.LayoutParams layoutParams86 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams86)) {
            ((LinearLayout.LayoutParams) layoutParams86).gravity = 53;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams86)) {
            layoutParams86.gravity = 53;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams86)) {
            ((DrawerLayout.d) layoutParams86).f2691a = 53;
        }
        android.view.a.a(appCompatImageView3);
        if (appCompatImageView3.getParent() == null) {
            frameLayout.addView(appCompatImageView3, layoutParams86);
        }
        AppCompatImageView appCompatImageView4 = new AppCompatImageView(context);
        appCompatImageView4.setId(R.id.afc);
        appCompatImageView4.setImageResource(2131233105);
        FrameLayout.LayoutParams layoutParams87 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams87)) {
            ((LinearLayout.LayoutParams) layoutParams87).gravity = 83;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams87)) {
            layoutParams87.gravity = 83;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams87)) {
            ((DrawerLayout.d) layoutParams87).f2691a = 83;
        }
        android.view.a.a(appCompatImageView4);
        if (appCompatImageView4.getParent() == null) {
            frameLayout.addView(appCompatImageView4, layoutParams87);
        }
        AppCompatImageView appCompatImageView5 = new AppCompatImageView(context);
        appCompatImageView5.setId(R.id.afd);
        appCompatImageView5.setImageResource(2131233106);
        FrameLayout.LayoutParams layoutParams88 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams88)) {
            ((LinearLayout.LayoutParams) layoutParams88).gravity = 85;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams88)) {
            layoutParams88.gravity = 85;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams88)) {
            ((DrawerLayout.d) layoutParams88).f2691a = 85;
        }
        android.view.a.a(appCompatImageView5);
        if (appCompatImageView5.getParent() == null) {
            frameLayout.addView(appCompatImageView5, layoutParams88);
        }
        ViewStub viewStub9 = new ViewStub(context);
        viewStub9.setId(R.id.b22);
        ViewGroup.LayoutParams layoutParams89 = new FrameLayout.LayoutParams(-1, -1);
        viewStub9.setInflatedId(-1);
        android.view.a.a(viewStub9);
        if (viewStub9.getParent() == null) {
            frameLayout.addView(viewStub9, layoutParams89);
        }
        TuxTextView tuxTextView7 = new TuxTextView(context);
        tuxTextView7.setId(R.id.f6g);
        tuxTextView7.setText(R.string.fh4);
        tuxTextView7.setTextColor(resources.getColorStateList(R.color.a9));
        tuxTextView7.setAlpha(0.3f);
        tuxTextView7.setVisibility(8);
        FrameLayout.LayoutParams layoutParams90 = new FrameLayout.LayoutParams(-2, -2);
        tuxTextView7.setGravity(17);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams90)) {
            ((LinearLayout.LayoutParams) layoutParams90).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams90)) {
            layoutParams90.gravity = 17;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams90)) {
            ((DrawerLayout.d) layoutParams90).f2691a = 17;
        }
        f.a("app:tux_font", new a.c("H3_Semibold"), tuxTextView7, layoutParams90);
        f.a(tuxTextView7, layoutParams90);
        android.view.a.a(tuxTextView7);
        if (tuxTextView7.getParent() == null) {
            frameLayout.addView(tuxTextView7, layoutParams90);
        }
        android.view.a.a(frameLayout);
        frameLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.o(2191);
        return frameLayout;
    }
}
