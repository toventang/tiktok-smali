package com.ss.android.ugc.aweme.profile.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.profile.a.m;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.m.p;
import java.util.ArrayList;
import java.util.List;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static String f116431a = "output";

    /* renamed from: b  reason: collision with root package name */
    public static boolean f116432b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f116433c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f116434d;

    /* renamed from: e  reason: collision with root package name */
    static int f116435e;

    /* renamed from: f  reason: collision with root package name */
    public static final o f116436f = new o();

    /* renamed from: g  reason: collision with root package name */
    private static final ArrayList<m> f116437g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private static final Integer f116438h;

    private o() {
    }

    private static int i() {
        Integer num = f116438h;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static boolean b() {
        User user;
        List<String> list;
        IAccountUserService g2 = b.g();
        if (g2 != null) {
            user = g2.getCurUser();
        } else {
            user = null;
        }
        if (user == null || (list = user.boldFields) == null || !list.contains("nickname")) {
            return false;
        }
        return true;
    }

    public static boolean c() {
        User curUser;
        IAccountUserService g2 = b.g();
        String str = null;
        if (!(g2 == null || (curUser = g2.getCurUser()) == null)) {
            str = curUser.getSignature();
        }
        if (p.a(str, "", false)) {
            return false;
        }
        return true;
    }

    public static boolean d() {
        User user;
        IAccountUserService g2 = b.g();
        if (g2 != null) {
            user = g2.getCurUser();
        } else {
            user = null;
        }
        if (user == null || user.getFansCount() < 1000) {
            return false;
        }
        return true;
    }

    public static int h() {
        int i2;
        if (a()) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (c()) {
            i2++;
        }
        if (b()) {
            return i2 + 1;
        }
        return i2;
    }

    static {
        Integer num;
        User curUser;
        Covode.recordClassIndex(75165);
        IAccountUserService g2 = b.g();
        if (g2 == null || (curUser = g2.getCurUser()) == null) {
            num = null;
        } else {
            num = Integer.valueOf(curUser.getCompleteProfileGuideStrategy());
        }
        f116438h = num;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r3 != null) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a() {
        /*
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.ss.android.ugc.aweme.account.b.g()
            if (r0 == 0) goto L_0x0028
            com.ss.android.ugc.aweme.profile.model.User r3 = r0.getCurUser()
        L_0x000a:
            r2 = 0
            if (r3 == 0) goto L_0x0027
            java.util.List<java.lang.String> r1 = r3.boldFields
            if (r1 == 0) goto L_0x001b
            java.lang.String r0 = "photo"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x002a
            if (r3 == 0) goto L_0x0027
        L_0x001b:
            java.util.List<java.lang.String> r1 = r3.boldFields
            if (r1 == 0) goto L_0x0027
            java.lang.String r0 = "video"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x002a
        L_0x0027:
            return r2
        L_0x0028:
            r3 = 0
            goto L_0x000a
        L_0x002a:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.f.o.a():boolean");
    }

    public static boolean e() {
        if (in.d()) {
            return false;
        }
        if (i() == 0) {
            return true;
        }
        if (i() == 1) {
            return false;
        }
        if (i() == 2) {
            if (!c() || !b() || !a()) {
                return false;
            }
            return true;
        } else if (i() == 3) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean f() {
        if (!in.d() && !c() && !b() && !a() && (i() == 1 || i() == 2 || i() == 3)) {
            return true;
        }
        return false;
    }

    public static ArrayList<m> g() {
        ArrayList<m> arrayList = f116437g;
        arrayList.clear();
        if (!a()) {
            arrayList.add(new m(R.drawable.b8j, R.string.cn1, R.string.cn0, R.string.cmy, true));
        }
        if (!b()) {
            arrayList.add(new m(R.drawable.b81, R.string.cmx, R.string.cmw, R.string.cmu, true));
        }
        if (!c()) {
            arrayList.add(new m(R.drawable.b7g, R.string.cmt, R.string.cms, R.string.cmq, true));
        }
        if (a()) {
            arrayList.add(new m(R.drawable.b8k, R.string.cn1, R.string.cn0, R.string.cmz, false));
        }
        if (b()) {
            arrayList.add(new m(R.drawable.b82, R.string.cmx, R.string.cmw, R.string.cmv, false));
        }
        if (c()) {
            arrayList.add(new m(R.drawable.b7h, R.string.cmt, R.string.cms, R.string.cmr, false));
        }
        return arrayList;
    }

    public static boolean b(int i2) {
        if (i2 <= 0 && !in.d() && i() == 1) {
            return true;
        }
        return false;
    }

    public static boolean a(int i2) {
        f116435e = i2;
        if (i2 > 3 || in.d()) {
            return false;
        }
        if (c() && b() && a()) {
            return false;
        }
        if (i() == 1 || i() == 2) {
            return true;
        }
        if (i() != 3 || i2 == 0) {
            return false;
        }
        return true;
    }
}
