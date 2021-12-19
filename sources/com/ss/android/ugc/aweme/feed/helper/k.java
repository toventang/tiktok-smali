package com.ss.android.ugc.aweme.feed.helper;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.p;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.ui.bi;
import com.ss.android.ugc.aweme.utils.dg;
import com.ss.android.ugc.aweme.video.v;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static j f93357a;

    /* renamed from: b  reason: collision with root package name */
    public static i f93358b;

    /* renamed from: c  reason: collision with root package name */
    public static i f93359c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f93360d;

    /* renamed from: e  reason: collision with root package name */
    public static int f93361e;

    /* renamed from: f  reason: collision with root package name */
    public static int f93362f = -1;

    /* renamed from: g  reason: collision with root package name */
    public static long f93363g;

    /* renamed from: h  reason: collision with root package name */
    static p[] f93364h;

    /* renamed from: i  reason: collision with root package name */
    static String f93365i = "";

    /* renamed from: j  reason: collision with root package name */
    public static String f93366j = "";

    /* renamed from: k  reason: collision with root package name */
    public static String f93367k = "";

    /* renamed from: l  reason: collision with root package name */
    public static String f93368l = "";

    /* renamed from: m  reason: collision with root package name */
    public static String f93369m = "";
    public static String n = "";
    public static String o = "";
    public static int p = -1;
    public static boolean q;
    public static boolean r;
    static boolean s;
    public static final k t = new k();
    private static int u;
    private static boolean v;
    private static long w;
    private static final Handler x = new Handler();

    /* access modifiers changed from: package-private */
    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final f f93378a = new f();

        static {
            Covode.recordClassIndex(59175);
        }

        f() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public enum a {
        SUBMIT(1),
        INTERVAL(2),
        CANCEL(3),
        DISLIKE(4),
        PRIORITY(5);
        
        private final int type;

        public final int getType() {
            return this.type;
        }

        static {
            Covode.recordClassIndex(59170);
        }

        private a(int i2) {
            this.type = i2;
        }
    }

    public enum b {
        BINARY(0),
        FIVE_LEVEL(1),
        SINGLE_CHOICE(2),
        MULTIPLE_CHOICE(3);
        
        private final int type;

        public final int getType() {
            return this.type;
        }

        static {
            Covode.recordClassIndex(59171);
        }

        private b(int i2) {
            this.type = i2;
        }
    }

    private k() {
    }

    public static final class n implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.dmt.ui.dialog.a f93403a;

        static {
            Covode.recordClassIndex(59183);
        }

        @Override // com.ss.android.ugc.aweme.feed.helper.q
        public final void a() {
            com.bytedance.ies.dmt.ui.dialog.a aVar = this.f93403a;
            if (aVar != null) {
                aVar.a((Boolean) true);
            }
        }

        public n(com.bytedance.ies.dmt.ui.dialog.a aVar) {
            this.f93403a = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f93372a;

        static {
            Covode.recordClassIndex(59172);
        }

        c(boolean z) {
            this.f93372a = z;
        }

        public final void run() {
            if (!k.r) {
                return;
            }
            if (this.f93372a) {
                k.f93363g = System.currentTimeMillis();
            } else {
                k.a("background");
            }
        }
    }

    public static void b() {
        if (w != 0) {
            Keva.getRepo("feed_survey").storeLong("key_next_time", System.currentTimeMillis() + (w * 1000));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final h f93380a = new h();

        static {
            Covode.recordClassIndex(59177);
        }

        h() {
        }

        public final void run() {
            if (k.r) {
                com.ss.android.ugc.aweme.video.i O = v.O();
                h.f.b.l.b(O, "");
                if (O.o()) {
                    v.O().B();
                    k.s = true;
                    return;
                }
                k.a();
            }
        }
    }

    static {
        Covode.recordClassIndex(59169);
    }

    public static void a() {
        com.ss.android.ugc.aweme.video.i O = v.O();
        h.f.b.l.b(O, "");
        if (O.o()) {
            v.O().B();
            s = true;
            return;
        }
        x.postDelayed(h.f93380a, 1000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0067, code lost:
        if (h.m.p.e((java.lang.CharSequence) r2, (java.lang.CharSequence) r1.append(r0).toString()) == false) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean c() {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.helper.k.c():boolean");
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final g f93379a = new g();

        static {
            Covode.recordClassIndex(59176);
        }

        g() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                th.printStackTrace();
            }
        }
    }

    public static final class o implements p.a {
        static {
            Covode.recordClassIndex(59184);
        }

        @Override // com.bytedance.ies.dmt.ui.dialog.p.a
        public final void a(boolean z) {
            if (z) {
                k.a();
            }
        }
    }

    public static final class p implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        public static final p f93404a = new p();

        static {
            Covode.recordClassIndex(59185);
        }

        p() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            if (k.s) {
                v.O().y();
                k.s = false;
            }
        }
    }

    public static final void a(boolean z) {
        x.post(new c(z));
        if (z && u > 0) {
            u = 0;
        }
    }

    public static final class e implements bi.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bi f93376a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f93377b;

        static {
            Covode.recordClassIndex(59174);
        }

        public e(bi biVar, List list) {
            this.f93376a = biVar;
            this.f93377b = list;
        }

        @Override // com.ss.android.ugc.aweme.feed.ui.bi.a
        public final void a(float f2) {
            int i2;
            q optionClickListener = this.f93376a.getOptionClickListener();
            if (optionClickListener != null) {
                optionClickListener.a();
            }
            int i3 = (int) f2;
            if (i3 > 0) {
                i2 = i3 - 1;
            } else {
                i2 = 0;
            }
            this.f93376a.setOption(((p) this.f93377b.get(i2)).f93416b);
            p pVar = (p) this.f93377b.get(i2);
            k.f93364h = new p[]{pVar};
            k.f93365i = String.valueOf(pVar.f93415a);
        }
    }

    private static void a(int i2) {
        if (i2 != a.SUBMIT.getType()) {
            f93364h = null;
        }
        i iVar = new i(f93368l, f93369m, "", "", new s[]{new s(n, p, o, f93364h)});
        Object a2 = RetrofitFactory.a().b(Api.f66569d).d().a(FeedSurveyApi.class);
        h.f.b.l.b(a2, "");
        ((FeedSurveyApi) a2).submitFeedSurvey(f93366j, f93361e, i2, dg.a().b(iVar)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.h.a.b(f.a.k.a.f158006c)).a(f.f93378a, g.f93379a);
        if (f93361e == 2) {
            Keva.getRepo("feed_survey").storeString("key_submitted_flexible_survey", Keva.getRepo("feed_survey").getString("key_submitted_flexible_survey", "") + ',' + f93368l);
            return;
        }
        Keva.getRepo("feed_survey").storeString("key_submitted_fixed_aweme", Keva.getRepo("feed_survey").getString("key_submitted_fixed_aweme", "") + ',' + f93366j);
    }

    public static void a(String str) {
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("group_id", f93366j).a("survey_id", f93368l).a("author_id", f93367k);
        String name = b.values()[p].name();
        Locale locale = Locale.ENGLISH;
        String str2 = "";
        h.f.b.l.b(locale, str2);
        Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = name.toLowerCase(locale);
        h.f.b.l.b(lowerCase, str2);
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a(StringSet.type, lowerCase).a("stay_time", (System.currentTimeMillis() - f93363g) / 1000).a("exit_method", str);
        String name2 = a.SUBMIT.name();
        Locale locale2 = Locale.ENGLISH;
        h.f.b.l.b(locale2, str2);
        Objects.requireNonNull(name2, "null cannot be cast to non-null type java.lang.String");
        String lowerCase2 = name2.toLowerCase(locale2);
        h.f.b.l.b(lowerCase2, str2);
        if (TextUtils.equals(str, lowerCase2)) {
            str2 = f93365i;
        }
        com.ss.android.ugc.aweme.app.f.d a4 = a3.a("result", str2);
        int i2 = 1;
        if (f93361e != 1) {
            i2 = 0;
        }
        r.a("exit_survey", a4.a("is_fixed_survey", i2).f66730a);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.k$k  reason: collision with other inner class name */
    public static final class DialogInterface$OnClickListenerC2265k implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VerticalViewPager f93391a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f93392b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f93393c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f93394d;

        static {
            Covode.recordClassIndex(59180);
        }

        public DialogInterface$OnClickListenerC2265k(VerticalViewPager verticalViewPager, int i2, int i3, int i4) {
            this.f93391a = verticalViewPager;
            this.f93392b = i2;
            this.f93393c = i3;
            this.f93394d = i4;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            k.a(a.CANCEL, this.f93391a, this.f93392b, this.f93393c, this.f93394d);
        }
    }

    public static final class l implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VerticalViewPager f93395a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f93396b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f93397c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f93398d;

        static {
            Covode.recordClassIndex(59181);
        }

        public l(VerticalViewPager verticalViewPager, int i2, int i3, int i4) {
            this.f93395a = verticalViewPager;
            this.f93396b = i2;
            this.f93397c = i3;
            this.f93398d = i4;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            k.a(a.SUBMIT, this.f93395a, this.f93396b, this.f93397c, this.f93398d);
        }
    }

    public static final class m implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VerticalViewPager f93399a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f93400b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f93401c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f93402d;

        static {
            Covode.recordClassIndex(59182);
        }

        public m(VerticalViewPager verticalViewPager, int i2, int i3, int i4) {
            this.f93399a = verticalViewPager;
            this.f93400b = i2;
            this.f93401c = i3;
            this.f93402d = i4;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            k.a(a.CANCEL, this.f93399a, this.f93400b, this.f93401c, this.f93402d);
        }
    }

    public static final class i implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f93381a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VerticalViewPager f93382b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f93383c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f93384d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f93385e;

        static {
            Covode.recordClassIndex(59178);
        }

        public i(List list, VerticalViewPager verticalViewPager, int i2, int i3, int i4) {
            this.f93381a = list;
            this.f93382b = verticalViewPager;
            this.f93383c = i2;
            this.f93384d = i3;
            this.f93385e = i4;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.aweme.feed.helper.p[] */
        /* JADX WARN: Multi-variable type inference failed */
        public final void onClick(DialogInterface dialogInterface, int i2) {
            k.f93364h = new p[]{this.f93381a.get(0)};
            k.f93365i = String.valueOf(((p) this.f93381a.get(0)).f93415a);
            k.a(a.SUBMIT, this.f93382b, this.f93383c, this.f93384d, this.f93385e);
        }
    }

    public static final class j implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f93386a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VerticalViewPager f93387b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f93388c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f93389d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f93390e;

        static {
            Covode.recordClassIndex(59179);
        }

        public j(List list, VerticalViewPager verticalViewPager, int i2, int i3, int i4) {
            this.f93386a = list;
            this.f93387b = verticalViewPager;
            this.f93388c = i2;
            this.f93389d = i3;
            this.f93390e = i4;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.aweme.feed.helper.p[] */
        /* JADX WARN: Multi-variable type inference failed */
        public final void onClick(DialogInterface dialogInterface, int i2) {
            k.f93364h = new p[]{this.f93386a.get(1)};
            k.f93365i = String.valueOf(((p) this.f93386a.get(1)).f93415a);
            k.a(a.SUBMIT, this.f93387b, this.f93388c, this.f93389d, this.f93390e);
        }
    }

    public static View a(Context context, int i2, List<p> list) {
        boolean z;
        int i3;
        if (context == null) {
            return null;
        }
        com.ss.android.ugc.aweme.feed.ui.i iVar = new com.ss.android.ugc.aweme.feed.ui.i(context);
        int i4 = 1;
        if (i2 == b.SINGLE_CHOICE.getType()) {
            z = true;
        } else {
            z = false;
            i4 = 2;
        }
        iVar.setChoiceMode(i4);
        iVar.setVisibility(0);
        iVar.setDivider(null);
        iVar.setSelector(new ColorDrawable(0));
        ArrayList arrayList = new ArrayList(list.size());
        for (p pVar : list) {
            arrayList.add(pVar.f93416b);
        }
        if (z) {
            i3 = R.layout.sd;
        } else {
            i3 = R.layout.sc;
        }
        iVar.setAdapter((ListAdapter) new ArrayAdapter(context, i3, arrayList));
        iVar.setOnItemClickListener(new d(iVar, z, list));
        iVar.setPadding(0, (int) com.bytedance.common.utility.n.b(context, 20.0f), 0, 0);
        return iVar;
    }

    /* access modifiers changed from: package-private */
    public static final class d implements AdapterView.OnItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.feed.ui.i f93373a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f93374b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f93375c;

        static {
            Covode.recordClassIndex(59173);
        }

        d(com.ss.android.ugc.aweme.feed.ui.i iVar, boolean z, List list) {
            this.f93373a = iVar;
            this.f93374b = z;
            this.f93375c = list;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            q optionClickListener = this.f93373a.getOptionClickListener();
            if (optionClickListener != null) {
                optionClickListener.a();
            }
            if (this.f93374b) {
                p pVar = (p) this.f93375c.get(this.f93373a.getCheckedItemPosition());
                k.f93364h = new p[]{pVar};
                k.f93365i = String.valueOf(pVar.f93415a);
                return;
            }
            SparseBooleanArray checkedItemPositions = this.f93373a.getCheckedItemPositions();
            h.f.b.l.b(checkedItemPositions, "");
            if (checkedItemPositions != null) {
                k.f93365i = "";
                ArrayList arrayList = new ArrayList();
                int size = checkedItemPositions.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (checkedItemPositions.valueAt(i3)) {
                        p pVar2 = (p) this.f93375c.get(checkedItemPositions.keyAt(i3));
                        arrayList.add(pVar2);
                        k.f93365i = h.f.b.l.a(k.f93365i, (Object) String.valueOf(pVar2.f93415a));
                    }
                }
                Object[] array = arrayList.toArray(new p[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                k.f93364h = (p[]) array;
            }
        }
    }

    public static final boolean a(String str, String str2, boolean z, int i2) {
        i iVar;
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        if (v && f93358b != null && z) {
            String string = Keva.getRepo("feed_survey").getString("key_submitted_fixed_aweme", "");
            if (!TextUtils.isEmpty(string)) {
                h.f.b.l.b(string, "");
                if (h.m.p.a((CharSequence) string, (CharSequence) ",".concat(String.valueOf(str)), false)) {
                    return false;
                }
            }
            i iVar2 = f93358b;
            if (iVar2 == null) {
                h.f.b.l.b();
            }
            f93368l = iVar2.f93347a;
            i iVar3 = f93358b;
            if (iVar3 == null) {
                h.f.b.l.b();
            }
            f93369m = iVar3.f93348b;
            i iVar4 = f93358b;
            if (iVar4 == null) {
                h.f.b.l.b();
            }
            s[] sVarArr = iVar4.f93351e;
            if (!(sVarArr == null || sVarArr.length == 0)) {
                p = sVarArr[0].f93421b;
                n = sVarArr[0].f93420a;
                o = sVarArr[0].f93422c;
            }
            f93361e = 1;
        } else if (!f93360d || (iVar = f93359c) == null || i2 < f93362f) {
            f93361e = 0;
            return false;
        } else {
            f93368l = iVar.f93347a;
            i iVar5 = f93359c;
            if (iVar5 == null) {
                h.f.b.l.b();
            }
            f93369m = iVar5.f93348b;
            i iVar6 = f93359c;
            if (iVar6 == null) {
                h.f.b.l.b();
            }
            s[] sVarArr2 = iVar6.f93351e;
            if (!(sVarArr2 == null || sVarArr2.length == 0)) {
                p = sVarArr2[0].f93421b;
                n = sVarArr2[0].f93420a;
                o = sVarArr2[0].f93422c;
            }
            f93361e = 2;
        }
        f93366j = str;
        f93367k = str2;
        if (q) {
            a(a.DISLIKE.getType());
            b();
            q = false;
            return false;
        } else if (Keva.getRepo("feed_survey").getLong("key_next_time", 0) <= System.currentTimeMillis()) {
            return true;
        } else {
            a(a.INTERVAL.getType());
            return false;
        }
    }

    public static void a(a aVar, VerticalViewPager verticalViewPager, int i2, int i3, int i4) {
        a(aVar.getType());
        verticalViewPager.a(i2, i3, i4);
        String name = aVar.name();
        Locale locale = Locale.ENGLISH;
        h.f.b.l.b(locale, "");
        Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = name.toLowerCase(locale);
        h.f.b.l.b(lowerCase, "");
        a(lowerCase);
        r = false;
        f93364h = null;
    }
}
