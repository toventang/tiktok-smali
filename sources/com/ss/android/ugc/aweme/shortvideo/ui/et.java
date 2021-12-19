package com.ss.android.ugc.aweme.shortvideo.ui;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.ah;
import com.ss.android.ugc.aweme.servicimpl.SplitVideoServiceImpl;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final /* synthetic */ class et implements ah {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131733a;

    static {
        Covode.recordClassIndex(86276);
    }

    et(cj cjVar) {
        this.f131733a = cjVar;
    }

    @Override // com.ss.android.ugc.aweme.port.in.ah
    public final void a(String str, String str2) {
        cj cjVar = this.f131733a;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            cjVar.f131598e._nameText.setValue(str2);
            cjVar.f131604k = str2;
            cjVar.f131605l = str;
            cjVar.K.playlist_id = cjVar.f131605l;
            cjVar.K.playlist_name = cjVar.f131604k;
        } else if (!Boolean.valueOf(SplitVideoServiceImpl.a().showPlayList()).booleanValue() || TextUtils.isEmpty(str2)) {
            cjVar.f131598e._nameText.setValue("");
            cjVar.f131605l = "";
            cjVar.f131604k = "";
            cjVar.K.playlist_id = "";
            cjVar.K.playlist_name = "";
        } else {
            cjVar.f131598e._nameText.setValue(str2);
            if (str2.equals(cjVar.getString(R.string.drc))) {
                str2 = "playlist_default_name";
            }
            cjVar.f131604k = str2;
            cjVar.f131605l = "";
            cjVar.K.playlist_id = cjVar.f131605l;
            cjVar.K.playlist_name = cjVar.f131604k;
        }
    }
}
