package com.ss.android.ugc.aweme.discover.j;

import android.text.TextUtils;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.detail.i.c;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.QueryCorrectInfo;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchPreventSuicide;
import com.ss.android.ugc.aweme.keyword.a;
import com.ss.android.ugc.aweme.search.g.b;
import com.ss.android.ugc.aweme.search.j;
import com.ss.android.ugc.aweme.search.k.am;
import com.ss.android.ugc.aweme.search.k.c;
import com.ss.android.ugc.aweme.search.k.q;
import com.ss.android.ugc.aweme.search.model.d;
import com.ss.android.ugc.aweme.search.n.d;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

public abstract class f<T, RESPONSE extends SearchApiResult> extends c<T, RESPONSE> implements com.ss.android.ugc.aweme.discover.c.f {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashSet<T> f81240a = new LinkedHashSet<>();

    /* renamed from: b  reason: collision with root package name */
    private final List<T> f81241b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final boolean f81242c = true;

    /* renamed from: d  reason: collision with root package name */
    private String f81243d = "";

    /* renamed from: h  reason: collision with root package name */
    public b f81244h;

    /* renamed from: i  reason: collision with root package name */
    public d f81245i;

    /* renamed from: j  reason: collision with root package name */
    public WeakReference<e> f81246j;

    /* renamed from: k  reason: collision with root package name */
    public a f81247k;

    /* renamed from: l  reason: collision with root package name */
    public a.AbstractC2689a f81248l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f81249m;
    public boolean n;
    public int o;
    public String p;
    public String q;
    public String r;

    static {
        Covode.recordClassIndex(50488);
    }

    public abstract int c();

    /* access modifiers changed from: protected */
    public boolean b() {
        return this.f81242c;
    }

    public final String e() {
        return this.f81243d;
    }

    private final boolean n() {
        if (this.mListQueryType == 1) {
            return true;
        }
        return false;
    }

    public final String j() {
        d dVar = this.f81245i;
        if (dVar != null) {
            return dVar.getSugUserId();
        }
        return null;
    }

    public final String k() {
        d dVar = this.f81245i;
        if (dVar != null) {
            return dVar.getIsRichSug();
        }
        return null;
    }

    private final String l() {
        com.ss.android.ugc.aweme.search.model.b searchEnterParam;
        String enterSearchFrom;
        d dVar = this.f81245i;
        if (dVar == null || (searchEnterParam = dVar.getSearchEnterParam()) == null || (enterSearchFrom = searchEnterParam.getEnterSearchFrom()) == null) {
            return "null";
        }
        return enterSearchFrom;
    }

    private static String m() {
        q a2 = am.a();
        if (a2 != null) {
            return j.b(a2.a());
        }
        return "null";
    }

    /* access modifiers changed from: protected */
    public final void d() {
        if (b()) {
            this.f81240a.clear();
        } else {
            this.f81241b.clear();
        }
    }

    public final QueryCorrectInfo f() {
        if (this.mData == null) {
            return null;
        }
        Object obj = this.mData;
        l.b(obj, "");
        return ((SearchApiResult) obj).queryCorrectInfo;
    }

    public final SearchPreventSuicide g() {
        if (this.mData == null) {
            return null;
        }
        Object obj = this.mData;
        l.b(obj, "");
        return ((SearchApiResult) obj).suicidePrevent;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public List<T> getItems() {
        if (b()) {
            return new ArrayList(this.f81240a);
        }
        return this.f81241b;
    }

    public final boolean h() {
        if (this.mData == null) {
            return false;
        }
        Object obj = this.mData;
        l.b(obj, "");
        GlobalDoodleConfig globalDoodleConfig = ((SearchApiResult) obj).globalDoodleConfig;
        if (globalDoodleConfig == null || globalDoodleConfig.getDisplayFilterBar() == 1) {
            return true;
        }
        return false;
    }

    private final String a() {
        com.ss.android.ugc.aweme.keyword.b a2;
        a.AbstractC2689a aVar = this.f81248l;
        if (aVar == null || (a2 = aVar.a()) == null) {
            return "";
        }
        if (n() || TextUtils.isEmpty(a2.f105234b)) {
            return a2.f105233a;
        }
        return a2.f105234b;
    }

    public final String i() {
        e eVar;
        String str;
        String searchEnterFromPage;
        com.ss.android.ugc.aweme.search.n.a searchCommonModel;
        if (this.f81245i == null) {
            return "";
        }
        String m2 = m();
        WeakReference<e> weakReference = this.f81246j;
        String str2 = null;
        if (weakReference != null) {
            eVar = weakReference.get();
        } else {
            eVar = null;
        }
        String str3 = "ref_search_base_model_" + m2 + "_enter_from_page";
        JSONObject jSONObject = new JSONObject();
        d dVar = this.f81245i;
        if (dVar == null || (str = dVar.getSearchEnterFromPage()) == null) {
            str = "";
        }
        jSONObject.put("enter_from", str);
        com.ss.android.ugc.aweme.search.n.f b2 = d.a.b(eVar);
        if (!(b2 == null || (searchCommonModel = b2.getSearchCommonModel()) == null)) {
            str2 = searchCommonModel.getEnterFrom();
        }
        jSONObject.put("enter_from_x", str2);
        c.a.a(str3, jSONObject, h.a.am.c("enter_from"));
        com.ss.android.ugc.aweme.search.model.d dVar2 = this.f81245i;
        if (dVar2 == null || (searchEnterFromPage = dVar2.getSearchEnterFromPage()) == null) {
            return "";
        }
        return searchEnterFromPage;
    }

    public final void b(String str) {
        l.d(str, "");
        this.f81243d = str;
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public boolean checkParams(Object... objArr) {
        l.d(objArr, "");
        if (objArr.length >= 2) {
            Object obj = objArr[1];
            if (!(obj instanceof String)) {
                obj = null;
            }
            if (TextUtils.isEmpty((String) obj)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void a_(List<? extends T> list) {
        if (b()) {
            this.f81240a.clear();
            if (list != null && !list.isEmpty()) {
                this.f81240a.addAll(list);
                return;
            }
            return;
        }
        this.f81241b.clear();
        if (list != null && !list.isEmpty()) {
            this.f81241b.addAll(list);
        }
    }

    /* access modifiers changed from: protected */
    public final void b(List<? extends T> list) {
        if (b()) {
            if (list != null && !list.isEmpty()) {
                this.f81240a.addAll(list);
            }
        } else if (list != null && !list.isEmpty()) {
            this.f81241b.addAll(list);
        }
    }

    /* access modifiers changed from: protected */
    public final String a(Object... objArr) {
        l.d(objArr, "");
        if (!TextUtils.isEmpty(a())) {
            return a();
        }
        if (objArr.length > 0 && (objArr[0] instanceof Object[])) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr2 = (Object[]) obj;
            if (objArr2.length > 1 && (objArr2[1] instanceof String)) {
                Object obj2 = objArr2[1];
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.String");
                return (String) obj2;
            }
        }
        return "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        if (((java.lang.Integer) r1).intValue() == 1) goto L_0x002c;
     */
    @Override // com.ss.android.ugc.aweme.common.b, com.ss.android.ugc.aweme.common.e.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean sendRequest(java.lang.Object... r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            h.f.b.l.d(r5, r0)
            boolean r0 = com.ss.android.ugc.aweme.utils.in.d()
            r3 = 0
            if (r0 == 0) goto L_0x001f
            android.os.Message r2 = android.os.Message.obtain()
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r0 = "Under ChildrenMode"
            r1.<init>(r0)
            r2.obj = r1
            com.bytedance.common.utility.collection.WeakHandler r0 = r4.mHandler
            r0.sendMessage(r2)
            return r3
        L_0x001f:
            boolean r0 = r4.needCheckEmptyForQueryType()
            r2 = 1
            if (r0 == 0) goto L_0x003a
            boolean r0 = r4.isDataEmpty()
            if (r0 == 0) goto L_0x003a
        L_0x002c:
            java.lang.String r0 = r4.q
            r4.r = r0
        L_0x0030:
            int r0 = r5.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r5, r0)
            boolean r0 = super.sendRequest(r0)
            return r0
        L_0x003a:
            r1 = r5[r3]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            java.util.Objects.requireNonNull(r1, r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r0 = r1.intValue()
            if (r0 != r2) goto L_0x0030
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.j.f.sendRequest(java.lang.Object[]):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleData(RESPONSE r10) {
        /*
        // Method dump skipped, instructions count: 319
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.j.f.handleData(com.ss.android.ugc.aweme.discover.model.SearchApiResult):void");
    }

    public final void a(int i2, String str) {
        a aVar = this.f81247k;
        if (aVar != null) {
            aVar.a(i2, str);
            this.f81247k = null;
            if (this.mIsLoading) {
                this.mIsLoading = false;
            }
        }
    }
}
