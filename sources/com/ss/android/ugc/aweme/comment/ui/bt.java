package com.ss.android.ugc.aweme.comment.ui;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.comment.c.l;
import com.ss.android.ugc.aweme.comment.f.a;
import com.ss.android.ugc.aweme.comment.f.c;
import com.ss.android.ugc.aweme.comment.i.g;
import com.ss.android.ugc.aweme.comment.j.p;
import com.ss.android.ugc.aweme.comment.m;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentReplyListItem;
import com.ss.android.ugc.aweme.comment.util.v;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.gh;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class bt implements a, c, h.a, com.ss.android.ugc.aweme.common.e.c<Comment> {

    /* renamed from: a  reason: collision with root package name */
    public String f72624a;

    /* renamed from: b  reason: collision with root package name */
    RecyclerView f72625b;

    /* renamed from: c  reason: collision with root package name */
    v f72626c;

    /* renamed from: d  reason: collision with root package name */
    public Comment f72627d;

    /* renamed from: e  reason: collision with root package name */
    private DmtStatusView f72628e;

    /* renamed from: f  reason: collision with root package name */
    private Context f72629f;

    /* renamed from: g  reason: collision with root package name */
    private int f72630g;

    /* renamed from: h  reason: collision with root package name */
    private Aweme f72631h;

    static {
        Covode.recordClassIndex(44745);
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void bh_() {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(List<Comment> list, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    public final void l() {
    }

    public final void a(List<Comment> list) {
        f fVar = (f) a();
        if (fVar != null) {
            int i2 = 0;
            fVar.d(false);
            fVar.b_(list);
            this.f72628e.g();
            RecyclerView recyclerView = this.f72625b;
            if (!b(list) && !c(list)) {
                i2 = 8;
            }
            recyclerView.setVisibility(i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(List<Comment> list, boolean z) {
        com.ss.android.ugc.aweme.comment.adapter.a aVar = (com.ss.android.ugc.aweme.comment.adapter.a) a();
        if (aVar != null) {
            aVar.d(true);
            if (z) {
                aVar.ai_();
            } else if (!aVar.f71323f) {
                aVar.d(false);
            } else {
                aVar.ah_();
            }
            if (list != null) {
                Iterator<Comment> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Comment next = it.next();
                    if (next.getCommentType() == 1 && next.isAuthorPin()) {
                        this.f72627d = next;
                        break;
                    }
                }
                aVar.b_(list);
            }
            this.f72625b.setVisibility(0);
            this.f72628e.d();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.c
    public final void a(String str, String str2, Exception exc) {
        List<Comment> list;
        RecyclerView.a a2 = a();
        if (a2 != null && (list = this.f72626c.f72884b) != null) {
            int i2 = R.string.b7d;
            int i3 = 0;
            while (true) {
                if (i3 >= list.size()) {
                    break;
                }
                Comment comment = list.get(i3);
                if (TextUtils.equals(str, comment.getCid())) {
                    if (comment.isUserDigged()) {
                        i2 = R.string.h48;
                    }
                    a2.notifyItemChanged(i3);
                } else {
                    i3++;
                }
            }
            if ((exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) && ((com.ss.android.ugc.aweme.base.api.a.a) exc).getErrorCode() == 3002043) {
                if (str2 == "1") {
                    i2 = R.string.ams;
                } else if (str2 == "2") {
                    i2 = R.string.amt;
                }
            }
            com.ss.android.ugc.aweme.app.api.b.a.a(this.f72629f, (Throwable) exc, i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.c
    public final void a(Object... objArr) {
        com.ss.android.ugc.aweme.comment.adapter.a aVar = (com.ss.android.ugc.aweme.comment.adapter.a) a();
        if (aVar != null) {
            aVar.a((String) objArr[0]);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.a
    public final void a(String str, g gVar) {
        Comment comment;
        com.ss.android.ugc.aweme.comment.adapter.a aVar = (com.ss.android.ugc.aweme.comment.adapter.a) a();
        if (aVar != null) {
            if (!(str == null || (comment = this.f72627d) == null || !str.equals(comment.getCid()))) {
                this.f72627d = null;
            }
            aVar.a(str, this.f72626c.d(str));
            boolean z = gVar != null && gVar.f72014a;
            if (aVar.c() == 0 || (z && aVar.c() == 1)) {
                aVar.d(false);
                if (z) {
                    aVar.a(0, 1);
                    aVar.notifyItemRemoved(1);
                } else {
                    aVar.notifyItemRemoved(0);
                }
                this.f72628e.g();
            }
            if (gVar != null && gVar.f72015b) {
                com.ss.android.ugc.d.a.c.a(new l(3, gVar.f72016c));
            }
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.comment.c.c(4, this.f72624a));
        }
    }

    public final void a(Set<String> set, Map<String, Comment> map) {
        com.ss.android.ugc.aweme.comment.adapter.a aVar = (com.ss.android.ugc.aweme.comment.adapter.a) a();
        if (aVar != null) {
            aVar.a(set, map);
            if (aVar.c() == 0) {
                aVar.d(false);
                aVar.notifyItemRemoved(0);
                this.f72628e.g();
            }
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.comment.c.c(4, this.f72624a));
        }
    }

    public final void a(boolean z, Comment comment) {
        int i2;
        if (!z || comment != null) {
            if (z) {
                Rect c2 = c(comment);
                if (c2 != null) {
                    int[] iArr = new int[2];
                    this.f72625b.getLocationOnScreen(iArr);
                    i2 = c2.top - iArr[1];
                    int max = Math.max(0, (this.f72625b.computeVerticalScrollRange() - this.f72625b.computeVerticalScrollOffset()) - this.f72625b.getHeight());
                    if (i2 > max) {
                        this.f72625b.animate().translationY((float) (max - i2)).setDuration(300).start();
                        i2 = max;
                    }
                } else {
                    i2 = 0;
                }
                this.f72630g = i2;
            } else {
                this.f72625b.animate().translationY(0.0f).setDuration(300).start();
                i2 = -this.f72630g;
                this.f72630g = 0;
            }
            RecyclerView recyclerView = this.f72625b;
            if (recyclerView != null) {
                recyclerView.a(0, i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final RecyclerView.a a() {
        com.ss.android.ugc.aweme.discover.c.a aVar = (com.ss.android.ugc.aweme.discover.c.a) this.f72625b.getAdapter();
        if (aVar == null) {
            return null;
        }
        return aVar.f80895f;
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void aO_() {
        h hVar = (h) a();
        if (hVar != null) {
            hVar.ag_();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b() {
        this.f72625b.setVisibility(0);
        this.f72628e.f();
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void f() {
        a(new ArrayList());
    }

    private int c() {
        com.ss.android.ugc.aweme.discover.c.a aVar = (com.ss.android.ugc.aweme.discover.c.a) this.f72625b.getAdapter();
        if (aVar == null) {
            return 0;
        }
        return aVar.a().size();
    }

    private Rect c(Comment comment) {
        RecyclerView.ViewHolder d2;
        if (comment == null || (d2 = d(comment)) == null) {
            return null;
        }
        return gh.a(d2);
    }

    static List<Comment> a(com.ss.android.ugc.aweme.comment.adapter.a aVar) {
        ArrayList arrayList = new ArrayList();
        List e2 = aVar.e();
        if (!b.a((Collection) e2)) {
            arrayList.addAll(e2);
        }
        return arrayList;
    }

    private static boolean b(List<Comment> list) {
        Comment comment;
        if (!b.a((Collection) list) && (comment = list.get(0)) != null && comment.getCommentType() == 220) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.f.a
    public final void d(Exception exc) {
        if ((exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) && ((com.ss.android.ugc.aweme.base.api.a.a) exc).getErrorCode() == 3002042) {
            com.ss.android.ugc.aweme.app.api.b.a.a(this.f72629f, (Throwable) exc, (int) R.string.amr);
        }
    }

    private static boolean c(List<Comment> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2).getCommentType() == 221) {
                return true;
            }
        }
        return false;
    }

    public final void b(Comment comment) {
        com.ss.android.ugc.aweme.comment.adapter.a aVar = (com.ss.android.ugc.aweme.comment.adapter.a) a();
        aVar.notifyItemChanged(aVar.c(comment.getCid(), 1), 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.recyclerview.widget.RecyclerView.ViewHolder d(com.ss.android.ugc.aweme.comment.model.Comment r8) {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.ui.bt.d(com.ss.android.ugc.aweme.comment.model.Comment):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }

    /* access modifiers changed from: package-private */
    public final void a(Comment comment) {
        int h2 = m.h(comment);
        RecyclerView.a a2 = a();
        if (h2 >= 0 && a2 != null) {
            a2.notifyItemChanged(h2, 1);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(Exception exc) {
        a(exc, new ArrayList());
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(Exception exc) {
        h hVar = (h) a();
        if (hVar != null) {
            hVar.i();
        }
    }

    public final void a(String str) {
        com.ss.android.ugc.aweme.comment.adapter.a aVar = (com.ss.android.ugc.aweme.comment.adapter.a) a();
        if (aVar != null) {
            aVar.b(str, this.f72626c.c(str));
            if (aVar.c() == 0) {
                aVar.d(false);
                aVar.notifyItemRemoved(0);
                this.f72628e.g();
            }
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.comment.c.c(4, this.f72624a));
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(List<Comment> list, boolean z) {
        com.ss.android.ugc.aweme.comment.adapter.a aVar = (com.ss.android.ugc.aweme.comment.adapter.a) a();
        if (aVar != null) {
            aVar.d(true);
            if (list != null && !list.isEmpty() && z) {
                aVar.ai_();
            } else if (!aVar.f71323f) {
                aVar.d(false);
            } else {
                aVar.ah_();
            }
            aVar.b(list);
        }
    }

    public final void a(Comment comment, boolean z) {
        if (comment != null && comment.getShouldDisplayFakeComment()) {
            boolean z2 = !m.a(comment);
            if (z2) {
                b(comment, z);
            }
            if (!m.e(comment)) {
                m.d(comment);
            }
            if (!z2) {
                a(comment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0105, code lost:
        if (r3 < 0) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0166, code lost:
        if (r5 < 0) goto L_0x0168;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(com.ss.android.ugc.aweme.comment.model.Comment r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 420
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.ui.bt.b(com.ss.android.ugc.aweme.comment.model.Comment, boolean):void");
    }

    public final void a(Exception exc, List<Comment> list) {
        f fVar = (f) a();
        if (fVar != null) {
            if (fVar.v) {
                fVar.d(false);
            }
            fVar.b_(list);
            if (exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                this.f72628e.g();
                this.f72625b.setVisibility(8);
                if (((com.ss.android.ugc.aweme.base.api.a.a) exc).getErrorCode() == 14) {
                    com.ss.android.ugc.aweme.app.api.b.a.a(this.f72629f, (Throwable) exc, (int) R.string.g4j);
                    return;
                }
                return;
            }
            this.f72628e.h();
            this.f72625b.setVisibility(8);
        }
    }

    static boolean a(Comment comment, int i2, int i3) {
        int h2 = m.h(comment);
        if (h2 != -1 && i2 >= 0 && i3 >= 0 && h2 >= i2 && h2 <= i3) {
            return false;
        }
        return true;
    }

    public final void a(Comment comment, int i2, int i3, boolean z) {
        f fVar;
        List e2;
        if (comment != null) {
            if (!m.a(comment)) {
                b(comment, z);
            }
            m.j(comment);
            m.f(comment);
            int h2 = m.h(comment);
            RecyclerView.a a2 = a();
            if ((a2 instanceof com.ss.android.ugc.aweme.comment.adapter.a) && (e2 = (fVar = (f) a2).e()) != null && h2 >= 0 && h2 <= e2.size() - 1) {
                e2.set(h2, comment);
                fVar.notifyItemChanged(h2);
            }
            List<Comment> list = this.f72626c.f72884b;
            if (list != null) {
                int i4 = 0;
                while (true) {
                    if (i4 >= list.size()) {
                        break;
                    } else if (TextUtils.equals(list.get(i4).getFakeId(), comment.getFakeId())) {
                        list.set(i4, comment);
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            List<CommentReplyListItem> list2 = this.f72626c.f72883a;
            if (list2 != null) {
                Iterator<CommentReplyListItem> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    CommentReplyListItem next = it.next();
                    if (TextUtils.equals(next.mComment.getFakeId(), comment.getFakeId())) {
                        next.mComment = comment;
                    } else if (TextUtils.equals(next.mComment.getCid(), comment.getReplyId())) {
                        List<Comment> list3 = next.mReplyComments;
                        if (list3 != null) {
                            int size = list3.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size) {
                                    break;
                                } else if (TextUtils.equals(list3.get(i5).getFakeId(), comment.getFakeId())) {
                                    p.a(next.mComment.getCid(), 1);
                                    list3.set(i5, comment);
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                        }
                    }
                }
            }
            if (a(comment, i2, i3) && !comment.isIgnoreToast()) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f72625b.getContext()).a(R.string.amg).a();
            }
            m.g(comment);
            this.f72625b.setVisibility(0);
            AwemeService.b().c(this.f72624a);
            this.f72628e.d();
        }
    }

    public bt(Context context, DmtStatusView dmtStatusView, RecyclerView recyclerView, v vVar, Aweme aweme) {
        this.f72629f = context;
        this.f72628e = dmtStatusView;
        this.f72625b = recyclerView;
        this.f72626c = vVar;
        this.f72631h = aweme;
    }
}
