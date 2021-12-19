package com.ss.android.ugc.aweme.feed.t;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.e.o;
import com.ss.android.ugc.aweme.feed.experiment.aa;
import com.ss.android.ugc.aweme.feed.experiment.ab;
import com.ss.android.ugc.aweme.feed.experiment.l;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService;
import com.ss.android.ugc.aweme.video.ac;
import com.ss.android.ugc.aweme.video.preload.b;
import com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;
import com.ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.h.g;
import com.ss.android.ugc.h.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public PreloadStrategyConfig f93902a;

    /* renamed from: b  reason: collision with root package name */
    protected o f93903b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f93904c;

    /* renamed from: d  reason: collision with root package name */
    private String f93905d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f93906e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f93907f;

    /* renamed from: g  reason: collision with root package name */
    private PreloadStrategyConfig f93908g;

    static {
        Covode.recordClassIndex(59739);
    }

    private static List<PreloadStrategyConfig> a() {
        return SmartFeedPreloadService.instance().getSmartPreloadStrategyExperimentValue();
    }

    public a(PreloadStrategyConfig preloadStrategyConfig) {
        this(null, preloadStrategyConfig);
    }

    private static String a(Context context) {
        if (!TextUtils.isEmpty(j.f107227f) && j.b() && !j.c()) {
            return j.f107227f;
        }
        String networkAccessType = NetworkUtils.getNetworkAccessType(context);
        j.f107227f = networkAccessType;
        return networkAccessType;
    }

    private static void a(String str) {
        if (l.f93076a == 1) {
            int f2 = g.f();
            String a2 = a(d.a());
            int b2 = com.ss.android.ugc.aweme.video.l.a(d.a()).b(d.a());
            i[] b3 = g.e().b();
            if (b3 != null) {
                b.i.b(new b(b3, str, f2, a2, b2), r.a());
            }
        }
    }

    public a(o oVar, PreloadStrategyConfig preloadStrategyConfig) {
        this.f93903b = oVar;
        this.f93908g = preloadStrategyConfig;
    }

    private void a(boolean z, String str) {
        o oVar = this.f93903b;
        if (oVar != null) {
            oVar.a(z, str);
        }
    }

    private static int a(List<Aweme> list, int i2) {
        int i3 = i2 + 1;
        if (i3 < list.size() && list.get(i3) != null && b.b(b.a(list.get(i3).getAid()))) {
            return 1;
        }
        if (i2 >= list.size() || list.get(i2) == null || !b.b(b.a(list.get(i2).getAid()))) {
            return -1;
        }
        return 0;
    }

    static final /* synthetic */ Object a(i[] iVarArr, String str, int i2, String str2, int i3) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (int length = iVarArr.length - 1; length >= 0; length--) {
                i iVar = iVarArr[length];
                if (iVar != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("file_size", iVar.f148520c);
                    jSONObject2.put("cost_time", iVar.f148521d);
                    if (length > 0) {
                        int i4 = length - 1;
                        if (iVarArr[i4] != null) {
                            jSONObject2.put("interval_time", iVar.f148522e - iVarArr[i4].f148522e);
                            jSONArray.put(jSONObject2);
                        }
                    }
                    jSONObject2.put("interval_time", 0);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("group_id", str);
            jSONObject.put("speed_record", jSONArray);
            jSONObject.put("internet_speed", i2);
            jSONObject.put("strategy", 0);
            jSONObject.put("access", str2);
            jSONObject.put("signal", i3);
            jSONObject.put("qsize", g.f148505a);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        r.b("video_speed_monitor", jSONObject);
        com.ss.android.ugc.aweme.bm.b.b("video_speed_monitor", jSONObject);
        return null;
    }

    public final void a(boolean z, String str, long j2, long j3, com.ss.android.ugc.aweme.feed.adapter.b bVar, int i2, boolean z2) {
        Video video;
        VideoUrlModel properPlayAddr;
        String sourceId;
        int a2;
        boolean z3 = false;
        com.a.a("onDownloadProgressChange with %s, %d, %d", new Object[]{str, Long.valueOf(j2), Long.valueOf(j3)});
        if (j2 == j3) {
            a(z, str);
        }
        Aweme c2 = bVar.c(i2);
        if (!(c2 == null || c2.getVideo() == null || (video = c2.getVideo()) == null)) {
            if (com.ss.android.ugc.aweme.video.preload.a.a.f143571a) {
                properPlayAddr = ac.a(video);
            } else {
                properPlayAddr = video.getProperPlayAddr();
            }
            if (!(properPlayAddr == null || TextUtils.isEmpty(str))) {
                if (!z) {
                    sourceId = properPlayAddr.getBitRatedRatioUri();
                } else {
                    sourceId = properPlayAddr.getSourceId();
                }
                if (TextUtils.equals(str, sourceId)) {
                    if (!TextUtils.equals(sourceId, this.f93905d)) {
                        this.f93907f = false;
                        this.f93906e = true;
                        this.f93905d = sourceId;
                        this.f93904c = false;
                        PreloadStrategyConfig preloadStrategyConfig = this.f93902a;
                        if (preloadStrategyConfig != null) {
                            preloadStrategyConfig.clearFlag();
                        }
                    } else {
                        this.f93906e = false;
                    }
                    if (j3 == j2 && !this.f93907f) {
                        this.f93907f = true;
                        a(properPlayAddr.getSourceId());
                    }
                    if (this.f93906e) {
                        List<PreloadStrategyConfig> a3 = a();
                        if (a3 != null && a3.size() > 0) {
                            long min = Math.min(Math.max(Math.max(a3.get(0).getNetworkLower(), 0L), (long) g.f()), Math.min(a3.get(a3.size() - 1).getNetworkUpper(), 25000L));
                            Iterator<PreloadStrategyConfig> it = a3.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                PreloadStrategyConfig next = it.next();
                                if (next != null && min >= next.getNetworkLower() && min <= next.getNetworkUpper()) {
                                    this.f93902a = next;
                                    break;
                                }
                            }
                        } else {
                            this.f93902a = SmartFeedPreloadService.instance().getCurrentSmartPreloadStrategyConfig();
                        }
                    }
                    if (this.f93902a == null) {
                        this.f93902a = this.f93908g;
                    }
                    List<PreloadTask> emptyList = Collections.emptyList();
                    for (PreloadTask preloadTask : this.f93902a.getTasks()) {
                        if (!preloadTask.alreadyPreload && 100 * j3 >= ((long) preloadTask.progress) * j2) {
                            if (emptyList.isEmpty()) {
                                emptyList = new ArrayList();
                            }
                            emptyList.add(preloadTask);
                            preloadTask.alreadyPreload = true;
                        }
                    }
                    if (!emptyList.isEmpty()) {
                        if (z2 && (a2 = a(bVar.e(), i2)) != -1) {
                            for (PreloadTask preloadTask2 : emptyList) {
                                preloadTask2.offset = a2;
                            }
                        }
                        if (ab.a() && aa.f93025a) {
                            z3 = true;
                        }
                        ac.a(z2, i2, bVar.e(), emptyList, z3);
                    }
                }
            }
        }
    }
}
