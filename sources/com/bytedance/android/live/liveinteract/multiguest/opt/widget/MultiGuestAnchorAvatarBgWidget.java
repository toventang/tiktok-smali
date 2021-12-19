package com.bytedance.android.live.liveinteract.multiguest.opt.widget;

import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.chatroom.g.g;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.utils.z;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.facebook.drawee.a.a.e;
import com.facebook.imagepipeline.o.c;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class MultiGuestAnchorAvatarBgWidget extends LiveWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    public LiveTextView f11436a;

    /* renamed from: b  reason: collision with root package name */
    public f.a.b.b f11437b;

    /* renamed from: c  reason: collision with root package name */
    private HSImageView f11438c;

    /* renamed from: d  reason: collision with root package name */
    private HSImageView f11439d;

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f11441a = new b();

        static {
            Covode.recordClassIndex(6165);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(6163);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bd1;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        f.a.b.b bVar = this.f11437b;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        ImageModel imageModel;
        List<String> urls;
        User owner;
        super.onCreate();
        View findViewById = findViewById(R.id.cz3);
        l.b(findViewById, "");
        this.f11438c = (HSImageView) findViewById;
        View findViewById2 = findViewById(R.id.cz6);
        l.b(findViewById2, "");
        this.f11439d = (HSImageView) findViewById2;
        View findViewById3 = findViewById(R.id.exq);
        l.b(findViewById3, "");
        LiveTextView liveTextView = (LiveTextView) findViewById3;
        this.f11436a = liveTextView;
        if (liveTextView == null) {
            l.a("mCountDownTv");
        }
        liveTextView.setVisibility(0);
        this.f11437b = com.bytedance.android.livesdk.utils.b.b.a(1, TimeUnit.SECONDS).b(6).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new a(this), b.f11441a);
        HSImageView hSImageView = this.f11438c;
        if (hSImageView == null) {
            l.a("mAvatarIcon");
        }
        hSImageView.setVisibility(0);
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room == null || (owner = room.getOwner()) == null) {
            imageModel = null;
        } else {
            imageModel = owner.getAvatarThumb();
        }
        HSImageView hSImageView2 = this.f11438c;
        if (hSImageView2 == null) {
            l.a("mAvatarIcon");
        }
        HSImageView hSImageView3 = this.f11438c;
        if (hSImageView3 == null) {
            l.a("mAvatarIcon");
        }
        int width = hSImageView3.getWidth();
        HSImageView hSImageView4 = this.f11438c;
        if (hSImageView4 == null) {
            l.a("mAvatarIcon");
        }
        g.a(hSImageView2, imageModel, width, hSImageView4.getHeight(), 2131234424);
        HSImageView hSImageView5 = this.f11439d;
        if (hSImageView5 == null) {
            l.a("mAvatarBg");
        }
        hSImageView5.setVisibility(0);
        z zVar = new z(5, 0.0f);
        if (imageModel == null || (urls = imageModel.getUrls()) == null || urls.size() != 0) {
            HSImageView hSImageView6 = this.f11439d;
            if (hSImageView6 == null) {
                l.a("mAvatarBg");
            }
            k.a(hSImageView6, imageModel, zVar);
            return;
        }
        c a2 = c.a(com.facebook.common.k.g.a(2131234424));
        a2.f48454k = zVar;
        e b2 = com.facebook.drawee.a.a.c.b();
        b2.f47315c = (REQUEST) a2.a();
        HSImageView hSImageView7 = this.f11439d;
        if (hSImageView7 == null) {
            l.a("mAvatarBg");
        }
        b2.f47325m = hSImageView7.getController();
        com.facebook.drawee.c.a c2 = b2.e();
        HSImageView hSImageView8 = this.f11439d;
        if (hSImageView8 == null) {
            l.a("mAvatarBg");
        }
        hSImageView8.setController(c2);
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MultiGuestAnchorAvatarBgWidget f11440a;

        static {
            Covode.recordClassIndex(6164);
        }

        a(MultiGuestAnchorAvatarBgWidget multiGuestAnchorAvatarBgWidget) {
            this.f11440a = multiGuestAnchorAvatarBgWidget;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            f.a.b.b bVar;
            long longValue = 5 - ((Number) obj).longValue();
            LiveTextView liveTextView = this.f11440a.f11436a;
            if (liveTextView == null) {
                l.a("mCountDownTv");
            }
            liveTextView.setText(String.valueOf(longValue));
            if (longValue == 0 && (bVar = this.f11440a.f11437b) != null) {
                bVar.dispose();
            }
        }
    }
}
