package com.ss.android.ugc.aweme.friends.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.utils.hu;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class TikTokFollowUserBtn extends FansFollowUserBtn {

    /* renamed from: i  reason: collision with root package name */
    public static final a f97132i = new a((byte) 0);

    /* renamed from: m  reason: collision with root package name */
    private static final int f97133m = ((int) n.b(d.a(), 12.0f));

    /* renamed from: h  reason: collision with root package name */
    public boolean f97134h = b();

    /* renamed from: j  reason: collision with root package name */
    private int f97135j = 14;

    /* renamed from: k  reason: collision with root package name */
    private int f97136k = 10;

    /* renamed from: l  reason: collision with root package name */
    private int f97137l = f97133m;

    public static final class a {
        static {
            Covode.recordClassIndex(61718);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.ui.FansFollowUserBtn, com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn
    public final void a() {
        setDoubleFollowButtonText(null);
    }

    static {
        Covode.recordClassIndex(61717);
    }

    public final void setMaxTextSize(int i2) {
        this.f97135j = i2;
    }

    public final void setMinTextSize(int i2) {
        this.f97136k = i2;
    }

    private static /* synthetic */ void a(TikTokFollowUserBtn tikTokFollowUserBtn) {
        tikTokFollowUserBtn.b(com.ss.android.ugc.aweme.utils.e.a.a(tikTokFollowUserBtn.getContext()));
    }

    public final void setButtonHorizontalPadding(int i2) {
        this.f97137l = (int) n.b(d.a(), (float) i2);
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn
    public final void setFollowStatus(int i2) {
        super.setFollowStatus(i2);
        a(this);
        b(getVerticalOutsidePadding(), getVerticalOutsidePadding());
    }

    private void b(int i2) {
        if (this.f96597b != null) {
            NiceWidthTextView niceWidthTextView = this.f96597b;
            int i3 = this.f97137l;
            niceWidthTextView.setPadding(i3, 0, i3, 0);
            NiceWidthTextView niceWidthTextView2 = this.f96597b;
            l.b(niceWidthTextView2, "");
            hu.a(niceWidthTextView2, this.f97136k, this.f97135j, i2);
            this.f96597b.setFontType(com.bytedance.ies.dmt.ui.widget.util.d.f33801g);
        }
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn
    public final void setFollowButtonTextAndIcon(int i2) {
        if (i2 != 1) {
            super.setFollowButtonTextAndIcon(i2);
        } else if (getResources() != null) {
            NiceWidthTextView niceWidthTextView = this.f96597b;
            l.b(niceWidthTextView, "");
            niceWidthTextView.setText(getResources().getText(R.string.byt));
        } else {
            return;
        }
        a(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        if (r1 == null) goto L_0x0039;
     */
    @Override // com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setDoubleFollowButtonText(java.lang.String r5) {
        /*
            r4 = this;
            boolean r0 = r4.f97134h
            if (r0 == 0) goto L_0x0047
            if (r5 == 0) goto L_0x0045
            java.lang.Long r0 = h.m.p.g(r5)
        L_0x000a:
            r3 = 2131825868(0x7f1114cc, float:1.9284604E38)
            java.lang.String r2 = ""
            if (r0 != 0) goto L_0x0025
            android.content.res.Resources r0 = r4.getResources()
            java.lang.String r1 = r0.getString(r3)
            h.f.b.l.b(r1, r2)
        L_0x001c:
            com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView r0 = r4.f96597b
            h.f.b.l.b(r0, r2)
            r0.setText(r1)
            return
        L_0x0025:
            r0 = 0
            com.ss.android.ugc.aweme.im.service.IIMService r1 = com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService.createIIMServicebyMonsterPlugin(r0)
            if (r1 == 0) goto L_0x0039
            android.content.Context r0 = r4.getContext()
            h.f.b.l.b(r0, r2)
            java.lang.String r1 = r1.getEntranceButtonText(r0, r5)
            if (r1 != 0) goto L_0x001c
        L_0x0039:
            android.content.res.Resources r0 = r4.getResources()
            java.lang.String r1 = r0.getString(r3)
            h.f.b.l.b(r1, r2)
            goto L_0x001c
        L_0x0045:
            r0 = 0
            goto L_0x000a
        L_0x0047:
            super.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.ui.TikTokFollowUserBtn.setDoubleFollowButtonText(java.lang.String):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TikTokFollowUserBtn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
    }
}
