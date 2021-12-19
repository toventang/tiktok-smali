package com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.b;
import com.ss.android.ugc.aweme.runtime.behavior.c;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class f extends a {

    /* renamed from: a  reason: collision with root package name */
    private final String f95419a = "follow_user";

    /* renamed from: b  reason: collision with root package name */
    private final String f95420b = "unfollow_user";

    static {
        Covode.recordClassIndex(60436);
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final String a() {
        return "abnor_follow";
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final long b() {
        return TimeUnit.HOURS.toMillis(2);
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final String c() {
        long currentTimeMillis = System.currentTimeMillis() - b();
        List<c> a2 = b.a(this.f95419a, currentTimeMillis);
        List<c> a3 = b.a(this.f95420b, currentTimeMillis);
        StringBuilder sb = new StringBuilder();
        if (!a2.isEmpty()) {
            sb.append("FollowError: " + a2.size() + "(ECode:");
            Iterator<c> it = a2.iterator();
            while (it.hasNext()) {
                sb.append(it.next().f120725d + ',');
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append(");");
        }
        if (!a3.isEmpty()) {
            sb.append("UnFollowError: " + a3.size() + "(ECode:");
            Iterator<c> it2 = a3.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next().f120725d + ',');
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append(");");
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final boolean a(String str) {
        l.d(str, "");
        if (l.a((Object) str, (Object) this.f95419a) || l.a((Object) str, (Object) this.f95420b)) {
            return true;
        }
        return false;
    }
}
