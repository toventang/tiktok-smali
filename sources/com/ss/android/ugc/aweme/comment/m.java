package com.ss.android.ugc.aweme.comment;

import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, a> f72082a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final m f72083b = new m();

    private m() {
    }

    static {
        Covode.recordClassIndex(44279);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f72084a;

        /* renamed from: b  reason: collision with root package name */
        public final Comment f72085b;

        /* renamed from: c  reason: collision with root package name */
        public final int f72086c;

        /* renamed from: d  reason: collision with root package name */
        public final com.ss.android.ugc.aweme.comment.i.a f72087d;

        /* renamed from: e  reason: collision with root package name */
        public final int f72088e;

        /* renamed from: f  reason: collision with root package name */
        public final Comment f72089f;

        static {
            Covode.recordClassIndex(44280);
        }

        public a() {
            this(0, null, 0, null, 0, null, 63);
        }

        private static a a(int i2, Comment comment, int i3, com.ss.android.ugc.aweme.comment.i.a aVar, int i4, Comment comment2) {
            return new a(i2, comment, i3, aVar, i4, comment2);
        }

        public static /* synthetic */ a a(a aVar, int i2, Comment comment, int i3, com.ss.android.ugc.aweme.comment.i.a aVar2, int i4, Comment comment2, int i5) {
            Comment comment3 = comment2;
            int i6 = i4;
            int i7 = i2;
            Comment comment4 = comment;
            int i8 = i3;
            com.ss.android.ugc.aweme.comment.i.a aVar3 = aVar2;
            if ((i5 & 1) != 0) {
                i7 = aVar.f72084a;
            }
            if ((i5 & 2) != 0) {
                comment4 = aVar.f72085b;
            }
            if ((i5 & 4) != 0) {
                i8 = aVar.f72086c;
            }
            if ((i5 & 8) != 0) {
                aVar3 = aVar.f72087d;
            }
            if ((i5 & 16) != 0) {
                i6 = aVar.f72088e;
            }
            if ((i5 & 32) != 0) {
                comment3 = aVar.f72089f;
            }
            return a(i7, comment4, i8, aVar3, i6, comment3);
        }

        public final String toString() {
            return "CommentPostingStatus(status=" + this.f72084a + ", comment=" + this.f72085b + ", position=" + this.f72086c + ", params=" + this.f72087d + ", requestType=" + this.f72088e + ", replyComment=" + this.f72089f + ")";
        }

        public final int hashCode() {
            int i2;
            int i3;
            int i4 = this.f72084a * 31;
            Comment comment = this.f72085b;
            int i5 = 0;
            if (comment != null) {
                i2 = comment.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (((i4 + i2) * 31) + this.f72086c) * 31;
            com.ss.android.ugc.aweme.comment.i.a aVar = this.f72087d;
            if (aVar != null) {
                i3 = aVar.hashCode();
            } else {
                i3 = 0;
            }
            int i7 = (((i6 + i3) * 31) + this.f72088e) * 31;
            Comment comment2 = this.f72089f;
            if (comment2 != null) {
                i5 = comment2.hashCode();
            }
            return i7 + i5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f72084a == aVar.f72084a && !(!l.a(this.f72085b, aVar.f72085b)) && this.f72086c == aVar.f72086c && !(!l.a(this.f72087d, aVar.f72087d)) && this.f72088e == aVar.f72088e && !(!l.a(this.f72089f, aVar.f72089f))) {
                return true;
            }
            return false;
        }

        private a(int i2, Comment comment, int i3, com.ss.android.ugc.aweme.comment.i.a aVar, int i4, Comment comment2) {
            this.f72084a = i2;
            this.f72085b = comment;
            this.f72086c = i3;
            this.f72087d = aVar;
            this.f72088e = i4;
            this.f72089f = comment2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(int i2, Comment comment, int i3, com.ss.android.ugc.aweme.comment.i.a aVar, int i4, Comment comment2, int i5) {
            this((i5 & 1) != 0 ? -1 : i2, (i5 & 2) != 0 ? null : comment, (i5 & 4) != 0 ? -1 : i3, (i5 & 8) != 0 ? null : aVar, (i5 & 16) == 0 ? i4 : -1, (i5 & 32) == 0 ? comment2 : null);
        }
    }

    public static void g(Comment comment) {
        if (comment != null) {
            f72082a.remove(comment.getFakeId());
        }
    }

    public static boolean b(Comment comment) {
        a aVar;
        if (comment == null || (aVar = f72082a.get(comment.getFakeId())) == null || aVar.f72084a != 2) {
            return false;
        }
        return true;
    }

    public static boolean e(Comment comment) {
        a aVar;
        if (comment == null || (aVar = f72082a.get(comment.getFakeId())) == null || aVar.f72084a != 3) {
            return false;
        }
        return true;
    }

    public static int h(Comment comment) {
        a aVar;
        if (comment == null || (aVar = f72082a.get(comment.getFakeId())) == null) {
            return -1;
        }
        return aVar.f72086c;
    }

    public static com.ss.android.ugc.aweme.comment.i.a i(Comment comment) {
        a aVar;
        if (comment == null || (aVar = f72082a.get(comment.getFakeId())) == null) {
            return null;
        }
        return aVar.f72087d;
    }

    public static void c(Comment comment) {
        a aVar;
        if (comment != null) {
            Map<String, a> map = f72082a;
            String fakeId = comment.getFakeId();
            l.b(fakeId, "");
            a aVar2 = map.get(comment.getFakeId());
            if (aVar2 == null || (aVar = a.a(aVar2, 2, null, 0, null, 0, null, 62)) == null) {
                aVar = new a(2, null, 0, null, 0, null, 62);
            }
            map.put(fakeId, aVar);
        }
    }

    public static void d(Comment comment) {
        a aVar;
        if (comment != null) {
            Map<String, a> map = f72082a;
            String fakeId = comment.getFakeId();
            l.b(fakeId, "");
            a aVar2 = map.get(comment.getFakeId());
            if (aVar2 == null || (aVar = a.a(aVar2, 1, null, 0, null, 0, null, 62)) == null) {
                aVar = new a(1, null, 0, null, 0, null, 62);
            }
            map.put(fakeId, aVar);
        }
    }

    public static void f(Comment comment) {
        a aVar;
        if (comment != null) {
            Map<String, a> map = f72082a;
            String fakeId = comment.getFakeId();
            l.b(fakeId, "");
            a aVar2 = map.get(comment.getFakeId());
            if (aVar2 == null || (aVar = a.a(aVar2, 4, null, 0, null, 0, null, 62)) == null) {
                aVar = new a(4, null, 0, null, 0, null, 62);
            }
            map.put(fakeId, aVar);
        }
    }

    public static void j(Comment comment) {
        String replyToUserId;
        if (comment != null) {
            Map<String, a> map = f72082a;
            a aVar = map.get(comment.getFakeId());
            if (aVar != null) {
                Comment comment2 = aVar.f72085b;
                String replyToUserId2 = comment.getReplyToUserId();
                if (!((replyToUserId2 != null && replyToUserId2.length() != 0) || comment2 == null || (replyToUserId = comment2.getReplyToUserId()) == null || replyToUserId.length() == 0)) {
                    comment.setReplyToUserId(comment2.getReplyToUserId());
                }
                String fakeId = comment.getFakeId();
                l.b(fakeId, "");
                map.put(fakeId, a.a(aVar, 0, comment, 0, null, 0, null, 61));
                return;
            }
            String fakeId2 = comment.getFakeId();
            l.b(fakeId2, "");
            map.put(fakeId2, new a(0, comment, 0, null, 0, null, 61));
        }
    }

    public static boolean a(Comment comment) {
        a aVar;
        int i2;
        if (comment != null && (aVar = f72082a.get(comment.getFakeId())) != null && 1 <= (i2 = aVar.f72084a) && 3 >= i2 && aVar.f72086c >= 0) {
            return true;
        }
        return false;
    }

    public static void a(Comment comment, int i2) {
        a aVar;
        if (comment != null) {
            Map<String, a> map = f72082a;
            String fakeId = comment.getFakeId();
            l.b(fakeId, "");
            a aVar2 = map.get(comment.getFakeId());
            if (aVar2 == null || (aVar = a.a(aVar2, 0, null, i2, null, 0, null, 59)) == null) {
                aVar = new a(0, null, i2, null, 0, null, 59);
            }
            map.put(fakeId, aVar);
        }
    }

    public static void b(Comment comment, int i2) {
        a aVar;
        if (comment != null) {
            Map<String, a> map = f72082a;
            String fakeId = comment.getFakeId();
            l.b(fakeId, "");
            a aVar2 = map.get(comment.getFakeId());
            if (aVar2 == null || (aVar = a.a(aVar2, 0, null, 0, null, i2, null, 47)) == null) {
                aVar = new a(0, null, 0, null, i2, null, 47);
            }
            map.put(fakeId, aVar);
        }
    }

    public static void a(Comment comment, TuxTextView tuxTextView) {
        if (comment != null && tuxTextView != null) {
            a aVar = f72082a.get(comment.getFakeId());
            if (aVar == null || aVar.f72084a != 2) {
                tuxTextView.setVisibility(8);
                return;
            }
            tuxTextView.setVisibility(0);
            tuxTextView.setTextColor(b.c(d.a(), R.color.bh));
            tuxTextView.setText(R.string.amf);
        }
    }
}
