package com.ss.android.ugc.aweme.choosemusic.model;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.choosemusic.utils.c;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements g {

    /* renamed from: a  reason: collision with root package name */
    private final b f70668a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f70669b;

    /* renamed from: c  reason: collision with root package name */
    private final String f70670c;

    /* renamed from: d  reason: collision with root package name */
    private final Music f70671d;

    static {
        Covode.recordClassIndex(43571);
    }

    k(b bVar, boolean z, String str, Music music) {
        this.f70668a = bVar;
        this.f70669b = z;
        this.f70670c = str;
        this.f70671d = music;
    }

    @Override // b.g
    public final Object then(i iVar) {
        boolean z;
        b bVar = this.f70668a;
        boolean z2 = this.f70669b;
        String str = this.f70670c;
        Music music = this.f70671d;
        if (iVar.b()) {
            return null;
        }
        if (iVar.c()) {
            if (!z2) {
                bVar.f70641b.a("pick_status", (Object) 1);
                return null;
            }
            bVar.f70641b.a("status_pick_load_more", (Object) 1);
            return null;
        } else if (!iVar.a()) {
            return null;
        } else {
            if (!z2) {
                ArrayList arrayList = new ArrayList();
                ah ahVar = (ah) iVar.d();
                bVar.f70641b.a("data_banner", ahVar.f70617a);
                MusicCollectionItem musicCollectionItem = new MusicCollectionItem();
                musicCollectionItem.mcId = "recommend_mc_id";
                musicCollectionItem.mcName = bVar.f70643d.getString(R.string.f9h);
                arrayList.add(new ad(c.a(ahVar.f70619c), musicCollectionItem, 1));
                arrayList.add(new ag(ahVar.f70618b));
                bVar.f70641b.a("radio_cursor", Integer.valueOf(ahVar.f70622f));
                DataCenter dataCenter = bVar.f70641b;
                if (ahVar.f70621e == 1) {
                    z = true;
                } else {
                    z = false;
                }
                dataCenter.a("show_music_radio", Boolean.valueOf(z));
                if (str == null || ahVar.f70620d == null || ahVar.f70620d.size() <= 0) {
                    if (music != null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(music);
                        if (!b.a(arrayList2).isEmpty()) {
                            bVar.f70641b.a("data_sticker_music_from_video", (Object) true);
                            bVar.f70641b.a("data_sticker", b.a(arrayList2));
                        } else {
                            bVar.f70641b.a("is_busi_sticker", (Object) false);
                        }
                    }
                } else if (!b.a(ahVar.f70620d).isEmpty()) {
                    bVar.f70641b.a("data_sticker_music_from_video", (Object) false);
                    bVar.f70641b.a("data_sticker", b.a(ahVar.f70620d));
                } else {
                    bVar.f70641b.a("is_busi_sticker", (Object) false);
                }
                bVar.f70641b.a("list", arrayList);
                bVar.f70641b.a("pick_status", (Object) 0);
                return null;
            }
            ah ahVar2 = (ah) iVar.d();
            bVar.f70641b.a("pick_list_more", c.a(ahVar2.f70619c));
            bVar.f70641b.a("radio_cursor", Integer.valueOf(ahVar2.f70622f));
            return null;
        }
    }
}
