package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation;

import android.content.Context;
import android.graphics.PointF;
import android.os.SystemClock;
import android.widget.FrameLayout;
import androidx.fragment.app.e;
import b.i;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.t;
import com.ss.android.ugc.aweme.editSticker.interact.view.g;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.d;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import h.p;
import h.v;
import java.io.File;
import java.util.LinkedList;
import java.util.Objects;
import java.util.UUID;

public final class b extends com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c {
    public static final a A = new a((byte) 0);
    private EditDonationStickerViewModel B;

    /* renamed from: a  reason: collision with root package name */
    public c f127222a;

    /* renamed from: b  reason: collision with root package name */
    public String f127223b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f127224c;

    static {
        Covode.recordClassIndex(83454);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final int f() {
        return R.string.ay0;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(83455);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final boolean b() {
        if (this.f127222a != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final void d() {
        this.f127222a = null;
        super.d();
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f127226a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InteractStickerStruct f127227b;

        static {
            Covode.recordClassIndex(83457);
        }

        c(b bVar, InteractStickerStruct interactStickerStruct) {
            this.f127226a = bVar;
            this.f127227b = interactStickerStruct;
        }

        public final void run() {
            b.super.a((b) this.f127227b);
            g gVar = this.f127226a.f127193l;
            l.b(gVar, "");
            gVar.setVisibility(0);
        }
    }

    private static String q() {
        return "pi_start" + UUID.randomUUID().toString() + "pi_end";
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final boolean g() {
        EditDonationStickerViewModel editDonationStickerViewModel = this.B;
        if (editDonationStickerViewModel == null) {
            l.a("donationStickerViewModel");
        }
        Context context = this.t;
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return ((EditDonationStickerState) editDonationStickerViewModel.a((e) context)).getInTimeEditView();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.d.b
    public final InteractStickerStruct c() {
        float f2;
        String str;
        String str2;
        com.ss.android.ugc.gamora.editor.sticker.donation.c.b bVar;
        String addTime;
        com.ss.android.ugc.gamora.editor.sticker.donation.c.b bVar2;
        com.ss.android.ugc.gamora.editor.sticker.donation.c.b bVar3;
        d dVar = null;
        if (!b() || this.f127193l == null) {
            return null;
        }
        InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
        interactStickerStruct.setType(6);
        LinkedList linkedList = new LinkedList();
        NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
        g gVar = this.f127193l;
        String str3 = "";
        l.b(gVar, str3);
        normalTrackTimeStamp.setRotation(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c.b(gVar.getRotateAngle()));
        g gVar2 = this.f127193l;
        l.b(gVar2, str3);
        normalTrackTimeStamp.setScale(Float.valueOf(gVar2.getScale()));
        PointF a2 = a(this.f127193l.getCenterViewPoint());
        normalTrackTimeStamp.setX(a2.x);
        normalTrackTimeStamp.setY(a2.y);
        g gVar3 = this.f127193l;
        if (!(gVar3 instanceof d)) {
            gVar3 = null;
        }
        d dVar2 = (d) gVar3;
        float f3 = 0.0f;
        if (dVar2 != null) {
            f2 = dVar2.getStartTime();
        } else {
            f2 = 0.0f;
        }
        normalTrackTimeStamp.setStartTime(f2);
        g gVar4 = this.f127193l;
        if (gVar4 instanceof d) {
            dVar = gVar4;
        }
        d dVar3 = dVar;
        if (dVar3 != null) {
            f3 = dVar3.getEndTime();
        }
        normalTrackTimeStamp.setEndTime(f3);
        g gVar5 = this.f127193l;
        l.b(gVar5, str3);
        float contentViewWidth = (float) gVar5.getContentViewWidth();
        g gVar6 = this.f127193l;
        l.b(gVar6, str3);
        PointF a3 = a(new PointF(contentViewWidth, (float) gVar6.getContentViewHeight()));
        normalTrackTimeStamp.setWidth(a3.x);
        normalTrackTimeStamp.setHeight(a3.y);
        linkedList.add(normalTrackTimeStamp);
        com.ss.android.ugc.aweme.editSticker.f.e.a(interactStickerStruct, linkedList);
        p[] pVarArr = new p[3];
        c cVar = this.f127222a;
        if (cVar == null || (bVar3 = cVar.f127228a) == null || (str = bVar3.getName()) == null) {
            str = str3;
        }
        pVarArr[0] = v.a("donation_name", str);
        c cVar2 = this.f127222a;
        if (cVar2 == null || (bVar2 = cVar2.f127228a) == null || (str2 = bVar2.getDonateLink()) == null) {
            str2 = str3;
        }
        pVarArr[1] = v.a("donation_url", str2);
        c cVar3 = this.f127222a;
        if (!(cVar3 == null || (bVar = cVar3.f127228a) == null || (addTime = bVar.getAddTime()) == null)) {
            str3 = addTime;
        }
        pVarArr[2] = v.a("add_anchor_time", str3);
        interactStickerStruct.setAttr(com.ss.android.ugc.aweme.port.in.g.a().C().getRetrofitFactoryGson().b(ag.c(pVarArr)));
        return interactStickerStruct;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final boolean a(g gVar) {
        if (!(gVar instanceof d)) {
            return false;
        }
        this.f127222a = null;
        return super.a(gVar);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final g a(Context context) {
        l.d(context, "");
        d dVar = new d(context, (byte) 0);
        dVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        dVar.setController(this);
        dVar.setLockMode(true);
        return dVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.b$b  reason: collision with other inner class name */
    public static final class C3303b<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f127225a;

        static {
            Covode.recordClassIndex(83456);
        }

        public C3303b(b bVar) {
            this.f127225a = bVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            l.b(iVar, "");
            if (iVar.d() == null) {
                return null;
            }
            g gVar = this.f127225a.f127193l;
            Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.DonationStickerInteractView");
            c a2 = c.a(((d) gVar).q.a());
            Object d2 = iVar.d();
            l.b(d2, "");
            return new a(a2, (com.ss.android.ugc.aweme.editSticker.compile.b) d2);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final void a(InteractStickerStruct interactStickerStruct) {
        if (this.f127193l != null) {
            this.f127193l.postDelayed(new c(this, interactStickerStruct), 300);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final void a(String str) {
        if (!m.a(str)) {
            if (str == null) {
                l.b();
            }
            if (!h.m.p.a((CharSequence) str, (CharSequence) "pi_start", false) || !h.m.p.a((CharSequence) str, (CharSequence) "pi_end", false)) {
                String str2 = File.separator;
                l.b(str2, "");
                if (h.m.p.c(str, str2, false)) {
                    super.a(str + q());
                } else {
                    super.a(str + q());
                }
            } else {
                super.a(new h.m.l("pi_start(.*?)pi_end").replace(str, q()));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final void a(Context context, FrameLayout frameLayout) {
        super.a(context, frameLayout);
        Context context2 = this.t;
        Objects.requireNonNull(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = t.a((e) context2).a(EditDonationStickerViewModel.class);
        l.b(a2, "");
        this.B = (EditDonationStickerViewModel) a2;
        this.f127224c = false;
    }

    public final void a(c cVar, boolean z, boolean z2) {
        com.ss.android.ugc.gamora.editor.sticker.donation.c.b bVar;
        l.d(cVar, "");
        com.ss.android.ugc.gamora.editor.sticker.donation.c.b bVar2 = cVar.f127228a;
        d dVar = null;
        if ((bVar2 == null || bVar2.getAddTime() == null) && (bVar = cVar.f127228a) != null) {
            bVar.setAddTime(String.valueOf(SystemClock.elapsedRealtime()));
        }
        this.f127222a = cVar;
        a(z2);
        g gVar = this.f127193l;
        if (gVar instanceof d) {
            dVar = gVar;
        }
        d dVar2 = dVar;
        if (dVar2 != null) {
            l.d(cVar, "");
            dVar2.setVisibility(4);
            dVar2.q.setDonationStickerData(cVar);
            if (z) {
                dVar2.post(new d.b(dVar2));
            }
        }
        if (this.n != null) {
            this.n.f();
        }
    }
}
