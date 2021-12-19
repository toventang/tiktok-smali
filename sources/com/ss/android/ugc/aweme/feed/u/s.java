package com.ss.android.ugc.aweme.feed.u;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.b;
import com.ss.android.ugc.aweme.common.e.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.i.y;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.a;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.d.a.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class s extends b<a> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f94071a;

    /* renamed from: b  reason: collision with root package name */
    public x f94072b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f94073c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f94074d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f94075e;

    /* renamed from: f  reason: collision with root package name */
    private d f94076f;

    static {
        Covode.recordClassIndex(59794);
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.e.b
    public final void cd_() {
        super.cd_();
        this.f94076f = null;
    }

    private void d() {
        if (this.f94071a) {
            this.f94071a = false;
            ((a) this.f76396h).f96234c = false;
        }
        if (this.f94074d) {
            c.a(new y("DISCOVER"));
        } else {
            c.a(new y());
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o, com.ss.android.ugc.aweme.common.e.b
    public final void c() {
        boolean z;
        com.bytedance.a.b.b("feed", "follow");
        d();
        x xVar = this.f94072b;
        boolean z2 = true;
        if (xVar != null) {
            if (!this.f94075e || this.f94073c) {
                z = true;
            } else {
                z = false;
            }
            xVar.c(z);
        }
        this.f94075e = false;
        this.f94073c = false;
        if (this.f76396h != null) {
            int i2 = ((com.ss.android.ugc.aweme.common.e.a) this.f76396h).mListQueryType;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 4 && this.f76397i != null) {
                        com.ss.android.ugc.aweme.common.e.c cVar = (com.ss.android.ugc.aweme.common.e.c) this.f76397i;
                        List<Aweme> b2 = ((a) this.f76396h).b();
                        if (!((com.ss.android.ugc.aweme.common.e.a) this.f76396h).isHasMore() || ((com.ss.android.ugc.aweme.common.e.a) this.f76396h).isNewDataEmpty()) {
                            z2 = false;
                        }
                        cVar.b(b2, z2);
                    }
                } else if (this.f76397i != null) {
                    ((com.ss.android.ugc.aweme.common.e.c) this.f76397i).c(((a) this.f76396h).b(), true ^ ((com.ss.android.ugc.aweme.common.e.a) this.f76396h).isNewDataEmpty());
                }
            } else if (((com.ss.android.ugc.aweme.common.e.a) this.f76396h).isDataEmpty()) {
                if (this.f76397i != null) {
                    ((com.ss.android.ugc.aweme.common.e.c) this.f76397i).f();
                }
            } else if (this.f76397i != null) {
                ((com.ss.android.ugc.aweme.common.e.c) this.f76397i).a(((a) this.f76396h).b(), ((com.ss.android.ugc.aweme.common.e.a) this.f76396h).isHasMore());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.b
    public final void a(d dVar) {
        this.f94076f = dVar;
    }

    @Override // com.ss.android.ugc.aweme.common.e.b, com.ss.android.ugc.aweme.common.e.f
    public final void a(int i2) {
        d dVar = this.f94076f;
        if (dVar != null) {
            dVar.b(i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c
    public final boolean a(Object... objArr) {
        x xVar = this.f94072b;
        if (xVar != null) {
            xVar.c(this.f94073c);
        }
        return super.a(objArr);
    }

    @Override // com.ss.android.ugc.aweme.common.e.b
    public final boolean a(Object obj) {
        if (obj instanceof Aweme) {
            List items = ((com.ss.android.ugc.aweme.common.e.a) this.f76396h).getItems();
            if (!com.bytedance.common.utility.collection.b.a((Collection) items)) {
                int size = items.size();
                for (int i2 = 0; i2 < size; i2++) {
                    com.ss.android.ugc.aweme.newfollow.b.a aVar = (com.ss.android.ugc.aweme.newfollow.b.a) items.get(i2);
                    if (TextUtils.equals(((Aweme) obj).getAid(), ac.e(aVar.getAweme()))) {
                        ((com.ss.android.ugc.aweme.common.e.a) this.f76396h).deleteItem(aVar);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o, com.ss.android.ugc.aweme.common.e.b
    public final void a_(Exception exc) {
        boolean z;
        com.bytedance.a.b.a("feed", "follow", com.bytedance.ies.b.a.a.a(com.bytedance.ies.ugc.appcontext.d.a(), exc));
        d();
        x xVar = this.f94072b;
        if (xVar != null) {
            if (!this.f94075e || this.f94073c) {
                z = true;
            } else {
                z = false;
            }
            xVar.c(z);
        }
        this.f94075e = false;
        this.f94073c = false;
        if (this.f76396h != null) {
            int i2 = ((com.ss.android.ugc.aweme.common.e.a) this.f76396h).mListQueryType;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 4 && this.f76397i != null) {
                        ((com.ss.android.ugc.aweme.common.e.c) this.f76397i).c(exc);
                    }
                } else if (this.f76397i != null) {
                    ((com.ss.android.ugc.aweme.common.e.c) this.f76397i).a(exc);
                }
            } else if (this.f76397i != null) {
                ((com.ss.android.ugc.aweme.common.e.c) this.f76397i).b(exc);
            }
            if (exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                r.a("homepage_follow_monitor", new com.ss.android.ugc.aweme.app.f.d().a("error_type", "follow_feed_error").a("error_code", ((com.ss.android.ugc.aweme.base.api.a.a) exc).getErrorCode()).f66730a);
            } else {
                r.a("homepage_follow_monitor", new com.ss.android.ugc.aweme.app.f.d().a("error_type", "follow_feed_error").a("error_code", 4).f66730a);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.b, com.ss.android.ugc.aweme.common.e.f
    public final void a(List list, int i2) {
        d dVar = this.f94076f;
        if (dVar != null) {
            dVar.a(list, i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.b
    public final boolean a(Object obj, int i2) {
        List items = ((com.ss.android.ugc.aweme.common.e.a) this.f76396h).getItems();
        if (com.bytedance.common.utility.collection.b.a((Collection) items)) {
            items = new ArrayList();
        }
        if (i2 < 0 || i2 > items.size()) {
            return false;
        }
        items.add(i2, obj);
        ((com.ss.android.ugc.aweme.common.e.a) this.f76396h).setItems(items);
        if (this.f76397i == null) {
            return true;
        }
        if (((com.ss.android.ugc.aweme.common.e.a) this.f76396h).isDataEmpty()) {
            ((com.ss.android.ugc.aweme.common.e.c) this.f76397i).f();
            return true;
        }
        a((List) ((a) this.f76396h).b(), i2);
        return true;
    }
}
