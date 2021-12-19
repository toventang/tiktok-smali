package com.ss.android.ugc.aweme.base.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.facebook.drawee.e.q;
import com.facebook.drawee.f.a;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;

public class AvatarImageWithVerify extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private SmartAvatarImageView f68285a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f68286b;

    /* renamed from: c  reason: collision with root package name */
    private UserVerify f68287c;

    /* renamed from: d  reason: collision with root package name */
    private final int f68288d;

    /* renamed from: e  reason: collision with root package name */
    private final int f68289e;

    /* renamed from: f  reason: collision with root package name */
    private int[] f68290f;

    static {
        Covode.recordClassIndex(42052);
    }

    /* access modifiers changed from: protected */
    public int getVerifyIconMarginEnd() {
        return -this.f68289e;
    }

    public SmartAvatarImageView getAvatarImageView() {
        return this.f68285a;
    }

    public int getVerifyIconSize() {
        return this.f68288d;
    }

    public final void a() {
        this.f68286b.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams getAvatarLayoutParams() {
        return new FrameLayout.LayoutParams(-1, -1);
    }

    public void setRequestImgSize(int[] iArr) {
        this.f68290f = iArr;
    }

    private void setFailureImage(int i2) {
        ((a) this.f68285a.getHierarchy()).b(i2, q.b.f47442h);
    }

    public void setPlaceHolder(int i2) {
        ((a) this.f68285a.getHierarchy()).a(i2, q.b.f47442h);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        if (r2 != false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setUserData(com.ss.android.ugc.aweme.utils.UserVerify r5) {
        /*
        // Method dump skipped, instructions count: 145
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify.setUserData(com.ss.android.ugc.aweme.utils.UserVerify):void");
    }

    public AvatarImageWithVerify(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarImageWithVerify(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        MethodCollector.i(4321);
        this.f68288d = (int) d.a().getResources().getDimension(R.dimen.g7);
        this.f68289e = (int) n.b(d.a(), 2.0f);
        SmartAvatarImageView smartAvatarImageView = new SmartAvatarImageView(getContext());
        this.f68285a = smartAvatarImageView;
        ((a) smartAvatarImageView.getHierarchy()).a(R.color.f159926j, q.b.f47442h);
        addView(this.f68285a, getAvatarLayoutParams());
        int verifyIconSize = getVerifyIconSize();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(verifyIconSize, verifyIconSize);
        layoutParams.gravity = 8388693;
        int verifyIconMarginEnd = getVerifyIconMarginEnd();
        int i3 = Build.VERSION.SDK_INT;
        layoutParams.setMarginEnd(verifyIconMarginEnd);
        ImageView imageView = new ImageView(getContext());
        this.f68286b = imageView;
        try {
            imageView.setImageDrawable(getResources().getDrawable(2131232810));
        } catch (Resources.NotFoundException e2) {
            e2.printStackTrace();
        }
        this.f68286b.setVisibility(8);
        addView(this.f68286b, layoutParams);
        MethodCollector.o(4321);
    }
}
