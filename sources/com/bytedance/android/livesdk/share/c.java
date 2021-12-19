package com.bytedance.android.livesdk.share;

import android.content.Context;
import com.bytedance.android.live.i.a.d;
import com.bytedance.android.live.n.k;
import com.bytedance.android.livesdk.ap.b;
import com.bytedance.android.livesdk.definition.c;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f21445a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(12627);
    }

    public static final class a extends com.bytedance.android.livesdkapi.depend.e.a {
        static {
            Covode.recordClassIndex(12628);
        }

        @Override // com.bytedance.android.livesdkapi.depend.e.a
        public final String b() {
            return "definition_selection_key";
        }

        @Override // com.bytedance.android.livesdkapi.depend.e.a
        public final int c() {
            return R.string.duk;
        }

        @Override // com.bytedance.android.livesdkapi.depend.e.a
        public final int d() {
            return 1000;
        }

        @Override // com.bytedance.android.livesdkapi.depend.e.a
        public final boolean e() {
            b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.cP;
            l.b(bVar, "");
            boolean z = !bVar.a().booleanValue();
            b<Boolean> bVar2 = com.bytedance.android.livesdk.ap.a.cP;
            l.b(bVar2, "");
            com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar2, (Object) true);
            return z;
        }

        @Override // com.bytedance.android.livesdkapi.depend.e.a
        public final int a() {
            String g2;
            f fVar = f.a.f23366a;
            String str = "";
            l.b(fVar, str);
            EnterRoomLinkSession a2 = fVar.a();
            l.b(a2, str);
            String str2 = a2.f23354b.f23299c.E;
            if (str2 == null) {
                str2 = str;
            }
            com.bytedance.android.live.base.a a3 = com.bytedance.android.live.t.a.a(d.class);
            l.b(a3, str);
            k b2 = ((d) a3).getLivePlayControllerManager().b(str2);
            if (!(b2 == null || (g2 = b2.g()) == null)) {
                str = g2;
            }
            com.bytedance.android.live.core.c.a.a(4, "LiveSheetActionProvider", "getIconResId(). tag=" + str2 + ", currentSdkKey=" + str);
            int hashCode = str.hashCode();
            if (hashCode != -1008619738) {
                if (hashCode != 3324) {
                    if (hashCode != 3448) {
                        if (hashCode != 3665) {
                            if (hashCode == 115761 && str.equals("uhd")) {
                                return 2131234524;
                            }
                        } else if (str.equals("sd")) {
                            return 2131234526;
                        }
                    } else if (str.equals("ld")) {
                        return 2131234525;
                    }
                } else if (str.equals("hd")) {
                    return 2131234527;
                }
            } else if (str.equals("origin")) {
                return 2131234528;
            }
            return 2131234524;
        }

        @Override // com.bytedance.android.livesdkapi.depend.e.a
        public final void a(Context context) {
            c.a.a(context, false);
        }
    }
}
