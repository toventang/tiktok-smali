package com.ss.android.ugc.aweme.autoplay.d.a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.autoplay.player.b;
import com.ss.android.ugc.aweme.autoplay.player.video.c;
import com.ss.android.ugc.aweme.feed.helper.h;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.b.l;

public final class e implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public View.OnClickListener f67337a;

    /* renamed from: b  reason: collision with root package name */
    public int f67338b;

    /* renamed from: c  reason: collision with root package name */
    public AwemeRawAd f67339c;

    /* renamed from: d  reason: collision with root package name */
    public c f67340d;

    /* renamed from: e  reason: collision with root package name */
    public View f67341e;

    static {
        Covode.recordClassIndex(41476);
    }

    private /* synthetic */ e() {
        this(null, null);
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.a
    public final void a() {
        c cVar = this.f67340d;
        if (cVar != null && this.f67341e != null && cVar.f67578d != null) {
            c cVar2 = this.f67340d;
            if (cVar2 == null) {
                l.b();
            }
            com.ss.android.ugc.aweme.flowfeed.utils.b a2 = cVar2.a();
            if (a2 != null) {
                cVar2.f67579e = true;
                h a3 = h.a();
                l.b(a3, "");
                a3.f93338a = cVar2.o;
                h a4 = h.a();
                l.b(a4, "");
                a4.f93340c = a2.f96174d;
                h a5 = h.a();
                l.b(a5, "");
                a5.f93344g = true;
                cVar2.o = null;
                com.ss.android.ugc.aweme.flowfeed.utils.b a6 = cVar2.a();
                if (a6 != null) {
                    a6.f96176f = null;
                }
                com.ss.android.ugc.aweme.newfollow.c.c cVar3 = cVar2.f67580f;
                if (cVar3 != null) {
                    cVar3.a();
                }
                com.ss.android.ugc.aweme.newfollow.c.c cVar4 = cVar2.f67580f;
                if (cVar4 != null) {
                    cVar4.f112580a = null;
                }
                View.OnClickListener onClickListener = this.f67337a;
                if (onClickListener != null) {
                    onClickListener.onClick(this.f67341e);
                }
            }
        }
    }

    public e(c cVar, View view) {
        this.f67340d = cVar;
        this.f67341e = view;
    }
}
