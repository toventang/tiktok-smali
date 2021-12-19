package net.openid.appauth.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    static final Intent f159579a = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));

    static {
        Covode.recordClassIndex(106062);
    }

    public static b a(Context context) {
        b bVar = null;
        for (b bVar2 : b(context)) {
            if (bVar2.f159578d.booleanValue()) {
                return bVar2;
            }
            if (bVar == null) {
                bVar = bVar2;
            }
        }
        return bVar;
    }

    private static boolean a(ResolveInfo resolveInfo) {
        if (!resolveInfo.filter.hasAction("android.intent.action.VIEW") || !resolveInfo.filter.hasCategory("android.intent.category.BROWSABLE") || resolveInfo.filter.schemesIterator() == null || resolveInfo.filter.authoritiesIterator() != null) {
            return false;
        }
        Iterator<String> schemesIterator = resolveInfo.filter.schemesIterator();
        boolean z = false;
        boolean z2 = false;
        while (schemesIterator.hasNext()) {
            String next = schemesIterator.next();
            z |= "http".equals(next);
            z2 |= "https".equals(next);
            if (z && z2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084 A[Catch:{ NameNotFoundException -> 0x0029 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008c A[Catch:{ NameNotFoundException -> 0x0029 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<net.openid.appauth.a.b> b(android.content.Context r10) {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: net.openid.appauth.a.d.b(android.content.Context):java.util.List");
    }
}
