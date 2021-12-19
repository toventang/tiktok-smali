package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.e;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.t;
import com.ss.android.ugc.aweme.editSticker.interact.view.StickerHelpBoxView;
import com.ss.android.ugc.aweme.editSticker.interact.view.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class d extends g {
    public final DonationStickerView q;
    private final int r;
    private final EditDonationStickerViewModel s;

    static {
        Covode.recordClassIndex(83459);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final boolean o() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final boolean p() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final View getDrawView() {
        return this.q;
    }

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f127232a;

        static {
            Covode.recordClassIndex(83460);
        }

        public a(d dVar) {
            this.f127232a = dVar;
        }

        public final void run() {
            this.f127232a.b();
        }
    }

    public final void r() {
        this.q.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f127233a;

        static {
            Covode.recordClassIndex(83461);
        }

        b(d dVar) {
            this.f127233a = dVar;
        }

        public final void run() {
            this.f127233a.e();
            this.f127233a.setVisibility(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final com.ss.android.ugc.aweme.editSticker.a.b a() {
        return new com.ss.android.ugc.aweme.shortvideo.sticker.a.b(this, new g.a());
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final boolean d() {
        if (this.q.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final float getEndTime() {
        return (float) this.q.b(0);
    }

    public final float getStartTime() {
        return (float) this.q.a(0);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final boolean i() {
        EditDonationStickerViewModel editDonationStickerViewModel = this.s;
        Context context = this.f88212a;
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return ((EditDonationStickerState) editDonationStickerViewModel.a((e) context)).getInTimeEditView();
    }

    public final void setAlpha(float f2) {
        this.q.setAlpha(f2);
    }

    public final void setPlayPosition(long j2) {
        this.q.setPlayPosition(j2);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final boolean b(MotionEvent motionEvent) {
        boolean b2 = super.b(motionEvent);
        this.q.setTouching(false);
        return b2;
    }

    public final void setController(b bVar) {
        l.d(bVar, "");
        this.q.setStickerController(bVar);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final boolean a(MotionEvent motionEvent) {
        boolean a2 = super.a(motionEvent);
        if (a2) {
            this.q.setTouching(true);
        }
        return a2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private d(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(5247);
        this.r = (int) n.b(context, 32.0f);
        this.f88212a = context;
        Context context2 = this.f88212a;
        if (context2 != null) {
            JediViewModel a2 = t.a((e) context2).a(EditDonationStickerViewModel.class);
            l.b(a2, "");
            this.s = (EditDonationStickerViewModel) a2;
            LayoutInflater.from(context).inflate(R.layout.asy, this);
            this.f88217f = (StickerHelpBoxView) findViewById(R.id.eb3);
            this.f88218g = findViewById(R.id.ae6);
            View findViewById = findViewById(R.id.aoe);
            l.b(findViewById, "");
            this.q = (DonationStickerView) findViewById;
            setVisibility(8);
            this.n = 0.8f;
            MethodCollector.o(5247);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        MethodCollector.o(5247);
        throw nullPointerException;
    }

    public /* synthetic */ d(Context context, byte b2) {
        this(context);
    }
}
