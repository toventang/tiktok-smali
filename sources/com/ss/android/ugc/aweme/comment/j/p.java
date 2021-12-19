package com.ss.android.ugc.aweme.comment.j;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.comment.f.h;
import com.ss.android.ugc.aweme.comment.f.i;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.ss.android.ugc.aweme.comment.util.v;
import com.ss.android.ugc.aweme.common.e.b;
import com.ss.android.ugc.aweme.common.e.c;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class p extends b<o> implements c<Comment> {

    /* renamed from: g  reason: collision with root package name */
    public static Map<String, a> f72057g;

    /* renamed from: a  reason: collision with root package name */
    public i f72058a;

    /* renamed from: b  reason: collision with root package name */
    public h f72059b;

    /* renamed from: c  reason: collision with root package name */
    public CommentReplyButtonStruct f72060c;

    /* renamed from: d  reason: collision with root package name */
    public v f72061d;

    /* renamed from: e  reason: collision with root package name */
    public String f72062e;

    /* renamed from: f  reason: collision with root package name */
    public String f72063f;

    /* renamed from: l  reason: collision with root package name */
    private String f72064l;

    static {
        Covode.recordClassIndex(44264);
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void bh_() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List, boolean] */
    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(List<Comment> list, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void aO_() {
        h hVar = this.f72059b;
        if (hVar != null) {
            hVar.a(3);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.e.c, com.ss.android.ugc.aweme.common.e.b
    public final void b() {
        h hVar = this.f72059b;
        if (hVar != null) {
            hVar.a(3);
        }
    }

    public final String d() {
        CommentReplyButtonStruct commentReplyButtonStruct = this.f72060c;
        if (commentReplyButtonStruct != null) {
            return commentReplyButtonStruct.getCid();
        }
        return "";
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f72065a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f72066b = 3;

        /* renamed from: c  reason: collision with root package name */
        public int f72067c = 0;

        /* renamed from: d  reason: collision with root package name */
        public boolean f72068d = false;

        /* renamed from: e  reason: collision with root package name */
        public boolean f72069e = true;

        /* renamed from: f  reason: collision with root package name */
        public int f72070f = 0;

        /* renamed from: g  reason: collision with root package name */
        public boolean f72071g = true;

        /* renamed from: h  reason: collision with root package name */
        public int f72072h;

        static {
            Covode.recordClassIndex(44265);
        }

        a() {
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void f() {
        if (!(this.f72060c == null || this.f76396h.mData == null)) {
            this.f72060c.setCursor(this.f76396h.mData.cursor);
            this.f72060c.setHasMore(((com.ss.android.ugc.aweme.common.e.a) this.f76396h).isHasMore());
        }
        if (this.f72059b == null) {
            return;
        }
        if (((com.ss.android.ugc.aweme.common.e.a) this.f76396h).isHasMore()) {
            this.f72059b.a(1);
        } else {
            this.f72059b.a(2);
        }
    }

    public final void a(v vVar) {
        this.f72061d = vVar;
        ((i) this.f76396h).f72036e = vVar;
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(Exception exc) {
        com.ss.android.ugc.aweme.app.api.b.a.a((Context) f.j(), (Throwable) exc, (int) R.string.g4j);
        h hVar = this.f72059b;
        if (hVar != null) {
            hVar.a(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(Exception exc) {
        com.ss.android.ugc.aweme.app.api.b.a.a((Context) f.j(), (Throwable) exc, (int) R.string.g4j);
        h hVar = this.f72059b;
        if (hVar != null) {
            hVar.a(1);
        }
    }

    public static a a(String str) {
        if (f72057g == null) {
            f72057g = new HashMap();
        }
        a aVar = f72057g.get(str);
        if (aVar != null || f72057g.containsKey(str)) {
            return aVar;
        }
        return new a();
    }

    public final boolean b(int i2) {
        List<Comment> list;
        v vVar = this.f72061d;
        if (vVar != null) {
            list = vVar.b(this.f72060c.getCid());
        } else {
            list = null;
        }
        if (list == null || this.f72060c.getExpandSize() >= list.size()) {
            return true;
        }
        int min = Math.min(this.f72060c.getExpandSize() + i2, list.size());
        i iVar = this.f72058a;
        if (iVar != null) {
            iVar.a(d(), list.subList(this.f72060c.getExpandSize(), min));
        }
        this.f72060c.setExpandSize(min);
        if (this.f72059b == null) {
            return false;
        }
        if (((long) this.f72060c.getExpandSize()) >= this.f72060c.getReplyCommentTotal()) {
            this.f72059b.a(2);
            return false;
        }
        this.f72059b.a(1);
        return false;
    }

    private void a(List<Comment> list) {
        List<Comment> b2;
        v vVar = this.f72061d;
        if (vVar != null && (b2 = vVar.b(this.f72060c.getCid())) != null) {
            Iterator<Comment> it = list.iterator();
            while (it.hasNext()) {
                Comment next = it.next();
                if (next != null && b2.contains(next)) {
                    it.remove();
                }
            }
        }
    }

    public p(String str, String str2) {
        a((com.ss.android.ugc.aweme.common.b) new o());
        a_(this);
        this.f72063f = str2;
        this.f72064l = str;
        f72057g = new HashMap();
    }

    public static void a(String str, int i2) {
        if (str != null) {
            a a2 = a(str);
            if (!a2.f72068d) {
                a2.f72067c += i2;
            }
            f72057g.put(str, a2);
        }
    }

    public static void a(String str, a aVar) {
        if (str != null && aVar != null) {
            if (com.ss.android.ugc.aweme.comment.d.c.a() || com.ss.android.ugc.aweme.comment.d.c.b()) {
                aVar.f72066b = 3;
            } else if (com.ss.android.ugc.aweme.comment.d.c.e()) {
                aVar.f72066b = 10;
            } else if (!com.ss.android.ugc.aweme.comment.d.c.c() && !com.ss.android.ugc.aweme.comment.d.c.d()) {
                aVar.f72066b = 3;
            } else if (aVar.f72069e) {
                int i2 = 12;
                if (aVar.f72066b < 12) {
                    i2 = aVar.f72066b + 3;
                }
                aVar.f72066b = i2;
            }
            aVar.f72069e = true;
            f72057g.put(str, aVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(List<Comment> list, boolean z) {
        boolean isHasMore = ((com.ss.android.ugc.aweme.common.e.a) this.f76396h).isHasMore();
        if (this.f72060c != null) {
            a(list);
            this.f72060c.setReplyCommentTotal(((i) this.f76396h).b());
            this.f72060c.setCursor(this.f76396h.mData.cursor);
            this.f72060c.addExpandSize(list.size());
            if (!isHasMore || ((i) this.f76396h).b() <= ((long) this.f72060c.getExpandSize())) {
                isHasMore = false;
            } else {
                isHasMore = true;
            }
            this.f72060c.setHasMore(isHasMore);
        }
        i iVar = this.f72058a;
        if (iVar != null) {
            iVar.a(d(), list);
        }
        h hVar = this.f72059b;
        if (hVar == null) {
            return;
        }
        if (isHasMore) {
            hVar.a(1);
        } else {
            hVar.a(2);
        }
    }

    public static void a(String str, boolean z) {
        int i2;
        a a2 = a(str);
        if (z) {
            i2 = 0;
        } else {
            i2 = a2.f72072h + 1;
        }
        a2.f72072h = i2;
        f72057g.put(str, a2);
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(List<Comment> list, boolean z) {
        boolean isHasMore = ((com.ss.android.ugc.aweme.common.e.a) this.f76396h).isHasMore();
        if (this.f72060c != null) {
            a(list);
            this.f72060c.setReplyCommentTotal(((i) this.f76396h).b());
            this.f72060c.setCursor(this.f76396h.mData.cursor);
            this.f72060c.addExpandSize(list.size());
            if (!isHasMore || ((i) this.f76396h).b() <= ((long) this.f72060c.getExpandSize())) {
                isHasMore = false;
            } else {
                isHasMore = true;
            }
            this.f72060c.setHasMore(isHasMore);
        }
        i iVar = this.f72058a;
        if (iVar != null) {
            iVar.a(d(), list);
        }
        h hVar = this.f72059b;
        if (hVar == null) {
            return;
        }
        if (isHasMore) {
            hVar.a(1);
        } else {
            hVar.a(2);
        }
    }

    public final void a(int i2, CommentReplyButtonStruct commentReplyButtonStruct, long j2, String str, int i3) {
        a(Integer.valueOf(i2), commentReplyButtonStruct.getCommentId(), commentReplyButtonStruct.getTopIds(), Long.valueOf(j2), this.f72064l, str, Integer.valueOf(i3));
    }
}
