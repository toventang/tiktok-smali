package com.ss.android.ugc.aweme.detail.i;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.common.e.b;
import com.ss.android.ugc.aweme.detail.i.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.u.x;
import com.ss.android.ugc.aweme.feed.x.m;
import java.util.Collection;
import java.util.List;

public abstract class d<T extends c, DATA> extends b<T> {

    /* renamed from: a  reason: collision with root package name */
    public x f79771a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f79772b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f79773c;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.common.e.d f79774d;

    static {
        Covode.recordClassIndex(49578);
    }

    /* access modifiers changed from: protected */
    public abstract String b(DATA data);

    /* access modifiers changed from: protected */
    public abstract List<DATA> d();

    /* access modifiers changed from: protected */
    public abstract List<Aweme> e();

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.e.b
    public final void cd_() {
        super.cd_();
        this.f79774d = null;
    }

    private boolean f() {
        if (!this.f79773c || this.f79772b) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o, com.ss.android.ugc.aweme.common.e.b
    public final void c() {
        x xVar = this.f79771a;
        if (xVar != null) {
            xVar.c(f());
        }
        boolean z = false;
        this.f79773c = false;
        this.f79772b = false;
        if (this.f76396h != null) {
            int i2 = ((a) this.f76396h).mListQueryType;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 4 && this.f76397i != null) {
                        com.ss.android.ugc.aweme.common.e.c cVar = (com.ss.android.ugc.aweme.common.e.c) this.f76397i;
                        List<Aweme> e2 = e();
                        if (((a) this.f76396h).isHasMore() && !((a) this.f76396h).isNewDataEmpty()) {
                            z = true;
                        }
                        cVar.b(e2, z);
                    }
                } else if (this.f76397i != null) {
                    ((com.ss.android.ugc.aweme.common.e.c) this.f76397i).c(e(), true ^ ((a) this.f76396h).isNewDataEmpty());
                }
            } else if (((a) this.f76396h).isDataEmpty()) {
                if (this.f76397i != null) {
                    ((com.ss.android.ugc.aweme.common.e.c) this.f76397i).f();
                }
            } else if (this.f76397i != null) {
                ((com.ss.android.ugc.aweme.common.e.c) this.f76397i).a(e(), ((a) this.f76396h).isHasMore());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.b
    public final void a(com.ss.android.ugc.aweme.common.e.d dVar) {
        this.f79774d = dVar;
    }

    @Override // com.ss.android.ugc.aweme.common.e.b, com.ss.android.ugc.aweme.common.e.f
    public final void a(int i2) {
        com.ss.android.ugc.aweme.common.e.d dVar = this.f79774d;
        if (dVar != null) {
            dVar.b(i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c
    public final boolean a(Object... objArr) {
        x xVar = this.f79771a;
        if (xVar != null) {
            xVar.c(this.f79772b);
        }
        return super.a(objArr);
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o, com.ss.android.ugc.aweme.common.e.b
    public final void a_(Exception exc) {
        x xVar = this.f79771a;
        if (xVar != null) {
            xVar.c(f());
        }
        this.f79773c = false;
        this.f79772b = false;
        super.a_(exc);
    }

    @Override // com.ss.android.ugc.aweme.common.e.b
    public final boolean a(Object obj) {
        List<DATA> d2;
        int i2 = 0;
        if (obj instanceof Aweme) {
            List<Aweme> e2 = e();
            if (!com.bytedance.common.utility.collection.b.a((Collection) e2)) {
                int size = e2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Aweme aweme = (Aweme) obj;
                    if (TextUtils.equals(aweme.getAid(), m.f(e2.get(i3)))) {
                        String aid = aweme.getAid();
                        if (this.f76396h != null && (d2 = d()) != null) {
                            int size2 = d2.size();
                            while (true) {
                                if (i2 >= size2) {
                                    break;
                                }
                                DATA data = d2.get(i2);
                                String b2 = b(data);
                                if (!TextUtils.isEmpty(b2) && TextUtils.equals(aid, b2)) {
                                    d2.remove(data);
                                    break;
                                }
                                i2++;
                            }
                        }
                        a(i3);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.common.e.b, com.ss.android.ugc.aweme.common.e.f
    public final void a(List list, int i2) {
        com.ss.android.ugc.aweme.common.e.d dVar = this.f79774d;
        if (dVar != null) {
            dVar.a(list, i2);
        }
    }
}
