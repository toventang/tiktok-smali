package com.ss.android.ugc.awemepushlib.interaction;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.common.push.account.a;
import com.bytedance.ies.ugc.statisticlogger.config.b;
import com.bytedance.ies.ugc.statisticlogger.config.c;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.awemepushlib.di.a;
import f.a.d.k;

public class j {

    /* renamed from: a  reason: collision with root package name */
    static int f145447a;

    /* renamed from: b  reason: collision with root package name */
    static a f145448b;

    /* renamed from: c  reason: collision with root package name */
    static Handler f145449c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    private static int f145450d;

    static {
        Covode.recordClassIndex(95105);
    }

    public static void a(Context context) {
        b.f35336a.a(new k<c>() {
            /* class com.ss.android.ugc.awemepushlib.interaction.j.AnonymousClass5 */

            static {
                Covode.recordClassIndex(95110);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.k
            public final /* synthetic */ boolean a(c cVar) {
                return c.Local.equals(cVar);
            }
        }).d(new n(context));
    }

    static void b(final Context context) {
        StringBuilder sb = new StringBuilder("method_push_start_frontier_push");
        int i2 = f145450d;
        f145450d = i2 + 1;
        c.a(sb.append(i2).toString());
        com.bytedance.push.frontier.b a2 = com.bytedance.push.frontier.b.a(context);
        a2.f42136c.compareAndSet(null, com.ss.android.ugc.awemepushlib.b.a.f145379a);
        com.bytedance.push.frontier.b a3 = com.bytedance.push.frontier.b.a(context);
        String curSecUserId = com.ss.android.ugc.aweme.account.b.g().getCurSecUserId();
        if (!TextUtils.isEmpty(curSecUserId)) {
            a3.f42139f = curSecUserId;
        }
        com.ss.android.ugc.aweme.account.b.g().addUserChangeListener(new IAccountUserService.a() {
            /* class com.ss.android.ugc.awemepushlib.interaction.j.AnonymousClass6 */

            static {
                Covode.recordClassIndex(95111);
            }

            @Override // com.ss.android.ugc.aweme.IAccountUserService.a
            public final void a(int i2, User user, User user2) {
                String str;
                com.bytedance.common.wschannel.a a2;
                if (user2 != null) {
                    str = user2.getSecUid();
                } else {
                    str = "";
                }
                if (user == null || !TextUtils.equals(str, user.getSecUid())) {
                    com.bytedance.push.frontier.b a3 = com.bytedance.push.frontier.b.a(context);
                    if (!TextUtils.equals(a3.f42139f, str)) {
                        a3.f42139f = str;
                        if (a3.f42136c.get() != null && (a3.f42136c.get() instanceof com.bytedance.push.frontier.b.a)) {
                            com.bytedance.push.frontier.b.a aVar = (com.bytedance.push.frontier.b.a) a3.f42136c.get();
                            if (!TextUtils.equals(aVar.f42145c, str)) {
                                aVar.f42145c = str;
                                if (aVar.f42144b != null && (a2 = aVar.a(aVar.f42143a)) != null) {
                                    aVar.f42144b.a(a2);
                                }
                            }
                        }
                    }
                }
            }
        });
        if (!((Boolean) com.ss.android.ugc.awemepushlib.a.a.f145358d.getValue()).booleanValue() && !com.ss.android.ugc.awemepushlib.a.b.f145378a) {
            com.ss.android.ugc.awemepushlib.manager.a.a().f(context);
            System.out.println();
        }
        c.b("method_push_start_frontier_push");
    }

    static final /* synthetic */ Object c(Context context) {
        com.bytedance.ies.common.push.account.a aVar = new com.bytedance.ies.common.push.account.a(new a.C0725a(context), (byte) 0);
        if (aVar.f33140a != null) {
            try {
                String packageName = aVar.f33140a.getPackageName();
                String string = aVar.f33140a.getString(aVar.f33140a.getApplicationInfo().labelRes);
                if (!TextUtils.isEmpty(string)) {
                    if (!TextUtils.isEmpty(packageName)) {
                        Account account = new Account(string, packageName);
                        if (AccountManager.get(aVar.f33140a).addAccountExplicitly(account, null, null)) {
                            ContentResolver.setIsSyncable(account, aVar.a(), 1);
                            ContentResolver.setSyncAutomatically(account, aVar.a(), true);
                            ContentResolver.addPeriodicSync(account, aVar.a(), new Bundle(), 900);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
