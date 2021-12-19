package com.bytedance.android.live.publicscreen.a;

import android.content.Context;
import android.widget.TextView;
import androidx.core.content.b;
import androidx.lifecycle.m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.a.d.h;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.j.dn;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final long f12197a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12198b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12199c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f12200d;

    /* renamed from: e  reason: collision with root package name */
    public final m f12201e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f12202f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f12203g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f12204h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f12205i;

    /* renamed from: j  reason: collision with root package name */
    public final Room f12206j;

    /* renamed from: k  reason: collision with root package name */
    public final User f12207k;

    /* renamed from: l  reason: collision with root package name */
    public final DataChannel f12208l;

    /* renamed from: m  reason: collision with root package name */
    public final a f12209m;
    public final d n;

    static {
        Covode.recordClassIndex(6719);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f12200d, gVar.f12200d) && l.a(this.f12201e, gVar.f12201e) && this.f12202f == gVar.f12202f && this.f12203g == gVar.f12203g && this.f12204h == gVar.f12204h && this.f12205i == gVar.f12205i && l.a(this.f12206j, gVar.f12206j) && l.a(this.f12207k, gVar.f12207k) && l.a(this.f12208l, gVar.f12208l) && l.a(this.f12209m, gVar.f12209m) && l.a(this.n, gVar.n);
    }

    public final int hashCode() {
        Context context = this.f12200d;
        int i2 = 0;
        int hashCode = (context != null ? context.hashCode() : 0) * 31;
        m mVar = this.f12201e;
        int hashCode2 = (hashCode + (mVar != null ? mVar.hashCode() : 0)) * 31;
        boolean z = this.f12202f;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode2 + i4) * 31;
        boolean z2 = this.f12203g;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        boolean z3 = this.f12204h;
        if (z3) {
            z3 = true;
        }
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = (i11 + i12) * 31;
        if (!this.f12205i) {
            i3 = 0;
        }
        int i16 = (i15 + i3) * 31;
        Room room = this.f12206j;
        int hashCode3 = (i16 + (room != null ? room.hashCode() : 0)) * 31;
        User user = this.f12207k;
        int hashCode4 = (hashCode3 + (user != null ? user.hashCode() : 0)) * 31;
        DataChannel dataChannel = this.f12208l;
        int hashCode5 = (hashCode4 + (dataChannel != null ? dataChannel.hashCode() : 0)) * 31;
        a aVar = this.f12209m;
        int hashCode6 = (hashCode5 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        d dVar = this.n;
        if (dVar != null) {
            i2 = dVar.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        return "PublicScreenContext(context=" + this.f12200d + ", owner=" + this.f12201e + ", isRtl=" + this.f12202f + ", isPortrait=" + this.f12203g + ", isTranslationEnabled=" + this.f12204h + ", isAnchor=" + this.f12205i + ", room=" + this.f12206j + ", anchor=" + this.f12207k + ", dataChannel=" + this.f12208l + ", publicScreenConfigurationProvider=" + this.f12209m + ", presenter=" + this.n + ")";
    }

    public final User a() {
        DataChannel dataChannel = this.f12208l;
        if (dataChannel != null) {
            return (User) dataChannel.b(dn.class);
        }
        return null;
    }

    public final void a(h hVar) {
        l.d(hVar, "");
        e eVar = (e) a.a(e.class);
        if (eVar != null) {
            eVar.updateModel(this.f12197a, hVar);
        }
    }

    public final void a(TextView textView) {
        l.d(textView, "");
        if (((e) a.a(e.class)).uiOptimized(this.f12203g)) {
            Context context = textView.getContext();
            l.b(context, "");
            float dimension = context.getResources().getDimension(R.dimen.xz);
            Context context2 = textView.getContext();
            l.b(context2, "");
            textView.setShadowLayer(dimension, 0.0f, context2.getResources().getDimension(R.dimen.y0), b.c(textView.getContext(), R.color.a0z));
            return;
        }
        textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public final void a(k<? extends com.bytedance.android.livesdk.ac.b.a> kVar, String str) {
        l.d(str, "");
        this.n.a(kVar, str);
    }

    public g(Context context, m mVar, boolean z, boolean z2, boolean z3, boolean z4, Room room, User user, DataChannel dataChannel, a aVar, d dVar) {
        long j2;
        long j3;
        l.d(context, "");
        l.d(mVar, "");
        l.d(aVar, "");
        l.d(dVar, "");
        this.f12200d = context;
        this.f12201e = mVar;
        this.f12202f = z;
        this.f12203g = z2;
        this.f12204h = z3;
        this.f12205i = z4;
        this.f12206j = room;
        this.f12207k = user;
        this.f12208l = dataChannel;
        this.f12209m = aVar;
        this.n = dVar;
        long j4 = 0;
        if (room != null) {
            j2 = room.getId();
        } else {
            j2 = 0;
        }
        this.f12197a = j2;
        User a2 = a();
        if (a2 != null) {
            j3 = a2.getId();
        } else {
            j3 = 0;
        }
        this.f12198b = j3;
        this.f12199c = user != null ? user.getId() : j4;
    }
}
