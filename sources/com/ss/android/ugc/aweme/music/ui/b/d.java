package com.ss.android.ugc.aweme.music.ui.b;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.music.k.a;
import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.ThirdMusicCoverItem;
import h.f.b.l;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    static ThirdMusicCoverItem f111915a;

    /* renamed from: b  reason: collision with root package name */
    static ThirdMusicCoverItem f111916b;

    /* renamed from: c  reason: collision with root package name */
    public static final d f111917c = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(71934);
    }

    public static ThirdMusicCoverItem a() {
        if (f111916b == null) {
            String a2 = a.C2857a.a("third_music_icon_info", "", "music_sp");
            if (!TextUtils.isEmpty(a2)) {
                try {
                    f111916b = (ThirdMusicCoverItem) new f().a(a2, ThirdMusicCoverItem.class);
                } catch (Throwable unused) {
                    a(a2);
                }
            }
        }
        return f111916b;
    }

    public static void a(String str) {
        b.a("third_music_json_parse_error", new c().a("message", str).a());
    }

    public static final class a implements com.bytedance.ies.ugc.aweme.ttsetting.b {
        static {
            Covode.recordClassIndex(71935);
        }

        @Override // com.bytedance.ies.ugc.aweme.ttsetting.b
        public final void a(Throwable th) {
            l.d(th, "");
        }

        @Override // com.bytedance.ies.ugc.aweme.ttsetting.b
        public final void a(JSONObject jSONObject) {
            JSONObject jSONObject2;
            JSONObject jSONObject3 = null;
            if (jSONObject != null) {
                jSONObject2 = jSONObject.optJSONObject("aweme_third_party_music_cover");
                jSONObject3 = jSONObject.optJSONObject("aweme_third_party_music_icon");
            } else {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                try {
                    d.f111915a = (ThirdMusicCoverItem) new f().a(jSONObject2.toString(), ThirdMusicCoverItem.class);
                    a.C2857a.a("third_music_cover_info", (Object) jSONObject2.toString(), "music_sp");
                } catch (Throwable unused) {
                    String jSONObject4 = jSONObject2.toString();
                    l.b(jSONObject4, "");
                    d.a(jSONObject4);
                }
            }
            if (jSONObject3 != null) {
                try {
                    d.f111916b = (ThirdMusicCoverItem) new f().a(jSONObject3.toString(), ThirdMusicCoverItem.class);
                    a.C2857a.a("third_music_icon_info", (Object) jSONObject3.toString(), "music_sp");
                } catch (Throwable unused2) {
                    String jSONObject5 = jSONObject3.toString();
                    l.b(jSONObject5, "");
                    d.a(jSONObject5);
                }
            }
        }
    }

    private static boolean a(List<ExternalMusicInfo> list) {
        ExternalMusicInfo externalMusicInfo;
        if (com.bytedance.common.utility.collection.b.a((Collection) list)) {
            return false;
        }
        String str = null;
        if (!(list == null || (externalMusicInfo = list.get(0)) == null)) {
            str = externalMusicInfo.getPartnerName();
        }
        return TextUtils.equals(str, "awa");
    }

    public static void a(TextView textView, Music music) {
        List<ExternalMusicInfo> list;
        int i2;
        int i3;
        if (music != null) {
            list = music.getExternalMusicInfos();
        } else {
            list = null;
        }
        if (a(list)) {
            i2 = 2131233932;
        } else {
            i2 = 0;
        }
        if (textView != null) {
            if (i2 > 0) {
                i3 = n.a(5.0d);
            } else {
                i3 = 0;
            }
            textView.setCompoundDrawablePadding(i3);
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, i2, 0);
        }
    }
}
