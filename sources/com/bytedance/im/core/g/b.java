package com.bytedance.im.core.g;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.a.k;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.c.i;
import com.bytedance.im.core.d.ap;
import com.bytedance.im.core.d.aq;
import com.bytedance.im.core.d.u;
import com.bytedance.im.core.d.z;
import com.bytedance.im.core.internal.a.c;
import com.bytedance.im.core.internal.e.a;
import com.bytedance.im.core.internal.utils.j;
import com.bytedance.im.core.internal.utils.l;
import com.bytedance.im.core.internal.utils.s;
import com.kakao.usermgmt.StringSet;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f38100a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f38101b;

    /* renamed from: c  reason: collision with root package name */
    private static Handler f38102c = new Handler(Looper.getMainLooper());

    public static void a(boolean z, boolean z2, long j2, int i2, int i3, int i4, int i5, u uVar, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        if (!f38100a) {
            f38100a = true;
            i a2 = new i().a("puller_wakeup_pull").a(StringSet.type, z ? "new" : "old").a("status", z2 ? "0" : "1").a("cmd_msg_count", Integer.valueOf(i3)).a("normal_msg_count", Integer.valueOf(i2)).a("conv_count", Integer.valueOf(i4)).a("unread_count", Integer.valueOf(i5)).a("total_msg_count", Integer.valueOf(i2 + i3)).a("is_net_available", Integer.valueOf(d.a().f37562b.e() ? 1 : 0)).a("duration", Long.valueOf(j2)).a("is_async_save", Integer.valueOf(d.a().b().aj ? 1 : 0)).a("build_request_time_cost", Long.valueOf(j3)).a("response_time_cost", Long.valueOf(j4)).a("save_msg_list_time_cost", Long.valueOf(j5)).a("save_conversation_list_time_cost", Long.valueOf(j6)).a("save_msg_callback_time_cost", Long.valueOf(j7)).a("local_push_time_cost", Long.valueOf(j8)).a("sp_and_check_wait_time_cost", Long.valueOf(j9));
            if (!z2 && uVar != null) {
                a2.a("error_code", Integer.valueOf(uVar.f38023a));
                a2.a("log_id", uVar.f38028f);
            }
            a2.b();
            a();
        }
    }

    public static void a(String str, boolean z, int i2, Throwable th) {
        if (!z) {
            i a2 = new i().a("im_sdk_db_op");
            if (str == null) {
                str = "unknown";
            }
            i a3 = a2.a("tag", str).a("is_success", "0").a("fail_reason", String.valueOf(i2));
            if (th != null) {
                a3.a("error_msg", a(th));
                a3.a("error_stack", b(th));
            }
            a3.d();
        } else if (e.a(0.002f)) {
            i a4 = new i().a("im_sdk_db_op");
            if (str == null) {
                str = "unknown";
            }
            a4.a("tag", str).a("is_success", "1").d();
        }
    }

    public static void a(String str, long j2) {
        if (e.a(0.005f)) {
            i a2 = new i().a("im_sdk_db_op_cost");
            if (str == null) {
                str = "unknown";
            }
            a2.a("tag", str).a("cost_time", Long.valueOf(j2)).d();
        }
    }

    public static void a(String str, z zVar, boolean z) {
        String str2;
        String str3;
        String str4 = "0";
        if (z) {
            try {
                new i().a("im_sdk_repair_msg_by_v2").a("conversation_id", str).a("uuid", zVar.f38044a).a("is_time_out", "1").c();
            } catch (Exception e2) {
                j.b("IMPerfMonitor monitorRepairLeakMsg", e2);
            }
        } else {
            i a2 = new i().a("im_sdk_repair_msg_by_v2").a("conversation_id", str).a("uuid", zVar.f38044a).a("is_time_out", str4).a(com.ss.android.ugc.g.a.a.e.f145597g, Long.valueOf(zVar.f38047d));
            if (zVar.f38048e) {
                str2 = "1";
            } else {
                str2 = str4;
            }
            i a3 = a2.a("is_success", str2).a("is_net_available", Integer.valueOf(d.a().f37562b.e() ? 1 : 0)).a("origin_repaired", a(zVar.f38045b)).a("result_repaired", a(zVar.f38046c)).a("range_step", Integer.valueOf(zVar.f38049f)).a("range_leak", a(zVar.f38050g)).a("range_leak_merge", a(zVar.f38051h)).a("range_before", a(zVar.f38052i)).a("range_after", a(zVar.f38053j)).a("range_await", Long.valueOf(zVar.f38054k));
            if (zVar.f38056m) {
                str3 = "1";
            } else {
                str3 = str4;
            }
            i a4 = a3.a("range_net", str3).a("range_net_info", zVar.f38055l).a("db_step", Integer.valueOf(zVar.n)).a("max_index", Long.valueOf(zVar.o)).a("base_index", Long.valueOf(zVar.p)).a("db_origin_range", a(zVar.s));
            if (zVar.r) {
                str4 = "1";
            }
            i a5 = a4.a("db_range_invalid", str4).a("db_older_step", Integer.valueOf(zVar.t)).a("db_older_start_index", Long.valueOf(zVar.u));
            String str5 = "[]";
            i a6 = a5.a("db_older_leak_list", zVar.v != null ? zVar.v.toString() : str5).a("db_older_leak_range_list", a(zVar.w)).a("db_older_before", a(zVar.x)).a("db_older_after", a(zVar.y)).a("db_older_await", Long.valueOf(zVar.z)).a("db_older_net_info", zVar.A).a("db_newer_step", Integer.valueOf(zVar.I)).a("db_newer_start_index", Long.valueOf(zVar.J));
            if (zVar.K != null) {
                str5 = zVar.K.toString();
            }
            i a7 = a6.a("db_newer_leak_list", str5).a("db_newer_leak_range_list", a(zVar.L)).a("db_newer_before", a(zVar.M)).a("db_newer_after", a(zVar.N)).a("db_newer_await", Long.valueOf(zVar.O)).a("db_newer_net_info", zVar.P).a("db_base_step", Integer.valueOf(zVar.B)).a("db_base_start_index", Long.valueOf(zVar.C)).a("db_base_received_min_index", Long.valueOf(zVar.D)).a("db_base_before", a(zVar.G)).a("db_base_after", a(zVar.H));
            if (zVar.F != null) {
                a7.a("db_base_net_info", zVar.F.toString()).a("db_base_pull_times", Integer.valueOf(zVar.F.f37683d)).a("db_base_leak_count", Integer.valueOf(zVar.F.f37686g));
            }
            a7.c();
        }
    }

    public static void a(String str, boolean z, int i2, int i3) {
        i a2 = new i().a("im_sdk_repair_get").a("conversation_id", str);
        String str2 = "0";
        i a3 = a2.a("status", z ? str2 : "1").a("count_before", Integer.valueOf(i2)).a("count_after", Integer.valueOf(i3));
        if (i3 >= i2) {
            str2 = "1";
        }
        a3.a("count_ok", str2).c();
    }

    public static void a(int i2, boolean z) {
        new i().a("puller_check_conv_and").a("leak_count", Integer.valueOf(i2)).a("is_pre_check", z ? "1" : "0").a("link_mode", Integer.valueOf(l.a().b())).c();
    }

    public static void a(String str, int i2) {
        new i().a("puller_check_conv_and_failed").a("error_msg", str).a("error_code", Integer.valueOf(i2)).a("is_pre_check", "0").c();
    }

    public static void a(String str, String str2, int i2, int i3, boolean z, long j2, boolean z2) {
        i a2 = new i().a("puller_check_msg_and").a("conversation_id", str).a("leak_ids", str2).a("pre_check_leak_count", Integer.valueOf(i2)).a("leak_count", Integer.valueOf(i3)).a("duration", Long.valueOf(j2)).a("link_mode", Integer.valueOf(l.a().b()));
        String str3 = "1";
        i a3 = a2.a("repaired_by_v2", z ? str3 : "0");
        if (!z2) {
            str3 = "0";
        }
        a3.a("is_dup_check", str3).c();
    }

    public static void a(boolean z, int i2, boolean z2, long j2, long j3, long j4) {
        String str = "1";
        i a2 = new i().a("im_sdk_conv_async_local").a("is_partition", z ? str : "0").a("conv_count", Integer.valueOf(i2));
        if (!z2) {
            str = "0";
        }
        i a3 = a2.a("is_first_init", str).a(com.ss.android.ugc.g.a.a.e.f145597g, Long.valueOf(j2)).a("db_cost", Long.valueOf(j3)).a("enable_conv_box", Integer.valueOf(d.a().b().aA ? 1 : 0));
        if (d.a().b().aA) {
            a3.a("conv_number_in_conv_box", Integer.valueOf(com.bytedance.im.core.b.b.a().e()));
            s.a();
            a3.a("conv_box_delete_time", Long.valueOf(s.j()));
        }
        if (z) {
            a3.a("partition_cost", Long.valueOf(j4));
        }
        a3.c();
    }

    public static void a(boolean z, long j2, int i2, int i3, int i4, u uVar, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        i a2 = new i().a("im_sdk_init_handler").a("is_success", z ? "1" : "0").a(com.ss.android.ugc.g.a.a.e.f145597g, Long.valueOf(j2)).a("page_size", Integer.valueOf(i2)).a("conv_count", Integer.valueOf(i3)).a("total_msg_count", Integer.valueOf(i4)).a("is_async_save", Integer.valueOf(d.a().b().ab.initConvListPullAsyncEnable)).a("response_time_cost", Long.valueOf(j3)).a("build_request_time_cost", Long.valueOf(j4)).a("save_msg_list_time_cost", Long.valueOf(j5)).a("save_conversation_list_time_cost", Long.valueOf(j6)).a("save_msg_callback_time_cost", Long.valueOf(j7)).a("after_im_init_time_cost", Long.valueOf(j8)).a("sp_and_check_wait_time_cost", Long.valueOf(j9));
        if (!z && uVar != null) {
            a2.a("error_msg", a(uVar.f38030h));
            a2.a("log_id", uVar.f38028f);
        }
        a2.c();
    }

    public static void a(boolean z, Throwable th, long j2, String str, Context context) {
        i a2 = new i().a("im_sdk_login_logout_err").a("is_login", z ? "1" : "0").a("init_time", Long.valueOf(j2));
        String str2 = "null";
        if (str == null) {
            str = str2;
        }
        i a3 = a2.a("raw_ctx", str);
        if (context != null) {
            str2 = context.getClass().getName();
        }
        a3.a("app_ctx", str2).a("error_msg", a(th)).a("error_stack", b(th)).c();
    }

    public static void a(String str, Throwable th) {
        i a2 = new i().a("im_sdk_local_ext_err").a("error_msg", a(th)).a("error_stack", b(th));
        if (str == null) {
            a2.a("local_ext", "none");
        } else {
            a2.a("local_ext", str);
        }
        a2.c();
    }

    static {
        Covode.recordClassIndex(22821);
    }

    private static void a() {
        d.a().b();
        if (d.a().b().ao.enable == 1) {
            a(new Runnable() {
                /* class com.bytedance.im.core.g.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(22822);
                }

                public final void run() {
                    try {
                        a.a().execute(new Runnable() {
                            /* class com.bytedance.im.core.g.b.AnonymousClass1.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(22823);
                            }

                            public final void run() {
                                int i2;
                                int i3;
                                if (e.a(1.0f)) {
                                    s.a();
                                    long j2 = 0;
                                    long b2 = s.f38859a.b(s.a("last_report_db_info_time"), (Long) 0L);
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (currentTimeMillis - b2 >= ((long) (d.a().b().ao.reportDurationDays * 24 * 60 * 60)) * 1000) {
                                        s.a();
                                        s.f38859a.a(s.a("last_report_db_info_time"), Long.valueOf(currentTimeMillis));
                                        long uptimeMillis = SystemClock.uptimeMillis();
                                        try {
                                            com.bytedance.im.core.internal.a.a.b.a("IMPerfMonitor.monitorDBInfoReal()");
                                            List<String> a2 = c.a(false);
                                            List<String> a3 = c.a(true);
                                            int a4 = b.a(a2);
                                            int a5 = b.a(a3);
                                            int i4 = a4 + a5;
                                            if (!com.bytedance.im.core.internal.utils.d.a(a2)) {
                                                i2 = 0;
                                                i3 = 0;
                                                for (String str : a2) {
                                                    if (com.bytedance.im.core.internal.a.i.i(str)) {
                                                        i3++;
                                                    } else {
                                                        i2++;
                                                    }
                                                }
                                            } else {
                                                i2 = 0;
                                                i3 = 0;
                                            }
                                            int a6 = com.bytedance.im.core.internal.a.i.a();
                                            long b3 = com.bytedance.im.core.internal.a.a.a.a().b();
                                            if (b3 >= 0) {
                                                j2 = b3;
                                            }
                                            com.bytedance.im.core.internal.a.a.b.a("IMPerfMonitor.monitorDBInfoReal()", true);
                                            new i().a("im_sdk_db_info").a("total_conv_count", Integer.valueOf(i4)).a("normal_conv_count", Integer.valueOf(a4)).a("stranger_conv_count", Integer.valueOf(a5)).a("normal_has_msg_conv_count", Integer.valueOf(i3)).a("normal_no_msg_conv_count", Integer.valueOf(i2)).a("total_msg_count", Integer.valueOf(a6)).a("db_size", Long.valueOf(j2)).a("version", "38").a("cost_time", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis)).d();
                                        } catch (Exception e2) {
                                            j.b("IMPerfMonitor monitorDBInfoReal", e2);
                                            e.a(e2);
                                            com.bytedance.im.core.internal.a.a.b.a("IMPerfMonitor.monitorDBInfoReal()", false);
                                        }
                                    }
                                }
                            }
                        });
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            });
        }
    }

    private static void a(Runnable runnable) {
        f38102c.postDelayed(runnable, 5000);
    }

    static int a(List list) {
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public static String a(ap apVar) {
        if (apVar != null) {
            return apVar.toString();
        }
        return "[]";
    }

    public static String b(Throwable th) {
        if (th == null) {
            return "";
        }
        String stackTraceString = Log.getStackTraceString(th);
        if (stackTraceString.length() > 2000) {
            return stackTraceString.substring(0, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
        }
        return stackTraceString;
    }

    public static String a(aq aqVar) {
        if (aqVar != null) {
            return aqVar.toString();
        }
        return "[]";
    }

    public static String a(Throwable th) {
        if (th == null) {
            return "";
        }
        String message = th.getMessage();
        if (message != null) {
            return message;
        }
        return "";
    }

    public static void a(int i2, int i3) {
        String str;
        i a2 = new i().a("im_invalid_msg_pull").a("msg_source", Integer.valueOf(i2)).a("link_mode", Integer.valueOf(l.a().b()));
        if (l.a().f38777b) {
            str = "1";
        } else {
            str = "0";
        }
        a2.a("is_migrate", str).a("pull_reason", Integer.valueOf(i3)).b();
    }

    public static void a(int i2, k kVar) {
        long j2;
        int i3;
        i a2 = new i().a("im_link_mode_migrate").a("to_link_mode", Integer.valueOf(i2));
        if (kVar != null) {
            j2 = kVar.baseIndexV2;
        } else {
            j2 = -2;
        }
        i a3 = a2.a("base_index_v2", Long.valueOf(j2));
        if (kVar != null) {
            i3 = kVar.fallbackStrategy;
        } else {
            i3 = -2;
        }
        a3.a("fallback_strategy", Integer.valueOf(i3)).b();
    }

    public static void a(int i2, Throwable th) {
        String str = "";
        try {
            if (th.getMessage() != null) {
                str = th.getMessage();
            }
            String stackTraceString = Log.getStackTraceString(th);
            if (stackTraceString.length() > 2000) {
                stackTraceString = stackTraceString.substring(0, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
            }
            new i().a("im_save_msg_error").a("msg_source", Integer.valueOf(i2)).a("error_msg", str).a("error_stack", stackTraceString).b();
        } catch (Exception unused) {
        }
    }
}
