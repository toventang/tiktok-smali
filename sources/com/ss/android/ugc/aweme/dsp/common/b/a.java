package com.ss.android.ugc.aweme.dsp.common.b;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.dsp.playerservice.b.f;
import com.ss.android.ugc.aweme.dsp.playerservice.b.h;
import h.a.ag;
import h.f.b.l;
import h.v;
import java.util.HashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f83293a;

    /* renamed from: b  reason: collision with root package name */
    public static long f83294b = SystemClock.elapsedRealtime();

    /* renamed from: c  reason: collision with root package name */
    public static boolean f83295c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f83296d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f83297e = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(51930);
    }

    public static void a(h hVar) {
        l.d(hVar, "");
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", hVar.f83386h);
        hashMap.put("music_id", hVar.f83381c);
        hashMap.put("full_clip_id", hVar.f83382d);
        hashMap.put("meta_song_id", hVar.f83383e);
        hashMap.put("request_id", hVar.f83387i);
        r.a("dsp_favourite_song", hashMap);
    }

    public static String a(f fVar) {
        String str;
        if (fVar == null || (str = fVar.f83375a) == null) {
            return "finish";
        }
        switch (str.hashCode()) {
            case -1286965972:
                if (str.equals("PAUSE_FROM_SUB_PLAYER")) {
                }
                break;
            case -329387598:
                if (str.equals("PAUSE_FROM_CHANGE_TAB")) {
                }
                break;
            case 270608360:
                if (str.equals("PAUSE_FROM_LOSS_FOCUS")) {
                    return "open_other_app";
                }
                break;
            case 353894318:
                if (str.equals("PAUSE_FROM_USER_PAUSE")) {
                    return "pause";
                }
                break;
            case 377203138:
                if (str.equals("PAUSE_FROM_ON_PAUSE")) {
                }
                break;
            case 527034455:
                if (str.equals("STOP_FROM_PLAYABLE_QUEUE_CHANGE")) {
                    return "shift";
                }
                break;
            case 595155138:
                if (str.equals("PAUSE_FROM_ON_BACKGROUND")) {
                    return "backward";
                }
                break;
            case 1130771465:
                if (str.equals("STOP_FROM_PLAYABLE_CHANGE")) {
                    return "shift";
                }
                break;
            case 1484257568:
                if (str.equals("RESUME_FROM_ON_FOREGROUND")) {
                    return "forward";
                }
                break;
            case 1553123424:
                if (str.equals("PAUSE_FROM_NOTIFICATION_CLICK")) {
                    return "pause";
                }
                break;
            case 1721588043:
                if (str.equals("PAUSE_FROM_AUDIO_OUTPUT_CHANGED")) {
                    return "pause";
                }
                break;
            case 1807185499:
                if (str.equals("PAUSE_FROM_MAIN_PLAYER")) {
                }
                break;
            case 2062106709:
                if (str.equals("PAUSE_FROM_MEDIA_SESSION_CALLBACK")) {
                    return "pause";
                }
                break;
        }
        return "exit";
    }

    public static void a(String str, String str2) {
        if (!f83296d) {
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", str);
            hashMap.put("enter_method", str2);
            r.a("enter_music_dsp", hashMap);
        }
    }

    public static void b(String str, String str2) {
        if (!f83295c) {
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", str);
            hashMap.put("leave_method", str2);
            hashMap.put("duration", String.valueOf(SystemClock.elapsedRealtime() - f83294b));
            r.a("leave_music_dsp", hashMap);
        }
    }

    public static void c(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", str);
        hashMap.put("enter_method", str2);
        hashMap.put("entrance_type", "dsp");
        hashMap.put("judge_result", "1");
        r.a("dsp_entrance_show_judge", hashMap);
    }

    public static void a(h hVar, String str, String str2) {
        l.d(hVar, "");
        l.d(str, "");
        l.d(str2, "");
        r.a("dsp_like", ag.a(v.a("enter_from", str), v.a("enter_method", str2), v.a("music_id", hVar.f83381c), v.a("full_clip_id", hVar.f83382d), v.a("meta_song_id", hVar.f83383e), v.a("request_id", hVar.f83387i)));
    }

    public static void b(h hVar, String str, String str2) {
        l.d(hVar, "");
        l.d(str, "");
        l.d(str2, "");
        r.a("cancel_like", ag.a(v.a("enter_from", str), v.a("enter_method", str2), v.a("group_id", hVar.f83379a), v.a("author_id", hVar.f83380b), v.a("group_type", "music"), v.a("music_id", hVar.f83381c)));
    }

    public static void c(h hVar, String str, String str2) {
        l.d(hVar, "");
        l.d(str, "");
        l.d(str2, "");
        r.a("group_click", ag.a(v.a("enter_from", "resso_upsell"), v.a("upsell_reason", str), v.a("call_to_action", str2), v.a("music_id", hVar.f83381c), v.a("full_clip_id", hVar.f83382d), v.a("meta_song_id", hVar.f83383e)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004c, code lost:
        if (com.ss.android.ugc.aweme.utils.ActivityStack.isAppBackGround() == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004e, code lost:
        r2.put("is_background", r1);
        r2.put("scene_name", r5.f83384f);
        r2.put("enter_method", r5.f83385g);
        r2.put("enter_from", r5.f83386h);
        r2.put("request_id", r5.f83387i);
        r2.put("audio_over_status", a(r10));
        r2.put("duration", java.lang.String.valueOf(r6));
        r3 = (double) r6;
        r0 = (double) r8;
        java.lang.Double.isNaN(r3);
        java.lang.Double.isNaN(r0);
        r2.put("duration_pct", java.lang.String.valueOf(((float) h.g.a.a((r3 / r0) * 100.0d)) / 100.0f));
        r2.put("mvid", r5.f83388j);
        com.ss.android.ugc.aweme.common.r.a("audio_over", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00aa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00af, code lost:
        if (com.ss.android.ugc.aweme.utils.ActivityStack.isAppBackGround() != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00b2, code lost:
        r1 = "0";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.ss.android.ugc.aweme.dsp.playerservice.b.h r5, long r6, long r8, com.ss.android.ugc.aweme.dsp.playerservice.b.f r10) {
        /*
        // Method dump skipped, instructions count: 184
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.common.b.a.a(com.ss.android.ugc.aweme.dsp.playerservice.b.h, long, long, com.ss.android.ugc.aweme.dsp.playerservice.b.f):void");
    }

    public static void a(h hVar, String str, String str2, String str3) {
        l.d(hVar, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        r.a("page_status", ag.a(v.a("enter_from", str), v.a("page", "resso_upsell"), v.a("upsell_reason", str2), v.a("call_to_action", str3), v.a("music_id", hVar.f83381c), v.a("full_clip_id", hVar.f83382d), v.a("meta_song_id", hVar.f83383e)));
    }
}
