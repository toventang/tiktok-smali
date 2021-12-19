package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.d;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtButton;
import com.bytedance.keva.Keva;
import com.facebook.drawee.f.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.editSticker.interact.h;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.tools.view.widget.CircleImageView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Arrays;

public final class DonationStickerView extends LinearLayout implements h<c>, e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f127205b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public b f127206a;

    /* renamed from: c  reason: collision with root package name */
    private c f127207c;

    /* renamed from: d  reason: collision with root package name */
    private long f127208d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f127209e;

    /* renamed from: f  reason: collision with root package name */
    private long f127210f;

    /* renamed from: g  reason: collision with root package name */
    private final SafeHandler f127211g;

    /* renamed from: h  reason: collision with root package name */
    private final CircleImageView f127212h;

    /* renamed from: i  reason: collision with root package name */
    private final TextView f127213i;

    /* renamed from: j  reason: collision with root package name */
    private final DmtButton f127214j;

    /* renamed from: k  reason: collision with root package name */
    private final TextView f127215k;

    static {
        Covode.recordClassIndex(83445);
    }

    public DonationStickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(83446);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final long getPlayPosition() {
        return this.f127208d;
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DonationStickerView f127216a;

        static {
            Covode.recordClassIndex(83447);
        }

        b(DonationStickerView donationStickerView) {
            this.f127216a = donationStickerView;
        }

        public final void run() {
            this.f127216a.b();
        }
    }

    private final boolean e() {
        c cVar = this.f127207c;
        if (cVar == null || cVar.f127231d == 0) {
            return false;
        }
        return true;
    }

    public final b getStickerController() {
        b bVar = this.f127206a;
        if (bVar == null) {
            l.a("stickerController");
        }
        return bVar;
    }

    /* access modifiers changed from: package-private */
    public final c a() {
        c cVar = this.f127207c;
        if (cVar == null) {
            return new c(null, 15);
        }
        b bVar = this.f127206a;
        if (bVar == null) {
            l.a("stickerController");
        }
        cVar.f127229b = bVar.c();
        return cVar;
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.sticker.data.e' to match base method */
    @Override // com.ss.android.ugc.aweme.editSticker.interact.h
    public final /* synthetic */ c c() {
        return c.a(a());
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.h
    public final int d() {
        if (!e()) {
            return 0;
        }
        c cVar = this.f127207c;
        if (cVar == null) {
            l.b();
        }
        return cVar.f127230c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        if (r3 <= ((long) r0.f127231d)) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (8 == getVisibility()) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.c r0 = r7.f127207c
            r5 = 0
            if (r0 == 0) goto L_0x0057
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.b r1 = r7.f127206a
            if (r1 != 0) goto L_0x000e
            java.lang.String r0 = "stickerController"
            h.f.b.l.a(r0)
        L_0x000e:
            boolean r0 = r1.a()
            if (r0 != 0) goto L_0x0057
            boolean r0 = r7.f127209e
            if (r0 != 0) goto L_0x0057
            boolean r0 = r7.e()
            r6 = 1
            if (r0 == 0) goto L_0x003f
            long r3 = r7.f127208d
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.c r0 = r7.f127207c
            if (r0 != 0) goto L_0x0028
            h.f.b.l.b()
        L_0x0028:
            int r0 = r0.f127230c
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0054
            long r3 = r7.f127208d
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.c r0 = r7.f127207c
            if (r0 != 0) goto L_0x0038
            h.f.b.l.b()
        L_0x0038:
            int r0 = r0.f127231d
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0054
        L_0x003f:
            r2 = 1
            r1 = 8
            if (r2 == 0) goto L_0x0055
            int r0 = r7.getVisibility()
            if (r1 != r0) goto L_0x0055
        L_0x004a:
            r0 = r7
            if (r2 == 0) goto L_0x0051
        L_0x004d:
            com.ss.android.ugc.aweme.shortvideo.eu.b(r0, r5)
            return r6
        L_0x0051:
            r5 = 8
            goto L_0x004d
        L_0x0054:
            r2 = 0
        L_0x0055:
            r6 = 0
            goto L_0x004a
        L_0x0057:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.DonationStickerView.b():boolean");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.e
    public final void a(float f2) {
        setAlpha(f2);
    }

    public final void setPlayPosition(long j2) {
        this.f127208d = j2;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.e
    public final void setEndTime(int i2) {
        c cVar = this.f127207c;
        if (cVar != null) {
            cVar.f127231d = i2;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.e
    public final void setStartTime(int i2) {
        c cVar = this.f127207c;
        if (cVar != null) {
            cVar.f127230c = i2;
        }
    }

    public final void setStickerController(b bVar) {
        l.d(bVar, "");
        this.f127206a = bVar;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.h
    public final int a(int i2) {
        if (!e()) {
            return i2;
        }
        c cVar = this.f127207c;
        if (cVar == null) {
            l.b();
        }
        return cVar.f127230c;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.h
    public final int b(int i2) {
        if (!e()) {
            return i2;
        }
        c cVar = this.f127207c;
        if (cVar == null) {
            l.b();
        }
        return cVar.f127231d;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.h
    public final int c(int i2) {
        if (!e()) {
            return i2;
        }
        c cVar = this.f127207c;
        if (cVar == null) {
            l.b();
        }
        return cVar.f127231d;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.c
    public final void setAlpha(boolean z) {
        float f2;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.3137255f;
        }
        setAlpha(f2);
    }

    public final void setDonationStickerData(c cVar) {
        l.d(cVar, "");
        this.f127207c = cVar;
        com.ss.android.ugc.gamora.editor.sticker.donation.c.b bVar = cVar.f127228a;
        if (bVar != null) {
            a(bVar);
        }
        this.f127215k.setText(Keva.getRepo("donation_sticker").getString("donation_match_text", ""));
    }

    public final void setTouching(boolean z) {
        if (z != this.f127209e) {
            this.f127209e = z;
            if (!z) {
                this.f127210f = SystemClock.elapsedRealtime();
                this.f127211g.postDelayed(new b(this), 1000);
            }
        }
    }

    public final void a(com.ss.android.ugc.gamora.editor.sticker.donation.c.b bVar) {
        l.d(bVar, "");
        UrlModel icon = bVar.getIcon();
        if (icon != null) {
            com.ss.android.ugc.tools.c.a.a(this.f127212h, icon, -1, -1);
        }
        TextView textView = this.f127213i;
        String string = getContext().getString(R.string.bb4);
        l.b(string, "");
        String a2 = com.a.a(string, Arrays.copyOf(new Object[]{bVar.getName()}, 1));
        l.b(a2, "");
        textView.setText(a2);
    }

    private /* synthetic */ DonationStickerView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private DonationStickerView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(6258);
        com.a.a(LayoutInflater.from(context), R.layout.y6, this, true);
        View findViewById = findViewById(R.id.d03);
        l.b(findViewById, "");
        CircleImageView circleImageView = (CircleImageView) findViewById;
        this.f127212h = circleImageView;
        View findViewById2 = findViewById(R.id.eex);
        l.b(findViewById2, "");
        this.f127213i = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.ya);
        l.b(findViewById3, "");
        DmtButton dmtButton = (DmtButton) findViewById3;
        this.f127214j = dmtButton;
        View findViewById4 = findViewById(R.id.ao_);
        l.b(findViewById4, "");
        this.f127215k = (TextView) findViewById4;
        com.facebook.drawee.f.a aVar = (com.facebook.drawee.f.a) circleImageView.getHierarchy();
        l.b(aVar, "");
        e eVar = aVar.f47454a;
        if (eVar != null) {
            eVar.c(n.b(context, 0.5f));
        }
        com.facebook.drawee.f.a aVar2 = (com.facebook.drawee.f.a) circleImageView.getHierarchy();
        l.b(aVar2, "");
        e eVar2 = aVar2.f47454a;
        if (eVar2 != null) {
            eVar2.f47480f = androidx.core.content.b.c(context, R.color.b2);
        }
        dmtButton.setEnabled(false);
        dmtButton.setClickable(false);
        Activity a2 = com.ss.android.ugc.aweme.scene.a.a(context);
        if (a2 != null) {
            this.f127211g = new SafeHandler((d) a2);
            MethodCollector.o(6258);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        MethodCollector.o(6258);
        throw nullPointerException;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.sticker.data.e, int, int] */
    @Override // com.ss.android.ugc.aweme.editSticker.interact.h
    public final /* synthetic */ void a(c cVar, int i2, int i3) {
        c cVar2 = cVar;
        l.d(cVar2, "");
        NormalTrackTimeStamp a2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(cVar2.f127229b);
        b bVar = this.f127206a;
        if (bVar == null) {
            l.a("stickerController");
        }
        NormalTrackTimeStamp a3 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(bVar.c());
        c cVar3 = this.f127207c;
        if (cVar3 != null) {
            cVar3.f127230c = cVar2.f127230c;
        }
        c cVar4 = this.f127207c;
        if (cVar4 != null) {
            cVar4.f127231d = cVar2.f127231d;
        }
        if (a2 != null && a3 != null) {
            a2.setRotation(a2.getRotation() - a3.getRotation());
            if (!l.a(a3.getScale(), 0.0f)) {
                float floatValue = a2.getScale().floatValue();
                Float scale = a3.getScale();
                l.b(scale, "");
                a2.setScale(Float.valueOf(floatValue / scale.floatValue()));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(a2);
            String b2 = g.a().C().getRetrofitFactoryGson().b(arrayList);
            InteractStickerStruct interactStickerStruct = cVar2.f127229b;
            if (interactStickerStruct != null) {
                interactStickerStruct.setTrackList(b2);
            }
            b bVar2 = this.f127206a;
            if (bVar2 == null) {
                l.a("stickerController");
            }
            bVar2.b(false);
            b bVar3 = this.f127206a;
            if (bVar3 == null) {
                l.a("stickerController");
            }
            bVar3.a(cVar2.f127229b, (Boolean) false);
            b bVar4 = this.f127206a;
            if (bVar4 == null) {
                l.a("stickerController");
            }
            bVar4.b(true);
        }
    }
}
