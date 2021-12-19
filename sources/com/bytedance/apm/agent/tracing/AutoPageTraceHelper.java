package com.bytedance.apm.agent.tracing;

import android.text.TextUtils;
import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.apm.c;
import com.bytedance.apm.p.b;
import com.bytedance.apm.trace.c.a;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.HashSet;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

public class AutoPageTraceHelper {
    private static boolean sIsFirstWindowFocusChangedActivity;
    private static long sMaxValidTimeMs = 20000;
    private static final HashSet<String> sMethodSet = new HashSet<>(32);
    private static final ConcurrentLinkedQueue<PageTraceEntity> sPageList = new ConcurrentLinkedQueue<>();

    static {
        Covode.recordClassIndex(14378);
    }

    public static void reportStats() {
        int i2;
        try {
            int size = sPageList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ConcurrentLinkedQueue<PageTraceEntity> concurrentLinkedQueue = sPageList;
                PageTraceEntity peek = concurrentLinkedQueue.peek();
                if (peek == null) {
                    return;
                }
                if (peek.onWindowFocusTs != 0 || peek.onViewShowTs != 0) {
                    PageTraceEntity poll = concurrentLinkedQueue.poll();
                    if (poll.isCreateAndResumeValid()) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(StringSet.name, "onCreate");
                        jSONObject.put("start", poll.onCreateStartTs);
                        jSONObject.put("end", poll.onCreateEndTs);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(StringSet.name, "onResume");
                        jSONObject2.put("start", poll.onResumeStartTs);
                        jSONObject2.put("end", poll.onResumeEndTs);
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(StringSet.name, "onWindowFocusChanged");
                        jSONObject3.put("start", poll.onWindowFocusTs);
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(jSONObject);
                        jSONArray.put(jSONObject2);
                        jSONArray.put(jSONObject3);
                        if (poll.onViewShowTs > 0) {
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put(StringSet.name, "viewShow");
                            jSONObject4.put("start", poll.onViewShowTs);
                            jSONArray.put(jSONObject4);
                        }
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put(StringSet.name, "page_load_stats");
                        jSONObject5.put("page_type", "activity");
                        jSONObject5.put("start", poll.onCreateStartTs);
                        if (poll.onViewShowTs > 0) {
                            jSONObject5.put("end", poll.onViewShowTs);
                            if (poll.onViewShowTs - poll.onCreateStartTs >= 0) {
                                if (poll.onViewShowTs - poll.onCreateStartTs > sMaxValidTimeMs) {
                                }
                            }
                        } else {
                            jSONObject5.put("end", poll.onWindowFocusTs);
                            if (poll.onWindowFocusTs - poll.onCreateStartTs >= 0) {
                                if (poll.onWindowFocusTs - poll.onCreateStartTs > sMaxValidTimeMs) {
                                }
                            }
                        }
                        jSONObject5.put("spans", jSONArray);
                        HashSet<String> hashSet = sMethodSet;
                        if (hashSet.contains(poll.pageName)) {
                            i2 = 2;
                        } else {
                            i2 = 1;
                        }
                        hashSet.add(poll.pageName);
                        jSONObject5.put("launch_mode", i2);
                        jSONObject5.put("collect_from", 1);
                        jSONObject5.put("page_name", poll.pageName);
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("trace", jSONObject5);
                        MonitorTool.monitorPerformance("page_load_trace", null, null, jSONObject6);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        } catch (Exception e2) {
            if (c.e()) {
                e2.printStackTrace();
            }
        }
    }

    public static void setMaxValidTimeMs(long j2) {
        sMaxValidTimeMs = j2;
    }

    public static void reportViewIdStats(long j2, String str) {
        PageTraceEntity peek = sPageList.peek();
        if (peek != null && TextUtils.equals(str, peek.pageName)) {
            peek.onViewShowTs = j2;
            b.a.f25210a.a(new Runnable() {
                /* class com.bytedance.apm.agent.tracing.AutoPageTraceHelper.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(14380);
                }

                public final void run() {
                    AutoPageTraceHelper.reportStats();
                }
            });
        }
    }

    public static void onTrace(String str, String str2, boolean z) {
        if (TextUtils.equals("onCreate", str2)) {
            if (z) {
                if (!sIsFirstWindowFocusChangedActivity) {
                    AutoLaunchTraceHelper.launcherActivityOnCreateStart(str);
                }
                ConcurrentLinkedQueue<PageTraceEntity> concurrentLinkedQueue = sPageList;
                if (concurrentLinkedQueue.size() > 50) {
                    concurrentLinkedQueue.poll();
                }
                concurrentLinkedQueue.add(new PageTraceEntity(str, System.currentTimeMillis()));
                return;
            }
            if (!sIsFirstWindowFocusChangedActivity) {
                AutoLaunchTraceHelper.launcherActivityOnCreateEnd();
            }
            PageTraceEntity peek = sPageList.peek();
            if (peek != null) {
                peek.onCreateEndTs = System.currentTimeMillis();
            }
        } else if (TextUtils.equals("onResume", str2)) {
            if (z) {
                if (!sIsFirstWindowFocusChangedActivity) {
                    AutoLaunchTraceHelper.launcherActivityOnResumeStart(str);
                }
                PageTraceEntity peek2 = sPageList.peek();
                if (peek2 != null) {
                    peek2.onResumeStartTs = System.currentTimeMillis();
                    return;
                }
                return;
            }
            if (!sIsFirstWindowFocusChangedActivity) {
                AutoLaunchTraceHelper.launcherActivityOnResumeEnd();
            }
            PageTraceEntity peek3 = sPageList.peek();
            if (peek3 != null) {
                peek3.onResumeEndTs = System.currentTimeMillis();
            }
        } else if (TextUtils.equals("onWindowFocusChanged", str2)) {
            if (z) {
                if (!sIsFirstWindowFocusChangedActivity) {
                    AutoLaunchTraceHelper.launcherActivityOnWindowFocusChangedStart(str);
                    sIsFirstWindowFocusChangedActivity = true;
                }
                PageTraceEntity peek4 = sPageList.peek();
                if (peek4 != null && peek4.onWindowFocusTs == 0) {
                    peek4.onWindowFocusTs = System.currentTimeMillis();
                    if (a.a(str) == null) {
                        b.a.f25210a.a(new Runnable() {
                            /* class com.bytedance.apm.agent.tracing.AutoPageTraceHelper.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(14379);
                            }

                            public final void run() {
                                AutoPageTraceHelper.reportStats();
                            }
                        });
                    }
                }
            }
        } else if (!TextUtils.equals("onStart", str2)) {
        } else {
            if (z) {
                if (!sIsFirstWindowFocusChangedActivity) {
                    AutoLaunchTraceHelper.launcherActivityOnStartStart(str);
                }
            } else if (!sIsFirstWindowFocusChangedActivity) {
                AutoLaunchTraceHelper.launcherActivityOnStartEnd(str);
            }
        }
    }
}
