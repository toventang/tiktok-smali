package com.ss.android.ugc.aweme.kids.choosemusic.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;

public final class l extends b {
    public static final a n = new a((byte) 0);
    private HashMap o;

    static {
        Covode.recordClassIndex(67621);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(67622);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.choosemusic.c.b
    public final void a() {
        com.ss.android.ugc.aweme.kids.choosemusic.a.a aVar = this.f105521e;
        h.f.b.l.b(aVar, "");
        aVar.d(false);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.o;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.choosemusic.c.b
    public final void b() {
        Boolean bool = (Boolean) this.f105519c.b("data_sticker_music_from_video", (Object) true);
        List list = (List) this.f105519c.b("data_sticker", (Object) null);
        h.f.b.l.b(bool, "");
        if (bool.booleanValue()) {
            if (this.f105519c.a("data_challenge") != null) {
                this.f105521e.e(5);
            } else if (list != null && list.size() > 0) {
                this.f105521e.e(4);
            }
        } else if (list != null && list.size() > 0) {
            this.f105521e.e(4);
        } else if (this.f105519c.a("data_challenge") != null) {
            this.f105521e.e(5);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.choosemusic.c.b
    public final void a(b bVar) {
        int i2;
        h.f.b.l.d(bVar, "");
        Object a2 = bVar.a();
        h.f.b.l.b(a2, "");
        com.ss.android.ugc.aweme.kids.choosemusic.b.a aVar = (com.ss.android.ugc.aweme.kids.choosemusic.b.a) a2;
        if (getUserVisibleHint() && aVar.f105498c != -1) {
            if (!(aVar.f105499d == 1 && aVar.f105496a == 0) && aVar.f105496a == 1) {
                com.ss.android.ugc.aweme.tux.a.i.a aVar2 = new com.ss.android.ugc.aweme.tux.a.i.a(getActivity());
                if (aVar.f105499d == 1) {
                    i2 = R.string.ahj;
                } else {
                    i2 = R.string.a9i;
                }
                aVar2.a(i2).a();
            }
        }
    }
}
