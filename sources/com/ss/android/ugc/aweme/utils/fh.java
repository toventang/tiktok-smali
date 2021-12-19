package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.main.az;
import com.ss.android.ugc.aweme.profile.f;
import com.zhiliaoapp.musically.R;

public final class fh extends fg {

    public interface a {
        static {
            Covode.recordClassIndex(93523);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(93519);
    }

    public static boolean a(Context context, boolean z, boolean z2) {
        SharedPreferences a2 = d.a(context, "NotificationGuide", 0);
        if (fg.a(context)) {
            return false;
        }
        if (z2 || z) {
            return true;
        }
        if (a2.getInt("guide_show_times", 0) > 0) {
            return false;
        }
        if (System.currentTimeMillis() - a2.getLong("guide_last_time", 0) < 60000) {
            return false;
        }
        return true;
    }

    public static void a(Context context, boolean z, a aVar, boolean z2) {
        a(context, z, aVar, z2, "");
    }

    private static void a(Context context, boolean z, a aVar, boolean z2, String str) {
        a(context, z, null, aVar, z2, false, str, null);
    }

    public static void a(final Context context, final boolean z, Runnable runnable, final a aVar, final boolean z2, final boolean z3, final String str, final f fVar) {
        final f.a aVar2;
        if (a(context, z, z3) && Build.VERSION.SDK_INT >= 21) {
            if (fVar != null) {
                try {
                    aVar2 = fVar.a();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            } else {
                aVar2 = null;
            }
            if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
                com.ss.android.b.a.a.a.b(new Runnable(null) {
                    /* class com.ss.android.ugc.aweme.utils.fh.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(93521);
                    }

                    public final void run() {
                        String c2;
                        com.bytedance.ies.dmt.ui.dialog.a a2;
                        AlertDialog alertDialog;
                        Activity activity = (Activity) context;
                        fi fiVar = new fi(context, z, aVar2, z3, str, null);
                        fj fjVar = new fj(z, aVar2, z3, str, context, null);
                        AlertDialog alertDialog2 = null;
                        if (z2) {
                            a2 = null;
                            alertDialog2 = new AlertDialog.Builder(context).setTitle(R.string.fro).setMessage(R.string.frr).setPositiveButton(R.string.frq, fiVar).setNegativeButton(R.string.frp, fjVar).create();
                        } else {
                            a.C0731a aVar = new a.C0731a(context);
                            aVar.f33408h = 2131231560;
                            Context context = context;
                            String c3 = SharePrefCache.inst().getRequestNotificationTitle().c();
                            if (TextUtils.isEmpty(c3)) {
                                c3 = context.getString(R.string.gid);
                            }
                            aVar.f33401a = c3;
                            Context context2 = context;
                            if (z) {
                                c2 = context2.getString(R.string.b6i);
                            } else {
                                c2 = SharePrefCache.inst().getRequestNotificationText().c();
                                if (TextUtils.isEmpty(c2)) {
                                    c2 = context2.getString(R.string.b6h);
                                }
                            }
                            aVar.f33402b = c2;
                            a2 = aVar.a(R.string.a7j, (DialogInterface.OnClickListener) fiVar, true).b(R.string.cv4, (DialogInterface.OnClickListener) fjVar, true).a();
                        }
                        if (!activity.isFinishing()) {
                            if (alertDialog2 != null) {
                                try {
                                    alertDialog2.setOnShowListener(new DialogInterface.OnShowListener() {
                                        /* class com.ss.android.ugc.aweme.utils.fh.AnonymousClass2.AnonymousClass1 */

                                        static {
                                            Covode.recordClassIndex(93522);
                                        }

                                        public final void onShow(DialogInterface dialogInterface) {
                                            if (dialogInterface instanceof AlertDialog) {
                                                AlertDialog alertDialog = (AlertDialog) dialogInterface;
                                                alertDialog.getButton(-1).setTextColor(-16777216);
                                                alertDialog.getButton(-2).setTextColor(-16777216);
                                            }
                                        }
                                    });
                                    alertDialog2.show();
                                    alertDialog = alertDialog2;
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                    return;
                                }
                            } else {
                                alertDialog = a2.c();
                            }
                            alertDialog.setCanceledOnTouchOutside(false);
                            alertDialog.setOnDismissListener(new fk(aVar, fVar));
                            if (z) {
                                r.a("notification_setting_alert_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "notification_setting_page").f66730a);
                            } else if (aVar2 != null) {
                                r.a("push_pre_permission_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", aVar2.f116377c).a("enter_method", aVar2.f116378d).a("room_id", aVar2.f116375a).a("anchor_id", aVar2.f116376b).a("enter_reason", "general").f66730a);
                            } else if (z3) {
                                r.a("push_pre_permission_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).a("enter_method", "notification_bell").a("enter_reason", "general").f66730a);
                            } else {
                                r.a("push_pre_permission_show", new com.ss.android.ugc.aweme.app.f.d().f66730a);
                            }
                        }
                    }
                });
                az.a();
            }
        } else if (aVar != null) {
            aVar.a();
        }
    }
}
