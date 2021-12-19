package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.music.model.MusicBeat;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.property.bg;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shortvideo.ea;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e;
import com.ss.android.ugc.aweme.shortvideo.r.a;
import com.ss.android.ugc.tools.utils.k;
import h.f.b.l;
import java.util.ArrayList;
import org.json.JSONObject;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static String f125942a;

    /* renamed from: b  reason: collision with root package name */
    public static String f125943b = (dj.f126461d + "aiCutData.txt");

    /* renamed from: c  reason: collision with root package name */
    public static boolean f125944c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f125945d;

    /* renamed from: e  reason: collision with root package name */
    public static final f f125946e = new f();

    private f() {
    }

    public static int a() {
        if (f125945d) {
            return e.f129495a;
        }
        return 12;
    }

    public static boolean c() {
        if (!f125944c || !f125945d) {
            return false;
        }
        return true;
    }

    public static boolean b() {
        if (!bg.a() || g.a().A().a()) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(82749);
        boolean z = true;
        if (!b.a().a(true, "enable_music_stick_point", false) || g.a().A().a()) {
            z = false;
        }
        f125945d = z;
    }

    public static String b(c cVar) {
        if (cVar == null || cVar.getStickPointMusicAlg() == null) {
            return "";
        }
        return cVar.getStickPointMusicAlg().getDefaultLocalPath();
    }

    public static String c(c cVar) {
        if (cVar == null || TextUtils.isEmpty(cVar.getPath())) {
            return null;
        }
        return g.a().s().c(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        if (r5 == null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.Context r5) {
        /*
            if (r5 == 0) goto L_0x0033
            android.content.res.Resources r1 = r5.getResources()
            if (r1 == 0) goto L_0x0033
            r0 = 2131830107(0x7f11255b, float:1.9293202E38)
            java.lang.String r5 = r1.getString(r0)
            if (r5 != 0) goto L_0x0014
        L_0x0011:
            h.f.b.l.b()
        L_0x0014:
            java.lang.String r4 = ""
            h.f.b.l.b(r5, r4)
            r3 = 1
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r1 = 0
            int r0 = a()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r1] = r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r3)
            java.lang.String r0 = com.a.a(r5, r0)
            h.f.b.l.b(r0, r4)
            return r0
        L_0x0033:
            r5 = 0
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.a(android.content.Context):java.lang.String");
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder append = new StringBuilder().append(g.a().s().c());
        Uri parse = Uri.parse(str);
        l.b(parse, "");
        return append.append(d.b(parse.getPath())).append(".json").toString();
    }

    public static String d(c cVar) {
        if (cVar == null) {
            return "music == null";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("music_id", cVar.getMusicId());
            if (cVar.getStickPointMusicAlg() != null) {
                jSONObject.put("AO_url", cVar.getStickPointMusicAlg().getVeBeatsUrl());
                jSONObject.put("C_url", cVar.getStickPointMusicAlg().getDownBeatsUrl());
                jSONObject.put("A1_url", cVar.getStickPointMusicAlg().getNoStrengthBeatsUrl());
                jSONObject.put("man_mode_url", cVar.getStickPointMusicAlg().getManModeBeatsUrl());
            } else {
                jSONObject.put("no_url", cVar.getId());
            }
            String jSONObject2 = jSONObject.toString();
            l.b(jSONObject2, "");
            return jSONObject2;
        } catch (Exception unused) {
            return "exception";
        }
    }

    public static void a(c cVar) {
        int i2;
        int i3;
        if (cVar != null) {
            ea eaVar = new ea();
            eaVar.setMusicId(cVar.getMusicId());
            cVar.setStickPointMusicAlg(eaVar);
            eaVar.setDefaultLocalUrl(cVar.getPath());
            eaVar.setDefaultLocalPath(a(eaVar.getDefaultLocalUrl()));
            String str = cVar.extra;
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject optJSONObject = new JSONObject(str).optJSONObject("beats");
                    if (optJSONObject != null) {
                        eaVar.setVeBeatsUrl(optJSONObject.optString("audio_effect_onset"));
                        eaVar.setDownBeatsUrl(optJSONObject.optString("merged_beats"));
                        eaVar.setNoStrengthBeatsUrl(optJSONObject.optString("beats_tracker"));
                        eaVar.setDownBeatsPath(a(eaVar.getDownBeatsUrl()));
                        eaVar.setVeBeatsPath(a(eaVar.getVeBeatsUrl()));
                        eaVar.setNoStrengthBeatsPath(a(eaVar.getNoStrengthBeatsUrl()));
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                MusicBeat musicBeat = cVar.getMusicBeat();
                if (musicBeat != null) {
                    Integer minVideoNum = musicBeat.getMinVideoNum();
                    int i4 = 0;
                    if (minVideoNum != null) {
                        i2 = minVideoNum.intValue();
                    } else {
                        i2 = 0;
                    }
                    eaVar.setMinSeg(i2);
                    Integer maxVideoNum = musicBeat.getMaxVideoNum();
                    if (maxVideoNum != null) {
                        i4 = maxVideoNum.intValue();
                    }
                    eaVar.setMaxSeg(i4);
                    Integer type = musicBeat.getType();
                    if (type != null) {
                        i3 = type.intValue();
                    } else {
                        i3 = ea.BEATES_FILE_DEFAULT;
                    }
                    eaVar.setAlgType(i3);
                    eaVar.setManModeBeatsUrl(musicBeat.getManMadeBeats());
                    eaVar.setManModeBeatsPath(a(eaVar.getManModeBeatsUrl()));
                }
            }
        }
    }

    public final boolean a(Activity activity, ArrayList<String> arrayList, long j2) {
        Bundle b2 = b(activity, arrayList, j2);
        if (b2 == null) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        a.a().a(activity, b2, 2, 1001);
        return true;
    }

    public final Bundle b(Activity activity, ArrayList<String> arrayList, long j2) {
        if (k.a(arrayList)) {
            return null;
        }
        int a2 = a();
        if (arrayList == null) {
            l.b();
        }
        int size = a2 - arrayList.size();
        if (size <= 0) {
            new com.ss.android.ugc.aweme.tux.a.i.a(activity).a(a(activity)).a();
            return null;
        }
        long j3 = 3600000 - j2;
        Bundle bundle = new Bundle();
        int i2 = 4;
        if (f125945d) {
            i2 = 6;
            bundle.putInt("key_photo_select_min_count", 0);
            bundle.putInt("key_photo_select_max_count", size);
        }
        bundle.putInt("key_support_flag", i2);
        bundle.putBoolean("Key_enable_multi_video", true);
        bundle.putInt("key_video_select_min_count", 0);
        bundle.putInt("key_video_select_max_count", size);
        bundle.putLong("Key_max_duration", j3);
        bundle.putLong("Key_min_duration", 1000);
        bundle.putStringArrayList("key_selected_video_path", arrayList);
        return bundle;
    }
}
