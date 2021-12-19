package com.ss.android.ugc.aweme.shortcut;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.text.TextUtils;
import b.i;
import com.bytedance.android.livesdkapi.f;
import com.bytedance.android.livesdkapi.service.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgShortcutInfo;
import com.ss.android.ugc.aweme.shortcut.ShortcutProxyActivity;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    static Class<?> f124696a;

    /* renamed from: b  reason: collision with root package name */
    public static final e f124697b = new e();

    private e() {
    }

    private static boolean f() {
        Boolean a2 = com.bytedance.g.b.a.a();
        l.b(a2, "");
        return a2.booleanValue();
    }

    static {
        Covode.recordClassIndex(81938);
        d a2 = f.a();
        if (a2 != null) {
            a2.a(AnonymousClass1.f124698a);
        }
    }

    static int b() {
        UgShortcutInfo shortcutInfo;
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            UgAwemeActivitySetting awemeActivitySetting = iESSettingsProxy.getAwemeActivitySetting();
            if (awemeActivitySetting == null || (shortcutInfo = awemeActivitySetting.getShortcutInfo()) == null) {
                return 6;
            }
            return shortcutInfo.getWithdrawalReqInterval();
        } catch (Exception unused) {
            return 6;
        }
    }

    private static String c() {
        UgShortcutInfo shortcutInfo;
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            UgAwemeActivitySetting awemeActivitySetting = iESSettingsProxy.getAwemeActivitySetting();
            if (awemeActivitySetting == null || (shortcutInfo = awemeActivitySetting.getShortcutInfo()) == null) {
                return null;
            }
            return shortcutInfo.getWillGetMost();
        } catch (Exception unused) {
            return "";
        }
    }

    private static String d() {
        UgShortcutInfo shortcutInfo;
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            UgAwemeActivitySetting awemeActivitySetting = iESSettingsProxy.getAwemeActivitySetting();
            if (awemeActivitySetting == null || (shortcutInfo = awemeActivitySetting.getShortcutInfo()) == null) {
                return null;
            }
            return shortcutInfo.getH5Link();
        } catch (Exception unused) {
            return "";
        }
    }

    static boolean a() {
        boolean z;
        UgShortcutInfo ugShortcutInfo;
        boolean z2;
        Boolean overallSwitch;
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            UgAwemeActivitySetting awemeActivitySetting = iESSettingsProxy.getAwemeActivitySetting();
            if (awemeActivitySetting == null || (overallSwitch = awemeActivitySetting.getOverallSwitch()) == null) {
                z = false;
            } else {
                z = overallSwitch.booleanValue();
            }
            IESSettingsProxy iESSettingsProxy2 = c.f99077a.f99078b;
            l.b(iESSettingsProxy2, "");
            UgAwemeActivitySetting awemeActivitySetting2 = iESSettingsProxy2.getAwemeActivitySetting();
            if (awemeActivitySetting2 != null) {
                ugShortcutInfo = awemeActivitySetting2.getShortcutInfo();
            } else {
                ugShortcutInfo = null;
            }
            if (ugShortcutInfo != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z || !z2) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f124699a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f124700b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ShortcutManager f124701c;

        static {
            Covode.recordClassIndex(81940);
        }

        a(boolean z, Context context, ShortcutManager shortcutManager) {
            this.f124699a = z;
            this.f124700b = context;
            this.f124701c = shortcutManager;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b3, code lost:
            if ((java.lang.System.currentTimeMillis() - com.ss.android.ugc.aweme.shortcut.d.f124691a.getLong("key_last_request_time", 0)) < java.util.concurrent.TimeUnit.HOURS.toMillis((long) com.ss.android.ugc.aweme.shortcut.e.b())) goto L_0x003d;
         */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object call() {
            /*
            // Method dump skipped, instructions count: 182
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortcut.e.a.call():java.lang.Object");
        }
    }

    private static String e() {
        String str;
        UgShortcutInfo shortcutInfo;
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            UgAwemeActivitySetting awemeActivitySetting = iESSettingsProxy.getAwemeActivitySetting();
            if (awemeActivitySetting == null || (shortcutInfo = awemeActivitySetting.getShortcutInfo()) == null) {
                str = null;
            } else {
                str = shortcutInfo.getMoneySymbol();
            }
            if (!TextUtils.isEmpty(str)) {
                if (d.a() != 0) {
                    double a2 = (double) d.a();
                    Double.isNaN(a2);
                    double d2 = a2 / 100.0d;
                    if (d2 >= 99.0d) {
                        if (str == null) {
                            l.b();
                        }
                        String a3 = com.a.a(str, Arrays.copyOf(new Object[]{"99+"}, 1));
                        l.b(a3, "");
                        return a3;
                    } else if (d2 < 10.0d || d2 >= 99.0d) {
                        if (str == null) {
                            l.b();
                        }
                        String a4 = com.a.a(str, Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1));
                        l.b(a4, "");
                        return a4;
                    } else {
                        long a5 = d.a() / 100;
                        if (str == null) {
                            l.b();
                        }
                        String a6 = com.a.a(str, Arrays.copyOf(new Object[]{Long.valueOf(a5)}, 1));
                        l.b(a6, "");
                        return a6;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public static void a(boolean z) {
        if (Build.VERSION.SDK_INT >= 25) {
            Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
            ShortcutManager shortcutManager = (ShortcutManager) a2.getSystemService(ShortcutManager.class);
            IAccountUserService g2 = b.g();
            l.b(g2, "");
            if (!g2.isLogin()) {
                try {
                    l.b(shortcutManager, "");
                    shortcutManager.setDynamicShortcuts(new ArrayList());
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } else {
                i.b(new a(z, a2, shortcutManager), i.f4824a);
            }
        }
    }

    public static void a(Context context, ShortcutManager shortcutManager) {
        ArrayList arrayList = new ArrayList();
        if (a() && f() && !in.d()) {
            String d2 = d();
            String c2 = c();
            if (!TextUtils.isEmpty(c2) && !TextUtils.isEmpty(d2)) {
                Intent a2 = ShortcutProxyActivity.a.a(context, h.WILL_GET_MOST);
                a2.putExtra("open_url", d2);
                ShortcutInfo.Builder builder = new ShortcutInfo.Builder(context, h.WILL_GET_MOST.toString());
                if (c2 == null) {
                    l.b();
                }
                ShortcutInfo build = builder.setShortLabel(c2).setLongLabel(c2).setIcon(Icon.createWithResource(context, 2131231550)).setIntent(a2).build();
                l.b(build, "");
                arrayList.add(build);
            }
        }
        if (a() && f()) {
            IAccountUserService g2 = b.g();
            l.b(g2, "");
            if (g2.isLogin() && !in.d()) {
                String d3 = d();
                String e2 = e();
                if (!TextUtils.isEmpty(e2) && !TextUtils.isEmpty(d3)) {
                    Intent a3 = ShortcutProxyActivity.a.a(context, h.WITHDRAWAL);
                    a3.putExtra("open_url", d3);
                    ShortcutInfo.Builder builder2 = new ShortcutInfo.Builder(context, h.WITHDRAWAL.toString());
                    if (e2 == null) {
                        l.b();
                    }
                    ShortcutInfo build2 = builder2.setShortLabel(e2).setLongLabel(e2).setIcon(Icon.createWithResource(context, 2131231553)).setIntent(a3).build();
                    l.b(build2, "");
                    arrayList.add(build2);
                }
            }
        }
        if (arrayList.size() < 4 && !in.d()) {
            ShortcutInfo build3 = new ShortcutInfo.Builder(context, h.NOTIFICATION.toString()).setShortLabel(context.getString(R.string.djr)).setLongLabel(context.getString(R.string.djr)).setIcon(Icon.createWithResource(context, 2131231551)).setIntent(ShortcutProxyActivity.a.a(context, h.NOTIFICATION)).build();
            l.b(build3, "");
            arrayList.add(build3);
        }
        if (arrayList.size() < 4) {
            ShortcutInfo build4 = new ShortcutInfo.Builder(context, h.SHOOTING.toString()).setShortLabel(context.getString(R.string.av1)).setLongLabel(context.getString(R.string.av1)).setIcon(Icon.createWithResource(context, 2131231552)).setIntent(ShortcutProxyActivity.a.a(context, h.SHOOTING)).build();
            l.b(build4, "");
            arrayList.add(build4);
        }
        if (arrayList.size() < 4) {
            ShortcutInfo build5 = new ShortcutInfo.Builder(context, h.DISCOVER.toString()).setShortLabel(context.getString(R.string.b86)).setLongLabel(context.getString(R.string.b86)).setIcon(Icon.createWithResource(context, 2131231549)).setIntent(ShortcutProxyActivity.a.a(context, h.DISCOVER)).build();
            l.b(build5, "");
            arrayList.add(build5);
        }
        if (arrayList.size() != 0) {
            try {
                shortcutManager.setDynamicShortcuts(arrayList);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }
}
