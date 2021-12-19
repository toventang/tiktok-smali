package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.app.d;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.c;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.f;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k;
import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.j;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class e extends a {

    /* renamed from: a  reason: collision with root package name */
    public f f130474a;

    /* renamed from: l  reason: collision with root package name */
    public c f130475l;

    /* renamed from: m  reason: collision with root package name */
    private k f130476m;
    private Aweme n;

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final b f130478a = new b();

        static {
            Covode.recordClassIndex(85564);
        }

        b() {
        }

        public final void run() {
        }
    }

    static {
        Covode.recordClassIndex(85562);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e
    public final int b() {
        return 10;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void d() {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void f() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d
    public final void h() {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final View e() {
        MethodCollector.i(3573);
        View view = new View(this.f130436i);
        MethodCollector.o(3573);
        return view;
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f130477a;

        static {
            Covode.recordClassIndex(85563);
        }

        a(e eVar) {
            this.f130477a = eVar;
        }

        public final void run() {
            NormalTrackTimeStamp normalTrackTimeStamp;
            Float scale;
            c cVar = this.f130477a.f130475l;
            f fVar = this.f130477a.f130474a;
            if (fVar == null) {
                l.b();
            }
            LinearLayout stickerView = fVar.getStickerView();
            List<NormalTrackTimeStamp> a2 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.a(this.f130477a.f130433f);
            if (!(a2 == null || (normalTrackTimeStamp = a2.get(0)) == null || (scale = normalTrackTimeStamp.getScale()) == null)) {
                scale.floatValue();
            }
            l.d(stickerView, "");
            if (stickerView.getWidth() == 0 || stickerView.getHeight() == 0) {
                stickerView.post(new c.a(cVar, stickerView));
            } else {
                cVar.a(stickerView);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public f a() {
        CountDownStickerStruct countDownStickerStruct;
        CountDownStickerStruct countDownStickerStruct2 = null;
        if (this.f130474a == null) {
            f fVar = new f(this.f130436i, this.n);
            this.f130474a = fVar;
            LinearLayout stickerView = fVar.getStickerView();
            if (stickerView != null) {
                stickerView.setVisibility(4);
            }
            f fVar2 = this.f130474a;
            if (fVar2 != null) {
                InteractStickerStruct interactStickerStruct = this.f130433f;
                if (interactStickerStruct != null) {
                    countDownStickerStruct = interactStickerStruct.getCountDownStickerStruct();
                } else {
                    countDownStickerStruct = null;
                }
                fVar2.setCountDownStickerStruct(countDownStickerStruct);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            f fVar3 = this.f130474a;
            if (fVar3 != null) {
                fVar3.setLayoutParams(layoutParams);
            }
            f fVar4 = this.f130474a;
            if (fVar4 != null) {
                fVar4.post(new a(this));
            }
        }
        f fVar5 = this.f130474a;
        if (fVar5 != null) {
            InteractStickerStruct interactStickerStruct2 = this.f130433f;
            if (interactStickerStruct2 != null) {
                countDownStickerStruct2 = interactStickerStruct2.getCountDownStickerStruct();
            }
            fVar5.setData(countDownStickerStruct2);
        }
        f fVar6 = this.f130474a;
        if (fVar6 != null) {
            fVar6.postInvalidate();
        }
        return this.f130474a;
    }

    public final boolean c() {
        k kVar;
        k kVar2;
        i lifecycle;
        i.b a2;
        String str;
        String str2;
        String str3;
        CountDownStickerStruct countDownStickerStruct;
        String str4;
        com.ss.android.ugc.aweme.sticker.i iVar;
        com.ss.android.ugc.aweme.sticker.i iVar2;
        com.ss.android.ugc.aweme.sticker.i iVar3;
        CountDownStickerStruct countDownStickerStruct2;
        String str5 = null;
        if (this.f130476m == null) {
            InteractStickerStruct interactStickerStruct = this.f130433f;
            if (interactStickerStruct != null) {
                countDownStickerStruct2 = interactStickerStruct.getCountDownStickerStruct();
            } else {
                countDownStickerStruct2 = null;
            }
            this.f130476m = k.a.a(countDownStickerStruct2, this.n, this.f130438k);
        }
        Context context = this.f130436i;
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ((androidx.fragment.app.e) context).getSupportFragmentManager().b();
        k kVar3 = this.f130476m;
        if ((kVar3 != null && kVar3.isAdded()) || (((kVar = this.f130476m) != null && kVar.isVisible()) || ((kVar2 = this.f130476m) != null && kVar2.isRemoving()))) {
            return false;
        }
        Activity a3 = com.ss.android.ugc.aweme.base.a.e.a(this.f130436i);
        if (!(a3 instanceof d)) {
            a3 = null;
        }
        androidx.core.app.d dVar = (androidx.core.app.d) a3;
        if (!(dVar == null || (lifecycle = dVar.getLifecycle()) == null || (a2 = lifecycle.a()) == null || !a2.isAtLeast(i.b.RESUMED))) {
            k kVar4 = this.f130476m;
            if (kVar4 != null) {
                Context context2 = this.f130436i;
                Objects.requireNonNull(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                kVar4.showNow(((androidx.fragment.app.e) context2).getSupportFragmentManager(), "FeedCountDownStickerDialogFragment");
            }
            f fVar = this.f130474a;
            if (fVar != null) {
                fVar.setFeedCountdownStickerDialogFragment(this.f130476m);
            }
            com.ss.android.ugc.aweme.app.f.d dVar2 = new com.ss.android.ugc.aweme.app.f.d();
            j jVar = this.f130438k;
            if (jVar == null || (iVar3 = jVar.r) == null) {
                str = null;
            } else {
                str = iVar3.f134903c;
            }
            com.ss.android.ugc.aweme.app.f.d a4 = dVar2.a("group_id", str);
            j jVar2 = this.f130438k;
            if (jVar2 == null || (iVar2 = jVar2.r) == null) {
                str2 = null;
            } else {
                str2 = iVar2.f134902b;
            }
            com.ss.android.ugc.aweme.app.f.d a5 = a4.a("author_id", str2);
            j jVar3 = this.f130438k;
            if (jVar3 == null || (iVar = jVar3.r) == null) {
                str3 = null;
            } else {
                str3 = iVar.f134901a;
            }
            com.ss.android.ugc.aweme.app.f.d a6 = a5.a("enter_from", str3);
            InteractStickerStruct interactStickerStruct2 = this.f130433f;
            if (interactStickerStruct2 != null) {
                countDownStickerStruct = interactStickerStruct2.getCountDownStickerStruct();
            } else {
                countDownStickerStruct = null;
            }
            com.ss.android.ugc.aweme.app.f.d a7 = a6.a("countdown_time", f.a.a(countDownStickerStruct));
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            String str6 = "";
            l.b(g2, str6);
            String curUserId = g2.getCurUserId();
            Aweme aweme = this.n;
            if (aweme != null) {
                str5 = aweme.getAuthorUid();
            }
            com.ss.android.ugc.aweme.app.f.d a8 = a7.a("is_author", TextUtils.equals(curUserId, str5) ? 1 : 0);
            j jVar4 = this.f130438k;
            if (!(jVar4 == null || (str4 = jVar4.f134926g) == null)) {
                str6 = str4;
            }
            r.a("livesdk_cd_layer_show", a8.a("enter_method", str6).f66730a);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void a(j jVar) {
        l.d(jVar, "");
        super.a(jVar);
        this.f130475l.a(jVar);
        f g2 = a();
        if (g2 != null) {
            g2.post(b.f130478a);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c
    public final boolean a(long j2, int i2, float f2, float f3) {
        return this.f130475l.a(j2, i2, f2, f3);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c
    public final boolean a(long j2, int i2, float f2, float f3, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.b bVar) {
        l.d(bVar, "");
        return this.f130475l.a(j2, i2, f2, f3, bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(int i2, Context context, View view, InteractStickerStruct interactStickerStruct, j jVar, Aweme aweme) {
        super(i2, context, view, interactStickerStruct, jVar);
        l.d(context, "");
        l.d(view, "");
        l.d(interactStickerStruct, "");
        this.f130475l = new c(context, this, interactStickerStruct, jVar);
        this.n = aweme;
        if (jVar != null && jVar.f134925f == 1) {
            c();
        }
    }
}
