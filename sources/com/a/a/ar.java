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
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.a.b.a.a;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedTagGroup;
import com.ss.android.ugc.aweme.tux.a.j.f;
import com.zhiliaoapp.musically.R;

public final class ar implements e {
    static {
        Covode.recordClassIndex(1954);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f2;
        int i8;
        float f3;
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
        int i20;
        int i21;
        int i22;
        int i23;
        float f4;
        int i24;
        int i25;
        int i26;
        int i27;
        MethodCollector.i(2835);
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams a2 = a.a(viewGroup, -1, -1);
        linearLayout.setGravity(80);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.d0r);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), linearLayout2.getPaddingTop(), linearLayout2.getPaddingRight(), linearLayout2.getPaddingBottom());
        linearLayout2.setPadding(linearLayout2.getPaddingLeft(), linearLayout2.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), linearLayout2.getPaddingBottom());
        linearLayout2.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), linearLayout2.getPaddingTop(), linearLayout2.getPaddingRight(), linearLayout2.getPaddingBottom());
        linearLayout2.setPadding(linearLayout2.getPaddingLeft(), linearLayout2.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), linearLayout2.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setId(R.id.bp5);
        linearLayout3.setOrientation(0);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()));
        linearLayout3.setGravity(16);
        AvatarImageView avatarImageView = new AvatarImageView(context);
        avatarImageView.setId(R.id.bxg);
        avatarImageView.setBackgroundResource(R.drawable.r5);
        avatarImageView.setPadding((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        avatarImageView.setVisibility(8);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            i2 = 16;
            layoutParams3.gravity = 16;
        } else {
            i2 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((FrameLayout.LayoutParams) layoutParams3).gravity = i2;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams3)) {
            ((DrawerLayout.d) layoutParams3).f2691a = i2;
        }
        a.a(avatarImageView);
        if (avatarImageView.getParent() == null) {
            linearLayout3.addView(avatarImageView, layoutParams3);
        }
        AvatarImageView avatarImageView2 = new AvatarImageView(context);
        avatarImageView2.setId(R.id.bxh);
        avatarImageView2.setBackgroundResource(R.drawable.r5);
        avatarImageView2.setPadding((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        avatarImageView2.setVisibility(8);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            i3 = 16;
            layoutParams4.gravity = 16;
        } else {
            i3 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((FrameLayout.LayoutParams) layoutParams4).gravity = i3;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams4)) {
            ((DrawerLayout.d) layoutParams4).f2691a = i3;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = (int) TypedValue.applyDimension(1, -5.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            int i28 = Build.VERSION.SDK_INT;
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, -5.0f, resources.getDisplayMetrics()));
        }
        a.a(avatarImageView2);
        if (avatarImageView2.getParent() == null) {
            linearLayout3.addView(avatarImageView2, layoutParams4);
        }
        RemoteImageView remoteImageView = new RemoteImageView(context);
        remoteImageView.setId(R.id.bxi);
        remoteImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ViewGroup.LayoutParams layoutParams5 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        com.a.a.a.a.a aVar = new com.a.a.a.a.a();
        aVar.a("fresco:roundedCornerRadius", new a.d("2", "dp"), remoteImageView, layoutParams5);
        aVar.a(remoteImageView, layoutParams5);
        android.view.a.a(remoteImageView);
        if (remoteImageView.getParent() == null) {
            linearLayout3.addView(remoteImageView, layoutParams5);
        }
        FollowFeedTagGroup followFeedTagGroup = new FollowFeedTagGroup(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams6)) {
            i4 = 16;
            layoutParams6.gravity = 16;
        } else {
            i4 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((FrameLayout.LayoutParams) layoutParams6).gravity = i4;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams6)) {
            ((DrawerLayout.d) layoutParams6).f2691a = i4;
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(R.id.jf);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(1);
        tuxTextView.setPadding((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingTop(), tuxTextView.getPaddingRight(), tuxTextView.getPaddingBottom());
        tuxTextView.setPadding((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingTop(), tuxTextView.getPaddingRight(), tuxTextView.getPaddingBottom());
        tuxTextView.setPadding(tuxTextView.getPaddingLeft(), tuxTextView.getPaddingTop(), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingBottom());
        tuxTextView.setPadding(tuxTextView.getPaddingLeft(), tuxTextView.getPaddingTop(), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), tuxTextView.getPaddingBottom());
        tuxTextView.setTextColor(resources.getColorStateList(R.color.a_));
        ViewGroup.MarginLayoutParams a3 = android.view.a.a(followFeedTagGroup, -2, (int) TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a3)) {
            i5 = 16;
            ((LinearLayout.LayoutParams) a3).gravity = 16;
        } else {
            i5 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a3)) {
            ((FrameLayout.LayoutParams) a3).gravity = i5;
        }
        if (DrawerLayout.d.class.isInstance(a3)) {
            ((DrawerLayout.d) a3).f2691a = i5;
        }
        tuxTextView.setGravity(17);
        f.a("app:tux_font", new a.c("P2_Semibold"), tuxTextView, a3);
        f.a(tuxTextView, a3);
        android.view.a.a(tuxTextView);
        if (tuxTextView.getParent() == null) {
            followFeedTagGroup.addView(tuxTextView, a3);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.anq);
        appCompatImageView.setBackgroundColor(resources.getColor(R.color.bz));
        ViewGroup.MarginLayoutParams a4 = android.view.a.a(followFeedTagGroup, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a4)) {
            i6 = 16;
            ((LinearLayout.LayoutParams) a4).gravity = 16;
        } else {
            i6 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a4)) {
            ((FrameLayout.LayoutParams) a4).gravity = i6;
        }
        if (DrawerLayout.d.class.isInstance(a4)) {
            ((DrawerLayout.d) a4).f2691a = i6;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a4)) {
            int i29 = Build.VERSION.SDK_INT;
            i7 = 1;
            f2 = 4.0f;
            a4.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        } else {
            i7 = 1;
            f2 = 4.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a4)) {
            a4.leftMargin = (int) TypedValue.applyDimension(i7, f2, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a4)) {
            a4.rightMargin = (int) TypedValue.applyDimension(i7, f2, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a4)) {
            int i30 = Build.VERSION.SDK_INT;
            a4.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        android.view.a.a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            followFeedTagGroup.addView(appCompatImageView, a4);
        }
        View view = new View(context);
        view.setId(R.id.e38);
        view.setAlpha(0.34f);
        view.setBackgroundResource(R.drawable.a00);
        view.setVisibility(8);
        ViewGroup.MarginLayoutParams a5 = android.view.a.a(followFeedTagGroup, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a5)) {
            i8 = 16;
            ((LinearLayout.LayoutParams) a5).gravity = 16;
        } else {
            i8 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a5)) {
            ((FrameLayout.LayoutParams) a5).gravity = i8;
        }
        if (DrawerLayout.d.class.isInstance(a5)) {
            ((DrawerLayout.d) a5).f2691a = i8;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a5)) {
            f3 = 4.0f;
            i9 = 1;
            a5.leftMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        } else {
            f3 = 4.0f;
            i9 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a5)) {
            a5.rightMargin = (int) TypedValue.applyDimension(i9, f3, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a5)) {
            int i31 = Build.VERSION.SDK_INT;
            a5.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a5)) {
            int i32 = Build.VERSION.SDK_INT;
            a5.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        android.view.a.a(view);
        if (view.getParent() == null) {
            followFeedTagGroup.addView(view, a5);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setId(R.id.fbb);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setMaxLines(1);
        tuxTextView2.setTextColor(resources.getColorStateList(R.color.c5));
        ViewGroup.MarginLayoutParams a6 = android.view.a.a(followFeedTagGroup, -2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(a6)) {
            i10 = 16;
            ((LinearLayout.LayoutParams) a6).gravity = 16;
        } else {
            i10 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a6)) {
            ((FrameLayout.LayoutParams) a6).gravity = i10;
        }
        if (DrawerLayout.d.class.isInstance(a6)) {
            ((DrawerLayout.d) a6).f2691a = i10;
        }
        f.a("app:tux_font", new a.c("SmallText1_Regular"), tuxTextView2, a6);
        f.a(tuxTextView2, a6);
        android.view.a.a(tuxTextView2);
        if (tuxTextView2.getParent() == null) {
            followFeedTagGroup.addView(tuxTextView2, a6);
        }
        TuxTextView tuxTextView3 = new TuxTextView(context);
        tuxTextView3.setId(R.id.e39);
        tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView3.setMaxLines(1);
        tuxTextView3.setTextColor(resources.getColorStateList(R.color.a_));
        ViewGroup.MarginLayoutParams a7 = android.view.a.a(followFeedTagGroup, -2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(a7)) {
            i11 = 16;
            ((LinearLayout.LayoutParams) a7).gravity = 16;
        } else {
            i11 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a7)) {
            ((FrameLayout.LayoutParams) a7).gravity = i11;
        }
        if (DrawerLayout.d.class.isInstance(a7)) {
            ((DrawerLayout.d) a7).f2691a = i11;
        }
        tuxTextView3.setGravity(17);
        f.a("app:tux_font", new a.c("P2_Regular"), tuxTextView3, a7);
        f.a(tuxTextView3, a7);
        android.view.a.a(tuxTextView3);
        if (tuxTextView3.getParent() == null) {
            followFeedTagGroup.addView(tuxTextView3, a7);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setId(R.id.c0n);
        appCompatImageView2.setImageResource(2131233122);
        appCompatImageView2.setVisibility(8);
        ViewGroup.MarginLayoutParams a8 = android.view.a.a(followFeedTagGroup, (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a8)) {
            i12 = 16;
            ((LinearLayout.LayoutParams) a8).gravity = 16;
        } else {
            i12 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a8)) {
            ((FrameLayout.LayoutParams) a8).gravity = i12;
        }
        if (DrawerLayout.d.class.isInstance(a8)) {
            ((DrawerLayout.d) a8).f2691a = i12;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a8)) {
            int i33 = Build.VERSION.SDK_INT;
            a8.setMarginStart((int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a8)) {
            a8.leftMargin = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(appCompatImageView2);
        if (appCompatImageView2.getParent() == null) {
            followFeedTagGroup.addView(appCompatImageView2, a8);
        }
        View view2 = new View(context);
        view2.setId(R.id.d59);
        view2.setBackgroundColor(resources.getColor(R.color.c9));
        ViewGroup.MarginLayoutParams a9 = android.view.a.a(followFeedTagGroup, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), -1);
        android.view.a.a(view2);
        if (view2.getParent() == null) {
            followFeedTagGroup.addView(view2, a9);
        }
        android.view.a.a(followFeedTagGroup);
        if (followFeedTagGroup.getParent() == null) {
            linearLayout3.addView(followFeedTagGroup, layoutParams6);
        }
        android.view.a.a(linearLayout3);
        if (linearLayout3.getParent() == null) {
            linearLayout2.addView(linearLayout3, layoutParams2);
        }
        TuxTextView tuxTextView4 = new TuxTextView(context);
        tuxTextView4.setId(R.id.a69);
        tuxTextView4.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView4.setMaxLines(1);
        tuxTextView4.setPadding(tuxTextView4.getPaddingLeft(), tuxTextView4.getPaddingTop(), tuxTextView4.getPaddingRight(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        tuxTextView4.setTextColor(resources.getColorStateList(R.color.c5));
        tuxTextView4.setVisibility(8);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            ((ViewGroup.MarginLayoutParams) layoutParams7).leftMargin = (int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            int i34 = Build.VERSION.SDK_INT;
            i13 = 17;
            layoutParams7.setMarginStart((int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()));
        } else {
            i13 = 17;
        }
        tuxTextView4.setGravity(i13);
        f.a("app:tux_font", new a.c("SmallText1_Regular"), tuxTextView4, layoutParams7);
        f.a(tuxTextView4, layoutParams7);
        android.view.a.a(tuxTextView4);
        if (tuxTextView4.getParent() == null) {
            linearLayout2.addView(tuxTextView4, layoutParams7);
        }
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setId(R.id.jm);
        linearLayout4.setOrientation(0);
        linearLayout4.setVisibility(8);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            ((ViewGroup.MarginLayoutParams) layoutParams8).bottomMargin = (int) TypedValue.applyDimension(1, 5.5f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            ((ViewGroup.MarginLayoutParams) layoutParams8).leftMargin = (int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            int i35 = Build.VERSION.SDK_INT;
            layoutParams8.setMarginStart((int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin = (int) TypedValue.applyDimension(1, -4.0f, resources.getDisplayMetrics());
        }
        linearLayout4.setGravity(16);
        FollowFeedTagGroup followFeedTagGroup2 = new FollowFeedTagGroup(context);
        followFeedTagGroup2.setId(R.id.eon);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams9)) {
            ((FrameLayout.LayoutParams) layoutParams9).gravity = 16;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams9)) {
            ((DrawerLayout.d) layoutParams9).f2691a = 16;
        }
        TuxTextView tuxTextView5 = new TuxTextView(context);
        tuxTextView5.setId(R.id.a68);
        tuxTextView5.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView5.setMaxLines(1);
        tuxTextView5.setTextColor(resources.getColorStateList(R.color.aa));
        ViewGroup.MarginLayoutParams a10 = android.view.a.a(followFeedTagGroup2, -2, -1);
        if (ViewGroup.MarginLayoutParams.class.isInstance(a10)) {
            int i36 = Build.VERSION.SDK_INT;
            i14 = 1;
            a10.setMarginEnd((int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()));
        } else {
            i14 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a10)) {
            a10.rightMargin = (int) TypedValue.applyDimension(i14, 7.0f, resources.getDisplayMetrics());
        }
        f.a("app:tux_font", new a.c("SmallText1_Regular"), tuxTextView5, a10);
        f.a(tuxTextView5, a10);
        android.view.a.a(tuxTextView5);
        if (tuxTextView5.getParent() == null) {
            followFeedTagGroup2.addView(tuxTextView5, a10);
        }
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context);
        appCompatImageView3.setId(R.id.an6);
        appCompatImageView3.setBackgroundColor(resources.getColor(R.color.ad));
        ViewGroup.MarginLayoutParams a11 = android.view.a.a(followFeedTagGroup2, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a11)) {
            i15 = 16;
            ((LinearLayout.LayoutParams) a11).gravity = 16;
        } else {
            i15 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a11)) {
            ((FrameLayout.LayoutParams) a11).gravity = i15;
        }
        if (DrawerLayout.d.class.isInstance(a11)) {
            ((DrawerLayout.d) a11).f2691a = i15;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a11)) {
            int i37 = Build.VERSION.SDK_INT;
            i16 = 1;
            a11.setMarginEnd((int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()));
        } else {
            i16 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a11)) {
            a11.rightMargin = (int) TypedValue.applyDimension(i16, 7.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(appCompatImageView3);
        if (appCompatImageView3.getParent() == null) {
            followFeedTagGroup2.addView(appCompatImageView3, a11);
        }
        TuxTextView tuxTextView6 = new TuxTextView(context);
        tuxTextView6.setId(R.id.bs2);
        tuxTextView6.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView6.setMaxLines(1);
        tuxTextView6.setTextColor(resources.getColorStateList(R.color.aa));
        ViewGroup.MarginLayoutParams a12 = android.view.a.a(followFeedTagGroup2, -2, (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(a12)) {
            int i38 = Build.VERSION.SDK_INT;
            i17 = 1;
            a12.setMarginEnd((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        } else {
            i17 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a12)) {
            a12.rightMargin = (int) TypedValue.applyDimension(i17, 5.0f, resources.getDisplayMetrics());
        }
        f.a("app:tux_font", new a.c("SmallText1_Regular"), tuxTextView6, a12);
        f.a(tuxTextView6, a12);
        android.view.a.a(tuxTextView6);
        if (tuxTextView6.getParent() == null) {
            followFeedTagGroup2.addView(tuxTextView6, a12);
        }
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setId(R.id.agc);
        linearLayout5.setOrientation(0);
        ViewGroup.MarginLayoutParams a13 = android.view.a.a(followFeedTagGroup2, -2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(a13)) {
            int i39 = Build.VERSION.SDK_INT;
            i18 = 1;
            a13.setMarginEnd((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        } else {
            i18 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a13)) {
            a13.rightMargin = (int) TypedValue.applyDimension(i18, 5.0f, resources.getDisplayMetrics());
        }
        android.view.a.a(linearLayout5);
        if (linearLayout5.getParent() == null) {
            followFeedTagGroup2.addView(linearLayout5, a13);
        }
        android.view.a.a(followFeedTagGroup2);
        if (followFeedTagGroup2.getParent() == null) {
            linearLayout4.addView(followFeedTagGroup2, layoutParams9);
        }
        android.view.a.a(linearLayout4);
        if (linearLayout4.getParent() == null) {
            linearLayout2.addView(linearLayout4, layoutParams8);
        }
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setId(R.id.abe);
        linearLayout6.setOrientation(0);
        linearLayout6.setVisibility(8);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams10)) {
            i19 = 16;
            layoutParams10.gravity = 16;
        } else {
            i19 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams10)) {
            ((FrameLayout.LayoutParams) layoutParams10).gravity = i19;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams10)) {
            ((DrawerLayout.d) layoutParams10).f2691a = i19;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            i20 = 1;
            ((ViewGroup.MarginLayoutParams) layoutParams10).bottomMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        } else {
            i20 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            ((ViewGroup.MarginLayoutParams) layoutParams10).leftMargin = (int) TypedValue.applyDimension(i20, 25.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            int i40 = Build.VERSION.SDK_INT;
            i21 = 1;
            layoutParams10.setMarginStart((int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()));
        } else {
            i21 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            ((ViewGroup.MarginLayoutParams) layoutParams10).topMargin = (int) TypedValue.applyDimension(i21, -4.0f, resources.getDisplayMetrics());
        }
        linearLayout6.setGravity(16);
        TuxTextView tuxTextView7 = new TuxTextView(context);
        tuxTextView7.setId(R.id.dwf);
        tuxTextView7.setTextColor(resources.getColorStateList(R.color.aa));
        tuxTextView7.setVisibility(8);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams11)) {
            i22 = 16;
            layoutParams11.gravity = 16;
        } else {
            i22 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams11)) {
            ((FrameLayout.LayoutParams) layoutParams11).gravity = i22;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams11)) {
            ((DrawerLayout.d) layoutParams11).f2691a = i22;
        }
        tuxTextView7.setGravity(17);
        f.a("app:tux_font", new a.c("SmallText1_Regular"), tuxTextView7, layoutParams11);
        f.a(tuxTextView7, layoutParams11);
        android.view.a.a(tuxTextView7);
        if (tuxTextView7.getParent() == null) {
            linearLayout6.addView(tuxTextView7, layoutParams11);
        }
        AppCompatImageView appCompatImageView4 = new AppCompatImageView(context);
        appCompatImageView4.setId(R.id.dw8);
        appCompatImageView4.setBackgroundColor(resources.getColor(R.color.ad));
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams12)) {
            i23 = 16;
            layoutParams12.gravity = 16;
        } else {
            i23 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams12)) {
            ((FrameLayout.LayoutParams) layoutParams12).gravity = i23;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams12)) {
            ((DrawerLayout.d) layoutParams12).f2691a = i23;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            f4 = 7.0f;
            i24 = 1;
            ((ViewGroup.MarginLayoutParams) layoutParams12).leftMargin = (int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics());
        } else {
            f4 = 7.0f;
            i24 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            ((ViewGroup.MarginLayoutParams) layoutParams12).rightMargin = (int) TypedValue.applyDimension(i24, f4, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            int i41 = Build.VERSION.SDK_INT;
            layoutParams12.setMarginStart((int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            int i42 = Build.VERSION.SDK_INT;
            layoutParams12.setMarginEnd((int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            ((ViewGroup.MarginLayoutParams) layoutParams12).topMargin = (int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics());
        }
        android.view.a.a(appCompatImageView4);
        if (appCompatImageView4.getParent() == null) {
            linearLayout6.addView(appCompatImageView4, layoutParams12);
        }
        TuxTextView tuxTextView8 = new TuxTextView(context);
        tuxTextView8.setId(R.id.dwg);
        tuxTextView8.setMaxLines(1);
        tuxTextView8.setTextColor(resources.getColorStateList(R.color.aa));
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams13)) {
            i25 = 16;
            layoutParams13.gravity = 16;
        } else {
            i25 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams13)) {
            ((FrameLayout.LayoutParams) layoutParams13).gravity = i25;
        }
        if (DrawerLayout.d.class.isInstance(layoutParams13)) {
            ((DrawerLayout.d) layoutParams13).f2691a = i25;
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.weight = 1.0f;
        }
        tuxTextView8.setGravity(17);
        f.a("app:tux_font", new a.c("SmallText1_Regular"), tuxTextView8, layoutParams13);
        f.a(tuxTextView8, layoutParams13);
        android.view.a.a(tuxTextView8);
        if (tuxTextView8.getParent() == null) {
            linearLayout6.addView(tuxTextView8, layoutParams13);
        }
        android.view.a.a(linearLayout6);
        if (linearLayout6.getParent() == null) {
            linearLayout2.addView(linearLayout6, layoutParams10);
        }
        TuxTextView tuxTextView9 = new TuxTextView(context);
        tuxTextView9.setId(R.id.ezg);
        tuxTextView9.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView9.setMaxLines(1);
        tuxTextView9.setMaxWidth((int) TypedValue.applyDimension(1, 215.0f, resources.getDisplayMetrics()));
        tuxTextView9.setPadding((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), tuxTextView9.getPaddingTop(), tuxTextView9.getPaddingRight(), tuxTextView9.getPaddingBottom());
        tuxTextView9.setPadding((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), tuxTextView9.getPaddingTop(), tuxTextView9.getPaddingRight(), tuxTextView9.getPaddingBottom());
        tuxTextView9.setPadding(tuxTextView9.getPaddingLeft(), tuxTextView9.getPaddingTop(), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), tuxTextView9.getPaddingBottom());
        tuxTextView9.setPadding(tuxTextView9.getPaddingLeft(), tuxTextView9.getPaddingTop(), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), tuxTextView9.getPaddingBottom());
        tuxTextView9.setTextColor(resources.getColorStateList(R.color.f159917a));
        tuxTextView9.setVisibility(8);
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams14)) {
            i26 = 1;
            ((ViewGroup.MarginLayoutParams) layoutParams14).bottomMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        } else {
            i26 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams14)) {
            ((ViewGroup.MarginLayoutParams) layoutParams14).leftMargin = (int) TypedValue.applyDimension(i26, 25.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams14)) {
            int i43 = Build.VERSION.SDK_INT;
            i27 = 1;
            layoutParams14.setMarginStart((int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()));
        } else {
            i27 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams14)) {
            ((ViewGroup.MarginLayoutParams) layoutParams14).topMargin = (int) TypedValue.applyDimension(i27, -4.0f, resources.getDisplayMetrics());
        }
        f.a("app:tux_font", new a.c("SmallText1_Regular"), tuxTextView9, layoutParams14);
        f.a(tuxTextView9, layoutParams14);
        android.view.a.a(tuxTextView9);
        if (tuxTextView9.getParent() == null) {
            linearLayout2.addView(tuxTextView9, layoutParams14);
        }
        android.view.a.a(linearLayout2);
        if (linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2, layoutParams);
        }
        android.view.a.a(linearLayout);
        linearLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        MethodCollector.o(2835);
        return linearLayout;
    }
}
