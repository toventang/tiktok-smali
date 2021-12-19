package com.bytedance.apm.agent.instrumentation;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.helper.PageShowHelper;
import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.trace.c.a;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import org.json.JSONObject;

public class FragmentInstrumentation {
    public static long sCheckVisibilityStartTime;
    public static String sFragmentName;
    public static long sMaxWaitTime;
    private static HashSet<String> sMethodSet = new HashSet<>(32);
    private static long sOnActivityCreatedEnd;
    private static long sOnActivityCreatedStart;
    private static long sOnCreateEnd;
    private static String sOnCreateFragmentName;
    private static long sOnCreateStart;
    private static long sOnCreateTime;
    public static ViewTreeObserver.OnGlobalLayoutListener sOnGlobalLayoutListener;
    private static long sOnResumeEnd;
    private static long sOnResumeStart;
    private static long sOnViewCreatedEnd;
    private static long sOnViewCreatedStart;
    public static WeakReference<View> sRootViewRef;
    public static Runnable sWaitViewTimeoutRunnable;

    static {
        Covode.recordClassIndex(14323);
    }

    static boolean isValid(String str) {
        if (TextUtils.isEmpty(sFragmentName) || !TextUtils.equals(str, sFragmentName)) {
            return false;
        }
        return true;
    }

    public static void onCreate(String str) {
        sOnCreateFragmentName = str;
        sOnCreateTime = System.currentTimeMillis();
        if (sMaxWaitTime == 0) {
            sMaxWaitTime = ApmDelegate.a.f25042a.b().f24770c;
        }
    }

    public static void onPause(Fragment fragment) {
        if (fragment.getUserVisibleHint() && !fragment.isHidden()) {
            PageShowHelper.onPageShowHideAction(fragment, false);
        }
    }

    public static void onResume(Fragment fragment) {
        if (fragment.getUserVisibleHint() && !fragment.isHidden()) {
            String canonicalName = fragment.getClass().getCanonicalName();
            try {
                PageShowHelper.onPageShowHideAction(fragment, true);
                if (TextUtils.equals(canonicalName, sOnCreateFragmentName)) {
                    registerOnGlobalLayoutListener(canonicalName, fragment.getView(), a.a(canonicalName), sOnCreateTime, "fragmentOnCreateToViewShow");
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void onHiddenChanged(Fragment fragment, boolean z) {
        PageShowHelper.onPageShowHideAction(fragment, !z);
        if (!z) {
            try {
                String canonicalName = fragment.getClass().getCanonicalName();
                registerOnGlobalLayoutListener(canonicalName, fragment.getView(), a.a(canonicalName), System.currentTimeMillis(), "fragmentOnHiddenChangedToViewShow");
            } catch (Exception unused) {
            }
        }
    }

    public static void setUserVisibleHint(Fragment fragment, boolean z) {
        if (fragment.isResumed() && !fragment.isHidden()) {
            PageShowHelper.onPageShowHideAction(fragment, z);
            if (z) {
                try {
                    String canonicalName = fragment.getClass().getCanonicalName();
                    registerOnGlobalLayoutListener(canonicalName, fragment.getView(), a.a(canonicalName), System.currentTimeMillis(), "fragmentUserVisibleToViewShow");
                } catch (Exception unused) {
                }
            }
        }
    }

    public static void onTrace(Fragment fragment, String str, String str2, boolean z) {
        boolean z2;
        if (TextUtils.equals("onCreate", str2)) {
            if (z) {
                sFragmentName = str;
                sOnCreateStart = System.currentTimeMillis();
            } else if (isValid(str)) {
                sOnCreateEnd = System.currentTimeMillis();
            }
        } else if (!TextUtils.equals("onViewCreated", str2) || !isValid(str)) {
            if (!TextUtils.equals("onActivityCreated", str2) || !isValid(str)) {
                if (TextUtils.equals("onResume", str2) && isValid(str)) {
                    if (z) {
                        if (sOnCreateStart > 0) {
                            sOnResumeStart = System.currentTimeMillis();
                        }
                    } else if (sOnCreateStart > 0) {
                        long currentTimeMillis = System.currentTimeMillis();
                        sOnResumeEnd = currentTimeMillis;
                        if (currentTimeMillis - sOnCreateStart < 5000) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("begin_time", sOnCreateStart);
                                jSONObject.put("end_time", sOnResumeEnd);
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("onCreate", sOnCreateEnd - sOnCreateStart);
                                jSONObject2.put("onViewCreated", sOnViewCreatedEnd - sOnViewCreatedStart);
                                jSONObject2.put("onActivityCreated", sOnActivityCreatedEnd - sOnActivityCreatedStart);
                                jSONObject2.put("onResume", sOnResumeEnd - sOnResumeStart);
                                jSONObject2.put("fragment_create_to_resume", sOnResumeEnd - sOnCreateStart);
                                if (!(fragment == null || fragment.getActivity() == null)) {
                                    jSONObject.put("attached_activity", fragment.getActivity().getClass().getName());
                                }
                                jSONObject.put("page_type", "fragment");
                                JSONObject jSONObject3 = new JSONObject();
                                if (!sMethodSet.contains(sFragmentName + str2)) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                jSONObject3.put("is_first", z2);
                                jSONObject3.put("scene", str);
                                sMethodSet.add(sFragmentName + str2);
                                MonitorTool.monitorPerformance("page_load", jSONObject2, jSONObject3, jSONObject);
                            } catch (Exception unused) {
                            }
                        }
                        sOnCreateStart = 0;
                        sFragmentName = null;
                    }
                }
            } else if (z) {
                if (sOnCreateStart > 0) {
                    sOnActivityCreatedStart = System.currentTimeMillis();
                }
            } else if (sOnCreateStart > 0) {
                sOnActivityCreatedEnd = System.currentTimeMillis();
            }
        } else if (z) {
            if (sOnCreateStart > 0) {
                sOnViewCreatedStart = System.currentTimeMillis();
            }
        } else if (sOnCreateStart > 0) {
            sOnViewCreatedEnd = System.currentTimeMillis();
        }
    }

    private static void registerOnGlobalLayoutListener(String str, View view, final Integer num, final long j2, final String str2) {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
        if (num != null && num.intValue() > 0) {
            sFragmentName = str;
            WeakReference<View> weakReference = sRootViewRef;
            if (!(weakReference == null || weakReference.get() == view)) {
                ViewTreeObserver viewTreeObserver = sRootViewRef.get().getViewTreeObserver();
                if (viewTreeObserver.isAlive() && (onGlobalLayoutListener = sOnGlobalLayoutListener) != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                }
                if (sWaitViewTimeoutRunnable != null) {
                    com.bytedance.apm.p.a.f25196a.removeCallbacks(sWaitViewTimeoutRunnable);
                }
            }
            sRootViewRef = new WeakReference<>(view);
            sCheckVisibilityStartTime = 0;
            sOnGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() {
                /* class com.bytedance.apm.agent.instrumentation.FragmentInstrumentation.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(14324);
                }

                public final void onGlobalLayout() {
                    try {
                        if (FragmentInstrumentation.sRootViewRef == null) {
                            return;
                        }
                        if (FragmentInstrumentation.sRootViewRef.get() != null) {
                            View findViewById = FragmentInstrumentation.sRootViewRef.get().findViewById(num.intValue());
                            if (FragmentInstrumentation.sCheckVisibilityStartTime == 0) {
                                FragmentInstrumentation.sCheckVisibilityStartTime = System.currentTimeMillis();
                            }
                            if (findViewById != null && findViewById.getVisibility() == 0 && findViewById.getWidth() > 0) {
                                long currentTimeMillis = System.currentTimeMillis();
                                if (FragmentInstrumentation.sRootViewRef.get().getViewTreeObserver().isAlive() && FragmentInstrumentation.sOnGlobalLayoutListener != null) {
                                    FragmentInstrumentation.sRootViewRef.get().getViewTreeObserver().removeOnGlobalLayoutListener(FragmentInstrumentation.sOnGlobalLayoutListener);
                                }
                                FragmentInstrumentation.sOnGlobalLayoutListener = null;
                                FragmentInstrumentation.sRootViewRef = null;
                                if (FragmentInstrumentation.sWaitViewTimeoutRunnable != null) {
                                    com.bytedance.apm.p.a.f25196a.removeCallbacks(FragmentInstrumentation.sWaitViewTimeoutRunnable);
                                }
                                long j2 = currentTimeMillis - j2;
                                if (currentTimeMillis - FragmentInstrumentation.sCheckVisibilityStartTime > 1 && j2 < FragmentInstrumentation.sMaxWaitTime) {
                                    MonitorTool.reportTraceTime(FragmentInstrumentation.sFragmentName, str2, j2);
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            };
            view.getViewTreeObserver().addOnGlobalLayoutListener(sOnGlobalLayoutListener);
            sWaitViewTimeoutRunnable = new Runnable() {
                /* class com.bytedance.apm.agent.instrumentation.FragmentInstrumentation.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(14325);
                }

                public final void run() {
                    try {
                        if (FragmentInstrumentation.sOnGlobalLayoutListener != null && FragmentInstrumentation.sRootViewRef != null && FragmentInstrumentation.sRootViewRef.get() != null) {
                            FragmentInstrumentation.sRootViewRef.get().getViewTreeObserver().removeOnGlobalLayoutListener(FragmentInstrumentation.sOnGlobalLayoutListener);
                        }
                    } catch (Exception unused) {
                    }
                }
            };
            com.bytedance.apm.p.a.f25196a.postDelayed(sWaitViewTimeoutRunnable, sMaxWaitTime);
        }
    }
}
