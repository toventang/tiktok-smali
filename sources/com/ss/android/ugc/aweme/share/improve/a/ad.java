package com.ss.android.ugc.aweme.share.improve.a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.ss.android.ugc.aweme.utils.z;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class ad implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f123599a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<s<ag>> f123600b;

    /* renamed from: c  reason: collision with root package name */
    private final Aweme f123601c;

    static {
        Covode.recordClassIndex(81136);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "play_list";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean d() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean e() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81137);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        if (!MixFeedService.k().a(this.f123601c) || !z.b(this.f123601c)) {
            return R.string.pk;
        }
        return R.string.fc7;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        if (!MixFeedService.k().a(this.f123601c) || !z.b(this.f123601c)) {
            return R.raw.icon_2pt_playlist;
        }
        return R.raw.icon_2pt_playlist_fill;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean f() {
        if (!z.b(this.f123601c) || this.f123601c.playlistBlocked) {
            return false;
        }
        com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo = this.f123601c.getCommerceVideoAuthInfo();
        if (commerceVideoAuthInfo == null || commerceVideoAuthInfo.getDarkPostStatus() != 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int g() {
        if (!MixFeedService.k().a(this.f123601c) || !z.b(this.f123601c)) {
            return R.raw.icon_playlist;
        }
        return R.raw.icon_playlist_fill;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context) {
        l.d(context, "");
        l.d(context, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(ImageView imageView) {
        l.d(imageView, "");
        l.d(imageView, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(TextView textView) {
        l.d(textView, "");
        h.a.a(this, textView);
    }

    public ad(Aweme aweme, s<ag> sVar) {
        l.d(aweme, "");
        l.d(sVar, "");
        this.f123601c = aweme;
        this.f123600b = new WeakReference<>(sVar);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        l.d(context, "");
        l.d(sharePackage, "");
        if (this.f123601c.playlistBlocked) {
            MixFeedService.k().a(context);
            return;
        }
        com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo = this.f123601c.getCommerceVideoAuthInfo();
        if (commerceVideoAuthInfo != null && commerceVideoAuthInfo.getDarkPostStatus() == 1) {
            new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.b4h).a();
        } else if (!z.b(this.f123601c)) {
            new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.gj5).a();
        } else if (MixFeedService.k().a(this.f123601c)) {
            s<ag> sVar = this.f123600b.get();
            if (sVar != null) {
                sVar.a(new ag(56, this.f123601c));
            }
        } else {
            s<ag> sVar2 = this.f123600b.get();
            if (sVar2 != null) {
                sVar2.a(new ag(55, this.f123601c));
            }
        }
    }
}
