package com.bytedance.push.k;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.k.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static List<String> f42230a;

    /* renamed from: b  reason: collision with root package name */
    private static List<ServiceInfo> f42231b;

    /* renamed from: c  reason: collision with root package name */
    private static List<ActivityInfo> f42232c;

    /* renamed from: d  reason: collision with root package name */
    private static List<ProviderInfo> f42233d;

    static {
        Covode.recordClassIndex(25802);
    }

    private static List<String> a(Context context) {
        String[] strArr;
        MethodCollector.i(6294);
        if (f42230a == null) {
            synchronized (c.class) {
                try {
                    if (f42230a == null && (strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions) != null) {
                        f42230a = Arrays.asList(strArr);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6294);
                    throw th;
                }
            }
        }
        List<String> list = f42230a;
        MethodCollector.o(6294);
        return list;
    }

    private static List<ServiceInfo> b(Context context) {
        ServiceInfo[] serviceInfoArr;
        MethodCollector.i(6322);
        if (f42231b == null) {
            synchronized (c.class) {
                try {
                    if (f42231b == null && (serviceInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 516).services) != null) {
                        f42231b = Arrays.asList(serviceInfoArr);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6322);
                    throw th;
                }
            }
        }
        List<ServiceInfo> list = f42231b;
        MethodCollector.o(6322);
        return list;
    }

    private static List<ActivityInfo> c(Context context) {
        ActivityInfo[] activityInfoArr;
        MethodCollector.i(6333);
        if (f42232c == null) {
            synchronized (c.class) {
                try {
                    if (f42232c == null && (activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 514).receivers) != null) {
                        f42232c = Arrays.asList(activityInfoArr);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6333);
                    throw th;
                }
            }
        }
        List<ActivityInfo> list = f42232c;
        MethodCollector.o(6333);
        return list;
    }

    private static List<ProviderInfo> d(Context context) {
        ProviderInfo[] providerInfoArr;
        MethodCollector.i(6374);
        if (f42233d == null) {
            synchronized (c.class) {
                try {
                    if (f42233d == null && (providerInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 520).providers) != null) {
                        f42233d = Arrays.asList(providerInfoArr);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6374);
                    throw th;
                }
            }
        }
        List<ProviderInfo> list = f42233d;
        MethodCollector.o(6374);
        return list;
    }

    public static boolean a(Context context, String str, List<String> list) {
        List<String> a2 = a(context);
        if (a2 == null || a2.isEmpty()) {
            new StringBuilder().append(str).append(".You need to declare permission(s) {").append(list).append("} in AndroidManifest.xml");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            if (!a2.contains(str2)) {
                arrayList.add(str2);
            }
        }
        if (!arrayList.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean b(Context context, String str, List<a> list) {
        boolean z;
        if (list == null || list.isEmpty()) {
            return true;
        }
        List<ServiceInfo> b2 = b(context);
        if (b2 == null || b2.size() == 0) {
            new StringBuilder().append(str).append(". You need to declare service(s) {").append(list).append("} in AndroidManifest.xml");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        for (a aVar : list) {
            Iterator<ServiceInfo> it = b2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    arrayList.add(aVar);
                    break;
                }
                ServiceInfo next = it.next();
                if (TextUtils.equals(next.name, aVar.f42220b)) {
                    boolean equals = TextUtils.equals(aVar.f42221c, next.processName);
                    if (!TextUtils.isEmpty(aVar.f42222d)) {
                        z = TextUtils.equals(next.permission, aVar.f42222d);
                    } else {
                        z = true;
                    }
                    if (!equals) {
                        String str2 = next.processName;
                        z2 = false;
                    }
                    if (!z) {
                        String str3 = next.permission;
                        z2 = false;
                    }
                    if (aVar.f42219a != null) {
                        boolean z3 = true;
                        for (a.b bVar : aVar.f42219a) {
                            if (bVar.f42225a != null) {
                                for (String str4 : bVar.f42225a) {
                                    if (!b(context, aVar.f42220b, bVar, str4)) {
                                        z3 = false;
                                    }
                                }
                            }
                        }
                        if (!z3) {
                            z2 = false;
                        }
                    }
                }
            }
        }
        arrayList.isEmpty();
        if (!z2 || !arrayList.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean c(Context context, String str, List<a> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        List<ActivityInfo> c2 = c(context);
        if (c2 == null || c2.size() == 0) {
            new StringBuilder().append(str).append(" error configuration:").append(list);
            return false;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (a aVar : list) {
            Iterator<ActivityInfo> it = c2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    arrayList.add(aVar);
                    break;
                }
                ActivityInfo next = it.next();
                if (TextUtils.equals(next.name, aVar.f42220b)) {
                    if (!TextUtils.equals(aVar.f42221c, next.processName)) {
                        String str2 = next.processName;
                        z = false;
                    }
                    if (!TextUtils.isEmpty(aVar.f42222d) && !TextUtils.equals(next.permission, aVar.f42222d)) {
                        String str3 = next.permission;
                        z = false;
                    }
                    if (aVar.f42219a != null) {
                        boolean z2 = true;
                        for (a.b bVar : aVar.f42219a) {
                            if (bVar.f42225a != null) {
                                for (String str4 : bVar.f42225a) {
                                    if (!a(context, aVar.f42220b, bVar, str4)) {
                                        z2 = false;
                                    }
                                }
                            }
                        }
                        if (!z2) {
                            z = false;
                        }
                    }
                }
            }
        }
        arrayList.isEmpty();
        if (!z || !arrayList.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean d(Context context, String str, List<a> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        List<ProviderInfo> d2 = d(context);
        if (d2 == null || d2.size() == 0) {
            new StringBuilder().append(str).append(" need to declare ContentProvider(s) ").append(list);
            return false;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (a aVar : list) {
            Iterator<ProviderInfo> it = d2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    arrayList.add(aVar);
                    break;
                }
                ProviderInfo next = it.next();
                if (TextUtils.equals(next.name, aVar.f42220b)) {
                    if (!TextUtils.equals(aVar.f42221c, next.processName)) {
                        String str2 = next.processName;
                        z = false;
                    }
                    if (!TextUtils.isEmpty(aVar.f42223e) && !TextUtils.equals(next.authority, aVar.f42223e)) {
                        String str3 = next.authority;
                        z = false;
                    }
                }
            }
        }
        arrayList.isEmpty();
        if (!z || !arrayList.isEmpty()) {
            return false;
        }
        return true;
    }

    private static boolean b(Context context, String str, a.b bVar, String str2) {
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        if (bVar.f42226b != null) {
            for (String str3 : bVar.f42226b) {
                intent.addCategory(str3);
            }
        }
        intent.setAction(str2);
        if (bVar.f42227c != null) {
            intent.setData(bVar.f42227c);
        }
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 576);
        if (queryIntentServices == null || queryIntentServices.size() <= 0) {
            return false;
        }
        for (ResolveInfo resolveInfo : queryIntentServices) {
            if (resolveInfo.serviceInfo != null && (TextUtils.isEmpty(str) || TextUtils.equals(resolveInfo.serviceInfo.name, str))) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(Context context, String str, a.b bVar, String str2) {
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        if (bVar.f42226b != null) {
            for (String str3 : bVar.f42226b) {
                intent.addCategory(str3);
            }
        }
        intent.setAction(str2);
        if (bVar.f42227c != null) {
            if (!TextUtils.isEmpty(bVar.f42228d)) {
                intent.setDataAndType(bVar.f42227c, bVar.f42228d);
            } else {
                intent.setData(bVar.f42227c);
            }
        } else if (!TextUtils.isEmpty(bVar.f42228d)) {
            intent.setType(bVar.f42228d);
        }
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 576);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            return false;
        }
        for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
            if (resolveInfo.activityInfo != null && TextUtils.equals(resolveInfo.activityInfo.name, str)) {
                return true;
            }
        }
        return false;
    }
}
