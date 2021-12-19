package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.im.core.d.ai;
import com.facebook.drawee.e.q;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.EmojiContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.d.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.o;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.q;
import com.zhiliaoapp.musically.R;

public class k extends a<EmojiContent> {

    /* renamed from: b  reason: collision with root package name */
    private static final int f101445b = ((int) n.b(d.a(), 112.0f));
    private static final int x = ((int) n.b(d.a(), 300.0f));
    private static final int y = ((int) n.b(d.a(), 180.0f));

    /* renamed from: a  reason: collision with root package name */
    private RemoteImageView f101446a;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public void bD_() {
        super.bD_();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public void a() {
        super.a();
        this.f101446a = (RemoteImageView) this.itemView.findViewById(R.id.d4o);
        this.o = a.C2518a.a(this.itemView.findViewById(R.id.adh));
    }

    static {
        Covode.recordClassIndex(64870);
    }

    public k(View view) {
        super(view);
    }

    public void a(ai aiVar, ai aiVar2, EmojiContent emojiContent, int i2) {
        int i3;
        super.a(aiVar, aiVar2, (BaseContent) emojiContent, i2);
        if (this.p.getType() == 500 || this.p.getType() == 501) {
            ((com.facebook.drawee.f.a) this.f101446a.getHierarchy()).a(1, (Drawable) null);
        } else {
            ((com.facebook.drawee.f.a) this.f101446a.getHierarchy()).c(R.drawable.atm);
        }
        UrlModel localUrl = ((EmojiContent) this.p).getLocalUrl();
        Object tag = this.f101446a.getTag(67108864);
        if (localUrl != null) {
            if (!localUrl.equals(tag)) {
                this.f101446a.setTag(67108864, localUrl);
            }
            this.o.a(50331648, 10);
            this.o.a(67108864, this.s);
        }
        if (((EmojiContent) this.p).getUrl() != null && !((EmojiContent) this.p).getUrl().equals(tag)) {
            this.f101446a.setTag(67108864, ((EmojiContent) this.p).getUrl());
        }
        this.o.a(50331648, 10);
        this.o.a(67108864, this.s);
        int i4 = 0;
        if (((EmojiContent) this.p).getHeight() == 0 || ((EmojiContent) this.p).getWidth() == 0) {
            i3 = 0;
        } else if (((EmojiContent) this.p).getWidth() >= ((EmojiContent) this.p).getHeight()) {
            i4 = f101445b;
            i3 = (((EmojiContent) this.p).getHeight() * i4) / ((EmojiContent) this.p).getWidth();
        } else {
            i3 = f101445b;
            i4 = (((EmojiContent) this.p).getWidth() * i3) / ((EmojiContent) this.p).getHeight();
        }
        if (q.a(((EmojiContent) this.p).getImageType())) {
            i4 = y;
            i3 = (((EmojiContent) this.p).getHeight() * i4) / ((EmojiContent) this.p).getWidth();
            int i5 = x;
            if (i3 > i5) {
                i3 = i5;
            }
            ((com.facebook.drawee.f.a) this.f101446a.getHierarchy()).a(q.b.f47442h);
        }
        ViewGroup.LayoutParams layoutParams = this.f101446a.getLayoutParams();
        layoutParams.width = i4;
        layoutParams.height = i3;
        this.f101446a.setLayoutParams(layoutParams);
        int min = Math.min(i4, i3);
        if (com.ss.android.ugc.aweme.im.sdk.common.controller.utils.q.a(((EmojiContent) this.p).getImageType()) || com.ss.android.ugc.aweme.im.sdk.common.controller.utils.q.b(((EmojiContent) this.p).getImageType())) {
            if (localUrl == null) {
                com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a(this.f101446a, ((EmojiContent) this.p).getUrl(), i4, i3, min, min, (o) null);
            } else {
                com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a(this.f101446a, localUrl, i4, i3, min, min, (o) null);
            }
            this.o.a(50331648, 10);
            this.o.a(67108864, this.s);
        }
        if (localUrl == null) {
            com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a(this.f101446a, ((EmojiContent) this.p).getUrl(), i4, i3);
        } else {
            com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a(this.f101446a, localUrl, i4, i3);
        }
        this.o.a(50331648, 10);
        this.o.a(67108864, this.s);
    }
}
