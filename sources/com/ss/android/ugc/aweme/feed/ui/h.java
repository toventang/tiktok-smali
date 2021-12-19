package com.ss.android.ugc.aweme.feed.ui;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize.d.b;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;

public abstract class h extends a {

    /* renamed from: a  reason: collision with root package name */
    protected View.OnClickListener f94779a = new View.OnClickListener() {
        /* class com.ss.android.ugc.aweme.feed.ui.h.AnonymousClass1 */

        static {
            Covode.recordClassIndex(60129);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:62:0x01c9, code lost:
            if (android.text.TextUtils.equals(r1.getOwnerId(), r5.getUid()) != false) goto L_0x0183;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r18) {
            /*
            // Method dump skipped, instructions count: 1375
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.h.AnonymousClass1.onClick(android.view.View):void");
        }
    };

    static {
        Covode.recordClassIndex(60128);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public void a(View view) {
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public void a(DataCenter dataCenter) {
    }

    /* access modifiers changed from: protected */
    public abstract void b();

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a() {
        b();
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final boolean k() {
        if (super.k()) {
            return true;
        }
        if (this.L == null || !this.L.isWithPromotionalMusic()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void b(VideoItemParams videoItemParams) {
        super.b(videoItemParams);
    }

    public h(View view) {
        super(view);
    }

    public static b a(int i2) {
        if (i2 == R.id.crb || i2 == R.id.crd) {
            return b.TITLE;
        }
        if (i2 == R.id.cpt) {
            return b.ICON;
        }
        return null;
    }
}
