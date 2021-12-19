package com.bytedance.android.live.liveinteract.cohost.a.d;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.liveinteract.api.m;
import com.bytedance.android.live.liveinteract.cohost.a.a.g;
import com.bytedance.android.live.liveinteract.cohost.a.c.a;
import com.bytedance.android.live.liveinteract.cohost.a.e.e;
import com.bytedance.android.live.liveinteract.platform.common.g.w;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.p;

public final class z implements g.a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f10159c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public g.b f10160a;

    /* renamed from: b  reason: collision with root package name */
    public final DataChannel f10161b;

    /* renamed from: d  reason: collision with root package name */
    private final f.a.b.a f10162d = new f.a.b.a();

    static {
        Covode.recordClassIndex(5337);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(5338);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static SpannableString a(p<? extends a.g, Long> pVar) {
            int i2;
            int i3;
            l.d(pVar, "");
            if (pVar.getFirst() == a.g.COUNTDOWN_WAITING) {
                i2 = R.string.du3;
            } else {
                i2 = R.string.dub;
            }
            long longValue = pVar.getSecond().longValue();
            String a2 = e.a(longValue);
            String b2 = e.b(longValue);
            String a3 = y.a(i2, a2, b2);
            int indexOf = a3.indexOf(a2);
            int lastIndexOf = a3.lastIndexOf(b2);
            if (indexOf < lastIndexOf) {
                i3 = lastIndexOf + b2.length();
            } else {
                int length = a2.length() + indexOf;
                indexOf = lastIndexOf;
                i3 = length;
            }
            e.a aVar = new e.a(indexOf, i3);
            int i4 = aVar.f10180a;
            int i5 = aVar.f10181b;
            SpannableString spannableString = new SpannableString(a3);
            spannableString.setSpan(new ForegroundColorSpan(y.b((int) R.color.a0l)), i4, i5, 33);
            return spannableString;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.g.a
    public final void b() {
        this.f10162d.a();
        this.f10160a = null;
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.g.a
    public final void a() {
        b.a.a("livesdk_cancel_connection_popup_click").a().a("waiting_time", com.bytedance.android.live.liveinteract.cohost.a.c.a.f10046c * 1000).a("enter_from", "connection_icon").a("invitee_list", w.a(m.RANDOM_LINK_MIC_INVITE)).b();
        com.bytedance.android.live.liveinteract.cohost.a.c.a.a(a.b.DISCONNECT);
        g.b bVar = this.f10160a;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    public z(DataChannel dataChannel) {
        this.f10161b = dataChannel;
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.g.a
    public final void a(f.a.b.b bVar) {
        l.d(bVar, "");
        this.f10162d.a(bVar);
    }
}
