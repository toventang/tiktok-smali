package com.ss.android.ugc.aweme.kids.choosemusic.e;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.kids.a.e.d;
import com.ss.android.ugc.aweme.music.model.Music;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements g {

    /* renamed from: a  reason: collision with root package name */
    private final a f105598a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f105599b;

    /* renamed from: c  reason: collision with root package name */
    private final String f105600c;

    /* renamed from: d  reason: collision with root package name */
    private final Music f105601d;

    static {
        Covode.recordClassIndex(67645);
    }

    b(a aVar, boolean z, String str, Music music) {
        this.f105598a = aVar;
        this.f105599b = z;
        this.f105600c = str;
        this.f105601d = music;
    }

    @Override // b.g
    public final Object then(i iVar) {
        boolean z;
        a aVar = this.f105598a;
        boolean z2 = this.f105599b;
        String str = this.f105600c;
        Music music = this.f105601d;
        if (iVar.b()) {
            return null;
        }
        if (iVar.c()) {
            if (!z2) {
                aVar.f105590b.a("pick_status", (Object) 1);
                return null;
            }
            aVar.f105590b.a("status_pick_load_more", (Object) 1);
            return null;
        } else if (!iVar.a()) {
            return null;
        } else {
            if (!z2) {
                ArrayList arrayList = new ArrayList();
                r rVar = (r) iVar.d();
                aVar.f105590b.a("data_banner", rVar.f105629a);
                d dVar = new d();
                dVar.f105308a = "recommend_mc_id";
                dVar.f105309b = aVar.f105592d.getString(R.string.f9h);
                arrayList.add(new n(com.ss.android.ugc.aweme.kids.choosemusic.g.d.a(rVar.f105631c), dVar, 1));
                arrayList.add(new q(rVar.f105630b));
                aVar.f105590b.a("radio_cursor", Integer.valueOf(rVar.f105634f));
                DataCenter dataCenter = aVar.f105590b;
                if (rVar.f105633e == 1) {
                    z = true;
                } else {
                    z = false;
                }
                dataCenter.a("show_music_radio", Boolean.valueOf(z));
                if (str != null && rVar.f105632d != null && rVar.f105632d.size() > 0) {
                    aVar.f105590b.a("data_sticker_music_from_video", (Object) false);
                    aVar.f105590b.a("data_sticker", rVar.f105632d);
                } else if (music != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(music);
                    aVar.f105590b.a("data_sticker_music_from_video", (Object) true);
                    aVar.f105590b.a("data_sticker", arrayList2);
                }
                aVar.f105590b.a("list", arrayList);
                aVar.f105590b.a("pick_status", (Object) 0);
                return null;
            }
            r rVar2 = (r) iVar.d();
            aVar.f105590b.a("pick_list_more", com.ss.android.ugc.aweme.kids.choosemusic.g.d.a(rVar2.f105631c));
            aVar.f105590b.a("radio_cursor", Integer.valueOf(rVar2.f105634f));
            return null;
        }
    }
}
