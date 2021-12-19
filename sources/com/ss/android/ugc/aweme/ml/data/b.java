package com.ss.android.ugc.aweme.ml.data;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ml.a.e;
import com.ss.android.ugc.aweme.ml.data.e;
import com.ss.android.ugc.aweme.ml.data.f;
import com.ss.android.ugc.aweme.ml.data.g;
import h.a.am;
import h.f.b.l;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final Set<String> f110455a = am.a((Object[]) new String[]{"click_comment_button", "video_play_finish", "like", "enter_personal_detail", "enter_music_detail", "follow", "click_more_button", "post_comment", "dislike", "video_pause", "favourite_video", "enter_tag_detail", "livesdk_room_enter_success", "livesdk_live_duration", "poi_click"});

    /* renamed from: b  reason: collision with root package name */
    static boolean f110456b = com.ss.android.ugc.aweme.ml.a.a.f110297a;

    /* renamed from: c  reason: collision with root package name */
    static boolean f110457c;

    /* renamed from: d  reason: collision with root package name */
    static final HashSet<String> f110458d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    public static final b f110459e = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(70914);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f110460a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ JSONObject f110461b;

        static {
            Covode.recordClassIndex(70915);
        }

        a(String str, JSONObject jSONObject) {
            this.f110460a = str;
            this.f110461b = jSONObject;
        }

        public final void run() {
            String a2;
            AtomicInteger atomicInteger;
            String a3;
            AtomicInteger atomicInteger2;
            String a4;
            com.ss.android.ugc.aweme.ml.b.b a5;
            AtomicInteger atomicInteger3;
            String a6;
            AtomicInteger atomicInteger4;
            String a7;
            AtomicInteger atomicInteger5;
            String a8;
            AtomicInteger atomicInteger6;
            String a9;
            AtomicInteger atomicInteger7;
            String a10;
            AtomicInteger atomicInteger8;
            String a11;
            AtomicInteger atomicInteger9;
            String a12;
            com.ss.android.ugc.aweme.ml.b.b a13;
            AtomicInteger atomicInteger10;
            String a14;
            AtomicInteger atomicInteger11;
            String a15;
            com.ss.android.ugc.aweme.ml.b.b a16;
            AtomicInteger atomicInteger12;
            try {
                String str = this.f110460a;
                JSONObject jSONObject = this.f110461b;
                switch (str.hashCode()) {
                    case -1642623552:
                        if (str.equals("post_comment")) {
                            g.b.f110500a.f110490d++;
                            break;
                        }
                        break;
                    case -1330248535:
                        if (str.equals("click_comment_button") && (a2 = b.a(jSONObject)) != null) {
                            com.ss.android.ugc.aweme.ml.b.b a17 = f.b.f110484a.a(a2);
                            if (!(a17 == null || (atomicInteger = a17.f110400b) == null)) {
                                atomicInteger.getAndIncrement();
                            }
                            g.b.f110500a.f110493g++;
                            break;
                        }
                    case -1284480695:
                        if (str.equals("livesdk_room_enter_success")) {
                            g.b.f110500a.f110494h++;
                            break;
                        }
                        break;
                    case -1268958287:
                        if (str.equals("follow") && (a3 = b.a(jSONObject)) != null) {
                            com.ss.android.ugc.aweme.ml.b.b a18 = f.b.f110484a.a(a3);
                            if (!(a18 == null || (atomicInteger2 = a18.f110403e) == null)) {
                                atomicInteger2.getAndIncrement();
                            }
                            g.b.f110500a.f110498l++;
                            break;
                        }
                    case -1213756323:
                        if (!(!str.equals("enter_tag_detail") || (a4 = b.a(jSONObject)) == null || (a5 = f.b.f110484a.a(a4)) == null || (atomicInteger3 = a5.f110410l) == null)) {
                            atomicInteger3.getAndIncrement();
                            break;
                        }
                    case -1115849514:
                        if (str.equals("livesdk_live_duration")) {
                            g.b.f110500a.f110495i += e.a(jSONObject);
                            break;
                        }
                        break;
                    case -1115125979:
                        if (str.equals("click_more_button") && (a6 = b.a(jSONObject)) != null) {
                            com.ss.android.ugc.aweme.ml.b.b a19 = f.b.f110484a.a(a6);
                            if (!(a19 == null || (atomicInteger4 = a19.f110405g) == null)) {
                                atomicInteger4.getAndIncrement();
                            }
                            g.b.f110500a.p++;
                            break;
                        }
                    case -795864119:
                        if (str.equals("enter_personal_detail") && (a7 = b.a(jSONObject)) != null) {
                            com.ss.android.ugc.aweme.ml.b.b a20 = f.b.f110484a.a(a7);
                            if (!(a20 == null || (atomicInteger5 = a20.f110402d) == null)) {
                                atomicInteger5.getAndIncrement();
                            }
                            g.b.f110500a.f110491e++;
                            break;
                        }
                    case -405326491:
                        if (str.equals("favourite_video") && (a8 = b.a(jSONObject)) != null) {
                            com.ss.android.ugc.aweme.ml.b.b a21 = f.b.f110484a.a(a8);
                            if (!(a21 == null || (atomicInteger6 = a21.f110409k) == null)) {
                                atomicInteger6.getAndIncrement();
                            }
                            g.b.f110500a.f110499m++;
                            break;
                        }
                    case -17674694:
                        if (str.equals("video_play_finish") && (a9 = b.a(jSONObject)) != null) {
                            com.ss.android.ugc.aweme.ml.b.b a22 = f.b.f110484a.a(a9);
                            if (!(a22 == null || (atomicInteger7 = a22.f110401c) == null)) {
                                atomicInteger7.getAndIncrement();
                            }
                            g.b.f110500a.f110497k++;
                            break;
                        }
                    case 3321751:
                        if (str.equals("like") && (a10 = b.a(jSONObject)) != null) {
                            com.ss.android.ugc.aweme.ml.b.b a23 = f.b.f110484a.a(a10);
                            if (!(a23 == null || (atomicInteger8 = a23.f110399a) == null)) {
                                atomicInteger8.getAndIncrement();
                            }
                            g.b.f110500a.f110496j++;
                            break;
                        }
                    case 1120107347:
                        if (str.equals("poi_click") && (a11 = b.a(jSONObject)) != null) {
                            com.ss.android.ugc.aweme.ml.b.b a24 = f.b.f110484a.a(a11);
                            if (!(a24 == null || (atomicInteger9 = a24.f110411m) == null)) {
                                atomicInteger9.getAndIncrement();
                            }
                            g.b.f110500a.n++;
                            break;
                        }
                    case 1382290738:
                        if (!(!str.equals("video_pause") || (a12 = b.a(jSONObject)) == null || (a13 = f.b.f110484a.a(a12)) == null || (atomicInteger10 = a13.f110408j) == null)) {
                            atomicInteger10.getAndIncrement();
                            break;
                        }
                    case 1438590386:
                        if (str.equals("enter_music_detail") && (a14 = b.a(jSONObject)) != null) {
                            com.ss.android.ugc.aweme.ml.b.b a25 = f.b.f110484a.a(a14);
                            if (!(a25 == null || (atomicInteger11 = a25.f110404f) == null)) {
                                atomicInteger11.getAndIncrement();
                            }
                            g.b.f110500a.o++;
                            break;
                        }
                    case 1671642405:
                        if (!(!str.equals("dislike") || (a15 = b.a(jSONObject)) == null || (a16 = f.b.f110484a.a(a15)) == null || (atomicInteger12 = a16.f110407i) == null)) {
                            atomicInteger12.getAndIncrement();
                            break;
                        }
                }
                e eVar = e.b.f110475a;
                String str2 = this.f110460a;
                l.d(str2, "");
                if (eVar.f110454a && e.f110472e.contains(str2)) {
                    if (!eVar.f110474c.containsKey(str2)) {
                        eVar.f110474c.put(str2, new AtomicInteger(1));
                        return;
                    }
                    AtomicInteger atomicInteger13 = eVar.f110474c.get(str2);
                    if (atomicInteger13 != null) {
                        atomicInteger13.incrementAndGet();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    static String a(JSONObject jSONObject) {
        Object opt;
        if (!(jSONObject == null || (opt = jSONObject.opt("group_id")) == null)) {
            String obj = opt.toString();
            if (obj.length() > 0) {
                return obj;
            }
        }
        return null;
    }
}
