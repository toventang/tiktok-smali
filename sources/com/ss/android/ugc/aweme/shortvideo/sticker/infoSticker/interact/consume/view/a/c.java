package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.sticker.i;
import com.ss.android.ugc.aweme.sticker.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    public static final a f130458c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public ConstraintLayout f130459a;

    /* renamed from: b  reason: collision with root package name */
    public TuxTextView f130460b;

    /* renamed from: d  reason: collision with root package name */
    private boolean f130461d;

    /* renamed from: e  reason: collision with root package name */
    private j f130462e;

    static {
        Covode.recordClassIndex(85555);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85556);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final j getInteractStickerParams() {
        return this.f130462e;
    }

    public final boolean getTurnOnMic() {
        return this.f130461d;
    }

    public final TuxTextView getDuetTextView() {
        TuxTextView tuxTextView = this.f130460b;
        if (tuxTextView == null) {
            l.a("duetTextView");
        }
        return tuxTextView;
    }

    public final ConstraintLayout getRealDuetStickerView() {
        ConstraintLayout constraintLayout = this.f130459a;
        if (constraintLayout == null) {
            l.a("realDuetStickerView");
        }
        return constraintLayout;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        String str;
        String str2;
        i iVar;
        i iVar2;
        i iVar3;
        super.onAttachedToWindow();
        d dVar = new d();
        j jVar = this.f130462e;
        String str3 = null;
        if (jVar == null || (iVar3 = jVar.r) == null) {
            str = null;
        } else {
            str = iVar3.f134903c;
        }
        d a2 = dVar.a("group_id", str);
        j jVar2 = this.f130462e;
        if (jVar2 == null || (iVar2 = jVar2.r) == null) {
            str2 = null;
        } else {
            str2 = iVar2.f134902b;
        }
        d a3 = a2.a("author_id", str2);
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        d a4 = a3.a("user_id", g2.getCurUserId());
        j jVar3 = this.f130462e;
        if (!(jVar3 == null || (iVar = jVar3.r) == null)) {
            str3 = iVar.f134901a;
        }
        r.a("duet_sticker_show", a4.a("enter_from", str3).f66730a);
    }

    public final void setInteractStickerParams(j jVar) {
        this.f130462e = jVar;
    }

    public final void setTurnOnMic(boolean z) {
        this.f130461d = z;
    }

    public final void setDuetTextView(TuxTextView tuxTextView) {
        l.d(tuxTextView, "");
        this.f130460b = tuxTextView;
    }

    public final void setRealDuetStickerView(ConstraintLayout constraintLayout) {
        l.d(constraintLayout, "");
        this.f130459a = constraintLayout;
    }

    public final void a(String str) {
        l.d(str, "");
        TuxTextView tuxTextView = this.f130460b;
        if (tuxTextView == null) {
            l.a("duetTextView");
        }
        tuxTextView.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        l.d(context, "");
        MethodCollector.i(2607);
        View a2 = com.a.a(LayoutInflater.from(getContext()), R.layout.a95, this, false);
        if (a2 != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) a2;
            this.f130459a = constraintLayout;
            if (constraintLayout == null) {
                l.a("realDuetStickerView");
            }
            View findViewById = constraintLayout.findViewById(R.id.ar0);
            l.b(findViewById, "");
            TuxTextView tuxTextView = (TuxTextView) findViewById;
            this.f130460b = tuxTextView;
            if (tuxTextView == null) {
                l.a("duetTextView");
            }
            tuxTextView.a(30.0f);
            TuxTextView tuxTextView2 = this.f130460b;
            if (tuxTextView2 == null) {
                l.a("duetTextView");
            }
            tuxTextView2.setTypeface(AVExternalServiceImpl.a().typeFaceService().getTypefaceByFontName("Neon"));
            ConstraintLayout constraintLayout2 = this.f130459a;
            if (constraintLayout2 == null) {
                l.a("realDuetStickerView");
            }
            addView(constraintLayout2);
            MethodCollector.o(2607);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        MethodCollector.o(2607);
        throw nullPointerException;
    }
}
