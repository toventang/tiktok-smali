package com.ss.android.ugc.aweme.friends.ui;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.f.b.l;
import h.z;

public final class au extends RelativeLayout {

    /* renamed from: b  reason: collision with root package name */
    public static final int f97189b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static final int f97190c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f97191d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static final int f97192e = 3;

    /* renamed from: f  reason: collision with root package name */
    public static final int f97193f = 4;

    /* renamed from: g  reason: collision with root package name */
    public static final int f97194g = 5;

    /* renamed from: h  reason: collision with root package name */
    public static final int f97195h = 6;

    /* renamed from: i  reason: collision with root package name */
    public static final int f97196i = 7;

    /* renamed from: j  reason: collision with root package name */
    public static final int f97197j = 8;

    /* renamed from: k  reason: collision with root package name */
    public static final a f97198k = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public m<? super Integer, ? super String, z> f97199a;

    /* renamed from: l  reason: collision with root package name */
    private SmartAvatarImageView f97200l;

    /* renamed from: m  reason: collision with root package name */
    private TikTokFollowUserBtn f97201m;

    private final int getLayoutResId() {
        return R.layout.mh;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(61748);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final TikTokFollowUserBtn getMFollowUserBtn() {
        return this.f97201m;
    }

    static {
        Covode.recordClassIndex(61747);
    }

    public final void setActionEventListener(m<? super Integer, ? super String, z> mVar) {
        l.d(mVar, "");
        this.f97199a = mVar;
    }

    public final void setMFollowUserBtn(TikTokFollowUserBtn tikTokFollowUserBtn) {
        l.d(tikTokFollowUserBtn, "");
        this.f97201m = tikTokFollowUserBtn;
    }

    public final void setAvatarSize(int i2) {
        SmartAvatarImageView smartAvatarImageView = this.f97200l;
        ViewGroup.LayoutParams layoutParams = smartAvatarImageView.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i2;
        smartAvatarImageView.setLayoutParams(layoutParams);
    }
}
